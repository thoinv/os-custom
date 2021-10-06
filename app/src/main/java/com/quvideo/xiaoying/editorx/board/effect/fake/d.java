package com.quvideo.xiaoying.editorx.board.effect.fake;

import android.view.MotionEvent;

public abstract class d {
    public c inF;
    public b inG;
    protected a inH;

    public static abstract class a {
        /* access modifiers changed from: package-private */
        public void a(b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void bTE() {
        }

        /* access modifiers changed from: package-private */
        public void bTF() {
        }

        /* access modifiers changed from: package-private */
        public float c(float f, float f2, boolean z) {
            return f;
        }

        /* access modifiers changed from: package-private */
        public void d(float f, float f2, boolean z) {
        }

        /* access modifiers changed from: package-private */
        public void g(float f, boolean z) {
        }
    }

    public enum b {
        LEFT_TOP,
        right_top,
        left_bottom,
        right_bottom,
        box,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    public enum c {
        Click,
        DRAG,
        Scale,
        Rotation,
        Rotation_Scale
    }

    public abstract boolean onTouchEvent(MotionEvent motionEvent);

    public void a(a aVar) {
        this.inH = aVar;
    }
}