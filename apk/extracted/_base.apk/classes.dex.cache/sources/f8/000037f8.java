package p162ij;

import java.io.Serializable;
import net.time4j.base.C10616c;
import p162ij.AbstractC7655l;

/* renamed from: ij.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7655l<D extends AbstractC7655l<D>> extends AbstractC7665q<D> implements InterfaceC7641g, InterfaceC7663o0, Comparable<D>, Serializable {
    /* renamed from: M */
    private <T> T m20138M(InterfaceC7653k<T> interfaceC7653k, String str) {
        long mo10920b = mo10920b();
        if (interfaceC7653k.mo10627d() <= mo10920b && interfaceC7653k.mo10630a() >= mo10920b) {
            return interfaceC7653k.mo10629b(mo10920b);
        }
        throw new ArithmeticException("Cannot transform <" + mo10920b + "> to: " + str);
    }

    @Override // p162ij.AbstractC7665q
    /* renamed from: A */
    public <V> InterfaceC7676z<D, V> mo20123A(InterfaceC7664p<V> interfaceC7664p) {
        if (interfaceC7664p instanceof EnumC7627a0) {
            return ((EnumC7627a0) EnumC7627a0.class.cast(interfaceC7664p)).m20219c(m20142I());
        }
        return super.mo20123A(interfaceC7664p);
    }

    @Override // java.lang.Comparable
    /* renamed from: H */
    public int compareTo(D d) {
        int i = (mo10920b() > d.mo10920b() ? 1 : (mo10920b() == d.mo10920b() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return mo10407n().compareTo(d.mo10407n());
    }

    /* renamed from: I */
    protected InterfaceC7653k<D> m20142I() {
        return mo10478v().mo20114o(mo10407n());
    }

    @Override // p162ij.AbstractC7665q
    /* renamed from: J */
    public abstract C7651j<D> mo10478v();

    /* renamed from: K */
    public D m20140K(C7643h c7643h) {
        long m11036f = C10616c.m11036f(mo10920b(), c7643h.m20179b());
        try {
            return m20142I().mo10629b(m11036f);
        } catch (IllegalArgumentException e) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + m11036f);
            arithmeticException.initCause(e);
            throw arithmeticException;
        }
    }

    /* renamed from: L */
    public <T extends AbstractC7658m<?, T>> T m20139L(Class<T> cls) {
        String name = cls.getName();
        C7672x m20105y = C7672x.m20105y(cls);
        if (m20105y != null) {
            return (T) m20138M(m20105y.mo20115n(), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    @Override // p162ij.InterfaceC7641g
    /* renamed from: b */
    public long mo10920b() {
        return m20142I().mo10628c((D) mo10477w());
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}