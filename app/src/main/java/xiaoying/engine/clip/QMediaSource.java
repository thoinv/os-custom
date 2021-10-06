package xiaoying.engine.clip;

public class QMediaSource {
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_BUBBLETEXT = 2;
    public static final int TYPE_FACE_MORPHING = 16;
    public static final int TYPE_FILE = 0;
    public static final int TYPE_PKG_FILE = 3;
    public static final int TYPE_TRC_LYRICS = 4;
    private boolean isTempSource = false;
    private Object source = null;
    private int type = 0;

    public QMediaSource(int i, boolean z, Object obj) {
        this.type = i;
        this.isTempSource = z;
        this.source = obj;
    }

    public int getSourceType() {
        return this.type;
    }

    public boolean isTempSource() {
        return this.isTempSource;
    }

    public Object getSource() {
        return this.source;
    }

    public QMediaSource() {
    }
}