package com.vivavideo.mobile.h5core.e;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivavideo.mobile.h5api.api.f;
import com.vivavideo.mobile.h5api.e.c;
import com.vivavideo.mobile.h5core.h.d;

public class b {
    private static Context context;

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context2) {
        if (context == null && context2 != null) {
            context = context2.getApplicationContext();
        }
    }

    public static String Le(String str) {
        c.e("H5Environment", "can't get config service");
        return null;
    }

    public static Resources getResources() {
        return getContext().getResources();
    }

    public static String a(f fVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String i = d.i(bundle, "sessionId");
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        if (TextUtils.isEmpty(i)) {
            i = "h5session_default";
        }
        bundle.putString("sessionId", i);
        return i;
    }

    public static void a(f fVar, Intent intent) {
        Context context2;
        if (intent == null) {
            c.w("H5Environment", "invalid intent parameter");
            return;
        }
        if (fVar != null) {
            try {
                if (fVar.getContext() != null) {
                    context2 = fVar.getContext();
                    intent.setFlags(268435456);
                    context2.startActivity(intent);
                }
            } catch (Exception e) {
                c.a("H5Environment", "startActivity exception", e);
                return;
            }
        }
        context2 = getContext();
        intent.setFlags(268435456);
        context2.startActivity(intent);
    }

    public static void b(f fVar, Intent intent) {
        Context context2;
        if (intent == null) {
            c.w("H5Environment", "invalid intent parameter");
            return;
        }
        if (fVar != null) {
            try {
                if (fVar.getContext() != null) {
                    context2 = fVar.getContext();
                    intent.setFlags(268435456);
                    context2.startActivity(intent);
                }
            } catch (Exception e) {
                c.a("H5Environment", "startActivity exception", e);
                return;
            }
        }
        context2 = getContext();
        intent.setFlags(268435456);
        context2.startActivity(intent);
    }
}