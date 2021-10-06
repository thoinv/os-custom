package com.quvideo.xiaoying.router
        ;

import android.app.Application;
import com.alibaba.android.arouter.facade.a;

public class BaseRouter {
    public static final String SCHEMA = "xiaoying://";

    public static a getRouterBuilder(Application application, String str) {
        if (application != null) {
            com.alibaba.android.arouter.b.a.init(application);
        }
        return com.alibaba.android.arouter.b.a.Fd().bL(str);
    }
}