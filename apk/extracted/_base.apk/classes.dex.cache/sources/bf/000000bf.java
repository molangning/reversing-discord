package ai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11931i;
import p305qg.InterfaceC11947m;
import p448yg.InterfaceC14020b;
import ph.C11638f;

/* renamed from: ai.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0191f extends AbstractC0198i {

    /* renamed from: b */
    private final InterfaceC0194h f642b;

    public C0191f(InterfaceC0194h workerScope) {
        C9612q.m13917h(workerScope, "workerScope");
        this.f642b = workerScope;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        return this.f642b.mo4361b();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        return this.f642b.mo4359d();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        return this.f642b.mo4357f();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        InterfaceC11914e interfaceC11914e;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        InterfaceC11927h mo16932g = this.f642b.mo16932g(name, location);
        if (mo16932g == null) {
            return null;
        }
        if (mo16932g instanceof InterfaceC11914e) {
            interfaceC11914e = (InterfaceC11914e) mo16932g;
        } else {
            interfaceC11914e = null;
        }
        if (interfaceC11914e != null) {
            return interfaceC11914e;
        }
        if (!(mo16932g instanceof InterfaceC11917e1)) {
            return null;
        }
        return (InterfaceC11917e1) mo16932g;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: h */
    public List<InterfaceC11927h> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List<InterfaceC11927h> m14104i;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        C0185d m40992n = kindFilter.m40992n(C0185d.f608c.m40989c());
        if (m40992n == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        Collection<InterfaceC11947m> mo4358e = this.f642b.mo4358e(m40992n, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo4358e) {
            if (obj instanceof InterfaceC11931i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f642b;
    }
}