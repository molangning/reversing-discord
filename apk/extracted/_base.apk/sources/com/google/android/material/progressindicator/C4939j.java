package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.vectordrawable.graphics.drawable.AbstractC1905b;
import com.google.android.material.progressindicator.AbstractC4923b;

/* renamed from: com.google.android.material.progressindicator.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4939j<S extends AbstractC4923b> extends AbstractC4933g {

    /* renamed from: y */
    private AbstractC4937h<S> f13864y;

    /* renamed from: z */
    private AbstractC4938i<ObjectAnimator> f13865z;

    C4939j(Context context, AbstractC4923b abstractC4923b, AbstractC4937h<S> abstractC4937h, AbstractC4938i<ObjectAnimator> abstractC4938i) {
        super(context, abstractC4923b);
        m26833w(abstractC4937h);
        m26834v(abstractC4938i);
    }

    /* renamed from: s */
    public static C4939j<C4930e> m26837s(Context context, C4930e c4930e) {
        return new C4939j<>(context, c4930e, new C4924c(c4930e), new C4925d(c4930e));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f13864y.m26853g(canvas, m26866g());
            this.f13864y.mo26857c(canvas, this.f13855v);
            int i = 0;
            while (true) {
                AbstractC4938i<ObjectAnimator> abstractC4938i = this.f13865z;
                int[] iArr = abstractC4938i.f13863c;
                if (i < iArr.length) {
                    AbstractC4937h<S> abstractC4937h = this.f13864y;
                    Paint paint = this.f13855v;
                    float[] fArr = abstractC4938i.f13862b;
                    int i2 = i * 2;
                    abstractC4937h.mo26858b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f13864y.mo26856d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f13864y.mo26855e();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g
    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo26844h() {
        return super.mo26844h();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g
    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo26843i() {
        return super.mo26843i();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g
    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo26842j() {
        return super.mo26842j();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo26841l(AbstractC1905b abstractC1905b) {
        super.mo26841l(abstractC1905b);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g
    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo26840p(boolean z, boolean z2, boolean z3) {
        return super.mo26840p(z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC4933g
    /* renamed from: q */
    public boolean mo26839q(boolean z, boolean z2, boolean z3) {
        boolean mo26839q = super.mo26839q(z, z2, z3);
        if (!isRunning()) {
            this.f13865z.mo26852a();
        }
        this.f13845l.m2425a(this.f13843j.getContentResolver());
        if (z && z3) {
            this.f13865z.mo26846g();
        }
        return mo26839q;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g
    /* renamed from: r */
    public /* bridge */ /* synthetic */ boolean mo26838r(AbstractC1905b abstractC1905b) {
        return super.mo26838r(abstractC1905b);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public AbstractC4938i<ObjectAnimator> m26836t() {
        return this.f13865z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public AbstractC4937h<S> m26835u() {
        return this.f13864y;
    }

    /* renamed from: v */
    void m26834v(AbstractC4938i<ObjectAnimator> abstractC4938i) {
        this.f13865z = abstractC4938i;
        abstractC4938i.m26848e(this);
    }

    /* renamed from: w */
    void m26833w(AbstractC4937h<S> abstractC4937h) {
        this.f13864y = abstractC4937h;
        abstractC4937h.m26854f(this);
    }
}
