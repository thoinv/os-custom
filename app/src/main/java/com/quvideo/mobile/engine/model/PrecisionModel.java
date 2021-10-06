package com.quvideo.mobile.engine.model;

public class PrecisionModel implements Cloneable {
    public int[] argb;
    private int precision = 10;
    private float x;
    private float y;

    public int getPrecision() {
        return this.precision;
    }

    public void setPrecision(int i) {
        this.precision = i;
    }

    public int[] getArgb() {
        return this.argb;
    }

    public void setArgb(int[] iArr) {
        this.argb = iArr;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float f) {
        this.x = f;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float f) {
        this.y = f;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}