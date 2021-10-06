package com.quvideo.mobile.engine.model.effect;

import java.io.Serializable;

public class ShadowInfo implements Serializable, Cloneable {
    private static final long serialVersionUID = -2052704248964566815L;
    private boolean bEnableShadow = false;
    private float mShadowBlurRadius = 0.1f;
    private int mShadowColor = -16777216;
    private float mShadowXShift = 0.1f;
    private float mShadowYShift = 0.1f;

    public boolean isbEnableShadow() {
        return this.bEnableShadow;
    }

    public void setbEnableShadow(boolean z) {
        this.bEnableShadow = z;
    }

    public float getmShadowXShift() {
        return this.mShadowXShift;
    }

    public void setmShadowXShift(float f) {
        this.mShadowXShift = f;
    }

    public float getmShadowYShift() {
        return this.mShadowYShift;
    }

    public void setmShadowYShift(float f) {
        this.mShadowYShift = f;
    }

    public int getmShadowColor() {
        return this.mShadowColor;
    }

    public void setmShadowColor(int i) {
        this.mShadowColor = i;
    }

    public float getmShadowBlurRadius() {
        return this.mShadowBlurRadius;
    }

    public void setmShadowBlurRadius(float f) {
        this.mShadowBlurRadius = f;
    }

    public void save(ShadowInfo shadowInfo) {
        if (shadowInfo != null) {
            this.bEnableShadow = shadowInfo.bEnableShadow;
            this.mShadowXShift = shadowInfo.mShadowXShift;
            this.mShadowYShift = shadowInfo.mShadowYShift;
            this.mShadowColor = shadowInfo.mShadowColor;
            this.mShadowBlurRadius = shadowInfo.mShadowBlurRadius;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowInfo)) {
            return false;
        }
        ShadowInfo shadowInfo = (ShadowInfo) obj;
        if (this.bEnableShadow == shadowInfo.bEnableShadow && Float.compare(shadowInfo.mShadowXShift, this.mShadowXShift) == 0 && Float.compare(shadowInfo.mShadowYShift, this.mShadowYShift) == 0 && this.mShadowColor == shadowInfo.mShadowColor && Float.compare(shadowInfo.mShadowBlurRadius, this.mShadowBlurRadius) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (this.bEnableShadow ? 1 : 0) * 31;
        float f = this.mShadowXShift;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.mShadowYShift;
        int floatToIntBits2 = (((floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.mShadowColor) * 31;
        float f3 = this.mShadowBlurRadius;
        if (f3 != 0.0f) {
            i2 = Float.floatToIntBits(f3);
        }
        return floatToIntBits2 + i2;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isDataEquals(ShadowInfo shadowInfo) {
        return shadowInfo != null && this.bEnableShadow == shadowInfo.bEnableShadow && this.mShadowXShift == shadowInfo.mShadowXShift && this.mShadowYShift == shadowInfo.mShadowYShift && this.mShadowColor == shadowInfo.mShadowColor && this.mShadowBlurRadius == shadowInfo.mShadowBlurRadius;
    }
}
