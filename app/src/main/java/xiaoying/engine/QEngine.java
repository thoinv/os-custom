package xiaoying.engine;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.quvideo.xiaoying.community.publish.api.PublishAPIProxy;
import xiaoying.engine.base.IQFilePathModifier;
import xiaoying.engine.base.IQFontFinder;
import xiaoying.engine.base.IQHWCodecQuery;
import xiaoying.engine.base.IQSessionStateListener;
import xiaoying.engine.base.IQTemplateAdapter;
import xiaoying.engine.base.IQTextTransformer;
import xiaoying.engine.base.IQUserBubbleText;
import xiaoying.engine.base.QBubbleTextSource;
import xiaoying.engine.base.QMaskCache;
import xiaoying.engine.base.QSessionState;
import xiaoying.engine.base.QTextTransformerParam;
import xiaoying.utils.QBitmap;
import xiaoying.utils.text.QFontCache;

public class QEngine {
    public static final int MSAATYPE_NO = 0;
    public static final int MSAATYPE_X4 = 1;
    public static final int PERCENT_PRECISION = 10000;
    public static final int PROP_3D_FACE_DATA = 40;
    public static final int PROP_APP_CONTEXT = 32;
    public static final int PROP_CONTEXT_AE_GLOBAL_ASSET_PATH = 68;
    private static final int PROP_CONTEXT_BASE = 0;
    public static final int PROP_CONTEXT_MASK_CACHE_ADAPTER = 66;
    public static final int PROP_CONTEXT_MASK_CACHE_FLAG = 65;
    public static final int PROP_CONTEXT_MASK_CACHE_PATH = 64;
    public static final int PROP_CONTEXT_PLAYER_IGNORE_SKIP_FRAME = 79;
    public static final int PROP_CONTEXT_RENDER_MSAATYPE = 50;
    public static final int PROP_CONTEXT_SEGMENT_FIRST_SYNC = 75;
    public static final int PROP_CONTEXT_SEGMENT_MODE = 67;
    public static final int PROP_CONTEXT_SEGMENT_USE_VIDEO = 78;
    public static final int PROP_CONTEXT_SKELETON_CACHE_ADAPTER = 71;
    public static final int PROP_CONTEXT_SKELETON_CACHE_FLAG = 70;
    public static final int PROP_CONTEXT_SKELETON_CACHE_PATH = 69;
    public static final int PROP_DEFAULT_OUTPUT_AUDIO_FORMAT = 3;
    public static final int PROP_DEFAULT_OUTPUT_FILE_FORMAT = 4;
    public static final int PROP_DEFAULT_OUTPUT_VIDEO_FORMAT = 2;
    public static final int PROP_DEFAULT_PLAYBACK_MUTE = 7;
    public static final int PROP_DEFAULT_PLAYBACK_VOLUME = 6;
    public static final int PROP_DEFAULT_RESAMPLE_MODE = 5;
    public static final int PROP_DEF_IMAGE_FILE = 35;
    public static final int PROP_DEF_STUFF_COLOR = 41;
    public static final int PROP_DEF_STUFF_IMAGE = 42;
    public static final int PROP_FILE_PATH_MODIFIER = 28;
    public static final int PROP_FONT_FINDER = 33;
    public static final int PROP_HWCODEC_XML_PATH = 38;
    public static final int PROP_HW_CODEC_QUERY_CALLBACK = 31;
    public static final int PROP_HW_READER_LIB_PATH = 26;
    public static final int PROP_HW_WRITER_LIB_PATH = 27;
    public static final int PROP_IMAGE_SOURCE_FPS = 44;
    public static final int PROP_MAX_SUPPORT_RESOLUTION = 9;
    public static final int PROP_PLAY_DOWN_SCALE = 39;
    public static final int PROP_RENDER_API = 36;
    public static final int PROP_SEGMENT_MODEL_FILE = 48;
    public static final int PROP_STATIC_DURATION = 19;
    public static final int PROP_TEMPLATE_ADAPTER_CALLBACK = 25;
    public static final int PROP_TEMPLATE_PATH = 10;
    public static final int PROP_TEMP_PATH = 1;
    public static final int PROP_TEXT_TRANSFORMER = 34;
    public static final int PROP_THEME_DEFAULT_MUSIC_TEMPLATE_ID = 30;
    public static final int PROP_TRCFILE_DECRYPTOR = 29;
    public static final int PROP_TRIM_TYPE = 20;
    public static final int PROP_USER_BUBBLETEXT_CALLBACK = 8;
    public static final int PROP_VIDEO_SOURCE_FPS = 47;
    public static final int RENDER_API_D3D11 = 128;
    public static final int RENDER_API_Metal10 = 32;
    public static final int RENDER_API_OpenGLES20 = 16;
    public static final int RENDER_API_OpenGLES30 = 17;
    public static final int RENDER_API_OpenGLES31 = 18;
    public static final int RENDER_API_OpenGLES32 = 19;
    public static final int RENDER_API_UNKNOW = 0;
    public static final int RENDER_API_Vulkan10 = 64;
    public static final int TRIM_FLAG_LEFT_KEYFRAME = 1;
    public static final int TRIM_FLAG_NORMAL = 0;
    public static final int TRIM_FLAG_RIGHT_KEYFRAME = 2;
    public static final int USE_CODEC_TYPE_HW_FIRST_SW_SECOND = 2;
    public static final int USE_CODEC_TYPE_HW_ONLY = 0;
    public static final int USE_CODEC_TYPE_SW_FIRST_HW_SECOND = 3;
    public static final int USE_CODEC_TYPE_SW_ONLY = 1;
    public static final int VERSION_NUMBER = 327691;
    private static final long mRemainMem = 606208000;
    private long amcmHandle = 0;
    private long engineHandle = 0;
    private IQFontFinder fontfinder = null;
    private IQHWCodecQuery hwcodecquery = null;
    private long jniTRCDecryptorGR = 0;
    private long jniglobalobjectref = 0;
    private Context mAppCtx = null;
    private IQSessionStateListener maskMgrAdapter = null;
    private IQFilePathModifier pathModifier = null;
    private IQSessionStateListener skeletonMgrAdapter = null;
    private IQTemplateAdapter templateAdapter = null;
    private IQTextTransformer texttransformer = null;
    private IQUserBubbleText userBubbleText = null;

    private native int nativeCleanMaskCache(long j, int i);

    private native int nativeCreate(QEngine qEngine, String str);

    private native int nativeCreateMaskCache(long j, String str, QMaskCache qMaskCache);

    private native int nativeDestoryMaskCache(long j, QMaskCache qMaskCache);

    private native int nativeDestroy(QEngine qEngine);

    private static native Object[] nativeGetEngineSupportList();

    private native Object nativeGetProp(long j, int i);

    private native int nativeQueryMaskCache(long j, QMaskCache qMaskCache);

    private native int nativeSetProp(long j, int i, Object obj);

    public int create(String str) {
        return nativeCreate(this, str);
    }

    public int destory() {
        QFontCache.Cleanup();
        return nativeDestroy(this);
    }

    public int setProperty(int i, Object obj) {
        if (i == 8) {
            this.userBubbleText = (IQUserBubbleText) obj;
            return 0;
        } else if (i == 25) {
            this.templateAdapter = (IQTemplateAdapter) obj;
            return 0;
        } else if (i == 31) {
            this.hwcodecquery = (IQHWCodecQuery) obj;
            return 0;
        } else if (i == 33) {
            this.fontfinder = (IQFontFinder) obj;
            return 0;
        } else if (i == 34) {
            this.texttransformer = (IQTextTransformer) obj;
            return 0;
        } else if (i == 28) {
            this.pathModifier = (IQFilePathModifier) obj;
            return 0;
        } else if (i == 66) {
            this.maskMgrAdapter = (IQSessionStateListener) obj;
            return 0;
        } else if (i == 71) {
            this.skeletonMgrAdapter = (IQSessionStateListener) obj;
            return 0;
        } else {
            if (i == 32) {
                this.mAppCtx = (Context) obj;
            }
            return nativeSetProp(this.engineHandle, i, obj);
        }
    }

    public Object getProperty(int i) {
        return nativeGetProp(this.engineHandle, i);
    }

    private int callUserBubbleText(QBitmap qBitmap, QBubbleTextSource qBubbleTextSource, int i, int i2, Object obj) {
        IQUserBubbleText iQUserBubbleText = this.userBubbleText;
        if (iQUserBubbleText == null) {
            return 0;
        }
        return iQUserBubbleText.onUserBubbleText(qBitmap, qBubbleTextSource, i, i2, obj);
    }

    public String GetTemplateFile(long j) {
        IQTemplateAdapter iQTemplateAdapter = this.templateAdapter;
        if (iQTemplateAdapter == null) {
            return null;
        }
        return iQTemplateAdapter.getTemplateFile(j);
    }

    public long GetTemplateID(String str) {
        IQTemplateAdapter iQTemplateAdapter = this.templateAdapter;
        if (iQTemplateAdapter == null) {
            return 0;
        }
        return iQTemplateAdapter.getTemplateID(str);
    }

    public String GetTemplateExternalFile(long j, int i, int i2) {
        IQTemplateAdapter iQTemplateAdapter = this.templateAdapter;
        if (iQTemplateAdapter == null) {
            return null;
        }
        return iQTemplateAdapter.getTemplateExternalFile(j, i, i2);
    }

    private int onMaskMgrStatus(QSessionState qSessionState) {
        IQSessionStateListener iQSessionStateListener = this.maskMgrAdapter;
        if (iQSessionStateListener == null) {
            return 0;
        }
        return iQSessionStateListener.onSessionStatus(qSessionState);
    }

    private int onSkeletonMgrStatus(QSessionState qSessionState) {
        IQSessionStateListener iQSessionStateListener = this.skeletonMgrAdapter;
        if (iQSessionStateListener == null) {
            return 0;
        }
        return iQSessionStateListener.onSessionStatus(qSessionState);
    }

    public int GetMAXHWDecCount(int i) {
        IQHWCodecQuery iQHWCodecQuery = this.hwcodecquery;
        if (iQHWCodecQuery == null) {
            return 0;
        }
        return iQHWCodecQuery.getMAXHWDecCount(i);
    }

    public boolean QueryHWEncCap(int i) {
        IQHWCodecQuery iQHWCodecQuery = this.hwcodecquery;
        if (iQHWCodecQuery == null) {
            return false;
        }
        return iQHWCodecQuery.queryHWEncCap(i);
    }

    public int QueryVideoImportFormat(int i, int[] iArr) {
        IQHWCodecQuery iQHWCodecQuery = this.hwcodecquery;
        if (iQHWCodecQuery == null) {
            return -1;
        }
        iArr[0] = iQHWCodecQuery.queryVideoImportFormat(i);
        return 0;
    }

    public boolean GetHWBetaTestedFlag() {
        IQHWCodecQuery iQHWCodecQuery = this.hwcodecquery;
        if (iQHWCodecQuery == null) {
            return false;
        }
        return iQHWCodecQuery.getBetaTestedFlag();
    }

    public String FindFont(int i) {
        IQFontFinder iQFontFinder = this.fontfinder;
        if (iQFontFinder == null) {
            return null;
        }
        return iQFontFinder.FindFont(i);
    }

    public String TransformText(String str, QTextTransformerParam qTextTransformerParam) {
        IQTextTransformer iQTextTransformer = this.texttransformer;
        if (iQTextTransformer == null) {
            return null;
        }
        return iQTextTransformer.TransformText(str, qTextTransformerParam);
    }

    public String ModifyFilePath(String str) {
        IQFilePathModifier iQFilePathModifier = this.pathModifier;
        if (iQFilePathModifier == null) {
            return null;
        }
        return iQFilePathModifier.ModifyPaht(str);
    }

    public long getRemainMemory(boolean[] zArr) {
        Context context = this.mAppCtx;
        if (context == null) {
            return mRemainMem;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(PublishAPIProxy.API_PARAM_PUBLISH_ACTIVITY)).getMemoryInfo(memoryInfo);
        zArr[0] = memoryInfo.lowMemory;
        return memoryInfo.availMem;
    }

    public int ViewBitmap(byte[] bArr, int i, int i2, int i3, String str) {
        if (i3 == 1) {
            int length = bArr.length / 4;
            int[] iArr = new int[length];
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                iArr[i4] = ((bArr[i5] & 255) << 16) | ((bArr[i8] & 255) << 24) | ((bArr[i6] & 255) << 8) | (bArr[i7] & 255);
                i4++;
                i5 = i8 + 1;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
            createBitmap.getWidth();
        }
        return 0;
    }

    public int cleanMaskCache(int i) {
        return nativeCleanMaskCache(this.engineHandle, i);
    }

    public int createMaskCache(String str, QMaskCache qMaskCache) {
        return nativeCreateMaskCache(this.engineHandle, str, qMaskCache);
    }

    public int queryMaskCache(QMaskCache qMaskCache) {
        return nativeQueryMaskCache(this.engineHandle, qMaskCache);
    }

    public int destoryMaskCache(QMaskCache qMaskCache) {
        return nativeDestoryMaskCache(this.engineHandle, qMaskCache);
    }

    public static Object[] getEngineSupportList() {
        return nativeGetEngineSupportList();
    }
}