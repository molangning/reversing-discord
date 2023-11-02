package com.facebook.yoga;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    

    /* renamed from: j */
    private final int f11065j;

    YogaMeasureMode(int i) {
        this.f11065j = i;
    }

    /* renamed from: a */
    public static YogaMeasureMode m30049a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return AT_MOST;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i);
            }
            return EXACTLY;
        }
        return UNDEFINED;
    }
}
