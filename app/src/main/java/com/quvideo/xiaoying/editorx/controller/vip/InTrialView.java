package com.quvideo.xiaoying.editorx.controller.vip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.quvideo.xiaoying.common.utils.UtilsDensity;
import com.quvideo.xiaoying.editorx.controller.vip.a;

public class InTrialView extends ConstraintLayout {
    View ept;
    private a.c iFd = a.c.Gray;
    private int iFe = -13224394;
    private int iFf = -8355712;
    private Paint iFg;
    private a iFh;
    TextView iFi;
    private Rect rect = new Rect();

    public interface a {
        void onClick();
    }

    public InTrialView(Context context) {
        super(context);
        init();
    }

    public InTrialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public InTrialView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.editorx_trial, this);
        Paint paint = new Paint();
        this.iFg = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.iFg.setStrokeWidth((float) UtilsDensity.dip2px(getContext(), 2.0f));
        this.iFi = (TextView) findViewById(R.id.tv_trial_try);
        this.ept = findViewById(R.id.ll_trial_title);
        this.iFi.setOnClickListener(new c(this));
        this.ept.setOnClickListener(new d(this));
        setTrialType(this.iFd);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void fN(View view) {
        a aVar;
        if (this.iFd == a.c.Gold && (aVar = this.iFh) != null) {
            aVar.onClick();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void jp(View view) {
        a aVar = this.iFh;
        if (aVar != null) {
            aVar.onClick();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.rect.left = 0;
        this.rect.top = 0;
        this.rect.right = getWidth();
        this.rect.bottom = getHeight();
        this.rect.inset(((int) this.iFg.getStrokeWidth()) / 2, ((int) this.iFg.getStrokeWidth()) / 2);
        canvas.drawRect(this.rect, this.iFg);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.quvideo.xiaoying.editorx.controller.vip.InTrialView$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] iFk;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.quvideo.xiaoying.editorx.controller.vip.a$c[] r0 = com.quvideo.xiaoying.editorx.controller.vip.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.quvideo.xiaoying.editorx.controller.vip.InTrialView.AnonymousClass1.iFk = r0
                com.quvideo.xiaoying.editorx.controller.vip.a$c r1 = com.quvideo.xiaoying.editorx.controller.vip.a.c.Gray     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.quvideo.xiaoying.editorx.controller.vip.InTrialView.AnonymousClass1.iFk     // Catch:{ NoSuchFieldError -> 0x001d }
                com.quvideo.xiaoying.editorx.controller.vip.a$c r1 = com.quvideo.xiaoying.editorx.controller.vip.a.c.Gold     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.quvideo.xiaoying.editorx.controller.vip.InTrialView.AnonymousClass1.iFk     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.quvideo.xiaoying.editorx.controller.vip.a$c r1 = com.quvideo.xiaoying.editorx.controller.vip.a.c.Title     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.controller.vip.InTrialView.AnonymousClass1.<clinit>():void");
        }
    }

    public void setTrialType(a.c cVar) {
        this.iFd = cVar;
        int i = AnonymousClass1.iFk[cVar.ordinal()];
        if (i == 1) {
            this.iFe = -13224394;
            this.iFf = -8355712;
            this.iFi.setText(R.string.iap_vip_function_trying);
        } else if (i == 2) {
            this.iFe = -995443;
            this.iFf = -14737633;
            this.iFi.setText(R.string.xiaoying_str_vip_func_in_trial);
        }
        int i2 = AnonymousClass1.iFk[cVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setWillNotDraw(false);
            this.ept.setVisibility(8);
            this.iFi.setVisibility(0);
            this.iFi.setTextColor(this.iFf);
            this.iFi.setTextSize(2, 12.0f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.iFe);
            float[] fArr = new float[8];
            fArr[0] = (float) UtilsDensity.dip2px(getContext(), 4.0f);
            fArr[1] = fArr[0];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            gradientDrawable.setCornerRadii(fArr);
            this.iFi.setBackground(gradientDrawable);
            this.iFg.setColor(this.iFe);
        } else if (i2 == 3) {
            setWillNotDraw(true);
            this.ept.setVisibility(0);
            this.iFi.setVisibility(8);
        }
    }

    public void setListener(a aVar) {
        this.iFh = aVar;
    }
}