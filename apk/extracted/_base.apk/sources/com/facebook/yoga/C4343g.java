package com.facebook.yoga;

/* renamed from: com.facebook.yoga.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4343g {
    /* renamed from: a */
    public static long m29967a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return Float.floatToRawIntBits(f2) | (floatToRawIntBits << 32);
    }

    /* renamed from: b */
    public static long m29966b(int i, int i2) {
        return m29967a(i, i2);
    }
}
