package fi;

import ai.AbstractC0198i;
import ai.C0185d;
import gg.C6759j;
import gi.C6820m;
import gi.InterfaceC6813g;
import gi.InterfaceC6814h;
import gi.InterfaceC6815i;
import gi.InterfaceC6816j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.C9412i;
import kh.C9425n;
import kh.C9447r;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9549n;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.collections.C9561x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import p070di.C5942m;
import p070di.C5967x;
import p304qf.C11888u;
import p304qf.C11889v;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p326rh.AbstractC12170a;
import p326rh.InterfaceC12210q;
import p326rh.InterfaceC12213s;
import p327ri.C12242a;
import p448yg.InterfaceC14020b;
import ph.C11632b;
import ph.C11638f;
import th.C12763h;

/* renamed from: fi.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC6451h extends AbstractC0198i {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f18115f = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC6451h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC6451h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b */
    private final C5942m f18116b;

    /* renamed from: c */
    private final InterfaceC6452a f18117c;

    /* renamed from: d */
    private final InterfaceC6815i f18118d;

    /* renamed from: e */
    private final InterfaceC6816j f18119e;

    /* renamed from: fi.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC6452a {
        /* renamed from: a */
        Collection<InterfaceC12005z0> mo22687a(C11638f c11638f, InterfaceC14020b interfaceC14020b);

        /* renamed from: b */
        Set<C11638f> mo22686b();

        /* renamed from: c */
        Collection<InterfaceC11989u0> mo22685c(C11638f c11638f, InterfaceC14020b interfaceC14020b);

        /* renamed from: d */
        Set<C11638f> mo22684d();

        /* renamed from: e */
        Set<C11638f> mo22683e();

        /* renamed from: f */
        void mo22682f(Collection<InterfaceC11947m> collection, C0185d c0185d, Function1<? super C11638f, Boolean> function1, InterfaceC14020b interfaceC14020b);

        /* renamed from: g */
        InterfaceC11917e1 mo22681g(C11638f c11638f);
    }

    /* renamed from: fi.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C6453b implements InterfaceC6452a {

        /* renamed from: o */
        static final /* synthetic */ KProperty<Object>[] f18120o = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "allProperties", "getAllProperties()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6453b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a */
        private final List<C9412i> f18121a;

        /* renamed from: b */
        private final List<C9425n> f18122b;

        /* renamed from: c */
        private final List<C9447r> f18123c;

        /* renamed from: d */
        private final InterfaceC6815i f18124d;

        /* renamed from: e */
        private final InterfaceC6815i f18125e;

        /* renamed from: f */
        private final InterfaceC6815i f18126f;

        /* renamed from: g */
        private final InterfaceC6815i f18127g;

        /* renamed from: h */
        private final InterfaceC6815i f18128h;

        /* renamed from: i */
        private final InterfaceC6815i f18129i;

        /* renamed from: j */
        private final InterfaceC6815i f18130j;

        /* renamed from: k */
        private final InterfaceC6815i f18131k;

        /* renamed from: l */
        private final InterfaceC6815i f18132l;

        /* renamed from: m */
        private final InterfaceC6815i f18133m;

        /* renamed from: n */
        final /* synthetic */ AbstractC6451h f18134n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6454a extends AbstractC9614s implements Function0<List<? extends InterfaceC12005z0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6454a() {
                super(0);
                C6453b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC12005z0> invoke() {
                List<? extends InterfaceC12005z0> m14036n0;
                m14036n0 = C9553r.m14036n0(C6453b.this.m22716D(), C6453b.this.m22699t());
                return m14036n0;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6455b extends AbstractC9614s implements Function0<List<? extends InterfaceC11989u0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6455b() {
                super(0);
                C6453b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC11989u0> invoke() {
                List<? extends InterfaceC11989u0> m14036n0;
                m14036n0 = C9553r.m14036n0(C6453b.this.m22715E(), C6453b.this.m22698u());
                return m14036n0;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6456c extends AbstractC9614s implements Function0<List<? extends InterfaceC11917e1>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6456c() {
                super(0);
                C6453b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC11917e1> invoke() {
                return C6453b.this.m22693z();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6457d extends AbstractC9614s implements Function0<List<? extends InterfaceC12005z0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6457d() {
                super(0);
                C6453b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC12005z0> invoke() {
                return C6453b.this.m22697v();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6458e extends AbstractC9614s implements Function0<List<? extends InterfaceC11989u0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6458e() {
                super(0);
                C6453b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC11989u0> invoke() {
                return C6453b.this.m22694y();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$f */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6459f extends AbstractC9614s implements Function0<Set<? extends C11638f>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC6451h f18141k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6459f(AbstractC6451h abstractC6451h) {
                super(0);
                C6453b.this = r1;
                this.f18141k = abstractC6451h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Set<C11638f> invoke() {
                Set<C11638f> m13999l;
                C6453b c6453b = C6453b.this;
                List<InterfaceC12210q> list = c6453b.f18121a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC6451h abstractC6451h = c6453b.f18134n;
                for (InterfaceC12210q interfaceC12210q : list) {
                    linkedHashSet.add(C5967x.m24061b(abstractC6451h.m22724p().m24097g(), ((C9412i) interfaceC12210q).m15315e0()));
                }
                m13999l = C9561x.m13999l(linkedHashSet, this.f18141k.mo22660t());
                return m13999l;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$g */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6460g extends AbstractC9614s implements Function0<Map<C11638f, ? extends List<? extends InterfaceC12005z0>>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6460g() {
                super(0);
                C6453b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Map<C11638f, List<InterfaceC12005z0>> invoke() {
                List m22719A = C6453b.this.m22719A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : m22719A) {
                    C11638f name = ((InterfaceC12005z0) obj).getName();
                    C9612q.m13918g(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$h */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6461h extends AbstractC9614s implements Function0<Map<C11638f, ? extends List<? extends InterfaceC11989u0>>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6461h() {
                super(0);
                C6453b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Map<C11638f, List<InterfaceC11989u0>> invoke() {
                List m22718B = C6453b.this.m22718B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : m22718B) {
                    C11638f name = ((InterfaceC11989u0) obj).getName();
                    C9612q.m13918g(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$i */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6462i extends AbstractC9614s implements Function0<Map<C11638f, ? extends InterfaceC11917e1>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6462i() {
                super(0);
                C6453b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Map<C11638f, InterfaceC11917e1> invoke() {
                int m14093t;
                int m6758d;
                int m21930c;
                List m22717C = C6453b.this.m22717C();
                m14093t = C9546k.m14093t(m22717C, 10);
                m6758d = C11888u.m6758d(m14093t);
                m21930c = C6759j.m21930c(m6758d, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
                for (Object obj : m22717C) {
                    C11638f name = ((InterfaceC11917e1) obj).getName();
                    C9612q.m13918g(name, "it.name");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$b$j */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6463j extends AbstractC9614s implements Function0<Set<? extends C11638f>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC6451h f18146k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6463j(AbstractC6451h abstractC6451h) {
                super(0);
                C6453b.this = r1;
                this.f18146k = abstractC6451h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Set<C11638f> invoke() {
                Set<C11638f> m13999l;
                C6453b c6453b = C6453b.this;
                List<InterfaceC12210q> list = c6453b.f18122b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC6451h abstractC6451h = c6453b.f18134n;
                for (InterfaceC12210q interfaceC12210q : list) {
                    linkedHashSet.add(C5967x.m24061b(abstractC6451h.m22724p().m24097g(), ((C9425n) interfaceC12210q).m15152d0()));
                }
                m13999l = C9561x.m13999l(linkedHashSet, this.f18146k.mo22659u());
                return m13999l;
            }
        }

        public C6453b(AbstractC6451h abstractC6451h, List<C9412i> functionList, List<C9425n> propertyList, List<C9447r> typeAliasList) {
            C9612q.m13917h(functionList, "functionList");
            C9612q.m13917h(propertyList, "propertyList");
            C9612q.m13917h(typeAliasList, "typeAliasList");
            this.f18134n = abstractC6451h;
            this.f18121a = functionList;
            this.f18122b = propertyList;
            this.f18123c = abstractC6451h.m22724p().m24101c().m24125g().mo24107c() ? typeAliasList : C9545j.m14104i();
            this.f18124d = abstractC6451h.m22724p().m24096h().mo21867c(new C6457d());
            this.f18125e = abstractC6451h.m22724p().m24096h().mo21867c(new C6458e());
            this.f18126f = abstractC6451h.m22724p().m24096h().mo21867c(new C6456c());
            this.f18127g = abstractC6451h.m22724p().m24096h().mo21867c(new C6454a());
            this.f18128h = abstractC6451h.m22724p().m24096h().mo21867c(new C6455b());
            this.f18129i = abstractC6451h.m22724p().m24096h().mo21867c(new C6462i());
            this.f18130j = abstractC6451h.m22724p().m24096h().mo21867c(new C6460g());
            this.f18131k = abstractC6451h.m22724p().m24096h().mo21867c(new C6461h());
            this.f18132l = abstractC6451h.m22724p().m24096h().mo21867c(new C6459f(abstractC6451h));
            this.f18133m = abstractC6451h.m22724p().m24096h().mo21867c(new C6463j(abstractC6451h));
        }

        /* renamed from: A */
        public final List<InterfaceC12005z0> m22719A() {
            return (List) C6820m.m21871a(this.f18127g, this, f18120o[3]);
        }

        /* renamed from: B */
        public final List<InterfaceC11989u0> m22718B() {
            return (List) C6820m.m21871a(this.f18128h, this, f18120o[4]);
        }

        /* renamed from: C */
        public final List<InterfaceC11917e1> m22717C() {
            return (List) C6820m.m21871a(this.f18126f, this, f18120o[2]);
        }

        /* renamed from: D */
        public final List<InterfaceC12005z0> m22716D() {
            return (List) C6820m.m21871a(this.f18124d, this, f18120o[0]);
        }

        /* renamed from: E */
        public final List<InterfaceC11989u0> m22715E() {
            return (List) C6820m.m21871a(this.f18125e, this, f18120o[1]);
        }

        /* renamed from: F */
        private final Map<C11638f, Collection<InterfaceC12005z0>> m22714F() {
            return (Map) C6820m.m21871a(this.f18130j, this, f18120o[6]);
        }

        /* renamed from: G */
        private final Map<C11638f, Collection<InterfaceC11989u0>> m22713G() {
            return (Map) C6820m.m21871a(this.f18131k, this, f18120o[7]);
        }

        /* renamed from: H */
        private final Map<C11638f, InterfaceC11917e1> m22712H() {
            return (Map) C6820m.m21871a(this.f18129i, this, f18120o[5]);
        }

        /* renamed from: t */
        public final List<InterfaceC12005z0> m22699t() {
            Set<C11638f> mo22660t = this.f18134n.mo22660t();
            ArrayList arrayList = new ArrayList();
            for (C11638f c11638f : mo22660t) {
                C9550o.m14085y(arrayList, m22696w(c11638f));
            }
            return arrayList;
        }

        /* renamed from: u */
        public final List<InterfaceC11989u0> m22698u() {
            Set<C11638f> mo22659u = this.f18134n.mo22659u();
            ArrayList arrayList = new ArrayList();
            for (C11638f c11638f : mo22659u) {
                C9550o.m14085y(arrayList, m22695x(c11638f));
            }
            return arrayList;
        }

        /* renamed from: v */
        public final List<InterfaceC12005z0> m22697v() {
            List<C9412i> list = this.f18121a;
            AbstractC6451h abstractC6451h = this.f18134n;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC12210q interfaceC12210q : list) {
                InterfaceC12005z0 m24072j = abstractC6451h.m22724p().m24098f().m24072j((C9412i) interfaceC12210q);
                if (!abstractC6451h.mo22720x(m24072j)) {
                    m24072j = null;
                }
                if (m24072j != null) {
                    arrayList.add(m24072j);
                }
            }
            return arrayList;
        }

        /* renamed from: w */
        private final List<InterfaceC12005z0> m22696w(C11638f c11638f) {
            List<InterfaceC12005z0> m22716D = m22716D();
            AbstractC6451h abstractC6451h = this.f18134n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : m22716D) {
                if (C9612q.m13922c(((InterfaceC11947m) obj).getName(), c11638f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC6451h.mo22728k(c11638f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: x */
        private final List<InterfaceC11989u0> m22695x(C11638f c11638f) {
            List<InterfaceC11989u0> m22715E = m22715E();
            AbstractC6451h abstractC6451h = this.f18134n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : m22715E) {
                if (C9612q.m13922c(((InterfaceC11947m) obj).getName(), c11638f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC6451h.mo22727l(c11638f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: y */
        public final List<InterfaceC11989u0> m22694y() {
            List<C9425n> list = this.f18122b;
            AbstractC6451h abstractC6451h = this.f18134n;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC12210q interfaceC12210q : list) {
                InterfaceC11989u0 m24070l = abstractC6451h.m22724p().m24098f().m24070l((C9425n) interfaceC12210q);
                if (m24070l != null) {
                    arrayList.add(m24070l);
                }
            }
            return arrayList;
        }

        /* renamed from: z */
        public final List<InterfaceC11917e1> m22693z() {
            List<C9447r> list = this.f18123c;
            AbstractC6451h abstractC6451h = this.f18134n;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC12210q interfaceC12210q : list) {
                InterfaceC11917e1 m24069m = abstractC6451h.m22724p().m24098f().m24069m((C9447r) interfaceC12210q);
                if (m24069m != null) {
                    arrayList.add(m24069m);
                }
            }
            return arrayList;
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: a */
        public Collection<InterfaceC12005z0> mo22687a(C11638f name, InterfaceC14020b location) {
            List m14104i;
            List m14104i2;
            C9612q.m13917h(name, "name");
            C9612q.m13917h(location, "location");
            if (!mo22686b().contains(name)) {
                m14104i2 = C9545j.m14104i();
                return m14104i2;
            }
            Collection<InterfaceC12005z0> collection = m22714F().get(name);
            if (collection == null) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            return collection;
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: b */
        public Set<C11638f> mo22686b() {
            return (Set) C6820m.m21871a(this.f18132l, this, f18120o[8]);
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: c */
        public Collection<InterfaceC11989u0> mo22685c(C11638f name, InterfaceC14020b location) {
            List m14104i;
            List m14104i2;
            C9612q.m13917h(name, "name");
            C9612q.m13917h(location, "location");
            if (!mo22684d().contains(name)) {
                m14104i2 = C9545j.m14104i();
                return m14104i2;
            }
            Collection<InterfaceC11989u0> collection = m22713G().get(name);
            if (collection == null) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            return collection;
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: d */
        public Set<C11638f> mo22684d() {
            return (Set) C6820m.m21871a(this.f18133m, this, f18120o[9]);
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: e */
        public Set<C11638f> mo22683e() {
            List<C9447r> list = this.f18123c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC6451h abstractC6451h = this.f18134n;
            for (InterfaceC12210q interfaceC12210q : list) {
                linkedHashSet.add(C5967x.m24061b(abstractC6451h.m22724p().m24097g(), ((C9447r) interfaceC12210q).m14904X()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: f */
        public void mo22682f(Collection<InterfaceC11947m> result, C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter, InterfaceC14020b location) {
            C9612q.m13917h(result, "result");
            C9612q.m13917h(kindFilter, "kindFilter");
            C9612q.m13917h(nameFilter, "nameFilter");
            C9612q.m13917h(location, "location");
            if (kindFilter.m41005a(C0185d.f608c.m40983i())) {
                for (Object obj : m22718B()) {
                    C11638f name = ((InterfaceC11989u0) obj).getName();
                    C9612q.m13918g(name, "it.name");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.m41005a(C0185d.f608c.m40988d())) {
                for (Object obj2 : m22719A()) {
                    C11638f name2 = ((InterfaceC12005z0) obj2).getName();
                    C9612q.m13918g(name2, "it.name");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: g */
        public InterfaceC11917e1 mo22681g(C11638f name) {
            C9612q.m13917h(name, "name");
            return m22712H().get(name);
        }
    }

    /* renamed from: fi.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C6464c implements InterfaceC6452a {

        /* renamed from: j */
        static final /* synthetic */ KProperty<Object>[] f18147j = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6464c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6464c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a */
        private final Map<C11638f, byte[]> f18148a;

        /* renamed from: b */
        private final Map<C11638f, byte[]> f18149b;

        /* renamed from: c */
        private final Map<C11638f, byte[]> f18150c;

        /* renamed from: d */
        private final InterfaceC6813g<C11638f, Collection<InterfaceC12005z0>> f18151d;

        /* renamed from: e */
        private final InterfaceC6813g<C11638f, Collection<InterfaceC11989u0>> f18152e;

        /* renamed from: f */
        private final InterfaceC6814h<C11638f, InterfaceC11917e1> f18153f;

        /* renamed from: g */
        private final InterfaceC6815i f18154g;

        /* renamed from: h */
        private final InterfaceC6815i f18155h;

        /* renamed from: i */
        final /* synthetic */ AbstractC6451h f18156i;

        /* renamed from: fi.h$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6465a extends AbstractC9614s implements Function0 {

            /* renamed from: j */
            final /* synthetic */ InterfaceC12213s f18157j;

            /* renamed from: k */
            final /* synthetic */ ByteArrayInputStream f18158k;

            /* renamed from: l */
            final /* synthetic */ AbstractC6451h f18159l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6465a(InterfaceC12213s interfaceC12213s, ByteArrayInputStream byteArrayInputStream, AbstractC6451h abstractC6451h) {
                super(0);
                this.f18157j = interfaceC12213s;
                this.f18158k = byteArrayInputStream;
                this.f18159l = abstractC6451h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC12210q invoke() {
                return (InterfaceC12210q) this.f18157j.mo5760a(this.f18158k, this.f18159l.m22724p().m24101c().m24122j());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6466b extends AbstractC9614s implements Function0<Set<? extends C11638f>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC6451h f18161k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6466b(AbstractC6451h abstractC6451h) {
                super(0);
                C6464c.this = r1;
                this.f18161k = abstractC6451h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Set<C11638f> invoke() {
                Set<C11638f> m13999l;
                m13999l = C9561x.m13999l(C6464c.this.f18148a.keySet(), this.f18161k.mo22660t());
                return m13999l;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$c$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6467c extends AbstractC9614s implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6467c() {
                super(1);
                C6464c.this = r1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Collection<InterfaceC12005z0> invoke(C11638f it) {
                C9612q.m13917h(it, "it");
                return C6464c.this.m22675m(it);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$c$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6468d extends AbstractC9614s implements Function1<C11638f, Collection<? extends InterfaceC11989u0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6468d() {
                super(1);
                C6464c.this = r1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Collection<InterfaceC11989u0> invoke(C11638f it) {
                C9612q.m13917h(it, "it");
                return C6464c.this.m22674n(it);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$c$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6469e extends AbstractC9614s implements Function1<C11638f, InterfaceC11917e1> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6469e() {
                super(1);
                C6464c.this = r1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC11917e1 invoke(C11638f it) {
                C9612q.m13917h(it, "it");
                return C6464c.this.m22673o(it);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.h$c$f */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C6470f extends AbstractC9614s implements Function0<Set<? extends C11638f>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC6451h f18166k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6470f(AbstractC6451h abstractC6451h) {
                super(0);
                C6464c.this = r1;
                this.f18166k = abstractC6451h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Set<C11638f> invoke() {
                Set<C11638f> m13999l;
                m13999l = C9561x.m13999l(C6464c.this.f18149b.keySet(), this.f18166k.mo22659u());
                return m13999l;
            }
        }

        public C6464c(AbstractC6451h abstractC6451h, List<C9412i> functionList, List<C9425n> propertyList, List<C9447r> typeAliasList) {
            Map<C11638f, byte[]> m6754h;
            C9612q.m13917h(functionList, "functionList");
            C9612q.m13917h(propertyList, "propertyList");
            C9612q.m13917h(typeAliasList, "typeAliasList");
            this.f18156i = abstractC6451h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                C11638f m24061b = C5967x.m24061b(abstractC6451h.m22724p().m24097g(), ((C9412i) ((InterfaceC12210q) obj)).m15315e0());
                Object obj2 = linkedHashMap.get(m24061b);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(m24061b, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f18148a = m22672p(linkedHashMap);
            AbstractC6451h abstractC6451h2 = this.f18156i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : propertyList) {
                C11638f m24061b2 = C5967x.m24061b(abstractC6451h2.m22724p().m24097g(), ((C9425n) ((InterfaceC12210q) obj3)).m15152d0());
                Object obj4 = linkedHashMap2.get(m24061b2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(m24061b2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f18149b = m22672p(linkedHashMap2);
            if (this.f18156i.m22724p().m24101c().m24125g().mo24107c()) {
                AbstractC6451h abstractC6451h3 = this.f18156i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : typeAliasList) {
                    C11638f m24061b3 = C5967x.m24061b(abstractC6451h3.m22724p().m24097g(), ((C9447r) ((InterfaceC12210q) obj5)).m14904X());
                    Object obj6 = linkedHashMap3.get(m24061b3);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(m24061b3, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                m6754h = m22672p(linkedHashMap3);
            } else {
                m6754h = C11889v.m6754h();
            }
            this.f18150c = m6754h;
            this.f18151d = this.f18156i.m22724p().m24096h().mo21861i(new C6467c());
            this.f18152e = this.f18156i.m22724p().m24096h().mo21861i(new C6468d());
            this.f18153f = this.f18156i.m22724p().m24096h().mo21863g(new C6469e());
            this.f18154g = this.f18156i.m22724p().m24096h().mo21867c(new C6466b(this.f18156i));
            this.f18155h = this.f18156i.m22724p().m24096h().mo21867c(new C6470f(this.f18156i));
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0027, code lost:
            if (r0 != null) goto L5;
         */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<p305qg.InterfaceC12005z0> m22675m(ph.C11638f r7) {
            /*
                r6 = this;
                java.util.Map<ph.f, byte[]> r0 = r6.f18148a
                rh.s<kh.i> r1 = kh.C9412i.f24726F
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C9612q.m13918g(r1, r2)
                fi.h r2 = r6.f18156i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                fi.h r3 = r6.f18156i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                fi.h$c$a r0 = new fi.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.Sequence r0 = si.C12541j.m4898i(r0)
                java.util.List r0 = si.C12541j.m4906E(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = kotlin.collections.C9543h.m14145i()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L66
                java.lang.Object r3 = r0.next()
                kh.i r3 = (kh.C9412i) r3
                di.m r4 = r2.m22724p()
                di.w r4 = r4.m24098f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C9612q.m13918g(r3, r5)
                qg.z0 r3 = r4.m24072j(r3)
                boolean r4 = r2.mo22720x(r3)
                if (r4 == 0) goto L5f
                goto L60
            L5f:
                r3 = 0
            L60:
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L66:
                r2.mo22728k(r7, r1)
                java.util.List r7 = p327ri.C12242a.m5673c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fi.AbstractC6451h.C6464c.m22675m(ph.f):java.util.Collection");
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0027, code lost:
            if (r0 != null) goto L5;
         */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<p305qg.InterfaceC11989u0> m22674n(ph.C11638f r7) {
            /*
                r6 = this;
                java.util.Map<ph.f, byte[]> r0 = r6.f18149b
                rh.s<kh.n> r1 = kh.C9425n.f24808F
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C9612q.m13918g(r1, r2)
                fi.h r2 = r6.f18156i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                fi.h r3 = r6.f18156i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                fi.h$c$a r0 = new fi.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.Sequence r0 = si.C12541j.m4898i(r0)
                java.util.List r0 = si.C12541j.m4906E(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = kotlin.collections.C9543h.m14145i()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5e
                java.lang.Object r3 = r0.next()
                kh.n r3 = (kh.C9425n) r3
                di.m r4 = r2.m22724p()
                di.w r4 = r4.m24098f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C9612q.m13918g(r3, r5)
                qg.u0 r3 = r4.m24070l(r3)
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L5e:
                r2.mo22727l(r7, r1)
                java.util.List r7 = p327ri.C12242a.m5673c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fi.AbstractC6451h.C6464c.m22674n(ph.f):java.util.Collection");
        }

        /* renamed from: o */
        public final InterfaceC11917e1 m22673o(C11638f c11638f) {
            C9447r m14887o0;
            byte[] bArr = this.f18150c.get(c11638f);
            if (bArr == null || (m14887o0 = C9447r.m14887o0(new ByteArrayInputStream(bArr), this.f18156i.m22724p().m24101c().m24122j())) == null) {
                return null;
            }
            return this.f18156i.m22724p().m24098f().m24069m(m14887o0);
        }

        /* renamed from: p */
        private final Map<C11638f, byte[]> m22672p(Map<C11638f, ? extends Collection<? extends AbstractC12170a>> map) {
            int m6758d;
            int m14093t;
            m6758d = C11888u.m6758d(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(m6758d);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<AbstractC12170a> iterable = (Iterable) entry.getValue();
                m14093t = C9546k.m14093t(iterable, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                for (AbstractC12170a abstractC12170a : iterable) {
                    abstractC12170a.m6019i(byteArrayOutputStream);
                    arrayList.add(Unit.f25302a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: a */
        public Collection<InterfaceC12005z0> mo22687a(C11638f name, InterfaceC14020b location) {
            List m14104i;
            C9612q.m13917h(name, "name");
            C9612q.m13917h(location, "location");
            if (!mo22686b().contains(name)) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            return this.f18151d.invoke(name);
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: b */
        public Set<C11638f> mo22686b() {
            return (Set) C6820m.m21871a(this.f18154g, this, f18147j[0]);
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: c */
        public Collection<InterfaceC11989u0> mo22685c(C11638f name, InterfaceC14020b location) {
            List m14104i;
            C9612q.m13917h(name, "name");
            C9612q.m13917h(location, "location");
            if (!mo22684d().contains(name)) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            return this.f18152e.invoke(name);
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: d */
        public Set<C11638f> mo22684d() {
            return (Set) C6820m.m21871a(this.f18155h, this, f18147j[1]);
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: e */
        public Set<C11638f> mo22683e() {
            return this.f18150c.keySet();
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: f */
        public void mo22682f(Collection<InterfaceC11947m> result, C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter, InterfaceC14020b location) {
            C9612q.m13917h(result, "result");
            C9612q.m13917h(kindFilter, "kindFilter");
            C9612q.m13917h(nameFilter, "nameFilter");
            C9612q.m13917h(location, "location");
            if (kindFilter.m41005a(C0185d.f608c.m40983i())) {
                Set<C11638f> mo22684d = mo22684d();
                ArrayList arrayList = new ArrayList();
                for (C11638f c11638f : mo22684d) {
                    if (nameFilter.invoke(c11638f).booleanValue()) {
                        arrayList.addAll(mo22685c(c11638f, location));
                    }
                }
                C12763h INSTANCE = C12763h.f33111j;
                C9612q.m13918g(INSTANCE, "INSTANCE");
                C9549n.m14089x(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.m41005a(C0185d.f608c.m40988d())) {
                Set<C11638f> mo22686b = mo22686b();
                ArrayList arrayList2 = new ArrayList();
                for (C11638f c11638f2 : mo22686b) {
                    if (nameFilter.invoke(c11638f2).booleanValue()) {
                        arrayList2.addAll(mo22687a(c11638f2, location));
                    }
                }
                C12763h INSTANCE2 = C12763h.f33111j;
                C9612q.m13918g(INSTANCE2, "INSTANCE");
                C9549n.m14089x(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // fi.AbstractC6451h.InterfaceC6452a
        /* renamed from: g */
        public InterfaceC11917e1 mo22681g(C11638f name) {
            C9612q.m13917h(name, "name");
            return this.f18153f.invoke(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.h$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6471d extends AbstractC9614s implements Function0<Set<? extends C11638f>> {

        /* renamed from: j */
        final /* synthetic */ Function0<Collection<C11638f>> f18167j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6471d(Function0<? extends Collection<C11638f>> function0) {
            super(0);
            this.f18167j = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<C11638f> invoke() {
            Set<C11638f> m14071G0;
            m14071G0 = C9553r.m14071G0(this.f18167j.invoke());
            return m14071G0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.h$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6472e extends AbstractC9614s implements Function0<Set<? extends C11638f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6472e() {
            super(0);
            AbstractC6451h.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<C11638f> invoke() {
            Set m13999l;
            Set<C11638f> m13999l2;
            Set<C11638f> mo22661s = AbstractC6451h.this.mo22661s();
            if (mo22661s == null) {
                return null;
            }
            m13999l = C9561x.m13999l(AbstractC6451h.this.m22723q(), AbstractC6451h.this.f18117c.mo22683e());
            m13999l2 = C9561x.m13999l(m13999l, mo22661s);
            return m13999l2;
        }
    }

    public AbstractC6451h(C5942m c, List<C9412i> functionList, List<C9425n> propertyList, List<C9447r> typeAliasList, Function0<? extends Collection<C11638f>> classNames) {
        C9612q.m13917h(c, "c");
        C9612q.m13917h(functionList, "functionList");
        C9612q.m13917h(propertyList, "propertyList");
        C9612q.m13917h(typeAliasList, "typeAliasList");
        C9612q.m13917h(classNames, "classNames");
        this.f18116b = c;
        this.f18117c = m22726n(functionList, propertyList, typeAliasList);
        this.f18118d = c.m24096h().mo21867c(new C6471d(classNames));
        this.f18119e = c.m24096h().mo21865e(new C6472e());
    }

    /* renamed from: n */
    private final InterfaceC6452a m22726n(List<C9412i> list, List<C9425n> list2, List<C9447r> list3) {
        if (this.f18116b.m24101c().m24125g().mo24109a()) {
            return new C6453b(this, list, list2, list3);
        }
        return new C6464c(this, list, list2, list3);
    }

    /* renamed from: o */
    private final InterfaceC11914e m22725o(C11638f c11638f) {
        return this.f18116b.m24101c().m24130b(mo22662m(c11638f));
    }

    /* renamed from: r */
    private final Set<C11638f> m22722r() {
        return (Set) C6820m.m21870b(this.f18119e, this, f18115f[1]);
    }

    /* renamed from: v */
    private final InterfaceC11917e1 m22721v(C11638f c11638f) {
        return this.f18117c.mo22681g(c11638f);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return this.f18117c.mo22687a(name, location);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        return this.f18117c.mo22686b();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return this.f18117c.mo22685c(name, location);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        return this.f18117c.mo22684d();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        return m22722r();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        if (mo22658w(name)) {
            return m22725o(name);
        }
        if (this.f18117c.mo22683e().contains(name)) {
            return m22721v(name);
        }
        return null;
    }

    /* renamed from: i */
    protected abstract void mo22663i(Collection<InterfaceC11947m> collection, Function1<? super C11638f, Boolean> function1);

    /* renamed from: j */
    public final Collection<InterfaceC11947m> m22729j(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter, InterfaceC14020b location) {
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        C9612q.m13917h(location, "location");
        ArrayList arrayList = new ArrayList(0);
        C0185d.C0186a c0186a = C0185d.f608c;
        if (kindFilter.m41005a(c0186a.m40985g())) {
            mo22663i(arrayList, nameFilter);
        }
        this.f18117c.mo22682f(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.m41005a(c0186a.m40989c())) {
            for (C11638f c11638f : m22723q()) {
                if (nameFilter.invoke(c11638f).booleanValue()) {
                    C12242a.m5675a(arrayList, m22725o(c11638f));
                }
            }
        }
        if (kindFilter.m41005a(C0185d.f608c.m40984h())) {
            for (C11638f c11638f2 : this.f18117c.mo22683e()) {
                if (nameFilter.invoke(c11638f2).booleanValue()) {
                    C12242a.m5675a(arrayList, this.f18117c.mo22681g(c11638f2));
                }
            }
        }
        return C12242a.m5673c(arrayList);
    }

    /* renamed from: k */
    protected void mo22728k(C11638f name, List<InterfaceC12005z0> functions) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(functions, "functions");
    }

    /* renamed from: l */
    protected void mo22727l(C11638f name, List<InterfaceC11989u0> descriptors) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(descriptors, "descriptors");
    }

    /* renamed from: m */
    protected abstract C11632b mo22662m(C11638f c11638f);

    /* renamed from: p */
    public final C5942m m22724p() {
        return this.f18116b;
    }

    /* renamed from: q */
    public final Set<C11638f> m22723q() {
        return (Set) C6820m.m21871a(this.f18118d, this, f18115f[0]);
    }

    /* renamed from: s */
    protected abstract Set<C11638f> mo22661s();

    /* renamed from: t */
    protected abstract Set<C11638f> mo22660t();

    /* renamed from: u */
    protected abstract Set<C11638f> mo22659u();

    /* renamed from: w */
    public boolean mo22658w(C11638f name) {
        C9612q.m13917h(name, "name");
        return m22723q().contains(name);
    }

    /* renamed from: x */
    protected boolean mo22720x(InterfaceC12005z0 function) {
        C9612q.m13917h(function, "function");
        return true;
    }
}