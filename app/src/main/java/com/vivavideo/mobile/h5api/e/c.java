package com.vivavideo.mobile.h5api.e;

import android.os.Build;
import android.text.TextUtils;

public class c {
    private static boolean dkH = false;
    public static final String lyL = (Build.MANUFACTURER + "-" + Build.MODEL + "-" + Build.CPU_ABI + "-api" + Build.VERSION.SDK_INT);
    private static a lyM;

    public interface a {
        void onLog(String str, String str2);
    }

    public static boolean isDebug() {
        return dkH;
    }

    public static void a(a aVar) {
        synchronized (a.class) {
            lyM = aVar;
        }
    }

    public static void d(String str) {
        d("H5Log", str);
    }

    public static void d(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            ez(str, str2);
        }
    }

    public static void ex(String str, String str2) {
        String str3 = " on device: " + lyL;
        if (str2 != null) {
            str3 = str2 + str3;
        }
        d(str, str3);
    }

    public static void w(String str) {
        w("H5Log", str);
    }

    public static void w(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            ez(str, str2);
        }
    }

    public static void e(String str) {
        a("H5Log", str, null);
    }

    public static void e(String str, String str2) {
        a(str, str2, null);
    }

    public static void ey(String str, String str2) {
        String str3 = " on device: " + lyL;
        if (str2 != null) {
            str3 = str2 + str3;
        }
        a(str, str3, null);
    }

    public static void c(String str, Exception exc) {
        a("H5Log", str, exc);
    }

    public static void a(String str, String str2, Exception exc) {
        ez(str, str2);
    }

    private static void ez(String str, String str2) {
        synchronized (a.class) {
            if (lyM != null) {
                lyM.onLog(str, str2);
            }
        }
    }
}