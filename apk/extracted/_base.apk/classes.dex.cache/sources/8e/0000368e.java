package p142hi;

import p161ii.AbstractC7592g;

/* renamed from: hi.m1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7294m1 extends AbstractC7291l1 {

    /* renamed from: a */
    private final EnumC7336w1 f19727a;

    /* renamed from: b */
    private final AbstractC7264g0 f19728b;

    public C7294m1(EnumC7336w1 enumC7336w1, AbstractC7264g0 abstractC7264g0) {
        if (enumC7336w1 == null) {
            m21052c(0);
        }
        if (abstractC7264g0 == null) {
            m21052c(1);
        }
        this.f19727a = enumC7336w1;
        this.f19728b = abstractC7264g0;
    }

    /* renamed from: c */
    private static /* synthetic */ void m21052c(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: a */
    public boolean mo20955a() {
        return false;
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: b */
    public EnumC7336w1 mo20954b() {
        EnumC7336w1 enumC7336w1 = this.f19727a;
        if (enumC7336w1 == null) {
            m21052c(4);
        }
        return enumC7336w1;
    }

    @Override // p142hi.InterfaceC7288k1
    public AbstractC7264g0 getType() {
        AbstractC7264g0 abstractC7264g0 = this.f19728b;
        if (abstractC7264g0 == null) {
            m21052c(5);
        }
        return abstractC7264g0;
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: o */
    public InterfaceC7288k1 mo20951o(AbstractC7592g abstractC7592g) {
        if (abstractC7592g == null) {
            m21052c(6);
        }
        return new C7294m1(this.f19727a, abstractC7592g.mo20276h(this.f19728b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7294m1(AbstractC7264g0 abstractC7264g0) {
        this(EnumC7336w1.INVARIANT, abstractC7264g0);
        if (abstractC7264g0 == null) {
            m21052c(2);
        }
    }
}