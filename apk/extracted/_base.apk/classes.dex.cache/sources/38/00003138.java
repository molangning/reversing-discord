package p070di;

import java.util.Set;
import kotlin.collections.C9559v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.C10884k;
import p305qg.InterfaceC11914e;
import ph.C11632b;

/* renamed from: di.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5932i {

    /* renamed from: c */
    public static final C5934b f16902c = new C5934b(null);

    /* renamed from: d */
    private static final Set<C11632b> f16903d;

    /* renamed from: a */
    private final C5939k f16904a;

    /* renamed from: b */
    private final Function1<C5933a, InterfaceC11914e> f16905b;

    /* renamed from: di.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5933a {

        /* renamed from: a */
        private final C11632b f16906a;

        /* renamed from: b */
        private final C5930g f16907b;

        public C5933a(C11632b classId, C5930g c5930g) {
            C9612q.m13917h(classId, "classId");
            this.f16906a = classId;
            this.f16907b = c5930g;
        }

        /* renamed from: a */
        public final C5930g m24137a() {
            return this.f16907b;
        }

        /* renamed from: b */
        public final C11632b m24136b() {
            return this.f16906a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5933a) && C9612q.m13922c(this.f16906a, ((C5933a) obj).f16906a);
        }

        public int hashCode() {
            return this.f16906a.hashCode();
        }
    }

    /* renamed from: di.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5934b {
        private C5934b() {
        }

        public /* synthetic */ C5934b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Set<C11632b> m24135a() {
            return C5932i.f16903d;
        }
    }

    /* renamed from: di.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5935c extends AbstractC9614s implements Function1<C5933a, InterfaceC11914e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5935c() {
            super(1);
            C5932i.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11914e invoke(C5933a key) {
            C9612q.m13917h(key, "key");
            return C5932i.this.m24140c(key);
        }
    }

    static {
        Set<C11632b> m14008c;
        m14008c = C9559v.m14008c(C11632b.m7460m(C10884k.C10885a.f28476d.m7437l()));
        f16903d = m14008c;
    }

    public C5932i(C5939k components) {
        C9612q.m13917h(components, "components");
        this.f16904a = components;
        this.f16905b = components.m24111u().mo21863g(new C5935c());
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x00b8 A[EDGE_INSN: B:155:0x00b8->B:147:0x00b8 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p305qg.InterfaceC11914e m24140c(p070di.C5932i.C5933a r13) {
        /*
            r12 = this;
            ph.b r0 = r13.m24136b()
            di.k r1 = r12.f16904a
            java.lang.Iterable r1 = r1.m24121k()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            sg.b r2 = (sg.InterfaceC12473b) r2
            qg.e r2 = r2.mo5200a(r0)
            if (r2 == 0) goto Le
            return r2
        L21:
            java.util.Set<ph.b> r1 = p070di.C5932i.f16903d
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L2b
            return r2
        L2b:
            di.g r13 = r13.m24137a()
            if (r13 != 0) goto L3e
            di.k r13 = r12.f16904a
            di.h r13 = r13.m24127e()
            di.g r13 = r13.mo20442a(r0)
            if (r13 != 0) goto L3e
            return r2
        L3e:
            mh.c r1 = r13.m24146a()
            kh.c r10 = r13.m24145b()
            mh.a r11 = r13.m24144c()
            qg.a1 r13 = r13.m24143d()
            ph.b r3 = r0.m7466g()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L79
            r5 = 2
            qg.e r3 = m24138e(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof fi.C6429d
            if (r5 == 0) goto L62
            fi.d r3 = (fi.C6429d) r3
            goto L63
        L62:
            r3 = r2
        L63:
            if (r3 != 0) goto L66
            return r2
        L66:
            ph.f r0 = r0.m7463j()
            kotlin.jvm.internal.C9612q.m13918g(r0, r4)
            boolean r0 = r3.m22754g1(r0)
            if (r0 != 0) goto L74
            return r2
        L74:
            di.m r0 = r3.m22760a1()
            goto Le4
        L79:
            di.k r3 = r12.f16904a
            qg.m0 r3 = r3.m24114r()
            ph.c r5 = r0.m7465h()
            java.lang.String r6 = "classId.packageFqName"
            kotlin.jvm.internal.C9612q.m13918g(r5, r6)
            java.util.List r3 = p305qg.C11965o0.m6685c(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L90:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lb7
            java.lang.Object r5 = r3.next()
            r6 = r5
            qg.l0 r6 = (p305qg.InterfaceC11945l0) r6
            boolean r7 = r6 instanceof p070di.AbstractC5946p
            if (r7 == 0) goto Lb3
            di.p r6 = (p070di.AbstractC5946p) r6
            ph.f r7 = r0.m7463j()
            kotlin.jvm.internal.C9612q.m13918g(r7, r4)
            boolean r6 = r6.m24090K0(r7)
            if (r6 == 0) goto Lb1
            goto Lb3
        Lb1:
            r6 = 0
            goto Lb4
        Lb3:
            r6 = 1
        Lb4:
            if (r6 == 0) goto L90
            goto Lb8
        Lb7:
            r5 = r2
        Lb8:
            r4 = r5
            qg.l0 r4 = (p305qg.InterfaceC11945l0) r4
            if (r4 != 0) goto Lbe
            return r2
        Lbe:
            di.k r3 = r12.f16904a
            mh.g r6 = new mh.g
            kh.t r0 = r10.m15582i1()
            java.lang.String r2 = "classProto.typeTable"
            kotlin.jvm.internal.C9612q.m13918g(r0, r2)
            r6.<init>(r0)
            mh.h$a r0 = mh.C10469h.f27350b
            kh.w r2 = r10.m15578k1()
            java.lang.String r5 = "classProto.versionRequirementTable"
            kotlin.jvm.internal.C9612q.m13918g(r2, r5)
            mh.h r7 = r0.m11461a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            di.m r0 = r3.m24131a(r4, r5, r6, r7, r8, r9)
        Le4:
            r4 = r0
            fi.d r0 = new fi.d
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p070di.C5932i.m24140c(di.i$a):qg.e");
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC11914e m24138e(C5932i c5932i, C11632b c11632b, C5930g c5930g, int i, Object obj) {
        if ((i & 2) != 0) {
            c5930g = null;
        }
        return c5932i.m24139d(c11632b, c5930g);
    }

    /* renamed from: d */
    public final InterfaceC11914e m24139d(C11632b classId, C5930g c5930g) {
        C9612q.m13917h(classId, "classId");
        return this.f16905b.invoke(new C5933a(classId, c5930g));
    }
}