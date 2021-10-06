package com.quvideo.mobile.engine.model.effect;

import android.graphics.Rect;
import xiaoying.engine.clip.QKeyFrameMaskData;

public class EffectKeyFrameRange implements Cloneable {
    public int centerX;
    public int centerY;
    public int curPos;
    public int curTime;
    public float floatData;
    public float heightRatio;
    public Rect keyFrameRect;
    public QKeyFrameMaskData.Value maskDataValue;
    public int relativeTime;
    public int rotation;
    public ScaleRotateViewState scaleRotateViewState;
    public boolean select;
    public float widthRatio;

    public EffectKeyFrameRange(int i, int i2, int i3, int i4, int i5, float f, float f2, int i6) {
        this.relativeTime = i;
        this.curTime = i2;
        this.curPos = i3;
        this.centerX = i4;
        this.centerY = i5;
        this.widthRatio = f;
        this.heightRatio = f2;
        this.rotation = i6;
    }

    public EffectKeyFrameRange(int i, int i2, int i3, float f, float f2, int i4, int i5) {
        this.centerX = i2;
        this.centerY = i3;
        this.widthRatio = f;
        this.heightRatio = f2;
        this.rotation = i4;
        this.relativeTime = i5;
        this.curTime = i;
    }

    public EffectKeyFrameRange(int i, int i2, int i3, int i4, ScaleRotateViewState scaleRotateViewState2, float f, QKeyFrameMaskData.Value value, int i5) {
        this.relativeTime = i;
        this.curTime = i2;
        this.centerX = i3;
        this.centerY = i4;
        this.rotation = i5;
        try {
            this.scaleRotateViewState = scaleRotateViewState2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        this.floatData = f;
        this.maskDataValue = value;
    }

    public EffectKeyFrameRange(int i, int i2, int i3, int i4, float f, float f2, float f3, QKeyFrameMaskData.Value value, int i5) {
        this.relativeTime = i;
        this.curTime = i2;
        this.centerX = i3;
        this.centerY = i4;
        this.rotation = i5;
        this.floatData = f3;
        this.maskDataValue = value;
        this.widthRatio = f;
        this.heightRatio = f2;
    }

    public boolean isFocusContain(int i, int i2) {
        int i3 = this.curPos;
        int i4 = i2 / 2;
        return i >= i3 - i4 && i <= i3 + i4;
    }

    public boolean isClickContain(int i, int i2) {
        int i3 = this.curPos;
        int i4 = i2 / 2;
        return i >= i3 - i4 && i <= i3 + i4;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isDataEquals(EffectKeyFrameRange effectKeyFrameRange) {
        return effectKeyFrameRange != null && this.curPos == effectKeyFrameRange.curPos && this.curTime == effectKeyFrameRange.curTime && this.centerX == effectKeyFrameRange.centerX && this.centerY == effectKeyFrameRange.centerY && this.widthRatio == effectKeyFrameRange.widthRatio && this.heightRatio == effectKeyFrameRange.heightRatio && this.rotation == effectKeyFrameRange.rotation && this.relativeTime == effectKeyFrameRange.relativeTime && this.floatData == effectKeyFrameRange.floatData;
    }

    public void save(EffectKeyFrameRange effectKeyFrameRange) {
        this.centerX = effectKeyFrameRange.centerX;
        this.centerY = effectKeyFrameRange.centerY;
        this.curPos = effectKeyFrameRange.curPos;
        this.curTime = effectKeyFrameRange.curTime;
        this.widthRatio = effectKeyFrameRange.widthRatio;
        this.heightRatio = effectKeyFrameRange.heightRatio;
        this.rotation = effectKeyFrameRange.rotation;
        this.relativeTime = effectKeyFrameRange.relativeTime;
        this.floatData = effectKeyFrameRange.floatData;
        this.keyFrameRect = new Rect(effectKeyFrameRange.keyFrameRect);
        this.select = effectKeyFrameRange.select;
    }

    public String toString() {
        return "EffectKeyFrameRange{curPos=" + this.curPos + ", curTime=" + this.curTime + ", centerX=" + this.centerX + ", centerY=" + this.centerY + ", widthRatio=" + this.widthRatio + ", heightRatio=" + this.heightRatio + ", rotation=" + this.rotation + ", relativeTime=" + this.relativeTime + ", floatData=" + this.floatData + ", maskDataValue=" + this.maskDataValue + ", scaleRotateViewState=" + this.scaleRotateViewState + ", select=" + this.select + '}';
    }
}