package com.quvideo.xiaoying.editorx.board;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.quvideo.xiaoying.editorx.controller.d;
import com.quvideo.xiaoying.editorx.widget.h;
import com.quvideo.xiaoying.router.editor.EditorIntentInfo2;
import com.quvideo.xiaoying.router.editor.studio.BoardType;
import io.reactivex.b.a;
import java.util.HashMap;

public abstract class b {
    protected Context context;
    protected a gmN = new a();
    protected d hSU;
    protected c hTc;
    protected com.quvideo.xiaoying.editorx.board.d.a hTd;
    protected com.quvideo.mobile.engine.project.a hTe;
    protected h hTf;
    protected com.quvideo.xiaoying.editorx.controller.c.a hTg;
    protected com.quvideo.xiaoying.editorx.board.e.b hTh;
    protected com.quvideo.xiaoying.editorx.controller.title.b hTi;
    protected com.quvideo.xiaoying.editorx.controller.vip.a hTj;
    protected com.quvideo.xiaoying.editorx.controller.b.a hTk;
    protected com.quvideo.xiaoying.editorx.controller.base.b hTl;
    protected com.quvideo.xiaoying.editorx.controller.e.a hTm;
    protected com.quvideo.xiaoying.editorx.board.kit.a.a hTn;
    protected EditorIntentInfo2 hTo;
    protected boolean hTp;
    protected com.quvideo.xiaoying.editorx.board.g.a iTimelineApi;
    protected boolean isActive;

    public void a(BoardType boardType, Object obj) {
    }

    public boolean bNa() {
        return true;
    }

    public View bNb() {
        return null;
    }

    public void bt(Object obj) {
    }

    public void bu(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void bw(Object obj) {
    }

    public void c(EditorIntentInfo2 editorIntentInfo2) {
    }

    public abstract View getView();

    public void onActivityPause() {
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onActivityResume() {
    }

    public boolean onBackPressed() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
    }

    public b(HashMap<Class, Object> hashMap) {
        this.context = (Context) hashMap.get(Context.class);
        this.hTc = (c) hashMap.get(c.class);
        this.iTimelineApi = (com.quvideo.xiaoying.editorx.board.g.a) hashMap.get(com.quvideo.xiaoying.editorx.board.g.a.class);
        this.hTd = (com.quvideo.xiaoying.editorx.board.d.a) hashMap.get(com.quvideo.xiaoying.editorx.board.d.a.class);
        this.hTf = (h) hashMap.get(h.class);
        this.hTg = (com.quvideo.xiaoying.editorx.controller.c.a) hashMap.get(com.quvideo.xiaoying.editorx.controller.c.a.class);
        this.hTh = (com.quvideo.xiaoying.editorx.board.e.b) hashMap.get(com.quvideo.xiaoying.editorx.board.e.b.class);
        this.hTi = (com.quvideo.xiaoying.editorx.controller.title.b) hashMap.get(com.quvideo.xiaoying.editorx.controller.title.b.class);
        this.hTj = (com.quvideo.xiaoying.editorx.controller.vip.a) hashMap.get(com.quvideo.xiaoying.editorx.controller.vip.a.class);
        this.hTk = (com.quvideo.xiaoying.editorx.controller.b.a) hashMap.get(com.quvideo.xiaoying.editorx.controller.b.a.class);
        this.hTl = (com.quvideo.xiaoying.editorx.controller.base.b) hashMap.get(com.quvideo.xiaoying.editorx.controller.base.b.class);
        this.hTm = (com.quvideo.xiaoying.editorx.controller.e.a) hashMap.get(com.quvideo.xiaoying.editorx.controller.e.a.class);
        this.hTn = (com.quvideo.xiaoying.editorx.board.kit.a.a) hashMap.get(com.quvideo.xiaoying.editorx.board.kit.a.a.class);
        this.hSU = (d) hashMap.get(d.class);
        this.hTo = (EditorIntentInfo2) hashMap.get(EditorIntentInfo2.class);
        if (this.context == null || this.hTc == null || this.iTimelineApi == null || this.hTd == null || this.hTf == null || this.hTg == null) {
            throw new IllegalArgumentException("组件不能出错");
        }
    }

    public Activity getActivity() {
        return (Activity) this.context;
    }

    public final void bMY() {
        this.hTp = true;
        onActivityResume();
    }

    public final void resume() {
        this.isActive = true;
        onResume();
    }

    public final void bv(Object obj) {
        this.isActive = false;
        bw(obj);
    }

    public final void bMZ() {
        this.hTp = false;
        onActivityPause();
    }

    public void onDestroy() {
        a aVar = this.gmN;
        if (aVar != null) {
            aVar.clear();
            this.gmN = null;
        }
    }

    public void e(com.quvideo.mobile.engine.project.a aVar) {
        this.hTe = aVar;
    }

    public void f(com.quvideo.mobile.engine.project.a aVar) {
        this.hTe = aVar;
    }

    public void bNc() {
        com.quvideo.xiaoying.editorx.controller.title.b bVar = this.hTi;
        if (bVar != null) {
            bVar.setVisible(true);
        }
    }

    public void bNd() {
        com.quvideo.xiaoying.editorx.controller.title.b bVar = this.hTi;
        if (bVar != null) {
            bVar.setVisible(false);
        }
    }
}