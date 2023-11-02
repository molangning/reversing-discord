package ai;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p327ri.C12251d;
import p448yg.InterfaceC14020b;
import ph.C11638f;

/* renamed from: ai.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC0198i implements InterfaceC0194h {
    @Override // ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<? extends InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        List m14104i;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        Collection<InterfaceC11947m> mo4358e = mo4358e(C0185d.f627v, C12251d.m5658a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : mo4358e) {
            if (obj instanceof InterfaceC12005z0) {
                C11638f name = ((InterfaceC12005z0) obj).getName();
                C9612q.m13918g(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<? extends InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        List m14104i;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        Collection<InterfaceC11947m> mo4358e = mo4358e(C0185d.f628w, C12251d.m5658a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : mo4358e) {
            if (obj instanceof InterfaceC12005z0) {
                C11638f name = ((InterfaceC12005z0) obj).getName();
                C9612q.m13918g(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List m14104i;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        return null;
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return null;
    }
}