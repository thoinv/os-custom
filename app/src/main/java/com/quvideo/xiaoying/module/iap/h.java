package com.quvideo.xiaoying.module.iap;

public enum h {
    VIP_UNKNOWN(-1),
    VIP_ALL(0),
    VIP_THEME(1),
    VIP_FILTER(2),
    VIP_STICKER(3),
    VIP_MAGIC_SOUND(4),
    VIP_BACKGROUND(5),
    VIP_ANIM_SUBTITLE(6),
    VIP_NORMAL_SUBTITLE(7),
    VIP_MOSAIC(8),
    VIP_MUSIC_EXTRACT(9),
    VIP_DURATION_LIMIT(10),
    VIP_KEY_FRAME(11),
    VIP_VIDEO_PARAM(12),
    VIP_CUSTOMIZE_WM(13),
    VIP_720HD(14),
    VIP_1080HD(15),
    VIP_2K(16),
    VIP_4K(17),
    VIP_FX(18),
    VIP_TRANSITION(19),
    VIP_FONT(20),
    VIP_WATERMARK(21),
    VIP_RECORD_MAGIC_SOUND(22),
    VIP_TEXT_ANIM(23);
    
    public int code;

    private h(int i) {
        this.code = i;
    }

    public static h HB(int i) {
        switch (i) {
            case 0:
                return VIP_ALL;
            case 1:
                return VIP_THEME;
            case 2:
                return VIP_FILTER;
            case 3:
                return VIP_STICKER;
            case 4:
                return VIP_MAGIC_SOUND;
            case 5:
                return VIP_BACKGROUND;
            case 6:
                return VIP_ANIM_SUBTITLE;
            case 7:
                return VIP_NORMAL_SUBTITLE;
            case 8:
                return VIP_MOSAIC;
            case 9:
                return VIP_MUSIC_EXTRACT;
            case 10:
                return VIP_DURATION_LIMIT;
            case 11:
                return VIP_KEY_FRAME;
            case 12:
                return VIP_VIDEO_PARAM;
            case 13:
                return VIP_CUSTOMIZE_WM;
            case 14:
                return VIP_720HD;
            case 15:
                return VIP_1080HD;
            case 16:
                return VIP_2K;
            case 17:
                return VIP_4K;
            case 18:
                return VIP_FX;
            case 19:
                return VIP_TRANSITION;
            case 20:
                return VIP_FONT;
            case 21:
                return VIP_WATERMARK;
            case 22:
                return VIP_RECORD_MAGIC_SOUND;
            case 23:
                return VIP_TEXT_ANIM;
            default:
                return VIP_UNKNOWN;
        }
    }
}