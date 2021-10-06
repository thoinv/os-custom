package com.quvideo.mobile.engine.model.effect;

import java.io.Serializable;

public class StrokeInfo implements Serializable, Cloneable {
    private static final long serialVersionUID = 787425019132700380L;
    public int strokeColor = -1;
    public float strokeWPersent = 0.0f;

    public void save(StrokeInfo strokeInfo) {
        if (strokeInfo != null) {
            this.strokeColor = strokeInfo.strokeColor;
            this.strokeWPersent = strokeInfo.strokeWPersent;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrokeInfo)) {
            return false;
        }
        StrokeInfo strokeInfo = (StrokeInfo) obj;
        if (this.strokeColor == strokeInfo.strokeColor && Float.compare(strokeInfo.strokeWPersent, this.strokeWPersent) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.strokeColor * 31;
        float f = this.strokeWPersent;
        return i + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isDataEquals(StrokeInfo strokeInfo) {
        return strokeInfo != null && this.strokeColor == strokeInfo.strokeColor && this.strokeWPersent == strokeInfo.strokeWPersent;
    }
}
