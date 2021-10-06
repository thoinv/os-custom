package com.alibaba.android.arouter.b;

import android.app.Application;
import android.content.Context;
import com.alibaba.android.arouter.exception.InitException;
import com.alibaba.android.arouter.facade.template.b;

public final class a {
    private static volatile a bzr = null;
    private static volatile boolean bzs = false;
    public static b bzt;

    private a() {
    }

    public static void init(Application application) {
        if (!bzs) {
            bzt = b.bzt;
            b.bzt.B("ARouter::", "ARouter init start.");
            bzs = b.init(application);
            if (bzs) {
                b.Fg();
            }
            b.bzt.B("ARouter::", "ARouter init over.");
        }
    }

    public static a Fd() {
        if (bzs) {
            if (bzr == null) {
                synchronized (a.class) {
                    if (bzr == null) {
                        bzr = new a();
                    }
                }
            }
            return bzr;
        }
        throw new InitException("ARouter::Init::Invoke init(context) first!");
    }

    public static boolean Fe() {
        return b.Fe();
    }

    public void inject(Object obj) {
        b.inject(obj);
    }

    public com.alibaba.android.arouter.facade.a bL(String str) {
        return b.Ff().bL(str);
    }

    public <T> T v(Class<? extends T> cls) {
        return (T) b.Ff().v(cls);
    }

    public Object a(Context context, com.alibaba.android.arouter.facade.a aVar, int i, com.alibaba.android.arouter.facade.b.b bVar) {
        return b.Ff().a(context, aVar, i, bVar);
    }
}