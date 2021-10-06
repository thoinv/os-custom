package xiaoying.engine.clip;

import xiaoying.engine.clip.QKeyFrameTransformData;

public class QKeyFrameTransformScaleData {
    public float baseHeightRatio = 1.0f;
    public float baseWidthRatio = 1.0f;
    public Value[] values = null;

    public static class Value {
        public QKeyFrameTransformData.EasingInfo easingInfo;
        public float heightRatio = 0.0f;
        public int method = 0;
        public long templateID = 0;
        public int ts = 0;
        public float widthRatio = 0.0f;
    }
}