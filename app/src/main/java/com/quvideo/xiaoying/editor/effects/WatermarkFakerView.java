package com.quvideo.xiaoying.editor.effects;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.myapplication.R;
import com.quvideo.mobile.engine.model.effect.ScaleRotateViewState;
import com.quvideo.xiaoying.common.MSize;
import com.quvideo.xiaoying.editor.effects.customwatermark.CustomWaterMarkView;

public class WatermarkFakerView extends RelativeLayout {
    private RelativeLayout gSa;
    private CustomWaterMarkView gSs;

    public WatermarkFakerView(Context context) {
        super(context);
    }

    public WatermarkFakerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WatermarkFakerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void f(MSize mSize) {
        if (mSize != null) {
            LayoutInflater.from(getContext()).inflate(R.layout.editor_view_simple_fakerview, (ViewGroup) this, true);
            this.gSa = (RelativeLayout) findViewById(R.id.editor_fake_layout);
            LayoutParams layoutParams = new LayoutParams(mSize.width, mSize.height);
            layoutParams.addRule(13, 1);
            this.gSa.setLayoutParams(layoutParams);
            this.gSa.invalidate();
            bvH();
        }
    }

    public void g(MSize mSize) {
        if (this.gSa != null) {
            LayoutParams layoutParams = new LayoutParams(mSize.width, mSize.height);
            layoutParams.addRule(13, 1);
            this.gSa.setLayoutParams(layoutParams);
            this.gSa.invalidate();
        }
    }

    private void bvH() {
        this.gSs = new CustomWaterMarkView(getContext());
        this.gSs.setLayoutParams(new LayoutParams(-1, -1));
        this.gSa.addView(this.gSs);
    }

    public void c(ScaleRotateViewState scaleRotateViewState) {
        if (scaleRotateViewState != null && this.gSs != null && !TextUtils.isEmpty(scaleRotateViewState.mStylePath)) {
            this.gSs.j(scaleRotateViewState);
            this.gSs.setVisibility(0);
        }
    }

    public void bvI() {
        CustomWaterMarkView customWaterMarkView = this.gSs;
        if (customWaterMarkView != null) {
            customWaterMarkView.setVisibility(4);
            this.gSs.bxF();
        }
    }

    public void setCustomWaterMarkViewListener(CustomWaterMarkView.a aVar) {
        CustomWaterMarkView customWaterMarkView = this.gSs;
        if (customWaterMarkView != null) {
            customWaterMarkView.setCustomWaterMarkViewListener(aVar);
        }
    }
}
