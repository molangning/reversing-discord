package net.time4j.p249tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.List;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.C10836q;

/* renamed from: net.time4j.tz.model.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10817b extends AbstractC10831l {
    private static final long serialVersionUID = 1749643877954103721L;

    /* renamed from: k */
    private final transient int f28254k;

    /* renamed from: l */
    private final transient C10816a f28255l;

    /* renamed from: m */
    private final transient C10828j f28256m;

    /* renamed from: n */
    private final transient C10836q f28257n;

    /* renamed from: o */
    private transient int f28258o = 0;

    public C10817b(int i, List<C10836q> list, List<AbstractC10819d> list2, boolean z, boolean z2) {
        this.f28254k = i;
        C10816a c10816a = new C10816a(list, z, z2);
        this.f28255l = c10816a;
        C10836q m10090n = c10816a.m10090n();
        this.f28257n = m10090n;
        this.f28256m = new C10828j(m10090n, list2, z);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 127);
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: a */
    public C10836q mo10063a(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return this.f28255l.m10091m(interfaceC10614a, interfaceC10621g, this.f28256m);
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: b */
    public C10836q mo10062b(InterfaceC10620f interfaceC10620f) {
        if (interfaceC10620f.mo10164k() < this.f28257n.m10012e()) {
            return this.f28255l.mo10062b(interfaceC10620f);
        }
        C10836q mo10062b = this.f28256m.mo10062b(interfaceC10620f);
        if (mo10062b == null) {
            return this.f28257n;
        }
        return mo10062b;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: c */
    public boolean mo10061c() {
        return this.f28256m.mo10061c() || this.f28255l.mo10061c();
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: d */
    public C10835p mo10060d() {
        return this.f28255l.mo10060d();
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: e */
    public List<C10835p> mo10059e(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return this.f28255l.m10088p(interfaceC10614a, interfaceC10621g, this.f28256m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10817b)) {
            return false;
        }
        C10817b c10817b = (C10817b) obj;
        if (this.f28255l.m10092l(c10817b.f28255l, this.f28254k, c10817b.f28254k) && this.f28256m.m10055n().equals(c10817b.f28256m.m10055n())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f28258o;
        if (i == 0) {
            int m10087q = this.f28255l.m10087q(this.f28254k) + (this.f28256m.m10055n().hashCode() * 37);
            this.f28258o = m10087q;
            return m10087q;
        }
        return i;
    }

    /* renamed from: k */
    public List<AbstractC10819d> m10082k() {
        return this.f28256m.m10055n();
    }

    /* renamed from: l */
    public void m10081l(ObjectOutput objectOutput) {
        this.f28255l.m10084t(this.f28254k, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(C10817b.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f28254k);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(",last-rules=");
        sb2.append(this.f28256m.m10055n());
        sb2.append(']');
        return sb2.toString();
    }
}