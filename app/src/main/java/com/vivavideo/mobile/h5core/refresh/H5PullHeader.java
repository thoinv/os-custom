package com.vivavideo.mobile.h5core.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.myapplication.R;
import com.vivavideo.mobile.h5core.e.b;
import java.text.SimpleDateFormat;
import java.util.Date;

public class H5PullHeader extends RelativeLayout {
    public static final String TAG = "H5PullHeader";
    public static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private ProgressBar glc;

    public void showOver() {
    }

    public H5PullHeader(Context context) {
        super(context);
    }

    public H5PullHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getId() != -1) {
            this.glc = (ProgressBar) findViewById(R.id.pullrefresh_progress);
            cNK();
            return;
        }
        throw new RuntimeException("must set id");
    }

    public void showOpen() {
        this.glc.setVisibility(0);
    }

    public void showLoading() {
        this.glc.setVisibility(0);
    }

    public void showFinish() {
        cNK();
    }

    private void cNK() {
        String format = new SimpleDateFormat(TIME_FORMAT).format(new Date(System.currentTimeMillis()));
        b.getResources().getString(R.string.last_refresh, format);
    }
}