package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0654d;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import p289q.C11656c;
import p289q.C11657d;
import p329s.AbstractC12335m;
import p329s.C12322c;
import p329s.C12325f;
import p329s.C12330j;
import p329s.C12333l;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ConstraintWidget {

    /* renamed from: v0 */
    public static float f2213v0 = 0.5f;

    /* renamed from: I */
    C0654d f2222I;

    /* renamed from: J */
    public C0654d[] f2223J;

    /* renamed from: K */
    protected ArrayList<C0654d> f2224K;

    /* renamed from: L */
    private boolean[] f2225L;

    /* renamed from: M */
    public EnumC0650b[] f2226M;

    /* renamed from: N */
    public ConstraintWidget f2227N;

    /* renamed from: O */
    int f2228O;

    /* renamed from: P */
    int f2229P;

    /* renamed from: Q */
    public float f2230Q;

    /* renamed from: R */
    protected int f2231R;

    /* renamed from: S */
    protected int f2232S;

    /* renamed from: T */
    protected int f2233T;

    /* renamed from: U */
    int f2234U;

    /* renamed from: V */
    int f2235V;

    /* renamed from: W */
    protected int f2236W;

    /* renamed from: X */
    protected int f2237X;

    /* renamed from: Y */
    int f2238Y;

    /* renamed from: Z */
    protected int f2239Z;

    /* renamed from: a0 */
    protected int f2241a0;

    /* renamed from: b0 */
    float f2243b0;

    /* renamed from: c */
    public C12322c f2244c;

    /* renamed from: c0 */
    float f2245c0;

    /* renamed from: d */
    public C12322c f2246d;

    /* renamed from: d0 */
    private Object f2247d0;

    /* renamed from: e0 */
    private int f2249e0;

    /* renamed from: f0 */
    private int f2251f0;

    /* renamed from: g0 */
    private String f2253g0;

    /* renamed from: h0 */
    private String f2255h0;

    /* renamed from: i0 */
    boolean f2257i0;

    /* renamed from: j0 */
    boolean f2259j0;

    /* renamed from: k0 */
    boolean f2261k0;

    /* renamed from: l0 */
    boolean f2263l0;

    /* renamed from: m0 */
    int f2265m0;

    /* renamed from: n0 */
    int f2267n0;

    /* renamed from: o0 */
    boolean f2269o0;

    /* renamed from: p0 */
    boolean f2271p0;

    /* renamed from: q0 */
    public float[] f2273q0;

    /* renamed from: r0 */
    protected ConstraintWidget[] f2275r0;

    /* renamed from: s0 */
    protected ConstraintWidget[] f2277s0;

    /* renamed from: t0 */
    ConstraintWidget f2279t0;

    /* renamed from: u0 */
    ConstraintWidget f2281u0;

    /* renamed from: z */
    private boolean f2286z;

    /* renamed from: a */
    public boolean f2240a = false;

    /* renamed from: b */
    public AbstractC12335m[] f2242b = new AbstractC12335m[2];

    /* renamed from: e */
    public C12330j f2248e = new C12330j(this);

    /* renamed from: f */
    public C12333l f2250f = new C12333l(this);

    /* renamed from: g */
    public boolean[] f2252g = {true, true};

    /* renamed from: h */
    public int[] f2254h = {0, 0, 0, 0};

    /* renamed from: i */
    boolean f2256i = false;

    /* renamed from: j */
    public int f2258j = -1;

    /* renamed from: k */
    public int f2260k = -1;

    /* renamed from: l */
    public int f2262l = 0;

    /* renamed from: m */
    public int f2264m = 0;

    /* renamed from: n */
    public int[] f2266n = new int[2];

    /* renamed from: o */
    public int f2268o = 0;

    /* renamed from: p */
    public int f2270p = 0;

    /* renamed from: q */
    public float f2272q = 1.0f;

    /* renamed from: r */
    public int f2274r = 0;

    /* renamed from: s */
    public int f2276s = 0;

    /* renamed from: t */
    public float f2278t = 1.0f;

    /* renamed from: u */
    int f2280u = -1;

    /* renamed from: v */
    float f2282v = 1.0f;

    /* renamed from: w */
    private int[] f2283w = {ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES};

    /* renamed from: x */
    private float f2284x = 0.0f;

    /* renamed from: y */
    private boolean f2285y = false;

    /* renamed from: A */
    private boolean f2214A = false;

    /* renamed from: B */
    public C0654d f2215B = new C0654d(this, C0654d.EnumC0656b.LEFT);

    /* renamed from: C */
    public C0654d f2216C = new C0654d(this, C0654d.EnumC0656b.TOP);

    /* renamed from: D */
    public C0654d f2217D = new C0654d(this, C0654d.EnumC0656b.RIGHT);

    /* renamed from: E */
    public C0654d f2218E = new C0654d(this, C0654d.EnumC0656b.BOTTOM);

    /* renamed from: F */
    C0654d f2219F = new C0654d(this, C0654d.EnumC0656b.BASELINE);

    /* renamed from: G */
    C0654d f2220G = new C0654d(this, C0654d.EnumC0656b.CENTER_X);

    /* renamed from: H */
    C0654d f2221H = new C0654d(this, C0654d.EnumC0656b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C0649a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2287a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2288b;

        static {
            int[] iArr = new int[EnumC0650b.values().length];
            f2288b = iArr;
            try {
                iArr[EnumC0650b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2288b[EnumC0650b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2288b[EnumC0650b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2288b[EnumC0650b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C0654d.EnumC0656b.values().length];
            f2287a = iArr2;
            try {
                iArr2[C0654d.EnumC0656b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2287a[C0654d.EnumC0656b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2287a[C0654d.EnumC0656b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2287a[C0654d.EnumC0656b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2287a[C0654d.EnumC0656b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2287a[C0654d.EnumC0656b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2287a[C0654d.EnumC0656b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2287a[C0654d.EnumC0656b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2287a[C0654d.EnumC0656b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC0650b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        C0654d c0654d = new C0654d(this, C0654d.EnumC0656b.CENTER);
        this.f2222I = c0654d;
        this.f2223J = new C0654d[]{this.f2215B, this.f2217D, this.f2216C, this.f2218E, this.f2219F, c0654d};
        this.f2224K = new ArrayList<>();
        this.f2225L = new boolean[2];
        EnumC0650b enumC0650b = EnumC0650b.FIXED;
        this.f2226M = new EnumC0650b[]{enumC0650b, enumC0650b};
        this.f2227N = null;
        this.f2228O = 0;
        this.f2229P = 0;
        this.f2230Q = 0.0f;
        this.f2231R = -1;
        this.f2232S = 0;
        this.f2233T = 0;
        this.f2234U = 0;
        this.f2235V = 0;
        this.f2236W = 0;
        this.f2237X = 0;
        this.f2238Y = 0;
        float f = f2213v0;
        this.f2243b0 = f;
        this.f2245c0 = f;
        this.f2249e0 = 0;
        this.f2251f0 = 0;
        this.f2253g0 = null;
        this.f2255h0 = null;
        this.f2261k0 = false;
        this.f2263l0 = false;
        this.f2265m0 = 0;
        this.f2267n0 = 0;
        this.f2273q0 = new float[]{-1.0f, -1.0f};
        this.f2275r0 = new ConstraintWidget[]{null, null};
        this.f2277s0 = new ConstraintWidget[]{null, null};
        this.f2279t0 = null;
        this.f2281u0 = null;
        m39401d();
    }

    /* renamed from: S */
    private boolean m39410S(int i) {
        C0654d c0654d;
        C0654d c0654d2;
        int i2 = i * 2;
        C0654d[] c0654dArr = this.f2223J;
        C0654d c0654d3 = c0654dArr[i2];
        C0654d c0654d4 = c0654d3.f2346d;
        return (c0654d4 == null || c0654d4.f2346d == c0654d3 || (c0654d2 = (c0654d = c0654dArr[i2 + 1]).f2346d) == null || c0654d2.f2346d != c0654d) ? false : true;
    }

    /* renamed from: d */
    private void m39401d() {
        this.f2224K.add(this.f2215B);
        this.f2224K.add(this.f2216C);
        this.f2224K.add(this.f2217D);
        this.f2224K.add(this.f2218E);
        this.f2224K.add(this.f2220G);
        this.f2224K.add(this.f2221H);
        this.f2224K.add(this.f2222I);
        this.f2224K.add(this.f2219F);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x032c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m39395h(p289q.C11657d r32, boolean r33, boolean r34, boolean r35, boolean r36, p289q.C11665h r37, p289q.C11665h r38, androidx.constraintlayout.solver.widgets.ConstraintWidget.EnumC0650b r39, boolean r40, androidx.constraintlayout.solver.widgets.C0654d r41, androidx.constraintlayout.solver.widgets.C0654d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1115
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.m39395h(q.d, boolean, boolean, boolean, boolean, q.h, q.h, androidx.constraintlayout.solver.widgets.ConstraintWidget$b, boolean, androidx.constraintlayout.solver.widgets.d, androidx.constraintlayout.solver.widgets.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: A */
    public int m39433A() {
        return this.f2283w[0];
    }

    /* renamed from: A0 */
    public void m39432A0(int i) {
        this.f2251f0 = i;
    }

    /* renamed from: B */
    public int m39431B() {
        return this.f2241a0;
    }

    /* renamed from: B0 */
    public void m39430B0(int i) {
        this.f2228O = i;
        int i2 = this.f2239Z;
        if (i < i2) {
            this.f2228O = i2;
        }
    }

    /* renamed from: C */
    public int m39429C() {
        return this.f2239Z;
    }

    /* renamed from: C0 */
    public void m39428C0(int i) {
        this.f2232S = i;
    }

    /* renamed from: D */
    public ConstraintWidget m39427D(int i) {
        C0654d c0654d;
        C0654d c0654d2;
        if (i == 0) {
            C0654d c0654d3 = this.f2217D;
            C0654d c0654d4 = c0654d3.f2346d;
            if (c0654d4 != null && c0654d4.f2346d == c0654d3) {
                return c0654d4.f2344b;
            }
            return null;
        } else if (i == 1 && (c0654d2 = (c0654d = this.f2218E).f2346d) != null && c0654d2.f2346d == c0654d) {
            return c0654d2.f2344b;
        } else {
            return null;
        }
    }

    /* renamed from: D0 */
    public void m39426D0(int i) {
        this.f2233T = i;
    }

    /* renamed from: E */
    public ConstraintWidget m39425E() {
        return this.f2227N;
    }

    /* renamed from: E0 */
    public void m39424E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f2280u == -1) {
            if (z3 && !z4) {
                this.f2280u = 0;
            } else if (!z3 && z4) {
                this.f2280u = 1;
                if (this.f2231R == -1) {
                    this.f2282v = 1.0f / this.f2282v;
                }
            }
        }
        if (this.f2280u == 0 && (!this.f2216C.m39314i() || !this.f2218E.m39314i())) {
            this.f2280u = 1;
        } else if (this.f2280u == 1 && (!this.f2215B.m39314i() || !this.f2217D.m39314i())) {
            this.f2280u = 0;
        }
        if (this.f2280u == -1 && (!this.f2216C.m39314i() || !this.f2218E.m39314i() || !this.f2215B.m39314i() || !this.f2217D.m39314i())) {
            if (this.f2216C.m39314i() && this.f2218E.m39314i()) {
                this.f2280u = 0;
            } else if (this.f2215B.m39314i() && this.f2217D.m39314i()) {
                this.f2282v = 1.0f / this.f2282v;
                this.f2280u = 1;
            }
        }
        if (this.f2280u == -1) {
            int i = this.f2268o;
            if (i > 0 && this.f2274r == 0) {
                this.f2280u = 0;
            } else if (i == 0 && this.f2274r > 0) {
                this.f2282v = 1.0f / this.f2282v;
                this.f2280u = 1;
            }
        }
    }

    /* renamed from: F */
    public ConstraintWidget m39423F(int i) {
        C0654d c0654d;
        C0654d c0654d2;
        if (i == 0) {
            C0654d c0654d3 = this.f2215B;
            C0654d c0654d4 = c0654d3.f2346d;
            if (c0654d4 != null && c0654d4.f2346d == c0654d3) {
                return c0654d4.f2344b;
            }
            return null;
        } else if (i == 1 && (c0654d2 = (c0654d = this.f2216C).f2346d) != null && c0654d2.f2346d == c0654d) {
            return c0654d2.f2344b;
        } else {
            return null;
        }
    }

    /* renamed from: F0 */
    public void mo39358F0(boolean z, boolean z2) {
        int i;
        int i2;
        boolean m5455k = z & this.f2248e.m5455k();
        boolean m5455k2 = z2 & this.f2250f.m5455k();
        C12330j c12330j = this.f2248e;
        int i3 = c12330j.f32172h.f32136g;
        C12333l c12333l = this.f2250f;
        int i4 = c12333l.f32172h.f32136g;
        int i5 = c12330j.f32173i.f32136g;
        int i6 = c12333l.f32173i.f32136g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (m5455k) {
            this.f2232S = i3;
        }
        if (m5455k2) {
            this.f2233T = i4;
        }
        if (this.f2251f0 == 8) {
            this.f2228O = 0;
            this.f2229P = 0;
            return;
        }
        if (m5455k) {
            if (this.f2226M[0] == EnumC0650b.FIXED && i8 < (i2 = this.f2228O)) {
                i8 = i2;
            }
            this.f2228O = i8;
            int i10 = this.f2239Z;
            if (i8 < i10) {
                this.f2228O = i10;
            }
        }
        if (m5455k2) {
            if (this.f2226M[1] == EnumC0650b.FIXED && i9 < (i = this.f2229P)) {
                i9 = i;
            }
            this.f2229P = i9;
            int i11 = this.f2241a0;
            if (i9 < i11) {
                this.f2229P = i11;
            }
        }
    }

    /* renamed from: G */
    public int m39422G() {
        return m39414O() + this.f2228O;
    }

    /* renamed from: G0 */
    public void mo39310G0(C11657d c11657d) {
        int m7292y = c11657d.m7292y(this.f2215B);
        int m7292y2 = c11657d.m7292y(this.f2216C);
        int m7292y3 = c11657d.m7292y(this.f2217D);
        int m7292y4 = c11657d.m7292y(this.f2218E);
        C12330j c12330j = this.f2248e;
        C12325f c12325f = c12330j.f32172h;
        if (c12325f.f32139j) {
            C12325f c12325f2 = c12330j.f32173i;
            if (c12325f2.f32139j) {
                m7292y = c12325f.f32136g;
                m7292y3 = c12325f2.f32136g;
            }
        }
        C12333l c12333l = this.f2250f;
        C12325f c12325f3 = c12333l.f32172h;
        if (c12325f3.f32139j) {
            C12325f c12325f4 = c12333l.f32173i;
            if (c12325f4.f32139j) {
                m7292y2 = c12325f3.f32136g;
                m7292y4 = c12325f4.f32136g;
            }
        }
        int i = m7292y4 - m7292y2;
        if (m7292y3 - m7292y < 0 || i < 0 || m7292y == Integer.MIN_VALUE || m7292y == Integer.MAX_VALUE || m7292y2 == Integer.MIN_VALUE || m7292y2 == Integer.MAX_VALUE || m7292y3 == Integer.MIN_VALUE || m7292y3 == Integer.MAX_VALUE || m7292y4 == Integer.MIN_VALUE || m7292y4 == Integer.MAX_VALUE) {
            m7292y = 0;
            m7292y4 = 0;
            m7292y2 = 0;
            m7292y3 = 0;
        }
        m39402c0(m7292y, m7292y2, m7292y3, m7292y4);
    }

    /* renamed from: H */
    public AbstractC12335m m39421H(int i) {
        if (i == 0) {
            return this.f2248e;
        }
        if (i == 1) {
            return this.f2250f;
        }
        return null;
    }

    /* renamed from: I */
    public float m39420I() {
        return this.f2245c0;
    }

    /* renamed from: J */
    public int m39419J() {
        return this.f2267n0;
    }

    /* renamed from: K */
    public EnumC0650b m39418K() {
        return this.f2226M[1];
    }

    /* renamed from: L */
    public int m39417L() {
        int i = 0;
        if (this.f2215B != null) {
            i = 0 + this.f2216C.f2347e;
        }
        if (this.f2217D != null) {
            return i + this.f2218E.f2347e;
        }
        return i;
    }

    /* renamed from: M */
    public int m39416M() {
        return this.f2251f0;
    }

    /* renamed from: N */
    public int m39415N() {
        if (this.f2251f0 == 8) {
            return 0;
        }
        return this.f2228O;
    }

    /* renamed from: O */
    public int m39414O() {
        ConstraintWidget constraintWidget = this.f2227N;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).f2297D0 + this.f2232S;
        }
        return this.f2232S;
    }

    /* renamed from: P */
    public int m39413P() {
        ConstraintWidget constraintWidget = this.f2227N;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).f2298E0 + this.f2233T;
        }
        return this.f2233T;
    }

    /* renamed from: Q */
    public boolean m39412Q() {
        return this.f2285y;
    }

    /* renamed from: R */
    public void m39411R(C0654d.EnumC0656b enumC0656b, ConstraintWidget constraintWidget, C0654d.EnumC0656b enumC0656b2, int i, int i2) {
        mo39299k(enumC0656b).m39322a(constraintWidget.mo39299k(enumC0656b2), i, i2, true);
    }

    /* renamed from: T */
    public boolean m39409T() {
        C0654d c0654d = this.f2215B;
        C0654d c0654d2 = c0654d.f2346d;
        if (c0654d2 == null || c0654d2.f2346d != c0654d) {
            C0654d c0654d3 = this.f2217D;
            C0654d c0654d4 = c0654d3.f2346d;
            return c0654d4 != null && c0654d4.f2346d == c0654d3;
        }
        return true;
    }

    /* renamed from: U */
    public boolean m39408U() {
        return this.f2286z;
    }

    /* renamed from: V */
    public boolean m39407V() {
        C0654d c0654d = this.f2216C;
        C0654d c0654d2 = c0654d.f2346d;
        if (c0654d2 == null || c0654d2.f2346d != c0654d) {
            C0654d c0654d3 = this.f2218E;
            C0654d c0654d4 = c0654d3.f2346d;
            return c0654d4 != null && c0654d4.f2346d == c0654d3;
        }
        return true;
    }

    /* renamed from: W */
    public void mo6609W() {
        this.f2215B.m39312k();
        this.f2216C.m39312k();
        this.f2217D.m39312k();
        this.f2218E.m39312k();
        this.f2219F.m39312k();
        this.f2220G.m39312k();
        this.f2221H.m39312k();
        this.f2222I.m39312k();
        this.f2227N = null;
        this.f2284x = 0.0f;
        this.f2228O = 0;
        this.f2229P = 0;
        this.f2230Q = 0.0f;
        this.f2231R = -1;
        this.f2232S = 0;
        this.f2233T = 0;
        this.f2236W = 0;
        this.f2237X = 0;
        this.f2238Y = 0;
        this.f2239Z = 0;
        this.f2241a0 = 0;
        float f = f2213v0;
        this.f2243b0 = f;
        this.f2245c0 = f;
        EnumC0650b[] enumC0650bArr = this.f2226M;
        EnumC0650b enumC0650b = EnumC0650b.FIXED;
        enumC0650bArr[0] = enumC0650b;
        enumC0650bArr[1] = enumC0650b;
        this.f2247d0 = null;
        this.f2249e0 = 0;
        this.f2251f0 = 0;
        this.f2255h0 = null;
        this.f2257i0 = false;
        this.f2259j0 = false;
        this.f2265m0 = 0;
        this.f2267n0 = 0;
        this.f2269o0 = false;
        this.f2271p0 = false;
        float[] fArr = this.f2273q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2258j = -1;
        this.f2260k = -1;
        int[] iArr = this.f2283w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2262l = 0;
        this.f2264m = 0;
        this.f2272q = 1.0f;
        this.f2278t = 1.0f;
        this.f2270p = ViewDefaults.NUMBER_OF_LINES;
        this.f2276s = ViewDefaults.NUMBER_OF_LINES;
        this.f2268o = 0;
        this.f2274r = 0;
        this.f2256i = false;
        this.f2280u = -1;
        this.f2282v = 1.0f;
        this.f2261k0 = false;
        this.f2263l0 = false;
        boolean[] zArr = this.f2252g;
        zArr[0] = true;
        zArr[1] = true;
        this.f2214A = false;
        boolean[] zArr2 = this.f2225L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    /* renamed from: X */
    public void mo6608X(C11656c c11656c) {
        this.f2215B.m39311l(c11656c);
        this.f2216C.m39311l(c11656c);
        this.f2217D.m39311l(c11656c);
        this.f2218E.m39311l(c11656c);
        this.f2219F.m39311l(c11656c);
        this.f2222I.m39311l(c11656c);
        this.f2220G.m39311l(c11656c);
        this.f2221H.m39311l(c11656c);
    }

    /* renamed from: Y */
    public void m39406Y(int i) {
        boolean z;
        this.f2238Y = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2285y = z;
    }

    /* renamed from: Z */
    public void m39405Z(Object obj) {
        this.f2247d0 = obj;
    }

    /* renamed from: a0 */
    public void m39404a0(String str) {
        this.f2253g0 = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please submit an issue!!! */
    /* renamed from: b0 */
    public void m39403b0(String str) {
        float f;
        int i = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                }
                i3 = i2;
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i2, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i3 == 1) {
                            f = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f = i;
            } else {
                String substring4 = str.substring(i2);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                f = i;
            }
            i = (f > i ? 1 : (f == i ? 0 : -1));
            if (i > 0) {
                this.f2230Q = f;
                this.f2231R = i3;
                return;
            }
            return;
        }
        this.f2230Q = 0.0f;
    }

    /* renamed from: c0 */
    public void m39402c0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f2232S = i;
        this.f2233T = i2;
        if (this.f2251f0 == 8) {
            this.f2228O = 0;
            this.f2229P = 0;
            return;
        }
        EnumC0650b[] enumC0650bArr = this.f2226M;
        EnumC0650b enumC0650b = enumC0650bArr[0];
        EnumC0650b enumC0650b2 = EnumC0650b.FIXED;
        if (enumC0650b == enumC0650b2 && i7 < (i6 = this.f2228O)) {
            i7 = i6;
        }
        if (enumC0650bArr[1] == enumC0650b2 && i8 < (i5 = this.f2229P)) {
            i8 = i5;
        }
        this.f2228O = i7;
        this.f2229P = i8;
        int i9 = this.f2241a0;
        if (i8 < i9) {
            this.f2229P = i9;
        }
        int i10 = this.f2239Z;
        if (i7 < i10) {
            this.f2228O = i10;
        }
    }

    /* renamed from: d0 */
    public void m39400d0(boolean z) {
        this.f2285y = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m39399e() {
        return (this instanceof C0660g) || (this instanceof C0657e);
    }

    /* renamed from: e0 */
    public void m39398e0(int i) {
        this.f2229P = i;
        int i2 = this.f2241a0;
        if (i < i2) {
            this.f2229P = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo39301f(p289q.C11657d r48) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.mo39301f(q.d):void");
    }

    /* renamed from: f0 */
    public void m39397f0(float f) {
        this.f2243b0 = f;
    }

    /* renamed from: g */
    public boolean mo39300g() {
        return this.f2251f0 != 8;
    }

    /* renamed from: g0 */
    public void m39396g0(int i) {
        this.f2265m0 = i;
    }

    /* renamed from: h0 */
    public void m39394h0(int i, int i2) {
        this.f2232S = i;
        int i3 = i2 - i;
        this.f2228O = i3;
        int i4 = this.f2239Z;
        if (i3 < i4) {
            this.f2228O = i4;
        }
    }

    /* renamed from: i */
    public void m39393i(ConstraintWidget constraintWidget, float f, int i) {
        C0654d.EnumC0656b enumC0656b = C0654d.EnumC0656b.CENTER;
        m39411R(enumC0656b, constraintWidget, enumC0656b, i, 0);
        this.f2284x = f;
    }

    /* renamed from: i0 */
    public void m39392i0(EnumC0650b enumC0650b) {
        this.f2226M[0] = enumC0650b;
    }

    /* renamed from: j */
    public void m39391j(C11657d c11657d) {
        c11657d.m7300q(this.f2215B);
        c11657d.m7300q(this.f2216C);
        c11657d.m7300q(this.f2217D);
        c11657d.m7300q(this.f2218E);
        if (this.f2238Y > 0) {
            c11657d.m7300q(this.f2219F);
        }
    }

    /* renamed from: j0 */
    public void m39390j0(int i, int i2, int i3, float f) {
        this.f2262l = i;
        this.f2268o = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f2270p = i3;
        this.f2272q = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f2262l = 2;
        }
    }

    /* renamed from: k */
    public C0654d mo39299k(C0654d.EnumC0656b enumC0656b) {
        switch (C0649a.f2287a[enumC0656b.ordinal()]) {
            case 1:
                return this.f2215B;
            case 2:
                return this.f2216C;
            case 3:
                return this.f2217D;
            case 4:
                return this.f2218E;
            case 5:
                return this.f2219F;
            case 6:
                return this.f2222I;
            case 7:
                return this.f2220G;
            case 8:
                return this.f2221H;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC0656b.name());
        }
    }

    /* renamed from: k0 */
    public void m39389k0(float f) {
        this.f2273q0[0] = f;
    }

    /* renamed from: l */
    public int m39388l() {
        return this.f2238Y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l0 */
    public void m39387l0(int i, boolean z) {
        this.f2225L[i] = z;
    }

    /* renamed from: m */
    public float m39386m(int i) {
        if (i == 0) {
            return this.f2243b0;
        }
        if (i == 1) {
            return this.f2245c0;
        }
        return -1.0f;
    }

    /* renamed from: m0 */
    public void m39385m0(boolean z) {
        this.f2286z = z;
    }

    /* renamed from: n */
    public int m39384n() {
        return m39413P() + this.f2229P;
    }

    /* renamed from: n0 */
    public void m39383n0(boolean z) {
        this.f2214A = z;
    }

    /* renamed from: o */
    public Object m39382o() {
        return this.f2247d0;
    }

    /* renamed from: o0 */
    public void m39381o0(int i) {
        this.f2283w[1] = i;
    }

    /* renamed from: p */
    public String m39380p() {
        return this.f2253g0;
    }

    /* renamed from: p0 */
    public void m39379p0(int i) {
        this.f2283w[0] = i;
    }

    /* renamed from: q */
    public EnumC0650b m39378q(int i) {
        if (i == 0) {
            return m39366w();
        }
        if (i == 1) {
            return m39418K();
        }
        return null;
    }

    /* renamed from: q0 */
    public void m39377q0(int i) {
        if (i < 0) {
            this.f2241a0 = 0;
        } else {
            this.f2241a0 = i;
        }
    }

    /* renamed from: r */
    public float m39376r() {
        return this.f2230Q;
    }

    /* renamed from: r0 */
    public void m39375r0(int i) {
        if (i < 0) {
            this.f2239Z = 0;
        } else {
            this.f2239Z = i;
        }
    }

    /* renamed from: s */
    public int m39374s() {
        return this.f2231R;
    }

    /* renamed from: s0 */
    public void m39373s0(int i, int i2) {
        this.f2232S = i;
        this.f2233T = i2;
    }

    /* renamed from: t */
    public int m39372t() {
        if (this.f2251f0 == 8) {
            return 0;
        }
        return this.f2229P;
    }

    /* renamed from: t0 */
    public void m39371t0(ConstraintWidget constraintWidget) {
        this.f2227N = constraintWidget;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f2255h0 != null) {
            str = "type: " + this.f2255h0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f2253g0 != null) {
            str2 = "id: " + this.f2253g0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f2232S);
        sb2.append(", ");
        sb2.append(this.f2233T);
        sb2.append(") - (");
        sb2.append(this.f2228O);
        sb2.append(" x ");
        sb2.append(this.f2229P);
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public float m39370u() {
        return this.f2243b0;
    }

    /* renamed from: u0 */
    public void m39369u0(float f) {
        this.f2245c0 = f;
    }

    /* renamed from: v */
    public int m39368v() {
        return this.f2265m0;
    }

    /* renamed from: v0 */
    public void m39367v0(int i) {
        this.f2267n0 = i;
    }

    /* renamed from: w */
    public EnumC0650b m39366w() {
        return this.f2226M[0];
    }

    /* renamed from: w0 */
    public void m39365w0(int i, int i2) {
        this.f2233T = i;
        int i3 = i2 - i;
        this.f2229P = i3;
        int i4 = this.f2241a0;
        if (i3 < i4) {
            this.f2229P = i4;
        }
    }

    /* renamed from: x */
    public int m39364x() {
        C0654d c0654d = this.f2215B;
        int i = 0;
        if (c0654d != null) {
            i = 0 + c0654d.f2347e;
        }
        C0654d c0654d2 = this.f2217D;
        if (c0654d2 != null) {
            return i + c0654d2.f2347e;
        }
        return i;
    }

    /* renamed from: x0 */
    public void m39363x0(EnumC0650b enumC0650b) {
        this.f2226M[1] = enumC0650b;
    }

    /* renamed from: y */
    public int m39362y(int i) {
        if (i == 0) {
            return m39415N();
        }
        if (i == 1) {
            return m39372t();
        }
        return 0;
    }

    /* renamed from: y0 */
    public void m39361y0(int i, int i2, int i3, float f) {
        this.f2264m = i;
        this.f2274r = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f2276s = i3;
        this.f2278t = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f2264m = 2;
        }
    }

    /* renamed from: z */
    public int m39360z() {
        return this.f2283w[1];
    }

    /* renamed from: z0 */
    public void m39359z0(float f) {
        this.f2273q0[1] = f;
    }
}
