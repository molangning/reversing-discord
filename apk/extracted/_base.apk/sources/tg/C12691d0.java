package tg;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p142hi.AbstractC7264g0;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p325rg.InterfaceC12155g;
import ph.C11638f;

/* renamed from: tg.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12691d0 extends AbstractC12683b0 implements InterfaceC11991v0 {

    /* renamed from: v */
    private AbstractC7264g0 f32913v;

    /* renamed from: w */
    private final InterfaceC11991v0 f32914w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12691d0(InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, boolean z, boolean z2, boolean z3, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11991v0 interfaceC11991v0, InterfaceC11900a1 interfaceC11900a1) {
        super(enumC11915e0, abstractC11988u, interfaceC11989u0, interfaceC12155g, C11638f.m7419i("<get-" + interfaceC11989u0.getName() + ">"), z, z2, z3, enumC11903a, interfaceC11900a1);
        C12691d0 c12691d0;
        C12691d0 c12691d02;
        if (interfaceC11989u0 == null) {
            m4469g0(0);
        }
        if (interfaceC12155g == null) {
            m4469g0(1);
        }
        if (enumC11915e0 == null) {
            m4469g0(2);
        }
        if (abstractC11988u == null) {
            m4469g0(3);
        }
        if (enumC11903a == null) {
            m4469g0(4);
        }
        if (interfaceC11900a1 == null) {
            m4469g0(5);
        }
        if (interfaceC11991v0 != 0) {
            c12691d02 = this;
            c12691d0 = interfaceC11991v0;
        } else {
            c12691d0 = this;
            c12691d02 = c12691d0;
        }
        c12691d02.f32914w = c12691d0;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4469g0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // tg.AbstractC12683b0, tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: P0 */
    public InterfaceC11991v0 mo4221a() {
        InterfaceC11991v0 interfaceC11991v0 = this.f32914w;
        if (interfaceC11991v0 == null) {
            m4469g0(8);
        }
        return interfaceC11991v0;
    }

    /* renamed from: Q0 */
    public void m4470Q0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            abstractC7264g0 = mo4535S().getType();
        }
        this.f32913v = abstractC7264g0;
    }

    @Override // p305qg.InterfaceC11998y, p305qg.InterfaceC11902b, p305qg.InterfaceC11897a
    /* renamed from: d */
    public Collection<? extends InterfaceC11991v0> mo4310d() {
        Collection<InterfaceC11987t0> m4539L0 = super.m4539L0(true);
        if (m4539L0 == null) {
            m4469g0(6);
        }
        return m4539L0;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return interfaceC11964o.mo4393a(this, d);
    }

    @Override // p305qg.InterfaceC11897a
    public AbstractC7264g0 getReturnType() {
        return this.f32913v;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: i */
    public List<InterfaceC11936j1> mo4301i() {
        List<InterfaceC11936j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4469g0(7);
        }
        return emptyList;
    }
}
