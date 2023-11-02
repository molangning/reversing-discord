package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import bb.C2232g;
import bb.C2239k;
import bb.InterfaceC2255n;
import com.google.android.material.internal.C4911o;
import p155ia.C7480b;
import p155ia.C7489k;
import p443ya.C13957c;
import pa.C11487a;
import za.C14140a;
import za.C14143b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4791a {

    /* renamed from: t */
    private static final boolean f13243t = true;

    /* renamed from: u */
    private static final boolean f13244u = false;

    /* renamed from: a */
    private final MaterialButton f13245a;

    /* renamed from: b */
    private C2239k f13246b;

    /* renamed from: c */
    private int f13247c;

    /* renamed from: d */
    private int f13248d;

    /* renamed from: e */
    private int f13249e;

    /* renamed from: f */
    private int f13250f;

    /* renamed from: g */
    private int f13251g;

    /* renamed from: h */
    private int f13252h;

    /* renamed from: i */
    private PorterDuff.Mode f13253i;

    /* renamed from: j */
    private ColorStateList f13254j;

    /* renamed from: k */
    private ColorStateList f13255k;

    /* renamed from: l */
    private ColorStateList f13256l;

    /* renamed from: m */
    private Drawable f13257m;

    /* renamed from: n */
    private boolean f13258n = false;

    /* renamed from: o */
    private boolean f13259o = false;

    /* renamed from: p */
    private boolean f13260p = false;

    /* renamed from: q */
    private boolean f13261q;

    /* renamed from: r */
    private LayerDrawable f13262r;

    /* renamed from: s */
    private int f13263s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4791a(MaterialButton materialButton, C2239k c2239k) {
        this.f13245a = materialButton;
        this.f13246b = c2239k;
    }

    /* renamed from: E */
    private void m27627E(int i, int i2) {
        int m37248G = C1365w0.m37248G(this.f13245a);
        int paddingTop = this.f13245a.getPaddingTop();
        int m37250F = C1365w0.m37250F(this.f13245a);
        int paddingBottom = this.f13245a.getPaddingBottom();
        int i3 = this.f13249e;
        int i4 = this.f13250f;
        this.f13250f = i2;
        this.f13249e = i;
        if (!this.f13259o) {
            m27626F();
        }
        C1365w0.m37249F0(this.f13245a, m37248G, (paddingTop + i) - i3, m37250F, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    private void m27626F() {
        this.f13245a.setInternalBackground(m27622a());
        C2232g m27617f = m27617f();
        if (m27617f != null) {
            m27617f.m33920X(this.f13263s);
        }
    }

    /* renamed from: G */
    private void m27625G(C2239k c2239k) {
        if (f13244u && !this.f13259o) {
            int m37248G = C1365w0.m37248G(this.f13245a);
            int paddingTop = this.f13245a.getPaddingTop();
            int m37250F = C1365w0.m37250F(this.f13245a);
            int paddingBottom = this.f13245a.getPaddingBottom();
            m27626F();
            C1365w0.m37249F0(this.f13245a, m37248G, paddingTop, m37250F, paddingBottom);
            return;
        }
        if (m27617f() != null) {
            m27617f().setShapeAppearanceModel(c2239k);
        }
        if (m27609n() != null) {
            m27609n().setShapeAppearanceModel(c2239k);
        }
        if (m27618e() != null) {
            m27618e().setShapeAppearanceModel(c2239k);
        }
    }

    /* renamed from: H */
    private void m27624H() {
        int i;
        C2232g m27617f = m27617f();
        C2232g m27609n = m27609n();
        if (m27617f != null) {
            m27617f.m33907f0(this.f13252h, this.f13255k);
            if (m27609n != null) {
                float f = this.f13252h;
                if (this.f13258n) {
                    i = C11487a.m8016d(this.f13245a, C7480b.f20110m);
                } else {
                    i = 0;
                }
                m27609n.m33909e0(f, i);
            }
        }
    }

    /* renamed from: I */
    private InsetDrawable m27623I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f13247c, this.f13249e, this.f13248d, this.f13250f);
    }

    /* renamed from: a */
    private Drawable m27622a() {
        int i;
        C2232g c2232g = new C2232g(this.f13246b);
        c2232g.m33929O(this.f13245a.getContext());
        C1013a.m38083o(c2232g, this.f13254j);
        PorterDuff.Mode mode = this.f13253i;
        if (mode != null) {
            C1013a.m38082p(c2232g, mode);
        }
        c2232g.m33907f0(this.f13252h, this.f13255k);
        C2232g c2232g2 = new C2232g(this.f13246b);
        c2232g2.setTint(0);
        float f = this.f13252h;
        if (this.f13258n) {
            i = C11487a.m8016d(this.f13245a, C7480b.f20110m);
        } else {
            i = 0;
        }
        c2232g2.m33909e0(f, i);
        if (f13243t) {
            C2232g c2232g3 = new C2232g(this.f13246b);
            this.f13257m = c2232g3;
            C1013a.m38084n(c2232g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C14143b.m590a(this.f13256l), m27623I(new LayerDrawable(new Drawable[]{c2232g2, c2232g})), this.f13257m);
            this.f13262r = rippleDrawable;
            return rippleDrawable;
        }
        C14140a c14140a = new C14140a(this.f13246b);
        this.f13257m = c14140a;
        C1013a.m38083o(c14140a, C14143b.m590a(this.f13256l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c2232g2, c2232g, this.f13257m});
        this.f13262r = layerDrawable;
        return m27623I(layerDrawable);
    }

    /* renamed from: g */
    private C2232g m27616g(boolean z) {
        LayerDrawable layerDrawable = this.f13262r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (f13243t) {
                return (C2232g) ((LayerDrawable) ((InsetDrawable) this.f13262r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
            }
            return (C2232g) this.f13262r.getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    /* renamed from: n */
    private C2232g m27609n() {
        return m27616g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m27631A(ColorStateList colorStateList) {
        if (this.f13255k != colorStateList) {
            this.f13255k = colorStateList;
            m27624H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m27630B(int i) {
        if (this.f13252h != i) {
            this.f13252h = i;
            m27624H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m27629C(ColorStateList colorStateList) {
        if (this.f13254j != colorStateList) {
            this.f13254j = colorStateList;
            if (m27617f() != null) {
                C1013a.m38083o(m27617f(), this.f13254j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m27628D(PorterDuff.Mode mode) {
        if (this.f13253i != mode) {
            this.f13253i = mode;
            if (m27617f() != null && this.f13253i != null) {
                C1013a.m38082p(m27617f(), this.f13253i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m27621b() {
        return this.f13251g;
    }

    /* renamed from: c */
    public int m27620c() {
        return this.f13250f;
    }

    /* renamed from: d */
    public int m27619d() {
        return this.f13249e;
    }

    /* renamed from: e */
    public InterfaceC2255n m27618e() {
        LayerDrawable layerDrawable = this.f13262r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.f13262r.getNumberOfLayers() > 2) {
                return (InterfaceC2255n) this.f13262r.getDrawable(2);
            }
            return (InterfaceC2255n) this.f13262r.getDrawable(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C2232g m27617f() {
        return m27616g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList m27615h() {
        return this.f13256l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C2239k m27614i() {
        return this.f13246b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m27613j() {
        return this.f13255k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m27612k() {
        return this.f13252h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m27611l() {
        return this.f13254j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode m27610m() {
        return this.f13253i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m27608o() {
        return this.f13259o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m27607p() {
        return this.f13261q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m27606q(TypedArray typedArray) {
        this.f13247c = typedArray.getDimensionPixelOffset(C7489k.f20677x2, 0);
        this.f13248d = typedArray.getDimensionPixelOffset(C7489k.f20685y2, 0);
        this.f13249e = typedArray.getDimensionPixelOffset(C7489k.f20693z2, 0);
        this.f13250f = typedArray.getDimensionPixelOffset(C7489k.f20289A2, 0);
        int i = C7489k.f20321E2;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f13251g = dimensionPixelSize;
            m27598y(this.f13246b.m33852w(dimensionPixelSize));
            this.f13260p = true;
        }
        this.f13252h = typedArray.getDimensionPixelSize(C7489k.f20401O2, 0);
        this.f13253i = C4911o.m26932f(typedArray.getInt(C7489k.f20313D2, -1), PorterDuff.Mode.SRC_IN);
        this.f13254j = C13957c.m1089a(this.f13245a.getContext(), typedArray, C7489k.f20305C2);
        this.f13255k = C13957c.m1089a(this.f13245a.getContext(), typedArray, C7489k.f20393N2);
        this.f13256l = C13957c.m1089a(this.f13245a.getContext(), typedArray, C7489k.f20385M2);
        this.f13261q = typedArray.getBoolean(C7489k.f20297B2, false);
        this.f13263s = typedArray.getDimensionPixelSize(C7489k.f20329F2, 0);
        int m37248G = C1365w0.m37248G(this.f13245a);
        int paddingTop = this.f13245a.getPaddingTop();
        int m37250F = C1365w0.m37250F(this.f13245a);
        int paddingBottom = this.f13245a.getPaddingBottom();
        if (typedArray.hasValue(C7489k.f20669w2)) {
            m27604s();
        } else {
            m27626F();
        }
        C1365w0.m37249F0(this.f13245a, m37248G + this.f13247c, paddingTop + this.f13249e, m37250F + this.f13248d, paddingBottom + this.f13250f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m27605r(int i) {
        if (m27617f() != null) {
            m27617f().setTint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m27604s() {
        this.f13259o = true;
        this.f13245a.setSupportBackgroundTintList(this.f13254j);
        this.f13245a.setSupportBackgroundTintMode(this.f13253i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m27603t(boolean z) {
        this.f13261q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m27602u(int i) {
        if (!this.f13260p || this.f13251g != i) {
            this.f13251g = i;
            this.f13260p = true;
            m27598y(this.f13246b.m33852w(i));
        }
    }

    /* renamed from: v */
    public void m27601v(int i) {
        m27627E(this.f13249e, i);
    }

    /* renamed from: w */
    public void m27600w(int i) {
        m27627E(i, this.f13250f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m27599x(ColorStateList colorStateList) {
        if (this.f13256l != colorStateList) {
            this.f13256l = colorStateList;
            boolean z = f13243t;
            if (z && (this.f13245a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f13245a.getBackground()).setColor(C14143b.m590a(colorStateList));
            } else if (!z && (this.f13245a.getBackground() instanceof C14140a)) {
                ((C14140a) this.f13245a.getBackground()).setTintList(C14143b.m590a(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m27598y(C2239k c2239k) {
        this.f13246b = c2239k;
        m27625G(c2239k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m27597z(boolean z) {
        this.f13258n = z;
        m27624H();
    }
}
