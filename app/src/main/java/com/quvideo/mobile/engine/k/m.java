package com.quvideo.mobile.engine.k;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import xiaoying.utils.QRect;

public class m {
    public static RectF x(Rect rect) {
        if (rect == null) {
            return null;
        }
        return new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    public static Rect i(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static QRect j(RectF rectF) {
        return y(i(rectF));
    }

    public static QRect y(Rect rect) {
        QRect qRect = new QRect();
        if (rect != null) {
            qRect.left = rect.left;
            qRect.right = rect.right;
            qRect.top = rect.top;
            qRect.bottom = rect.bottom;
        }
        return qRect;
    }

    public static QRect a(QRect qRect, int i, int i2, int i3) {
        if (qRect == null) {
            return null;
        }
        QRect qRect2 = new QRect();
        if (i == 90) {
            qRect2.set(i2 - qRect.bottom, qRect.left, i3 - qRect.top, qRect.right);
        } else if (i == 180) {
            qRect2.set(i2 - qRect.right, i3 - qRect.bottom, i2 - qRect.left, i3 - qRect.top);
        } else if (i != 270) {
            qRect2.set(qRect.left, qRect.top, qRect.right, qRect.bottom);
        } else {
            qRect2.set(qRect.top, i2 - qRect.right, qRect.bottom, i2 - qRect.left);
        }
        return qRect2;
    }

    public static Rect b(Rect rect, int i, int i2) {
        return c(new RectF(rect), i, i2);
    }

    public static Rect c(RectF rectF, int i, int i2) {
        if (rectF == null || i <= 0 || i2 <= 0) {
            return null;
        }
        Rect rect = new Rect();
        rect.left = g(rectF.left, i);
        rect.top = g(rectF.top, i2);
        rect.right = g(rectF.right, i);
        rect.bottom = g(rectF.bottom, i2);
        return rect;
    }

    public static int g(float f, int i) {
        if (i == 0) {
            return 0;
        }
        return Math.round((f * 10000.0f) / ((float) i));
    }

    public static boolean a(Point point, float f, Rect rect) {
        if (rect == null) {
            return false;
        }
        float f2 = f % 180.0f;
        if (f2 <= 1.0f || 180.0f - f2 <= 1.0f) {
            return rect.contains(point.x, point.y);
        }
        Point point2 = new Point(rect.centerX(), rect.centerY());
        Point a2 = a(point, point2, 360.0f - f);
        if (a2 != null) {
            return rect.contains(a2.x, a2.y);
        }
        Point[] pointArr = {new Point(rect.left, rect.top), new Point(rect.left, rect.bottom), new Point(rect.right, rect.top), new Point(rect.right, rect.bottom)};
        Point[] pointArr2 = new Point[4];
        int i = 0;
        int i2 = 0;
        while (i < 4) {
            pointArr2[i2] = a(pointArr[i], point2, f);
            i++;
            i2++;
        }
        return a(pointArr2[0], pointArr2[1], pointArr2[2], pointArr2[3], point);
    }

    private static Point a(Point point, Point point2, float f) {
        double d = (double) ((float) ((((double) f) * 3.141592653589793d) / 180.0d));
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        int i = point.x - point2.x;
        float f2 = (float) i;
        float f3 = (float) (point.y - point2.y);
        return new Point((int) (((f2 * cos) - (f3 * sin)) + ((float) point2.x)), (int) ((f2 * sin) + (f3 * cos) + ((float) point2.y)));
    }

    private static boolean a(Point point, Point point2, Point point3, Point point4, Point point5) {
        return (((a(point, point2, point5) + a(point2, point3, point5)) + a(point3, point4, point5)) + a(point4, point, point5)) - (a(point, point2, point3) + a(point3, point4, point)) < 1.0d;
    }

    private static double a(Point point, Point point2, Point point3) {
        return Math.abs(((double) ((((((point.x * point2.y) + (point2.x * point3.y)) + (point3.x * point.y)) - (point2.x * point.y)) - (point3.x * point2.y)) - (point.x * point3.y))) / 2.0d);
    }
}