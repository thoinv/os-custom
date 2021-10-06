package xiaoying.utils;

import android.graphics.Bitmap;

public final class QAndroidBitmapFactory {
    private static native int native_TransformQBitmapIntoBitmap(Object obj, Object obj2);

    public static QBitmap createQBitmapFromBitmap(Bitmap bitmap, boolean z) {
        try {
            return new QBitmap(bitmap);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Bitmap createBitmapFromQBitmap(QBitmap qBitmap, boolean z) {
        Bitmap.Config config;
        if (qBitmap == null) {
            return null;
        }
        try {
            if (qBitmap.getBitmap() != null && z) {
                return Bitmap.createBitmap(qBitmap.getBitmap());
            }
            int colorSpace = qBitmap.getColorSpace();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (QColorSpace.QPAF_RGB32_A8R8G8B8 == colorSpace) {
                config = Bitmap.Config.ARGB_8888;
            } else if (QColorSpace.QPAF_RGB16_R5G6B5 == colorSpace) {
                config = Bitmap.Config.RGB_565;
            } else if (1677721600 != colorSpace) {
                return null;
            } else {
                config = Bitmap.Config.ALPHA_8;
            }
            Bitmap createBitmap = Bitmap.createBitmap(qBitmap.getWidth(), qBitmap.getHeight(), config);
            transformQBitmapIntoBitmap(qBitmap, createBitmap);
            return createBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int transformQBitmapIntoBitmap(QBitmap qBitmap, Bitmap bitmap) {
        if (!(qBitmap == null || bitmap == null)) {
            try {
                return native_TransformQBitmapIntoBitmap(qBitmap, bitmap);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 2;
    }
}