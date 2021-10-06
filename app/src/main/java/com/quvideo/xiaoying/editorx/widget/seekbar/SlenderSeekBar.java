package com.quvideo.xiaoying.editorx.widget.seekbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;

import com.example.myapplication.R;

import kotlin.e.b.g;
import kotlin.e.b.l;

public final class SlenderSeekBar extends View {
    public static final b iTe = new b(null);
    private int bgColor;
    private float cHT;
    private int ckM;
    private boolean cvL;
    private float iID;
    private final RectF iQA;
    private AttributeSet iSK;
    private Paint iSL;
    private float iSM;
    private boolean iSN;
    private final long iSO;
    private final long iSP;
    private final long iSQ;
    private final long iSR;
    private final float iSS;
    private final float iST;
    private final float iSU;
    private final float iSV;
    private float iSW;
    private float iSX;
    private float iSY;
    private float iSZ;
    private int iSj;
    private int iSk;
    private int iSm;
    private final RectF iSn;
    private boolean iSq;
    private final PointF iTa;
    private boolean iTb;
    private Vibrator iTc;
    private a iTd;
    private int iaM;
    private float progress;
    private int progressColor;
    private int thumbColor;
    private int thumbRadius;
    private int type;

    public interface a {
        void a(SlenderSeekBar slenderSeekBar, int i);

        void xJ(int i);

        void xs(int i);
    }

    public SlenderSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.progress = 50.0f;
        this.iaM = 100;
        this.iSO = 4281545523L;
        this.iSP = 4293323248L;
        this.iSQ = 4293323248L;
        this.iSR = 4293323248L;
        this.iSS = (float) com.quvideo.xiaoying.xyui.h.a.dip2px(context, 2.0f);
        this.iST = (float) com.quvideo.xiaoying.xyui.h.a.dip2px(context, 16.0f);
        this.iSU = (float) com.quvideo.xiaoying.xyui.h.a.dip2px(context, 2.0f);
        this.iQA = new RectF();
        this.iSn = new RectF();
        this.iTa = new PointF();
        this.iID = -1.0f;
        this.cHT = -1.0f;
        @SuppressLint("WrongConstant") Object systemService = getContext().getSystemService("vibrator");
        if (systemService != null) {
            this.iTc = (Vibrator) systemService;
            this.iSK = attributeSet;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            l.p(viewConfiguration, "configuration");
            this.ckM = viewConfiguration.getScaledTouchSlop() / 2;
            caJ();
            bRg();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public final AttributeSet getMAttrs() {
        return this.iSK;
    }

    public final void setMAttrs(AttributeSet attributeSet) {
        this.iSK = attributeSet;
    }

    public final Paint getSuperPaint() {
        return this.iSL;
    }

    public final void setSuperPaint(Paint paint) {
        this.iSL = paint;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final void setProgress(float f) {
        this.progress = f;
        invalidate();
    }

    public final int getMaxProgress() {
        return this.iaM;
    }

    public final void setMaxProgress(int i) {
        this.iaM = i;
        invalidate();
    }

    public final boolean getShakeEnable() {
        return this.iSN;
    }

    public final void setShakeEnable(boolean z) {
        this.iSN = z;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final a getCallback() {
        return this.iTd;
    }

    public final void setCallback(a aVar) {
        this.iTd = aVar;
    }

    public SlenderSeekBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        this.iSK = attributeSet;
    }

    public SlenderSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.iSK = attributeSet;
    }

    private final void caJ() {
        if (this.iSK != null && getContext() != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.iSK, R.styleable.SlenderSeekBar);
            l.p(obtainStyledAttributes, "context.obtainStyledAttr…styleable.SlenderSeekBar)");
            setProgress(obtainStyledAttributes.getFloat(R.styleable.SlenderSeekBar_ssb_progress, 0.0f));
            setMaxProgress(obtainStyledAttributes.getInteger(R.styleable.SlenderSeekBar_ssb_max_progress, 100));
            this.bgColor = obtainStyledAttributes.getColor(R.styleable.SlenderSeekBar_ssb_bg_color, (int) this.iSO);
            this.iSj = obtainStyledAttributes.getColor(R.styleable.SlenderSeekBar_ssb_point_color, (int) this.iSR);
            this.iSM = obtainStyledAttributes.getFloat(R.styleable.SlenderSeekBar_ssb_point_progress, this.iSV);
            this.iSm = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SlenderSeekBar_ssb_point_radius, (int) this.iSU);
            this.progressColor = obtainStyledAttributes.getColor(R.styleable.SlenderSeekBar_ssb_progress_color, (int) this.iSP);
            this.thumbColor = obtainStyledAttributes.getColor(R.styleable.SlenderSeekBar_ssb_thumb_color, (int) this.iSQ);
            this.iSk = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SlenderSeekBar_ssb_bg_radius, (int) this.iSS);
            this.thumbRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SlenderSeekBar_ssb_thumb_radius, (int) this.iST);
            boolean z = false;
            this.type = obtainStyledAttributes.getInteger(R.styleable.SlenderSeekBar_ssb_type, 0);
            if (obtainStyledAttributes.getInteger(R.styleable.SlenderSeekBar_ssb_shake_enable, 0) == 1) {
                z = true;
            }
            this.iSN = z;
        }
    }

    private final void bRg() {
        Paint paint = new Paint();
        this.iSL = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
        }
        Paint paint2 = this.iSL;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (1 != getLayoutDirection()) {
            z = false;
        }
        this.cvL = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r6 != 3) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final PointF getPointLocation() {
        if (1 == this.type) {
            return getReversePointLocation();
        }
        return getNormalPointLocation();
    }

    private final PointF getNormalPointLocation() {
        if (this.cvL) {
            this.iTa.y = (float) (getPaddingTop() + (this.iSk / 2));
            this.iTa.x = ((float) ((getWidth() - getPaddingRight()) - (this.iSk / 2))) - di(this.progress);
        } else {
            this.iTa.y = (float) (getPaddingTop() + (this.iSk / 2));
            this.iTa.x = ((float) (getPaddingLeft() + (this.iSk / 2))) + di(this.progress);
        }
        return this.iTa;
    }

    private final PointF getReversePointLocation() {
        this.iTa.y = (float) (getHeight() / 2);
        this.iTa.x = ((float) (getWidth() / 2)) + (((this.progress * 1.0f) / ((float) this.iaM)) * ((float) ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2) - (this.iSk / 2))));
        return this.iTa;
    }

    private final void df(float f) {
        if (1 == this.type) {
            dh(f);
        } else {
            dg(f);
        }
    }

    private final void dg(float f) {
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (this.cvL) {
            float width = (((float) ((getWidth() - getPaddingRight()) - (this.iSk / 2))) - f) / ((float) (((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.thumbRadius));
            if (width >= ((float) 0)) {
                f3 = width;
            }
            if (f3 <= ((float) 1)) {
                f2 = f3;
            }
            setProgress(f2 * ((float) this.iaM));
            return;
        }
        float paddingLeft = ((f - ((float) getPaddingLeft())) - ((float) (this.iSk / 2))) / ((float) (((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.thumbRadius));
        if (paddingLeft >= ((float) 0)) {
            f3 = paddingLeft;
        }
        if (f3 <= ((float) 1)) {
            f2 = f3;
        }
        setProgress(f2 * ((float) this.iaM));
    }

    private final void dh(float f) {
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (f < ((float) (getWidth() / 2))) {
            float width = (((float) (getWidth() / 2)) - f) / ((float) ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.thumbRadius) / 2));
            if (width >= ((float) 0)) {
                f3 = width;
            }
            if (f3 <= ((float) 1)) {
                f2 = f3;
            }
            setProgress((-f2) * ((float) this.iaM));
            return;
        }
        float width2 = (f - ((float) (getWidth() / 2))) / ((float) ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.thumbRadius) / 2));
        if (width2 >= ((float) 0)) {
            f3 = width2;
        }
        if (f3 <= ((float) 1)) {
            f2 = f3;
        }
        setProgress(f2 * ((float) this.iaM));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        az(canvas);
        if (1 == this.type) {
            aE(canvas);
        } else {
            aD(canvas);
        }
    }

    private final void aD(Canvas canvas) {
        aF(canvas);
        aH(canvas);
        aJ(canvas);
    }

    private final void aE(Canvas canvas) {
        aG(canvas);
        aI(canvas);
        aK(canvas);
    }

    private final void az(Canvas canvas) {
        Paint paint = this.iSL;
        if (paint != null) {
            paint.setColor(this.bgColor);
        }
        this.iQA.left = (float) (getPaddingLeft() + (this.thumbRadius / 2));
        this.iQA.top = (float) ((getHeight() - this.iSk) / 2);
        this.iQA.right = (float) ((getWidth() - (this.thumbRadius / 2)) - getPaddingRight());
        this.iQA.bottom = (float) ((getHeight() + this.iSk) / 2);
        Paint paint2 = this.iSL;
        if (paint2 != null && canvas != null) {
            RectF rectF = this.iQA;
            int i = this.iSk;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint2);
        }
    }

    private final float di(float f) {
        return ((float) (((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.thumbRadius)) * (f / ((float) this.iaM));
    }

    private final float dj(float f) {
        return ((float) ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.thumbRadius) / 2)) * (f / ((float) this.iaM));
    }

    private final void aF(Canvas canvas) {
        Paint paint = this.iSL;
        if (paint != null) {
            paint.setColor(this.progressColor);
        }
        if (this.cvL) {
            this.iSn.top = (float) ((getHeight() - this.iSk) / 2);
            this.iSn.right = (float) ((getWidth() - (this.thumbRadius / 2)) - getPaddingRight());
            RectF rectF = this.iSn;
            rectF.left = rectF.right - di(this.progress);
            this.iSn.bottom = (float) ((getHeight() + this.iSk) / 2);
        } else {
            this.iSn.left = (float) (getPaddingLeft() + (this.thumbRadius / 2));
            this.iSn.top = (float) ((getHeight() - this.iSk) / 2);
            RectF rectF2 = this.iSn;
            rectF2.right = rectF2.left + di(this.progress);
            this.iSn.bottom = (float) ((getHeight() + this.iSk) / 2);
        }
        Paint paint2 = this.iSL;
        if (paint2 != null && canvas != null) {
            RectF rectF3 = this.iSn;
            int i = this.iSk;
            canvas.drawRoundRect(rectF3, (float) i, (float) i, paint2);
        }
    }

    private final void aG(Canvas canvas) {
        Paint paint = this.iSL;
        if (paint != null) {
            paint.setColor(this.progressColor);
        }
        if (this.progress < ((float) 0)) {
            this.iSn.top = (float) ((getHeight() - this.iSk) / 2);
            this.iSn.right = (float) (getWidth() / 2);
            RectF rectF = this.iSn;
            rectF.left = rectF.right - dj(Math.abs(this.progress));
            this.iSn.bottom = (float) ((getHeight() + this.iSk) / 2);
        } else {
            this.iSn.left = (float) (getWidth() / 2);
            this.iSn.top = (float) ((getHeight() - this.iSk) / 2);
            RectF rectF2 = this.iSn;
            rectF2.right = rectF2.left + dj(Math.abs(this.progress));
            this.iSn.bottom = (float) ((getHeight() + this.iSk) / 2);
        }
        Paint paint2 = this.iSL;
        if (paint2 != null && canvas != null) {
            RectF rectF3 = this.iSn;
            int i = this.iSk;
            canvas.drawRoundRect(rectF3, (float) i, (float) i, paint2);
        }
    }

    private final void aH(Canvas canvas) {
        Paint paint = this.iSL;
        if (paint != null) {
            paint.setColor(this.thumbColor);
        }
        if (this.cvL) {
            this.iSW = this.iSn.left;
            this.iSX = (float) (this.thumbRadius / 2);
        } else {
            this.iSW = this.iSn.right;
            this.iSX = (float) (this.thumbRadius / 2);
        }
        Paint paint2 = this.iSL;
        if (paint2 != null && canvas != null) {
            canvas.drawCircle(this.iSW, this.iSX, ((float) this.thumbRadius) / ((float) 2), paint2);
        }
    }

    private final void aI(Canvas canvas) {
        Paint paint = this.iSL;
        if (paint != null) {
            paint.setColor(this.thumbColor);
        }
        if (this.progress < ((float) 0)) {
            this.iSW = ((float) (getWidth() / 2)) - dj(Math.abs(this.progress));
            this.iSX = (float) (getHeight() / 2);
        } else {
            this.iSW = ((float) (getWidth() / 2)) + dj(Math.abs(this.progress));
            this.iSX = (float) (getHeight() / 2);
        }
        Paint paint2 = this.iSL;
        if (paint2 != null && canvas != null) {
            canvas.drawCircle(this.iSW, this.iSX, ((float) this.thumbRadius) / ((float) 2), paint2);
        }
    }

    private final void aJ(Canvas canvas) {
        if (this.iSM > ((float) 0)) {
            Paint paint = this.iSL;
            if (paint != null) {
                paint.setColor(this.iSj);
            }
            if (this.cvL) {
                this.iSY = ((float) (getWidth() - (this.thumbRadius / 2))) - di(Math.abs(this.iSM));
                this.iSZ = (float) (getHeight() / 2);
            } else {
                this.iSY = ((float) (this.thumbRadius / 2)) + di(Math.abs(this.iSM));
                this.iSZ = (float) (getHeight() / 2);
            }
            Paint paint2 = this.iSL;
            if (paint2 != null && canvas != null) {
                canvas.drawCircle(this.iSY, this.iSZ, ((float) this.iSm) / ((float) 2), paint2);
            }
        }
    }

    private final void aK(Canvas canvas) {
        float f = (float) 0;
        if (this.iSM > f) {
            Paint paint = this.iSL;
            if (paint != null) {
                paint.setColor(this.iSj);
            }
            if (this.iSM < f) {
                this.iSY = ((float) (getWidth() / 2)) - dj(Math.abs(this.iSM));
                this.iSZ = (float) (getHeight() / 2);
            } else {
                this.iSY = ((float) (getWidth() / 2)) + dj(Math.abs(this.iSM));
                this.iSZ = (float) (getHeight() / 2);
            }
            Paint paint2 = this.iSL;
            if (paint2 != null && canvas != null) {
                canvas.drawCircle(this.iSY, this.iSZ, ((float) this.iSm) / ((float) 2), paint2);
            }
        }
    }

    private final void caK() {
        Vibrator vibrator = this.iTc;
        if (vibrator != null) {
            vibrator.vibrate(50);
        }
    }

    private final void bsF() {
        a aVar = this.iTd;
        if (aVar != null) {
            aVar.xJ((int) this.progress);
        }
    }

    private final void caL() {
        caM();
        a aVar = this.iTd;
        if (aVar != null) {
            aVar.a(this, (int) this.progress);
        }
    }

    private final void caM() {
        if (this.iSN) {
            boolean z = true;
            if (!this.iTb && Math.abs(this.progress - this.iSM) <= ((float) 1)) {
                this.iTb = true;
                caK();
            }
            if (Math.abs(this.progress - this.iSM) > ((float) 1)) {
                z = false;
            }
            this.iTb = z;
        }
    }

    private final void caN() {
        this.iTb = false;
        a aVar = this.iTd;
        if (aVar != null) {
            aVar.xs((int) this.progress);
        }
    }
}