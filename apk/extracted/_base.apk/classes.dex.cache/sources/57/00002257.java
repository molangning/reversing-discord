package com.facebook.imagepipeline.cache;

import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MemoryCacheParams {

    /* renamed from: a */
    public final int f10275a;

    /* renamed from: b */
    public final int f10276b;

    /* renamed from: c */
    public final int f10277c;

    /* renamed from: d */
    public final int f10278d;

    /* renamed from: e */
    public final int f10279e;

    /* renamed from: f */
    public final long f10280f;

    public MemoryCacheParams(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, TimeUnit.MINUTES.toMillis(5L));
    }

    public MemoryCacheParams(int i, int i2, int i3, int i4, int i5, long j) {
        this.f10275a = i;
        this.f10276b = i2;
        this.f10277c = i3;
        this.f10278d = i4;
        this.f10279e = i5;
        this.f10280f = j;
    }
}