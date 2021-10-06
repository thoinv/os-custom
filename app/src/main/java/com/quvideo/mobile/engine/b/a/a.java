package com.quvideo.mobile.engine.b.a;

import android.text.TextUtils;
import com.quvideo.mobile.engine.k.h;
import com.quvideo.mobile.engine.k.j;
import java.util.List;

public class a {
    public static String auJ() {
        return "ClipID:" + System.currentTimeMillis() + j.ci(11, 99);
    }

    public static String auK() {
        return "EffectID:" + System.currentTimeMillis() + j.ci(11, 99);
    }

    public static String aE(List<String> list) {
        String str = "EffectID:" + System.currentTimeMillis() + j.ci(11, 99999);
        if (!(list == null || list.size() == 0)) {
            for (String str2 : list) {
                if (str.equals(str2)) {
                    return aE(list);
                }
            }
        }
        return str;
    }

    public static long jn(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("ClipID:")) {
            return 0;
        }
        return h.decodeLong(str.substring(7));
    }

    public static long jo(String str) {
        if (str.startsWith("EffectID:")) {
            return h.decodeLong(str.substring(9));
        }
        return 0;
    }
}