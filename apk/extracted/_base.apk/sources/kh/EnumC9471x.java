package kh;

import p326rh.C12196j;

/* renamed from: kh.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC9471x implements C12196j.InterfaceC12197a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    

    /* renamed from: q */
    private static C12196j.InterfaceC12198b<EnumC9471x> f25059q = new C12196j.InterfaceC12198b<EnumC9471x>() { // from class: kh.x.a
        @Override // p326rh.C12196j.InterfaceC12198b
        /* renamed from: b */
        public EnumC9471x mo5797a(int i) {
            return EnumC9471x.m14686a(i);
        }
    };

    /* renamed from: j */
    private final int f25061j;

    EnumC9471x(int i, int i2) {
        this.f25061j = i2;
    }

    /* renamed from: a */
    public static EnumC9471x m14686a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return LOCAL;
                        }
                        return PRIVATE_TO_THIS;
                    }
                    return PUBLIC;
                }
                return PROTECTED;
            }
            return PRIVATE;
        }
        return INTERNAL;
    }

    @Override // p326rh.C12196j.InterfaceC12197a
    public final int getNumber() {
        return this.f25061j;
    }
}
