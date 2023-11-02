package p142hi;

import ai.InterfaceC0194h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import p161ii.AbstractC7592g;
import p161ii.InterfaceC7605n;
import p183ji.C8964h;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p327ri.C12263f;

/* renamed from: hi.s1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7320s1 {

    /* renamed from: a */
    public static final AbstractC7302o0 f19756a = C8967k.m16945d(EnumC8966j.DONT_CARE, new String[0]);

    /* renamed from: b */
    public static final AbstractC7302o0 f19757b = C8967k.m16945d(EnumC8966j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c */
    public static final AbstractC7302o0 f19758c = new C7321a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final AbstractC7302o0 f19759d = new C7321a("UNIT_EXPECTED_TYPE");

    /* renamed from: hi.s1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C7321a extends AbstractC7315r {

        /* renamed from: k */
        private final String f19760k;

        public C7321a(String str) {
            this.f19760k = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0044  */
        /* renamed from: Z0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m20968Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p142hi.C7320s1.C7321a.m20968Z0(int):void");
        }

        @Override // p142hi.AbstractC7333v1
        /* renamed from: U0 */
        public AbstractC7302o0 mo3561R0(boolean z) {
            throw new IllegalStateException(this.f19760k);
        }

        @Override // p142hi.AbstractC7333v1
        /* renamed from: V0 */
        public AbstractC7302o0 mo3559T0(C7226c1 c7226c1) {
            if (c7226c1 == null) {
                m20968Z0(0);
            }
            throw new IllegalStateException(this.f19760k);
        }

        @Override // p142hi.AbstractC7315r
        /* renamed from: W0 */
        protected AbstractC7302o0 mo20971W0() {
            throw new IllegalStateException(this.f19760k);
        }

        @Override // p142hi.AbstractC7315r
        /* renamed from: Y0 */
        public AbstractC7315r mo20969Y0(AbstractC7302o0 abstractC7302o0) {
            if (abstractC7302o0 == null) {
                m20968Z0(2);
            }
            throw new IllegalStateException(this.f19760k);
        }

        @Override // p142hi.AbstractC7315r
        /* renamed from: a1 */
        public C7321a mo20970X0(AbstractC7592g abstractC7592g) {
            if (abstractC7592g == null) {
                m20968Z0(3);
            }
            return this;
        }

        @Override // p142hi.AbstractC7302o0
        public String toString() {
            String str = this.f19760k;
            if (str == null) {
                m20968Z0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01da  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m20994a(int r24) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.C7320s1.m20994a(int):void");
    }

    /* renamed from: b */
    public static boolean m20993b(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(28);
        }
        if (abstractC7264g0.mo3563O0()) {
            return true;
        }
        if (C7229d0.m21192b(abstractC7264g0) && m20993b(C7229d0.m21193a(abstractC7264g0).m21217W0())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m20992c(AbstractC7264g0 abstractC7264g0, Function1<AbstractC7333v1, Boolean> function1) {
        if (function1 == null) {
            m20994a(43);
        }
        return m20991d(abstractC7264g0, function1, null);
    }

    /* renamed from: d */
    private static boolean m20991d(AbstractC7264g0 abstractC7264g0, Function1<AbstractC7333v1, Boolean> function1, C12263f<AbstractC7264g0> c12263f) {
        AbstractC7217a0 abstractC7217a0;
        if (function1 == null) {
            m20994a(44);
        }
        if (abstractC7264g0 == null) {
            return false;
        }
        AbstractC7333v1 mo20916Q0 = abstractC7264g0.mo20916Q0();
        if (m20972w(abstractC7264g0)) {
            return function1.invoke(mo20916Q0).booleanValue();
        }
        if (c12263f != null && c12263f.contains(abstractC7264g0)) {
            return false;
        }
        if (function1.invoke(mo20916Q0).booleanValue()) {
            return true;
        }
        if (c12263f == null) {
            c12263f = C12263f.m5644a();
        }
        c12263f.add(abstractC7264g0);
        if (mo20916Q0 instanceof AbstractC7217a0) {
            abstractC7217a0 = (AbstractC7217a0) mo20916Q0;
        } else {
            abstractC7217a0 = null;
        }
        if (abstractC7217a0 != null && (m20991d(abstractC7217a0.m21218V0(), function1, c12263f) || m20991d(abstractC7217a0.m21217W0(), function1, c12263f))) {
            return true;
        }
        if ((mo20916Q0 instanceof C7304p) && m20991d(((C7304p) mo20916Q0).m21040Z0(), function1, c12263f)) {
            return true;
        }
        InterfaceC7265g1 mo3564N0 = abstractC7264g0.mo3564N0();
        if (mo3564N0 instanceof C7239f0) {
            for (AbstractC7264g0 abstractC7264g02 : ((C7239f0) mo3564N0).mo2791m()) {
                if (m20991d(abstractC7264g02, function1, c12263f)) {
                    return true;
                }
            }
            return false;
        }
        for (InterfaceC7288k1 interfaceC7288k1 : abstractC7264g0.mo3566L0()) {
            if (!interfaceC7288k1.mo20955a()) {
                if (m20991d(interfaceC7288k1.getType(), function1, c12263f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static AbstractC7264g0 m20990e(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02, C7307p1 c7307p1) {
        if (abstractC7264g0 == null) {
            m20994a(20);
        }
        if (abstractC7264g02 == null) {
            m20994a(21);
        }
        if (c7307p1 == null) {
            m20994a(22);
        }
        AbstractC7264g0 m21018p = c7307p1.m21018p(abstractC7264g02, EnumC7336w1.INVARIANT);
        if (m21018p != null) {
            return m20978q(m21018p, abstractC7264g0.mo3563O0());
        }
        return null;
    }

    /* renamed from: f */
    public static InterfaceC11914e m20989f(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(30);
        }
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11914e) {
            return (InterfaceC11914e) mo2788p;
        }
        return null;
    }

    /* renamed from: g */
    public static List<InterfaceC7288k1> m20988g(List<InterfaceC11920f1> list) {
        List<InterfaceC7288k1> m14075C0;
        if (list == null) {
            m20994a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (InterfaceC11920f1 interfaceC11920f1 : list) {
            arrayList.add(new C7294m1(interfaceC11920f1.mo4224p()));
        }
        m14075C0 = C9553r.m14075C0(arrayList);
        if (m14075C0 == null) {
            m20994a(17);
        }
        return m14075C0;
    }

    /* renamed from: h */
    public static List<AbstractC7264g0> m20987h(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(18);
        }
        C7307p1 m21028f = C7307p1.m21028f(abstractC7264g0);
        Collection<AbstractC7264g0> mo2791m = abstractC7264g0.mo3564N0().mo2791m();
        ArrayList arrayList = new ArrayList(mo2791m.size());
        for (AbstractC7264g0 abstractC7264g02 : mo2791m) {
            AbstractC7264g0 m20990e = m20990e(abstractC7264g0, abstractC7264g02, m21028f);
            if (m20990e != null) {
                arrayList.add(m20990e);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static InterfaceC11920f1 m20986i(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(63);
        }
        if (abstractC7264g0.mo3564N0().mo2788p() instanceof InterfaceC11920f1) {
            return (InterfaceC11920f1) abstractC7264g0.mo3564N0().mo2788p();
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m20985j(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(29);
        }
        if (abstractC7264g0.mo3564N0().mo2788p() instanceof InterfaceC11914e) {
            return false;
        }
        for (AbstractC7264g0 abstractC7264g02 : m20987h(abstractC7264g0)) {
            if (m20983l(abstractC7264g02)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m20984k(AbstractC7264g0 abstractC7264g0) {
        return abstractC7264g0 != null && abstractC7264g0.mo3564N0() == f19756a.mo3564N0();
    }

    /* renamed from: l */
    public static boolean m20983l(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(27);
        }
        if (abstractC7264g0.mo3563O0()) {
            return true;
        }
        if (C7229d0.m21192b(abstractC7264g0) && m20983l(C7229d0.m21193a(abstractC7264g0).m21217W0())) {
            return true;
        }
        if (C7319s0.m21003c(abstractC7264g0)) {
            return false;
        }
        if (m20982m(abstractC7264g0)) {
            return m20985j(abstractC7264g0);
        }
        if (abstractC7264g0 instanceof AbstractC7231e) {
            InterfaceC11920f1 m20250a = ((AbstractC7231e) abstractC7264g0).m21187W0().m20250a();
            if (m20250a == null || m20985j(m20250a.mo4224p())) {
                return true;
            }
            return false;
        }
        InterfaceC7265g1 mo3564N0 = abstractC7264g0.mo3564N0();
        if (mo3564N0 instanceof C7239f0) {
            for (AbstractC7264g0 abstractC7264g02 : mo3564N0.mo2791m()) {
                if (m20983l(abstractC7264g02)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m20982m(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(60);
        }
        if (m20986i(abstractC7264g0) == null && !(abstractC7264g0.mo3564N0() instanceof InterfaceC7605n)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static AbstractC7264g0 m20981n(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(2);
        }
        return m20979p(abstractC7264g0, false);
    }

    /* renamed from: o */
    public static AbstractC7264g0 m20980o(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(1);
        }
        return m20979p(abstractC7264g0, true);
    }

    /* renamed from: p */
    public static AbstractC7264g0 m20979p(AbstractC7264g0 abstractC7264g0, boolean z) {
        if (abstractC7264g0 == null) {
            m20994a(3);
        }
        AbstractC7333v1 mo3561R0 = abstractC7264g0.mo20916Q0().mo3561R0(z);
        if (mo3561R0 == null) {
            m20994a(4);
        }
        return mo3561R0;
    }

    /* renamed from: q */
    public static AbstractC7264g0 m20978q(AbstractC7264g0 abstractC7264g0, boolean z) {
        if (abstractC7264g0 == null) {
            m20994a(8);
        }
        if (z) {
            return m20980o(abstractC7264g0);
        }
        if (abstractC7264g0 == null) {
            m20994a(9);
        }
        return abstractC7264g0;
    }

    /* renamed from: r */
    public static AbstractC7302o0 m20977r(AbstractC7302o0 abstractC7302o0, boolean z) {
        if (abstractC7302o0 == null) {
            m20994a(5);
        }
        if (z) {
            AbstractC7302o0 mo3558U0 = abstractC7302o0.mo3558U0(true);
            if (mo3558U0 == null) {
                m20994a(6);
            }
            return mo3558U0;
        }
        if (abstractC7302o0 == null) {
            m20994a(7);
        }
        return abstractC7302o0;
    }

    /* renamed from: s */
    public static InterfaceC7288k1 m20976s(InterfaceC11920f1 interfaceC11920f1) {
        if (interfaceC11920f1 == null) {
            m20994a(45);
        }
        return new C7327u0(interfaceC11920f1);
    }

    /* renamed from: t */
    public static InterfaceC7288k1 m20975t(InterfaceC11920f1 interfaceC11920f1, C7341y c7341y) {
        if (interfaceC11920f1 == null) {
            m20994a(46);
        }
        if (c7341y.mo20912b() == EnumC7317r1.SUPERTYPE) {
            return new C7294m1(C7331v0.m20939b(interfaceC11920f1));
        }
        return new C7327u0(interfaceC11920f1);
    }

    /* renamed from: u */
    public static AbstractC7302o0 m20974u(InterfaceC7265g1 interfaceC7265g1, InterfaceC0194h interfaceC0194h, Function1<AbstractC7592g, AbstractC7302o0> function1) {
        if (interfaceC7265g1 == null) {
            m20994a(12);
        }
        if (interfaceC0194h == null) {
            m20994a(13);
        }
        if (function1 == null) {
            m20994a(14);
        }
        AbstractC7302o0 m21096l = C7267h0.m21096l(C7226c1.f19622k.m21197h(), interfaceC7265g1, m20988g(interfaceC7265g1.getParameters()), false, interfaceC0194h, function1);
        if (m21096l == null) {
            m20994a(15);
        }
        return m21096l;
    }

    /* renamed from: v */
    public static AbstractC7302o0 m20973v(InterfaceC11927h interfaceC11927h, InterfaceC0194h interfaceC0194h, Function1<AbstractC7592g, AbstractC7302o0> function1) {
        if (C8967k.m16936m(interfaceC11927h)) {
            C8964h m16945d = C8967k.m16945d(EnumC8966j.UNABLE_TO_SUBSTITUTE_TYPE, interfaceC11927h.toString());
            if (m16945d == null) {
                m20994a(11);
            }
            return m16945d;
        }
        return m20974u(interfaceC11927h.mo4173k(), interfaceC0194h, function1);
    }

    /* renamed from: w */
    public static boolean m20972w(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m20994a(0);
        }
        if (abstractC7264g0 != f19758c && abstractC7264g0 != f19759d) {
            return false;
        }
        return true;
    }
}