package cd;

/* renamed from: cd.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC2505h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: j */
    private final int[] f6884j;

    /* renamed from: k */
    private final int f6885k;

    EnumC2505h(int[] iArr, int i) {
        this.f6884j = iArr;
        this.f6885k = i;
    }

    /* renamed from: a */
    public static EnumC2505h m33113a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 9) {
                                            if (i == 13) {
                                                return HANZI;
                                            }
                                            throw new IllegalArgumentException();
                                        }
                                        return FNC1_SECOND_POSITION;
                                    }
                                    return KANJI;
                                }
                                return ECI;
                            }
                            return FNC1_FIRST_POSITION;
                        }
                        return BYTE;
                    }
                    return STRUCTURED_APPEND;
                }
                return ALPHANUMERIC;
            }
            return NUMERIC;
        }
        return TERMINATOR;
    }

    /* renamed from: b */
    public int m33112b(C2507j c2507j) {
        char c;
        int m33101j = c2507j.m33101j();
        if (m33101j <= 9) {
            c = 0;
        } else if (m33101j <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.f6884j[c];
    }
}
