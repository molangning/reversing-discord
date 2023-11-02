package bh;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9545j;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import tg.C12698f;
import th.C12756d;

/* renamed from: bh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C2299b extends C12698f implements InterfaceC2298a {

    /* renamed from: O */
    private Boolean f6396O;

    /* renamed from: P */
    private Boolean f6397P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C2299b(InterfaceC11914e interfaceC11914e, C2299b c2299b, InterfaceC12155g interfaceC12155g, boolean z, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC11914e, c2299b, interfaceC12155g, z, enumC11903a, interfaceC11900a1);
        if (interfaceC11914e == null) {
            m33680g0(0);
        }
        if (interfaceC12155g == null) {
            m33680g0(1);
        }
        if (enumC11903a == null) {
            m33680g0(2);
        }
        if (interfaceC11900a1 == null) {
            m33680g0(3);
        }
        this.f6396O = null;
        this.f6397P = null;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m33680g0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: t1 */
    public static C2299b m33678t1(InterfaceC11914e interfaceC11914e, InterfaceC12155g interfaceC12155g, boolean z, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11914e == null) {
            m33680g0(4);
        }
        if (interfaceC12155g == null) {
            m33680g0(5);
        }
        if (interfaceC11900a1 == null) {
            m33680g0(6);
        }
        return new C2299b(interfaceC11914e, null, interfaceC12155g, z, InterfaceC11902b.EnumC11903a.DECLARATION, interfaceC11900a1);
    }

    @Override // tg.AbstractC12727p
    /* renamed from: Q0 */
    public boolean mo4324Q0() {
        return this.f6396O.booleanValue();
    }

    @Override // tg.AbstractC12727p
    /* renamed from: Y0 */
    public void mo4315Y0(boolean z) {
        this.f6396O = Boolean.valueOf(z);
    }

    @Override // tg.AbstractC12727p
    /* renamed from: Z0 */
    public void mo4314Z0(boolean z) {
        this.f6397P = Boolean.valueOf(z);
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11897a
    /* renamed from: f0 */
    public boolean mo4307f0() {
        return this.f6397P.booleanValue();
    }

    /* renamed from: s1 */
    protected C2299b m33679s1(InterfaceC11914e interfaceC11914e, C2299b c2299b, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1, InterfaceC12155g interfaceC12155g) {
        if (interfaceC11914e == null) {
            m33680g0(12);
        }
        if (enumC11903a == null) {
            m33680g0(13);
        }
        if (interfaceC11900a1 == null) {
            m33680g0(14);
        }
        if (interfaceC12155g == null) {
            m33680g0(15);
        }
        return new C2299b(interfaceC11914e, c2299b, interfaceC12155g, this.f32931N, enumC11903a, interfaceC11900a1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.C12698f
    /* renamed from: u1 */
    public C2299b mo4442o1(InterfaceC11947m interfaceC11947m, InterfaceC11998y interfaceC11998y, InterfaceC11902b.EnumC11903a enumC11903a, C11638f c11638f, InterfaceC12155g interfaceC12155g, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11947m == null) {
            m33680g0(7);
        }
        if (enumC11903a == null) {
            m33680g0(8);
        }
        if (interfaceC12155g == null) {
            m33680g0(9);
        }
        if (interfaceC11900a1 == null) {
            m33680g0(10);
        }
        if (enumC11903a != InterfaceC11902b.EnumC11903a.DECLARATION && enumC11903a != InterfaceC11902b.EnumC11903a.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC11947m + "\nkind: " + enumC11903a);
        }
        C2299b m33679s1 = m33679s1((InterfaceC11914e) interfaceC11947m, (C2299b) interfaceC11998y, enumC11903a, interfaceC11900a1, interfaceC12155g);
        m33679s1.mo4315Y0(mo4324Q0());
        m33679s1.mo4314Z0(mo4307f0());
        return m33679s1;
    }

    @Override // bh.InterfaceC2298a
    /* renamed from: v1 */
    public C2299b mo33666p0(AbstractC7264g0 abstractC7264g0, List<AbstractC7264g0> list, AbstractC7264g0 abstractC7264g02, Pair<InterfaceC11897a.InterfaceC11898a<?>, ?> pair) {
        InterfaceC11997x0 m4134i;
        List<InterfaceC11997x0> m14104i;
        if (list == null) {
            m33680g0(16);
        }
        if (abstractC7264g02 == null) {
            m33680g0(17);
        }
        C2299b mo4442o1 = mo4442o1(mo4163b(), null, mo4305g(), null, getAnnotations(), mo4160j());
        if (abstractC7264g0 == null) {
            m4134i = null;
        } else {
            m4134i = C12756d.m4134i(mo4442o1, abstractC7264g0, InterfaceC12155g.f31603f.m6037b());
        }
        InterfaceC11997x0 mo4332I = mo4332I();
        m14104i = C9545j.m14104i();
        mo4442o1.mo4323R0(m4134i, mo4332I, m14104i, getTypeParameters(), C2308h.m33665a(list, mo4301i(), mo4442o1), abstractC7264g02, mo4167r(), getVisibility());
        if (pair != null) {
            mo4442o1.m4320U0(pair.m14349c(), pair.m14348d());
        }
        return mo4442o1;
    }
}
