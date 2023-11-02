package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import p151i6.C7390b;
import p177jb.C8893d;
import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4403h implements InterfaceC4417i0 {

    /* renamed from: a */
    private final float f11522a;

    /* renamed from: b */
    private final float f11523b;

    /* renamed from: c */
    private final long f11524c;

    /* renamed from: d */
    private final float f11525d;

    /* renamed from: e */
    private final long f11526e;

    /* renamed from: f */
    private final long f11527f;

    /* renamed from: g */
    private final float f11528g;

    /* renamed from: h */
    private long f11529h;

    /* renamed from: i */
    private long f11530i;

    /* renamed from: j */
    private long f11531j;

    /* renamed from: k */
    private long f11532k;

    /* renamed from: l */
    private long f11533l;

    /* renamed from: m */
    private long f11534m;

    /* renamed from: n */
    private float f11535n;

    /* renamed from: o */
    private float f11536o;

    /* renamed from: p */
    private float f11537p;

    /* renamed from: q */
    private long f11538q;

    /* renamed from: r */
    private long f11539r;

    /* renamed from: s */
    private long f11540s;

    /* renamed from: com.google.android.exoplayer2.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4405b {

        /* renamed from: a */
        private float f11541a = 0.97f;

        /* renamed from: b */
        private float f11542b = 1.03f;

        /* renamed from: c */
        private long f11543c = 1000;

        /* renamed from: d */
        private float f11544d = 1.0E-7f;

        /* renamed from: e */
        private long f11545e = C7390b.m20792c(20);

        /* renamed from: f */
        private long f11546f = C7390b.m20792c(500);

        /* renamed from: g */
        private float f11547g = 0.999f;

        /* renamed from: a */
        public C4403h m29414a() {
            return new C4403h(this.f11541a, this.f11542b, this.f11543c, this.f11544d, this.f11545e, this.f11546f, this.f11547g);
        }
    }

    /* renamed from: f */
    private void m29418f(long j) {
        long j2 = this.f11539r + (this.f11540s * 3);
        if (this.f11534m > j2) {
            float m20792c = (float) C7390b.m20792c(this.f11524c);
            this.f11534m = C8893d.m17064c(j2, this.f11531j, this.f11534m - (((this.f11537p - 1.0f) * m20792c) + ((this.f11535n - 1.0f) * m20792c)));
            return;
        }
        long m16225s = C9191p0.m16225s(j - (Math.max(0.0f, this.f11537p - 1.0f) / this.f11525d), this.f11534m, j2);
        this.f11534m = m16225s;
        long j3 = this.f11533l;
        if (j3 != -9223372036854775807L && m16225s > j3) {
            this.f11534m = j3;
        }
    }

    /* renamed from: g */
    private void m29417g() {
        long j = this.f11529h;
        if (j != -9223372036854775807L) {
            long j2 = this.f11530i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f11532k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f11533l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f11531j == j) {
            return;
        }
        this.f11531j = j;
        this.f11534m = j;
        this.f11539r = -9223372036854775807L;
        this.f11540s = -9223372036854775807L;
        this.f11538q = -9223372036854775807L;
    }

    /* renamed from: h */
    private static long m29416h(long j, long j2, float f) {
        return (((float) j) * f) + ((1.0f - f) * ((float) j2));
    }

    /* renamed from: i */
    private void m29415i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f11539r;
        if (j4 == -9223372036854775807L) {
            this.f11539r = j3;
            this.f11540s = 0L;
            return;
        }
        long max = Math.max(j3, m29416h(j4, j3, this.f11528g));
        this.f11539r = max;
        this.f11540s = m29416h(this.f11540s, Math.abs(j3 - max), this.f11528g);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4417i0
    /* renamed from: a */
    public void mo29284a(MediaItem.C4368f c4368f) {
        this.f11529h = C7390b.m20792c(c4368f.f11282a);
        this.f11532k = C7390b.m20792c(c4368f.f11283b);
        this.f11533l = C7390b.m20792c(c4368f.f11284c);
        float f = c4368f.f11285d;
        if (f == -3.4028235E38f) {
            f = this.f11522a;
        }
        this.f11536o = f;
        float f2 = c4368f.f11286e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f11523b;
        }
        this.f11535n = f2;
        m29417g();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4417i0
    /* renamed from: b */
    public float mo29283b(long j, long j2) {
        if (this.f11529h == -9223372036854775807L) {
            return 1.0f;
        }
        m29415i(j, j2);
        if (this.f11538q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f11538q < this.f11524c) {
            return this.f11537p;
        }
        this.f11538q = SystemClock.elapsedRealtime();
        m29418f(j);
        long j3 = j - this.f11534m;
        if (Math.abs(j3) < this.f11526e) {
            this.f11537p = 1.0f;
        } else {
            this.f11537p = C9191p0.m16229q((this.f11525d * ((float) j3)) + 1.0f, this.f11536o, this.f11535n);
        }
        return this.f11537p;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4417i0
    /* renamed from: c */
    public long mo29282c() {
        return this.f11534m;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4417i0
    /* renamed from: d */
    public void mo29281d() {
        long j = this.f11534m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f11527f;
        this.f11534m = j2;
        long j3 = this.f11533l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f11534m = j3;
        }
        this.f11538q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4417i0
    /* renamed from: e */
    public void mo29280e(long j) {
        this.f11530i = j;
        m29417g();
    }

    private C4403h(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f11522a = f;
        this.f11523b = f2;
        this.f11524c = j;
        this.f11525d = f3;
        this.f11526e = j2;
        this.f11527f = j3;
        this.f11528g = f4;
        this.f11529h = -9223372036854775807L;
        this.f11530i = -9223372036854775807L;
        this.f11532k = -9223372036854775807L;
        this.f11533l = -9223372036854775807L;
        this.f11536o = f;
        this.f11535n = f2;
        this.f11537p = 1.0f;
        this.f11538q = -9223372036854775807L;
        this.f11531j = -9223372036854775807L;
        this.f11534m = -9223372036854775807L;
        this.f11539r = -9223372036854775807L;
        this.f11540s = -9223372036854775807L;
    }
}