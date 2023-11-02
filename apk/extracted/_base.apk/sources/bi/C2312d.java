package bi;

import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11897a;

/* renamed from: bi.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C2312d extends AbstractC2309a {

    /* renamed from: c */
    private final InterfaceC11897a f6421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312d(InterfaceC11897a interfaceC11897a, AbstractC7264g0 abstractC7264g0, InterfaceC2315g interfaceC2315g) {
        super(abstractC7264g0, interfaceC2315g);
        if (interfaceC11897a == null) {
            m33661c(0);
        }
        if (abstractC7264g0 == null) {
            m33661c(1);
        }
        this.f6421c = interfaceC11897a;
    }

    /* renamed from: c */
    private static /* synthetic */ void m33661c(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f6421c + "}";
    }
}
