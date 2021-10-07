package com.quvideo.xiaoying.router.editor.studio;

public enum BoardType {
    UNKNOWN(false, false, false),
    THEME(true, true, false),
    THEME_SUBTITLE(false, false, false),
    AUDIO(true, true, false),
    AUDIO_TRIM(false, false, true),
    AUDIO_ORIGINAL_CHANGE_VOICE(false, false, true),
    AUDIO_RECORD_CHANGE_VOICE(false, false, true),
    AUDIO_MAGIC_SPEED(false, false, false),
    AUDIO_RECORD(false, false, false),
    CLIP(true, true, false),
    CLIP_END(false, false, false),
    CLIP_RATIO(false, false, false),
    CLIP_BG(false, false, false),
    CLIP_PIC_TRIM_MODE(false, false, false),
    CLIP_SPEED_MODE(false, false, false),
    CLIP_VIDEO_TRIM_MODE(false, false, false),
    CLIP_WATERMARK_MODE(false, false, true),
    CLIP_ORDER_MODE(false, false, false),
    CLIP_CROSS(false, false, true),
    CLIP_COVER_SELECT(false, false, true),
    CLIP_FULL_SCREEN_PLAYER(false, false, false),
    EFFECT(true, true, false),
    EFFECT_STICKER(false, false, false),
    EFFECT_SUBTITLE(false, false, false),
    EFFECT_FX(false, false, false),
    EFFECT_COLLAGE(false, false, false),
    EFFECT_MOSAIC(false, false, true),
    EFFECT_STYLE_EDIT(false, false, false),
    EFFECT_COLLAGE_IMAGE_CUT(false, false, false),
    EFFECT_PIP_MIX(false, false, true),
    FILTER(true, true, false),
    KIT(false, true, false),
    KIT_TRIM(false, false, false),
    ADVANCE_PIP(false, false, false),
    ADVANCE_PIP_TRIM(false, false, false),
    FB_NONE(false, false, false),
    FB_MAIN(true, false, false),
    FB_SPEED(false, false, false),
    FB_TRIM(false, false, false),
    FB_FILTER(false, false, false),
    FB_CANVAS(false, false, false),
    FB_DURATION(false, false, false),
    FB_TRANSITION(false, false, false);
    
    private boolean hasAnim;
    private boolean isPermanent;
    private boolean isReuse;

    private BoardType(boolean z, boolean z2, boolean z3) {
        this.isPermanent = z;
        this.isReuse = z2;
        this.hasAnim = z3;
    }

    public boolean isPermanent() {
        return this.isPermanent;
    }

    public boolean isReuse() {
        return this.isReuse;
    }

    public boolean isHasAnim() {
        return this.hasAnim;
    }
}