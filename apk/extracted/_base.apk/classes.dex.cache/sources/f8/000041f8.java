package p213l8;

import java.util.Arrays;

/* renamed from: l8.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C10070e {

    /* renamed from: c */
    private boolean f26185c;

    /* renamed from: d */
    private boolean f26186d;

    /* renamed from: f */
    private int f26188f;

    /* renamed from: a */
    private C10071a f26183a = new C10071a();

    /* renamed from: b */
    private C10071a f26184b = new C10071a();

    /* renamed from: e */
    private long f26187e = -9223372036854775807L;

    /* renamed from: l8.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10071a {

        /* renamed from: a */
        private long f26189a;

        /* renamed from: b */
        private long f26190b;

        /* renamed from: c */
        private long f26191c;

        /* renamed from: d */
        private long f26192d;

        /* renamed from: e */
        private long f26193e;

        /* renamed from: f */
        private long f26194f;

        /* renamed from: g */
        private final boolean[] f26195g = new boolean[15];

        /* renamed from: h */
        private int f26196h;

        /* renamed from: c */
        private static int m12413c(long j) {
            return (int) (j % 15);
        }

        /* renamed from: a */
        public long m12415a() {
            long j = this.f26193e;
            if (j == 0) {
                return 0L;
            }
            return this.f26194f / j;
        }

        /* renamed from: b */
        public long m12414b() {
            return this.f26194f;
        }

        /* renamed from: d */
        public boolean m12412d() {
            long j = this.f26192d;
            if (j == 0) {
                return false;
            }
            return this.f26195g[m12413c(j - 1)];
        }

        /* renamed from: e */
        public boolean m12411e() {
            return this.f26192d > 15 && this.f26196h == 0;
        }

        /* renamed from: f */
        public void m12410f(long j) {
            long j2 = this.f26192d;
            if (j2 == 0) {
                this.f26189a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f26189a;
                this.f26190b = j3;
                this.f26194f = j3;
                this.f26193e = 1L;
            } else {
                long j4 = j - this.f26191c;
                int m12413c = m12413c(j2);
                if (Math.abs(j4 - this.f26190b) <= 1000000) {
                    this.f26193e++;
                    this.f26194f += j4;
                    boolean[] zArr = this.f26195g;
                    if (zArr[m12413c]) {
                        zArr[m12413c] = false;
                        this.f26196h--;
                    }
                } else {
                    boolean[] zArr2 = this.f26195g;
                    if (!zArr2[m12413c]) {
                        zArr2[m12413c] = true;
                        this.f26196h++;
                    }
                }
            }
            this.f26192d++;
            this.f26191c = j;
        }

        /* renamed from: g */
        public void m12409g() {
            this.f26192d = 0L;
            this.f26193e = 0L;
            this.f26194f = 0L;
            this.f26196h = 0;
            Arrays.fill(this.f26195g, false);
        }
    }

    /* renamed from: a */
    public long m12422a() {
        if (m12418e()) {
            return this.f26183a.m12415a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float m12421b() {
        if (m12418e()) {
            return (float) (1.0E9d / this.f26183a.m12415a());
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int m12420c() {
        return this.f26188f;
    }

    /* renamed from: d */
    public long m12419d() {
        if (m12418e()) {
            return this.f26183a.m12414b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m12418e() {
        return this.f26183a.m12411e();
    }

    /* renamed from: f */
    public void m12417f(long j) {
        this.f26183a.m12410f(j);
        int i = 0;
        if (this.f26183a.m12411e() && !this.f26186d) {
            this.f26185c = false;
        } else if (this.f26187e != -9223372036854775807L) {
            if (!this.f26185c || this.f26184b.m12412d()) {
                this.f26184b.m12409g();
                this.f26184b.m12410f(this.f26187e);
            }
            this.f26185c = true;
            this.f26184b.m12410f(j);
        }
        if (this.f26185c && this.f26184b.m12411e()) {
            C10071a c10071a = this.f26183a;
            this.f26183a = this.f26184b;
            this.f26184b = c10071a;
            this.f26185c = false;
            this.f26186d = false;
        }
        this.f26187e = j;
        if (!this.f26183a.m12411e()) {
            i = this.f26188f + 1;
        }
        this.f26188f = i;
    }

    /* renamed from: g */
    public void m12416g() {
        this.f26183a.m12409g();
        this.f26184b.m12409g();
        this.f26185c = false;
        this.f26187e = -9223372036854775807L;
        this.f26188f = 0;
    }
}