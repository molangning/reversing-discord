package tg;

import bi.C2311c;
import bi.C2312d;
import bi.InterfaceC2314f;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6816j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7297n1;
import p142hi.C7307p1;
import p142hi.C7322t;
import p142hi.EnumC7336w1;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p305qg.InterfaceC11992w;
import p305qg.InterfaceC11993w0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p325rg.InterfaceC12155g;
import p327ri.C12263f;
import p389vh.AbstractC13301g;
import p429xh.C13801c;
import ph.C11638f;

/* renamed from: tg.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12685c0 extends AbstractC12725n0 implements InterfaceC11989u0 {

    /* renamed from: A */
    private final boolean f32874A;

    /* renamed from: B */
    private final boolean f32875B;

    /* renamed from: C */
    private List<InterfaceC11997x0> f32876C;

    /* renamed from: D */
    private InterfaceC11997x0 f32877D;

    /* renamed from: E */
    private InterfaceC11997x0 f32878E;

    /* renamed from: F */
    private List<InterfaceC11920f1> f32879F;

    /* renamed from: G */
    private C12691d0 f32880G;

    /* renamed from: H */
    private InterfaceC11993w0 f32881H;

    /* renamed from: I */
    private boolean f32882I;

    /* renamed from: J */
    private InterfaceC11992w f32883J;

    /* renamed from: K */
    private InterfaceC11992w f32884K;

    /* renamed from: r */
    private final EnumC11915e0 f32885r;

    /* renamed from: s */
    private AbstractC11988u f32886s;

    /* renamed from: t */
    private Collection<? extends InterfaceC11989u0> f32887t;

    /* renamed from: u */
    private final InterfaceC11989u0 f32888u;

    /* renamed from: v */
    private final InterfaceC11902b.EnumC11903a f32889v;

    /* renamed from: w */
    private final boolean f32890w;

    /* renamed from: x */
    private final boolean f32891x;

    /* renamed from: y */
    private final boolean f32892y;

    /* renamed from: z */
    private final boolean f32893z;

    /* renamed from: tg.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12686a {

        /* renamed from: a */
        private InterfaceC11947m f32894a;

        /* renamed from: b */
        private EnumC11915e0 f32895b;

        /* renamed from: c */
        private AbstractC11988u f32896c;

        /* renamed from: f */
        private InterfaceC11902b.EnumC11903a f32899f;

        /* renamed from: i */
        private InterfaceC11997x0 f32902i;

        /* renamed from: k */
        private C11638f f32904k;

        /* renamed from: l */
        private AbstractC7264g0 f32905l;

        /* renamed from: d */
        private InterfaceC11989u0 f32897d = null;

        /* renamed from: e */
        private boolean f32898e = false;

        /* renamed from: g */
        private AbstractC7297n1 f32900g = AbstractC7297n1.f19730b;

        /* renamed from: h */
        private boolean f32901h = true;

        /* renamed from: j */
        private List<InterfaceC11920f1> f32903j = null;

        public C12686a() {
            this.f32894a = C12685c0.this.mo4163b();
            this.f32895b = C12685c0.this.mo4167r();
            this.f32896c = C12685c0.this.getVisibility();
            this.f32899f = C12685c0.this.mo4305g();
            this.f32902i = C12685c0.this.f32877D;
            this.f32904k = C12685c0.this.getName();
            this.f32905l = C12685c0.this.getType();
        }

        /* renamed from: a */
        private static /* synthetic */ void m4503a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: n */
        public InterfaceC11989u0 m4490n() {
            return C12685c0.this.m4525Q0(this);
        }

        /* renamed from: o */
        InterfaceC11991v0 m4489o() {
            InterfaceC11989u0 interfaceC11989u0 = this.f32897d;
            if (interfaceC11989u0 == null) {
                return null;
            }
            return interfaceC11989u0.mo4509f();
        }

        /* renamed from: p */
        InterfaceC11993w0 m4488p() {
            InterfaceC11989u0 interfaceC11989u0 = this.f32897d;
            if (interfaceC11989u0 == null) {
                return null;
            }
            return interfaceC11989u0.mo4507h();
        }

        /* renamed from: q */
        public C12686a m4487q(boolean z) {
            this.f32901h = z;
            return this;
        }

        /* renamed from: r */
        public C12686a m4486r(InterfaceC11902b.EnumC11903a enumC11903a) {
            if (enumC11903a == null) {
                m4503a(10);
            }
            this.f32899f = enumC11903a;
            return this;
        }

        /* renamed from: s */
        public C12686a m4485s(EnumC11915e0 enumC11915e0) {
            if (enumC11915e0 == null) {
                m4503a(6);
            }
            this.f32895b = enumC11915e0;
            return this;
        }

        /* renamed from: t */
        public C12686a m4484t(InterfaceC11902b interfaceC11902b) {
            this.f32897d = (InterfaceC11989u0) interfaceC11902b;
            return this;
        }

        /* renamed from: u */
        public C12686a m4483u(InterfaceC11947m interfaceC11947m) {
            if (interfaceC11947m == null) {
                m4503a(0);
            }
            this.f32894a = interfaceC11947m;
            return this;
        }

        /* renamed from: v */
        public C12686a m4482v(AbstractC7297n1 abstractC7297n1) {
            if (abstractC7297n1 == null) {
                m4503a(15);
            }
            this.f32900g = abstractC7297n1;
            return this;
        }

        /* renamed from: w */
        public C12686a m4481w(AbstractC11988u abstractC11988u) {
            if (abstractC11988u == null) {
                m4503a(8);
            }
            this.f32896c = abstractC11988u;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12685c0(InterfaceC11947m interfaceC11947m, InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, boolean z, C11638f c11638f, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(interfaceC11947m, interfaceC12155g, c11638f, null, z, interfaceC11900a1);
        if (interfaceC11947m == null) {
            m4508g0(0);
        }
        if (interfaceC12155g == null) {
            m4508g0(1);
        }
        if (enumC11915e0 == null) {
            m4508g0(2);
        }
        if (abstractC11988u == null) {
            m4508g0(3);
        }
        if (c11638f == null) {
            m4508g0(4);
        }
        if (enumC11903a == null) {
            m4508g0(5);
        }
        if (interfaceC11900a1 == null) {
            m4508g0(6);
        }
        this.f32887t = null;
        this.f32876C = Collections.emptyList();
        this.f32885r = enumC11915e0;
        this.f32886s = abstractC11988u;
        this.f32888u = interfaceC11989u0 == null ? this : interfaceC11989u0;
        this.f32889v = enumC11903a;
        this.f32890w = z2;
        this.f32891x = z3;
        this.f32892y = z4;
        this.f32893z = z5;
        this.f32874A = z6;
        this.f32875B = z7;
    }

    /* renamed from: O0 */
    public static C12685c0 m4527O0(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, boolean z, C11638f c11638f, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (interfaceC11947m == null) {
            m4508g0(7);
        }
        if (interfaceC12155g == null) {
            m4508g0(8);
        }
        if (enumC11915e0 == null) {
            m4508g0(9);
        }
        if (abstractC11988u == null) {
            m4508g0(10);
        }
        if (c11638f == null) {
            m4508g0(11);
        }
        if (enumC11903a == null) {
            m4508g0(12);
        }
        if (interfaceC11900a1 == null) {
            m4508g0(13);
        }
        return new C12685c0(interfaceC11947m, null, interfaceC12155g, enumC11915e0, abstractC11988u, z, c11638f, enumC11903a, interfaceC11900a1, z2, z3, z4, z5, z6, z7);
    }

    /* renamed from: S0 */
    private InterfaceC11900a1 m4523S0(boolean z, InterfaceC11989u0 interfaceC11989u0) {
        InterfaceC11900a1 interfaceC11900a1;
        if (z) {
            if (interfaceC11989u0 == null) {
                interfaceC11989u0 = mo4221a();
            }
            interfaceC11900a1 = interfaceC11989u0.mo4160j();
        } else {
            interfaceC11900a1 = InterfaceC11900a1.f30901a;
        }
        if (interfaceC11900a1 == null) {
            m4508g0(28);
        }
        return interfaceC11900a1;
    }

    /* renamed from: T0 */
    private static InterfaceC11998y m4522T0(C7307p1 c7307p1, InterfaceC11987t0 interfaceC11987t0) {
        if (c7307p1 == null) {
            m4508g0(30);
        }
        if (interfaceC11987t0 == null) {
            m4508g0(31);
        }
        if (interfaceC11987t0.mo4297s0() != null) {
            return interfaceC11987t0.mo4297s0().mo4225c(c7307p1);
        }
        return null;
    }

    /* renamed from: Y0 */
    private static AbstractC11988u m4517Y0(AbstractC11988u abstractC11988u, InterfaceC11902b.EnumC11903a enumC11903a) {
        if (enumC11903a == InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE && C11974t.m6672g(abstractC11988u.mo6653f())) {
            return C11974t.f30973h;
        }
        return abstractC11988u;
    }

    /* renamed from: d1 */
    private static InterfaceC11997x0 m4511d1(C7307p1 c7307p1, InterfaceC11989u0 interfaceC11989u0, InterfaceC11997x0 interfaceC11997x0) {
        AbstractC7264g0 m21018p = c7307p1.m21018p(interfaceC11997x0.getType(), EnumC7336w1.IN_VARIANCE);
        if (m21018p == null) {
            return null;
        }
        return new C12699f0(interfaceC11989u0, new C2311c(interfaceC11989u0, m21018p, ((InterfaceC2314f) interfaceC11997x0.getValue()).mo33659a(), interfaceC11997x0.getValue()), interfaceC11997x0.getAnnotations());
    }

    /* renamed from: e1 */
    private static InterfaceC11997x0 m4510e1(C7307p1 c7307p1, InterfaceC11989u0 interfaceC11989u0, InterfaceC11997x0 interfaceC11997x0) {
        AbstractC7264g0 m21018p = c7307p1.m21018p(interfaceC11997x0.getType(), EnumC7336w1.IN_VARIANCE);
        if (m21018p == null) {
            return null;
        }
        return new C12699f0(interfaceC11989u0, new C2312d(interfaceC11989u0, m21018p, interfaceC11997x0.getValue()), interfaceC11997x0.getAnnotations());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m4508g0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C12685c0.m4508g0(int):void");
    }

    @Override // p305qg.InterfaceC11946l1
    /* renamed from: A */
    public boolean mo4531A() {
        return this.f32875B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305qg.InterfaceC11902b
    /* renamed from: D0 */
    public void mo4336D0(Collection<? extends InterfaceC11902b> collection) {
        if (collection == 0) {
            m4508g0(40);
        }
        this.f32887t = collection;
    }

    @Override // tg.AbstractC12718m0, p305qg.InterfaceC11897a
    /* renamed from: I */
    public InterfaceC11997x0 mo4332I() {
        return this.f32877D;
    }

    @Override // tg.AbstractC12718m0, p305qg.InterfaceC11897a
    /* renamed from: M */
    public InterfaceC11997x0 mo4329M() {
        return this.f32878E;
    }

    @Override // p305qg.InterfaceC11989u0
    /* renamed from: N */
    public InterfaceC11992w mo4529N() {
        return this.f32884K;
    }

    @Override // p305qg.InterfaceC11902b
    /* renamed from: N0 */
    public InterfaceC11989u0 mo4317X(InterfaceC11947m interfaceC11947m, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, InterfaceC11902b.EnumC11903a enumC11903a, boolean z) {
        InterfaceC11989u0 m4490n = m4518X0().m4483u(interfaceC11947m).m4484t(null).m4485s(enumC11915e0).m4481w(abstractC11988u).m4486r(enumC11903a).m4487q(z).m4490n();
        if (m4490n == null) {
            m4508g0(42);
        }
        return m4490n;
    }

    /* renamed from: P0 */
    protected C12685c0 mo4526P0(InterfaceC11947m interfaceC11947m, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, InterfaceC11989u0 interfaceC11989u0, InterfaceC11902b.EnumC11903a enumC11903a, C11638f c11638f, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11947m == null) {
            m4508g0(32);
        }
        if (enumC11915e0 == null) {
            m4508g0(33);
        }
        if (abstractC11988u == null) {
            m4508g0(34);
        }
        if (enumC11903a == null) {
            m4508g0(35);
        }
        if (c11638f == null) {
            m4508g0(36);
        }
        if (interfaceC11900a1 == null) {
            m4508g0(37);
        }
        return new C12685c0(interfaceC11947m, interfaceC11989u0, getAnnotations(), enumC11915e0, abstractC11988u, mo4342L(), c11638f, enumC11903a, interfaceC11900a1, mo4504y0(), mo4516Z(), mo4172k0(), mo4178U(), isExternal(), mo4531A());
    }

    /* renamed from: Q0 */
    protected InterfaceC11989u0 m4525Q0(C12686a c12686a) {
        List<InterfaceC11920f1> list;
        InterfaceC11997x0 interfaceC11997x0;
        InterfaceC11997x0 interfaceC11997x02;
        C12691d0 c12691d0;
        C12697e0 c12697e0;
        C12726o c12726o;
        Function0<InterfaceC6816j<AbstractC13301g<?>>> function0;
        AbstractC7264g0 abstractC7264g0;
        if (c12686a == null) {
            m4508g0(29);
        }
        C12685c0 mo4526P0 = mo4526P0(c12686a.f32894a, c12686a.f32895b, c12686a.f32896c, c12686a.f32897d, c12686a.f32899f, c12686a.f32904k, m4523S0(c12686a.f32898e, c12686a.f32897d));
        if (c12686a.f32903j == null) {
            list = getTypeParameters();
        } else {
            list = c12686a.f32903j;
        }
        ArrayList arrayList = new ArrayList(list.size());
        C7307p1 m20965b = C7322t.m20965b(list, c12686a.f32900g, mo4526P0, arrayList);
        AbstractC7264g0 abstractC7264g02 = c12686a.f32905l;
        AbstractC7264g0 m21018p = m20965b.m21018p(abstractC7264g02, EnumC7336w1.OUT_VARIANCE);
        C12726o c12726o2 = null;
        if (m21018p == null) {
            return null;
        }
        AbstractC7264g0 m21018p2 = m20965b.m21018p(abstractC7264g02, EnumC7336w1.IN_VARIANCE);
        if (m21018p2 != null) {
            mo4526P0.mo4515Z0(m21018p2);
        }
        InterfaceC11997x0 interfaceC11997x03 = c12686a.f32902i;
        if (interfaceC11997x03 != null) {
            InterfaceC11997x0 mo4225c = interfaceC11997x03.mo4225c(m20965b);
            if (mo4225c == null) {
                return null;
            }
            interfaceC11997x0 = mo4225c;
        } else {
            interfaceC11997x0 = null;
        }
        InterfaceC11997x0 interfaceC11997x04 = this.f32878E;
        if (interfaceC11997x04 != null) {
            interfaceC11997x02 = m4510e1(m20965b, mo4526P0, interfaceC11997x04);
        } else {
            interfaceC11997x02 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC11997x0 interfaceC11997x05 : this.f32876C) {
            InterfaceC11997x0 m4511d1 = m4511d1(m20965b, mo4526P0, interfaceC11997x05);
            if (m4511d1 != null) {
                arrayList2.add(m4511d1);
            }
        }
        mo4526P0.m4513b1(m21018p, arrayList, interfaceC11997x0, interfaceC11997x02, arrayList2);
        if (this.f32880G == null) {
            c12691d0 = null;
        } else {
            c12691d0 = new C12691d0(mo4526P0, this.f32880G.getAnnotations(), c12686a.f32895b, m4517Y0(this.f32880G.getVisibility(), c12686a.f32899f), this.f32880G.mo4541E(), this.f32880G.isExternal(), this.f32880G.isInline(), c12686a.f32899f, c12686a.m4489o(), InterfaceC11900a1.f30901a);
        }
        if (c12691d0 != null) {
            AbstractC7264g0 returnType = this.f32880G.getReturnType();
            c12691d0.m4537N0(m4522T0(m20965b, this.f32880G));
            if (returnType != null) {
                abstractC7264g0 = m20965b.m21018p(returnType, EnumC7336w1.OUT_VARIANCE);
            } else {
                abstractC7264g0 = null;
            }
            c12691d0.m4470Q0(abstractC7264g0);
        }
        if (this.f32881H == null) {
            c12697e0 = null;
        } else {
            c12697e0 = new C12697e0(mo4526P0, this.f32881H.getAnnotations(), c12686a.f32895b, m4517Y0(this.f32881H.getVisibility(), c12686a.f32899f), this.f32881H.mo4541E(), this.f32881H.isExternal(), this.f32881H.isInline(), c12686a.f32899f, c12686a.m4488p(), InterfaceC11900a1.f30901a);
        }
        if (c12697e0 != null) {
            List<InterfaceC11936j1> m4325P0 = AbstractC12727p.m4325P0(c12697e0, this.f32881H.mo4301i(), m20965b, false, false, null);
            if (m4325P0 == null) {
                mo4526P0.m4514a1(true);
                m4325P0 = Collections.singletonList(C12697e0.m4451P0(c12697e0, C13801c.m1505j(c12686a.f32894a).m9843H(), this.f32881H.mo4301i().get(0).getAnnotations()));
            }
            if (m4325P0.size() == 1) {
                c12697e0.m4537N0(m4522T0(m20965b, this.f32881H));
                c12697e0.m4449R0(m4325P0.get(0));
            } else {
                throw new IllegalStateException();
            }
        }
        InterfaceC11992w interfaceC11992w = this.f32883J;
        if (interfaceC11992w == null) {
            c12726o = null;
        } else {
            c12726o = new C12726o(interfaceC11992w.getAnnotations(), mo4526P0);
        }
        InterfaceC11992w interfaceC11992w2 = this.f32884K;
        if (interfaceC11992w2 != null) {
            c12726o2 = new C12726o(interfaceC11992w2.getAnnotations(), mo4526P0);
        }
        mo4526P0.m4520V0(c12691d0, c12697e0, c12726o, c12726o2);
        if (c12686a.f32901h) {
            C12263f m5644a = C12263f.m5644a();
            for (InterfaceC11989u0 interfaceC11989u0 : mo4310d()) {
                m5644a.add(interfaceC11989u0.mo4225c(m20965b));
            }
            mo4526P0.mo4336D0(m5644a);
        }
        if (mo4516Z() && (function0 = this.f32989q) != null) {
            mo4526P0.m4343K0(this.f32988p, function0);
        }
        return mo4526P0;
    }

    @Override // p305qg.InterfaceC11989u0
    /* renamed from: R0 */
    public C12691d0 mo4509f() {
        return this.f32880G;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return this.f32893z;
    }

    /* renamed from: U0 */
    public void m4521U0(C12691d0 c12691d0, InterfaceC11993w0 interfaceC11993w0) {
        m4520V0(c12691d0, interfaceC11993w0, null, null);
    }

    /* renamed from: V0 */
    public void m4520V0(C12691d0 c12691d0, InterfaceC11993w0 interfaceC11993w0, InterfaceC11992w interfaceC11992w, InterfaceC11992w interfaceC11992w2) {
        this.f32880G = c12691d0;
        this.f32881H = interfaceC11993w0;
        this.f32883J = interfaceC11992w;
        this.f32884K = interfaceC11992w2;
    }

    /* renamed from: W0 */
    public boolean m4519W0() {
        return this.f32882I;
    }

    /* renamed from: X0 */
    public C12686a m4518X0() {
        return new C12686a();
    }

    /* renamed from: Z */
    public boolean mo4516Z() {
        return this.f32891x;
    }

    /* renamed from: Z0 */
    public void mo4515Z0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m4508g0(14);
        }
    }

    /* renamed from: a1 */
    public void m4514a1(boolean z) {
        this.f32882I = z;
    }

    /* renamed from: b1 */
    public void m4513b1(AbstractC7264g0 abstractC7264g0, List<? extends InterfaceC11920f1> list, InterfaceC11997x0 interfaceC11997x0, InterfaceC11997x0 interfaceC11997x02, List<InterfaceC11997x0> list2) {
        if (abstractC7264g0 == null) {
            m4508g0(17);
        }
        if (list == null) {
            m4508g0(18);
        }
        if (list2 == null) {
            m4508g0(19);
        }
        m4367G0(abstractC7264g0);
        this.f32879F = new ArrayList(list);
        this.f32878E = interfaceC11997x02;
        this.f32877D = interfaceC11997x0;
        this.f32876C = list2;
    }

    /* renamed from: c1 */
    public void m4512c1(AbstractC11988u abstractC11988u) {
        if (abstractC11988u == null) {
            m4508g0(20);
        }
        this.f32886s = abstractC11988u;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: d */
    public Collection<? extends InterfaceC11989u0> mo4310d() {
        Collection<? extends InterfaceC11989u0> collection = this.f32887t;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m4508g0(41);
        }
        return collection;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return interfaceC11964o.mo5032b(this, d);
    }

    @Override // p305qg.InterfaceC11902b
    /* renamed from: g */
    public InterfaceC11902b.EnumC11903a mo4305g() {
        InterfaceC11902b.EnumC11903a enumC11903a = this.f32889v;
        if (enumC11903a == null) {
            m4508g0(39);
        }
        return enumC11903a;
    }

    @Override // tg.AbstractC12718m0, p305qg.InterfaceC11897a
    public AbstractC7264g0 getReturnType() {
        AbstractC7264g0 type = getType();
        if (type == null) {
            m4508g0(23);
        }
        return type;
    }

    @Override // tg.AbstractC12718m0, p305qg.InterfaceC11897a
    public List<InterfaceC11920f1> getTypeParameters() {
        List<InterfaceC11920f1> list = this.f32879F;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u abstractC11988u = this.f32886s;
        if (abstractC11988u == null) {
            m4508g0(25);
        }
        return abstractC11988u;
    }

    @Override // p305qg.InterfaceC11989u0
    /* renamed from: h */
    public InterfaceC11993w0 mo4507h() {
        return this.f32881H;
    }

    /* renamed from: i0 */
    public <V> V mo4300i0(InterfaceC11897a.InterfaceC11898a<V> interfaceC11898a) {
        return null;
    }

    public boolean isExternal() {
        return this.f32874A;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return this.f32892y;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: r */
    public EnumC11915e0 mo4167r() {
        EnumC11915e0 enumC11915e0 = this.f32885r;
        if (enumC11915e0 == null) {
            m4508g0(24);
        }
        return enumC11915e0;
    }

    @Override // p305qg.InterfaceC11989u0
    /* renamed from: v */
    public List<InterfaceC11987t0> mo4506v() {
        ArrayList arrayList = new ArrayList(2);
        C12691d0 c12691d0 = this.f32880G;
        if (c12691d0 != null) {
            arrayList.add(c12691d0);
        }
        InterfaceC11993w0 interfaceC11993w0 = this.f32881H;
        if (interfaceC11993w0 != null) {
            arrayList.add(interfaceC11993w0);
        }
        return arrayList;
    }

    @Override // p305qg.InterfaceC11989u0
    /* renamed from: w0 */
    public InterfaceC11992w mo4505w0() {
        return this.f32883J;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: x0 */
    public List<InterfaceC11997x0> mo4295x0() {
        List<InterfaceC11997x0> list = this.f32876C;
        if (list == null) {
            m4508g0(22);
        }
        return list;
    }

    @Override // p305qg.InterfaceC11943k1
    /* renamed from: y0 */
    public boolean mo4504y0() {
        return this.f32890w;
    }

    @Override // p305qg.InterfaceC11909c1
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public InterfaceC11897a mo4225c(C7307p1 c7307p1) {
        if (c7307p1 == null) {
            m4508g0(27);
        }
        return c7307p1.m21023k() ? this : m4518X0().m4482v(c7307p1.m21024j()).m4484t(mo4221a()).m4490n();
    }

    @Override // tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: a */
    public InterfaceC11989u0 mo4221a() {
        InterfaceC11989u0 interfaceC11989u0 = this.f32888u;
        InterfaceC11989u0 mo4221a = interfaceC11989u0 == this ? this : interfaceC11989u0.mo4221a();
        if (mo4221a == null) {
            m4508g0(38);
        }
        return mo4221a;
    }
}
