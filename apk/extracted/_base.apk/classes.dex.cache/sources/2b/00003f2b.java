package kh;

import p326rh.C12196j;

/* renamed from: kh.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC9415j implements C12196j.InterfaceC12197a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    

    /* renamed from: o */
    private static C12196j.InterfaceC12198b<EnumC9415j> f24765o = new C12196j.InterfaceC12198b<EnumC9415j>() { // from class: kh.j.a
        @Override // p326rh.C12196j.InterfaceC12198b
        /* renamed from: b */
        public EnumC9415j mo5797a(int i) {
            return EnumC9415j.m15270a(i);
        }
    };

    /* renamed from: j */
    private final int f24767j;

    EnumC9415j(int i, int i2) {
        this.f24767j = i2;
    }

    /* renamed from: a */
    public static EnumC9415j m15270a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SYNTHESIZED;
                }
                return DELEGATION;
            }
            return FAKE_OVERRIDE;
        }
        return DECLARATION;
    }

    @Override // p326rh.C12196j.InterfaceC12197a
    public final int getNumber() {
        return this.f24767j;
    }
}