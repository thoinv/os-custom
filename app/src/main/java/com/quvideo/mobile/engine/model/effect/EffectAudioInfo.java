package com.quvideo.mobile.engine.model.effect;

import android.text.TextUtils;
import java.io.Serializable;

public class EffectAudioInfo implements Serializable, Cloneable {
    private static final long serialVersionUID = -7273964368005791381L;
    public boolean isFadeIn = false;
    public boolean isFadeOut = false;
    public boolean isRepeat = false;
    public String musicTitle = "";
    public float soundTone;

    public EffectAudioInfo() {
    }

    public EffectAudioInfo(boolean z, boolean z2) {
        this.isFadeIn = z;
        this.isFadeOut = z2;
    }

    public void save(EffectAudioInfo effectAudioInfo) {
        if (effectAudioInfo != null) {
            this.musicTitle = effectAudioInfo.musicTitle;
            this.isRepeat = effectAudioInfo.isRepeat;
            this.isFadeIn = effectAudioInfo.isFadeIn;
            this.isFadeOut = effectAudioInfo.isFadeOut;
            this.soundTone = effectAudioInfo.soundTone;
        }
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isDataEquals(EffectAudioInfo effectAudioInfo) {
        return effectAudioInfo != null && TextUtils.equals(this.musicTitle, effectAudioInfo.musicTitle) && this.isRepeat == effectAudioInfo.isRepeat && this.isFadeIn == effectAudioInfo.isFadeIn && this.isFadeOut == effectAudioInfo.isFadeOut && this.soundTone == effectAudioInfo.soundTone;
    }
}