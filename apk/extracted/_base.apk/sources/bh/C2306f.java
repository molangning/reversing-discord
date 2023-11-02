package bh;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6816j;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function0;
import ng.AbstractC10870h;
import p141hh.C7213r;
import p142hi.AbstractC7264g0;
import p305qg.AbstractC11988u;
import p305qg.C11934j;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p305qg.InterfaceC11993w0;
import p305qg.InterfaceC11997x0;
import p325rg.InterfaceC12155g;
import p389vh.AbstractC13301g;
import ph.C11638f;
import tg.C12685c0;
import tg.C12691d0;
import tg.C12697e0;
import th.C12756d;

/* renamed from: bh.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C2306f extends C12685c0 implements InterfaceC2298a {

    /* renamed from: L */
    private final boolean f6412L;

    /* renamed from: M */
    private final Pair<InterfaceC11897a.InterfaceC11898a<?>, ?> f6413M;

    /* renamed from: N */
    private AbstractC7264g0 f6414N;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2306f(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, boolean z, C11638f c11638f, InterfaceC11900a1 interfaceC11900a1, InterfaceC11989u0 interfaceC11989u0, InterfaceC11902b.EnumC11903a enumC11903a, boolean z2, Pair<InterfaceC11897a.InterfaceC11898a<?>, ?> pair) {
        super(interfaceC11947m, interfaceC11989u0, interfaceC12155g, enumC11915e0, abstractC11988u, z, c11638f, enumC11903a, interfaceC11900a1, false, false, false, false, false, false);
        if (interfaceC11947m == null) {
            m33667g0(0);
        }
        if (interfaceC12155g == null) {
            m33667g0(1);
        }
        if (enumC11915e0 == null) {
            m33667g0(2);
        }
        if (abstractC11988u == null) {
            m33667g0(3);
        }
        if (c11638f == null) {
            m33667g0(4);
        }
        if (interfaceC11900a1 == null) {
            m33667g0(5);
        }
        if (enumC11903a == null) {
            m33667g0(6);
        }
        this.f6414N = null;
        this.f6412L = z2;
        this.f6413M = pair;
    }

    /* renamed from: f1 */
    public static C2306f m33668f1(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, boolean z, C11638f c11638f, InterfaceC11900a1 interfaceC11900a1, boolean z2) {
        if (interfaceC11947m == null) {
            m33667g0(7);
        }
        if (interfaceC12155g == null) {
            m33667g0(8);
        }
        if (enumC11915e0 == null) {
            m33667g0(9);
        }
        if (abstractC11988u == null) {
            m33667g0(10);
        }
        if (c11638f == null) {
            m33667g0(11);
        }
        if (interfaceC11900a1 == null) {
            m33667g0(12);
        }
        return new C2306f(interfaceC11947m, interfaceC12155g, enumC11915e0, abstractC11988u, z, c11638f, interfaceC11900a1, null, InterfaceC11902b.EnumC11903a.DECLARATION, z2, null);
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m33667g0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(format);
        }
    }

    @Override // tg.C12685c0
    /* renamed from: P0 */
    protected C12685c0 mo4526P0(InterfaceC11947m interfaceC11947m, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, InterfaceC11989u0 interfaceC11989u0, InterfaceC11902b.EnumC11903a enumC11903a, C11638f c11638f, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11947m == null) {
            m33667g0(13);
        }
        if (enumC11915e0 == null) {
            m33667g0(14);
        }
        if (abstractC11988u == null) {
            m33667g0(15);
        }
        if (enumC11903a == null) {
            m33667g0(16);
        }
        if (c11638f == null) {
            m33667g0(17);
        }
        if (interfaceC11900a1 == null) {
            m33667g0(18);
        }
        return new C2306f(interfaceC11947m, getAnnotations(), enumC11915e0, abstractC11988u, mo4342L(), c11638f, interfaceC11900a1, interfaceC11989u0, enumC11903a, this.f6412L, this.f6413M);
    }

    @Override // tg.C12685c0, p305qg.InterfaceC11943k1
    /* renamed from: Z */
    public boolean mo4516Z() {
        AbstractC7264g0 type = getType();
        if (this.f6412L && C11934j.m6705a(type) && (!C7213r.m21229i(type) || AbstractC10870h.m9785u0(type))) {
            return true;
        }
        return false;
    }

    @Override // tg.C12685c0
    /* renamed from: Z0 */
    public void mo4515Z0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m33667g0(22);
        }
        this.f6414N = abstractC7264g0;
    }

    @Override // tg.AbstractC12718m0, p305qg.InterfaceC11897a
    /* renamed from: f0 */
    public boolean mo4307f0() {
        return false;
    }

    @Override // tg.C12685c0, p305qg.InterfaceC11897a
    /* renamed from: i0 */
    public <V> V mo4300i0(InterfaceC11897a.InterfaceC11898a<V> interfaceC11898a) {
        Pair<InterfaceC11897a.InterfaceC11898a<?>, ?> pair = this.f6413M;
        if (pair != null && pair.m14349c().equals(interfaceC11898a)) {
            return (V) this.f6413M.m14348d();
        }
        return null;
    }

    @Override // bh.InterfaceC2298a
    /* renamed from: p0 */
    public InterfaceC2298a mo33666p0(AbstractC7264g0 abstractC7264g0, List<AbstractC7264g0> list, AbstractC7264g0 abstractC7264g02, Pair<InterfaceC11897a.InterfaceC11898a<?>, ?> pair) {
        InterfaceC11989u0 mo4221a;
        C12691d0 c12691d0;
        C12697e0 c12697e0;
        InterfaceC11997x0 m4134i;
        List<InterfaceC11997x0> m14104i;
        InterfaceC11993w0 mo4507h;
        InterfaceC11991v0 mo4509f;
        if (list == null) {
            m33667g0(19);
        }
        if (abstractC7264g02 == null) {
            m33667g0(20);
        }
        if (mo4221a() == this) {
            mo4221a = null;
        } else {
            mo4221a = mo4221a();
        }
        C2306f c2306f = new C2306f(mo4163b(), getAnnotations(), mo4167r(), getVisibility(), mo4342L(), getName(), mo4160j(), mo4221a, mo4305g(), this.f6412L, pair);
        C12691d0 mo4509f2 = mo4509f();
        if (mo4509f2 != null) {
            InterfaceC12155g annotations = mo4509f2.getAnnotations();
            EnumC11915e0 mo4167r = mo4509f2.mo4167r();
            AbstractC11988u visibility = mo4509f2.getVisibility();
            boolean mo4541E = mo4509f2.mo4541E();
            boolean isExternal = mo4509f2.isExternal();
            boolean isInline = mo4509f2.isInline();
            InterfaceC11902b.EnumC11903a mo4305g = mo4305g();
            if (mo4221a == null) {
                mo4509f = null;
            } else {
                mo4509f = mo4221a.mo4509f();
            }
            c12691d0 = r15;
            C12691d0 c12691d02 = new C12691d0(c2306f, annotations, mo4167r, visibility, mo4541E, isExternal, isInline, mo4305g, mo4509f, mo4509f2.mo4160j());
            c12691d0.m4537N0(mo4509f2.mo4297s0());
            c12691d0.m4470Q0(abstractC7264g02);
        } else {
            c12691d0 = null;
        }
        InterfaceC11993w0 mo4507h2 = mo4507h();
        if (mo4507h2 != null) {
            InterfaceC12155g annotations2 = mo4507h2.getAnnotations();
            EnumC11915e0 mo4167r2 = mo4507h2.mo4167r();
            AbstractC11988u visibility2 = mo4507h2.getVisibility();
            boolean mo4541E2 = mo4507h2.mo4541E();
            boolean isExternal2 = mo4507h2.isExternal();
            boolean isInline2 = mo4507h2.isInline();
            InterfaceC11902b.EnumC11903a mo4305g2 = mo4305g();
            if (mo4221a == null) {
                mo4507h = null;
            } else {
                mo4507h = mo4221a.mo4507h();
            }
            C12697e0 c12697e02 = new C12697e0(c2306f, annotations2, mo4167r2, visibility2, mo4541E2, isExternal2, isInline2, mo4305g2, mo4507h, mo4507h2.mo4160j());
            c12697e02.m4537N0(c12697e02.mo4297s0());
            c12697e02.m4449R0(mo4507h2.mo4301i().get(0));
            c12697e0 = c12697e02;
        } else {
            c12697e0 = null;
        }
        c2306f.m4520V0(c12691d0, c12697e0, mo4505w0(), mo4529N());
        c2306f.m4514a1(m4519W0());
        Function0<InterfaceC6816j<AbstractC13301g<?>>> function0 = this.f32989q;
        if (function0 != null) {
            c2306f.m4343K0(this.f32988p, function0);
        }
        c2306f.mo4336D0(mo4310d());
        if (abstractC7264g0 == null) {
            m4134i = null;
        } else {
            m4134i = C12756d.m4134i(this, abstractC7264g0, InterfaceC12155g.f31603f.m6037b());
        }
        List<InterfaceC11920f1> typeParameters = getTypeParameters();
        InterfaceC11997x0 mo4332I = mo4332I();
        m14104i = C9545j.m14104i();
        c2306f.m4513b1(abstractC7264g02, typeParameters, mo4332I, m4134i, m14104i);
        return c2306f;
    }
}
