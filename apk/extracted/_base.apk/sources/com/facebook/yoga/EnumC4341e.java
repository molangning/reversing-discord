package com.facebook.yoga;

/* renamed from: com.facebook.yoga.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC4341e {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    

    /* renamed from: j */
    private final int f11112j;

    EnumC4341e(int i) {
        this.f11112j = i;
    }

    /* renamed from: a */
    public static EnumC4341e m29970a(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }

    /* renamed from: b */
    public int m29969b() {
        return this.f11112j;
    }
}
