package net.time4j.p249tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.List;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10800c extends AbstractC10809l {
    private static final long serialVersionUID = 1738909257417361021L;

    /* renamed from: E */
    private final transient InterfaceC10808k f28204E;

    /* renamed from: F */
    private final transient InterfaceC10815m f28205F;

    /* renamed from: G */
    private final transient InterfaceC10834o f28206G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10800c(InterfaceC10808k interfaceC10808k, InterfaceC10815m interfaceC10815m) {
        this(interfaceC10808k, interfaceC10815m, AbstractC10809l.f28231m);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 14);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: A */
    public C10835p mo10162A(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        List<C10835p> mo10059e = this.f28205F.mo10059e(interfaceC10614a, interfaceC10621g);
        if (mo10059e.size() == 1) {
            return mo10059e.get(0);
        }
        return C10835p.m10020q(this.f28205F.mo10063a(interfaceC10614a, interfaceC10621g).m10008i());
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: B */
    public C10835p mo10161B(InterfaceC10620f interfaceC10620f) {
        C10836q mo10062b = this.f28205F.mo10062b(interfaceC10620f);
        if (mo10062b == null) {
            return this.f28205F.mo10060d();
        }
        return C10835p.m10020q(mo10062b.m10008i());
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: E */
    public InterfaceC10834o mo10158E() {
        return this.f28206G;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: I */
    public boolean mo10154I(InterfaceC10620f interfaceC10620f) {
        InterfaceC10620f m10165b;
        C10836q mo10062b;
        C10836q mo10062b2 = this.f28205F.mo10062b(interfaceC10620f);
        if (mo10062b2 == null) {
            return false;
        }
        int m10013d = mo10062b2.m10013d();
        if (m10013d > 0) {
            return true;
        }
        if (m10013d < 0 || !this.f28205F.mo10061c() || (mo10062b = this.f28205F.mo10062b((m10165b = C10806i.m10165b(mo10062b2.m10012e(), 0)))) == null) {
            return false;
        }
        if (mo10062b.m10009h() == mo10062b2.m10009h()) {
            if (mo10062b.m10013d() >= 0) {
                return false;
            }
            return true;
        }
        return mo10154I(m10165b);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: J */
    public boolean mo10153J() {
        return this.f28205F.isEmpty();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: K */
    public boolean mo10152K(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        C10836q mo10063a = this.f28205F.mo10063a(interfaceC10614a, interfaceC10621g);
        if (mo10063a != null && mo10063a.m10007k()) {
            return true;
        }
        return false;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: Q */
    public AbstractC10809l mo10146Q(InterfaceC10834o interfaceC10834o) {
        if (this.f28206G == interfaceC10834o) {
            return this;
        }
        return new C10800c(this.f28204E, this.f28205F, interfaceC10834o);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10800c)) {
            return false;
        }
        C10800c c10800c = (C10800c) obj;
        if (this.f28204E.mo10035a().equals(c10800c.f28204E.mo10035a()) && this.f28205F.equals(c10800c.f28205F) && this.f28206G.equals(c10800c.f28206G)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f28204E.mo10035a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(C10800c.class.getName());
        sb2.append(':');
        sb2.append(this.f28204E.mo10035a());
        sb2.append(",history={");
        sb2.append(this.f28205F);
        sb2.append("},strategy=");
        sb2.append(this.f28206G);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: y */
    public InterfaceC10815m mo10126y() {
        return this.f28205F;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: z */
    public InterfaceC10808k mo10125z() {
        return this.f28204E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10800c(InterfaceC10808k interfaceC10808k, InterfaceC10815m interfaceC10815m, InterfaceC10834o interfaceC10834o) {
        if (interfaceC10808k != null) {
            if ((interfaceC10808k instanceof C10835p) && !interfaceC10815m.isEmpty()) {
                throw new IllegalArgumentException("Fixed zonal offset can't be combined with offset transitions: " + interfaceC10808k.mo10035a());
            } else if (interfaceC10815m == null) {
                throw new NullPointerException("Missing timezone history.");
            } else {
                if (interfaceC10834o != null) {
                    this.f28204E = interfaceC10808k;
                    this.f28205F = interfaceC10815m;
                    this.f28206G = interfaceC10834o;
                    return;
                }
                throw new NullPointerException("Missing transition strategy.");
            }
        }
        throw new NullPointerException("Missing timezone id.");
    }
}
