package p184jj;

import p162ij.InterfaceC7675y;

/* renamed from: jj.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC8979e implements InterfaceC7675y {
    FULL(0),
    LONG(1),
    MEDIUM(2),
    SHORT(3);
    

    /* renamed from: o */
    private static EnumC8979e[] f23612o = values();

    /* renamed from: j */
    private final transient int f23614j;

    EnumC8979e(int i) {
        this.f23614j = i;
    }

    /* renamed from: b */
    public static EnumC8979e m16890b(int i) {
        EnumC8979e[] enumC8979eArr;
        for (EnumC8979e enumC8979e : f23612o) {
            if (enumC8979e.mo16891a() == i) {
                return enumC8979e;
            }
        }
        throw new UnsupportedOperationException("Unknown format style: " + i);
    }

    @Override // p162ij.InterfaceC7675y
    /* renamed from: a */
    public int mo16891a() {
        return this.f23614j;
    }
}