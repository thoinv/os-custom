package androidx.core.content.b;

import static androidx.core.util.Preconditions.checkNotNull;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;

import androidx.annotation.RequiresApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class f {
    public static Drawable d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static int e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    public static Typeface y(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface z(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static abstract class a {
        public abstract void W(int i);

        public abstract void b(Typeface typeface);

        public final void a(final Typeface typeface, Handler handler) {
            a(handler).post(new Runnable() {
                /* class androidx.core.content.b.f.a.AnonymousClass1 */

                public void run() {
                    a.this.b(typeface);
                }
            });
        }

        public final void a(final int i, Handler handler) {
            a(handler).post(new Runnable() {
                /* class androidx.core.content.b.f.a.AnonymousClass2 */

                public void run() {
                    a.this.W(i);
                }
            });
        }

        public static Handler a(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }
    }

    @SuppressLint("RestrictedApi")
    public static void a(Context context, int i, a aVar, Handler handler) throws Resources.NotFoundException {
        checkNotNull(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
        } else {
            a(context, i, new TypedValue(), 0, aVar, handler, false, false);
        }
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, typedValue, i2, aVar, null, true, false);
    }

    private static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i, i2, aVar, handler, z, z2);
        if (a2 != null || aVar != null || z2) {
            return a2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.b.f.a r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.b.f.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.b.f$a, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    public static final class b {
        public static void b(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0027b.b(theme);
            } else if (Build.VERSION.SDK_INT >= 23) {
                a.b(theme);
            }
        }

        /* renamed from: androidx.core.content.b.f$b$b  reason: collision with other inner class name */
        static class C0027b {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            static void b(Resources.Theme theme) {
                theme.rebase();
            }
        }

        static class a {
            private static final Object Vl = new Object();
            private static Method Vm;
            private static boolean Vn;

            static void b(Resources.Theme theme) {
                synchronized (Vl) {
                    if (!Vn) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            Vm = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        Vn = true;
                    }
                    if (Vm != null) {
                        try {
                            Vm.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            Vm = null;
                        }
                    }
                }
            }
        }
    }
}