package xiaoying.utils;

public final class QStream {
    private static final int INVALID_HMSTREAM = 0;
    public static final int STREAM_APPEND = 3;
    public static final int STREAM_ASYNC_WRITE = 7;
    public static final int STREAM_A_PLUS = 6;
    public static final int STREAM_BEGIN = 0;
    public static final int STREAM_CONSUME_NORMAL = 1;
    public static final int STREAM_CONSUME_PREVIEW = 2;
    public static final int STREAM_CUR = 2;
    public static final int STREAM_DRM_READ = 257;
    public static final int STREAM_END = 1;
    public static final int STREAM_READ = 1;
    public static final int STREAM_R_PLUS = 4;
    public static final int STREAM_WRITE = 2;
    public static final int STREAM_W_PLUS = 5;
    protected long mNativeStream;

    private native boolean native_StreamClose(long j);

    private native long native_StreamCreate(String str);

    private static native boolean native_StreamFileCopy(String str, String str2, boolean z);

    private static native boolean native_StreamFileDelete(String str);

    private static native boolean native_StreamFileExists(String str);

    private static native int native_StreamFileGetSize(String str);

    private static native boolean native_StreamFileMove(String str, String str2);

    private static native boolean native_StreamFileRename(String str, String str2);

    private native boolean native_StreamFlush(long j);

    private native int native_StreamGetSize(long j);

    private native long native_StreamOpen(String str, int i);

    private native long native_StreamOpenFromMemoryBlock(byte[] bArr, int i);

    private native int native_StreamRead(long j, byte[] bArr, int i);

    private native int native_StreamSeek(long j, int i, int i2);

    private native int native_StreamSetSize(long j, int i);

    private native int native_StreamTell(long j);

    private native int native_StreamWrite(long j, byte[] bArr, int i);

    public QStream() {
        this.mNativeStream = 0;
        this.mNativeStream = 0;
    }

    public long getNativeHandle() {
        return this.mNativeStream;
    }

    public boolean isValidStream() {
        return this.mNativeStream != 0;
    }

    public boolean open(String str, int i) {
        long native_StreamOpen = native_StreamOpen(str, i);
        this.mNativeStream = native_StreamOpen;
        return native_StreamOpen != 0;
    }

    public boolean open(byte[] bArr) {
        long native_StreamOpenFromMemoryBlock = native_StreamOpenFromMemoryBlock(bArr, bArr.length);
        this.mNativeStream = native_StreamOpenFromMemoryBlock;
        return native_StreamOpenFromMemoryBlock != 0;
    }

    public boolean close() {
        return native_StreamClose(this.mNativeStream);
    }

    public int getSize() {
        return native_StreamGetSize(this.mNativeStream);
    }

    public int setSize(int i) {
        return native_StreamSetSize(this.mNativeStream, i);
    }

    public int read(byte[] bArr, int i) {
        return native_StreamRead(this.mNativeStream, bArr, i);
    }

    public int write(byte[] bArr, int i) {
        return native_StreamWrite(this.mNativeStream, bArr, i);
    }

    public boolean flush() {
        return native_StreamFlush(this.mNativeStream);
    }

    public int seek(int i, int i2) {
        return native_StreamSeek(this.mNativeStream, i, i2);
    }

    public int tell() {
        return native_StreamTell(this.mNativeStream);
    }

    public static boolean fileDelete(String str) {
        return native_StreamFileDelete(str);
    }

    public static boolean fileRename(String str, String str2) {
        return native_StreamFileRename(str, str2);
    }

    public static boolean fileCopy(String str, String str2, boolean z) {
        return native_StreamFileCopy(str, str2, z);
    }

    public static boolean fileExists(String str) {
        return native_StreamFileExists(str);
    }

    public static int fileGetSize(String str) {
        return native_StreamFileGetSize(str);
    }

    public static boolean fileMove(String str, String str2) {
        return native_StreamFileMove(str, str2);
    }

    public long getStreamHandle() {
        return this.mNativeStream;
    }
}