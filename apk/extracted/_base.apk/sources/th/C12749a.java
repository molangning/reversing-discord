package th;

import ai.C0185d;
import ai.InterfaceC0194h;
import ai.InterfaceC0200k;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p340sf.C12466c;
import p429xh.C13801c;
import p448yg.EnumC14023d;
import ph.C11638f;

/* renamed from: th.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12749a extends AbstractC12783p {

    /* renamed from: a */
    public static final C12749a f33090a = new C12749a();

    /* renamed from: th.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12750a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m5209d;
            m5209d = C12466c.m5209d(C13801c.m1503l((InterfaceC11914e) t).m7458b(), C13801c.m1503l((InterfaceC11914e) t2).m7458b());
            return m5209d;
        }
    }

    private C12749a() {
    }

    /* renamed from: b */
    private static final void m4158b(InterfaceC11914e interfaceC11914e, LinkedHashSet<InterfaceC11914e> linkedHashSet, InterfaceC0194h interfaceC0194h, boolean z) {
        for (InterfaceC11947m interfaceC11947m : InterfaceC0200k.C0201a.m40970a(interfaceC0194h, C0185d.f625t, null, 2, null)) {
            if (interfaceC11947m instanceof InterfaceC11914e) {
                InterfaceC11914e interfaceC11914e2 = (InterfaceC11914e) interfaceC11947m;
                if (interfaceC11914e2.mo4172k0()) {
                    C11638f name = interfaceC11914e2.getName();
                    C9612q.m13918g(name, "descriptor.name");
                    InterfaceC11927h mo16932g = interfaceC0194h.mo16932g(name, EnumC14023d.WHEN_GET_ALL_DESCRIPTORS);
                    if (mo16932g instanceof InterfaceC11914e) {
                        interfaceC11914e2 = (InterfaceC11914e) mo16932g;
                    } else if (mo16932g instanceof InterfaceC11917e1) {
                        interfaceC11914e2 = ((InterfaceC11917e1) mo16932g).mo6720s();
                    } else {
                        interfaceC11914e2 = null;
                    }
                }
                if (interfaceC11914e2 != null) {
                    if (C12758e.m4086z(interfaceC11914e2, interfaceC11914e)) {
                        linkedHashSet.add(interfaceC11914e2);
                    }
                    if (z) {
                        InterfaceC0194h mo4228Q = interfaceC11914e2.mo4228Q();
                        C9612q.m13918g(mo4228Q, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m4158b(interfaceC11914e, linkedHashSet, mo4228Q, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Collection<InterfaceC11914e> m4159a(InterfaceC11914e sealedClass, boolean z) {
        InterfaceC11947m interfaceC11947m;
        InterfaceC11947m interfaceC11947m2;
        List m14028v0;
        List m14104i;
        C9612q.m13917h(sealedClass, "sealedClass");
        if (sealedClass.mo4167r() != EnumC11915e0.SEALED) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            interfaceC11947m2 = sealedClass.mo4163b();
        } else {
            Iterator<InterfaceC11947m> it = C13801c.m1498q(sealedClass).iterator();
            while (true) {
                if (it.hasNext()) {
                    interfaceC11947m = it.next();
                    if (interfaceC11947m instanceof InterfaceC11945l0) {
                        break;
                    }
                } else {
                    interfaceC11947m = null;
                    break;
                }
            }
            interfaceC11947m2 = interfaceC11947m;
        }
        if (interfaceC11947m2 instanceof InterfaceC11945l0) {
            m4158b(sealedClass, linkedHashSet, ((InterfaceC11945l0) interfaceC11947m2).mo4368o(), z);
        }
        InterfaceC0194h mo4228Q = sealedClass.mo4228Q();
        C9612q.m13918g(mo4228Q, "sealedClass.unsubstitutedInnerClassesScope");
        m4158b(sealedClass, linkedHashSet, mo4228Q, true);
        m14028v0 = C9553r.m14028v0(linkedHashSet, new C12750a());
        return m14028v0;
    }
}
