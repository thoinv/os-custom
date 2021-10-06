package com.iflytek.cloud.msc.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.speech.VoiceWakeuperAidl;

public class NetworkUtil {
    public static final String NET_CMWAP = "cmwap";
    public static final String NET_CTNET = "ctnet";
    public static final String NET_CTWAP = "ctwap";
    public static final String NET_UNIWAP = "uniwap";
    public static final String NET_UNKNOWN = "none";
    public static final String NET_WIFI = "wifi";

    public static boolean isWifiConnect(Context context) {
        NetworkInfo activeNetworkInfo;
        return NET_WIFI.equals((context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) ? "" : getNetType(activeNetworkInfo));
    }

    public static void checkNetwork(Context context) throws SpeechError {
        if (context != null) {
            try {
                NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
                if (allNetworkInfo != null && allNetworkInfo.length > 0) {
                    for (NetworkInfo networkInfo : allNetworkInfo) {
                        if (networkInfo == null || networkInfo.isConnectedOrConnecting()) {
                            return;
                        }
                    }
                }
                throw new SpeechError(20001);
            } catch (SecurityException e) {
                DebugLog.LogD("check network failed: " + e.getLocalizedMessage());
            }
        }
    }

    public static String getNetType(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return "none";
        }
        try {
            if (networkInfo.getType() == 1) {
                return NET_WIFI;
            }
            String lowerCase = networkInfo.getExtraInfo().toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                return "none";
            }
            if (lowerCase.startsWith("3gwap") || lowerCase.startsWith(NET_UNIWAP)) {
                return NET_UNIWAP;
            }
            if (lowerCase.startsWith(NET_CMWAP)) {
                return NET_CMWAP;
            }
            if (lowerCase.startsWith(NET_CTWAP)) {
                return NET_CTWAP;
            }
            if (lowerCase.startsWith(NET_CTNET)) {
                return NET_CTNET;
            }
            return lowerCase;
        } catch (Exception e) {
            DebugLog.LogD(e.toString());
            return "none";
        }
    }

    public static String getNetSubType(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return "none";
        }
        try {
            if (networkInfo.getType() == 1) {
                return "none";
            }
            return ("" + networkInfo.getSubtypeName()) + VoiceWakeuperAidl.PARAMS_SEPARATE + networkInfo.getSubtype();
        } catch (Exception e) {
            DebugLog.LogD(e.toString());
            return "none";
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        if (!checkPermission(context, "android.permission.INTERNET") || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return false;
        }
        return true;
    }

    private static boolean checkPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static long ip2int(String str) {
        String[] split = str.split("\\.");
        return (Long.valueOf(split[0]).longValue() << 24) | (Long.valueOf(split[1]).longValue() << 16) | (Long.valueOf(split[2]).longValue() << 8) | Long.valueOf(split[3]).longValue();
    }

    public static String int2ip(long j) {
        return (j & 255) + InstructionFileId.DOT + ((j >> 8) & 255) + InstructionFileId.DOT + ((j >> 16) & 255) + InstructionFileId.DOT + ((j >> 24) & 255);
    }
}