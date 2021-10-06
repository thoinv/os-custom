package com.vivavideo.mobile.h5core.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;

import com.iflytek.cloud.msc.util.NetworkUtil;
import com.vivavideo.mobile.h5api.e.c;
import com.vivavideo.mobile.h5core.e.b;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint("WrongConstant")
public class d {
    public static PackageInfo el(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages == null) {
            return null;
        }
        for (int i = 0; i < installedPackages.size(); i++) {
            PackageInfo packageInfo = installedPackages.get(i);
            if (str.equals(packageInfo.packageName)) {
                return packageInfo;
            }
        }
        return null;
    }

    public static String i(Bundle bundle, String str) {
        return getString(bundle, str, "");
    }

    public static String getString(Bundle bundle, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return (String) a(bundle, str, str2);
    }

    public static boolean b(Bundle bundle, String str, boolean z) {
        return ((Boolean) a(bundle, str, Boolean.valueOf(z))).booleanValue();
    }

    public static int a(Bundle bundle, String str, int i) {
        return ((Integer) a(bundle, str, Integer.valueOf(i))).intValue();
    }

    public static double a(Bundle bundle, String str, double d) {
        return ((Double) a(bundle, str, Double.valueOf(d))).doubleValue();
    }

    public static boolean j(Bundle bundle, String str) {
        if (bundle == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return bundle.containsKey(str);
    }

    public static <T> T a(Bundle bundle, String str, T t) {
        if (bundle == null || TextUtils.isEmpty(str) || t == null || !bundle.containsKey(str)) {
            return t;
        }
        T t2 = (T) bundle.get(str);
        if (t2 != null && t.getClass().isAssignableFrom(t2.getClass())) {
            return t2;
        }
        c.d("H5Utils", "[key] " + str + " [value] " + ((Object) t2));
        return t;
    }

    public static JSONObject J(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null) {
            return jSONObject;
        }
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                c.a("H5Utils", "exception", e);
            }
        }
        return jSONObject;
    }

    public static String r(JSONObject jSONObject, String str) {
        return getString(jSONObject, str, "");
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return (String) b(jSONObject, str, str2);
    }

    public static boolean b(JSONObject jSONObject, String str, boolean z) {
        return ((Boolean) b(jSONObject, str, Boolean.valueOf(z))).booleanValue();
    }

    public static int s(JSONObject jSONObject, String str) {
        return getInt(jSONObject, str, 0);
    }

    public static int getInt(JSONObject jSONObject, String str, int i) {
        return ((Integer) b(jSONObject, str, Integer.valueOf(i))).intValue();
    }

    public static JSONObject b(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return (JSONObject) b(jSONObject, str, (Object) jSONObject2);
    }

    public static JSONArray b(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        return (JSONArray) b(jSONObject, str, (Object) jSONArray);
    }

    public static <T> T b(JSONObject jSONObject, String str, T t) {
        if (jSONObject == null || jSONObject.length() == 0 || t == null || jSONObject.isNull(str)) {
            return t;
        }
        try {
            T t2 = (T) jSONObject.get(str);
            if (t2 != null && t.getClass().isAssignableFrom(t2.getClass())) {
                return t2;
            }
            c.w("H5Utils", "[key] " + str + " [value] " + ((Object) t2));
            return t;
        } catch (JSONException e) {
            c.a("H5Utils", "exception", e);
            return t;
        }
    }

    public static String em(Context context, String str) {
        String str2 = null;
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.js.setting/" + str), new String[]{""}, "", new String[0], "");
            while (query.moveToNext()) {
                str2 = query.getString(0);
            }
            query.close();
        } catch (Exception unused) {
        }
        return str2;
    }

    public static boolean en(Context context, String str) {
        boolean z = false;
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.js.setting/" + str), new String[]{""}, "", new String[0], "");
            if (query == null) {
                return false;
            }
            if (query.moveToNext() && query.getInt(0) == 1) {
                z = true;
            }
            query.close();
            return z;
        } catch (Exception unused) {
        }
        return z;
    }

    public static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            c.a("H5Utils", "exception", e);
            return null;
        }
    }

    public static Bundle a(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!(jSONObject == null || jSONObject.length() == 0)) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putDouble(next, new BigDecimal(Float.toString(((Float) obj).floatValue())).doubleValue());
                    } else if (obj instanceof JSONObject) {
                        bundle.putString(next, ((JSONObject) obj).toString());
                    }
                } catch (Exception e) {
                    c.a("H5Utils", "toBundle exception", e);
                }
            }
        }
        return bundle;
    }

    public static final JSONObject Lg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            c.c("H5Utils", e);
            return null;
        }
    }

    public static boolean cNO() {
        try {
            return c.isDebug();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void D(Runnable runnable) {
        if (runnable != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    public static void f(Runnable runnable, long j) {
        if (runnable != null) {
            new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
        }
    }

    public static String cNP() {
        Context context = b.getContext();
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.dataDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int NB(int i) {
        return Math.round(TypedValue.applyDimension(1, (float) i, b.getResources().getDisplayMetrics()));
    }

    public static String getNetworkType() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) b.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        if (networkInfo == null) {
            return "fail";
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 9) ? NetworkUtil.NET_WIFI : "wwan";
    }

    public static int nv(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 1).uid;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String NC(int i) throws Throwable {
        InputStream inputStream;
        Throwable th;
        Exception e;
        try {
            inputStream = b.getResources().openRawResource(i);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str = new String(bArr);
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
                return str;
            } catch (Exception e2) {
                e = e2;
                try {
                    c.a("H5Utils", "read raw file exception.", e);
                    try {
                        inputStream.close();
                        return null;
                    } catch (Exception unused2) {
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            c.a("H5Utils", "read raw file exception.", e);
            inputStream.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            inputStream.close();
            throw th;
        }
    }

    public static String bU(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName == null ? obj.getClass().getName() : canonicalName;
    }
}