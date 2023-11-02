package net.time4j.history;

import net.time4j.C10697f0;
import p162ij.AbstractC7635e;
import p162ij.AbstractC7665q;
import p162ij.C7666r;
import p162ij.C7672x;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7676z;

/* renamed from: net.time4j.history.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class C10742i extends AbstractC7635e<C10741h> {
    private static final long serialVersionUID = -5386613740709845550L;
    private final C10736d history;

    /* renamed from: net.time4j.history.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C10743a<C extends AbstractC7665q<C>> implements InterfaceC7676z<C, C10741h> {

        /* renamed from: j */
        private final C10736d f28055j;

        C10743a(C10736d c10736d) {
            this.f28055j = c10736d;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public C10741h mo9922f(C c) {
            C10736d c10736d = this.f28055j;
            if (c10736d == C10736d.f28012B) {
                return C10741h.m10379g(EnumC10744j.BYZANTINE, 999984973, 8, 31);
            }
            if (c10736d == C10736d.f28011A) {
                return C10741h.m10379g(EnumC10744j.AD, 999979465, 12, 31);
            }
            if (c10736d == C10736d.f28018z) {
                return C10741h.m10379g(EnumC10744j.AD, 999999999, 12, 31);
            }
            return C10741h.m10379g(EnumC10744j.AD, 9999, 12, 31);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public C10741h mo9917l(C c) {
            C10736d c10736d = this.f28055j;
            if (c10736d == C10736d.f28012B) {
                return C10741h.m10379g(EnumC10744j.BYZANTINE, 0, 9, 1);
            }
            if (c10736d == C10736d.f28011A) {
                return C10741h.m10379g(EnumC10744j.BC, 999979466, 1, 1);
            }
            if (c10736d == C10736d.f28018z) {
                return C10741h.m10379g(EnumC10744j.BC, 1000000000, 1, 1);
            }
            return C10741h.m10379g(EnumC10744j.BC, 45, 1, 1);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public C10741h mo9915o(C c) {
            try {
                return this.f28055j.m10416e((C10697f0) c.mo10212i(C10697f0.f27907x));
            } catch (IllegalArgumentException e) {
                throw new C7666r(e.getMessage(), e);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(C c, C10741h c10741h) {
            return this.f28055j.m10432B(c10741h);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public C mo9916n(C c, C10741h c10741h, boolean z) {
            if (c10741h != null) {
                return (C) c.mo14419F(C10697f0.f27907x, this.f28055j.m10417d(c10741h));
            }
            throw new IllegalArgumentException("Missing historic date.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10742i(C10736d c10736d) {
        super("HISTORIC_DATE");
        this.history = c10736d;
    }

    private Object readResolve() {
        return this.history.m10415f();
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
    public Class<C10741h> getType() {
        return C10741h.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7635e
    /* renamed from: p */
    public <T extends AbstractC7665q<T>> InterfaceC7676z<T, C10741h> mo9901p(C7672x<T> c7672x) {
        if (c7672x.m20107w(C10697f0.f27907x)) {
            return new C10743a(this.history);
        }
        return null;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: q */
    protected boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
        return this.history.equals(((C10742i) abstractC7635e).history);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: w */
    public C10741h mo9551e() {
        return C10741h.m10379g(EnumC10744j.AD, 9999, 12, 31);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: x */
    public C10741h mo9554U() {
        return C10741h.m10379g(EnumC10744j.BC, 45, 1, 1);
    }
}
