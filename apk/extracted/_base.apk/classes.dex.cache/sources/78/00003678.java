package p142hi;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hi.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7272h1 extends AbstractC7297n1 {

    /* renamed from: c */
    public static final C7273a f19700c = new C7273a(null);

    /* renamed from: hi.h1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7273a {

        /* renamed from: hi.h1$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7274a extends AbstractC7272h1 {

            /* renamed from: d */
            final /* synthetic */ Map<InterfaceC7265g1, InterfaceC7288k1> f19701d;

            /* renamed from: e */
            final /* synthetic */ boolean f19702e;

            /* JADX WARN: Multi-variable type inference failed */
            C7274a(Map<InterfaceC7265g1, ? extends InterfaceC7288k1> map, boolean z) {
                this.f19701d = map;
                this.f19702e = z;
            }

            @Override // p142hi.AbstractC7297n1
            /* renamed from: a */
            public boolean mo20961a() {
                return this.f19702e;
            }

            @Override // p142hi.AbstractC7297n1
            /* renamed from: f */
            public boolean mo20959f() {
                return this.f19701d.isEmpty();
            }

            @Override // p142hi.AbstractC7272h1
            /* renamed from: k */
            public InterfaceC7288k1 mo9561k(InterfaceC7265g1 key) {
                C9612q.m13917h(key, "key");
                return this.f19701d.get(key);
            }
        }

        private C7273a() {
        }

        public /* synthetic */ C7273a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC7272h1 m21084e(C7273a c7273a, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return c7273a.m21085d(map, z);
        }

        /* renamed from: a */
        public final AbstractC7297n1 m21088a(AbstractC7264g0 kotlinType) {
            C9612q.m13917h(kotlinType, "kotlinType");
            return m21087b(kotlinType.mo3564N0(), kotlinType.mo3566L0());
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0021, code lost:
            if (r2.mo4466O() == true) goto L5;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p142hi.AbstractC7297n1 m21087b(p142hi.InterfaceC7265g1 r6, java.util.List<? extends p142hi.InterfaceC7288k1> r7) {
            /*
                r5 = this;
                java.lang.String r0 = "typeConstructor"
                kotlin.jvm.internal.C9612q.m13917h(r6, r0)
                java.lang.String r0 = "arguments"
                kotlin.jvm.internal.C9612q.m13917h(r7, r0)
                java.util.List r0 = r6.getParameters()
                java.lang.String r1 = "typeConstructor.parameters"
                kotlin.jvm.internal.C9612q.m13918g(r0, r1)
                java.lang.Object r2 = kotlin.collections.C9543h.m14146h0(r0)
                qg.f1 r2 = (p305qg.InterfaceC11920f1) r2
                r3 = 0
                if (r2 == 0) goto L24
                boolean r2 = r2.mo4466O()
                r4 = 1
                if (r2 != r4) goto L24
                goto L25
            L24:
                r4 = r3
            L25:
                if (r4 == 0) goto L60
                java.util.List r6 = r6.getParameters()
                kotlin.jvm.internal.C9612q.m13918g(r6, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.C9543h.m14124t(r6, r1)
                r0.<init>(r1)
                java.util.Iterator r6 = r6.iterator()
            L3d:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L51
                java.lang.Object r1 = r6.next()
                qg.f1 r1 = (p305qg.InterfaceC11920f1) r1
                hi.g1 r1 = r1.mo4173k()
                r0.add(r1)
                goto L3d
            L51:
                java.util.List r6 = kotlin.collections.C9543h.m14172J0(r0, r7)
                java.util.Map r6 = p304qf.C11886s.m6764r(r6)
                r7 = 2
                r0 = 0
                hi.h1 r6 = m21084e(r5, r6, r3, r7, r0)
                return r6
            L60:
                hi.e0 r6 = new hi.e0
                r6.<init>(r0, r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p142hi.AbstractC7272h1.C7273a.m21087b(hi.g1, java.util.List):hi.n1");
        }

        /* renamed from: c */
        public final AbstractC7272h1 m21086c(Map<InterfaceC7265g1, ? extends InterfaceC7288k1> map) {
            C9612q.m13917h(map, "map");
            return m21084e(this, map, false, 2, null);
        }

        /* renamed from: d */
        public final AbstractC7272h1 m21085d(Map<InterfaceC7265g1, ? extends InterfaceC7288k1> map, boolean z) {
            C9612q.m13917h(map, "map");
            return new C7274a(map, z);
        }
    }

    /* renamed from: i */
    public static final AbstractC7297n1 m21090i(InterfaceC7265g1 interfaceC7265g1, List<? extends InterfaceC7288k1> list) {
        return f19700c.m21087b(interfaceC7265g1, list);
    }

    /* renamed from: j */
    public static final AbstractC7272h1 m21089j(Map<InterfaceC7265g1, ? extends InterfaceC7288k1> map) {
        return f19700c.m21086c(map);
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: e */
    public InterfaceC7288k1 mo3539e(AbstractC7264g0 key) {
        C9612q.m13917h(key, "key");
        return mo9561k(key.mo3564N0());
    }

    /* renamed from: k */
    public abstract InterfaceC7288k1 mo9561k(InterfaceC7265g1 interfaceC7265g1);
}