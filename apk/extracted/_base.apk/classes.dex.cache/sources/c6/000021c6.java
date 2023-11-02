package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C3612e;
import com.facebook.drawee.drawable.C3614f;
import com.facebook.drawee.drawable.C3615g;
import com.facebook.drawee.drawable.C3624n;
import com.facebook.drawee.drawable.InterfaceC3610c;
import com.facebook.drawee.drawable.ScalingUtils;
import p006a5.C0025b;
import p345t3.C12575b;
import p379v3.InterfaceC13059a;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GenericDraweeHierarchy implements InterfaceC13059a {

    /* renamed from: a */
    private final Drawable f9958a;

    /* renamed from: b */
    private final Resources f9959b;

    /* renamed from: c */
    private C3628a f9960c;

    /* renamed from: d */
    private final C12575b f9961d;

    /* renamed from: e */
    private final C3612e f9962e;

    /* renamed from: f */
    private final C3614f f9963f;

    public GenericDraweeHierarchy(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        int i;
        int i2;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f9958a = colorDrawable;
        if (C0025b.m41375d()) {
            C0025b.m41378a("GenericDraweeHierarchy()");
        }
        this.f9959b = genericDraweeHierarchyBuilder.m31432p();
        this.f9960c = genericDraweeHierarchyBuilder.m31429s();
        C3614f c3614f = new C3614f(colorDrawable);
        this.f9963f = c3614f;
        int i3 = 1;
        if (genericDraweeHierarchyBuilder.m31438j() != null) {
            i = genericDraweeHierarchyBuilder.m31438j().size();
        } else {
            i = 1;
        }
        i = i == 0 ? 1 : i;
        if (genericDraweeHierarchyBuilder.m31435m() != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        Drawable[] drawableArr = new Drawable[i4 + 6];
        drawableArr[0] = m31478h(genericDraweeHierarchyBuilder.m31443e(), null);
        drawableArr[1] = m31478h(genericDraweeHierarchyBuilder.m31437k(), genericDraweeHierarchyBuilder.m31436l());
        drawableArr[2] = m31479g(c3614f, genericDraweeHierarchyBuilder.m31444d(), genericDraweeHierarchyBuilder.m31445c(), genericDraweeHierarchyBuilder.m31446b());
        drawableArr[3] = m31478h(genericDraweeHierarchyBuilder.m31434n(), genericDraweeHierarchyBuilder.m31433o());
        drawableArr[4] = m31478h(genericDraweeHierarchyBuilder.m31431q(), genericDraweeHierarchyBuilder.m31430r());
        drawableArr[5] = m31478h(genericDraweeHierarchyBuilder.m31440h(), genericDraweeHierarchyBuilder.m31439i());
        if (i4 > 0) {
            if (genericDraweeHierarchyBuilder.m31438j() != null) {
                i3 = 0;
                for (Drawable drawable : genericDraweeHierarchyBuilder.m31438j()) {
                    drawableArr[i3 + 6] = m31478h(drawable, null);
                    i3++;
                }
            }
            if (genericDraweeHierarchyBuilder.m31435m() != null) {
                drawableArr[i3 + 6] = m31478h(genericDraweeHierarchyBuilder.m31435m(), null);
            }
        }
        C3612e c3612e = new C3612e(drawableArr, false, 2);
        this.f9962e = c3612e;
        c3612e.m31510r(genericDraweeHierarchyBuilder.m31441g());
        C12575b c12575b = new C12575b(C3630b.m31396e(c3612e, this.f9960c));
        this.f9961d = c12575b;
        c12575b.mutate();
        m31467s();
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* renamed from: B */
    private void m31482B(float f) {
        Drawable m31533b = this.f9962e.m31533b(3);
        if (m31533b == null) {
            return;
        }
        if (f >= 0.999f) {
            if (m31533b instanceof Animatable) {
                ((Animatable) m31533b).stop();
            }
            m31475k(3);
        } else {
            if (m31533b instanceof Animatable) {
                ((Animatable) m31533b).start();
            }
            m31477i(3);
        }
        m31533b.setLevel(Math.round(f * 10000.0f));
    }

    /* renamed from: g */
    private Drawable m31479g(Drawable drawable, ScalingUtils.ScaleType scaleType, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C3630b.m31394g(drawable, scaleType, pointF);
    }

    /* renamed from: h */
    private Drawable m31478h(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        return C3630b.m31395f(C3630b.m31397d(drawable, this.f9960c, this.f9959b), scaleType);
    }

    /* renamed from: i */
    private void m31477i(int i) {
        if (i >= 0) {
            this.f9962e.m31518j(i);
        }
    }

    /* renamed from: j */
    private void m31476j() {
        m31475k(1);
        m31475k(2);
        m31475k(3);
        m31475k(4);
        m31475k(5);
    }

    /* renamed from: k */
    private void m31475k(int i) {
        if (i >= 0) {
            this.f9962e.m31517k(i);
        }
    }

    /* renamed from: n */
    private InterfaceC3610c m31472n(int i) {
        InterfaceC3610c m31532c = this.f9962e.m31532c(i);
        if (m31532c.getDrawable() instanceof C3615g) {
            m31532c = (C3615g) m31532c.getDrawable();
        }
        if (m31532c.getDrawable() instanceof C3624n) {
            return (C3624n) m31532c.getDrawable();
        }
        return m31532c;
    }

    /* renamed from: p */
    private C3624n m31470p(int i) {
        InterfaceC3610c m31472n = m31472n(i);
        if (m31472n instanceof C3624n) {
            return (C3624n) m31472n;
        }
        return C3630b.m31390k(m31472n, ScalingUtils.ScaleType.f9836a);
    }

    /* renamed from: q */
    private boolean m31469q(int i) {
        return m31472n(i) instanceof C3624n;
    }

    /* renamed from: r */
    private void m31468r() {
        this.f9963f.setDrawable(this.f9958a);
    }

    /* renamed from: s */
    private void m31467s() {
        C3612e c3612e = this.f9962e;
        if (c3612e != null) {
            c3612e.m31522f();
            this.f9962e.m31519i();
            m31476j();
            m31477i(1);
            this.f9962e.m31516l();
            this.f9962e.m31520h();
        }
    }

    /* renamed from: v */
    private void m31464v(int i, Drawable drawable) {
        if (drawable == null) {
            this.f9962e.m31530e(i, null);
            return;
        }
        m31472n(i).setDrawable(C3630b.m31397d(drawable, this.f9960c, this.f9959b));
    }

    /* renamed from: A */
    public void m31483A(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        m31464v(1, drawable);
        m31470p(1).m31484m(scaleType);
    }

    /* renamed from: C */
    public void m31481C(Drawable drawable) {
        m31464v(3, drawable);
    }

    /* renamed from: D */
    public void m31480D(C3628a c3628a) {
        this.f9960c = c3628a;
        C3630b.m31391j(this.f9961d, c3628a);
        for (int i = 0; i < this.f9962e.m31531d(); i++) {
            C3630b.m31392i(m31472n(i), this.f9960c, this.f9959b);
        }
    }

    @Override // p379v3.InterfaceC13059a
    /* renamed from: a */
    public void mo3379a(Throwable th2) {
        this.f9962e.m31522f();
        m31476j();
        if (this.f9962e.m31533b(4) != null) {
            m31477i(4);
        } else {
            m31477i(1);
        }
        this.f9962e.m31520h();
    }

    @Override // p379v3.InterfaceC13059a
    /* renamed from: b */
    public void mo3378b(Throwable th2) {
        this.f9962e.m31522f();
        m31476j();
        if (this.f9962e.m31533b(5) != null) {
            m31477i(5);
        } else {
            m31477i(1);
        }
        this.f9962e.m31520h();
    }

    @Override // p379v3.InterfaceC13059a
    /* renamed from: c */
    public void mo3377c(float f, boolean z) {
        if (this.f9962e.m31533b(3) == null) {
            return;
        }
        this.f9962e.m31522f();
        m31482B(f);
        if (z) {
            this.f9962e.m31516l();
        }
        this.f9962e.m31520h();
    }

    @Override // com.facebook.drawee.interfaces.DraweeHierarchy
    /* renamed from: d */
    public Drawable mo31384d() {
        return this.f9961d;
    }

    @Override // p379v3.InterfaceC13059a
    /* renamed from: e */
    public void mo3376e(Drawable drawable, float f, boolean z) {
        Drawable m31397d = C3630b.m31397d(drawable, this.f9960c, this.f9959b);
        m31397d.mutate();
        this.f9963f.setDrawable(m31397d);
        this.f9962e.m31522f();
        m31476j();
        m31477i(2);
        m31482B(f);
        if (z) {
            this.f9962e.m31516l();
        }
        this.f9962e.m31520h();
    }

    @Override // p379v3.InterfaceC13059a
    /* renamed from: f */
    public void mo3375f(Drawable drawable) {
        this.f9961d.m4773h(drawable);
    }

    @Override // com.facebook.drawee.interfaces.DraweeHierarchy
    public Rect getBounds() {
        return this.f9961d.getBounds();
    }

    /* renamed from: l */
    public PointF m31474l() {
        if (!m31469q(2)) {
            return null;
        }
        return m31470p(2).m31487j();
    }

    /* renamed from: m */
    public ScalingUtils.ScaleType m31473m() {
        if (!m31469q(2)) {
            return null;
        }
        return m31470p(2).m31486k();
    }

    /* renamed from: o */
    public C3628a m31471o() {
        return this.f9960c;
    }

    @Override // p379v3.InterfaceC13059a
    public void reset() {
        m31468r();
        m31467s();
    }

    /* renamed from: t */
    public void m31466t(ScalingUtils.ScaleType scaleType) {
        C13379j.m2677g(scaleType);
        m31470p(2).m31484m(scaleType);
    }

    /* renamed from: u */
    public void m31465u(Drawable drawable) {
        m31464v(0, drawable);
    }

    /* renamed from: w */
    public void m31463w(int i) {
        this.f9962e.m31510r(i);
    }

    /* renamed from: x */
    public void m31462x(int i, Drawable drawable) {
        boolean z;
        if (i >= 0 && i + 6 < this.f9962e.m31531d()) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2681c(z, "The given index does not correspond to an overlay image.");
        m31464v(i + 6, drawable);
    }

    /* renamed from: y */
    public void m31461y(Drawable drawable) {
        m31462x(0, drawable);
    }

    /* renamed from: z */
    public void m31460z(Drawable drawable) {
        m31464v(1, drawable);
    }
}