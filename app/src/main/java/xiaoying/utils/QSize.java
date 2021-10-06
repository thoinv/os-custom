package xiaoying.utils;

public class QSize {
    public int mHeight;
    public int mWidth;

    public QSize() {
        this.mWidth = 0;
        this.mHeight = 0;
    }

    public QSize(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    public void copy(QSize qSize) {
        this.mWidth = qSize.mWidth;
        this.mHeight = qSize.mHeight;
    }
}