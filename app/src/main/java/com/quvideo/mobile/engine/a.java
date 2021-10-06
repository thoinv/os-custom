package com.quvideo.mobile.engine;

import android.content.Context;
import com.quvideo.mobile.engine.e.b;
import xiaoying.engine.QEngine;
import xiaoying.engine.base.IQTextTransformer;
import xiaoying.utils.QStreamAssets;

public class a {
    private static volatile boolean dQO = false;
    public static String dQP;

    public static boolean isProjectModified() {
        return dQO;
    }

    public static void ds(boolean z) {
        dQO = z;
    }

    public static void a(Context context, b bVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(QStreamAssets.ASSETS_THEME);
        sb.append(z ? "engine/ini/license_india.txt" : "engine/ini/license.txt");
        dQP = sb.toString();
        f.auy().a(context, bVar);
    }

    public static boolean aum() {
        return f.auy().aum();
    }

    public static boolean aun() {
        return f.auy().aun();
    }

    public static String auo() {
        return f.auy().auo();
    }

    public static Context getContext() {
        return f.auy().getContext();
    }

    public static com.quvideo.mobile.engine.e.a aup() {
        return f.auy().aup();
    }

    public static String getGpuType() {
        f.auy().checkInit();
        return com.quvideo.mobile.engine.c.a.getGpuType();
    }

    public static synchronized boolean dt(boolean z) {
        boolean dt;
        synchronized (a.class) {
            f.auy().checkInit();
            dt = com.quvideo.mobile.engine.c.a.dt(z);
        }
        return dt;
    }

    public static QEngine auq() {
        f.auy().checkInit();
        return d.aut().auq();
    }

    public static void a(IQTextTransformer iQTextTransformer) {
        f.auy().checkInit();
        d.aut().a(iQTextTransformer);
    }

    public static void a(b bVar) {
        f.auy().checkInit();
        d.aut().a(bVar);
    }

    public static com.quvideo.mobile.engine.h.a aur() {
        return f.auy().aur();
    }
}