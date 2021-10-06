package com.quvideo.xiaoying.editor.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.example.myapplication.R;

public class WatermarkView extends FrameLayout {
    public WatermarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.drawable.xiaoying_purchase_watermark);
    }
}
