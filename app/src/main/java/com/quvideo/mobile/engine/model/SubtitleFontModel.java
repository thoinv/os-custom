package com.quvideo.mobile.engine.model;

public class SubtitleFontModel implements Cloneable {
    public int currentSize;
    public int initFontSize;
    public int initHeight;
    public int initWidth;
    public int maxFontSize;
    public float maxRatio;
    public int maxWidth;
    public int minFontSize;
    public float minRatio;
    public int minWidth;
    public int originSize;

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isDataEquals(SubtitleFontModel subtitleFontModel) {
        return subtitleFontModel != null && this.initFontSize == subtitleFontModel.initFontSize && this.minFontSize == subtitleFontModel.minFontSize && this.currentSize == subtitleFontModel.currentSize && this.initWidth == subtitleFontModel.initWidth && this.initHeight == subtitleFontModel.initHeight && this.maxRatio == subtitleFontModel.maxRatio && this.minRatio == subtitleFontModel.minRatio && this.maxFontSize == subtitleFontModel.maxFontSize && this.minWidth == subtitleFontModel.minWidth && this.maxWidth == subtitleFontModel.maxWidth && this.originSize == subtitleFontModel.originSize;
    }
}