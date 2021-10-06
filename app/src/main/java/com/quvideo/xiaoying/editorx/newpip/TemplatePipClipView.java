package com.quvideo.xiaoying.editorx.newpip;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.quvideo.mobile.engine.b.a.d;
import com.quvideo.mobile.engine.b.a.g;
import com.quvideo.mobile.engine.model.ClipModelV2;
import com.quvideo.mobile.engine.project.f.c;
import com.quvideo.xiaoying.editorx.R;
import com.quvideo.xiaoying.sdk.f.c.e;
import com.quvideo.xiaoying.sdk.f.c.f;
import com.quvideo.xiaoying.sdk.f.c.h;
import com.quvideo.xiaoying.supertimeline.b.a;
import com.quvideo.xiaoying.supertimeline.b.n;
import com.quvideo.xiaoying.supertimeline.view.KitTimeLine;
import com.videovideo.framework.c.a.b;
import java.util.ArrayList;
import java.util.List;
import xiaoying.engine.clip.QSceneClip;
import xiaoying.engine.storyboard.QStoryboard;

public class TemplatePipClipView extends ConstraintLayout {
    private int currentIndex;
    private com.quvideo.xiaoying.editorx.board.d.a hTd;
    private KitTimeLine iBF;
    private LinearLayout iBH;
    private LinearLayout iBI;
    private ConstraintLayout iLO;
    private LinearLayout iLP;
    private a iLQ;
    private ImageView iLR;
    private TextView iLS;
    private List<ClipModelV2> iLT = new ArrayList();
    private TextView iLU;
    private TextView iLV;
    private ImageView iLW;
    private ImageView iLX;
    private List<com.quvideo.xiaoying.supertimeline.b.a> iLY = new ArrayList();
    private com.quvideo.mobile.engine.project.a ipX;

    public interface a {
        void bNi();

        void bNj();

        void bvy();
    }

    public boolean onBackPressed() {
        return true;
    }

    public TemplatePipClipView(Context context) {
        super(context);
        init();
    }

    public TemplatePipClipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TemplatePipClipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setWorkSpace(com.quvideo.mobile.engine.project.a aVar) {
        this.ipX = aVar;
    }

    public void setFakeLayer(com.quvideo.xiaoying.editorx.board.d.a aVar) {
        this.hTd = aVar;
    }

    private void init() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.editorx_template_pip_clip_text_view, (ViewGroup) this, true);
        this.iLO = (ConstraintLayout) inflate.findViewById(R.id.tpc_view_top_layout);
        this.iBH = (LinearLayout) inflate.findViewById(R.id.tpc_trim);
        this.iBI = (LinearLayout) inflate.findViewById(R.id.tcp_replace);
        this.iLP = (LinearLayout) inflate.findViewById(R.id.tcp_mute);
        this.iBF = (KitTimeLine) inflate.findViewById(R.id.tcp_kitTimeline);
        this.iLR = (ImageView) inflate.findViewById(R.id.tcp_iv_mute);
        this.iLS = (TextView) inflate.findViewById(R.id.tcp_tv_mute);
        this.iLU = (TextView) inflate.findViewById(R.id.tcp_tv_trim);
        this.iLV = (TextView) inflate.findViewById(R.id.tcp_tv_replace);
        this.iLW = (ImageView) inflate.findViewById(R.id.tcp_iv_trim);
        this.iLX = (ImageView) inflate.findViewById(R.id.tcp_iv_replace);
        aKz();
    }

    public String getChooseId() {
        int i;
        List<ClipModelV2> list = this.iLT;
        return (list == null || list.size() <= (i = this.currentIndex)) ? "" : this.iLT.get(i).getUniqueId();
    }

    public void setClipViewListener(a aVar) {
        this.iLQ = aVar;
    }

    private void aKz() {
        b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipClipView.AnonymousClass1 */

            /* renamed from: onClick */
            public void bd(View view) {
                if (TemplatePipClipView.this.iLQ != null) {
                    TemplatePipClipView.this.iLQ.bNi();
                }
            }
        }, this.iBH);
        b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipClipView.AnonymousClass2 */

            /* renamed from: onClick */
            public void bd(View view) {
                if (TemplatePipClipView.this.iLQ != null) {
                    TemplatePipClipView.this.iLQ.bvy();
                }
            }
        }, this.iBI);
        b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipClipView.AnonymousClass3 */

            /* renamed from: onClick */
            public void bd(View view) {
                QSceneClip E = g.E(TemplatePipClipView.this.ipX.avv(), 0);
                if (E != null) {
                    boolean c = g.c(E, TemplatePipClipView.this.currentIndex);
                    TemplatePipClipView.this.ipX.a(new f(TemplatePipClipView.this.currentIndex, !c, 0));
                    TemplatePipClipView.this.setMuteStatus(!c);
                    if (TemplatePipClipView.this.iLQ != null) {
                        TemplatePipClipView.this.iLQ.bNj();
                    }
                }
            }
        }, this.iLP);
        this.iBF.setClipListener(new com.quvideo.xiaoying.supertimeline.c.a() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipClipView.AnonymousClass4 */

            @Override // com.quvideo.xiaoying.supertimeline.c.a
            public void a(com.quvideo.xiaoying.supertimeline.b.a aVar) {
                TemplatePipClipView.this.iBF.a((n) aVar, true);
                TemplatePipClipView templatePipClipView = TemplatePipClipView.this;
                templatePipClipView.currentIndex = templatePipClipView.yP(aVar.engineId);
                TemplatePipClipView.this.hTd.setPipSelectedIndex(TemplatePipClipView.this.currentIndex);
                TemplatePipClipView templatePipClipView2 = TemplatePipClipView.this;
                templatePipClipView2.qK(templatePipClipView2.currentIndex);
                if (TextUtils.isEmpty(aVar.filePath) && TemplatePipClipView.this.iLQ != null) {
                    TemplatePipClipView.this.iLQ.bvy();
                }
            }

            @Override // com.quvideo.xiaoying.supertimeline.c.a
            public boolean a(com.quvideo.xiaoying.supertimeline.b.a aVar, com.quvideo.xiaoying.supertimeline.b.a aVar2) {
                if (TextUtils.isEmpty(aVar.filePath) && TextUtils.isEmpty(aVar2.filePath)) {
                    return false;
                }
                TemplatePipClipView.this.ipX.a(new com.quvideo.xiaoying.sdk.f.c.a(TemplatePipClipView.this.yP(aVar.engineId), TemplatePipClipView.this.yP(aVar2.engineId), 0));
                return true;
            }
        });
    }

    public void qK(int i) {
        if (this.currentIndex < this.iLT.size()) {
            this.currentIndex = i;
            this.iBF.a((n) this.iLY.get(i), true);
            bZJ();
        }
    }

    public int yP(String str) {
        for (ClipModelV2 clipModelV2 : this.iLT) {
            if (clipModelV2 != null && str.equals(clipModelV2.getUniqueId())) {
                return this.iLT.indexOf(clipModelV2);
            }
        }
        return 0;
    }

    public void bZJ() {
        com.quvideo.xiaoying.supertimeline.b.a aVar = (com.quvideo.xiaoying.supertimeline.b.a) this.iBF.getSelectBean();
        if (aVar == null || TextUtils.isEmpty(aVar.filePath)) {
            this.iLU.setTextColor(androidx.core.content.b.x(getContext(), R.color.color_525252));
            this.iLV.setTextColor(androidx.core.content.b.x(getContext(), R.color.color_525252));
            this.iLS.setTextColor(androidx.core.content.b.x(getContext(), R.color.color_525252));
            this.iLW.setImageResource(R.drawable.editorx_kit_clip_trim_off);
            this.iLX.setImageResource(R.drawable.editorx_kit_clip_replace_off);
            this.iLR.setImageResource(R.drawable.super_timeline_audio_open_all_off);
            this.iBH.setEnabled(false);
            this.iBI.setEnabled(false);
            this.iLP.setEnabled(false);
            return;
        }
        this.iLU.setTextColor(androidx.core.content.b.x(getContext(), R.color.color_e6e6e6));
        this.iLV.setTextColor(androidx.core.content.b.x(getContext(), R.color.color_e6e6e6));
        this.iLS.setTextColor(androidx.core.content.b.x(getContext(), R.color.color_e6e6e6));
        this.iLW.setImageResource(R.drawable.editorx_kit_clip_trim);
        this.iLX.setImageResource(R.drawable.editorx_kit_clip_replace);
        this.iLR.setImageResource(R.drawable.super_timeline_audio_open_all);
        this.iBH.setEnabled(true);
        this.iBI.setEnabled(true);
        this.iLP.setEnabled(true);
        QSceneClip E = g.E(this.ipX.avv(), 0);
        if (E != null) {
            setMuteStatus(g.c(E, this.currentIndex));
        }
    }

    public void bZK() {
        com.quvideo.xiaoying.supertimeline.b.a aVar = (com.quvideo.xiaoying.supertimeline.b.a) this.iBF.getSelectBean();
        if (aVar != null && !TextUtils.isEmpty(aVar.filePath) && ((long) this.ipX.avr().axa().axf()) > aVar.length) {
            this.ipX.avr().axa().a(((int) aVar.length) - 1, c.a.EnumC0282a.PIP, this.ipX);
        }
    }

    public void c(com.quvideo.mobile.engine.m.b bVar) {
        if (bVar.success()) {
            if (bVar instanceof com.quvideo.xiaoying.sdk.f.c.g) {
                el(getClipBeanList());
                bZL();
            } else if (bVar instanceof f) {
                bZL();
            } else if (bVar instanceof com.quvideo.xiaoying.sdk.f.c.b) {
                el(getClipBeanList());
                bZL();
            } else if (bVar instanceof com.quvideo.xiaoying.sdk.f.c.a) {
                el(getClipBeanList());
                bZL();
            } else if (bVar instanceof h) {
                el(getClipBeanList());
                bZL();
            } else if (bVar instanceof e) {
                qK(this.currentIndex);
            }
        }
    }

    public void bZL() {
        this.iLT = this.ipX.avo().pi(0);
    }

    public List<com.quvideo.xiaoying.supertimeline.b.a> getClipBeanList() {
        QStoryboard avv = this.ipX.avv();
        QSceneClip qSceneClip = (QSceneClip) avv.getClip(0);
        ArrayList arrayList = new ArrayList();
        int elementCount = qSceneClip.getElementCount();
        for (int i = 0; i < elementCount; i++) {
            QStoryboard qStoryboard = new QStoryboard();
            qSceneClip.getElementSource(i, qStoryboard);
            com.quvideo.xiaoying.supertimeline.b.a f = com.quvideo.xiaoying.editorx.controller.h.b.f(d.c(avv, qStoryboard.getClip(0), 0));
            f.jSG = true;
            f.jSH = com.vivavideo.gallery.f.f.Nh(i);
            if ("assets_android://xiaoying/pipdefaultfile/xiaoying_pip_default.png".equals(f.filePath)) {
                f.filePath = "";
            }
            if (f.jSJ == a.b.Pic) {
                f.jSz = (long) this.ipX.avq().getDuration();
            }
            arrayList.add(f);
        }
        this.iLY = arrayList;
        return arrayList;
    }

    public com.quvideo.xiaoying.supertimeline.b.a getCurrentBean() {
        return (com.quvideo.xiaoying.supertimeline.b.a) this.iBF.getSelectBean();
    }

    public void el(List<com.quvideo.xiaoying.supertimeline.b.a> list) {
        this.iBF.fy(list);
        qK(this.currentIndex);
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setMuteStatus(boolean z) {
        if (z) {
            this.iLR.setImageResource(R.drawable.editorx_ico_pip_mute_on);
            this.iLS.setTextColor(androidx.core.content.b.x(getContext(), R.color.color_ff6333));
            return;
        }
        this.iLR.setImageResource(R.drawable.super_timeline_audio_open_all);
        this.iLS.setTextColor(androidx.core.content.b.x(getContext(), R.color.color_e6e6e6));
    }

    public int getFillCount() {
        List<ClipModelV2> list = this.iLT;
        int i = 0;
        if (!(list == null || list.size() == 0)) {
            for (ClipModelV2 clipModelV2 : this.iLT) {
                if (clipModelV2 != null && !TextUtils.isEmpty(clipModelV2.getClipFilePath()) && !"assets_android://xiaoying/pipdefaultfile/xiaoying_pip_default.png".equals(clipModelV2.getClipFilePath())) {
                    i++;
                }
            }
        }
        return i;
    }
}