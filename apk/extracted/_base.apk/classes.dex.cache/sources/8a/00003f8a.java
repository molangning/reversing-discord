package p202kj;

import java.util.Locale;
import java.util.Set;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;
import p184jj.C8972b;

/* renamed from: kj.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9510m implements InterfaceC9500h<Void> {

    /* renamed from: j */
    private final char f25217j;

    /* renamed from: k */
    private final char f25218k;

    /* renamed from: l */
    private final String f25219l;

    /* renamed from: m */
    private final InterfaceC7631c<Character> f25220m;

    /* renamed from: n */
    private final boolean f25221n;

    /* renamed from: o */
    private final boolean f25222o;

    /* renamed from: p */
    private final boolean f25223p;

    public C9510m(String str) {
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            this.f25217j = charAt;
            this.f25218k = charAt;
            this.f25220m = null;
            this.f25219l = str;
            if (charAt >= ' ') {
                boolean z = true;
                this.f25221n = true;
                this.f25222o = (str.length() == 1 && m14461j(charAt)) ? z : false;
                this.f25223p = false;
                return;
            }
            throw new IllegalArgumentException("Literal must not start with non-printable char.");
        }
        throw new IllegalArgumentException("Missing literal.");
    }

    /* renamed from: a */
    private static boolean m14464a(char c, char c2) {
        if (c != c2 && Character.toUpperCase(c) != Character.toUpperCase(c2) && Character.toLowerCase(c) != Character.toLowerCase(c2)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m14462i(char c) {
        return c == 8206 || c == 8207 || c == 1564;
    }

    /* renamed from: j */
    private static boolean m14461j(char c) {
        return (Character.isLetter(c) || Character.isDigit(c) || m14462i(c)) ? false : true;
    }

    /* renamed from: k */
    private void m14460k(CharSequence charSequence, C9518s c9518s) {
        int m14430f = c9518s.m14430f();
        c9518s.m14425k(m14430f, "Cannot parse: \"" + charSequence + "\" (expected: [" + this.f25219l + "], found: [" + charSequence.subSequence(m14430f, Math.min(this.f25219l.length() + m14430f, charSequence.length())) + "])");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0088, code lost:
        if (m14464a(r2, r5) != false) goto L31;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14459l(java.lang.CharSequence r9, p202kj.C9518s r10, p162ij.InterfaceC7633d r11, boolean r12) {
        /*
            r8 = this;
            int r0 = r10.m14430f()
            char r1 = r8.f25217j
            ij.c<java.lang.Character> r2 = r8.f25220m
            r3 = 0
            if (r2 == 0) goto L19
            java.lang.Character r1 = java.lang.Character.valueOf(r3)
            java.lang.Object r1 = r11.mo14441b(r2, r1)
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
        L19:
            int r2 = r9.length()
            r4 = 1
            if (r0 >= r2) goto L8d
            if (r1 == 0) goto L8d
            boolean r2 = java.lang.Character.isDigit(r1)
            if (r2 == 0) goto L2a
            goto L8d
        L2a:
            char r2 = r9.charAt(r0)
            char r5 = r8.f25218k
            ij.c<java.lang.Character> r6 = r8.f25220m
            if (r6 == 0) goto L60
            ij.c<java.lang.Character> r6 = p184jj.C8969a.f23574o
            java.lang.String r6 = r6.name()
            ij.c<java.lang.Character> r7 = r8.f25220m
            java.lang.String r7 = r7.name()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L60
            java.util.Locale r6 = java.util.Locale.ROOT
            ij.c<java.util.Locale> r7 = p184jj.C8969a.f23562c
            java.lang.Object r7 = r11.mo14441b(r7, r6)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L60
            r5 = 46
            r6 = 44
            if (r1 != r6) goto L5b
            goto L60
        L5b:
            if (r1 != r5) goto L5f
            r5 = r6
            goto L60
        L5f:
            r5 = r1
        L60:
            if (r2 == r1) goto L66
            if (r2 == r5) goto L66
            r6 = r4
            goto L67
        L66:
            r6 = r3
        L67:
            if (r6 == 0) goto L8b
            if (r12 == 0) goto L6e
            boolean r11 = r8.f25221n
            goto L7c
        L6e:
            ij.c<java.lang.Boolean> r12 = p184jj.C8969a.f23568i
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Object r11 = r11.mo14441b(r12, r7)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
        L7c:
            if (r11 == 0) goto L8b
            boolean r11 = m14464a(r2, r1)
            if (r11 != 0) goto L8f
            boolean r11 = m14464a(r2, r5)
            if (r11 == 0) goto L8b
            goto L8f
        L8b:
            r3 = r6
            goto L8f
        L8d:
            r2 = r3
            r3 = r4
        L8f:
            if (r3 == 0) goto Lba
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Cannot parse: \""
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "\" (expected: ["
            r11.append(r9)
            r11.append(r1)
            java.lang.String r9 = "], found: ["
            r11.append(r9)
            if (r2 == 0) goto Lad
            r11.append(r2)
        Lad:
            java.lang.String r9 = "])"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.m14425k(r0, r9)
            goto Lbe
        Lba:
            int r0 = r0 + r4
            r10.m14424l(r0)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9510m.m14459l(java.lang.CharSequence, kj.s, ij.d, boolean):void");
    }

    /* renamed from: m */
    private void m14458m(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, boolean z) {
        boolean booleanValue;
        boolean m16901q;
        int m14430f = c9518s.m14430f();
        if (z) {
            booleanValue = this.f25221n;
        } else {
            booleanValue = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue();
        }
        if (z) {
            m16901q = this.f25223p;
        } else {
            m16901q = C8972b.m16901q((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT));
        }
        int m14457n = m14457n(charSequence, m14430f, this.f25219l, booleanValue, m16901q);
        if (m14457n == -1) {
            m14460k(charSequence, c9518s);
        } else {
            c9518s.m14424l(m14430f + m14457n);
        }
    }

    /* renamed from: n */
    public static int m14457n(CharSequence charSequence, int i, CharSequence charSequence2, boolean z, boolean z2) {
        char c;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt = charSequence2.charAt(i3);
            if (!m14462i(charAt)) {
                if (z2) {
                    c = 0;
                    while (true) {
                        int i4 = i2 + i;
                        if (i4 >= length) {
                            break;
                        }
                        c = charSequence.charAt(i4);
                        if (!m14462i(c)) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    int i5 = i2 + i;
                    if (i5 < length) {
                        c = charSequence.charAt(i5);
                    } else {
                        c = 0;
                    }
                }
                if (i2 + i >= length) {
                    return -1;
                }
                i2++;
                if (z) {
                    if (!m14464a(c, charAt)) {
                        return -1;
                    }
                } else if (c != charAt) {
                    return -1;
                }
            }
        }
        if (z2) {
            while (true) {
                int i6 = i2 + i;
                if (i6 >= length || !m14462i(charSequence.charAt(i6))) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public int m14463b() {
        String str = this.f25219l;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length && Character.isDigit(this.f25219l.charAt(i2)); i2++) {
            i++;
        }
        return i;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<Void> mo14365c() {
        return null;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        InterfaceC7631c<Character> interfaceC7631c = this.f25220m;
        if (interfaceC7631c != null) {
            appendable.append(((Character) interfaceC7633d.mo14441b(interfaceC7631c, null)).charValue());
            return 1;
        }
        String str = this.f25219l;
        if (str == null) {
            appendable.append(this.f25217j);
            return 1;
        }
        appendable.append(str);
        return this.f25219l.length();
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    public void mo14363e(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        if (z && this.f25222o) {
            int m14430f = c9518s.m14430f();
            if (m14430f < charSequence.length() && charSequence.charAt(m14430f) == this.f25217j) {
                c9518s.m14424l(m14430f + 1);
            } else if (this.f25217j != '.' || !((Boolean) interfaceC7633d.mo14441b(C8969a.f23570k, Boolean.TRUE)).booleanValue()) {
                m14460k(charSequence, c9518s);
            }
        } else if (this.f25219l == null) {
            m14459l(charSequence, c9518s, interfaceC7633d, z);
        } else {
            m14458m(charSequence, c9518s, interfaceC7633d, z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9510m)) {
            return false;
        }
        C9510m c9510m = (C9510m) obj;
        InterfaceC7631c<Character> interfaceC7631c = this.f25220m;
        if (interfaceC7631c != null) {
            return interfaceC7631c.equals(c9510m.f25220m);
        }
        String str = this.f25219l;
        if (str == null) {
            if (c9510m.f25219l == null && this.f25217j == c9510m.f25217j && this.f25218k == c9510m.f25218k) {
                return true;
            }
            return false;
        } else if (str.equals(c9510m.f25219l) && this.f25222o == c9510m.f25222o) {
            return true;
        } else {
            return false;
        }
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        if (this.f25219l == null || m14463b() != this.f25219l.length()) {
            return false;
        }
        return true;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<Void> mo14361g(InterfaceC7664p<Void> interfaceC7664p) {
        return this;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<Void> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        boolean z;
        boolean m16901q = C8972b.m16901q((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT));
        char c = this.f25217j;
        char c2 = this.f25218k;
        String str = this.f25219l;
        InterfaceC7631c<Character> interfaceC7631c = this.f25220m;
        boolean booleanValue = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue();
        if (this.f25222o && !m16901q) {
            z = true;
        } else {
            z = false;
        }
        return new C9510m(c, c2, str, interfaceC7631c, booleanValue, z, m16901q);
    }

    public int hashCode() {
        String name;
        InterfaceC7631c<Character> interfaceC7631c = this.f25220m;
        if (interfaceC7631c == null) {
            name = this.f25219l;
            if (name == null) {
                name = "";
            }
        } else {
            name = interfaceC7631c.name();
        }
        return name.hashCode() ^ this.f25217j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C9510m.class.getName());
        sb2.append("[literal=");
        if (this.f25220m != null) {
            sb2.append('{');
            sb2.append(this.f25220m);
            sb2.append('}');
        } else {
            String str = this.f25219l;
            if (str == null) {
                sb2.append(this.f25217j);
                if (this.f25218k != this.f25217j) {
                    sb2.append(", alternative=");
                    sb2.append(this.f25218k);
                }
            } else {
                sb2.append(str);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    public C9510m(char c, char c2) {
        this.f25217j = c;
        this.f25218k = c2;
        this.f25220m = null;
        this.f25219l = null;
        if (c >= ' ' && c2 >= ' ') {
            if (!Character.isDigit(c) && !Character.isDigit(c2)) {
                this.f25221n = true;
                this.f25222o = false;
                this.f25223p = false;
                return;
            }
            throw new IllegalArgumentException("Literal must not be a decimal digit.");
        }
        throw new IllegalArgumentException("Literal must not start with non-printable char.");
    }

    public C9510m(InterfaceC7631c<Character> interfaceC7631c) {
        if (interfaceC7631c != null) {
            this.f25217j = (char) 0;
            this.f25218k = (char) 0;
            this.f25220m = interfaceC7631c;
            this.f25219l = null;
            this.f25221n = true;
            this.f25222o = false;
            this.f25223p = false;
            return;
        }
        throw new NullPointerException("Missing format attribute.");
    }

    private C9510m(char c, char c2, String str, InterfaceC7631c<Character> interfaceC7631c, boolean z, boolean z2, boolean z3) {
        this.f25217j = c;
        this.f25218k = c2;
        this.f25219l = str;
        this.f25220m = interfaceC7631c;
        this.f25221n = z;
        this.f25222o = z2;
        this.f25223p = z3;
    }
}