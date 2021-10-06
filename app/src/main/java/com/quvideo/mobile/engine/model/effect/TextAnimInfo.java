package com.quvideo.mobile.engine.model.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;

public class TextAnimInfo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<TextAnimInfo> CREATOR = new Parcelable.Creator<TextAnimInfo>() {
        /* class com.quvideo.mobile.engine.model.effect.TextAnimInfo.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public TextAnimInfo createFromParcel(Parcel parcel) {
            return new TextAnimInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TextAnimInfo[] newArray(int i) {
            return new TextAnimInfo[i];
        }
    };
    private int animInDuration;
    private long animInId;
    private long animLoopId;
    private int animOutDuration;
    private long animOutId;

    public int describeContents() {
        return 0;
    }

    public long getAnimInId() {
        return this.animInId;
    }

    public void setAnimInId(long j) {
        this.animInId = j;
    }

    public long getAnimOutId() {
        return this.animOutId;
    }

    public void setAnimOutId(long j) {
        this.animOutId = j;
    }

    public long getAnimLoopId() {
        return this.animLoopId;
    }

    public void setAnimLoopId(long j) {
        this.animLoopId = j;
    }

    public int getAnimInDuration() {
        return this.animInDuration;
    }

    public void setAnimInDuration(int i) {
        this.animInDuration = i;
    }

    public int getAnimOutDuration() {
        return this.animOutDuration;
    }

    public void setAnimOutDuration(int i) {
        this.animOutDuration = i;
    }

    public boolean hasAnimIn() {
        return this.animInId > 0;
    }

    public boolean hasAnimOut() {
        return this.animOutId > 0;
    }

    public boolean hasAnimLoop() {
        return this.animLoopId > 0;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isDataEquals(TextAnimInfo textAnimInfo) {
        return textAnimInfo != null && this.animInId == textAnimInfo.animInId && this.animOutId == textAnimInfo.animOutId && this.animLoopId == textAnimInfo.animLoopId && this.animInDuration == textAnimInfo.animInDuration && this.animOutDuration == textAnimInfo.animOutDuration;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.animInId);
        parcel.writeLong(this.animOutId);
        parcel.writeLong(this.animLoopId);
        parcel.writeInt(this.animInDuration);
        parcel.writeInt(this.animOutDuration);
    }

    public TextAnimInfo() {
    }

    protected TextAnimInfo(Parcel parcel) {
        this.animInId = parcel.readLong();
        this.animOutId = parcel.readLong();
        this.animLoopId = parcel.readLong();
        this.animInDuration = parcel.readInt();
        this.animOutDuration = parcel.readInt();
    }
}