package com.quvideo.xiaoying.editor.effects.customwatermark;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.example.myapplication.R;
import com.quvideo.mobile.engine.model.effect.EffectPosInfo;
import com.quvideo.mobile.engine.model.effect.ScaleRotateViewState;
import com.quvideo.xiaoying.common.LogUtilsV2;
import com.quvideo.xiaoying.editor.widget.scalerotate.a.b;
import java.io.IOException;

public class CustomWaterMarkView extends RelativeLayout {
    private RectF gWY;
    private b gWZ;
    private Drawable gXa;
    private Drawable gXb;
    private int gXc;
    private int gXd;
    private a gXe;

    public interface a {
        void bxG();

        void bxH();
    }

    public CustomWaterMarkView(Context context) {
        this(context, null);
    }

    public CustomWaterMarkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomWaterMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.gWY = new RectF();
        Drawable drawable = getResources().getDrawable(R.drawable.editor_btn_watermark_delete);
        this.gXb = drawable;
        this.gXc = drawable.getIntrinsicWidth() / 2;
        this.gXd = this.gXb.getIntrinsicHeight() / 2;
    }

    public void j(ScaleRotateViewState scaleRotateViewState) {
        if (scaleRotateViewState != null && scaleRotateViewState.mEffectPosInfo != null) {
            try {
                this.gXa = new BitmapDrawable(getResources(), this.gWZ.o(scaleRotateViewState));
                EffectPosInfo effectPosInfo = scaleRotateViewState.mEffectPosInfo;
                float f = effectPosInfo.centerPosX - (effectPosInfo.width / 2.0f);
                float f2 = effectPosInfo.centerPosX + (effectPosInfo.width / 2.0f);
                float f3 = effectPosInfo.centerPosY - (effectPosInfo.height / 2.0f);
                float f4 = effectPosInfo.centerPosY + (effectPosInfo.height / 2.0f);
                LogUtilsV2.d("WatermarkProblem-------> : CustomWaterMarkView show position :  , left = " + f + " , top = " + f3 + " , right = " + f2 + " , bottom = " + f4);
                if (0.0f == f && 0.0f == f3 && 0.0f == f2 && 0.0f == f4 && this.gXe != null) {
                    this.gXe.bxH();
                    com.quvideo.xiaoying.editor.common.a.a.X(getContext(), "show", "all pos is zero");
                }
                this.gWY.set(f, f3, f2, f4);
                invalidate();
            } catch (IOException e) {
                LogUtilsV2.d("WatermarkProblem-------> : CustomWaterMarkView show exception = " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.gWY.contains(motionEvent.getX(), motionEvent.getY()) || this.gXe == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            this.gXe.bxG();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.gXa != null) {
            canvas.save();
            this.gXa.setBounds((int) this.gWY.left, (int) this.gWY.top, (int) this.gWY.right, (int) this.gWY.bottom);
            this.gXa.draw(canvas);
            a(canvas, this.gWY);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    private void a(Canvas canvas, RectF rectF) {
        int i = (int) rectF.right;
        int i2 = (int) rectF.top;
        Drawable drawable = this.gXb;
        if (drawable != null) {
            int i3 = this.gXc;
            int i4 = this.gXd;
            drawable.setBounds(i - i3, i2 - i4, i + i3, i2 + i4);
            this.gXb.draw(canvas);
        }
    }

    public void bxF() {
        this.gXa = null;
    }

    public void setCustomWaterMarkViewListener(a aVar) {
        this.gXe = aVar;
    }
}
