package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

@Deprecated
/* renamed from: eightbitlab.com.blurview.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6250g implements BlurAlgorithm {

    /* renamed from: b */
    private final RenderScript f17690b;

    /* renamed from: c */
    private final ScriptIntrinsicBlur f17691c;

    /* renamed from: d */
    private Allocation f17692d;

    /* renamed from: a */
    private final Paint f17689a = new Paint(2);

    /* renamed from: e */
    private int f17693e = -1;

    /* renamed from: f */
    private int f17694f = -1;

    public C6250g(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f17690b = create;
        this.f17691c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    /* renamed from: f */
    private boolean m23153f(Bitmap bitmap) {
        return bitmap.getHeight() == this.f17694f && bitmap.getWidth() == this.f17693e;
    }

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
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f17689a);
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    /* renamed from: d */
    public float mo23155d() {
        return 6.0f;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final void destroy() {
        this.f17691c.destroy();
        this.f17690b.destroy();
        Allocation allocation = this.f17692d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    /* renamed from: e */
    public Bitmap mo23154e(Bitmap bitmap, float f) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f17690b, bitmap);
        if (!m23153f(bitmap)) {
            Allocation allocation = this.f17692d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f17692d = Allocation.createTyped(this.f17690b, createFromBitmap.getType());
            this.f17693e = bitmap.getWidth();
            this.f17694f = bitmap.getHeight();
        }
        this.f17691c.setRadius(f);
        this.f17691c.setInput(createFromBitmap);
        this.f17691c.forEach(this.f17692d);
        this.f17692d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }
}
