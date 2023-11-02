package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.dynamicanimation.animation.C1485c;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.vectordrawable.graphics.drawable.AbstractC1905b;
import com.google.android.material.progressindicator.AbstractC4923b;
import p053d0.AbstractC5716a;
import pa.C11487a;

/* renamed from: com.google.android.material.progressindicator.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4931f<S extends AbstractC4923b> extends AbstractC4933g {

    /* renamed from: D */
    private static final AbstractC5716a<C4931f> f13836D = new C4932a("indicatorLevel");

    /* renamed from: A */
    private final SpringAnimation f13837A;

    /* renamed from: B */
    private float f13838B;

    /* renamed from: C */
    private boolean f13839C;

    /* renamed from: y */
    private AbstractC4937h<S> f13840y;

    /* renamed from: z */
    private final C1485c f13841z;

    /* renamed from: com.google.android.material.progressindicator.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4932a extends AbstractC5716a<C4931f> {
        C4932a(String str) {
            super(str);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(C4931f c4931f) {
            return c4931f.m26878w() * 10000.0f;
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(C4931f c4931f, float f) {
            c4931f.m26876y(f / 10000.0f);
        }
    }

    C4931f(Context context, AbstractC4923b abstractC4923b, AbstractC4937h<S> abstractC4937h) {
        super(context, abstractC4923b);
        this.f13839C = false;
        m26877x(abstractC4937h);
        C1485c c1485c = new C1485c();
        this.f13841z = c1485c;
        c1485c.m36686d(1.0f);
        c1485c.m36684f(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, f13836D);
        this.f13837A = springAnimation;
        springAnimation.m36743s(c1485c);
        m26864m(1.0f);
    }

    /* renamed from: u */
    public static C4931f<C4930e> m26880u(Context context, C4930e c4930e) {
        return new C4931f<>(context, c4930e, new C4924c(c4930e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public float m26878w() {
        return this.f13838B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m26876y(float f) {
        this.f13838B = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f13840y.m26853g(canvas, m26866g());
            this.f13840y.mo26857c(canvas, this.f13855v);
            this.f13840y.mo26858b(canvas, this.f13855v, 0.0f, m26878w(), C11487a.m8019a(this.f13844k.f13810c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f13840y.mo26856d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f13840y.mo26855e();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f13837A.m36742t();
        m26876y(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4933g
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo26841l(AbstractC1905b abstractC1905b) {
        super.mo26841l(abstractC1905b);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f13839C) {
            this.f13837A.m36742t();
            m26876y(i / 10000.0f);
            return true;
        }
        this.f13837A.m36724i(m26878w() * 10000.0f);
        this.f13837A.m36748n(i);
        return true;
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
        float m2425a = this.f13845l.m2425a(this.f13843j.getContentResolver());
        if (m2425a == 0.0f) {
            this.f13839C = true;
        } else {
            this.f13839C = false;
            this.f13841z.m36684f(50.0f / m2425a);
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
    /* renamed from: v */
    public AbstractC4937h<S> m26879v() {
        return this.f13840y;
    }

    /* renamed from: x */
    void m26877x(AbstractC4937h<S> abstractC4937h) {
        this.f13840y = abstractC4937h;
        abstractC4937h.m26854f(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m26875z(float f) {
        setLevel((int) (f * 10000.0f));
    }
}
