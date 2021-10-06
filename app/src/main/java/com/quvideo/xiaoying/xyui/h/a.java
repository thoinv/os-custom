package com.quvideo.xiaoying.xyui.h;

import android.content.Context;

public class a {
    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int aG(Context context, int i) {
        return (int) ((((float) i) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}