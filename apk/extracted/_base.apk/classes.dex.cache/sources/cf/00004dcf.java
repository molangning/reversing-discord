package tg;

import ai.AbstractC0182c;
import ai.AbstractC0198i;
import ai.C0185d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11969q0;
import p327ri.C12242a;
import ph.C11633c;
import ph.C11638f;

/* renamed from: tg.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12703h0 extends AbstractC0198i {

    /* renamed from: b */
    private final InterfaceC11928h0 f32943b;

    /* renamed from: c */
    private final C11633c f32944c;

    public C12703h0(InterfaceC11928h0 moduleDescriptor, C11633c fqName) {
        C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
        C9612q.m13917h(fqName, "fqName");
        this.f32943b = moduleDescriptor;
        this.f32944c = fqName;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List m14104i;
        List m14104i2;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        if (!kindFilter.m41005a(C0185d.f608c.m40986f())) {
            m14104i2 = C9545j.m14104i();
            return m14104i2;
        } else if (this.f32944c.m7456d() && kindFilter.m40994l().contains(AbstractC0182c.C0184b.f607a)) {
            m14104i = C9545j.m14104i();
            return m14104i;
        } else {
            Collection<C11633c> mo4193t = this.f32943b.mo4193t(this.f32944c, nameFilter);
            ArrayList arrayList = new ArrayList(mo4193t.size());
            for (C11633c c11633c : mo4193t) {
                C11638f m7453g = c11633c.m7453g();
                C9612q.m13918g(m7453g, "subFqName.shortName()");
                if (nameFilter.invoke(m7453g).booleanValue()) {
                    C12242a.m5675a(arrayList, m4428h(m7453g));
                }
            }
            return arrayList;
        }
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        Set<C11638f> m14007d;
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    /* renamed from: h */
    protected final InterfaceC11969q0 m4428h(C11638f name) {
        C9612q.m13917h(name, "name");
        if (name.m7421g()) {
            return null;
        }
        InterfaceC11928h0 interfaceC11928h0 = this.f32943b;
        C11633c m7457c = this.f32944c.m7457c(name);
        C9612q.m13918g(m7457c, "fqName.child(name)");
        InterfaceC11969q0 mo4210H0 = interfaceC11928h0.mo4210H0(m7457c);
        if (mo4210H0.isEmpty()) {
            return null;
        }
        return mo4210H0;
    }

    public String toString() {
        return "subpackages of " + this.f32944c + " from " + this.f32943b;
    }
}