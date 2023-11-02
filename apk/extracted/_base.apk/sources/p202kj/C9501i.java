package p202kj;

import java.util.LinkedHashSet;
import java.util.Set;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;
import p184jj.EnumC8981g;
import p220lj.InterfaceC10214a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9501i {

    /* renamed from: a */
    private final InterfaceC9500h<?> f25174a;

    /* renamed from: b */
    private final int f25175b;

    /* renamed from: c */
    private final int f25176c;

    /* renamed from: d */
    private final C9476b f25177d;

    /* renamed from: e */
    private final InterfaceC7633d f25178e;

    /* renamed from: f */
    private final int f25179f;

    /* renamed from: g */
    private final int f25180g;

    /* renamed from: h */
    private final int f25181h;

    /* renamed from: i */
    private final boolean f25182i;

    /* renamed from: j */
    private final int f25183j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9501i(InterfaceC9500h<?> interfaceC9500h, int i, int i2, C9476b c9476b) {
        this(interfaceC9500h, i, i2, c9476b, null, 0, 0, 0, false, -1);
    }

    /* renamed from: a */
    private void m14516a(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        int m14430f = c9518s.m14430f();
        try {
            this.f25174a.mo14363e(charSequence, c9518s, interfaceC7633d, abstractC9519t, z);
        } catch (RuntimeException e) {
            c9518s.m14425k(m14430f, e.getMessage());
        }
    }

    /* renamed from: c */
    private char m14514c(InterfaceC7633d interfaceC7633d) {
        return ((Character) interfaceC7633d.mo14441b(C8969a.f23575p, ' ')).charValue();
    }

    /* renamed from: e */
    private InterfaceC7633d m14512e(InterfaceC7633d interfaceC7633d) {
        C9476b c9476b = this.f25177d;
        if (c9476b == null) {
            return interfaceC7633d;
        }
        return new C9514p(c9476b, interfaceC7633d);
    }

    /* renamed from: h */
    private static boolean m14509h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: k */
    private boolean m14506k(InterfaceC7662o interfaceC7662o) {
        InterfaceC7660n<InterfaceC7662o> m14679f;
        C9476b c9476b = this.f25177d;
        if (c9476b == null || (m14679f = c9476b.m14679f()) == null || m14679f.test(interfaceC7662o)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m14505l(InterfaceC7633d interfaceC7633d) {
        return ((EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART)).m16887c();
    }

    /* renamed from: o */
    private String m14502o() {
        return "Pad width exceeded: " + this.f25174a.mo14365c().name();
    }

    /* renamed from: p */
    private String m14501p() {
        return "Pad width mismatched: " + this.f25174a.mo14365c().name();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private static <V> InterfaceC9500h<V> m14494w(InterfaceC9500h<V> interfaceC9500h, InterfaceC7664p<?> interfaceC7664p) {
        if (interfaceC9500h.mo14365c() == null) {
            return interfaceC9500h;
        }
        if (interfaceC9500h.mo14365c().getType() != interfaceC7664p.getType() && !(interfaceC7664p instanceof InterfaceC10214a)) {
            throw new IllegalArgumentException("Cannot change element value type: " + interfaceC7664p.name());
        }
        return interfaceC9500h.mo14361g(interfaceC7664p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m14515b() {
        return this.f25175b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC9500h<?> m14513d() {
        return this.f25174a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9501i)) {
            return false;
        }
        C9501i c9501i = (C9501i) obj;
        if (this.f25174a.equals(c9501i.f25174a) && this.f25175b == c9501i.f25175b && this.f25176c == c9501i.f25176c && m14509h(this.f25177d, c9501i.f25177d) && m14509h(this.f25178e, c9501i.f25178e) && this.f25179f == c9501i.f25179f && this.f25180g == c9501i.f25180g && this.f25181h == c9501i.f25181h && this.f25182i == c9501i.f25182i && this.f25183j == c9501i.f25183j) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m14511f() {
        return this.f25176c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m14510g() {
        return this.f25174a instanceof C9502j;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f25174a.hashCode() * 7;
        C9476b c9476b = this.f25177d;
        if (c9476b == null) {
            hashCode = 0;
        } else {
            hashCode = c9476b.hashCode();
        }
        return hashCode2 + (hashCode * 31);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m14508i() {
        return this.f25182i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m14507j() {
        return this.f25174a.mo14362f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C9501i m14504m(int i) {
        if (this.f25182i) {
            return new C9501i(this.f25174a, this.f25175b, this.f25176c, this.f25177d, this.f25178e, this.f25179f, this.f25180g, this.f25181h, true, i);
        }
        throw new IllegalStateException("This step is not starting an or-block.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C9501i m14503n(int i, int i2) {
        return new C9501i(this.f25174a, this.f25175b, this.f25176c, this.f25177d, null, this.f25179f, this.f25180g + i, this.f25181h + i2, this.f25182i, this.f25183j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        r11 = r10.f25181h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
        if (r11 <= 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
        if ((r15 + r0) == r11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
        r12.m14425k(r14 - r0, m14501p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
        return;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m14500q(java.lang.CharSequence r11, p202kj.C9518s r12, p162ij.InterfaceC7633d r13, p202kj.AbstractC9519t<?> r14, boolean r15) {
        /*
            r10 = this;
            if (r15 == 0) goto L5
            ij.d r13 = r10.f25178e
            goto L9
        L5:
            ij.d r13 = r10.m14512e(r13)
        L9:
            r3 = r13
            int r13 = r10.f25180g
            if (r13 != 0) goto L1b
            int r13 = r10.f25181h
            if (r13 != 0) goto L1b
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.m14516a(r1, r2, r3, r4, r5)
            return
        L1b:
            boolean r13 = r10.m14505l(r3)
            char r6 = r10.m14514c(r3)
            int r7 = r12.m14430f()
            int r8 = r11.length()
            r0 = r7
        L2c:
            if (r0 >= r8) goto L37
            char r1 = r11.charAt(r0)
            if (r1 != r6) goto L37
            int r0 = r0 + 1
            goto L2c
        L37:
            int r9 = r0 - r7
            if (r13 == 0) goto L47
            int r1 = r10.f25180g
            if (r9 <= r1) goto L47
            java.lang.String r11 = r10.m14502o()
            r12.m14425k(r7, r11)
            return
        L47:
            r12.m14424l(r0)
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.m14516a(r1, r2, r3, r4, r5)
            boolean r14 = r12.m14427i()
            if (r14 == 0) goto L59
            return
        L59:
            int r14 = r12.m14430f()
            int r15 = r14 - r7
            int r15 = r15 - r9
            if (r13 == 0) goto L71
            int r0 = r10.f25180g
            if (r0 <= 0) goto L71
            int r9 = r9 + r15
            if (r9 == r0) goto L71
            java.lang.String r11 = r10.m14501p()
            r12.m14425k(r7, r11)
            return
        L71:
            r0 = 0
        L72:
            if (r14 >= r8) goto L87
            if (r13 == 0) goto L7c
            int r1 = r15 + r0
            int r2 = r10.f25181h
            if (r1 >= r2) goto L87
        L7c:
            char r1 = r11.charAt(r14)
            if (r1 != r6) goto L87
            int r14 = r14 + 1
            int r0 = r0 + 1
            goto L72
        L87:
            if (r13 == 0) goto L99
            int r11 = r10.f25181h
            if (r11 <= 0) goto L99
            int r15 = r15 + r0
            if (r15 == r11) goto L99
            int r14 = r14 - r0
            java.lang.String r11 = r10.m14501p()
            r12.m14425k(r14, r11)
            return
        L99:
            r12.m14424l(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9501i.m14500q(java.lang.CharSequence, kj.s, ij.d, kj.t, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m14499r(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        InterfaceC7633d m14512e;
        StringBuilder sb2;
        int i;
        LinkedHashSet linkedHashSet;
        int i2;
        int length;
        if (!m14506k(interfaceC7662o)) {
            return 0;
        }
        if (z) {
            m14512e = this.f25178e;
        } else {
            m14512e = m14512e(interfaceC7633d);
        }
        InterfaceC7633d interfaceC7633d2 = m14512e;
        if (this.f25180g == 0 && this.f25181h == 0) {
            return this.f25174a.mo14364d(interfaceC7662o, appendable, interfaceC7633d2, set, z);
        }
        if (appendable instanceof StringBuilder) {
            sb2 = (StringBuilder) appendable;
            i = sb2.length();
        } else {
            sb2 = new StringBuilder();
            i = -1;
        }
        if ((appendable instanceof CharSequence) && set != null) {
            if (sb2 == appendable) {
                InterfaceC9500h<?> interfaceC9500h = this.f25174a;
                if ((interfaceC9500h instanceof C9493f) || (interfaceC9500h instanceof C9529z)) {
                    length = 0;
                    linkedHashSet = new LinkedHashSet();
                    i2 = length;
                }
            }
            length = ((CharSequence) appendable).length();
            linkedHashSet = new LinkedHashSet();
            i2 = length;
        } else {
            linkedHashSet = null;
            i2 = -1;
        }
        LinkedHashSet<C9496g> linkedHashSet2 = linkedHashSet;
        boolean m14505l = m14505l(interfaceC7633d2);
        char m14514c = m14514c(interfaceC7633d2);
        int length2 = sb2.length();
        this.f25174a.mo14364d(interfaceC7662o, sb2, interfaceC7633d2, linkedHashSet2, z);
        int length3 = sb2.length() - length2;
        int i3 = this.f25180g;
        if (i3 > 0) {
            if (m14505l && length3 > i3) {
                throw new IllegalArgumentException(m14502o());
            }
            int i4 = length3;
            int i5 = 0;
            while (i4 < this.f25180g) {
                if (i == -1) {
                    appendable.append(m14514c);
                } else {
                    sb2.insert(i, m14514c);
                }
                i4++;
                i5++;
            }
            if (i == -1) {
                appendable.append(sb2);
            }
            if (i2 != -1) {
                int i6 = i2 + i5;
                for (C9496g c9496g : linkedHashSet2) {
                    set.add(new C9496g(c9496g.m14538a(), c9496g.m14536c() + i6, c9496g.m14537b() + i6));
                }
            }
            int i7 = this.f25181h;
            if (i7 > 0) {
                if (m14505l && length3 > i7) {
                    throw new IllegalArgumentException(m14502o());
                }
                while (length3 < this.f25181h) {
                    appendable.append(m14514c);
                    length3++;
                    i4++;
                }
                return i4;
            }
            return i4;
        } else if (m14505l && length3 > this.f25181h) {
            throw new IllegalArgumentException(m14502o());
        } else {
            if (i == -1) {
                appendable.append(sb2);
            }
            while (length3 < this.f25181h) {
                appendable.append(m14514c);
                length3++;
            }
            if (i2 != -1) {
                for (C9496g c9496g2 : linkedHashSet2) {
                    set.add(new C9496g(c9496g2.m14538a(), c9496g2.m14536c() + i2, c9496g2.m14537b() + i2));
                }
            }
            return length3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C9501i m14498s(C9479c<?> c9479c) {
        C9476b m14627p = c9479c.m14627p();
        if (this.f25177d != null) {
            m14627p = m14627p.m14673l(new C8969a.C8971b().m16921f(m14627p.m14680e()).m16921f(this.f25177d.m14680e()).m16926a());
        }
        C9476b c9476b = m14627p;
        return new C9501i(this.f25174a.mo14360h(c9479c, c9476b, this.f25179f), this.f25175b, this.f25176c, this.f25177d, c9476b, this.f25179f, this.f25180g, this.f25181h, this.f25182i, this.f25183j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C9501i m14497t(int i) {
        return new C9501i(this.f25174a, this.f25175b, this.f25176c, this.f25177d, null, this.f25179f + i, this.f25180g, this.f25181h, this.f25182i, this.f25183j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[processor=");
        sb2.append(this.f25174a);
        sb2.append(", level=");
        sb2.append(this.f25175b);
        sb2.append(", section=");
        sb2.append(this.f25176c);
        if (this.f25177d != null) {
            sb2.append(", attributes=");
            sb2.append(this.f25177d);
        }
        sb2.append(", reserved=");
        sb2.append(this.f25179f);
        sb2.append(", pad-left=");
        sb2.append(this.f25180g);
        sb2.append(", pad-right=");
        sb2.append(this.f25181h);
        if (this.f25182i) {
            sb2.append(", or-block-started");
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public int m14496u() {
        return this.f25183j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C9501i m14495v() {
        if (!this.f25182i) {
            return new C9501i(this.f25174a, this.f25175b, this.f25176c, this.f25177d, null, this.f25179f, this.f25180g, this.f25181h, true, -1);
        }
        throw new IllegalStateException("Cannot start or-block twice.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public C9501i m14493x(InterfaceC7664p<?> interfaceC7664p) {
        InterfaceC9500h<?> m14494w = m14494w(this.f25174a, interfaceC7664p);
        if (this.f25174a == m14494w) {
            return this;
        }
        return new C9501i(m14494w, this.f25175b, this.f25176c, this.f25177d, this.f25178e, this.f25179f, this.f25180g, this.f25181h, this.f25182i, this.f25183j);
    }

    private C9501i(InterfaceC9500h<?> interfaceC9500h, int i, int i2, C9476b c9476b, InterfaceC7633d interfaceC7633d, int i3, int i4, int i5, boolean z, int i6) {
        if (interfaceC9500h == null) {
            throw new NullPointerException("Missing format processor.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Invalid level: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Invalid section: " + i2);
        } else if (i3 < 0) {
            throw new IllegalArgumentException("Reserved chars must not be negative: " + i3);
        } else if (i4 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i4);
        } else if (i5 >= 0) {
            this.f25174a = interfaceC9500h;
            this.f25175b = i;
            this.f25176c = i2;
            this.f25177d = c9476b;
            this.f25178e = interfaceC7633d;
            this.f25179f = i3;
            this.f25180g = i4;
            this.f25181h = i5;
            this.f25182i = z;
            this.f25183j = i6;
        } else {
            throw new IllegalArgumentException("Invalid pad-width: " + i5);
        }
    }
}
