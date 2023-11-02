package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class LoadEventInfo {

    /* renamed from: h */
    private static final AtomicLong f11748h = new AtomicLong();

    /* renamed from: a */
    public final long f11749a;

    /* renamed from: b */
    public final C4515a f11750b;

    /* renamed from: c */
    public final Uri f11751c;

    /* renamed from: d */
    public final Map<String, List<String>> f11752d;

    /* renamed from: e */
    public final long f11753e;

    /* renamed from: f */
    public final long f11754f;

    /* renamed from: g */
    public final long f11755g;

    public LoadEventInfo(long j, C4515a c4515a, long j2) {
        this(j, c4515a, c4515a.f12257a, Collections.emptyMap(), j2, 0L, 0L);
    }

    /* renamed from: a */
    public static long m29145a() {
        return f11748h.getAndIncrement();
    }

    public LoadEventInfo(long j, C4515a c4515a, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f11749a = j;
        this.f11750b = c4515a;
        this.f11751c = uri;
        this.f11752d = map;
        this.f11753e = j2;
        this.f11754f = j3;
        this.f11755g = j4;
    }
}
