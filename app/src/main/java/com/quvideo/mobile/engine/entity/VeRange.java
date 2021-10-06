package com.quvideo.mobile.engine.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class VeRange implements Parcelable, Comparable<VeRange> {
    public static final Parcelable.Creator<VeRange> CREATOR = new Parcelable.Creator<VeRange>() {
        /* class com.quvideo.mobile.engine.entity.VeRange.AnonymousClass1 */

        /* renamed from: br */
        public VeRange createFromParcel(Parcel parcel) {
            return new VeRange(parcel);
        }

        /* renamed from: oY */
        public VeRange[] newArray(int i) {
            return new VeRange[i];
        }
    };
    private int mPosition;
    private int mTimeLength;

    public int describeContents() {
        return 0;
    }

    public VeRange() {
    }

    public VeRange(VeRange veRange) {
        if (veRange != null) {
            this.mPosition = veRange.mPosition;
            this.mTimeLength = veRange.mTimeLength;
        }
    }

    public VeRange(int i, int i2) {
        this.mPosition = i;
        this.mTimeLength = i2;
    }

    public int getmPosition() {
        return this.mPosition;
    }

    public void setmPosition(int i) {
        this.mPosition = i;
    }

    public int getmTimeLength() {
        return this.mTimeLength;
    }

    public void setmTimeLength(int i) {
        this.mTimeLength = i;
    }

    public int avc() {
        int i = this.mTimeLength;
        int i2 = this.mPosition;
        return i >= 0 ? (i2 + i) - 1 : i2;
    }

    public int getLimitValue() {
        int i = this.mTimeLength;
        if (i == -1) {
            return Integer.MAX_VALUE;
        }
        return this.mPosition + i;
    }

    public boolean contains(int i) {
        if (i >= this.mPosition) {
            return i < getLimitValue() || this.mTimeLength < 0;
        }
        return false;
    }

    public boolean contains2(int i) {
        if (i >= this.mPosition) {
            return i <= getLimitValue() || this.mTimeLength < 0;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VeRange)) {
            return false;
        }
        VeRange veRange = (VeRange) obj;
        if (veRange.getmPosition() == this.mPosition && veRange.getmTimeLength() == this.mTimeLength) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(mPosition:" + this.mPosition + ";mTimeLength:" + this.mTimeLength + ")");
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public int compareTo(VeRange veRange) {
        if (veRange == null) {
            return 0;
        }
        if (getmPosition() > veRange.getmPosition()) {
            return 1;
        }
        return getmPosition() < veRange.getmPosition() ? -1 : 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mPosition);
        parcel.writeInt(this.mTimeLength);
    }

    private VeRange(Parcel parcel) {
        this.mPosition = parcel.readInt();
        this.mTimeLength = parcel.readInt();
    }
}