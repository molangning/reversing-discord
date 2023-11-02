package net.time4j.history;

import net.time4j.base.C10615b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: net.time4j.history.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
abstract class EnumC10732c implements InterfaceC10731b {

    /* renamed from: j */
    public static final EnumC10732c f28007j;

    /* renamed from: k */
    public static final EnumC10732c f28008k;

    /* renamed from: l */
    public static final EnumC10732c f28009l;

    /* renamed from: m */
    private static final /* synthetic */ EnumC10732c[] f28010m;

    /* renamed from: net.time4j.history.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    enum C10733a extends EnumC10732c {
        C10733a(String str, int i) {
            super(str, i, null);
        }

        @Override // net.time4j.history.InterfaceC10731b
        /* renamed from: a */
        public long mo10437a(C10741h c10741h) {
            return C10615b.m11045j(EnumC10732c.m10438f(c10741h), c10741h.m10382d(), c10741h.m10384b());
        }

        @Override // net.time4j.history.InterfaceC10731b
        /* renamed from: b */
        public int mo10436b(C10741h c10741h) {
            return C10615b.m11051d(EnumC10732c.m10438f(c10741h), c10741h.m10382d());
        }

        @Override // net.time4j.history.InterfaceC10731b
        /* renamed from: c */
        public C10741h mo10435c(long j) {
            EnumC10744j enumC10744j;
            long m11043l = C10615b.m11043l(j);
            int m11046i = C10615b.m11046i(m11043l);
            int m11047h = C10615b.m11047h(m11043l);
            int m11048g = C10615b.m11048g(m11043l);
            if (m11046i <= 0) {
                enumC10744j = EnumC10744j.BC;
            } else {
                enumC10744j = EnumC10744j.AD;
            }
            if (m11046i <= 0) {
                m11046i = 1 - m11046i;
            }
            return new C10741h(enumC10744j, m11046i, m11047h, m11048g);
        }

        @Override // net.time4j.history.InterfaceC10731b
        /* renamed from: d */
        public boolean mo10434d(C10741h c10741h) {
            return C10615b.m11049f(EnumC10732c.m10438f(c10741h), c10741h.m10382d(), c10741h.m10384b());
        }
    }

    static {
        C10733a c10733a = new C10733a("GREGORIAN", 0);
        f28007j = c10733a;
        EnumC10732c enumC10732c = new EnumC10732c("JULIAN", 1) { // from class: net.time4j.history.c.b
            @Override // net.time4j.history.InterfaceC10731b
            /* renamed from: a */
            public long mo10437a(C10741h c10741h) {
                return C10750m.m10329h(EnumC10732c.m10438f(c10741h), c10741h.m10382d(), c10741h.m10384b());
            }

            @Override // net.time4j.history.InterfaceC10731b
            /* renamed from: b */
            public int mo10436b(C10741h c10741h) {
                return C10750m.m10335b(EnumC10732c.m10438f(c10741h), c10741h.m10382d());
            }

            @Override // net.time4j.history.InterfaceC10731b
            /* renamed from: c */
            public C10741h mo10435c(long j) {
                EnumC10744j enumC10744j;
                long m10328i = C10750m.m10328i(j);
                int m10330g = C10750m.m10330g(m10328i);
                int m10331f = C10750m.m10331f(m10328i);
                int m10332e = C10750m.m10332e(m10328i);
                if (m10330g <= 0) {
                    enumC10744j = EnumC10744j.BC;
                } else {
                    enumC10744j = EnumC10744j.AD;
                }
                if (m10330g <= 0) {
                    m10330g = 1 - m10330g;
                }
                return new C10741h(enumC10744j, m10330g, m10331f, m10332e);
            }

            @Override // net.time4j.history.InterfaceC10731b
            /* renamed from: d */
            public boolean mo10434d(C10741h c10741h) {
                return C10750m.m10333d(EnumC10732c.m10438f(c10741h), c10741h.m10382d(), c10741h.m10384b());
            }
        };
        f28008k = enumC10732c;
        EnumC10732c enumC10732c2 = new EnumC10732c("SWEDISH", 2) { // from class: net.time4j.history.c.c
            @Override // net.time4j.history.InterfaceC10731b
            /* renamed from: a */
            public long mo10437a(C10741h c10741h) {
                int m10438f = EnumC10732c.m10438f(c10741h);
                if (c10741h.m10384b() == 30 && c10741h.m10382d() == 2 && m10438f == 1712) {
                    return -53576L;
                }
                return C10750m.m10329h(m10438f, c10741h.m10382d(), c10741h.m10384b()) - 1;
            }

            @Override // net.time4j.history.InterfaceC10731b
            /* renamed from: b */
            public int mo10436b(C10741h c10741h) {
                int m10438f = EnumC10732c.m10438f(c10741h);
                if (c10741h.m10382d() == 2 && m10438f == 1712) {
                    return 30;
                }
                return C10750m.m10335b(m10438f, c10741h.m10382d());
            }

            @Override // net.time4j.history.InterfaceC10731b
            /* renamed from: c */
            public C10741h mo10435c(long j) {
                if (j == -53576) {
                    return new C10741h(EnumC10744j.AD, 1712, 2, 30);
                }
                return EnumC10732c.f28008k.mo10435c(j + 1);
            }

            @Override // net.time4j.history.InterfaceC10731b
            /* renamed from: d */
            public boolean mo10434d(C10741h c10741h) {
                int m10438f = EnumC10732c.m10438f(c10741h);
                if (c10741h.m10384b() == 30 && c10741h.m10382d() == 2 && m10438f == 1712) {
                    return true;
                }
                return C10750m.m10333d(m10438f, c10741h.m10382d(), c10741h.m10384b());
            }
        };
        f28009l = enumC10732c2;
        f28010m = new EnumC10732c[]{c10733a, enumC10732c, enumC10732c2};
    }

    private EnumC10732c(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static int m10438f(C10741h c10741h) {
        return c10741h.m10383c().m10367a(c10741h.m10381e());
    }

    public static EnumC10732c valueOf(String str) {
        return (EnumC10732c) Enum.valueOf(EnumC10732c.class, str);
    }

    public static EnumC10732c[] values() {
        return (EnumC10732c[]) f28010m.clone();
    }

    /* synthetic */ EnumC10732c(String str, int i, C10733a c10733a) {
        this(str, i);
    }
}
