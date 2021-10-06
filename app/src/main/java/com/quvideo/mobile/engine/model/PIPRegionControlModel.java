package com.quvideo.mobile.engine.model;

import android.graphics.Point;
import android.graphics.Rect;
import com.quvideo.mobile.engine.entity.VeMSize;

public class PIPRegionControlModel {
    private boolean isAddedFile = false;
    private Rect mBaseRegion = null;
    private Rect mItemRegion = null;
    private VeMSize mPreviewSize = null;
    private Point mTipPosition = null;
    private Rect mVideoCropRegion = null;
    private VeMSize mVideoFitOutSize = null;
    private Rect sourceRect;

    public Rect getSourceRect() {
        return this.sourceRect;
    }

    public void setSourceRect(Rect rect) {
        this.sourceRect = rect;
    }

    public Rect getmItemRegion() {
        return this.mItemRegion;
    }

    public void setmItemRegion(Rect rect) {
        this.mItemRegion = rect;
    }

    public Rect getmVideoCropRegion() {
        return this.mVideoCropRegion;
    }

    public void setmVideoCropRegion(Rect rect) {
        this.mVideoCropRegion = rect;
    }

    public VeMSize getmPreviewSize() {
        return this.mPreviewSize;
    }

    public void setmPreviewSize(VeMSize veMSize) {
        this.mPreviewSize = veMSize;
    }

    public VeMSize getmVideoFitOutSize() {
        return this.mVideoFitOutSize;
    }

    public void setmVideoFitOutSize(VeMSize veMSize) {
        this.mVideoFitOutSize = veMSize;
    }

    public Rect getmBaseRegion() {
        return this.mBaseRegion;
    }

    public void setmBaseRegion(Rect rect) {
        this.mBaseRegion = rect;
    }

    public boolean isAddedFile() {
        return this.isAddedFile;
    }

    public void setAddedFile(boolean z) {
        this.isAddedFile = z;
    }

    public Point getmTipPosition() {
        return this.mTipPosition;
    }

    public void setmTipPosition(Point point) {
        this.mTipPosition = point;
    }
}