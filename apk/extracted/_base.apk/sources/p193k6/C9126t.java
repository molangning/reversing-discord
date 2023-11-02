package p193k6;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p151i6.C7390b;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: k6.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9126t {

    /* renamed from: A */
    private long f24020A;

    /* renamed from: B */
    private long f24021B;

    /* renamed from: C */
    private long f24022C;

    /* renamed from: D */
    private boolean f24023D;

    /* renamed from: E */
    private long f24024E;

    /* renamed from: F */
    private long f24025F;

    /* renamed from: a */
    private final InterfaceC9127a f24026a;

    /* renamed from: b */
    private final long[] f24027b;

    /* renamed from: c */
    private AudioTrack f24028c;

    /* renamed from: d */
    private int f24029d;

    /* renamed from: e */
    private int f24030e;

    /* renamed from: f */
    private C9124s f24031f;

    /* renamed from: g */
    private int f24032g;

    /* renamed from: h */
    private boolean f24033h;

    /* renamed from: i */
    private long f24034i;

    /* renamed from: j */
    private float f24035j;

    /* renamed from: k */
    private boolean f24036k;

    /* renamed from: l */
    private long f24037l;

    /* renamed from: m */
    private long f24038m;

    /* renamed from: n */
    private Method f24039n;

    /* renamed from: o */
    private long f24040o;

    /* renamed from: p */
    private boolean f24041p;

    /* renamed from: q */
    private boolean f24042q;

    /* renamed from: r */
    private long f24043r;

    /* renamed from: s */
    private long f24044s;

    /* renamed from: t */
    private long f24045t;

    /* renamed from: u */
    private long f24046u;

    /* renamed from: v */
    private int f24047v;

    /* renamed from: w */
    private int f24048w;

    /* renamed from: x */
    private long f24049x;

    /* renamed from: y */
    private long f24050y;

    /* renamed from: z */
    private long f24051z;

    /* renamed from: k6.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9127a {
        /* renamed from: a */
        void mo16501a(int i, long j);

        /* renamed from: b */
        void mo16500b(long j);

        /* renamed from: c */
        void mo16499c(long j);

        /* renamed from: d */
        void mo16498d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo16497e(long j, long j2, long j3, long j4);
    }

    public C9126t(InterfaceC9127a interfaceC9127a) {
        this.f24026a = (InterfaceC9127a) C9149a.m16448e(interfaceC9127a);
        if (C9191p0.f24171a >= 18) {
            try {
                this.f24039n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f24027b = new long[10];
    }

    /* renamed from: a */
    private boolean m16523a() {
        if (this.f24033h && ((AudioTrack) C9149a.m16448e(this.f24028c)).getPlayState() == 2 && m16518f() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private long m16522b(long j) {
        return (j * 1000000) / this.f24032g;
    }

    /* renamed from: f */
    private long m16518f() {
        AudioTrack audioTrack = (AudioTrack) C9149a.m16448e(this.f24028c);
        if (this.f24049x != -9223372036854775807L) {
            return Math.min(this.f24020A, this.f24051z + ((((SystemClock.elapsedRealtime() * 1000) - this.f24049x) * this.f24032g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f24033h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f24046u = this.f24044s;
            }
            playbackHeadPosition += this.f24046u;
        }
        if (C9191p0.f24171a <= 29) {
            if (playbackHeadPosition == 0 && this.f24044s > 0 && playState == 3) {
                if (this.f24050y == -9223372036854775807L) {
                    this.f24050y = SystemClock.elapsedRealtime();
                }
                return this.f24044s;
            }
            this.f24050y = -9223372036854775807L;
        }
        if (this.f24044s > playbackHeadPosition) {
            this.f24045t++;
        }
        this.f24044s = playbackHeadPosition;
        return playbackHeadPosition + (this.f24045t << 32);
    }

    /* renamed from: g */
    private long m16517g() {
        return m16522b(m16518f());
    }

    /* renamed from: m */
    private void m16511m(long j, long j2) {
        C9124s c9124s = (C9124s) C9149a.m16448e(this.f24031f);
        if (!c9124s.m16530e(j)) {
            return;
        }
        long m16532c = c9124s.m16532c();
        long m16533b = c9124s.m16533b();
        if (Math.abs(m16532c - j) > 5000000) {
            this.f24026a.mo16497e(m16533b, m16532c, j, j2);
            c9124s.m16529f();
        } else if (Math.abs(m16522b(m16533b) - j2) > 5000000) {
            this.f24026a.mo16498d(m16533b, m16532c, j, j2);
            c9124s.m16529f();
        } else {
            c9124s.m16534a();
        }
    }

    /* renamed from: n */
    private void m16510n() {
        long m16517g = m16517g();
        if (m16517g == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f24038m >= 30000) {
            long[] jArr = this.f24027b;
            int i = this.f24047v;
            jArr[i] = m16517g - nanoTime;
            this.f24047v = (i + 1) % 10;
            int i2 = this.f24048w;
            if (i2 < 10) {
                this.f24048w = i2 + 1;
            }
            this.f24038m = nanoTime;
            this.f24037l = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.f24048w;
                if (i3 >= i4) {
                    break;
                }
                this.f24037l += this.f24027b[i3] / i4;
                i3++;
            }
        }
        if (this.f24033h) {
            return;
        }
        m16511m(nanoTime, m16517g);
        m16509o(nanoTime);
    }

    /* renamed from: o */
    private void m16509o(long j) {
        Method method;
        if (this.f24042q && (method = this.f24039n) != null && j - this.f24043r >= 500000) {
            try {
                long intValue = (((Integer) C9191p0.m16243j((Integer) method.invoke(C9149a.m16448e(this.f24028c), new Object[0]))).intValue() * 1000) - this.f24034i;
                this.f24040o = intValue;
                long max = Math.max(intValue, 0L);
                this.f24040o = max;
                if (max > 5000000) {
                    this.f24026a.mo16499c(max);
                    this.f24040o = 0L;
                }
            } catch (Exception unused) {
                this.f24039n = null;
            }
            this.f24043r = j;
        }
    }

    /* renamed from: p */
    private static boolean m16508p(int i) {
        return C9191p0.f24171a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: s */
    private void m16505s() {
        this.f24037l = 0L;
        this.f24048w = 0;
        this.f24047v = 0;
        this.f24038m = 0L;
        this.f24022C = 0L;
        this.f24025F = 0L;
        this.f24036k = false;
    }

    /* renamed from: c */
    public int m16521c(long j) {
        return this.f24030e - ((int) (j - (m16518f() * this.f24029d)));
    }

    /* renamed from: d */
    public long m16520d(boolean z) {
        long j;
        if (((AudioTrack) C9149a.m16448e(this.f24028c)).getPlayState() == 3) {
            m16510n();
        }
        long nanoTime = System.nanoTime() / 1000;
        C9124s c9124s = (C9124s) C9149a.m16448e(this.f24031f);
        boolean m16531d = c9124s.m16531d();
        if (m16531d) {
            j = m16522b(c9124s.m16533b()) + C9191p0.m16269W(nanoTime - c9124s.m16532c(), this.f24035j);
        } else {
            if (this.f24048w == 0) {
                j = m16517g();
            } else {
                j = this.f24037l + nanoTime;
            }
            if (!z) {
                j = Math.max(0L, j - this.f24040o);
            }
        }
        if (this.f24023D != m16531d) {
            this.f24025F = this.f24022C;
            this.f24024E = this.f24021B;
        }
        long j2 = nanoTime - this.f24025F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f24024E + C9191p0.m16269W(j2, this.f24035j)))) / 1000;
        }
        if (!this.f24036k) {
            long j4 = this.f24021B;
            if (j > j4) {
                this.f24036k = true;
                this.f24026a.mo16500b(System.currentTimeMillis() - C7390b.m20791d(C9191p0.m16254d0(C7390b.m20791d(j - j4), this.f24035j)));
            }
        }
        this.f24022C = nanoTime;
        this.f24021B = j;
        this.f24023D = m16531d;
        return j;
    }

    /* renamed from: e */
    public long m16519e(long j) {
        return C7390b.m20791d(m16522b(j - m16518f()));
    }

    /* renamed from: h */
    public void m16516h(long j) {
        this.f24051z = m16518f();
        this.f24049x = SystemClock.elapsedRealtime() * 1000;
        this.f24020A = j;
    }

    /* renamed from: i */
    public boolean m16515i(long j) {
        if (j <= m16518f() && !m16523a()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m16514j() {
        return ((AudioTrack) C9149a.m16448e(this.f24028c)).getPlayState() == 3;
    }

    /* renamed from: k */
    public boolean m16513k(long j) {
        if (this.f24050y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f24050y >= 200) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m16512l(long j) {
        int playState = ((AudioTrack) C9149a.m16448e(this.f24028c)).getPlayState();
        if (this.f24033h) {
            if (playState == 2) {
                this.f24041p = false;
                return false;
            } else if (playState == 1 && m16518f() == 0) {
                return false;
            }
        }
        boolean z = this.f24041p;
        boolean m16515i = m16515i(j);
        this.f24041p = m16515i;
        if (z && !m16515i && playState != 1) {
            this.f24026a.mo16501a(this.f24030e, C7390b.m20791d(this.f24034i));
        }
        return true;
    }

    /* renamed from: q */
    public boolean m16507q() {
        m16505s();
        if (this.f24049x == -9223372036854775807L) {
            ((C9124s) C9149a.m16448e(this.f24031f)).m16528g();
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void m16506r() {
        m16505s();
        this.f24028c = null;
        this.f24031f = null;
    }

    /* renamed from: t */
    public void m16504t(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        long j;
        this.f24028c = audioTrack;
        this.f24029d = i2;
        this.f24030e = i3;
        this.f24031f = new C9124s(audioTrack);
        this.f24032g = audioTrack.getSampleRate();
        if (z && m16508p(i)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f24033h = z2;
        boolean m16230p0 = C9191p0.m16230p0(i);
        this.f24042q = m16230p0;
        if (m16230p0) {
            j = m16522b(i3 / i2);
        } else {
            j = -9223372036854775807L;
        }
        this.f24034i = j;
        this.f24044s = 0L;
        this.f24045t = 0L;
        this.f24046u = 0L;
        this.f24041p = false;
        this.f24049x = -9223372036854775807L;
        this.f24050y = -9223372036854775807L;
        this.f24043r = 0L;
        this.f24040o = 0L;
        this.f24035j = 1.0f;
    }

    /* renamed from: u */
    public void m16503u(float f) {
        this.f24035j = f;
        C9124s c9124s = this.f24031f;
        if (c9124s != null) {
            c9124s.m16528g();
        }
    }

    /* renamed from: v */
    public void m16502v() {
        ((C9124s) C9149a.m16448e(this.f24031f)).m16528g();
    }
}
