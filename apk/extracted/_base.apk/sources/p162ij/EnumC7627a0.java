package p162ij;

import net.time4j.base.C10616c;

/* renamed from: ij.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC7627a0 implements InterfaceC7664p<Long> {
    UTC(2441317),
    UNIX(2440587),
    MODIFIED_JULIAN_DATE(2400000),
    EXCEL(2415019),
    ANSI(2305812),
    RATA_DIE(1721424),
    JULIAN_DAY_NUMBER(-1),
    LILIAN_DAY_NUMBER(2299159);
    
    private final int offset;

    /* renamed from: ij.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C7628a<D extends AbstractC7665q<D>> implements InterfaceC7676z<D, Long> {

        /* renamed from: j */
        private final EnumC7627a0 f20930j;

        /* renamed from: k */
        private final InterfaceC7653k<D> f20931k;

        C7628a(EnumC7627a0 enumC7627a0, InterfaceC7653k<D> interfaceC7653k) {
            this.f20930j = enumC7627a0;
            this.f20931k = interfaceC7653k;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(D d) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(D d) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public Long mo9922f(D d) {
            return Long.valueOf(this.f20930j.m20216i(this.f20931k.mo10630a() + 730, EnumC7627a0.UNIX));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public Long mo9917l(D d) {
            return Long.valueOf(this.f20930j.m20216i(this.f20931k.mo10627d() + 730, EnumC7627a0.UNIX));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Long mo9915o(D d) {
            return Long.valueOf(this.f20930j.m20216i(this.f20931k.mo10628c(d) + 730, EnumC7627a0.UNIX));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(D d, Long l) {
            if (l == null) {
                return false;
            }
            try {
                long m11029m = C10616c.m11029m(EnumC7627a0.UNIX.m20216i(l.longValue(), this.f20930j), 730L);
                if (m11029m > this.f20931k.mo10630a()) {
                    return false;
                }
                if (m11029m < this.f20931k.mo10627d()) {
                    return false;
                }
                return true;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public D mo9916n(D d, Long l, boolean z) {
            if (l != null) {
                return this.f20931k.mo10629b(C10616c.m11029m(EnumC7627a0.UNIX.m20216i(l.longValue(), this.f20930j), 730L));
            }
            throw new IllegalArgumentException("Missing epoch day value.");
        }
    }

    EnumC7627a0(int i) {
        this.offset = (i - 2440587) - 730;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return this == MODIFIED_JULIAN_DATE ? 'g' : (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        return ((Long) interfaceC7662o.mo10212i(this)).compareTo((Long) interfaceC7662o2.mo10212i(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public <D extends AbstractC7665q<D>> InterfaceC7676z<D, Long> m20219c(InterfaceC7653k<D> interfaceC7653k) {
        return new C7628a(this, interfaceC7653k);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: f */
    public Long mo9551e() {
        return Long.valueOf(365241779741L - this.offset);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: g */
    public Long mo9554U() {
        return Long.valueOf((-365243219892L) - this.offset);
    }

    @Override // p162ij.InterfaceC7664p
    public Class<Long> getType() {
        return Long.class;
    }

    /* renamed from: i */
    public long m20216i(long j, EnumC7627a0 enumC7627a0) {
        try {
            return C10616c.m11036f(j, enumC7627a0.offset - this.offset);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }
}
