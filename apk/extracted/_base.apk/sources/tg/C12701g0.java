package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p142hi.AbstractC7264g0;
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

/* renamed from: tg.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12701g0 extends AbstractC12727p implements InterfaceC12005z0 {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12701g0(InterfaceC11947m interfaceC11947m, InterfaceC12005z0 interfaceC12005z0, InterfaceC12155g interfaceC12155g, C11638f c11638f, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC11947m, interfaceC12005z0, interfaceC12155g, c11638f, enumC11903a, interfaceC11900a1);
        if (interfaceC11947m == null) {
            m4436g0(0);
        }
        if (interfaceC12155g == null) {
            m4436g0(1);
        }
        if (c11638f == null) {
            m4436g0(2);
        }
        if (enumC11903a == null) {
            m4436g0(3);
        }
        if (interfaceC11900a1 == null) {
            m4436g0(4);
        }
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4436g0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: l1 */
    public static C12701g0 m4434l1(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, C11638f c11638f, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11947m == null) {
            m4436g0(5);
        }
        if (interfaceC12155g == null) {
            m4436g0(6);
        }
        if (c11638f == null) {
            m4436g0(7);
        }
        if (enumC11903a == null) {
            m4436g0(8);
        }
        if (interfaceC11900a1 == null) {
            m4436g0(9);
        }
        return new C12701g0(interfaceC11947m, null, interfaceC12155g, c11638f, enumC11903a, interfaceC11900a1);
    }

    @Override // tg.AbstractC12727p
    /* renamed from: L0 */
    protected AbstractC12727p mo4330L0(InterfaceC11947m interfaceC11947m, InterfaceC11998y interfaceC11998y, InterfaceC11902b.EnumC11903a enumC11903a, C11638f c11638f, InterfaceC12155g interfaceC12155g, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11947m == null) {
            m4436g0(25);
        }
        if (enumC11903a == null) {
            m4436g0(26);
        }
        if (interfaceC12155g == null) {
            m4436g0(27);
        }
        if (interfaceC11900a1 == null) {
            m4436g0(28);
        }
        InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) interfaceC11998y;
        if (c11638f == null) {
            c11638f = getName();
        }
        return new C12701g0(interfaceC11947m, interfaceC12005z0, interfaceC12155g, c11638f, enumC11903a, interfaceC11900a1);
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11902b
    /* renamed from: k1 */
    public InterfaceC12005z0 mo4317X(InterfaceC11947m interfaceC11947m, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, InterfaceC11902b.EnumC11903a enumC11903a, boolean z) {
        InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) super.mo4317X(interfaceC11947m, enumC11915e0, abstractC11988u, enumC11903a, z);
        if (interfaceC12005z0 == null) {
            m4436g0(29);
        }
        return interfaceC12005z0;
    }

    @Override // tg.AbstractC12727p, tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: m1 */
    public InterfaceC12005z0 mo4221a() {
        InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) super.mo4221a();
        if (interfaceC12005z0 == null) {
            m4436g0(24);
        }
        return interfaceC12005z0;
    }

    @Override // tg.AbstractC12727p
    /* renamed from: n1 */
    public C12701g0 mo4323R0(InterfaceC11997x0 interfaceC11997x0, InterfaceC11997x0 interfaceC11997x02, List<InterfaceC11997x0> list, List<? extends InterfaceC11920f1> list2, List<InterfaceC11936j1> list3, AbstractC7264g0 abstractC7264g0, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u) {
        if (list == null) {
            m4436g0(14);
        }
        if (list2 == null) {
            m4436g0(15);
        }
        if (list3 == null) {
            m4436g0(16);
        }
        if (abstractC11988u == null) {
            m4436g0(17);
        }
        C12701g0 mo4431o1 = mo4431o1(interfaceC11997x0, interfaceC11997x02, list, list2, list3, abstractC7264g0, enumC11915e0, abstractC11988u, null);
        if (mo4431o1 == null) {
            m4436g0(18);
        }
        return mo4431o1;
    }

    /* renamed from: o1 */
    public C12701g0 mo4431o1(InterfaceC11997x0 interfaceC11997x0, InterfaceC11997x0 interfaceC11997x02, List<InterfaceC11997x0> list, List<? extends InterfaceC11920f1> list2, List<InterfaceC11936j1> list3, AbstractC7264g0 abstractC7264g0, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, Map<? extends InterfaceC11897a.InterfaceC11898a<?>, ?> map) {
        if (list == null) {
            m4436g0(19);
        }
        if (list2 == null) {
            m4436g0(20);
        }
        if (list3 == null) {
            m4436g0(21);
        }
        if (abstractC11988u == null) {
            m4436g0(22);
        }
        super.mo4323R0(interfaceC11997x0, interfaceC11997x02, list, list2, list3, abstractC7264g0, enumC11915e0, abstractC11988u);
        if (map != null && !map.isEmpty()) {
            this.f33003M = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11998y, p305qg.InterfaceC12005z0
    /* renamed from: u */
    public InterfaceC11998y.InterfaceC11999a<? extends InterfaceC12005z0> mo4296u() {
        InterfaceC11998y.InterfaceC11999a mo4296u = super.mo4296u();
        if (mo4296u == null) {
            m4436g0(30);
        }
        return mo4296u;
    }
}
