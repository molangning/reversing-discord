package androidx.constraintlayout.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;
import p289q.C11656c;
import p289q.C11665h;

/* renamed from: androidx.constraintlayout.solver.widgets.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0654d {

    /* renamed from: b */
    public final ConstraintWidget f2344b;

    /* renamed from: c */
    public final EnumC0656b f2345c;

    /* renamed from: d */
    public C0654d f2346d;

    /* renamed from: g */
    C11665h f2349g;

    /* renamed from: a */
    private HashSet<C0654d> f2343a = null;

    /* renamed from: e */
    public int f2347e = 0;

    /* renamed from: f */
    int f2348f = -1;

    /* renamed from: androidx.constraintlayout.solver.widgets.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C0655a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2350a;

        static {
            int[] iArr = new int[EnumC0656b.values().length];
            f2350a = iArr;
            try {
                iArr[EnumC0656b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2350a[EnumC0656b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2350a[EnumC0656b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2350a[EnumC0656b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2350a[EnumC0656b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2350a[EnumC0656b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2350a[EnumC0656b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2350a[EnumC0656b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2350a[EnumC0656b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC0656b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0654d(ConstraintWidget constraintWidget, EnumC0656b enumC0656b) {
        this.f2344b = constraintWidget;
        this.f2345c = enumC0656b;
    }

    /* renamed from: a */
    public boolean m39322a(C0654d c0654d, int i, int i2, boolean z) {
        if (c0654d == null) {
            m39312k();
            return true;
        } else if (!z && !m39313j(c0654d)) {
            return false;
        } else {
            this.f2346d = c0654d;
            if (c0654d.f2343a == null) {
                c0654d.f2343a = new HashSet<>();
            }
            this.f2346d.f2343a.add(this);
            if (i > 0) {
                this.f2347e = i;
            } else {
                this.f2347e = 0;
            }
            this.f2348f = i2;
            return true;
        }
    }

    /* renamed from: b */
    public int m39321b() {
        C0654d c0654d;
        if (this.f2344b.m39416M() == 8) {
            return 0;
        }
        if (this.f2348f > -1 && (c0654d = this.f2346d) != null && c0654d.f2344b.m39416M() == 8) {
            return this.f2348f;
        }
        return this.f2347e;
    }

    /* renamed from: c */
    public final C0654d m39320c() {
        switch (C0655a.f2350a[this.f2345c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2344b.f2217D;
            case 3:
                return this.f2344b.f2215B;
            case 4:
                return this.f2344b.f2218E;
            case 5:
                return this.f2344b.f2216C;
            default:
                throw new AssertionError(this.f2345c.name());
        }
    }

    /* renamed from: d */
    public ConstraintWidget m39319d() {
        return this.f2344b;
    }

    /* renamed from: e */
    public C11665h m39318e() {
        return this.f2349g;
    }

    /* renamed from: f */
    public C0654d m39317f() {
        return this.f2346d;
    }

    /* renamed from: g */
    public EnumC0656b m39316g() {
        return this.f2345c;
    }

    /* renamed from: h */
    public boolean m39315h() {
        HashSet<C0654d> hashSet = this.f2343a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C0654d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m39320c().m39314i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean m39314i() {
        return this.f2346d != null;
    }

    /* renamed from: j */
    public boolean m39313j(C0654d c0654d) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c0654d == null) {
            return false;
        }
        EnumC0656b m39316g = c0654d.m39316g();
        EnumC0656b enumC0656b = this.f2345c;
        if (m39316g == enumC0656b) {
            if (enumC0656b == EnumC0656b.BASELINE && (!c0654d.m39319d().m39412Q() || !m39319d().m39412Q())) {
                return false;
            }
            return true;
        }
        switch (C0655a.f2350a[enumC0656b.ordinal()]) {
            case 1:
                if (m39316g == EnumC0656b.BASELINE || m39316g == EnumC0656b.CENTER_X || m39316g == EnumC0656b.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (m39316g != EnumC0656b.LEFT && m39316g != EnumC0656b.RIGHT) {
                    z = false;
                } else {
                    z = true;
                }
                if (c0654d.m39319d() instanceof C0657e) {
                    if (z || m39316g == EnumC0656b.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                }
                return z;
            case 4:
            case 5:
                if (m39316g != EnumC0656b.TOP && m39316g != EnumC0656b.BOTTOM) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (c0654d.m39319d() instanceof C0657e) {
                    if (z2 || m39316g == EnumC0656b.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2345c.name());
        }
    }

    /* renamed from: k */
    public void m39312k() {
        HashSet<C0654d> hashSet;
        C0654d c0654d = this.f2346d;
        if (c0654d != null && (hashSet = c0654d.f2343a) != null) {
            hashSet.remove(this);
        }
        this.f2346d = null;
        this.f2347e = 0;
        this.f2348f = -1;
    }

    /* renamed from: l */
    public void m39311l(C11656c c11656c) {
        C11665h c11665h = this.f2349g;
        if (c11665h == null) {
            this.f2349g = new C11665h(C11665h.EnumC11666a.UNRESTRICTED, null);
        } else {
            c11665h.m7273d();
        }
    }

    public String toString() {
        return this.f2344b.m39380p() + ":" + this.f2345c.toString();
    }
}