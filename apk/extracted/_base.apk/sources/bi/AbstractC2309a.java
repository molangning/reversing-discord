package bi;

import p142hi.AbstractC7264g0;

/* renamed from: bi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2309a implements InterfaceC2315g {

    /* renamed from: a */
    protected final AbstractC7264g0 f6415a;

    /* renamed from: b */
    private final InterfaceC2315g f6416b;

    public AbstractC2309a(AbstractC7264g0 abstractC7264g0, InterfaceC2315g interfaceC2315g) {
        if (abstractC7264g0 == null) {
            m33663c(0);
        }
        this.f6415a = abstractC7264g0;
        this.f6416b = interfaceC2315g == null ? this : interfaceC2315g;
    }

    /* renamed from: c */
    private static /* synthetic */ void m33663c(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // bi.InterfaceC2315g
    public AbstractC7264g0 getType() {
        AbstractC7264g0 abstractC7264g0 = this.f6415a;
        if (abstractC7264g0 == null) {
            m33663c(1);
        }
        return abstractC7264g0;
    }
}
