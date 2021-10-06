package xiaoying.engine.base;

import xiaoying.utils.QPoint;
import xiaoying.utils.QRect;

public class QBubbleTextSource {
    public String auxiliaryFont = null;
    public boolean bBold = false;
    public boolean bItalic = false;
    public int backgroundColor = 0;
    public long bubbleTemplateID = 0;
    public boolean horizontalReversal = false;
    public int nChangeFlag = 0;
    public int paramId = 0;
    public QRect regionRatio = null;
    public float rotateAngle = 0.0f;
    public QPoint rotateCenter = null;
    public QTextExtraEffect tee = null;
    public String text = null;
    public int textAlignment = 0;
    public int textColor = -1;
    public int transparency = 0;
    public boolean verticalReversal = false;

    public static class QTextExtraEffect {
        public boolean enableEffect = false;
        public float fLineSpace = 0.0f;
        public float fWordSpace = 0.0f;
        public float shadowBlurRadius = 0.0f;
        public int shadowColor = 0;
        public float shadowXShift = 0.0f;
        public float shadowYShift = 0.0f;
        public int strokeColor = 0;
        public float strokeWPercent = 0.0f;

        public QTextExtraEffect() {
        }
    }

    public QBubbleTextSource(QBubbleTextSource qBubbleTextSource) {
        this.backgroundColor = qBubbleTextSource.backgroundColor;
        this.verticalReversal = qBubbleTextSource.verticalReversal;
        this.horizontalReversal = qBubbleTextSource.horizontalReversal;
        this.rotateAngle = qBubbleTextSource.rotateAngle;
        this.rotateCenter = qBubbleTextSource.rotateCenter;
        this.regionRatio = qBubbleTextSource.regionRatio;
        this.transparency = qBubbleTextSource.transparency;
        this.textColor = qBubbleTextSource.textColor;
        this.text = qBubbleTextSource.text;
        this.textAlignment = qBubbleTextSource.textAlignment;
        this.bubbleTemplateID = qBubbleTextSource.bubbleTemplateID;
        this.auxiliaryFont = qBubbleTextSource.auxiliaryFont;
        this.bBold = qBubbleTextSource.bBold;
        this.bItalic = qBubbleTextSource.bItalic;
        this.nChangeFlag = qBubbleTextSource.nChangeFlag;
        if (qBubbleTextSource.tee != null) {
            QTextExtraEffect qTextExtraEffect = new QTextExtraEffect();
            this.tee = qTextExtraEffect;
            qTextExtraEffect.enableEffect = qBubbleTextSource.tee.enableEffect;
            this.tee.shadowBlurRadius = qBubbleTextSource.tee.shadowBlurRadius;
            this.tee.shadowColor = qBubbleTextSource.tee.shadowColor;
            this.tee.shadowXShift = qBubbleTextSource.tee.shadowXShift;
            this.tee.shadowYShift = qBubbleTextSource.tee.shadowYShift;
            this.tee.strokeColor = qBubbleTextSource.tee.strokeColor;
            this.tee.strokeWPercent = qBubbleTextSource.tee.strokeWPercent;
            this.tee.fWordSpace = qBubbleTextSource.tee.fWordSpace;
            this.tee.fLineSpace = qBubbleTextSource.tee.fLineSpace;
        }
    }

    public QBubbleTextSource(int i, boolean z, boolean z2, float f, QPoint qPoint, QRect qRect, int i2, int i3, String str, long j, String str2) {
        this.backgroundColor = i;
        this.verticalReversal = z;
        this.horizontalReversal = z2;
        this.rotateAngle = f;
        this.rotateCenter = qPoint;
        this.regionRatio = qRect;
        this.transparency = i2;
        this.textColor = i3;
        this.text = str;
        this.bubbleTemplateID = j;
        this.auxiliaryFont = str2;
        this.tee = new QTextExtraEffect();
    }

    public String getText() {
        return this.text;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public boolean getVerticalReversal() {
        return this.verticalReversal;
    }

    public boolean getHorizontalReversal() {
        return this.horizontalReversal;
    }

    public float getRotateAngle() {
        return this.rotateAngle;
    }

    public QPoint getRotateCenter() {
        return this.rotateCenter;
    }

    public QRect getRegionRatio() {
        return this.regionRatio;
    }

    public int getTransparency() {
        return this.transparency;
    }

    public long getBubbleTemplateID() {
        return this.bubbleTemplateID;
    }

    public QBubbleTextSource() {
    }
}