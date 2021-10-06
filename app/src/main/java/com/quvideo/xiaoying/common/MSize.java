package com.quvideo.xiaoying.common;

import android.os.Parcel;
import android.os.Parcelable;

public class MSize implements Parcelable {
    public static final Parcelable.Creator<MSize> CREATOR = new Parcelable.Creator<MSize>() {
        /* class com.quvideo.xiaoying.common.MSize.AnonymousClass1 */

        /* renamed from: bt */
        public MSize createFromParcel(Parcel parcel) {
            return new MSize(parcel);
        }

        /* renamed from: tI */
        public MSize[] newArray(int i) {
            return new MSize[i];
        }
    };
    public int height;
    public int width;

    public int describeContents() {
        return 0;
    }

    public MSize() {
    }

    public MSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(width:");
        stringBuffer.append(this.width);
        stringBuffer.append(",height:");
        stringBuffer.append(this.height);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    private MSize(Parcel parcel) {
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MSize mSize = (MSize) obj;
        if (this.width == mSize.width && this.height == mSize.height) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }
}