package com.quvideo.mobile.engine.model.effect;

public class EffectPropData implements Cloneable {
    public int mID;
    public int mValue;

    public EffectPropData() {
    }

    public EffectPropData(int i, int i2) {
        this.mID = i;
        this.mValue = i2;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EffectPropData)) {
            return false;
        }
        EffectPropData effectPropData = (EffectPropData) obj;
        if (this.mID == effectPropData.mID && this.mValue == effectPropData.mValue) {
            return true;
        }
        return false;
    }
}