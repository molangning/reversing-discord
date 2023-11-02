package bi;

import p142hi.AbstractC7264g0;

/* renamed from: bi.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C2318j extends AbstractC2309a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2318j(AbstractC7264g0 abstractC7264g0) {
        this(abstractC7264g0, null);
        if (abstractC7264g0 == null) {
            m33656c(0);
        }
    }

    /* renamed from: c */
    private static /* synthetic */ void m33656c(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C2318j(AbstractC7264g0 abstractC7264g0, InterfaceC2315g interfaceC2315g) {
        super(abstractC7264g0, interfaceC2315g);
        if (abstractC7264g0 == null) {
            m33656c(1);
        }
    }
}
