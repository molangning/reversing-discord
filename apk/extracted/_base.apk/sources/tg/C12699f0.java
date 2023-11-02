package tg;

import bi.InterfaceC2315g;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12155g;

/* renamed from: tg.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12699f0 extends AbstractC12684c {

    /* renamed from: l */
    private final InterfaceC11947m f32932l;

    /* renamed from: m */
    private InterfaceC2315g f32933m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12699f0(InterfaceC11947m interfaceC11947m, InterfaceC2315g interfaceC2315g, InterfaceC12155g interfaceC12155g) {
        super(interfaceC12155g);
        if (interfaceC11947m == null) {
            m4438g0(0);
        }
        if (interfaceC2315g == null) {
            m4438g0(1);
        }
        if (interfaceC12155g == null) {
            m4438g0(2);
        }
        this.f32932l = interfaceC11947m;
        this.f32933m = interfaceC2315g;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4438g0(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                objArr[2] = "copy";
            } else if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11947m mo4163b() {
        InterfaceC11947m interfaceC11947m = this.f32932l;
        if (interfaceC11947m == null) {
            m4438g0(4);
        }
        return interfaceC11947m;
    }

    @Override // p305qg.InterfaceC11997x0
    public InterfaceC2315g getValue() {
        InterfaceC2315g interfaceC2315g = this.f32933m;
        if (interfaceC2315g == null) {
            m4438g0(3);
        }
        return interfaceC2315g;
    }
}
