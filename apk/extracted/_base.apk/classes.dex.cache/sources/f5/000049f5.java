package p295q5;

import java.util.Map;
import lk.InterfaceC10219a;
import p067df.InterfaceC5830a;
import p067df.InterfaceC5833d;
import p279p5.AbstractC11423d;
import p279p5.C11442r;
import p279p5.InterfaceC11430g;
import p295q5.C11702a;
import ye.AbstractC14010b;
import ye.EnumC14009a;
import ye.InterfaceC14011c;
import ye.InterfaceC14012d;
import ye.InterfaceC14014f;

/* renamed from: q5.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11717n implements InterfaceC11706c {

    /* renamed from: a */
    private final AbstractC11423d f30544a;

    /* renamed from: q5.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11718a<T> implements InterfaceC14012d<T>, InterfaceC5830a {

        /* renamed from: a */
        private final InterfaceC11719b<T> f30545a;

        /* renamed from: b */
        private InterfaceC11430g f30546b;

        C11718a(InterfaceC11719b<T> interfaceC11719b) {
            this.f30545a = interfaceC11719b;
        }

        @Override // ye.InterfaceC14012d
        /* renamed from: a */
        public void mo906a(InterfaceC14011c<T> interfaceC14011c) {
            InterfaceC11719b<T> interfaceC11719b;
            if (!interfaceC14011c.isCancelled() && (interfaceC11719b = this.f30545a) != null) {
                this.f30546b = interfaceC11719b.mo7080a(interfaceC14011c);
            }
        }

        @Override // p067df.InterfaceC5830a
        public void run() {
            InterfaceC11430g interfaceC11430g = this.f30546b;
            if (interfaceC11430g != null) {
                interfaceC11430g.stop();
                this.f30546b = null;
            }
        }
    }

    /* renamed from: q5.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11719b<T> {
        /* renamed from: a */
        InterfaceC11430g mo7080a(InterfaceC14011c<? super T> interfaceC14011c);
    }

    public AbstractC11717n(AbstractC11423d abstractC11423d) {
        this.f30544a = abstractC11423d;
    }

    /* renamed from: n */
    private <T> AbstractC14010b<T> m7091n(InterfaceC11719b<T> interfaceC11719b) {
        C11718a c11718a = new C11718a(interfaceC11719b);
        return AbstractC14010b.m925d(c11718a, EnumC14009a.BUFFER).m924e(c11718a);
    }

    /* renamed from: o */
    private static C11442r m7090o(Map<String, String> map) {
        C11442r c11442r = new C11442r();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c11442r.m8054f(entry.getKey(), entry.getValue());
        }
        return c11442r;
    }

    /* renamed from: p */
    public /* synthetic */ InterfaceC11430g m7089p(String str, String str2, InterfaceC14011c interfaceC14011c) {
        return this.f30544a.m8078d(0, 0, str, str2, new C11705b(interfaceC14011c));
    }

    /* renamed from: q */
    public /* synthetic */ InterfaceC11430g m7088q(C11702a c11702a, InterfaceC14011c interfaceC14011c) {
        return this.f30544a.m8073j(c11702a.m7120y(), c11702a.m7140A(), c11702a.m7136M(), c11702a.m7137J(), c11702a.m7121x(), new C11722q(interfaceC14011c, c11702a));
    }

    /* renamed from: r */
    public /* synthetic */ InterfaceC10219a m7087r(final C11702a c11702a) {
        if ((c11702a.m7120y() & 256) == 256) {
            return AbstractC14010b.m917l(c11702a);
        }
        return m7091n(new InterfaceC11719b() { // from class: q5.m
            @Override // p295q5.AbstractC11717n.InterfaceC11719b
            /* renamed from: a */
            public final InterfaceC11430g mo7080a(InterfaceC14011c interfaceC14011c) {
                InterfaceC11430g m7088q;
                m7088q = AbstractC11717n.this.m7088q(c11702a, interfaceC14011c);
                return m7088q;
            }
        });
    }

    /* renamed from: s */
    public /* synthetic */ InterfaceC11430g m7086s(C11702a c11702a, C11702a.C11704b c11704b, InterfaceC14011c interfaceC14011c) {
        return this.f30544a.m8075h(0, c11702a.m7140A(), c11702a.m7119z(), 1, 1, true, new C11720o(interfaceC14011c, c11704b, true));
    }

    /* renamed from: t */
    public /* synthetic */ InterfaceC11430g m7085t(C11702a c11702a, C11702a.C11704b c11704b, InterfaceC14011c interfaceC14011c) {
        return this.f30544a.m8075h(0, c11702a.m7140A(), c11702a.m7119z(), 28, 1, true, new C11720o(interfaceC14011c, c11704b, true));
    }

    /* renamed from: u */
    public /* synthetic */ InterfaceC10219a m7084u(final C11702a c11702a) {
        if ((c11702a.m7120y() & 256) == 256) {
            return AbstractC14010b.m917l(c11702a);
        }
        final C11702a.C11704b c11704b = new C11702a.C11704b(c11702a);
        return m7091n(new InterfaceC11719b() { // from class: q5.k
            @Override // p295q5.AbstractC11717n.InterfaceC11719b
            /* renamed from: a */
            public final InterfaceC11430g mo7080a(InterfaceC14011c interfaceC14011c) {
                InterfaceC11430g m7086s;
                m7086s = AbstractC11717n.this.m7086s(c11702a, c11704b, interfaceC14011c);
                return m7086s;
            }
        }).m915n(m7091n(new InterfaceC11719b() { // from class: q5.l
            @Override // p295q5.AbstractC11717n.InterfaceC11719b
            /* renamed from: a */
            public final InterfaceC11430g mo7080a(InterfaceC14011c interfaceC14011c) {
                InterfaceC11430g m7085t;
                m7085t = AbstractC11717n.this.m7085t(c11702a, c11704b, interfaceC14011c);
                return m7085t;
            }
        }));
    }

    /* renamed from: v */
    public /* synthetic */ InterfaceC10219a m7083v(AbstractC14010b abstractC14010b) {
        return abstractC14010b.m922g(new InterfaceC5833d() { // from class: q5.j
            @Override // p067df.InterfaceC5833d
            public final Object apply(Object obj) {
                InterfaceC10219a m7084u;
                m7084u = AbstractC11717n.this.m7084u((C11702a) obj);
                return m7084u;
            }
        });
    }

    /* renamed from: w */
    public /* synthetic */ InterfaceC11430g m7082w(C11702a c11702a, InterfaceC14011c interfaceC14011c) {
        return this.f30544a.m8074i(c11702a.m7120y(), c11702a.m7140A(), c11702a.m7136M(), c11702a.m7137J(), c11702a.m7121x(), null, c11702a.m7138H(), m7090o(c11702a.m7135O()), new C11721p(interfaceC14011c));
    }

    /* renamed from: x */
    public /* synthetic */ InterfaceC10219a m7081x(AbstractC14010b abstractC14010b) {
        return abstractC14010b.m922g(new InterfaceC5833d() { // from class: q5.i
            @Override // p067df.InterfaceC5833d
            public final Object apply(Object obj) {
                InterfaceC10219a m7087r;
                m7087r = AbstractC11717n.this.m7087r((C11702a) obj);
                return m7087r;
            }
        });
    }

    @Override // p295q5.InterfaceC11706c
    /* renamed from: a */
    public AbstractC14010b<C11702a> mo7104a(final String str, final String str2) {
        return m7091n(new InterfaceC11719b() { // from class: q5.g
            @Override // p295q5.AbstractC11717n.InterfaceC11719b
            /* renamed from: a */
            public final InterfaceC11430g mo7080a(InterfaceC14011c interfaceC14011c) {
                InterfaceC11430g m7089p;
                m7089p = AbstractC11717n.this.m7089p(str, str2, interfaceC14011c);
                return m7089p;
            }
        });
    }

    @Override // p295q5.InterfaceC11706c
    /* renamed from: b */
    public AbstractC14010b<C11702a> mo7103b(final C11702a c11702a) {
        return m7091n(new InterfaceC11719b() { // from class: q5.e
            @Override // p295q5.AbstractC11717n.InterfaceC11719b
            /* renamed from: a */
            public final InterfaceC11430g mo7080a(InterfaceC14011c interfaceC14011c) {
                InterfaceC11430g m7082w;
                m7082w = AbstractC11717n.this.m7082w(c11702a, interfaceC14011c);
                return m7082w;
            }
        });
    }

    @Override // p295q5.InterfaceC11706c
    @Deprecated
    /* renamed from: c */
    public InterfaceC14014f<C11702a, C11702a> mo7102c() {
        return new InterfaceC14014f() { // from class: q5.f
            @Override // ye.InterfaceC14014f
            /* renamed from: a */
            public final InterfaceC10219a mo904a(AbstractC14010b abstractC14010b) {
                InterfaceC10219a m7083v;
                m7083v = AbstractC11717n.this.m7083v(abstractC14010b);
                return m7083v;
            }
        };
    }

    @Override // p295q5.InterfaceC11706c
    /* renamed from: d */
    public InterfaceC14014f<C11702a, C11702a> mo7101d() {
        return new InterfaceC14014f() { // from class: q5.h
            @Override // ye.InterfaceC14014f
            /* renamed from: a */
            public final InterfaceC10219a mo904a(AbstractC14010b abstractC14010b) {
                InterfaceC10219a m7081x;
                m7081x = AbstractC11717n.this.m7081x(abstractC14010b);
                return m7081x;
            }
        };
    }
}