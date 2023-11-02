package p141hh;

import gg.C6759j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C9538f;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p160ih.C7578y;
import p304qf.C11880m;
import p304qf.C11888u;
import p449yh.EnumC14028e;
import pf.C11591x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hh.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7206m {

    /* renamed from: a */
    private final Map<String, C7199k> f19592a = new LinkedHashMap();

    /* renamed from: hh.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public final class C7207a {

        /* renamed from: a */
        private final String f19593a;

        /* renamed from: b */
        final /* synthetic */ C7206m f19594b;

        /* renamed from: hh.m$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public final class C7208a {

            /* renamed from: a */
            private final String f19595a;

            /* renamed from: b */
            private final List<Pair<String, C7212q>> f19596b;

            /* renamed from: c */
            private Pair<String, C7212q> f19597c;

            /* renamed from: d */
            final /* synthetic */ C7207a f19598d;

            public C7208a(C7207a c7207a, String functionName) {
                C9612q.m13917h(functionName, "functionName");
                this.f19598d = c7207a;
                this.f19595a = functionName;
                this.f19596b = new ArrayList();
                this.f19597c = C11591x.m7577a("V", null);
            }

            /* renamed from: a */
            public final Pair<String, C7199k> m21265a() {
                int m14093t;
                int m14093t2;
                C7578y c7578y = C7578y.f20876a;
                String m21266b = this.f19598d.m21266b();
                String str = this.f19595a;
                List<Pair<String, C7212q>> list = this.f19596b;
                m14093t = C9546k.m14093t(list, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).m14349c());
                }
                String m20369k = c7578y.m20369k(m21266b, c7578y.m20370j(str, arrayList, this.f19597c.m14349c()));
                C7212q m14348d = this.f19597c.m14348d();
                List<Pair<String, C7212q>> list2 = this.f19596b;
                m14093t2 = C9546k.m14093t(list2, 10);
                ArrayList arrayList2 = new ArrayList(m14093t2);
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C7212q) ((Pair) it2.next()).m14348d());
                }
                return C11591x.m7577a(m20369k, new C7199k(m14348d, arrayList2));
            }

            /* renamed from: b */
            public final void m21264b(String type, C7164e... qualifiers) {
                boolean z;
                Iterable<C11880m> m14238I0;
                int m14093t;
                int m6758d;
                int m21930c;
                C7212q c7212q;
                C9612q.m13917h(type, "type");
                C9612q.m13917h(qualifiers, "qualifiers");
                List<Pair<String, C7212q>> list = this.f19596b;
                if (qualifiers.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c7212q = null;
                } else {
                    m14238I0 = C9538f.m14238I0(qualifiers);
                    m14093t = C9546k.m14093t(m14238I0, 10);
                    m6758d = C11888u.m6758d(m14093t);
                    m21930c = C6759j.m21930c(m6758d, 16);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
                    for (C11880m c11880m : m14238I0) {
                        linkedHashMap.put(Integer.valueOf(c11880m.m6780c()), (C7164e) c11880m.m6779d());
                    }
                    c7212q = new C7212q(linkedHashMap);
                }
                list.add(C11591x.m7577a(type, c7212q));
            }

            /* renamed from: c */
            public final void m21263c(String type, C7164e... qualifiers) {
                Iterable<C11880m> m14238I0;
                int m14093t;
                int m6758d;
                int m21930c;
                C9612q.m13917h(type, "type");
                C9612q.m13917h(qualifiers, "qualifiers");
                m14238I0 = C9538f.m14238I0(qualifiers);
                m14093t = C9546k.m14093t(m14238I0, 10);
                m6758d = C11888u.m6758d(m14093t);
                m21930c = C6759j.m21930c(m6758d, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
                for (C11880m c11880m : m14238I0) {
                    linkedHashMap.put(Integer.valueOf(c11880m.m6780c()), (C7164e) c11880m.m6779d());
                }
                this.f19597c = C11591x.m7577a(type, new C7212q(linkedHashMap));
            }

            /* renamed from: d */
            public final void m21262d(EnumC14028e type) {
                C9612q.m13917h(type, "type");
                String m877d = type.m877d();
                C9612q.m13918g(m877d, "type.desc");
                this.f19597c = C11591x.m7577a(m877d, null);
            }
        }

        public C7207a(C7206m c7206m, String className) {
            C9612q.m13917h(className, "className");
            this.f19594b = c7206m;
            this.f19593a = className;
        }

        /* renamed from: a */
        public final void m21267a(String name, Function1<? super C7208a, Unit> block) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(block, "block");
            Map map = this.f19594b.f19592a;
            C7208a c7208a = new C7208a(this, name);
            block.invoke(c7208a);
            Pair<String, C7199k> m21265a = c7208a.m21265a();
            map.put(m21265a.m14349c(), m21265a.m14348d());
        }

        /* renamed from: b */
        public final String m21266b() {
            return this.f19593a;
        }
    }

    /* renamed from: b */
    public final Map<String, C7199k> m21268b() {
        return this.f19592a;
    }
}