package com.quvideo.mobile.engine.e;

import android.text.TextUtils;
import com.quvideo.mobile.engine.k.g;

/* access modifiers changed from: package-private */
public class e {
    private static final String TAG = e.class.getSimpleName();
    private static String dRe = "";
    private static boolean[] dRf = new boolean[32];

    private static void auw() {
    }

    e() {
    }

    static boolean oP(int i) {
        boolean z = false;
        boolean z2 = (65536 & i) != 0;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = TAG;
            g.e(str, "PreInstall nLoadMode:" + i);
            String str2 = TAG;
            g.e(str2, "PreInstall cost:" + (currentTimeMillis2 - currentTimeMillis));
        } catch (Exception e) {
            String str3 = TAG;
            g.e(str3, "exception:" + e.getMessage());
        } catch (Throwable th) {
            g.e(TAG, th.getMessage());
        }
        if ((i & 1) == 1) {
            loadLibrary("libcesplatform.so");
            loadLibrary("libx264.so");
            loadLibrary("libffmpeg.so");
            loadLibrary("libpostprocess.so");
            loadLibrary("libcesplatformutils.so");
            loadLibrary("libcescommon.so");
        }
        if ((i & 4) == 4) {
            loadLibrary("libcesrenderengine.so");
            loadLibrary("libasp.so");
            loadLibrary("libcesmediabase.so");
        }
        if ((i & 23) == 23) {
            loadLibrary("libcesliveeditor.so");
        }
        if ((i & 55) == 55) {
            loadLibrary("libcescamengine.so");
        }
        if (!z2) {
            auw();
        }
        z = true;
        long currentTimeMillis3 = System.currentTimeMillis();
        String str4 = TAG;
        g.e(str4, "cost:" + (currentTimeMillis3 - currentTimeMillis));
        return z;
    }

    private static synchronized boolean loadLibrary(String str) {
        synchronized (e.class) {
            int jk = a.jk(str);
            if (jk == -1) {
                return false;
            }
            return oQ(jk);
        }
    }

    private static synchronized boolean oQ(int i) {
        synchronized (e.class) {
            if (dRf[i]) {
                return true;
            }
            String str = a.dRg[i];
            if (str.equals("")) {
                return false;
            }
            try {
                System.loadLibrary(str.replace("lib", "").replace(".so", ""));
                dRf[i] = true;
            } catch (Throwable th) {
                g.e(TAG, th.getMessage());
                dRf[i] = false;
            }
            return dRf[i];
        }
    }

    /* access modifiers changed from: private */
    public static class a {
        private static final String[] dRg = {"libcesplatform.so", "libpostprocess.so", "libcescommon.so", "libcesplatformutils.so", "libx264.so", "libffmpeg.so", "libasp.so", "libcesmediabase.so", "libcesliveeditor.so", "libcescamengine.so", "libcesrenderengine.so", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

        /* access modifiers changed from: private */
        public static int jk(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            int length = dRg.length;
            for (int i = 0; i < length; i++) {
                if (dRg[i].equals(str)) {
                    return i;
                }
            }
            return -1;
        }
    }
}