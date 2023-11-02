package com.google.android.exoplayer2;

import p195k8.C9149a;
import p195k8.C9191p0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class PlaybackParameters {

    /* renamed from: d */
    public static final PlaybackParameters f11301d = new PlaybackParameters(1.0f);

    /* renamed from: a */
    public final float f11302a;

    /* renamed from: b */
    public final float f11303b;

    /* renamed from: c */
    private final int f11304c;

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    /* renamed from: a */
    public long m29843a(long j) {
        return j * this.f11304c;
    }

    /* renamed from: b */
    public PlaybackParameters m29842b(float f) {
        return new PlaybackParameters(f, this.f11303b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        if (this.f11302a == playbackParameters.f11302a && this.f11303b == playbackParameters.f11303b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f11302a)) * 31) + Float.floatToRawIntBits(this.f11303b);
    }

    public String toString() {
        return C9191p0.m16307D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f11302a), Float.valueOf(this.f11303b));
    }

    public PlaybackParameters(float f, float f2) {
        C9149a.m16452a(f > 0.0f);
        C9149a.m16452a(f2 > 0.0f);
        this.f11302a = f;
        this.f11303b = f2;
        this.f11304c = Math.round(f * 1000.0f);
    }
}
