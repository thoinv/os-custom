package xiaoying.engine.clip;

import xiaoying.engine.clip.QKeyFrameTransformData;

public class QKeyFrameTransformRotationData {
    public float baseRotation = 0.0f;
    public Value[] values = null;

    public static class Value {
        public QKeyFrameTransformData.EasingInfo easingInfo;
        public int method = 0;
        public float rotation = 0.0f;
        public long templateID = 0;
        public int ts = 0;
    }
}