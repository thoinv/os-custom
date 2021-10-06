package com.quvideo.xiaoying.editor.common.a;

import android.content.Context;
import android.text.TextUtils;
import com.quvideo.mobile.engine.project.c;
import com.quvideo.xiaoying.common.UserBehaviorLog;
import java.util.HashMap;
import java.util.List;

public class a {
    public static void U(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("from", str);
            hashMap.put("mode", str2);
            UserBehaviorLog.onKVEvent(context, "Preview_Enter", hashMap);
        }
    }

    public static void V(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("how", str);
        hashMap.put("from", str2);
        UserBehaviorLog.onKVEvent(context, "Preview_Exit", hashMap);
    }

    public static void W(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("from", str2);
        UserBehaviorLog.onKVEvent(context, "Preview_Exit_Dialog", hashMap);
    }

    public static void bX(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        UserBehaviorLog.onKVEvent(context, "VE_Video_Edit_Tools_Click", hashMap);
    }

    public static void bY(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        UserBehaviorLog.onKVEvent(context, "VE_Video_Effects_Tools_Click", hashMap);
    }

    public static void bZ(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("tool", str);
            UserBehaviorLog.onKVEvent(context, "VE_Mutiple_Mode_Tools_Use", hashMap);
        }
    }

    public static void ca(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("tools", str);
            UserBehaviorLog.onKVEvent(context, "VE_Tools_Click", hashMap);
        }
    }

    public static void I(Context context, boolean z) {
        List<com.quvideo.mobile.engine.project.db.entity.a> avH = c.avF().avH();
        int size = avH != null ? avH.size() : 0;
        HashMap hashMap = new HashMap();
        if (size < 6) {
            hashMap.put("draft", "" + size);
        } else if (size < 11) {
            hashMap.put("draft", "6-10");
        } else if (size < 21) {
            hashMap.put("draft", "11-20");
        } else {
            hashMap.put("draft", ">20");
        }
        hashMap.put("mode", z ? "list" : "grid");
        UserBehaviorLog.onKVEvent(context, "Home_Studio", hashMap);
    }

    public static void jr(Context context) {
        if (context != null) {
            UserBehaviorLog.onKVEvent(context, "DEV_Event_Clip_Trim_Pos_Invalid", new HashMap());
        }
    }

    public static void X(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("key", str);
            hashMap.put("value", str2);
            UserBehaviorLog.onKVEvent(context, "VE_Watermark_Position_Zero", hashMap);
        }
    }
}