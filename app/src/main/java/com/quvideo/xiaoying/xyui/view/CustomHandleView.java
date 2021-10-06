package com.quvideo.xiaoying.xyui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.myapplication.R;

import kotlin.e.b.l;

@SuppressLint("WrongConstant")
public final class CustomHandleView extends RelativeLayout {
    public TextView fUh;
    public ImageView kHY;
    public TextView kHZ;
    public TextView kIa;
    private boolean kIb;
    private boolean kIc;
    private boolean kId;
    private boolean kIe;
    private boolean kIf;

    public final ImageView getMHandleView() {
        ImageView imageView = this.kHY;
        if (imageView == null) {
            l.MD("mHandleView");
        }
        return imageView;
    }

    public final void setMHandleView(ImageView imageView) {
        l.r(imageView, "<set-?>");
        this.kHY = imageView;
    }

    public final TextView getMLeftText() {
        TextView textView = this.kHZ;
        if (textView == null) {
            l.MD("mLeftText");
        }
        return textView;
    }

    public final void setMLeftText(TextView textView) {
        l.r(textView, "<set-?>");
        this.kHZ = textView;
    }

    public final TextView getMTitleText() {
        TextView textView = this.fUh;
        if (textView == null) {
            l.MD("mTitleText");
        }
        return textView;
    }

    public final void setMTitleText(TextView textView) {
        l.r(textView, "<set-?>");
        this.fUh = textView;
    }

    public final TextView getMRightText() {
        TextView textView = this.kIa;
        if (textView == null) {
            l.MD("mRightText");
        }
        return textView;
    }

    public final void setMRightText(TextView textView) {
        l.r(textView, "<set-?>");
        this.kIa = textView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomHandleView(Context context) {
        super(context);
        l.r(context, "context");
        D(context, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomHandleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.r(context, "context");
        D(context, attributeSet);
    }

    private final void D(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_custom_handle, this);
        l.p(inflate, "LayoutInflater.from(cont…yout_custom_handle, this)");
        View findViewById = inflate.findViewById(R.id.iv_handle);
        l.p(findViewById, "view.findViewById(R.id.iv_handle)");
        this.kHY = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.tv_cancel);
        l.p(findViewById2, "view.findViewById(R.id.tv_cancel)");
        this.kHZ = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.tv_title);
        l.p(findViewById3, "view.findViewById(R.id.tv_title)");
        this.fUh = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.tv_done);
        l.p(findViewById4, "view.findViewById(R.id.tv_done)");
        this.kIa = (TextView) findViewById4;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CustomHandleView);
            l.p(obtainStyledAttributes, "context.obtainStyledAttr…yleable.CustomHandleView)");
            this.kIb = obtainStyledAttributes.getBoolean(R.styleable.CustomHandleView_chv_hide_left_text, false);
            this.kIc = obtainStyledAttributes.getBoolean(R.styleable.CustomHandleView_chv_hide_text, false);
            this.kId = obtainStyledAttributes.getBoolean(R.styleable.CustomHandleView_chv_hide_title_text, false);
            this.kIe = obtainStyledAttributes.getBoolean(R.styleable.CustomHandleView_chv_hide_right_text, false);
            this.kIf = obtainStyledAttributes.getBoolean(R.styleable.CustomHandleView_chv_hide_handle, false);
            String string = obtainStyledAttributes.getString(R.styleable.CustomHandleView_chv_title_text);
            if (!TextUtils.isEmpty(string)) {
                TextView textView = this.fUh;
                if (textView == null) {
                    l.MD("mTitleText");
                }
                textView.setText(string);
            }
            obtainStyledAttributes.recycle();
        }
        if (this.kIc) {
            TextView textView2 = this.kHZ;
            if (textView2 == null) {
                l.MD("mLeftText");
            }
            textView2.setVisibility(8);
            TextView textView3 = this.fUh;
            if (textView3 == null) {
                l.MD("mTitleText");
            }
            textView3.setVisibility(8);
            TextView textView4 = this.kIa;
            if (textView4 == null) {
                l.MD("mRightText");
            }
            textView4.setVisibility(8);
        }
        if (this.kIb) {
            TextView textView5 = this.kHZ;
            if (textView5 == null) {
                l.MD("mLeftText");
            }
            textView5.setVisibility(4);
        }
        if (this.kId) {
            TextView textView6 = this.fUh;
            if (textView6 == null) {
                l.MD("mTitleText");
            }
            textView6.setVisibility(8);
        }
        if (this.kIe) {
            TextView textView7 = this.kIa;
            if (textView7 == null) {
                l.MD("mRightText");
            }
            textView7.setVisibility(4);
        }
        if (this.kIf) {
            ImageView imageView = this.kHY;
            if (imageView == null) {
                l.MD("mHandleView");
            }
            imageView.setVisibility(8);
        }
    }
}