package com.quvideo.xiaoying.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SafeDrawImageView extends ImageView {
    public SafeDrawImageView(Context context) {
        super(context);
    }

    public SafeDrawImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SafeDrawImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null || !bitmap.isRecycled()) {
            super.setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }
}