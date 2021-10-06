package xiaoying.basedef;

public class QPointFloat {
    public float x;
    public float y;

    public QPointFloat() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public QPointFloat(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public QPointFloat(QPointFloat qPointFloat) {
        this.x = qPointFloat.x;
        this.y = qPointFloat.y;
    }
}