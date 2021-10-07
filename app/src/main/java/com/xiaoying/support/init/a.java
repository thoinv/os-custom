package com.xiaoying.support.init;

import android.app.Application;
import kotlin.e.b.l;

public final class a {
    private static boolean dkH;
    private static Application lKi;
    public static final a lKj = new a();

    private a() {
    }

    public final void v(Application application) {
        lKi = application;
    }

    public final boolean isDebug() {
        return dkH;
    }

    public final Application getApp() {
        Application application = lKi;
        l.checkNotNull(application);
        return application;
    }
}