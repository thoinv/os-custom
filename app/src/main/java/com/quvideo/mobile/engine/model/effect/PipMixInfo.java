package com.quvideo.mobile.engine.model.effect;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;

public class PipMixInfo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<PipMixInfo> CREATOR = new Parcelable.Creator<PipMixInfo>() {
        /* class com.quvideo.mobile.engine.model.effect.PipMixInfo.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public PipMixInfo createFromParcel(Parcel parcel) {
            return new PipMixInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PipMixInfo[] newArray(int i) {
            return new PipMixInfo[i];
        }
    };
    private String path;

    public int describeContents() {
        return 0;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        PipMixInfo pipMixInfo = (PipMixInfo) super.clone();
        pipMixInfo.setPath(getPath());
        return pipMixInfo;
    }

    public boolean isDataEquals(PipMixInfo pipMixInfo) {
        if (pipMixInfo == null) {
            return false;
        }
        return (TextUtils.isEmpty(this.path) && TextUtils.isEmpty(pipMixInfo.path)) || TextUtils.isEmpty(this.path) || this.path.equals(pipMixInfo.path);
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
    }

    public PipMixInfo() {
    }

    protected PipMixInfo(Parcel parcel) {
        this.path = parcel.readString();
    }
}