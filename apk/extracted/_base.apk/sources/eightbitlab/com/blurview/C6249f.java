package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* renamed from: eightbitlab.com.blurview.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6249f implements BlurAlgorithm {

    /* renamed from: b */
    private int f17684b;

    /* renamed from: c */
    private int f17685c;

    /* renamed from: e */
    public BlurAlgorithm f17687e;

    /* renamed from: f */
    private Context f17688f;

    /* renamed from: a */
    private final RenderNode f17683a = new RenderNode("BlurViewNode");

    /* renamed from: d */
    private float f17686d = 1.0f;

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    /* renamed from: a */
    public Bitmap.Config mo23158a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    /* renamed from: b */
    public boolean mo23157b() {
        return true;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    /* renamed from: c */
    public void mo23156c(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f17683a);
            return;
        }
        if (this.f17687e == null) {
            this.f17687e = new C6250g(this.f17688f);
        }
        this.f17687e.mo23154e(bitmap, this.f17686d);
        this.f17687e.mo23156c(canvas, bitmap);
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    /* renamed from: d */
    public float mo23155d() {
        return 6.0f;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public void destroy() {
        this.f17683a.discardDisplayList();
        BlurAlgorithm blurAlgorithm = this.f17687e;
        if (blurAlgorithm != null) {
            blurAlgorithm.destroy();
        }
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    /* renamed from: e */
    public Bitmap mo23154e(Bitmap bitmap, float f) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        this.f17686d = f;
        if (bitmap.getHeight() != this.f17684b || bitmap.getWidth() != this.f17685c) {
            this.f17684b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f17685c = width;
            this.f17683a.setPosition(0, 0, width, this.f17684b);
        }
        beginRecording = this.f17683a.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f17683a.endRecording();
        RenderNode renderNode = this.f17683a;
        createBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m23159f(Context context) {
        this.f17688f = context;
    }
}
