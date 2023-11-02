package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p142hi.AbstractC7264g0;
import p142hi.C7276i0;
import p142hi.EnumC7336w1;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11912d1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11638f;
import th.C12758e;

/* renamed from: tg.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12711k0 extends AbstractC12692e {

    /* renamed from: t */
    private final Function1<AbstractC7264g0, Void> f32958t;

    /* renamed from: u */
    private final List<AbstractC7264g0> f32959u;

    /* renamed from: v */
    private boolean f32960v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C12711k0(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, boolean z, EnumC7336w1 enumC7336w1, C11638f c11638f, int i, InterfaceC11900a1 interfaceC11900a1, Function1<AbstractC7264g0, Void> function1, InterfaceC11912d1 interfaceC11912d1, InterfaceC6821n interfaceC6821n) {
        super(interfaceC6821n, interfaceC11947m, interfaceC12155g, c11638f, enumC7336w1, z, i, interfaceC11900a1, interfaceC11912d1);
        if (interfaceC11947m == null) {
            m4394g0(19);
        }
        if (interfaceC12155g == null) {
            m4394g0(20);
        }
        if (enumC7336w1 == null) {
            m4394g0(21);
        }
        if (c11638f == null) {
            m4394g0(22);
        }
        if (interfaceC11900a1 == null) {
            m4394g0(23);
        }
        if (interfaceC11912d1 == null) {
            m4394g0(24);
        }
        if (interfaceC6821n == null) {
            m4394g0(25);
        }
        this.f32959u = new ArrayList(1);
        this.f32960v = false;
        this.f32958t = function1;
    }

    /* renamed from: N0 */
    private void m4403N0() {
        if (this.f32960v) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + m4396U0());
    }

    /* renamed from: O0 */
    private void m4402O0() {
        if (!this.f32960v) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + m4396U0());
    }

    /* renamed from: P0 */
    public static C12711k0 m4401P0(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, boolean z, EnumC7336w1 enumC7336w1, C11638f c11638f, int i, InterfaceC11900a1 interfaceC11900a1, InterfaceC6821n interfaceC6821n) {
        if (interfaceC11947m == null) {
            m4394g0(6);
        }
        if (interfaceC12155g == null) {
            m4394g0(7);
        }
        if (enumC7336w1 == null) {
            m4394g0(8);
        }
        if (c11638f == null) {
            m4394g0(9);
        }
        if (interfaceC11900a1 == null) {
            m4394g0(10);
        }
        if (interfaceC6821n == null) {
            m4394g0(11);
        }
        return m4400Q0(interfaceC11947m, interfaceC12155g, z, enumC7336w1, c11638f, i, interfaceC11900a1, null, InterfaceC11912d1.C11913a.f30912a, interfaceC6821n);
    }

    /* renamed from: Q0 */
    public static C12711k0 m4400Q0(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, boolean z, EnumC7336w1 enumC7336w1, C11638f c11638f, int i, InterfaceC11900a1 interfaceC11900a1, Function1<AbstractC7264g0, Void> function1, InterfaceC11912d1 interfaceC11912d1, InterfaceC6821n interfaceC6821n) {
        if (interfaceC11947m == null) {
            m4394g0(12);
        }
        if (interfaceC12155g == null) {
            m4394g0(13);
        }
        if (enumC7336w1 == null) {
            m4394g0(14);
        }
        if (c11638f == null) {
            m4394g0(15);
        }
        if (interfaceC11900a1 == null) {
            m4394g0(16);
        }
        if (interfaceC11912d1 == null) {
            m4394g0(17);
        }
        if (interfaceC6821n == null) {
            m4394g0(18);
        }
        return new C12711k0(interfaceC11947m, interfaceC12155g, z, enumC7336w1, c11638f, i, interfaceC11900a1, function1, interfaceC11912d1, interfaceC6821n);
    }

    /* renamed from: R0 */
    public static InterfaceC11920f1 m4399R0(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, boolean z, EnumC7336w1 enumC7336w1, C11638f c11638f, int i, InterfaceC6821n interfaceC6821n) {
        if (interfaceC11947m == null) {
            m4394g0(0);
        }
        if (interfaceC12155g == null) {
            m4394g0(1);
        }
        if (enumC7336w1 == null) {
            m4394g0(2);
        }
        if (c11638f == null) {
            m4394g0(3);
        }
        if (interfaceC6821n == null) {
            m4394g0(4);
        }
        C12711k0 m4401P0 = m4401P0(interfaceC11947m, interfaceC12155g, z, enumC7336w1, c11638f, i, InterfaceC11900a1.f30901a, interfaceC6821n);
        m4401P0.m4404M0(C13801c.m1505j(interfaceC11947m).m9779y());
        m4401P0.m4395V0();
        return m4401P0;
    }

    /* renamed from: S0 */
    private void m4398S0(AbstractC7264g0 abstractC7264g0) {
        if (C7276i0.m21083a(abstractC7264g0)) {
            return;
        }
        this.f32959u.add(abstractC7264g0);
    }

    /* renamed from: U0 */
    private String m4396U0() {
        return getName() + " declared in " + C12758e.m4099m(mo4163b());
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4394g0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // tg.AbstractC12692e
    /* renamed from: K0 */
    protected void mo4406K0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m4394g0(27);
        }
        Function1<AbstractC7264g0, Void> function1 = this.f32958t;
        if (function1 == null) {
            return;
        }
        function1.invoke(abstractC7264g0);
    }

    @Override // tg.AbstractC12692e
    /* renamed from: L0 */
    protected List<AbstractC7264g0> mo4405L0() {
        m4403N0();
        List<AbstractC7264g0> list = this.f32959u;
        if (list == null) {
            m4394g0(28);
        }
        return list;
    }

    /* renamed from: M0 */
    public void m4404M0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m4394g0(26);
        }
        m4402O0();
        m4398S0(abstractC7264g0);
    }

    /* renamed from: T0 */
    public boolean m4397T0() {
        return this.f32960v;
    }

    /* renamed from: V0 */
    public void m4395V0() {
        m4402O0();
        this.f32960v = true;
    }
}