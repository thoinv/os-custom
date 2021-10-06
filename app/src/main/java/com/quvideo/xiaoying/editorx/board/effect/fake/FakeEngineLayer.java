package com.quvideo.xiaoying.editorx.board.effect.fake;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.quvideo.mobile.engine.model.PIPRegionControlModel;
import com.quvideo.mobile.engine.model.effect.EffectPosInfo;
import com.quvideo.xiaoying.editorx.board.d.a;
import com.quvideo.xiaoying.editorx.board.effect.fake.d;
import com.quvideo.xiaoying.supertimeline.util.b;
import java.util.List;

public class FakeEngineLayer extends View implements com.quvideo.xiaoying.editorx.board.d.a {
    private int cCt;
    private ValueAnimator czr;
    private int dVE;
    private a.h hYT;
    private Rect ikM;
    private float ikN;
    private float ikO;
    private float ikP;
    private float ikQ;
    private float ikR;
    private float ikS;
    private float ikT;
    private float ikU;
    private a.f ikV;
    private float[] ikW;
    private float[] ikX;
    private Matrix ikY;
    private a ikZ;
    private PointF ilA;
    private PointF ilB;
    private Paint ilC;
    private Paint ilD;
    private float ilE;
    private float ilF;
    private float ilG;
    private Bitmap ilH;
    private Bitmap ilI;
    private Matrix ilJ;
    private a.AbstractC0470a ilK;
    private EffectPosInfo ilL;
    private boolean ilM;
    private RectF ilN;
    private a.d ilO;
    private a.e ilP;
    private a.c ilQ;
    private String ilR;
    private String ilS;
    private int ilT;
    private int ilU;
    private int ilV;
    private Paint ilW;
    private Paint ilX;
    private ValueAnimator ilY;
    private float ilZ;
    private a ila;
    private a ilb;
    private a ilc;
    private a ild;
    private a ile;
    private a ilf;
    private a ilg;
    private Paint ilh;
    private float ili;
    private RectF ilj;
    private final float ilk;
    private final Paint ill;
    private final Paint ilm;
    private Paint iln;
    private EffectPosInfo ilo;
    private Paint ilp;
    private Paint ilq;
    private Paint ilr;
    private float ils;
    private Paint ilt;
    private float ilu;
    private float ilv;
    private Bitmap ilw;
    private Bitmap ilx;
    private PointF ily;
    private int ilz;
    private int imA;
    private int imB;
    private float imC;
    private float imD;
    private Runnable imE;
    private a imF;
    private a.b imG;
    List<PIPRegionControlModel> imH;
    a.g imI;
    int imJ;
    private float ima;
    private Runnable imb;
    private Paint imc;
    private RectF imd;
    private ArrayMap<d.b, a> ime;
    private d imf;
    private int img;
    private int imh;
    private int imi;
    private int imj;
    private boolean imk;
    private float iml;
    private float imm;
    private float imn;
    private float imo;
    private boolean imp;
    private int imq;
    private int imr;
    private boolean ims;
    private boolean imt;
    private float imu;
    private float imv;
    private int imw;
    private int imx;
    private int imy;
    private int imz;
    private Matrix matrix;
    private RectF rectF;

    public interface a {
        int bRL();

        int getCurProgress();

        void w(int i, int i2, boolean z);
    }

    public void setSize(Rect rect) {
        this.ikM = rect;
        this.ikT = (float) (rect.left + (rect.width() / 2));
        this.ikU = (float) (rect.top + (rect.height() / 2));
        float f = 0.0f;
        switch (AnonymousClass5.imL[this.ikV.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                f = ((float) (rect.width() > rect.height() ? rect.height() : rect.width())) * 0.04f;
                break;
        }
        this.ikP = ((float) rect.left) + f;
        this.ikQ = ((float) rect.right) - f;
        this.ikR = ((float) rect.top) + f;
        this.ikS = ((float) rect.bottom) - f;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] imL;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 205
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass5.<clinit>():void");
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setColorTripLocation(float f, float f2) {
        this.ily.x = f;
        this.ily.y = f2;
        invalidate();
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setColorTripColor(int i) {
        this.ilz = i;
        invalidate();
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public PointF a(EffectPosInfo effectPosInfo, float f, float f2) {
        float width = ((effectPosInfo.centerPosX / 10000.0f) * ((float) this.ikM.width())) + ((float) this.ikM.left);
        float height = ((effectPosInfo.centerPosY / 10000.0f) * ((float) this.ikM.height())) + ((float) this.ikM.top);
        float width2 = (effectPosInfo.width / 10000.0f) * ((float) this.ikM.width());
        float height2 = (effectPosInfo.height / 10000.0f) * ((float) this.ikM.height());
        PointF pointF = new PointF();
        pointF.x = (f * width2) + width;
        pointF.y = (f2 * height2) + height;
        PointF pointF2 = new PointF();
        pointF2.x = width;
        pointF2.y = height;
        float f3 = pointF.x;
        float f4 = pointF.y;
        PointF pointF3 = new PointF();
        float width3 = ((effectPosInfo.getRectArea().left / 10000.0f) * ((float) this.ikM.width())) + ((float) this.ikM.left);
        float height3 = ((effectPosInfo.getRectArea().top / 10000.0f) * ((float) this.ikM.height())) + ((float) this.ikM.top);
        pointF3.x = ((f3 - width3) * 10000.0f) / ((effectPosInfo.width / 10000.0f) * ((float) this.ikM.width()));
        pointF3.y = ((f4 - height3) * 10000.0f) / ((effectPosInfo.height / 10000.0f) * ((float) this.ikM.height()));
        return pointF3;
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setColorTripListener(a.AbstractC0470a aVar) {
        this.ilK = aVar;
    }

    public FakeEngineLayer(Context context) {
        super(context);
        this.ikM = new Rect();
        this.ikV = a.f.NULL;
        this.ikW = new float[12];
        this.ikX = new float[12];
        this.ikY = new Matrix();
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_flip_icon);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_delete_icon);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_scale_icon);
        this.ikZ = new a(decodeResource, d.b.right_bottom, d.c.Click);
        this.ila = new a(decodeResource2, d.b.right_top, d.c.Click);
        this.ilb = new a(decodeResource3, d.b.right_bottom, d.c.Rotation_Scale);
        this.ilc = new a(decodeResource2, d.b.right_bottom, d.c.Click);
        this.ikZ.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass1 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.j(FakeEngineLayer.this.ilo);
                }
            }
        });
        this.ila.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass6 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo);
                }
            }
        });
        this.ilb.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass7 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void g(float f, boolean z) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    float degrees = (float) (((double) f) - Math.toDegrees(Math.atan((double) (FakeEngineLayer.this.getHeightForVideoWindow() / FakeEngineLayer.this.getWidthForVideoWindow()))));
                    if (!z) {
                        FakeEngineLayer.this.ilo.degree = (float) (Math.round(degrees / 5.0f) * 5);
                    }
                    FakeEngineLayer.this.ilO.d(FakeEngineLayer.this.ilo, z, FakeEngineLayer.this.bTC());
                    FakeEngineLayer.this.invalidate();
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public float c(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo == null || FakeEngineLayer.this.ilO == null) {
                    return f;
                }
                float b2 = FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo, FakeEngineLayer.this.ap(f, f2), f2);
                float f3 = b2 / f2;
                FakeEngineLayer.this.ilo.width *= f3;
                FakeEngineLayer.this.ilo.height *= f3;
                FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo, z, FakeEngineLayer.this.bTC());
                FakeEngineLayer.this.invalidate();
                return b2;
            }
        });
        this.ilc.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass8 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilM && FakeEngineLayer.this.hYT != null) {
                    FakeEngineLayer.this.hYT.bPS();
                }
            }
        });
        Bitmap decodeResource4 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_mosaic);
        Matrix matrix2 = new Matrix();
        matrix2.postRotate(-90.0f);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        matrix2.reset();
        matrix2.postRotate(90.0f);
        Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        matrix2.reset();
        matrix2.postRotate(180.0f);
        Bitmap createBitmap3 = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        this.ild = new a(createBitmap, d.b.LEFT, d.c.DRAG);
        this.ile = new a(decodeResource4, d.b.TOP, d.c.DRAG);
        this.ilf = new a(createBitmap2, d.b.RIGHT, d.c.DRAG);
        this.ilg = new a(createBitmap3, d.b.BOTTOM, d.c.DRAG);
        this.ild.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass9 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[11] = (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[7]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[6]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[7]) / (f - FakeEngineLayer.this.ikW[6]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[3] - FakeEngineLayer.this.ikW[7]) / (FakeEngineLayer.this.ikW[2] - FakeEngineLayer.this.ikW[6])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(abs / widthForVideoWindow, 1.0f, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float width = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float f5 = FakeEngineLayer.this.ilo.height;
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width2 = 10000 / FakeEngineLayer.this.ikM.width();
                    int height = 10000 / FakeEngineLayer.this.ikM.height();
                    float width3 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height2 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width3;
                    FakeEngineLayer.this.ilo.centerPosY = height2;
                    FakeEngineLayer.this.ilo.width = width;
                    FakeEngineLayer.this.ilo.height = f5;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilf.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass10 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[11] = (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[5]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[4]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[5]) / (f - FakeEngineLayer.this.ikW[4]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[1] - FakeEngineLayer.this.ikW[5]) / (FakeEngineLayer.this.ikW[0] - FakeEngineLayer.this.ikW[4])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(abs / widthForVideoWindow, 1.0f, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float width = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float f5 = FakeEngineLayer.this.ilo.height;
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width2 = 10000 / FakeEngineLayer.this.ikM.width();
                    int height = 10000 / FakeEngineLayer.this.ikM.height();
                    float width3 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height2 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width3;
                    FakeEngineLayer.this.ilo.centerPosY = height2;
                    FakeEngineLayer.this.ilo.width = width;
                    FakeEngineLayer.this.ilo.height = f5;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ile.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass11 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f;
                    FakeEngineLayer.this.ikX[11] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[7]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[6]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[7]) / (f - FakeEngineLayer.this.ikW[6]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[5] - FakeEngineLayer.this.ikW[7]) / (FakeEngineLayer.this.ikW[4] - FakeEngineLayer.this.ikW[6])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(1.0f, abs / heightForVideoWindow, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float f5 = FakeEngineLayer.this.ilo.width;
                    float height = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width = 10000 / FakeEngineLayer.this.ikM.width();
                    int height2 = 10000 / FakeEngineLayer.this.ikM.height();
                    float width2 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height3 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width2;
                    FakeEngineLayer.this.ilo.centerPosY = height3;
                    FakeEngineLayer.this.ilo.width = f5;
                    FakeEngineLayer.this.ilo.height = height;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilg.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass12 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f;
                    FakeEngineLayer.this.ikX[11] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[3]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[2]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[3]) / (f - FakeEngineLayer.this.ikW[2]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[1] - FakeEngineLayer.this.ikW[3]) / (FakeEngineLayer.this.ikW[0] - FakeEngineLayer.this.ikW[2])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(1.0f, abs / heightForVideoWindow, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float f5 = FakeEngineLayer.this.ilo.width;
                    float height = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width = 10000 / FakeEngineLayer.this.ikM.width();
                    int height2 = 10000 / FakeEngineLayer.this.ikM.height();
                    float width2 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height3 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width2;
                    FakeEngineLayer.this.ilo.centerPosY = height3;
                    FakeEngineLayer.this.ilo.width = f5;
                    FakeEngineLayer.this.ilo.height = height;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilh = new Paint();
        this.ili = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f);
        this.rectF = new RectF();
        this.ilj = new RectF();
        this.matrix = new Matrix();
        this.ilh.setStyle(Paint.Style.STROKE);
        this.ilh.setAntiAlias(true);
        this.ilh.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.0f));
        this.ilh.setColor(-419430401);
        this.ilk = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.5f);
        this.ill = new Paint();
        this.ilm = new Paint();
        this.ill.setStyle(Paint.Style.STROKE);
        this.ill.setAntiAlias(true);
        this.ill.setStrokeWidth(this.ilk);
        this.ill.setColor(androidx.core.content.b.x(getContext(), R.color.veds_color_fill_orange_50));
        this.ilm.setStyle(Paint.Style.STROKE);
        this.ilm.setAntiAlias(true);
        this.ilm.setStrokeWidth(this.ilk * 2.0f);
        this.ilm.setColor(androidx.core.content.b.x(getContext(), R.color.veds_color_bg_black_1));
        Paint paint = new Paint();
        this.iln = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.iln.setAntiAlias(true);
        this.iln.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 0.5f));
        this.iln.setColor(-1098698);
        this.ilp = new Paint();
        this.ilq = new Paint();
        this.ilr = new Paint();
        this.ilt = new Paint();
        this.ilv = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f);
        this.ilp.setStyle(Paint.Style.STROKE);
        this.ilp.setAntiAlias(true);
        this.ilp.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f));
        this.ilp.setColor(-40141);
        this.ilq.setStyle(Paint.Style.FILL);
        this.ilq.setAntiAlias(true);
        this.ilq.setColor(-870244063);
        this.ilt.setAntiAlias(true);
        this.ilt.setTextSize(TypedValue.applyDimension(2, 12.0f, getContext().getResources().getDisplayMetrics()));
        this.ilt.setColor(-1);
        this.ilt.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = this.ilt.getFontMetrics();
        this.ilu = fontMetrics.leading - fontMetrics.top;
        this.ilr.setAntiAlias(true);
        this.ilr.setTextSize(TypedValue.applyDimension(2, 9.0f, getContext().getResources().getDisplayMetrics()));
        this.ilr.setColor(-1644826);
        this.ilr.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics2 = this.ilr.getFontMetrics();
        this.ils = fontMetrics2.leading - fontMetrics2.top;
        this.ily = new PointF();
        this.ilz = -1;
        this.ilA = new PointF();
        this.ilB = new PointF();
        this.ilC = new Paint();
        this.ilD = new Paint();
        this.ilE = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 80.0f);
        this.ilF = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 60.0f);
        this.ilG = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 70.0f);
        this.ilJ = new Matrix();
        this.ilC.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.0f));
        this.ilC.setColor(-877025);
        this.ilC.setAntiAlias(true);
        this.ilC.setStyle(Paint.Style.STROKE);
        this.ilD.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 10.0f));
        this.ilD.setAntiAlias(true);
        this.ilD.setStyle(Paint.Style.STROKE);
        this.ilM = true;
        this.ilN = new RectF();
        this.ilR = "-89";
        this.ilS = "对比度";
        this.ilT = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 24.0f);
        this.ilU = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 16.0f);
        this.ilV = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 20.0f);
        this.ilZ = 0.0f;
        this.ima = 0.0f;
        this.imb = new Runnable() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass13 */

            public void run() {
                FakeEngineLayer.this.ilY.start();
            }
        };
        Paint paint2 = new Paint();
        this.ilW = paint2;
        paint2.setAntiAlias(true);
        this.ilW.setTextSize(TypedValue.applyDimension(2, 28.0f, getContext().getResources().getDisplayMetrics()));
        this.ilW.setColor(-1);
        this.ilW.setShadowLayer(8.0f, 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint3 = new Paint();
        this.ilX = paint3;
        paint3.setAntiAlias(true);
        this.ilX.setTextSize(TypedValue.applyDimension(2, 16.0f, getContext().getResources().getDisplayMetrics()));
        this.ilX.setColor(-1644826);
        this.ilX.setShadowLayer(8.0f, 0.0f, 0.0f, Integer.MIN_VALUE);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.czr = ofFloat;
        ofFloat.setDuration(200L);
        this.czr.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass2 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FakeEngineLayer fakeEngineLayer = FakeEngineLayer.this;
                fakeEngineLayer.ilZ = fakeEngineLayer.ima + (floatValue * (1.0f - FakeEngineLayer.this.ima));
                FakeEngineLayer.this.invalidate();
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.ilY = ofFloat2;
        ofFloat2.setDuration(200L);
        this.ilY.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass3 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FakeEngineLayer.this.ilZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FakeEngineLayer.this.invalidate();
            }
        });
        this.imd = new RectF();
        Paint paint4 = new Paint();
        this.imc = paint4;
        paint4.setAntiAlias(true);
        this.imc.setColor(-16119286);
        this.ime = new ArrayMap<>();
        this.img = -1;
        this.imh = -1;
        this.dVE = -1;
        this.imi = -1;
        this.imj = -1;
        this.imk = false;
        this.iml = -1.0f;
        this.imm = -1.0f;
        this.imn = -1.0f;
        this.imo = -1.0f;
        this.imp = false;
        this.imq = 0;
        this.imr = 0;
        this.ims = false;
        this.imt = false;
        this.imu = 0.0f;
        this.imv = 0.0f;
        this.imw = 0;
        this.imx = 0;
        this.imy = 0;
        this.imz = 0;
        this.imA = 0;
        this.imB = 0;
        this.imC = 0.0f;
        this.imD = 0.0f;
        this.imE = new Runnable() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass4 */

            public void run() {
                FakeEngineLayer.this.imk = false;
            }
        };
        init(context);
    }

    public FakeEngineLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ikM = new Rect();
        this.ikV = a.f.NULL;
        this.ikW = new float[12];
        this.ikX = new float[12];
        this.ikY = new Matrix();
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_flip_icon);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_delete_icon);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_scale_icon);
        this.ikZ = new a(decodeResource, d.b.right_bottom, d.c.Click);
        this.ila = new a(decodeResource2, d.b.right_top, d.c.Click);
        this.ilb = new a(decodeResource3, d.b.right_bottom, d.c.Rotation_Scale);
        this.ilc = new a(decodeResource2, d.b.right_bottom, d.c.Click);
        this.ikZ.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass1 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.j(FakeEngineLayer.this.ilo);
                }
            }
        });
        this.ila.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass6 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo);
                }
            }
        });
        this.ilb.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass7 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void g(float f, boolean z) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    float degrees = (float) (((double) f) - Math.toDegrees(Math.atan((double) (FakeEngineLayer.this.getHeightForVideoWindow() / FakeEngineLayer.this.getWidthForVideoWindow()))));
                    if (!z) {
                        FakeEngineLayer.this.ilo.degree = (float) (Math.round(degrees / 5.0f) * 5);
                    }
                    FakeEngineLayer.this.ilO.d(FakeEngineLayer.this.ilo, z, FakeEngineLayer.this.bTC());
                    FakeEngineLayer.this.invalidate();
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public float c(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo == null || FakeEngineLayer.this.ilO == null) {
                    return f;
                }
                float b2 = FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo, FakeEngineLayer.this.ap(f, f2), f2);
                float f3 = b2 / f2;
                FakeEngineLayer.this.ilo.width *= f3;
                FakeEngineLayer.this.ilo.height *= f3;
                FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo, z, FakeEngineLayer.this.bTC());
                FakeEngineLayer.this.invalidate();
                return b2;
            }
        });
        this.ilc.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass8 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilM && FakeEngineLayer.this.hYT != null) {
                    FakeEngineLayer.this.hYT.bPS();
                }
            }
        });
        Bitmap decodeResource4 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_mosaic);
        Matrix matrix2 = new Matrix();
        matrix2.postRotate(-90.0f);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        matrix2.reset();
        matrix2.postRotate(90.0f);
        Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        matrix2.reset();
        matrix2.postRotate(180.0f);
        Bitmap createBitmap3 = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        this.ild = new a(createBitmap, d.b.LEFT, d.c.DRAG);
        this.ile = new a(decodeResource4, d.b.TOP, d.c.DRAG);
        this.ilf = new a(createBitmap2, d.b.RIGHT, d.c.DRAG);
        this.ilg = new a(createBitmap3, d.b.BOTTOM, d.c.DRAG);
        this.ild.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass9 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[11] = (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[7]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[6]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[7]) / (f - FakeEngineLayer.this.ikW[6]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[3] - FakeEngineLayer.this.ikW[7]) / (FakeEngineLayer.this.ikW[2] - FakeEngineLayer.this.ikW[6])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(abs / widthForVideoWindow, 1.0f, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float width = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float f5 = FakeEngineLayer.this.ilo.height;
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width2 = 10000 / FakeEngineLayer.this.ikM.width();
                    int height = 10000 / FakeEngineLayer.this.ikM.height();
                    float width3 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height2 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width3;
                    FakeEngineLayer.this.ilo.centerPosY = height2;
                    FakeEngineLayer.this.ilo.width = width;
                    FakeEngineLayer.this.ilo.height = f5;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilf.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass10 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[11] = (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[5]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[4]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[5]) / (f - FakeEngineLayer.this.ikW[4]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[1] - FakeEngineLayer.this.ikW[5]) / (FakeEngineLayer.this.ikW[0] - FakeEngineLayer.this.ikW[4])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(abs / widthForVideoWindow, 1.0f, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float width = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float f5 = FakeEngineLayer.this.ilo.height;
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width2 = 10000 / FakeEngineLayer.this.ikM.width();
                    int height = 10000 / FakeEngineLayer.this.ikM.height();
                    float width3 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height2 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width3;
                    FakeEngineLayer.this.ilo.centerPosY = height2;
                    FakeEngineLayer.this.ilo.width = width;
                    FakeEngineLayer.this.ilo.height = f5;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ile.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass11 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f;
                    FakeEngineLayer.this.ikX[11] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[7]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[6]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[7]) / (f - FakeEngineLayer.this.ikW[6]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[5] - FakeEngineLayer.this.ikW[7]) / (FakeEngineLayer.this.ikW[4] - FakeEngineLayer.this.ikW[6])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(1.0f, abs / heightForVideoWindow, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float f5 = FakeEngineLayer.this.ilo.width;
                    float height = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width = 10000 / FakeEngineLayer.this.ikM.width();
                    int height2 = 10000 / FakeEngineLayer.this.ikM.height();
                    float width2 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height3 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width2;
                    FakeEngineLayer.this.ilo.centerPosY = height3;
                    FakeEngineLayer.this.ilo.width = f5;
                    FakeEngineLayer.this.ilo.height = height;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilg.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass12 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f;
                    FakeEngineLayer.this.ikX[11] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[3]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[2]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[3]) / (f - FakeEngineLayer.this.ikW[2]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[1] - FakeEngineLayer.this.ikW[3]) / (FakeEngineLayer.this.ikW[0] - FakeEngineLayer.this.ikW[2])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(1.0f, abs / heightForVideoWindow, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float f5 = FakeEngineLayer.this.ilo.width;
                    float height = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width = 10000 / FakeEngineLayer.this.ikM.width();
                    int height2 = 10000 / FakeEngineLayer.this.ikM.height();
                    float width2 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height3 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width2;
                    FakeEngineLayer.this.ilo.centerPosY = height3;
                    FakeEngineLayer.this.ilo.width = f5;
                    FakeEngineLayer.this.ilo.height = height;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilh = new Paint();
        this.ili = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f);
        this.rectF = new RectF();
        this.ilj = new RectF();
        this.matrix = new Matrix();
        this.ilh.setStyle(Paint.Style.STROKE);
        this.ilh.setAntiAlias(true);
        this.ilh.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.0f));
        this.ilh.setColor(-419430401);
        this.ilk = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.5f);
        this.ill = new Paint();
        this.ilm = new Paint();
        this.ill.setStyle(Paint.Style.STROKE);
        this.ill.setAntiAlias(true);
        this.ill.setStrokeWidth(this.ilk);
        this.ill.setColor(androidx.core.content.b.x(getContext(), R.color.veds_color_fill_orange_50));
        this.ilm.setStyle(Paint.Style.STROKE);
        this.ilm.setAntiAlias(true);
        this.ilm.setStrokeWidth(this.ilk * 2.0f);
        this.ilm.setColor(androidx.core.content.b.x(getContext(), R.color.veds_color_bg_black_1));
        Paint paint = new Paint();
        this.iln = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.iln.setAntiAlias(true);
        this.iln.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 0.5f));
        this.iln.setColor(-1098698);
        this.ilp = new Paint();
        this.ilq = new Paint();
        this.ilr = new Paint();
        this.ilt = new Paint();
        this.ilv = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f);
        this.ilp.setStyle(Paint.Style.STROKE);
        this.ilp.setAntiAlias(true);
        this.ilp.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f));
        this.ilp.setColor(-40141);
        this.ilq.setStyle(Paint.Style.FILL);
        this.ilq.setAntiAlias(true);
        this.ilq.setColor(-870244063);
        this.ilt.setAntiAlias(true);
        this.ilt.setTextSize(TypedValue.applyDimension(2, 12.0f, getContext().getResources().getDisplayMetrics()));
        this.ilt.setColor(-1);
        this.ilt.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = this.ilt.getFontMetrics();
        this.ilu = fontMetrics.leading - fontMetrics.top;
        this.ilr.setAntiAlias(true);
        this.ilr.setTextSize(TypedValue.applyDimension(2, 9.0f, getContext().getResources().getDisplayMetrics()));
        this.ilr.setColor(-1644826);
        this.ilr.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics2 = this.ilr.getFontMetrics();
        this.ils = fontMetrics2.leading - fontMetrics2.top;
        this.ily = new PointF();
        this.ilz = -1;
        this.ilA = new PointF();
        this.ilB = new PointF();
        this.ilC = new Paint();
        this.ilD = new Paint();
        this.ilE = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 80.0f);
        this.ilF = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 60.0f);
        this.ilG = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 70.0f);
        this.ilJ = new Matrix();
        this.ilC.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.0f));
        this.ilC.setColor(-877025);
        this.ilC.setAntiAlias(true);
        this.ilC.setStyle(Paint.Style.STROKE);
        this.ilD.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 10.0f));
        this.ilD.setAntiAlias(true);
        this.ilD.setStyle(Paint.Style.STROKE);
        this.ilM = true;
        this.ilN = new RectF();
        this.ilR = "-89";
        this.ilS = "对比度";
        this.ilT = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 24.0f);
        this.ilU = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 16.0f);
        this.ilV = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 20.0f);
        this.ilZ = 0.0f;
        this.ima = 0.0f;
        this.imb = new Runnable() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass13 */

            public void run() {
                FakeEngineLayer.this.ilY.start();
            }
        };
        Paint paint2 = new Paint();
        this.ilW = paint2;
        paint2.setAntiAlias(true);
        this.ilW.setTextSize(TypedValue.applyDimension(2, 28.0f, getContext().getResources().getDisplayMetrics()));
        this.ilW.setColor(-1);
        this.ilW.setShadowLayer(8.0f, 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint3 = new Paint();
        this.ilX = paint3;
        paint3.setAntiAlias(true);
        this.ilX.setTextSize(TypedValue.applyDimension(2, 16.0f, getContext().getResources().getDisplayMetrics()));
        this.ilX.setColor(-1644826);
        this.ilX.setShadowLayer(8.0f, 0.0f, 0.0f, Integer.MIN_VALUE);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.czr = ofFloat;
        ofFloat.setDuration(200L);
        this.czr.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass2 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FakeEngineLayer fakeEngineLayer = FakeEngineLayer.this;
                fakeEngineLayer.ilZ = fakeEngineLayer.ima + (floatValue * (1.0f - FakeEngineLayer.this.ima));
                FakeEngineLayer.this.invalidate();
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.ilY = ofFloat2;
        ofFloat2.setDuration(200L);
        this.ilY.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass3 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FakeEngineLayer.this.ilZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FakeEngineLayer.this.invalidate();
            }
        });
        this.imd = new RectF();
        Paint paint4 = new Paint();
        this.imc = paint4;
        paint4.setAntiAlias(true);
        this.imc.setColor(-16119286);
        this.ime = new ArrayMap<>();
        this.img = -1;
        this.imh = -1;
        this.dVE = -1;
        this.imi = -1;
        this.imj = -1;
        this.imk = false;
        this.iml = -1.0f;
        this.imm = -1.0f;
        this.imn = -1.0f;
        this.imo = -1.0f;
        this.imp = false;
        this.imq = 0;
        this.imr = 0;
        this.ims = false;
        this.imt = false;
        this.imu = 0.0f;
        this.imv = 0.0f;
        this.imw = 0;
        this.imx = 0;
        this.imy = 0;
        this.imz = 0;
        this.imA = 0;
        this.imB = 0;
        this.imC = 0.0f;
        this.imD = 0.0f;
        this.imE = new Runnable() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass4 */

            public void run() {
                FakeEngineLayer.this.imk = false;
            }
        };
        init(context);
    }

    public FakeEngineLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ikM = new Rect();
        this.ikV = a.f.NULL;
        this.ikW = new float[12];
        this.ikX = new float[12];
        this.ikY = new Matrix();
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_flip_icon);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_delete_icon);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_scale_icon);
        this.ikZ = new a(decodeResource, d.b.right_bottom, d.c.Click);
        this.ila = new a(decodeResource2, d.b.right_top, d.c.Click);
        this.ilb = new a(decodeResource3, d.b.right_bottom, d.c.Rotation_Scale);
        this.ilc = new a(decodeResource2, d.b.right_bottom, d.c.Click);
        this.ikZ.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass1 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.j(FakeEngineLayer.this.ilo);
                }
            }
        });
        this.ila.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass6 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo);
                }
            }
        });
        this.ilb.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass7 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void g(float f, boolean z) {
                if (FakeEngineLayer.this.ilo != null && FakeEngineLayer.this.ilO != null) {
                    float degrees = (float) (((double) f) - Math.toDegrees(Math.atan((double) (FakeEngineLayer.this.getHeightForVideoWindow() / FakeEngineLayer.this.getWidthForVideoWindow()))));
                    if (!z) {
                        FakeEngineLayer.this.ilo.degree = (float) (Math.round(degrees / 5.0f) * 5);
                    }
                    FakeEngineLayer.this.ilO.d(FakeEngineLayer.this.ilo, z, FakeEngineLayer.this.bTC());
                    FakeEngineLayer.this.invalidate();
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public float c(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo == null || FakeEngineLayer.this.ilO == null) {
                    return f;
                }
                float b2 = FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo, FakeEngineLayer.this.ap(f, f2), f2);
                float f3 = b2 / f2;
                FakeEngineLayer.this.ilo.width *= f3;
                FakeEngineLayer.this.ilo.height *= f3;
                FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo, z, FakeEngineLayer.this.bTC());
                FakeEngineLayer.this.invalidate();
                return b2;
            }
        });
        this.ilc.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass8 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void a(d.b bVar) {
                if (FakeEngineLayer.this.ilM && FakeEngineLayer.this.hYT != null) {
                    FakeEngineLayer.this.hYT.bPS();
                }
            }
        });
        Bitmap decodeResource4 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.editorx_fakelayer_mosaic);
        Matrix matrix2 = new Matrix();
        matrix2.postRotate(-90.0f);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        matrix2.reset();
        matrix2.postRotate(90.0f);
        Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        matrix2.reset();
        matrix2.postRotate(180.0f);
        Bitmap createBitmap3 = Bitmap.createBitmap(decodeResource4, 0, 0, decodeResource4.getWidth(), decodeResource4.getHeight(), matrix2, false);
        this.ild = new a(createBitmap, d.b.LEFT, d.c.DRAG);
        this.ile = new a(decodeResource4, d.b.TOP, d.c.DRAG);
        this.ilf = new a(createBitmap2, d.b.RIGHT, d.c.DRAG);
        this.ilg = new a(createBitmap3, d.b.BOTTOM, d.c.DRAG);
        this.ild.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass9 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[11] = (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[7]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[6]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[7]) / (f - FakeEngineLayer.this.ikW[6]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[3] - FakeEngineLayer.this.ikW[7]) / (FakeEngineLayer.this.ikW[2] - FakeEngineLayer.this.ikW[6])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(abs / widthForVideoWindow, 1.0f, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float width = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float f5 = FakeEngineLayer.this.ilo.height;
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width2 = 10000 / FakeEngineLayer.this.ikM.width();
                    int height = 10000 / FakeEngineLayer.this.ikM.height();
                    float width3 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height2 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width3;
                    FakeEngineLayer.this.ilo.centerPosY = height2;
                    FakeEngineLayer.this.ilo.width = width;
                    FakeEngineLayer.this.ilo.height = f5;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilf.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass10 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[11] = (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[5]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[4]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[5]) / (f - FakeEngineLayer.this.ikW[4]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[1] - FakeEngineLayer.this.ikW[5]) / (FakeEngineLayer.this.ikW[0] - FakeEngineLayer.this.ikW[4])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(abs / widthForVideoWindow, 1.0f, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float width = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float f5 = FakeEngineLayer.this.ilo.height;
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width2 = 10000 / FakeEngineLayer.this.ikM.width();
                    int height = 10000 / FakeEngineLayer.this.ikM.height();
                    float width3 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height2 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width3;
                    FakeEngineLayer.this.ilo.centerPosY = height2;
                    FakeEngineLayer.this.ilo.width = width;
                    FakeEngineLayer.this.ilo.height = f5;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ile.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass11 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f;
                    FakeEngineLayer.this.ikX[11] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[7]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[6]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[7]) / (f - FakeEngineLayer.this.ikW[6]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[5] - FakeEngineLayer.this.ikW[7]) / (FakeEngineLayer.this.ikW[4] - FakeEngineLayer.this.ikW[6])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(1.0f, abs / heightForVideoWindow, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float f5 = FakeEngineLayer.this.ilo.width;
                    float height = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width = 10000 / FakeEngineLayer.this.ikM.width();
                    int height2 = 10000 / FakeEngineLayer.this.ikM.height();
                    float width2 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height3 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width2;
                    FakeEngineLayer.this.ilo.centerPosY = height3;
                    FakeEngineLayer.this.ilo.width = f5;
                    FakeEngineLayer.this.ilo.height = height;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilg.a(new d.a() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass12 */

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTE() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.a(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void bTF() {
                if (FakeEngineLayer.this.ilO != null) {
                    FakeEngineLayer.this.ilO.b(FakeEngineLayer.this.ilo);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.quvideo.xiaoying.editorx.board.effect.fake.d.a
            public void d(float f, float f2, boolean z) {
                if (FakeEngineLayer.this.ilo != null) {
                    float xForVideoWindow = FakeEngineLayer.this.getXForVideoWindow();
                    float yForVideoWindow = FakeEngineLayer.this.getYForVideoWindow();
                    float widthForVideoWindow = FakeEngineLayer.this.getWidthForVideoWindow();
                    float heightForVideoWindow = FakeEngineLayer.this.getHeightForVideoWindow();
                    float f3 = widthForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.left = xForVideoWindow - f3;
                    float f4 = heightForVideoWindow / 2.0f;
                    FakeEngineLayer.this.ilj.top = yForVideoWindow - f4;
                    FakeEngineLayer.this.ilj.right = f3 + xForVideoWindow;
                    FakeEngineLayer.this.ilj.bottom = f4 + yForVideoWindow;
                    FakeEngineLayer.this.ikX[0] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[1] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[2] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[3] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikX[4] = FakeEngineLayer.this.ilj.left;
                    FakeEngineLayer.this.ikX[5] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[6] = FakeEngineLayer.this.ilj.right;
                    FakeEngineLayer.this.ikX[7] = FakeEngineLayer.this.ilj.bottom;
                    FakeEngineLayer.this.ikX[8] = xForVideoWindow;
                    FakeEngineLayer.this.ikX[9] = yForVideoWindow;
                    FakeEngineLayer.this.ikX[10] = (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f;
                    FakeEngineLayer.this.ikX[11] = FakeEngineLayer.this.ilj.top;
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    float abs = (float) Math.abs(Math.sqrt(Math.pow((double) (f2 - FakeEngineLayer.this.ikW[3]), 2.0d) + Math.pow((double) (f - FakeEngineLayer.this.ikW[2]), 2.0d)) * Math.sin(Math.atan((double) ((f2 - FakeEngineLayer.this.ikW[3]) / (f - FakeEngineLayer.this.ikW[2]))) - Math.atan((double) ((FakeEngineLayer.this.ikW[1] - FakeEngineLayer.this.ikW[3]) / (FakeEngineLayer.this.ikW[0] - FakeEngineLayer.this.ikW[2])))));
                    FakeEngineLayer.this.ikY.reset();
                    FakeEngineLayer.this.ikY.postScale(1.0f, abs / heightForVideoWindow, FakeEngineLayer.this.ikX[10], FakeEngineLayer.this.ikX[11]);
                    FakeEngineLayer.this.ikY.postRotate(FakeEngineLayer.this.ilo.degree, (FakeEngineLayer.this.ilj.left + FakeEngineLayer.this.ilj.right) / 2.0f, (FakeEngineLayer.this.ilj.top + FakeEngineLayer.this.ilj.bottom) / 2.0f);
                    FakeEngineLayer.this.ikY.mapPoints(FakeEngineLayer.this.ikW, FakeEngineLayer.this.ikX);
                    if (abs < ((float) FakeEngineLayer.this.ilV)) {
                        abs = (float) FakeEngineLayer.this.ilV;
                    }
                    float f5 = FakeEngineLayer.this.ilo.width;
                    float height = (abs * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float f6 = FakeEngineLayer.this.ilo.width;
                    int width = 10000 / FakeEngineLayer.this.ikM.width();
                    int height2 = 10000 / FakeEngineLayer.this.ikM.height();
                    float width2 = ((FakeEngineLayer.this.ikW[8] - ((float) FakeEngineLayer.this.ikM.left)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.width());
                    float height3 = ((FakeEngineLayer.this.ikW[9] - ((float) FakeEngineLayer.this.ikM.top)) * 10000.0f) / ((float) FakeEngineLayer.this.ikM.height());
                    float[] fArr = {FakeEngineLayer.this.ikW[0], FakeEngineLayer.this.ikW[1]};
                    float[] fArr2 = {FakeEngineLayer.this.ikW[2], FakeEngineLayer.this.ikW[3]};
                    float[] fArr3 = {FakeEngineLayer.this.ikW[4], FakeEngineLayer.this.ikW[5]};
                    float[] fArr4 = {FakeEngineLayer.this.ikW[6], FakeEngineLayer.this.ikW[7]};
                    float min = Math.min(Math.min(fArr[0], fArr2[0]), Math.min(fArr3[0], fArr4[0]));
                    float min2 = Math.min(Math.min(fArr[1], fArr2[1]), Math.min(fArr3[1], fArr4[1]));
                    float max = Math.max(Math.max(fArr[0], fArr2[0]), Math.max(fArr3[0], fArr4[0]));
                    float max2 = Math.max(Math.max(fArr[1], fArr2[1]), Math.max(fArr3[1], fArr4[1]));
                    FakeEngineLayer.this.ilo.centerPosX = width2;
                    FakeEngineLayer.this.ilo.centerPosY = height3;
                    FakeEngineLayer.this.ilo.width = f5;
                    FakeEngineLayer.this.ilo.height = height;
                    boolean w = FakeEngineLayer.this.w(min, min2, max, max2);
                    if (FakeEngineLayer.this.ilO != null) {
                        FakeEngineLayer.this.ilO.c(FakeEngineLayer.this.ilo, z, w);
                    }
                    FakeEngineLayer.this.invalidate();
                }
            }
        });
        this.ilh = new Paint();
        this.ili = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f);
        this.rectF = new RectF();
        this.ilj = new RectF();
        this.matrix = new Matrix();
        this.ilh.setStyle(Paint.Style.STROKE);
        this.ilh.setAntiAlias(true);
        this.ilh.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.0f));
        this.ilh.setColor(-419430401);
        this.ilk = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.5f);
        this.ill = new Paint();
        this.ilm = new Paint();
        this.ill.setStyle(Paint.Style.STROKE);
        this.ill.setAntiAlias(true);
        this.ill.setStrokeWidth(this.ilk);
        this.ill.setColor(androidx.core.content.b.x(getContext(), R.color.veds_color_fill_orange_50));
        this.ilm.setStyle(Paint.Style.STROKE);
        this.ilm.setAntiAlias(true);
        this.ilm.setStrokeWidth(this.ilk * 2.0f);
        this.ilm.setColor(androidx.core.content.b.x(getContext(), R.color.veds_color_bg_black_1));
        Paint paint = new Paint();
        this.iln = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.iln.setAntiAlias(true);
        this.iln.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 0.5f));
        this.iln.setColor(-1098698);
        this.ilp = new Paint();
        this.ilq = new Paint();
        this.ilr = new Paint();
        this.ilt = new Paint();
        this.ilv = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f);
        this.ilp.setStyle(Paint.Style.STROKE);
        this.ilp.setAntiAlias(true);
        this.ilp.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 2.0f));
        this.ilp.setColor(-40141);
        this.ilq.setStyle(Paint.Style.FILL);
        this.ilq.setAntiAlias(true);
        this.ilq.setColor(-870244063);
        this.ilt.setAntiAlias(true);
        this.ilt.setTextSize(TypedValue.applyDimension(2, 12.0f, getContext().getResources().getDisplayMetrics()));
        this.ilt.setColor(-1);
        this.ilt.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = this.ilt.getFontMetrics();
        this.ilu = fontMetrics.leading - fontMetrics.top;
        this.ilr.setAntiAlias(true);
        this.ilr.setTextSize(TypedValue.applyDimension(2, 9.0f, getContext().getResources().getDisplayMetrics()));
        this.ilr.setColor(-1644826);
        this.ilr.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics2 = this.ilr.getFontMetrics();
        this.ils = fontMetrics2.leading - fontMetrics2.top;
        this.ily = new PointF();
        this.ilz = -1;
        this.ilA = new PointF();
        this.ilB = new PointF();
        this.ilC = new Paint();
        this.ilD = new Paint();
        this.ilE = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 80.0f);
        this.ilF = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 60.0f);
        this.ilG = com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 70.0f);
        this.ilJ = new Matrix();
        this.ilC.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 1.0f));
        this.ilC.setColor(-877025);
        this.ilC.setAntiAlias(true);
        this.ilC.setStyle(Paint.Style.STROKE);
        this.ilD.setStrokeWidth(com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 10.0f));
        this.ilD.setAntiAlias(true);
        this.ilD.setStyle(Paint.Style.STROKE);
        this.ilM = true;
        this.ilN = new RectF();
        this.ilR = "-89";
        this.ilS = "对比度";
        this.ilT = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 24.0f);
        this.ilU = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 16.0f);
        this.ilV = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 20.0f);
        this.ilZ = 0.0f;
        this.ima = 0.0f;
        this.imb = new Runnable() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass13 */

            public void run() {
                FakeEngineLayer.this.ilY.start();
            }
        };
        Paint paint2 = new Paint();
        this.ilW = paint2;
        paint2.setAntiAlias(true);
        this.ilW.setTextSize(TypedValue.applyDimension(2, 28.0f, getContext().getResources().getDisplayMetrics()));
        this.ilW.setColor(-1);
        this.ilW.setShadowLayer(8.0f, 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint3 = new Paint();
        this.ilX = paint3;
        paint3.setAntiAlias(true);
        this.ilX.setTextSize(TypedValue.applyDimension(2, 16.0f, getContext().getResources().getDisplayMetrics()));
        this.ilX.setColor(-1644826);
        this.ilX.setShadowLayer(8.0f, 0.0f, 0.0f, Integer.MIN_VALUE);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.czr = ofFloat;
        ofFloat.setDuration(200L);
        this.czr.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass2 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FakeEngineLayer fakeEngineLayer = FakeEngineLayer.this;
                fakeEngineLayer.ilZ = fakeEngineLayer.ima + (floatValue * (1.0f - FakeEngineLayer.this.ima));
                FakeEngineLayer.this.invalidate();
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.ilY = ofFloat2;
        ofFloat2.setDuration(200L);
        this.ilY.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass3 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FakeEngineLayer.this.ilZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FakeEngineLayer.this.invalidate();
            }
        });
        this.imd = new RectF();
        Paint paint4 = new Paint();
        this.imc = paint4;
        paint4.setAntiAlias(true);
        this.imc.setColor(-16119286);
        this.ime = new ArrayMap<>();
        this.img = -1;
        this.imh = -1;
        this.dVE = -1;
        this.imi = -1;
        this.imj = -1;
        this.imk = false;
        this.iml = -1.0f;
        this.imm = -1.0f;
        this.imn = -1.0f;
        this.imo = -1.0f;
        this.imp = false;
        this.imq = 0;
        this.imr = 0;
        this.ims = false;
        this.imt = false;
        this.imu = 0.0f;
        this.imv = 0.0f;
        this.imw = 0;
        this.imx = 0;
        this.imy = 0;
        this.imz = 0;
        this.imA = 0;
        this.imB = 0;
        this.imC = 0.0f;
        this.imD = 0.0f;
        this.imE = new Runnable() {
            /* class com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.AnonymousClass4 */

            public void run() {
                FakeEngineLayer.this.imk = false;
            }
        };
        init(context);
    }

    private void init(Context context) {
        setMode(a.f.FINE_TUNE);
        this.cCt = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2;
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void dd(String str, String str2) {
        this.ilR = str;
        this.ilS = str2;
        if (this.ilY.isRunning()) {
            this.ilY.cancel();
        }
        if (this.ilZ != 1.0f && !this.czr.isRunning()) {
            this.ima = this.ilZ;
            this.czr.start();
        }
        invalidate();
        getHandler().removeCallbacks(this.imb);
        getHandler().postDelayed(this.imb, 1000);
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void dismissTip() {
        getHandler().removeCallbacks(this.imb);
        this.imb.run();
        getHandler().removeCallbacks(this.imE);
        this.imE.run();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r4 != 3) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0334 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x072e  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0896  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x08a2  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x08c7  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x08d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean Z(android.view.MotionEvent r26) {
        /*
        // Method dump skipped, instructions count: 2643
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.Z(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float ap(float f, float f2) {
        float widthForVideoWindow = getWidthForVideoWindow();
        float heightForVideoWindow = getHeightForVideoWindow();
        float f3 = f / f2;
        float f4 = widthForVideoWindow * f3;
        float f5 = f3 * heightForVideoWindow;
        if (f4 >= f5) {
            int i = this.ilV;
            if (f5 < ((float) i)) {
                f = (((float) i) * f2) / heightForVideoWindow;
            }
            float width = (((float) (this.ikM.width() * 3)) / widthForVideoWindow) * f2;
            float f6 = (this.ilo.height / this.ilo.width) * width;
            return Math.min(f, (float) Math.sqrt((double) ((width * width) + (f6 * f6))));
        }
        int i2 = this.ilV;
        if (f4 < ((float) i2)) {
            f = (((float) i2) * f2) / widthForVideoWindow;
        }
        float height = (((float) (this.ikM.height() * 3)) / heightForVideoWindow) * f2;
        float f7 = (this.ilo.width / this.ilo.height) * height;
        return Math.min(f, (float) Math.sqrt((double) ((f7 * f7) + (height * height))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r12 != 3) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean aa(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.aa(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r2 != 3) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean ab(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.ab(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r2 != 3) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean ac(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.ac(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r3 != 3) goto L_0x01a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean ad(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 423
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.ad(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r2 != 3) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean ae(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer.ae(android.view.MotionEvent):boolean");
    }

    private boolean af(MotionEvent motionEvent) {
        int i;
        a.g gVar;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i3;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            float f6 = -1.0f;
            if (action != 1) {
                if (action == 2) {
                    List<PIPRegionControlModel> list = this.imH;
                    if (list == null || (i3 = this.imJ) < 0 || i3 >= list.size()) {
                        this.ims = false;
                    }
                    if (!this.ims) {
                        return true;
                    }
                    float f7 = this.imo;
                    if (((float) motionEvent.getPointerCount()) == f7) {
                        float f8 = this.iml;
                        if (f8 != -1.0f) {
                            float f9 = this.imm;
                            if (f9 != -1.0f) {
                                if (f7 == 1.0f) {
                                    f = y - f9;
                                    f2 = x - f8;
                                    f3 = 1.0f;
                                } else if (f7 == 2.0f) {
                                    f6 = ag(motionEvent);
                                    f3 = f6 / this.imn;
                                    f2 = ((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f) - this.iml;
                                    f = ((motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f) - this.imm;
                                } else {
                                    f3 = 1.0f;
                                    f2 = 0.0f;
                                    f = 0.0f;
                                }
                                PIPRegionControlModel pIPRegionControlModel = this.imH.get(this.imJ);
                                float a2 = a(pIPRegionControlModel);
                                float b2 = b(pIPRegionControlModel);
                                float width = ((float) pIPRegionControlModel.getmVideoCropRegion().width()) / f3;
                                float height = ((float) pIPRegionControlModel.getmVideoCropRegion().height()) / f3;
                                float f10 = 100.0f;
                                if ((((float) pIPRegionControlModel.getSourceRect().width()) * 1.0f) / ((float) pIPRegionControlModel.getSourceRect().height()) > (((float) pIPRegionControlModel.getmItemRegion().width()) * 1.0f) / ((float) pIPRegionControlModel.getmItemRegion().height())) {
                                    if (height > 10000.0f) {
                                        width = ((float) pIPRegionControlModel.getmVideoCropRegion().width()) * (10000.0f / ((float) pIPRegionControlModel.getmVideoCropRegion().height()));
                                        height = 10000.0f;
                                    }
                                    if (width < 100.0f) {
                                        height = ((float) pIPRegionControlModel.getmVideoCropRegion().height()) * (100.0f / ((float) pIPRegionControlModel.getmVideoCropRegion().width()));
                                    } else {
                                        f10 = width;
                                    }
                                    f4 = (f / b2) * height;
                                    f5 = (f2 / (((((float) pIPRegionControlModel.getSourceRect().width()) * 1.0f) / ((float) pIPRegionControlModel.getSourceRect().height())) * b2)) * height;
                                } else {
                                    if (width > 10000.0f) {
                                        height = ((float) pIPRegionControlModel.getmVideoCropRegion().height()) * (10000.0f / ((float) pIPRegionControlModel.getmVideoCropRegion().width()));
                                        width = 10000.0f;
                                    }
                                    if (height < 100.0f) {
                                        f10 = ((float) pIPRegionControlModel.getmVideoCropRegion().width()) * (100.0f / ((float) pIPRegionControlModel.getmVideoCropRegion().height()));
                                        height = 100.0f;
                                    } else {
                                        f10 = width;
                                    }
                                    f5 = (f2 / a2) * f10;
                                    f4 = (f / (((((float) pIPRegionControlModel.getSourceRect().height()) * 1.0f) / ((float) pIPRegionControlModel.getSourceRect().width())) * a2)) * f10;
                                }
                                float height2 = (height - ((float) pIPRegionControlModel.getmVideoCropRegion().height())) / 2.0f;
                                float f11 = ((float) pIPRegionControlModel.getmVideoCropRegion().top) - height2;
                                float f12 = ((float) pIPRegionControlModel.getmVideoCropRegion().bottom) + height2;
                                float width2 = (f10 - ((float) pIPRegionControlModel.getmVideoCropRegion().width())) / 2.0f;
                                float f13 = ((float) pIPRegionControlModel.getmVideoCropRegion().left) - width2;
                                float f14 = ((float) pIPRegionControlModel.getmVideoCropRegion().right) + width2;
                                float f15 = -f4;
                                float f16 = f11 + f15;
                                float f17 = f12 + f15;
                                float f18 = -f5;
                                float f19 = f13 + f18;
                                float f20 = f14 + f18;
                                if (f16 < 0.0f) {
                                    f17 = height;
                                    f16 = 0.0f;
                                }
                                if (f19 < 0.0f) {
                                    f20 = f10;
                                    f19 = 0.0f;
                                }
                                if (f17 > 10000.0f) {
                                    f16 = 10000.0f - height;
                                    f17 = 10000.0f;
                                }
                                if (f20 > 10000.0f) {
                                    f19 = 10000.0f - f10;
                                    f20 = 10000.0f;
                                }
                                pIPRegionControlModel.getmVideoCropRegion().top = (int) f16;
                                pIPRegionControlModel.getmVideoCropRegion().bottom = (int) f17;
                                pIPRegionControlModel.getmVideoCropRegion().left = (int) f19;
                                pIPRegionControlModel.getmVideoCropRegion().right = (int) f20;
                                a.g gVar2 = this.imI;
                                if (gVar2 != null) {
                                    int i4 = this.imJ;
                                    gVar2.a(i4, this.imH.get(i4), false);
                                }
                                float f21 = this.imo;
                                if (f21 == 1.0f) {
                                    this.iml = x;
                                    this.imm = y;
                                    return true;
                                } else if (f21 != 2.0f) {
                                    return true;
                                } else {
                                    if (f6 > 0.0f) {
                                        this.imn = f6;
                                    }
                                    this.iml = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                                    this.imm = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                                    return true;
                                }
                            }
                        }
                    }
                    float pointerCount = (float) motionEvent.getPointerCount();
                    this.imo = pointerCount;
                    if (pointerCount == 1.0f) {
                        this.iml = x;
                        this.imm = y;
                        return true;
                    } else if (pointerCount != 2.0f) {
                        return true;
                    } else {
                        this.imp = false;
                        this.imn = ag(motionEvent);
                        this.iml = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                        this.imm = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                        return true;
                    }
                } else if (action != 3) {
                    return true;
                }
            }
            this.iml = -1.0f;
            this.imm = -1.0f;
            List<PIPRegionControlModel> list2 = this.imH;
            if (list2 == null || (i2 = this.imJ) < 0 || i2 >= list2.size()) {
                this.ims = false;
            }
            if (!this.ims || (gVar = this.imI) == null) {
                return true;
            }
            int i5 = this.imJ;
            gVar.a(i5, this.imH.get(i5), true);
            return true;
        }
        this.imo = (float) motionEvent.getPointerCount();
        this.iml = x;
        this.imm = y;
        this.ims = false;
        this.imo = (float) motionEvent.getPointerCount();
        List<PIPRegionControlModel> list3 = this.imH;
        if (list3 == null || (i = this.imJ) < 0 || i >= list3.size()) {
            return true;
        }
        this.ims = true;
        a.g gVar3 = this.imI;
        if (gVar3 == null) {
            return true;
        }
        int i6 = this.imJ;
        gVar3.b(i6, this.imH.get(i6));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        EffectPosInfo effectPosInfo;
        int i;
        if (this.ikM.left > 0) {
            this.imd.left = 0.0f;
            this.imd.top = 0.0f;
            this.imd.right = (float) this.ikM.left;
            this.imd.bottom = (float) getHeight();
            canvas.drawRect(this.imd, this.imc);
        }
        if (this.ikM.right < getWidth()) {
            this.imd.left = (float) this.ikM.right;
            this.imd.top = 0.0f;
            this.imd.right = (float) getWidth();
            this.imd.bottom = (float) getHeight();
            canvas.drawRect(this.imd, this.imc);
        }
        if (this.ikM.top > 0) {
            this.imd.left = 0.0f;
            this.imd.top = 0.0f;
            this.imd.right = (float) getWidth();
            this.imd.bottom = (float) this.ikM.top;
            canvas.drawRect(this.imd, this.imc);
        }
        if (this.ikM.bottom < getHeight()) {
            this.imd.left = 0.0f;
            this.imd.top = (float) this.ikM.bottom;
            this.imd.right = (float) getWidth();
            this.imd.bottom = (float) getHeight();
            canvas.drawRect(this.imd, this.imc);
        }
        int i2 = 1;
        switch (AnonymousClass5.imL[this.ikV.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 16:
                if (this.ilo != null) {
                    float xForVideoWindow = getXForVideoWindow();
                    float yForVideoWindow = getYForVideoWindow();
                    float widthForVideoWindow = getWidthForVideoWindow();
                    float heightForVideoWindow = getHeightForVideoWindow();
                    this.matrix.reset();
                    this.matrix.postRotate(this.ilo.degree, xForVideoWindow, yForVideoWindow);
                    RectF rectF2 = this.ilj;
                    float f = widthForVideoWindow / 2.0f;
                    float f2 = xForVideoWindow - f;
                    this.rectF.left = f2;
                    rectF2.left = f2;
                    RectF rectF3 = this.ilj;
                    float f3 = heightForVideoWindow / 2.0f;
                    float f4 = yForVideoWindow - f3;
                    this.rectF.top = f4;
                    rectF3.top = f4;
                    RectF rectF4 = this.ilj;
                    float f5 = f + xForVideoWindow;
                    this.rectF.right = f5;
                    rectF4.right = f5;
                    RectF rectF5 = this.ilj;
                    float f6 = f3 + yForVideoWindow;
                    this.rectF.bottom = f6;
                    rectF5.bottom = f6;
                    if (this.ikV == a.f.FB_BG) {
                        canvas.save();
                        canvas.setMatrix(this.matrix);
                        canvas.restore();
                    } else {
                        canvas.save();
                        canvas.setMatrix(this.matrix);
                        this.ilj.inset(-2.0f, -2.0f);
                        RectF rectF6 = this.ilj;
                        float f7 = this.ili;
                        canvas.drawRoundRect(rectF6, f7, f7, this.ilh);
                        this.ilj.inset(2.0f, 2.0f);
                        canvas.restore();
                    }
                    a aVar = this.ime.get(d.b.LEFT_TOP);
                    if (aVar != null) {
                        aVar.bww.x = this.rectF.left;
                        aVar.bww.y = this.rectF.top;
                        aVar.imN.x = xForVideoWindow;
                        aVar.imN.y = yForVideoWindow;
                        a(aVar.bww, aVar.imN, this.ilo.degree);
                        aVar.draw(canvas);
                    }
                    a aVar2 = this.ime.get(d.b.right_top);
                    if (aVar2 != null) {
                        aVar2.bww.x = this.rectF.right;
                        aVar2.bww.y = this.rectF.top;
                        aVar2.imN.x = xForVideoWindow;
                        aVar2.imN.y = yForVideoWindow;
                        a(aVar2.bww, aVar2.imN, this.ilo.degree);
                        aVar2.draw(canvas);
                    }
                    a aVar3 = this.ime.get(d.b.left_bottom);
                    if (aVar3 != null) {
                        aVar3.bww.x = this.rectF.left;
                        aVar3.bww.y = this.rectF.bottom;
                        aVar3.imN.x = xForVideoWindow;
                        aVar3.imN.y = yForVideoWindow;
                        a(aVar3.bww, aVar3.imN, this.ilo.degree);
                        aVar3.draw(canvas);
                    }
                    a aVar4 = this.ime.get(d.b.right_bottom);
                    if (aVar4 != null) {
                        aVar4.bww.x = this.rectF.right;
                        aVar4.bww.y = this.rectF.bottom;
                        aVar4.imN.x = xForVideoWindow;
                        aVar4.imN.y = yForVideoWindow;
                        a(aVar4.bww, aVar4.imN, this.ilo.degree);
                        aVar4.draw(canvas);
                    }
                    a aVar5 = this.ime.get(d.b.LEFT);
                    if (aVar5 != null) {
                        aVar5.bww.x = this.rectF.left;
                        aVar5.bww.y = (this.rectF.top + this.rectF.bottom) / 2.0f;
                        aVar5.imN.x = xForVideoWindow;
                        aVar5.imN.y = yForVideoWindow;
                        aVar5.rotation = this.ilo.degree;
                        a(aVar5.bww, aVar5.imN, this.ilo.degree);
                        aVar5.draw(canvas);
                    }
                    a aVar6 = this.ime.get(d.b.TOP);
                    if (aVar6 != null) {
                        aVar6.bww.x = (this.rectF.left + this.rectF.right) / 2.0f;
                        aVar6.bww.y = this.rectF.top;
                        aVar6.imN.x = xForVideoWindow;
                        aVar6.imN.y = yForVideoWindow;
                        aVar6.rotation = this.ilo.degree;
                        a(aVar6.bww, aVar6.imN, this.ilo.degree);
                        aVar6.draw(canvas);
                    }
                    a aVar7 = this.ime.get(d.b.RIGHT);
                    if (aVar7 != null) {
                        aVar7.bww.x = this.rectF.right;
                        aVar7.bww.y = (this.rectF.top + this.rectF.bottom) / 2.0f;
                        aVar7.imN.x = xForVideoWindow;
                        aVar7.imN.y = yForVideoWindow;
                        aVar7.rotation = this.ilo.degree;
                        a(aVar7.bww, aVar7.imN, this.ilo.degree);
                        aVar7.draw(canvas);
                    }
                    a aVar8 = this.ime.get(d.b.BOTTOM);
                    if (aVar8 != null) {
                        aVar8.bww.x = (this.rectF.left + this.rectF.right) / 2.0f;
                        aVar8.bww.y = this.rectF.bottom;
                        aVar8.imN.x = xForVideoWindow;
                        aVar8.imN.y = yForVideoWindow;
                        aVar8.rotation = this.ilo.degree;
                        a(aVar8.bww, aVar8.imN, this.ilo.degree);
                        aVar8.draw(canvas);
                    }
                    int i3 = this.imw | this.imx | this.imy;
                    if ((i3 & 256) != 0) {
                        float f8 = this.ikP;
                        canvas.drawLine(f8, 0.0f, f8, (float) getHeight(), this.iln);
                    }
                    if ((i3 & 16) != 0) {
                        canvas.drawLine((float) (getWidth() / 2), 0.0f, (float) (getWidth() / 2), (float) getHeight(), this.iln);
                    }
                    if ((i3 & 1) != 0) {
                        float f9 = this.ikQ;
                        canvas.drawLine(f9, 0.0f, f9, (float) getHeight(), this.iln);
                    }
                    int i4 = this.imz | this.imA | this.imB;
                    if ((i4 & 256) != 0) {
                        canvas.drawLine(0.0f, this.ikR, (float) getWidth(), this.ikR, this.iln);
                    }
                    if ((i4 & 16) != 0) {
                        canvas.drawLine(0.0f, (float) (getHeight() / 2), (float) getWidth(), (float) (getHeight() / 2), this.iln);
                    }
                    if ((i4 & 1) != 0) {
                        canvas.drawLine(0.0f, this.ikS, (float) getWidth(), this.ikS, this.iln);
                        break;
                    }
                }
                break;
            case 6:
                if (this.ilo != null) {
                    float xForVideoWindow2 = getXForVideoWindow();
                    float yForVideoWindow2 = getYForVideoWindow();
                    float clipWidthForVideoWindow = getClipWidthForVideoWindow();
                    float clipHeightForVideoWindow = getClipHeightForVideoWindow();
                    RectF rectF7 = this.ilj;
                    float f10 = clipWidthForVideoWindow / 2.0f;
                    float f11 = xForVideoWindow2 - f10;
                    this.rectF.left = f11;
                    rectF7.left = f11;
                    RectF rectF8 = this.ilj;
                    float f12 = clipHeightForVideoWindow / 2.0f;
                    float f13 = yForVideoWindow2 - f12;
                    this.rectF.top = f13;
                    rectF8.top = f13;
                    RectF rectF9 = this.ilj;
                    float f14 = xForVideoWindow2 + f10;
                    this.rectF.right = f14;
                    rectF9.right = f14;
                    RectF rectF10 = this.ilj;
                    float f15 = yForVideoWindow2 + f12;
                    this.rectF.bottom = f15;
                    rectF10.bottom = f15;
                    int i5 = this.imw | this.imx | this.imy;
                    if ((i5 & 256) != 0) {
                        float f16 = this.ikP;
                        canvas.drawLine(f16, 0.0f, f16, (float) getHeight(), this.iln);
                    }
                    if ((i5 & 16) != 0) {
                        canvas.drawLine((float) (getWidth() / 2), 0.0f, (float) (getWidth() / 2), (float) getHeight(), this.iln);
                    }
                    if ((i5 & 1) != 0) {
                        float f17 = this.ikQ;
                        canvas.drawLine(f17, 0.0f, f17, (float) getHeight(), this.iln);
                    }
                    int i6 = this.imz | this.imA | this.imB;
                    if ((i6 & 256) != 0) {
                        canvas.drawLine(0.0f, this.ikR, (float) getWidth(), this.ikR, this.iln);
                    }
                    if ((i6 & 16) != 0) {
                        canvas.drawLine(0.0f, (float) (getHeight() / 2), (float) getWidth(), (float) (getHeight() / 2), this.iln);
                    }
                    if ((i6 & 1) != 0) {
                        canvas.drawLine(0.0f, this.ikS, (float) getWidth(), this.ikS, this.iln);
                        break;
                    }
                }
                break;
            case 10:
                if (this.ilo != null) {
                    float xForVideoWindow3 = getXForVideoWindow();
                    float yForVideoWindow3 = getYForVideoWindow();
                    float widthForVideoWindow2 = getWidthForVideoWindow();
                    float heightForVideoWindow2 = getHeightForVideoWindow();
                    this.matrix.reset();
                    this.matrix.postRotate(this.ilo.degree, xForVideoWindow3, yForVideoWindow3);
                    canvas.save();
                    canvas.setMatrix(this.matrix);
                    RectF rectF11 = this.ilj;
                    float f18 = widthForVideoWindow2 / 2.0f;
                    float f19 = xForVideoWindow3 - f18;
                    this.rectF.left = f19;
                    rectF11.left = f19;
                    RectF rectF12 = this.ilj;
                    float f20 = heightForVideoWindow2 / 2.0f;
                    float f21 = yForVideoWindow3 - f20;
                    this.rectF.top = f21;
                    rectF12.top = f21;
                    RectF rectF13 = this.ilj;
                    float f22 = xForVideoWindow3 + f18;
                    this.rectF.right = f22;
                    rectF13.right = f22;
                    RectF rectF14 = this.ilj;
                    float f23 = yForVideoWindow3 + f20;
                    this.rectF.bottom = f23;
                    rectF14.bottom = f23;
                    this.ilj.inset(-2.0f, -2.0f);
                    RectF rectF15 = this.ilj;
                    float f24 = this.ili;
                    canvas.drawRoundRect(rectF15, f24, f24, this.ilh);
                    this.ilj.inset(2.0f, 2.0f);
                    canvas.restore();
                    break;
                }
                break;
            case 13:
                if (this.ilo != null) {
                    float xForVideoWindow4 = getXForVideoWindow();
                    float yForVideoWindow4 = getYForVideoWindow();
                    float widthForVideoWindow3 = getWidthForVideoWindow();
                    float heightForVideoWindow3 = getHeightForVideoWindow();
                    this.matrix.reset();
                    this.matrix.postRotate(this.ilo.degree, xForVideoWindow4, yForVideoWindow4);
                    canvas.save();
                    canvas.setMatrix(this.matrix);
                    RectF rectF16 = this.ilj;
                    float f25 = widthForVideoWindow3 / 2.0f;
                    float f26 = xForVideoWindow4 - f25;
                    this.rectF.left = f26;
                    rectF16.left = f26;
                    RectF rectF17 = this.ilj;
                    float f27 = heightForVideoWindow3 / 2.0f;
                    float f28 = yForVideoWindow4 - f27;
                    this.rectF.top = f28;
                    rectF17.top = f28;
                    RectF rectF18 = this.ilj;
                    float f29 = f25 + xForVideoWindow4;
                    this.rectF.right = f29;
                    rectF18.right = f29;
                    RectF rectF19 = this.ilj;
                    float f30 = f27 + yForVideoWindow4;
                    this.rectF.bottom = f30;
                    rectF19.bottom = f30;
                    this.ilj.inset(-2.0f, -2.0f);
                    RectF rectF20 = this.ilj;
                    float f31 = this.ili;
                    canvas.drawRoundRect(rectF20, f31, f31, this.ilh);
                    this.ilj.inset(2.0f, 2.0f);
                    canvas.restore();
                    this.ilA.x = (this.ily.x * widthForVideoWindow3 * ((float) (this.ilo.isHorFlip ? -1 : 1))) + xForVideoWindow4;
                    PointF pointF = this.ilA;
                    float f32 = this.ily.y * heightForVideoWindow3;
                    if (this.ilo.isVerFlip) {
                        i2 = -1;
                    }
                    pointF.y = (f32 * ((float) i2)) + yForVideoWindow4;
                    this.ilB.x = xForVideoWindow4;
                    this.ilB.y = yForVideoWindow4;
                    a(this.ilA, this.ilB, this.ilo.degree);
                    int i7 = this.ilz;
                    if (i7 != 0) {
                        this.ilD.setColor(i7);
                        canvas.drawCircle(this.ilA.x, this.ilA.y, this.ilG / 2.0f, this.ilD);
                    } else {
                        Bitmap bitmap = this.ilI;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            this.ilJ.reset();
                            this.ilJ.postScale(this.ilE / ((float) this.ilI.getWidth()), this.ilE / ((float) this.ilI.getHeight()));
                            this.ilJ.postTranslate(this.ilA.x - (this.ilE / 2.0f), this.ilA.y - (this.ilE / 2.0f));
                            canvas.drawBitmap(this.ilI, this.ilJ, this.ilC);
                        }
                    }
                    canvas.drawCircle(this.ilA.x, this.ilA.y, this.ilE / 2.0f, this.ilC);
                    canvas.drawCircle(this.ilA.x, this.ilA.y, this.ilF / 2.0f, this.ilC);
                    Bitmap bitmap2 = this.ilH;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        canvas.drawBitmap(this.ilH, this.ilA.x - ((float) (this.ilH.getWidth() / 2)), this.ilA.y - ((float) (this.ilH.getHeight() / 2)), this.ilC);
                        break;
                    }
                }
                break;
            case 14:
                if (this.imH != null) {
                    int i8 = 0;
                    while (i8 < this.imH.size()) {
                        PIPRegionControlModel pIPRegionControlModel = this.imH.get(i8);
                        float a2 = a(pIPRegionControlModel);
                        float b2 = b(pIPRegionControlModel);
                        float c = c(pIPRegionControlModel);
                        float d = d(pIPRegionControlModel);
                        float f33 = a2 / 2.0f;
                        float f34 = c - f33;
                        this.rectF.left = f34;
                        float f35 = b2 / 2.0f;
                        float f36 = d - f35;
                        this.rectF.top = f36;
                        this.rectF.right = f33 + c;
                        this.rectF.bottom = f35 + d;
                        if (!pIPRegionControlModel.isAddedFile()) {
                            canvas.drawRect(this.rectF, this.ilq);
                            Bitmap bitmap3 = this.ilw;
                            if (bitmap3 == null || bitmap3.isRecycled()) {
                                this.ilw = BitmapFactory.decodeResource(getResources(), R.drawable.editrox_pip_icon_add);
                            }
                            Bitmap bitmap4 = this.ilw;
                            canvas.drawBitmap(bitmap4, c - ((float) (bitmap4.getWidth() / 2)), d - ((float) this.ilw.getHeight()), this.ilp);
                            canvas.drawText(getContext().getString(R.string.xiaoying_str_editor_sticker_add_new), c, d + this.ilu + this.ilv, this.ilt);
                        }
                        if (this.imJ == i8 && !this.imt) {
                            this.rectF.inset(this.ilp.getStrokeWidth() / 2.0f, this.ilp.getStrokeWidth() / 2.0f);
                            canvas.drawRect(this.rectF, this.ilp);
                        }
                        Bitmap bitmap5 = this.ilx;
                        if (bitmap5 == null || bitmap5.isRecycled()) {
                            this.ilx = BitmapFactory.decodeResource(getResources(), R.drawable.editorx_pip_icon_index);
                        }
                        canvas.drawBitmap(this.ilx, f34, f36, this.ilp);
                        StringBuilder sb = new StringBuilder();
                        sb.append("0");
                        i8++;
                        sb.append(i8);
                        canvas.drawText(sb.toString(), f34 + ((float) (this.ilx.getWidth() / 2)), f36 + this.ils, this.ilr);
                    }
                    break;
                }
                break;
            case 15:
                List<PIPRegionControlModel> list = this.imH;
                if (list != null && (i = this.imJ) >= 0 && i < list.size()) {
                    PIPRegionControlModel pIPRegionControlModel2 = this.imH.get(this.imJ);
                    float a3 = a(pIPRegionControlModel2);
                    float b3 = b(pIPRegionControlModel2);
                    float c2 = c(pIPRegionControlModel2);
                    float d2 = d(pIPRegionControlModel2);
                    float f37 = a3 / 2.0f;
                    this.rectF.left = c2 - f37;
                    float f38 = b3 / 2.0f;
                    this.rectF.top = d2 - f38;
                    this.rectF.right = c2 + f37;
                    this.rectF.bottom = d2 + f38;
                    this.rectF.inset(this.ilp.getStrokeWidth() / 2.0f, this.ilp.getStrokeWidth() / 2.0f);
                    canvas.drawRect(this.rectF, this.ilp);
                    break;
                }
        }
        if (this.ilM && (effectPosInfo = this.ilL) != null) {
            float width = ((effectPosInfo.centerPosX / 10000.0f) * ((float) this.ikM.width())) + ((float) this.ikM.left);
            float height = ((this.ilL.centerPosY / 10000.0f) * ((float) this.ikM.height())) + ((float) this.ikM.top);
            float width2 = (this.ilL.width / 10000.0f) * ((float) this.ikM.width());
            float height2 = (this.ilL.height / 10000.0f) * ((float) this.ikM.height());
            this.ilc.bww.x = width - (width2 / 2.0f);
            this.ilc.bww.y = height - (height2 / 2.0f);
            this.ilc.imN.x = width;
            this.ilc.imN.y = height;
            a(this.ilc.bww, this.ilc.imN, this.ilL.degree);
            this.ilc.draw(canvas);
        }
        if (this.ilZ != 0.0f) {
            if (!TextUtils.isEmpty(this.ilR)) {
                this.ilW.setAlpha((int) (this.ilZ * 255.0f));
                canvas.drawText(this.ilR, (float) (this.ikM.left + this.ilU), (float) (getHeight() / 2), this.ilW);
            }
            if (!TextUtils.isEmpty(this.ilS)) {
                this.ilX.setAlpha((int) (this.ilZ * 255.0f));
                canvas.drawText(this.ilS, (float) (this.ikM.left + this.ilU), (float) ((getHeight() / 2) + this.ilT), this.ilX);
            }
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setMode(a.f fVar) {
        if (this.ikV != fVar) {
            this.ikV = fVar;
            this.ime.clear();
            int i = AnonymousClass5.imL[fVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.ila.b(d.b.LEFT_TOP);
                            this.ime.put(this.ila.inG, this.ila);
                        } else if (i == 5) {
                            this.ilb.b(d.b.right_bottom);
                            this.ila.b(d.b.LEFT_TOP);
                            this.ime.put(this.ilb.inG, this.ilb);
                            this.ime.put(this.ila.inG, this.ila);
                            this.ime.put(this.ild.inG, this.ild);
                            this.ime.put(this.ile.inG, this.ile);
                            this.ime.put(this.ilf.inG, this.ilf);
                            this.ime.put(this.ilg.inG, this.ilg);
                        } else if (i != 7) {
                            if (i == 13) {
                                if (this.ilH == null) {
                                    this.ilH = BitmapFactory.decodeResource(getResources(), R.drawable.editorx_fakelayer_color_trip);
                                }
                                if (this.ilI == null) {
                                    this.ilI = BitmapFactory.decodeResource(getResources(), R.drawable.editorx_fakelayer_color_transparent);
                                }
                            }
                        }
                        setSize(this.ikM);
                        invalidate();
                    }
                }
                this.ikZ.b(d.b.left_bottom);
                this.ilb.b(d.b.right_bottom);
                this.ila.b(d.b.LEFT_TOP);
                this.ime.put(this.ilb.inG, this.ilb);
                this.ime.put(this.ila.inG, this.ila);
                this.ime.put(this.ikZ.inG, this.ikZ);
                setSize(this.ikM);
                invalidate();
            }
            this.ilb.b(d.b.right_bottom);
            this.ila.b(d.b.LEFT_TOP);
            this.ime.put(this.ilb.inG, this.ilb);
            this.ime.put(this.ila.inG, this.ila);
            setSize(this.ikM);
            invalidate();
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setActionListener(a.d dVar) {
        this.ilO = dVar;
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setLocationListener(a.e eVar) {
        this.ilP = eVar;
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setKitListener(a.c cVar) {
        this.ilQ = cVar;
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setTarget(EffectPosInfo effectPosInfo) {
        this.ilo = effectPosInfo;
        this.ilV = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 20.0f);
        invalidate();
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setTarget(EffectPosInfo effectPosInfo, boolean z) {
        this.ilo = effectPosInfo;
        if (!z) {
            this.ilV = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 20.0f);
        } else if (effectPosInfo == null) {
            invalidate();
            return;
        } else {
            float widthForVideoWindow = getWidthForVideoWindow();
            float heightForVideoWindow = getHeightForVideoWindow();
            int sqrt = (int) Math.sqrt((double) ((widthForVideoWindow * widthForVideoWindow) + (heightForVideoWindow * heightForVideoWindow)));
            int dpToPixel = (int) com.quvideo.xiaoying.supertimeline.util.b.dpToPixel(getContext(), 20.0f);
            this.ilV = widthForVideoWindow > heightForVideoWindow ? (int) (((heightForVideoWindow * ((float) dpToPixel)) * 1.0f) / ((float) sqrt)) : (int) (((widthForVideoWindow * ((float) dpToPixel)) * 1.0f) / ((float) sqrt));
        }
        invalidate();
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setClipTarget(EffectPosInfo effectPosInfo, int i, int i2) {
        this.ikN = (float) i;
        this.ikO = (float) i2;
        setTarget(effectPosInfo);
    }

    public EffectPosInfo getTargetEffectPosInfo() {
        return this.ilo;
    }

    public float getWidthForVideoWindow() {
        return (this.ilo.width / 10000.0f) * ((float) this.ikM.width());
    }

    public float getHeightForVideoWindow() {
        return (this.ilo.height / 10000.0f) * ((float) this.ikM.height());
    }

    public float getClipWidthForVideoWindow() {
        float f;
        float width;
        if ((((float) this.ikM.width()) * 1.0f) / ((float) this.ikM.height()) > this.ikN / this.ikO) {
            f = (this.ilo.height / 10000.0f) * ((float) this.ikM.height());
            width = this.ikN / this.ikO;
        } else {
            f = this.ilo.width / 10000.0f;
            width = (float) this.ikM.width();
        }
        return f * width;
    }

    public float getClipHeightForVideoWindow() {
        float width;
        float f;
        if ((((float) this.ikM.width()) * 1.0f) / ((float) this.ikM.height()) > this.ikN / this.ikO) {
            width = this.ilo.height / 10000.0f;
            f = (float) this.ikM.height();
        } else {
            width = (this.ilo.width / 10000.0f) * ((float) this.ikM.width());
            f = this.ikO / this.ikN;
        }
        return width * f;
    }

    public float getXForVideoWindow() {
        return ((this.ilo.centerPosX / 10000.0f) * ((float) this.ikM.width())) + ((float) this.ikM.left);
    }

    public float getYForVideoWindow() {
        return ((this.ilo.centerPosY / 10000.0f) * ((float) this.ikM.height())) + ((float) this.ikM.top);
    }

    public float a(PIPRegionControlModel pIPRegionControlModel) {
        return (((float) pIPRegionControlModel.getmItemRegion().width()) / 10000.0f) * ((float) this.ikM.width());
    }

    public float b(PIPRegionControlModel pIPRegionControlModel) {
        return (((float) pIPRegionControlModel.getmItemRegion().height()) / 10000.0f) * ((float) this.ikM.height());
    }

    public float c(PIPRegionControlModel pIPRegionControlModel) {
        return (((((float) (pIPRegionControlModel.getmItemRegion().left + pIPRegionControlModel.getmItemRegion().right)) / 2.0f) / 10000.0f) * ((float) this.ikM.width())) + ((float) this.ikM.left);
    }

    public float d(PIPRegionControlModel pIPRegionControlModel) {
        return (((((float) (pIPRegionControlModel.getmItemRegion().top + pIPRegionControlModel.getmItemRegion().bottom)) / 2.0f) / 10000.0f) * ((float) this.ikM.height())) + ((float) this.ikM.top);
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public boolean e(EffectPosInfo effectPosInfo) {
        if (effectPosInfo == null) {
            return false;
        }
        float width = ((effectPosInfo.centerPosX / 10000.0f) * ((float) this.ikM.width())) + ((float) this.ikM.left);
        float height = ((effectPosInfo.centerPosY / 10000.0f) * ((float) this.ikM.height())) + ((float) this.ikM.top);
        float width2 = (effectPosInfo.width / 10000.0f) * ((float) this.ikM.width());
        float height2 = (effectPosInfo.height / 10000.0f) * ((float) this.ikM.height());
        RectF rectF2 = new RectF();
        float f = width2 / 2.0f;
        rectF2.left = width - f;
        float f2 = height2 / 2.0f;
        rectF2.top = height - f2;
        rectF2.right = f + width;
        rectF2.bottom = f2 + height;
        float[] d = d(rectF2.left, rectF2.top, width, height, effectPosInfo.degree);
        float[] d2 = d(rectF2.right, rectF2.top, width, height, effectPosInfo.degree);
        float[] d3 = d(rectF2.left, rectF2.bottom, width, height, effectPosInfo.degree);
        float[] d4 = d(rectF2.right, rectF2.bottom, width, height, effectPosInfo.degree);
        return w(Math.min(Math.min(d[0], d2[0]), Math.min(d3[0], d4[0])), Math.min(Math.min(d[1], d2[1]), Math.min(d3[1], d4[1])), Math.max(Math.max(d[0], d2[0]), Math.max(d3[0], d4[0])), Math.max(Math.max(d[1], d2[1]), Math.max(d3[1], d4[1])));
    }

    public boolean bTC() {
        if (this.ilo == null || this.ikM == null) {
            return false;
        }
        float xForVideoWindow = getXForVideoWindow();
        float yForVideoWindow = getYForVideoWindow();
        float[] d = d(this.ilj.left, this.ilj.top, xForVideoWindow, yForVideoWindow, this.ilo.degree);
        float[] d2 = d(this.ilj.right, this.ilj.top, xForVideoWindow, yForVideoWindow, this.ilo.degree);
        float[] d3 = d(this.ilj.left, this.ilj.bottom, xForVideoWindow, yForVideoWindow, this.ilo.degree);
        float[] d4 = d(this.ilj.right, this.ilj.bottom, xForVideoWindow, yForVideoWindow, this.ilo.degree);
        return w(Math.min(Math.min(d[0], d2[0]), Math.min(d3[0], d4[0])), Math.min(Math.min(d[1], d2[1]), Math.min(d3[1], d4[1])), Math.max(Math.max(d[0], d2[0]), Math.max(d3[0], d4[0])), Math.max(Math.max(d[1], d2[1]), Math.max(d3[1], d4[1])));
    }

    public boolean w(float f, float f2, float f3, float f4) {
        return f <= ((float) this.ikM.right) && f3 >= ((float) this.ikM.left) && f2 <= ((float) this.ikM.bottom) && f4 >= ((float) this.ikM.top);
    }

    public static void a(PointF pointF, PointF pointF2, float f) {
        float[] d = d(pointF.x, pointF.y, pointF2.x, pointF2.y, f);
        pointF.y = d[1];
        pointF.x = d[0];
    }

    public static float[] d(float f, float f2, float f3, float f4, float f5) {
        double d = (double) (f2 - f4);
        double d2 = (double) (f - f3);
        double degrees = Math.toDegrees(Math.atan2(d, d2));
        double sqrt = Math.sqrt(Math.pow(d, 2.0d) + Math.pow(d2, 2.0d));
        float[] fArr = new float[2];
        double d3 = degrees + ((double) f5);
        fArr[1] = ((float) (Math.sin(Math.toRadians(d3)) * sqrt)) + f4;
        fArr[0] = ((float) (Math.cos(Math.toRadians(d3)) * sqrt)) + f3;
        return fArr;
    }

    private static float ag(MotionEvent motionEvent) {
        double x = (double) (motionEvent.getX(0) - motionEvent.getX(1));
        double y = (double) (motionEvent.getY(0) - motionEvent.getY(1));
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public void setTypeFace(Typeface typeface) {
        this.ilW.setTypeface(typeface);
        this.ilX.setTypeface(typeface);
    }

    public void setFineTurnListener(a aVar) {
        this.imF = aVar;
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setFineTuneOutListener(a.b bVar) {
        this.imG = bVar;
    }

    public boolean a(PointF[] pointFArr, float f, float f2) {
        int length = pointFArr.length - 1;
        boolean z = false;
        for (int i = 0; i < pointFArr.length; i++) {
            if (((pointFArr[i].y < f2 && pointFArr[length].y >= f2) || (pointFArr[length].y < f2 && pointFArr[i].y >= f2)) && pointFArr[i].x + (((f2 - pointFArr[i].y) / (pointFArr[length].y - pointFArr[i].y)) * (pointFArr[length].x - pointFArr[i].x)) < f) {
                z = !z;
            }
            length = i;
        }
        return z;
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setDefaultWaterTarget(EffectPosInfo effectPosInfo) {
        this.ilL = effectPosInfo;
        invalidate();
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void bTD() {
        a.h hVar = this.hYT;
        if (hVar != null) {
            this.ilM = hVar.bPT();
        } else {
            this.ilM = false;
        }
        invalidate();
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setWaterListener(a.h hVar) {
        this.hYT = hVar;
    }

    private boolean aq(float f, float f2) {
        EffectPosInfo effectPosInfo = this.ilL;
        if (effectPosInfo == null) {
            return false;
        }
        float width = ((effectPosInfo.centerPosX / 10000.0f) * ((float) this.ikM.width())) + ((float) this.ikM.left);
        float height = ((this.ilL.centerPosY / 10000.0f) * ((float) this.ikM.height())) + ((float) this.ikM.top);
        float width2 = (this.ilL.width / 10000.0f) * ((float) this.ikM.width());
        float height2 = (this.ilL.height / 10000.0f) * ((float) this.ikM.height());
        float f3 = width2 / 2.0f;
        this.ilN.left = width - f3;
        float f4 = height2 / 2.0f;
        this.ilN.top = height - f4;
        this.ilN.right = f3 + width;
        this.ilN.bottom = f4 + height;
        float[] d = d(this.ilN.left, this.ilN.top, width, height, this.ilL.degree);
        float[] d2 = d(this.ilN.right, this.ilN.top, width, height, this.ilL.degree);
        float[] d3 = d(this.ilN.left, this.ilN.bottom, width, height, this.ilL.degree);
        float[] d4 = d(this.ilN.right, this.ilN.bottom, width, height, this.ilL.degree);
        return a(new PointF[]{new PointF(d[0], d[1]), new PointF(d2[0], d2[1]), new PointF(d4[0], d4[1]), new PointF(d3[0], d3[1])}, f, f2);
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setPipTarget(List<PIPRegionControlModel> list) {
        this.imH = list;
        invalidate();
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setPipListener(a.g gVar) {
        this.imI = gVar;
    }

    @Override // com.quvideo.xiaoying.editorx.board.d.a
    public void setPipSelectedIndex(int i) {
        this.imJ = i;
        invalidate();
    }
}