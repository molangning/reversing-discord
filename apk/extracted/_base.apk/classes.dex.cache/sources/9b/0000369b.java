package p142hi;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ng.AbstractC10870h;
import ng.C10884k;
import ni.C10910b;
import p161ii.C7596j;
import p183ji.C8964h;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p234mi.C10472a;
import p305qg.InterfaceC11920f1;
import p325rg.C12163k;
import p325rg.C12166l;
import p325rg.InterfaceC12155g;
import p327ri.C12250c;
import p372uh.C12976d;
import ph.C11633c;

/* renamed from: hi.p1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7307p1 {

    /* renamed from: b */
    public static final C7307p1 f19741b = m21027g(AbstractC7297n1.f19730b);

    /* renamed from: a */
    private final AbstractC7297n1 f19742a;

    /* renamed from: hi.p1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C7308a implements Function1<C11633c, Boolean> {
        C7308a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m21012a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", ZeroconfModule.KEY_SERVICE_NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public Boolean invoke(C11633c c11633c) {
            if (c11633c == null) {
                m21012a(0);
            }
            return Boolean.valueOf(!c11633c.equals(C10884k.C10885a.f28460Q));
        }
    }

    /* renamed from: hi.p1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C7309b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19743a;

        static {
            int[] iArr = new int[EnumC7311d.values().length];
            f19743a = iArr;
            try {
                iArr[EnumC7311d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19743a[EnumC7311d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19743a[EnumC7311d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: hi.p1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7310c extends Exception {
        public C7310c(String str) {
            super(str);
        }
    }

    /* renamed from: hi.p1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC7311d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected C7307p1(AbstractC7297n1 abstractC7297n1) {
        if (abstractC7297n1 == null) {
            m21033a(7);
        }
        this.f19742a = abstractC7297n1;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0021 A[FALL_THROUGH] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m21033a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.C7307p1.m21033a(int):void");
    }

    /* renamed from: b */
    private static void m21032b(int i, InterfaceC7288k1 interfaceC7288k1, AbstractC7297n1 abstractC7297n1) {
        if (i <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m21019o(interfaceC7288k1) + "; substitution: " + m21019o(abstractC7297n1));
    }

    /* renamed from: c */
    public static EnumC7336w1 m21031c(EnumC7336w1 enumC7336w1, InterfaceC7288k1 interfaceC7288k1) {
        if (enumC7336w1 == null) {
            m21033a(35);
        }
        if (interfaceC7288k1 == null) {
            m21033a(36);
        }
        if (interfaceC7288k1.mo20955a()) {
            EnumC7336w1 enumC7336w12 = EnumC7336w1.OUT_VARIANCE;
            if (enumC7336w12 == null) {
                m21033a(37);
            }
            return enumC7336w12;
        }
        return m21030d(enumC7336w1, interfaceC7288k1.mo20954b());
    }

    /* renamed from: d */
    public static EnumC7336w1 m21030d(EnumC7336w1 enumC7336w1, EnumC7336w1 enumC7336w12) {
        if (enumC7336w1 == null) {
            m21033a(38);
        }
        if (enumC7336w12 == null) {
            m21033a(39);
        }
        EnumC7336w1 enumC7336w13 = EnumC7336w1.INVARIANT;
        if (enumC7336w1 == enumC7336w13) {
            if (enumC7336w12 == null) {
                m21033a(40);
            }
            return enumC7336w12;
        } else if (enumC7336w12 == enumC7336w13) {
            if (enumC7336w1 == null) {
                m21033a(41);
            }
            return enumC7336w1;
        } else if (enumC7336w1 == enumC7336w12) {
            if (enumC7336w12 == null) {
                m21033a(42);
            }
            return enumC7336w12;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + enumC7336w1 + "' and projection kind '" + enumC7336w12 + "' cannot be combined");
        }
    }

    /* renamed from: e */
    private static EnumC7311d m21029e(EnumC7336w1 enumC7336w1, EnumC7336w1 enumC7336w12) {
        EnumC7336w1 enumC7336w13 = EnumC7336w1.IN_VARIANCE;
        if (enumC7336w1 == enumC7336w13 && enumC7336w12 == EnumC7336w1.OUT_VARIANCE) {
            return EnumC7311d.OUT_IN_IN_POSITION;
        }
        if (enumC7336w1 == EnumC7336w1.OUT_VARIANCE && enumC7336w12 == enumC7336w13) {
            return EnumC7311d.IN_IN_OUT_POSITION;
        }
        return EnumC7311d.NO_CONFLICT;
    }

    /* renamed from: f */
    public static C7307p1 m21028f(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m21033a(6);
        }
        return m21027g(AbstractC7272h1.m21090i(abstractC7264g0.mo3564N0(), abstractC7264g0.mo3566L0()));
    }

    /* renamed from: g */
    public static C7307p1 m21027g(AbstractC7297n1 abstractC7297n1) {
        if (abstractC7297n1 == null) {
            m21033a(0);
        }
        return new C7307p1(abstractC7297n1);
    }

    /* renamed from: h */
    public static C7307p1 m21026h(AbstractC7297n1 abstractC7297n1, AbstractC7297n1 abstractC7297n12) {
        if (abstractC7297n1 == null) {
            m21033a(3);
        }
        if (abstractC7297n12 == null) {
            m21033a(4);
        }
        return m21027g(C7325u.m20957i(abstractC7297n1, abstractC7297n12));
    }

    /* renamed from: i */
    private static InterfaceC12155g m21025i(InterfaceC12155g interfaceC12155g) {
        if (interfaceC12155g == null) {
            m21033a(33);
        }
        if (!interfaceC12155g.mo6023q(C10884k.C10885a.f28460Q)) {
            return interfaceC12155g;
        }
        return new C12166l(interfaceC12155g, new C7308a());
    }

    /* renamed from: l */
    private static InterfaceC7288k1 m21022l(AbstractC7264g0 abstractC7264g0, InterfaceC7288k1 interfaceC7288k1, InterfaceC11920f1 interfaceC11920f1, InterfaceC7288k1 interfaceC7288k12) {
        if (abstractC7264g0 == null) {
            m21033a(26);
        }
        if (interfaceC7288k1 == null) {
            m21033a(27);
        }
        if (interfaceC7288k12 == null) {
            m21033a(28);
        }
        if (!abstractC7264g0.getAnnotations().mo6023q(C10884k.C10885a.f28460Q)) {
            if (interfaceC7288k1 == null) {
                m21033a(29);
            }
            return interfaceC7288k1;
        }
        InterfaceC7265g1 mo3564N0 = interfaceC7288k1.getType().mo3564N0();
        if (!(mo3564N0 instanceof C7596j)) {
            return interfaceC7288k1;
        }
        InterfaceC7288k1 mo3552b = ((C7596j) mo3564N0).mo3552b();
        EnumC7336w1 mo20954b = mo3552b.mo20954b();
        EnumC7311d m21029e = m21029e(interfaceC7288k12.mo20954b(), mo20954b);
        EnumC7311d enumC7311d = EnumC7311d.OUT_IN_IN_POSITION;
        if (m21029e == enumC7311d) {
            return new C7294m1(mo3552b.getType());
        }
        if (interfaceC11920f1 == null) {
            return interfaceC7288k1;
        }
        if (m21029e(interfaceC11920f1.mo4464m(), mo20954b) == enumC7311d) {
            return new C7294m1(mo3552b.getType());
        }
        return interfaceC7288k1;
    }

    /* renamed from: o */
    private static String m21019o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!C12250c.m5660a(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    /* renamed from: r */
    private InterfaceC7288k1 m21016r(InterfaceC7288k1 interfaceC7288k1, int i) {
        AbstractC7264g0 abstractC7264g0;
        AbstractC7264g0 type = interfaceC7288k1.getType();
        EnumC7336w1 mo20954b = interfaceC7288k1.mo20954b();
        if (type.mo3564N0().mo2788p() instanceof InterfaceC11920f1) {
            return interfaceC7288k1;
        }
        AbstractC7302o0 m21004b = C7319s0.m21004b(type);
        if (m21004b != null) {
            abstractC7264g0 = m21021m().m21018p(m21004b, EnumC7336w1.INVARIANT);
        } else {
            abstractC7264g0 = null;
        }
        AbstractC7264g0 m21046b = C7303o1.m21046b(type, m21015s(type.mo3564N0().getParameters(), type.mo3566L0(), i), this.f19742a.mo20960d(type.getAnnotations()));
        if ((m21046b instanceof AbstractC7302o0) && (abstractC7264g0 instanceof AbstractC7302o0)) {
            m21046b = C7319s0.m20996j((AbstractC7302o0) m21046b, (AbstractC7302o0) abstractC7264g0);
        }
        return new C7294m1(mo20954b, m21046b);
    }

    /* renamed from: s */
    private List<InterfaceC7288k1> m21015s(List<InterfaceC11920f1> list, List<InterfaceC7288k1> list2, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC11920f1 interfaceC11920f1 = list.get(i2);
            InterfaceC7288k1 interfaceC7288k1 = list2.get(i2);
            InterfaceC7288k1 m21013u = m21013u(interfaceC7288k1, interfaceC11920f1, i + 1);
            int i3 = C7309b.f19743a[m21029e(interfaceC11920f1.mo4464m(), m21013u.mo20954b()).ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    EnumC7336w1 mo4464m = interfaceC11920f1.mo4464m();
                    EnumC7336w1 enumC7336w1 = EnumC7336w1.INVARIANT;
                    if (mo4464m != enumC7336w1 && !m21013u.mo20955a()) {
                        m21013u = new C7294m1(enumC7336w1, m21013u.getType());
                    }
                }
            } else {
                m21013u = C7320s1.m20976s(interfaceC11920f1);
            }
            if (m21013u != interfaceC7288k1) {
                z = true;
            }
            arrayList.add(m21013u);
        }
        if (!z) {
            return list2;
        }
        return arrayList;
    }

    /* renamed from: u */
    private InterfaceC7288k1 m21013u(InterfaceC7288k1 interfaceC7288k1, InterfaceC11920f1 interfaceC11920f1, int i) {
        InterfaceC7288k1 interfaceC7288k12;
        AbstractC7264g0 m20978q;
        if (interfaceC7288k1 == null) {
            m21033a(18);
        }
        m21032b(i, interfaceC7288k1, this.f19742a);
        if (interfaceC7288k1.mo20955a()) {
            return interfaceC7288k1;
        }
        AbstractC7264g0 type = interfaceC7288k1.getType();
        if (type instanceof InterfaceC7324t1) {
            InterfaceC7324t1 interfaceC7324t1 = (InterfaceC7324t1) type;
            AbstractC7333v1 mo20963G0 = interfaceC7324t1.mo20963G0();
            AbstractC7264g0 mo20962g0 = interfaceC7324t1.mo20962g0();
            InterfaceC7288k1 m21013u = m21013u(new C7294m1(interfaceC7288k1.mo20954b(), mo20963G0), interfaceC11920f1, i + 1);
            if (m21013u.mo20955a()) {
                return m21013u;
            }
            return new C7294m1(m21013u.mo20954b(), C7329u1.m20946d(m21013u.getType().mo20916Q0(), m21018p(mo20962g0, interfaceC7288k1.mo20954b())));
        }
        if (!C7334w.m20938a(type) && !(type.mo20916Q0() instanceof InterfaceC7296n0)) {
            InterfaceC7288k1 mo3539e = this.f19742a.mo3539e(type);
            if (mo3539e != null) {
                interfaceC7288k12 = m21022l(type, mo3539e, interfaceC11920f1, interfaceC7288k1);
            } else {
                interfaceC7288k12 = null;
            }
            EnumC7336w1 mo20954b = interfaceC7288k1.mo20954b();
            if (interfaceC7288k12 == null && C7229d0.m21192b(type) && !C7234e1.m21182b(type)) {
                AbstractC7217a0 m21193a = C7229d0.m21193a(type);
                int i2 = i + 1;
                InterfaceC7288k1 m21013u2 = m21013u(new C7294m1(mo20954b, m21193a.m21218V0()), interfaceC11920f1, i2);
                InterfaceC7288k1 m21013u3 = m21013u(new C7294m1(mo20954b, m21193a.m21217W0()), interfaceC11920f1, i2);
                EnumC7336w1 mo20954b2 = m21013u2.mo20954b();
                if (m21013u2.getType() == m21193a.m21218V0() && m21013u3.getType() == m21193a.m21217W0()) {
                    return interfaceC7288k1;
                }
                return new C7294m1(mo20954b2, C7267h0.m21104d(C7303o1.m21047a(m21013u2.getType()), C7303o1.m21047a(m21013u3.getType())));
            } else if (!AbstractC10870h.m9801m0(type) && !C7276i0.m21083a(type)) {
                if (interfaceC7288k12 != null) {
                    EnumC7311d m21029e = m21029e(mo20954b, interfaceC7288k12.mo20954b());
                    if (!C12976d.m3544d(type)) {
                        int i3 = C7309b.f19743a[m21029e.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                return new C7294m1(EnumC7336w1.OUT_VARIANCE, type.mo3564N0().mo2790n().m9842I());
                            }
                        } else {
                            throw new C7310c("Out-projection in in-position");
                        }
                    }
                    InterfaceC7295n m21183a = C7234e1.m21183a(type);
                    if (interfaceC7288k12.mo20955a()) {
                        return interfaceC7288k12;
                    }
                    if (m21183a != null) {
                        m20978q = m21183a.mo21038r0(interfaceC7288k12.getType());
                    } else {
                        m20978q = C7320s1.m20978q(interfaceC7288k12.getType(), type.mo3563O0());
                    }
                    if (!type.getAnnotations().isEmpty()) {
                        m20978q = C10472a.m11436v(m20978q, new C12163k(m20978q.getAnnotations(), m21025i(this.f19742a.mo20960d(type.getAnnotations()))));
                    }
                    if (m21029e == EnumC7311d.NO_CONFLICT) {
                        mo20954b = m21030d(mo20954b, interfaceC7288k12.mo20954b());
                    }
                    return new C7294m1(mo20954b, m20978q);
                }
                interfaceC7288k1 = m21016r(interfaceC7288k1, i);
                if (interfaceC7288k1 == null) {
                    m21033a(25);
                }
            }
        }
        return interfaceC7288k1;
    }

    /* renamed from: j */
    public AbstractC7297n1 m21024j() {
        AbstractC7297n1 abstractC7297n1 = this.f19742a;
        if (abstractC7297n1 == null) {
            m21033a(8);
        }
        return abstractC7297n1;
    }

    /* renamed from: k */
    public boolean m21023k() {
        return this.f19742a.mo20959f();
    }

    /* renamed from: m */
    public C7307p1 m21021m() {
        AbstractC7297n1 abstractC7297n1 = this.f19742a;
        if ((abstractC7297n1 instanceof C7233e0) && abstractC7297n1.mo3540b()) {
            return new C7307p1(new C7233e0(((C7233e0) this.f19742a).m21184j(), ((C7233e0) this.f19742a).m21185i(), false));
        }
        return this;
    }

    /* renamed from: n */
    public AbstractC7264g0 m21020n(AbstractC7264g0 abstractC7264g0, EnumC7336w1 enumC7336w1) {
        if (abstractC7264g0 == null) {
            m21033a(9);
        }
        if (enumC7336w1 == null) {
            m21033a(10);
        }
        if (m21023k()) {
            if (abstractC7264g0 == null) {
                m21033a(11);
            }
            return abstractC7264g0;
        }
        try {
            AbstractC7264g0 type = m21013u(new C7294m1(enumC7336w1, abstractC7264g0), null, 0).getType();
            if (type == null) {
                m21033a(12);
            }
            return type;
        } catch (C7310c e) {
            C8964h m16945d = C8967k.m16945d(EnumC8966j.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (m16945d == null) {
                m21033a(13);
            }
            return m16945d;
        }
    }

    /* renamed from: p */
    public AbstractC7264g0 m21018p(AbstractC7264g0 abstractC7264g0, EnumC7336w1 enumC7336w1) {
        if (abstractC7264g0 == null) {
            m21033a(14);
        }
        if (enumC7336w1 == null) {
            m21033a(15);
        }
        InterfaceC7288k1 m21017q = m21017q(new C7294m1(enumC7336w1, m21024j().mo20958g(abstractC7264g0, enumC7336w1)));
        if (m21017q == null) {
            return null;
        }
        return m21017q.getType();
    }

    /* renamed from: q */
    public InterfaceC7288k1 m21017q(InterfaceC7288k1 interfaceC7288k1) {
        if (interfaceC7288k1 == null) {
            m21033a(16);
        }
        InterfaceC7288k1 m21014t = m21014t(interfaceC7288k1);
        if (!this.f19742a.mo20961a() && !this.f19742a.mo3540b()) {
            return m21014t;
        }
        return C10910b.m9569c(m21014t, this.f19742a.mo3540b());
    }

    /* renamed from: t */
    public InterfaceC7288k1 m21014t(InterfaceC7288k1 interfaceC7288k1) {
        if (interfaceC7288k1 == null) {
            m21033a(17);
        }
        if (m21023k()) {
            return interfaceC7288k1;
        }
        try {
            return m21013u(interfaceC7288k1, null, 0);
        } catch (C7310c unused) {
            return null;
        }
    }
}