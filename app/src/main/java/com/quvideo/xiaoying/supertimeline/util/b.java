package com.quvideo.xiaoying.supertimeline.util;

import android.content.Context;

public class b {
    private static float dPa = -1.0f;

    public static synchronized float dpToPixel(Context context, float f) {
        float f2;
        synchronized (b.class) {
            if (dPa < 0.0f) {
                dPa = context.getResources().getDisplayMetrics().density;
            }
            f2 = dPa * f;
        }
        return f2;
    }

    public static synchronized int getScreenWidth(Context context) {
        int i;
        synchronized (b.class) {
            i = context.getResources().getDisplayMetrics().widthPixels;
        }
        return i;
    }
}