package com.xiaoying.support.ktx;

import android.app.Application;
import java.util.UUID;
import kotlin.e.b.l;

public final class a {
    public static final Application getApp() {
        return com.xiaoying.support.init.a.lKj.getApp();
    }

    public static final String cOk() {
        String uuid = UUID.randomUUID().toString();
        l.p(uuid, "UUID.randomUUID().toString()");
        return uuid;
    }
}