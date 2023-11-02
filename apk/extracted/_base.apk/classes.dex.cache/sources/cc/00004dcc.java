package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6821n;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11947m;
import ph.C11638f;

/* renamed from: tg.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12700g extends AbstractC12674a {

    /* renamed from: o */
    private final InterfaceC11947m f32934o;

    /* renamed from: p */
    private final InterfaceC11900a1 f32935p;

    /* renamed from: q */
    private final boolean f32936q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12700g(InterfaceC6821n interfaceC6821n, InterfaceC11947m interfaceC11947m, C11638f c11638f, InterfaceC11900a1 interfaceC11900a1, boolean z) {
        super(interfaceC6821n, c11638f);
        if (interfaceC6821n == null) {
            m4437E0(0);
        }
        if (interfaceC11947m == null) {
            m4437E0(1);
        }
        if (c11638f == null) {
            m4437E0(2);
        }
        if (interfaceC11900a1 == null) {
            m4437E0(3);
        }
        this.f32934o = interfaceC11947m;
        this.f32935p = interfaceC11900a1;
        this.f32936q = z;
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m4437E0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11959n, p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11947m mo4163b() {
        InterfaceC11947m interfaceC11947m = this.f32934o;
        if (interfaceC11947m == null) {
            m4437E0(4);
        }
        return interfaceC11947m;
    }

    public boolean isExternal() {
        return this.f32936q;
    }

    @Override // p305qg.InterfaceC11966p
    /* renamed from: j */
    public InterfaceC11900a1 mo4160j() {
        InterfaceC11900a1 interfaceC11900a1 = this.f32935p;
        if (interfaceC11900a1 == null) {
            m4437E0(5);
        }
        return interfaceC11900a1;
    }
}