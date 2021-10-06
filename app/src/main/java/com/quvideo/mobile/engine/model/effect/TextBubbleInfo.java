package com.quvideo.mobile.engine.model.effect;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TextBubbleInfo implements Serializable, Cloneable {
    public boolean bSupportAnim = false;
    public boolean isAnimOn = true;
    public int mBubbleSubtype = 0;
    public List<TextBubble> mTextBubbleList;

    @Override // java.lang.Object
    public TextBubbleInfo clone() throws CloneNotSupportedException {
        TextBubbleInfo textBubbleInfo = (TextBubbleInfo) super.clone();
        List<TextBubble> list = this.mTextBubbleList;
        if (list != null) {
            textBubbleInfo.mTextBubbleList = TextBubble.cloneTextBubbleLists(list);
        }
        return textBubbleInfo;
    }

    public boolean isDataEquals(TextBubbleInfo textBubbleInfo) {
        if (textBubbleInfo != null && this.mBubbleSubtype == textBubbleInfo.mBubbleSubtype && this.bSupportAnim == textBubbleInfo.bSupportAnim && this.isAnimOn == textBubbleInfo.isAnimOn) {
            if (this.mTextBubbleList == null && textBubbleInfo.mTextBubbleList == null) {
                return true;
            }
            List<TextBubble> list = this.mTextBubbleList;
            if (list == null || textBubbleInfo.mTextBubbleList == null || list.size() != textBubbleInfo.mTextBubbleList.size()) {
                return false;
            }
            try {
                int size = this.mTextBubbleList.size();
                for (int i = 0; i < size; i++) {
                    if (!this.mTextBubbleList.get(i).isDataEquals(textBubbleInfo.mTextBubbleList.get(i))) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean isSupportAnim() {
        return this.bSupportAnim;
    }

    public void setSupportAnim(boolean z) {
        this.bSupportAnim = z;
    }

    public boolean isAnimOn() {
        return this.isAnimOn;
    }

    public void setAnimOn(boolean z) {
        this.isAnimOn = z;
    }

    public TextBubble getDftTextBubble() {
        List<TextBubble> list = this.mTextBubbleList;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.mTextBubbleList.get(0);
    }

    public void setText(String str) {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            dftTextBubble.mText = str;
        }
    }

    public String getText() {
        TextBubble dftTextBubble = getDftTextBubble();
        return dftTextBubble != null ? dftTextBubble.mText : "";
    }

    public void setDftText(String str) {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            dftTextBubble.mDftText = str;
        }
    }

    public String getDftText() {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            return dftTextBubble.mDftText;
        }
        return null;
    }

    public void setAllFontPath(String str) {
        for (TextBubble textBubble : this.mTextBubbleList) {
            if (textBubble != null) {
                textBubble.mFontPath = str;
            }
        }
    }

    public void setFontPath(String str) {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            dftTextBubble.mFontPath = str;
        }
    }

    public String getFontPath() {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            return dftTextBubble.mFontPath;
        }
        return null;
    }

    public void setTextColor(int i) {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            dftTextBubble.mTextColor = i;
        }
    }

    public int getTextColor() {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            return dftTextBubble.mTextColor;
        }
        return -1;
    }

    public int getTextDftColor() {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            return dftTextBubble.mDftTextColor;
        }
        return -1;
    }

    public int getTextAlignment() {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            return dftTextBubble.mTextAlignment;
        }
        return 0;
    }

    public ShadowInfo getTextShadowInfo() {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            return dftTextBubble.mShadowInfo;
        }
        return null;
    }

    public void setTextShadowInfo(ShadowInfo shadowInfo) {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            dftTextBubble.mShadowInfo = shadowInfo;
        }
    }

    public StrokeInfo getTextStrokeInfo() {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            return dftTextBubble.mStrokeInfo;
        }
        return null;
    }

    public void setTextStrokeInfo(StrokeInfo strokeInfo) {
        TextBubble dftTextBubble = getDftTextBubble();
        if (dftTextBubble != null) {
            dftTextBubble.mStrokeInfo = strokeInfo;
        }
    }

    public void save(TextBubbleInfo textBubbleInfo) {
        if (textBubbleInfo != null) {
            this.bSupportAnim = textBubbleInfo.bSupportAnim;
            this.isAnimOn = textBubbleInfo.isAnimOn;
            List<TextBubble> list = textBubbleInfo.mTextBubbleList;
            if (!(list == null || list.isEmpty())) {
                this.mTextBubbleList = new ArrayList(textBubbleInfo.mTextBubbleList.size());
                for (TextBubble textBubble : textBubbleInfo.mTextBubbleList) {
                    this.mTextBubbleList.add(new TextBubble().save(textBubble));
                }
            }
        }
    }

    public static class TextBubble implements Cloneable {
        public String mDftText = "";
        public int mDftTextColor = -1;
        public String mFontPath = "";
        public int mParamID;
        public ShadowInfo mShadowInfo = new ShadowInfo();
        public StrokeInfo mStrokeInfo = new StrokeInfo();
        public String mText = "Hello";
        public int mTextAlignment = 0;
        public int mTextColor = -1;

        public static List<TextBubble> cloneTextBubbleLists(List<TextBubble> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            try {
                for (TextBubble textBubble : list) {
                    arrayList.add(textBubble.clone());
                }
            } catch (Throwable unused) {
            }
            return arrayList;
        }

        @Override // java.lang.Object
        public TextBubble clone() throws CloneNotSupportedException {
            TextBubble textBubble = (TextBubble) super.clone();
            ShadowInfo shadowInfo = this.mShadowInfo;
            if (shadowInfo != null) {
                textBubble.mShadowInfo = (ShadowInfo) shadowInfo.clone();
            }
            StrokeInfo strokeInfo = this.mStrokeInfo;
            if (strokeInfo != null) {
                textBubble.mStrokeInfo = (StrokeInfo) strokeInfo.clone();
            }
            return textBubble;
        }

        public boolean isDataEquals(TextBubble textBubble) {
            if (textBubble != null && TextUtils.equals(this.mText, textBubble.mText) && TextUtils.equals(this.mFontPath, textBubble.mFontPath) && TextUtils.equals(this.mDftText, textBubble.mDftText) && this.mTextColor == textBubble.mTextColor && this.mParamID == textBubble.mParamID && this.mShadowInfo.isDataEquals(textBubble.mShadowInfo) && this.mStrokeInfo.isDataEquals(textBubble.mStrokeInfo) && this.mTextAlignment == textBubble.mTextAlignment) {
                return true;
            }
            return false;
        }

        public void reset() {
            this.mText = this.mDftText;
            this.mTextColor = this.mDftTextColor;
        }

        public TextBubble save(TextBubble textBubble) {
            if (textBubble == null) {
                return this;
            }
            this.mParamID = textBubble.mParamID;
            this.mText = textBubble.mText;
            this.mTextColor = textBubble.mTextColor;
            this.mDftText = textBubble.mDftText;
            this.mDftTextColor = textBubble.mDftTextColor;
            this.mFontPath = textBubble.mFontPath;
            this.mTextAlignment = textBubble.mTextAlignment;
            this.mShadowInfo.save(textBubble.mShadowInfo);
            this.mStrokeInfo.save(textBubble.mStrokeInfo);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextBubble textBubble = (TextBubble) obj;
            if (this.mParamID == textBubble.mParamID && this.mTextColor == textBubble.mTextColor && this.mDftTextColor == textBubble.mDftTextColor && this.mTextAlignment == textBubble.mTextAlignment && this.mText.equals(textBubble.mText) && this.mDftText.equals(textBubble.mDftText) && this.mFontPath.equals(textBubble.mFontPath) && this.mShadowInfo.equals(textBubble.mShadowInfo)) {
                return this.mStrokeInfo.equals(textBubble.mStrokeInfo);
            }
            return false;
        }
    }

    public void reset() {
        List<TextBubble> list = this.mTextBubbleList;
        if (list != null) {
            for (TextBubble textBubble : list) {
                textBubble.reset();
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextBubbleInfo textBubbleInfo = (TextBubbleInfo) obj;
        if (this.mBubbleSubtype != textBubbleInfo.mBubbleSubtype || this.bSupportAnim != textBubbleInfo.bSupportAnim || this.isAnimOn != textBubbleInfo.isAnimOn) {
            return false;
        }
        List<TextBubble> list = this.mTextBubbleList;
        if (list == null || textBubbleInfo.mTextBubbleList == null) {
            if (this.mTextBubbleList == null && textBubbleInfo.mTextBubbleList == null) {
                return true;
            }
            return false;
        } else if (list.size() == textBubbleInfo.mTextBubbleList.size()) {
            return true;
        } else {
            return false;
        }
    }
}
