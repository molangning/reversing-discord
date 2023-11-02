package com.facebook.yoga;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    

    /* renamed from: j */
    private final int f11089j;

    YogaUnit(int i) {
        this.f11089j = i;
    }

    /* renamed from: a */
    public static YogaUnit m29979a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return AUTO;
                    }
                    throw new IllegalArgumentException("Unknown enum value: " + i);
                }
                return PERCENT;
            }
            return POINT;
        }
        return UNDEFINED;
    }

    /* renamed from: b */
    public int m29978b() {
        return this.f11089j;
    }
}