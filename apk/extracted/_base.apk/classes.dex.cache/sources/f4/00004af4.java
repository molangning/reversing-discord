package p305qg;

import ai.InterfaceC0194h;
import kotlin.jvm.internal.C9612q;
import p448yg.InterfaceC14020b;
import ph.C11633c;
import ph.C11638f;

/* renamed from: qg.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11972s {
    /* renamed from: a */
    public static final InterfaceC11927h m6684a(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        InterfaceC11947m mo4163b = interfaceC11947m.mo4163b();
        if (mo4163b == null || (interfaceC11947m instanceof InterfaceC11945l0)) {
            return null;
        }
        if (!m6683b(mo4163b)) {
            return m6684a(mo4163b);
        }
        if (!(mo4163b instanceof InterfaceC11927h)) {
            return null;
        }
        return (InterfaceC11927h) mo4163b;
    }

    /* renamed from: b */
    public static final boolean m6683b(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        return interfaceC11947m.mo4163b() instanceof InterfaceC11945l0;
    }

    /* renamed from: c */
    public static final InterfaceC11914e m6682c(InterfaceC11928h0 interfaceC11928h0, C11633c fqName, InterfaceC14020b lookupLocation) {
        InterfaceC11914e interfaceC11914e;
        InterfaceC11927h interfaceC11927h;
        InterfaceC0194h mo4228Q;
        C9612q.m13917h(interfaceC11928h0, "<this>");
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(lookupLocation, "lookupLocation");
        if (fqName.m7456d()) {
            return null;
        }
        C11633c m7455e = fqName.m7455e();
        C9612q.m13918g(m7455e, "fqName.parent()");
        InterfaceC0194h mo4237o = interfaceC11928h0.mo4210H0(m7455e).mo4237o();
        C11638f m7453g = fqName.m7453g();
        C9612q.m13918g(m7453g, "fqName.shortName()");
        InterfaceC11927h mo16932g = mo4237o.mo16932g(m7453g, lookupLocation);
        if (mo16932g instanceof InterfaceC11914e) {
            interfaceC11914e = (InterfaceC11914e) mo16932g;
        } else {
            interfaceC11914e = null;
        }
        if (interfaceC11914e != null) {
            return interfaceC11914e;
        }
        C11633c m7455e2 = fqName.m7455e();
        C9612q.m13918g(m7455e2, "fqName.parent()");
        InterfaceC11914e m6682c = m6682c(interfaceC11928h0, m7455e2, lookupLocation);
        if (m6682c != null && (mo4228Q = m6682c.mo4228Q()) != null) {
            C11638f m7453g2 = fqName.m7453g();
            C9612q.m13918g(m7453g2, "fqName.shortName()");
            interfaceC11927h = mo4228Q.mo16932g(m7453g2, lookupLocation);
        } else {
            interfaceC11927h = null;
        }
        if (!(interfaceC11927h instanceof InterfaceC11914e)) {
            return null;
        }
        return (InterfaceC11914e) interfaceC11927h;
    }
}