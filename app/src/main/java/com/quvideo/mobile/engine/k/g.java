package com.quvideo.mobile.engine.k;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import java.util.HashMap;

public class g {
    private static boolean dXt = true;
    private static HashMap<String, Long> mTimeStamp = new HashMap<>();
    private static int mlogLevel = 31;

    public static void v(String str, String str2) {
        if ((mlogLevel & 16) != 0) {
            h(16, str + CertificateUtil.DELIMITER + str2);
        }
    }

    public static void d(String str, String str2) {
        if ((mlogLevel & 8) != 0) {
            h(8, str + CertificateUtil.DELIMITER + str2);
        }
    }

    public static void i(String str, String str2) {
        if ((mlogLevel & 4) != 0) {
            h(4, str + CertificateUtil.DELIMITER + str2);
        }
    }

    public static void e(String str, String str2) {
        if ((mlogLevel & 1) != 0) {
            h(1, str + CertificateUtil.DELIMITER + str2);
        }
    }

    private static void h(int i, String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 3800) {
            i(i, str);
            return;
        }
        int length = (str.length() / 3800) + 1;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 == length - 1) {
                String substring = str.substring(i2 * 3800);
                i(i, " O(>_<)o <--- " + substring);
            } else if (i2 == 0) {
                String substring2 = str.substring(0, (i2 + 1) * 3800);
                i(i, substring2 + " ---> o(>_<)O ");
            } else {
                String substring3 = str.substring(i2 * 3800, (i2 + 1) * 3800);
                i(i, " O(>_<)o <--- " + substring3 + " ---> o(>_<)O ");
            }
        }
    }

    private static void i(int i, String str) {
        if (i == 1) {
            Log.e("Viva-Engine", str);
        } else if (i == 2) {
            Log.w("Viva-Engine", str);
        } else if (i == 4) {
            Log.i("Viva-Engine", str);
        } else if (i == 8) {
            Log.d("Viva-Engine", str);
        } else {
            Log.v("Viva-Engine", str);
        }
    }
}