package xiaoying.engine.base;

import xiaoying.engine.QEngine;
import xiaoying.engine.storyboard.QStoryboard;
import xiaoying.utils.QBitmap;
import xiaoying.utils.QBitmapFactory;
import xiaoying.utils.QColorSpace;
import xiaoying.utils.QRect;
import xiaoying.utils.QSize;
import xiaoying.utils.QTextMulInfo;

public class QStyle {
    public static final int APP_INPUT_EXPRESSION_TYPE_BEGIN = 11;
    public static final int APP_INPUT_EXPRESSION_TYPE_CLICK = 12;
    public static final int COMBO_PASTER_SUBTYPE_FACIAL = 1;
    public static final int COMBO_PASTER_SUBTYPE_NORMAL = 0;
    public static final int COMBO_PASTER_SUBTYPE_OT = 2;
    public static final int COMBO_SUBTYPE_TEXTANIMATION = 3;
    public static final long DEFAULT_BUBBLE_TEMPLATE_ID = 648518346341351425L;
    public static final int DEMO_EXAMPLE_FILE_ID = 12;
    public static final int DIVA_EFFECT_SUB_TYPE_BG = 1;
    public static final int DIVA_SUB_TYPE_FILTER = 1;
    public static final int DIVA_SUB_TYPE_FREEZE_FRAME = 2;
    public static final int DIVA_SUB_TYPE_LYRIC = 0;
    public static final int EFFECT_ABFACE_TYPE_COMBO = 2;
    public static final int EFFECT_ABFACE_TYPE_INDEX = 3;
    public static final int EFFECT_ABFACE_TYPE_LEFT = 0;
    public static final int EFFECT_ABFACE_TYPE_RIGHT = 1;
    public static final int EXPRESSION_START_MUSIC_FILE_ID = 1002;
    public static final int FACEDT_EXPRESSION_TYPE_EYEBROW_RAISE = 2;
    public static final int FACEDT_EXPRESSION_TYPE_EYE_OPEN = 3;
    public static final int FACEDT_EXPRESSION_TYPE_HEADNOD = 5;
    public static final int FACEDT_EXPRESSION_TYPE_HEADSHAKE = 4;
    public static final int FACEDT_EXPRESSION_TYPE_HEAD_SHAKENOD = 6;
    public static final int FACEDT_EXPRESSION_TYPE_MOUTH_OPEN = 1;
    public static final int FACEDT_EXPRESSION_TYPE_NONE = 0;
    public static final int FX_SUBTYPE_DANCING = 2;
    public static final int FX_SUBTYPE_NORMAL = 0;
    public static final int FX_SUBTYPE_SELFIE = 3;
    public static final int FX_SUBTYPE_SINGING = 1;
    public static final int IE_SUBTYPE_BLEND_CAM_FD = 7;
    public static final int IE_SUBTYPE_FACE_DEFORMATION = 5;
    public static final int IE_SUBTYPE_FB_POSTPROCESS = 2;
    public static final int IE_SUBTYPE_FB_PREPROCESS = 3;
    public static final int IE_SUBTYPE_FUNNY = 1;
    public static final int IE_SUBTYPE_GRAFFITY = 8;
    public static final int IE_SUBTYPE_NORMAL = 0;
    public static final int IE_SUBTYPE_TEXT_ANIMATION = 4;
    public static final int LAYOUT_MASK_ALL = -1;
    public static final int LAYOUT_MASK_W16_H9 = 8;
    public static final int LAYOUT_MASK_W1_H1 = 16;
    public static final int LAYOUT_MASK_W3_H4 = 1;
    public static final int LAYOUT_MASK_W4_H3 = 2;
    public static final int LAYOUT_MASK_W9_H16 = 4;
    public static final int LRC_FILE_ID = 1001;
    public static final int MODE_MASK_ALL = -1;
    public static final int MODE_MASK_ANIMATED_FRAME = 6;
    public static final int MODE_MASK_BUBBLE = 9;
    public static final int MODE_MASK_COMBO_PASTER = 17;
    public static final int MODE_MASK_COVER = 2;
    public static final int MODE_MASK_DIVA = 15;
    public static final int MODE_MASK_EFFECT = 4;
    public static final int MODE_MASK_FREEZE_FRAME = 18;
    public static final int MODE_MASK_LYRIC = 19;
    public static final int MODE_MASK_MUSIC = 7;
    public static final int MODE_MASK_NONE = 0;
    public static final int MODE_MASK_PASTER_FRAME = 5;
    public static final int MODE_MASK_PIP = 12;
    public static final int MODE_MASK_POSTER = 8;
    public static final int MODE_MASK_SOUND = 13;
    public static final int MODE_MASK_THEME = 1;
    public static final int MODE_MASK_TRANSITION = 3;
    public static final int MODE_MASK_VIDEO_CLIP = 14;
    public static final int MODE_MASK_WATERMARK = 11;
    public static final int MUSIC_FILE_ID = 1000;
    public static final long NONE_ANIMATED_FRAME_TEMPLATE_ID = 432345564227567616L;
    public static final long NONE_BUBBLE_TEMPLATE_ID = 648518346341351424L;
    public static final long NONE_FILTER_TEMPLATE_ID = 288230376151711744L;
    public static final long NONE_MUSIC_TEMPLATE_ID = 504403158265495552L;
    public static final long NONE_POSTER_TEMPLATE_ID = 576460752303423488L;
    public static final long NONE_THEME_TEMPLATE_ID = 72057594037927936L;
    public static final long NONE_TRANSITION_TEMPLATE_ID = 216172782113783808L;
    public static final int PASTER_LOOP_MUISC_FILE_ID = 1003;
    public static final int PASTER_SUBTYPE_DYNAMIC = 5;
    public static final int PASTER_SUBTYPE_FACIAL = 1;
    public static final int PASTER_SUBTYPE_FACIAL_ATTACH = 2;
    public static final int PASTER_SUBTYPE_NORMAL = 0;
    public static final int PASTER_SUBTYPE_OT = 3;
    public static final int PASTER_SUBTYPE_STATIC = 4;
    public static final int SENIOR_TEXT_VERSION = 196608;
    public static final int TEXT_SUBTYPE_ANIMATION = 1;
    public static final int TEXT_SUBTYPE_NORMAL = 0;
    public static final int THEME_SUBTYPE_FUNNY = 1;
    public static final int THEME_SUBTYPE_NORMAL = 0;
    public static final int THEME_SUBTYPE_STORY = 2;
    public static final int THUMBNAIL_FILE_ID = 3;
    public static final int TRANSITION_DURATION_UNEDITABLE = 0;
    public static final int TRANSITION_EDITABLE = 1;
    private long handle = 0;

    public static class QAnimatedFrameTemplateInfo {
        public QRect defaultRegion;
        public int duration;
        public int examplePos;
        public int frameHeight;
        public int frameWidth;
        public boolean hasAudio;
    }

    public static class QEffect3DMaterialItem {
        public QSize NodeSize;
        public QSize ViewSize;
        public int paramid;
        public int resamplemode;
        public String strMaterialName;
        public int taorigin;
        public int taparamid;
    }

    public static class QEffectKeyLineInterfaceItem {
        public float def_v;
        public int eftIdx;
        public int itemID;
        public int mainType;
        public float max_v;
        public float min_v;
        public String name;
        public int subType;
        public String uniformName;
    }

    public static class QEffectKliiWithUserData {
        public int eftIdx;
        public float endV;
        public int itemID;
        public QRange range;
        public float startV;
        public long templateID;
    }

    public static class QEffectPropertyData {
        public int mID;
        public int mValue;
    }

    public static class QEffectPropertyInfo {
        public int adjust_pos;
        public int control_type;
        public int cur_value;
        public int groupid_index;
        public int id;
        public boolean is_support_key;
        public boolean is_unlimited_mode;
        public String key_name;
        public int max_value;
        public int min_value;
        public String name;
        public int precision;
        public int step;
        public int unit;
        public String wildcard;
    }

    public static class QExternalFileInfo {
        public int fileID;
        public String fileName;
        public int subTemplateID;
        public long templateID;
    }

    public static class QFreezeFrameBasicInfo {
        public int mDefLength;
        public int mMaxLength;
        public int mMinLength;
        public int mVersion;
        public boolean mbLengthEditable;
    }

    public static class QPasteSwitchInfo {
        public QPasteSwitchGroupInfo[] groupList;
        public int random;
        public int type;

        public static class QPasteSwitchGroupInfo {
            public int[] itemList;
            public int switchExpType;
        }
    }

    public static class QPasterABFaceInfo {
        public int applyface;
        public boolean bABFace;
        public int totalcount;
        public int type;
    }

    public static class QSlideShowSceCfgInfo {
        public QSlideShowSceCfgItem[] mBackCoverItem = null;
        public int mBestDispTime = 0;
        public QSlideShowSceCfgItem[] mBodyItem = null;
        public QSlideShowSceCfgItem[] mCoverItem = null;
        public boolean mOnlySceneMode = false;
        public int mVersion = 0;
    }

    public static class QSlideShowSceCfgItem {
        public QRect[] mBestRegion = null;
        public int[] mContourApply = null;
        public long mID = 0;
        public int[] mPreviewPos = null;
        public QRect[] mRegion = null;
        public int mRevCount = 0;
        public int[] mSourceType = null;
        public int mSrcCount = 0;
        public QSize mViewSize = null;
    }

    public static class QTemplateContentInfo {
        public boolean mIsNeedFaceFeature;
        public boolean mIsNeedSegment;
        public boolean mIsOffline;
        public boolean mIsPhoto;
        public long mReservedID;
        public long mSeqenceID;
        public long mSubSequenceID;
        public int mSubType;
    }

    public static int getTemplateSubType(long j) {
        return (int) ((j & 267911168) >> 19);
    }

    private static native long nativeCreatEffectThumbnailEngine(QEngine qEngine, QSize qSize);

    private native int nativeCreate(String str, String str2, int i);

    private native int nativeDestroy();

    private static native int nativeDestroyEffectThumbnailEngine(long j);

    private native int nativeExtractExampleFile(long j, String str);

    private native QEffect3DMaterialItem[] nativeGet3DMaterialItemArray(long j);

    private native QAnimatedFrameTemplateInfo nativeGetAnimatedFrameTemplateInfo(long j, int i, int i2);

    private static native boolean nativeGetBubbleIsAdujestAlpha(QEngine qEngine, long j, QSize qSize);

    private native QBubbleTemplateInfo nativeGetBubbleTemplateInfo(QEngine qEngine, long j, int i, int i2, int i3, int i4);

    private static native int nativeGetBubbleThumbnailByTemplate(QEngine qEngine, QBitmap qBitmap, QBubbleTextSource qBubbleTextSource, QSize qSize, QSize qSize2, int i);

    private native QPasterFacialType nativeGetCategroyFacialType(long j);

    private native int nativeGetCategroyID(long j);

    private native int nativeGetConfigureCount(long j);

    private native String nativeGetDescription(long j, int i);

    private native int nativeGetDummyFlag(long j);

    private native QExternalFileInfo[] nativeGetExternalFileInfos(long j);

    private native int nativeGetFilterDuration(long j);

    private native QFreezeFrameBasicInfo nativeGetFreezeFrameBasicInfo(long j);

    private native long nativeGetID(long j);

    private static native QEffectPropertyInfo[] nativeGetIEPropertyInfo(QEngine qEngine, long j);

    private static native int[] nativeGetItemIDsInMotionTemplate(QEngine qEngine, long j);

    private static native QEffectKeyLineInterfaceItem[] nativeGetKeyLineInterfaceItems(QEngine qEngine, long j);

    private native int nativeGetMode(long j);

    private static native QPasteSwitchInfo nativeGetPasteSwitchInfo(long j);

    private native QPasterABFaceInfo nativeGetPasterABFaceInfo(long j);

    private native int nativeGetPasterExpressionType(long j);

    private native int nativeGetPreviewData(long j, QStoryboard qStoryboard);

    private native int nativeGetSceneDuration(long j);

    private native QSlideShowSceCfgInfo nativeGetSlideShowSceCfgInfo(long j);

    private native long[] nativeGetSubPasterID(long j);

    private native int nativeGetSupportedLayouts(long j);

    private static native QTemplateContentInfo nativeGetTemplateContentInfo(QEngine qEngine, long j);

    private native String nativeGetTemplateName(long j, int i);

    private native QTextMulInfo nativeGetTextMulInfo(QEngine qEngine, long j, QSize qSize, int i);

    private static native int nativeGetTextThumbnail(long j, int i, QBubbleTextSource[] qBubbleTextSourceArr, QBitmap qBitmap, QSize qSize, int i2);

    private native int nativeGetThemeCoverPosition(long j);

    private static native String[] nativeGetThemeDefaultMusicPaths(QEngine qEngine, String str);

    private native int nativeGetThemeExportSize(long j, QSize qSize);

    private native QSize[] nativeGetThemeExportSizeList(long j);

    private static native int nativeGetThumbnail(long j, long j2, QBitmap qBitmap, int i);

    private native int nativeGetThumbnail(QEngine qEngine, long j, QBitmap qBitmap);

    private native int nativeGetTransDuration(long j);

    private native int nativeGetTransEditable(long j);

    private native int nativeGetVersion(long j);

    private native boolean nativeIsARTemplate(long j);

    private native boolean nativeIsAudioVisualizationTemplate(long j);

    private native boolean nativeIsFixedSizeTheme(long j);

    private native boolean nativeIsOTSupportTemplate(long j);

    private native boolean nativeIsSlideShowTheme(long j);

    private native boolean nativeIsSupportAlphaAdjust(long j);

    private static native int nativeMeasureBubbleByTemplate(String str, QSize qSize, String str2, String str3, QBubbleMeasureResult qBubbleMeasureResult);

    private static native int nativeMeasureBubbleSourceByTemplate(String str, QSize qSize, QBubbleTextSource qBubbleTextSource, QBubbleMeasureResult qBubbleMeasureResult);

    public static class QTextInfo {
        public static final int TEXTINFO_ALIGNMENT = 2;
        public static final int TEXTINFO_ALIGNMENT_BOTTOM = 8;
        public static final int TEXTINFO_ALIGNMENT_FREE_STYLE = 0;
        public static final int TEXTINFO_ALIGNMENT_HOR_CENTER = 32;
        public static final int TEXTINFO_ALIGNMENT_HOR_FULLFILL = 128;
        public static final int TEXTINFO_ALIGNMENT_LEFT = 1;
        public static final int TEXTINFO_ALIGNMENT_MIDDLE = 16;
        public static final int TEXTINFO_ALIGNMENT_NONE = 0;
        public static final int TEXTINFO_ALIGNMENT_RIGHT = 2;
        public static final int TEXTINFO_ALIGNMENT_TOP = 4;
        public static final int TEXTINFO_ALIGNMENT_VER_ABOVE_CENTER = 1024;
        public static final int TEXTINFO_ALIGNMENT_VER_CENTER = 64;
        public static final int TEXTINFO_ALIGNMENT_VER_FULLFILL = 256;
        public static final int TEXTINFO_ALIGNMENT_VER_UNDER_CENTER = 512;
        public static final int TEXTINFO_COLOR = 1;
        public static final int TEXTINFO_EDITABLE = 5;
        public static final int TEXTINFO_EDITABLE_MASK_ALIGNMENT = 8;
        public static final int TEXTINFO_EDITABLE_MASK_COLOR = 4;
        public static final int TEXTINFO_EDITABLE_MASK_FONT = 32;
        public static final int TEXTINFO_EDITABLE_MASK_NONE = 0;
        public static final int TEXTINFO_EDITABLE_MASK_REGION = 1;
        public static final int TEXTINFO_EDITABLE_MASK_ROTATE = 16;
        public static final int TEXTINFO_EDITABLE_MASK_SIZE = 2;
        public static final int TEXTINFO_EDITABLE_MASK_TEXTALL = 63;
        public static final int TEXTINFO_ROTATE = 3;
        public static final int TEXTINFO_SIZE = 0;
        public static final int TEXTINFO_TIMESTAMP = 4;
        public int absHeight;
        public int alignment;
        public int bgArea;
        public int color;
        public int editable;
        public QI18NItemInfo[] i18nInfoArray;
        public boolean isAbsPadding;
        public QRect paddingRect;
        public QRect region;
        public int rotate;
        public int size;
        public int timestamp;

        public QTextInfo() {
            this.region = null;
            this.size = 0;
            this.color = 0;
            this.alignment = 0;
            this.rotate = 0;
            this.timestamp = 0;
            this.editable = 0;
            this.i18nInfoArray = null;
            this.bgArea = 0;
            this.absHeight = 0;
            this.isAbsPadding = false;
            this.paddingRect = new QRect(0, 0, 0, 0);
        }

        public QTextInfo(QTextInfo qTextInfo) {
            if (qTextInfo != null) {
                this.region = qTextInfo.region;
                this.size = qTextInfo.size;
                this.color = qTextInfo.color;
                this.alignment = qTextInfo.alignment;
                this.rotate = qTextInfo.rotate;
                this.timestamp = qTextInfo.timestamp;
                this.editable = qTextInfo.editable;
                this.i18nInfoArray = qTextInfo.i18nInfoArray;
                this.bgArea = qTextInfo.bgArea;
                this.absHeight = qTextInfo.absHeight;
                this.isAbsPadding = qTextInfo.isAbsPadding;
                this.paddingRect = new QRect(qTextInfo.paddingRect.left, qTextInfo.paddingRect.top, qTextInfo.paddingRect.right, qTextInfo.paddingRect.bottom);
            }
        }

        public int GetTextInfo(int i) {
            if (i == 0) {
                return this.size;
            }
            if (i == 1) {
                return this.color;
            }
            if (i == 2) {
                return this.alignment;
            }
            if (i == 3) {
                return this.rotate;
            }
            if (i == 4) {
                return this.timestamp;
            }
            if (i != 5) {
                return 0;
            }
            return this.editable;
        }

        public QRect GetTextRect() {
            return this.region;
        }
    }

    public static class QFinderParam {
        private boolean listCommon = true;
        private int mode = 0;
        private String path = null;
        private String serialno = null;
        private long themeID = 0;

        public void setPath(String str) {
            this.path = str;
        }

        public void setSerialno(String str) {
            this.serialno = str;
        }

        public void setThemeID(long j) {
            this.themeID = j;
        }

        public void setMode(int i) {
            this.mode = i;
        }

        public void setCommon(boolean z) {
            this.listCommon = z;
        }
    }

    public static class QFinder {
        private long handle = 0;

        private native int nativeCreate(QFinderParam qFinderParam);

        private native int nativeDestroy();

        private native int nativeGetCount(long j);

        private native String nativeGetFileName(long j, int i);

        private native int nativeUpdate(long j);

        public int create(QFinderParam qFinderParam) {
            if (qFinderParam == null) {
                return QVEError.QERR_COMMON_JAVA_INVALID_PARAM;
            }
            if (this.handle != 0) {
                destroy();
            }
            return nativeCreate(qFinderParam);
        }

        public int destroy() {
            if (this.handle == 0) {
                return QVEError.QERR_COMMON_JAVA_NOT_INIT;
            }
            return nativeDestroy();
        }

        public int update() {
            long j = this.handle;
            if (j == 0) {
                return QVEError.QERR_COMMON_JAVA_NOT_INIT;
            }
            return nativeUpdate(j);
        }

        public int getCount() {
            long j = this.handle;
            if (j == 0) {
                return 0;
            }
            return nativeGetCount(j);
        }

        public String getFileName(int i) {
            long j = this.handle;
            if (j == 0) {
                return null;
            }
            return nativeGetFileName(j, i);
        }
    }

    public static class QTemplateIDUtils {
        private static final int TPBSC_RESERVED = 40;
        private static final int TPBSC_SUB_SEQUENCE = 48;
        private static final int TPBSC_TEMPLATE_ID_TOTAL_BITS = 64;
        private static final int TPBSC_TYPE = 56;
        private static final long TPMASK_GET_OFFLINE_FLAG = 1099511627776L;
        private static final long TPMASK_GET_PICTURE_FLAG = 2199023255552L;
        private static final long TPMASK_GET_RESERVED_ID = 263882790666240L;
        private static final long TPMASK_GET_SEQUENCE_ID = 17592186044415L;
        private static final long TPMASK_GET_SUB_SEQUENCE_ID = 35747322042253312L;
        private static final long TPMASK_IS_PUBLIC = 4611686018427387904L;
        private static final long TPMASK_IS_SELFDEF = 2305843009213693952L;
        private static final long TPMASK_IS_SPECIAL = 267911168;
        private static final long TPMASK_IS_THEME_SUB_TEMPLATE = 36028797018963968L;
        private static final long TPMASK_TYPE = 2233785415175766016L;
        private static QEngine mEngine;

        public static int getTemplateType(long j) {
            return (int) ((j & TPMASK_TYPE) >>> 56);
        }

        public static boolean isPublicTemplate(long j) {
            return 0 == (j & 4611686018427387904L);
        }

        public static boolean isSelfDefTemplate(long j) {
            return 0 != (j & TPMASK_IS_SELFDEF);
        }

        public static boolean isThemeSubTemplate(long j) {
            return 0 != (j & TPMASK_IS_THEME_SUB_TEMPLATE);
        }

        public static void setEngine(QEngine qEngine) {
            mEngine = qEngine;
        }

        public static int getTemplateSubSequenceID(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            return (int) (templateContentInfo != null ? templateContentInfo.mSubSequenceID : (j & TPMASK_GET_SUB_SEQUENCE_ID) >>> 48);
        }

        public static long getTemplateSeqenceID(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            return templateContentInfo != null ? templateContentInfo.mSeqenceID : j & TPMASK_GET_SEQUENCE_ID;
        }

        public static int getTemplateReservedID(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            return (int) (templateContentInfo != null ? templateContentInfo.mReservedID : (long) ((int) ((j & TPMASK_GET_RESERVED_ID) >>> 40)));
        }

        public static boolean isOfflineTemplate(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            if (templateContentInfo != null) {
                return templateContentInfo.mIsOffline;
            }
            return (j & TPMASK_GET_OFFLINE_FLAG) != 0;
        }

        public static boolean isPhotoTemplate(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            if (templateContentInfo != null) {
                return templateContentInfo.mIsPhoto;
            }
            return (j & TPMASK_GET_PICTURE_FLAG) != 0;
        }

        public static boolean isFunnyEffectTemplate(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            if (templateContentInfo != null) {
                if (((long) templateContentInfo.mSubType) == 1) {
                    return true;
                }
                return false;
            } else if (j == 288230376151711803L || j == 288230376151711806L || ((j & TPMASK_IS_SPECIAL) >> 19) == 1) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean isFBPostProcessTemplate(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            if (templateContentInfo != null) {
                if (((long) templateContentInfo.mSubType) == 2) {
                    return true;
                }
                return false;
            } else if (((j & TPMASK_IS_SPECIAL) >> 19) == 2) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean isFBPreProcessTemplate(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            if (templateContentInfo != null) {
                if (((long) templateContentInfo.mSubType) == 3) {
                    return true;
                }
                return false;
            } else if (((j & TPMASK_IS_SPECIAL) >> 19) == 3) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean isGraffitiTemplate(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            if (templateContentInfo != null) {
                if (templateContentInfo.mSubType == 8) {
                    return true;
                }
                return false;
            } else if (((j & TPMASK_IS_SPECIAL) >> 19) == 8) {
                return true;
            } else {
                return false;
            }
        }

        public static int getTemplateSubType(long j) {
            QTemplateContentInfo templateContentInfo = QStyle.getTemplateContentInfo(mEngine, j);
            return templateContentInfo != null ? templateContentInfo.mSubType & 511 : (int) (((j & TPMASK_IS_SPECIAL) >> 19) & 511);
        }
    }

    public int create(String str, String str2, int i) {
        if (str == null) {
            return QVEError.QERR_COMMON_JAVA_INVALID_PARAM;
        }
        if (this.handle != 0) {
            destroy();
        }
        return nativeCreate(str, str2, i);
    }

    public int destroy() {
        if (this.handle == 0) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeDestroy();
    }

    public int getVersion() {
        long j = this.handle;
        if (j == 0) {
            return 0;
        }
        return nativeGetVersion(j);
    }

    public String getTemplateName(int i) {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        return nativeGetTemplateName(j, i);
    }

    public String getDescription(int i) {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        return nativeGetDescription(j, i);
    }

    public int getMode() {
        long j = this.handle;
        if (j == 0) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeGetMode(j);
    }

    public boolean getDummyFlag() {
        long j = this.handle;
        if (j == 0 || nativeGetDummyFlag(j) == 0) {
            return false;
        }
        return true;
    }

    public int getThumbnail(QEngine qEngine, QBitmap qBitmap) {
        long j = this.handle;
        if (j == 0) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return (qEngine == null || qBitmap == null) ? QVEError.QERR_COMMON_JAVA_INVALID_PARAM : nativeGetThumbnail(qEngine, j, qBitmap);
    }

    public int getPreviewData(QStoryboard qStoryboard, IQSessionStateListener iQSessionStateListener) {
        if (this.handle == 0) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        if (qStoryboard == null || iQSessionStateListener == null) {
            return QVEError.QERR_COMMON_JAVA_INVALID_PARAM;
        }
        qStoryboard.setSessionStateListener(iQSessionStateListener);
        return nativeGetPreviewData(this.handle, qStoryboard);
    }

    public long getID() {
        long j = this.handle;
        if (j == 0) {
            return 0;
        }
        return nativeGetID(j);
    }

    public int getTransitionEditable() {
        long j = this.handle;
        if (j == 0) {
            return 0;
        }
        return nativeGetTransEditable(j);
    }

    public int getTransitionDuration() {
        long j = this.handle;
        if (j == 0) {
            return 0;
        }
        return nativeGetTransDuration(j);
    }

    public QBubbleTemplateInfo getBubbleTemplateInfo(QEngine qEngine, int i, int i2, int i3) {
        return nativeGetBubbleTemplateInfo(qEngine, this.handle, i, -1, i2, i3);
    }

    public QBubbleTemplateInfo getBubbleTemplateInfo(QEngine qEngine, int i, int i2, int i3, int i4) {
        return nativeGetBubbleTemplateInfo(qEngine, this.handle, i, i2, i3, i4);
    }

    public QAnimatedFrameTemplateInfo getAnimatedFrameTemplateInfo(int i, int i2) {
        return nativeGetAnimatedFrameTemplateInfo(this.handle, i, i2);
    }

    public int extractExampleFile(String str) {
        return nativeExtractExampleFile(this.handle, str);
    }

    public QExternalFileInfo[] getExternalFileInfos() {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        return nativeGetExternalFileInfos(j);
    }

    public int getSupportedLayouts() {
        long j = this.handle;
        if (j == 0) {
            return 0;
        }
        return nativeGetSupportedLayouts(j);
    }

    public int getCategroyID() {
        long j = this.handle;
        if (j == 0) {
            return 0;
        }
        return nativeGetCategroyID(j);
    }

    public int getConfigureCount() {
        long j = this.handle;
        if (j == 0) {
            return 0;
        }
        return nativeGetConfigureCount(j);
    }

    public boolean isAudioVisualizationTemplate() {
        long j = this.handle;
        if (0 == j) {
            return false;
        }
        return nativeIsAudioVisualizationTemplate(j);
    }

    public static class QPasterFacialType {
        public static final int FACIAL_POS_TYPE_EYEBROWS_BOUND = 1;
        public static final int FACIAL_POS_TYPE_EYEBROWS_LBOUND = 2;
        public static final int FACIAL_POS_TYPE_EYEBROWS_RBOUND = 3;
        public static final int FACIAL_POS_TYPE_HAIR_BOUND = 0;
        public static final int FACIAL_SUBTYPE_BEARD = 4;
        public static final int FACIAL_SUBTYPE_EYE = 2;
        public static final int FACIAL_SUBTYPE_EYEBROWS = 1;
        public static final int FACIAL_SUBTYPE_HAIR = 0;
        public static final int FACIAL_SUBTYPE_NOSE = 3;
        public int mSubType = 0;

        QPasterFacialType() {
        }
    }

    public QPasterFacialType getCategroyFacialType() {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        return nativeGetCategroyFacialType(j);
    }

    public long[] getSubPasterID() {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        return nativeGetSubPasterID(j);
    }

    public int getPasterExpressionType() {
        long j = this.handle;
        if (j == 0) {
            return 0;
        }
        return nativeGetPasterExpressionType(j);
    }

    public static QBubbleMeasureResult measureBubbleByTemplate(String str, QSize qSize, String str2, String str3) {
        QBubbleMeasureResult qBubbleMeasureResult = new QBubbleMeasureResult();
        if (nativeMeasureBubbleByTemplate(str, qSize, str2, str3, qBubbleMeasureResult) != 0) {
            return null;
        }
        return qBubbleMeasureResult;
    }

    public static QBubbleMeasureResult measureBubbleSourceByTemplate(String str, QSize qSize, QBubbleTextSource qBubbleTextSource) {
        QBubbleMeasureResult qBubbleMeasureResult = new QBubbleMeasureResult();
        if (nativeMeasureBubbleSourceByTemplate(str, qSize, qBubbleTextSource, qBubbleMeasureResult) != 0) {
            return null;
        }
        return qBubbleMeasureResult;
    }

    public static QBitmap getBubbleThumbnailFromTemplate(QEngine qEngine, QBubbleTextSource qBubbleTextSource, QSize qSize, QSize qSize2, QSize qSize3, int i) {
        QBitmap createQBitmapBlank_noSkia;
        if (qEngine == null || qBubbleTextSource == null || qSize2 == null || qSize == null || qSize3 == null || qSize2.mWidth <= 0 || qSize2.mHeight <= 0 || qSize3.mWidth <= 0 || qSize3.mHeight <= 0 || (createQBitmapBlank_noSkia = QBitmapFactory.createQBitmapBlank_noSkia(qSize2.mWidth, qSize2.mHeight, QColorSpace.QPAF_RGB32_A8R8G8B8)) == null) {
            return null;
        }
        if (nativeGetBubbleThumbnailByTemplate(qEngine, createQBitmapBlank_noSkia, qBubbleTextSource, qSize, qSize3, i) == 0) {
            return createQBitmapBlank_noSkia;
        }
        createQBitmapBlank_noSkia.recycle();
        return null;
    }

    public static long creatEffectThumbnailEngine(QEngine qEngine, QSize qSize) {
        return nativeCreatEffectThumbnailEngine(qEngine, qSize);
    }

    public static QBitmap getTextThumbnail(long j, QBubbleTextSource[] qBubbleTextSourceArr, QSize qSize, QSize qSize2, int i) {
        QBitmap createQBitmapBlank_noSkia;
        if (j == 0 || qBubbleTextSourceArr == null || qSize.mWidth <= 0 || qSize.mHeight <= 0 || (createQBitmapBlank_noSkia = QBitmapFactory.createQBitmapBlank_noSkia(qSize.mWidth, qSize.mHeight, QColorSpace.QPAF_RGB32_A8R8G8B8)) == null) {
            return null;
        }
        nativeGetTextThumbnail(j, qBubbleTextSourceArr.length, qBubbleTextSourceArr, createQBitmapBlank_noSkia, qSize2, i);
        return createQBitmapBlank_noSkia;
    }

    public static QBitmap getThumbnail(long j, long j2, QSize qSize, int i) {
        QBitmap createQBitmapBlank_noSkia;
        if (j == 0 || qSize.mWidth <= 0 || qSize.mHeight <= 0 || (createQBitmapBlank_noSkia = QBitmapFactory.createQBitmapBlank_noSkia(qSize.mWidth, qSize.mHeight, QColorSpace.QPAF_RGB32_A8R8G8B8)) == null) {
            return null;
        }
        nativeGetThumbnail(j, j2, createQBitmapBlank_noSkia, i);
        return createQBitmapBlank_noSkia;
    }

    public static int destroyEffectThumbnailEngine(long j) {
        if (j == 0) {
            return 0;
        }
        nativeDestroyEffectThumbnailEngine(j);
        return 0;
    }

    public static QEffectPropertyInfo[] getIEPropertyInfo(QEngine qEngine, long j) {
        return nativeGetIEPropertyInfo(qEngine, j);
    }

    public static QEffectKeyLineInterfaceItem[] getKeyLineInterfaceItems(QEngine qEngine, long j) {
        return nativeGetKeyLineInterfaceItems(qEngine, j);
    }

    public static int[] getItemIDsInMotionTemplate(QEngine qEngine, long j) {
        return nativeGetItemIDsInMotionTemplate(qEngine, j);
    }

    public static boolean isFacePasterTemplate(long j) {
        QTemplateContentInfo templateContentInfo = getTemplateContentInfo(QTemplateIDUtils.mEngine, j);
        if (templateContentInfo != null) {
            return templateContentInfo.mIsNeedFaceFeature;
        }
        return (j & 2233785415443677184L) == 360287970190688256L;
    }

    public static String[] getThemeDefaultMusicPaths(QEngine qEngine, String str) {
        return nativeGetThemeDefaultMusicPaths(qEngine, str);
    }

    public static boolean getBubbleIsAdujestAlpha(QEngine qEngine, long j, QSize qSize) {
        return nativeGetBubbleIsAdujestAlpha(qEngine, j, qSize);
    }

    public static QTemplateContentInfo getTemplateContentInfo(QEngine qEngine, long j) {
        return nativeGetTemplateContentInfo(qEngine, j);
    }

    public QPasteSwitchInfo getPasteSwitchInfo() {
        return nativeGetPasteSwitchInfo(this.handle);
    }

    public QPasterABFaceInfo getPasterABFaceInfo() {
        return nativeGetPasterABFaceInfo(this.handle);
    }

    public QFreezeFrameBasicInfo getFreezeFrameBasicInfo() {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        return nativeGetFreezeFrameBasicInfo(j);
    }

    public boolean isSupportAlphaAdjust() {
        return nativeIsSupportAlphaAdjust(this.handle);
    }

    public boolean isOTSupportTemplate() {
        long id = getID();
        if (QTemplateIDUtils.getTemplateType(id) == 17 && QTemplateIDUtils.getTemplateSubType(id) == 2) {
            return true;
        }
        if (QTemplateIDUtils.getTemplateType(id) == 5 && QTemplateIDUtils.getTemplateSubType(id) == 3) {
            return true;
        }
        return nativeIsOTSupportTemplate(this.handle);
    }

    public QEffect3DMaterialItem[] get3DMaterialItemArray() {
        return nativeGet3DMaterialItemArray(this.handle);
    }

    public int getFilterDuration() {
        return nativeGetFilterDuration(this.handle);
    }

    public QTextMulInfo getTextMulInfo(QEngine qEngine, QSize qSize, int i) {
        return nativeGetTextMulInfo(qEngine, this.handle, qSize, i);
    }

    public boolean isGraffitiTemplate() {
        return QTemplateIDUtils.isGraffitiTemplate(getID());
    }

    public QSlideShowSceCfgInfo getSlideShowSceCfgInfo() {
        return nativeGetSlideShowSceCfgInfo(this.handle);
    }

    public boolean isSlideShowTheme() {
        return nativeIsSlideShowTheme(this.handle);
    }

    public boolean isFixedSizeTheme() {
        return nativeIsFixedSizeTheme(this.handle);
    }

    public int getThemeExportSize(QSize qSize) {
        return nativeGetThemeExportSize(this.handle, qSize);
    }

    public QSize[] getThemeExportSizeList() {
        return nativeGetThemeExportSizeList(this.handle);
    }

    public int getThemeCoverPosition() {
        return nativeGetThemeCoverPosition(this.handle);
    }

    public int getSceneDuration() {
        return nativeGetSceneDuration(this.handle);
    }
}