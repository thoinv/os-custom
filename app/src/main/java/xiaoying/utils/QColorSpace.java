package xiaoying.utils;

public final class QColorSpace {
    public static final int QPAF_GRAY1 = 1627389952;
    public static final int QPAF_GRAY16 = 1694498816;
    public static final int QPAF_GRAY2 = 1644167168;
    public static final int QPAF_GRAY4 = 1660944384;
    public static final int QPAF_GRAY8 = 1677721600;
    public static final int QPAF_I420 = ((PD(2) | 1342179328) | PE(2));
    public static final int QPAF_I422H = ((PD(2) | 1342179328) | PE(1));
    public static final int QPAF_I422V = ((PD(1) | 1342179328) | PE(2));
    public static final int QPAF_I444;
    public static final int QPAF_OTHERS_DCT = 1879048193;
    public static final int QPAF_OTHERS_NV21 = 1879048194;
    public static final int QPAF_OTHERS_TEXTURE = 1879048201;
//    public static final int QPAF_RGB16_B4G4R4 = (QPAF_RGB16_R4G4B4 | 4096);
//    public static final int QPAF_RGB16_B5G5R5 = (QPAF_RGB16_R5G5B5 | 4096);
//    public static final int QPAF_RGB16_B5G6R5 = (QPAF_RGB16_R5G6B5 | 4096);
    public static final int QPAF_RGB16_R4G4B4 = (PC(4) | ((352321536 | PA(4)) | PB(4)));
    public static final int QPAF_RGB16_R5G5B5 = (((PA(5) | 352321536) | PB(5)) | PC(5));
    public static final int QPAF_RGB16_R5G6B5 = (((PA(5) | 352321536) | PB(6)) | PC(5));
    public static final int QPAF_RGB16_TR5G5B5 = (((PA(5) | 620756992) | PB(5)) | PC(5));
//    public static final int QPAF_RGB24_B6G6R6 = (QPAF_RGB24_R6G6B6 | 4096);
//    public static final int QPAF_RGB24_B8G8R8 = (QPAF_RGB24_R8G8B8 | 4096);
    public static final int QPAF_RGB24_R6G6B6 = (((PA(6) | 369098752) | PB(6)) | PC(6));
    public static final int QPAF_RGB24_R8G8B8 = (((PA(8) | 369098752) | PB(8)) | PC(8));
    public static final int QPAF_RGB24_TR6G6B6 = (PC(5) | ((PA(5) | 637534208) | PB(5)));
    public static final int QPAF_RGB32_A8R8G8B8;
//    public static final int QPAF_RGB32_B8G8R8 = (QPAF_RGB32_R8G8B8 | 4096);
    public static final int QPAF_RGB32_B8G8R8A8;
    public static final int QPAF_RGB32_R8G8B8 = (((PA(8) | 385875968) | PB(8)) | PC(8));
    public static final int QPAF_UVY;
    public static final int QPAF_UYVY;
    public static final int QPAF_UYVY2;
    public static final int QPAF_VUY;
    public static final int QPAF_VYUY;
    public static final int QPAF_VYUY2;
    public static final int QPAF_YUV;
    public static final int QPAF_YUYV;
    public static final int QPAF_YUYV2;
    public static final int QPAF_YV12 = (QPAF_I420 | 512);
    public static final int QPAF_YV16H = (QPAF_I422H | 512);
    public static final int QPAF_YV16V = (QPAF_I422V | 512);
    public static final int QPAF_YV24;
    public static final int QPAF_YVU;
    public static final int QPAF_YVYU;
    public static final int QPAF_YVYU2;

    public static final int MRGB(int i, int i2, int i3) {
        return (i & 255) | ((i2 & 255) << 8) | ((i3 & 255) << 16);
    }

    public static final int MRGBA(int i, int i2, int i3, int i4) {
        return (i & 255) | ((i2 & 255) << 8) | ((i3 & 255) << 16) | ((i4 & 255) << 24);
    }

    public static final int MRGBA_A(int i) {
        return (i >> 24) & 255;
    }

    public static final int MRGB_B(int i) {
        return (i >> 16) & 255;
    }

    public static final int MRGB_G(int i) {
        return (i >> 8) & 255;
    }

    public static final int MRGB_R(int i) {
        return i & 255;
    }

    public static final int MakeARGB(int i, int i2, int i3, int i4) {
        return ((i & 255) << 24) | ((i2 & 255) << 16) | ((i3 & 255) << 8) | (i4 & 255);
    }

    public static final int MakeRGB(int i, int i2, int i3) {
        return ((i & 255) << 16) | ((i2 & 255) << 8) | (i3 & 255);
    }

    static final int PA(int i) {
        return (i - 1) << 8;
    }

    static final int PB(int i) {
        return (i - 1) << 4;
    }

    static final int PC(int i) {
        return (i - 1) << 0;
    }

    static final int PD(int i) {
        return (i - 1) << 4;
    }

    static final int PE(int i) {
        return (i - 1) << 0;
    }

    static {
        int PA = PA(8) | 922746880 | PB(8) | PC(8);
        QPAF_RGB32_A8R8G8B8 = PA;
        QPAF_RGB32_B8G8R8A8 = PA | 4096;
        int PD = PD(1) | 1342177280 | PE(1);
        QPAF_YUV = PD;
        QPAF_YVU = PD | 512;
        QPAF_UVY = PD | 1024;
        QPAF_VUY = PD | 512 | 1024;
        int PD2 = 1342177280 | PD(2) | PE(1);
        QPAF_YUYV = PD2;
        int i = PD2 | 512;
        QPAF_YVYU = i;
        int i2 = PD2 | 1024;
        QPAF_UYVY = i2;
        int i3 = PD2 | 512 | 1024;
        QPAF_VYUY = i3;
        QPAF_YUYV2 = PD2 | 256;
        QPAF_YVYU2 = i | 256;
        QPAF_UYVY2 = i2 | 256;
        QPAF_VYUY2 = i3 | 256;
        int PE = PE(1) | PD(1) | 1342179328;
        QPAF_I444 = PE;
        QPAF_YV24 = PE | 512;
    }
}