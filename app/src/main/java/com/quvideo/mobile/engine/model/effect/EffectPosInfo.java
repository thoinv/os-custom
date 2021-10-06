package com.quvideo.mobile.engine.model.effect;

import android.graphics.Rect;
import android.graphics.RectF;
import com.quvideo.mobile.engine.b.a.l;
import com.quvideo.mobile.engine.entity.VeMSize;
import com.quvideo.mobile.engine.k.m;
import java.io.Serializable;

public class EffectPosInfo implements Serializable, Cloneable {
    private static final long serialVersionUID = -6940509723263890403L;
    public float centerPosX = 0.0f;
    public float centerPosY = 0.0f;
    public float degree = 0.0f;
    public String engineId;
    public int groupId;
    public float height = 0.0f;
    public boolean isHorFlip = false;
    public boolean isVerFlip = false;
    public float width = 0.0f;

    public EffectPosInfo() {
    }

    public EffectPosInfo(EffectPosInfo effectPosInfo) {
        if (effectPosInfo != null) {
            save(effectPosInfo);
        }
    }

    public EffectPosInfo(RectF rectF, float f, boolean z, boolean z2) {
        if (rectF != null) {
            save(rectF);
            this.degree = f;
            this.isHorFlip = z;
            this.isVerFlip = z2;
        }
    }

    public Rect getRectByDisplaySize(VeMSize veMSize) {
        return l.a(m.i(getRectArea()), veMSize.width, veMSize.height);
    }

    public void setRectByDisplaySize(RectF rectF, VeMSize veMSize) {
        Rect c;
        if (veMSize != null && (c = m.c(rectF, veMSize.width, veMSize.height)) != null) {
            this.centerPosX = (float) c.centerX();
            this.centerPosY = (float) c.centerY();
            this.width = (float) c.width();
            this.height = (float) c.height();
        }
    }

    public RectF getRectArea() {
        RectF rectF = new RectF();
        float f = this.centerPosX;
        float f2 = this.width;
        float f3 = this.centerPosY;
        float f4 = this.height;
        rectF.set(f - (f2 / 2.0f), f3 - (f4 / 2.0f), f + (f2 / 2.0f), f3 + (f4 / 2.0f));
        return rectF;
    }

    public RectF getRectArea(float f) {
        RectF rectF = new RectF();
        float f2 = this.centerPosX;
        float f3 = this.width;
        float f4 = f * 2.0f;
        float f5 = this.centerPosY;
        float f6 = this.height;
        rectF.set(f2 - (f3 / f4), f5 - (f6 / f4), f2 + (f3 / f4), f5 + (f6 / f4));
        return rectF;
    }

    public boolean isPosEqual(EffectPosInfo effectPosInfo) {
        return effectPosInfo != null && this.centerPosY == effectPosInfo.centerPosY && this.centerPosX == effectPosInfo.centerPosX && this.width == effectPosInfo.width && this.height == effectPosInfo.height && this.degree == effectPosInfo.degree && this.isHorFlip == effectPosInfo.isHorFlip && this.isVerFlip == effectPosInfo.isVerFlip;
    }

    public void save(EffectPosInfo effectPosInfo) {
        if (effectPosInfo != null) {
            this.centerPosX = effectPosInfo.centerPosX;
            this.centerPosY = effectPosInfo.centerPosY;
            this.width = effectPosInfo.width;
            this.height = effectPosInfo.height;
            this.degree = effectPosInfo.degree;
            this.isHorFlip = effectPosInfo.isHorFlip;
            this.isVerFlip = effectPosInfo.isVerFlip;
        }
    }

    public void save(RectF rectF) {
        if (rectF != null) {
            this.centerPosX = rectF.centerX();
            this.centerPosY = rectF.centerY();
            this.width = rectF.width();
            this.height = rectF.height();
        }
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "EffectPosInfo{centerPosX=" + this.centerPosX + ", centerPosY=" + this.centerPosY + ", width=" + this.width + ", height=" + this.height + ", degree=" + this.degree + ", isHorFlip=" + this.isHorFlip + ", isVerFlip=" + this.isVerFlip + '}';
    }

    public void readClip(EffectPropData[] effectPropDataArr) {
        if (effectPropDataArr != null && effectPropDataArr.length >= 4) {
            this.width = ((((float) effectPropDataArr[0].mValue) / 5000.0f) - 10.0f) * 10000.0f;
            this.height = ((((float) effectPropDataArr[1].mValue) / 5000.0f) - 10.0f) * 10000.0f;
            this.centerPosX = (float) ((effectPropDataArr[3].mValue - 47500) * 2);
            this.centerPosY = (float) ((effectPropDataArr[4].mValue - 47500) * 2);
        }
    }

    public void writeClip(EffectPropData[] effectPropDataArr) {
        if (effectPropDataArr != null && effectPropDataArr.length >= 4) {
            effectPropDataArr[0].mValue = (int) (((this.width / 10000.0f) + 10.0f) * 5000.0f);
            effectPropDataArr[1].mValue = (int) (((this.height / 10000.0f) + 10.0f) * 5000.0f);
            effectPropDataArr[3].mValue = (int) ((this.centerPosX / 2.0f) + 47500.0f);
            effectPropDataArr[4].mValue = (int) ((this.centerPosY / 2.0f) + 47500.0f);
        }
    }
}
