package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import p305qg.InterfaceC11947m;
import p325rg.C12148b;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import sh.AbstractC12485c;

/* renamed from: tg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12706j extends C12148b implements InterfaceC11947m {

    /* renamed from: k */
    private final C11638f f32947k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12706j(InterfaceC12155g interfaceC12155g, C11638f c11638f) {
        super(interfaceC12155g);
        if (interfaceC12155g == null) {
            m4423g0(0);
        }
        if (c11638f == null) {
            m4423g0(1);
        }
        this.f32947k = c11638f;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4423g0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: r0 */
    public static String m4422r0(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4423g0(4);
        }
        try {
            String str = AbstractC12485c.f32444j.mo5061q(interfaceC11947m) + "[" + interfaceC11947m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC11947m)) + "]";
            if (str == null) {
                m4423g0(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC11947m.getClass().getSimpleName() + " " + interfaceC11947m.getName();
            if (str2 == null) {
                m4423g0(6);
            }
            return str2;
        }
    }

    /* renamed from: a */
    public InterfaceC11947m mo4221a() {
        return this;
    }

    @Override // p305qg.InterfaceC11935j0
    public C11638f getName() {
        C11638f c11638f = this.f32947k;
        if (c11638f == null) {
            m4423g0(2);
        }
        return c11638f;
    }

    public String toString() {
        return m4422r0(this);
    }
}