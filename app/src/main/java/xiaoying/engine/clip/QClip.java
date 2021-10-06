package xiaoying.engine.clip;

import xiaoying.engine.QEngine;
import xiaoying.engine.base.QRange;
import xiaoying.engine.base.QSession;
import xiaoying.engine.base.QSourceExtInfo;
import xiaoying.engine.base.QStyle;
import xiaoying.engine.base.QVEError;
import xiaoying.engine.base.QVideoInfo;
import xiaoying.utils.QBitmap;
import xiaoying.utils.QPoint;

public class QClip extends QSession {
    public static final Float AUDIO_PITCH_DELTA_VALUE_MEN_STYLE = Float.valueOf(-7.0f);
    public static final Float AUDIO_PITCH_DELTA_VALUE_WOMAN_STYLE = Float.valueOf(4.0f);
    public static final int CLIP_FLIP_NONE = 0;
    public static final int CLIP_FLIP_X = 1;
    public static final int CLIP_FLIP_Y = 2;
    public static final int CLIP_TYPE_BASE_INTERNAL = 4096;
    public static final int COVER_TYPE_BACKCOVER = 2;
    public static final int COVER_TYPE_COVER = 1;
    public static final int COVER_TYPE_NONE = 0;
    public static final int PROP_AUDIO_ADJUSTDB = 12299;
    public static final int PROP_AUDIO_DISABLED = 12300;
    public static final int PROP_AUDIO_FADEIN = 12297;
    public static final int PROP_AUDIO_FADEOUT = 12298;
    public static final int PROP_AUDIO_MODIFY_BY_ASP = 12332;
    public static final int PROP_AUDIO_PITCH_DELTA = 12331;
    private static final int PROP_BASE = 12288;
    public static final int PROP_BUBBLE_BG_COLOR = 12306;
    public static final int PROP_BUBBLE_HOR_REVERSAL = 12308;
    public static final int PROP_BUBBLE_REGION_RATIO = 12311;
    public static final int PROP_BUBBLE_ROTATE_ANGLE = 12309;
    public static final int PROP_BUBBLE_ROTATE_CENTER = 12310;
    public static final int PROP_BUBBLE_TRANSPARENCY = 12312;
    public static final int PROP_BUBBLE_VER_REVERSAL = 12307;
    public static final int PROP_CLIP_AUDIO_GAIN = 12347;
    public static final int PROP_CLIP_AUDIO_IS_NEED_NSX = 12349;
    public static final int PROP_CLIP_AUDIO_MIX_PERCENT = 12319;
    public static final int PROP_CLIP_CAM_EXPORT_EFFECT_DATA_LIST = 12343;
    public static final int PROP_CLIP_CLIP_SEG_MASK = 12363;
    public static final int PROP_CLIP_CROP_REGION = 12314;
    public static final int PROP_CLIP_CURVE_SCALE_RANGE = 12366;
    public static final int PROP_CLIP_CURVE_SPEED_POINTS = 12362;
    public static final int PROP_CLIP_CURVE_SRC_RANGE = 12365;
    public static final int PROP_CLIP_DISPLAY_3D_TRANSFROM = 12373;
    public static final int PROP_CLIP_ENABLE_LOOP_MODE = 12356;
    public static final int PROP_CLIP_EQ_BAND_FREQUENCY = 12354;
    public static final int PROP_CLIP_EQ_BAND_VALUE = 12353;
    public static final int PROP_CLIP_EQ_BAND_VALUE_LIST = 12355;
    public static final int PROP_CLIP_FACEMORPHING_DISABLE_CROP = 12376;
    public static final int PROP_CLIP_FILE_MISSING = 12320;
    public static final int PROP_CLIP_FLIP = 12342;
    public static final int PROP_CLIP_INVERSE_PLAY_AUDIO_FLAG = 12360;
    public static final int PROP_CLIP_INVERSE_PLAY_SOURCE_RANGE = 12346;
    public static final int PROP_CLIP_INVERSE_PLAY_TRIM_RANGE = 12345;
    public static final int PROP_CLIP_INVERSE_PLAY_VIDEO_FLAG = 12344;
    public static final int PROP_CLIP_IS_FRAME_MODE = 12337;
    public static final int PROP_CLIP_IS_REVERSE_CLIP = 12326;
    public static final int PROP_CLIP_IS_REVERSE_MODE = 12325;
    public static final int PROP_CLIP_IS_TIME_SCALE_USE_AUDIO_PITCH = 12361;
    public static final int PROP_CLIP_LOOP_RANGE = 12357;
    public static final int PROP_CLIP_LYRIC_ENABLE = 12336;
    public static final int PROP_CLIP_MEDIA_DURATION = 12341;
    public static final int PROP_CLIP_NORMAL_SOURCE = 12350;
    public static final int PROP_CLIP_PANZOOM_DISABLED = 12321;
    public static final int PROP_CLIP_RESET_SEG_MASK = 12367;
    public static final int PROP_CLIP_REVERSE_SOURCE = 12327;
    public static final int PROP_CLIP_REVERSE_SOURCE_CLEAR = 12358;
    public static final int PROP_CLIP_REVERSE_TRIM_MDOE = 12339;
    public static final int PROP_CLIP_REVERSE_TRIM_RANGE = 12340;
    public static final int PROP_CLIP_ROTATION = 12315;
    public static final int PROP_CLIP_SCENE_DURATION = 12333;
    public static final int PROP_CLIP_SINGLE_FRAME_PARAM = 12323;
    public static final int PROP_CLIP_SRC_RANGE = 12318;
    public static final int PROP_CLIP_UNIQUE_IDENTIFIER = 12348;
    public static final int PROP_CLIP_USE_SURFACETEXTURE = 12322;
    public static final int PROP_CLIP_UUID = 12359;
    public static final int PROP_CLIP_WATERMARK_CACHED = 12338;
    public static final int PROP_COVER_TYPE = 12313;
    public static final int PROP_PRIMAL_AUDIO_DISABLED = 12301;
    public static final int PROP_PRIMAL_VIDEO_DISABLED = 12305;
    public static final int PROP_RESAMPLE_MODE = 12295;
    public static final int PROP_SOURCE = 12290;
    public static final int PROP_SOURCE_INFO = 12291;
    public static final int PROP_TIME_SCALE = 12293;
    public static final int PROP_TRANSITION = 12294;
    public static final int PROP_TRIM_RANGE = 12292;
    public static final int PROP_TYPE = 12289;
    public static final int PROP_USERDATA = 12296;
    public static final int PROP_VIDEO_DISABLED = 12304;
    public static final int PROP_VIDEO_FADEIN = 12302;
    public static final int PROP_VIDEO_FADEOUT = 12303;
    public static final int STORYBOARD_CLIP = 4098;
    public static final int TYPE_AUDIO = 3;
    private static final int TYPE_BASE = 0;
    public static final int TYPE_BUBBLETEXT = 6;
    public static final int TYPE_IMAGE = 2;
    public static final int TYPE_SVG = 4;
    public static final int TYPE_SWF = 5;
    public static final int TYPE_VIDEO = 1;
    private long nativeThumbnailManager = 0;
    private long sphandle = 0;
    private long spweakhandle = 0;
    private long tmpbufferhandle = 0;

    public static class QCamExportedEffectData {
        public QStyle.QEffectPropertyData[] mPropData = null;
        public long mlTemplateID = 0;
    }

    public static class QCurveSpeedPoints {
        public int iMaxScale = 1;
        public QPoint[] points = null;
    }

    private native int nativeCreate(QEngine qEngine, QMediaSource qMediaSource, QClip qClip);

    private native int nativeCreateThumbnailManager(int i, int i2, int i3, boolean z, boolean z2);

    private native int nativeCreateWithInfo(QEngine qEngine, QMediaSource qMediaSource, int i, QVideoInfo qVideoInfo, QSourceExtInfo qSourceExtInfo);

    private native int nativeDestroy(QClip qClip);

    private native int nativeDestroyThumbnailManager(long j);

    private native int nativeDuplicate(QClip qClip, QClip qClip2);

    private native int nativeExtractAudioSample(long j, int i, int i2, byte[] bArr, byte[] bArr2, Integer[] numArr);

    private native QRange nativeGetCurveRange(long j, QRange qRange, boolean z);

    private native QEffect nativeGetEffect(long j, int i, int i2, int i3);

    private native QEffect nativeGetEffectByUuid(long j, String str);

    private native int nativeGetEffectCount(long j, int i, int i2);

    private native int nativeGetKeyFramePositonFromThumbnailMgr(long j, int i, boolean z);

    private native int nativeGetKeyframe(long j, QBitmap qBitmap, int i, boolean z, int i2);

    private native Object nativeGetProp(long j, int i);

    private native int nativeGetThumbnail(long j, QBitmap qBitmap, int i, boolean z);

    private native int nativeInsertEffect(long j, QEffect qEffect);

    private native QEffect nativeMergeEffect(long j, QEffect[] qEffectArr);

    private native int nativeMoveEffect(long j, QEffect qEffect, int i);

    private native int nativeRemoveEffect(long j, QEffect qEffect);

    private native int nativeReplaceWithSrc(QMediaSource qMediaSource, QRange qRange, QRange qRange2);

    private native QEffect[] nativeSeparationEffect(long j, QEffect qEffect);

    private native int nativeSetProp(long j, int i, Object obj);

    public int init(QEngine qEngine, QMediaSource qMediaSource) {
        return nativeCreate(qEngine, qMediaSource, this);
    }

    public int init(QEngine qEngine, QMediaSource qMediaSource, int i, QVideoInfo qVideoInfo, QSourceExtInfo qSourceExtInfo) {
        return nativeCreateWithInfo(qEngine, qMediaSource, i, qVideoInfo, qSourceExtInfo);
    }

    public int replaceWithSrc(QMediaSource qMediaSource, QRange qRange, QRange qRange2) {
        return nativeReplaceWithSrc(qMediaSource, qRange, qRange2);
    }

    @Override // xiaoying.engine.base.QSession
    public int unInit() {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeDestroy(this);
    }

    public int duplicate(QClip qClip) {
        return nativeDuplicate(this, qClip);
    }

    public int createThumbnailManager(int i, int i2, int i3, boolean z) {
        return nativeCreateThumbnailManager(i, i2, i3, false, z);
    }

    public int createThumbnailManager(int i, int i2, int i3, boolean z, boolean z2) {
        return nativeCreateThumbnailManager(i, i2, i3, z, z2);
    }

    public int destroyThumbnailManager() {
        long j = this.nativeThumbnailManager;
        if (0 == j) {
            return 0;
        }
        nativeDestroyThumbnailManager(j);
        return 0;
    }

    public int getThumbnail(QBitmap qBitmap, int i, boolean z) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        if (qBitmap == null) {
            return QVEError.QERR_COMMON_JAVA_INVALID_PARAM;
        }
        int nativeGetThumbnail = nativeGetThumbnail(this.handle, qBitmap, i, z);
        if (nativeGetThumbnail != 0) {
            return nativeGetThumbnail;
        }
        return 0;
    }

    public int getKeyframe(QBitmap qBitmap, int i, boolean z, int i2) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        if (qBitmap == null) {
            return QVEError.QERR_COMMON_JAVA_INVALID_PARAM;
        }
        int nativeGetKeyframe = nativeGetKeyframe(this.handle, qBitmap, i, z, i2);
        if (nativeGetKeyframe != 0) {
            return nativeGetKeyframe;
        }
        return 0;
    }

    public int extractAudioSample(int i, int i2, byte[] bArr, byte[] bArr2, Integer[] numArr) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeExtractAudioSample(this.handle, i, i2, bArr, bArr2, numArr);
    }

    public int insertEffect(QEffect qEffect) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeInsertEffect(this.handle, qEffect);
    }

    public int removeEffect(QEffect qEffect) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeRemoveEffect(this.handle, qEffect);
    }

    public int getEffectCountByGroup(int i, int i2) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeGetEffectCount(this.handle, i, i2);
    }

    public QEffect getEffectByGroup(int i, int i2, int i3) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetEffect(this.handle, i, i2, i3);
    }

    public QEffect getEffectByUuid(String str) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetEffectByUuid(this.handle, str);
    }

    public int moveEffect(QEffect qEffect, int i) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeMoveEffect(this.handle, qEffect, i);
    }

    @Override // xiaoying.engine.base.QSession
    public int setProperty(int i, Object obj) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeSetProp(this.handle, i, obj);
    }

    @Override // xiaoying.engine.base.QSession
    public Object getProperty(int i) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetProp(this.handle, i);
    }

    public int getRealVideoDuration() {
        Object property = getProperty(12291);
        Object property2 = getProperty(12293);
        Object property3 = getProperty(12289);
        int i = 0;
        if (property == null) {
            return 0;
        }
        int i2 = ((QVideoInfo) property).get(5);
        if (property3 != null) {
            i = ((Integer) property3).intValue();
        }
        int i3 = 10000;
        if (!(i == 4098 || property2 == null)) {
            i3 = (int) (((Float) property2).floatValue() * 10000.0f);
        }
        return (int) (((((long) i2) * ((long) i3)) + 9999) / 10000);
    }

    public QEffect mergeEffect(QEffect[] qEffectArr) {
        return nativeMergeEffect(this.handle, qEffectArr);
    }

    public QEffect[] separationEffect(QEffect qEffect) {
        return nativeSeparationEffect(this.handle, qEffect);
    }

    public int getKeyFramePositionFromThumbnailMgr(int i, boolean z) {
        long j = this.nativeThumbnailManager;
        if (0 == j) {
            return -1;
        }
        return nativeGetKeyFramePositonFromThumbnailMgr(j, i, z);
    }

    public QRange getCurveRange(QRange qRange, boolean z) {
        if (qRange == null || this.handle == 0) {
            return null;
        }
        return nativeGetCurveRange(this.handle, qRange, z);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            unInit();
        } catch (Throwable unused) {
        }
        super.finalize();
    }
}