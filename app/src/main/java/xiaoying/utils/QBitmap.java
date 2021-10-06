package xiaoying.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class QBitmap {
    public static final int RESIZE_BILINEAR = 2;
    public static final int RESIZE_NEAREST_NEIGHBOUR = 1;
    protected int mBitmap_ref;
    protected long mNativeBitmap;
    protected boolean mNeedFree;
    protected boolean mRecycled;
    protected boolean mShared;
    protected boolean mSharedWithAndroidBmp;
    protected Bitmap m_SKBMP;

    private native int native_BitmapFree(Object obj);

    private native int native_FreeQBitmapStructOnly(long j);

    private native int native_GetBitmapColorSpace(long j);

    private native int native_GetBitmapHeight(long j);

    private native int[] native_GetBitmapPointColorValue(int i, int i2, long j);

    private native int[] native_GetBitmapRowBytes(long j);

    private native int native_GetBitmapWidth(long j);

    private native int native_copyFromAndroidBitmap(Bitmap bitmap);

    public int save(int i, QStream qStream, int i2) {
        return 0;
    }

    private QBitmap() {
        this.m_SKBMP = null;
        this.mNeedFree = false;
        this.mRecycled = false;
        this.mShared = false;
        this.mSharedWithAndroidBmp = false;
        this.mNeedFree = false;
        this.mNativeBitmap = 0;
    }

    public QBitmap(Bitmap bitmap) {
        this.m_SKBMP = null;
        this.mNeedFree = false;
        this.mRecycled = false;
        this.mShared = false;
        this.mSharedWithAndroidBmp = false;
        try {
            this.m_SKBMP = bitmap.copy(bitmap.getConfig(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mNeedFree = false;
        this.mNativeBitmap = 0;
    }

    public QBitmap(long j, boolean z, boolean z2) {
        this.m_SKBMP = null;
        this.mNeedFree = false;
        this.mRecycled = false;
        this.mShared = false;
        this.mSharedWithAndroidBmp = false;
        this.mNativeBitmap = j;
        this.mNeedFree = z;
        this.mShared = z2;
        if (j != 0) {
            try {
                this.m_SKBMP = QAndroidBitmapFactory.createBitmapFromQBitmap(this, z2);
            } catch (Throwable unused) {
            }
        }
    }

    public QBitmap(long j) {
        this.m_SKBMP = null;
        this.mNeedFree = false;
        this.mRecycled = false;
        this.mShared = false;
        this.mSharedWithAndroidBmp = false;
        this.mNativeBitmap = j;
        this.mNeedFree = false;
    }

    public QBitmap(boolean z) {
        this.m_SKBMP = null;
        this.mNeedFree = false;
        this.mRecycled = false;
        this.mShared = false;
        this.mSharedWithAndroidBmp = false;
        this.mNativeBitmap = 0;
        this.mSharedWithAndroidBmp = z;
    }

    public Bitmap getBitmap() {
        return this.m_SKBMP;
    }

    public int setBitmap(Bitmap bitmap) {
        this.m_SKBMP = bitmap;
        return 0;
    }

    public int copyFromAndroidBitmap(Bitmap bitmap) {
        return native_copyFromAndroidBitmap(bitmap);
    }

    public void recycle() {
        if (!this.mRecycled) {
            deH();
            this.mRecycled = true;
        }
    }

    public final boolean isRecycled() {
        return this.mRecycled;
    }

    public final int getWidth() {
        try {
            if (this.m_SKBMP != null) {
                return this.m_SKBMP.getWidth();
            }
            return native_GetBitmapWidth(this.mNativeBitmap);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int getHeight() {
        try {
            if (this.m_SKBMP != null) {
                return this.m_SKBMP.getHeight();
            }
            return native_GetBitmapHeight(this.mNativeBitmap);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int getColorSpace() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        try {
            if (this.m_SKBMP == null) {
                return native_GetBitmapColorSpace(this.mNativeBitmap);
            }
            int i = AnonymousClass1.bPr[this.m_SKBMP.getConfig().ordinal()];
            if (i == 1) {
                return QColorSpace.QPAF_GRAY8;
            }
            if (i == 2) {
                return QColorSpace.QPAF_RGB16_R4G4B4;
            }
            if (i == 3) {
                return QColorSpace.QPAF_RGB32_A8R8G8B8;
            }
            if (i != 4) {
                return 0;
            }
            return QColorSpace.QPAF_RGB16_R5G6B5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: xiaoying.utils.QBitmap$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static int[] bPr;
        // FIXME: 10/5/2021 AnonymousClass1
//        static final /* synthetic */ int[] bPr;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
//        static {
//            /*
//                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
//                int r0 = r0.length
//                int[] r0 = new int[r0]
//                xiaoying.utils.QBitmap.AnonymousClass1.bPr = r0
//                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
//                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
//                r2 = 1
//                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
//            L_0x0012:
//                int[] r0 = xiaoying.utils.QBitmap.AnonymousClass1.bPr     // Catch:{ NoSuchFieldError -> 0x001d }
//                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x001d }
//                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
//                r2 = 2
//                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
//            L_0x001d:
//                int[] r0 = xiaoying.utils.QBitmap.AnonymousClass1.bPr     // Catch:{ NoSuchFieldError -> 0x0028 }
//                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0028 }
//                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
//                r2 = 3
//                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
//            L_0x0028:
//                int[] r0 = xiaoying.utils.QBitmap.AnonymousClass1.bPr     // Catch:{ NoSuchFieldError -> 0x0033 }
//                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0033 }
//                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
//                r2 = 4
//                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
//            L_0x0033:
//                return
//            */
//            throw new UnsupportedOperationException("Method not decompiled: xiaoying.utils.QBitmap.AnonymousClass1.<clinit>():void");
//        }
    }

    public final int[] getRowBytes() {
        try {
            if (this.m_SKBMP == null) {
                return native_GetBitmapRowBytes(this.mNativeBitmap);
            }
            return new int[]{this.m_SKBMP.getRowBytes()};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int deH() {
        try {
            if (this.mSharedWithAndroidBmp) {
                if (this.m_SKBMP != null && !this.m_SKBMP.isRecycled()) {
                    this.m_SKBMP.recycle();
                    this.m_SKBMP = null;
                }
                native_FreeQBitmapStructOnly(this.mNativeBitmap);
                this.mNativeBitmap = 0;
                return 0;
            }
            if (this.mNativeBitmap != 0 && this.mNeedFree) {
                native_BitmapFree(this);
                this.mNativeBitmap = 0;
            }
            if (this.m_SKBMP != null) {
                if (!this.m_SKBMP.isRecycled()) {
                    this.m_SKBMP.recycle();
                }
                this.m_SKBMP = null;
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            deH();
        } catch (Throwable unused) {
        }
        super.finalize();
    }

    public int save(int i, String str, int i2) {
        try {
            if (this.m_SKBMP != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(str);
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (i == 2) {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    } else if (i == 8) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    this.m_SKBMP.compress(compressFormat, i2, fileOutputStream);
                    try {
                        fileOutputStream.close();
                        return 0;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return 1;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return 1;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 1;
    }

    public static Bitmap setAlpha(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3) {
        int i4;
        int i5;
        int[] iArr;
        if (bitmap == null) {
            return null;
        }
        int i6 = 0;
        if (bitmap2 != null) {
            try {
                if (bitmap2.getConfig() != Bitmap.Config.ALPHA_8 && bitmap2.getConfig() != Bitmap.Config.ARGB_8888) {
                    return null;
                }
                i5 = Math.min(bitmap.getWidth() - i, bitmap2.getWidth());
                i4 = Math.min(bitmap.getHeight() - i2, bitmap2.getHeight());
                int i7 = i5 * i4;
                int[] iArr2 = new int[i7];
                bitmap.getPixels(iArr2, 0, bitmap.getWidth(), i, i2, i5, i4);
                if (bitmap2.getConfig() == Bitmap.Config.ALPHA_8) {
                    byte[] bArr = new byte[(bitmap2.getRowBytes() * bitmap2.getHeight())];
                    bitmap2.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
                    while (i6 < i7) {
                        iArr2[i6] = ((((255 - (bArr[i6] & 255)) * i3) / 100) << 24) | (iArr2[i6] & 16777215);
                        i6++;
                    }
                } else {
                    int[] iArr3 = new int[(bitmap2.getWidth() * bitmap2.getHeight())];
                    bitmap2.getPixels(iArr3, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                    while (i6 < i7) {
                        iArr2[i6] = ((((255 - (iArr3[i6] & 255)) * i3) / 100) << 24) | (iArr2[i6] & 16777215);
                        i6++;
                    }
                }
                iArr = iArr2;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        } else {
            i5 = bitmap.getWidth();
            i4 = bitmap.getHeight();
            int i8 = i5 * i4;
            int[] iArr4 = new int[i8];
            bitmap.getPixels(iArr4, 0, bitmap.getWidth(), 0, 0, i5, i4);
            int i9 = (i3 * 255) / 100;
            while (i6 < i8) {
                iArr4[i6] = (i9 << 24) | (iArr4[i6] & 16777215);
                i6++;
            }
            iArr = iArr4;
        }
        return Bitmap.createBitmap(iArr, i5, i4, Bitmap.Config.ARGB_8888);
    }

    public int merge(QBitmap qBitmap, QPoint qPoint, QBitmap qBitmap2, QPoint qPoint2, int i) {
        Bitmap bitmap;
        try {
            if (this.m_SKBMP == null || qBitmap == null || qBitmap.m_SKBMP == null) {
                return 2;
            }
            if (qPoint == null) {
                return 2;
            }
            if (qBitmap2 != null) {
                bitmap = setAlpha(qBitmap.m_SKBMP, qBitmap2.m_SKBMP, qPoint2.x, qPoint2.y, i);
            } else {
                bitmap = setAlpha(qBitmap.m_SKBMP, null, qPoint2.x, qPoint2.y, i);
            }
            new Canvas(this.m_SKBMP).drawBitmap(bitmap, (float) qPoint.x, (float) qPoint.y, (Paint) null);
            if (bitmap.isRecycled()) {
                return 0;
            }
            bitmap.recycle();
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int fillColor(int i, QRect qRect, QBitmap qBitmap, int i2) {
        if (qRect == null) {
            return 2;
        }
        try {
            if (this.m_SKBMP == null) {
                return 2;
            }
            Paint paint = new Paint();
            paint.setColor(i);
            paint.setAlpha((i2 * 255) / 100);
            new Canvas(this.m_SKBMP).drawRect(new Rect(qRect.left, qRect.top, qRect.right, qRect.bottom), paint);
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int resample(QBitmap qBitmap, int i) {
        if (qBitmap == null) {
            return 2;
        }
        try {
            if (qBitmap.m_SKBMP == null) {
                return 2;
            }
            if (this.m_SKBMP == null) {
                return 2;
            }
            int width = this.m_SKBMP.getWidth();
            int height = this.m_SKBMP.getHeight();
            int width2 = qBitmap.getWidth();
            int height2 = qBitmap.getHeight();
            new Canvas(qBitmap.m_SKBMP).drawBitmap(this.m_SKBMP, new Rect(0, 0, width, height), new Rect(0, 0, width2, height2), (Paint) null);
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    public int crop(QBitmap qBitmap, QRect qRect) {
        try {
            if (this.m_SKBMP == null || qBitmap == null) {
                return 2;
            }
            if (qRect == null) {
                return 2;
            }
            qBitmap.m_SKBMP = Bitmap.createBitmap(this.m_SKBMP, qRect.left, qRect.top, qRect.right - qRect.left, qRect.bottom - qRect.top);
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int rotate(QBitmap qBitmap, int i) {
        if (qBitmap == null) {
            return 2;
        }
        try {
            if (this.m_SKBMP == null) {
                return 2;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i);
            qBitmap.m_SKBMP = Bitmap.createBitmap(this.m_SKBMP, 0, 0, this.m_SKBMP.getWidth(), this.m_SKBMP.getHeight(), matrix, false);
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int flip(QBitmap qBitmap, int i) {
        try {
            if (this.m_SKBMP != null) {
                if (qBitmap != null) {
                    Matrix matrix = new Matrix();
                    if (i == 1) {
                        matrix.preScale(-1.0f, 1.0f);
                    } else if (i == 2) {
                        matrix.preScale(1.0f, -1.0f);
                    }
                    qBitmap.m_SKBMP = Bitmap.createBitmap(this.m_SKBMP, 0, 0, this.m_SKBMP.getWidth(), this.m_SKBMP.getHeight(), matrix, false);
                    return 0;
                }
            }
            return 2;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int cropRotFlipResample(QBitmap qBitmap, QRect qRect, QRect qRect2, int i, int i2) {
        try {
            if (this.m_SKBMP == null || qBitmap == null || qRect == null) {
                return 2;
            }
            if (qRect2 == null) {
                return 2;
            }
            QBitmap qBitmap2 = new QBitmap();
            if (crop(qBitmap2, qRect) != 0) {
                return 1;
            }
            QBitmap qBitmap3 = new QBitmap();
            if (qBitmap2.rotate(qBitmap3, i) != 0) {
                return 1;
            }
            QBitmap qBitmap4 = new QBitmap();
            qBitmap3.flip(qBitmap4, i2);
            qBitmap4.resample(qBitmap, 0);
            if (!qBitmap2.isRecycled()) {
                qBitmap2.recycle();
            }
            if (!qBitmap3.isRecycled()) {
                qBitmap3.recycle();
            }
            if (!qBitmap4.isRecycled()) {
                qBitmap4.recycle();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    public int colorConvert(QBitmap qBitmap) {
        try {
            if (this.m_SKBMP == null || qBitmap == null) {
                return 2;
            }
            if (qBitmap.m_SKBMP == null) {
                return 2;
            }
            qBitmap.m_SKBMP = this.m_SKBMP.copy(qBitmap.m_SKBMP.getConfig(), false);
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    public int[] getBitmapPointColorValue(int i, int i2) {
        return native_GetBitmapPointColorValue(i, i2, this.mNativeBitmap);
    }
}