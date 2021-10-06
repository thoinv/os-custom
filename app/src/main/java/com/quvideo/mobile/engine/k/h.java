package com.quvideo.mobile.engine.k;

import android.text.TextUtils;

public class h {
    public static long decodeLong(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.decode(str).longValue();
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static long decodeLong(String str) {
        return decodeLong(str, 0);
    }

    public static float e(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }
}