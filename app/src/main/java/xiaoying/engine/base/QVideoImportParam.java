package xiaoying.engine.base;

public class QVideoImportParam {
    private int mCPUNum = 1;
    private boolean mbHDOutput = false;
    private boolean mbHWDec = false;
    private boolean mbHWEnc = false;
    private boolean mbPIP = false;
    private boolean mbPaster = false;
    private boolean mbReverse = false;
    private String mstrFilePath = null;

    public void setFilePath(String str) {
        this.mstrFilePath = str;
    }

    public String getFilePath() {
        return this.mstrFilePath;
    }

    public void setPIPFlag(boolean z) {
        this.mbPIP = z;
    }

    public boolean getPIPFlag() {
        return this.mbPIP;
    }

    public void setHWEncFlag(boolean z) {
        this.mbHWEnc = z;
    }

    public boolean getHWEncFlag() {
        return this.mbHWEnc;
    }

    public void setHWDecFlag(boolean z) {
        this.mbHWDec = z;
    }

    public boolean getHWDecflag() {
        return this.mbHWDec;
    }

    public void setReverseFlag(boolean z) {
        this.mbReverse = z;
    }

    public boolean getreverseFlag() {
        return this.mbReverse;
    }

    public void setHDOutputFlag(boolean z) {
        this.mbHDOutput = z;
    }

    public boolean getHDOutputFlag() {
        return this.mbHDOutput;
    }

    public void setCPUNum(int i) {
        this.mCPUNum = i;
    }

    public int getCPUNum() {
        return this.mCPUNum;
    }

    public void setPasterFlag(boolean z) {
        this.mbPaster = z;
    }

    public boolean getPasterFlag() {
        return this.mbPaster;
    }
}