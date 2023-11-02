package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* renamed from: com.facebook.imageutils.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3876b {

    /* renamed from: a */
    private final Pair<Integer, Integer> f10896a;

    /* renamed from: b */
    private final ColorSpace f10897b;

    public C3876b(int i, int i2, ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i != -1 && i2 != -1) {
            pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            pair = null;
        }
        this.f10896a = pair;
        this.f10897b = colorSpace;
    }

    /* renamed from: a */
    public ColorSpace m30551a() {
        return this.f10897b;
    }

    /* renamed from: b */
    public Pair<Integer, Integer> m30550b() {
        return this.f10896a;
    }
}
