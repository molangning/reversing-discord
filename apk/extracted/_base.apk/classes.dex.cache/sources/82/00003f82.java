package p202kj;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;
import p184jj.EnumC8981g;

/* renamed from: kj.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9502j implements InterfaceC9500h<Integer> {

    /* renamed from: j */
    private final InterfaceC9500h<Void> f25184j;

    /* renamed from: k */
    private final InterfaceC7664p<Integer> f25185k;

    /* renamed from: l */
    private final int f25186l;

    /* renamed from: m */
    private final int f25187m;

    /* renamed from: n */
    private final boolean f25188n;

    /* renamed from: o */
    private final char f25189o;

    /* renamed from: p */
    private final EnumC8981g f25190p;

    public C9502j(InterfaceC7664p<Integer> interfaceC7664p, int i, int i2, boolean z) {
        this.f25185k = interfaceC7664p;
        this.f25186l = i;
        this.f25187m = i2;
        this.f25188n = !z && i == i2;
        this.f25184j = z ? new C9510m(C8969a.f23574o) : null;
        if (interfaceC7664p == null) {
            throw new NullPointerException("Missing element.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative min digits: " + i);
        } else if (i > i2) {
            throw new IllegalArgumentException("Max smaller than min: " + i2 + " < " + i);
        } else if (i > 9) {
            throw new IllegalArgumentException("Min digits out of range: " + i);
        } else if (i2 <= 9) {
            this.f25189o = '0';
            this.f25190p = EnumC8981g.SMART;
        } else {
            throw new IllegalArgumentException("Max digits out of range: " + i2);
        }
    }

    /* renamed from: a */
    private int m14492a(BigDecimal bigDecimal, int i, int i2) {
        BigDecimal valueOf = BigDecimal.valueOf(i);
        return bigDecimal.multiply(BigDecimal.valueOf(i2).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).intValueExact();
    }

    /* renamed from: b */
    private boolean m14491b() {
        return this.f25184j != null;
    }

    /* renamed from: i */
    private static BigDecimal m14490i(Number number) {
        return BigDecimal.valueOf(number.longValue());
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<Integer> mo14365c() {
        return this.f25185k;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        BigDecimal stripTrailingZeros;
        char charValue;
        int i;
        int i2;
        int i3;
        BigDecimal m14490i = m14490i((Number) interfaceC7662o.mo10212i(this.f25185k));
        BigDecimal m14490i2 = m14490i((Number) interfaceC7662o.mo10215f(this.f25185k));
        BigDecimal m14490i3 = m14490i((Number) interfaceC7662o.mo10211l(this.f25185k));
        if (m14490i.compareTo(m14490i3) > 0) {
            m14490i = m14490i3;
        }
        BigDecimal divide = m14490i.subtract(m14490i2).divide(m14490i3.subtract(m14490i2).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        if (divide.compareTo(BigDecimal.ZERO) == 0) {
            stripTrailingZeros = BigDecimal.ZERO;
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        BigDecimal bigDecimal = stripTrailingZeros;
        if (z) {
            charValue = this.f25189o;
        } else {
            charValue = ((Character) interfaceC7633d.mo14441b(C8969a.f23572m, '0')).charValue();
        }
        char c = charValue;
        if (appendable instanceof CharSequence) {
            i = ((CharSequence) appendable).length();
        } else {
            i = -1;
        }
        int i4 = 0;
        if (bigDecimal.scale() == 0) {
            if (this.f25186l > 0) {
                if (m14491b()) {
                    this.f25184j.mo14364d(interfaceC7662o, appendable, interfaceC7633d, set, z);
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                while (true) {
                    i3 = this.f25186l;
                    if (i4 >= i3) {
                        break;
                    }
                    appendable.append(c);
                    i4++;
                }
                i4 = i2 + i3;
            }
        } else {
            if (m14491b()) {
                this.f25184j.mo14364d(interfaceC7662o, appendable, interfaceC7633d, set, z);
                i4 = 1;
            }
            String plainString = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), this.f25186l), this.f25187m), RoundingMode.FLOOR).toPlainString();
            int i5 = c - '0';
            int length = plainString.length();
            for (int i6 = 2; i6 < length; i6++) {
                appendable.append((char) (plainString.charAt(i6) + i5));
                i4++;
            }
        }
        if (i != -1 && i4 > 1 && set != null) {
            set.add(new C9496g(this.f25185k, i + 1, i + i4));
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo14363e(java.lang.CharSequence r20, p202kj.C9518s r21, p162ij.InterfaceC7633d r22, p202kj.AbstractC9519t<?> r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9502j.mo14363e(java.lang.CharSequence, kj.s, ij.d, kj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9502j)) {
            return false;
        }
        C9502j c9502j = (C9502j) obj;
        if (this.f25185k.equals(c9502j.f25185k) && this.f25186l == c9502j.f25186l && this.f25187m == c9502j.f25187m && m14491b() == c9502j.m14491b()) {
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
    public InterfaceC9500h<Integer> mo14361g(InterfaceC7664p<Integer> interfaceC7664p) {
        if (this.f25185k == interfaceC7664p) {
            return this;
        }
        return new C9502j(interfaceC7664p, this.f25186l, this.f25187m, m14491b());
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<Integer> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        return new C9502j(this.f25184j, this.f25185k, this.f25186l, this.f25187m, this.f25188n, ((Character) interfaceC7633d.mo14441b(C8969a.f23572m, '0')).charValue(), (EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART));
    }

    public int hashCode() {
        return (this.f25185k.hashCode() * 7) + ((this.f25186l + (this.f25187m * 10)) * 31);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ij.q, ij.q<?>] */
    /* renamed from: j */
    public AbstractC7665q<?> m14489j(AbstractC7665q<?> abstractC7665q, AbstractC7665q<?> abstractC7665q2) {
        EnumC9503k enumC9503k = EnumC9503k.FRACTION;
        if (!abstractC7665q2.mo10210q(enumC9503k)) {
            return abstractC7665q;
        }
        int m14492a = m14492a((BigDecimal) abstractC7665q2.mo10212i(enumC9503k), ((Integer) abstractC7665q.mo10215f(this.f25185k)).intValue(), ((Integer) abstractC7665q.mo10211l(this.f25185k)).intValue());
        abstractC7665q2.mo14419F(enumC9503k, null);
        abstractC7665q2.mo14420D(this.f25185k, m14492a);
        return abstractC7665q.mo14420D(this.f25185k, m14492a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9502j.class.getName());
        sb2.append("[element=");
        sb2.append(this.f25185k.name());
        sb2.append(", min-digits=");
        sb2.append(this.f25186l);
        sb2.append(", max-digits=");
        sb2.append(this.f25187m);
        sb2.append(']');
        return sb2.toString();
    }

    private C9502j(InterfaceC9500h<Void> interfaceC9500h, InterfaceC7664p<Integer> interfaceC7664p, int i, int i2, boolean z, char c, EnumC8981g enumC8981g) {
        this.f25184j = interfaceC9500h;
        this.f25185k = interfaceC7664p;
        this.f25186l = i;
        this.f25187m = i2;
        this.f25188n = z;
        this.f25189o = c;
        this.f25190p = enumC8981g;
    }
}