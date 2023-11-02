package cd;

/* renamed from: cd.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC2503f {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: o */
    private static final EnumC2503f[] f6867o;

    /* renamed from: j */
    private final int f6869j;

    static {
        EnumC2503f enumC2503f = L;
        EnumC2503f enumC2503f2 = M;
        EnumC2503f enumC2503f3 = Q;
        f6867o = new EnumC2503f[]{enumC2503f2, enumC2503f, H, enumC2503f3};
    }

    EnumC2503f(int i) {
        this.f6869j = i;
    }

    /* renamed from: a */
    public static EnumC2503f m33119a(int i) {
        if (i >= 0) {
            EnumC2503f[] enumC2503fArr = f6867o;
            if (i < enumC2503fArr.length) {
                return enumC2503fArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}