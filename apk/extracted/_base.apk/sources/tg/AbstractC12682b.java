package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6821n;
import p142hi.EnumC7336w1;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11912d1;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12155g;
import ph.C11638f;

/* renamed from: tg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12682b extends AbstractC12692e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12682b(InterfaceC6821n interfaceC6821n, InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, C11638f c11638f, EnumC7336w1 enumC7336w1, boolean z, int i, InterfaceC11900a1 interfaceC11900a1, InterfaceC11912d1 interfaceC11912d1) {
        super(interfaceC6821n, interfaceC11947m, interfaceC12155g, c11638f, enumC7336w1, z, i, interfaceC11900a1, interfaceC11912d1);
        if (interfaceC6821n == null) {
            m4542g0(0);
        }
        if (interfaceC11947m == null) {
            m4542g0(1);
        }
        if (interfaceC12155g == null) {
            m4542g0(2);
        }
        if (c11638f == null) {
            m4542g0(3);
        }
        if (enumC7336w1 == null) {
            m4542g0(4);
        }
        if (interfaceC11900a1 == null) {
            m4542g0(5);
        }
        if (interfaceC11912d1 == null) {
            m4542g0(6);
        }
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4542g0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // tg.AbstractC12706j
    public String toString() {
        String str;
        Object[] objArr = new Object[3];
        String str2 = "";
        if (!mo4463x()) {
            str = "";
        } else {
            str = "reified ";
        }
        objArr[0] = str;
        if (mo4464m() != EnumC7336w1.INVARIANT) {
            str2 = mo4464m() + " ";
        }
        objArr[1] = str2;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
