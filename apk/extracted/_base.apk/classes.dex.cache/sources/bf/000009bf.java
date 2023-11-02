package bb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p155ia.C7489k;

/* renamed from: bb.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2239k {

    /* renamed from: m */
    public static final InterfaceC2228c f6282m = new C2237i(0.5f);

    /* renamed from: a */
    C2229d f6283a;

    /* renamed from: b */
    C2229d f6284b;

    /* renamed from: c */
    C2229d f6285c;

    /* renamed from: d */
    C2229d f6286d;

    /* renamed from: e */
    InterfaceC2228c f6287e;

    /* renamed from: f */
    InterfaceC2228c f6288f;

    /* renamed from: g */
    InterfaceC2228c f6289g;

    /* renamed from: h */
    InterfaceC2228c f6290h;

    /* renamed from: i */
    C2231f f6291i;

    /* renamed from: j */
    C2231f f6292j;

    /* renamed from: k */
    C2231f f6293k;

    /* renamed from: l */
    C2231f f6294l;

    /* renamed from: bb.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2242c {
        /* renamed from: a */
        InterfaceC2228c mo33817a(InterfaceC2228c interfaceC2228c);
    }

    /* renamed from: a */
    public static C2241b m33874a() {
        return new C2241b();
    }

    /* renamed from: b */
    public static C2241b m33873b(Context context, int i, int i2) {
        return m33872c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C2241b m33872c(Context context, int i, int i2, int i3) {
        return m33871d(context, i, i2, new C2226a(i3));
    }

    /* renamed from: d */
    private static C2241b m33871d(Context context, int i, int i2, InterfaceC2228c interfaceC2228c) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7489k.f20695z4);
        try {
            int i3 = obtainStyledAttributes.getInt(C7489k.f20291A4, 0);
            int i4 = obtainStyledAttributes.getInt(C7489k.f20315D4, i3);
            int i5 = obtainStyledAttributes.getInt(C7489k.f20323E4, i3);
            int i6 = obtainStyledAttributes.getInt(C7489k.f20307C4, i3);
            int i7 = obtainStyledAttributes.getInt(C7489k.f20299B4, i3);
            InterfaceC2228c m33862m = m33862m(obtainStyledAttributes, C7489k.f20331F4, interfaceC2228c);
            InterfaceC2228c m33862m2 = m33862m(obtainStyledAttributes, C7489k.f20355I4, m33862m);
            InterfaceC2228c m33862m3 = m33862m(obtainStyledAttributes, C7489k.f20363J4, m33862m);
            InterfaceC2228c m33862m4 = m33862m(obtainStyledAttributes, C7489k.f20347H4, m33862m);
            return new C2241b().m33819y(i4, m33862m2).m33847C(i5, m33862m3).m33823u(i6, m33862m4).m33827q(i7, m33862m(obtainStyledAttributes, C7489k.f20339G4, m33862m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C2241b m33870e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m33869f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C2241b m33869f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m33868g(context, attributeSet, i, i2, new C2226a(i3));
    }

    /* renamed from: g */
    public static C2241b m33868g(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC2228c interfaceC2228c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20338G3, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C7489k.f20346H3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C7489k.f20354I3, 0);
        obtainStyledAttributes.recycle();
        return m33871d(context, resourceId, resourceId2, interfaceC2228c);
    }

    /* renamed from: m */
    private static InterfaceC2228c m33862m(TypedArray typedArray, int i, InterfaceC2228c interfaceC2228c) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC2228c;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C2226a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C2237i(peekValue.getFraction(1.0f, 1.0f));
        }
        return interfaceC2228c;
    }

    /* renamed from: h */
    public C2231f m33867h() {
        return this.f6293k;
    }

    /* renamed from: i */
    public C2229d m33866i() {
        return this.f6286d;
    }

    /* renamed from: j */
    public InterfaceC2228c m33865j() {
        return this.f6290h;
    }

    /* renamed from: k */
    public C2229d m33864k() {
        return this.f6285c;
    }

    /* renamed from: l */
    public InterfaceC2228c m33863l() {
        return this.f6289g;
    }

    /* renamed from: n */
    public C2231f m33861n() {
        return this.f6294l;
    }

    /* renamed from: o */
    public C2231f m33860o() {
        return this.f6292j;
    }

    /* renamed from: p */
    public C2231f m33859p() {
        return this.f6291i;
    }

    /* renamed from: q */
    public C2229d m33858q() {
        return this.f6283a;
    }

    /* renamed from: r */
    public InterfaceC2228c m33857r() {
        return this.f6287e;
    }

    /* renamed from: s */
    public C2229d m33856s() {
        return this.f6284b;
    }

    /* renamed from: t */
    public InterfaceC2228c m33855t() {
        return this.f6288f;
    }

    /* renamed from: u */
    public boolean m33854u(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f6294l.getClass().equals(C2231f.class) && this.f6292j.getClass().equals(C2231f.class) && this.f6291i.getClass().equals(C2231f.class) && this.f6293k.getClass().equals(C2231f.class)) {
            z = true;
        } else {
            z = false;
        }
        float mo33876a = this.f6287e.mo33876a(rectF);
        if (this.f6288f.mo33876a(rectF) == mo33876a && this.f6290h.mo33876a(rectF) == mo33876a && this.f6289g.mo33876a(rectF) == mo33876a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.f6284b instanceof C2238j) && (this.f6283a instanceof C2238j) && (this.f6285c instanceof C2238j) && (this.f6286d instanceof C2238j)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public C2241b m33853v() {
        return new C2241b(this);
    }

    /* renamed from: w */
    public C2239k m33852w(float f) {
        return m33853v().m33829o(f).m33831m();
    }

    /* renamed from: x */
    public C2239k m33851x(InterfaceC2228c interfaceC2228c) {
        return m33853v().m33828p(interfaceC2228c).m33831m();
    }

    /* renamed from: y */
    public C2239k m33850y(InterfaceC2242c interfaceC2242c) {
        return m33853v().m33848B(interfaceC2242c.mo33817a(m33857r())).m33844F(interfaceC2242c.mo33817a(m33855t())).m33824t(interfaceC2242c.mo33817a(m33865j())).m33820x(interfaceC2242c.mo33817a(m33863l())).m33831m();
    }

    private C2239k(C2241b c2241b) {
        this.f6283a = c2241b.f6295a;
        this.f6284b = c2241b.f6296b;
        this.f6285c = c2241b.f6297c;
        this.f6286d = c2241b.f6298d;
        this.f6287e = c2241b.f6299e;
        this.f6288f = c2241b.f6300f;
        this.f6289g = c2241b.f6301g;
        this.f6290h = c2241b.f6302h;
        this.f6291i = c2241b.f6303i;
        this.f6292j = c2241b.f6304j;
        this.f6293k = c2241b.f6305k;
        this.f6294l = c2241b.f6306l;
    }

    /* renamed from: bb.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2241b {

        /* renamed from: a */
        private C2229d f6295a;

        /* renamed from: b */
        private C2229d f6296b;

        /* renamed from: c */
        private C2229d f6297c;

        /* renamed from: d */
        private C2229d f6298d;

        /* renamed from: e */
        private InterfaceC2228c f6299e;

        /* renamed from: f */
        private InterfaceC2228c f6300f;

        /* renamed from: g */
        private InterfaceC2228c f6301g;

        /* renamed from: h */
        private InterfaceC2228c f6302h;

        /* renamed from: i */
        private C2231f f6303i;

        /* renamed from: j */
        private C2231f f6304j;

        /* renamed from: k */
        private C2231f f6305k;

        /* renamed from: l */
        private C2231f f6306l;

        public C2241b() {
            this.f6295a = C2236h.m33881b();
            this.f6296b = C2236h.m33881b();
            this.f6297c = C2236h.m33881b();
            this.f6298d = C2236h.m33881b();
            this.f6299e = new C2226a(0.0f);
            this.f6300f = new C2226a(0.0f);
            this.f6301g = new C2226a(0.0f);
            this.f6302h = new C2226a(0.0f);
            this.f6303i = C2236h.m33880c();
            this.f6304j = C2236h.m33880c();
            this.f6305k = C2236h.m33880c();
            this.f6306l = C2236h.m33880c();
        }

        /* renamed from: n */
        private static float m33830n(C2229d c2229d) {
            if (c2229d instanceof C2238j) {
                return ((C2238j) c2229d).f6281a;
            }
            if (c2229d instanceof C2230e) {
                return ((C2230e) c2229d).f6229a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C2241b m33849A(float f) {
            this.f6299e = new C2226a(f);
            return this;
        }

        /* renamed from: B */
        public C2241b m33848B(InterfaceC2228c interfaceC2228c) {
            this.f6299e = interfaceC2228c;
            return this;
        }

        /* renamed from: C */
        public C2241b m33847C(int i, InterfaceC2228c interfaceC2228c) {
            return m33846D(C2236h.m33882a(i)).m33844F(interfaceC2228c);
        }

        /* renamed from: D */
        public C2241b m33846D(C2229d c2229d) {
            this.f6296b = c2229d;
            float m33830n = m33830n(c2229d);
            if (m33830n != -1.0f) {
                m33845E(m33830n);
            }
            return this;
        }

        /* renamed from: E */
        public C2241b m33845E(float f) {
            this.f6300f = new C2226a(f);
            return this;
        }

        /* renamed from: F */
        public C2241b m33844F(InterfaceC2228c interfaceC2228c) {
            this.f6300f = interfaceC2228c;
            return this;
        }

        /* renamed from: m */
        public C2239k m33831m() {
            return new C2239k(this);
        }

        /* renamed from: o */
        public C2241b m33829o(float f) {
            return m33849A(f).m33845E(f).m33821w(f).m33825s(f);
        }

        /* renamed from: p */
        public C2241b m33828p(InterfaceC2228c interfaceC2228c) {
            return m33848B(interfaceC2228c).m33844F(interfaceC2228c).m33820x(interfaceC2228c).m33824t(interfaceC2228c);
        }

        /* renamed from: q */
        public C2241b m33827q(int i, InterfaceC2228c interfaceC2228c) {
            return m33826r(C2236h.m33882a(i)).m33824t(interfaceC2228c);
        }

        /* renamed from: r */
        public C2241b m33826r(C2229d c2229d) {
            this.f6298d = c2229d;
            float m33830n = m33830n(c2229d);
            if (m33830n != -1.0f) {
                m33825s(m33830n);
            }
            return this;
        }

        /* renamed from: s */
        public C2241b m33825s(float f) {
            this.f6302h = new C2226a(f);
            return this;
        }

        /* renamed from: t */
        public C2241b m33824t(InterfaceC2228c interfaceC2228c) {
            this.f6302h = interfaceC2228c;
            return this;
        }

        /* renamed from: u */
        public C2241b m33823u(int i, InterfaceC2228c interfaceC2228c) {
            return m33822v(C2236h.m33882a(i)).m33820x(interfaceC2228c);
        }

        /* renamed from: v */
        public C2241b m33822v(C2229d c2229d) {
            this.f6297c = c2229d;
            float m33830n = m33830n(c2229d);
            if (m33830n != -1.0f) {
                m33821w(m33830n);
            }
            return this;
        }

        /* renamed from: w */
        public C2241b m33821w(float f) {
            this.f6301g = new C2226a(f);
            return this;
        }

        /* renamed from: x */
        public C2241b m33820x(InterfaceC2228c interfaceC2228c) {
            this.f6301g = interfaceC2228c;
            return this;
        }

        /* renamed from: y */
        public C2241b m33819y(int i, InterfaceC2228c interfaceC2228c) {
            return m33818z(C2236h.m33882a(i)).m33848B(interfaceC2228c);
        }

        /* renamed from: z */
        public C2241b m33818z(C2229d c2229d) {
            this.f6295a = c2229d;
            float m33830n = m33830n(c2229d);
            if (m33830n != -1.0f) {
                m33849A(m33830n);
            }
            return this;
        }

        public C2241b(C2239k c2239k) {
            this.f6295a = C2236h.m33881b();
            this.f6296b = C2236h.m33881b();
            this.f6297c = C2236h.m33881b();
            this.f6298d = C2236h.m33881b();
            this.f6299e = new C2226a(0.0f);
            this.f6300f = new C2226a(0.0f);
            this.f6301g = new C2226a(0.0f);
            this.f6302h = new C2226a(0.0f);
            this.f6303i = C2236h.m33880c();
            this.f6304j = C2236h.m33880c();
            this.f6305k = C2236h.m33880c();
            this.f6306l = C2236h.m33880c();
            this.f6295a = c2239k.f6283a;
            this.f6296b = c2239k.f6284b;
            this.f6297c = c2239k.f6285c;
            this.f6298d = c2239k.f6286d;
            this.f6299e = c2239k.f6287e;
            this.f6300f = c2239k.f6288f;
            this.f6301g = c2239k.f6289g;
            this.f6302h = c2239k.f6290h;
            this.f6303i = c2239k.f6291i;
            this.f6304j = c2239k.f6292j;
            this.f6305k = c2239k.f6293k;
            this.f6306l = c2239k.f6294l;
        }
    }

    public C2239k() {
        this.f6283a = C2236h.m33881b();
        this.f6284b = C2236h.m33881b();
        this.f6285c = C2236h.m33881b();
        this.f6286d = C2236h.m33881b();
        this.f6287e = new C2226a(0.0f);
        this.f6288f = new C2226a(0.0f);
        this.f6289g = new C2226a(0.0f);
        this.f6290h = new C2226a(0.0f);
        this.f6291i = C2236h.m33880c();
        this.f6292j = C2236h.m33880c();
        this.f6293k = C2236h.m33880c();
        this.f6294l = C2236h.m33880c();
    }
}