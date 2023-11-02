package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class MediaLoadData {

    /* renamed from: a */
    public final int f11756a;

    /* renamed from: b */
    public final int f11757b;

    /* renamed from: c */
    public final Format f11758c;

    /* renamed from: d */
    public final int f11759d;

    /* renamed from: e */
    public final Object f11760e;

    /* renamed from: f */
    public final long f11761f;

    /* renamed from: g */
    public final long f11762g;

    public MediaLoadData(int i) {
        this(i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public MediaLoadData(int i, int i2, Format format, int i3, Object obj, long j, long j2) {
        this.f11756a = i;
        this.f11757b = i2;
        this.f11758c = format;
        this.f11759d = i3;
        this.f11760e = obj;
        this.f11761f = j;
        this.f11762g = j2;
    }
}
