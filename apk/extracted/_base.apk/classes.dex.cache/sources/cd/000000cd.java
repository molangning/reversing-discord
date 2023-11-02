package ai;

import ai.InterfaceC0200k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7297n1;
import p142hi.C7307p1;
import p305qg.InterfaceC11909c1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p327ri.C12242a;
import p372uh.C12976d;
import p448yg.InterfaceC14020b;
import pf.C11577n;
import ph.C11638f;

/* renamed from: ai.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0205m implements InterfaceC0194h {

    /* renamed from: b */
    private final InterfaceC0194h f656b;

    /* renamed from: c */
    private final Lazy f657c;

    /* renamed from: d */
    private final C7307p1 f658d;

    /* renamed from: e */
    private Map<InterfaceC11947m, InterfaceC11947m> f659e;

    /* renamed from: f */
    private final Lazy f660f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ai.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0206a extends AbstractC9614s implements Function0<Collection<? extends InterfaceC11947m>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0206a() {
            super(0);
            C0205m.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Collection<InterfaceC11947m> invoke() {
            C0205m c0205m = C0205m.this;
            return c0205m.m40960k(InterfaceC0200k.C0201a.m40970a(c0205m.f656b, null, null, 3, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ai.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0207b extends AbstractC9614s implements Function0<C7307p1> {

        /* renamed from: j */
        final /* synthetic */ C7307p1 f662j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0207b(C7307p1 c7307p1) {
            super(0);
            this.f662j = c7307p1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C7307p1 invoke() {
            return this.f662j.m21024j().m21051c();
        }
    }

    public C0205m(InterfaceC0194h workerScope, C7307p1 givenSubstitutor) {
        Lazy m7601a;
        Lazy m7601a2;
        C9612q.m13917h(workerScope, "workerScope");
        C9612q.m13917h(givenSubstitutor, "givenSubstitutor");
        this.f656b = workerScope;
        m7601a = C11577n.m7601a(new C0207b(givenSubstitutor));
        this.f657c = m7601a;
        AbstractC7297n1 m21024j = givenSubstitutor.m21024j();
        C9612q.m13918g(m21024j, "givenSubstitutor.substitution");
        this.f658d = C12976d.m3542f(m21024j, false, 1, null).m21051c();
        m7601a2 = C11577n.m7601a(new C0206a());
        this.f660f = m7601a2;
    }

    /* renamed from: j */
    private final Collection<InterfaceC11947m> m40961j() {
        return (Collection) this.f660f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final <D extends InterfaceC11947m> Collection<D> m40960k(Collection<? extends D> collection) {
        if (this.f658d.m21023k()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet m5669g = C12242a.m5669g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m5669g.add(m40959l((InterfaceC11947m) it.next()));
        }
        return m5669g;
    }

    /* renamed from: l */
    private final <D extends InterfaceC11947m> D m40959l(D d) {
        if (this.f658d.m21023k()) {
            return d;
        }
        if (this.f659e == null) {
            this.f659e = new HashMap();
        }
        Map<InterfaceC11947m, InterfaceC11947m> map = this.f659e;
        C9612q.m13920e(map);
        InterfaceC11947m interfaceC11947m = map.get(d);
        if (interfaceC11947m == null) {
            if (d instanceof InterfaceC11909c1) {
                interfaceC11947m = ((InterfaceC11909c1) d).mo4225c(this.f658d);
                if (interfaceC11947m != null) {
                    map.put(d, interfaceC11947m);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
        }
        D d2 = (D) interfaceC11947m;
        C9612q.m13919f(d2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d2;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<? extends InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return m40960k(this.f656b.mo4362a(name, location));
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        return this.f656b.mo4361b();
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<? extends InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return m40960k(this.f656b.mo4360c(name, location));
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        return this.f656b.mo4359d();
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        return m40961j();
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        return this.f656b.mo4357f();
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        InterfaceC11927h mo16932g = this.f656b.mo16932g(name, location);
        if (mo16932g != null) {
            return (InterfaceC11927h) m40959l(mo16932g);
        }
        return null;
    }
}