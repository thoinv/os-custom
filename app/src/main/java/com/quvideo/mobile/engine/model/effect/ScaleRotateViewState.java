package com.quvideo.mobile.engine.model.effect;

import android.graphics.RectF;
import com.quvideo.mobile.engine.model.effect.TextBubbleInfo;
import java.io.Serializable;

public class ScaleRotateViewState implements Serializable, Cloneable {
    private static final long serialVersionUID = 1441663473695516809L;
    public boolean bNeedTranslate;
    public boolean isDftTemplate;
    public int mBubbleStaticPos;
    private String mDefaultInputText;
    public EffectPosInfo mEffectPosInfo;
    public int mLineNum;
    public int mMinDuration;
    public String mStylePath;
    public TextBubbleInfo mTextBubbleInfo;

    public ScaleRotateViewState() {
        this.mStylePath = "";
        this.mEffectPosInfo = new EffectPosInfo();
        this.mMinDuration = 0;
        this.mTextBubbleInfo = new TextBubbleInfo();
        this.bNeedTranslate = false;
        this.isDftTemplate = false;
        this.mLineNum = 1;
        this.mBubbleStaticPos = -1;
        this.mDefaultInputText = "";
        this.mEffectPosInfo = new EffectPosInfo();
    }

    public ScaleRotateViewState(ScaleRotateViewState scaleRotateViewState) {
        this.mStylePath = "";
        this.mEffectPosInfo = new EffectPosInfo();
        this.mMinDuration = 0;
        this.mTextBubbleInfo = new TextBubbleInfo();
        this.bNeedTranslate = false;
        this.isDftTemplate = false;
        this.mLineNum = 1;
        this.mBubbleStaticPos = -1;
        this.mDefaultInputText = "";
        if (scaleRotateViewState != null) {
            this.bNeedTranslate = scaleRotateViewState.bNeedTranslate;
            this.mTextBubbleInfo = scaleRotateViewState.mTextBubbleInfo;
            this.mEffectPosInfo = scaleRotateViewState.mEffectPosInfo;
            this.mMinDuration = scaleRotateViewState.mMinDuration;
            this.isDftTemplate = scaleRotateViewState.isDftTemplate;
            this.mLineNum = scaleRotateViewState.mLineNum;
            this.mStylePath = scaleRotateViewState.mStylePath;
        }
    }

    @Override // java.lang.Object
    public ScaleRotateViewState clone() throws CloneNotSupportedException {
        ScaleRotateViewState scaleRotateViewState = (ScaleRotateViewState) super.clone();
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            scaleRotateViewState.mTextBubbleInfo = textBubbleInfo.clone();
        }
        EffectPosInfo effectPosInfo = this.mEffectPosInfo;
        if (effectPosInfo != null) {
            scaleRotateViewState.mEffectPosInfo = (EffectPosInfo) effectPosInfo.clone();
        }
        return scaleRotateViewState;
    }

    public TextBubbleInfo.TextBubble getTextBubble() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.getDftTextBubble();
        }
        return null;
    }

    public void setTextBubbleText(String str) {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            textBubbleInfo.setText(str);
        }
    }

    public String getTextBubbleText() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        return textBubbleInfo != null ? textBubbleInfo.getText() : "";
    }

    public void setTextBubbleDftText(String str) {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            textBubbleInfo.setDftText(str);
        }
    }

    public String getTextBubbleDftText() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        return textBubbleInfo != null ? textBubbleInfo.getDftText() : "";
    }

    public String getTextFontPath() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        return textBubbleInfo != null ? textBubbleInfo.getFontPath() : "";
    }

    public void setFontPath(String str) {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            textBubbleInfo.setFontPath(str);
        }
    }

    public void setTextColor(int i) {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            textBubbleInfo.setTextColor(i);
        }
    }

    public int getTextColor() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.getTextColor();
        }
        return -1;
    }

    public int getTextDftColor() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.getTextDftColor();
        }
        return -1;
    }

    public int getTextAlignment() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.getTextAlignment();
        }
        return 0;
    }

    public ShadowInfo getShadowInfo() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.getTextShadowInfo();
        }
        return null;
    }

    public void setShadowInfo(ShadowInfo shadowInfo) {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            textBubbleInfo.setTextShadowInfo(shadowInfo);
        }
    }

    public StrokeInfo getStrokeInfo() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.getTextStrokeInfo();
        }
        return null;
    }

    public void setStrokeInfo(StrokeInfo strokeInfo) {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            textBubbleInfo.setTextStrokeInfo(strokeInfo);
        }
    }

    public boolean isAnimOn() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.isAnimOn();
        }
        return false;
    }

    public void setAnimOn(boolean z) {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            textBubbleInfo.setAnimOn(z);
        }
    }

    public boolean isSupportAnim() {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.isSupportAnim();
        }
        return false;
    }

    public void setSupportAnim(boolean z) {
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            textBubbleInfo.setSupportAnim(z);
        }
    }

    public String getDefaultInputText() {
        return this.mDefaultInputText;
    }

    public void setDefaultInputText(String str) {
        this.mDefaultInputText = str;
    }

    public RectF getRectArea() {
        EffectPosInfo effectPosInfo = this.mEffectPosInfo;
        if (effectPosInfo != null) {
            return effectPosInfo.getRectArea();
        }
        return null;
    }

    public RectF getRectArea(float f) {
        EffectPosInfo effectPosInfo = this.mEffectPosInfo;
        if (effectPosInfo != null) {
            return effectPosInfo.getRectArea(f);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaleRotateViewState)) {
            return false;
        }
        ScaleRotateViewState scaleRotateViewState = (ScaleRotateViewState) obj;
        if (this.bNeedTranslate != scaleRotateViewState.bNeedTranslate || this.mMinDuration != scaleRotateViewState.mMinDuration || this.isDftTemplate != scaleRotateViewState.isDftTemplate || this.mLineNum != scaleRotateViewState.mLineNum) {
            return false;
        }
        String str = this.mStylePath;
        if (str == null ? scaleRotateViewState.mStylePath != null : !str.equals(scaleRotateViewState.mStylePath)) {
            return false;
        }
        TextBubbleInfo textBubbleInfo = this.mTextBubbleInfo;
        TextBubbleInfo textBubbleInfo2 = scaleRotateViewState.mTextBubbleInfo;
        if (textBubbleInfo != null) {
            return textBubbleInfo.equals(textBubbleInfo2);
        }
        if (textBubbleInfo2 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isDataEquals(ScaleRotateViewState r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r3.mStylePath
            java.lang.String r2 = r4.mStylePath
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0037
            int r1 = r3.mLineNum
            int r2 = r4.mLineNum
            if (r1 != r2) goto L_0x0037
            com.quvideo.mobile.engine.model.effect.EffectPosInfo r1 = r3.mEffectPosInfo
            com.quvideo.mobile.engine.model.effect.EffectPosInfo r2 = r4.mEffectPosInfo
            boolean r1 = r1.isPosEqual(r2)
            if (r1 == 0) goto L_0x0037
            int r1 = r3.mBubbleStaticPos
            int r2 = r4.mBubbleStaticPos
            if (r1 == r2) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            com.quvideo.mobile.engine.model.effect.TextBubbleInfo r1 = r3.mTextBubbleInfo
            com.quvideo.mobile.engine.model.effect.TextBubbleInfo r4 = r4.mTextBubbleInfo
            if (r1 == 0) goto L_0x0032
            boolean r4 = r1.isDataEquals(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0034
        L_0x0032:
            if (r4 == 0) goto L_0x0035
        L_0x0034:
            return r0
        L_0x0035:
            r4 = 1
            return r4
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.mobile.engine.model.effect.ScaleRotateViewState.isDataEquals(com.quvideo.mobile.engine.model.effect.ScaleRotateViewState):boolean");
    }
}
