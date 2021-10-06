package com.quvideo.xiaoying.editorx.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SmallProgressTouchView extends View {
    private int dVE;
    private float iMn = (getResources().getDisplayMetrics().density * 15.0f);
    private a iMo;

    public interface a {
        void ET(int i);

        void su(int i);

        void xg(int i);
    }

    public SmallProgressTouchView(Context context) {
        super(context);
    }

    public SmallProgressTouchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmallProgressTouchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r6 != 3) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.quvideo.xiaoying.editorx.player.SmallProgressTouchView$a r0 = r5.iMo
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            float r0 = r6.getX()
            float r2 = r5.iMn
            float r0 = r0 - r2
            int r2 = r5.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r5.iMn
            float r4 = r4 * r3
            float r2 = r2 - r4
            float r0 = r0 / r2
            int r2 = r5.dVE
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = (int) r0
            if (r0 >= 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r0
        L_0x0024:
            int r0 = r5.dVE
            if (r1 <= r0) goto L_0x0029
            r1 = r0
        L_0x0029:
            int r6 = r6.getActionMasked()
            r0 = 1
            if (r6 == 0) goto L_0x0045
            if (r6 == r0) goto L_0x003f
            r2 = 2
            if (r6 == r2) goto L_0x0039
            r2 = 3
            if (r6 == r2) goto L_0x003f
            goto L_0x004a
        L_0x0039:
            com.quvideo.xiaoying.editorx.player.SmallProgressTouchView$a r6 = r5.iMo
            r6.su(r1)
            goto L_0x004a
        L_0x003f:
            com.quvideo.xiaoying.editorx.player.SmallProgressTouchView$a r6 = r5.iMo
            r6.xg(r1)
            goto L_0x004a
        L_0x0045:
            com.quvideo.xiaoying.editorx.player.SmallProgressTouchView$a r6 = r5.iMo
            r6.ET(r1)
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.player.SmallProgressTouchView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setTotalProgress(int i) {
        this.dVE = i;
    }

    public void setListener(a aVar) {
        this.iMo = aVar;
    }
}