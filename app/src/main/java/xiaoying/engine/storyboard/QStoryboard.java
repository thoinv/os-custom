package xiaoying.engine.storyboard;

import xiaoying.engine.QEngine;
import xiaoying.engine.audioanalyze.QAudioAnalyzeParam;
import xiaoying.engine.base.IQSessionStateListener;
import xiaoying.engine.base.QRange;
import xiaoying.engine.base.QSession;
import xiaoying.engine.base.QVEError;
import xiaoying.engine.clip.QClip;
import xiaoying.engine.clip.QTransition;

public class QStoryboard extends QSession {
    public static final int LTCST_MULTI_PIC = 1;
    public static final int LTCST_SINGLE_VIDEO = 2;
    public static final int LYRIC_THEME_CLIP_SRC_TYPE = 0;
    public static final int PROP_AUDIO_APPLY_SCALE = 16406;
    public static final int PROP_AUDIO_PITCH_DELTA = 16403;
    public static final int PROP_AUTO_APPLY_THEME = 16387;
    private static final int PROP_BASE = 16384;
    public static final int PROP_FIT_TRACK = 16385;
    public static final int PROP_FORCE_STATIC_TRANS = 16398;
    public static final int PROP_IS_TIME_SCALE_USE_AUDIO_PITCH = 16408;
    public static final int PROP_IS_USE_STUFF_CLIP = 16405;
    public static final int PROP_ORIGINAL_DURATION = 16396;
    public static final int PROP_OUTPUT_RESOLUTION = 16395;
    public static final int PROP_RATIO_SETTED = 16400;
    public static final int PROP_RESET_THEME_ELEM = 16401;
    public static final int PROP_SINGLE_HW_INSTANCE = 16399;
    public static final int PROP_STUFF_CLIP_FPS = 16409;
    public static final int PROP_THEME_BACK_COVER = 16393;
    public static final int PROP_THEME_COVER = 16392;
    public static final int PROP_THEME_FILTER_MODE = 16407;
    public static final int PROP_THEME_ID = 16394;
    public static final int PROP_THEME_TEMPLATE = 16391;
    public static final int PROP_TIME_SCALE = 16402;
    public static final int THEME_FILTER_MODE_OVERLAY = 2;
    public static final int THEME_FILTER_MODE_REPLACE = 0;
    public static final int THEME_FILTER_MODE_RETAIN = 1;
    public static final int THEME_RESET_CODE_MUSIC = 1;
    private boolean isRefData = false;
    private QThemeOperation themeOPData = null;
    private IQThemeOperationListener themeOPListener = null;

    private native int nativeApplyTheme(QStoryboard qStoryboard, String str);

    private native int nativeApplyTrim(long j);

    private native QRange nativeConvertRangeOriginalToDst(long j, QRange qRange);

    private native int nativeCreate(QEngine qEngine, QStoryboard qStoryboard);

    private native int nativeDestroy(QStoryboard qStoryboard);

    private native int nativeDuplicate(QStoryboard qStoryboard, QStoryboard qStoryboard2);

    private native QProjectData nativeFetchProjectData(QStoryboard qStoryboard);

    private native QClip nativeGetClip(long j, int i);

    private native QClip nativeGetClipByUuid(long j, String str);

    private native int nativeGetClipCount(long j);

    private native QClipPosition[] nativeGetClipPositionArrayByTime(long j, int i);

    private native QClipPosition nativeGetClipPositionByIndex(long j, int i);

    private native QClipPosition nativeGetClipPositionByTime(long j, int i);

    private native QRange nativeGetClipTimeRange(long j, int i);

    private native QClip nativeGetDataClip(long j);

    private native int nativeGetDuration(long j);

    private native int nativeGetIndexByClipPosition(long j, QClipPosition qClipPosition);

    private native int nativeGetProjectEngineVersion(QStoryboard qStoryboard, String str);

    private native QClip nativeGetStuffClip(long j);

    private native int nativeGetTimeByClipPosition(long j, QClipPosition qClipPosition);

    private native QTransition nativeGetTransitionInfo(long j, int i);

    private native QRange nativeGetTransitionTimeRange(long j, int i);

    private native int nativeInsertClip(long j, QClip qClip, int i);

    private native int nativeLoadProject(QStoryboard qStoryboard, String str);

    private native int nativeLoadProjectData(QStoryboard qStoryboard, String str);

    private native int nativeMoveClip(long j, QClip qClip, int i);

    private native int nativeRemoveAllClip(long j);

    private native int nativeRemoveClip(long j, QClip qClip);

    private native int nativeSaveProject(QStoryboard qStoryboard, String str);

    private native int nativeSetLyricThemeAVParam(String str, QAudioAnalyzeParam qAudioAnalyzeParam, boolean z, int i);

    private native int nativeSetLyricThemeClipTransLation(long j);

    @Override // xiaoying.engine.base.QSession
    public int init(QEngine qEngine, IQSessionStateListener iQSessionStateListener) {
        super.init(qEngine, iQSessionStateListener);
        return nativeCreate(qEngine, this);
    }

    public QEngine getEngine() {
        return this.engine;
    }

    @Override // xiaoying.engine.base.QSession
    public int unInit() {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeDestroy(this);
    }

    public int duplicate(QStoryboard qStoryboard) {
        return nativeDuplicate(this, qStoryboard);
    }

    public int getDuration() {
        if (0 == this.handle) {
            return 0;
        }
        return nativeGetDuration(this.handle);
    }

    public int getClipCount() {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeGetClipCount(this.handle);
    }

    public int insertClip(QClip qClip, int i) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeInsertClip(this.handle, qClip, i);
    }

    public int removeClip(QClip qClip) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeRemoveClip(this.handle, qClip);
    }

    public int removeAllClip() {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeRemoveAllClip(this.handle);
    }

    public int moveClip(QClip qClip, int i) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeMoveClip(this.handle, qClip, i);
    }

    public QClip getClip(int i) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetClip(this.handle, i);
    }

    public QClip getClipByUuid(String str) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetClipByUuid(this.handle, str);
    }

    public QClip getDataClip() {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetDataClip(this.handle);
    }

    public QClip getStuffClip() {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetStuffClip(this.handle);
    }

    public int loadProject(String str, IQSessionStateListener iQSessionStateListener) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        this.listener = iQSessionStateListener;
        return nativeLoadProject(this, str);
    }

    public int loadProjectData(String str, IQSessionStateListener iQSessionStateListener) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        this.listener = iQSessionStateListener;
        return nativeLoadProjectData(this, str);
    }

    public QProjectData fetchProjectData() {
        if (0 == this.handle) {
            return null;
        }
        return nativeFetchProjectData(this);
    }

    public int saveProject(String str, IQSessionStateListener iQSessionStateListener) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        this.listener = iQSessionStateListener;
        return nativeSaveProject(this, str);
    }

    public int applyTheme(String str, IQSessionStateListener iQSessionStateListener) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        this.listener = iQSessionStateListener;
        return nativeApplyTheme(this, str);
    }

    public int SetLyricThemeAVParam(String str, QAudioAnalyzeParam qAudioAnalyzeParam, boolean z, int i) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeSetLyricThemeAVParam(str, qAudioAnalyzeParam, z, i);
    }

    public int SetLyricThemeClipTransLation(long j) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeSetLyricThemeClipTransLation(j);
    }

    public int setThemeOperationListener(IQThemeOperationListener iQThemeOperationListener) {
        this.themeOPListener = iQThemeOperationListener;
        return 0;
    }

    public QClipPosition GetClipPositionByTime(int i) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetClipPositionByTime(this.handle, i);
    }

    public QClipPosition[] GetClipPositionArrayByTime(int i) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetClipPositionArrayByTime(this.handle, i);
    }

    public QClipPosition GetClipPositionByIndex(int i) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetClipPositionByIndex(this.handle, i);
    }

    public int GetTimeByClipPosition(QClipPosition qClipPosition) {
        if (0 == this.handle) {
            return -1;
        }
        return nativeGetTimeByClipPosition(this.handle, qClipPosition);
    }

    public int GetIndexByClipPosition(QClipPosition qClipPosition) {
        if (0 == this.handle) {
            return -1;
        }
        return nativeGetIndexByClipPosition(this.handle, qClipPosition);
    }

    private int onThemeOperation(QThemeOperation qThemeOperation) {
        IQThemeOperationListener iQThemeOperationListener = this.themeOPListener;
        if (iQThemeOperationListener == null) {
            return 0;
        }
        return iQThemeOperationListener.onThemeOperation(this.themeOPData);
    }

    public int applyTrim() {
        if (this.handle == 0) {
            return -1;
        }
        return nativeApplyTrim(this.handle);
    }

    public QRange convertRangeOriginalToDst(QRange qRange) {
        if (this.handle == 0) {
            return null;
        }
        return nativeConvertRangeOriginalToDst(this.handle, qRange);
    }

    public QRange getTransitionTimeRange(int i) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetTransitionTimeRange(this.handle, i);
    }

    public QRange getClipTimeRange(int i) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetClipTimeRange(this.handle, i);
    }

    public QTransition getTransitionInfo(int i) {
        if (0 == this.handle) {
            return null;
        }
        return nativeGetTransitionInfo(this.handle, i);
    }

    public int getProjectEngineVersion(String str) {
        if (0 == this.handle) {
            return 0;
        }
        return nativeGetProjectEngineVersion(this, str);
    }
}