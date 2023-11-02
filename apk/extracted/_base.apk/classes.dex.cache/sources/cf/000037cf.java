package p161ii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KDeclarationContainer;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7226c1;
import p142hi.C7229d0;
import p142hi.C7239f0;
import p142hi.C7304p;
import p142hi.C7319s0;
import p142hi.C7335w0;
import p389vh.C13312n;

/* renamed from: ii.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7614w {

    /* renamed from: a */
    public static final C7614w f20912a = new C7614w();

    /* renamed from: ii.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class EnumC7615a {

        /* renamed from: j */
        public static final EnumC7615a f20913j = new C7618c("START", 0);

        /* renamed from: k */
        public static final EnumC7615a f20914k = new C7616a("ACCEPT_NULL", 1);

        /* renamed from: l */
        public static final EnumC7615a f20915l = new C7619d("UNKNOWN", 2);

        /* renamed from: m */
        public static final EnumC7615a f20916m = new C7617b("NOT_NULL", 3);

        /* renamed from: n */
        private static final /* synthetic */ EnumC7615a[] f20917n = m20233a();

        /* renamed from: ii.w$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C7616a extends EnumC7615a {
            C7616a(String str, int i) {
                super(str, i, null);
            }

            @Override // p161ii.C7614w.EnumC7615a
            /* renamed from: b */
            public EnumC7615a mo20230b(AbstractC7333v1 nextType) {
                C9612q.m13917h(nextType, "nextType");
                return m20232c(nextType);
            }
        }

        /* renamed from: ii.w$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C7617b extends EnumC7615a {
            C7617b(String str, int i) {
                super(str, i, null);
            }

            @Override // p161ii.C7614w.EnumC7615a
            /* renamed from: d */
            public C7617b mo20230b(AbstractC7333v1 nextType) {
                C9612q.m13917h(nextType, "nextType");
                return this;
            }
        }

        /* renamed from: ii.w$a$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C7618c extends EnumC7615a {
            C7618c(String str, int i) {
                super(str, i, null);
            }

            @Override // p161ii.C7614w.EnumC7615a
            /* renamed from: b */
            public EnumC7615a mo20230b(AbstractC7333v1 nextType) {
                C9612q.m13917h(nextType, "nextType");
                return m20232c(nextType);
            }
        }

        /* renamed from: ii.w$a$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C7619d extends EnumC7615a {
            C7619d(String str, int i) {
                super(str, i, null);
            }

            @Override // p161ii.C7614w.EnumC7615a
            /* renamed from: b */
            public EnumC7615a mo20230b(AbstractC7333v1 nextType) {
                C9612q.m13917h(nextType, "nextType");
                EnumC7615a m20232c = m20232c(nextType);
                if (m20232c == EnumC7615a.f20914k) {
                    return this;
                }
                return m20232c;
            }
        }

        private EnumC7615a(String str, int i) {
            super(str, i);
        }

        public /* synthetic */ EnumC7615a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        /* renamed from: a */
        private static final /* synthetic */ EnumC7615a[] m20233a() {
            return new EnumC7615a[]{f20913j, f20914k, f20915l, f20916m};
        }

        public static EnumC7615a valueOf(String str) {
            return (EnumC7615a) Enum.valueOf(EnumC7615a.class, str);
        }

        public static EnumC7615a[] values() {
            return (EnumC7615a[]) f20917n.clone();
        }

        /* renamed from: b */
        public abstract EnumC7615a mo20230b(AbstractC7333v1 abstractC7333v1);

        /* renamed from: c */
        protected final EnumC7615a m20232c(AbstractC7333v1 abstractC7333v1) {
            C9612q.m13917h(abstractC7333v1, "<this>");
            if (abstractC7333v1.mo3563O0()) {
                return f20914k;
            }
            if ((abstractC7333v1 instanceof C7304p) && (((C7304p) abstractC7333v1).m21040Z0() instanceof C7335w0)) {
                return f20916m;
            }
            if (abstractC7333v1 instanceof C7335w0) {
                return f20915l;
            }
            if (C7606o.f20906a.m20249a(abstractC7333v1)) {
                return f20916m;
            }
            return f20915l;
        }
    }

    /* renamed from: ii.w$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7620b extends AbstractC9614s implements Function0<String> {

        /* renamed from: j */
        final /* synthetic */ Set<AbstractC7302o0> f20918j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7620b(Set<? extends AbstractC7302o0> set) {
            super(0);
            this.f20918j = set;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String m14046d0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("This collections cannot be empty! input types: ");
            m14046d0 = C9553r.m14046d0(this.f20918j, null, null, null, 0, null, null, 63, null);
            sb2.append(m14046d0);
            return sb2.toString();
        }
    }

    /* renamed from: ii.w$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C7621c extends C9605m implements Function2<AbstractC7264g0, AbstractC7264g0, Boolean> {
        C7621c(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Boolean invoke(AbstractC7264g0 p0, AbstractC7264g0 p1) {
            C9612q.m13917h(p0, "p0");
            C9612q.m13917h(p1, "p1");
            return Boolean.valueOf(((C7614w) this.receiver).m20234e(p0, p1));
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C7614w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    /* renamed from: ii.w$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C7622d extends C9605m implements Function2<AbstractC7264g0, AbstractC7264g0, Boolean> {
        C7622d(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Boolean invoke(AbstractC7264g0 p0, AbstractC7264g0 p1) {
            C9612q.m13917h(p0, "p0");
            C9612q.m13917h(p1, "p1");
            return Boolean.valueOf(((C7604m) this.receiver).mo20255c(p0, p1));
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C7604m.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    private C7614w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0050 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Collection<p142hi.AbstractC7302o0> m20237b(java.util.Collection<? extends p142hi.AbstractC7302o0> r8, kotlin.jvm.functions.Function2<? super p142hi.AbstractC7302o0, ? super p142hi.AbstractC7302o0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.C9612q.m13918g(r8, r1)
        Le:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r8.next()
            hi.o0 r1 = (p142hi.AbstractC7302o0) r1
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L22
            goto L51
        L22:
            java.util.Iterator r2 = r0.iterator()
        L26:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L51
            java.lang.Object r4 = r2.next()
            hi.o0 r4 = (p142hi.AbstractC7302o0) r4
            r5 = 1
            if (r4 == r1) goto L4d
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.C9612q.m13918g(r4, r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.C9612q.m13918g(r1, r6)
            java.lang.Object r4 = r9.invoke(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4d
            r4 = r5
            goto L4e
        L4d:
            r4 = r3
        L4e:
            if (r4 == 0) goto L26
            r3 = r5
        L51:
            if (r3 == 0) goto Le
            r8.remove()
            goto Le
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161ii.C7614w.m20237b(java.util.Collection, kotlin.jvm.functions.Function2):java.util.Collection");
    }

    /* renamed from: d */
    private final AbstractC7302o0 m20235d(Set<? extends AbstractC7302o0> set) {
        Object m14034p0;
        Object m14034p02;
        if (set.size() == 1) {
            m14034p02 = C9553r.m14034p0(set);
            return (AbstractC7302o0) m14034p02;
        }
        new C7620b(set);
        Collection<AbstractC7302o0> m20237b = m20237b(set, new C7621c(this));
        m20237b.isEmpty();
        AbstractC7302o0 m2798b = C13312n.f34386f.m2798b(m20237b);
        if (m2798b != null) {
            return m2798b;
        }
        Collection<AbstractC7302o0> m20237b2 = m20237b(m20237b, new C7622d(InterfaceC7602l.f20900b.m20258a()));
        m20237b2.isEmpty();
        if (m20237b2.size() < 2) {
            m14034p0 = C9553r.m14034p0(m20237b2);
            return (AbstractC7302o0) m14034p0;
        }
        return new C7239f0(set).m21156d();
    }

    /* renamed from: e */
    public final boolean m20234e(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02) {
        C7604m m20258a = InterfaceC7602l.f20900b.m20258a();
        if (m20258a.mo20256b(abstractC7264g0, abstractC7264g02) && !m20258a.mo20256b(abstractC7264g02, abstractC7264g0)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final AbstractC7302o0 m20236c(List<? extends AbstractC7302o0> types) {
        int m14093t;
        int m14093t2;
        C9612q.m13917h(types, "types");
        types.size();
        ArrayList<AbstractC7333v1> arrayList = new ArrayList();
        for (AbstractC7302o0 abstractC7302o0 : types) {
            if (abstractC7302o0.mo3564N0() instanceof C7239f0) {
                Collection<AbstractC7264g0> mo2791m = abstractC7302o0.mo3564N0().mo2791m();
                C9612q.m13918g(mo2791m, "type.constructor.supertypes");
                m14093t2 = C9546k.m14093t(mo2791m, 10);
                ArrayList arrayList2 = new ArrayList(m14093t2);
                for (AbstractC7264g0 it : mo2791m) {
                    C9612q.m13918g(it, "it");
                    AbstractC7302o0 m21190d = C7229d0.m21190d(it);
                    if (abstractC7302o0.mo3563O0()) {
                        m21190d = m21190d.mo3558U0(true);
                    }
                    arrayList2.add(m21190d);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC7302o0);
            }
        }
        EnumC7615a enumC7615a = EnumC7615a.f20913j;
        for (AbstractC7333v1 abstractC7333v1 : arrayList) {
            enumC7615a = enumC7615a.mo20230b(abstractC7333v1);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC7302o0 abstractC7302o02 = (AbstractC7302o0) it2.next();
            if (enumC7615a == EnumC7615a.f20916m) {
                if (abstractC7302o02 instanceof C7595i) {
                    abstractC7302o02 = C7319s0.m20995k((C7595i) abstractC7302o02);
                }
                abstractC7302o02 = C7319s0.m20997i(abstractC7302o02, false, 1, null);
            }
            linkedHashSet.add(abstractC7302o02);
        }
        m14093t = C9546k.m14093t(types, 10);
        ArrayList arrayList3 = new ArrayList(m14093t);
        for (AbstractC7302o0 abstractC7302o03 : types) {
            arrayList3.add(abstractC7302o03.mo3565M0());
        }
        Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            while (it3.hasNext()) {
                next = ((C7226c1) next).m21202p((C7226c1) it3.next());
            }
            return m20235d(linkedHashSet).mo3557V0((C7226c1) next);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}