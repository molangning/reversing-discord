package p069dh;

import ai.C0185d;
import ai.C0199j;
import ai.InterfaceC0194h;
import ch.C2548g;
import gh.InterfaceC6784u;
import gi.C6820m;
import gi.InterfaceC6815i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C9538f;
import kotlin.collections.C9550o;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import p160ih.InterfaceC7564r;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11931i;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p307qi.C12007a;
import p428xg.C13798a;
import p448yg.InterfaceC14020b;
import ph.C11638f;

/* renamed from: dh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C5844d implements InterfaceC0194h {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f16715f = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C5844d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b */
    private final C2548g f16716b;

    /* renamed from: c */
    private final C5871h f16717c;

    /* renamed from: d */
    private final C5876i f16718d;

    /* renamed from: e */
    private final InterfaceC6815i f16719e;

    /* renamed from: dh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5845a extends AbstractC9614s implements Function0<InterfaceC0194h[]> {
        C5845a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC0194h[] invoke() {
            Collection<InterfaceC7564r> values = C5844d.this.f16717c.m24274M0().values();
            C5844d c5844d = C5844d.this;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC7564r interfaceC7564r : values) {
                InterfaceC0194h m20456b = c5844d.f16716b.m33014a().m33048b().m20456b(c5844d.f16717c, interfaceC7564r);
                if (m20456b != null) {
                    arrayList.add(m20456b);
                }
            }
            return (InterfaceC0194h[]) C12007a.m6635b(arrayList).toArray(new InterfaceC0194h[0]);
        }
    }

    public C5844d(C2548g c, InterfaceC6784u jPackage, C5871h packageFragment) {
        C9612q.m13917h(c, "c");
        C9612q.m13917h(jPackage, "jPackage");
        C9612q.m13917h(packageFragment, "packageFragment");
        this.f16716b = c;
        this.f16717c = packageFragment;
        this.f16718d = new C5876i(c, jPackage, packageFragment);
        this.f16719e = c.m33010e().mo21867c(new C5845a());
    }

    /* renamed from: k */
    private final InterfaceC0194h[] m24373k() {
        return (InterfaceC0194h[]) C6820m.m21871a(this.f16719e, this, f16715f[0]);
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        Set m14007d;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m24372l(name, location);
        C5876i c5876i = this.f16718d;
        InterfaceC0194h[] m24373k = m24373k();
        Collection<? extends InterfaceC12005z0> mo4362a = c5876i.mo4362a(name, location);
        int length = m24373k.length;
        int i = 0;
        Collection collection = mo4362a;
        while (i < length) {
            i++;
            collection = C12007a.m6636a(collection, m24373k[i].mo4362a(name, location));
        }
        if (collection == null) {
            m14007d = C9560w.m14007d();
            return m14007d;
        }
        return collection;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        InterfaceC0194h[] m24373k = m24373k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC0194h interfaceC0194h : m24373k) {
            C9550o.m14085y(linkedHashSet, interfaceC0194h.mo4361b());
        }
        linkedHashSet.addAll(this.f16718d.mo4361b());
        return linkedHashSet;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        Set m14007d;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m24372l(name, location);
        C5876i c5876i = this.f16718d;
        InterfaceC0194h[] m24373k = m24373k();
        Collection<? extends InterfaceC11989u0> mo4360c = c5876i.mo4360c(name, location);
        int length = m24373k.length;
        int i = 0;
        Collection collection = mo4360c;
        while (i < length) {
            i++;
            collection = C12007a.m6636a(collection, m24373k[i].mo4360c(name, location));
        }
        if (collection == null) {
            m14007d = C9560w.m14007d();
            return m14007d;
        }
        return collection;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        InterfaceC0194h[] m24373k = m24373k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC0194h interfaceC0194h : m24373k) {
            C9550o.m14085y(linkedHashSet, interfaceC0194h.mo4359d());
        }
        linkedHashSet.addAll(this.f16718d.mo4359d());
        return linkedHashSet;
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        Set m14007d;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        C5876i c5876i = this.f16718d;
        InterfaceC0194h[] m24373k = m24373k();
        Collection<InterfaceC11947m> mo4358e = c5876i.mo4358e(kindFilter, nameFilter);
        for (InterfaceC0194h interfaceC0194h : m24373k) {
            mo4358e = C12007a.m6636a(mo4358e, interfaceC0194h.mo4358e(kindFilter, nameFilter));
        }
        if (mo4358e == null) {
            m14007d = C9560w.m14007d();
            return m14007d;
        }
        return mo4358e;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        Iterable m14200t;
        m14200t = C9538f.m14200t(m24373k());
        Set<C11638f> m40971a = C0199j.m40971a(m14200t);
        if (m40971a != null) {
            m40971a.addAll(this.f16718d.mo4357f());
            return m40971a;
        }
        return null;
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m24372l(name, location);
        InterfaceC11914e mo16932g = this.f16718d.mo16932g(name, location);
        if (mo16932g != null) {
            return mo16932g;
        }
        InterfaceC11927h interfaceC11927h = null;
        for (InterfaceC0194h interfaceC0194h : m24373k()) {
            InterfaceC11927h mo16932g2 = interfaceC0194h.mo16932g(name, location);
            if (mo16932g2 != null) {
                if ((mo16932g2 instanceof InterfaceC11931i) && ((InterfaceC11931i) mo16932g2).mo4172k0()) {
                    if (interfaceC11927h == null) {
                        interfaceC11927h = mo16932g2;
                    }
                } else {
                    return mo16932g2;
                }
            }
        }
        return interfaceC11927h;
    }

    /* renamed from: j */
    public final C5876i m24374j() {
        return this.f16718d;
    }

    /* renamed from: l */
    public void m24372l(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        C13798a.m1517b(this.f16716b.m33014a().m33038l(), location, this.f16717c, name);
    }

    public String toString() {
        return "scope for " + this.f16717c;
    }
}
