package xiaoying.engine.base;

import android.os.Build;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.regex.Pattern;
import xiaoying.engine.QEngine;
import xiaoying.engine.base.QStyle;
import xiaoying.engine.clip.QClip;
import xiaoying.engine.clip.QMediaSource;
import xiaoying.engine.clip.QUserData;
import xiaoying.engine.storyboard.QStoryboard;
import xiaoying.utils.QBitmap;
import xiaoying.utils.QBitmapFactory;
import xiaoying.utils.QPoint;
import xiaoying.utils.QSize;

public class QUtils {
    public static final int ANCHOR_ALIGN = 3;
    private static final int BACK_COVER_CLIP_INDEX = -2;
    public static final int BOTTEM_ALIGN = 1;
    public static final int CHECK_ALLOW_UNSEEKABLE = 131072;
    public static final int CHECK_AUDIO = 1;
    public static final int CHECK_BASE = 0;
    public static final int CHECK_NO_AUDIO_TRACK = 2;
    public static final int CHECK_VIDEO = 65536;
    public static final int COLOR_TYPE_BLACK = 1;
    public static final int COLOR_TYPE_BLUE = 7;
    public static final int COLOR_TYPE_GRAY = 2;
    public static final int COLOR_TYPE_GREEN = 6;
    public static final int COLOR_TYPE_NONE = 0;
    public static final int COLOR_TYPE_PURPLE = 8;
    public static final int COLOR_TYPE_RED = 4;
    public static final int COLOR_TYPE_WHITE = 3;
    public static final int COLOR_TYPE_YELLOW = 5;
    private static final int COVER_CLIP_INDEX = -1;
    public static final int HD_SUPPORT_BETA_TEST_FLAG = 16;
    public static final int HD_SUPPORT_TYPE_1080P = 2;
    public static final int HD_SUPPORT_TYPE_2K = 4;
    public static final int HD_SUPPORT_TYPE_4K = 8;
    public static final int HD_SUPPORT_TYPE_720P = 1;
    public static final int HD_SUPPORT_TYPE_NO = 0;
    public static final int HEAD_ALIGN = 2;
    public static final int HW_BETA_TESTED_FLAG_COUNT = 1;
    public static final int HW_CODEC_CAP_GPURENDER_LEN = 32;
    public static final int HW_DECODER_CAP_COUNT = 25;
    public static final int HW_ENCODER_CAP_COUNT = 5;
    public static final int LAYOUT_MODE_NONE = 0;
    public static final int LAYOUT_MODE_W16_H9 = 8;
    public static final int LAYOUT_MODE_W1_H1 = 16;
    public static final int LAYOUT_MODE_W3_H4 = 1;
    public static final int LAYOUT_MODE_W4_H3 = 2;
    public static final int LAYOUT_MODE_W9_H16 = 4;
    public static final double MIN_NSX_CPU_FREQ = 1500000.0d;
    public static final int SOURCE_XML_TYPE_BASE = 0;
    public static final int SOURCE_XML_TYPE_EFFECT = 0;
    public static final int TOP_ALIGN = 0;
    public static final int TRSNSCODE_REASON_1CORE_BASE = 1300;
    public static final int TRSNSCODE_REASON_2CORE_BASE = 1400;
    public static final int TRSNSCODE_REASON_4CORE_BASE = 1500;
    public static final int TRSNSCODE_REASON_COMM_BASE = 1000;
    public static final int TRSNSCODE_REASON_PASTER_BASE = 1600;
    public static final int TRSNSCODE_REASON_PIP_BASE = 1100;
    public static final int TRSNSCODE_REASON_RVS_BASE = 1200;
    public static final int UNSUPPORTED_ACODEC = 4;
    public static final int UNSUPPORTED_FILE = 1;
    public static final int UNSUPPORTED_IMAGECODEC = 5;
    public static final int UNSUPPORTED_MPEG4_HEADER = 8;
    public static final int UNSUPPORTED_NOAUDIO = 7;
    public static final int UNSUPPORTED_NONE = 0;
    public static final int UNSUPPORTED_NOVIDEO = 6;
    public static final int UNSUPPORTED_RESOLUTION = 2;
    public static final int UNSUPPORTED_VCODEC = 3;
    public static final int UNSUPPORT_H264_HEADER = 10;
    public static final int UNSUPPORT_UNSEEKABLE = 9;
    public static final int VIDEO_BITRATE_MODE_ABR_HIGH = 2;
    public static final int VIDEO_BITRATE_MODE_ABR_LOW = 1;
    public static final int VIDEO_BITRATE_MODE_ABR_VERY_LOW = 4;
    public static final int VIDEO_BITRATE_MODE_CRF = 3;
    public static final int VIDEO_IMPORT_FORMAT_COUNT = 8;
    public static final int VIDEO_RES_1080P_H264 = 5;
    public static final int VIDEO_RES_1080P_H264_INTERLACE = 12;
    public static final int VIDEO_RES_1080P_HEIGHT = 1080;
    public static final int VIDEO_RES_1080P_MPEG4 = 0;
    public static final int VIDEO_RES_1080P_WIDTH = 1920;
    public static final int VIDEO_RES_2K_H264 = 16;
    public static final int VIDEO_RES_2K_H264_INTERLACE = 17;
    public static final int VIDEO_RES_2K_HEIGHT = 1600;
    public static final int VIDEO_RES_2K_WIDTH = 2560;
    public static final int VIDEO_RES_4K_H264 = 4;
    public static final int VIDEO_RES_4K_H264_INTERLACE = 11;
    public static final int VIDEO_RES_4K_HEIGHT = 2160;
    public static final int VIDEO_RES_4K_WIDTH = 3840;
    public static final int VIDEO_RES_720P_H264 = 6;
    public static final int VIDEO_RES_720P_H264_INTERLACE = 13;
    public static final int VIDEO_RES_720P_HEIGHT = 720;
    public static final int VIDEO_RES_720P_MPEG4 = 1;
    public static final int VIDEO_RES_720P_WIDTH = 1280;
    public static final int VIDEO_RES_FWVGA_H264 = 7;
    public static final int VIDEO_RES_FWVGA_H264_INTERLACE = 14;
    public static final int VIDEO_RES_FWVGA_HEIGHT = 480;
    public static final int VIDEO_RES_FWVGA_MPEG4 = 2;
    public static final int VIDEO_RES_FWVGA_WIDTH = 854;
    public static final int VIDEO_RES_QVGA_H264 = 10;
    public static final int VIDEO_RES_QVGA_HEIGHT = 240;
    public static final int VIDEO_RES_QVGA_MPEG4 = 9;
    public static final int VIDEO_RES_QVGA_WIDTH = 320;
    public static final int VIDEO_RES_VGA_H264 = 8;
    public static final int VIDEO_RES_VGA_H264_INTERLACE = 15;
    public static final int VIDEO_RES_VGA_HEIGHT = 480;
    public static final int VIDEO_RES_VGA_MPEG4 = 3;
    public static final int VIDEO_RES_VGA_WIDTH = 640;

    public static class Geo {
        public int headWidth;
        public int height;
        public QPoint jaw = new QPoint();
        public int width;
        public int x;
        public int y;
    }

    public static class PreprocessArgs {
        public QPoint anchor = new QPoint();
        public Geo geo = new Geo();
        public int targetHeadSize;
        public int targetHeight;
        public int targetWidth;
        public int type;
    }

    public static class QVideoImportFormat {
        public int mHeight;
        public int mVideoFormat;
        public int mWidth;
    }

    public static float getAudioDeltaPitch(float f) {
        if (f < 0.1f || f > 10.0f) {
            return 0.0f;
        }
        float f2 = 1.0f / f;
        if (f2 >= 1.0f) {
            return 12.0f * (f2 - 1.0f);
        }
        if (0.0f >= f2 || f2 >= 1.0f) {
            return 0.0f;
        }
        return -6.0f / f2;
    }

    public static int getLayoutMode(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 2;
        }
        if (i == i2) {
            return 16;
        }
        float f = ((float) i) / ((float) i2);
        if (i > i2) {
            float f2 = f - 1.3333334f;
            float f3 = f - 1.7777778f;
            if (f2 < 0.0f) {
                f2 = -f2;
            }
            if (f3 < 0.0f) {
                f3 = -f3;
            }
            return f2 < f3 ? 2 : 8;
        }
        float f4 = f - 0.75f;
        float f5 = f - 0.5625f;
        if (f4 < 0.0f) {
            f4 = -f4;
        }
        if (f5 < 0.0f) {
            f5 = -f5;
        }
        return f4 < f5 ? 1 : 4;
    }

    private static native int nativeFileEditable(QEngine qEngine, String str, int i);

    private static native int nativeGPURender(byte[] bArr, int[] iArr);

    private static native int nativeGenerateSVGFile(String str, String str2, String str3, String str4, int i, int i2);

    private static native int nativeGenerateSVGFileFromTemplate(int i, String str, String str2, String str3, String str4, int i2, int i3, Integer num);

    private static native int nativeGetAnimatedFrameBitmap(QEngine qEngine, String str, int i, QBitmap qBitmap);

    private static native QStyle.QAnimatedFrameTemplateInfo nativeGetAnimatedFrameInfo(QEngine qEngine, String str, QSize qSize);

    private static native int nativeGetCurveTime(QClip.QCurveSpeedPoints qCurveSpeedPoints, int i);

    private static native int nativeGetGopTime(QEngine qEngine, String str);

    private static native boolean nativeGetHWBetaTestedFlag(QEngine qEngine);

    private static native int nativeGetHWCodecCap(String str, int[] iArr, boolean[] zArr, int[] iArr2, byte[] bArr, int[] iArr3, boolean[] zArr2);

    private static native int nativeGetHWVDecoderCount(QEngine qEngine);

    private static native int nativeGetHWVDecoderVersion();

    private static native int nativeGetHWVEncoderVersion();

    private static native int nativeGetProjectVersion(String str);

    private static native QSize nativeGetSVGOriginalSize(String str);

    private static native int nativeGetSVGThumbnail(QEngine qEngine, QBitmap qBitmap, QBubbleTextSource qBubbleTextSource, int i, int i2);

    private static native QSourceExtInfo nativeGetSourceExtInfo(QEngine qEngine, String str);

    private static native QUserData nativeGetTemplateParamData(QEngine qEngine, String str, int i, QSize qSize);

    private static native int nativeGetThemeCover(QEngine qEngine, String str, QMediaSource[] qMediaSourceArr, int i, int i2, String str2);

    private static native QVideoInfo nativeGetVideoInfo(QEngine qEngine, String str);

    private static native int nativeGetVideoInfoAndSrcExtInfo(QEngine qEngine, String str, QVideoInfo qVideoInfo, QSourceExtInfo qSourceExtInfo);

    private static native String nativeGetWMTagFromFile(String str);

    private static native boolean nativeIsInterlaceFile(QEngine qEngine, String str);

    private static native boolean nativeIsNeedTranscode(QEngine qEngine, QVideoImportParam qVideoImportParam, int[] iArr, int[] iArr2);

    private static native boolean nativeIsPureBG(QBitmap qBitmap, int[] iArr, QPoint qPoint, byte[] bArr);

    private static native Object nativeObjectFromXml(QEngine qEngine, String str, int i);

    private static native int nativeObjectToXml(QEngine qEngine, Object obj, String str);

    private static native int nativePreprocessImg(QEngine qEngine, String str, String str2, PreprocessArgs preprocessArgs);

    private static native int nativeQueryHWDecCap(QEngine qEngine, int i, int i2, int i3, boolean z);

    private static native boolean nativeQueryHWEncCap(QEngine qEngine, int i, int i2, int i3);

    private static native int nativeReleaseAllHWDecoder(QEngine qEngine);

    private static native int nativeSavePngFromQBitmap(QBitmap qBitmap, String str);

    private static native int nativeSetEnableHWDecoderPool(QEngine qEngine, boolean z);

    private static native Object[] nativetGetMaterialNeedSupportList(String str);

    public static int preprocessImg(QEngine qEngine, String str, String str2, PreprocessArgs preprocessArgs) {
        return nativePreprocessImg(qEngine, str, str2, preprocessArgs);
    }

    public static int generateSVGFile(String str, String str2, String str3, String str4, int i, int i2) {
        return nativeGenerateSVGFile(str, str2, str3, str4, i, i2);
    }

    public static QBitmap getSVGThumbnail(QEngine qEngine, QBubbleTextSource qBubbleTextSource, int i, int i2, int i3, int i4, int i5) {
        QBitmap createQBitmapBlank = QBitmapFactory.createQBitmapBlank(i2, i3, i);
        if (createQBitmapBlank == null) {
            return null;
        }
        if (nativeGetSVGThumbnail(qEngine, createQBitmapBlank, qBubbleTextSource, i4, i5) == 0) {
            return createQBitmapBlank;
        }
        createQBitmapBlank.recycle();
        return null;
    }

    public static int isFileEditable(QEngine qEngine, String str, int i) {
        return nativeFileEditable(qEngine, str, i);
    }

    public static QVideoInfo getVideoInfo(QEngine qEngine, String str) {
        return nativeGetVideoInfo(qEngine, str);
    }

    public static QSourceExtInfo getSourceExtInfo(QEngine qEngine, String str) {
        return nativeGetSourceExtInfo(qEngine, str);
    }

    public static int getVideoInfoAndSrcExtInfo(QEngine qEngine, String str, QVideoInfo qVideoInfo, QSourceExtInfo qSourceExtInfo) {
        return nativeGetVideoInfoAndSrcExtInfo(qEngine, str, qVideoInfo, qSourceExtInfo);
    }

    public static int getThemeCover(QEngine qEngine, String str, QMediaSource[] qMediaSourceArr, int i, int i2, String str2) {
        return nativeGetThemeCover(qEngine, str, qMediaSourceArr, i, i2, str2);
    }

    public static int SetEnableHWDecoderPool(QEngine qEngine, boolean z) {
        return nativeSetEnableHWDecoderPool(qEngine, z);
    }

    public static int ReleaseAllHWDecoder(QEngine qEngine) {
        return nativeReleaseAllHWDecoder(qEngine);
    }

    public static int GetHWDecoderVersion() {
        return nativeGetHWVDecoderVersion();
    }

    public static int GetHWEncoderVersion() {
        return nativeGetHWVEncoderVersion();
    }

    public static int GetHWVDecoderCount(QEngine qEngine) {
        return nativeGetHWVDecoderCount(qEngine);
    }

    public static QSize getSVGOriginalSize(String str) {
        return nativeGetSVGOriginalSize(str);
    }

    public static int convertPosition(int i, float f, boolean z) {
        long j;
        int i2 = (int) (f * 10000.0f);
        if (z) {
            j = (((long) i) * 10000) / ((long) i2);
        } else {
            j = (((long) i) * ((long) i2)) / 10000;
        }
        return (int) j;
    }

    public static int getHWCodecCap(String str, int[] iArr, boolean[] zArr, int[] iArr2, byte[] bArr, int[] iArr3, boolean[] zArr2) {
        return nativeGetHWCodecCap(str, iArr, zArr, iArr2, bArr, iArr3, zArr2);
    }

    public static int geGPURender(byte[] bArr, int[] iArr) {
        return nativeGPURender(bArr, iArr);
    }

    public static QStyle.QAnimatedFrameTemplateInfo getAnimatedFrameInfo(QEngine qEngine, String str, QSize qSize) {
        return nativeGetAnimatedFrameInfo(qEngine, str, qSize);
    }

    public static int getAnimatedFrameBitmap(QEngine qEngine, String str, int i, QBitmap qBitmap) {
        return nativeGetAnimatedFrameBitmap(qEngine, str, i, qBitmap);
    }

    public static boolean QueryHWEncCap(QEngine qEngine, int i, int i2, int i3) {
        return nativeQueryHWEncCap(qEngine, i, i2, i3);
    }

    public static int QueryHWDecCap(QEngine qEngine, int i, int i2, int i3, boolean z) {
        return nativeQueryHWDecCap(qEngine, i, i2, i3, z);
    }

    public static boolean IsInterlaceFile(QEngine qEngine, String str) {
        return nativeIsInterlaceFile(qEngine, str);
    }

    public static boolean GetBetaTestedFlag(QEngine qEngine) {
        return nativeGetHWBetaTestedFlag(qEngine);
    }

    public static boolean IsNeedTranscode(QEngine qEngine, QVideoImportParam qVideoImportParam, int[] iArr) {
        return IsNeedTranscodeWithReason(qEngine, qVideoImportParam, iArr, null);
    }

    public static boolean IsNeedTranscodeWithReason(QEngine qEngine, QVideoImportParam qVideoImportParam, int[] iArr, int[] iArr2) {
        boolean z = true;
        boolean z2 = qVideoImportParam.getHWEncFlag() && Build.VERSION.SDK_INT >= 18;
        qVideoImportParam.setHWEncFlag(z2);
        qVideoImportParam.setHWDecFlag(qVideoImportParam.getHWDecflag() && Build.VERSION.SDK_INT >= 16);
        if (!qVideoImportParam.getHDOutputFlag() || !z2 || IsSupportHD(qEngine) == 0) {
            z = false;
        }
        qVideoImportParam.setHDOutputFlag(z);
        return nativeIsNeedTranscode(qEngine, qVideoImportParam, iArr, iArr2);
    }

    public static int GetGopTime(QEngine qEngine, String str) {
        return nativeGetGopTime(qEngine, str);
    }

    public static QVideoImportFormat TransformVImportFormat(int i) {
        QVideoImportFormat qVideoImportFormat = new QVideoImportFormat();
        switch (i) {
            case 0:
                qVideoImportFormat.mVideoFormat = 2;
                qVideoImportFormat.mWidth = 1920;
                qVideoImportFormat.mHeight = VIDEO_RES_1080P_HEIGHT;
                return qVideoImportFormat;
            case 1:
                qVideoImportFormat.mVideoFormat = 2;
                qVideoImportFormat.mWidth = VIDEO_RES_720P_WIDTH;
                qVideoImportFormat.mHeight = VIDEO_RES_720P_HEIGHT;
                return qVideoImportFormat;
            case 2:
                qVideoImportFormat.mVideoFormat = 2;
                qVideoImportFormat.mWidth = VIDEO_RES_FWVGA_WIDTH;
                qVideoImportFormat.mHeight = 480;
                return qVideoImportFormat;
            case 3:
                qVideoImportFormat.mVideoFormat = 2;
                qVideoImportFormat.mWidth = VIDEO_RES_VGA_WIDTH;
                qVideoImportFormat.mHeight = 480;
                return qVideoImportFormat;
            case 4:
            default:
                return null;
            case 5:
                qVideoImportFormat.mVideoFormat = 4;
                qVideoImportFormat.mWidth = 1920;
                qVideoImportFormat.mHeight = VIDEO_RES_1080P_HEIGHT;
                return qVideoImportFormat;
            case 6:
                qVideoImportFormat.mVideoFormat = 4;
                qVideoImportFormat.mWidth = VIDEO_RES_720P_WIDTH;
                qVideoImportFormat.mHeight = VIDEO_RES_720P_HEIGHT;
                return qVideoImportFormat;
            case 7:
                qVideoImportFormat.mVideoFormat = 4;
                qVideoImportFormat.mWidth = VIDEO_RES_FWVGA_WIDTH;
                qVideoImportFormat.mHeight = 480;
                return qVideoImportFormat;
            case 8:
                qVideoImportFormat.mVideoFormat = 4;
                qVideoImportFormat.mWidth = VIDEO_RES_VGA_WIDTH;
                qVideoImportFormat.mHeight = 480;
                return qVideoImportFormat;
            case 9:
                qVideoImportFormat.mVideoFormat = 2;
                qVideoImportFormat.mWidth = VIDEO_RES_QVGA_WIDTH;
                qVideoImportFormat.mHeight = 240;
                return qVideoImportFormat;
            case 10:
                qVideoImportFormat.mVideoFormat = 4;
                qVideoImportFormat.mWidth = VIDEO_RES_QVGA_WIDTH;
                qVideoImportFormat.mHeight = 240;
                return qVideoImportFormat;
        }
    }

    public static int GetProjectVersion(String str) {
        return nativeGetProjectVersion(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int IsSupportHD(xiaoying.engine.QEngine r10) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: xiaoying.engine.base.QUtils.IsSupportHD(xiaoying.engine.QEngine):int");
    }

    public static int calStoryboardFps(QStoryboard qStoryboard, int i) {
        QClip qClip;
        int i2;
        int i3 = 0;
        if (qStoryboard != null) {
            int i4 = 0;
            while (i3 < qStoryboard.getClipCount() + 2) {
                if (i3 == qStoryboard.getClipCount()) {
                    qClip = qStoryboard.getClip(-1);
                } else if (i3 == qStoryboard.getClipCount() + 1) {
                    qClip = qStoryboard.getClip(-2);
                } else {
                    qClip = qStoryboard.getClip(i3);
                }
                if (qClip != null) {
                    if (((Integer) qClip.getProperty(12289)).intValue() == 1) {
                        i2 = ((((QVideoInfo) qClip.getProperty(12291)).get(9) / 1000) * 10000) / ((int) (((Float) qClip.getProperty(12293)).floatValue() * 10000.0f));
                        if (i2 > i) {
                            i2 = i;
                        }
                        if (i2 <= i4) {
                        }
                    } else {
                        i2 = ((QVideoInfo) qClip.getProperty(12291)).get(9) / 1000;
                        if (i2 <= i4) {
                        }
                    }
                    i4 = i2;
                }
                i3++;
            }
            i3 = ((Integer) qStoryboard.getProperty(QStoryboard.PROP_STUFF_CLIP_FPS)).intValue();
            if (i3 > i) {
                i3 = i;
            }
            if (i3 <= i4) {
                i3 = i4;
            }
        }
        int floatValue = (i3 * 10000) / ((int) (((Float) qStoryboard.getProperty(QStoryboard.PROP_TIME_SCALE)).floatValue() * 10000.0f));
        if (floatValue <= i) {
            i = floatValue;
        }
        if (i < 10) {
            return 10;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r11 != 4) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r11 != 4) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        if (r11 == 4) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int caculateVideoBitrate(xiaoying.engine.QEngine r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: xiaoying.engine.base.QUtils.caculateVideoBitrate(xiaoying.engine.QEngine, int, int, int, int, int, int, int):int");
    }

    private static int getCpuNumber() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                /* class xiaoying.engine.base.QUtils.AnonymousClass1CpuFilter */

                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            }).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static String getMaxCpuFreq() {
        String str;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            str = "";
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            str = "N/A";
        }
        return str.trim();
    }

    public static boolean IsSupportNSX() {
        if (getCpuNumber() < 4) {
            return false;
        }
        String maxCpuFreq = getMaxCpuFreq();
        if (!maxCpuFreq.equals("N/A") && maxCpuFreq.length() != 0) {
            try {
                if (Double.parseDouble(maxCpuFreq) > 1500000.0d) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static QUserData getTemplateParamData(QEngine qEngine, String str, int i, QSize qSize) {
        return nativeGetTemplateParamData(qEngine, str, i, qSize);
    }

    public static String getWMTagFromFile(String str) {
        return nativeGetWMTagFromFile(str);
    }

    public static boolean isPureBG(QBitmap qBitmap, int[] iArr, QPoint qPoint, byte[] bArr) {
        return nativeIsPureBG(qBitmap, iArr, qPoint, bArr);
    }

    public static Object[] GetMaterialNeedSupportList(String str) {
        return nativetGetMaterialNeedSupportList(str);
    }

    public static int SavePngFromQBitmap(QBitmap qBitmap, String str) {
        return nativeSavePngFromQBitmap(qBitmap, str);
    }

    public static int ObjectToXml(QEngine qEngine, Object obj, String str) {
        return nativeObjectToXml(qEngine, obj, str);
    }

    public static Object ObjectFromXml(QEngine qEngine, String str, int i) {
        return nativeObjectFromXml(qEngine, str, i);
    }

    public static int GetCurveTime(QClip.QCurveSpeedPoints qCurveSpeedPoints, int i) {
        return nativeGetCurveTime(qCurveSpeedPoints, i);
    }
}