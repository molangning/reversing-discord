package com.facebook.yoga;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: j */
    private final int f11034j;

    YogaDirection(int i) {
        this.f11034j = i;
    }

    /* renamed from: a */
    public static YogaDirection m30054a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return RTL;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i);
            }
            return LTR;
        }
        return INHERIT;
    }

    /* renamed from: b */
    public int m30053b() {
        return this.f11034j;
    }
}