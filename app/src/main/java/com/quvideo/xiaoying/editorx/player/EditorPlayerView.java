package com.quvideo.xiaoying.editorx.player;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.b.f;
import com.quvideo.mobile.engine.entity.VeMSize;
import com.quvideo.mobile.engine.project.f.a;
import com.quvideo.xiaoying.common.LogUtilsV2;
import com.quvideo.xiaoying.editorx.board.effect.fake.FakeEngineLayer;
import com.quvideo.xiaoying.supertimeline.util.b;

public class EditorPlayerView extends RelativeLayout implements com.quvideo.mobile.engine.project.f.a {
    private boolean dVD;
    private FakeEngineLayer iCR;
    SurfaceView iMf;
    private SurfaceHolder iMg;
    private ImageView iMh;
    private a iMi;
    private int iMj;
    private int iMk;
    private a.AbstractC0281a iMl;
    private int limit;

    public EditorPlayerView(Context context) {
        this(context, null);
    }

    public EditorPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditorPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iMi = new a();
        this.limit = (int) b.dpToPixel(getContext(), 60.0f);
    }

    public void pl(boolean z) {
        LayoutInflater.from(getContext()).inflate(R.layout.editorx_player_view_layout, (ViewGroup) this, true);
        this.iMh = (ImageView) findViewById(R.id.iv_play);
        FakeEngineLayer fakeEngineLayer = (FakeEngineLayer) findViewById(R.id.fake_engine_layer);
        this.iCR = fakeEngineLayer;
        fakeEngineLayer.setTypeFace(f.y(getContext(), R.font.oswald_n));
        if (z) {
            this.iMh.setVisibility(0);
        } else {
            this.iMh.setVisibility(8);
        }
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.surface_view);
        this.iMf = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.iMg = holder;
        if (holder != null) {
            holder.addCallback(this.iMi);
            this.iMg.setFormat(1);
        }
    }

    public void setIsPlaying(boolean z) {
        if (z) {
            this.iMh.setImageResource(R.drawable.editorx_player_pause);
        } else {
            this.iMh.setImageResource(R.drawable.editorx_player_play);
        }
    }

    public void setCoverState(boolean z) {
        ImageView imageView = this.iMh;
        if (imageView != null && this.iCR != null) {
            int i = 8;
            imageView.setVisibility(z ? 8 : 0);
            FakeEngineLayer fakeEngineLayer = this.iCR;
            if (!z) {
                i = 0;
            }
            fakeEngineLayer.setVisibility(i);
        }
    }

    public void setSize(Rect rect) {
        this.iCR.setSize(rect);
    }

    /* access modifiers changed from: private */
    public class a implements SurfaceHolder.Callback {
        private a() {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Log.e("EditorPlayerView", "Surface --> surfaceCreated==" + surfaceHolder);
            EditorPlayerView.this.iMg = surfaceHolder;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Log.e("EditorPlayerView", "Surface --> surfaceChanged:SurfaceHolder==" + surfaceHolder + "/lis:" + EditorPlayerView.this.iMl);
            EditorPlayerView.this.iMg = surfaceHolder;
            EditorPlayerView.this.iMj = i2;
            EditorPlayerView.this.iMk = i3;
            LogUtilsV2.d("PlayerAPIImplTestA: SurfaceHolder width = " + i2 + ", height = " + i3);
            if (EditorPlayerView.this.iMl != null) {
                EditorPlayerView.this.iMl.awS();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Log.e("EditorPlayerView", "Surface --> surfaceDestroyed==" + surfaceHolder);
            if (EditorPlayerView.this.iMl != null) {
                EditorPlayerView.this.iMl.awT();
            }
        }
    }

    @Override // com.quvideo.mobile.engine.project.f.a
    public SurfaceHolder getSurfaceHolder() {
        return this.iMg;
    }

    public void releaseAll() {
        SurfaceHolder surfaceHolder = this.iMg;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.iMi);
            this.iMg = null;
        }
    }

    @Override // com.quvideo.mobile.engine.project.f.a
    public int getPreviewWidth() {
        return getWidth();
    }

    @Override // com.quvideo.mobile.engine.project.f.a
    public int getPreviewHeight() {
        return getHeight();
    }

    public int getLimitWidth() {
        return getWidth() - (this.limit * 2);
    }

    public int getLimitHeight() {
        return getHeight() - (this.limit * 2);
    }

    @Override // com.quvideo.mobile.engine.project.f.a
    public void setIPlayerListener(a.AbstractC0281a aVar) {
        this.iMl = aVar;
    }

    @Override // com.quvideo.mobile.engine.project.f.a
    public Rect bY(int i, int i2) {
        int previewWidth = getPreviewWidth();
        int previewHeight = getPreviewHeight();
        int limitWidth = getLimitWidth();
        Rect rect = new Rect();
        float f = (float) i;
        float f2 = f * 1.0f;
        float f3 = (float) i2;
        float f4 = f2 / f3;
        float f5 = ((float) limitWidth) * 1.0f;
        float f6 = (float) previewHeight;
        if (f4 > f5 / f6) {
            rect.left = (previewWidth - limitWidth) / 2;
            rect.right = (limitWidth + previewWidth) / 2;
            int i3 = (int) ((f5 * f3) / f);
            rect.top = (previewHeight - i3) / 2;
            rect.bottom = (i3 + previewHeight) / 2;
        } else {
            rect.top = (previewHeight - previewHeight) / 2;
            rect.bottom = (previewHeight + previewHeight) / 2;
            int i4 = (int) ((f6 * f2) / f3);
            rect.left = (previewWidth - i4) / 2;
            rect.right = (i4 + previewWidth) / 2;
        }
        int limitHeight = getLimitHeight();
        Rect rect2 = new Rect();
        float f7 = ((float) previewWidth) * 1.0f;
        float f8 = (float) limitHeight;
        if (f4 > f7 / f8) {
            rect2.left = (previewWidth - previewWidth) / 2;
            rect2.right = (previewWidth + previewWidth) / 2;
            int i5 = (int) ((f7 * f3) / f);
            rect2.top = (previewHeight - i5) / 2;
            rect2.bottom = (previewHeight + i5) / 2;
        } else {
            rect2.top = (previewHeight - limitHeight) / 2;
            rect2.bottom = (previewHeight + limitHeight) / 2;
            int i6 = (int) ((f2 * f8) / f3);
            rect2.left = (previewWidth - i6) / 2;
            rect2.right = (previewWidth + i6) / 2;
        }
        boolean z = rect.width() * rect.height() >= rect2.width() * rect2.height();
        this.dVD = z;
        return z ? rect : rect2;
    }

    @Override // com.quvideo.mobile.engine.project.f.a
    public Rect b(VeMSize veMSize, int i, int i2) {
        int i3 = veMSize.width;
        int i4 = veMSize.height;
        int limitWidth = getLimitWidth();
        Rect rect = new Rect();
        float f = (float) i;
        float f2 = f * 1.0f;
        float f3 = (float) i2;
        float f4 = f2 / f3;
        float f5 = ((float) limitWidth) * 1.0f;
        float f6 = (float) i4;
        if (f4 > f5 / f6) {
            rect.left = (i3 - limitWidth) / 2;
            rect.right = (limitWidth + i3) / 2;
            int i5 = (int) ((f5 * f3) / f);
            rect.top = (i4 - i5) / 2;
            rect.bottom = (i5 + i4) / 2;
        } else {
            rect.top = (i4 - i4) / 2;
            rect.bottom = (i4 + i4) / 2;
            int i6 = (int) ((f6 * f2) / f3);
            rect.left = (i3 - i6) / 2;
            rect.right = (i6 + i3) / 2;
        }
        int limitHeight = getLimitHeight();
        Rect rect2 = new Rect();
        float f7 = ((float) i3) * 1.0f;
        float f8 = (float) limitHeight;
        if (f4 > f7 / f8) {
            rect2.left = (i3 - i3) / 2;
            rect2.right = (i3 + i3) / 2;
            int i7 = (int) ((f7 * f3) / f);
            rect2.top = (i4 - i7) / 2;
            rect2.bottom = (i4 + i7) / 2;
        } else {
            rect2.top = (i4 - limitHeight) / 2;
            rect2.bottom = (i4 + limitHeight) / 2;
            int i8 = (int) ((f2 * f8) / f3);
            rect2.left = (i3 - i8) / 2;
            rect2.right = (i3 + i8) / 2;
        }
        boolean z = rect.width() * rect.height() >= rect2.width() * rect2.height();
        this.dVD = z;
        return z ? rect : rect2;
    }

    @Override // com.quvideo.mobile.engine.project.f.a
    public boolean awR() {
        return this.dVD;
    }

    public int getSWidth() {
        return this.iMj;
    }

    @Override // com.quvideo.mobile.engine.project.f.a
    public int getSHeight() {
        return this.iMk;
    }
}