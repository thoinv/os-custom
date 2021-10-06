package xiaoying.engine.base;

public class QVideoInfo {
    public static final int AUDIOFORMAT_AACLC = 4;
    public static final int AUDIOFORMAT_AMRNB = 2;
    public static final int AUDIOFORMAT_AMRWB = 7;
    public static final int AUDIOFORMAT_AUTO = 1;
    public static final int AUDIOFORMAT_EVRC = 5;
    public static final int AUDIOFORMAT_MP3 = 6;
    public static final int AUDIOFORMAT_NONE = 0;
    public static final int AUDIOFORMAT_PCM = 14;
    public static final int AUDIOFORMAT_QCELP = 3;
    public static final int AUDIOFORMAT_UNKNOWN = 1;
    public static final int AUDIOFORMAT_WAV = 15;
    public static final int AUDIOFORMAT_WMA_9LOS = 11;
    public static final int AUDIOFORMAT_WMA_9PRO = 10;
    public static final int AUDIOFORMAT_WMA_V1 = 8;
    public static final int AUDIOFORMAT_WMA_V2 = 9;
    public static final int AUDIO_BITS_PER_SAMPLE = 14;
    public static final int AUDIO_BIT_RATE = 13;
    public static final int AUDIO_BLOCK_ALIGN = 15;
    public static final int AUDIO_CHANNEL = 12;
    public static final int AUDIO_DURATION = 6;
    public static final int AUDIO_FORMAT = 2;
    public static final int AUDIO_SAMPLE_RATE = 11;
    public static final int BIT_RATE = 8;
    public static final int FILEFORMAT_3G2 = 3;
    public static final int FILEFORMAT_3GP = 2;
    public static final int FILEFORMAT_AAC = 6;
    public static final int FILEFORMAT_AMR = 5;
    public static final int FILEFORMAT_ASF = 12;
    public static final int FILEFORMAT_AVI = 9;
    public static final int FILEFORMAT_GIF = 18;
    public static final int FILEFORMAT_K3G = 13;
    public static final int FILEFORMAT_M4A = 4;
    public static final int FILEFORMAT_MP3 = 14;
    public static final int FILEFORMAT_MP4 = 1;
    public static final int FILEFORMAT_QCP = 7;
    public static final int FILEFORMAT_RAWVIDEO = 17;
    public static final int FILEFORMAT_SKM = 8;
    public static final int FILEFORMAT_UNKNOWN = 0;
    public static final int FILEFORMAT_WMA = 10;
    public static final int FILEFORMAT_WMV = 11;
    public static final int FILE_FORMAT = 0;
    public static final int FILE_SIZE = 7;
    public static final int FRAME_HEIGHT = 4;
    public static final int FRAME_WIDTH = 3;
    public static final int H264_ENC_LEVEL_30 = 30;
    public static final int H264_ENC_LEVEL_31 = 31;
    public static final int H264_ENC_LEVEL_40 = 40;
    public static final int H264_ENC_LEVEL_41 = 41;
    public static final int H264_ENC_LEVEL_UNKNOW = 0;
    public static final int H264_ENC_PROFILE_BASELINE = 1;
    public static final int H264_ENC_PROFILE_HIGH = 3;
    public static final int H264_ENC_PROFILE_MAIN = 2;
    public static final int H264_ENC_PROFILE_UNKNOW = 0;
    public static final int HEVC_ENC_LEVEL_AUTO = 1;
    public static final int HEVC_ENC_PROFILE_MAIN = 16;
    public static final int HEVC_ENC_PROFILE_MAIN10 = 17;
    public static final int VIDEOFORMAT_AUTO = 1;
    public static final int VIDEOFORMAT_DX50 = 5;
    public static final int VIDEOFORMAT_GIF = 10;
    public static final int VIDEOFORMAT_H263 = 3;
    public static final int VIDEOFORMAT_H264 = 4;
    public static final int VIDEOFORMAT_H265 = 12;
    public static final int VIDEOFORMAT_MPEG4 = 2;
    public static final int VIDEOFORMAT_NONE = 0;
    public static final int VIDEOFORMAT_UNKNOWN = 1;
    public static final int VIDEOFORMAT_WMV = 6;
    public static final int VIDEOFORMAT_XVID = 7;
    public static final int VIDEO_BIT_RATE = 10;
    public static final int VIDEO_DURATION = 5;
    public static final int VIDEO_FORMAT = 1;
    public static final int VIDEO_FRAME_RATE = 9;
    private int audioBitrate = 0;
    private int audioBitsPerSample = 0;
    private int audioBlockAlign = 0;
    private int audioChannel = 0;
    private int audioDuration = 0;
    private int audioFormat = 0;
    private int audioSampleRate = 0;
    private int bitrate = 0;
    private int fileFormat = 0;
    private int fileSize = 0;
    private int frameHeight = 0;
    private int frameWidth = 0;
    private int videoBitrate = 0;
    private int videoDuration = 0;
    private int videoFormat = 0;
    private int videoFrameRate = 0;

    public QVideoInfo() {
    }

    public QVideoInfo(QVideoInfo qVideoInfo) {
        this.fileFormat = qVideoInfo.fileFormat;
        this.videoFormat = qVideoInfo.videoFormat;
        this.audioFormat = qVideoInfo.audioFormat;
        this.frameWidth = qVideoInfo.frameWidth;
        this.frameHeight = qVideoInfo.frameHeight;
        this.videoDuration = qVideoInfo.videoDuration;
        this.audioDuration = qVideoInfo.audioDuration;
        this.fileSize = qVideoInfo.fileSize;
        this.bitrate = qVideoInfo.bitrate;
        this.videoFrameRate = qVideoInfo.videoFrameRate;
        this.videoBitrate = qVideoInfo.videoBitrate;
        this.audioSampleRate = qVideoInfo.audioSampleRate;
        this.audioChannel = qVideoInfo.audioChannel;
        this.audioBitrate = qVideoInfo.audioBitrate;
        this.audioBitsPerSample = qVideoInfo.audioBitsPerSample;
        this.audioBlockAlign = qVideoInfo.audioBlockAlign;
    }

    public QVideoInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.fileFormat = i;
        this.videoFormat = i2;
        this.audioFormat = i3;
        this.frameWidth = i4;
        this.frameHeight = i5;
        this.videoDuration = i6;
        this.audioDuration = i7;
        this.fileSize = i8;
        this.bitrate = i9;
        this.videoFrameRate = i10;
        this.videoBitrate = i11;
        this.audioSampleRate = i12;
        this.audioChannel = i13;
        this.audioBitrate = i14;
        this.audioBitsPerSample = i15;
        this.audioBlockAlign = i16;
    }

    public int get(int i) {
        switch (i) {
            case 0:
                return this.fileFormat;
            case 1:
                return this.videoFormat;
            case 2:
                return this.audioFormat;
            case 3:
                return this.frameWidth;
            case 4:
                return this.frameHeight;
            case 5:
                return this.videoDuration;
            case 6:
                return this.audioDuration;
            case 7:
                return this.fileSize;
            case 8:
                return this.bitrate;
            case 9:
                return this.videoFrameRate;
            case 10:
                return this.videoBitrate;
            case 11:
                return this.audioSampleRate;
            case 12:
                return this.audioChannel;
            case 13:
                return this.audioBitrate;
            case 14:
                return this.audioBitsPerSample;
            case 15:
                return this.audioBlockAlign;
            default:
                return 0;
        }
    }

    public void set(int i, int i2) {
        switch (i) {
            case 0:
                this.fileFormat = i2;
                return;
            case 1:
                this.videoFormat = i2;
                return;
            case 2:
                this.audioFormat = i2;
                return;
            case 3:
                this.frameWidth = i2;
                return;
            case 4:
                this.frameHeight = i2;
                return;
            case 5:
                this.videoDuration = i2;
                return;
            case 6:
                this.audioDuration = i2;
                return;
            case 7:
                this.fileSize = i2;
                return;
            case 8:
                this.bitrate = i2;
                return;
            case 9:
                this.videoFrameRate = i2;
                return;
            case 10:
                this.videoBitrate = i2;
                return;
            case 11:
                this.audioSampleRate = i2;
                return;
            case 12:
                this.audioChannel = i2;
                return;
            case 13:
                this.audioBitrate = i2;
                return;
            case 14:
                this.audioBitsPerSample = i2;
                return;
            case 15:
                this.audioBlockAlign = i2;
                return;
            default:
                return;
        }
    }
}