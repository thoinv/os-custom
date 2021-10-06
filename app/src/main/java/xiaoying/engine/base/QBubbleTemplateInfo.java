package xiaoying.engine.base;

import xiaoying.utils.QRect;

public class QBubbleTemplateInfo {
    public static final int BUBBLE_BG_FORMAT_MPO = 3;
    public static final int BUBBLE_BG_FORMAT_NONE = 0;
    public static final int BUBBLE_BG_FORMAT_PNG = 2;
    public static final int BUBBLE_BG_FORMAT_SVG = 1;
    public int mBubbleBGFormat = 0;
    public int mBubbleColor = 0;
    public boolean mBubbleIsAnimated = false;
    public int mBubbleMinDuration;
    public QRect mBubbleRegion = null;
    public float mBubbleRotation = 0.0f;
    public float mBubbleRotationX = 0.0f;
    public float mBubbleRotationY = 0.0f;
    public float mBubbleRotationZ = 0.0f;
    public int mBubbleStaticPos = 0;
    public float mShadowBlurRadius = 0.0f;
    public int mShadowColor = 0;
    public float mShadowXShift = 0.0f;
    public float mShadowYShift = 0.0f;
    public int mStrokeColor = 0;
    public float mStrokeWPercent = 0.0f;
    public int mTextAlignment = 0;
    public int mTextColor = 0;
    public String mTextDefaultString = null;
    public int mTextEditableProp = 0;
    public String mTextFontName = null;
    public int mTextFontSize = 0;
    public QRect mTextRegion = null;
    public int mVersion = 0;
    public TxtFillConfig txtFillConfig = new TxtFillConfig();
    public int txtFillType = 1;

    public static class TxtFillConfig {
        public int angle = 0;
        public int color0 = 0;
        public int color1 = 0;
    }
}