package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11959n;
import p305qg.InterfaceC11966p;
import p325rg.InterfaceC12155g;
import ph.C11638f;

/* renamed from: tg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12710k extends AbstractC12706j implements InterfaceC11959n {

    /* renamed from: l */
    private final InterfaceC11947m f32956l;

    /* renamed from: m */
    private final InterfaceC11900a1 f32957m;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12710k(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, C11638f c11638f, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC12155g, c11638f);
        if (interfaceC11947m == null) {
            m4407g0(0);
        }
        if (interfaceC12155g == null) {
            m4407g0(1);
        }
        if (c11638f == null) {
            m4407g0(2);
        }
        if (interfaceC11900a1 == null) {
            m4407g0(3);
        }
        this.f32956l = interfaceC11947m;
        this.f32957m = interfaceC11900a1;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4407g0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: E0 */
    public InterfaceC11966p mo4221a() {
        InterfaceC11966p interfaceC11966p = (InterfaceC11966p) super.mo4221a();
        if (interfaceC11966p == null) {
            m4407g0(4);
        }
        return interfaceC11966p;
    }

    /* renamed from: b */
    public InterfaceC11947m mo4163b() {
        InterfaceC11947m interfaceC11947m = this.f32956l;
        if (interfaceC11947m == null) {
            m4407g0(5);
        }
        return interfaceC11947m;
    }

    /* renamed from: j */
    public InterfaceC11900a1 mo4160j() {
        InterfaceC11900a1 interfaceC11900a1 = this.f32957m;
        if (interfaceC11900a1 == null) {
            m4407g0(6);
        }
        return interfaceC11900a1;
    }
}
