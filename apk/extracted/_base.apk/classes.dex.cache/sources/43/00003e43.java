package p195k8;

/* renamed from: k8.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9183l0 {

    /* renamed from: a */
    private boolean f24157a;

    /* renamed from: b */
    private long f24158b;

    /* renamed from: c */
    private long f24159c;

    /* renamed from: d */
    private long f24160d = -9223372036854775807L;

    public C9183l0(long j) {
        this.f24158b = j;
    }

    /* renamed from: f */
    public static long m16341f(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m16338i(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: j */
    public static long m16337j(long j) {
        return m16338i(j) % 8589934592L;
    }

    /* renamed from: a */
    public synchronized long m16346a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f24160d != -9223372036854775807L) {
            this.f24160d = j;
        } else {
            long j2 = this.f24158b;
            if (j2 != Long.MAX_VALUE) {
                this.f24159c = j2 - j;
            }
            this.f24160d = j;
            notifyAll();
        }
        return j + this.f24159c;
    }

    /* renamed from: b */
    public synchronized long m16345b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f24160d;
        if (j2 != -9223372036854775807L) {
            long m16338i = m16338i(j2);
            long j3 = (4294967296L + m16338i) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - m16338i) < Math.abs(j - m16338i)) {
                j = j4;
            }
        }
        return m16346a(m16341f(j));
    }

    /* renamed from: c */
    public synchronized long m16344c() {
        return this.f24158b;
    }

    /* renamed from: d */
    public synchronized long m16343d() {
        long j;
        long j2 = this.f24160d;
        j = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j = this.f24159c + j2;
        } else {
            long j3 = this.f24158b;
            if (j3 != Long.MAX_VALUE) {
                j = j3;
            }
        }
        return j;
    }

    /* renamed from: e */
    public synchronized long m16342e() {
        long j;
        if (this.f24158b == Long.MAX_VALUE) {
            j = 0;
        } else if (this.f24160d == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else {
            j = this.f24159c;
        }
        return j;
    }

    /* renamed from: g */
    public synchronized void m16340g(long j) {
        this.f24158b = j;
        this.f24160d = -9223372036854775807L;
        this.f24157a = false;
    }

    /* renamed from: h */
    public synchronized void m16339h(boolean z, long j) {
        if (z) {
            try {
                if (!this.f24157a) {
                    this.f24158b = j;
                    this.f24157a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z || j != this.f24158b) {
            while (this.f24160d == -9223372036854775807L) {
                wait();
            }
        }
    }
}