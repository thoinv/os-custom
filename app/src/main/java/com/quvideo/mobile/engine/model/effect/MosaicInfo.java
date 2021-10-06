package com.quvideo.mobile.engine.model.effect;

public class MosaicInfo implements Cloneable {
    public int horValue;
    public int verValue;

    public MosaicInfo() {
    }

    public MosaicInfo(int i, int i2) {
        this.horValue = i;
        this.verValue = i2;
    }

    public MosaicInfo(MosaicInfo mosaicInfo) {
        if (mosaicInfo != null) {
            this.horValue = mosaicInfo.horValue;
            this.verValue = mosaicInfo.verValue;
        }
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isDataEquals(MosaicInfo mosaicInfo) {
        return mosaicInfo != null && this.horValue == mosaicInfo.horValue && this.verValue == mosaicInfo.verValue;
    }
}