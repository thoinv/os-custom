package com.quvideo.mobile.engine.project;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import androidx.b.e;
import com.quvideo.mobile.engine.project.db.d;
import com.quvideo.mobile.engine.project.db.entity.a;
import java.util.ArrayList;
import java.util.List;
import xiaoying.engine.base.IQFilePathModifier;
import xiaoying.engine.storyboard.QProjectData;

public class c {
    private static volatile c dSB;
    private d dSA;
    private List<a> dSw = new ArrayList();
    private e<String, a> dSx = new e<String, a>(3) {
        /* class com.quvideo.mobile.engine.project.c.AnonymousClass1 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void entryRemoved(boolean z, String str, a aVar, a aVar2) {
            Log.d("QEProjectMgr", "evicted=" + z + ",key=" + str);
            aVar.unInit();
        }
    };
    private String dSy;
    private com.quvideo.mobile.engine.project.a.a dSz;
    private com.vivavideo.mobile.component.sharedpref.a dlA;
    private boolean dls = false;
    private Handler mHandler;

    private c() {
    }

    public static c avF() {
        if (dSB == null) {
            dSB = new c();
        }
        return dSB;
    }

    public void a(Context context, final String str, com.quvideo.mobile.engine.project.db.c cVar) {
        d.avX().ep(context);
        this.mHandler = new Handler(context.getApplicationContext().getMainLooper());
        d dVar = new d();
        this.dSA = dVar;
        dVar.execute(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass3 */

            public void run() {
                List<a> avW;
                long currentTimeMillis = System.currentTimeMillis();
                c.this.dSy = str;
                ArrayList arrayList = new ArrayList();
                if (!(d.avX() == null || d.avX().awa() == null || (avW = d.avX().awa().avW()) == null)) {
                    for (a aVar : avW) {
                        if (!com.quvideo.mobile.engine.project.i.a.isFileExisted(aVar.prj_url)) {
                            d.avX().awa().cr(aVar._id.longValue());
                        } else {
                            arrayList.add(aVar);
                        }
                    }
                }
                c.this.dSw = arrayList;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                c.this.dls = true;
                Log.d("QEProjectMgr", "load DB prjCount=" + c.this.dSw.size() + ",cost " + currentTimeMillis2 + "ms");
            }
        });
    }

    public String avG() {
        List<a> list = this.dSw;
        return (list == null || list.isEmpty()) ? "" : this.dSw.get(0).prj_url;
    }

    public void a(Context context, final com.quvideo.mobile.engine.project.db.c cVar) {
        if (this.dlA == null) {
            this.dlA = com.vivavideo.mobile.component.sharedpref.d.ei(context, "qe_prj_sp");
        }
        com.quvideo.mobile.engine.project.a.a aVar = this.dSz;
        if (aVar == null) {
            this.dSz = new com.quvideo.mobile.engine.project.a.a(this.dlA, cVar);
        } else {
            aVar.a(cVar);
        }
        this.dSA.execute(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass4 */

            public void run() {
                if (!com.quvideo.mobile.engine.project.a.a.avP()) {
                    com.quvideo.mobile.engine.project.a.a aVar = c.this.dSz;
                    c cVar = c.this;
                    aVar.b(cVar, cVar.dSy);
                    return;
                }
                cVar.au();
            }
        });
    }

    public List<a> avH() {
        return this.dSw;
    }

    public a jF(String str) {
        for (a aVar : this.dSw) {
            if (str.equals(aVar.prj_url)) {
                return aVar;
            }
        }
        return null;
    }

    public a cj(long j) {
        for (a aVar : this.dSw) {
            if (j == aVar._id.longValue()) {
                return aVar;
            }
        }
        return null;
    }

    public a a(a aVar, boolean z) {
        long e = d.avX().awa().e(aVar);
        Log.d("QEProjectMgr", "insertOrReplace QEDBProject id =" + aVar._id + ",id=" + e);
        aVar._id = Long.valueOf(e);
        if (z) {
            this.dSw = d.avX().awa().avW();
        }
        return aVar;
    }

    public a c(a aVar) {
        return a(aVar, true);
    }

    public void delete(long j) {
        d.avX().awa().cr(j);
        this.dSw = d.avX().awa().avW();
    }

    public void reload() {
        this.dSw = d.avX().awa().avW();
    }

    public void a(final j jVar) {
        this.dSA.execute(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass5 */

            public void run() {
                g.a(n.THEME, new j() {
                    /* class com.quvideo.mobile.engine.project.c.AnonymousClass5.AnonymousClass1 */

                    @Override // com.quvideo.mobile.engine.project.j
                    public void a(a aVar) {
                        c.this.dSx.put(aVar.avt(), aVar);
                        c.this.a((c) aVar, (a) jVar);
                    }

                    @Override // com.quvideo.mobile.engine.project.j
                    public void a(f fVar) {
                        c.this.a((c) fVar, (f) jVar);
                    }
                });
            }
        });
    }

    public void a(final String str, final m mVar) {
        this.dSA.execute(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass6 */

            public void run() {
                g.b(str, new m() {
                    /* class com.quvideo.mobile.engine.project.c.AnonymousClass6.AnonymousClass1 */

                    @Override // com.quvideo.mobile.engine.project.m
                    public void a(QProjectData qProjectData) {
                        if (mVar != null) {
                            mVar.a(qProjectData);
                        }
                    }

                    @Override // com.quvideo.mobile.engine.project.m
                    public void onFailure() {
                        if (mVar != null) {
                            mVar.onFailure();
                        }
                    }
                });
            }
        });
    }

    public void a(final String str, final j jVar) {
        this.dSA.execute(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass7 */

            public void run() {
                try {
                    a aVar = (a) c.this.dSx.get(str);
                    if (aVar != null) {
                        aVar.dB(true);
                        aVar.dC(true);
                        aVar.avE();
                        c.this.a((c) aVar, (a) jVar);
                        return;
                    }
                    a jF = c.this.jF(str);
                    if (jF != null) {
                        g.a(jF, new j() {
                            /* class com.quvideo.mobile.engine.project.c.AnonymousClass7.AnonymousClass1 */

                            @Override // com.quvideo.mobile.engine.project.j
                            public void a(a aVar) {
                                Log.d("QEProjectMgr", "loadProject onSuccess url = " + str + ",size=" + c.this.dSx.size());
                                c.this.dSx.put(str, aVar);
                                c.this.a((c) aVar, (a) jVar);
                            }

                            @Override // com.quvideo.mobile.engine.project.j
                            public void a(f fVar) {
                                Log.d("QEProjectMgr", "loadProject onError clientErrorCode = " + fVar.clientErrorCode + ",engineErrorCode=" + fVar.engineErrorCode);
                                c.this.a((c) fVar, (f) jVar);
                            }
                        });
                    } else if (jVar != null) {
                        f fVar = new f();
                        fVar.clientErrorCode = f.ERROR_URL;
                        c.this.a((c) fVar, (f) jVar);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("TestProjectLoad : ", " QEProjectMgr loadProject mWorkSpaceLruCache.get(url) exception msg = " + e.getMessage());
                    if (jVar != null) {
                        f fVar2 = new f();
                        fVar2.clientErrorCode = f.ERROR_URL;
                        c.this.a((c) fVar2, (f) jVar);
                    }
                }
            }
        });
    }

    public void a(final String str, final IQFilePathModifier iQFilePathModifier, final j jVar) {
        this.dSA.execute(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass8 */

            public void run() {
                g.a(str, iQFilePathModifier, new j() {
                    /* class com.quvideo.mobile.engine.project.c.AnonymousClass8.AnonymousClass1 */

                    @Override // com.quvideo.mobile.engine.project.j
                    public void a(a aVar) {
                        Log.d("QEProjectMgr", "loadProject onSuccess url = " + str + ",size=" + c.this.dSx.size());
                        c.this.dSx.put(str, aVar);
                        c.this.a((c) aVar, (a) jVar);
                    }

                    @Override // com.quvideo.mobile.engine.project.j
                    public void a(f fVar) {
                        Log.d("QEProjectMgr", "loadProject onError clientErrorCode = " + fVar.clientErrorCode + ",engineErrorCode=" + fVar.engineErrorCode);
                        c.this.a((c) fVar, (f) jVar);
                    }
                });
            }
        });
    }

    public void a(final String str, final IQFilePathModifier iQFilePathModifier, final String str2, final j jVar) {
        this.dSA.execute(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass9 */

            public void run() {
                g.a(str, iQFilePathModifier, str2, new j() {
                    /* class com.quvideo.mobile.engine.project.c.AnonymousClass9.AnonymousClass1 */

                    @Override // com.quvideo.mobile.engine.project.j
                    public void a(a aVar) {
                        Log.d("QEProjectMgr", "loadProject onSuccess url = " + str + ",size=" + c.this.dSx.size());
                        c.this.dSx.put(str, aVar);
                        c.this.a((c) aVar, (a) jVar);
                    }

                    @Override // com.quvideo.mobile.engine.project.j
                    public void a(f fVar) {
                        Log.d("QEProjectMgr", "loadProject onError clientErrorCode = " + fVar.clientErrorCode + ",engineErrorCode=" + fVar.engineErrorCode);
                        c.this.a((c) fVar, (f) jVar);
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(final a aVar, final j jVar) {
        this.mHandler.post(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass10 */

            public void run() {
                j jVar = jVar;
                if (jVar != null) {
                    jVar.a(aVar);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(final f fVar, final j jVar) {
        this.mHandler.post(new Runnable() {
            /* class com.quvideo.mobile.engine.project.c.AnonymousClass2 */

            public void run() {
                j jVar = jVar;
                if (jVar != null) {
                    jVar.a(fVar);
                }
            }
        });
    }
}