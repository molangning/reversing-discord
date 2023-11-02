package p069dh;

import gg.C6759j;
import gh.C6779p;
import gh.InterfaceC6770g;
import gh.InterfaceC6777n;
import gh.InterfaceC6780q;
import gh.InterfaceC6781r;
import gh.InterfaceC6786w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p304qf.C11888u;
import ph.C11638f;
import si.C12552o;

/* renamed from: dh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C5839a implements InterfaceC5841b {

    /* renamed from: a */
    private final InterfaceC6770g f16707a;

    /* renamed from: b */
    private final Function1<InterfaceC6780q, Boolean> f16708b;

    /* renamed from: c */
    private final Function1<InterfaceC6781r, Boolean> f16709c;

    /* renamed from: d */
    private final Map<C11638f, List<InterfaceC6781r>> f16710d;

    /* renamed from: e */
    private final Map<C11638f, InterfaceC6777n> f16711e;

    /* renamed from: f */
    private final Map<C11638f, InterfaceC6786w> f16712f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5840a extends AbstractC9614s implements Function1<InterfaceC6781r, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5840a() {
            super(1);
            C5839a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC6781r m) {
            boolean z;
            C9612q.m13917h(m, "m");
            if (((Boolean) C5839a.this.f16708b.invoke(m)).booleanValue() && !C6779p.m21911c(m)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5839a(InterfaceC6770g jClass, Function1<? super InterfaceC6780q, Boolean> memberFilter) {
        Sequence m14066K;
        Sequence m4860p;
        Sequence m14066K2;
        Sequence m4860p2;
        int m14093t;
        int m6758d;
        int m21930c;
        C9612q.m13917h(jClass, "jClass");
        C9612q.m13917h(memberFilter, "memberFilter");
        this.f16707a = jClass;
        this.f16708b = memberFilter;
        C5840a c5840a = new C5840a();
        this.f16709c = c5840a;
        m14066K = C9553r.m14066K(jClass.mo2222B());
        m4860p = C12552o.m4860p(m14066K, c5840a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m4860p) {
            C11638f name = ((InterfaceC6781r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f16710d = linkedHashMap;
        m14066K2 = C9553r.m14066K(this.f16707a.mo2201x());
        m4860p2 = C12552o.m4860p(m14066K2, this.f16708b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : m4860p2) {
            linkedHashMap2.put(((InterfaceC6777n) obj3).getName(), obj3);
        }
        this.f16711e = linkedHashMap2;
        Collection<InterfaceC6786w> mo2206p = this.f16707a.mo2206p();
        Function1<InterfaceC6780q, Boolean> function1 = this.f16708b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : mo2206p) {
            if (((Boolean) function1.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        m14093t = C9546k.m14093t(arrayList, 10);
        m6758d = C11888u.m6758d(m14093t);
        m21930c = C6759j.m21930c(m6758d, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(m21930c);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((InterfaceC6786w) obj5).getName(), obj5);
        }
        this.f16712f = linkedHashMap3;
    }

    @Override // p069dh.InterfaceC5841b
    /* renamed from: a */
    public Set<C11638f> mo24384a() {
        Sequence m14066K;
        Sequence<InterfaceC6781r> m4860p;
        m14066K = C9553r.m14066K(this.f16707a.mo2222B());
        m4860p = C12552o.m4860p(m14066K, this.f16709c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6781r interfaceC6781r : m4860p) {
            linkedHashSet.add(interfaceC6781r.getName());
        }
        return linkedHashSet;
    }

    @Override // p069dh.InterfaceC5841b
    /* renamed from: b */
    public Set<C11638f> mo24383b() {
        return this.f16712f.keySet();
    }

    @Override // p069dh.InterfaceC5841b
    /* renamed from: c */
    public Set<C11638f> mo24382c() {
        Sequence m14066K;
        Sequence<InterfaceC6777n> m4860p;
        m14066K = C9553r.m14066K(this.f16707a.mo2201x());
        m4860p = C12552o.m4860p(m14066K, this.f16708b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6777n interfaceC6777n : m4860p) {
            linkedHashSet.add(interfaceC6777n.getName());
        }
        return linkedHashSet;
    }

    @Override // p069dh.InterfaceC5841b
    /* renamed from: d */
    public InterfaceC6786w mo24381d(C11638f name) {
        C9612q.m13917h(name, "name");
        return this.f16712f.get(name);
    }

    @Override // p069dh.InterfaceC5841b
    /* renamed from: e */
    public Collection<InterfaceC6781r> mo24380e(C11638f name) {
        List m14104i;
        C9612q.m13917h(name, "name");
        List<InterfaceC6781r> list = this.f16710d.get(name);
        if (list == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return list;
    }

    @Override // p069dh.InterfaceC5841b
    /* renamed from: f */
    public InterfaceC6777n mo24379f(C11638f name) {
        C9612q.m13917h(name, "name");
        return this.f16711e.get(name);
    }
}