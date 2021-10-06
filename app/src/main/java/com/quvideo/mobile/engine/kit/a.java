package com.quvideo.mobile.engine.kit;

import com.quvideo.mobile.engine.model.PrecisionModel;
import com.quvideo.mobile.engine.model.SttDataModel;

public class a implements Cloneable {
    String dSj;
    String dSk;
    public int dSl;
    public int dSm;
    int dSn;
    int dSo;
    int dSp;
    PrecisionModel dSq = new PrecisionModel();
    SttDataModel dSr = new SttDataModel();
    int fontSize;

    public PrecisionModel avg() {
        return this.dSq;
    }

    public void a(PrecisionModel precisionModel) {
        this.dSq = precisionModel;
    }

    public SttDataModel avh() {
        return this.dSr;
    }

    public int avi() {
        return this.fontSize;
    }

    public void oZ(int i) {
        this.fontSize = i;
    }

    public String getDefaultInputText() {
        return this.dSj;
    }

    public void setDefaultInputText(String str) {
        this.dSj = str;
    }

    public String avj() {
        return this.dSk;
    }

    public void setCustomFontPath(String str) {
        this.dSk = str;
    }

    public int avk() {
        return this.dSl;
    }

    public void pa(int i) {
        this.dSl = i;
    }

    public int avl() {
        return this.dSm;
    }

    public void pb(int i) {
        this.dSm = i;
    }

    public int getTextForegroundColor() {
        return this.dSn;
    }

    public void pc(int i) {
        this.dSn = i;
    }

    public int getStrokeForegroundColor() {
        return this.dSo;
    }

    public void pd(int i) {
        this.dSo = i;
    }

    public int getShadowForegroundColor() {
        return this.dSp;
    }

    public void pe(int i) {
        this.dSp = i;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        a aVar = (a) super.clone();
        PrecisionModel precisionModel = this.dSq;
        if (precisionModel != null) {
            aVar.dSq = (PrecisionModel) precisionModel.clone();
        }
        SttDataModel sttDataModel = this.dSr;
        if (sttDataModel != null) {
            aVar.dSr = (SttDataModel) sttDataModel.clone();
        }
        return aVar;
    }
}