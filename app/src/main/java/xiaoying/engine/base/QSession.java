package xiaoying.engine.base;

import xiaoying.engine.QEngine;

public abstract class QSession {
    public static final int STATUS_INITIALIZING = 5;
    public static final int STATUS_NONE = 0;
    public static final int STATUS_PAUSED = 3;
    public static final int STATUS_READY = 1;
    public static final int STATUS_RUNNING = 2;
    public static final int STATUS_STOPPED = 4;
    protected QEngine engine = null;
    protected long handle = 0;
    private long jniglobalobjectref = 0;
    protected IQSessionStateListener listener = null;
    private QSessionState state = null;

    private native Object nativeGetProp(long j, int i);

    private native Object nativeGetState(long j);

    private native int nativeSetProp(long j, int i, Object obj);

    public abstract int unInit();

    private int onSessionStatus(QSessionState qSessionState) {
        IQSessionStateListener iQSessionStateListener = this.listener;
        if (iQSessionStateListener == null) {
            return 0;
        }
        return iQSessionStateListener.onSessionStatus(qSessionState);
    }

    /* access modifiers changed from: package-private */
    public void setSessionStateListener(IQSessionStateListener iQSessionStateListener) {
        this.listener = iQSessionStateListener;
    }

    public int init(QEngine qEngine, IQSessionStateListener iQSessionStateListener) {
        this.engine = qEngine;
        this.listener = iQSessionStateListener;
        return 0;
    }

    public int setProperty(int i, Object obj) {
        return nativeSetProp(this.handle, i, obj);
    }

    public Object getProperty(int i) {
        return nativeGetProp(this.handle, i);
    }

    public Object getState() {
        return nativeGetState(this.handle);
    }
}