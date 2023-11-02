package th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p142hi.AbstractC7264g0;
import p142hi.C7229d0;
import p142hi.C7235f;
import p142hi.C7244f1;
import p142hi.C7276i0;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7589f;
import p161ii.AbstractC7592g;
import p161ii.InterfaceC7587e;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11911d0;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11968q;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p327ri.C12263f;
import p429xh.C13801c;
import ph.C11638f;
import tg.AbstractC12683b0;
import tg.AbstractC12727p;
import tg.C12685c0;
import th.InterfaceC12759f;

/* renamed from: th.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12766k {

    /* renamed from: e */
    private static final List<InterfaceC12759f> f33112e;

    /* renamed from: f */
    public static final C12766k f33113f;

    /* renamed from: g */
    private static final InterfaceC7587e.InterfaceC7588a f33114g;

    /* renamed from: a */
    private final AbstractC7592g f33115a;

    /* renamed from: b */
    private final AbstractC7589f f33116b;

    /* renamed from: c */
    private final InterfaceC7587e.InterfaceC7588a f33117c;

    /* renamed from: d */
    private final Function2<AbstractC7264g0, AbstractC7264g0, Boolean> f33118d;

    /* renamed from: th.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C12767a implements InterfaceC7587e.InterfaceC7588a {
        C12767a() {
        }

        /* renamed from: b */
        private static /* synthetic */ void m4033b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p161ii.InterfaceC7587e.InterfaceC7588a
        /* renamed from: a */
        public boolean mo4034a(InterfaceC7265g1 interfaceC7265g1, InterfaceC7265g1 interfaceC7265g12) {
            if (interfaceC7265g1 == null) {
                m4033b(0);
            }
            if (interfaceC7265g12 == null) {
                m4033b(1);
            }
            return interfaceC7265g1.equals(interfaceC7265g12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [D] */
    /* renamed from: th.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12768b<D> implements Function2<D, D, Pair<InterfaceC11897a, InterfaceC11897a>> {
        C12768b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lqg/a;Lqg/a;>; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public Pair invoke(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2) {
            return new Pair(interfaceC11897a, interfaceC11897a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12769c implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC11947m f33119j;

        C12769c(InterfaceC11947m interfaceC11947m) {
            this.f33119j = interfaceC11947m;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public Boolean invoke(InterfaceC11902b interfaceC11902b) {
            return Boolean.valueOf(interfaceC11902b.mo4163b() == this.f33119j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.k$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12770d implements Function1<InterfaceC11902b, InterfaceC11897a> {
        C12770d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public InterfaceC11902b invoke(InterfaceC11902b interfaceC11902b) {
            return interfaceC11902b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.k$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12771e implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC11914e f33120j;

        C12771e(InterfaceC11914e interfaceC11914e) {
            this.f33120j = interfaceC11914e;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public Boolean invoke(InterfaceC11902b interfaceC11902b) {
            boolean z = false;
            if (!C11974t.m6672g(interfaceC11902b.getVisibility()) && C11974t.m6671h(interfaceC11902b, this.f33120j, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.k$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12772f implements Function1<InterfaceC11902b, InterfaceC11897a> {
        C12772f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public InterfaceC11897a invoke(InterfaceC11902b interfaceC11902b) {
            return interfaceC11902b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.k$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12773g implements Function1<InterfaceC11902b, Unit> {

        /* renamed from: j */
        final /* synthetic */ AbstractC12765j f33121j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC11902b f33122k;

        C12773g(AbstractC12765j abstractC12765j, InterfaceC11902b interfaceC11902b) {
            this.f33121j = abstractC12765j;
            this.f33122k = interfaceC11902b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public Unit invoke(InterfaceC11902b interfaceC11902b) {
            this.f33121j.mo4075b(this.f33122k, interfaceC11902b);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.k$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C12774h {

        /* renamed from: a */
        static final /* synthetic */ int[] f33123a;

        /* renamed from: b */
        static final /* synthetic */ int[] f33124b;

        /* renamed from: c */
        static final /* synthetic */ int[] f33125c;

        static {
            int[] iArr = new int[EnumC11915e0.values().length];
            f33125c = iArr;
            try {
                iArr[EnumC11915e0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33125c[EnumC11915e0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33125c[EnumC11915e0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33125c[EnumC11915e0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C12775i.EnumC12776a.values().length];
            f33124b = iArr2;
            try {
                iArr2[C12775i.EnumC12776a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33124b[C12775i.EnumC12776a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33124b[C12775i.EnumC12776a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC12759f.EnumC12761b.values().length];
            f33123a = iArr3;
            try {
                iArr3[InterfaceC12759f.EnumC12761b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33123a[InterfaceC12759f.EnumC12761b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33123a[InterfaceC12759f.EnumC12761b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33123a[InterfaceC12759f.EnumC12761b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: th.k$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12775i {

        /* renamed from: c */
        private static final C12775i f33126c = new C12775i(EnumC12776a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        private final EnumC12776a f33127a;

        /* renamed from: b */
        private final String f33128b;

        /* renamed from: th.k$i$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public enum EnumC12776a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public C12775i(EnumC12776a enumC12776a, String str) {
            if (enumC12776a == null) {
                m4026a(3);
            }
            if (str == null) {
                m4026a(4);
            }
            this.f33127a = enumC12776a;
            this.f33128b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m4026a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: th.C12766k.C12775i.m4026a(int):void");
        }

        /* renamed from: b */
        public static C12775i m4025b(String str) {
            if (str == null) {
                m4026a(2);
            }
            return new C12775i(EnumC12776a.CONFLICT, str);
        }

        /* renamed from: d */
        public static C12775i m4023d(String str) {
            if (str == null) {
                m4026a(1);
            }
            return new C12775i(EnumC12776a.INCOMPATIBLE, str);
        }

        /* renamed from: e */
        public static C12775i m4022e() {
            C12775i c12775i = f33126c;
            if (c12775i == null) {
                m4026a(0);
            }
            return c12775i;
        }

        /* renamed from: c */
        public EnumC12776a m4024c() {
            EnumC12776a enumC12776a = this.f33127a;
            if (enumC12776a == null) {
                m4026a(5);
            }
            return enumC12776a;
        }
    }

    static {
        List<InterfaceC12759f> m14075C0;
        m14075C0 = C9553r.m14075C0(ServiceLoader.load(InterfaceC12759f.class, InterfaceC12759f.class.getClassLoader()));
        f33112e = m14075C0;
        C12767a c12767a = new C12767a();
        f33114g = c12767a;
        f33113f = new C12766k(c12767a, AbstractC7592g.C7593a.f20882a, AbstractC7589f.C7590a.f20881a, null);
    }

    private C12766k(InterfaceC7587e.InterfaceC7588a interfaceC7588a, AbstractC7592g abstractC7592g, AbstractC7589f abstractC7589f, Function2<AbstractC7264g0, AbstractC7264g0, Boolean> function2) {
        if (interfaceC7588a == null) {
            m4060a(5);
        }
        if (abstractC7592g == null) {
            m4060a(6);
        }
        if (abstractC7589f == null) {
            m4060a(7);
        }
        this.f33117c = interfaceC7588a;
        this.f33115a = abstractC7592g;
        this.f33116b = abstractC7589f;
        this.f33118d = function2;
    }

    /* renamed from: A */
    private static boolean m4072A(InterfaceC11987t0 interfaceC11987t0, InterfaceC11987t0 interfaceC11987t02) {
        if (interfaceC11987t0 == null || interfaceC11987t02 == null) {
            return true;
        }
        return m4065H(interfaceC11987t0, interfaceC11987t02);
    }

    /* renamed from: B */
    public static boolean m4071B(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2) {
        if (interfaceC11897a == null) {
            m4060a(67);
        }
        if (interfaceC11897a2 == null) {
            m4060a(68);
        }
        AbstractC7264g0 returnType = interfaceC11897a.getReturnType();
        AbstractC7264g0 returnType2 = interfaceC11897a2.getReturnType();
        if (!m4065H(interfaceC11897a, interfaceC11897a2)) {
            return false;
        }
        C7244f1 m4049l = f33113f.m4049l(interfaceC11897a.getTypeParameters(), interfaceC11897a2.getTypeParameters());
        if (interfaceC11897a instanceof InterfaceC11998y) {
            return m4066G(interfaceC11897a, returnType, interfaceC11897a2, returnType2, m4049l);
        }
        if (interfaceC11897a instanceof InterfaceC11989u0) {
            InterfaceC11989u0 interfaceC11989u0 = (InterfaceC11989u0) interfaceC11897a;
            InterfaceC11989u0 interfaceC11989u02 = (InterfaceC11989u0) interfaceC11897a2;
            if (!m4072A(interfaceC11989u0.mo4507h(), interfaceC11989u02.mo4507h())) {
                return false;
            }
            if (interfaceC11989u0.mo4342L() && interfaceC11989u02.mo4342L()) {
                return C7235f.f19632a.m21171k(m4049l, returnType.mo20916Q0(), returnType2.mo20916Q0());
            }
            if ((!interfaceC11989u0.mo4342L() && interfaceC11989u02.mo4342L()) || !m4066G(interfaceC11897a, returnType, interfaceC11897a2, returnType2, m4049l)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Unexpected callable: " + interfaceC11897a.getClass());
    }

    /* renamed from: C */
    private static boolean m4070C(InterfaceC11897a interfaceC11897a, Collection<InterfaceC11897a> collection) {
        if (interfaceC11897a == null) {
            m4060a(71);
        }
        if (collection == null) {
            m4060a(72);
        }
        for (InterfaceC11897a interfaceC11897a2 : collection) {
            if (!m4071B(interfaceC11897a, interfaceC11897a2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m4066G(InterfaceC11897a interfaceC11897a, AbstractC7264g0 abstractC7264g0, InterfaceC11897a interfaceC11897a2, AbstractC7264g0 abstractC7264g02, C7244f1 c7244f1) {
        if (interfaceC11897a == null) {
            m4060a(73);
        }
        if (abstractC7264g0 == null) {
            m4060a(74);
        }
        if (interfaceC11897a2 == null) {
            m4060a(75);
        }
        if (abstractC7264g02 == null) {
            m4060a(76);
        }
        if (c7244f1 == null) {
            m4060a(77);
        }
        return C7235f.f19632a.m21164r(c7244f1, abstractC7264g0.mo20916Q0(), abstractC7264g02.mo20916Q0());
    }

    /* renamed from: H */
    private static boolean m4065H(InterfaceC11968q interfaceC11968q, InterfaceC11968q interfaceC11968q2) {
        if (interfaceC11968q == null) {
            m4060a(69);
        }
        if (interfaceC11968q2 == null) {
            m4060a(70);
        }
        Integer m6675d = C11974t.m6675d(interfaceC11968q.getVisibility(), interfaceC11968q2.getVisibility());
        if (m6675d != null && m6675d.intValue() < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m4064I(InterfaceC11911d0 interfaceC11911d0, InterfaceC11911d0 interfaceC11911d02, boolean z) {
        if (interfaceC11911d0 == null) {
            m4060a(57);
        }
        if (interfaceC11911d02 == null) {
            m4060a(58);
        }
        if (!C11974t.m6672g(interfaceC11911d02.getVisibility()) && C11974t.m6671h(interfaceC11911d02, interfaceC11911d0, z)) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static <D extends InterfaceC11897a> boolean m4063J(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            m4060a(13);
        }
        if (d2 == null) {
            m4060a(14);
        }
        if (!d.equals(d2) && C12752c.f33094a.m4152f(d.mo4221a(), d2.mo4221a(), z, z2)) {
            return true;
        }
        InterfaceC11897a mo4221a = d2.mo4221a();
        for (InterfaceC11897a interfaceC11897a : C12758e.m4108d(d)) {
            if (C12752c.f33094a.m4152f(mo4221a, interfaceC11897a, z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static void m4062K(InterfaceC11902b interfaceC11902b, Function1<InterfaceC11902b, Unit> function1) {
        AbstractC11988u abstractC11988u;
        Function1<InterfaceC11902b, Unit> function12;
        if (interfaceC11902b == null) {
            m4060a(107);
        }
        for (InterfaceC11902b interfaceC11902b2 : interfaceC11902b.mo4310d()) {
            if (interfaceC11902b2.getVisibility() == C11974t.f30972g) {
                m4062K(interfaceC11902b2, function1);
            }
        }
        if (interfaceC11902b.getVisibility() != C11974t.f30972g) {
            return;
        }
        AbstractC11988u m4053h = m4053h(interfaceC11902b);
        if (m4053h == null) {
            if (function1 != null) {
                function1.invoke(interfaceC11902b);
            }
            abstractC11988u = C11974t.f30970e;
        } else {
            abstractC11988u = m4053h;
        }
        if (interfaceC11902b instanceof C12685c0) {
            ((C12685c0) interfaceC11902b).m4512c1(abstractC11988u);
            for (InterfaceC11987t0 interfaceC11987t0 : ((InterfaceC11989u0) interfaceC11902b).mo4506v()) {
                if (m4053h == null) {
                    function12 = null;
                } else {
                    function12 = function1;
                }
                m4062K(interfaceC11987t0, function12);
            }
        } else if (interfaceC11902b instanceof AbstractC12727p) {
            ((AbstractC12727p) interfaceC11902b).m4298j1(abstractC11988u);
        } else {
            AbstractC12683b0 abstractC12683b0 = (AbstractC12683b0) interfaceC11902b;
            abstractC12683b0.m4536O0(abstractC11988u);
            if (abstractC11988u != abstractC12683b0.mo4535S().getVisibility()) {
                abstractC12683b0.m4538M0(false);
            }
        }
    }

    /* renamed from: L */
    public static <H> H m4061L(Collection<H> collection, Function1<H, InterfaceC11897a> function1) {
        List m14041i0;
        H h;
        Object m14057S;
        Object m14057S2;
        Object m14057S3;
        Object m14057S4;
        if (collection == null) {
            m4060a(78);
        }
        if (function1 == null) {
            m4060a(79);
        }
        if (collection.size() == 1) {
            m14057S4 = C9553r.m14057S(collection);
            H h2 = (H) m14057S4;
            if (h2 == null) {
                m4060a(80);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        m14041i0 = C9553r.m14041i0(collection, function1);
        m14057S = C9553r.m14057S(collection);
        H h3 = (H) m14057S;
        InterfaceC11897a invoke = function1.invoke(h3);
        for (H h4 : collection) {
            InterfaceC11897a invoke2 = function1.invoke(h4);
            if (m4070C(invoke2, m14041i0)) {
                arrayList.add(h4);
            }
            if (m4071B(invoke2, invoke) && !m4071B(invoke, invoke2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                m4060a(81);
            }
            return h3;
        } else if (arrayList.size() == 1) {
            m14057S3 = C9553r.m14057S(arrayList);
            H h5 = (H) m14057S3;
            if (h5 == null) {
                m4060a(82);
            }
            return h5;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    h = (H) it.next();
                    if (!C7229d0.m21192b(function1.invoke(h).getReturnType())) {
                        break;
                    }
                } else {
                    h = null;
                    break;
                }
            }
            if (h != null) {
                return h;
            }
            m14057S2 = C9553r.m14057S(arrayList);
            H h6 = (H) m14057S2;
            if (h6 == null) {
                m4060a(84);
            }
            return h6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m4060a(int r24) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.C12766k.m4060a(int):void");
    }

    /* renamed from: b */
    private static boolean m4059b(Collection<InterfaceC11902b> collection) {
        boolean m14068J;
        if (collection == null) {
            m4060a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        m14068J = C9553r.m14068J(collection, new C12769c(collection.iterator().next().mo4163b()));
        return m14068J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        r1.remove();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m4058c(p305qg.InterfaceC11920f1 r4, p305qg.InterfaceC11920f1 r5, p142hi.C7244f1 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 49
            m4060a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 50
            m4060a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 51
            m4060a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            hi.g0 r5 = (p142hi.AbstractC7264g0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            hi.g0 r3 = (p142hi.AbstractC7264g0) r3
            boolean r3 = m4057d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: th.C12766k.m4058c(qg.f1, qg.f1, hi.f1):boolean");
    }

    /* renamed from: d */
    private static boolean m4057d(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02, C7244f1 c7244f1) {
        boolean z;
        if (abstractC7264g0 == null) {
            m4060a(46);
        }
        if (abstractC7264g02 == null) {
            m4060a(47);
        }
        if (c7244f1 == null) {
            m4060a(48);
        }
        if (C7276i0.m21083a(abstractC7264g0) && C7276i0.m21083a(abstractC7264g02)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return C7235f.f19632a.m21171k(c7244f1, abstractC7264g0.mo20916Q0(), abstractC7264g02.mo20916Q0());
    }

    /* renamed from: e */
    private static C12775i m4056e(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2) {
        boolean z;
        boolean z2 = true;
        if (interfaceC11897a.mo4329M() == null) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC11897a2.mo4329M() != null) {
            z2 = false;
        }
        if (z != z2) {
            return C12775i.m4023d("Receiver presence mismatch");
        }
        if (interfaceC11897a.mo4301i().size() != interfaceC11897a2.mo4301i().size()) {
            return C12775i.m4023d("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: f */
    private static void m4055f(InterfaceC11902b interfaceC11902b, Set<InterfaceC11902b> set) {
        if (interfaceC11902b == null) {
            m4060a(17);
        }
        if (set == null) {
            m4060a(18);
        }
        if (interfaceC11902b.mo4305g().m6727a()) {
            set.add(interfaceC11902b);
        } else if (!interfaceC11902b.mo4310d().isEmpty()) {
            for (InterfaceC11902b interfaceC11902b2 : interfaceC11902b.mo4310d()) {
                m4055f(interfaceC11902b2, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC11902b);
        }
    }

    /* renamed from: g */
    private static List<AbstractC7264g0> m4054g(InterfaceC11897a interfaceC11897a) {
        InterfaceC11997x0 mo4329M = interfaceC11897a.mo4329M();
        ArrayList arrayList = new ArrayList();
        if (mo4329M != null) {
            arrayList.add(mo4329M.getType());
        }
        for (InterfaceC11936j1 interfaceC11936j1 : interfaceC11897a.mo4301i()) {
            arrayList.add(interfaceC11936j1.getType());
        }
        return arrayList;
    }

    /* renamed from: h */
    private static AbstractC11988u m4053h(InterfaceC11902b interfaceC11902b) {
        if (interfaceC11902b == null) {
            m4060a(108);
        }
        Collection<? extends InterfaceC11902b> mo4310d = interfaceC11902b.mo4310d();
        AbstractC11988u m4040u = m4040u(mo4310d);
        if (m4040u == null) {
            return null;
        }
        if (interfaceC11902b.mo4305g() == InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE) {
            for (InterfaceC11902b interfaceC11902b2 : mo4310d) {
                if (interfaceC11902b2.mo4167r() != EnumC11915e0.ABSTRACT && !interfaceC11902b2.getVisibility().equals(m4040u)) {
                    return null;
                }
            }
            return m4040u;
        }
        return m4040u.mo6653f();
    }

    /* renamed from: i */
    public static C12766k m4052i(AbstractC7592g abstractC7592g, InterfaceC7587e.InterfaceC7588a interfaceC7588a) {
        if (abstractC7592g == null) {
            m4060a(3);
        }
        if (interfaceC7588a == null) {
            m4060a(4);
        }
        return new C12766k(interfaceC7588a, abstractC7592g, AbstractC7589f.C7590a.f20881a, null);
    }

    /* renamed from: j */
    private static void m4051j(Collection<InterfaceC11902b> collection, InterfaceC11914e interfaceC11914e, AbstractC12765j abstractC12765j) {
        AbstractC11988u abstractC11988u;
        if (collection == null) {
            m4060a(85);
        }
        if (interfaceC11914e == null) {
            m4060a(86);
        }
        if (abstractC12765j == null) {
            m4060a(87);
        }
        Collection<InterfaceC11902b> m4041t = m4041t(interfaceC11914e, collection);
        boolean isEmpty = m4041t.isEmpty();
        if (!isEmpty) {
            collection = m4041t;
        }
        EnumC11915e0 m4047n = m4047n(collection, interfaceC11914e);
        if (isEmpty) {
            abstractC11988u = C11974t.f30973h;
        } else {
            abstractC11988u = C11974t.f30972g;
        }
        InterfaceC11902b mo4317X = ((InterfaceC11902b) m4061L(collection, new C12770d())).mo4317X(interfaceC11914e, m4047n, abstractC11988u, InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE, false);
        abstractC12765j.mo4073d(mo4317X, collection);
        abstractC12765j.mo4076a(mo4317X);
    }

    /* renamed from: k */
    private static void m4050k(InterfaceC11914e interfaceC11914e, Collection<InterfaceC11902b> collection, AbstractC12765j abstractC12765j) {
        if (interfaceC11914e == null) {
            m4060a(64);
        }
        if (collection == null) {
            m4060a(65);
        }
        if (abstractC12765j == null) {
            m4060a(66);
        }
        if (m4059b(collection)) {
            for (InterfaceC11902b interfaceC11902b : collection) {
                m4051j(Collections.singleton(interfaceC11902b), interfaceC11914e, abstractC12765j);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            m4051j(m4044q(C12784q.m3930a(linkedList), linkedList, abstractC12765j), interfaceC11914e, abstractC12765j);
        }
    }

    /* renamed from: l */
    private C7244f1 m4049l(List<InterfaceC11920f1> list, List<InterfaceC11920f1> list2) {
        if (list == null) {
            m4060a(42);
        }
        if (list2 == null) {
            m4060a(43);
        }
        if (list.isEmpty()) {
            C7244f1 m4004I0 = new C12777l(null, this.f33117c, this.f33115a, this.f33116b, this.f33118d).m4004I0(true, true);
            if (m4004I0 == null) {
                m4060a(44);
            }
            return m4004I0;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list.get(i).mo4173k(), list2.get(i).mo4173k());
        }
        C7244f1 m4004I02 = new C12777l(hashMap, this.f33117c, this.f33115a, this.f33116b, this.f33118d).m4004I0(true, true);
        if (m4004I02 == null) {
            m4060a(45);
        }
        return m4004I02;
    }

    /* renamed from: m */
    public static C12766k m4048m(AbstractC7592g abstractC7592g) {
        if (abstractC7592g == null) {
            m4060a(0);
        }
        return new C12766k(f33114g, abstractC7592g, AbstractC7589f.C7590a.f20881a, null);
    }

    /* renamed from: n */
    private static EnumC11915e0 m4047n(Collection<InterfaceC11902b> collection, InterfaceC11914e interfaceC11914e) {
        EnumC11915e0 enumC11915e0;
        if (collection == null) {
            m4060a(88);
        }
        if (interfaceC11914e == null) {
            m4060a(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (InterfaceC11902b interfaceC11902b : collection) {
            int i = C12774h.f33125c[interfaceC11902b.mo4167r().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            z3 = true;
                        }
                    } else {
                        z2 = true;
                    }
                } else {
                    throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC11902b);
                }
            } else {
                EnumC11915e0 enumC11915e02 = EnumC11915e0.FINAL;
                if (enumC11915e02 == null) {
                    m4060a(90);
                }
                return enumC11915e02;
            }
        }
        if (interfaceC11914e.mo4172k0() && interfaceC11914e.mo4167r() != EnumC11915e0.ABSTRACT && interfaceC11914e.mo4167r() != EnumC11915e0.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            EnumC11915e0 enumC11915e03 = EnumC11915e0.OPEN;
            if (enumC11915e03 == null) {
                m4060a(91);
            }
            return enumC11915e03;
        } else if (!z2 && z3) {
            if (z) {
                enumC11915e0 = interfaceC11914e.mo4167r();
            } else {
                enumC11915e0 = EnumC11915e0.ABSTRACT;
            }
            if (enumC11915e0 == null) {
                m4060a(92);
            }
            return enumC11915e0;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC11902b interfaceC11902b2 : collection) {
                hashSet.addAll(m4035z(interfaceC11902b2));
            }
            return m4036y(m4043r(hashSet), z, interfaceC11914e.mo4167r());
        }
    }

    /* renamed from: o */
    private Collection<InterfaceC11902b> m4046o(InterfaceC11902b interfaceC11902b, Collection<? extends InterfaceC11902b> collection, InterfaceC11914e interfaceC11914e, AbstractC12765j abstractC12765j) {
        if (interfaceC11902b == null) {
            m4060a(59);
        }
        if (collection == null) {
            m4060a(60);
        }
        if (interfaceC11914e == null) {
            m4060a(61);
        }
        if (abstractC12765j == null) {
            m4060a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        C12263f m5644a = C12263f.m5644a();
        for (InterfaceC11902b interfaceC11902b2 : collection) {
            C12775i.EnumC12776a m4024c = m4069D(interfaceC11902b2, interfaceC11902b, interfaceC11914e).m4024c();
            boolean m4064I = m4064I(interfaceC11902b, interfaceC11902b2, false);
            int i = C12774h.f33124b[m4024c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (m4064I) {
                        abstractC12765j.mo4074c(interfaceC11902b2, interfaceC11902b);
                    }
                    arrayList.add(interfaceC11902b2);
                }
            } else {
                if (m4064I) {
                    m5644a.add(interfaceC11902b2);
                }
                arrayList.add(interfaceC11902b2);
            }
        }
        abstractC12765j.mo4073d(interfaceC11902b, m5644a);
        return arrayList;
    }

    /* renamed from: p */
    public static <H> Collection<H> m4045p(H h, Collection<H> collection, Function1<H, InterfaceC11897a> function1, Function1<H, Unit> function12) {
        if (h == null) {
            m4060a(99);
        }
        if (collection == null) {
            m4060a(100);
        }
        if (function1 == null) {
            m4060a(101);
        }
        if (function12 == null) {
            m4060a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        InterfaceC11897a invoke = function1.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            InterfaceC11897a invoke2 = function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                C12775i.EnumC12776a m4037x = m4037x(invoke, invoke2);
                if (m4037x == C12775i.EnumC12776a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (m4037x == C12775i.EnumC12776a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private static Collection<InterfaceC11902b> m4044q(InterfaceC11902b interfaceC11902b, Queue<InterfaceC11902b> queue, AbstractC12765j abstractC12765j) {
        if (interfaceC11902b == null) {
            m4060a(104);
        }
        if (queue == null) {
            m4060a(105);
        }
        if (abstractC12765j == null) {
            m4060a(106);
        }
        return m4045p(interfaceC11902b, queue, new C12772f(), new C12773g(abstractC12765j, interfaceC11902b));
    }

    /* renamed from: r */
    public static <D extends InterfaceC11897a> Set<D> m4043r(Set<D> set) {
        boolean z;
        if (set == null) {
            m4060a(8);
        }
        if (!set.isEmpty() && C13801c.m1494u(C13801c.m1499p(set.iterator().next()))) {
            z = true;
        } else {
            z = false;
        }
        return m4042s(set, z, null, new C12768b());
    }

    /* renamed from: s */
    public static <D> Set<D> m4042s(Set<D> set, boolean z, Function0<?> function0, Function2<? super D, ? super D, Pair<InterfaceC11897a, InterfaceC11897a>> function2) {
        if (set == null) {
            m4060a(9);
        }
        if (function2 == null) {
            m4060a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    Pair<InterfaceC11897a, InterfaceC11897a> invoke = function2.invoke(obj, (Object) it.next());
                    InterfaceC11897a m14351a = invoke.m14351a();
                    InterfaceC11897a m14350b = invoke.m14350b();
                    if (m4063J(m14351a, m14350b, z, true)) {
                        it.remove();
                    } else if (m4063J(m14350b, m14351a, z, true)) {
                        break;
                    }
                } else {
                    linkedHashSet.add(obj);
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: t */
    private static Collection<InterfaceC11902b> m4041t(InterfaceC11914e interfaceC11914e, Collection<InterfaceC11902b> collection) {
        List m14060P;
        if (interfaceC11914e == null) {
            m4060a(96);
        }
        if (collection == null) {
            m4060a(97);
        }
        m14060P = C9553r.m14060P(collection, new C12771e(interfaceC11914e));
        if (m14060P == null) {
            m4060a(98);
        }
        return m14060P;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p305qg.AbstractC11988u m4040u(java.util.Collection<? extends p305qg.InterfaceC11902b> r5) {
        /*
            if (r5 != 0) goto L7
            r0 = 109(0x6d, float:1.53E-43)
            m4060a(r0)
        L7:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L10
            qg.u r5 = p305qg.C11974t.f30977l
            return r5
        L10:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L15:
            r2 = r1
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            qg.b r3 = (p305qg.InterfaceC11902b) r3
            qg.u r3 = r3.getVisibility()
            if (r2 != 0) goto L2a
        L28:
            r2 = r3
            goto L16
        L2a:
            java.lang.Integer r4 = p305qg.C11974t.m6675d(r3, r2)
            if (r4 != 0) goto L31
            goto L15
        L31:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L16
            goto L28
        L38:
            if (r2 != 0) goto L3b
            return r1
        L3b:
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r5.next()
            qg.b r0 = (p305qg.InterfaceC11902b) r0
            qg.u r0 = r0.getVisibility()
            java.lang.Integer r0 = p305qg.C11974t.m6675d(r2, r0)
            if (r0 == 0) goto L5b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L3f
        L5b:
            return r1
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: th.C12766k.m4040u(java.util.Collection):qg.u");
    }

    /* renamed from: w */
    public static C12775i m4038w(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2) {
        boolean z;
        if (interfaceC11897a == null) {
            m4060a(40);
        }
        if (interfaceC11897a2 == null) {
            m4060a(41);
        }
        boolean z2 = interfaceC11897a instanceof InterfaceC11998y;
        if ((z2 && !(interfaceC11897a2 instanceof InterfaceC11998y)) || (((z = interfaceC11897a instanceof InterfaceC11989u0)) && !(interfaceC11897a2 instanceof InterfaceC11989u0))) {
            return C12775i.m4023d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC11897a);
        } else if (!interfaceC11897a.getName().equals(interfaceC11897a2.getName())) {
            return C12775i.m4023d("Name mismatch");
        } else {
            C12775i m4056e = m4056e(interfaceC11897a, interfaceC11897a2);
            if (m4056e != null) {
                return m4056e;
            }
            return null;
        }
    }

    /* renamed from: x */
    public static C12775i.EnumC12776a m4037x(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2) {
        C12766k c12766k = f33113f;
        C12775i.EnumC12776a m4024c = c12766k.m4069D(interfaceC11897a2, interfaceC11897a, null).m4024c();
        C12775i.EnumC12776a m4024c2 = c12766k.m4069D(interfaceC11897a, interfaceC11897a2, null).m4024c();
        C12775i.EnumC12776a enumC12776a = C12775i.EnumC12776a.OVERRIDABLE;
        if (m4024c != enumC12776a || m4024c2 != enumC12776a) {
            C12775i.EnumC12776a enumC12776a2 = C12775i.EnumC12776a.CONFLICT;
            if (m4024c != enumC12776a2 && m4024c2 != enumC12776a2) {
                return C12775i.EnumC12776a.INCOMPATIBLE;
            }
            return enumC12776a2;
        }
        return enumC12776a;
    }

    /* renamed from: y */
    private static EnumC11915e0 m4036y(Collection<InterfaceC11902b> collection, boolean z, EnumC11915e0 enumC11915e0) {
        EnumC11915e0 mo4167r;
        if (collection == null) {
            m4060a(93);
        }
        if (enumC11915e0 == null) {
            m4060a(94);
        }
        EnumC11915e0 enumC11915e02 = EnumC11915e0.ABSTRACT;
        for (InterfaceC11902b interfaceC11902b : collection) {
            if (z && interfaceC11902b.mo4167r() == EnumC11915e0.ABSTRACT) {
                mo4167r = enumC11915e0;
            } else {
                mo4167r = interfaceC11902b.mo4167r();
            }
            if (mo4167r.compareTo(enumC11915e02) < 0) {
                enumC11915e02 = mo4167r;
            }
        }
        if (enumC11915e02 == null) {
            m4060a(95);
        }
        return enumC11915e02;
    }

    /* renamed from: z */
    public static Set<InterfaceC11902b> m4035z(InterfaceC11902b interfaceC11902b) {
        if (interfaceC11902b == null) {
            m4060a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m4055f(interfaceC11902b, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: D */
    public C12775i m4069D(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2, InterfaceC11914e interfaceC11914e) {
        if (interfaceC11897a == null) {
            m4060a(19);
        }
        if (interfaceC11897a2 == null) {
            m4060a(20);
        }
        C12775i m4068E = m4068E(interfaceC11897a, interfaceC11897a2, interfaceC11914e, false);
        if (m4068E == null) {
            m4060a(21);
        }
        return m4068E;
    }

    /* renamed from: E */
    public C12775i m4068E(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2, InterfaceC11914e interfaceC11914e, boolean z) {
        boolean z2;
        if (interfaceC11897a == null) {
            m4060a(22);
        }
        if (interfaceC11897a2 == null) {
            m4060a(23);
        }
        C12775i m4067F = m4067F(interfaceC11897a, interfaceC11897a2, z);
        if (m4067F.m4024c() == C12775i.EnumC12776a.OVERRIDABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (InterfaceC12759f interfaceC12759f : f33112e) {
            if (interfaceC12759f.mo305a() != InterfaceC12759f.EnumC12760a.CONFLICTS_ONLY && (!z2 || interfaceC12759f.mo305a() != InterfaceC12759f.EnumC12760a.SUCCESS_ONLY)) {
                int i = C12774h.f33123a[interfaceC12759f.mo304b(interfaceC11897a, interfaceC11897a2, interfaceC11914e).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C12775i m4023d = C12775i.m4023d("External condition");
                            if (m4023d == null) {
                                m4060a(25);
                            }
                            return m4023d;
                        }
                    } else {
                        C12775i m4025b = C12775i.m4025b("External condition failed");
                        if (m4025b == null) {
                            m4060a(24);
                        }
                        return m4025b;
                    }
                } else {
                    z2 = true;
                }
            }
        }
        if (!z2) {
            return m4067F;
        }
        for (InterfaceC12759f interfaceC12759f2 : f33112e) {
            if (interfaceC12759f2.mo305a() == InterfaceC12759f.EnumC12760a.CONFLICTS_ONLY) {
                int i2 = C12774h.f33123a[interfaceC12759f2.mo304b(interfaceC11897a, interfaceC11897a2, interfaceC11914e).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            C12775i m4023d2 = C12775i.m4023d("External condition");
                            if (m4023d2 == null) {
                                m4060a(28);
                            }
                            return m4023d2;
                        }
                    } else {
                        C12775i m4025b2 = C12775i.m4025b("External condition failed");
                        if (m4025b2 == null) {
                            m4060a(27);
                        }
                        return m4025b2;
                    }
                } else {
                    throw new IllegalStateException("Contract violation in " + interfaceC12759f2.getClass().getName() + " condition. It's not supposed to end with success");
                }
            }
        }
        C12775i m4022e = C12775i.m4022e();
        if (m4022e == null) {
            m4060a(29);
        }
        return m4022e;
    }

    /* renamed from: F */
    public C12775i m4067F(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2, boolean z) {
        if (interfaceC11897a == null) {
            m4060a(30);
        }
        if (interfaceC11897a2 == null) {
            m4060a(31);
        }
        C12775i m4038w = m4038w(interfaceC11897a, interfaceC11897a2);
        if (m4038w != null) {
            return m4038w;
        }
        List<AbstractC7264g0> m4054g = m4054g(interfaceC11897a);
        List<AbstractC7264g0> m4054g2 = m4054g(interfaceC11897a2);
        List<InterfaceC11920f1> typeParameters = interfaceC11897a.getTypeParameters();
        List<InterfaceC11920f1> typeParameters2 = interfaceC11897a2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < m4054g.size()) {
                if (!InterfaceC7587e.f20880a.mo20255c(m4054g.get(i), m4054g2.get(i))) {
                    C12775i m4023d = C12775i.m4023d("Type parameter number mismatch");
                    if (m4023d == null) {
                        m4060a(33);
                    }
                    return m4023d;
                }
                i++;
            }
            C12775i m4025b = C12775i.m4025b("Type parameter number mismatch");
            if (m4025b == null) {
                m4060a(34);
            }
            return m4025b;
        }
        C7244f1 m4049l = m4049l(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!m4058c(typeParameters.get(i2), typeParameters2.get(i2), m4049l)) {
                C12775i m4023d2 = C12775i.m4023d("Type parameter bounds mismatch");
                if (m4023d2 == null) {
                    m4060a(35);
                }
                return m4023d2;
            }
        }
        for (int i3 = 0; i3 < m4054g.size(); i3++) {
            if (!m4057d(m4054g.get(i3), m4054g2.get(i3), m4049l)) {
                C12775i m4023d3 = C12775i.m4023d("Value parameter type mismatch");
                if (m4023d3 == null) {
                    m4060a(36);
                }
                return m4023d3;
            }
        }
        if ((interfaceC11897a instanceof InterfaceC11998y) && (interfaceC11897a2 instanceof InterfaceC11998y) && ((InterfaceC11998y) interfaceC11897a).isSuspend() != ((InterfaceC11998y) interfaceC11897a2).isSuspend()) {
            C12775i m4025b2 = C12775i.m4025b("Incompatible suspendability");
            if (m4025b2 == null) {
                m4060a(37);
            }
            return m4025b2;
        }
        if (z) {
            AbstractC7264g0 returnType = interfaceC11897a.getReturnType();
            AbstractC7264g0 returnType2 = interfaceC11897a2.getReturnType();
            if (returnType != null && returnType2 != null) {
                if (C7276i0.m21083a(returnType2) && C7276i0.m21083a(returnType)) {
                    i = 1;
                }
                if (i == 0 && !C7235f.f19632a.m21164r(m4049l, returnType2.mo20916Q0(), returnType.mo20916Q0())) {
                    C12775i m4025b3 = C12775i.m4025b("Return type mismatch");
                    if (m4025b3 == null) {
                        m4060a(38);
                    }
                    return m4025b3;
                }
            }
        }
        C12775i m4022e = C12775i.m4022e();
        if (m4022e == null) {
            m4060a(39);
        }
        return m4022e;
    }

    /* renamed from: v */
    public void m4039v(C11638f c11638f, Collection<? extends InterfaceC11902b> collection, Collection<? extends InterfaceC11902b> collection2, InterfaceC11914e interfaceC11914e, AbstractC12765j abstractC12765j) {
        if (c11638f == null) {
            m4060a(52);
        }
        if (collection == null) {
            m4060a(53);
        }
        if (collection2 == null) {
            m4060a(54);
        }
        if (interfaceC11914e == null) {
            m4060a(55);
        }
        if (abstractC12765j == null) {
            m4060a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (InterfaceC11902b interfaceC11902b : collection2) {
            linkedHashSet.removeAll(m4046o(interfaceC11902b, collection, interfaceC11914e, abstractC12765j));
        }
        m4050k(interfaceC11914e, linkedHashSet, abstractC12765j);
    }
}
