package xiaoying.engine.clip;

import xiaoying.utils.QBezierCurve;

public class QKeyFrameTransformData {
    public float baseHeightRatio = 1.0f;
    public float baseRotation = 0.0f;
    public float baseWidthRatio = 1.0f;
    public int baseX = 0;
    public int baseY = 0;
    public Value[] values = null;

    public static class EasingInfo {
        public QBezierCurve[] curves;
        public long id;
    }

    public static class ExtInfo {
        public int backX = 0;
        public int backY = 0;
        public int frontX = 0;
        public int frontY = 0;
    }

    public static class Value {
        public ExtInfo extInfo = null;
        public float heightRatio = 0.0f;
        public int method = 0;
        public float rotation = 0.0f;
        public long templateID = 0;
        public int ts = 0;
        public float widthRatio = 0.0f;
        public int x = 0;
        public int y = 0;
    }
}