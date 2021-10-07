package com.xiaojinzi.component.impl.service;

import com.facebook.internal.security.CertificateUtil;
import com.xiaojinzi.component.error.ServiceRepeatCreateException;
import com.xiaojinzi.component.support.h;
import com.xiaojinzi.component.support.u;
import com.xiaojinzi.component.support.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class c {
    private static final Map<Class, HashMap<String, com.xiaojinzi.component.support.c<?>>> dZZ = new HashMap();
    private static final Map<Class, HashMap<String, h<?>>> lGD = new HashMap();
    private static final Set<String> lGE = new HashSet();
    private static final HashMap<Class, String> lGF = new HashMap<>();

    public static void cPt() {
        for (Map.Entry<Class, String> entry : lGF.entrySet()) {
            if (entry.getValue() == null) {
                L(entry.getKey());
            } else {
                e(entry.getKey(), entry.getValue());
            }
        }
    }

    public static <T> void a(Class<T> cls, com.xiaojinzi.component.support.c<? extends T> cVar) {
        a(cls, "", cVar);
    }

    public static <T> void a(Class<T> cls, String str, com.xiaojinzi.component.support.c<? extends T> cVar) {
        v.n(cls, "tClass");
        v.n(str, "name");
        v.n(cVar, "callable");
        synchronized (dZZ) {
            HashMap<String, com.xiaojinzi.component.support.c<?>> hashMap = dZZ.get(cls);
            if (hashMap == null) {
                hashMap = new HashMap<>();
                dZZ.put(cls, hashMap);
            }
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, cVar);
            } else {
                throw new RuntimeException(cls.getSimpleName() + " the key of '" + str + "' is exist");
            }
        }
    }

    public static <T> void al(Class<T> cls) {
        d(cls, "");
    }

    public static <T> void d(Class<T> cls, String str) {
        v.n(cls, "tClass");
        v.n(str, "name");
        synchronized (dZZ) {
            HashMap<String, com.xiaojinzi.component.support.c<?>> hashMap = dZZ.get(cls);
            if (hashMap != null) {
                com.xiaojinzi.component.support.c<?> remove = hashMap.remove(str);
                if (remove != null) {
                    if ((remove instanceof u) && ((u) remove).isInit()) {
                        ((u) remove).destroy();
                    }
                }
            }
        }
    }

    public static <T> T c(Class<T> cls, T t) {
        Collection<h<?>> values;
        v.n(cls, "tClass");
        v.n(t, "target");
        synchronized (lGD) {
            HashMap<String, h<?>> hashMap = lGD.get(cls);
            if (!(hashMap == null || (values = hashMap.values()) == null)) {
                ArrayList<h> arrayList = new ArrayList(values);
                Collections.sort(arrayList, new Comparator<h<?>>() {
                    /* class com.xiaojinzi.component.impl.service.c.AnonymousClass1 */

                    /* renamed from: a */
                    public int compare(h<?> hVar, h<?> hVar2) {
                        return hVar.Fc() - hVar2.Fc();
                    }
                });
                for (h hVar : arrayList) {
                    t = (T) hVar.get(t);
                }
            }
        }
        return t;
    }

    public static <T> T L(Class<T> cls) {
        return (T) e(cls, "");
    }

    public static <T> T e(Class<T> cls, String str) {
        T t;
        com.xiaojinzi.component.support.c<?> cVar;
        v.n(cls, "tClass");
        v.n(str, "name");
        synchronized (dZZ) {
            String str2 = cls.getName() + CertificateUtil.DELIMITER + str;
            if (!lGE.contains(str2)) {
                lGE.add(str2);
                t = null;
                HashMap<String, com.xiaojinzi.component.support.c<?>> hashMap = dZZ.get(cls);
                if (!(hashMap == null || (cVar = hashMap.get(str)) == null)) {
                    t = (T) c(cls, v.bV(cVar.get()));
                }
                lGE.remove(str2);
            } else {
                throw new ServiceRepeatCreateException("className is " + cls.getName() + ", serviceName is '" + str + "'");
            }
        }
        return t;
    }

    public static <T> T am(Class<T> cls) {
        return (T) f(cls, "");
    }

    public static <T> T f(Class<T> cls, String str) {
        return (T) v.bV(e(cls, str));
    }
}