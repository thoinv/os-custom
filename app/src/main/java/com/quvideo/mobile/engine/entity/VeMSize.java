package com.quvideo.mobile.engine.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class VeMSize implements Parcelable {
    public static final Creator<VeMSize> CREATOR = new Creator<VeMSize>() {
        /* class com.quvideo.mobile.engine.entity.VeMSize.AnonymousClass1 */

        /* renamed from: bq */
        public VeMSize createFromParcel(Parcel parcel) {
            return new VeMSize(parcel);
        }

        /* renamed from: oX */
        public VeMSize[] newArray(int i) {
            return new VeMSize[i];
        }
    };
    public int height;
    public int width;

    public int describeContents() {
        return 0;
    }

    public VeMSize() {
    }

    public VeMSize(int i, int i2) {
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

    private VeMSize(Parcel parcel) {
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
        VeMSize veMSize = (VeMSize) obj;
        if (this.width == veMSize.width && this.height == veMSize.height) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }
}
