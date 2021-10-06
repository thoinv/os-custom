package com.quvideo.xiaoying.common;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.b.a.b;
import com.b.a.g;
import com.facebook.internal.security.CertificateUtil;
import org.apache.commons.lang3.StringUtils;

public class LogUtilsV2 {
    private static boolean DEBUG = true;
    public static boolean Logable = false;
    public static CustomLogger customLogger = null;
    public static String customTagPrefix = "QuVideo";
    private static a fpq;

    public interface CustomLogger {
        void d(String str, String str2);

        void d(String str, String str2, Throwable th);

        void e(String str, String str2);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2);

        void v(String str, String str2);

        void w(String str, String str2);
    }

    public static void init(boolean z, String str) {
        DEBUG = z;
        if (z) {
            customTagPrefix = str;
            HandlerThread handlerThread = new HandlerThread("LogException");
            handlerThread.start();
            fpq = new a(handlerThread.getLooper());
        }
    }

    public static void initLoggerWriterAdapter() {
        g.a(new b());
    }

    private static String b(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        String format = String.format("%s.%s(L:%d)", className.substring(className.lastIndexOf(InstructionFileId.DOT) + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
        if (TextUtils.isEmpty(customTagPrefix)) {
            return format;
        }
        return customTagPrefix + CertificateUtil.DELIMITER + format;
    }

    public static StackTraceElement getCallerStackTraceElement() {
        return Thread.currentThread().getStackTrace()[4];
    }

    public static void d(final String str) {
        if (Logable) {
            g.aZ(str);
        }
        if (DEBUG && fpq != null) {
            final String b2 = b(getCallerStackTraceElement());
            fpq.post(new Runnable() {
                /* class com.quvideo.xiaoying.common.LogUtilsV2.AnonymousClass1 */

                public void run() {
                    if (LogUtilsV2.customLogger != null) {
                        LogUtilsV2.customLogger.d(b2, str);
                    } else {
                        Log.d(b2, str);
                    }
                }
            });
        }
    }

    public static void d(final String str, final Throwable th) {
        if (DEBUG && fpq != null) {
            final String b2 = b(getCallerStackTraceElement());
            fpq.post(new Runnable() {
                /* class com.quvideo.xiaoying.common.LogUtilsV2.AnonymousClass2 */

                public void run() {
                    if (LogUtilsV2.customLogger != null) {
                        LogUtilsV2.customLogger.d(b2, str, th);
                    } else {
                        Log.d(b2, str, th);
                    }
                }
            });
        }
    }

    public static void e(final String str) {
        if (Logable) {
            g.e(str, new Object[0]);
        }
        if (DEBUG && fpq != null) {
            final String b2 = b(getCallerStackTraceElement());
            fpq.post(new Runnable() {
                /* class com.quvideo.xiaoying.common.LogUtilsV2.AnonymousClass3 */

                public void run() {
                    if (LogUtilsV2.customLogger != null) {
                        LogUtilsV2.customLogger.e(b2, str);
                    } else {
                        Log.e(b2, str);
                    }
                }
            });
        }
    }

    public static void e(final String str, final Throwable th) {
        if (Logable) {
            g.e(str + E(th), new Object[0]);
        }
        if (DEBUG && fpq != null) {
            final String b2 = b(getCallerStackTraceElement());
            fpq.post(new Runnable() {
                /* class com.quvideo.xiaoying.common.LogUtilsV2.AnonymousClass4 */

                public void run() {
                    if (LogUtilsV2.customLogger != null) {
                        LogUtilsV2.customLogger.e(b2, str, th);
                    } else {
                        Log.e(b2, str, th);
                    }
                }
            });
        }
    }

    public static void i(final String str) {
        if (Logable) {
            g.i(str, new Object[0]);
        }
        if (DEBUG && fpq != null) {
            final String b2 = b(getCallerStackTraceElement());
            fpq.post(new Runnable() {
                /* class com.quvideo.xiaoying.common.LogUtilsV2.AnonymousClass5 */

                public void run() {
                    if (LogUtilsV2.customLogger != null) {
                        LogUtilsV2.customLogger.i(b2, str);
                    } else {
                        Log.i(b2, str);
                    }
                }
            });
        }
    }

    public static void v(final String str) {
        if (Logable) {
            g.v(str, new Object[0]);
        }
        if (DEBUG && fpq != null) {
            final String b2 = b(getCallerStackTraceElement());
            fpq.post(new Runnable() {
                /* class com.quvideo.xiaoying.common.LogUtilsV2.AnonymousClass6 */

                public void run() {
                    if (LogUtilsV2.customLogger != null) {
                        LogUtilsV2.customLogger.v(b2, str);
                    } else {
                        Log.v(b2, str);
                    }
                }
            });
        }
    }

    public static void w(final String str) {
        if (Logable) {
            g.w(str, new Object[0]);
        }
        if (DEBUG && fpq != null) {
            final String b2 = b(getCallerStackTraceElement());
            fpq.post(new Runnable() {
                /* class com.quvideo.xiaoying.common.LogUtilsV2.AnonymousClass7 */

                public void run() {
                    if (LogUtilsV2.customLogger != null) {
                        LogUtilsV2.customLogger.w(b2, str);
                    } else {
                        Log.w(b2, str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }
    }

    private static String E(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.CR + th.toString());
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\rat " + stackTraceElement);
        }
        return sb.toString();
    }
}