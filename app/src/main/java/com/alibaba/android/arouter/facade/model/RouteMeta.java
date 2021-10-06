package com.alibaba.android.arouter.facade.model;

import com.alibaba.android.arouter.facade.c.a;
import java.util.Map;
import javax.lang.model.element.Element;

public class RouteMeta {
    private Class<?> destination;
    private int extra;
    private String group;
    private Map<String, Integer> paramsType;
    private String path;
    private int priority;
    private Element rawType;
    private a type;

    public RouteMeta() {
        this.priority = -1;
    }

    public static RouteMeta build(a aVar, Class<?> cls, String str, String str2, int i, int i2) {
        return new RouteMeta(aVar, null, cls, str, str2, null, i, i2);
    }

    public static RouteMeta build(a aVar, Class<?> cls, String str, String str2, Map<String, Integer> map, int i, int i2) {
        return new RouteMeta(aVar, null, cls, str, str2, map, i, i2);
    }

    public RouteMeta(com.alibaba.android.arouter.facade.a.a aVar, Class<?> cls, a aVar2) {
        this(aVar2, null, cls, aVar.Fa(), aVar.group(), null, aVar.Fc(), aVar.Fb());
    }

    public RouteMeta(com.alibaba.android.arouter.facade.a.a aVar, Element element, a aVar2, Map<String, Integer> map) {
        this(aVar2, element, null, aVar.Fa(), aVar.group(), map, aVar.Fc(), aVar.Fb());
    }

    public RouteMeta(a aVar, Element element, Class<?> cls, String str, String str2, Map<String, Integer> map, int i, int i2) {
        this.priority = -1;
        this.type = aVar;
        this.destination = cls;
        this.rawType = element;
        this.path = str;
        this.group = str2;
        this.paramsType = map;
        this.priority = i;
        this.extra = i2;
    }

    public Map<String, Integer> getParamsType() {
        return this.paramsType;
    }

    public RouteMeta setParamsType(Map<String, Integer> map) {
        this.paramsType = map;
        return this;
    }

    public Element getRawType() {
        return this.rawType;
    }

    public RouteMeta setRawType(Element element) {
        this.rawType = element;
        return this;
    }

    public a getType() {
        return this.type;
    }

    public RouteMeta setType(a aVar) {
        this.type = aVar;
        return this;
    }

    public Class<?> getDestination() {
        return this.destination;
    }

    public RouteMeta setDestination(Class<?> cls) {
        this.destination = cls;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public RouteMeta setPath(String str) {
        this.path = str;
        return this;
    }

    public String getGroup() {
        return this.group;
    }

    public RouteMeta setGroup(String str) {
        this.group = str;
        return this;
    }

    public int getPriority() {
        return this.priority;
    }

    public RouteMeta setPriority(int i) {
        this.priority = i;
        return this;
    }

    public int getExtra() {
        return this.extra;
    }

    public RouteMeta setExtra(int i) {
        this.extra = i;
        return this;
    }

    public String toString() {
        return "RouteMeta{type=" + this.type + ", rawType=" + this.rawType + ", destination=" + this.destination + ", path='" + this.path + '\'' + ", group='" + this.group + '\'' + ", priority=" + this.priority + ", extra=" + this.extra + '}';
    }
}