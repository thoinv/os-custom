package xiaoying.engine.clip;

import xiaoying.engine.clip.QKeyFrameTransformData;

public class QKeyFrameFloatData {
    public float baseValue = 1.0f;
    public Value[] values = null;

    public static class Value {
        public QKeyFrameTransformData.EasingInfo easingInfo;
        public float floatValue = 0.0f;
        public int method = 0;
        public long templateID = 0;
        public int ts = 0;
    }
}