package xiaoying.utils;

public final class QRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public QRect() {
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
    }

    public QRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public QRect(QRect qRect) {
        this.left = qRect.left;
        this.top = qRect.top;
        this.right = qRect.right;
        this.bottom = qRect.bottom;
    }

    public void set(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public void negate() {
        this.left = -this.left;
        this.top = -this.top;
        this.right = -this.right;
        this.bottom = -this.bottom;
    }

    public void offset(int i, int i2) {
        this.left += i;
        this.right += i;
        this.top += i2;
        this.bottom += i2;
    }

    public boolean equals(int i, int i2, int i3, int i4) {
        return this.left == i && this.top == i2 && this.right == i3 && this.bottom == i4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof QRect)) {
            return false;
        }
        QRect qRect = (QRect) obj;
        if (this.left == qRect.left && this.top == qRect.top && this.right == qRect.right && this.bottom == qRect.bottom) {
            return true;
        }
        return false;
    }
}