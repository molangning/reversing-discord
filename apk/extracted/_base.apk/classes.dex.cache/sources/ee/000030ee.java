package p069dh;

import ai.C0185d;
import bh.C2299b;
import bh.C2301d;
import bh.C2302e;
import bh.C2306f;
import bh.C2308h;
import ch.C2537a;
import ch.C2545e;
import ch.C2548g;
import gg.C6759j;
import gh.InterfaceC6769f;
import gh.InterfaceC6770g;
import gh.InterfaceC6774k;
import gh.InterfaceC6777n;
import gh.InterfaceC6780q;
import gh.InterfaceC6781r;
import gh.InterfaceC6786w;
import gh.InterfaceC6787x;
import gh.InterfaceC6788y;
import gi.InterfaceC6814h;
import gi.InterfaceC6815i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.collections.C9561x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KDeclarationContainer;
import ng.AbstractC10870h;
import p013ah.C0158a;
import p013ah.InterfaceC0176j;
import p069dh.AbstractC5884j;
import p070di.InterfaceC5950r;
import p086eh.C6224a;
import p086eh.C6225b;
import p141hh.C7200l;
import p142hi.AbstractC7264g0;
import p142hi.C7320s1;
import p142hi.EnumC7317r1;
import p160ih.C7575w;
import p161ii.InterfaceC7587e;
import p304qf.C11888u;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import p325rg.InterfaceC12155g;
import p327ri.C12242a;
import p327ri.C12263f;
import p428xg.C13798a;
import p429xh.C13801c;
import p448yg.EnumC14023d;
import p448yg.InterfaceC14020b;
import p468zg.C14206a0;
import p468zg.C14208b0;
import p468zg.C14214e;
import p468zg.C14218f;
import p468zg.C14226h0;
import p468zg.C14230i;
import p468zg.C14232i0;
import p468zg.C14239j0;
import p468zg.C14252s;
import p468zg.C14256t;
import p468zg.InterfaceC14247p;
import ph.C11632b;
import ph.C11638f;
import tg.C12691d0;
import tg.C12697e0;
import tg.C12698f;
import tg.C12713l0;
import tg.C12719n;
import th.C12756d;
import th.C12758e;
import th.C12766k;

/* renamed from: dh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C5858g extends AbstractC5884j {

    /* renamed from: n */
    private final InterfaceC11914e f16757n;

    /* renamed from: o */
    private final InterfaceC6770g f16758o;

    /* renamed from: p */
    private final boolean f16759p;

    /* renamed from: q */
    private final InterfaceC6815i<List<InterfaceC11910d>> f16760q;

    /* renamed from: r */
    private final InterfaceC6815i<Set<C11638f>> f16761r;

    /* renamed from: s */
    private final InterfaceC6815i<Set<C11638f>> f16762s;

    /* renamed from: t */
    private final InterfaceC6815i<Map<C11638f, InterfaceC6777n>> f16763t;

    /* renamed from: u */
    private final InterfaceC6814h<C11638f, InterfaceC11914e> f16764u;

    /* renamed from: dh.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5859a extends AbstractC9614s implements Function1<InterfaceC6780q, Boolean> {

        /* renamed from: j */
        public static final C5859a f16765j = new C5859a();

        C5859a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC6780q it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(!it.mo2173g());
        }
    }

    /* renamed from: dh.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    /* synthetic */ class C5860b extends C9605m implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {
        C5860b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final Collection<InterfaceC12005z0> invoke(C11638f p0) {
            C9612q.m13917h(p0, "p0");
            return ((C5858g) this.receiver).m24331J0(p0);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C5858g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    /* renamed from: dh.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    /* synthetic */ class C5861c extends C9605m implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {
        C5861c(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final Collection<InterfaceC12005z0> invoke(C11638f p0) {
            C9612q.m13917h(p0, "p0");
            return ((C5858g) this.receiver).m24330K0(p0);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C5858g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    /* renamed from: dh.g$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5862d extends AbstractC9614s implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5862d() {
            super(1);
            C5858g.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Collection<InterfaceC12005z0> invoke(C11638f it) {
            C9612q.m13917h(it, "it");
            return C5858g.this.m24331J0(it);
        }
    }

    /* renamed from: dh.g$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5863e extends AbstractC9614s implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5863e() {
            super(1);
            C5858g.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Collection<InterfaceC12005z0> invoke(C11638f it) {
            C9612q.m13917h(it, "it");
            return C5858g.this.m24330K0(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.g$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5864f extends AbstractC9614s implements Function0<List<? extends InterfaceC11910d>> {

        /* renamed from: k */
        final /* synthetic */ C2548g f16769k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5864f(C2548g c2548g) {
            super(0);
            C5858g.this = r1;
            this.f16769k = c2548g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC11910d> invoke() {
            List<? extends InterfaceC11910d> m14075C0;
            ?? m14100m;
            Collection<InterfaceC6774k> mo2209l = C5858g.this.f16758o.mo2209l();
            ArrayList<InterfaceC11910d> arrayList = new ArrayList(mo2209l.size());
            for (InterfaceC6774k interfaceC6774k : mo2209l) {
                arrayList.add(C5858g.this.m24333H0(interfaceC6774k));
            }
            if (C5858g.this.f16758o.mo2204r()) {
                InterfaceC11910d m24309f0 = C5858g.this.m24309f0();
                boolean z = false;
                String m20385c = C7575w.m20385c(m24309f0, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    for (InterfaceC11910d interfaceC11910d : arrayList) {
                        if (C9612q.m13922c(C7575w.m20385c(interfaceC11910d, false, false, 2, null), m20385c)) {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    arrayList.add(m24309f0);
                    this.f16769k.m33014a().m33042h().mo41027b(C5858g.this.f16758o, m24309f0);
                }
            }
            C2548g c2548g = this.f16769k;
            c2548g.m33014a().m33027w().mo872b(c2548g, C5858g.this.mo24217C(), arrayList);
            C7200l m33032r = this.f16769k.m33014a().m33032r();
            C2548g c2548g2 = this.f16769k;
            C5858g c5858g = C5858g.this;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = arrayList;
            if (isEmpty) {
                m14100m = C9545j.m14100m(c5858g.m24310e0());
                arrayList2 = m14100m;
            }
            m14075C0 = C9553r.m14075C0(m33032r.m21279g(c2548g2, arrayList2));
            return m14075C0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.g$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5865g extends AbstractC9614s implements Function0<Map<C11638f, ? extends InterfaceC6777n>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5865g() {
            super(0);
            C5858g.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<C11638f, InterfaceC6777n> invoke() {
            int m14093t;
            int m6758d;
            int m21930c;
            Collection<InterfaceC6777n> mo2201x = C5858g.this.f16758o.mo2201x();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo2201x) {
                if (((InterfaceC6777n) obj).mo2181I()) {
                    arrayList.add(obj);
                }
            }
            m14093t = C9546k.m14093t(arrayList, 10);
            m6758d = C11888u.m6758d(m14093t);
            m21930c = C6759j.m21930c(m6758d, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((InterfaceC6777n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.g$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5866h extends AbstractC9614s implements Function0<Set<? extends C11638f>> {

        /* renamed from: j */
        final /* synthetic */ C2548g f16771j;

        /* renamed from: k */
        final /* synthetic */ C5858g f16772k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5866h(C2548g c2548g, C5858g c5858g) {
            super(0);
            this.f16771j = c2548g;
            this.f16772k = c5858g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<C11638f> invoke() {
            Set<C11638f> m14071G0;
            C2548g c2548g = this.f16771j;
            m14071G0 = C9553r.m14071G0(c2548g.m33014a().m33027w().mo867g(c2548g, this.f16772k.mo24217C()));
            return m14071G0;
        }
    }

    /* renamed from: dh.g$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5867i extends AbstractC9614s implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC12005z0 f16773j;

        /* renamed from: k */
        final /* synthetic */ C5858g f16774k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5867i(InterfaceC12005z0 interfaceC12005z0, C5858g c5858g) {
            super(1);
            this.f16773j = interfaceC12005z0;
            this.f16774k = c5858g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Collection<InterfaceC12005z0> invoke(C11638f accessorName) {
            List m14036n0;
            List m14109d;
            C9612q.m13917h(accessorName, "accessorName");
            if (C9612q.m13922c(this.f16773j.getName(), accessorName)) {
                m14109d = C9544i.m14109d(this.f16773j);
                return m14109d;
            }
            m14036n0 = C9553r.m14036n0(this.f16774k.m24331J0(accessorName), this.f16774k.m24330K0(accessorName));
            return m14036n0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.g$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5868j extends AbstractC9614s implements Function0<Set<? extends C11638f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5868j() {
            super(0);
            C5858g.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<C11638f> invoke() {
            Set<C11638f> m14071G0;
            m14071G0 = C9553r.m14071G0(C5858g.this.f16758o.mo2223A());
            return m14071G0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.g$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5869k extends AbstractC9614s implements Function1<C11638f, InterfaceC11914e> {

        /* renamed from: k */
        final /* synthetic */ C2548g f16777k;

        /* renamed from: dh.g$k$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C5870a extends AbstractC9614s implements Function0<Set<? extends C11638f>> {

            /* renamed from: j */
            final /* synthetic */ C5858g f16778j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5870a(C5858g c5858g) {
                super(0);
                this.f16778j = c5858g;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Set<C11638f> invoke() {
                Set<C11638f> m13999l;
                m13999l = C9561x.m13999l(this.f16778j.mo4361b(), this.f16778j.mo4359d());
                return m13999l;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5869k(C2548g c2548g) {
            super(1);
            C5858g.this = r1;
            this.f16777k = c2548g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11914e invoke(C11638f name) {
            List<InterfaceC11914e> m14110c;
            List m14112a;
            Object m14033q0;
            C9612q.m13917h(name, "name");
            if (((Set) C5858g.this.f16761r.invoke()).contains(name)) {
                InterfaceC14247p m33046d = this.f16777k.m33014a().m33046d();
                C11632b m1504k = C13801c.m1504k(C5858g.this.mo24217C());
                C9612q.m13920e(m1504k);
                C11632b m7469d = m1504k.m7469d(name);
                C9612q.m13918g(m7469d, "ownerDescriptor.classId!…createNestedClassId(name)");
                InterfaceC6770g mo324c = m33046d.mo324c(new InterfaceC14247p.C14248a(m7469d, null, C5858g.this.f16758o, 2, null));
                if (mo324c == null) {
                    return null;
                }
                C2548g c2548g = this.f16777k;
                C5850f c5850f = new C5850f(c2548g, C5858g.this.mo24217C(), mo324c, null, 8, null);
                c2548g.m33014a().m33045e().mo322a(c5850f);
                return c5850f;
            } else if (((Set) C5858g.this.f16762s.invoke()).contains(name)) {
                C2548g c2548g2 = this.f16777k;
                C5858g c5858g = C5858g.this;
                m14110c = C9544i.m14110c();
                c2548g2.m33014a().m33027w().mo871c(c2548g2, c5858g.mo24217C(), name, m14110c);
                m14112a = C9544i.m14112a(m14110c);
                int size = m14112a.size();
                if (size == 0) {
                    return null;
                }
                if (size == 1) {
                    m14033q0 = C9553r.m14033q0(m14112a);
                    return (InterfaceC11914e) m14033q0;
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + m14112a).toString());
            } else {
                InterfaceC6777n interfaceC6777n = (InterfaceC6777n) ((Map) C5858g.this.f16763t.invoke()).get(name);
                if (interfaceC6777n == null) {
                    return null;
                }
                return C12719n.m4363L0(this.f16777k.m33010e(), C5858g.this.mo24217C(), name, this.f16777k.m33010e().mo21867c(new C5870a(C5858g.this)), C2545e.m33019a(this.f16777k, interfaceC6777n), this.f16777k.m33014a().m33030t().mo2836a(interfaceC6777n));
            }
        }
    }

    public /* synthetic */ C5858g(C2548g c2548g, InterfaceC11914e interfaceC11914e, InterfaceC6770g interfaceC6770g, boolean z, C5858g c5858g, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2548g, interfaceC11914e, interfaceC6770g, z, (i & 16) != 0 ? null : c5858g);
    }

    /* renamed from: A0 */
    private final Set<InterfaceC11989u0> m24340A0(C11638f c11638f) {
        Set<InterfaceC11989u0> m14071G0;
        int m14093t;
        Collection<AbstractC7264g0> m24312c0 = m24312c0();
        ArrayList arrayList = new ArrayList();
        for (AbstractC7264g0 abstractC7264g0 : m24312c0) {
            Collection<? extends InterfaceC11989u0> mo4360c = abstractC7264g0.mo3553o().mo4360c(c11638f, EnumC14023d.WHEN_GET_SUPER_MEMBERS);
            m14093t = C9546k.m14093t(mo4360c, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (InterfaceC11989u0 interfaceC11989u0 : mo4360c) {
                arrayList2.add(interfaceC11989u0);
            }
            C9550o.m14085y(arrayList, arrayList2);
        }
        m14071G0 = C9553r.m14071G0(arrayList);
        return m14071G0;
    }

    /* renamed from: B0 */
    private final boolean m24339B0(InterfaceC12005z0 interfaceC12005z0, InterfaceC11998y interfaceC11998y) {
        String m20385c = C7575w.m20385c(interfaceC12005z0, false, false, 2, null);
        InterfaceC11998y mo4221a = interfaceC11998y.mo4221a();
        C9612q.m13918g(mo4221a, "builtinWithErasedParameters.original");
        if (!C9612q.m13922c(m20385c, C7575w.m20385c(mo4221a, false, false, 2, null)) || m24299p0(interfaceC12005z0, interfaceC11998y)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x006d, code lost:
        if (p468zg.C14206a0.m448d(r4) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0074 A[SYNTHETIC] */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m24338C0(p305qg.InterfaceC12005z0 r7) {
        /*
            r6 = this;
            ph.f r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            java.util.List r0 = p468zg.C14221f0.m399a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
        L19:
            r0 = r3
            goto L78
        L1b:
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            ph.f r1 = (ph.C11638f) r1
            java.util.Set r1 = r6.m24340A0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L3b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L3b
        L39:
            r1 = r3
            goto L75
        L3b:
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r1.next()
            qg.u0 r4 = (p305qg.InterfaceC11989u0) r4
            dh.g$i r5 = new dh.g$i
            r5.<init>(r7, r6)
            boolean r5 = r6.m24300o0(r4, r5)
            if (r5 == 0) goto L71
            boolean r4 = r4.mo4342L()
            if (r4 != 0) goto L6f
            ph.f r4 = r7.getName()
            java.lang.String r4 = r4.m7426b()
            java.lang.String r5 = "function.name.asString()"
            kotlin.jvm.internal.C9612q.m13918g(r4, r5)
            boolean r4 = p468zg.C14206a0.m448d(r4)
            if (r4 != 0) goto L71
        L6f:
            r4 = r2
            goto L72
        L71:
            r4 = r3
        L72:
            if (r4 == 0) goto L3f
            r1 = r2
        L75:
            if (r1 == 0) goto L1f
            r0 = r2
        L78:
            if (r0 == 0) goto L7b
            return r3
        L7b:
            boolean r0 = r6.m24298q0(r7)
            if (r0 != 0) goto L8e
            boolean r0 = r6.m24329L0(r7)
            if (r0 != 0) goto L8e
            boolean r7 = r6.m24296s0(r7)
            if (r7 != 0) goto L8e
            goto L8f
        L8e:
            r2 = r3
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p069dh.C5858g.m24338C0(qg.z0):boolean");
    }

    /* renamed from: D0 */
    private final InterfaceC12005z0 m24337D0(InterfaceC12005z0 interfaceC12005z0, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1, Collection<? extends InterfaceC12005z0> collection) {
        InterfaceC12005z0 m24307h0;
        InterfaceC11998y m404k = C14218f.m404k(interfaceC12005z0);
        if (m404k == null || (m24307h0 = m24307h0(m404k, function1)) == null) {
            return null;
        }
        if (!m24338C0(m24307h0)) {
            m24307h0 = null;
        }
        if (m24307h0 == null) {
            return null;
        }
        return m24308g0(m24307h0, m404k, collection);
    }

    /* renamed from: E0 */
    private final InterfaceC12005z0 m24336E0(InterfaceC12005z0 interfaceC12005z0, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1, C11638f c11638f, Collection<? extends InterfaceC12005z0> collection) {
        InterfaceC12005z0 interfaceC12005z02 = (InterfaceC12005z0) C14226h0.m378d(interfaceC12005z0);
        if (interfaceC12005z02 == null) {
            return null;
        }
        String m380b = C14226h0.m380b(interfaceC12005z02);
        C9612q.m13920e(m380b);
        C11638f m7422f = C11638f.m7422f(m380b);
        C9612q.m13918g(m7422f, "identifier(nameInJava)");
        for (InterfaceC12005z0 interfaceC12005z03 : function1.invoke(m7422f)) {
            InterfaceC12005z0 m24302m0 = m24302m0(interfaceC12005z03, c11638f);
            if (m24297r0(interfaceC12005z02, m24302m0)) {
                return m24308g0(m24302m0, interfaceC12005z02, collection);
            }
        }
        return null;
    }

    /* renamed from: F0 */
    private final InterfaceC12005z0 m24335F0(InterfaceC12005z0 interfaceC12005z0, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        if (!interfaceC12005z0.isSuspend()) {
            return null;
        }
        C11638f name = interfaceC12005z0.getName();
        C9612q.m13918g(name, "descriptor.name");
        for (InterfaceC12005z0 interfaceC12005z02 : function1.invoke(name)) {
            InterfaceC12005z0 m24301n0 = m24301n0(interfaceC12005z02);
            if (m24301n0 == null || !m24299p0(m24301n0, interfaceC12005z0)) {
                m24301n0 = null;
                continue;
            }
            if (m24301n0 != null) {
                return m24301n0;
            }
        }
        return null;
    }

    /* renamed from: H0 */
    public final C2299b m24333H0(InterfaceC6774k interfaceC6774k) {
        int m14093t;
        List<InterfaceC11920f1> m14036n0;
        InterfaceC11914e mo24217C = mo24217C();
        C2299b m33678t1 = C2299b.m33678t1(mo24217C, C2545e.m33019a(m24240w(), interfaceC6774k), false, m24240w().m33014a().m33030t().mo2836a(interfaceC6774k));
        C9612q.m13918g(m33678t1, "createJavaConstructor(\n …ce(constructor)\n        )");
        C2548g m33056e = C2537a.m33056e(m24240w(), m33678t1, interfaceC6774k, mo24217C.mo4168q().size());
        AbstractC5884j.C5886b m24250K = m24250K(m33056e, m33678t1, interfaceC6774k.mo2184i());
        List<InterfaceC11920f1> mo4168q = mo24217C.mo4168q();
        C9612q.m13918g(mo4168q, "classDescriptor.declaredTypeParameters");
        List<InterfaceC6788y> typeParameters = interfaceC6774k.getTypeParameters();
        m14093t = C9546k.m14093t(typeParameters, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC6788y interfaceC6788y : typeParameters) {
            InterfaceC11920f1 mo32999a = m33056e.m33009f().mo32999a(interfaceC6788y);
            C9612q.m13920e(mo32999a);
            arrayList.add(mo32999a);
        }
        m14036n0 = C9553r.m14036n0(mo4168q, arrayList);
        m33678t1.m4439r1(m24250K.m24231a(), C14239j0.m337d(interfaceC6774k.getVisibility()), m14036n0);
        m33678t1.mo4315Y0(false);
        m33678t1.mo4314Z0(m24250K.m24230b());
        m33678t1.m4303g1(mo24217C.mo4224p());
        m33056e.m33014a().m33042h().mo41027b(interfaceC6774k, m33678t1);
        return m33678t1;
    }

    /* renamed from: I0 */
    private final C2302e m24332I0(InterfaceC6786w interfaceC6786w) {
        List<InterfaceC11997x0> m14104i;
        List<? extends InterfaceC11920f1> m14104i2;
        List<InterfaceC11936j1> m14104i3;
        C2302e m33674p1 = C2302e.m33674p1(mo24217C(), C2545e.m33019a(m24240w(), interfaceC6786w), interfaceC6786w.getName(), m24240w().m33014a().m33030t().mo2836a(interfaceC6786w), true);
        C9612q.m13918g(m33674p1, "createJavaMethod(\n      …omponent), true\n        )");
        AbstractC7264g0 m23194o = m24240w().m33008g().m23194o(interfaceC6786w.getType(), C6225b.m23210b(EnumC7317r1.COMMON, false, false, null, 6, null));
        InterfaceC11997x0 mo24195z = mo24195z();
        m14104i = C9545j.m14104i();
        m14104i2 = C9545j.m14104i();
        m14104i3 = C9545j.m14104i();
        m33674p1.mo4431o1(null, mo24195z, m14104i, m14104i2, m14104i3, m23194o, EnumC11915e0.f30913j.m6722a(false, false, true), C11974t.f30970e, null);
        m33674p1.m33671s1(false, false);
        m24240w().m33014a().m33042h().mo41026c(interfaceC6786w, m33674p1);
        return m33674p1;
    }

    /* renamed from: J0 */
    public final Collection<InterfaceC12005z0> m24331J0(C11638f c11638f) {
        int m14093t;
        Collection<InterfaceC6781r> mo24380e = m24238y().invoke().mo24380e(c11638f);
        m14093t = C9546k.m14093t(mo24380e, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC6781r interfaceC6781r : mo24380e) {
            arrayList.add(m24252I(interfaceC6781r));
        }
        return arrayList;
    }

    /* renamed from: K0 */
    public final Collection<InterfaceC12005z0> m24330K0(C11638f c11638f) {
        boolean z;
        Set<InterfaceC12005z0> m24290y0 = m24290y0(c11638f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m24290y0) {
            InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) obj;
            if (!C14226h0.m381a(interfaceC12005z0) && C14218f.m404k(interfaceC12005z0) == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: L0 */
    private final boolean m24329L0(InterfaceC12005z0 interfaceC12005z0) {
        C14218f c14218f = C14218f.f36586n;
        C11638f name = interfaceC12005z0.getName();
        C9612q.m13918g(name, "name");
        if (!c14218f.m403l(name)) {
            return false;
        }
        C11638f name2 = interfaceC12005z0.getName();
        C9612q.m13918g(name2, "name");
        Set<InterfaceC12005z0> m24290y0 = m24290y0(name2);
        ArrayList<InterfaceC11998y> arrayList = new ArrayList();
        for (InterfaceC12005z0 interfaceC12005z02 : m24290y0) {
            InterfaceC11998y m404k = C14218f.m404k(interfaceC12005z02);
            if (m404k != null) {
                arrayList.add(m404k);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (InterfaceC11998y interfaceC11998y : arrayList) {
            if (m24339B0(interfaceC12005z0, interfaceC11998y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    private final void m24319V(List<InterfaceC11936j1> list, InterfaceC11944l interfaceC11944l, int i, InterfaceC6781r interfaceC6781r, AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02) {
        AbstractC7264g0 abstractC7264g03;
        InterfaceC12155g m6037b = InterfaceC12155g.f31603f.m6037b();
        C11638f name = interfaceC6781r.getName();
        AbstractC7264g0 m20981n = C7320s1.m20981n(abstractC7264g0);
        C9612q.m13918g(m20981n, "makeNotNullable(returnType)");
        boolean mo2172M = interfaceC6781r.mo2172M();
        if (abstractC7264g02 != null) {
            abstractC7264g03 = C7320s1.m20981n(abstractC7264g02);
        } else {
            abstractC7264g03 = null;
        }
        list.add(new C12713l0(interfaceC11944l, null, i, m6037b, name, m20981n, mo2172M, false, false, abstractC7264g03, m24240w().m33014a().m33030t().mo2836a(interfaceC6781r)));
    }

    /* renamed from: W */
    private final void m24318W(Collection<InterfaceC12005z0> collection, C11638f c11638f, Collection<? extends InterfaceC12005z0> collection2, boolean z) {
        List m14036n0;
        int m14093t;
        Collection<? extends InterfaceC12005z0> m41048d = C0158a.m41048d(c11638f, collection2, collection, mo24217C(), m24240w().m33014a().m33047c(), m24240w().m33014a().m33039k().mo20257a());
        C9612q.m13918g(m41048d, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z) {
            collection.addAll(m41048d);
            return;
        }
        m14036n0 = C9553r.m14036n0(collection, m41048d);
        m14093t = C9546k.m14093t(m41048d, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC12005z0 resolvedOverride : m41048d) {
            InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) C14226h0.m377e(resolvedOverride);
            if (interfaceC12005z0 == null) {
                C9612q.m13918g(resolvedOverride, "resolvedOverride");
            } else {
                C9612q.m13918g(resolvedOverride, "resolvedOverride");
                resolvedOverride = m24308g0(resolvedOverride, interfaceC12005z0, m14036n0);
            }
            arrayList.add(resolvedOverride);
        }
        collection.addAll(arrayList);
    }

    /* renamed from: X */
    private final void m24317X(C11638f c11638f, Collection<? extends InterfaceC12005z0> collection, Collection<? extends InterfaceC12005z0> collection2, Collection<InterfaceC12005z0> collection3, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        for (InterfaceC12005z0 interfaceC12005z0 : collection2) {
            C12242a.m5675a(collection3, m24336E0(interfaceC12005z0, function1, c11638f, collection));
            C12242a.m5675a(collection3, m24337D0(interfaceC12005z0, function1, collection));
            C12242a.m5675a(collection3, m24335F0(interfaceC12005z0, function1));
        }
    }

    /* renamed from: Y */
    private final void m24316Y(Set<? extends InterfaceC11989u0> set, Collection<InterfaceC11989u0> collection, Set<InterfaceC11989u0> set2, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        for (InterfaceC11989u0 interfaceC11989u0 : set) {
            C2306f m24306i0 = m24306i0(interfaceC11989u0, function1);
            if (m24306i0 != null) {
                collection.add(m24306i0);
                if (set2 != null) {
                    set2.add(interfaceC11989u0);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: Z */
    private final void m24315Z(C11638f c11638f, Collection<InterfaceC11989u0> collection) {
        Object m14032r0;
        m14032r0 = C9553r.m14032r0(m24238y().invoke().mo24380e(c11638f));
        InterfaceC6781r interfaceC6781r = (InterfaceC6781r) m14032r0;
        if (interfaceC6781r == null) {
            return;
        }
        collection.add(m24304k0(this, interfaceC6781r, null, EnumC11915e0.FINAL, 2, null));
    }

    /* renamed from: c0 */
    private final Collection<AbstractC7264g0> m24312c0() {
        if (this.f16759p) {
            Collection<AbstractC7264g0> mo2791m = mo24217C().mo4173k().mo2791m();
            C9612q.m13918g(mo2791m, "ownerDescriptor.typeConstructor.supertypes");
            return mo2791m;
        }
        return m24240w().m33014a().m33039k().mo20254d().mo20277g(mo24217C());
    }

    /* renamed from: d0 */
    private final List<InterfaceC11936j1> m24311d0(C12698f c12698f) {
        Object m14054V;
        Pair pair;
        Collection<InterfaceC6781r> mo2222B = this.f16758o.mo2222B();
        ArrayList arrayList = new ArrayList(mo2222B.size());
        C6224a m23210b = C6225b.m23210b(EnumC7317r1.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : mo2222B) {
            if (C9612q.m13922c(((InterfaceC6781r) obj).getName(), C14208b0.f36534c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.m14351a();
        List<InterfaceC6781r> list2 = (List) pair2.m14350b();
        list.size();
        m14054V = C9553r.m14054V(list);
        InterfaceC6781r interfaceC6781r = (InterfaceC6781r) m14054V;
        int i = 1;
        if (interfaceC6781r != null) {
            InterfaceC6787x returnType = interfaceC6781r.getReturnType();
            if (returnType instanceof InterfaceC6769f) {
                InterfaceC6769f interfaceC6769f = (InterfaceC6769f) returnType;
                pair = new Pair(m24240w().m33008g().m23198k(interfaceC6769f, m23210b, true), m24240w().m33008g().m23194o(interfaceC6769f.getComponentType(), m23210b));
            } else {
                pair = new Pair(m24240w().m33008g().m23194o(returnType, m23210b), null);
            }
            m24319V(arrayList, c12698f, 0, interfaceC6781r, (AbstractC7264g0) pair.m14351a(), (AbstractC7264g0) pair.m14350b());
        }
        int i2 = 0;
        if (interfaceC6781r == null) {
            i = 0;
        }
        for (InterfaceC6781r interfaceC6781r2 : list2) {
            m24319V(arrayList, c12698f, i2 + i, interfaceC6781r2, m24240w().m33008g().m23194o(interfaceC6781r2.getReturnType(), m23210b), null);
            i2++;
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public final InterfaceC11910d m24310e0() {
        List<InterfaceC11936j1> emptyList;
        boolean mo2205q = this.f16758o.mo2205q();
        if ((this.f16758o.mo2220J() || !this.f16758o.mo2203s()) && !mo2205q) {
            return null;
        }
        InterfaceC11914e mo24217C = mo24217C();
        C2299b m33678t1 = C2299b.m33678t1(mo24217C, InterfaceC12155g.f31603f.m6037b(), true, m24240w().m33014a().m33030t().mo2836a(this.f16758o));
        C9612q.m13918g(m33678t1, "createJavaConstructor(\n ….source(jClass)\n        )");
        if (mo2205q) {
            emptyList = m24311d0(m33678t1);
        } else {
            emptyList = Collections.emptyList();
        }
        m33678t1.mo4314Z0(false);
        m33678t1.m4440q1(emptyList, m24292w0(mo24217C));
        m33678t1.mo4315Y0(true);
        m33678t1.m4303g1(mo24217C.mo4224p());
        m24240w().m33014a().m33042h().mo41027b(this.f16758o, m33678t1);
        return m33678t1;
    }

    /* renamed from: f0 */
    public final InterfaceC11910d m24309f0() {
        InterfaceC11914e mo24217C = mo24217C();
        C2299b m33678t1 = C2299b.m33678t1(mo24217C, InterfaceC12155g.f31603f.m6037b(), true, m24240w().m33014a().m33030t().mo2836a(this.f16758o));
        C9612q.m13918g(m33678t1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<InterfaceC11936j1> m24303l0 = m24303l0(m33678t1);
        m33678t1.mo4314Z0(false);
        m33678t1.m4440q1(m24303l0, m24292w0(mo24217C));
        m33678t1.mo4315Y0(false);
        m33678t1.m4303g1(mo24217C.mo4224p());
        return m33678t1;
    }

    /* renamed from: g0 */
    private final InterfaceC12005z0 m24308g0(InterfaceC12005z0 interfaceC12005z0, InterfaceC11897a interfaceC11897a, Collection<? extends InterfaceC12005z0> collection) {
        boolean z;
        boolean z2 = true;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC12005z0 interfaceC12005z02 = (InterfaceC12005z0) it.next();
                if (!C9612q.m13922c(interfaceC12005z0, interfaceC12005z02) && interfaceC12005z02.mo4297s0() == null && m24299p0(interfaceC12005z02, interfaceC11897a)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (!z2) {
            InterfaceC12005z0 build = interfaceC12005z0.mo4296u().mo4263h().build();
            C9612q.m13920e(build);
            return build;
        }
        return interfaceC12005z0;
    }

    /* renamed from: h0 */
    private final InterfaceC12005z0 m24307h0(InterfaceC11998y interfaceC11998y, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        Object obj;
        int m14093t;
        C11638f name = interfaceC11998y.getName();
        C9612q.m13918g(name, "overridden.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m24339B0((InterfaceC12005z0) obj, interfaceC11998y)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) obj;
        if (interfaceC12005z0 == null) {
            return null;
        }
        InterfaceC11998y.InterfaceC11999a<? extends InterfaceC12005z0> mo4296u = interfaceC12005z0.mo4296u();
        List<InterfaceC11936j1> mo4301i = interfaceC11998y.mo4301i();
        C9612q.m13918g(mo4301i, "overridden.valueParameters");
        m14093t = C9546k.m14093t(mo4301i, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11936j1 interfaceC11936j1 : mo4301i) {
            arrayList.add(interfaceC11936j1.getType());
        }
        List<InterfaceC11936j1> mo4301i2 = interfaceC12005z0.mo4301i();
        C9612q.m13918g(mo4301i2, "override.valueParameters");
        mo4296u.mo4269b(C2308h.m33665a(arrayList, mo4301i2, interfaceC11998y));
        mo4296u.mo4251t();
        mo4296u.mo4261j();
        mo4296u.mo4254q(C2302e.f6402Q, Boolean.TRUE);
        return mo4296u.build();
    }

    /* renamed from: i0 */
    private final C2306f m24306i0(InterfaceC11989u0 interfaceC11989u0, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        InterfaceC12005z0 interfaceC12005z0;
        List<? extends InterfaceC11920f1> m14104i;
        List<InterfaceC11997x0> m14104i2;
        Object m14054V;
        C12697e0 c12697e0 = null;
        if (!m24300o0(interfaceC11989u0, function1)) {
            return null;
        }
        InterfaceC12005z0 m24294u0 = m24294u0(interfaceC11989u0, function1);
        C9612q.m13920e(m24294u0);
        if (interfaceC11989u0.mo4342L()) {
            interfaceC12005z0 = m24293v0(interfaceC11989u0, function1);
            C9612q.m13920e(interfaceC12005z0);
        } else {
            interfaceC12005z0 = null;
        }
        if (interfaceC12005z0 != null) {
            interfaceC12005z0.mo4167r();
            m24294u0.mo4167r();
        }
        C2301d c2301d = new C2301d(mo24217C(), m24294u0, interfaceC12005z0, interfaceC11989u0);
        AbstractC7264g0 returnType = m24294u0.getReturnType();
        C9612q.m13920e(returnType);
        m14104i = C9545j.m14104i();
        InterfaceC11997x0 mo24195z = mo24195z();
        m14104i2 = C9545j.m14104i();
        c2301d.m4513b1(returnType, m14104i, mo24195z, null, m14104i2);
        C12691d0 m4132k = C12756d.m4132k(c2301d, m24294u0.getAnnotations(), false, false, false, m24294u0.mo4160j());
        m4132k.m4537N0(m24294u0);
        m4132k.m4470Q0(c2301d.getType());
        C9612q.m13918g(m4132k, "createGetter(\n          …escriptor.type)\n        }");
        if (interfaceC12005z0 != null) {
            List<InterfaceC11936j1> mo4301i = interfaceC12005z0.mo4301i();
            C9612q.m13918g(mo4301i, "setterMethod.valueParameters");
            m14054V = C9553r.m14054V(mo4301i);
            InterfaceC11936j1 interfaceC11936j1 = (InterfaceC11936j1) m14054V;
            if (interfaceC11936j1 != null) {
                c12697e0 = C12756d.m4130m(c2301d, interfaceC12005z0.getAnnotations(), interfaceC11936j1.getAnnotations(), false, false, false, interfaceC12005z0.getVisibility(), interfaceC12005z0.mo4160j());
                c12697e0.m4537N0(interfaceC12005z0);
            } else {
                throw new AssertionError("No parameter found for " + interfaceC12005z0);
            }
        }
        c2301d.m4521U0(m4132k, c12697e0);
        return c2301d;
    }

    /* renamed from: j0 */
    private final C2306f m24305j0(InterfaceC6781r interfaceC6781r, AbstractC7264g0 abstractC7264g0, EnumC11915e0 enumC11915e0) {
        AbstractC7264g0 abstractC7264g02;
        List<? extends InterfaceC11920f1> m14104i;
        List<InterfaceC11997x0> m14104i2;
        C2306f m33668f1 = C2306f.m33668f1(mo24217C(), C2545e.m33019a(m24240w(), interfaceC6781r), enumC11915e0, C14239j0.m337d(interfaceC6781r.getVisibility()), false, interfaceC6781r.getName(), m24240w().m33014a().m33030t().mo2836a(interfaceC6781r), false);
        C9612q.m13918g(m33668f1, "create(\n            owne…inal = */ false\n        )");
        C12691d0 m4139d = C12756d.m4139d(m33668f1, InterfaceC12155g.f31603f.m6037b());
        C9612q.m13918g(m4139d, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        m33668f1.m4521U0(m4139d, null);
        if (abstractC7264g0 == null) {
            abstractC7264g02 = m24243q(interfaceC6781r, C2537a.m33055f(m24240w(), m33668f1, interfaceC6781r, 0, 4, null));
        } else {
            abstractC7264g02 = abstractC7264g0;
        }
        m14104i = C9545j.m14104i();
        InterfaceC11997x0 mo24195z = mo24195z();
        m14104i2 = C9545j.m14104i();
        m33668f1.m4513b1(abstractC7264g02, m14104i, mo24195z, null, m14104i2);
        m4139d.m4470Q0(abstractC7264g02);
        return m33668f1;
    }

    /* renamed from: k0 */
    static /* synthetic */ C2306f m24304k0(C5858g c5858g, InterfaceC6781r interfaceC6781r, AbstractC7264g0 abstractC7264g0, EnumC11915e0 enumC11915e0, int i, Object obj) {
        if ((i & 2) != 0) {
            abstractC7264g0 = null;
        }
        return c5858g.m24305j0(interfaceC6781r, abstractC7264g0, enumC11915e0);
    }

    /* renamed from: l0 */
    private final List<InterfaceC11936j1> m24303l0(C12698f c12698f) {
        AbstractC7264g0 abstractC7264g0;
        Collection<InterfaceC6786w> mo2206p = this.f16758o.mo2206p();
        ArrayList arrayList = new ArrayList(mo2206p.size());
        C6224a m23210b = C6225b.m23210b(EnumC7317r1.COMMON, false, false, null, 6, null);
        Iterator<InterfaceC6786w> it = mo2206p.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                i = i2 + 1;
                InterfaceC6786w next = it.next();
                AbstractC7264g0 m23194o = m24240w().m33008g().m23194o(next.getType(), m23210b);
                if (next.mo2161a()) {
                    abstractC7264g0 = m24240w().m33014a().m33037m().mo4194n().m9806k(m23194o);
                } else {
                    abstractC7264g0 = null;
                }
                arrayList.add(new C12713l0(c12698f, null, i2, InterfaceC12155g.f31603f.m6037b(), next.getName(), m23194o, false, false, false, abstractC7264g0, m24240w().m33014a().m33030t().mo2836a(next)));
            } else {
                return arrayList;
            }
        }
    }

    /* renamed from: m0 */
    private final InterfaceC12005z0 m24302m0(InterfaceC12005z0 interfaceC12005z0, C11638f c11638f) {
        InterfaceC11998y.InterfaceC11999a<? extends InterfaceC12005z0> mo4296u = interfaceC12005z0.mo4296u();
        mo4296u.mo4267d(c11638f);
        mo4296u.mo4251t();
        mo4296u.mo4261j();
        InterfaceC12005z0 build = mo4296u.build();
        C9612q.m13920e(build);
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0043  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p305qg.InterfaceC12005z0 m24301n0(p305qg.InterfaceC12005z0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.mo4301i()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            java.lang.Object r0 = kotlin.collections.C9543h.m14146h0(r0)
            qg.j1 r0 = (p305qg.InterfaceC11936j1) r0
            r2 = 0
            if (r0 == 0) goto L7e
            hi.g0 r3 = r0.getType()
            hi.g1 r3 = r3.mo3564N0()
            qg.h r3 = r3.mo2788p()
            if (r3 == 0) goto L35
            ph.d r3 = p429xh.C13801c.m1502m(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.m7443f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            ph.c r3 = r3.m7437l()
            goto L36
        L35:
            r3 = r2
        L36:
            ph.c r4 = ng.C10884k.f28423p
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7e
        L43:
            qg.y$a r2 = r6.mo4296u()
            java.util.List r6 = r6.mo4301i()
            kotlin.jvm.internal.C9612q.m13918g(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.C9543h.m14166O(r6, r1)
            qg.y$a r6 = r2.mo4269b(r6)
            hi.g0 r0 = r0.getType()
            java.util.List r0 = r0.mo3566L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            hi.k1 r0 = (p142hi.InterfaceC7288k1) r0
            hi.g0 r0 = r0.getType()
            qg.y$a r6 = r6.mo4259l(r0)
            qg.y r6 = r6.build()
            qg.z0 r6 = (p305qg.InterfaceC12005z0) r6
            r0 = r6
            tg.g0 r0 = (tg.C12701g0) r0
            if (r0 != 0) goto L7a
            goto L7d
        L7a:
            r0.m4302h1(r1)
        L7d:
            return r6
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p069dh.C5858g.m24301n0(qg.z0):qg.z0");
    }

    /* renamed from: o0 */
    private final boolean m24300o0(InterfaceC11989u0 interfaceC11989u0, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        if (C5843c.m24377a(interfaceC11989u0)) {
            return false;
        }
        InterfaceC12005z0 m24294u0 = m24294u0(interfaceC11989u0, function1);
        InterfaceC12005z0 m24293v0 = m24293v0(interfaceC11989u0, function1);
        if (m24294u0 == null) {
            return false;
        }
        if (!interfaceC11989u0.mo4342L()) {
            return true;
        }
        if (m24293v0 == null || m24293v0.mo4167r() != m24294u0.mo4167r()) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    private final boolean m24299p0(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2) {
        C12766k.C12775i.EnumC12776a m4024c = C12766k.f33113f.m4067F(interfaceC11897a2, interfaceC11897a, true).m4024c();
        C9612q.m13918g(m4024c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (m4024c == C12766k.C12775i.EnumC12776a.OVERRIDABLE && !C14256t.f36649a.m302a(interfaceC11897a2, interfaceC11897a)) {
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    private final boolean m24298q0(InterfaceC12005z0 interfaceC12005z0) {
        C14232i0.C14233a c14233a = C14232i0.f36605a;
        C11638f name = interfaceC12005z0.getName();
        C9612q.m13918g(name, "name");
        C11638f m357b = c14233a.m357b(name);
        if (m357b == null) {
            return false;
        }
        Set<InterfaceC12005z0> m24290y0 = m24290y0(m357b);
        ArrayList<InterfaceC12005z0> arrayList = new ArrayList();
        for (Object obj : m24290y0) {
            if (C14226h0.m381a((InterfaceC12005z0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        InterfaceC12005z0 m24302m0 = m24302m0(interfaceC12005z0, m357b);
        if (arrayList.isEmpty()) {
            return false;
        }
        for (InterfaceC12005z0 interfaceC12005z02 : arrayList) {
            if (m24297r0(interfaceC12005z02, m24302m0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r0 */
    private final boolean m24297r0(InterfaceC12005z0 interfaceC12005z0, InterfaceC11998y interfaceC11998y) {
        if (C14214e.f36580n.m411k(interfaceC12005z0)) {
            interfaceC11998y = interfaceC11998y.mo4221a();
        }
        C9612q.m13918g(interfaceC11998y, "if (superDescriptor.isRe…iginal else subDescriptor");
        return m24299p0(interfaceC11998y, interfaceC12005z0);
    }

    /* renamed from: s0 */
    private final boolean m24296s0(InterfaceC12005z0 interfaceC12005z0) {
        boolean z;
        InterfaceC12005z0 m24301n0 = m24301n0(interfaceC12005z0);
        if (m24301n0 == null) {
            return false;
        }
        C11638f name = interfaceC12005z0.getName();
        C9612q.m13918g(name, "name");
        Set<InterfaceC12005z0> m24290y0 = m24290y0(name);
        if ((m24290y0 instanceof Collection) && m24290y0.isEmpty()) {
            return false;
        }
        for (InterfaceC12005z0 interfaceC12005z02 : m24290y0) {
            if (interfaceC12005z02.isSuspend() && m24299p0(m24301n0, interfaceC12005z02)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t0 */
    private final InterfaceC12005z0 m24295t0(InterfaceC11989u0 interfaceC11989u0, String str, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        InterfaceC12005z0 interfaceC12005z0;
        boolean mo20256b;
        C11638f m7422f = C11638f.m7422f(str);
        C9612q.m13918g(m7422f, "identifier(getterName)");
        Iterator<T> it = function1.invoke(m7422f).iterator();
        do {
            interfaceC12005z0 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC12005z0 interfaceC12005z02 = (InterfaceC12005z0) it.next();
            if (interfaceC12005z02.mo4301i().size() == 0) {
                InterfaceC7587e interfaceC7587e = InterfaceC7587e.f20880a;
                AbstractC7264g0 returnType = interfaceC12005z02.getReturnType();
                if (returnType == null) {
                    mo20256b = false;
                } else {
                    mo20256b = interfaceC7587e.mo20256b(returnType, interfaceC11989u0.getType());
                }
                if (mo20256b) {
                    interfaceC12005z0 = interfaceC12005z02;
                    continue;
                } else {
                    continue;
                }
            }
        } while (interfaceC12005z0 == null);
        return interfaceC12005z0;
    }

    /* renamed from: u0 */
    private final InterfaceC12005z0 m24294u0(InterfaceC11989u0 interfaceC11989u0, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        InterfaceC11991v0 interfaceC11991v0;
        InterfaceC11991v0 mo4509f = interfaceC11989u0.mo4509f();
        String str = null;
        if (mo4509f != null) {
            interfaceC11991v0 = (InterfaceC11991v0) C14226h0.m378d(mo4509f);
        } else {
            interfaceC11991v0 = null;
        }
        if (interfaceC11991v0 != null) {
            str = C14230i.f36603a.m370a(interfaceC11991v0);
        }
        if (str != null && !C14226h0.m376f(mo24217C(), interfaceC11991v0)) {
            return m24295t0(interfaceC11989u0, str, function1);
        }
        String m7426b = interfaceC11989u0.getName().m7426b();
        C9612q.m13918g(m7426b, "name.asString()");
        return m24295t0(interfaceC11989u0, C14206a0.m450b(m7426b), function1);
    }

    /* renamed from: v0 */
    private final InterfaceC12005z0 m24293v0(InterfaceC11989u0 interfaceC11989u0, Function1<? super C11638f, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        InterfaceC12005z0 interfaceC12005z0;
        AbstractC7264g0 returnType;
        Object m14033q0;
        String m7426b = interfaceC11989u0.getName().m7426b();
        C9612q.m13918g(m7426b, "name.asString()");
        C11638f m7422f = C11638f.m7422f(C14206a0.m447e(m7426b));
        C9612q.m13918g(m7422f, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator<T> it = function1.invoke(m7422f).iterator();
        do {
            interfaceC12005z0 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC12005z0 interfaceC12005z02 = (InterfaceC12005z0) it.next();
            if (interfaceC12005z02.mo4301i().size() == 1 && (returnType = interfaceC12005z02.getReturnType()) != null && AbstractC10870h.m9851B0(returnType)) {
                InterfaceC7587e interfaceC7587e = InterfaceC7587e.f20880a;
                List<InterfaceC11936j1> mo4301i = interfaceC12005z02.mo4301i();
                C9612q.m13918g(mo4301i, "descriptor.valueParameters");
                m14033q0 = C9553r.m14033q0(mo4301i);
                if (interfaceC7587e.mo20255c(((InterfaceC11936j1) m14033q0).getType(), interfaceC11989u0.getType())) {
                    interfaceC12005z0 = interfaceC12005z02;
                    continue;
                } else {
                    continue;
                }
            }
        } while (interfaceC12005z0 == null);
        return interfaceC12005z0;
    }

    /* renamed from: w0 */
    private final AbstractC11988u m24292w0(InterfaceC11914e interfaceC11914e) {
        AbstractC11988u visibility = interfaceC11914e.getVisibility();
        C9612q.m13918g(visibility, "classDescriptor.visibility");
        if (C9612q.m13922c(visibility, C14252s.f36646b)) {
            AbstractC11988u PROTECTED_AND_PACKAGE = C14252s.f36647c;
            C9612q.m13918g(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
            return PROTECTED_AND_PACKAGE;
        }
        return visibility;
    }

    /* renamed from: y0 */
    private final Set<InterfaceC12005z0> m24290y0(C11638f c11638f) {
        Collection<AbstractC7264g0> m24312c0 = m24312c0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC7264g0 abstractC7264g0 : m24312c0) {
            C9550o.m14085y(linkedHashSet, abstractC7264g0.mo3553o().mo4362a(c11638f, EnumC14023d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: G */
    protected boolean mo24253G(C2302e c2302e) {
        C9612q.m13917h(c2302e, "<this>");
        if (this.f16758o.mo2205q()) {
            return false;
        }
        return m24338C0(c2302e);
    }

    /* renamed from: G0 */
    public void m24334G0(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        C13798a.m1518a(m24240w().m33014a().m33038l(), location, mo24217C(), name);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: H */
    protected AbstractC5884j.C5885a mo24197H(InterfaceC6781r method, List<? extends InterfaceC11920f1> methodTypeParameters, AbstractC7264g0 returnType, List<? extends InterfaceC11936j1> valueParameters) {
        C9612q.m13917h(method, "method");
        C9612q.m13917h(methodTypeParameters, "methodTypeParameters");
        C9612q.m13917h(returnType, "returnType");
        C9612q.m13917h(valueParameters, "valueParameters");
        InterfaceC0176j.C0178b mo41020a = m24240w().m33014a().m33031s().mo41020a(method, mo24217C(), returnType, null, valueParameters, methodTypeParameters);
        C9612q.m13918g(mo41020a, "c.components.signaturePr…dTypeParameters\n        )");
        AbstractC7264g0 m41014d = mo41020a.m41014d();
        C9612q.m13918g(m41014d, "propagated.returnType");
        AbstractC7264g0 m41015c = mo41020a.m41015c();
        List<InterfaceC11936j1> m41012f = mo41020a.m41012f();
        C9612q.m13918g(m41012f, "propagated.valueParameters");
        List<InterfaceC11920f1> m41013e = mo41020a.m41013e();
        C9612q.m13918g(m41013e, "propagated.typeParameters");
        boolean m41011g = mo41020a.m41011g();
        List<String> m41016b = mo41020a.m41016b();
        C9612q.m13918g(m41016b, "propagated.errors");
        return new AbstractC5884j.C5885a(m41014d, m41015c, m41012f, m41013e, m41011g, m41016b);
    }

    @Override // p069dh.AbstractC5884j, ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m24334G0(name, location);
        return super.mo4362a(name, location);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: a0 */
    public LinkedHashSet<C11638f> mo24208n(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        C9612q.m13917h(kindFilter, "kindFilter");
        Collection<AbstractC7264g0> mo2791m = mo24217C().mo4173k().mo2791m();
        C9612q.m13918g(mo2791m, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<C11638f> linkedHashSet = new LinkedHashSet<>();
        for (AbstractC7264g0 abstractC7264g0 : mo2791m) {
            C9550o.m14085y(linkedHashSet, abstractC7264g0.mo3553o().mo4361b());
        }
        linkedHashSet.addAll(m24238y().invoke().mo24384a());
        linkedHashSet.addAll(m24238y().invoke().mo24383b());
        linkedHashSet.addAll(mo24209l(kindFilter, function1));
        linkedHashSet.addAll(m24240w().m33014a().m33027w().mo868f(m24240w(), mo24217C()));
        return linkedHashSet;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: b0 */
    public C5839a mo24206p() {
        return new C5839a(this.f16758o, C5859a.f16765j);
    }

    @Override // p069dh.AbstractC5884j, ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m24334G0(name, location);
        return super.mo4360c(name, location);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        InterfaceC6814h<C11638f, InterfaceC11914e> interfaceC6814h;
        InterfaceC11914e invoke;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m24334G0(name, location);
        C5858g c5858g = (C5858g) m24257B();
        if (c5858g == null || (interfaceC6814h = c5858g.f16764u) == null || (invoke = interfaceC6814h.invoke(name)) == null) {
            return this.f16764u.invoke(name);
        }
        return invoke;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: l */
    protected Set<C11638f> mo24209l(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        Set<C11638f> m13999l;
        C9612q.m13917h(kindFilter, "kindFilter");
        m13999l = C9561x.m13999l(this.f16761r.invoke(), this.f16763t.invoke().keySet());
        return m13999l;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: o */
    protected void mo24207o(Collection<InterfaceC12005z0> result, C11638f name) {
        C9612q.m13917h(result, "result");
        C9612q.m13917h(name, "name");
        if (this.f16758o.mo2204r() && m24238y().invoke().mo24381d(name) != null) {
            boolean z = true;
            if (!result.isEmpty()) {
                Iterator<T> it = result.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC12005z0) it.next()).mo4301i().isEmpty()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                InterfaceC6786w mo24381d = m24238y().invoke().mo24381d(name);
                C9612q.m13920e(mo24381d);
                result.add(m24332I0(mo24381d));
            }
        }
        m24240w().m33014a().m33027w().mo869e(m24240w(), mo24217C(), name, result);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: r */
    protected void mo24205r(Collection<InterfaceC12005z0> result, C11638f name) {
        List m14104i;
        List m14036n0;
        boolean z;
        C9612q.m13917h(result, "result");
        C9612q.m13917h(name, "name");
        Set<InterfaceC12005z0> m24290y0 = m24290y0(name);
        if (!C14232i0.f36605a.m348k(name) && !C14218f.f36586n.m403l(name)) {
            if (!(m24290y0 instanceof Collection) || !m24290y0.isEmpty()) {
                for (InterfaceC11998y interfaceC11998y : m24290y0) {
                    if (interfaceC11998y.isSuspend()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m24290y0) {
                    if (m24338C0((InterfaceC12005z0) obj)) {
                        arrayList.add(obj);
                    }
                }
                m24318W(result, name, arrayList, false);
                return;
            }
        }
        C12263f m5640a = C12263f.f31865l.m5640a();
        m14104i = C9545j.m14104i();
        Collection<? extends InterfaceC12005z0> m41048d = C0158a.m41048d(name, m24290y0, m14104i, mo24217C(), InterfaceC5950r.f16955a, m24240w().m33014a().m33039k().mo20257a());
        C9612q.m13918g(m41048d, "resolveOverridesForNonSt….overridingUtil\n        )");
        m24317X(name, result, m41048d, result, new C5860b(this));
        m24317X(name, result, m41048d, m5640a, new C5861c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : m24290y0) {
            if (m24338C0((InterfaceC12005z0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        m14036n0 = C9553r.m14036n0(arrayList2, m5640a);
        m24318W(result, name, m14036n0, true);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: s */
    protected void mo24196s(C11638f name, Collection<InterfaceC11989u0> result) {
        Set<? extends InterfaceC11989u0> m14001j;
        Set m13999l;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(result, "result");
        if (this.f16758o.mo2205q()) {
            m24315Z(name, result);
        }
        Set<InterfaceC11989u0> m24340A0 = m24340A0(name);
        if (m24340A0.isEmpty()) {
            return;
        }
        C12263f.C12265b c12265b = C12263f.f31865l;
        C12263f m5640a = c12265b.m5640a();
        C12263f m5640a2 = c12265b.m5640a();
        m24316Y(m24340A0, result, m5640a, new C5862d());
        m14001j = C9561x.m14001j(m24340A0, m5640a);
        m24316Y(m14001j, m5640a2, null, new C5863e());
        m13999l = C9561x.m13999l(m24340A0, m5640a2);
        Collection<? extends InterfaceC11989u0> m41048d = C0158a.m41048d(name, m13999l, result, mo24217C(), m24240w().m33014a().m33047c(), m24240w().m33014a().m33039k().mo20257a());
        C9612q.m13918g(m41048d, "resolveOverridesForNonSt…rridingUtil\n            )");
        result.addAll(m41048d);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: t */
    protected Set<C11638f> mo24204t(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        C9612q.m13917h(kindFilter, "kindFilter");
        if (this.f16758o.mo2205q()) {
            return mo4361b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m24238y().invoke().mo24382c());
        Collection<AbstractC7264g0> mo2791m = mo24217C().mo4173k().mo2791m();
        C9612q.m13918g(mo2791m, "ownerDescriptor.typeConstructor.supertypes");
        for (AbstractC7264g0 abstractC7264g0 : mo2791m) {
            C9550o.m14085y(linkedHashSet, abstractC7264g0.mo3553o().mo4359d());
        }
        return linkedHashSet;
    }

    @Override // p069dh.AbstractC5884j
    public String toString() {
        return "Lazy Java member scope for " + this.f16758o.mo2210e();
    }

    /* renamed from: x0 */
    public final InterfaceC6815i<List<InterfaceC11910d>> m24291x0() {
        return this.f16760q;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: z */
    protected InterfaceC11997x0 mo24195z() {
        return C12758e.m4100l(mo24217C());
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: z0 */
    public InterfaceC11914e mo24217C() {
        return this.f16757n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5858g(C2548g c, InterfaceC11914e ownerDescriptor, InterfaceC6770g jClass, boolean z, C5858g c5858g) {
        super(c, c5858g);
        C9612q.m13917h(c, "c");
        C9612q.m13917h(ownerDescriptor, "ownerDescriptor");
        C9612q.m13917h(jClass, "jClass");
        this.f16757n = ownerDescriptor;
        this.f16758o = jClass;
        this.f16759p = z;
        this.f16760q = c.m33010e().mo21867c(new C5864f(c));
        this.f16761r = c.m33010e().mo21867c(new C5868j());
        this.f16762s = c.m33010e().mo21867c(new C5866h(c, this));
        this.f16763t = c.m33010e().mo21867c(new C5865g());
        this.f16764u = c.m33010e().mo21863g(new C5869k(c));
    }
}