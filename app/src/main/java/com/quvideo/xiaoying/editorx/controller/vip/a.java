package com.quvideo.xiaoying.editorx.controller.vip;

import android.content.Context;
import com.quvideo.xiaoying.module.iap.h;
import java.util.ArrayList;

public interface a {

    /* renamed from: com.quvideo.xiaoying.editorx.controller.vip.a$a  reason: collision with other inner class name */
    public interface AbstractC0486a {
        void bSH();
    }

    public interface b {
        void a(boolean z, ArrayList<h> arrayList);
    }

    public enum c {
        Gray,
        Gold,
        Title
    }

    void D(com.quvideo.mobile.engine.project.a aVar);

    void a(com.quvideo.mobile.engine.project.a aVar, com.quvideo.mobile.engine.m.b bVar);

    void a(com.quvideo.mobile.engine.project.a aVar, com.quvideo.xiaoying.editorx.controller.title.b bVar, boolean z);

    void a(h hVar, AbstractC0486a aVar);

    boolean a(Context context, b bVar, h... hVarArr);

    boolean a(h... hVarArr);

    void d(com.quvideo.xiaoying.editorx.board.c cVar);

    void di(String str, String str2);

    void e(com.quvideo.xiaoying.editorx.board.c cVar);

    boolean isVip();

    void pe(boolean z);
}