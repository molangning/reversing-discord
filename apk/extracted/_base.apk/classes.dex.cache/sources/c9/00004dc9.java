package tg;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11993w0;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11638f;
import ph.C11640h;

/* renamed from: tg.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12697e0 extends AbstractC12683b0 implements InterfaceC11993w0 {

    /* renamed from: v */
    private InterfaceC11936j1 f32929v;

    /* renamed from: w */
    private final InterfaceC11993w0 f32930w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12697e0(InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, boolean z, boolean z2, boolean z3, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11993w0 interfaceC11993w0, InterfaceC11900a1 interfaceC11900a1) {
        super(enumC11915e0, abstractC11988u, interfaceC11989u0, interfaceC12155g, C11638f.m7419i("<set-" + interfaceC11989u0.getName() + ">"), z, z2, z3, enumC11903a, interfaceC11900a1);
        C12697e0 c12697e0;
        C12697e0 c12697e02;
        if (interfaceC11989u0 == null) {
            m4448g0(0);
        }
        if (interfaceC12155g == null) {
            m4448g0(1);
        }
        if (enumC11915e0 == null) {
            m4448g0(2);
        }
        if (abstractC11988u == null) {
            m4448g0(3);
        }
        if (enumC11903a == null) {
            m4448g0(4);
        }
        if (interfaceC11900a1 == null) {
            m4448g0(5);
        }
        if (interfaceC11993w0 != 0) {
            c12697e02 = this;
            c12697e0 = interfaceC11993w0;
        } else {
            c12697e0 = this;
            c12697e02 = c12697e0;
        }
        c12697e02.f32930w = c12697e0;
    }

    /* renamed from: P0 */
    public static C12713l0 m4451P0(InterfaceC11993w0 interfaceC11993w0, AbstractC7264g0 abstractC7264g0, InterfaceC12155g interfaceC12155g) {
        if (interfaceC11993w0 == null) {
            m4448g0(7);
        }
        if (abstractC7264g0 == null) {
            m4448g0(8);
        }
        if (interfaceC12155g == null) {
            m4448g0(9);
        }
        return new C12713l0(interfaceC11993w0, null, 0, interfaceC12155g, C11640h.f30231o, abstractC7264g0, false, false, false, null, InterfaceC11900a1.f30901a);
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4448g0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // tg.AbstractC12683b0, tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: Q0 */
    public InterfaceC11993w0 mo4221a() {
        InterfaceC11993w0 interfaceC11993w0 = this.f32930w;
        if (interfaceC11993w0 == null) {
            m4448g0(13);
        }
        return interfaceC11993w0;
    }

    /* renamed from: R0 */
    public void m4449R0(InterfaceC11936j1 interfaceC11936j1) {
        if (interfaceC11936j1 == null) {
            m4448g0(6);
        }
        this.f32929v = interfaceC11936j1;
    }

    @Override // p305qg.InterfaceC11998y, p305qg.InterfaceC11902b, p305qg.InterfaceC11897a
    /* renamed from: d */
    public Collection<? extends InterfaceC11993w0> mo4310d() {
        Collection<InterfaceC11987t0> m4539L0 = super.m4539L0(false);
        if (m4539L0 == null) {
            m4448g0(10);
        }
        return m4539L0;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return interfaceC11964o.mo4390e(this, d);
    }

    @Override // p305qg.InterfaceC11897a
    public AbstractC7264g0 getReturnType() {
        AbstractC7302o0 m9826Z = C13801c.m1505j(this).m9826Z();
        if (m9826Z == null) {
            m4448g0(12);
        }
        return m9826Z;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: i */
    public List<InterfaceC11936j1> mo4301i() {
        InterfaceC11936j1 interfaceC11936j1 = this.f32929v;
        if (interfaceC11936j1 != null) {
            List<InterfaceC11936j1> singletonList = Collections.singletonList(interfaceC11936j1);
            if (singletonList == null) {
                m4448g0(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }
}