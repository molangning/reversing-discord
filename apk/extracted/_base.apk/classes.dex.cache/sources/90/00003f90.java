package p202kj;

import com.facebook.react.uimanager.ViewDefaults;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;
import p184jj.EnumC8981g;
import p184jj.EnumC8985j;

/* renamed from: kj.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C9516r<V> implements InterfaceC9500h<V> {

    /* renamed from: x */
    private static final int[] f25246x = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, ViewDefaults.NUMBER_OF_LINES};

    /* renamed from: j */
    private final InterfaceC7664p<V> f25247j;

    /* renamed from: k */
    private final boolean f25248k;

    /* renamed from: l */
    private final int f25249l;

    /* renamed from: m */
    private final int f25250m;

    /* renamed from: n */
    private final EnumC9527x f25251n;

    /* renamed from: o */
    private final boolean f25252o;

    /* renamed from: p */
    private final boolean f25253p;

    /* renamed from: q */
    private final EnumC8981g f25254q;

    /* renamed from: r */
    private final int f25255r;

    /* renamed from: s */
    private final char f25256s;

    /* renamed from: t */
    private final EnumC8985j f25257t;

    /* renamed from: u */
    private final int f25258u;

    /* renamed from: v */
    private final int f25259v;

    /* renamed from: w */
    private final boolean f25260w;

    /* renamed from: kj.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    static /* synthetic */ class C9517a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25261a;

        static {
            int[] iArr = new int[EnumC9527x.values().length];
            f25261a = iArr;
            try {
                iArr[EnumC9527x.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25261a[EnumC9527x.SHOW_WHEN_BIG_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9516r(InterfaceC7664p<V> interfaceC7664p, boolean z, int i, int i2, EnumC9527x enumC9527x, boolean z2) {
        this(interfaceC7664p, z, i, i2, enumC9527x, z2, 0, '0', EnumC8985j.f23622j, EnumC8981g.SMART, 0, false);
    }

    /* renamed from: a */
    private static void m14438a(int i, Appendable appendable, char c) {
        int i2 = (i * 103) >>> 10;
        appendable.append((char) (i2 + c));
        appendable.append((char) ((i - ((i2 << 3) + (i2 << 1))) + c));
    }

    /* renamed from: b */
    private int m14437b(EnumC8985j enumC8985j) {
        if (enumC8985j.mo16872m()) {
            Class<V> type = this.f25247j.getType();
            if (type == Integer.class) {
                return 10;
            }
            if (type == Long.class) {
                return 18;
            }
            return 9;
        }
        return 100;
    }

    /* renamed from: i */
    private static int m14436i(int i) {
        int i2 = 0;
        while (i > f25246x[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<V> mo14365c() {
        return this.f25247j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02d0  */
    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo14364d(p162ij.InterfaceC7662o r23, java.lang.Appendable r24, p162ij.InterfaceC7633d r25, java.util.Set<p202kj.C9496g> r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9516r.mo14364d(ij.o, java.lang.Appendable, ij.d, java.util.Set, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:423:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0370  */
    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo14363e(java.lang.CharSequence r26, p202kj.C9518s r27, p162ij.InterfaceC7633d r28, p202kj.AbstractC9519t<?> r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9516r.mo14363e(java.lang.CharSequence, kj.s, ij.d, kj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9516r)) {
            return false;
        }
        C9516r c9516r = (C9516r) obj;
        if (this.f25247j.equals(c9516r.f25247j) && this.f25248k == c9516r.f25248k && this.f25249l == c9516r.f25249l && this.f25250m == c9516r.f25250m && this.f25251n == c9516r.f25251n && this.f25252o == c9516r.f25252o) {
            return true;
        }
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return true;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<V> mo14361g(InterfaceC7664p<V> interfaceC7664p) {
        if (!this.f25252o && this.f25247j != interfaceC7664p) {
            return new C9516r(interfaceC7664p, this.f25248k, this.f25249l, this.f25250m, this.f25251n, false);
        }
        return this;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<V> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        char c;
        char charAt;
        boolean z;
        InterfaceC7631c<EnumC8985j> interfaceC7631c = C8969a.f23571l;
        EnumC8985j enumC8985j = EnumC8985j.f23622j;
        EnumC8985j enumC8985j2 = (EnumC8985j) interfaceC7633d.mo14441b(interfaceC7631c, enumC8985j);
        InterfaceC7631c<Character> interfaceC7631c2 = C8969a.f23572m;
        if (interfaceC7633d.mo14442a(interfaceC7631c2)) {
            charAt = ((Character) interfaceC7633d.mo14440c(interfaceC7631c2)).charValue();
        } else if (enumC8985j2.mo16872m()) {
            charAt = enumC8985j2.mo16873k().charAt(0);
        } else {
            c = '0';
            int intValue = ((Integer) interfaceC7633d.mo14441b(C8969a.f23578s, 0)).intValue();
            if (enumC8985j2 != enumC8985j && c == '0' && this.f25248k && intValue == 0 && this.f25247j.getType() == Integer.class && !this.f25253p) {
                z = true;
            } else {
                z = false;
            }
            return new C9516r(this.f25247j, this.f25248k, this.f25249l, this.f25250m, this.f25251n, this.f25252o, i, c, enumC8985j2, (EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART), intValue, z);
        }
        c = charAt;
        int intValue2 = ((Integer) interfaceC7633d.mo14441b(C8969a.f23578s, 0)).intValue();
        if (enumC8985j2 != enumC8985j) {
        }
        z = false;
        return new C9516r(this.f25247j, this.f25248k, this.f25249l, this.f25250m, this.f25251n, this.f25252o, i, c, enumC8985j2, (EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART), intValue2, z);
    }

    public int hashCode() {
        return (this.f25247j.hashCode() * 7) + ((this.f25249l + (this.f25250m * 10)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(getClass().getName());
        sb2.append("[element=");
        sb2.append(this.f25247j.name());
        sb2.append(", fixed-width-mode=");
        sb2.append(this.f25248k);
        sb2.append(", min-digits=");
        sb2.append(this.f25249l);
        sb2.append(", max-digits=");
        sb2.append(this.f25250m);
        sb2.append(", sign-policy=");
        sb2.append(this.f25251n);
        sb2.append(", protected-mode=");
        sb2.append(this.f25252o);
        sb2.append(']');
        return sb2.toString();
    }

    private C9516r(InterfaceC7664p<V> interfaceC7664p, boolean z, int i, int i2, EnumC9527x enumC9527x, boolean z2, int i3, char c, EnumC8985j enumC8985j, EnumC8981g enumC8981g, int i4, boolean z3) {
        this.f25247j = interfaceC7664p;
        this.f25248k = z;
        this.f25249l = i;
        this.f25250m = i2;
        this.f25251n = enumC9527x;
        this.f25252o = z2;
        this.f25260w = z3;
        if (interfaceC7664p == null) {
            throw new NullPointerException("Missing element.");
        }
        if (enumC9527x == null) {
            throw new NullPointerException("Missing sign policy.");
        }
        if (i < 1) {
            throw new IllegalArgumentException("Not positive: " + i);
        } else if (i > i2) {
            throw new IllegalArgumentException("Max smaller than min: " + i2 + " < " + i);
        } else if (z && i != i2) {
            throw new IllegalArgumentException("Variable width in fixed-width-mode: " + i2 + " != " + i);
        } else if (z && enumC9527x != EnumC9527x.SHOW_NEVER) {
            throw new IllegalArgumentException("Sign policy must be SHOW_NEVER in fixed-width-mode.");
        } else {
            int m14437b = m14437b(enumC8985j);
            if (enumC8985j.mo16872m()) {
                if (i > m14437b) {
                    throw new IllegalArgumentException("Min digits out of range: " + i);
                } else if (i2 > m14437b) {
                    throw new IllegalArgumentException("Max digits out of range: " + i2);
                }
            }
            this.f25253p = interfaceC7664p.name().equals("YEAR_OF_ERA");
            this.f25255r = i3;
            this.f25256s = c;
            this.f25257t = enumC8985j;
            this.f25254q = enumC8981g;
            this.f25258u = i4;
            this.f25259v = m14437b;
        }
    }
}