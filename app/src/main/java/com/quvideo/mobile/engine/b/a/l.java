package com.quvideo.mobile.engine.b.a;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.quvideo.mobile.engine.a;
import com.quvideo.mobile.engine.c;
import com.quvideo.mobile.engine.entity.VeMSize;
import com.quvideo.mobile.engine.entity.VeRange;
import com.quvideo.mobile.engine.k.m;
import com.quvideo.mobile.engine.model.EffectDataModel;
import com.quvideo.mobile.engine.model.SubtitleFontModel;
import com.quvideo.mobile.engine.model.effect.ScaleRotateViewState;
import com.quvideo.mobile.engine.model.effect.TextBubbleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xiaoying.engine.base.QBubbleMeasureResult;
import xiaoying.engine.base.QBubbleTextSource;
import xiaoying.engine.base.QStyle;
import xiaoying.engine.base.QTextMulInfo;
import xiaoying.engine.base.QUtils;
import xiaoying.utils.QAndroidBitmapFactory;
import xiaoying.utils.QBitmap;
import xiaoying.utils.QPoint;
import xiaoying.utils.QRect;
import xiaoying.utils.QSize;

public class l {
    public static long dRT;
    public static long dRU;

    public static Rect a(Rect rect, int i, int i2) {
        if (rect == null || i <= 0 || i2 <= 0) {
            return rect;
        }
        Rect rect2 = new Rect();
        rect2.left = L(rect.left, i, 10000);
        rect2.top = L(rect.top, i2, 10000);
        rect2.right = L(rect.right, i, 10000);
        rect2.bottom = L(rect.bottom, i2, 10000);
        return rect2;
    }

    public static Point a(Point point, int i, int i2) {
        if (point == null || i <= 0 || i2 <= 0) {
            return point;
        }
        Point point2 = new Point();
        point2.x = L(point.x, i, 10000);
        point2.y = L(point.y, i2, 10000);
        return point2;
    }

    public static int L(int i, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        return Math.round((((float) i) * ((float) i2)) / ((float) i3));
    }

    public static ArrayList<VeRange> i(ArrayList<EffectDataModel> arrayList) {
        return d(arrayList, -1);
    }

    public static ArrayList<VeRange> d(ArrayList<EffectDataModel> arrayList, int i) {
        ArrayList<VeRange> arrayList2 = new ArrayList<>();
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<EffectDataModel> it = arrayList.iterator();
            while (it.hasNext()) {
                VeRange destRange = it.next().getDestRange();
                if (i <= 0 || destRange.getmTimeLength() >= 0) {
                    arrayList2.add(new VeRange(destRange));
                } else {
                    arrayList2.add(new VeRange(destRange.getmPosition(), i));
                }
            }
        }
        return arrayList2;
    }

    public static QBubbleTextSource a(ScaleRotateViewState scaleRotateViewState, int i, int i2, String str, VeMSize veMSize, long j) {
        int i3;
        int i4;
        int i5;
        QRect qRect;
        if (TextUtils.isEmpty(str) || veMSize == null) {
            return null;
        }
        QSize qSize = new QSize();
        qSize.mWidth = veMSize.width;
        qSize.mHeight = veMSize.height;
        QBubbleMeasureResult measureBubbleByTemplate = QStyle.measureBubbleByTemplate(scaleRotateViewState.mStylePath, qSize, str, null);
        if (measureBubbleByTemplate != null) {
            i5 = measureBubbleByTemplate.bubbleW;
            i3 = measureBubbleByTemplate.bubbleH;
            i4 = measureBubbleByTemplate.textLines;
        } else {
            i5 = 0;
            i4 = 1;
            i3 = 0;
        }
        Rect rectByDisplaySize = scaleRotateViewState.mEffectPosInfo.getRectByDisplaySize(veMSize);
        float width = (float) rectByDisplaySize.width();
        float height = (float) rectByDisplaySize.height();
        if (i3 > 0 && i5 > 0) {
            height = (float) (rectByDisplaySize.height() * i4);
            width = (((float) i5) * height) / ((float) i3);
        }
        scaleRotateViewState.mEffectPosInfo.setRectByDisplaySize(c(rectByDisplaySize.centerX(), rectByDisplaySize.centerY(), width, height), veMSize);
        Rect i6 = m.i(scaleRotateViewState.mEffectPosInfo.getRectArea());
        if (i6 != null) {
            qRect = new QRect(i6.left, i6.top, i6.right, i6.bottom);
        } else {
            qRect = new QRect();
        }
        return new QBubbleTextSource(-1, false, false, (float) i2, new QPoint(0, 0), qRect, 100, i, str, j, null);
    }

    public static boolean a(EffectDataModel effectDataModel, ScaleRotateViewState scaleRotateViewState, String str, VeMSize veMSize) {
        return a(effectDataModel, scaleRotateViewState, str, veMSize, false);
    }

    public static boolean a(EffectDataModel effectDataModel, ScaleRotateViewState scaleRotateViewState, String str, VeMSize veMSize, boolean z) {
        TextBubbleInfo.TextBubble dftTextBubble;
        QBubbleMeasureResult qBubbleMeasureResult;
        QSize qSize = new QSize();
        qSize.mWidth = veMSize.width;
        qSize.mHeight = veMSize.height;
        TextBubbleInfo textBubbleInfo = scaleRotateViewState.mTextBubbleInfo;
        if (textBubbleInfo == null || textBubbleInfo.mTextBubbleList == null || textBubbleInfo.mTextBubbleList.isEmpty() || (dftTextBubble = textBubbleInfo.getDftTextBubble()) == null) {
            return false;
        }
        String str2 = dftTextBubble.mText;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String fontPath = textBubbleInfo.getFontPath();
        if (TextUtils.isEmpty(fontPath)) {
            fontPath = "";
        }
        dftTextBubble.mFontPath = fontPath;
        SubtitleFontModel subtitleFontModel = null;
        try {
            QBubbleTextSource qBubbleTextSource = new QBubbleTextSource();
            qBubbleTextSource.text = str2;
            qBubbleTextSource.getClass();
            QBubbleTextSource.QTextExtraEffect qTextExtraEffect = new QBubbleTextSource.QTextExtraEffect();
            if (dftTextBubble.mShadowInfo != null) {
                qTextExtraEffect.enableEffect = dftTextBubble.mShadowInfo.isbEnableShadow();
                qTextExtraEffect.shadowBlurRadius = dftTextBubble.mShadowInfo.getmShadowBlurRadius();
                qTextExtraEffect.shadowXShift = dftTextBubble.mShadowInfo.getmShadowXShift();
                qTextExtraEffect.shadowYShift = dftTextBubble.mShadowInfo.getmShadowYShift();
                qTextExtraEffect.shadowColor = dftTextBubble.mShadowInfo.getmShadowColor();
            }
            if (dftTextBubble.mStrokeInfo != null) {
                qTextExtraEffect.strokeWPercent = dftTextBubble.mStrokeInfo.strokeWPersent;
                qTextExtraEffect.strokeColor = dftTextBubble.mStrokeInfo.strokeColor;
            }
            qBubbleTextSource.tee = qTextExtraEffect;
            qBubbleTextSource.textAlignment = dftTextBubble.mTextAlignment;
            qBubbleTextSource.auxiliaryFont = dftTextBubble.mFontPath;
            qBubbleTextSource.nChangeFlag = 271;
            qBubbleMeasureResult = QStyle.measureBubbleSourceByTemplate(str, qSize, qBubbleTextSource);
        } catch (Exception e) {
            e.printStackTrace();
            qBubbleMeasureResult = null;
        }
        if (qBubbleMeasureResult != null) {
            Rect rectByDisplaySize = scaleRotateViewState.mEffectPosInfo.getRectByDisplaySize(veMSize);
            float f = (float) qBubbleMeasureResult.bubbleW;
            float f2 = (float) qBubbleMeasureResult.bubbleH;
            if (!(effectDataModel == null || (subtitleFontModel = effectDataModel.subtitleFontModel) == null || subtitleFontModel.currentSize == 0)) {
                f *= (((float) subtitleFontModel.currentSize) * 1.0f) / ((float) b(effectDataModel));
                f2 *= (((float) subtitleFontModel.currentSize) * 1.0f) / ((float) b(effectDataModel));
            }
            if (z) {
                f /= 2.0f;
                f2 /= 2.0f;
            }
            scaleRotateViewState.mEffectPosInfo.setRectByDisplaySize(c(rectByDisplaySize.centerX(), rectByDisplaySize.centerY(), f, f2), veMSize);
            if (subtitleFontModel != null) {
                subtitleFontModel.initWidth = qBubbleMeasureResult.bubbleW;
                subtitleFontModel.initHeight = qBubbleMeasureResult.bubbleH;
                if (!(effectDataModel == null || effectDataModel.getKitEffectAttribute() == null || effectDataModel.keyFrameRanges == null || effectDataModel.keyFrameRanges.size() <= 0)) {
                    effectDataModel.getKitEffectAttribute().pb(subtitleFontModel.initWidth);
                }
                subtitleFontModel.originSize = b(effectDataModel);
            }
            scaleRotateViewState.mLineNum = qBubbleMeasureResult.textLines;
            return true;
        }
        return false;
    }

    public static boolean a(EffectDataModel effectDataModel) {
        if (effectDataModel == null || effectDataModel.getKitEffectAttribute() == null || effectDataModel.getKitEffectAttribute().avh() == null) {
            return false;
        }
        return effectDataModel.getKitEffectAttribute().avh().isSpeech();
    }

    public static int b(EffectDataModel effectDataModel) {
        return a(effectDataModel) ? 12 : 25;
    }

    public static boolean a(ScaleRotateViewState scaleRotateViewState, String str, VeMSize veMSize) {
        return a(null, scaleRotateViewState, str, veMSize);
    }

    public static boolean b(ScaleRotateViewState scaleRotateViewState, String str, VeMSize veMSize) {
        return a((EffectDataModel) null, scaleRotateViewState, str, veMSize, true);
    }

    public static Bitmap c(ScaleRotateViewState scaleRotateViewState, String str, VeMSize veMSize) {
        if (!(scaleRotateViewState == null || TextUtils.isEmpty(str) || veMSize == null)) {
            QSize qSize = new QSize();
            qSize.mWidth = veMSize.width;
            qSize.mHeight = veMSize.height;
            if (a(scaleRotateViewState, str, veMSize)) {
                QSize qSize2 = new QSize();
                qSize2.mWidth = (int) scaleRotateViewState.mEffectPosInfo.width;
                qSize2.mHeight = (int) scaleRotateViewState.mEffectPosInfo.height;
                QBitmap a2 = a(a(veMSize, qSize, str), a(c.jj(str).longValue(), scaleRotateViewState), qSize, qSize2, qSize2);
                Bitmap createBitmapFromQBitmap = QAndroidBitmapFactory.createBitmapFromQBitmap(a2, false);
                if (a2 == null || a2.isRecycled()) {
                    return createBitmapFromQBitmap;
                }
                a2.recycle();
                return createBitmapFromQBitmap;
            }
        }
        return null;
    }

    private static QBubbleTextSource[] a(long j, ScaleRotateViewState scaleRotateViewState) {
        TextBubbleInfo textBubbleInfo = scaleRotateViewState.mTextBubbleInfo;
        QBubbleTextSource[] qBubbleTextSourceArr = null;
        if (textBubbleInfo == null) {
            return null;
        }
        List<TextBubbleInfo.TextBubble> list = textBubbleInfo.mTextBubbleList;
        if (!(list == null || list.size() == 0)) {
            qBubbleTextSourceArr = new QBubbleTextSource[list.size()];
            for (int i = 0; i < list.size(); i++) {
                TextBubbleInfo.TextBubble textBubble = list.get(i);
                if (textBubble != null) {
                    QBubbleTextSource a2 = a(null, textBubble.mFontPath, 0, textBubble.mText, textBubble.mTextColor, j, scaleRotateViewState.mEffectPosInfo.isHorFlip, scaleRotateViewState.mEffectPosInfo.isVerFlip);
                    a2.paramId = textBubble.mParamID;
                    a2.textAlignment = textBubble.mTextAlignment;
                    a2.getClass();
                    QBubbleTextSource.QTextExtraEffect qTextExtraEffect = new QBubbleTextSource.QTextExtraEffect();
                    if (textBubble.mShadowInfo != null) {
                        qTextExtraEffect.enableEffect = true;
                        if (textBubble.mShadowInfo.isbEnableShadow()) {
                            qTextExtraEffect.shadowBlurRadius = textBubble.mShadowInfo.getmShadowBlurRadius();
                            qTextExtraEffect.shadowColor = textBubble.mShadowInfo.getmShadowColor();
                            qTextExtraEffect.shadowXShift = textBubble.mShadowInfo.getmShadowXShift();
                            qTextExtraEffect.shadowYShift = textBubble.mShadowInfo.getmShadowYShift();
                        } else {
                            qTextExtraEffect.shadowBlurRadius = 0.0f;
                            qTextExtraEffect.shadowColor = 0;
                            qTextExtraEffect.shadowXShift = 0.0f;
                            qTextExtraEffect.shadowYShift = 0.0f;
                        }
                        a2.tee = qTextExtraEffect;
                    }
                    if (textBubble.mStrokeInfo != null) {
                        qTextExtraEffect.enableEffect = true;
                        qTextExtraEffect.strokeColor = textBubble.mStrokeInfo.strokeColor;
                        qTextExtraEffect.strokeWPercent = textBubble.mStrokeInfo.strokeWPersent;
                    }
                    qBubbleTextSourceArr[i] = a2;
                }
            }
        }
        return qBubbleTextSourceArr;
    }

    public static Bitmap d(ScaleRotateViewState scaleRotateViewState, String str, VeMSize veMSize) {
        try {
            return c(scaleRotateViewState, str, veMSize);
        } catch (Exception unused) {
            return null;
        }
    }

    public static QBubbleTextSource a(Rect rect, String str, int i, String str2, int i2, long j, boolean z, boolean z2) {
        QRect qRect = new QRect();
        if (rect != null) {
            qRect.set(rect.left, rect.top, rect.right, rect.bottom);
        }
        QBubbleTextSource qBubbleTextSource = new QBubbleTextSource(0, false, false, (float) i, new QPoint(0, 0), qRect, 0, i2, str2, j, str);
        qBubbleTextSource.horizontalReversal = z;
        qBubbleTextSource.verticalReversal = z2;
        return qBubbleTextSource;
    }

    public static void a(QSize qSize) {
        if (dRU == 0) {
            dRU = QStyle.creatEffectThumbnailEngine(a.auq(), qSize);
            dRT = Thread.currentThread().getId();
        }
    }

    public static int auU() {
        int destroyEffectThumbnailEngine = QStyle.destroyEffectThumbnailEngine(dRU);
        dRU = 0;
        return destroyEffectThumbnailEngine;
    }

    public static QTextMulInfo a(VeMSize veMSize, QSize qSize, String str) {
        QStyle qStyle = new QStyle();
        if (qStyle.create(str, null, QUtils.getLayoutMode(veMSize.width, veMSize.height)) != 0) {
            return null;
        }
        return qStyle.getTextMulInfo(a.auq(), qSize, f.o(com.quvideo.mobile.engine.a.c.getLocale()));
    }

    public static QBitmap a(QTextMulInfo qTextMulInfo, QBubbleTextSource[] qBubbleTextSourceArr, QSize qSize, QSize qSize2, QSize qSize3) {
        if (Thread.currentThread().getId() != dRT && dRU != 0 && auU() != 0) {
            return null;
        }
        a(qSize);
        return QStyle.getTextThumbnail(dRU, qBubbleTextSourceArr, qSize2, qSize3, qTextMulInfo == null ? 0 : qTextMulInfo.mPreviewPos);
    }

    public static RectF c(int i, int i2, float f, float f2) {
        float f3 = (float) i;
        float f4 = f / 2.0f;
        float f5 = (float) i2;
        float f6 = f2 / 2.0f;
        return new RectF(f3 - f4, f5 - f6, f3 + f4, f5 + f6);
    }

    public static boolean jv(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        QStyle qStyle = new QStyle();
        if (qStyle.create(str, "", 0) == 0 && qStyle.getVersion() >= 196608) {
            return true;
        }
        return false;
    }
}