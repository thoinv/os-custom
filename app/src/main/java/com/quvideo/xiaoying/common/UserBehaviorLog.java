package com.quvideo.xiaoying.common;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
//import com.alibaba.sdk.android.man.MANServiceProvider;
//import com.bytedance.applog.AppLog;
//import com.facebook.ads.AudienceNetworkActivity;
//import com.facebook.appevents.AppEventsLogger;
//import com.google.android.gms.analytics.GoogleAnalytics;
//import com.google.firebase.analytics.FirebaseAnalytics;
//import com.huawei.hms.analytics.HiAnalyticsInstance;
//import com.kaka.analysis.mobile.ub.b;
//import com.kaka.analysis.mobile.ub.c;
//import com.quvideo.xiaoying.common.userbehaviorutils.AliONEUserbehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.BRUserBehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.BaseBehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.FBUserBehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.FireBaseUserBehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.FlurryUserBehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.GAUserBehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.HuaWeiBehaviourLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.KakaUserBehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.ThreadHelper;
//import com.quvideo.xiaoying.common.userbehaviorutils.UMengUserBehaviorLog;
//import com.quvideo.xiaoying.common.userbehaviorutils.util.Logger;
//import com.quvideo.xiaoying.common.userbehaviorutils.util.UBDelayInit;
//import com.quvideo.xiaoying.common.userbehaviorutils.util.Utils;
//import com.ta.utdid2.device.UTDevice;
//import com.umeng.analytics.MobclickAgent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserBehaviorLog {
    public static boolean DEBUG = false;
    private static volatile boolean dls = false;
    private static final AtomicInteger fpS = new AtomicInteger(0);
//    private static final ConcurrentHashMap<String, BaseBehaviorLog> fpT = new ConcurrentHashMap<>();
//    private static final ConcurrentHashMap<String, BaseBehaviorLog> fpU = new ConcurrentHashMap<>();
//    private static final UBDelayInit fpV = new UBDelayInit();
//    private static OnBehaviorEventListener fpW;
//    private static EnableConfig fpX = new EnableConfig();
    private static Map<String, Object> fpY = null;
//    private static ABTestListener fpZ;
    private static final ConcurrentHashMap<String, String> fqa = new ConcurrentHashMap<>();
    public static Application s_Application;
    private static final long startTime = System.currentTimeMillis();

//    public static void setOnBehaviorEventListener(OnBehaviorEventListener onBehaviorEventListener) {
//        fpW = onBehaviorEventListener;
//    }
//
//    public static void setEnableConfig(EnableConfig enableConfig) {
//        fpX = enableConfig;
//        if (dls) {
//            openSubPlatform();
//        }
//    }
//
//    public static void setInitParam(Application application, Map<String, Object> map, EnableConfig enableConfig) {
//        if (map != null) {
//            fpY = new HashMap(map);
//        }
//        if (enableConfig != null) {
//            fpX = enableConfig;
//        }
//        s_Application = application;
//        application.registerActivityLifecycleCallbacks(new b());
//        openSubPlatform();
//    }

    public static void openSubPlatform() {
//        ThreadHelper.getInstance().executeTask(new Runnable() {
//            /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass1 */
//
//            public void run() {
//                long currentTimeMillis = System.currentTimeMillis();
//                UserBehaviorLog.aZE();
//                UserBehaviorLog.aZD();
//                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
//                Log.d("UserBehaviorLog", "UserBehaviorLog init cost=" + currentTimeMillis2 + "ms");
//                boolean unused = UserBehaviorLog.dls = true;
//                UserBehaviorLog.setDebugMode(UserBehaviorLog.fpV.isDebug());
//                UserBehaviorLog.fpV.uploadAll();
//            }
//        });
    }

    /* access modifiers changed from: private */
    public static void aZD() {
//        if (!fpX.enableKakaAnalysis.booleanValue()) {
//            fpT.remove(KakaUserBehaviorLog.class.getName());
//            fpU.remove(KakaUserBehaviorLog.class.getName());
//        }
//        if (!fpX.enableAli.booleanValue()) {
//            fpT.remove(AliONEUserbehaviorLog.class.getName());
//            fpU.remove(AliONEUserbehaviorLog.class.getName());
//        }
//        if (!fpX.enableUmeng.booleanValue()) {
//            fpT.remove(UMengUserBehaviorLog.class.getName());
//        }
//        if (!fpX.enableGA.booleanValue()) {
//            fpT.remove(GAUserBehaviorLog.class.getName());
//        }
//        if (!fpX.enableFlurry.booleanValue()) {
//            fpT.remove(FlurryUserBehaviorLog.class.getName());
//        }
//        if (!fpX.enableFaceBook.booleanValue()) {
//            fpT.remove(FBUserBehaviorLog.class.getName());
//        }
//        if (!fpX.enableFirebase.booleanValue()) {
//            fpT.remove(FireBaseUserBehaviorLog.class.getName());
//        }
//        if (!fpX.enableHuaWei.booleanValue()) {
//            fpT.remove(HuaWeiBehaviourLog.class.getName());
//        }
//        if (!fpX.enableByteDance.booleanValue()) {
//            fpT.remove(BRUserBehaviorLog.class.getName());
//        }
    }

    /* access modifiers changed from: private */
    public static synchronized void aZE() {
        synchronized (UserBehaviorLog.class) {
//            if (s_Application != null) {
//                if (fpX.enableKakaAnalysis.booleanValue() && !fpT.containsKey(KakaUserBehaviorLog.class.getName())) {
//                    try {
//                        if (!TextUtils.isEmpty(b.class.getSimpleName())) {
//                            Object obj = fpY.get("kaka_config");
//                            if (obj instanceof c) {
//                                KakaUserBehaviorLog kakaUserBehaviorLog = new KakaUserBehaviorLog(s_Application, (c) obj);
//                                fpT.put(KakaUserBehaviorLog.class.getName(), kakaUserBehaviorLog);
//                                fpU.put(KakaUserBehaviorLog.class.getName(), kakaUserBehaviorLog);
//                                Log.d("UserBehaviorLog", "UserBehaviorLog init KakaUserBehaviorLog");
//                            }
//                        }
//                    } catch (Throwable unused) {
//                    }
//                }
//                if (fpX.enableAli.booleanValue() && !fpT.containsKey(AliONEUserbehaviorLog.class.getName())) {
//                    try {
//                        if (!TextUtils.isEmpty(MANServiceProvider.class.getSimpleName())) {
//                            AliONEUserbehaviorLog aliONEUserbehaviorLog = new AliONEUserbehaviorLog(s_Application, fpY);
//                            fpT.put(AliONEUserbehaviorLog.class.getName(), aliONEUserbehaviorLog);
//                            fpU.put(AliONEUserbehaviorLog.class.getName(), aliONEUserbehaviorLog);
//                            Log.d("UserBehaviorLog", "UserBehaviorLog init AliONEUserbehaviorLog");
//                        }
//                    } catch (Throwable unused2) {
//                    }
//                }
//                if (fpX.enableUmeng.booleanValue() && !fpT.containsKey(UMengUserBehaviorLog.class.getName())) {
//                    try {
//                        if (MobclickAgent.getAgent() != null) {
//                            fpT.put(UMengUserBehaviorLog.class.getName(), new UMengUserBehaviorLog(fpY));
//                            Log.d("UserBehaviorLog", "UserBehaviorLog init UMengUserBehaviorLog");
//                        }
//                    } catch (Throwable unused3) {
//                    }
//                }
//                if (fpX.enableGA.booleanValue() && !fpT.containsKey(GAUserBehaviorLog.class.getName())) {
//                    try {
//                        if (!TextUtils.isEmpty(GoogleAnalytics.class.getSimpleName())) {
//                            fpT.put(GoogleAnalytics.class.getName(), new GAUserBehaviorLog(fpY));
//                            Log.d("UserBehaviorLog", "UserBehaviorLog init GoogleAnalytics");
//                        }
//                    } catch (Throwable unused4) {
//                    }
//                }
//                if (fpX.enableFlurry.booleanValue() && !fpT.containsKey(FlurryUserBehaviorLog.class.getName())) {
//                    try {
//                        if (!TextUtils.isEmpty(com.flurry.android.b.class.getSimpleName())) {
//                            fpT.put(FlurryUserBehaviorLog.class.getName(), new FlurryUserBehaviorLog(s_Application, fpY));
//                            Log.d("UserBehaviorLog", "UserBehaviorLog init FlurryUserBehaviorLog");
//                        }
//                    } catch (Throwable unused5) {
//                    }
//                }
//                if (fpX.enableFaceBook.booleanValue() && !fpT.containsKey(FBUserBehaviorLog.class.getName())) {
//                    try {
//                        if (!TextUtils.isEmpty(AppEventsLogger.class.getSimpleName())) {
//                            fpT.put(FBUserBehaviorLog.class.getName(), new FBUserBehaviorLog());
//                        }
//                        Log.d("UserBehaviorLog", "UserBehaviorLog init FBUserBehaviorLog");
//                    } catch (Throwable unused6) {
//                    }
//                }
//                if (fpX.enableFirebase.booleanValue() && !fpT.containsKey(FireBaseUserBehaviorLog.class.getName())) {
//                    try {
//                        if (!TextUtils.isEmpty(FirebaseAnalytics.class.getSimpleName())) {
//                            fpT.put(FireBaseUserBehaviorLog.class.getName(), new FireBaseUserBehaviorLog(s_Application));
//                        }
//                        Log.d("UserBehaviorLog", "UserBehaviorLog init FireBaseUserBehaviorLog");
//                    } catch (Throwable unused7) {
//                    }
//                }
//                if (fpX.enableHuaWei.booleanValue() && !fpT.containsKey(HuaWeiBehaviourLog.class.getName())) {
//                    try {
//                        if (!TextUtils.isEmpty(HiAnalyticsInstance.class.getSimpleName())) {
//                            new Handler(Looper.getMainLooper()).post(new Runnable() {
//                                /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass8 */
//
//                                public void run() {
//                                    UserBehaviorLog.fpT.put(HuaWeiBehaviourLog.class.getName(), new HuaWeiBehaviourLog(UserBehaviorLog.s_Application));
//                                    Log.d("UserBehaviorLog", "UserBehaviorLog init HuaWeiBehaviourLog");
//                                }
//                            });
//                        }
//                    } catch (Throwable unused8) {
//                    }
//                }
//                if (fpX.enableByteDance.booleanValue() && !fpT.containsKey(BRUserBehaviorLog.class.getName())) {
//                    try {
//                        BRUserBehaviorLog bRUserBehaviorLog = new BRUserBehaviorLog(s_Application, fpY);
//                        if (!TextUtils.isEmpty(AppLog.class.getSimpleName())) {
//                            fpT.put(BRUserBehaviorLog.class.getName(), bRUserBehaviorLog);
//                        }
//                        Log.d("UserBehaviorLog", "UserBehaviorLog init BRUserBehaviorLog");
//                    } catch (Throwable th) {
//                        th.printStackTrace();
//                    }
//                }
//            }
        }
    }

    public static void setLoggerDebug(boolean z) {
        DEBUG = z;
    }

    public static void setDebugMode(final boolean z) {
//        fpV.setDebug(z);
//        if (dls) {
//            ThreadHelper.getInstance().executeTask(new Runnable() {
//                /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass9 */
//
//                public void run() {
//                    for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                        baseBehaviorLog.setDebugMode(z);
//                    }
//                }
//            });
//        }
    }

    public static void onResume(final Context context) {
//        if (dls) {
//            ThreadHelper.getInstance().executeTask(new Runnable() {
//                /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass10 */
//
//                public void run() {
//                    for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                        baseBehaviorLog.onResume(context);
//                    }
//                }
//            });
//        }
    }

    public static void onPause(final Context context) {
//        if (dls) {
//            ThreadHelper.getInstance().executeTask(new Runnable() {
//                /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass11 */
//
//                public void run() {
//                    for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                        baseBehaviorLog.onPause(context);
//                    }
//                }
//            });
//        }
    }

    public static void onKVEvent(String str, HashMap<String, String> hashMap) {
        onKVEvent(s_Application, str, hashMap);
    }

    @Deprecated
    public static void onKVEvent(Context context, final String str, HashMap<String, String> hashMap) {
//        if (!dls) {
//            fpV.addDelayLog(str, hashMap);
//            return;
//        }
//        final HashMap<String, String> aZF = aZF();
//        if (hashMap != null) {
//            aZF.putAll(hashMap);
//        }
//        ThreadHelper.getInstance().executeTask(new Runnable() {
//            /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass12 */
//
//            public void run() {
//                for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                    baseBehaviorLog.onKVEvent(UserBehaviorLog.s_Application, str, new HashMap<>(aZF));
//                }
//                if (UserBehaviorLog.DEBUG) {
//                    Logger.sendEvent(UserBehaviorLog.s_Application, 3, str, aZF);
//                }
//                if (UserBehaviorLog.fpW != null) {
//                    UserBehaviorLog.fpW.onEvent(str, aZF);
//                }
//            }
//        });
    }

    public static void updateOnlineConfig(final Context context) {
//        if (dls) {
//            ThreadHelper.getInstance().executeTask(new Runnable() {
//                /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass13 */
//
//                public void run() {
//                    for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                        baseBehaviorLog.updateOnlineConfig(context);
//                    }
//                }
//            });
//        }
    }

    public static void onKillProcess(final Context context) {
//        if (dls) {
//            ThreadHelper.getInstance().executeTask(new Runnable() {
//                /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass14 */
//
//                public void run() {
//                    for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                        baseBehaviorLog.onKillProcess(context);
//                    }
//                }
//            });
//        }
    }

    public static void onAliEvent(final String str, HashMap<String, String> hashMap) {
//        if (!dls) {
//            fpV.addDelayLog(str, hashMap);
//            return;
//        }
//        final HashMap<String, String> aZF = aZF();
//        if (hashMap != null) {
//            aZF.putAll(hashMap);
//        }
//        ThreadHelper.getInstance().executeTask(new Runnable() {
//            /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass2 */
//
//            public void run() {
//                for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpU.values()) {
//                    baseBehaviorLog.onKVEvent(UserBehaviorLog.s_Application, str, aZF);
//                }
//                if (UserBehaviorLog.DEBUG) {
//                    Logger.sendEvent(UserBehaviorLog.s_Application, 3, str, aZF);
//                }
//                if (UserBehaviorLog.fpW != null) {
//                    UserBehaviorLog.fpW.onEvent(str, aZF);
//                }
//            }
//        });
    }

    public static void updateAccount(final String str, final long j) {
//        if (dls) {
//            ThreadHelper.getInstance().executeTask(new Runnable() {
//                /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass3 */
//
//                public void run() {
//                    for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                        baseBehaviorLog.updateAccount(str, j);
//                    }
//                }
//            });
//        }
    }

    public static void setUserProperty(final String str, final String str2) {
//        ThreadHelper.getInstance().executeTask(new Runnable() {
//            /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass4 */
//
//            public void run() {
//                for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                    if (baseBehaviorLog instanceof FireBaseUserBehaviorLog) {
//                        ((FireBaseUserBehaviorLog) baseBehaviorLog).setUserProperty(str, str2);
//                    } else if (baseBehaviorLog instanceof HuaWeiBehaviourLog) {
//                        ((HuaWeiBehaviourLog) baseBehaviorLog).setUserProperty(str, str2);
//                    }
//                }
//            }
//        });
    }

    public static void skipPage(final Object obj) {
//        ThreadHelper.getInstance().executeTask(new Runnable() {
//            /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass5 */
//
//            public void run() {
//                for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                    if (baseBehaviorLog instanceof AliONEUserbehaviorLog) {
//                        ((AliONEUserbehaviorLog) baseBehaviorLog).skipPage(obj);
//                        return;
//                    }
//                }
//            }
//        });
    }

    public static void pageDisappear(final Object obj) {
//        ThreadHelper.getInstance().executeTask(new Runnable() {
//            /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass6 */
//
//            public void run() {
//                for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                    if (baseBehaviorLog instanceof AliONEUserbehaviorLog) {
//                        ((AliONEUserbehaviorLog) baseBehaviorLog).pageDisappear(obj);
//                        return;
//                    }
//                }
//            }
//        });
    }

    public static void pageFragmentAppear(final Object obj, final String... strArr) {
//        ThreadHelper.getInstance().executeTask(new Runnable() {
//            /* class com.quvideo.xiaoying.common.UserBehaviorLog.AnonymousClass7 */
//
//            public void run() {
//                for (BaseBehaviorLog baseBehaviorLog : UserBehaviorLog.fpT.values()) {
//                    if (baseBehaviorLog instanceof AliONEUserbehaviorLog) {
//                        ((AliONEUserbehaviorLog) baseBehaviorLog).pageFragmentAppear(obj, strArr);
//                        return;
//                    }
//                }
//            }
//        });
    }

//    public static void setAbTestListener(ABTestListener aBTestListener) {
//        fpZ = aBTestListener;
//    }

    public static synchronized void addCommonMap(HashMap<String, String> hashMap) {
        synchronized (UserBehaviorLog.class) {
            if (hashMap != null) {
                if (hashMap.size() != 0) {
                    fqa.putAll(hashMap);
                }
            }
        }
    }

    private static HashMap<String, String> aZF() {
        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("appState", b.isForeground() ? "fore" : "bg");
//        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
//        Application application = s_Application;
//        if (application != null) {
//            hashMap.put("packageName", application.getPackageName());
//            hashMap.put("appVersionCode", String.valueOf(Utils.getAppVersionCode(s_Application)));
//            hashMap.put("ub_event_time", String.valueOf(System.currentTimeMillis() - startTime));
//            hashMap.put(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, UTDevice.getUtdid(s_Application) + "_" + startTime + "_" + fpS.getAndIncrement());
//        }
//        ConcurrentHashMap<String, String> concurrentHashMap = fqa;
//        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
//            hashMap.putAll(fqa);
//        }
//        ABTestListener aBTestListener = fpZ;
//        if (aBTestListener != null && !TextUtils.isEmpty(aBTestListener.getABTestKey()) && !TextUtils.isEmpty(fpZ.getABTestValue())) {
//            hashMap.put(fpZ.getABTestKey(), fpZ.getABTestValue());
//        }
        return hashMap;
    }

    public static String getFirebaseId() {
//        return FireBaseUserBehaviorLog.firebaseAppInstanceId;
        return "";
    }
}