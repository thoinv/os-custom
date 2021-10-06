package xiaoying.engine.base;

public class QSessionState {
    public int aPrcErr = 0;
    public int currentTime = 0;
    public int duration = 0;
    public int errorCode = 0;
    public int mFps = 0;
    public int mIntervalTime = 0;
    public int mLastDrawnVFTS = 0;
    public int mLastDrawnVFTSP = 0;
    public int openglErr = 0;
    public int orignalSeekTime = 0;
    public QSession session = null;
    public int status = 0;
    public String strUserData = null;
    public int substreamErr = 0;
    public int vDecErr = 0;
    public int vPrcErr = 0;

    private QSessionState() {
    }

    public int getStatus() {
        return this.status;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getSubstreamError() {
        return this.substreamErr;
    }

    public QSession getSession() {
        return this.session;
    }

    public int getLastDrawnVFTS() {
        return this.mLastDrawnVFTS;
    }
}