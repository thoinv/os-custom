package com.vivavideo.mobile.h5core;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

public class l {
    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private l() {
    }

    public static String x(String str, Object obj) {
        return str + obj;
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            cUd();
        }
    }

    public static void cUc() {
        throw ((KotlinNullPointerException) am(new KotlinNullPointerException()));
    }

    public static void cUd() {
        throw ((NullPointerException) am(new NullPointerException()));
    }

    public static void MC(String str) {
        throw ((UninitializedPropertyAccessException) am(new UninitializedPropertyAccessException(str)));
    }

    public static void MD(String str) {
        MC("lateinit property " + str + " has not been initialized");
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) am(new IllegalStateException(str + " must not be null")));
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) am(new NullPointerException(str + " must not be null")));
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            ME(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            MF(str);
        }
    }

    private static void ME(String str) {
        throw ((IllegalArgumentException) am(new IllegalArgumentException(MG(str))));
    }

    private static void MF(String str) {
        throw ((NullPointerException) am(new NullPointerException(MG(str))));
    }

    private static String MG(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + InstructionFileId.DOT + methodName + ", parameter " + str;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static <T extends Throwable> T am(T t) {
        return (T) c(t, l.class.getName());
    }

    static <T extends Throwable> T c(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}