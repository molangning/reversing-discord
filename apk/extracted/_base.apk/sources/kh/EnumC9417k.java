package kh;

import p326rh.C12196j;

/* renamed from: kh.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC9417k implements C12196j.InterfaceC12197a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    

    /* renamed from: o */
    private static C12196j.InterfaceC12198b<EnumC9417k> f24772o = new C12196j.InterfaceC12198b<EnumC9417k>() { // from class: kh.k.a
        @Override // p326rh.C12196j.InterfaceC12198b
        /* renamed from: b */
        public EnumC9417k mo5797a(int i) {
            return EnumC9417k.m15268a(i);
        }
    };

    /* renamed from: j */
    private final int f24774j;

    EnumC9417k(int i, int i2) {
        this.f24774j = i2;
    }

    /* renamed from: a */
    public static EnumC9417k m15268a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SEALED;
                }
                return ABSTRACT;
            }
            return OPEN;
        }
        return FINAL;
    }

    @Override // p326rh.C12196j.InterfaceC12197a
    public final int getNumber() {
        return this.f24774j;
    }
}
