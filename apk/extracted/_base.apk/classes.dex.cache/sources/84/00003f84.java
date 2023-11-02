package p202kj;

import java.text.ParseException;
import java.util.Collections;
import java.util.Locale;
import net.time4j.C10582a0;
import net.time4j.C10697f0;
import net.time4j.C10711g0;
import net.time4j.C10722h0;
import net.time4j.C10852z0;
import net.time4j.p249tz.C10835p;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7668t;
import p184jj.C8969a;
import p184jj.EnumC8979e;
import p184jj.EnumC8981g;
import p184jj.EnumC8985j;
import p202kj.C9479c;

/* renamed from: kj.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C9504l {

    /* renamed from: a */
    private static final char f25193a;

    /* renamed from: b */
    private static final C9507c f25194b;

    /* renamed from: c */
    private static final C9507c f25195c;

    /* renamed from: d */
    private static final InterfaceC7660n<InterfaceC7662o> f25196d;

    /* renamed from: e */
    private static final InterfaceC7660n<Character> f25197e;

    /* renamed from: f */
    public static final C9479c<C10697f0> f25198f;

    /* renamed from: g */
    public static final C9479c<C10697f0> f25199g;

    /* renamed from: h */
    public static final C9479c<C10697f0> f25200h;

    /* renamed from: i */
    public static final C9479c<C10697f0> f25201i;

    /* renamed from: j */
    public static final C9479c<C10697f0> f25202j;

    /* renamed from: k */
    public static final C9479c<C10697f0> f25203k;

    /* renamed from: l */
    public static final C9479c<C10697f0> f25204l;

    /* renamed from: m */
    public static final C9479c<C10697f0> f25205m;

    /* renamed from: n */
    public static final C9479c<C10711g0> f25206n;

    /* renamed from: o */
    public static final C9479c<C10711g0> f25207o;

    /* renamed from: p */
    public static final C9479c<C10722h0> f25208p;

    /* renamed from: q */
    public static final C9479c<C10722h0> f25209q;

    /* renamed from: r */
    public static final C9479c<C10582a0> f25210r;

    /* renamed from: s */
    public static final C9479c<C10582a0> f25211s;

    /* renamed from: kj.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9505a implements InterfaceC9491e<C10697f0> {

        /* renamed from: a */
        final /* synthetic */ boolean f25212a;

        C9505a(boolean z) {
            this.f25212a = z;
        }

        @Override // p202kj.InterfaceC9491e
        /* renamed from: b */
        public <R> R mo14472a(C10697f0 c10697f0, Appendable appendable, InterfaceC7633d interfaceC7633d, InterfaceC7668t<InterfaceC7662o, R> interfaceC7668t) {
            C9479c<C10697f0> c9479c;
            if (this.f25212a) {
                c9479c = C9504l.f25199g;
            } else {
                c9479c = C9504l.f25198f;
            }
            c9479c.m14652K(c10697f0, appendable, interfaceC7633d);
            return null;
        }
    }

    /* renamed from: kj.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9506b implements InterfaceC9488d<C10697f0> {

        /* renamed from: a */
        final /* synthetic */ boolean f25213a;

        C9506b(boolean z) {
            this.f25213a = z;
        }

        @Override // p202kj.InterfaceC9488d
        /* renamed from: a */
        public C10697f0 mo14469b(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d) {
            int length = charSequence.length();
            int m14430f = c9518s.m14430f();
            int i = length - m14430f;
            int i2 = 0;
            for (int i3 = m14430f + 1; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                if (charAt != '-') {
                    if (charAt != '/' && charAt != 'T') {
                        if (charAt == 'W') {
                            if (this.f25213a) {
                                return C9504l.f25203k.m14658E(charSequence, c9518s);
                            }
                            return C9504l.f25202j.m14658E(charSequence, c9518s);
                        }
                    } else {
                        i = i3 - m14430f;
                        break;
                    }
                } else {
                    i2++;
                }
            }
            if (this.f25213a) {
                if (i2 == 1) {
                    return C9504l.f25201i.m14658E(charSequence, c9518s);
                }
                return C9504l.f25199g.m14658E(charSequence, c9518s);
            }
            int i4 = i - 4;
            char charAt2 = charSequence.charAt(m14430f);
            if (charAt2 == '+' || charAt2 == '-') {
                i4 -= 2;
            }
            if (i4 == 3) {
                return C9504l.f25200h.m14658E(charSequence, c9518s);
            }
            return C9504l.f25198f.m14658E(charSequence, c9518s);
        }
    }

    /* renamed from: kj.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9507c implements InterfaceC7660n<InterfaceC7662o> {

        /* renamed from: j */
        private final InterfaceC7664p<Integer> f25214j;

        /* renamed from: kj.l$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public class C9508a implements InterfaceC7660n<InterfaceC7662o> {

            /* renamed from: j */
            final /* synthetic */ C9507c f25215j;

            C9508a(C9507c c9507c) {
                C9507c.this = r1;
                this.f25215j = c9507c;
            }

            @Override // p162ij.InterfaceC7660n
            /* renamed from: a */
            public boolean test(InterfaceC7662o interfaceC7662o) {
                if (!C9507c.this.test(interfaceC7662o) && !this.f25215j.test(interfaceC7662o)) {
                    return false;
                }
                return true;
            }
        }

        C9507c(InterfaceC7664p<Integer> interfaceC7664p) {
            this.f25214j = interfaceC7664p;
        }

        /* renamed from: a */
        InterfaceC7660n<InterfaceC7662o> m14468a(C9507c c9507c) {
            return new C9508a(c9507c);
        }

        @Override // p162ij.InterfaceC7660n
        /* renamed from: b */
        public boolean test(InterfaceC7662o interfaceC7662o) {
            return interfaceC7662o.mo10218c(this.f25214j) > 0;
        }
    }

    /* renamed from: kj.l$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C9509d implements InterfaceC7660n<Character> {
        private C9509d() {
        }

        /* synthetic */ C9509d(C9505a c9505a) {
            this();
        }

        @Override // p162ij.InterfaceC7660n
        /* renamed from: a */
        public boolean test(Character ch2) {
            return ch2.charValue() == 'T';
        }
    }

    static {
        char c;
        if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
            c = '.';
        } else {
            c = ',';
        }
        f25193a = c;
        C9507c c9507c = new C9507c(C10711g0.f27939H);
        f25194b = c9507c;
        C9507c c9507c2 = new C9507c(C10711g0.f27943L);
        f25195c = c9507c2;
        f25196d = c9507c.m14468a(c9507c2);
        f25197e = new C9509d(null);
        f25198f = m14484b(false);
        f25199g = m14484b(true);
        f25200h = m14478h(false);
        f25201i = m14478h(true);
        f25202j = m14473m(false);
        f25203k = m14473m(true);
        f25204l = m14483c(false);
        f25205m = m14483c(true);
        f25206n = m14475k(false);
        f25207o = m14475k(true);
        f25208p = m14474l(false);
        f25209q = m14474l(true);
        f25210r = m14479g(false);
        f25211s = m14479g(true);
    }

    /* renamed from: a */
    private static <T extends AbstractC7665q<T>> void m14485a(C9479c.C9483d<T> c9483d, boolean z) {
        c9483d.m14585b0(C8969a.f23571l, EnumC8985j.f23622j);
        c9483d.m14589Z(C8969a.f23572m, '0');
        c9483d.m14580g(C10711g0.f27936E, 2);
        c9483d.m14591X();
        if (z) {
            c9483d.m14575l(':');
        }
        c9483d.m14580g(C10711g0.f27937F, 2);
        c9483d.m14590Y(f25196d);
        if (z) {
            c9483d.m14575l(':');
        }
        c9483d.m14580g(C10711g0.f27939H, 2);
        c9483d.m14590Y(f25195c);
        if (f25193a == ',') {
            c9483d.m14574m(',', '.');
        } else {
            c9483d.m14574m('.', ',');
        }
        c9483d.m14578i(C10711g0.f27943L, 0, 9, false);
        for (int i = 0; i < 5; i++) {
            c9483d.m14603L();
        }
    }

    /* renamed from: b */
    private static C9479c<C10697f0> m14484b(boolean z) {
        C9479c.C9483d m14576k = C9479c.m14649N(C10697f0.class, Locale.ROOT).m14585b0(C8969a.f23571l, EnumC8985j.f23622j).m14589Z(C8969a.f23572m, '0').m14576k(C10697f0.f27908y, 4, 9, EnumC9527x.SHOW_WHEN_BIG_NUMBER);
        if (z) {
            m14576k.m14575l('-');
        }
        m14576k.m14580g(C10697f0.f27887C, 2);
        if (z) {
            m14576k.m14575l('-');
        }
        return m14576k.m14580g(C10697f0.f27888D, 2).m14603L().m14603L().m14609F().m14643T(EnumC8981g.STRICT);
    }

    /* renamed from: c */
    private static C9479c<C10697f0> m14483c(boolean z) {
        C9479c.C9483d m14649N = C9479c.m14649N(C10697f0.class, Locale.ROOT);
        m14649N.m14583d(C10697f0.f27907x, m14481e(z), m14482d(z));
        return m14649N.m14609F().m14643T(EnumC8981g.STRICT);
    }

    /* renamed from: d */
    private static InterfaceC9488d<C10697f0> m14482d(boolean z) {
        return new C9506b(z);
    }

    /* renamed from: e */
    private static InterfaceC9491e<C10697f0> m14481e(boolean z) {
        return new C9505a(z);
    }

    /* renamed from: f */
    private static C9479c<C10582a0> m14480f(EnumC8979e enumC8979e, boolean z) {
        C9479c.C9483d m14649N = C9479c.m14649N(C10582a0.class, Locale.ROOT);
        m14649N.m14583d(C10697f0.f27907x, m14481e(z), m14482d(z));
        m14649N.m14575l('T');
        m14485a(m14649N, z);
        m14649N.m14612C(enumC8979e, z, Collections.singletonList("Z"));
        return m14649N.m14609F();
    }

    /* renamed from: g */
    private static C9479c<C10582a0> m14479g(boolean z) {
        C9479c.C9483d m14649N = C9479c.m14649N(C10582a0.class, Locale.ROOT);
        m14649N.m14583d(C10582a0.m11164X().m20174I(), m14480f(EnumC8979e.MEDIUM, z), m14480f(EnumC8979e.SHORT, z));
        return m14649N.m14609F().m14643T(EnumC8981g.STRICT).m14641V(C10835p.f28295t);
    }

    /* renamed from: h */
    private static C9479c<C10697f0> m14478h(boolean z) {
        C9479c.C9483d m14576k = C9479c.m14649N(C10697f0.class, Locale.ROOT).m14585b0(C8969a.f23571l, EnumC8985j.f23622j).m14589Z(C8969a.f23572m, '0').m14576k(C10697f0.f27908y, 4, 9, EnumC9527x.SHOW_WHEN_BIG_NUMBER);
        if (z) {
            m14576k.m14575l('-');
        }
        return m14576k.m14580g(C10697f0.f27890F, 3).m14603L().m14603L().m14609F().m14643T(EnumC8981g.STRICT);
    }

    /* renamed from: i */
    public static C10697f0 m14477i(CharSequence charSequence) {
        C9518s c9518s = new C9518s();
        C10697f0 m14476j = m14476j(charSequence, c9518s);
        if (m14476j != null && !c9518s.m14427i()) {
            if (c9518s.m14430f() >= charSequence.length()) {
                return m14476j;
            }
            throw new ParseException("Trailing characters found: " + ((Object) charSequence), c9518s.m14430f());
        }
        throw new ParseException(c9518s.m14432d(), c9518s.m14433c());
    }

    /* renamed from: j */
    public static C10697f0 m14476j(CharSequence charSequence, C9518s c9518s) {
        C9479c<C10697f0> c9479c;
        C9479c<C10697f0> c9479c2;
        int length = charSequence.length();
        int m14430f = c9518s.m14430f();
        int i = length - m14430f;
        if (i < 7) {
            c9518s.m14425k(length, "Too short to be compatible with ISO-8601: " + ((Object) charSequence.subSequence(m14430f, length)));
            return null;
        }
        int i2 = 0;
        for (int i3 = m14430f + 1; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt != '-') {
                if (charAt != '/' && charAt != 'T') {
                    if (charAt == 'W') {
                        if (i2 > 0) {
                            c9479c2 = f25203k;
                        } else {
                            c9479c2 = f25202j;
                        }
                        return c9479c2.m14658E(charSequence, c9518s);
                    }
                } else {
                    i = i3 - m14430f;
                    break;
                }
            } else {
                i2++;
            }
        }
        if (i2 == 0) {
            int i4 = i - 4;
            char charAt2 = charSequence.charAt(m14430f);
            if (charAt2 == '+' || charAt2 == '-') {
                i4 -= 2;
            }
            if (i4 == 3) {
                c9479c = f25200h;
            } else {
                c9479c = f25198f;
            }
            return c9479c.m14658E(charSequence, c9518s);
        } else if (i2 == 1) {
            return f25201i.m14658E(charSequence, c9518s);
        } else {
            return f25199g.m14658E(charSequence, c9518s);
        }
    }

    /* renamed from: k */
    private static C9479c<C10711g0> m14475k(boolean z) {
        C9479c.C9483d m14649N = C9479c.m14649N(C10711g0.class, Locale.ROOT);
        m14649N.m14592W(f25197e, 1);
        m14485a(m14649N, z);
        return m14649N.m14609F().m14643T(EnumC8981g.STRICT);
    }

    /* renamed from: l */
    private static C9479c<C10722h0> m14474l(boolean z) {
        C9479c.C9483d m14649N = C9479c.m14649N(C10722h0.class, Locale.ROOT);
        m14649N.m14583d(C10697f0.f27907x, m14481e(z), m14482d(z));
        m14649N.m14575l('T');
        m14485a(m14649N, z);
        return m14649N.m14609F().m14643T(EnumC8981g.STRICT);
    }

    /* renamed from: m */
    private static C9479c<C10697f0> m14473m(boolean z) {
        C9479c.C9483d m14576k = C9479c.m14649N(C10697f0.class, Locale.ROOT).m14585b0(C8969a.f23571l, EnumC8985j.f23622j).m14589Z(C8969a.f23572m, '0').m14576k(C10697f0.f27909z, 4, 9, EnumC9527x.SHOW_WHEN_BIG_NUMBER);
        if (z) {
            m14576k.m14575l('-');
        }
        m14576k.m14575l('W');
        m14576k.m14580g(C10852z0.f28326v.m9965n(), 2);
        if (z) {
            m14576k.m14575l('-');
        }
        return m14576k.m14579h(C10697f0.f27889E, 1).m14603L().m14603L().m14609F().m14643T(EnumC8981g.STRICT);
    }
}