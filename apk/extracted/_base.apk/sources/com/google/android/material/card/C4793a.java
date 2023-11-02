package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import bb.C2229d;
import bb.C2230e;
import bb.C2232g;
import bb.C2238j;
import bb.C2239k;
import p155ia.C7480b;
import p155ia.C7484f;
import p155ia.C7488j;
import p155ia.C7489k;
import p443ya.C13957c;
import pa.C11487a;
import za.C14143b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.card.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4793a {

    /* renamed from: u */
    private static final double f13272u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: v */
    private static final Drawable f13273v;

    /* renamed from: a */
    private final MaterialCardView f13274a;

    /* renamed from: c */
    private final C2232g f13276c;

    /* renamed from: d */
    private final C2232g f13277d;

    /* renamed from: e */
    private int f13278e;

    /* renamed from: f */
    private int f13279f;

    /* renamed from: g */
    private int f13280g;

    /* renamed from: h */
    private int f13281h;

    /* renamed from: i */
    private Drawable f13282i;

    /* renamed from: j */
    private Drawable f13283j;

    /* renamed from: k */
    private ColorStateList f13284k;

    /* renamed from: l */
    private ColorStateList f13285l;

    /* renamed from: m */
    private C2239k f13286m;

    /* renamed from: n */
    private ColorStateList f13287n;

    /* renamed from: o */
    private Drawable f13288o;

    /* renamed from: p */
    private LayerDrawable f13289p;

    /* renamed from: q */
    private C2232g f13290q;

    /* renamed from: r */
    private C2232g f13291r;

    /* renamed from: t */
    private boolean f13293t;

    /* renamed from: b */
    private final Rect f13275b = new Rect();

    /* renamed from: s */
    private boolean f13292s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.card.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4794a extends InsetDrawable {
        C4794a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f13273v = colorDrawable;
    }

    public C4793a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f13274a = materialCardView;
        C2232g c2232g = new C2232g(materialCardView.getContext(), attributeSet, i, i2);
        this.f13276c = c2232g;
        c2232g.m33929O(materialCardView.getContext());
        c2232g.m33911d0(-12303292);
        C2239k.C2241b m33853v = c2232g.m33939E().m33853v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C7489k.f20587m0, i, C7488j.f20264a);
        int i3 = C7489k.f20595n0;
        if (obtainStyledAttributes.hasValue(i3)) {
            m33853v.m33829o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f13277d = new C2232g();
        m27570V(m33853v.m33831m());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    private Drawable m27590B(Drawable drawable) {
        int i;
        int i2;
        if (this.f13274a.getUseCompatPadding()) {
            i2 = (int) Math.ceil(m27559d());
            i = (int) Math.ceil(m27561c());
        } else {
            i = 0;
            i2 = 0;
        }
        return new C4794a(drawable, i, i2, i, i2);
    }

    /* renamed from: E */
    private boolean m27587E() {
        return (this.f13280g & 80) == 80;
    }

    /* renamed from: F */
    private boolean m27586F() {
        return (this.f13280g & 8388613) == 8388613;
    }

    /* renamed from: Z */
    private boolean m27566Z() {
        return this.f13274a.getPreventCornerOverlap() && !m27557e();
    }

    /* renamed from: a */
    private float m27565a() {
        return Math.max(Math.max(m27563b(this.f13286m.m33858q(), this.f13276c.m33936H()), m27563b(this.f13286m.m33856s(), this.f13276c.m33935I())), Math.max(m27563b(this.f13286m.m33864k(), this.f13276c.m33889t()), m27563b(this.f13286m.m33866i(), this.f13276c.m33890s())));
    }

    /* renamed from: a0 */
    private boolean m27564a0() {
        if (this.f13274a.getPreventCornerOverlap() && m27557e() && this.f13274a.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private float m27563b(C2229d c2229d, float f) {
        if (c2229d instanceof C2238j) {
            return (float) ((1.0d - f13272u) * f);
        }
        if (c2229d instanceof C2230e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    private float m27561c() {
        float f;
        float maxCardElevation = this.f13274a.getMaxCardElevation();
        if (m27564a0()) {
            f = m27565a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: d */
    private float m27559d() {
        float f;
        float maxCardElevation = this.f13274a.getMaxCardElevation() * 1.5f;
        if (m27564a0()) {
            f = m27565a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: e */
    private boolean m27557e() {
        return this.f13276c.m33926R();
    }

    /* renamed from: e0 */
    private void m27556e0(Drawable drawable) {
        if (this.f13274a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f13274a.getForeground()).setDrawable(drawable);
        } else {
            this.f13274a.setForeground(m27590B(drawable));
        }
    }

    /* renamed from: f */
    private Drawable m27555f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C2232g m27551h = m27551h();
        this.f13290q = m27551h;
        m27551h.m33919Y(this.f13284k);
        stateListDrawable.addState(new int[]{16842919}, this.f13290q);
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m27553g() {
        if (C14143b.f36375a) {
            this.f13291r = m27551h();
            return new RippleDrawable(this.f13284k, null, this.f13291r);
        }
        return m27555f();
    }

    /* renamed from: g0 */
    private void m27552g0() {
        Drawable drawable;
        if (C14143b.f36375a && (drawable = this.f13288o) != null) {
            ((RippleDrawable) drawable).setColor(this.f13284k);
            return;
        }
        C2232g c2232g = this.f13290q;
        if (c2232g != null) {
            c2232g.m33919Y(this.f13284k);
        }
    }

    /* renamed from: h */
    private C2232g m27551h() {
        return new C2232g(this.f13286m);
    }

    /* renamed from: r */
    private Drawable m27540r() {
        if (this.f13288o == null) {
            this.f13288o = m27553g();
        }
        if (this.f13289p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f13288o, this.f13277d, this.f13283j});
            this.f13289p = layerDrawable;
            layerDrawable.setId(2, C7484f.f20226z);
        }
        return this.f13289p;
    }

    /* renamed from: t */
    private float m27538t() {
        if (this.f13274a.getPreventCornerOverlap() && this.f13274a.getUseCompatPadding()) {
            return (float) ((1.0d - f13272u) * this.f13274a.getCardViewRadius());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public Rect m27591A() {
        return this.f13275b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m27589C() {
        return this.f13292s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m27588D() {
        return this.f13293t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m27585G(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList m1089a = C13957c.m1089a(this.f13274a.getContext(), typedArray, C7489k.f20670w3);
        this.f13287n = m1089a;
        if (m1089a == null) {
            this.f13287n = ColorStateList.valueOf(-1);
        }
        this.f13281h = typedArray.getDimensionPixelSize(C7489k.f20678x3, 0);
        boolean z = typedArray.getBoolean(C7489k.f20606o3, false);
        this.f13293t = z;
        this.f13274a.setLongClickable(z);
        this.f13285l = C13957c.m1089a(this.f13274a.getContext(), typedArray, C7489k.f20654u3);
        m27578N(C13957c.m1086d(this.f13274a.getContext(), typedArray, C7489k.f20622q3));
        m27575Q(typedArray.getDimensionPixelSize(C7489k.f20646t3, 0));
        m27576P(typedArray.getDimensionPixelSize(C7489k.f20638s3, 0));
        this.f13280g = typedArray.getInteger(C7489k.f20630r3, 8388661);
        ColorStateList m1089a2 = C13957c.m1089a(this.f13274a.getContext(), typedArray, C7489k.f20662v3);
        this.f13284k = m1089a2;
        if (m1089a2 == null) {
            this.f13284k = ColorStateList.valueOf(C11487a.m8016d(this.f13274a, C7480b.f20106i));
        }
        m27581K(C13957c.m1089a(this.f13274a.getContext(), typedArray, C7489k.f20614p3));
        m27552g0();
        m27558d0();
        m27550h0();
        this.f13274a.setBackgroundInternal(m27590B(this.f13276c));
        if (this.f13274a.isClickable()) {
            drawable = m27540r();
        } else {
            drawable = this.f13277d;
        }
        this.f13282i = drawable;
        this.f13274a.setForeground(m27590B(drawable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m27584H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f13289p != null) {
            if (this.f13274a.getUseCompatPadding()) {
                i3 = (int) Math.ceil(m27559d() * 2.0f);
                i4 = (int) Math.ceil(m27561c() * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (m27586F()) {
                i5 = ((i - this.f13278e) - this.f13279f) - i4;
            } else {
                i5 = this.f13278e;
            }
            if (m27587E()) {
                i6 = this.f13278e;
            } else {
                i6 = ((i2 - this.f13278e) - this.f13279f) - i3;
            }
            int i11 = i6;
            if (m27586F()) {
                i7 = this.f13278e;
            } else {
                i7 = ((i - this.f13278e) - this.f13279f) - i4;
            }
            if (m27587E()) {
                i8 = ((i2 - this.f13278e) - this.f13279f) - i3;
            } else {
                i8 = this.f13278e;
            }
            int i12 = i8;
            if (C1365w0.m37258B(this.f13274a) == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.f13289p.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m27583I(boolean z) {
        this.f13292s = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m27582J(ColorStateList colorStateList) {
        this.f13276c.m33919Y(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m27581K(ColorStateList colorStateList) {
        C2232g c2232g = this.f13277d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c2232g.m33919Y(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m27580L(boolean z) {
        this.f13293t = z;
    }

    /* renamed from: M */
    public void m27579M(boolean z) {
        int i;
        Drawable drawable = this.f13283j;
        if (drawable != null) {
            if (z) {
                i = 255;
            } else {
                i = 0;
            }
            drawable.setAlpha(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m27578N(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = C1013a.m38080r(drawable).mutate();
            this.f13283j = mutate;
            C1013a.m38083o(mutate, this.f13285l);
            m27579M(this.f13274a.isChecked());
        } else {
            this.f13283j = f13273v;
        }
        LayerDrawable layerDrawable = this.f13289p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C7484f.f20226z, this.f13283j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m27577O(int i) {
        this.f13280g = i;
        m27584H(this.f13274a.getMeasuredWidth(), this.f13274a.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m27576P(int i) {
        this.f13278e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m27575Q(int i) {
        this.f13279f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m27574R(ColorStateList colorStateList) {
        this.f13285l = colorStateList;
        Drawable drawable = this.f13283j;
        if (drawable != null) {
            C1013a.m38083o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m27573S(float f) {
        m27570V(this.f13286m.m33852w(f));
        this.f13282i.invalidateSelf();
        if (m27564a0() || m27566Z()) {
            m27560c0();
        }
        if (m27564a0()) {
            m27554f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m27572T(float f) {
        this.f13276c.m33918Z(f);
        C2232g c2232g = this.f13277d;
        if (c2232g != null) {
            c2232g.m33918Z(f);
        }
        C2232g c2232g2 = this.f13291r;
        if (c2232g2 != null) {
            c2232g2.m33918Z(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m27571U(ColorStateList colorStateList) {
        this.f13284k = colorStateList;
        m27552g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m27570V(C2239k c2239k) {
        this.f13286m = c2239k;
        this.f13276c.setShapeAppearanceModel(c2239k);
        C2232g c2232g = this.f13276c;
        c2232g.m33913c0(!c2232g.m33926R());
        C2232g c2232g2 = this.f13277d;
        if (c2232g2 != null) {
            c2232g2.setShapeAppearanceModel(c2239k);
        }
        C2232g c2232g3 = this.f13291r;
        if (c2232g3 != null) {
            c2232g3.setShapeAppearanceModel(c2239k);
        }
        C2232g c2232g4 = this.f13290q;
        if (c2232g4 != null) {
            c2232g4.setShapeAppearanceModel(c2239k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m27569W(ColorStateList colorStateList) {
        if (this.f13287n == colorStateList) {
            return;
        }
        this.f13287n = colorStateList;
        m27550h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m27568X(int i) {
        if (i == this.f13281h) {
            return;
        }
        this.f13281h = i;
        m27550h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m27567Y(int i, int i2, int i3, int i4) {
        this.f13275b.set(i, i2, i3, i4);
        m27560c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m27562b0() {
        Drawable drawable;
        Drawable drawable2 = this.f13282i;
        if (this.f13274a.isClickable()) {
            drawable = m27540r();
        } else {
            drawable = this.f13277d;
        }
        this.f13282i = drawable;
        if (drawable2 != drawable) {
            m27556e0(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m27560c0() {
        boolean z;
        float f;
        if (!m27566Z() && !m27564a0()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            f = m27565a();
        } else {
            f = 0.0f;
        }
        int m27538t = (int) (f - m27538t());
        MaterialCardView materialCardView = this.f13274a;
        Rect rect = this.f13275b;
        materialCardView.m27592g(rect.left + m27538t, rect.top + m27538t, rect.right + m27538t, rect.bottom + m27538t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m27558d0() {
        this.f13276c.m33920X(this.f13274a.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m27554f0() {
        if (!m27589C()) {
            this.f13274a.setBackgroundInternal(m27590B(this.f13276c));
        }
        this.f13274a.setForeground(m27590B(this.f13282i));
    }

    /* renamed from: h0 */
    void m27550h0() {
        this.f13277d.m33907f0(this.f13281h, this.f13287n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m27549i() {
        Drawable drawable = this.f13288o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f13288o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f13288o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C2232g m27548j() {
        return this.f13276c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public ColorStateList m27547k() {
        return this.f13276c.m33885x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m27546l() {
        return this.f13277d.m33885x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Drawable m27545m() {
        return this.f13283j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m27544n() {
        return this.f13280g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m27543o() {
        return this.f13278e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m27542p() {
        return this.f13279f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList m27541q() {
        return this.f13285l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public float m27539s() {
        return this.f13276c.m33936H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public float m27537u() {
        return this.f13276c.m33884y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ColorStateList m27536v() {
        return this.f13284k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public C2239k m27535w() {
        return this.f13286m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m27534x() {
        ColorStateList colorStateList = this.f13287n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public ColorStateList m27533y() {
        return this.f13287n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public int m27532z() {
        return this.f13281h;
    }
}
