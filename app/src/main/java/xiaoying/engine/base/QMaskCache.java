package xiaoying.engine.base;

public class QMaskCache {
    public static final int PROCESS_STATUS_NONE = 0;
    public static final int PROCESS_STATUS_RUNNING = 2;
    public static final int PROCESS_STATUS_STOPPED = 4;
    private long nativeHandle = 0;
    public int processStatus = 0;
    public int processTime = 0;
    public QRange range = new QRange();
}