package ai;

import ai.InterfaceC0194h;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9550o;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11931i;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p307qi.C12007a;
import p327ri.C12258e;
import p448yg.InterfaceC14020b;
import ph.C11638f;

/* renamed from: ai.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0180b implements InterfaceC0194h {

    /* renamed from: d */
    public static final C0181a f602d = new C0181a(null);

    /* renamed from: b */
    private final String f603b;

    /* renamed from: c */
    private final InterfaceC0194h[] f604c;

    /* renamed from: ai.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0181a {
        private C0181a() {
        }

        public /* synthetic */ C0181a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC0194h m41008a(String debugName, Iterable<? extends InterfaceC0194h> scopes) {
            C9612q.m13917h(debugName, "debugName");
            C9612q.m13917h(scopes, "scopes");
            C12258e c12258e = new C12258e();
            for (InterfaceC0194h interfaceC0194h : scopes) {
                if (interfaceC0194h != InterfaceC0194h.C0197b.f649b) {
                    if (interfaceC0194h instanceof C0180b) {
                        C9550o.m14084z(c12258e, ((C0180b) interfaceC0194h).f604c);
                    } else {
                        c12258e.add(interfaceC0194h);
                    }
                }
            }
            return m41007b(debugName, c12258e);
        }

        /* renamed from: b */
        public final InterfaceC0194h m41007b(String debugName, List<? extends InterfaceC0194h> scopes) {
            C9612q.m13917h(debugName, "debugName");
            C9612q.m13917h(scopes, "scopes");
            int size = scopes.size();
            if (size != 0) {
                if (size != 1) {
                    return new C0180b(debugName, (InterfaceC0194h[]) scopes.toArray(new InterfaceC0194h[0]), null);
                }
                return scopes.get(0);
            }
            return InterfaceC0194h.C0197b.f649b;
        }
    }

    private C0180b(String str, InterfaceC0194h[] interfaceC0194hArr) {
        this.f603b = str;
        this.f604c = interfaceC0194hArr;
    }

    public /* synthetic */ C0180b(String str, InterfaceC0194h[] interfaceC0194hArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC0194hArr);
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        List m14104i;
        Set m14007d;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        InterfaceC0194h[] interfaceC0194hArr = this.f604c;
        int length = interfaceC0194hArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection<InterfaceC12005z0> collection = null;
                for (InterfaceC0194h interfaceC0194h : interfaceC0194hArr) {
                    collection = C12007a.m6636a(collection, interfaceC0194h.mo4362a(name, location));
                }
                if (collection == null) {
                    m14007d = C9560w.m14007d();
                    return m14007d;
                }
                return collection;
            }
            return interfaceC0194hArr[0].mo4362a(name, location);
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        InterfaceC0194h[] interfaceC0194hArr = this.f604c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC0194h interfaceC0194h : interfaceC0194hArr) {
            C9550o.m14085y(linkedHashSet, interfaceC0194h.mo4361b());
        }
        return linkedHashSet;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        List m14104i;
        Set m14007d;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        InterfaceC0194h[] interfaceC0194hArr = this.f604c;
        int length = interfaceC0194hArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection<InterfaceC11989u0> collection = null;
                for (InterfaceC0194h interfaceC0194h : interfaceC0194hArr) {
                    collection = C12007a.m6636a(collection, interfaceC0194h.mo4360c(name, location));
                }
                if (collection == null) {
                    m14007d = C9560w.m14007d();
                    return m14007d;
                }
                return collection;
            }
            return interfaceC0194hArr[0].mo4360c(name, location);
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        InterfaceC0194h[] interfaceC0194hArr = this.f604c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC0194h interfaceC0194h : interfaceC0194hArr) {
            C9550o.m14085y(linkedHashSet, interfaceC0194h.mo4359d());
        }
        return linkedHashSet;
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List m14104i;
        Set m14007d;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        InterfaceC0194h[] interfaceC0194hArr = this.f604c;
        int length = interfaceC0194hArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection<InterfaceC11947m> collection = null;
                for (InterfaceC0194h interfaceC0194h : interfaceC0194hArr) {
                    collection = C12007a.m6636a(collection, interfaceC0194h.mo4358e(kindFilter, nameFilter));
                }
                if (collection == null) {
                    m14007d = C9560w.m14007d();
                    return m14007d;
                }
                return collection;
            }
            return interfaceC0194hArr[0].mo4358e(kindFilter, nameFilter);
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        Iterable m14200t;
        m14200t = C9538f.m14200t(this.f604c);
        return C0199j.m40971a(m14200t);
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        InterfaceC11927h interfaceC11927h = null;
        for (InterfaceC0194h interfaceC0194h : this.f604c) {
            InterfaceC11927h mo16932g = interfaceC0194h.mo16932g(name, location);
            if (mo16932g != null) {
                if ((mo16932g instanceof InterfaceC11931i) && ((InterfaceC11931i) mo16932g).mo4172k0()) {
                    if (interfaceC11927h == null) {
                        interfaceC11927h = mo16932g;
                    }
                } else {
                    return mo16932g;
                }
            }
        }
        return interfaceC11927h;
    }

    public String toString() {
        return this.f603b;
    }
}
