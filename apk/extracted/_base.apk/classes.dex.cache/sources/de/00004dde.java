package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.Collections;
import java.util.List;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11943k1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11997x0;
import p325rg.InterfaceC12155g;
import ph.C11638f;

/* renamed from: tg.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12718m0 extends AbstractC12710k implements InterfaceC11943k1 {

    /* renamed from: n */
    protected AbstractC7264g0 f32970n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12718m0(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, C11638f c11638f, AbstractC7264g0 abstractC7264g0, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC11947m, interfaceC12155g, c11638f, interfaceC11900a1);
        if (interfaceC11947m == null) {
            m4366g0(0);
        }
        if (interfaceC12155g == null) {
            m4366g0(1);
        }
        if (c11638f == null) {
            m4366g0(2);
        }
        if (interfaceC11900a1 == null) {
            m4366g0(3);
        }
        this.f32970n = abstractC7264g0;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4366g0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: G0 */
    public void m4367G0(AbstractC7264g0 abstractC7264g0) {
        this.f32970n = abstractC7264g0;
    }

    /* renamed from: I */
    public InterfaceC11997x0 mo4332I() {
        return null;
    }

    /* renamed from: M */
    public InterfaceC11997x0 mo4329M() {
        return null;
    }

    /* renamed from: f0 */
    public boolean mo4307f0() {
        return false;
    }

    public AbstractC7264g0 getReturnType() {
        AbstractC7264g0 type = getType();
        if (type == null) {
            m4366g0(10);
        }
        return type;
    }

    @Override // p305qg.InterfaceC11933i1
    public AbstractC7264g0 getType() {
        AbstractC7264g0 abstractC7264g0 = this.f32970n;
        if (abstractC7264g0 == null) {
            m4366g0(4);
        }
        return abstractC7264g0;
    }

    public List<InterfaceC11920f1> getTypeParameters() {
        List<InterfaceC11920f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4366g0(8);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: i */
    public List<InterfaceC11936j1> mo4301i() {
        List<InterfaceC11936j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4366g0(6);
        }
        return emptyList;
    }
}