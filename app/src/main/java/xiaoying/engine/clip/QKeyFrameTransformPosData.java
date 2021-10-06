package xiaoying.engine.clip;

import xiaoying.engine.clip.QKeyFrameTransformData;

public class QKeyFrameTransformPosData {
    public int baseX = 0;
    public int baseY = 0;
    public Value[] values = null;

    public static class Value {
        public QKeyFrameTransformData.EasingInfo easingInfo;
        public QKeyFrameTransformData.ExtInfo extInfo = null;
        public int method = 0;
        public long templateID = 0;
        public int ts = 0;
        public int x = 0;
        public int y = 0;
    }
}