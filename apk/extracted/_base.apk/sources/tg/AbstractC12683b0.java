package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p142hi.C7307p1;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p325rg.InterfaceC12155g;
import ph.C11638f;

/* renamed from: tg.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12683b0 extends AbstractC12710k implements InterfaceC11987t0 {

    /* renamed from: n */
    private boolean f32866n;

    /* renamed from: o */
    private final boolean f32867o;

    /* renamed from: p */
    private final EnumC11915e0 f32868p;

    /* renamed from: q */
    private final InterfaceC11989u0 f32869q;

    /* renamed from: r */
    private final boolean f32870r;

    /* renamed from: s */
    private final InterfaceC11902b.EnumC11903a f32871s;

    /* renamed from: t */
    private AbstractC11988u f32872t;

    /* renamed from: u */
    private InterfaceC11998y f32873u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12683b0(EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, C11638f c11638f, boolean z, boolean z2, boolean z3, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC11989u0.mo4163b(), interfaceC12155g, c11638f, interfaceC11900a1);
        if (enumC11915e0 == null) {
            m4534g0(0);
        }
        if (abstractC11988u == null) {
            m4534g0(1);
        }
        if (interfaceC11989u0 == null) {
            m4534g0(2);
        }
        if (interfaceC12155g == null) {
            m4534g0(3);
        }
        if (c11638f == null) {
            m4534g0(4);
        }
        if (interfaceC11900a1 == null) {
            m4534g0(5);
        }
        this.f32873u = null;
        this.f32868p = enumC11915e0;
        this.f32872t = abstractC11988u;
        this.f32869q = interfaceC11989u0;
        this.f32866n = z;
        this.f32867o = z2;
        this.f32870r = z3;
        this.f32871s = enumC11903a;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4534g0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p305qg.InterfaceC11998y
    /* renamed from: B */
    public boolean mo4338B() {
        return false;
    }

    @Override // p305qg.InterfaceC11998y
    /* renamed from: C0 */
    public boolean mo4337C0() {
        return false;
    }

    @Override // p305qg.InterfaceC11902b
    /* renamed from: D0 */
    public void mo4336D0(Collection<? extends InterfaceC11902b> collection) {
        if (collection == null) {
            m4534g0(16);
        }
    }

    @Override // p305qg.InterfaceC11987t0
    /* renamed from: E */
    public boolean mo4541E() {
        return this.f32866n;
    }

    @Override // p305qg.InterfaceC11998y
    /* renamed from: F0 */
    public boolean mo4334F0() {
        return false;
    }

    @Override // p305qg.InterfaceC11902b
    /* renamed from: G0 */
    public InterfaceC11987t0 mo4317X(InterfaceC11947m interfaceC11947m, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, InterfaceC11902b.EnumC11903a enumC11903a, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: I */
    public InterfaceC11997x0 mo4332I() {
        return mo4535S().mo4332I();
    }

    @Override // tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: K0 */
    public abstract InterfaceC11987t0 mo4221a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L0 */
    public Collection<InterfaceC11987t0> m4539L0(boolean z) {
        InterfaceC11947m mo4507h;
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC11989u0 interfaceC11989u0 : mo4535S().mo4310d()) {
            if (z) {
                mo4507h = interfaceC11989u0.mo4509f();
            } else {
                mo4507h = interfaceC11989u0.mo4507h();
            }
            if (mo4507h != null) {
                arrayList.add(mo4507h);
            }
        }
        return arrayList;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: M */
    public InterfaceC11997x0 mo4329M() {
        return mo4535S().mo4329M();
    }

    /* renamed from: M0 */
    public void m4538M0(boolean z) {
        this.f32866n = z;
    }

    /* renamed from: N0 */
    public void m4537N0(InterfaceC11998y interfaceC11998y) {
        this.f32873u = interfaceC11998y;
    }

    /* renamed from: O0 */
    public void m4536O0(AbstractC11988u abstractC11988u) {
        this.f32872t = abstractC11988u;
    }

    @Override // p305qg.InterfaceC11987t0
    /* renamed from: S */
    public InterfaceC11989u0 mo4535S() {
        InterfaceC11989u0 interfaceC11989u0 = this.f32869q;
        if (interfaceC11989u0 == null) {
            m4534g0(13);
        }
        return interfaceC11989u0;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return false;
    }

    @Override // p305qg.InterfaceC11909c1
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public InterfaceC11998y mo4225c(C7307p1 c7307p1) {
        if (c7307p1 == null) {
            m4534g0(7);
        }
        return this;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: f0 */
    public boolean mo4307f0() {
        return false;
    }

    @Override // p305qg.InterfaceC11902b
    /* renamed from: g */
    public InterfaceC11902b.EnumC11903a mo4305g() {
        InterfaceC11902b.EnumC11903a enumC11903a = this.f32871s;
        if (enumC11903a == null) {
            m4534g0(6);
        }
        return enumC11903a;
    }

    @Override // p305qg.InterfaceC11897a
    public List<InterfaceC11920f1> getTypeParameters() {
        List<InterfaceC11920f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4534g0(9);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u abstractC11988u = this.f32872t;
        if (abstractC11988u == null) {
            m4534g0(11);
        }
        return abstractC11988u;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: i0 */
    public <V> V mo4300i0(InterfaceC11897a.InterfaceC11898a<V> interfaceC11898a) {
        return null;
    }

    @Override // p305qg.InterfaceC11911d0
    public boolean isExternal() {
        return this.f32867o;
    }

    @Override // p305qg.InterfaceC11998y
    public boolean isInfix() {
        return false;
    }

    @Override // p305qg.InterfaceC11998y
    public boolean isInline() {
        return this.f32870r;
    }

    @Override // p305qg.InterfaceC11998y
    public boolean isOperator() {
        return false;
    }

    @Override // p305qg.InterfaceC11998y
    public boolean isSuspend() {
        return false;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return false;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: r */
    public EnumC11915e0 mo4167r() {
        EnumC11915e0 enumC11915e0 = this.f32868p;
        if (enumC11915e0 == null) {
            m4534g0(10);
        }
        return enumC11915e0;
    }

    @Override // p305qg.InterfaceC11998y
    /* renamed from: s0 */
    public InterfaceC11998y mo4297s0() {
        return this.f32873u;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: x0 */
    public List<InterfaceC11997x0> mo4295x0() {
        List<InterfaceC11997x0> mo4295x0 = mo4535S().mo4295x0();
        if (mo4295x0 == null) {
            m4534g0(14);
        }
        return mo4295x0;
    }
}
