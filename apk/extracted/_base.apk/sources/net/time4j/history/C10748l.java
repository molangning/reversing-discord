package net.time4j.history;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.InvalidObjectException;
import java.text.ParsePosition;
import java.util.List;
import java.util.Locale;
import net.time4j.C10697f0;
import net.time4j.EnumC10612b0;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;
import p162ij.AbstractC7635e;
import p162ij.AbstractC7665q;
import p162ij.C7643h;
import p162ij.C7666r;
import p162ij.C7672x;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7676z;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.C9013s;
import p184jj.EnumC8981g;
import p184jj.EnumC8985j;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p220lj.InterfaceC10214a;
import p235mj.EnumC10476a;
import p251nj.C10918c;

/* renamed from: net.time4j.history.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class C10748l extends C10918c implements InterfaceC10214a {
    private static final long serialVersionUID = -6283098762945747308L;
    private final C10736d history;

    /* renamed from: o */
    private final transient int f28065o;

    /* renamed from: net.time4j.history.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C10749a<C extends AbstractC7665q<C>> implements InterfaceC7676z<C, Integer> {

        /* renamed from: j */
        private final int f28066j;

        /* renamed from: k */
        private final C10736d f28067k;

        C10749a(int i, C10736d c10736d) {
            this.f28066j = i;
            this.f28067k = c10736d;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        private C10741h m10344a(C c, int i) {
            EnumC10476a enumC10476a;
            C10741h m10416e = this.f28067k.m10416e((C10697f0) c.mo10212i(C10697f0.f27907x));
            EnumC10476a enumC10476a2 = EnumC10476a.DUAL_DATING;
            C10761o m10398w = this.f28067k.m10398w();
            int i2 = this.f28066j;
            switch (i2) {
                case 2:
                    break;
                case 3:
                    return this.f28067k.m10420a(C10741h.m10379g(m10416e.m10383c(), m10416e.m10381e(), i, m10416e.m10384b()));
                case 4:
                    return C10741h.m10379g(m10416e.m10383c(), m10416e.m10381e(), m10416e.m10382d(), i);
                case 5:
                    int m10380f = m10416e.m10380f(this.f28067k.m10398w());
                    C10741h m10408m = this.f28067k.m10408m(m10416e.m10383c(), m10380f);
                    int m10399v = this.f28067k.m10399v(m10416e.m10383c(), m10380f);
                    if (i == 1) {
                        return m10408m;
                    }
                    if (i > 1 && i <= m10399v) {
                        return this.f28067k.m10416e(this.f28067k.m10417d(m10408m).m20130V(C7643h.m20178c(i - 1)));
                    }
                    throw new IllegalArgumentException("Out of range: " + i);
                case 6:
                case 7:
                    if (i2 == 6) {
                        enumC10476a = EnumC10476a.AFTER_NEW_YEAR;
                    } else {
                        enumC10476a = EnumC10476a.BEFORE_NEW_YEAR;
                    }
                    enumC10476a2 = enumC10476a;
                    break;
                case 8:
                    int i3 = 100;
                    int m10381e = m10416e.m10381e() % 100;
                    int i4 = (i - 1) * 100;
                    if (m10381e != 0) {
                        i3 = m10381e;
                    }
                    return this.f28067k.m10420a(C10741h.m10378h(m10416e.m10383c(), i4 + i3, m10416e.m10382d(), m10416e.m10384b(), enumC10476a2, m10398w));
                default:
                    throw new UnsupportedOperationException("Unknown element index: " + this.f28066j);
            }
            return this.f28067k.m10420a(C10741h.m10378h(m10416e.m10383c(), i, m10416e.m10382d(), m10416e.m10384b(), enumC10476a2, m10398w));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public Integer mo9922f(C c) {
            int i;
            C10741h m10344a;
            int i2;
            int m10384b;
            try {
                C10741h m10416e = this.f28067k.m10416e((C10697f0) c.mo10212i(C10697f0.f27907x));
                int i3 = 8;
                int i4 = 999984973;
                switch (this.f28066j) {
                    case 2:
                    case 6:
                    case 7:
                    case 8:
                        C10736d c10736d = this.f28067k;
                        if (c10736d != C10736d.f28012B) {
                            if (c10736d == C10736d.f28011A) {
                                if (m10416e.m10383c() == EnumC10744j.BC) {
                                    i4 = 999979466;
                                } else {
                                    i4 = 999979465;
                                }
                            } else if (c10736d == C10736d.f28018z) {
                                if (m10416e.m10383c() == EnumC10744j.BC) {
                                    i4 = 1000000000;
                                } else {
                                    i4 = 999999999;
                                }
                            } else {
                                if (m10416e.m10383c() == EnumC10744j.BC) {
                                    i = 45;
                                } else {
                                    i = 9999;
                                }
                                i4 = i;
                            }
                        }
                        if (this.f28066j == 8) {
                            i4 = ((i4 - 1) / 100) + 1;
                        }
                        return Integer.valueOf(i4);
                    case 3:
                        if (m10416e.m10383c() != EnumC10744j.BYZANTINE || m10416e.m10381e() != 999984973) {
                            i3 = 12;
                        }
                        m10344a = m10344a(c, i3);
                        i2 = i3;
                        break;
                    case 4:
                        i2 = this.f28067k.m10410k(m10416e).mo10436b(m10416e);
                        m10344a = m10344a(c, i2);
                        break;
                    case 5:
                        int m10399v = this.f28067k.m10399v(m10416e.m10383c(), m10416e.m10380f(this.f28067k.m10398w()));
                        if (m10399v != -1) {
                            return Integer.valueOf(m10399v);
                        }
                        throw new C7666r("Length of historic year undefined.");
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f28066j);
                }
                if (this.f28067k.m10432B(m10344a)) {
                    return Integer.valueOf(i2);
                }
                List<C10739f> m10404q = this.f28067k.m10404q();
                int size = m10404q.size() - 1;
                while (true) {
                    if (size >= 0) {
                        C10739f c10739f = m10404q.get(size);
                        if (m10416e.compareTo(c10739f.f28042c) < 0) {
                            m10344a = c10739f.f28043d;
                        } else {
                            size--;
                        }
                    }
                }
                if (this.f28066j == 3) {
                    m10384b = m10344a.m10382d();
                } else {
                    m10384b = m10344a.m10384b();
                }
                return Integer.valueOf(m10384b);
            } catch (RuntimeException e) {
                throw new C7666r(e.getMessage(), e);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9917l(C c) {
            int m10384b;
            try {
                C10741h m10416e = this.f28067k.m10416e((C10697f0) c.mo10212i(C10697f0.f27907x));
                int i = this.f28066j;
                if (i != 2 && i != 6 && i != 7 && i != 8) {
                    C10741h m10344a = m10344a(c, 1);
                    if (this.f28067k.m10432B(m10344a)) {
                        return 1;
                    }
                    if (this.f28066j != 5) {
                        List<C10739f> m10404q = this.f28067k.m10404q();
                        int size = m10404q.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            C10739f c10739f = m10404q.get(size);
                            if (m10416e.compareTo(c10739f.f28042c) >= 0) {
                                m10344a = c10739f.f28042c;
                                break;
                            }
                            size--;
                        }
                        if (this.f28066j == 3) {
                            m10384b = m10344a.m10382d();
                        } else {
                            m10384b = m10344a.m10384b();
                        }
                        return Integer.valueOf(m10384b);
                    }
                    throw new C7666r("Historic New Year cannot be determined.");
                }
                if (m10416e.m10383c() == EnumC10744j.BYZANTINE && m10416e.m10382d() >= 9) {
                    return 0;
                }
                return 1;
            } catch (IllegalArgumentException e) {
                throw new C7666r(e.getMessage(), e);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public Integer mo9915o(C c) {
            int m10381e;
            try {
                C10697f0 c10697f0 = (C10697f0) c.mo10212i(C10697f0.f27907x);
                C10741h m10416e = this.f28067k.m10416e(c10697f0);
                switch (this.f28066j) {
                    case 2:
                        m10381e = m10416e.m10381e();
                        break;
                    case 3:
                        m10381e = m10416e.m10382d();
                        break;
                    case 4:
                        m10381e = m10416e.m10384b();
                        break;
                    case 5:
                        m10381e = (int) ((c10697f0.mo10920b() - this.f28067k.m10417d(this.f28067k.m10408m(m10416e.m10383c(), m10416e.m10380f(this.f28067k.m10398w()))).mo10920b()) + 1);
                        break;
                    case 6:
                    case 7:
                        m10381e = m10416e.m10380f(this.f28067k.m10398w());
                        break;
                    case 8:
                        m10381e = ((m10416e.m10381e() - 1) / 100) + 1;
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f28066j);
                }
                return Integer.valueOf(m10381e);
            } catch (IllegalArgumentException e) {
                throw new C7666r(e.getMessage(), e);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public boolean mo9920i(C c, Integer num) {
            if (num == null) {
                return false;
            }
            try {
                return this.f28067k.m10432B(m10344a(c, num.intValue()));
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public C mo9916n(C c, Integer num, boolean z) {
            if (num != null) {
                return (C) c.mo14419F(C10697f0.f27907x, this.f28067k.m10417d(m10344a(c, num.intValue())));
            }
            throw new IllegalArgumentException("Missing historic element value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10748l(char c, int i, int i2, C10736d c10736d, int i3) {
        super(m10348K(i3), c, i, i2);
        this.history = c10736d;
        this.f28065o = i3;
    }

    /* renamed from: B */
    private String m10354B(EnumC8985j enumC8985j, char c, int i, int i2, int i3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(enumC8985j.mo16870q(i));
        sb2.append('/');
        if (enumC8985j.mo16872m() && i2 >= 100 && C10616c.m11041a(i, 100) == C10616c.m11041a(i2, 100)) {
            int m11039c = C10616c.m11039c(i2, 100);
            if (m11039c < 10) {
                sb2.append(c);
            }
            sb2.append(enumC8985j.mo16870q(m11039c));
        } else {
            sb2.append(enumC8985j.mo16870q(i2));
        }
        if (enumC8985j.mo16872m()) {
            return m10351E(sb2.toString(), i3, c);
        }
        return sb2.toString();
    }

    /* renamed from: C */
    private int m10353C(int i, int i2, int i3) {
        if (i2 >= 0) {
            int i4 = 100;
            if (i2 < 100 && i >= 100) {
                if (i2 < 10) {
                    i4 = 10;
                }
                if (Math.abs(i2 - C10616c.m11039c(i, i4)) <= i3) {
                    return (C10616c.m11041a(i, i4) * i4) + i2;
                }
                return ViewDefaults.NUMBER_OF_LINES;
            }
            return ViewDefaults.NUMBER_OF_LINES;
        }
        return ViewDefaults.NUMBER_OF_LINES;
    }

    /* renamed from: D */
    private C9013s m10352D(InterfaceC7633d interfaceC7633d, EnumC9003m enumC9003m) {
        return C8972b.m16914d((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT)).m16906l((EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE), enumC9003m);
    }

    /* renamed from: E */
    private static String m10351E(String str, int i, char c) {
        int length = str.length();
        if (i <= length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i2 = i - length;
        for (int i3 = 0; i3 < i2; i3++) {
            sb2.append(c);
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: I */
    private static int m10349I(EnumC8985j enumC8985j, char c, CharSequence charSequence, int i, ParsePosition parsePosition, EnumC8981g enumC8981g) {
        int i2;
        boolean z;
        int charAt;
        int i3 = 0;
        long j = 0;
        if (enumC8985j.mo16872m()) {
            if (enumC8985j == EnumC8985j.f23622j && charSequence.charAt(i) == '-') {
                i2 = i + 1;
                z = true;
            } else {
                i2 = i;
                z = false;
            }
            if (!enumC8981g.m16887c()) {
                i3 = enumC8985j.mo16873k().charAt(0);
            }
            int min = Math.min(i2 + 9, charSequence.length());
            int i4 = i2;
            while (i2 < min) {
                int charAt2 = charSequence.charAt(i2) - c;
                if (charAt2 >= 0 && charAt2 <= 9) {
                    j = (j * 10) + charAt2;
                    i4++;
                } else if (i3 == 0 || c == i3 || (charAt = charSequence.charAt(i2) - i3) < 0 || charAt > 9) {
                    break;
                } else {
                    j = (j * 10) + charAt;
                    i4++;
                    c = i3;
                }
                i2++;
            }
            if (j > 2147483647L) {
                parsePosition.setErrorIndex(i);
                return Integer.MIN_VALUE;
            }
            if (z) {
                if (i4 != i + 1) {
                    j = C10616c.m11031k(j);
                }
            }
            i = i4;
        } else {
            int length = charSequence.length();
            for (int i5 = i; i5 < length && enumC8985j.mo16874h(charSequence.charAt(i5)); i5++) {
                i3++;
            }
            if (i3 > 0) {
                int i6 = i3 + i;
                j = enumC8985j.mo16871o(charSequence.subSequence(i, i6).toString(), enumC8981g);
                i = i6;
            }
        }
        parsePosition.setIndex(i);
        return (int) j;
    }

    /* renamed from: K */
    private static String m10348K(int i) {
        switch (i) {
            case 2:
                return "YEAR_OF_ERA";
            case 3:
                return "HISTORIC_MONTH";
            case 4:
                return "HISTORIC_DAY_OF_MONTH";
            case 5:
                return "HISTORIC_DAY_OF_YEAR";
            case 6:
                return "YEAR_AFTER";
            case 7:
                return "YEAR_BEFORE";
            case 8:
                return "CENTURY_OF_ERA";
            default:
                throw new UnsupportedOperationException("Unknown element index: " + i);
        }
    }

    private Object readResolve() {
        String name = name();
        if (name.equals("YEAR_OF_ERA")) {
            return this.history.m10421M();
        }
        if (name.equals("HISTORIC_MONTH")) {
            return this.history.m10431C();
        }
        if (name.equals("HISTORIC_DAY_OF_MONTH")) {
            return this.history.m10414g();
        }
        if (name.equals("HISTORIC_DAY_OF_YEAR")) {
            return this.history.m10413h();
        }
        if (name.equals("YEAR_AFTER")) {
            return this.history.m10422L(EnumC10476a.AFTER_NEW_YEAR);
        }
        if (name.equals("YEAR_BEFORE")) {
            return this.history.m10422L(EnumC10476a.BEFORE_NEW_YEAR);
        }
        if (name.equals("CENTURY_OF_ERA")) {
            return this.history.m10419b();
        }
        throw new InvalidObjectException("Unknown element: " + name);
    }

    /* renamed from: y */
    private void m10345y(String str, int i) {
        if (str.length() <= i) {
            return;
        }
        throw new IllegalArgumentException("Element " + name() + " cannot be printed as the formatted value " + str + " exceeds the maximum width of " + i + ".");
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: F */
    public Integer mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
        return mo10347h(charSequence, parsePosition, interfaceC7633d, null);
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: Q */
    public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        char c;
        EnumC8985j enumC8985j = (EnumC8985j) interfaceC7633d.mo14441b(C8969a.f23571l, EnumC8985j.f23622j);
        InterfaceC7631c<Character> interfaceC7631c = C8969a.f23572m;
        if (interfaceC7633d.mo14442a(interfaceC7631c)) {
            c = ((Character) interfaceC7633d.mo14440c(interfaceC7631c)).charValue();
        } else if (enumC8985j.mo16872m()) {
            c = enumC8985j.mo16873k().charAt(0);
        } else {
            c = '0';
        }
        mo10346r(interfaceC7662o, appendable, interfaceC7633d, enumC8985j, c, 1, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    @Override // p220lj.InterfaceC10214a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer mo10347h(java.lang.CharSequence r17, java.text.ParsePosition r18, p162ij.InterfaceC7633d r19, p162ij.AbstractC7665q<?> r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.C10748l.mo10347h(java.lang.CharSequence, java.text.ParsePosition, ij.d, ij.q):java.lang.Integer");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7635e
    /* renamed from: p */
    public <T extends AbstractC7665q<T>> InterfaceC7676z<T, Integer> mo9901p(C7672x<T> c7672x) {
        if (c7672x.m20107w(C10697f0.f27907x)) {
            return new C10749a(this.f28065o, this.history);
        }
        return null;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: q */
    protected boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
        return this.history.equals(((C10748l) abstractC7635e).history);
    }

    @Override // p220lj.InterfaceC10214a
    /* renamed from: r */
    public void mo10346r(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, EnumC8985j enumC8985j, char c, int i, int i2) {
        C10741h c10741h;
        int m10380f;
        if (this.f28065o == 5) {
            appendable.append(String.valueOf(interfaceC7662o.mo10212i(this.history.m10413h())));
            return;
        }
        if (interfaceC7662o instanceof InterfaceC10614a) {
            c10741h = this.history.m10416e(C10697f0.m10724B0((InterfaceC10614a) interfaceC7662o));
        } else {
            c10741h = (C10741h) interfaceC7662o.mo10212i(this.history.m10415f());
        }
        int i3 = this.f28065o;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    appendable.append(String.valueOf(c10741h.m10384b()));
                    return;
                }
                throw new C7666r("Not printable as text: " + name());
            }
            int intValue = ((Integer) interfaceC7633d.mo14441b(InterfaceC10214a.f26520d, 0)).intValue();
            int m10382d = c10741h.m10382d();
            if (intValue == 0) {
                appendable.append(m10352D(interfaceC7633d, (EnumC9003m) interfaceC7633d.mo14441b(C8969a.f23567h, EnumC9003m.FORMAT)).m16855f(EnumC10612b0.m11058d(m10382d)));
                return;
            }
            String mo16870q = enumC8985j.mo16870q(m10382d);
            if (enumC8985j.mo16872m()) {
                mo16870q = m10351E(mo16870q, intValue, c);
            }
            appendable.append(mo16870q);
            return;
        }
        C10761o m10398w = this.history.m10398w();
        int m10381e = c10741h.m10381e();
        String str = null;
        if (!C10761o.f28078d.equals(m10398w) && (m10380f = c10741h.m10380f(m10398w)) != m10381e) {
            InterfaceC7631c<EnumC10476a> interfaceC7631c = C10736d.f28017y;
            EnumC10476a enumC10476a = EnumC10476a.DUAL_DATING;
            if (interfaceC7633d.mo14441b(interfaceC7631c, enumC10476a) == enumC10476a) {
                str = m10354B(enumC8985j, c, m10380f, m10381e, i);
            } else {
                m10381e = m10380f;
            }
        }
        if (str == null) {
            if (enumC8985j.mo16872m()) {
                str = m10351E(enumC8985j.mo16870q(m10381e), i, c);
            } else {
                str = enumC8985j.mo16870q(m10381e);
            }
        }
        if (enumC8985j.mo16872m()) {
            char charAt = enumC8985j.mo16873k().charAt(0);
            if (c != charAt) {
                StringBuilder sb2 = new StringBuilder();
                int length = str.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt2 = str.charAt(i4);
                    if (enumC8985j.mo16874h(charAt2)) {
                        sb2.append((char) (charAt2 + (c - charAt)));
                    } else {
                        sb2.append(charAt2);
                    }
                }
                str = sb2.toString();
            }
            m10345y(str, i2);
        }
        appendable.append(str);
    }

    @Override // p251nj.C10918c, p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return false;
    }
}
