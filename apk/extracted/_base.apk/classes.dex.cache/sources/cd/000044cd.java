package net.time4j;

import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.InterfaceC10808k;
import p162ij.AbstractC7638f0;
import p162ij.AbstractC7655l;
import p162ij.AbstractC7658m;
import p162ij.C7643h;
import p162ij.C7666r;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7663o0;
import p162ij.InterfaceC7664p;

/* renamed from: net.time4j.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10790r<C> implements InterfaceC7662o, InterfaceC7663o0 {

    /* renamed from: j */
    private final AbstractC7655l<?> f28164j;

    /* renamed from: k */
    private final AbstractC7658m<?, ?> f28165k;

    /* renamed from: l */
    private final C10711g0 f28166l;

    /* JADX WARN: Type inference failed for: r3v1, types: [ij.l<?>, ij.l] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ij.m, ij.m<?, ?>] */
    private C10790r(AbstractC7655l<?> abstractC7655l, AbstractC7658m<?, ?> abstractC7658m, C10711g0 c10711g0) {
        if (c10711g0.mo10479s() == 24) {
            if (abstractC7655l == null) {
                this.f28164j = null;
                this.f28165k = abstractC7658m.m20130V(C7643h.m20178c(1L));
            } else {
                this.f28164j = abstractC7655l.m20140K(C7643h.m20178c(1L));
                this.f28165k = null;
            }
            this.f28166l = C10711g0.m10614J0();
            return;
        }
        this.f28164j = abstractC7655l;
        this.f28165k = abstractC7658m;
        this.f28166l = c10711g0;
    }

    /* renamed from: b */
    public static C10790r m10219b(AbstractC7655l abstractC7655l, C10711g0 c10711g0) {
        if (abstractC7655l != null) {
            return new C10790r(abstractC7655l, null, c10711g0);
        }
        throw new NullPointerException("Missing date component.");
    }

    /* renamed from: e */
    public static C10790r m10216e(AbstractC7658m abstractC7658m, C10711g0 c10711g0) {
        if (abstractC7658m != null) {
            return new C10790r(null, abstractC7658m, c10711g0);
        }
        throw new NullPointerException("Missing date component.");
    }

    /* renamed from: h */
    private InterfaceC7662o m10213h() {
        AbstractC7655l<?> abstractC7655l = this.f28164j;
        return abstractC7655l == null ? this.f28165k : abstractC7655l;
    }

    /* renamed from: a */
    public C10582a0 m10220a(AbstractC10809l abstractC10809l, AbstractC7638f0 abstractC7638f0) {
        C10722h0 m10676t0;
        AbstractC7655l<?> abstractC7655l = this.f28164j;
        if (abstractC7655l == null) {
            m10676t0 = ((C10697f0) this.f28165k.m20128X(C10697f0.class)).m10676t0(this.f28166l);
        } else {
            m10676t0 = ((C10697f0) abstractC7655l.m20139L(C10697f0.class)).m10676t0(this.f28166l);
        }
        int intValue = ((Integer) this.f28166l.mo10212i(C10711g0.f27940I)).intValue() - abstractC7638f0.mo20199b(m10676t0.m10496Z(), abstractC10809l.mo10125z());
        if (intValue >= 86400) {
            m10676t0 = m10676t0.m20146K(1L, EnumC10686f.f27878q);
        } else if (intValue < 0) {
            m10676t0 = m10676t0.m20145L(1L, EnumC10686f.f27878q);
        }
        return m10676t0.m10492c0(abstractC10809l);
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: c */
    public int mo10218c(InterfaceC7664p<Integer> interfaceC7664p) {
        return interfaceC7664p.mo9555M() ? m10213h().mo10218c(interfaceC7664p) : this.f28166l.mo10218c(interfaceC7664p);
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: d */
    public boolean mo10217d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10790r)) {
            return false;
        }
        C10790r c10790r = (C10790r) C10790r.class.cast(obj);
        if (!this.f28166l.equals(c10790r.f28166l)) {
            return false;
        }
        AbstractC7655l<?> abstractC7655l = this.f28164j;
        if (abstractC7655l == null) {
            if (c10790r.f28164j == null && this.f28165k.equals(c10790r.f28165k)) {
                return true;
            }
            return false;
        } else if (c10790r.f28165k == null && abstractC7655l.equals(c10790r.f28164j)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: f */
    public <V> V mo10215f(InterfaceC7664p<V> interfaceC7664p) {
        return interfaceC7664p.mo9555M() ? (V) m10213h().mo10215f(interfaceC7664p) : (V) this.f28166l.mo10215f(interfaceC7664p);
    }

    /* renamed from: g */
    public C m10214g() {
        C c = (C) this.f28164j;
        return c == null ? (C) this.f28165k : c;
    }

    public int hashCode() {
        int hashCode;
        AbstractC7655l<?> abstractC7655l = this.f28164j;
        if (abstractC7655l == null) {
            hashCode = this.f28165k.hashCode();
        } else {
            hashCode = abstractC7655l.hashCode();
        }
        return hashCode + this.f28166l.hashCode();
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: i */
    public <V> V mo10212i(InterfaceC7664p<V> interfaceC7664p) {
        return interfaceC7664p.mo9555M() ? (V) m10213h().mo10212i(interfaceC7664p) : (V) this.f28166l.mo10212i(interfaceC7664p);
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: l */
    public <V> V mo10211l(InterfaceC7664p<V> interfaceC7664p) {
        return interfaceC7664p.mo9555M() ? (V) m10213h().mo10211l(interfaceC7664p) : (V) this.f28166l.mo10211l(interfaceC7664p);
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: q */
    public boolean mo10210q(InterfaceC7664p<?> interfaceC7664p) {
        return interfaceC7664p.mo9555M() ? m10213h().mo10210q(interfaceC7664p) : this.f28166l.mo10210q(interfaceC7664p);
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: t */
    public InterfaceC10808k mo10209t() {
        throw new C7666r("Timezone not available: " + this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC7655l<?> abstractC7655l = this.f28164j;
        if (abstractC7655l == null) {
            sb2.append(this.f28165k);
        } else {
            sb2.append(abstractC7655l);
        }
        sb2.append(this.f28166l);
        return sb2.toString();
    }
}