package xiaoying.engine.clip;

import xiaoying.utils.QRect;

public class QEffectDisplayInfo {
    public QRect regionRatio;
    public float rotation;
    public int transparency;

    public QEffectDisplayInfo() {
        this.rotation = 0.0f;
        this.transparency = 100;
        this.regionRatio = null;
        this.rotation = 0.0f;
        this.transparency = 100;
        QRect qRect = new QRect();
        this.regionRatio = qRect;
        qRect.left = 0;
        this.regionRatio.top = 0;
        this.regionRatio.right = 10000;
        this.regionRatio.bottom = 10000;
    }
}