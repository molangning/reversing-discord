package p162ij;

import net.time4j.base.C10616c;
import p162ij.AbstractC7658m;

/* renamed from: ij.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7658m<U, D extends AbstractC7658m<U, D>> extends AbstractC7654k0<U, D> implements InterfaceC7641g {
    /* renamed from: R */
    private InterfaceC7653k<D> m20133R() {
        return mo10478v().mo20115n();
    }

    /* renamed from: Y */
    private <T> T m20127Y(InterfaceC7653k<T> interfaceC7653k, String str) {
        long mo10920b = mo10920b();
        if (interfaceC7653k.mo10627d() <= mo10920b && interfaceC7653k.mo10630a() >= mo10920b) {
            return interfaceC7653k.mo10629b(mo10920b);
        }
        throw new ArithmeticException("Cannot transform <" + mo10920b + "> to: " + str);
    }

    /* renamed from: N */
    public int mo10712N(InterfaceC7641g interfaceC7641g) {
        int i = (mo10920b() > interfaceC7641g.mo10920b() ? 1 : (mo10920b() == interfaceC7641g.mo10920b() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    @Override // p162ij.AbstractC7654k0, java.lang.Comparable
    /* renamed from: Q */
    public int compareTo(D d) {
        if (mo10478v().m20113p() == d.mo10478v().m20113p()) {
            return mo10712N(d);
        }
        throw new ClassCastException("Cannot compare different types of dates, use instance of EpochDays as comparator instead.");
    }

    /* renamed from: S */
    public boolean m20132S(InterfaceC7641g interfaceC7641g) {
        return mo10712N(interfaceC7641g) > 0;
    }

    /* renamed from: U */
    public boolean m20131U(InterfaceC7641g interfaceC7641g) {
        return mo10712N(interfaceC7641g) < 0;
    }

    /* renamed from: V */
    public D m20130V(C7643h c7643h) {
        long m11036f = C10616c.m11036f(mo10920b(), c7643h.m20179b());
        try {
            return m20133R().mo10629b(m11036f);
        } catch (IllegalArgumentException e) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + m11036f);
            arithmeticException.initCause(e);
            throw arithmeticException;
        }
    }

    /* renamed from: W */
    public <T extends AbstractC7655l<T>> T m20129W(Class<T> cls, String str) {
        String name = cls.getName();
        C7672x m20105y = C7672x.m20105y(cls);
        if (m20105y != null) {
            return (T) m20127Y(m20105y.mo20114o(str), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    /* renamed from: X */
    public <T extends AbstractC7658m<?, T>> T m20128X(Class<T> cls) {
        String name = cls.getName();
        C7672x m20105y = C7672x.m20105y(cls);
        if (m20105y != null) {
            return (T) m20127Y(m20105y.mo20115n(), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    @Override // p162ij.InterfaceC7641g
    /* renamed from: b */
    public long mo10920b() {
        return m20133R().mo10628c((D) mo10477w());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AbstractC7658m)) {
            return false;
        }
        AbstractC7658m abstractC7658m = (AbstractC7658m) obj;
        if (mo10478v().m20113p() == abstractC7658m.mo10478v().m20113p() && mo10920b() == abstractC7658m.mo10920b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long mo10920b = mo10920b();
        return (int) (mo10920b ^ (mo10920b >>> 32));
    }
}