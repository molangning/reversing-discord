package ni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7272h1;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7229d0;
import p142hi.C7267h0;
import p142hi.C7294m1;
import p142hi.C7303o1;
import p142hi.C7307p1;
import p142hi.C7320s1;
import p142hi.C7329u1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p234mi.C10472a;
import p305qg.InterfaceC11920f1;
import p372uh.C12976d;
import p372uh.InterfaceC12974b;
import p429xh.C13801c;
import pf.C11581q;

/* renamed from: ni.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10910b {

    /* renamed from: ni.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C10911a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28638a;

        static {
            int[] iArr = new int[EnumC7336w1.values().length];
            try {
                iArr[EnumC7336w1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7336w1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7336w1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28638a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ni.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10912b extends AbstractC9614s implements Function1<AbstractC7333v1, Boolean> {

        /* renamed from: j */
        public static final C10912b f28639j = new C10912b();

        C10912b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC7333v1 it) {
            C9612q.m13918g(it, "it");
            return Boolean.valueOf(C12976d.m3544d(it));
        }
    }

    /* renamed from: ni.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10913c extends AbstractC7272h1 {
        C10913c() {
        }

        @Override // p142hi.AbstractC7272h1
        /* renamed from: k */
        public InterfaceC7288k1 mo9561k(InterfaceC7265g1 key) {
            InterfaceC12974b interfaceC12974b;
            C9612q.m13917h(key, "key");
            if (key instanceof InterfaceC12974b) {
                interfaceC12974b = (InterfaceC12974b) key;
            } else {
                interfaceC12974b = null;
            }
            if (interfaceC12974b == null) {
                return null;
            }
            if (interfaceC12974b.mo3552b().mo20955a()) {
                return new C7294m1(EnumC7336w1.OUT_VARIANCE, interfaceC12974b.mo3552b().getType());
            }
            return interfaceC12974b.mo3552b();
        }
    }

    /* renamed from: a */
    public static final C10909a<AbstractC7264g0> m9571a(AbstractC7264g0 type) {
        List<Pair> m14067J0;
        Object m9567e;
        C9612q.m13917h(type, "type");
        if (C7229d0.m21192b(type)) {
            C10909a<AbstractC7264g0> m9571a = m9571a(C7229d0.m21191c(type));
            C10909a<AbstractC7264g0> m9571a2 = m9571a(C7229d0.m21190d(type));
            return new C10909a<>(C7329u1.m20948b(C7267h0.m21104d(C7229d0.m21191c(m9571a.m9573c()), C7229d0.m21190d(m9571a2.m9573c())), type), C7329u1.m20948b(C7267h0.m21104d(C7229d0.m21191c(m9571a.m9572d()), C7229d0.m21190d(m9571a2.m9572d())), type));
        }
        InterfaceC7265g1 mo3564N0 = type.mo3564N0();
        if (C12976d.m3544d(type)) {
            C9612q.m13919f(mo3564N0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            InterfaceC7288k1 mo3552b = ((InterfaceC12974b) mo3564N0).mo3552b();
            AbstractC7264g0 type2 = mo3552b.getType();
            C9612q.m13918g(type2, "typeProjection.type");
            AbstractC7264g0 m9570b = m9570b(type2, type);
            int i = C10911a.f28638a[mo3552b.mo20954b().ordinal()];
            if (i != 2) {
                if (i == 3) {
                    AbstractC7302o0 m9843H = C10472a.m11449i(type).m9843H();
                    C9612q.m13918g(m9843H, "type.builtIns.nothingType");
                    return new C10909a<>(m9570b(m9843H, type), m9570b);
                }
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + mo3552b);
            }
            AbstractC7302o0 m9842I = C10472a.m11449i(type).m9842I();
            C9612q.m13918g(m9842I, "type.builtIns.nullableAnyType");
            return new C10909a<>(m9570b, m9842I);
        } else if (!type.mo3566L0().isEmpty() && type.mo3566L0().size() == mo3564N0.getParameters().size()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<InterfaceC7288k1> mo3566L0 = type.mo3566L0();
            List<InterfaceC11920f1> parameters = mo3564N0.getParameters();
            C9612q.m13918g(parameters, "typeConstructor.parameters");
            m14067J0 = C9553r.m14067J0(mo3566L0, parameters);
            for (Pair pair : m14067J0) {
                InterfaceC7288k1 interfaceC7288k1 = (InterfaceC7288k1) pair.m14351a();
                InterfaceC11920f1 typeParameter = (InterfaceC11920f1) pair.m14350b();
                C9612q.m13918g(typeParameter, "typeParameter");
                C10914c m9565g = m9565g(interfaceC7288k1, typeParameter);
                if (interfaceC7288k1.mo20955a()) {
                    arrayList.add(m9565g);
                    arrayList2.add(m9565g);
                } else {
                    C10909a<C10914c> m9568d = m9568d(m9565g);
                    arrayList.add(m9568d.m9575a());
                    arrayList2.add(m9568d.m9574b());
                }
            }
            boolean z = false;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C10914c) it.next()).m9557d()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                m9567e = C10472a.m11449i(type).m9843H();
                C9612q.m13918g(m9567e, "type.builtIns.nothingType");
            } else {
                m9567e = m9567e(type, arrayList);
            }
            return new C10909a<>(m9567e, m9567e(type, arrayList2));
        } else {
            return new C10909a<>(type, type);
        }
    }

    /* renamed from: b */
    private static final AbstractC7264g0 m9570b(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02) {
        AbstractC7264g0 m20978q = C7320s1.m20978q(abstractC7264g0, abstractC7264g02.mo3563O0());
        C9612q.m13918g(m20978q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return m20978q;
    }

    /* renamed from: c */
    public static final InterfaceC7288k1 m9569c(InterfaceC7288k1 interfaceC7288k1, boolean z) {
        if (interfaceC7288k1 == null) {
            return null;
        }
        if (interfaceC7288k1.mo20955a()) {
            return interfaceC7288k1;
        }
        AbstractC7264g0 type = interfaceC7288k1.getType();
        C9612q.m13918g(type, "typeProjection.type");
        if (!C7320s1.m20992c(type, C10912b.f28639j)) {
            return interfaceC7288k1;
        }
        EnumC7336w1 mo20954b = interfaceC7288k1.mo20954b();
        C9612q.m13918g(mo20954b, "typeProjection.projectionKind");
        if (mo20954b == EnumC7336w1.OUT_VARIANCE) {
            return new C7294m1(mo20954b, m9571a(type).m9572d());
        }
        if (z) {
            return new C7294m1(mo20954b, m9571a(type).m9573c());
        }
        return m9566f(interfaceC7288k1);
    }

    /* renamed from: d */
    private static final C10909a<C10914c> m9568d(C10914c c10914c) {
        C10909a<AbstractC7264g0> m9571a = m9571a(c10914c.m9560a());
        C10909a<AbstractC7264g0> m9571a2 = m9571a(c10914c.m9559b());
        return new C10909a<>(new C10914c(c10914c.m9558c(), m9571a.m9574b(), m9571a2.m9575a()), new C10914c(c10914c.m9558c(), m9571a.m9575a(), m9571a2.m9574b()));
    }

    /* renamed from: e */
    private static final AbstractC7264g0 m9567e(AbstractC7264g0 abstractC7264g0, List<C10914c> list) {
        int m14093t;
        abstractC7264g0.mo3566L0().size();
        list.size();
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C10914c c10914c : list) {
            arrayList.add(m9564h(c10914c));
        }
        return C7303o1.m21043e(abstractC7264g0, arrayList, null, null, 6, null);
    }

    /* renamed from: f */
    private static final InterfaceC7288k1 m9566f(InterfaceC7288k1 interfaceC7288k1) {
        C7307p1 m21027g = C7307p1.m21027g(new C10913c());
        C9612q.m13918g(m21027g, "create(object : TypeCons…ojection\n        }\n    })");
        return m21027g.m21014t(interfaceC7288k1);
    }

    /* renamed from: g */
    private static final C10914c m9565g(InterfaceC7288k1 interfaceC7288k1, InterfaceC11920f1 interfaceC11920f1) {
        int i = C10911a.f28638a[C7307p1.m21031c(interfaceC11920f1.mo4464m(), interfaceC7288k1).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AbstractC7302o0 m9843H = C13801c.m1505j(interfaceC11920f1).m9843H();
                    C9612q.m13918g(m9843H, "typeParameter.builtIns.nothingType");
                    AbstractC7264g0 type = interfaceC7288k1.getType();
                    C9612q.m13918g(type, "type");
                    return new C10914c(interfaceC11920f1, m9843H, type);
                }
                throw new C11581q();
            }
            AbstractC7264g0 type2 = interfaceC7288k1.getType();
            C9612q.m13918g(type2, "type");
            AbstractC7302o0 m9842I = C13801c.m1505j(interfaceC11920f1).m9842I();
            C9612q.m13918g(m9842I, "typeParameter.builtIns.nullableAnyType");
            return new C10914c(interfaceC11920f1, type2, m9842I);
        }
        AbstractC7264g0 type3 = interfaceC7288k1.getType();
        C9612q.m13918g(type3, "type");
        AbstractC7264g0 type4 = interfaceC7288k1.getType();
        C9612q.m13918g(type4, "type");
        return new C10914c(interfaceC11920f1, type3, type4);
    }

    /* renamed from: h */
    private static final InterfaceC7288k1 m9564h(C10914c c10914c) {
        c10914c.m9557d();
        if (!C9612q.m13922c(c10914c.m9560a(), c10914c.m9559b())) {
            EnumC7336w1 mo4464m = c10914c.m9558c().mo4464m();
            EnumC7336w1 enumC7336w1 = EnumC7336w1.IN_VARIANCE;
            if (mo4464m != enumC7336w1) {
                if (AbstractC10870h.m9801m0(c10914c.m9560a()) && c10914c.m9558c().mo4464m() != enumC7336w1) {
                    return new C7294m1(m9563i(c10914c, EnumC7336w1.OUT_VARIANCE), c10914c.m9559b());
                }
                if (AbstractC10870h.m9797o0(c10914c.m9559b())) {
                    return new C7294m1(m9563i(c10914c, enumC7336w1), c10914c.m9560a());
                }
                return new C7294m1(m9563i(c10914c, EnumC7336w1.OUT_VARIANCE), c10914c.m9559b());
            }
        }
        return new C7294m1(c10914c.m9560a());
    }

    /* renamed from: i */
    private static final EnumC7336w1 m9563i(C10914c c10914c, EnumC7336w1 enumC7336w1) {
        return enumC7336w1 == c10914c.m9558c().mo4464m() ? EnumC7336w1.INVARIANT : enumC7336w1;
    }
}
