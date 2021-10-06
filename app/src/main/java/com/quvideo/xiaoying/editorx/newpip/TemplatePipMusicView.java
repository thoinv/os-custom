package com.quvideo.xiaoying.editorx.newpip;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.quvideo.mobile.engine.b.a.g;
import com.quvideo.mobile.engine.model.ClipModelV2;
import com.quvideo.mobile.engine.model.EffectDataModel;
import com.quvideo.xiaoying.common.FileUtils;
import com.quvideo.xiaoying.common.LogUtilsV2;
import com.quvideo.xiaoying.editorx.R;
import com.quvideo.xiaoying.editorx.board.audio.base.e;
import com.quvideo.xiaoying.editorx.board.audio.d.b;
import com.quvideo.xiaoying.editorx.board.effect.ui.SimpleIconTextView;
import com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar;
import com.quvideo.xiaoying.explorer.e.h;
import com.quvideo.xiaoying.explorer.musiceditor.d;
import com.quvideo.xiaoying.router.editor.EditorIntentInfo2;
import com.quvideo.xiaoying.router.explorer.ExplorerRouter;
import com.quvideo.xiaoying.router.explorer.MusicDataItem;
import com.quvideo.xiaoying.sdk.f.a.ab;
import com.quvideo.xiaoying.sdk.f.b.aa;
import com.quvideo.xiaoying.sdk.f.b.f;
import com.quvideo.xiaoying.sdk.f.b.i;
import com.quvideo.xiaoying.sdk.f.b.v;
import com.quvideo.xiaoying.supertimeline.b.n;
import com.videovideo.framework.c.a.b;
import java.util.Iterator;
import java.util.List;
import xiaoying.engine.clip.QSceneClip;

public class TemplatePipMusicView extends ConstraintLayout {
    private static final String TAG = TemplatePipMusicView.class.getSimpleName();
    private d fei;
    private b hUN;
    private b.a hUQ = new b.a() {
        /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass8 */

        @Override // com.quvideo.xiaoying.editorx.board.audio.d.b.a
        public void N(boolean z, boolean z2) {
            if (TemplatePipMusicView.this.ibN != null && TemplatePipMusicView.this.iBA != null) {
                e.a(TemplatePipMusicView.this.ibN, TemplatePipMusicView.this.iBA, z, z2);
            }
        }
    };
    private int hUu = 100;
    private boolean hUv;
    private com.quvideo.xiaoying.supertimeline.b.d iBA;
    private com.quvideo.xiaoying.supertimeline.b.a iBB;
    private LinearLayout iBl;
    private TextView iBp;
    private SimpleIconTextView iBq;
    private SimpleIconTextView iBr;
    private SimpleIconTextView iBt;
    private SimpleIconTextView iBu;
    private int iBv;
    private int iBw;
    private boolean iBx;
    private boolean iBy;
    private boolean iBz;
    private LinearLayout iMa;
    private LinearLayout iMb;
    private a iMc;
    private SlenderSeekBar.a iMd = new SlenderSeekBar.a() {
        /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass7 */

        @Override // com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar.a
        public void xJ(int i) {
        }

        @Override // com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar.a
        public void a(SlenderSeekBar slenderSeekBar, int i) {
            TemplatePipMusicView.this.Dm(i);
        }

        @Override // com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar.a
        public void xs(int i) {
            TemplatePipMusicView templatePipMusicView = TemplatePipMusicView.this;
            templatePipMusicView.oQ(templatePipMusicView.iBz);
            TemplatePipMusicView.this.Dn(i);
        }
    };
    private com.quvideo.mobile.engine.project.a ibN;
    private int ieh;

    public interface a {
        EditorIntentInfo2 bNk();

        void np(boolean z);
    }

    public TemplatePipMusicView(Context context) {
        super(context);
        init();
    }

    public TemplatePipMusicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TemplatePipMusicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.editorx_template_pip_music_text_view, (ViewGroup) this, true);
        this.iMa = (LinearLayout) inflate.findViewById(R.id.tmp_layout_bgm_no_add);
        this.iBl = (LinearLayout) inflate.findViewById(R.id.tmp_layout_bgm_item);
        this.iBp = (TextView) inflate.findViewById(R.id.bgm_title);
        this.iBq = (SimpleIconTextView) inflate.findViewById(R.id.bgm_item_replace);
        this.iBr = (SimpleIconTextView) inflate.findViewById(R.id.bgm_volume);
        this.iMb = (LinearLayout) inflate.findViewById(R.id.tmp_layout_ori_item);
        this.iBt = (SimpleIconTextView) inflate.findViewById(R.id.tmp_ori_item_mute);
        this.iBu = (SimpleIconTextView) inflate.findViewById(R.id.tmp_ori_volume);
        aKz();
    }

    private void aKz() {
        com.videovideo.framework.c.a.b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass1 */

            /* renamed from: onClick */
            public void bd(View view) {
                EditorIntentInfo2 bNk = TemplatePipMusicView.this.iMc.bNk();
                if (bNk != null) {
                    com.quvideo.xiaoying.explorer.musiceditor.support.a.al(TemplatePipMusicView.this.getContext(), bNk.kitTtid, bNk.kitTitle);
                }
                TemplatePipMusicView.this.u(false, "画中画模板");
            }
        }, this.iMa);
        com.videovideo.framework.c.a.b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass2 */

            /* renamed from: onClick */
            public void bd(View view) {
                EditorIntentInfo2 bNk = TemplatePipMusicView.this.iMc.bNk();
                if (bNk != null) {
                    com.quvideo.xiaoying.explorer.musiceditor.support.a.an(TemplatePipMusicView.this.getContext(), bNk.kitTtid, bNk.kitTitle);
                }
                TemplatePipMusicView.this.u(true, "画中画模板");
            }
        }, this.iBp);
        com.videovideo.framework.c.a.b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass3 */

            /* renamed from: onClick */
            public void bd(View view) {
                EditorIntentInfo2 bNk = TemplatePipMusicView.this.iMc.bNk();
                if (bNk != null) {
                    com.quvideo.xiaoying.explorer.musiceditor.support.a.al(TemplatePipMusicView.this.getContext(), bNk.kitTtid, bNk.kitTitle);
                }
                TemplatePipMusicView.this.u(true, "画中画模板");
            }
        }, this.iBq);
        com.videovideo.framework.c.a.b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass4 */

            /* renamed from: onClick */
            public void bd(View view) {
                TemplatePipMusicView.this.oP(true);
                TemplatePipMusicView templatePipMusicView = TemplatePipMusicView.this;
                templatePipMusicView.B(true, templatePipMusicView.iBv);
            }
        }, this.iBr);
        com.videovideo.framework.c.a.b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass5 */

            /* renamed from: onClick */
            public void bd(View view) {
                TemplatePipMusicView.this.oP(false);
                TemplatePipMusicView templatePipMusicView = TemplatePipMusicView.this;
                templatePipMusicView.B(false, templatePipMusicView.hUv ? 0 : TemplatePipMusicView.this.iBw);
            }
        }, this.iBu);
        com.videovideo.framework.c.a.b.a(new b.a<View>() {
            /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass6 */

            /* renamed from: onClick */
            public void bd(View view) {
                TemplatePipMusicView.this.oP(false);
                if (TemplatePipMusicView.this.ibN != null && TemplatePipMusicView.this.iBB != null) {
                    TemplatePipMusicView.this.ibN.a(new com.quvideo.xiaoying.sdk.f.c.e(!TemplatePipMusicView.this.hUv, 0));
                }
            }
        }, this.iBt);
    }

    public void onResume() {
        avQ();
    }

    public void setCallback(a aVar) {
        this.iMc = aVar;
    }

    public void setWorkSpace(com.quvideo.mobile.engine.project.a aVar) {
        this.ibN = aVar;
        avQ();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void B(boolean z, int i) {
        bqH();
        this.iBz = z;
        com.quvideo.xiaoying.editorx.board.audio.d.b bVar = new com.quvideo.xiaoying.editorx.board.audio.d.b((FragmentActivity) getContext(), 0);
        this.hUN = bVar;
        bVar.DC(com.quvideo.xiaoying.editorx.util.d.dip2px(getRootView().getContext(), z ? 226.0f : 154.0f));
        this.hUN.setVolumeCallback(this.iMd);
        this.hUN.a(this.hUQ);
        this.hUN.setVolume(i);
        this.hUN.setFadeData(this.iBx, this.iBy);
        this.hUN.show();
    }

    private void avQ() {
        int i;
        if (this.ibN != null && this.iBu != null && this.iBt != null) {
            boolean z = false;
            oP(false);
            SimpleIconTextView simpleIconTextView = this.iBu;
            if (this.hUv) {
                i = 0;
            } else {
                i = this.iBw;
                if (i < 0) {
                    i = 100;
                }
            }
            simpleIconTextView.setTopText(String.valueOf(i));
            SimpleIconTextView simpleIconTextView2 = this.iBu;
            if (this.hUv || this.iBw < 10) {
                z = true;
            }
            simpleIconTextView2.setSelected(z);
            this.iBt.setSelected(this.hUv);
            B(e.r(this.ibN));
            e.h(this.ibN);
        }
    }

    private void B(EffectDataModel effectDataModel) {
        if (this.ibN != null) {
            setBgmLayoutState((effectDataModel == null || effectDataModel.mAudioInfo == null) ? false : true);
            if (effectDataModel != null && effectDataModel.mAudioInfo != null) {
                this.iBp.setText(h.dl(effectDataModel.getEffectPath(), effectDataModel.mAudioInfo.musicTitle));
                this.iBr.setTopText(String.valueOf(effectDataModel.audioVolume < 0 ? 100 : effectDataModel.audioVolume));
            }
        }
    }

    public void oP(boolean z) {
        if (this.ibN != null && this.iMc != null) {
            oQ(z);
            if (z) {
                EffectDataModel r = e.r(this.ibN);
                if (r == null || r.mAudioInfo == null) {
                    this.iBv = 100;
                    this.iBx = true;
                    this.iBy = true;
                    return;
                }
                this.iBv = r.audioVolume;
                this.iBx = r.mAudioInfo.isFadeIn;
                this.iBy = r.mAudioInfo.isFadeOut;
                return;
            }
            com.quvideo.xiaoying.supertimeline.b.a aVar = this.iBB;
            if (aVar != null) {
                if (!(aVar instanceof com.quvideo.xiaoying.supertimeline.b.a) || TextUtils.isEmpty(aVar.engineId)) {
                    this.iBw = 100;
                    return;
                }
                ClipModelV2 jJ = this.ibN.avo().jJ(this.iBB.engineId);
                if (jJ == null) {
                    this.iBw = 100;
                    return;
                }
                this.hUv = bZM();
                this.iBw = jJ.getAudioVolume();
            }
        }
    }

    private boolean bZM() {
        QSceneClip E = g.E(this.ibN.avv(), 0);
        int elementCount = E.getElementCount();
        for (int i = 0; i < elementCount; i++) {
            if (!g.c(E, i)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void oQ(boolean z) {
        List<ClipModelV2> avR;
        ClipModelV2 next;
        com.quvideo.mobile.engine.project.a aVar = this.ibN;
        if (aVar != null && this.iMc != null) {
            if (z) {
                EffectDataModel r = e.r(aVar);
                if (r != null && r.mAudioInfo != null) {
                    this.iBA = com.quvideo.xiaoying.editorx.controller.h.b.e(r, this.ibN.avq().getDuration());
                }
            } else if (this.ieh >= 0 && (avR = aVar.avo().avR()) != null) {
                Iterator<ClipModelV2> it = avR.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (next.isVideo() && next.getKitClipAttribute() != null && !next.getKitClipAttribute().isLock()) {
                        this.iBB = com.quvideo.xiaoying.editorx.controller.h.b.f(next);
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Dm(int i) {
        SimpleIconTextView simpleIconTextView;
        SimpleIconTextView simpleIconTextView2 = this.iBr;
        if (simpleIconTextView2 != null && (simpleIconTextView = this.iBu) != null) {
            boolean z = true;
            int i2 = 100;
            if (this.iBz) {
                if (i >= 0) {
                    i2 = i;
                }
                simpleIconTextView2.setTopText(String.valueOf(i2));
                SimpleIconTextView simpleIconTextView3 = this.iBr;
                if (i >= 10 || i < 0) {
                    z = false;
                }
                simpleIconTextView3.setSelected(z);
                return;
            }
            if (i >= 0) {
                i2 = i;
            }
            simpleIconTextView.setTopText(String.valueOf(i2));
            SimpleIconTextView simpleIconTextView4 = this.iBu;
            if (i >= 10 || i < 0) {
                z = false;
            }
            simpleIconTextView4.setSelected(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Dn(int i) {
        a aVar;
        if (this.ibN != null && (aVar = this.iMc) != null) {
            if (this.iBz) {
                if (this.iBA != null) {
                    EditorIntentInfo2 bNk = aVar.bNk();
                    if (bNk != null) {
                        com.quvideo.xiaoying.explorer.musiceditor.support.a.am(getContext(), bNk.kitTtid, bNk.kitTitle);
                    }
                    e.a(this.ibN, (n) this.iBA, 1, i, false);
                }
            } else if (this.iBB != null) {
                EditorIntentInfo2 bNk2 = aVar.bNk();
                if (bNk2 != null) {
                    com.quvideo.xiaoying.explorer.musiceditor.support.a.ak(getContext(), bNk2.kitTtid, bNk2.kitTitle);
                }
                e.a(this.ibN, (n) this.iBB, i, true, false);
            }
        }
    }

    public void u(final boolean z, String str) {
        bqH();
        np(false);
        if (this.fei == null) {
            d dVar = (d) com.alibaba.android.arouter.b.a.Fd().bL(ExplorerRouter.MusicParams.URL_MUSIC_NEW_V2).z(ExplorerRouter.MusicParams.EXTRA_FROM, str).h(ExplorerRouter.MusicParams.EXTRA_HIDE_EXTRACT, true).EY();
            this.fei = dVar;
            dVar.a(new com.quvideo.xiaoying.explorer.b.b() {
                /* class com.quvideo.xiaoying.editorx.newpip.TemplatePipMusicView.AnonymousClass9 */

                @Override // com.quvideo.xiaoying.explorer.b.b
                public void gn(boolean z) {
                }

                @Override // com.quvideo.xiaoying.explorer.b.b
                public void c(MusicDataItem musicDataItem) {
                    LogUtilsV2.d(TemplatePipMusicView.TAG + " : music path = " + musicDataItem.filePath);
                    if (TemplatePipMusicView.this.ibN != null && musicDataItem != null && !TextUtils.isEmpty(musicDataItem.filePath) && FileUtils.isFileExisted(musicDataItem.filePath)) {
                        EffectDataModel r = e.r(TemplatePipMusicView.this.ibN);
                        if (r == null || !z) {
                            e.a(TemplatePipMusicView.this.ibN, musicDataItem, false);
                        } else {
                            e.a(TemplatePipMusicView.this.ibN, com.quvideo.xiaoying.editorx.controller.h.b.e(r, TemplatePipMusicView.this.ibN.avq().getDuration()), musicDataItem, false);
                        }
                    }
                }

                @Override // com.quvideo.xiaoying.explorer.b.b
                public void aXi() {
                    if (TemplatePipMusicView.this.fei != null) {
                        TemplatePipMusicView.this.bDT();
                    }
                }
            });
            ((FragmentActivity) getContext()).getSupportFragmentManager().lY().ad(R.anim.activity_slide_in_from_bottom, R.anim.activity_slide_out_to_bottom).a(R.id.fragment_music_continer, this.fei, (String) null).commitAllowingStateLoss();
            return;
        }
        ((FragmentActivity) getContext()).getSupportFragmentManager().lY().ad(R.anim.activity_slide_in_from_bottom, R.anim.activity_slide_out_to_bottom).c(this.fei).commitAllowingStateLoss();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void bDT() {
        if (getContext() != null) {
            np(true);
            ((FragmentActivity) getContext()).getSupportFragmentManager().lY().ad(R.anim.activity_slide_in_from_bottom, R.anim.activity_slide_out_to_bottom).a(this.fei).commitAllowingStateLoss();
            this.fei.a((com.quvideo.xiaoying.explorer.b.b) null);
            this.fei = null;
        }
    }

    public void c(com.quvideo.mobile.engine.m.b bVar) {
        if (bVar != null && bVar.success()) {
            if ((bVar instanceof f) || (bVar instanceof v)) {
                L(bVar);
            } else if (bVar instanceof com.quvideo.xiaoying.sdk.f.c.e) {
                M(bVar);
            } else if (bVar instanceof aa) {
                K(bVar);
            } else if (bVar instanceof ab) {
                J(bVar);
            } else if (bVar instanceof i) {
                N(bVar);
            } else if (bVar instanceof com.quvideo.xiaoying.sdk.f.c.f) {
                M(bVar);
            }
        }
    }

    private void L(com.quvideo.mobile.engine.m.b bVar) {
        EffectDataModel effectDataModel;
        boolean z = true;
        if (bVar instanceof f) {
            f fVar = (f) bVar;
            if (fVar.getGroupId() == 1) {
                effectDataModel = fVar.getEffectDataModel();
            } else {
                return;
            }
        } else if (bVar instanceof v) {
            v vVar = (v) bVar;
            if (vVar.getGroupId() == 1) {
                effectDataModel = vVar.getEffectDataModel();
            } else {
                return;
            }
        } else {
            effectDataModel = null;
        }
        setBgmLayoutState(effectDataModel != null);
        if (effectDataModel != null && effectDataModel.mAudioInfo != null) {
            this.iBp.setText(h.dl(effectDataModel.getEffectPath(), effectDataModel.mAudioInfo.musicTitle));
            this.iBr.setTopText(String.valueOf(effectDataModel.audioVolume < 0 ? 100 : effectDataModel.audioVolume));
            SimpleIconTextView simpleIconTextView = this.iBr;
            if (effectDataModel.audioVolume >= 10) {
                z = false;
            }
            simpleIconTextView.setSelected(z);
        }
    }

    private void M(com.quvideo.mobile.engine.m.b bVar) {
        boolean z = false;
        oP(false);
        SimpleIconTextView simpleIconTextView = this.iBt;
        if (simpleIconTextView != null && this.iBu != null && this.iBB != null) {
            simpleIconTextView.setSelected(this.hUv);
            this.iBu.setTopText(String.valueOf(this.hUv ? 0 : this.iBw));
            SimpleIconTextView simpleIconTextView2 = this.iBu;
            if (this.hUv || this.iBw < 10) {
                z = true;
            }
            simpleIconTextView2.setSelected(z);
        }
    }

    private void K(com.quvideo.mobile.engine.m.b bVar) {
        EffectDataModel r;
        com.quvideo.mobile.engine.project.a aVar = this.ibN;
        if (aVar != null && this.iBr != null && (r = e.r(aVar)) != null && r.mAudioInfo != null) {
            this.iBr.setSelected(r.audioVolume < 10);
        }
    }

    private void J(com.quvideo.mobile.engine.m.b bVar) {
        ClipModelV2 l;
        com.quvideo.mobile.engine.project.a aVar = this.ibN;
        if (aVar != null && this.iBr != null && (l = e.l(aVar)) != null) {
            this.iBu.setSelected(l.getAudioVolume() < 10);
            this.iBt.setSelected(l.isMute());
        }
    }

    private void N(com.quvideo.mobile.engine.m.b bVar) {
        avQ();
    }

    private void setBgmLayoutState(boolean z) {
        LinearLayout linearLayout = this.iBl;
        if (linearLayout != null && this.iMa != null) {
            int i = 0;
            linearLayout.setVisibility(z ? 0 : 8);
            LinearLayout linearLayout2 = this.iMa;
            if (z) {
                i = 8;
            }
            linearLayout2.setVisibility(i);
        }
    }

    private void np(boolean z) {
        a aVar = this.iMc;
        if (aVar != null) {
            aVar.np(z);
        }
    }

    private void bqH() {
        com.quvideo.mobile.engine.project.a aVar = this.ibN;
        if (aVar != null) {
            aVar.avr().axa().pause();
        }
    }

    public boolean onBackPressed() {
        d dVar = this.fei;
        if (dVar == null || !dVar.isVisible()) {
            return false;
        }
        return this.fei.onBackPressed();
    }
}