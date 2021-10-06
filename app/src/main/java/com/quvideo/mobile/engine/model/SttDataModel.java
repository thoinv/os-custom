package com.quvideo.mobile.engine.model;

public class SttDataModel implements Cloneable {
    private boolean speech;

    public boolean isSpeech() {
        return this.speech;
    }

    public void setSpeech(boolean z) {
        this.speech = z;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}