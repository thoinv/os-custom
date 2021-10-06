package com.quvideo.xiaoying.editorx.widget
        ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class SmallProgressView extends View {
    private RectF dLO = new RectF();
    private int dVE = 1000;
    private int gmF = 300;
    private float iOk = (getResources().getDisplayMetrics().density * 6.0f);
    private float iOl = (getResources().getDisplayMetrics().density * 2.0f);
    private float iOm = (getResources().getDisplayMetrics().density * 4.0f);
    private float iOn = (getResources().getDisplayMetrics().density * 2.0f);
    private float iOo = (getResources().getDisplayMetrics().density * 3.0f);
    private float iOp = (getResources().getDisplayMetrics().density * 4.0f);
    private float iOq = (getResources().getDisplayMetrics().density * 1.0f);
    private boolean iOr;
    private Paint paint = new Paint();

    public SmallProgressView(Context context) {
        super(context);
        this.paint.setColor(-1644826);
        this.paint.setAntiAlias(true);
    }

    public SmallProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint.setColor(-1644826);
        this.paint.setAntiAlias(true);
    }

    public SmallProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint.setColor(-1644826);
        this.paint.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.dLO.left = 0.0f;
        if (this.dVE != 0) {
            this.dLO.right = (float) ((getWidth() * this.gmF) / this.dVE);
            if (this.iOr) {
                this.dLO.top = this.iOl;
                this.dLO.bottom = this.iOm;
                RectF rectF = this.dLO;
                float f = this.iOn;
                canvas.drawRoundRect(rectF, f, f, this.paint);
            } else {
                this.dLO.top = this.iOo;
                this.dLO.bottom = this.iOp;
                RectF rectF2 = this.dLO;
                float f2 = this.iOq;
                canvas.drawRoundRect(rectF2, f2, f2, this.paint);
            }
            if (this.iOr) {
                canvas.drawCircle(this.dLO.right, (float) (getHeight() / 2), this.iOk / 2.0f, this.paint);
            }
        }
    }

    public void setTotalProgress(int i) {
        this.dVE = i;
        postInvalidate();
    }

    public void setCurProgress(int i) {
        this.gmF = i;
        postInvalidate();
    }

    public void setIsTouching(boolean z) {
        this.iOr = z;
        invalidate();
    }
}