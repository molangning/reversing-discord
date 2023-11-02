package tg;

import bi.C2313e;
import bi.InterfaceC2315g;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12155g;

/* renamed from: tg.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12731q extends AbstractC12684c {

    /* renamed from: l */
    private final InterfaceC11914e f33044l;

    /* renamed from: m */
    private final C2313e f33045m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12731q(InterfaceC11914e interfaceC11914e) {
        super(InterfaceC12155g.f31603f.m6037b());
        if (interfaceC11914e == null) {
            m4244g0(0);
        }
        this.f33044l = interfaceC11914e;
        this.f33045m = new C2313e(interfaceC11914e, null);
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4244g0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11947m mo4163b() {
        InterfaceC11914e interfaceC11914e = this.f33044l;
        if (interfaceC11914e == null) {
            m4244g0(2);
        }
        return interfaceC11914e;
    }

    @Override // p305qg.InterfaceC11997x0
    public InterfaceC2315g getValue() {
        C2313e c2313e = this.f33045m;
        if (c2313e == null) {
            m4244g0(1);
        }
        return c2313e;
    }

    @Override // tg.AbstractC12706j
    public String toString() {
        return "class " + this.f33044l.getName() + "::this";
    }
}