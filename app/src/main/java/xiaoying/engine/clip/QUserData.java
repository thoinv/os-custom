package xiaoying.engine.clip;

public class QUserData {
    public byte[] data = null;
    public int dataLen = 0;

    public QUserData(int i) {
        this.dataLen = i;
        this.data = new byte[i];
    }

    public byte[] getUserData() {
        return this.data;
    }

    public int getUserDataLength() {
        return this.dataLen;
    }

    public QUserData() {
    }

    public void setUserData(byte[] bArr) {
        this.data = bArr;
        if (bArr != null) {
            this.dataLen = bArr.length;
        } else {
            this.dataLen = 0;
        }
    }
}