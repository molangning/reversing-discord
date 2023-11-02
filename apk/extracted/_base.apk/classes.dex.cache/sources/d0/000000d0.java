package ai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p307qi.C12007a;
import p327ri.C12258e;
import p448yg.InterfaceC14020b;
import ph.C11638f;
import th.C12779m;

/* renamed from: ai.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0208n extends AbstractC0179a {

    /* renamed from: d */
    public static final C0209a f663d = new C0209a(null);

    /* renamed from: b */
    private final String f664b;

    /* renamed from: c */
    private final InterfaceC0194h f665c;

    /* renamed from: ai.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0209a {
        private C0209a() {
        }

        public /* synthetic */ C0209a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC0194h m40954a(String message, Collection<? extends AbstractC7264g0> types) {
            int m14093t;
            C9612q.m13917h(message, "message");
            C9612q.m13917h(types, "types");
            m14093t = C9546k.m14093t(types, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (AbstractC7264g0 abstractC7264g0 : types) {
                arrayList.add(abstractC7264g0.mo3553o());
            }
            C12258e<InterfaceC0194h> m6635b = C12007a.m6635b(arrayList);
            InterfaceC0194h m41007b = C0180b.f602d.m41007b(message, m6635b);
            if (m6635b.size() <= 1) {
                return m41007b;
            }
            return new C0208n(message, m41007b, null);
        }
    }

    /* renamed from: ai.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C0210b extends AbstractC9614s implements Function1<InterfaceC11897a, InterfaceC11897a> {

        /* renamed from: j */
        public static final C0210b f666j = new C0210b();

        C0210b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11897a invoke(InterfaceC11897a selectMostSpecificInEachOverridableGroup) {
            C9612q.m13917h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* renamed from: ai.n$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C0211c extends AbstractC9614s implements Function1<InterfaceC12005z0, InterfaceC11897a> {

        /* renamed from: j */
        public static final C0211c f667j = new C0211c();

        C0211c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11897a invoke(InterfaceC12005z0 selectMostSpecificInEachOverridableGroup) {
            C9612q.m13917h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* renamed from: ai.n$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C0212d extends AbstractC9614s implements Function1<InterfaceC11989u0, InterfaceC11897a> {

        /* renamed from: j */
        public static final C0212d f668j = new C0212d();

        C0212d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11897a invoke(InterfaceC11989u0 selectMostSpecificInEachOverridableGroup) {
            C9612q.m13917h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    private C0208n(String str, InterfaceC0194h interfaceC0194h) {
        this.f664b = str;
        this.f665c = interfaceC0194h;
    }

    public /* synthetic */ C0208n(String str, InterfaceC0194h interfaceC0194h, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC0194h);
    }

    /* renamed from: j */
    public static final InterfaceC0194h m40955j(String str, Collection<? extends AbstractC7264g0> collection) {
        return f663d.m40954a(str, collection);
    }

    @Override // ai.AbstractC0179a, ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return C12779m.m3933a(super.mo4362a(name, location), C0211c.f667j);
    }

    @Override // ai.AbstractC0179a, ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return C12779m.m3933a(super.mo4360c(name, location), C0212d.f668j);
    }

    @Override // ai.AbstractC0179a, ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List m14036n0;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        Collection<InterfaceC11947m> mo4358e = super.mo4358e(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mo4358e) {
            if (((InterfaceC11947m) obj) instanceof InterfaceC11897a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.m14351a();
        C9612q.m13919f(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        m14036n0 = C9553r.m14036n0(C12779m.m3933a(list, C0210b.f666j), (List) pair.m14350b());
        return m14036n0;
    }

    @Override // ai.AbstractC0179a
    /* renamed from: i */
    protected InterfaceC0194h mo40956i() {
        return this.f665c;
    }
}