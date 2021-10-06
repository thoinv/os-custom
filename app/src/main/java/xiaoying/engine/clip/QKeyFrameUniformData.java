package xiaoying.engine.clip;

import xiaoying.engine.clip.QKeyFrameTransformData;

public class QKeyFrameUniformData {
    public String name = null;
    public Value[] values = null;

    public static class Value {
        public QKeyFrameTransformData.EasingInfo easingInfo = null;
        public QKeyFrameTransformData.ExtInfo extInfo = null;
        public double floatValue = 0.0d;
        public int method = 0;
        public float offsetValue = 0.0f;
        public long templateID = 0;
        public int ts = 0;
    }
}