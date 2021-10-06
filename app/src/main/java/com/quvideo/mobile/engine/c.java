package com.quvideo.mobile.engine;

import com.quvideo.mobile.engine.e.a;

public class c {
    public static Long jj(String str) {
        a aup = a.aup();
        if (aup != null) {
            return aup.jj(str);
        }
        return 0L;
    }

    public static String g(Long l) {
        a aup = a.aup();
        return aup != null ? aup.g(l) : "";
    }

    public static String getTemplateExternalFile(long j, int i, int i2) {
        a aup = a.aup();
        return aup != null ? aup.getTemplateExternalFile(j, i, i2) : "";
    }
}