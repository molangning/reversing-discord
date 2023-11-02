package bh;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import p142hi.AbstractC7264g0;
import p271oi.C11154p;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import tg.C12701g0;
import th.C12756d;

/* renamed from: bh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C2302e extends C12701g0 implements InterfaceC2298a {

    /* renamed from: P */
    public static final InterfaceC11897a.InterfaceC11898a<InterfaceC11936j1> f6401P = new C2303a();

    /* renamed from: Q */
    public static final InterfaceC11897a.InterfaceC11898a<Boolean> f6402Q = new C2304b();

    /* renamed from: N */
    private EnumC2305c f6403N;

    /* renamed from: O */
    private final boolean f6404O;

    /* renamed from: bh.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C2303a implements InterfaceC11897a.InterfaceC11898a<InterfaceC11936j1> {
        C2303a() {
        }
    }

    /* renamed from: bh.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C2304b implements InterfaceC11897a.InterfaceC11898a<Boolean> {
        C2304b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bh.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC2305c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: j */
        public final boolean f6410j;

        /* renamed from: k */
        public final boolean f6411k;

        EnumC2305c(boolean z, boolean z2) {
            this.f6410j = z;
            this.f6411k = z2;
        }

        /* renamed from: a */
        private static /* synthetic */ void m33670a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        /* renamed from: b */
        public static EnumC2305c m33669b(boolean z, boolean z2) {
            EnumC2305c enumC2305c = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (enumC2305c == null) {
                m33670a(0);
            }
            return enumC2305c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C2302e(InterfaceC11947m interfaceC11947m, InterfaceC12005z0 interfaceC12005z0, InterfaceC12155g interfaceC12155g, C11638f c11638f, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1, boolean z) {
        super(interfaceC11947m, interfaceC12005z0, interfaceC12155g, c11638f, enumC11903a, interfaceC11900a1);
        if (interfaceC11947m == null) {
            m33675g0(0);
        }
        if (interfaceC12155g == null) {
            m33675g0(1);
        }
        if (c11638f == null) {
            m33675g0(2);
        }
        if (enumC11903a == null) {
            m33675g0(3);
        }
        if (interfaceC11900a1 == null) {
            m33675g0(4);
        }
        this.f6403N = null;
        this.f6404O = z;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m33675g0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: p1 */
    public static C2302e m33674p1(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, C11638f c11638f, InterfaceC11900a1 interfaceC11900a1, boolean z) {
        if (interfaceC11947m == null) {
            m33675g0(5);
        }
        if (interfaceC12155g == null) {
            m33675g0(6);
        }
        if (c11638f == null) {
            m33675g0(7);
        }
        if (interfaceC11900a1 == null) {
            m33675g0(8);
        }
        return new C2302e(interfaceC11947m, null, interfaceC12155g, c11638f, InterfaceC11902b.EnumC11903a.DECLARATION, interfaceC11900a1, z);
    }

    @Override // tg.AbstractC12727p
    /* renamed from: Q0 */
    public boolean mo4324Q0() {
        return this.f6403N.f6410j;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11897a
    /* renamed from: f0 */
    public boolean mo4307f0() {
        return this.f6403N.f6411k;
    }

    @Override // tg.C12701g0
    /* renamed from: o1 */
    public C12701g0 mo4431o1(InterfaceC11997x0 interfaceC11997x0, InterfaceC11997x0 interfaceC11997x02, List<InterfaceC11997x0> list, List<? extends InterfaceC11920f1> list2, List<InterfaceC11936j1> list3, AbstractC7264g0 abstractC7264g0, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, Map<? extends InterfaceC11897a.InterfaceC11898a<?>, ?> map) {
        if (list == null) {
            m33675g0(9);
        }
        if (list2 == null) {
            m33675g0(10);
        }
        if (list3 == null) {
            m33675g0(11);
        }
        if (abstractC11988u == null) {
            m33675g0(12);
        }
        C12701g0 mo4431o1 = super.mo4431o1(interfaceC11997x0, interfaceC11997x02, list, list2, list3, abstractC7264g0, enumC11915e0, abstractC11988u, map);
        m4306f1(C11154p.f29134a.m9117a(mo4431o1).m9111a());
        if (mo4431o1 == null) {
            m33675g0(13);
        }
        return mo4431o1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.C12701g0, tg.AbstractC12727p
    /* renamed from: q1 */
    public C2302e mo4330L0(InterfaceC11947m interfaceC11947m, InterfaceC11998y interfaceC11998y, InterfaceC11902b.EnumC11903a enumC11903a, C11638f c11638f, InterfaceC12155g interfaceC12155g, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11947m == null) {
            m33675g0(14);
        }
        if (enumC11903a == null) {
            m33675g0(15);
        }
        if (interfaceC12155g == null) {
            m33675g0(16);
        }
        if (interfaceC11900a1 == null) {
            m33675g0(17);
        }
        InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) interfaceC11998y;
        if (c11638f == null) {
            c11638f = getName();
        }
        C2302e c2302e = new C2302e(interfaceC11947m, interfaceC12005z0, interfaceC12155g, c11638f, enumC11903a, interfaceC11900a1, this.f6404O);
        c2302e.m33671s1(mo4324Q0(), mo4307f0());
        return c2302e;
    }

    @Override // bh.InterfaceC2298a
    /* renamed from: r1 */
    public C2302e mo33666p0(AbstractC7264g0 abstractC7264g0, List<AbstractC7264g0> list, AbstractC7264g0 abstractC7264g02, Pair<InterfaceC11897a.InterfaceC11898a<?>, ?> pair) {
        InterfaceC11997x0 m4134i;
        if (list == null) {
            m33675g0(19);
        }
        if (abstractC7264g02 == null) {
            m33675g0(20);
        }
        List<InterfaceC11936j1> m33665a = C2308h.m33665a(list, mo4301i(), this);
        if (abstractC7264g0 == null) {
            m4134i = null;
        } else {
            m4134i = C12756d.m4134i(this, abstractC7264g0, InterfaceC12155g.f31603f.m6037b());
        }
        C2302e c2302e = (C2302e) mo4296u().mo4269b(m33665a).mo4259l(abstractC7264g02).mo4260k(m4134i).mo4270a().mo4261j().build();
        if (pair != null) {
            c2302e.m4320U0(pair.m14349c(), pair.m14348d());
        }
        if (c2302e == null) {
            m33675g0(21);
        }
        return c2302e;
    }

    /* renamed from: s1 */
    public void m33671s1(boolean z, boolean z2) {
        this.f6403N = EnumC2305c.m33669b(z, z2);
    }
}
