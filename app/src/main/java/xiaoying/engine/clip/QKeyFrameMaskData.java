package xiaoying.engine.clip;

public class QKeyFrameMaskData {
    public Value[] values = null;

    public static class Value {
        public int centerX;
        public int centerY;
        public int method;
        public int radiusX;
        public int radiusY;
        public int reversed;
        public int rotation;
        public int softness;
        public long templateID;
        public int ts;
    }
}