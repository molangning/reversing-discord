package tg;

import ai.AbstractC0198i;
import ai.C0185d;
import ai.InterfaceC0194h;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6813g;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7289l;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.AbstractC11930h1;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p325rg.InterfaceC12155g;
import p448yg.EnumC14023d;
import p448yg.InterfaceC14020b;
import ph.C11638f;
import th.AbstractC12764i;
import th.C12766k;

/* renamed from: tg.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12719n extends AbstractC12700g {

    /* renamed from: r */
    private final InterfaceC7265g1 f32971r;

    /* renamed from: s */
    private final InterfaceC0194h f32972s;

    /* renamed from: t */
    private final InterfaceC6815i<Set<C11638f>> f32973t;

    /* renamed from: u */
    private final InterfaceC12155g f32974u;

    /* renamed from: tg.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12720a extends AbstractC0198i {

        /* renamed from: b */
        private final InterfaceC6813g<C11638f, Collection<? extends InterfaceC12005z0>> f32975b;

        /* renamed from: c */
        private final InterfaceC6813g<C11638f, Collection<? extends InterfaceC11989u0>> f32976c;

        /* renamed from: d */
        private final InterfaceC6815i<Collection<InterfaceC11947m>> f32977d;

        /* renamed from: e */
        final /* synthetic */ C12719n f32978e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tg.n$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C12721a implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {

            /* renamed from: j */
            final /* synthetic */ C12719n f32979j;

            C12721a(C12719n c12719n) {
                C12720a.this = r1;
                this.f32979j = c12719n;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public Collection<? extends InterfaceC12005z0> invoke(C11638f c11638f) {
                return C12720a.this.m4351m(c11638f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tg.n$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C12722b implements Function1<C11638f, Collection<? extends InterfaceC11989u0>> {

            /* renamed from: j */
            final /* synthetic */ C12719n f32981j;

            C12722b(C12719n c12719n) {
                C12720a.this = r1;
                this.f32981j = c12719n;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public Collection<? extends InterfaceC11989u0> invoke(C11638f c11638f) {
                return C12720a.this.m4350n(c11638f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tg.n$a$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C12723c implements Function0<Collection<InterfaceC11947m>> {

            /* renamed from: j */
            final /* synthetic */ C12719n f32983j;

            C12723c(C12719n c12719n) {
                C12720a.this = r1;
                this.f32983j = c12719n;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public Collection<InterfaceC11947m> invoke() {
                return C12720a.this.m4352l();
            }
        }

        /* renamed from: tg.n$a$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C12724d extends AbstractC12764i {

            /* renamed from: a */
            final /* synthetic */ Set f32985a;

            C12724d(Set set) {
                C12720a.this = r1;
                this.f32985a = set;
            }

            /* renamed from: f */
            private static /* synthetic */ void m4344f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // th.AbstractC12765j
            /* renamed from: a */
            public void mo4076a(InterfaceC11902b interfaceC11902b) {
                if (interfaceC11902b == null) {
                    m4344f(0);
                }
                C12766k.m4062K(interfaceC11902b, null);
                this.f32985a.add(interfaceC11902b);
            }

            @Override // th.AbstractC12764i
            /* renamed from: e */
            protected void mo4077e(InterfaceC11902b interfaceC11902b, InterfaceC11902b interfaceC11902b2) {
                if (interfaceC11902b == null) {
                    m4344f(1);
                }
                if (interfaceC11902b2 == null) {
                    m4344f(2);
                }
            }
        }

        public C12720a(C12719n c12719n, InterfaceC6821n interfaceC6821n) {
            if (interfaceC6821n == null) {
                m4356h(0);
            }
            this.f32978e = c12719n;
            this.f32975b = interfaceC6821n.mo21861i(new C12721a(c12719n));
            this.f32976c = interfaceC6821n.mo21861i(new C12722b(c12719n));
            this.f32977d = interfaceC6821n.mo21867c(new C12723c(c12719n));
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:122:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x005d  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m4356h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.C12719n.C12720a.m4356h(int):void");
        }

        /* renamed from: l */
        public Collection<InterfaceC11947m> m4352l() {
            HashSet hashSet = new HashSet();
            for (C11638f c11638f : (Set) this.f32978e.f32973t.invoke()) {
                EnumC14023d enumC14023d = EnumC14023d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(mo4362a(c11638f, enumC14023d));
                hashSet.addAll(mo4360c(c11638f, enumC14023d));
            }
            return hashSet;
        }

        /* renamed from: m */
        public Collection<? extends InterfaceC12005z0> m4351m(C11638f c11638f) {
            if (c11638f == null) {
                m4356h(8);
            }
            return m4348p(c11638f, m4349o().mo4362a(c11638f, EnumC14023d.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: n */
        public Collection<? extends InterfaceC11989u0> m4350n(C11638f c11638f) {
            if (c11638f == null) {
                m4356h(4);
            }
            return m4348p(c11638f, m4349o().mo4360c(c11638f, EnumC14023d.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: o */
        private InterfaceC0194h m4349o() {
            InterfaceC0194h mo3553o = this.f32978e.mo4173k().mo2791m().iterator().next().mo3553o();
            if (mo3553o == null) {
                m4356h(9);
            }
            return mo3553o;
        }

        /* renamed from: p */
        private <D extends InterfaceC11902b> Collection<? extends D> m4348p(C11638f c11638f, Collection<? extends D> collection) {
            if (c11638f == null) {
                m4356h(10);
            }
            if (collection == null) {
                m4356h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C12766k.f33113f.m4039v(c11638f, collection, Collections.emptySet(), this.f32978e, new C12724d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0194h
        /* renamed from: a */
        public Collection<? extends InterfaceC12005z0> mo4362a(C11638f c11638f, InterfaceC14020b interfaceC14020b) {
            if (c11638f == null) {
                m4356h(5);
            }
            if (interfaceC14020b == null) {
                m4356h(6);
            }
            Collection<? extends InterfaceC12005z0> invoke = this.f32975b.invoke(c11638f);
            if (invoke == null) {
                m4356h(7);
            }
            return invoke;
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0194h
        /* renamed from: b */
        public Set<C11638f> mo4361b() {
            Set<C11638f> set = (Set) this.f32978e.f32973t.invoke();
            if (set == null) {
                m4356h(17);
            }
            return set;
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0194h
        /* renamed from: c */
        public Collection<? extends InterfaceC11989u0> mo4360c(C11638f c11638f, InterfaceC14020b interfaceC14020b) {
            if (c11638f == null) {
                m4356h(1);
            }
            if (interfaceC14020b == null) {
                m4356h(2);
            }
            Collection<? extends InterfaceC11989u0> invoke = this.f32976c.invoke(c11638f);
            if (invoke == null) {
                m4356h(3);
            }
            return invoke;
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0194h
        /* renamed from: d */
        public Set<C11638f> mo4359d() {
            Set<C11638f> set = (Set) this.f32978e.f32973t.invoke();
            if (set == null) {
                m4356h(19);
            }
            return set;
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0200k
        /* renamed from: e */
        public Collection<InterfaceC11947m> mo4358e(C0185d c0185d, Function1<? super C11638f, Boolean> function1) {
            if (c0185d == null) {
                m4356h(13);
            }
            if (function1 == null) {
                m4356h(14);
            }
            Collection<InterfaceC11947m> invoke = this.f32977d.invoke();
            if (invoke == null) {
                m4356h(15);
            }
            return invoke;
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0194h
        /* renamed from: f */
        public Set<C11638f> mo4357f() {
            Set<C11638f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                m4356h(18);
            }
            return emptySet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C12719n(InterfaceC6821n interfaceC6821n, InterfaceC11914e interfaceC11914e, AbstractC7264g0 abstractC7264g0, C11638f c11638f, InterfaceC6815i<Set<C11638f>> interfaceC6815i, InterfaceC12155g interfaceC12155g, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC6821n, interfaceC11914e, c11638f, interfaceC11900a1, false);
        if (interfaceC6821n == null) {
            m4365E0(6);
        }
        if (interfaceC11914e == null) {
            m4365E0(7);
        }
        if (abstractC7264g0 == null) {
            m4365E0(8);
        }
        if (c11638f == null) {
            m4365E0(9);
        }
        if (interfaceC6815i == null) {
            m4365E0(10);
        }
        if (interfaceC12155g == null) {
            m4365E0(11);
        }
        if (interfaceC11900a1 == null) {
            m4365E0(12);
        }
        this.f32974u = interfaceC12155g;
        this.f32971r = new C7289l(this, Collections.emptyList(), Collections.singleton(abstractC7264g0), interfaceC6821n);
        this.f32972s = new C12720a(this, interfaceC6821n);
        this.f32973t = interfaceC6815i;
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m4365E0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: L0 */
    public static C12719n m4363L0(InterfaceC6821n interfaceC6821n, InterfaceC11914e interfaceC11914e, C11638f c11638f, InterfaceC6815i<Set<C11638f>> interfaceC6815i, InterfaceC12155g interfaceC12155g, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC6821n == null) {
            m4365E0(0);
        }
        if (interfaceC11914e == null) {
            m4365E0(1);
        }
        if (c11638f == null) {
            m4365E0(2);
        }
        if (interfaceC6815i == null) {
            m4365E0(3);
        }
        if (interfaceC12155g == null) {
            m4365E0(4);
        }
        if (interfaceC11900a1 == null) {
            m4365E0(5);
        }
        return new C12719n(interfaceC6821n, interfaceC11914e, interfaceC11914e.mo4224p(), c11638f, interfaceC6815i, interfaceC12155g, interfaceC11900a1);
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: C */
    public InterfaceC11910d mo4187C() {
        return null;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: I0 */
    public boolean mo4185I0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: R */
    public AbstractC11930h1<AbstractC7302o0> mo4179R() {
        return null;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: Y */
    public boolean mo4177Y() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: c0 */
    public boolean mo4176c0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: g */
    public EnumC11918f mo4175g() {
        EnumC11918f enumC11918f = EnumC11918f.ENUM_ENTRY;
        if (enumC11918f == null) {
            m4365E0(18);
        }
        return enumC11918f;
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        InterfaceC12155g interfaceC12155g = this.f32974u;
        if (interfaceC12155g == null) {
            m4365E0(21);
        }
        return interfaceC12155g;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u abstractC11988u = C11974t.f30970e;
        if (abstractC11988u == null) {
            m4365E0(20);
        }
        return abstractC11988u;
    }

    @Override // p305qg.InterfaceC11914e
    public boolean isInline() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: j0 */
    public boolean mo4174j0() {
        return false;
    }

    @Override // p305qg.InterfaceC11927h
    /* renamed from: k */
    public InterfaceC7265g1 mo4173k() {
        InterfaceC7265g1 interfaceC7265g1 = this.f32971r;
        if (interfaceC7265g1 == null) {
            m4365E0(17);
        }
        return interfaceC7265g1;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: l */
    public Collection<InterfaceC11910d> mo4171l() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4365E0(16);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: l0 */
    public InterfaceC0194h mo4170l0() {
        InterfaceC0194h.C0197b c0197b = InterfaceC0194h.C0197b.f649b;
        if (c0197b == null) {
            m4365E0(15);
        }
        return c0197b;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: m0 */
    public InterfaceC11914e mo4169m0() {
        return null;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11931i
    /* renamed from: q */
    public List<InterfaceC11920f1> mo4168q() {
        List<InterfaceC11920f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4365E0(22);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11911d0
    /* renamed from: r */
    public EnumC11915e0 mo4167r() {
        EnumC11915e0 enumC11915e0 = EnumC11915e0.FINAL;
        if (enumC11915e0 == null) {
            m4365E0(19);
        }
        return enumC11915e0;
    }

    @Override // tg.AbstractC12739t
    /* renamed from: r0 */
    public InterfaceC0194h mo4166r0(AbstractC7592g abstractC7592g) {
        if (abstractC7592g == null) {
            m4365E0(13);
        }
        InterfaceC0194h interfaceC0194h = this.f32972s;
        if (interfaceC0194h == null) {
            m4365E0(14);
        }
        return interfaceC0194h;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: y */
    public Collection<InterfaceC11914e> mo4165y() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4365E0(23);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11931i
    /* renamed from: z */
    public boolean mo4164z() {
        return false;
    }
}