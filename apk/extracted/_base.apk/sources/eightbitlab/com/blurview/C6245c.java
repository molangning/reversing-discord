package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import eightbitlab.com.blurview.C6251h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: eightbitlab.com.blurview.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6245c implements BlurController {

    /* renamed from: b */
    private final BlurAlgorithm f17668b;

    /* renamed from: c */
    private C6243a f17669c;

    /* renamed from: d */
    private Bitmap f17670d;

    /* renamed from: e */
    final BlurView f17671e;

    /* renamed from: f */
    private int f17672f;

    /* renamed from: g */
    private final ViewGroup f17673g;

    /* renamed from: l */
    private boolean f17678l;

    /* renamed from: m */
    private Drawable f17679m;

    /* renamed from: a */
    private float f17667a = 16.0f;

    /* renamed from: h */
    private final int[] f17674h = new int[2];

    /* renamed from: i */
    private final int[] f17675i = new int[2];

    /* renamed from: j */
    private final ViewTreeObserver.OnPreDrawListener f17676j = new ViewTreeObserver$OnPreDrawListenerC6246a();

    /* renamed from: k */
    private boolean f17677k = true;

    /* renamed from: eightbitlab.com.blurview.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class ViewTreeObserver$OnPreDrawListenerC6246a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC6246a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C6245c.this.m23161k();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6245c(BlurView blurView, ViewGroup viewGroup, int i, BlurAlgorithm blurAlgorithm) {
        this.f17673g = viewGroup;
        this.f17671e = blurView;
        this.f17672f = i;
        this.f17668b = blurAlgorithm;
        if (blurAlgorithm instanceof C6249f) {
            ((C6249f) blurAlgorithm).m23159f(blurView.getContext());
        }
        m23163i(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    /* renamed from: h */
    private void m23164h() {
        this.f17670d = this.f17668b.mo23154e(this.f17670d, this.f17667a);
        if (!this.f17668b.mo23157b()) {
            this.f17669c.setBitmap(this.f17670d);
        }
    }

    /* renamed from: j */
    private void m23162j() {
        this.f17673g.getLocationOnScreen(this.f17674h);
        this.f17671e.getLocationOnScreen(this.f17675i);
        int[] iArr = this.f17675i;
        int i = iArr[0];
        int[] iArr2 = this.f17674h;
        int i2 = i - iArr2[0];
        int i3 = iArr[1] - iArr2[1];
        float height = this.f17671e.getHeight() / this.f17670d.getHeight();
        float width = this.f17671e.getWidth() / this.f17670d.getWidth();
        this.f17669c.translate((-i2) / width, (-i3) / height);
        this.f17669c.scale(1.0f / width, 1.0f / height);
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    /* renamed from: a */
    public BlurViewFacade mo23171a(int i) {
        if (this.f17672f != i) {
            this.f17672f = i;
            this.f17671e.invalidate();
        }
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    /* renamed from: b */
    public BlurViewFacade mo23170b(boolean z) {
        this.f17677k = z;
        mo23169c(z);
        this.f17671e.invalidate();
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    /* renamed from: c */
    public BlurViewFacade mo23169c(boolean z) {
        this.f17673g.getViewTreeObserver().removeOnPreDrawListener(this.f17676j);
        if (z) {
            this.f17673g.getViewTreeObserver().addOnPreDrawListener(this.f17676j);
        }
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    /* renamed from: d */
    public BlurViewFacade mo23168d(Drawable drawable) {
        this.f17679m = drawable;
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurController
    public void destroy() {
        mo23169c(false);
        this.f17668b.destroy();
        this.f17678l = false;
    }

    @Override // eightbitlab.com.blurview.BlurController
    /* renamed from: e */
    public void mo23167e() {
        m23163i(this.f17671e.getMeasuredWidth(), this.f17671e.getMeasuredHeight());
    }

    @Override // eightbitlab.com.blurview.BlurController
    /* renamed from: f */
    public boolean mo23166f(Canvas canvas) {
        if (this.f17677k && this.f17678l) {
            if (canvas instanceof C6243a) {
                return false;
            }
            float height = this.f17671e.getHeight() / this.f17670d.getHeight();
            canvas.save();
            canvas.scale(this.f17671e.getWidth() / this.f17670d.getWidth(), height);
            this.f17668b.mo23156c(canvas, this.f17670d);
            canvas.restore();
            int i = this.f17672f;
            if (i != 0) {
                canvas.drawColor(i);
            }
        }
        return true;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    /* renamed from: g */
    public BlurViewFacade mo23165g(float f) {
        this.f17667a = f;
        return this;
    }

    /* renamed from: i */
    void m23163i(int i, int i2) {
        mo23169c(true);
        C6251h c6251h = new C6251h(this.f17668b.mo23155d());
        if (c6251h.m23151b(i, i2)) {
            this.f17671e.setWillNotDraw(true);
            return;
        }
        this.f17671e.setWillNotDraw(false);
        C6251h.C6252a m23149d = c6251h.m23149d(i, i2);
        this.f17670d = Bitmap.createBitmap(m23149d.f17696a, m23149d.f17697b, this.f17668b.mo23158a());
        this.f17669c = new C6243a(this.f17670d);
        this.f17678l = true;
        m23161k();
    }

    /* renamed from: k */
    void m23161k() {
        if (this.f17677k && this.f17678l) {
            Drawable drawable = this.f17679m;
            if (drawable == null) {
                this.f17670d.eraseColor(0);
            } else {
                drawable.draw(this.f17669c);
            }
            this.f17669c.save();
            m23162j();
            this.f17673g.draw(this.f17669c);
            this.f17669c.restore();
            m23164h();
        }
    }
}
