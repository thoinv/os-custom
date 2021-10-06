package xiaoying.utils;

public final class QPoint {
    public int x;
    public int y;

    public QPoint() {
        this.x = 0;
        this.y = 0;
    }

    public QPoint(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public QPoint(QPoint qPoint) {
        this.x = qPoint.x;
        this.y = qPoint.y;
    }

    public void set(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public void negate() {
        this.x = -this.x;
        this.y = -this.y;
    }

    public void offset(int i, int i2) {
        this.x += i;
        this.y += i2;
    }

    public boolean equals(int i, int i2) {
        return this.x == i && this.y == i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof QPoint)) {
            return false;
        }
        QPoint qPoint = (QPoint) obj;
        if (this.x == qPoint.x && this.y == qPoint.y) {
            return true;
        }
        return false;
    }
}