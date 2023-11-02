package net.time4j.calendar;

import net.time4j.EnumC10846x0;
import net.time4j.base.C10616c;
import net.time4j.calendar.service.C10680f;
import p162ij.AbstractC7665q;
import p162ij.EnumC7627a0;
import p162ij.InterfaceC7632c0;
import p162ij.InterfaceC7641g;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7670v;
import p162ij.InterfaceC7676z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.calendar.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10670r<T extends AbstractC7665q<T> & InterfaceC7641g> extends C10680f<T> implements InterfaceC10661l<T> {
    private static final long serialVersionUID = 4275169663905222176L;

    /* renamed from: q */
    private final transient InterfaceC7664p<Integer> f27845q;

    /* renamed from: r */
    private final transient InterfaceC7664p<EnumC10846x0> f27846r;

    /* renamed from: net.time4j.calendar.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10671a<T extends AbstractC7665q<T> & InterfaceC7641g> implements InterfaceC7632c0<T> {

        /* renamed from: j */
        private final C10670r<T> f27847j;

        C10671a(C10670r<T> c10670r) {
            this.f27847j = c10670r;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        /* renamed from: h */
        private int m10783h(AbstractC7665q abstractC7665q) {
            int mo10218c = abstractC7665q.mo10218c(((C10670r) this.f27847j).f27845q);
            while (true) {
                int i = mo10218c + 7;
                if (i <= ((Integer) abstractC7665q.mo10211l(((C10670r) this.f27847j).f27845q)).intValue()) {
                    mo10218c = i;
                } else {
                    return C10616c.m11041a(mo10218c - 1, 7) + 1;
                }
            }
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lij/p<*>; */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p mo9926b(AbstractC7665q abstractC7665q) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lij/p<*>; */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p mo9925c(AbstractC7665q abstractC7665q) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        @Override // p162ij.InterfaceC7632c0
        /* renamed from: e */
        public int mo10646m(AbstractC7665q abstractC7665q) {
            return C10616c.m11041a(abstractC7665q.mo10218c(((C10670r) this.f27847j).f27845q) - 1, 7) + 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9922f(AbstractC7665q abstractC7665q) {
            return Integer.valueOf(m10783h(abstractC7665q));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public Integer mo9917l(AbstractC7665q abstractC7665q) {
            return 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public Integer mo9915o(AbstractC7665q abstractC7665q) {
            return Integer.valueOf(mo10646m(abstractC7665q));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;I)Z */
        /* renamed from: q */
        public boolean m10779q(AbstractC7665q abstractC7665q, int i) {
            return i >= 1 && i <= m10783h(abstractC7665q);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)Z */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        public boolean mo9920i(AbstractC7665q abstractC7665q, Integer num) {
            return num != null && m10779q(abstractC7665q, num.intValue());
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;IZ)TT; */
        @Override // p162ij.InterfaceC7632c0
        /* renamed from: s */
        public AbstractC7665q mo10650g(AbstractC7665q abstractC7665q, int i, boolean z) {
            if (m10779q(abstractC7665q, i)) {
                return abstractC7665q.m20120G(this.f27847j.m10787E(i, (EnumC10846x0) abstractC7665q.mo10212i(((C10670r) this.f27847j).f27846r)));
            }
            throw new IllegalArgumentException("Invalid value: " + i);
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;Ljava/lang/Integer;Z)TT; */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: t */
        public AbstractC7665q mo9916n(AbstractC7665q abstractC7665q, Integer num, boolean z) {
            if (num != null) {
                return mo10650g(abstractC7665q, num.intValue(), z);
            }
            throw new IllegalArgumentException("Missing value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10672b<T extends AbstractC7665q<T> & InterfaceC7641g> implements InterfaceC7670v<T> {

        /* renamed from: j */
        private final C10670r<T> f27848j;

        /* renamed from: k */
        private final long f27849k;

        /* renamed from: l */
        private final EnumC10846x0 f27850l;

        C10672b(C10670r<T> c10670r, int i, EnumC10846x0 enumC10846x0) {
            if (enumC10846x0 != null) {
                this.f27848j = c10670r;
                this.f27849k = i;
                this.f27850l = enumC10846x0;
                return;
            }
            throw new NullPointerException("Missing value.");
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
        @Override // p162ij.InterfaceC7670v
        /* renamed from: a */
        public AbstractC7665q apply(AbstractC7665q abstractC7665q) {
            int m9997b;
            long m11041a;
            EnumC10846x0 enumC10846x0 = (EnumC10846x0) abstractC7665q.mo10212i(((C10670r) this.f27848j).f27846r);
            int mo10218c = abstractC7665q.mo10218c(((C10670r) this.f27848j).f27845q);
            if (this.f27849k == 2147483647L) {
                int intValue = ((Integer) abstractC7665q.mo10211l(((C10670r) this.f27848j).f27845q)).intValue() - mo10218c;
                int m9997b2 = enumC10846x0.m9997b() + (intValue % 7);
                if (m9997b2 > 7) {
                    m9997b2 -= 7;
                }
                int m9997b3 = this.f27850l.m9997b() - m9997b2;
                m11041a = intValue + m9997b3;
                if (m9997b3 > 0) {
                    m11041a -= 7;
                }
            } else {
                m11041a = ((this.f27849k - (C10616c.m11041a((mo10218c + m9997b) - 1, 7) + 1)) * 7) + (this.f27850l.m9997b() - enumC10846x0.m9997b());
            }
            return abstractC7665q.m20121E(EnumC7627a0.UTC, ((InterfaceC7641g) abstractC7665q).mo10920b() + m11041a);
        }
    }

    /* renamed from: net.time4j.calendar.r$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10673c<T extends AbstractC7665q<T>> implements InterfaceC7670v<T> {

        /* renamed from: j */
        private final boolean f27851j;

        C10673c(boolean z) {
            this.f27851j = z;
        }

        @Override // p162ij.InterfaceC7670v
        /* renamed from: a */
        public T apply(T t) {
            long j;
            EnumC7627a0 enumC7627a0 = EnumC7627a0.UTC;
            long longValue = ((Long) t.mo10212i(enumC7627a0)).longValue();
            if (this.f27851j) {
                j = longValue - 7;
            } else {
                j = longValue + 7;
            }
            return (T) t.m20121E(enumC7627a0, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10670r(Class<T> cls, InterfaceC7664p<Integer> interfaceC7664p, InterfaceC7664p<EnumC10846x0> interfaceC7664p2) {
        super("WEEKDAY_IN_MONTH", cls, 1, interfaceC7664p.mo9551e().intValue() / 7, 'F', new C10673c(true), new C10673c(false));
        this.f27845q = interfaceC7664p;
        this.f27846r = interfaceC7664p2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static <T extends AbstractC7665q<T> & InterfaceC7641g> InterfaceC7676z<T, Integer> m10788D(C10670r<T> c10670r) {
        return new C10671a(c10670r);
    }

    /* renamed from: E */
    public InterfaceC7670v<T> m10787E(int i, EnumC10846x0 enumC10846x0) {
        return new C10672b(this, i, enumC10846x0);
    }
}
