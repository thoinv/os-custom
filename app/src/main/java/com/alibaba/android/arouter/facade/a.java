package com.alibaba.android.arouter.facade;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.alibaba.android.arouter.facade.b.b;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.c;
import java.io.Serializable;
import java.util.ArrayList;

public final class a extends RouteMeta {
    private int byQ;
    private c byR;
    private boolean byS;
    private Bundle byT;
    private int byU;
    private int byV;
    private int flags;
    private Bundle mBundle;
    private Object tag;
    private Uri uri;

    public Bundle EV() {
        return this.byT;
    }

    public int getEnterAnim() {
        return this.byU;
    }

    public int getExitAnim() {
        return this.byV;
    }

    public c EW() {
        return this.byR;
    }

    public a a(c cVar) {
        this.byR = cVar;
        return this;
    }

    public a() {
        this(null, null);
    }

    public a(String str, String str2) {
        this(str, str2, null, null);
    }

    public a(String str, String str2, Uri uri2, Bundle bundle) {
        this.flags = -1;
        this.byQ = 300;
        setPath(str);
        setGroup(str2);
        r(uri2);
        this.mBundle = bundle == null ? new Bundle() : bundle;
    }

    public boolean EX() {
        return this.byS;
    }

    public Object getTag() {
        return this.tag;
    }

    public a ah(Object obj) {
        this.tag = obj;
        return this;
    }

    public Bundle getExtras() {
        return this.mBundle;
    }

    public int getTimeout() {
        return this.byQ;
    }

    public Uri getUri() {
        return this.uri;
    }

    public a r(Uri uri2) {
        this.uri = uri2;
        return this;
    }

    public Object EY() {
        return bp(null);
    }

    public Object bp(Context context) {
        return a(context, (b) null);
    }

    public Object a(Context context, b bVar) {
        return com.alibaba.android.arouter.b.a.Fd().a(context, this, -1, bVar);
    }

    public void c(Activity activity, int i) {
        a(activity, i, null);
    }

    public void a(Activity activity, int i, b bVar) {
        com.alibaba.android.arouter.b.a.Fd().a(activity, this, i, bVar);
    }

    public a EZ() {
        this.byS = true;
        return this;
    }

    public a q(Bundle bundle) {
        if (bundle != null) {
            this.mBundle = bundle;
        }
        return this;
    }

    public a hV(int i) {
        this.flags = i;
        return this;
    }

    public int getFlags() {
        return this.flags;
    }

    public a z(String str, String str2) {
        this.mBundle.putString(str, str2);
        return this;
    }

    public a h(String str, boolean z) {
        this.mBundle.putBoolean(str, z);
        return this;
    }

    public a a(String str, short s) {
        this.mBundle.putShort(str, s);
        return this;
    }

    public a l(String str, int i) {
        this.mBundle.putInt(str, i);
        return this;
    }

    public a e(String str, long j) {
        this.mBundle.putLong(str, j);
        return this;
    }

    public a b(String str, double d) {
        this.mBundle.putDouble(str, d);
        return this;
    }

    public a a(String str, byte b2) {
        this.mBundle.putByte(str, b2);
        return this;
    }

    public a c(String str, float f) {
        this.mBundle.putFloat(str, f);
        return this;
    }

    public a a(String str, Parcelable parcelable) {
        this.mBundle.putParcelable(str, parcelable);
        return this;
    }

    public a a(String str, ArrayList<? extends Parcelable> arrayList) {
        this.mBundle.putParcelableArrayList(str, arrayList);
        return this;
    }

    public a a(String str, Serializable serializable) {
        this.mBundle.putSerializable(str, serializable);
        return this;
    }

    public a bb(int i, int i2) {
        this.byU = i;
        this.byV = i2;
        return this;
    }

    @Override // com.alibaba.android.arouter.facade.model.RouteMeta
    public String toString() {
        return "Postcard{uri=" + this.uri + ", tag=" + this.tag + ", mBundle=" + this.mBundle + ", flags=" + this.flags + ", timeout=" + this.byQ + ", provider=" + this.byR + ", greenChannel=" + this.byS + ", optionsCompat=" + this.byT + ", enterAnim=" + this.byU + ", exitAnim=" + this.byV + "}\n" + super.toString();
    }
}