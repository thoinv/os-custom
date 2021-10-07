package com.quvideo.xiaoying.editorx.board.clip;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.quvideo.mobile.engine.b.a.o;
import com.quvideo.mobile.engine.entity.VeMSize;
import com.quvideo.mobile.engine.entity.VeRange;
import com.quvideo.mobile.engine.model.ClipModelV2;
import com.quvideo.mobile.engine.model.EffectDataModel;
import com.quvideo.mobile.engine.model.clip.ClipBgData;
import com.quvideo.mobile.engine.model.clip.ClipPosition;
import com.quvideo.mobile.engine.model.clip.CrossInfo;
import com.quvideo.mobile.engine.model.effect.ScaleRotateViewState;
import com.quvideo.mobile.engine.model.export.VideoExportParamsModel;
import com.quvideo.mobile.engine.project.e.a;
import com.quvideo.mobile.engine.project.f.c;
import com.quvideo.mobile.engine.project.f.f;
import com.quvideo.xiaoying.VivaBaseApplication;
import com.quvideo.xiaoying.common.FileUtils;
import com.quvideo.xiaoying.common.LogUtilsV2;
import com.quvideo.xiaoying.common.ToastUtils;
import com.quvideo.xiaoying.common.XYToastUtils;
import com.quvideo.xiaoying.editorx.R;
import com.quvideo.xiaoying.editorx.board.audio.base.e;
import com.quvideo.xiaoying.editorx.board.clip.main.FuncItemInfo;
import com.quvideo.xiaoying.editorx.board.clip.p;
import com.quvideo.xiaoying.editorx.board.d.a;
import com.quvideo.xiaoying.editorx.board.filter.l;
import com.quvideo.xiaoying.editorx.controller.b.a;
import com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar;
import com.quvideo.xiaoying.module.iap.h;
import com.quvideo.xiaoying.module.iap.p;
import com.quvideo.xiaoying.router.editor.EditorIntentInfo2;
import com.quvideo.xiaoying.router.editor.studio.BoardType;
import com.quvideo.xiaoying.router.todoCode.TodoConstants;
import com.quvideo.xiaoying.sdk.f.a.t;
import com.quvideo.xiaoying.sdk.f.a.u;
import com.quvideo.xiaoying.sdk.f.a.x;
import com.quvideo.xiaoying.sdk.f.b.i;
import com.quvideo.xiaoying.sdk.f.b.v;
import com.quvideo.xiaoying.sdk.j.m;
import com.quvideo.xiaoying.supertimeline.a.d;
import com.quvideo.xiaoying.supertimeline.b.n;
import com.quvideo.xiaoying.supertimeline.view.BaseSuperTimeLine;
import com.quvideo.xiaoying.xyui.b.p;
import com.vivavideo.mobile.h5core.refresh.H5PullHeader;
import io.reactivex.q;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class b extends com.quvideo.xiaoying.editorx.board.b {
    private f hTB = new f() {
        /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass8 */

        @Override // com.quvideo.mobile.engine.project.f.f
        public void d(int i, c.a.EnumC0282a aVar) {
        }

        @Override // com.quvideo.mobile.engine.project.f.f
        public void a(int i, c.a.EnumC0282a aVar) {
            if (b.this.isActive) {
                b.this.aM(i, false);
            }
        }

        @Override // com.quvideo.mobile.engine.project.f.f
        public void b(int i, c.a.EnumC0282a aVar) {
            if (b.this.isActive) {
                b.this.aM(i, false);
            }
        }

        @Override // com.quvideo.mobile.engine.project.f.f
        public void c(int i, c.a.EnumC0282a aVar) {
            if (b.this.isActive) {
                b.this.aM(i, false);
            }
        }
    };
    private a hTC = new a() {
        /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass6 */

        @Override // com.quvideo.mobile.engine.project.e.a
        public void c(com.quvideo.mobile.engine.m.b bVar) {
            if (bVar instanceof com.quvideo.xiaoying.sdk.f.b.f) {
                if (((com.quvideo.xiaoying.sdk.f.b.f) bVar).getGroupId() == 50) {
                    b.this.bPM();
                }
            } else if (bVar instanceof v) {
                if (((v) bVar).getGroupId() == 50) {
                    b.this.bPM();
                }
            } else if (bVar instanceof i) {
                if (((i) bVar).getGroupId() == 50) {
                    b.this.bPM();
                }
            } else if (bVar instanceof com.quvideo.mobile.engine.m.a) {
                b.this.bPM();
            } else if (bVar instanceof com.quvideo.xiaoying.sdk.f.a.c) {
                com.quvideo.xiaoying.sdk.f.a.c cVar = (com.quvideo.xiaoying.sdk.f.a.c) bVar;
            } else if ((bVar instanceof com.quvideo.xiaoying.sdk.f.a.f) && b.this.hTk != null) {
                b.this.hTk.a(false, ((com.quvideo.xiaoying.sdk.f.a.f) bVar).csf());
            }
            b.this.y((b) bVar);
        }
    };
    private SlenderSeekBar.a hUD = new SlenderSeekBar.a() {
        /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass5 */

        @Override // com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar.a
        public void xJ(int i) {
        }

        @Override // com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar.a
        public void a(SlenderSeekBar slenderSeekBar, int i) {
            g gVar = b.this.hYO;
            gVar.wI(i + "");
            LogUtilsV2.d("ClipBoardTab : volume changing , volume = " + i);
        }

        @Override // com.quvideo.xiaoying.editorx.widget.seekbar.SlenderSeekBar.a
        public void xs(int i) {
            b.this.Dn(i);
            g gVar = b.this.hYO;
            gVar.wI(i + "");
        }
    };
    private g hYO;
    private EffectDataModel hYP;
    private boolean hYQ;
    private a.AbstractC0484a hYR = new a.AbstractC0484a() {
        /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass3 */

        @Override // com.quvideo.xiaoying.editorx.controller.b.a.AbstractC0484a
        public void nM(boolean z) {
            if (b.this.hTc != null) {
                b.this.hTc.b(BoardType.CLIP_COVER_SELECT, null);
            }
        }
    };
    private String hYS = "";
    private a.h hYT = new a.h() {
        /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass9 */

        @Override // com.quvideo.xiaoying.editorx.board.d.a.h
        public void bPS() {
            super.bPS();
            BoardType bNe = b.this.hTc.bNe();
            if (bNe == BoardType.THEME) {
                if (b.this.hTj.a(h.VIP_THEME)) {
                    new com.quvideo.xiaoying.editorx.iap.dialog.b(b.this.getActivity(), p.theme.getFrom(), p.theme.cgX().getId(), b.this.hTj, new e(this)).czz().bzB();
                    return;
                }
            }
            if (bNe == BoardType.EFFECT) {
                if (b.this.hTj.a(h.VIP_KEY_FRAME)) {
                    new com.quvideo.xiaoying.editorx.iap.dialog.b(b.this.getActivity(), p.keyFrame.getFrom(), p.keyFrame.cgX().getId(), b.this.hTj, new f(this)).czz().bzB();
                    return;
                }
            }
            b.this.hTc.b(BoardType.CLIP_WATERMARK_MODE, 1);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void bPV() {
            b.this.hTj.d(b.this.hTc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void bPU() {
            b.this.hTj.e(b.this.hTc);
        }

        @Override // com.quvideo.xiaoying.editorx.board.d.a.h
        public boolean bPT() {
            com.quvideo.xiaoying.editorx.board.b c = b.this.hTc.c(b.this.hTc.bNe());
            if (c != null) {
                return c.bNa();
            }
            return false;
        }

        @Override // com.quvideo.xiaoying.editorx.board.d.a.h
        public void onClick() {
            com.quvideo.xiaoying.editorx.board.b c = b.this.hTc.c(b.this.hTc.bNe());
            if (c == null || c.bNa()) {
                b.this.hTc.b(BoardType.CLIP_WATERMARK_MODE, null);
            }
        }
    };
    private boolean hYU = true;
    private boolean hYV = false;

    @Override // com.quvideo.xiaoying.editorx.board.b
    public boolean bNa() {
        return true;
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public boolean onBackPressed() {
        return false;
    }

    public b(HashMap<Class, Object> hashMap) {
        super(hashMap);
        g gVar = new g(this.context, this.hTc, this.iTimelineApi, this.hTd, this.hTj, this.hTh);
        this.hYO = gVar;
        gVar.a(new OnItemClickListener() {
            /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass1 */

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public void onSimpleItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                FuncItemInfo funcItemInfo;
                if (com.quvideo.xiaoying.c.b.aRH() || (funcItemInfo = (FuncItemInfo) baseQuickAdapter.getItem(i)) == null) {
                    return;
                }
                if (!funcItemInfo.isDisabled()) {
                    b.this.a((b) funcItemInfo);
                } else if (funcItemInfo.getFunId() == 1008) {
                    ToastUtils.show(b.this.getActivity(), R.string.xiaoying_str_edit_clip_delete_toast, 0);
                } else if (funcItemInfo.getFunId() == 1011) {
                    ToastUtils.show(b.this.getActivity(), R.string.xiaoying_str_ve_transition_only_one_tip, 0);
                } else if (funcItemInfo.getFunId() == 1004) {
                    ToastUtils.show(b.this.getActivity(), R.string.xiaoying_str_ve_msg_basic_split_notavail_tip, 0);
                }
            }
        });
        this.hYO.m(new c(this));
        this.iTimelineApi.bWD().Fd(R.string.xiaoying_str_cover_com);
        this.iTimelineApi.bWD().a(new com.quvideo.xiaoying.editorx.board.g.c() {
            /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass2 */

            @Override // com.quvideo.xiaoying.editorx.board.g.c
            public void bPR() {
            }

            @Override // com.quvideo.xiaoying.editorx.board.g.c
            public void ns(boolean z) {
            }

            @Override // com.quvideo.xiaoying.editorx.board.g.c
            public void a(com.quvideo.xiaoying.supertimeline.b.a aVar) {
                b.this.iTimelineApi.getSelectBean();
                b.this.iTimelineApi.a(aVar, true);
                int jK = b.this.hTe.avo().jK(aVar.engineId);
                if (b.this.iTimelineApi.getCurProgress() < jK) {
                    b.this.hTe.avr().axa().a(jK, c.a.EnumC0282a.CLIP_CLICK, b.this.hTe);
                    return;
                }
                int ph = b.this.hTe.avo().ph(aVar.index);
                if (ph > 0) {
                    ph -= 2;
                }
                b.this.hTe.avr().axa().a(ph, c.a.EnumC0282a.CLIP_CLICK, b.this.hTe);
            }

            @Override // com.quvideo.xiaoying.editorx.board.g.c
            public void bPP() {
                LogUtilsV2.d("ClickCover: onClickCover");
                b.this.bPI();
            }

            @Override // com.quvideo.xiaoying.editorx.board.g.c
            public void a(com.quvideo.xiaoying.supertimeline.b.b bVar) {
                n.cM("转场", "timeline");
                b.this.iTimelineApi.a(bVar, true);
                b.this.hTc.b(BoardType.CLIP_CROSS, bVar);
                com.quvideo.xiaoying.editorx.board.b.a.wA("时间轴");
            }

            @Override // com.quvideo.xiaoying.editorx.board.g.c
            public void bPQ() {
                if (b.this.hTh != null) {
                    b.this.hTh.bWj();
                    if (b.this.hTh.bWk()) {
                        b.this.hTh.bWl();
                        b.this.hYO.bPW();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void fJ(View view) {
        this.hTc.b(BoardType.THEME, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void bPI() {
        if (this.hTe != null && this.hTk != null) {
            this.hTk.a(this.hYR);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(FuncItemInfo funcItemInfo) {
        String str;
        ClipModelV2 clipModelV2;
        com.quvideo.xiaoying.supertimeline.b.b bVar = null;
        if (funcItemInfo.getFunId() == 1006) {
            n.cM("比例", "function_icon");
            this.hTe.avr().axa().pause();
            this.hTc.b(BoardType.CLIP_RATIO, null);
        } else if (funcItemInfo.getFunId() == 1024) {
            n.cM("背景", "function_icon");
            this.hTe.avr().axa().pause();
            this.hTc.b(BoardType.CLIP_BG, null);
        } else if (funcItemInfo.getFunId() == 1014) {
            n.cM("图片时长", "function_icon");
            this.hTe.avr().axa().pause();
            this.hTc.b(BoardType.CLIP_PIC_TRIM_MODE, null);
        } else if (funcItemInfo.getFunId() == 1020) {
            n.cM("片尾编辑", "function_icon");
            this.hTe.avr().axa().pause();
            this.hTc.b(BoardType.CLIP_END, null);
        } else if (funcItemInfo.getFunId() == 1005) {
            n.cM("变速", "function_icon");
            this.hTe.avr().axa().pause();
            this.hTc.b(BoardType.CLIP_SPEED_MODE, null);
        } else if (funcItemInfo.getFunId() == 1003) {
            n.cM("修剪", "function_icon");
            this.hTe.avr().axa().pause();
            this.hTc.b(BoardType.CLIP_VIDEO_TRIM_MODE, null);
        } else if (funcItemInfo.getFunId() == 2008) {
            n.cM("水印", "function_icon");
            this.hTe.avr().axa().pause();
            this.hTc.b(BoardType.CLIP_WATERMARK_MODE, null);
        } else if (funcItemInfo.getFunId() == 1018) {
            n.cM("排序", "function_icon");
            this.hTe.avr().axa().pause();
            this.hTc.b(BoardType.CLIP_ORDER_MODE, null);
        } else if (funcItemInfo.getFunId() == 1009) {
            n.cM("复制", "function_icon");
            this.hTe.avr().axa().pause();
            p.a w = p.w(this.hTe);
            if (w != null) {
                this.hTe.avo().avR();
                ArrayList arrayList = new ArrayList();
                try {
                    ClipModelV2 clone = w.hZp.clone();
                    clone.setCrossInfo(new CrossInfo());
                    arrayList.add(clone);
                } catch (Throwable unused) {
                }
                this.hTe.a(new com.quvideo.xiaoying.sdk.f.a.c(w.index + 1, arrayList, true, true, false));
            }
        } else if (funcItemInfo.getFunId() == 1008) {
            n.cM("删除", "function_icon");
            this.hTe.avr().axa().pause();
            p.a w2 = p.w(this.hTe);
            if (w2 != null) {
                k.a(this.hTe, getActivity(), w2);
            }
        } else if (funcItemInfo.getFunId() == 1004) {
            long currentTimeMillis = System.currentTimeMillis();
            n.cM("分割", "function_icon");
            this.hTe.avr().axa().pause();
            this.iTimelineApi.cancelScroll();
            int curProgress = this.iTimelineApi.getCurProgress();
            ClipPosition cl = this.hTe.avo().cl((long) curProgress);
            if (cl.mClipType == ClipModelV2.ClipType.NORMAL && (clipModelV2 = this.hTe.avo().avR().get(cl.index.intValue())) != null) {
                int jL = this.hTe.avo().jL(clipModelV2.getUniqueId());
                if (!l.Q(jL, clipModelV2.getClipTrimLength() + jL, curProgress)) {
                    ToastUtils.show(getView().getContext(), R.string.xiaoying_str_ve_msg_basic_split_notavail_tip, 0);
                    return;
                }
                LogUtilsV2.d("xsj ==> opClipModel.progressInTotal : " + curProgress);
                LogUtilsV2.d("xsj ==> opClipModel.clipStartProgress : " + jL);
                this.hTe.a(new x(cl.index.intValue(), curProgress, jL, clipModelV2.getClipTrimLength() + jL));
                LogUtilsV2.d("xsj ==> 分割timeline刷新cost : " + (System.currentTimeMillis() - currentTimeMillis));
            }
        } else if (funcItemInfo.getFunId() == 1017) {
            n.cM("图片动画", "function_icon");
            this.hTe.avr().axa().pause();
            p.a w3 = p.w(this.hTe);
            if (w3 != null) {
                this.hTe.a(new com.quvideo.xiaoying.sdk.f.a.p(w3.index, w3.hZp));
            }
        } else if (funcItemInfo.getFunId() == 1010) {
            n.cM("倒放", "function_icon");
            final p.a w4 = p.w(this.hTe);
            if (w4 != null) {
                this.hTe.avr().axa().pause();
                if (w4.hZp.isReversed()) {
                    this.hTe.a(new t(w4.index, false, null, w4.hZo));
                    return;
                }
                String Fd = m.Fd(".reverse/");
                VideoExportParamsModel videoExportParamsModel = new VideoExportParamsModel();
                videoExportParamsModel.encodeType = o.auW();
                videoExportParamsModel.decodeType = o.auV();
                videoExportParamsModel.actionType = 4;
                VeRange veRange = new VeRange(w4.hZp.getSrcStart(), w4.hZp.getSrcLength());
                String a2 = com.quvideo.mobile.engine.project.d.c.a(Fd, w4.hZp.getClipFilePath(), veRange);
                if (!FileUtils.isFileExisted(a2)) {
                    final com.quvideo.xiaoying.editorx.board.clip.widget.c cVar = new com.quvideo.xiaoying.editorx.board.clip.widget.c(getView().getContext());
                    cVar.show();
                    com.quvideo.mobile.engine.project.d.c cVar2 = new com.quvideo.mobile.engine.project.d.c(new com.quvideo.xiaoying.sdk.j.b.a.a() {
                        /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass4 */

                        @Override // com.quvideo.mobile.engine.project.d.a, com.quvideo.xiaoying.sdk.j.b.a.a
                        public void awG() {
                        }

                        @Override // com.quvideo.mobile.engine.project.d.a, com.quvideo.xiaoying.sdk.j.b.a.a
                        public void awH() {
                        }

                        @Override // com.quvideo.mobile.engine.project.d.a, com.quvideo.xiaoying.sdk.j.b.a.a
                        public void n(int i, String str) {
                        }

                        @Override // com.quvideo.mobile.engine.project.d.a, com.quvideo.xiaoying.sdk.j.b.a.a
                        public void bP(float f) {
                            cVar.setProgress((int) f);
                        }

                        @Override // com.quvideo.mobile.engine.project.d.a, com.quvideo.xiaoying.sdk.j.b.a.a
                        public void kc(String str) {
                            cVar.dismiss();
                            b.this.hTe.a(new t(w4.index, true, str, w4.hZo));
                        }
                    });
                    int a3 = cVar2.a(videoExportParamsModel, w4.hZp.getClipFilePath(), Fd, veRange);
                    cVar.setOnCancelListener(new d(cVar2));
                    if (a3 != 0) {
                        cVar.dismiss();
                        return;
                    }
                    return;
                }
                this.hTe.a(new t(w4.index, true, a2, w4.hZo));
            }
        } else if (funcItemInfo.getFunId() == 1007) {
            p.a w5 = p.w(this.hTe);
            if (w5 != null && w5.hZp != null && !bPJ()) {
                n.cM("静音", "function_icon");
                e.a(this.hTe, this.iTimelineApi.getSelectBean(), false, !w5.hZp.isMute(), true);
                g gVar = this.hYO;
                if (w5.hZp.isMute()) {
                    str = e.a(this.hTe, w5.hZp.getUniqueId()) + "";
                } else {
                    str = "0";
                }
                gVar.wI(str);
            }
        } else if (funcItemInfo.getFunId() == 1021) {
            if (!bPJ()) {
                n.cM("音量", "function_icon");
                bPK();
            }
        } else if (funcItemInfo.getFunId() == 1023) {
            if (!bPJ()) {
                n.cM("变声", "function_icon");
                this.hTc.b(BoardType.AUDIO_ORIGINAL_CHANGE_VOICE, 1);
            }
        } else if (funcItemInfo.getFunId() == 1013) {
            n.cM("旋转", "function_icon");
            p.a w6 = p.w(this.hTe);
            if (w6 != null) {
                this.hTe.a(new u(w6.index, (w6.hZp.getRotateAngle() + 90) % ClipBgData.MAX_BG_ANGLE, w6.hZo));
            }
        } else if (funcItemInfo.getFunId() == 1022) {
            n.cM("调色", "function_icon");
            this.hTc.b(BoardType.FILTER, com.quvideo.xiaoying.editorx.board.filter.a.ixh);
            l.yj("时间轴");
        } else if (funcItemInfo.getFunId() == 1011) {
            n.cM("转场", "function_icon");
            p.a w7 = p.w(this.hTe);
            if (w7 != null && w7.index < this.hTe.avo().avR().size() - 1) {
                n selectBean = this.iTimelineApi.getSelectBean();
                if (selectBean.ctx() == n.a.jTB) {
                    bVar = ((com.quvideo.xiaoying.supertimeline.b.a) selectBean).ctz();
                }
                if (bVar != null) {
                    this.hTc.b(BoardType.CLIP_CROSS, bVar);
                    com.quvideo.xiaoying.editorx.board.b.a.wA("镜头编辑功能");
                }
            }
        }
    }

    private boolean bPJ() {
        p.a w = p.w(this.hTe);
        if (w == null || w.hZp == null || !w.hZp.isReversed()) {
            return false;
        }
        XYToastUtils.shortShow(VivaBaseApplication.aEl().getApplicationContext(), R.string.xiaoying_str_edit_reverse_clip_no_sound_text);
        return true;
    }

    private void bPK() {
        int a2;
        if (this.hTe != null && this.hYO != null) {
            this.hTe.avr().axa().pause();
            p.a w = p.w(this.hTe);
            if (w != null && w.hZp != null && !TextUtils.isEmpty(w.hZp.getUniqueId()) && (a2 = e.a(this.hTe, w.hZp.getUniqueId())) >= 0) {
                this.hYO.a(this.hUD, a2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Dn(int i) {
        p.a w;
        n selectBean;
        if (this.hTe != null && this.hYO != null && (w = p.w(this.hTe)) != null && w.hZp != null && !TextUtils.isEmpty(w.hZp.getUniqueId()) && (selectBean = this.iTimelineApi.getSelectBean()) != null) {
            e.a(this.hTe, selectBean, i, false, true);
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public void c(EditorIntentInfo2 editorIntentInfo2) {
        super.c(editorIntentInfo2);
        if (editorIntentInfo2 != null) {
            switch (editorIntentInfo2.todoCode) {
                case TodoConstants.TODO_TYPE_EDITOR8_CLIP_TRANSITION /*{ENCODED_INT: -990001}*/:
                    if (this.hTe.avo().avR().size() > 1) {
                        com.quvideo.xiaoying.editorx.board.clip.a.b bVar = new com.quvideo.xiaoying.editorx.board.clip.a.b();
                        bVar.icQ = this.hTe.avo().avR().get(0).getUniqueId();
                        bVar.templateId = editorIntentInfo2.templateId;
                        this.hTc.b(BoardType.CLIP_CROSS, bVar);
                        return;
                    }
                    ToastUtils.show(VivaBaseApplication.aEl().getApplicationContext(), R.string.xiaoying_str_ve_transition_only_one_tip, 0);
                    return;
                case TodoConstants.TODO_TYPE_EDITOR8_CLIP_ADJUST /*{ENCODED_INT: 450002}*/:
                    this.hTc.b(BoardType.CLIP_VIDEO_TRIM_MODE, null);
                    return;
                case TodoConstants.TODO_TYPE_EDITOR8_CLIP_SPEED /*{ENCODED_INT: 450005}*/:
                    this.hTc.b(BoardType.CLIP_SPEED_MODE, null);
                    return;
                case TodoConstants.TODO_TYPE_EDITOR8_CLIP_BG /*{ENCODED_INT: 450007}*/:
                    this.hTc.b(BoardType.CLIP_BG, editorIntentInfo2);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public void a(BoardType boardType, Object obj) {
        if (boardType != BoardType.UNKNOWN || !(obj instanceof String)) {
            if (boardType == BoardType.AUDIO_ORIGINAL_CHANGE_VOICE && this.hTi != null) {
                this.hTi.setVisible(true);
                this.hTi.bXE();
            }
        } else if ("add_water_mark".equals((String) obj)) {
            bPN();
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public View getView() {
        return this.hYO.getContentView();
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public void onResume() {
        super.onResume();
        this.hTd.setMode(a.f.FINE_TUNE);
        this.iTimelineApi.setState(BaseSuperTimeLine.f.kaY);
        this.iTimelineApi.a(d.a.L122);
        this.hTg.setShow(false);
        if (this.hTe != null) {
            int axf = this.hTe.avr().axa().axf();
            aM(axf, true);
            this.hTe.avr().awX().register(this.hTB);
            g gVar = this.hYO;
            if (gVar != null) {
                gVar.onResume();
            }
            ClipModelV2 ck = this.hTe.avo().ck((long) axf);
            if (ck != null && !ck.isEndClipFilm()) {
                if (e.e(this.hTe, this.iTimelineApi.getSelectBean())) {
                    this.hYO.wI("0");
                } else {
                    int a2 = e.a(this.hTe, ck.getUniqueId());
                    g gVar2 = this.hYO;
                    gVar2.wI(a2 + "");
                }
            }
            bPM();
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public void bw(Object obj) {
        if ((obj instanceof BoardType) && !j((BoardType) obj)) {
            this.iTimelineApi.b(null, false);
        }
        if (this.hTe != null) {
            this.hTe.avr().awX().be(this.hTB);
            g gVar = this.hYO;
            if (gVar != null) {
                gVar.onPause();
            }
        }
    }

    private boolean j(BoardType boardType) {
        return boardType == BoardType.CLIP || boardType == BoardType.CLIP_RATIO || boardType == BoardType.CLIP_BG || boardType == BoardType.CLIP_PIC_TRIM_MODE || boardType == BoardType.CLIP_SPEED_MODE || boardType == BoardType.CLIP_VIDEO_TRIM_MODE || boardType == BoardType.CLIP_WATERMARK_MODE || boardType == BoardType.CLIP_ORDER_MODE || boardType == BoardType.CLIP_CROSS || boardType == BoardType.CLIP_END;
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public void onDestroy() {
        if (this.hTe != null) {
            this.hTe.b(this.hTC);
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public void f(com.quvideo.mobile.engine.project.a aVar) {
        super.f(aVar);
        this.hTe.avr().awX().register(this.hTB);
        com.quvideo.mobile.engine.project.db.entity.a jF = com.quvideo.mobile.engine.project.c.avF().jF(this.hTe.avt());
        if (jF != null) {
            jF.dUe = eC(System.currentTimeMillis());
            com.quvideo.mobile.engine.project.c.avF().c(jF);
        }
        if (this.hTe.avC()) {
            Iterator<ClipModelV2> it = this.hTe.avo().avR().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ClipModelV2 next = it.next();
                if (!TextUtils.isEmpty(next.getClipFilePath()) && !FileUtils.isFileExisted(next.getClipFilePath())) {
                    this.hYQ = true;
                    break;
                }
            }
        } else {
            this.hYQ = this.hTe.avB();
        }
        if (this.hYQ && !bPL()) {
            if (!com.quvideo.xiaoying.util.a.bA(getActivity())) {
                new p.a(getActivity()).La(2).It(getActivity().getString(R.string.xiaoying_str_com_got_it)).Iw(getActivity().getString(R.string.xiaoying_str_prj_delete_title)).Iv(getActivity().getString(R.string.xiaoying_str_prj_delete_desc)).czK().bzB();
            } else {
                return;
            }
        }
        if (!this.hYU && !this.hYV) {
            this.hTj.a(this.hTe, this.hTi, !this.hYQ);
        }
        g gVar = this.hYO;
        if (gVar != null) {
            gVar.t(aVar);
        }
        aM(0, true);
        aVar.a(this.hTC);
    }

    private String eC(long j) {
        return new SimpleDateFormat(H5PullHeader.TIME_FORMAT).format(Long.valueOf(j));
    }

    private boolean bPL() {
        if (this.hTo == null) {
            return false;
        }
        return this.hTo.demoTemplate;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void y(com.quvideo.mobile.engine.m.b bVar) {
        if (((bVar instanceof com.quvideo.mobile.engine.m.a.b) || (bVar instanceof com.quvideo.mobile.engine.m.a.d)) && bVar.aye() && !(bVar instanceof com.quvideo.xiaoying.sdk.f.a.f) && this.hTk != null && this.hTe != null) {
            com.quvideo.mobile.engine.project.db.entity.a jO = com.quvideo.mobile.engine.project.db.d.avX().awa().jO(this.hTe.avt());
            if (!(jO != null && !TextUtils.isEmpty(jO.dUq))) {
                this.hTe.a(new com.quvideo.xiaoying.sdk.f.a.f(this.hTe.avq().avK(), this.hTe.avt(), 0, false));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void bPM() {
        List<EffectDataModel> pq = this.hTe.avp().pq(50);
        if (pq.size() <= 0 || pq.get(0) == null || pq.get(0).getScaleRotateViewState() == null) {
            this.hTd.setDefaultWaterTarget(null);
        } else {
            this.hTd.setDefaultWaterTarget(pq.get(0).getScaleRotateViewState().mEffectPosInfo);
        }
        this.hTd.bTD();
    }

    public void bPN() {
        if (!this.hYU) {
            this.hYV = false;
            this.hTj.a(this.hTe, this.hTi, true ^ this.hYQ);
        } else if (avL().width != 0 || avL().height != 0) {
            this.hYV = true;
            this.hYU = false;
            if (this.hTd != null) {
                this.hTd.setWaterListener(this.hYT);
            }
            bPO();
            bPM();
            q.j(800, TimeUnit.MILLISECONDS).e(io.reactivex.a.b.a.cSh()).b(new io.reactivex.v<Long>() {
                /* class com.quvideo.xiaoying.editorx.board.clip.b.AnonymousClass7 */

                @Override // io.reactivex.v
                public void onError(Throwable th) {
                }

                @Override // io.reactivex.v
                public void onSubscribe(io.reactivex.b.b bVar) {
                }

                /* renamed from: t */
                public void onNext(Long l) {
                }

                @Override // io.reactivex.v
                public void onComplete() {
                    b.this.hYV = false;
                    b.this.hTj.a(b.this.hTe, b.this.hTi, !b.this.hYQ);
                }
            });
        }
    }

    @Override // com.quvideo.xiaoying.editorx.board.b
    public void onActivityResume() {
        super.onActivityResume();
        if (this.hTj != null && this.hTe != null) {
            this.hTj.D(this.hTe);
        }
    }

    private EffectDataModel p(ScaleRotateViewState scaleRotateViewState) {
        EffectDataModel effectDataModel = new EffectDataModel();
        this.hYP = effectDataModel;
        effectDataModel.setScaleRotateViewState(scaleRotateViewState);
        this.hYP.setEffectPath(scaleRotateViewState.mStylePath);
        this.hYP.groupId = 50;
        this.hYP.effectLayerId = 19999.0f;
        this.hYP.setDestRange(new VeRange(0, -1));
        this.hYP.setSrcRange(new VeRange(0, -1));
        return this.hYP;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void aM(int i, boolean z) {
        com.quvideo.xiaoying.supertimeline.b.a DF = DF(i);
        boolean z2 = false;
        if (DF != null) {
            this.iTimelineApi.a(DF, false);
        }
        this.iTimelineApi.bWD().setRightBtnDisable(i >= this.hTe.avq().getDuration() + -2);
        com.quvideo.xiaoying.editorx.board.g.b bWD = this.iTimelineApi.bWD();
        if (i <= 0) {
            z2 = true;
        }
        bWD.setLeftBtnDisable(z2);
        a(this.hTe.avo().cl((long) i), z);
    }

    public com.quvideo.xiaoying.supertimeline.b.a DF(int i) {
        String str;
        ClipPosition cl = this.hTe.avo().cl((long) i);
        if (cl.mClipType == ClipModelV2.ClipType.NORMAL) {
            str = this.hTe.avo().avR().get(cl.index.intValue()).getUniqueId();
        } else if (cl.mClipType == ClipModelV2.ClipType.THEME_START) {
            str = ClipModelV2.ENGINE_ID_THEME_START;
        } else {
            str = cl.mClipType == ClipModelV2.ClipType.THEME_END ? ClipModelV2.ENGINE_ID_THEME_END : null;
        }
        if (!TextUtils.isEmpty(str)) {
            return this.iTimelineApi.bWD().yr(str);
        }
        return null;
    }

    private void a(ClipPosition clipPosition, boolean z) {
        boolean z2 = true;
        if (clipPosition.mClipType == ClipModelV2.ClipType.NORMAL && this.hTe.avo().avR().size() > clipPosition.index.intValue()) {
            ClipModelV2 clipModelV2 = this.hTe.avo().avR().get(clipPosition.index.intValue());
            this.hYO.b(z, clipModelV2.isVideo(), com.quvideo.mobile.engine.k.d.IsGifFileType(clipModelV2.getClipFilePath()), clipModelV2.isEndClipFilm(), clipModelV2.isPipScene());
            this.hYO.nN(clipModelV2.convertClipBgData().isAnimEnable);
            this.hYO.nO(clipModelV2.isMute());
            boolean z3 = this.iTimelineApi.getCurProgress() <= 1 || this.iTimelineApi.getCurProgress() >= this.hTe.avq().getDuration() + -2;
            boolean z4 = !k.v(this.hTe);
            if (clipPosition.index.intValue() < this.hTe.avo().avR().size() - 1) {
                z2 = false;
            }
            this.hYO.f(z3, z4, z2);
            this.hYO.nP(false);
            if (!clipModelV2.isEndClipFilm() && !TextUtils.equals(this.hYS, clipModelV2.getUniqueId())) {
                if (e.e(this.hTe, this.iTimelineApi.getSelectBean())) {
                    this.hYO.wI("0");
                } else {
                    int a2 = e.a(this.hTe, clipModelV2.getUniqueId());
                    this.hYO.wI(a2 + "");
                }
                this.hYS = clipModelV2.getUniqueId();
            }
        } else if (clipPosition.mClipType == ClipModelV2.ClipType.THEME_START || clipPosition.mClipType == ClipModelV2.ClipType.THEME_END) {
            this.hYO.nP(true);
        }
    }

    private VeMSize avL() {
        if (this.hTe == null || this.hTe.avr() == null) {
            return new VeMSize(0, 0);
        }
        return this.hTe.avr().avL();
    }

    private VeMSize avM() {
        return this.hTe.avr().avM();
    }

    private void bPO() {
        ScaleRotateViewState c;
        boolean z = this.hTo.todoCode == -55555;
        if (!this.hTo.kitMode && !z) {
            String kT = com.quvideo.xiaoying.editorx.board.clip.watermark.c.kT(getActivity().getBaseContext());
            if (true ^ this.hTo.isDraftProject) {
                wH(kT);
                return;
            }
            List<EffectDataModel> pq = this.hTe.avp().pq(50);
            if (this.hTj.isVip()) {
                if (pq != null && pq.size() != 0 && pq.get(0).getScaleRotateViewState() != null) {
                    this.hTd.setDefaultWaterTarget(pq.get(0).getScaleRotateViewState().mEffectPosInfo);
                    this.hTd.setTarget(pq.get(0).getScaleRotateViewState().mEffectPosInfo);
                    this.hYP = pq.get(0);
                }
            } else if (pq == null || pq.size() == 0) {
                wH(kT);
            } else if (pq.get(0).getScaleRotateViewState() != null && com.quvideo.xiaoying.editorx.board.clip.watermark.c.wh(pq.get(0).getScaleRotateViewState().mStylePath)) {
                this.hTd.setDefaultWaterTarget(pq.get(0).getScaleRotateViewState().mEffectPosInfo);
                this.hTd.setTarget(pq.get(0).getScaleRotateViewState().mEffectPosInfo);
                this.hYP = pq.get(0);
            } else if (!TextUtils.isEmpty(kT) && (c = com.quvideo.mobile.engine.b.a.e.c(kT, avL())) != null) {
                c.mEffectPosInfo = com.quvideo.mobile.engine.b.a.m.a(kT, avL(), avM());
                if (this.hTd != null) {
                    this.hTd.setDefaultWaterTarget(c.mEffectPosInfo);
                }
                try {
                    EffectDataModel clone = pq.get(0).clone();
                    clone.setScaleRotateViewState(c);
                    clone.setEffectPath(c.mStylePath);
                    clone.groupId = 50;
                    clone.effectLayerId = 19999.0f;
                    clone.setDestRange(new VeRange(0, -1));
                    clone.setSrcRange(new VeRange(0, -1));
                    this.hTe.a(new v(0, clone, null));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        } else if (!this.hTj.isVip()) {
            wH(com.quvideo.xiaoying.editorx.board.clip.watermark.c.kS(this.context));
        }
    }

    private void wH(String str) {
        ScaleRotateViewState c;
        if (!TextUtils.isEmpty(str) && (c = com.quvideo.mobile.engine.b.a.e.c(str, avL())) != null) {
            Log.d("xiawenhui", "getSurfaceSize:" + avL().toString() + "==getPreviewSize:" + avM().toString());
            c.mEffectPosInfo = com.quvideo.mobile.engine.b.a.m.a(str, avL(), avM());
            if (this.hTd != null) {
                this.hTd.setDefaultWaterTarget(c.mEffectPosInfo);
            }
            com.quvideo.xiaoying.sdk.f.b.f fVar = new com.quvideo.xiaoying.sdk.f.b.f(0, p(c));
            fVar.qy(false);
            this.hTe.a(fVar);
        }
    }
}