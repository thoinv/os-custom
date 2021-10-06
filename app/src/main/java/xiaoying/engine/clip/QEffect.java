package xiaoying.engine.clip;

import xiaoying.basedef.QPointFloat;
import xiaoying.engine.QEngine;
import xiaoying.engine.base.QDrawLayerPaintPen;
import xiaoying.engine.base.QRange;
import xiaoying.engine.base.QStyle;
import xiaoying.engine.base.QTransformInfo;
import xiaoying.engine.base.QVEError;
import xiaoying.engine.clip.QKeyFrameColorCurveData;
import xiaoying.engine.clip.QKeyFrameCommonData;
import xiaoying.engine.clip.QKeyFrameFloatData;
import xiaoying.engine.clip.QKeyFrameMaskData;
import xiaoying.engine.clip.QKeyFrameTransformData;
import xiaoying.engine.clip.QKeyFrameTransformPosData;
import xiaoying.engine.clip.QKeyFrameTransformRotationData;
import xiaoying.engine.clip.QKeyFrameTransformScaleData;
import xiaoying.engine.clip.QKeyFrameUniformData;
import xiaoying.utils.QRect;
import xiaoying.utils.QSize;

public class QEffect {
    public static final int ANIMATE_POINT_OPERATION_DELETE = 1;
    public static final int ANIMATE_POINT_OPERATION_DELETE_ALL = 2;
    public static final int ANIMATE_POINT_OPERATION_INSERT = 0;
    public static final int ANIMATE_POINT_OPERATION_MODIFY = 3;
    public static final int AUDIO_FRAME_MODE_ALIGN_LEFT = 2;
    public static final int AUDIO_FRAME_MODE_ALIGN_RIGHT = 3;
    public static final int AUDIO_FRAME_MODE_NORMAL = 0;
    public static final int AUDIO_FRAME_MODE_REPEAT = 1;
    public static final int DUPLICATE_PART_EFFECT_TYPE_DRAW = 1;
    public static final int DUPLICATE_PART_EFFECT_TYPE_NONE = 0;
    public static final int EFFECT_REGION_ALIGN_MODE_DEFALUT = 0;
    public static final int EFFECT_REGION_ALIGN_MODE_WIDTH = 0;
    public static final int EFFECT_REGION_ALIGN_MODE_WIDTH_PERCENT = 1;
    public static final int EFFECT_SUB_ITEM_TYPE_ALPHA = 3;
    public static final int EFFECT_SUB_ITEM_TYPE_APPLY_MODE_EFFECT = 1;
    public static final int EFFECT_SUB_ITEM_TYPE_APPLY_MODE_MIX = 3;
    public static final int EFFECT_SUB_ITEM_TYPE_APPLY_MODE_MOTION_TITLE = 2;
    public static final int EFFECT_SUB_ITEM_TYPE_APPLY_MODE_STORYBOARD = 0;
    public static final int EFFECT_SUB_ITEM_TYPE_BASE = 0;
    public static final int EFFECT_SUB_ITEM_TYPE_CHROMA = 1;
    public static final int EFFECT_SUB_ITEM_TYPE_FILTER = 2;
    public static final int EFFECT_SUB_ITEM_TYPE_MASK = 4;
    public static final int EFFECT_SUB_ITEM_TYPE_MIXER = 15;
    public static final int EFFECT_SUB_ITEM_TYPE_MOTION_TITLE = 5;
    public static final int EFFECT_TIME_POSITION_ALIGNMENT_MODE_END = 1;
    public static final int EFFECT_TIME_POSITION_ALIGNMENT_MODE_MID = 2;
    public static final int EFFECT_TIME_POSITION_ALIGNMENT_MODE_START = 0;
    public static final int PROP_AUDIO_FRAME_ADJUST_DB = 4115;
    public static final int PROP_AUDIO_FRAME_FADEIN = 4116;
    public static final int PROP_AUDIO_FRAME_FADEOUT = 4117;
    public static final int PROP_AUDIO_FRAME_MIXPERCENT = 4114;
    public static final int PROP_AUDIO_FRAME_RANGE = 4112;
    public static final int PROP_AUDIO_FRAME_REPEAT_MODE = 4113;
    public static final int PROP_AUDIO_FRAME_SOURCE = 4111;
    private static final int PROP_BASE = 4096;
    public static final int PROP_EFFECT_3D_TRANSFORM_MODE = 4325;
    public static final int PROP_EFFECT_ADDBYTHEME = 4128;
    public static final int PROP_EFFECT_ANIMATE_POINT_GENERATOR = 4131;
    public static final int PROP_EFFECT_APPLIED_OFFSET = 4306;
    public static final int PROP_EFFECT_AUDIO_ADDITIONAL_TIME = 4133;
    public static final int PROP_EFFECT_AUDIO_FRAME_LRCTMP_ID = 4157;
    public static final int PROP_EFFECT_AUDIO_FRAME_LRC_FILE = 4156;
    public static final int PROP_EFFECT_AUDIO_FRAME_LRC_LIST = 4171;
    public static final int PROP_EFFECT_AUDIO_FRAME_MUTE = 4148;
    public static final int PROP_EFFECT_AUDIO_FRAME_SOURCE_RANGE = 4187;
    public static final int PROP_EFFECT_AUDIO_FRAME_TITLE = 4188;
    public static final int PROP_EFFECT_AUDIO_GAIN = 4209;
    public static final int PROP_EFFECT_AUDIO_IS_NEED_NSX = 4360;
    public static final int PROP_EFFECT_AUDIO_LYRIC_TEXT_INFO_LIST = 4175;
    public static final int PROP_EFFECT_AUDIO_PITCH_DELTA = 4314;
    public static final int PROP_EFFECT_AUDIO_SOURCE = 4311;
    public static final int PROP_EFFECT_AV_SOURCE = 4139;
    public static final int PROP_EFFECT_AV_SOURCE_RANGE = 4140;
    public static final int PROP_EFFECT_AV_SOURCE_REPEAT = 4141;
    public static final int PROP_EFFECT_BLEND_ALPHA = 4164;
    public static final int PROP_EFFECT_BLEND_MODE = 4351;
    public static final int PROP_EFFECT_CHANGE_TRACK_TYPE = 4310;
    public static final int PROP_EFFECT_DEL_KEYLINE_ITEM = 4221;
    public static final int PROP_EFFECT_DRAW_LAYER_DATA_CLEAR = 4348;
    public static final int PROP_EFFECT_DRAW_LAYER_LIST_COUNT = 4343;
    public static final int PROP_EFFECT_DRAW_LAYER_RECORD_LIST_COUNT = 4344;
    public static final int PROP_EFFECT_DST_RATIO = 4168;
    public static final int PROP_EFFECT_EFFECT_SEG_MASK = 4330;
    public static final int PROP_EFFECT_ENABLE_DRAW_BACKGROUND = 4297;
    public static final int PROP_EFFECT_EQ_BAND_FREQUENCY = 4192;
    public static final int PROP_EFFECT_EQ_BAND_VALUE = 4191;
    public static final int PROP_EFFECT_FACE_PASTER_MAX_FACE_ONLY = 4356;
    public static final int PROP_EFFECT_FACE_SET_BY_USER = 4357;
    public static final int PROP_EFFECT_FD_RESULT = 4169;
    public static final int PROP_EFFECT_FFRAME_AUDIO_RANGE = 7941;
    public static final int PROP_EFFECT_FFRAME_AUDIO_SOURCE = 7940;
    public static final int PROP_EFFECT_FFRAME_ENABLE = 7944;
    public static final int PROP_EFFECT_FFRAME_FRAME_SETTING = 7942;
    public static final int PROP_EFFECT_FFRAME_ORG_RANGE = 7943;
    public static final int PROP_EFFECT_FFRAME_RANGE = 7937;
    public static final int PROP_EFFECT_FFRAME_SOURCE = 7939;
    public static final int PROP_EFFECT_FFRAME_TYPE = 7938;
    public static final int PROP_EFFECT_FRAME_BGSIZE = 4132;
    public static final int PROP_EFFECT_FRAME_SCALE = 4334;
    public static final int PROP_EFFECT_FRAME_STATIC_PICTURE = 4172;
    public static final int PROP_EFFECT_GROUP_COMP_SIZE = 4352;
    public static final int PROP_EFFECT_GROUP_CUSTOM_SOURCE_3D_TRANSFORM = 4350;
    public static final int PROP_EFFECT_GROUP_SOURCE_3D_TRANSFORM = 4349;
    public static final int PROP_EFFECT_INSTANT_VIDEO_REGION = 4213;
    public static final int PROP_EFFECT_INSTANT_VIDEO_ROTATION = 4214;
    public static final int PROP_EFFECT_INSTANT_VIDEO_TRANSFORM_APPLY = 4212;
    public static final int PROP_EFFECT_INSTANT_VIDEO_TRANSFORM_SET = 4211;
    public static final int PROP_EFFECT_INVERSE_PLAY_AUDIO_FLAG = 4338;
    public static final int PROP_EFFECT_INVERSE_PLAY_SOURCE_RANGE = 4339;
    public static final int PROP_EFFECT_INVERSE_PLAY_VIDEO_FLAG = 4337;
    public static final int PROP_EFFECT_IS_DRAWING = 4347;
    public static final int PROP_EFFECT_IS_FRAME_MODE = 4158;
    public static final int PROP_EFFECT_IS_RENDER_EVEN_NOFACE = 4219;
    public static final int PROP_EFFECT_KEYFRAME_2D_TO_3D_TRANSFORM = 4353;
    public static final int PROP_EFFECT_KEYFRAME_AUDIO = 4202;
    public static final int PROP_EFFECT_KEYFRAME_AUDIO_SET = 4203;
    public static final int PROP_EFFECT_KEYFRAME_CLEAR = 4197;
    public static final int PROP_EFFECT_KEYFRAME_COLORA = 4200;
    public static final int PROP_EFFECT_KEYFRAME_COLORA_SET = 4201;
    public static final int PROP_EFFECT_KEYFRAME_COLORCURVE = 4229;
    public static final int PROP_EFFECT_KEYFRAME_COLORCURVE_SET = 4230;
    public static final int PROP_EFFECT_KEYFRAME_LEVEL = 4204;
    public static final int PROP_EFFECT_KEYFRAME_LEVEL_SET = 4205;
    public static final int PROP_EFFECT_KEYFRAME_MASK = 4215;
    public static final int PROP_EFFECT_KEYFRAME_MASK_SET = 4216;
    public static final int PROP_EFFECT_KEYFRAME_OPACITY = 4206;
    public static final int PROP_EFFECT_KEYFRAME_OPACITY_SET = 4207;
    public static final int PROP_EFFECT_KEYFRAME_TRANSFORM = 4198;
    public static final int PROP_EFFECT_KEYFRAME_TRANSFORM_ORIGIN_REGION = 4208;
    public static final int PROP_EFFECT_KEYFRAME_TRANSFORM_POS = 4232;
    public static final int PROP_EFFECT_KEYFRAME_TRANSFORM_ROTATION = 4234;
    public static final int PROP_EFFECT_KEYFRAME_TRANSFORM_SCALE = 4236;
    public static final int PROP_EFFECT_KEYFRAME_TRANSFORM_SET = 4199;
    public static final int PROP_EFFECT_KEYFRAME_UNIFORM_LIST = 4227;
    public static final int PROP_EFFECT_KEYLINE_DISPLAY_RECT = 4224;
    public static final int PROP_EFFECT_KEYLINE_ITEM_SET = 4222;
    public static final int PROP_EFFECT_ONSET_THRESHHOLD = 4328;
    public static final int PROP_EFFECT_OT_COORD_FILE_FINISHED = 4153;
    public static final int PROP_EFFECT_OT_RECT = 4151;
    public static final int PROP_EFFECT_PARAM_DATA = 4135;
    public static final int PROP_EFFECT_PIP_STORYBOARD_INFO = 4317;
    public static final int PROP_EFFECT_POSITION_ALIGNMENT = 4146;
    public static final int PROP_EFFECT_PROPDATA = 4129;
    public static final int PROP_EFFECT_PS_EMITTER_POS_END = 4160;
    public static final int PROP_EFFECT_PS_EMITTER_POS_POINT = 4159;
    public static final int PROP_EFFECT_RANGE_EXT = 4315;
    public static final int PROP_EFFECT_REGION_ALIGN_MODE = 4313;
    public static final int PROP_EFFECT_RESET_SEG_MASK = 4333;
    public static final int PROP_EFFECT_RTA_ENABLED = 4127;
    public static final int PROP_EFFECT_SCALE_REGION_RATIO = 4176;
    public static final int PROP_EFFECT_SUB_EFFECT_DISABLE = 4332;
    public static final int PROP_EFFECT_SUB_EFFECT_RANGE = 4307;
    public static final int PROP_EFFECT_SUB_SOURCE_CHORMA_COLOR = 4303;
    public static final int PROP_EFFECT_SUB_SOURCE_CHORMA_PROP = 4300;
    public static final int PROP_EFFECT_SUB_TEMPLATE_ID = 4173;
    public static final int PROP_EFFECT_TA_SOURCE = 4136;
    public static final int PROP_EFFECT_TA_SOURCE_LIST = 4134;
    public static final int PROP_EFFECT_TEXT_ADV_STYLE = 4318;
    public static final int PROP_EFFECT_TEXT_ATTACHMENT_DURATION = 4194;
    public static final int PROP_EFFECT_TEXT_ATTACHMENT_ID = 4193;
    public static final int PROP_EFFECT_TEXT_BOARD_CONFIG = 4323;
    public static final int PROP_EFFECT_THEME_POS_TYPE = 4130;
    public static final int PROP_EFFECT_TIME_FACTOR = 4329;
    public static final int PROP_EFFECT_UNIQUE_IDENTIFIER = 4302;
    public static final int PROP_EFFECT_UPDATE_GROUP_ID = 4309;
    public static final int PROP_EFFECT_UPDATE_KEYLINE_ITEM = 4220;
    public static final int PROP_EFFECT_USE_NEW_ADUIO_MIX_MODE = 4210;
    public static final int PROP_EFFECT_UUID = 4316;
    public static final int PROP_EFFECT_VIDEOFRAME_ANCHOR = 4238;
    public static final int PROP_EFFECT_VIDEOFRAME_SRCRANGE = 4189;
    public static final int PROP_EFFECT_VIDEO_FRAME_ANCHOR_APPLY = 4239;
    public static final int PROP_EFFECT_VIDEO_FRAME_CROP_REGION = 4320;
    public static final int PROP_EFFECT_VISIBILITY = 4125;
    public static final int PROP_FFRAME_BASE = 7936;
    public static final int PROP_GROUP = 4099;
    public static final int PROP_IS_READ_ONLY = 4118;
    public static final int PROP_LAYER = 4100;
    public static final int PROP_ORIGINAL_RANGE = 4119;
    public static final int PROP_RANGE = 4098;
    public static final int PROP_TYPE = 4097;
    public static final int PROP_USERDATA = 4101;
    public static final int PROP_VIDEO_FRAME_BG_RESOLUTION = 4110;
    public static final int PROP_VIDEO_FRAME_EFFECT = 4106;
    public static final int PROP_VIDEO_FRAME_FPS = 4109;
    public static final int PROP_VIDEO_FRAME_MASK = 4105;
    public static final int PROP_VIDEO_FRAME_MULTI_SOURCE = 4185;
    public static final int PROP_VIDEO_FRAME_RANGE = 4108;
    public static final int PROP_VIDEO_FRAME_ROTATION = 4121;
    public static final int PROP_VIDEO_FRAME_SOURCE = 4104;
    public static final int PROP_VIDEO_FRAME_STATIC = 4126;
    public static final int PROP_VIDEO_FRAME_TEMPLATE = 4124;
    public static final int PROP_VIDEO_FRAME_TRANSPARENCY = 4107;
    public static final int PROP_VIDEO_FRAME_X_FLIP = 4122;
    public static final int PROP_VIDEO_FRAME_Y_FLIP = 4123;
    public static final int PROP_VIDEO_IE_CONFIGURE = 4120;
    public static final int PROP_VIDEO_IE_SOURCE = 4103;
    public static final int PROP_VIDEO_REGION_RATIO = 4102;
    public static final int TEXT_ATTACH_COMPLEX_STYLE = 0;
    public static final int TEXT_ATTACH_HEAD_ANIMATE = 2;
    public static final int TEXT_ATTACH_LOOP_ANIMATE = 1;
    public static final int TEXT_ATTACH_TAIL_ANIMATE = 3;
    public static final int TRACK_TYPE_AUDIO = 3;
    private static final int TRACK_TYPE_BASE = 0;
    public static final int TRACK_TYPE_FREEZE_FRAME = 4;
    public static final int TRACK_TYPE_PRIMAL_VIDEO = 1;
    public static final int TRACK_TYPE_VIDEO = 2;
    public static final int TRAJECTORY_IDX_HEAD = 0;
    public static final int TRAJECTORY_IDX_TAIL = -1;
    public static final int TYPE_AUDIO_FRAME = 3;
    private static final int TYPE_BASE = 0;
    public static final int TYPE_COMBO_VIDEO_IE = 6;
    public static final int TYPE_FREEZE_FRAME = 4;
    public static final int TYPE_GROUP_FRAME = 7;
    public static final int TYPE_VIDEO_FRAME = 2;
    public static final int TYPE_VIDEO_FRAME_GROUP = 8;
    public static final int TYPE_VIDEO_IE = 1;
    private long handle = 0;
    private long masktmpbufferhandle = 0;
    private long sphandle = 0;
    private long spweakhandle = 0;
    private long tmpbufferhandle = 0;

    public static class QEffectAnimatePointData {
        public int duration;
        public int opacity;
        public QRect rcCrop;
        public QRect rcDisplay;
        public float rotation;
    }

    public static class QEffectAnimatePointOptData {
        public QEffectAnimatePointData animatepoint;
        public int opttype;
        public int pointindex;
    }

    public enum QEffectBlendMode {
        kQVAEBlendModeNone,
        kQVAEBlendModeAdd,
        kQVAEBlendModeHue,
        kQVAEBlendModeColor,
        kQVAEBlendModeDivide,
        kQVAEBlendModeScreen,
        kQVAEBlendModeNormal,
        kQVAEBlendModeDarken,
        kQVAEBlendModeLighten,
        kQVAEBlendModeOverlay,
        kQVAEBlendModeHardMix,
        kQVAEBlendModePinLight,
        kQVAEBlendModeAlphaAdd,
        kQVAEBlendModeSubstrct,
        kQVAEBlendModeMultiply,
        kQVAEBlendModeDissolve,
        kQVAEBlendModeExclusion,
        kQVAEBlendModeHardLight,
        kQVAEBlendModeSoftLight,
        kQVAEBlendModeColorBurn,
        kQVAEBlendModeColorDodge,
        kQVAEBlendModeVividLight,
        kQVAEBlendModeDifference,
        kQVAEBlendModeSaturation,
        kQVAEBlendModeLuminosity,
        kQVAEBlendModeLinearBurn,
        kQVAEBlendModeLinearDodge,
        kQVAEBlendModeLinearLight,
        kQVAEBlendModeStencilLuma,
        kQVAEBlendModeDarkerColor,
        kQVAEBlendModeLighterColor,
        kQVAEBlendModeStencilAlpha,
        kQVAEBlendModeSilhouetteLuma,
        kQVAEBlendModeSilhouetteAlpha,
        kQVAEBlendModeDancingDissolve,
        kQVAEBlendModeClassicColorBurn,
        kQVAEBlendModeClassicColorDodge,
        kQVAEBlendModeClassicDifference,
        kQVAEBlendModeLuminescentPremul
    }

    public static class QEffectExternalSource {
        public QRect mCropRect;
        public QRange mDataRange;
        public int mRotation;
        public QMediaSource mSource;
    }

    public static class QEffectStoryboardInfo {
        public long m_hStoryboard = 0;
        public String m_sProjectPath = null;
    }

    public static class QEffectSubChormaProp {
        public int m_X;
        public int m_Y;
        public boolean m_bEnablePoint;
        public boolean m_bRefreshFrame;
    }

    public static class QEffectSubTemplateID {
        public int index = 0;
        public long templateid = 0;
    }

    public static class QEffectTextAttachDuration {
        public int duration = 0;
        public int type = 0;
    }

    public static class QEffectTextAttachFileInfo {
        public int designTime = 0;
        public int type = 0;
    }

    public static class QEffectTextAttachID {
        public long templateid = 0;
        public int type = 0;
    }

    public static class QFacePasterTransform {
        public QSize bgSize = null;
        public boolean setByUser = false;
        public QTransformInfo transform = null;
    }

    public static int getSubItemType(long j) {
        return (int) ((j & 16711680) >> 16);
    }

    private native int nativeAppendLayerLinePoint(long j, QPointFloat qPointFloat);

    private native int nativeCopyPartFormEffect(long j, long j2, int i);

    private native int nativeCreate(QEngine qEngine, QEffect qEffect, int i, int i2, int i3, float f);

    private native QEffectAnimatePointOperator nativeCreateAnimatePointOperator(long j, QSize qSize);

    private native void nativeDestorySubItemEffect(int i, float f);

    private native void nativeDestorySubItemList();

    private native int nativeDestroy(QEffect qEffect);

    private native int nativeDuplicate(long j, QEffect qEffect);

    private native int nativeEffectGroupDeleteEffect(long j, long j2);

    private native QEffect nativeEffectGroupGetEffectByIndex(long j, int i);

    private native int nativeEffectGroupGetEffectCount(long j);

    private native int nativeEffectGroupInsertEffect(long j, QEffect qEffect);

    private native int nativeEffectGroupRefreshGroup(long j);

    private native int nativeEndLayerPaintLine(long j);

    private native QTransformInfo nativeGet3DTransformInfo(long j);

    private native QTransformInfo nativeGet3DTransformInfoInGroup(long j, long j2);

    private native int nativeGetAttachDuration(long j, int i);

    private native long nativeGetAttachID(long j, int i);

    private static native QKeyFrameCommonData.Value nativeGetCurrentValueForKeyframeCommon(QKeyFrameCommonData qKeyFrameCommonData, int i);

    private static native QKeyFrameTransformData.Value nativeGetCurrentValueForKeyframeTransform(QKeyFrameTransformData qKeyFrameTransformData, int i);

    private static native QKeyFrameTransformPosData.Value nativeGetCurrentValueForKeyframeTransformPos(QKeyFrameTransformPosData qKeyFrameTransformPosData, int i);

    private native QEffectDisplayInfo nativeGetDisplayInfo(long j, int i);

    private native QEffect nativeGetEffectGroup(long j);

    private native QStyle.QEffectPropertyData nativeGetEffectPropData(long j, int i);

    private native int nativeGetExternalSource(int i, QEffectExternalSource qEffectExternalSource);

    private native QFacePasterTransform nativeGetFacePasterTransform(long j, int i, int i2);

    private native QTransformInfo nativeGetKeyFrame3DTransformInfo(long j, int i);

    private native QKeyFrameCommonData nativeGetKeyFrameCommonData(long j, int i);

    private native QKeyFrameCommonData[] nativeGetKeyFrameCommonDataList(long j);

    private native QKeyFrameColorCurveData.OutValue nativeGetKeyframeColorCurveValue(long j, int i);

    private native QKeyFrameFloatData.Value nativeGetKeyframeLevelValue(long j, int i);

    private native QKeyFrameMaskData.Value nativeGetKeyframeMaskValue(long j, int i);

    private native QKeyFrameTransformPosData.Value nativeGetKeyframeTransformPosValue(long j, int i);

    private native QKeyFrameTransformRotationData.Value nativeGetKeyframeTransformRotationValue(long j, int i);

    private native QKeyFrameTransformScaleData.Value nativeGetKeyframeTransformScaleValue(long j, int i);

    private native QKeyFrameTransformData.Value nativeGetKeyframeTransformValue(long j, int i);

    private native QKeyFrameUniformData.Value nativeGetKeyframeUniform(long j, String str, int i);

    private native QKeyFrameUniformData nativeGetKeyframeUniformData(long j, String str);

    private native Object nativeGetProp(long j, int i);

    private native QEffectSubItemSource nativeGetSubItemSource(int i, float f);

    private native QEffectSubItemSource[] nativeGetSubItemSourceList();

    private static native int nativeGetTextAttachFileInfo(String str, QEffectTextAttachFileInfo qEffectTextAttachFileInfo);

    private native int nativeGetTextAttachFileInfoById(long j, long j2, QEffectTextAttachFileInfo qEffectTextAttachFileInfo);

    private native QTrajectoryData nativeGetTrajectory(long j, int i);

    private native int nativeGetTrajectoryCount(long j);

    private native int nativeInsertNewTrajectory(long j, int i, QTrajectoryData qTrajectoryData);

    private native int nativeInsertOrReplaceKeyFrameCommonValue(long j, int i, QKeyFrameCommonData.Value value);

    private native int nativeLayerPaintRedo(long j);

    private native int nativeLayerPaintUndo(long j);

    private native int nativeMoveSubItemSourceFromIndex(QEffect qEffect, int i);

    private native void nativeRemoveAllTrajectory(long j);

    private native int nativeRemoveKeyFrameCommonValue(long j, int i, float f);

    private native int nativeRemoveTrajectory(long j, int i);

    private native int nativeReplaceEffect(long j, QEffect[] qEffectArr);

    private native int nativeSet3DTransformInfo(long j, QTransformInfo qTransformInfo);

    private native int nativeSetExternalSource(int i, QEffectExternalSource qEffectExternalSource);

    private native void nativeSetFacePasterTransform(long j, QFacePasterTransform qFacePasterTransform, int i, int i2);

    private native int nativeSetKeyFrameCommonData(long j, QKeyFrameCommonData qKeyFrameCommonData);

    private native int nativeSetKeyframeUniformData(long j, QKeyFrameUniformData qKeyFrameUniformData);

    private native int nativeSetProp(QEffect qEffect, int i, Object obj);

    private native int nativeSetSubItemSource(QEffectSubItemSource qEffectSubItemSource);

    private native int nativeSetSubItemSourceFromIndex(QEffectSubItemSource qEffectSubItemSource, int i);

    private native int nativeSetSubItemSourceList(QEffectSubItemSource[] qEffectSubItemSourceArr);

    private native int nativeStartLayerPaintLine(long j, QDrawLayerPaintPen qDrawLayerPaintPen);

    private native int nativeUpdateKeyFrameCommonBaseValue(long j, int i, float f);

    private native int nativeUpdateTrajectory(long j, int i, QTrajectoryData qTrajectoryData);

    public int create(QEngine qEngine, int i, int i2, int i3, float f) {
        return nativeCreate(qEngine, this, i2, i3, i, f);
    }

    public int destory() {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeDestroy(this);
    }

    public QEffect duplicate() {
        if (0 == this.handle) {
            return null;
        }
        QEffect qEffect = new QEffect();
        if (nativeDuplicate(this.handle, qEffect) != 0) {
            return null;
        }
        return qEffect;
    }

    public int setProperty(int i, Object obj) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeSetProp(this, i, obj);
    }

    public Object getProperty(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetProp(j, i);
    }

    public QEffectDisplayInfo getDisplayInfo(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetDisplayInfo(j, i);
    }

    public int getTrajectoryCount() {
        long j = this.handle;
        if (0 == j) {
            return -1;
        }
        return nativeGetTrajectoryCount(j);
    }

    public QTrajectoryData getTrajectory(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetTrajectory(j, i);
    }

    public int insertNewTrajectory(int i, QTrajectoryData qTrajectoryData) {
        long j = this.handle;
        if (0 == j) {
            return -1;
        }
        return nativeInsertNewTrajectory(j, i, qTrajectoryData);
    }

    public int updateTrajectory(int i, QTrajectoryData qTrajectoryData) {
        long j = this.handle;
        if (0 == j) {
            return -1;
        }
        return nativeUpdateTrajectory(j, i, qTrajectoryData);
    }

    public int removeTrajectory(int i) {
        long j = this.handle;
        if (0 == j) {
            return -1;
        }
        return nativeRemoveTrajectory(j, i);
    }

    public void removeAllTrajectory() {
        long j = this.handle;
        if (0 != j) {
            nativeRemoveAllTrajectory(j);
        }
    }

    public QKeyFrameTransformData.Value getKeyframeTransformValue(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetKeyframeTransformValue(j, i);
    }

    public QKeyFrameTransformPosData.Value getKeyframeTransformPosValue(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetKeyframeTransformPosValue(j, i);
    }

    public QKeyFrameTransformRotationData.Value getKeyframeTransformRotationValue(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetKeyframeTransformRotationValue(j, i);
    }

    public QKeyFrameTransformScaleData.Value getKeyframeTransformScaleValue(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetKeyframeTransformScaleValue(j, i);
    }

    public QKeyFrameMaskData.Value getKeyframeMaskValue(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetKeyframeMaskValue(j, i);
    }

    public QKeyFrameFloatData.Value getKeyframeLevelValue(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetKeyframeLevelValue(j, i);
    }

    public QKeyFrameColorCurveData.OutValue getKeyframeColorCurveValue(int i) {
        long j = this.handle;
        if (0 == j) {
            return null;
        }
        return nativeGetKeyframeColorCurveValue(j, i);
    }

    public int getExternalSource(int i, QEffectExternalSource qEffectExternalSource) {
        return nativeGetExternalSource(i, qEffectExternalSource);
    }

    public int setExternalSource(int i, QEffectExternalSource qEffectExternalSource) {
        return nativeSetExternalSource(i, qEffectExternalSource);
    }

    public QEffectAnimatePointOperator createAnimatePointOpertor(QSize qSize) {
        return nativeCreateAnimatePointOperator(this.handle, qSize);
    }

    public QStyle.QEffectPropertyData getEffectPropData(int i) {
        return nativeGetEffectPropData(this.handle, i);
    }

    public static class QEffectSubItemSource {
        public float m_fLayerID = 0.0f;
        private long m_lEffectHandle = 0;
        private long m_lspEffectHandle = 0;
        public QMediaSource m_mediaSource = null;
        public int m_nEffctSubType = 0;
        public int m_nEffectMode = 0;
        public int m_nFrameType = 0;

        public QEffectSubItemSource() {
        }

        public QEffectSubItemSource(int i, float f, int i2, int i3, long j, QMediaSource qMediaSource) {
            this.m_nEffctSubType = i;
            this.m_fLayerID = f;
            this.m_nFrameType = i2;
            this.m_nEffectMode = i3;
            this.m_lEffectHandle = j;
            if (qMediaSource != null && qMediaSource.getSource() != null && qMediaSource.getSourceType() == 0) {
                this.m_mediaSource = new QMediaSource(qMediaSource.getSourceType(), qMediaSource.isTempSource(), new String((String) qMediaSource.getSource()));
            }
        }
    }

    public void setEffectHandle(long j) {
        this.handle = j;
    }

    public void setEffectSpWeakHandle(long j) {
        this.spweakhandle = j;
    }

    public int setSubItemSource(QEffectSubItemSource qEffectSubItemSource) {
        return nativeSetSubItemSource(qEffectSubItemSource);
    }

    public int setSubItemSourceFromIndex(QEffectSubItemSource qEffectSubItemSource, int i) {
        return nativeSetSubItemSourceFromIndex(qEffectSubItemSource, i);
    }

    public int moveSubItemSourceFromIndex(QEffect qEffect, int i) {
        return nativeMoveSubItemSourceFromIndex(qEffect, i);
    }

    public QEffectSubItemSource getSubItemSource(int i, float f) {
        return nativeGetSubItemSource(i, f);
    }

    public int setSubItemSourceList(QEffectSubItemSource[] qEffectSubItemSourceArr) {
        return nativeSetSubItemSourceList(qEffectSubItemSourceArr);
    }

    public QEffectSubItemSource[] getSubItemSourceList() {
        return nativeGetSubItemSourceList();
    }

    public QEffectSubItemSource[] getSubItemSourceList(int i, int i2) {
        QEffectSubItemSource[] nativeGetSubItemSourceList = nativeGetSubItemSourceList();
        if (nativeGetSubItemSourceList == null) {
            return null;
        }
        int length = nativeGetSubItemSourceList.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (nativeGetSubItemSourceList[i4].m_nEffctSubType >= i && nativeGetSubItemSourceList[i4].m_nEffctSubType < i2) {
                i3++;
            }
        }
        if (i3 == 0) {
            return null;
        }
        QEffectSubItemSource[] qEffectSubItemSourceArr = new QEffectSubItemSource[i3];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (nativeGetSubItemSourceList[i6].m_nEffctSubType >= i && nativeGetSubItemSourceList[i6].m_nEffctSubType < i2) {
                qEffectSubItemSourceArr[i5] = new QEffectSubItemSource(nativeGetSubItemSourceList[i6].m_nEffctSubType, nativeGetSubItemSourceList[i6].m_fLayerID, nativeGetSubItemSourceList[i6].m_nFrameType, nativeGetSubItemSourceList[i6].m_nEffectMode, nativeGetSubItemSourceList[i6].m_lEffectHandle, nativeGetSubItemSourceList[i6].m_mediaSource);
                i5++;
            }
        }
        return qEffectSubItemSourceArr;
    }

    public void destorySubItemList() {
        nativeDestorySubItemList();
    }

    public void destorySubItemEffect(int i, float f) {
        nativeDestorySubItemEffect(i, f);
    }

    public QEffect getSubItemEffect(int i, float f) {
        QEffectSubItemSource subItemSource = getSubItemSource(i, f);
        if (subItemSource == null) {
            return null;
        }
        QEffect qEffect = new QEffect();
        qEffect.setEffectHandle(subItemSource.m_lEffectHandle);
        qEffect.setEffectSpWeakHandle(subItemSource.m_lspEffectHandle);
        return qEffect;
    }

    public static class QEffectAnimatePointOperator {
        private long handle = 0;

        private native int nativeApplyAnimatePointOpt(long j, QEffectAnimatePointOptData qEffectAnimatePointOptData);

        private native QEffectAnimatePointData[] nativeGetAnimatePointData(long j);

        public QEffectAnimatePointData[] GetAnimatePointData() {
            return nativeGetAnimatePointData(this.handle);
        }

        public int ApplyAnimatePointOpt(QEffectAnimatePointOptData qEffectAnimatePointOptData) {
            return nativeApplyAnimatePointOpt(this.handle, qEffectAnimatePointOptData);
        }
    }

    public static int getTextAttachFileInfo(String str, QEffectTextAttachFileInfo qEffectTextAttachFileInfo) {
        return nativeGetTextAttachFileInfo(str, qEffectTextAttachFileInfo);
    }

    public int getTextAttachFileInfoById(long j, QEffectTextAttachFileInfo qEffectTextAttachFileInfo) {
        return nativeGetTextAttachFileInfoById(this.handle, j, qEffectTextAttachFileInfo);
    }

    public static QKeyFrameTransformData.Value getCurrentValueForKeyframeTransform(QKeyFrameTransformData qKeyFrameTransformData, int i) {
        return nativeGetCurrentValueForKeyframeTransform(qKeyFrameTransformData, i);
    }

    public static QKeyFrameTransformPosData.Value getCurrentValueForKeyframeTransformPos(QKeyFrameTransformPosData qKeyFrameTransformPosData, int i) {
        return nativeGetCurrentValueForKeyframeTransformPos(qKeyFrameTransformPosData, i);
    }

    public QKeyFrameUniformData.Value getKeyframeUnifrom(String str, int i) {
        return nativeGetKeyframeUniform(this.handle, str, i);
    }

    public QKeyFrameUniformData getKeyframeUnifromData(String str) {
        return nativeGetKeyframeUniformData(this.handle, str);
    }

    public int setKeyframeUnifromData(QKeyFrameUniformData qKeyFrameUniformData) {
        return nativeSetKeyframeUniformData(this.handle, qKeyFrameUniformData);
    }

    public int setTextAttachID(int i, long j) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        QEffectTextAttachID qEffectTextAttachID = new QEffectTextAttachID();
        qEffectTextAttachID.type = i;
        qEffectTextAttachID.templateid = j;
        return nativeSetProp(this, PROP_EFFECT_TEXT_ATTACHMENT_ID, qEffectTextAttachID);
    }

    public int setTextAttachDuration(int i, int i2) {
        if (0 == this.handle) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        QEffectTextAttachDuration qEffectTextAttachDuration = new QEffectTextAttachDuration();
        if (i2 <= 0) {
            return QVEError.QERR_COMMON_JAVA_INVALID_PARAM;
        }
        qEffectTextAttachDuration.type = i;
        qEffectTextAttachDuration.duration = i2;
        return nativeSetProp(this, PROP_EFFECT_TEXT_ATTACHMENT_DURATION, qEffectTextAttachDuration);
    }

    public long getTextAttachID(int i) {
        long j = this.handle;
        if (0 == j) {
            return 9429001;
        }
        return nativeGetAttachID(j, i);
    }

    public int getTextAttachDuration(int i) {
        long j = this.handle;
        if (0 == j) {
            return QVEError.QERR_COMMON_JAVA_NOT_INIT;
        }
        return nativeGetAttachDuration(j, i);
    }

    public int set3DTransformInfo(QTransformInfo qTransformInfo) {
        return nativeSet3DTransformInfo(this.handle, qTransformInfo);
    }

    public QTransformInfo get3DTransformInfo() {
        return nativeGet3DTransformInfo(this.handle);
    }

    public QTransformInfo getKeyFrame3DTransformInfo(int i) {
        return nativeGetKeyFrame3DTransformInfo(this.handle, i);
    }

    public int updateKeyFrameCommonBaseValue(int i, float f) {
        return nativeUpdateKeyFrameCommonBaseValue(this.handle, i, f);
    }

    public int insertOrReplaceKeyFrameCommonValue(int i, QKeyFrameCommonData.Value value) {
        return nativeInsertOrReplaceKeyFrameCommonValue(this.handle, i, value);
    }

    public int removeKeyFrameCommonValue(int i, float f) {
        return nativeRemoveKeyFrameCommonValue(this.handle, i, f);
    }

    public static QKeyFrameCommonData.Value getCurrentValueForKeyframeCommon(QKeyFrameCommonData qKeyFrameCommonData, int i) {
        return nativeGetCurrentValueForKeyframeCommon(qKeyFrameCommonData, i);
    }

    public int setKeyFrameCommonData(QKeyFrameCommonData qKeyFrameCommonData) {
        return nativeSetKeyFrameCommonData(this.handle, qKeyFrameCommonData);
    }

    public QKeyFrameCommonData getKeyFrameCommonData(int i) {
        return nativeGetKeyFrameCommonData(this.handle, i);
    }

    public QKeyFrameCommonData[] getKeyFrameCommonDataList() {
        return nativeGetKeyFrameCommonDataList(this.handle);
    }

    public QFacePasterTransform getFacePasterTransform(int i, int i2) {
        return nativeGetFacePasterTransform(this.handle, i, i2);
    }

    public void setFacePasterTransform(QFacePasterTransform qFacePasterTransform, int i, int i2) {
        nativeSetFacePasterTransform(this.handle, qFacePasterTransform, i, i2);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            destory();
        } catch (Throwable unused) {
        }
        super.finalize();
    }

    public int startLayerPaintLine(QDrawLayerPaintPen qDrawLayerPaintPen) {
        return nativeStartLayerPaintLine(this.handle, qDrawLayerPaintPen);
    }

    public int appendLayerLinePoint(QPointFloat qPointFloat) {
        return nativeAppendLayerLinePoint(this.handle, qPointFloat);
    }

    public int endLayerPaintLine() {
        return nativeEndLayerPaintLine(this.handle);
    }

    public int layerPaintUndo() {
        return nativeLayerPaintUndo(this.handle);
    }

    public int layerPaintRedo() {
        return nativeLayerPaintRedo(this.handle);
    }

    public int copyPartFormEffect(QEffect qEffect, int i) {
        return nativeCopyPartFormEffect(this.handle, qEffect.handle, i);
    }

    public int layerPaintUndoCount() {
        return ((Integer) nativeGetProp(this.handle, PROP_EFFECT_DRAW_LAYER_LIST_COUNT)).intValue();
    }

    public int layerPaintRedoCount() {
        return ((Integer) nativeGetProp(this.handle, PROP_EFFECT_DRAW_LAYER_RECORD_LIST_COUNT)).intValue();
    }

    public QEffect getEffectByIndex(int i) {
        return nativeEffectGroupGetEffectByIndex(this.handle, i);
    }

    public int LayerPaintClear() {
        return nativeSetProp(this, PROP_EFFECT_DRAW_LAYER_DATA_CLEAR, true);
    }

    public QEffect getEffectGroup() {
        return nativeGetEffectGroup(this.handle);
    }

    public int refreshGroup() {
        return nativeEffectGroupRefreshGroup(this.handle);
    }

    public int getEffectCount() {
        return nativeEffectGroupGetEffectCount(this.handle);
    }

    public int insertEffect(QEffect qEffect) {
        return nativeEffectGroupInsertEffect(this.handle, qEffect);
    }

    public int replaceEffect(QEffect[] qEffectArr) {
        return nativeReplaceEffect(this.handle, qEffectArr);
    }

    public int deleteEffect(QEffect qEffect) {
        return nativeEffectGroupDeleteEffect(this.handle, qEffect.handle);
    }

    public QTransformInfo get3DTransformInfoInGroup(QEffect qEffect) {
        return nativeGet3DTransformInfoInGroup(this.handle, qEffect.handle);
    }

    public int setBlendMode(QEffectBlendMode qEffectBlendMode) {
        return nativeSetProp(this, PROP_EFFECT_BLEND_MODE, Integer.valueOf(qEffectBlendMode.ordinal()));
    }

    public QEffectBlendMode getBlendMode() {
        int intValue = ((Integer) nativeGetProp(this.handle, PROP_EFFECT_BLEND_MODE)).intValue();
        if (intValue < QEffectBlendMode.values().length) {
            return QEffectBlendMode.values()[intValue];
        }
        return QEffectBlendMode.kQVAEBlendModeNone;
    }
}