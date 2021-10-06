package xiaoying.engine.base;

public class QRange {
    public static final int LENGTH = 1;
    public static final int START = 0;
    private int length = 0;
    private int start = 0;

    public QRange() {
    }

    public QRange(int i, int i2) {
        this.start = i;
        this.length = i2;
    }

    public QRange(QRange qRange) {
        this.start = qRange.start;
        this.length = qRange.length;
    }

    public int get(int i) {
        if (i == 0) {
            return this.start;
        }
        if (i != 1) {
            return -1;
        }
        return this.length;
    }

    public void set(int i, int i2) {
        if (i == 0) {
            this.start = i2;
        } else if (i == 1) {
            this.length = i2;
        }
    }

    public boolean equals(QRange qRange) {
        return this.start == qRange.start && this.length == qRange.length;
    }

    public boolean equals(int i, int i2) {
        return this.start == i && this.length == i2;
    }
}