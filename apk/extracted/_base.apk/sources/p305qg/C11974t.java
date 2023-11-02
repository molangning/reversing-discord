package p305qg;

import bi.InterfaceC2315g;
import bi.InterfaceC2316h;
import bi.InterfaceC2317i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.C9560w;
import p142hi.AbstractC7264g0;
import p142hi.C7334w;
import p271oi.InterfaceC11148l;
import p305qg.C11949m1;
import p327ri.C12242a;
import tg.InterfaceC12705i0;
import th.C12758e;

/* renamed from: qg.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C11974t {

    /* renamed from: a */
    public static final AbstractC11988u f30966a;

    /* renamed from: b */
    public static final AbstractC11988u f30967b;

    /* renamed from: c */
    public static final AbstractC11988u f30968c;

    /* renamed from: d */
    public static final AbstractC11988u f30969d;

    /* renamed from: e */
    public static final AbstractC11988u f30970e;

    /* renamed from: f */
    public static final AbstractC11988u f30971f;

    /* renamed from: g */
    public static final AbstractC11988u f30972g;

    /* renamed from: h */
    public static final AbstractC11988u f30973h;

    /* renamed from: i */
    public static final AbstractC11988u f30974i;

    /* renamed from: j */
    public static final Set<AbstractC11988u> f30975j;

    /* renamed from: k */
    private static final Map<AbstractC11988u, Integer> f30976k;

    /* renamed from: l */
    public static final AbstractC11988u f30977l;

    /* renamed from: m */
    private static final InterfaceC2315g f30978m;

    /* renamed from: n */
    public static final InterfaceC2315g f30979n;
    @Deprecated

    /* renamed from: o */
    public static final InterfaceC2315g f30980o;

    /* renamed from: p */
    private static final InterfaceC11148l f30981p;

    /* renamed from: q */
    private static final Map<AbstractC11963n1, AbstractC11988u> f30982q;

    /* renamed from: qg.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11975a implements InterfaceC2315g {
        C11975a() {
        }

        @Override // bi.InterfaceC2315g
        public AbstractC7264g0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: qg.t$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11976b implements InterfaceC2315g {
        C11976b() {
        }

        @Override // bi.InterfaceC2315g
        public AbstractC7264g0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: qg.t$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11977c implements InterfaceC2315g {
        C11977c() {
        }

        @Override // bi.InterfaceC2315g
        public AbstractC7264g0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: qg.t$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11978d extends AbstractC11970r {
        C11978d(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6668g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m6667h(InterfaceC11947m interfaceC11947m) {
            if (interfaceC11947m == null) {
                m6668g(0);
            }
            if (C12758e.m4102j(interfaceC11947m) == InterfaceC11905b1.f30908a) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [qg.m, qg.q] */
        /* JADX WARN: Type inference failed for: r4v1, types: [qg.m] */
        /* JADX WARN: Type inference failed for: r4v2, types: [qg.m] */
        /* JADX WARN: Type inference failed for: r4v4, types: [qg.m] */
        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == 0) {
                m6668g(1);
            }
            if (interfaceC11947m == null) {
                m6668g(2);
            }
            if (C12758e.m4115J(interfaceC11968q) && m6667h(interfaceC11947m)) {
                return C11974t.m6673f(interfaceC11968q, interfaceC11947m);
            }
            if (interfaceC11968q instanceof InterfaceC11944l) {
                InterfaceC11931i mo4163b = ((InterfaceC11944l) interfaceC11968q).mo4163b();
                if (z && C12758e.m4118G(mo4163b) && C12758e.m4115J(mo4163b) && (interfaceC11947m instanceof InterfaceC11944l) && C12758e.m4115J(interfaceC11947m.mo4163b()) && C11974t.m6673f(interfaceC11968q, interfaceC11947m)) {
                    return true;
                }
            }
            while (interfaceC11968q != 0) {
                interfaceC11968q = interfaceC11968q.mo4163b();
                if (interfaceC11968q instanceof InterfaceC11914e) {
                    if (!C12758e.m4088x(interfaceC11968q)) {
                        break;
                    }
                }
                if (interfaceC11968q instanceof InterfaceC11945l0) {
                    break;
                }
            }
            if (interfaceC11968q == 0) {
                return false;
            }
            while (interfaceC11947m != null) {
                if (interfaceC11968q == interfaceC11947m) {
                    return true;
                }
                if (interfaceC11947m instanceof InterfaceC11945l0) {
                    if ((interfaceC11968q instanceof InterfaceC11945l0) && interfaceC11968q.mo4161e().equals(((InterfaceC11945l0) interfaceC11947m).mo4161e()) && C12758e.m4110b(interfaceC11947m, interfaceC11968q)) {
                        return true;
                    }
                    return false;
                }
                interfaceC11947m = interfaceC11947m.mo4163b();
            }
            return false;
        }
    }

    /* renamed from: qg.t$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11979e extends AbstractC11970r {
        C11979e(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6666g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            InterfaceC11947m m4095q;
            if (interfaceC11968q == null) {
                m6666g(0);
            }
            if (interfaceC11947m == null) {
                m6666g(1);
            }
            if (C11974t.f30966a.mo307e(interfaceC2315g, interfaceC11968q, interfaceC11947m, z)) {
                if (interfaceC2315g == C11974t.f30979n) {
                    return true;
                }
                if (interfaceC2315g != C11974t.f30978m && (m4095q = C12758e.m4095q(interfaceC11968q, InterfaceC11914e.class)) != null && (interfaceC2315g instanceof InterfaceC2317i)) {
                    return ((InterfaceC2317i) interfaceC2315g).mo33657s().mo4221a().equals(m4095q.mo4221a());
                }
            }
            return false;
        }
    }

    /* renamed from: qg.t$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11980f extends AbstractC11970r {
        C11980f(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6665g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m6664h(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11914e interfaceC11914e) {
            AbstractC7264g0 type;
            if (interfaceC11968q == null) {
                m6665g(2);
            }
            if (interfaceC11914e == null) {
                m6665g(3);
            }
            if (interfaceC2315g == C11974t.f30980o) {
                return false;
            }
            if (!(interfaceC11968q instanceof InterfaceC11902b) || (interfaceC11968q instanceof InterfaceC11944l) || interfaceC2315g == C11974t.f30979n) {
                return true;
            }
            if (interfaceC2315g == C11974t.f30978m || interfaceC2315g == null) {
                return false;
            }
            if (interfaceC2315g instanceof InterfaceC2316h) {
                type = ((InterfaceC2316h) interfaceC2315g).m33658b();
            } else {
                type = interfaceC2315g.getType();
            }
            if (!C12758e.m4116I(type, interfaceC11914e) && !C7334w.m20938a(type)) {
                return false;
            }
            return true;
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            InterfaceC11914e interfaceC11914e;
            if (interfaceC11968q == null) {
                m6665g(0);
            }
            if (interfaceC11947m == null) {
                m6665g(1);
            }
            InterfaceC11914e interfaceC11914e2 = (InterfaceC11914e) C12758e.m4095q(interfaceC11968q, InterfaceC11914e.class);
            InterfaceC11914e interfaceC11914e3 = (InterfaceC11914e) C12758e.m4094r(interfaceC11947m, InterfaceC11914e.class, false);
            if (interfaceC11914e3 == null) {
                return false;
            }
            if (interfaceC11914e2 != null && C12758e.m4088x(interfaceC11914e2) && (interfaceC11914e = (InterfaceC11914e) C12758e.m4095q(interfaceC11914e2, InterfaceC11914e.class)) != null && C12758e.m4117H(interfaceC11914e3, interfaceC11914e)) {
                return true;
            }
            InterfaceC11968q m4112M = C12758e.m4112M(interfaceC11968q);
            InterfaceC11914e interfaceC11914e4 = (InterfaceC11914e) C12758e.m4095q(m4112M, InterfaceC11914e.class);
            if (interfaceC11914e4 == null) {
                return false;
            }
            if (C12758e.m4117H(interfaceC11914e3, interfaceC11914e4) && m6664h(interfaceC2315g, m4112M, interfaceC11914e3)) {
                return true;
            }
            return mo307e(interfaceC2315g, interfaceC11968q, interfaceC11914e3.mo4163b(), z);
        }
    }

    /* renamed from: qg.t$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11981g extends AbstractC11970r {
        C11981g(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6663g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m6663g(0);
            }
            if (interfaceC11947m == null) {
                m6663g(1);
            }
            if (!C12758e.m4105g(interfaceC11947m).mo4192u0(C12758e.m4105g(interfaceC11968q))) {
                return false;
            }
            return C11974t.f30981p.mo9102a(interfaceC11968q, interfaceC11947m);
        }
    }

    /* renamed from: qg.t$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11982h extends AbstractC11970r {
        C11982h(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6662g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m6662g(0);
            }
            if (interfaceC11947m == null) {
                m6662g(1);
            }
            return true;
        }
    }

    /* renamed from: qg.t$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11983i extends AbstractC11970r {
        C11983i(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6661g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m6661g(0);
            }
            if (interfaceC11947m == null) {
                m6661g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: qg.t$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11984j extends AbstractC11970r {
        C11984j(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6660g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m6660g(0);
            }
            if (interfaceC11947m == null) {
                m6660g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: qg.t$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11985k extends AbstractC11970r {
        C11985k(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6659g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m6659g(0);
            }
            if (interfaceC11947m == null) {
                m6659g(1);
            }
            return false;
        }
    }

    /* renamed from: qg.t$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C11986l extends AbstractC11970r {
        C11986l(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m6658g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m6658g(0);
            }
            if (interfaceC11947m == null) {
                m6658g(1);
            }
            return false;
        }
    }

    static {
        Set m14002i;
        InterfaceC11148l interfaceC11148l;
        C11978d c11978d = new C11978d(C11949m1.C11954e.f30952c);
        f30966a = c11978d;
        C11979e c11979e = new C11979e(C11949m1.C11955f.f30953c);
        f30967b = c11979e;
        C11980f c11980f = new C11980f(C11949m1.C11956g.f30954c);
        f30968c = c11980f;
        C11981g c11981g = new C11981g(C11949m1.C11951b.f30949c);
        f30969d = c11981g;
        C11982h c11982h = new C11982h(C11949m1.C11957h.f30955c);
        f30970e = c11982h;
        C11983i c11983i = new C11983i(C11949m1.C11953d.f30951c);
        f30971f = c11983i;
        C11984j c11984j = new C11984j(C11949m1.C11950a.f30948c);
        f30972g = c11984j;
        C11985k c11985k = new C11985k(C11949m1.C11952c.f30950c);
        f30973h = c11985k;
        C11986l c11986l = new C11986l(C11949m1.C11958i.f30956c);
        f30974i = c11986l;
        m14002i = C9560w.m14002i(c11978d, c11979e, c11981g, c11983i);
        f30975j = Collections.unmodifiableSet(m14002i);
        HashMap m5671e = C12242a.m5671e(4);
        m5671e.put(c11979e, 0);
        m5671e.put(c11978d, 0);
        m5671e.put(c11981g, 1);
        m5671e.put(c11980f, 1);
        m5671e.put(c11982h, 2);
        f30976k = Collections.unmodifiableMap(m5671e);
        f30977l = c11982h;
        f30978m = new C11975a();
        f30979n = new C11976b();
        f30980o = new C11977c();
        Iterator it = ServiceLoader.load(InterfaceC11148l.class, InterfaceC11148l.class.getClassLoader()).iterator();
        if (it.hasNext()) {
            interfaceC11148l = (InterfaceC11148l) it.next();
        } else {
            interfaceC11148l = InterfaceC11148l.C11149a.f29127a;
        }
        f30981p = interfaceC11148l;
        f30982q = new HashMap();
        m6670i(c11978d);
        m6670i(c11979e);
        m6670i(c11980f);
        m6670i(c11981g);
        m6670i(c11982h);
        m6670i(c11983i);
        m6670i(c11984j);
        m6670i(c11985k);
        m6670i(c11986l);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m6678a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p305qg.C11974t.m6678a(int):void");
    }

    /* renamed from: d */
    public static Integer m6675d(AbstractC11988u abstractC11988u, AbstractC11988u abstractC11988u2) {
        if (abstractC11988u == null) {
            m6678a(12);
        }
        if (abstractC11988u2 == null) {
            m6678a(13);
        }
        Integer m6657a = abstractC11988u.m6657a(abstractC11988u2);
        if (m6657a != null) {
            return m6657a;
        }
        Integer m6657a2 = abstractC11988u2.m6657a(abstractC11988u);
        if (m6657a2 != null) {
            return Integer.valueOf(-m6657a2.intValue());
        }
        return null;
    }

    /* renamed from: e */
    public static InterfaceC11968q m6674e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
        InterfaceC11968q m6674e;
        if (interfaceC11968q == null) {
            m6678a(8);
        }
        if (interfaceC11947m == null) {
            m6678a(9);
        }
        for (InterfaceC11968q interfaceC11968q2 = (InterfaceC11968q) interfaceC11968q.mo4221a(); interfaceC11968q2 != null && interfaceC11968q2.getVisibility() != f30971f; interfaceC11968q2 = (InterfaceC11968q) C12758e.m4095q(interfaceC11968q2, InterfaceC11968q.class)) {
            if (!interfaceC11968q2.getVisibility().mo307e(interfaceC2315g, interfaceC11968q2, interfaceC11947m, z)) {
                return interfaceC11968q2;
            }
        }
        if ((interfaceC11968q instanceof InterfaceC12705i0) && (m6674e = m6674e(interfaceC2315g, ((InterfaceC12705i0) interfaceC11968q).mo4420P(), interfaceC11947m, z)) != null) {
            return m6674e;
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m6673f(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2) {
        if (interfaceC11947m == null) {
            m6678a(6);
        }
        if (interfaceC11947m2 == null) {
            m6678a(7);
        }
        InterfaceC11905b1 m4102j = C12758e.m4102j(interfaceC11947m2);
        if (m4102j != InterfaceC11905b1.f30908a) {
            return m4102j.equals(C12758e.m4102j(interfaceC11947m));
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m6672g(AbstractC11988u abstractC11988u) {
        if (abstractC11988u == null) {
            m6678a(14);
        }
        if (abstractC11988u != f30966a && abstractC11988u != f30967b) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m6671h(InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
        if (interfaceC11968q == null) {
            m6678a(2);
        }
        if (interfaceC11947m == null) {
            m6678a(3);
        }
        if (m6674e(f30979n, interfaceC11968q, interfaceC11947m, z) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static void m6670i(AbstractC11988u abstractC11988u) {
        f30982q.put(abstractC11988u.mo6656b(), abstractC11988u);
    }

    /* renamed from: j */
    public static AbstractC11988u m6669j(AbstractC11963n1 abstractC11963n1) {
        if (abstractC11963n1 == null) {
            m6678a(15);
        }
        AbstractC11988u abstractC11988u = f30982q.get(abstractC11963n1);
        if (abstractC11988u != null) {
            return abstractC11988u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC11963n1);
    }
}
