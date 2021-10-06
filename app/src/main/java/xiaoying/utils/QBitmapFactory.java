package xiaoying.utils;

import android.graphics.Bitmap;

public final class QBitmapFactory {
    private static native int native_BitmapAlloc(Object obj, int i, int i2, int i3);

    private static native int native_ShareAndroidBitmapBufWithQBitmap(Bitmap bitmap, QBitmap qBitmap);

    public static QBitmap createQBitmapFromQBitmap(QBitmap qBitmap, boolean z) {
        if (z) {
            return qBitmap;
        }
        try {
            if (qBitmap.getBitmap() != null) {
                return new QBitmap(qBitmap.getBitmap());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static QBitmap createQBitmapFromNative(long j) {
        try {
            return new QBitmap(j, false, true);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static QBitmap createQBitmapBlank(int i, int i2, int i3) {
        try {
            QBitmap qBitmap = new QBitmap(0, true, false);
            if (native_BitmapAlloc(qBitmap, i3, i, i2) != 0) {
                return null;
            }
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (i3 == 1677721600) {
                config = Bitmap.Config.ALPHA_8;
            } else if (i3 == QColorSpace.QPAF_RGB16_R5G6B5) {
                config = Bitmap.Config.RGB_565;
            } else if (i3 == QColorSpace.QPAF_RGB16_R4G4B4) {
                config = Bitmap.Config.ARGB_4444;
            } else if (i3 == QColorSpace.QPAF_RGB32_A8R8G8B8) {
                config = Bitmap.Config.ARGB_8888;
            }
            qBitmap.setBitmap(Bitmap.createBitmap(i, i2, config));
            return qBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static QBitmap createQBitmapFromBitmap(Bitmap bitmap) {
        int i = 0;
        if (bitmap == null) {
            return null;
        }
        try {
            QBitmap qBitmap = new QBitmap(0, true, false);
            Bitmap.Config config = bitmap.getConfig();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width != 0) {
                if (height != 0) {
                    if (config == Bitmap.Config.ALPHA_8) {
                        i = QColorSpace.QPAF_GRAY8;
                    } else if (config == Bitmap.Config.ARGB_8888) {
                        i = QColorSpace.QPAF_RGB32_A8R8G8B8;
                    }
                    if (native_BitmapAlloc(qBitmap, i, width, height) == 0 && qBitmap.copyFromAndroidBitmap(bitmap) == 0) {
                        return qBitmap;
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static QBitmap createQBitmapBlank_noSkia(int i, int i2, int i3) {
        try {
            QBitmap qBitmap = new QBitmap(0, true, false);
            if (native_BitmapAlloc(qBitmap, i3, i, i2) == 0) {
                return qBitmap;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static QBitmap createQBitmapShareWithAndroidBitmap(int i, int i2, int i3) {
        try {
            QBitmap qBitmap = new QBitmap(true);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (i3 == 1677721600) {
                config = Bitmap.Config.ALPHA_8;
            } else if (i3 == QColorSpace.QPAF_RGB16_R5G6B5) {
                config = Bitmap.Config.RGB_565;
            } else if (i3 == QColorSpace.QPAF_RGB16_R4G4B4) {
                config = Bitmap.Config.ARGB_4444;
            } else if (i3 == QColorSpace.QPAF_RGB32_A8R8G8B8) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            if (createBitmap == null) {
                return null;
            }
            qBitmap.setBitmap(createBitmap);
            if (native_ShareAndroidBitmapBufWithQBitmap(createBitmap, qBitmap) == 0) {
                return qBitmap;
            }
            createBitmap.recycle();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static QBitmap constructQBitmapFromNativeHandle_noSkia(long j) {
        return new QBitmap(j);
    }
}