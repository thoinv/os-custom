package com.quvideo.xiaoying.editorx.board.d;

import android.graphics.PointF;
import android.util.Log;
import com.quvideo.mobile.engine.model.PIPRegionControlModel;
import com.quvideo.mobile.engine.model.effect.EffectPosInfo;
import java.util.List;

public interface a {

    /* renamed from: com.quvideo.xiaoying.editorx.board.d.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0470a {
        public void a(EffectPosInfo effectPosInfo) {
        }

        public void ao(float f, float f2) {
        }

        public void b(EffectPosInfo effectPosInfo) {
        }
    }

    public interface b {
        int bRL();

        int getCurProgress();

        int getLeftWall();

        int getRightWall();

        void w(int i, int i2, boolean z);
    }

    public static abstract class c {
        public void bVz() {
        }
    }

    public static abstract class d {
        public void a(EffectPosInfo effectPosInfo) {
        }

        public void a(EffectPosInfo effectPosInfo, boolean z, boolean z2) {
        }

        public float b(EffectPosInfo effectPosInfo, float f, float f2) {
            return f;
        }

        public void b(EffectPosInfo effectPosInfo) {
        }

        public void b(EffectPosInfo effectPosInfo, boolean z, boolean z2) {
        }

        public void bVz() {
        }

        public void c(EffectPosInfo effectPosInfo) {
        }

        public void c(EffectPosInfo effectPosInfo, boolean z, boolean z2) {
        }

        public void d(EffectPosInfo effectPosInfo, boolean z, boolean z2) {
        }

        public void j(EffectPosInfo effectPosInfo) {
        }
    }

    public enum f {
        CLIP,
        DELETE_FLIP_SCALE,
        DELETE_FLIP_SCALE_PIP,
        DELETE_SCALE,
        MOSAIC,
        WATER,
        WATER_SYSTEM,
        SELECT_NO_ACTION,
        iwX,
        FINE_TUNE,
        FINE_TUNE_OUT,
        KIT,
        COLOR_TRAP,
        PIP,
        PIP_EDIT,
        FB_BG,
        NULL
    }

    PointF a(EffectPosInfo effectPosInfo, float f2, float f3);

    void bTD();

    void dd(String str, String str2);

    void dismissTip();

    boolean e(EffectPosInfo effectPosInfo);

    void setActionListener(d dVar);

    void setClipTarget(EffectPosInfo effectPosInfo, int i, int i2);

    void setColorTripColor(int i);

    void setColorTripListener(AbstractC0470a aVar);

    void setColorTripLocation(float f2, float f3);

    void setDefaultWaterTarget(EffectPosInfo effectPosInfo);

    void setFineTuneOutListener(b bVar);

    void setKitListener(c cVar);

    void setLocationListener(e eVar);

    void setMode(f fVar);

    void setPipListener(g gVar);

    void setPipSelectedIndex(int i);

    void setPipTarget(List<PIPRegionControlModel> list);

    void setTarget(EffectPosInfo effectPosInfo);

    void setTarget(EffectPosInfo effectPosInfo, boolean z);

    void setWaterListener(h hVar);

    public static abstract class h {
        public boolean bPT() {
            return false;
        }

        public void onClick() {
            Log.e("ifakelayer", "onClick: ");
        }

        public void bPS() {
            Log.e("ifakelayer", "onClickDelete: ");
        }
    }

    public static abstract class e {
        public void an(float f, float f2) {
            Log.e("ifakelayer", "onClickLocation() called with: x = [" + f + "], y = [" + f2 + "]");
        }
    }

    public static abstract class g {
        public void a(int i, PIPRegionControlModel pIPRegionControlModel, boolean z) {
        }

        public void b(int i, PIPRegionControlModel pIPRegionControlModel) {
        }

        public void a(int i, PIPRegionControlModel pIPRegionControlModel) {
            Log.e("fuck", "onClick: " + i);
        }
    }
}