package cd;

import lc.C10120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cd.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class EnumC2491c {

    /* renamed from: j */
    public static final EnumC2491c f6851j;

    /* renamed from: k */
    public static final EnumC2491c f6852k;

    /* renamed from: l */
    public static final EnumC2491c f6853l;

    /* renamed from: m */
    public static final EnumC2491c f6854m;

    /* renamed from: n */
    public static final EnumC2491c f6855n;

    /* renamed from: o */
    public static final EnumC2491c f6856o;

    /* renamed from: p */
    public static final EnumC2491c f6857p;

    /* renamed from: q */
    public static final EnumC2491c f6858q;

    /* renamed from: r */
    private static final /* synthetic */ EnumC2491c[] f6859r;

    /* renamed from: cd.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    enum C2492a extends EnumC2491c {
        C2492a(String str, int i) {
            super(str, i, null);
        }

        @Override // cd.EnumC2491c
        /* renamed from: a */
        boolean mo33131a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    static {
        C2492a c2492a = new C2492a("DATA_MASK_000", 0);
        f6851j = c2492a;
        EnumC2491c enumC2491c = new EnumC2491c("DATA_MASK_001", 1) { // from class: cd.c.b
            @Override // cd.EnumC2491c
            /* renamed from: a */
            boolean mo33131a(int i, int i2) {
                return (i & 1) == 0;
            }
        };
        f6852k = enumC2491c;
        EnumC2491c enumC2491c2 = new EnumC2491c("DATA_MASK_010", 2) { // from class: cd.c.c
            @Override // cd.EnumC2491c
            /* renamed from: a */
            boolean mo33131a(int i, int i2) {
                return i2 % 3 == 0;
            }
        };
        f6853l = enumC2491c2;
        EnumC2491c enumC2491c3 = new EnumC2491c("DATA_MASK_011", 3) { // from class: cd.c.d
            @Override // cd.EnumC2491c
            /* renamed from: a */
            boolean mo33131a(int i, int i2) {
                return (i + i2) % 3 == 0;
            }
        };
        f6854m = enumC2491c3;
        EnumC2491c enumC2491c4 = new EnumC2491c("DATA_MASK_100", 4) { // from class: cd.c.e
            @Override // cd.EnumC2491c
            /* renamed from: a */
            boolean mo33131a(int i, int i2) {
                return (((i / 2) + (i2 / 3)) & 1) == 0;
            }
        };
        f6855n = enumC2491c4;
        EnumC2491c enumC2491c5 = new EnumC2491c("DATA_MASK_101", 5) { // from class: cd.c.f
            @Override // cd.EnumC2491c
            /* renamed from: a */
            boolean mo33131a(int i, int i2) {
                return (i * i2) % 6 == 0;
            }
        };
        f6856o = enumC2491c5;
        EnumC2491c enumC2491c6 = new EnumC2491c("DATA_MASK_110", 6) { // from class: cd.c.g
            @Override // cd.EnumC2491c
            /* renamed from: a */
            boolean mo33131a(int i, int i2) {
                return (i * i2) % 6 < 3;
            }
        };
        f6857p = enumC2491c6;
        EnumC2491c enumC2491c7 = new EnumC2491c("DATA_MASK_111", 7) { // from class: cd.c.h
            @Override // cd.EnumC2491c
            /* renamed from: a */
            boolean mo33131a(int i, int i2) {
                return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
            }
        };
        f6858q = enumC2491c7;
        f6859r = new EnumC2491c[]{c2492a, enumC2491c, enumC2491c2, enumC2491c3, enumC2491c4, enumC2491c5, enumC2491c6, enumC2491c7};
    }

    private EnumC2491c(String str, int i) {
    }

    public static EnumC2491c valueOf(String str) {
        return (EnumC2491c) Enum.valueOf(EnumC2491c.class, str);
    }

    public static EnumC2491c[] values() {
        return (EnumC2491c[]) f6859r.clone();
    }

    /* renamed from: a */
    abstract boolean mo33131a(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m33132b(C10120b c10120b, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo33131a(i2, i3)) {
                    c10120b.m12253d(i3, i2);
                }
            }
        }
    }

    /* synthetic */ EnumC2491c(String str, int i, C2492a c2492a) {
        this(str, i);
    }
}
