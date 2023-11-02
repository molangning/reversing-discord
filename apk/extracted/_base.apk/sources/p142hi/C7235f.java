package p142hi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import li.C10192a;
import li.EnumC10193b;
import li.EnumC10213u;
import li.InterfaceC10195d;
import li.InterfaceC10196e;
import li.InterfaceC10199h;
import li.InterfaceC10200i;
import li.InterfaceC10202k;
import li.InterfaceC10203l;
import li.InterfaceC10204m;
import li.InterfaceC10205n;
import li.InterfaceC10206o;
import li.InterfaceC10207p;
import li.InterfaceC10212t;
import p142hi.C7244f1;
import p327ri.C12258e;
import pf.C11581q;

/* renamed from: hi.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7235f {

    /* renamed from: a */
    public static final C7235f f19632a = new C7235f();

    /* renamed from: b */
    public static boolean f19633b;

    /* renamed from: hi.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C7236a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19634a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19635b;

        static {
            int[] iArr = new int[EnumC10213u.values().length];
            try {
                iArr[EnumC10213u.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10213u.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10213u.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19634a = iArr;
            int[] iArr2 = new int[C7244f1.EnumC7247b.values().length];
            try {
                iArr2[C7244f1.EnumC7247b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C7244f1.EnumC7247b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[C7244f1.EnumC7247b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f19635b = iArr2;
        }
    }

    /* renamed from: hi.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7237b extends AbstractC9614s implements Function1<C7244f1.InterfaceC7245a, Unit> {

        /* renamed from: j */
        final /* synthetic */ List<InterfaceC10202k> f19636j;

        /* renamed from: k */
        final /* synthetic */ C7244f1 f19637k;

        /* renamed from: l */
        final /* synthetic */ InterfaceC10207p f19638l;

        /* renamed from: m */
        final /* synthetic */ InterfaceC10202k f19639m;

        /* renamed from: hi.f$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7238a extends AbstractC9614s implements Function0<Boolean> {

            /* renamed from: j */
            final /* synthetic */ C7244f1 f19640j;

            /* renamed from: k */
            final /* synthetic */ InterfaceC10207p f19641k;

            /* renamed from: l */
            final /* synthetic */ InterfaceC10202k f19642l;

            /* renamed from: m */
            final /* synthetic */ InterfaceC10202k f19643m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7238a(C7244f1 c7244f1, InterfaceC10207p interfaceC10207p, InterfaceC10202k interfaceC10202k, InterfaceC10202k interfaceC10202k2) {
                super(0);
                this.f19640j = c7244f1;
                this.f19641k = interfaceC10207p;
                this.f19642l = interfaceC10202k;
                this.f19643m = interfaceC10202k2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(C7235f.f19632a.m21165q(this.f19640j, this.f19641k.mo3988Y(this.f19642l), this.f19643m));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7237b(List<? extends InterfaceC10202k> list, C7244f1 c7244f1, InterfaceC10207p interfaceC10207p, InterfaceC10202k interfaceC10202k) {
            super(1);
            this.f19636j = list;
            this.f19637k = c7244f1;
            this.f19638l = interfaceC10207p;
            this.f19639m = interfaceC10202k;
        }

        /* renamed from: a */
        public final void m21158a(C7244f1.InterfaceC7245a runForkingPoint) {
            C9612q.m13917h(runForkingPoint, "$this$runForkingPoint");
            for (InterfaceC10202k interfaceC10202k : this.f19636j) {
                runForkingPoint.mo21131a(new C7238a(this.f19637k, this.f19638l, interfaceC10202k, this.f19639m));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7244f1.InterfaceC7245a interfaceC7245a) {
            m21158a(interfaceC7245a);
            return Unit.f25302a;
        }
    }

    private C7235f() {
    }

    /* renamed from: a */
    private final Boolean m21181a(C7244f1 c7244f1, InterfaceC10202k interfaceC10202k, InterfaceC10202k interfaceC10202k2) {
        InterfaceC10207p m21139j = c7244f1.m21139j();
        if (!m21139j.mo3992U(interfaceC10202k) && !m21139j.mo3992U(interfaceC10202k2)) {
            return null;
        }
        if (m21178d(m21139j, interfaceC10202k) && m21178d(m21139j, interfaceC10202k2)) {
            return Boolean.TRUE;
        }
        if (m21139j.mo3992U(interfaceC10202k)) {
            if (m21177e(m21139j, c7244f1, interfaceC10202k, interfaceC10202k2, false)) {
                return Boolean.TRUE;
            }
        } else if (m21139j.mo3992U(interfaceC10202k2) && (m21179c(m21139j, interfaceC10202k) || m21177e(m21139j, c7244f1, interfaceC10202k2, interfaceC10202k, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: b */
    private static final boolean m21180b(InterfaceC10207p interfaceC10207p, InterfaceC10202k interfaceC10202k) {
        if (!(interfaceC10202k instanceof InterfaceC10195d)) {
            return false;
        }
        InterfaceC10204m mo3954q = interfaceC10207p.mo3954q(interfaceC10207p.mo3987Z((InterfaceC10195d) interfaceC10202k));
        if (interfaceC10207p.mo3971h0(mo3954q) || !interfaceC10207p.mo3992U(interfaceC10207p.mo4013E(interfaceC10207p.mo3958o(mo3954q)))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static final boolean m21179c(InterfaceC10207p interfaceC10207p, InterfaceC10202k interfaceC10202k) {
        boolean z;
        boolean z2;
        InterfaceC10205n mo3974g = interfaceC10207p.mo3974g(interfaceC10202k);
        if (!(mo3974g instanceof InterfaceC10199h)) {
            return false;
        }
        Collection<InterfaceC10200i> mo4007H = interfaceC10207p.mo4007H(mo3974g);
        if (!(mo4007H instanceof Collection) || !mo4007H.isEmpty()) {
            for (InterfaceC10200i interfaceC10200i : mo4007H) {
                InterfaceC10202k mo3986a = interfaceC10207p.mo3986a(interfaceC10200i);
                if (mo3986a != null && interfaceC10207p.mo3992U(mo3986a)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static final boolean m21178d(InterfaceC10207p interfaceC10207p, InterfaceC10202k interfaceC10202k) {
        return interfaceC10207p.mo3992U(interfaceC10202k) || m21180b(interfaceC10207p, interfaceC10202k);
    }

    /* renamed from: e */
    private static final boolean m21177e(InterfaceC10207p interfaceC10207p, C7244f1 c7244f1, InterfaceC10202k interfaceC10202k, InterfaceC10202k interfaceC10202k2, boolean z) {
        boolean z2;
        Collection<InterfaceC10200i> mo4018B0 = interfaceC10207p.mo4018B0(interfaceC10202k);
        if ((mo4018B0 instanceof Collection) && mo4018B0.isEmpty()) {
            return false;
        }
        for (InterfaceC10200i interfaceC10200i : mo4018B0) {
            if (!C9612q.m13922c(interfaceC10207p.mo3950s(interfaceC10200i), interfaceC10207p.mo3974g(interfaceC10202k2)) && (!z || !m21162t(f19632a, c7244f1, interfaceC10202k2, interfaceC10200i, false, 8, null))) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0127, code lost:
        if (r10 != false) goto L76;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean m21176f(p142hi.C7244f1 r15, li.InterfaceC10202k r16, li.InterfaceC10202k r17) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.C7235f.m21176f(hi.f1, li.k, li.k):java.lang.Boolean");
    }

    /* renamed from: g */
    private final List<InterfaceC10202k> m21175g(C7244f1 c7244f1, InterfaceC10202k interfaceC10202k, InterfaceC10205n interfaceC10205n) {
        String m14046d0;
        C7244f1.AbstractC7248c mo3995R;
        List<InterfaceC10202k> m14104i;
        List<InterfaceC10202k> m14109d;
        List<InterfaceC10202k> m14104i2;
        InterfaceC10207p m21139j = c7244f1.m21139j();
        List<InterfaceC10202k> mo3948t = m21139j.mo3948t(interfaceC10202k, interfaceC10205n);
        if (mo3948t != null) {
            return mo3948t;
        }
        if (!m21139j.mo3952r(interfaceC10205n) && m21139j.mo3983b0(interfaceC10202k)) {
            m14104i2 = C9545j.m14104i();
            return m14104i2;
        } else if (m21139j.mo3961m0(interfaceC10205n)) {
            if (m21139j.mo4019B(m21139j.mo3974g(interfaceC10202k), interfaceC10205n)) {
                InterfaceC10202k mo3940x = m21139j.mo3940x(interfaceC10202k, EnumC10193b.FOR_SUBTYPING);
                if (mo3940x != null) {
                    interfaceC10202k = mo3940x;
                }
                m14109d = C9544i.m14109d(interfaceC10202k);
                return m14109d;
            }
            m14104i = C9545j.m14104i();
            return m14104i;
        } else {
            C12258e c12258e = new C12258e();
            c7244f1.m21138k();
            ArrayDeque<InterfaceC10202k> m21141h = c7244f1.m21141h();
            C9612q.m13920e(m21141h);
            Set<InterfaceC10202k> m21140i = c7244f1.m21140i();
            C9612q.m13920e(m21140i);
            m21141h.push(interfaceC10202k);
            while (!m21141h.isEmpty()) {
                if (m21140i.size() <= 1000) {
                    InterfaceC10202k current = m21141h.pop();
                    C9612q.m13918g(current, "current");
                    if (m21140i.add(current)) {
                        InterfaceC10202k mo3940x2 = m21139j.mo3940x(current, EnumC10193b.FOR_SUBTYPING);
                        if (mo3940x2 == null) {
                            mo3940x2 = current;
                        }
                        if (m21139j.mo4019B(m21139j.mo3974g(mo3940x2), interfaceC10205n)) {
                            c12258e.add(mo3940x2);
                            mo3995R = C7244f1.AbstractC7248c.C7251c.f19667a;
                        } else if (m21139j.mo3981c0(mo3940x2) == 0) {
                            mo3995R = C7244f1.AbstractC7248c.C7250b.f19666a;
                        } else {
                            mo3995R = c7244f1.m21139j().mo3995R(mo3940x2);
                        }
                        if (!(!C9612q.m13922c(mo3995R, C7244f1.AbstractC7248c.C7251c.f19667a))) {
                            mo3995R = null;
                        }
                        if (mo3995R != null) {
                            InterfaceC10207p m21139j2 = c7244f1.m21139j();
                            for (InterfaceC10200i interfaceC10200i : m21139j2.mo4007H(m21139j2.mo3974g(current))) {
                                m21141h.add(mo3995R.mo20291a(c7244f1, interfaceC10200i));
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Too many supertypes for type: ");
                    sb2.append(interfaceC10202k);
                    sb2.append(". Supertypes = ");
                    m14046d0 = C9553r.m14046d0(m21140i, null, null, null, 0, null, null, 63, null);
                    sb2.append(m14046d0);
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            c7244f1.m21143e();
            return c12258e;
        }
    }

    /* renamed from: h */
    private final List<InterfaceC10202k> m21174h(C7244f1 c7244f1, InterfaceC10202k interfaceC10202k, InterfaceC10205n interfaceC10205n) {
        return m21159w(c7244f1, m21175g(c7244f1, interfaceC10202k, interfaceC10205n));
    }

    /* renamed from: i */
    private final boolean m21173i(C7244f1 c7244f1, InterfaceC10200i interfaceC10200i, InterfaceC10200i interfaceC10200i2, boolean z) {
        InterfaceC10207p m21139j = c7244f1.m21139j();
        InterfaceC10200i m21134o = c7244f1.m21134o(c7244f1.m21133p(interfaceC10200i));
        InterfaceC10200i m21134o2 = c7244f1.m21134o(c7244f1.m21133p(interfaceC10200i2));
        C7235f c7235f = f19632a;
        Boolean m21176f = c7235f.m21176f(c7244f1, m21139j.mo3935z0(m21134o), m21139j.mo4013E(m21134o2));
        if (m21176f != null) {
            boolean booleanValue = m21176f.booleanValue();
            c7244f1.m21145c(m21134o, m21134o2, z);
            return booleanValue;
        }
        Boolean m21145c = c7244f1.m21145c(m21134o, m21134o2, z);
        if (m21145c != null) {
            return m21145c.booleanValue();
        }
        return c7235f.m21161u(c7244f1, m21139j.mo3935z0(m21134o), m21139j.mo4013E(m21134o2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0063, code lost:
        return r8.mo3956p(r8.mo3950s(r9), r2);
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final li.InterfaceC10206o m21169m(li.InterfaceC10207p r8, li.InterfaceC10200i r9, li.InterfaceC10200i r10) {
        /*
            r7 = this;
            int r0 = r8.mo3981c0(r9)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L67
            li.m r4 = r8.mo3953q0(r9, r2)
            boolean r5 = r8.mo3971h0(r4)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L16
            r3 = r4
        L16:
            if (r3 == 0) goto L64
            li.i r3 = r8.mo3958o(r3)
            if (r3 != 0) goto L1f
            goto L64
        L1f:
            li.k r4 = r8.mo3935z0(r3)
            li.k r4 = r8.mo3966k(r4)
            boolean r4 = r8.mo3996Q(r4)
            if (r4 == 0) goto L3c
            li.k r4 = r8.mo3935z0(r10)
            li.k r4 = r8.mo3966k(r4)
            boolean r4 = r8.mo3996Q(r4)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r1
        L3d:
            boolean r4 = kotlin.jvm.internal.C9612q.m13922c(r3, r10)
            if (r4 != 0) goto L5b
            if (r6 == 0) goto L54
            li.n r4 = r8.mo3950s(r3)
            li.n r5 = r8.mo3950s(r10)
            boolean r4 = kotlin.jvm.internal.C9612q.m13922c(r4, r5)
            if (r4 == 0) goto L54
            goto L5b
        L54:
            li.o r3 = r7.m21169m(r8, r3, r10)
            if (r3 == 0) goto L64
            return r3
        L5b:
            li.n r9 = r8.mo3950s(r9)
            li.o r8 = r8.mo3956p(r9, r2)
            return r8
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.C7235f.m21169m(li.p, li.i, li.i):li.o");
    }

    /* renamed from: n */
    private final boolean m21168n(C7244f1 c7244f1, InterfaceC10202k interfaceC10202k) {
        String m14046d0;
        C7244f1.AbstractC7248c abstractC7248c;
        InterfaceC10207p m21139j = c7244f1.m21139j();
        InterfaceC10205n mo3974g = m21139j.mo3974g(interfaceC10202k);
        if (m21139j.mo3952r(mo3974g)) {
            return m21139j.mo4017C(mo3974g);
        }
        if (m21139j.mo4017C(m21139j.mo3974g(interfaceC10202k))) {
            return true;
        }
        c7244f1.m21138k();
        ArrayDeque<InterfaceC10202k> m21141h = c7244f1.m21141h();
        C9612q.m13920e(m21141h);
        Set<InterfaceC10202k> m21140i = c7244f1.m21140i();
        C9612q.m13920e(m21140i);
        m21141h.push(interfaceC10202k);
        while (!m21141h.isEmpty()) {
            if (m21140i.size() <= 1000) {
                InterfaceC10202k current = m21141h.pop();
                C9612q.m13918g(current, "current");
                if (m21140i.add(current)) {
                    if (m21139j.mo3983b0(current)) {
                        abstractC7248c = C7244f1.AbstractC7248c.C7251c.f19667a;
                    } else {
                        abstractC7248c = C7244f1.AbstractC7248c.C7250b.f19666a;
                    }
                    if (!(!C9612q.m13922c(abstractC7248c, C7244f1.AbstractC7248c.C7251c.f19667a))) {
                        abstractC7248c = null;
                    }
                    if (abstractC7248c == null) {
                        continue;
                    } else {
                        InterfaceC10207p m21139j2 = c7244f1.m21139j();
                        for (InterfaceC10200i interfaceC10200i : m21139j2.mo4007H(m21139j2.mo3974g(current))) {
                            InterfaceC10202k mo20291a = abstractC7248c.mo20291a(c7244f1, interfaceC10200i);
                            if (m21139j.mo4017C(m21139j.mo3974g(mo20291a))) {
                                c7244f1.m21143e();
                                return true;
                            }
                            m21141h.add(mo20291a);
                        }
                        continue;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(interfaceC10202k);
                sb2.append(". Supertypes = ");
                m14046d0 = C9553r.m14046d0(m21140i, null, null, null, 0, null, null, 63, null);
                sb2.append(m14046d0);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        c7244f1.m21143e();
        return false;
    }

    /* renamed from: o */
    private final boolean m21167o(InterfaceC10207p interfaceC10207p, InterfaceC10200i interfaceC10200i) {
        if (interfaceC10207p.mo3989X(interfaceC10207p.mo3950s(interfaceC10200i)) && !interfaceC10207p.mo3972h(interfaceC10200i) && !interfaceC10207p.mo3994S(interfaceC10200i) && !interfaceC10207p.mo3939x0(interfaceC10200i) && C9612q.m13922c(interfaceC10207p.mo3974g(interfaceC10207p.mo3935z0(interfaceC10200i)), interfaceC10207p.mo3974g(interfaceC10207p.mo4013E(interfaceC10200i)))) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private final boolean m21166p(InterfaceC10207p interfaceC10207p, InterfaceC10202k interfaceC10202k, InterfaceC10202k interfaceC10202k2) {
        InterfaceC10202k interfaceC10202k3;
        InterfaceC10202k interfaceC10202k4;
        InterfaceC10196e mo3973g0 = interfaceC10207p.mo3973g0(interfaceC10202k);
        if (mo3973g0 == null || (interfaceC10202k3 = interfaceC10207p.mo4011F(mo3973g0)) == null) {
            interfaceC10202k3 = interfaceC10202k;
        }
        InterfaceC10196e mo3973g02 = interfaceC10207p.mo3973g0(interfaceC10202k2);
        if (mo3973g02 == null || (interfaceC10202k4 = interfaceC10207p.mo4011F(mo3973g02)) == null) {
            interfaceC10202k4 = interfaceC10202k2;
        }
        if (interfaceC10207p.mo3974g(interfaceC10202k3) != interfaceC10207p.mo3974g(interfaceC10202k4)) {
            return false;
        }
        if (!interfaceC10207p.mo3994S(interfaceC10202k) && interfaceC10207p.mo3994S(interfaceC10202k2)) {
            return false;
        }
        if (interfaceC10207p.mo3941w0(interfaceC10202k) && !interfaceC10207p.mo3941w0(interfaceC10202k2)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m21162t(C7235f c7235f, C7244f1 c7244f1, InterfaceC10200i interfaceC10200i, InterfaceC10200i interfaceC10200i2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c7235f.m21163s(c7244f1, interfaceC10200i, interfaceC10200i2, z);
    }

    /* renamed from: u */
    private final boolean m21161u(C7244f1 c7244f1, InterfaceC10202k interfaceC10202k, InterfaceC10202k interfaceC10202k2) {
        int m14093t;
        Object m14056T;
        int m14093t2;
        boolean z;
        InterfaceC10200i mo3958o;
        InterfaceC10207p m21139j = c7244f1.m21139j();
        if (f19633b) {
            if (!m21139j.mo3978e(interfaceC10202k) && !m21139j.mo4005I(m21139j.mo3974g(interfaceC10202k))) {
                c7244f1.m21137l(interfaceC10202k);
            }
            if (!m21139j.mo3978e(interfaceC10202k2)) {
                c7244f1.m21137l(interfaceC10202k2);
            }
        }
        boolean z2 = false;
        if (!C7224c.f19619a.m21209d(c7244f1, interfaceC10202k, interfaceC10202k2)) {
            return false;
        }
        C7235f c7235f = f19632a;
        Boolean m21181a = c7235f.m21181a(c7244f1, m21139j.mo3935z0(interfaceC10202k), m21139j.mo4013E(interfaceC10202k2));
        if (m21181a != null) {
            boolean booleanValue = m21181a.booleanValue();
            C7244f1.m21144d(c7244f1, interfaceC10202k, interfaceC10202k2, false, 4, null);
            return booleanValue;
        }
        InterfaceC10205n mo3974g = m21139j.mo3974g(interfaceC10202k2);
        boolean z3 = true;
        if ((m21139j.mo4019B(m21139j.mo3974g(interfaceC10202k), mo3974g) && m21139j.mo3998O(mo3974g) == 0) || m21139j.mo3959n0(m21139j.mo3974g(interfaceC10202k2))) {
            return true;
        }
        List<InterfaceC10202k> m21170l = c7235f.m21170l(c7244f1, interfaceC10202k, mo3974g);
        int i = 10;
        m14093t = C9546k.m14093t(m21170l, 10);
        ArrayList<InterfaceC10202k> arrayList = new ArrayList(m14093t);
        for (InterfaceC10202k interfaceC10202k3 : m21170l) {
            InterfaceC10202k mo3986a = m21139j.mo3986a(c7244f1.m21134o(interfaceC10202k3));
            if (mo3986a != null) {
                interfaceC10202k3 = mo3986a;
            }
            arrayList.add(interfaceC10202k3);
        }
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                C10192a c10192a = new C10192a(m21139j.mo3998O(mo3974g));
                int mo3998O = m21139j.mo3998O(mo3974g);
                int i2 = 0;
                boolean z4 = false;
                while (i2 < mo3998O) {
                    if (!z4 && m21139j.mo3967j0(m21139j.mo3956p(mo3974g, i2)) == EnumC10213u.OUT) {
                        z4 = z2;
                    } else {
                        z4 = z3;
                    }
                    if (!z4) {
                        m14093t2 = C9546k.m14093t(arrayList, i);
                        List<? extends InterfaceC10200i> arrayList2 = new ArrayList<>(m14093t2);
                        for (InterfaceC10202k interfaceC10202k4 : arrayList) {
                            InterfaceC10204m mo3945u0 = m21139j.mo3945u0(interfaceC10202k4, i2);
                            if (mo3945u0 != null) {
                                if (m21139j.mo3977e0(mo3945u0) == EnumC10213u.INV) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    mo3945u0 = null;
                                }
                                if (mo3945u0 != null && (mo3958o = m21139j.mo3958o(mo3945u0)) != null) {
                                    arrayList2.add(mo3958o);
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + interfaceC10202k4 + ", subType: " + interfaceC10202k + ", superType: " + interfaceC10202k2).toString());
                        }
                        c10192a.add(m21139j.mo3999N(m21139j.mo3963l0(arrayList2)));
                    }
                    i2++;
                    z2 = false;
                    z3 = true;
                    i = 10;
                }
                if (!z4 && f19632a.m21165q(c7244f1, c10192a, interfaceC10202k2)) {
                    return true;
                }
                return c7244f1.m21132q(new C7237b(arrayList, c7244f1, m21139j, interfaceC10202k2));
            }
            C7235f c7235f2 = f19632a;
            m14056T = C9553r.m14056T(arrayList);
            return c7235f2.m21165q(c7244f1, m21139j.mo3988Y((InterfaceC10202k) m14056T), interfaceC10202k2);
        }
        return f19632a.m21168n(c7244f1, interfaceC10202k);
    }

    /* renamed from: v */
    private final boolean m21160v(InterfaceC10207p interfaceC10207p, InterfaceC10200i interfaceC10200i, InterfaceC10200i interfaceC10200i2, InterfaceC10205n interfaceC10205n) {
        InterfaceC10212t interfaceC10212t;
        InterfaceC10206o mo3947t0;
        InterfaceC10202k mo3986a = interfaceC10207p.mo3986a(interfaceC10200i);
        if (!(mo3986a instanceof InterfaceC10195d)) {
            return false;
        }
        InterfaceC10195d interfaceC10195d = (InterfaceC10195d) mo3986a;
        if (interfaceC10207p.mo3944v(interfaceC10195d) || !interfaceC10207p.mo3971h0(interfaceC10207p.mo3954q(interfaceC10207p.mo3987Z(interfaceC10195d))) || interfaceC10207p.mo3964l(interfaceC10195d) != EnumC10193b.FOR_SUBTYPING) {
            return false;
        }
        InterfaceC10205n mo3950s = interfaceC10207p.mo3950s(interfaceC10200i2);
        if (mo3950s instanceof InterfaceC10212t) {
            interfaceC10212t = (InterfaceC10212t) mo3950s;
        } else {
            interfaceC10212t = null;
        }
        if (interfaceC10212t == null || (mo3947t0 = interfaceC10207p.mo3947t0(interfaceC10212t)) == null || !interfaceC10207p.mo3936z(mo3947t0, interfaceC10205n)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private final List<InterfaceC10202k> m21159w(C7244f1 c7244f1, List<? extends InterfaceC10202k> list) {
        boolean z;
        InterfaceC10207p m21139j = c7244f1.m21139j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC10203l mo3988Y = m21139j.mo3988Y((InterfaceC10202k) next);
            int mo4001L = m21139j.mo4001L(mo3988Y);
            int i = 0;
            while (true) {
                if (i >= mo4001L) {
                    break;
                }
                if (m21139j.mo4002K(m21139j.mo3958o(m21139j.mo3937y0(mo3988Y, i))) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
                i++;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return list;
    }

    /* renamed from: j */
    public final EnumC10213u m21172j(EnumC10213u declared, EnumC10213u useSite) {
        C9612q.m13917h(declared, "declared");
        C9612q.m13917h(useSite, "useSite");
        EnumC10213u enumC10213u = EnumC10213u.INV;
        if (declared == enumC10213u) {
            return useSite;
        }
        if (useSite == enumC10213u) {
            return declared;
        }
        if (declared == useSite) {
            return declared;
        }
        return null;
    }

    /* renamed from: k */
    public final boolean m21171k(C7244f1 state, InterfaceC10200i a, InterfaceC10200i b) {
        C9612q.m13917h(state, "state");
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        InterfaceC10207p m21139j = state.m21139j();
        if (a == b) {
            return true;
        }
        C7235f c7235f = f19632a;
        if (c7235f.m21167o(m21139j, a) && c7235f.m21167o(m21139j, b)) {
            InterfaceC10200i m21134o = state.m21134o(state.m21133p(a));
            InterfaceC10200i m21134o2 = state.m21134o(state.m21133p(b));
            InterfaceC10202k mo3935z0 = m21139j.mo3935z0(m21134o);
            if (!m21139j.mo4019B(m21139j.mo3950s(m21134o), m21139j.mo3950s(m21134o2))) {
                return false;
            }
            if (m21139j.mo3981c0(mo3935z0) == 0) {
                if (m21139j.mo4016C0(m21134o) || m21139j.mo4016C0(m21134o2) || m21139j.mo3941w0(mo3935z0) == m21139j.mo3941w0(m21139j.mo3935z0(m21134o2))) {
                    return true;
                }
                return false;
            }
        }
        if (m21162t(c7235f, state, a, b, false, 8, null) && m21162t(c7235f, state, b, a, false, 8, null)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final List<InterfaceC10202k> m21170l(C7244f1 state, InterfaceC10202k subType, InterfaceC10205n superConstructor) {
        String m14046d0;
        C7244f1.AbstractC7248c abstractC7248c;
        C9612q.m13917h(state, "state");
        C9612q.m13917h(subType, "subType");
        C9612q.m13917h(superConstructor, "superConstructor");
        InterfaceC10207p m21139j = state.m21139j();
        if (m21139j.mo3983b0(subType)) {
            return f19632a.m21174h(state, subType, superConstructor);
        }
        if (!m21139j.mo3952r(superConstructor) && !m21139j.mo3955p0(superConstructor)) {
            return f19632a.m21175g(state, subType, superConstructor);
        }
        C12258e<InterfaceC10202k> c12258e = new C12258e();
        state.m21138k();
        ArrayDeque<InterfaceC10202k> m21141h = state.m21141h();
        C9612q.m13920e(m21141h);
        Set<InterfaceC10202k> m21140i = state.m21140i();
        C9612q.m13920e(m21140i);
        m21141h.push(subType);
        while (!m21141h.isEmpty()) {
            if (m21140i.size() <= 1000) {
                InterfaceC10202k current = m21141h.pop();
                C9612q.m13918g(current, "current");
                if (m21140i.add(current)) {
                    if (m21139j.mo3983b0(current)) {
                        c12258e.add(current);
                        abstractC7248c = C7244f1.AbstractC7248c.C7251c.f19667a;
                    } else {
                        abstractC7248c = C7244f1.AbstractC7248c.C7250b.f19666a;
                    }
                    if (!(!C9612q.m13922c(abstractC7248c, C7244f1.AbstractC7248c.C7251c.f19667a))) {
                        abstractC7248c = null;
                    }
                    if (abstractC7248c != null) {
                        InterfaceC10207p m21139j2 = state.m21139j();
                        for (InterfaceC10200i interfaceC10200i : m21139j2.mo4007H(m21139j2.mo3974g(current))) {
                            m21141h.add(abstractC7248c.mo20291a(state, interfaceC10200i));
                        }
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(subType);
                sb2.append(". Supertypes = ");
                m14046d0 = C9553r.m14046d0(m21140i, null, null, null, 0, null, null, 63, null);
                sb2.append(m14046d0);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        state.m21143e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10202k it : c12258e) {
            C7235f c7235f = f19632a;
            C9612q.m13918g(it, "it");
            C9550o.m14085y(arrayList, c7235f.m21174h(state, it, superConstructor));
        }
        return arrayList;
    }

    /* renamed from: q */
    public final boolean m21165q(C7244f1 c7244f1, InterfaceC10203l capturedSubArguments, InterfaceC10202k superType) {
        boolean z;
        int i;
        int i2;
        boolean m21171k;
        int i3;
        C9612q.m13917h(c7244f1, "<this>");
        C9612q.m13917h(capturedSubArguments, "capturedSubArguments");
        C9612q.m13917h(superType, "superType");
        InterfaceC10207p m21139j = c7244f1.m21139j();
        InterfaceC10205n mo3974g = m21139j.mo3974g(superType);
        int mo4001L = m21139j.mo4001L(capturedSubArguments);
        int mo3998O = m21139j.mo3998O(mo3974g);
        if (mo4001L != mo3998O || mo4001L != m21139j.mo3981c0(superType)) {
            return false;
        }
        for (int i4 = 0; i4 < mo3998O; i4++) {
            InterfaceC10204m mo3953q0 = m21139j.mo3953q0(superType, i4);
            if (!m21139j.mo3971h0(mo3953q0)) {
                InterfaceC10200i mo3958o = m21139j.mo3958o(mo3953q0);
                InterfaceC10204m mo3937y0 = m21139j.mo3937y0(capturedSubArguments, i4);
                m21139j.mo3977e0(mo3937y0);
                EnumC10213u enumC10213u = EnumC10213u.INV;
                InterfaceC10200i mo3958o2 = m21139j.mo3958o(mo3937y0);
                C7235f c7235f = f19632a;
                EnumC10213u m21172j = c7235f.m21172j(m21139j.mo3967j0(m21139j.mo3956p(mo3974g, i4)), m21139j.mo3977e0(mo3953q0));
                if (m21172j == null) {
                    return c7244f1.m21136m();
                }
                if (m21172j == enumC10213u && (c7235f.m21160v(m21139j, mo3958o2, mo3958o, mo3974g) || c7235f.m21160v(m21139j, mo3958o, mo3958o2, mo3974g))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    i = c7244f1.f19657g;
                    if (i <= 100) {
                        i2 = c7244f1.f19657g;
                        c7244f1.f19657g = i2 + 1;
                        int i5 = C7236a.f19634a[m21172j.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    m21171k = m21162t(c7235f, c7244f1, mo3958o, mo3958o2, false, 8, null);
                                } else {
                                    throw new C11581q();
                                }
                            } else {
                                m21171k = m21162t(c7235f, c7244f1, mo3958o2, mo3958o, false, 8, null);
                            }
                        } else {
                            m21171k = c7235f.m21171k(c7244f1, mo3958o2, mo3958o);
                        }
                        i3 = c7244f1.f19657g;
                        c7244f1.f19657g = i3 - 1;
                        if (!m21171k) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + mo3958o2).toString());
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m21164r(C7244f1 state, InterfaceC10200i subType, InterfaceC10200i superType) {
        C9612q.m13917h(state, "state");
        C9612q.m13917h(subType, "subType");
        C9612q.m13917h(superType, "superType");
        return m21162t(this, state, subType, superType, false, 8, null);
    }

    /* renamed from: s */
    public final boolean m21163s(C7244f1 state, InterfaceC10200i subType, InterfaceC10200i superType, boolean z) {
        C9612q.m13917h(state, "state");
        C9612q.m13917h(subType, "subType");
        C9612q.m13917h(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (!state.mo3934f(subType, superType)) {
            return false;
        }
        return m21173i(state, subType, superType, z);
    }
}
