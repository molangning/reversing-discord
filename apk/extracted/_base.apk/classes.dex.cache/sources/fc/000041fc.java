package p213l8;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p040c7.AbstractC2429n;
import p040c7.C2427l;
import p040c7.C2428m;
import p040c7.C2440x;
import p040c7.C2448y;
import p040c7.InterfaceC2424k;
import p040c7.InterfaceC2432p;
import p151i6.C7399j;
import p151i6.C7406q;
import p195k8.C9149a;
import p195k8.C9185m0;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;
import p213l8.InterfaceC10062a0;
import p228m6.C10271g;

/* renamed from: l8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10074h extends AbstractC2429n {

    /* renamed from: D1 */
    private static final int[] f26202D1 = {1920, 1600, 1440, 1280, 960, 854, DiscordVideoMediaSource.DEFAULT_WIDTH, 540, DiscordVideoMediaSource.DEFAULT_HEIGHT};

    /* renamed from: E1 */
    private static boolean f26203E1;

    /* renamed from: F1 */
    private static boolean f26204F1;

    /* renamed from: A1 */
    private int f26205A1;

    /* renamed from: B1 */
    C10076b f26206B1;

    /* renamed from: C1 */
    private InterfaceC10081m f26207C1;

    /* renamed from: R0 */
    private final Context f26208R0;

    /* renamed from: S0 */
    private final C10083o f26209S0;

    /* renamed from: T0 */
    private final InterfaceC10062a0.C10063a f26210T0;

    /* renamed from: U0 */
    private final long f26211U0;

    /* renamed from: V0 */
    private final int f26212V0;

    /* renamed from: W0 */
    private final boolean f26213W0;

    /* renamed from: X0 */
    private C10075a f26214X0;

    /* renamed from: Y0 */
    private boolean f26215Y0;

    /* renamed from: Z0 */
    private boolean f26216Z0;

    /* renamed from: a1 */
    private Surface f26217a1;

    /* renamed from: b1 */
    private Surface f26218b1;

    /* renamed from: c1 */
    private boolean f26219c1;

    /* renamed from: d1 */
    private int f26220d1;

    /* renamed from: e1 */
    private boolean f26221e1;

    /* renamed from: f1 */
    private boolean f26222f1;

    /* renamed from: g1 */
    private boolean f26223g1;

    /* renamed from: h1 */
    private long f26224h1;

    /* renamed from: i1 */
    private long f26225i1;

    /* renamed from: j1 */
    private long f26226j1;

    /* renamed from: k1 */
    private int f26227k1;

    /* renamed from: l1 */
    private int f26228l1;

    /* renamed from: m1 */
    private int f26229m1;

    /* renamed from: n1 */
    private long f26230n1;

    /* renamed from: o1 */
    private long f26231o1;

    /* renamed from: p1 */
    private long f26232p1;

    /* renamed from: q1 */
    private int f26233q1;

    /* renamed from: r1 */
    private int f26234r1;

    /* renamed from: s1 */
    private int f26235s1;

    /* renamed from: t1 */
    private int f26236t1;

    /* renamed from: u1 */
    private float f26237u1;

    /* renamed from: v1 */
    private int f26238v1;

    /* renamed from: w1 */
    private int f26239w1;

    /* renamed from: x1 */
    private int f26240x1;

    /* renamed from: y1 */
    private float f26241y1;

    /* renamed from: z1 */
    private boolean f26242z1;

    /* renamed from: l8.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10075a {

        /* renamed from: a */
        public final int f26243a;

        /* renamed from: b */
        public final int f26244b;

        /* renamed from: c */
        public final int f26245c;

        public C10075a(int i, int i2, int i3) {
            this.f26243a = i;
            this.f26244b = i2;
            this.f26245c = i3;
        }
    }

    /* renamed from: l8.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C10076b implements InterfaceC2424k.InterfaceC2426b, Handler.Callback {

        /* renamed from: j */
        private final Handler f26246j;

        public C10076b(InterfaceC2424k interfaceC2424k) {
            C10074h.this = r1;
            Handler m16213y = C9191p0.m16213y(this);
            this.f26246j = m16213y;
            interfaceC2424k.mo33433g(this, m16213y);
        }

        /* renamed from: b */
        private void m12343b(long j) {
            C10074h c10074h = C10074h.this;
            if (this != c10074h.f26206B1) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                c10074h.m12386M1();
                return;
            }
            try {
                c10074h.m12388L1(j);
            } catch (ExoPlaybackException e) {
                C10074h.this.m33371c1(e);
            }
        }

        @Override // p040c7.InterfaceC2424k.InterfaceC2426b
        /* renamed from: a */
        public void mo12344a(InterfaceC2424k interfaceC2424k, long j, long j2) {
            if (C9191p0.f24171a < 30) {
                this.f26246j.sendMessageAtFrontOfQueue(Message.obtain(this.f26246j, 0, (int) (j >> 32), (int) j));
                return;
            }
            m12343b(j);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m12343b(C9191p0.m16274T0(message.arg1, message.arg2));
            return true;
        }
    }

    public C10074h(Context context, InterfaceC2432p interfaceC2432p, long j, boolean z, Handler handler, InterfaceC10062a0 interfaceC10062a0, int i) {
        this(context, InterfaceC2424k.InterfaceC2425a.f6631a, interfaceC2432p, j, z, handler, interfaceC10062a0, i);
    }

    /* renamed from: B1 */
    private static boolean m12406B1(long j) {
        return j < -30000;
    }

    /* renamed from: C1 */
    private static boolean m12405C1(long j) {
        return j < -500000;
    }

    /* renamed from: E1 */
    private void m12402E1() {
        if (this.f26227k1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f26210T0.m12446m(this.f26227k1, elapsedRealtime - this.f26226j1);
            this.f26227k1 = 0;
            this.f26226j1 = elapsedRealtime;
        }
    }

    /* renamed from: G1 */
    private void m12399G1() {
        int i = this.f26233q1;
        if (i != 0) {
            this.f26210T0.m12433z(this.f26232p1, i);
            this.f26232p1 = 0L;
            this.f26233q1 = 0;
        }
    }

    /* renamed from: H1 */
    private void m12397H1() {
        int i = this.f26234r1;
        if (i != -1 || this.f26235s1 != -1) {
            if (this.f26238v1 != i || this.f26239w1 != this.f26235s1 || this.f26240x1 != this.f26236t1 || this.f26241y1 != this.f26237u1) {
                this.f26210T0.m12459A(i, this.f26235s1, this.f26236t1, this.f26237u1);
                this.f26238v1 = this.f26234r1;
                this.f26239w1 = this.f26235s1;
                this.f26240x1 = this.f26236t1;
                this.f26241y1 = this.f26237u1;
            }
        }
    }

    /* renamed from: I1 */
    private void m12394I1() {
        if (this.f26219c1) {
            this.f26210T0.m12434y(this.f26217a1);
        }
    }

    /* renamed from: J1 */
    private void m12392J1() {
        int i = this.f26238v1;
        if (i != -1 || this.f26239w1 != -1) {
            this.f26210T0.m12459A(i, this.f26239w1, this.f26240x1, this.f26241y1);
        }
    }

    /* renamed from: K1 */
    private void m12390K1(long j, long j2, Format format) {
        InterfaceC10081m interfaceC10081m = this.f26207C1;
        if (interfaceC10081m != null) {
            interfaceC10081m.mo12341a(j, j2, format, m33351s0());
        }
    }

    /* renamed from: M1 */
    public void m12386M1() {
        m33373b1();
    }

    /* renamed from: P1 */
    private static void m12380P1(InterfaceC2424k interfaceC2424k, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC2424k.setParameters(bundle);
    }

    /* renamed from: Q1 */
    private void m12378Q1() {
        long j;
        if (this.f26211U0 > 0) {
            j = SystemClock.elapsedRealtime() + this.f26211U0;
        } else {
            j = -9223372036854775807L;
        }
        this.f26225i1 = j;
    }

    /* renamed from: S1 */
    private void m12376S1(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f26218b1;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C2428m m33352p0 = m33352p0();
                if (m33352p0 != null && m12371W1(m33352p0)) {
                    surface = C10067d.m12427d(this.f26208R0, m33352p0.f6640g);
                    this.f26218b1 = surface;
                }
            }
        }
        if (this.f26217a1 != surface) {
            this.f26217a1 = surface;
            this.f26209S0.m12325o(surface);
            this.f26219c1 = false;
            int state = getState();
            InterfaceC2424k m33353o0 = m33353o0();
            if (m33353o0 != null) {
                if (C9191p0.f24171a >= 23 && surface != null && !this.f26215Y0) {
                    m12377R1(m33353o0, surface);
                } else {
                    m33383U0();
                    m33398F0();
                }
            }
            if (surface != null && surface != this.f26218b1) {
                m12392J1();
                m12361o1();
                if (state == 2) {
                    m12378Q1();
                    return;
                }
                return;
            }
            m12359p1();
            m12361o1();
        } else if (surface != null && surface != this.f26218b1) {
            m12392J1();
            m12394I1();
        }
    }

    /* renamed from: W1 */
    private boolean m12371W1(C2428m c2428m) {
        if (C9191p0.f24171a >= 23 && !this.f26242z1 && !m12357q1(c2428m.f6634a) && (!c2428m.f6640g || C10067d.m12428b(this.f26208R0))) {
            return true;
        }
        return false;
    }

    /* renamed from: o1 */
    private void m12361o1() {
        InterfaceC2424k m33353o0;
        this.f26221e1 = false;
        if (C9191p0.f24171a >= 23 && this.f26242z1 && (m33353o0 = m33353o0()) != null) {
            this.f26206B1 = new C10076b(m33353o0);
        }
    }

    /* renamed from: p1 */
    private void m12359p1() {
        this.f26238v1 = -1;
        this.f26239w1 = -1;
        this.f26241y1 = -1.0f;
        this.f26240x1 = -1;
    }

    /* renamed from: r1 */
    private static void m12355r1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: s1 */
    private static boolean m12354s1() {
        return "NVIDIA".equals(C9191p0.f24173c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1207:0x07cd, code lost:
        if (r0.equals("NX573J") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1238:0x082f, code lost:
        if (r0.equals("AFTN") == false) goto L43;
     */
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m12351u1() {
        /*
            Method dump skipped, instructions count: 3044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p213l8.C10074h.m12351u1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: v1 */
    private static int m12350v1(C2428m c2428m, String str, int i, int i2) {
        char c;
        int m16239l;
        if (i != -1 && i2 != -1) {
            str.hashCode();
            int i3 = 4;
            switch (str.hashCode()) {
                case -1851077871:
                    if (str.equals("video/dolby-vision")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 4:
                    String str2 = C9191p0.f24174d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(C9191p0.f24173c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c2428m.f6640g)))) {
                        m16239l = C9191p0.m16239l(i, 16) * C9191p0.m16239l(i2, 16) * 16 * 16;
                        i3 = 2;
                        break;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                    m16239l = i * i2;
                    i3 = 2;
                    break;
                case 2:
                case 6:
                    m16239l = i * i2;
                    break;
                default:
                    return -1;
            }
            return (m16239l * 3) / (i3 * 2);
        }
        return -1;
    }

    /* renamed from: w1 */
    private static Point m12349w1(C2428m c2428m, Format format) {
        boolean z;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4 = format.f11171A;
        int i5 = format.f11202z;
        if (i4 > i5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = i4;
        } else {
            i = i5;
        }
        if (z) {
            i4 = i5;
        }
        float f = i4 / i;
        for (int i6 : f26202D1) {
            int i7 = (int) (i6 * f);
            if (i6 <= i || i7 <= i4) {
                break;
            }
            if (C9191p0.f24171a >= 21) {
                if (z) {
                    i3 = i7;
                } else {
                    i3 = i6;
                }
                if (!z) {
                    i6 = i7;
                }
                Point m33428b = c2428m.m33428b(i3, i6);
                if (c2428m.m33410t(m33428b.x, m33428b.y, format.f11172B)) {
                    return m33428b;
                }
            } else {
                try {
                    int m16239l = C9191p0.m16239l(i6, 16) * 16;
                    int m16239l2 = C9191p0.m16239l(i7, 16) * 16;
                    if (m16239l * m16239l2 <= C2440x.m33325M()) {
                        if (z) {
                            i2 = m16239l2;
                        } else {
                            i2 = m16239l;
                        }
                        if (!z) {
                            m16239l = m16239l2;
                        }
                        return new Point(i2, m16239l);
                    }
                } catch (C2440x.C2443c unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: y1 */
    private static List<C2428m> m12346y1(InterfaceC2432p interfaceC2432p, Format format, boolean z, boolean z2) {
        Pair<Integer, Integer> m33305p;
        String str = format.f11197u;
        if (str == null) {
            return Collections.emptyList();
        }
        List<C2428m> m33301t = C2440x.m33301t(interfaceC2432p.mo33341a(str, z, z2), format);
        if ("video/dolby-vision".equals(str) && (m33305p = C2440x.m33305p(format)) != null) {
            int intValue = ((Integer) m33305p.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    m33301t.addAll(interfaceC2432p.mo33341a("video/avc", z, z2));
                }
            } else {
                m33301t.addAll(interfaceC2432p.mo33341a("video/hevc", z, z2));
            }
        }
        return Collections.unmodifiableList(m33301t);
    }

    /* renamed from: z1 */
    protected static int m12345z1(C2428m c2428m, Format format) {
        if (format.f11198v != -1) {
            int size = format.f11199w.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += format.f11199w.get(i2).length;
            }
            return format.f11198v + i;
        }
        return m12350v1(c2428m, format.f11197u, format.f11202z, format.f11171A);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* renamed from: A1 */
    protected MediaFormat m12407A1(Format format, String str, C10075a c10075a, float f, boolean z, int i) {
        Pair<Integer, Integer> m33305p;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.f11202z);
        mediaFormat.setInteger("height", format.f11171A);
        C2448y.m33283e(mediaFormat, format.f11199w);
        C2448y.m33285c(mediaFormat, "frame-rate", format.f11172B);
        C2448y.m33284d(mediaFormat, "rotation-degrees", format.f11173C);
        C2448y.m33286b(mediaFormat, format.f11177G);
        if ("video/dolby-vision".equals(format.f11197u) && (m33305p = C2440x.m33305p(format)) != null) {
            C2448y.m33284d(mediaFormat, "profile", ((Integer) m33305p.first).intValue());
        }
        mediaFormat.setInteger("max-width", c10075a.f26243a);
        mediaFormat.setInteger("max-height", c10075a.f26244b);
        C2448y.m33284d(mediaFormat, "max-input-size", c10075a.f26245c);
        if (C9191p0.f24171a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m12355r1(mediaFormat, i);
        }
        return mediaFormat;
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: D */
    public void mo3123D() {
        m12359p1();
        m12361o1();
        this.f26219c1 = false;
        this.f26209S0.m12333g();
        this.f26206B1 = null;
        try {
            super.mo3123D();
        } finally {
            this.f26210T0.m12447l(this.f6671M0);
        }
    }

    /* renamed from: D1 */
    protected boolean m12404D1(long j, boolean z) {
        int m29426L = m29426L(j);
        if (m29426L == 0) {
            return false;
        }
        DecoderCounters decoderCounters = this.f6671M0;
        decoderCounters.f11465i++;
        int i = this.f26229m1 + m29426L;
        if (z) {
            decoderCounters.f11462f += i;
        } else {
            m12368Y1(i);
        }
        m33357l0();
        return true;
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: E */
    public void mo12403E(boolean z, boolean z2) {
        boolean z3;
        super.mo12403E(z, z2);
        boolean z4 = m29423y().f19925a;
        if (z4 && this.f26205A1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        C9149a.m16447f(z3);
        if (this.f26242z1 != z4) {
            this.f26242z1 = z4;
            m33383U0();
        }
        this.f26210T0.m12445n(this.f6671M0);
        this.f26209S0.m12332h();
        this.f26222f1 = z2;
        this.f26223g1 = false;
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: F */
    public void mo3122F(long j, boolean z) {
        super.mo3122F(j, z);
        m12361o1();
        this.f26209S0.m12328l();
        this.f26230n1 = -9223372036854775807L;
        this.f26224h1 = -9223372036854775807L;
        this.f26228l1 = 0;
        if (z) {
            m12378Q1();
        } else {
            this.f26225i1 = -9223372036854775807L;
        }
    }

    /* renamed from: F1 */
    void m12401F1() {
        this.f26223g1 = true;
        if (!this.f26221e1) {
            this.f26221e1 = true;
            this.f26210T0.m12434y(this.f26217a1);
            this.f26219c1 = true;
        }
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: G */
    public void mo12400G() {
        try {
            super.mo12400G();
            Surface surface = this.f26218b1;
            if (surface != null) {
                if (this.f26217a1 == surface) {
                    this.f26217a1 = null;
                }
                surface.release();
                this.f26218b1 = null;
            }
        } catch (Throwable th2) {
            if (this.f26218b1 != null) {
                Surface surface2 = this.f26217a1;
                Surface surface3 = this.f26218b1;
                if (surface2 == surface3) {
                    this.f26217a1 = null;
                }
                surface3.release();
                this.f26218b1 = null;
            }
            throw th2;
        }
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: H */
    public void mo12398H() {
        super.mo12398H();
        this.f26227k1 = 0;
        this.f26226j1 = SystemClock.elapsedRealtime();
        this.f26231o1 = SystemClock.elapsedRealtime() * 1000;
        this.f26232p1 = 0L;
        this.f26233q1 = 0;
        this.f26209S0.m12327m();
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: I */
    public void mo12396I() {
        this.f26225i1 = -9223372036854775807L;
        m12402E1();
        m12399G1();
        this.f26209S0.m12326n();
        super.mo12396I();
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: I0 */
    protected void mo12395I0(String str, long j, long j2) {
        this.f26210T0.m12449j(str, j, j2);
        this.f26215Y0 = m12357q1(str);
        this.f26216Z0 = ((C2428m) C9149a.m16448e(m33352p0())).m33416n();
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: J0 */
    protected void mo12393J0(String str) {
        this.f26210T0.m12448k(str);
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: K0 */
    public DecoderReuseEvaluation mo12391K0(C7399j c7399j) {
        DecoderReuseEvaluation mo12391K0 = super.mo12391K0(c7399j);
        this.f26210T0.m12444o(c7399j.f19920b, mo12391K0);
        return mo12391K0;
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: L0 */
    protected void mo12389L0(Format format, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        InterfaceC2424k m33353o0 = m33353o0();
        if (m33353o0 != null) {
            m33353o0.mo33438b(this.f26220d1);
        }
        if (this.f26242z1) {
            this.f26234r1 = format.f11202z;
            this.f26235s1 = format.f11171A;
        } else {
            C9149a.m16448e(mediaFormat);
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f26234r1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f26235s1 = integer2;
        }
        float f = format.f11174D;
        this.f26237u1 = f;
        if (C9191p0.f24171a >= 21) {
            int i = format.f11173C;
            if (i == 90 || i == 270) {
                int i2 = this.f26234r1;
                this.f26234r1 = this.f26235s1;
                this.f26235s1 = i2;
                this.f26237u1 = 1.0f / f;
            }
        } else {
            this.f26236t1 = format.f11173C;
        }
        this.f26209S0.m12331i(format.f11172B);
    }

    /* renamed from: L1 */
    protected void m12388L1(long j) {
        m33356l1(j);
        m12397H1();
        this.f6671M0.f11461e++;
        m12401F1();
        mo12387M0(j);
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: M0 */
    public void mo12387M0(long j) {
        super.mo12387M0(j);
        if (!this.f26242z1) {
            this.f26229m1--;
        }
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: N0 */
    public void mo12385N0() {
        super.mo12385N0();
        m12361o1();
    }

    /* renamed from: N1 */
    protected void m12384N1(InterfaceC2424k interfaceC2424k, int i, long j) {
        m12397H1();
        C9185m0.m16326a("releaseOutputBuffer");
        interfaceC2424k.releaseOutputBuffer(i, true);
        C9185m0.m16324c();
        this.f26231o1 = SystemClock.elapsedRealtime() * 1000;
        this.f6671M0.f11461e++;
        this.f26228l1 = 0;
        m12401F1();
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: O */
    protected DecoderReuseEvaluation mo12383O(C2428m c2428m, Format format, Format format2) {
        int i;
        DecoderReuseEvaluation m33425e = c2428m.m33425e(format, format2);
        int i2 = m33425e.f11472e;
        int i3 = format2.f11202z;
        C10075a c10075a = this.f26214X0;
        if (i3 > c10075a.f26243a || format2.f11171A > c10075a.f26244b) {
            i2 |= 256;
        }
        if (m12345z1(c2428m, format2) > this.f26214X0.f26245c) {
            i2 |= 64;
        }
        int i4 = i2;
        String str = c2428m.f6634a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = m33425e.f11471d;
        }
        return new DecoderReuseEvaluation(str, format, format2, i, i4);
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: O0 */
    protected void mo12382O0(C10271g c10271g) {
        boolean z = this.f26242z1;
        if (!z) {
            this.f26229m1++;
        }
        if (C9191p0.f24171a < 23 && z) {
            m12388L1(c10271g.f26745n);
        }
    }

    /* renamed from: O1 */
    protected void m12381O1(InterfaceC2424k interfaceC2424k, int i, long j, long j2) {
        m12397H1();
        C9185m0.m16326a("releaseOutputBuffer");
        interfaceC2424k.mo33436d(i, j2);
        C9185m0.m16324c();
        this.f26231o1 = SystemClock.elapsedRealtime() * 1000;
        this.f6671M0.f11461e++;
        this.f26228l1 = 0;
        m12401F1();
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: Q0 */
    protected boolean mo12379Q0(long j, long j2, InterfaceC2424k interfaceC2424k, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) {
        boolean z3;
        long j4;
        C9149a.m16448e(interfaceC2424k);
        if (this.f26224h1 == -9223372036854775807L) {
            this.f26224h1 = j;
        }
        if (j3 != this.f26230n1) {
            this.f26209S0.m12330j(j3);
            this.f26230n1 = j3;
        }
        long m33349v0 = m33349v0();
        long j5 = j3 - m33349v0;
        if (z && !z2) {
            m12370X1(interfaceC2424k, i, j5);
            return true;
        }
        double m33348w0 = m33348w0();
        boolean z4 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j6 = (long) ((j3 - j) / m33348w0);
        if (z4) {
            j6 -= elapsedRealtime - j2;
        }
        if (this.f26217a1 == this.f26218b1) {
            if (m12406B1(j6)) {
                m12370X1(interfaceC2424k, i, j5);
                m12366Z1(j6);
                return true;
            }
            return false;
        }
        long j7 = elapsedRealtime - this.f26231o1;
        if (this.f26223g1 ? this.f26221e1 : !(z4 || this.f26222f1)) {
            j4 = j7;
            z3 = false;
        } else {
            z3 = true;
            j4 = j7;
        }
        if (this.f26225i1 == -9223372036854775807L && j >= m33349v0 && (z3 || (z4 && m12373V1(j6, j4)))) {
            long nanoTime = System.nanoTime();
            m12390K1(j5, nanoTime, format);
            if (C9191p0.f24171a >= 21) {
                m12381O1(interfaceC2424k, i, j5, nanoTime);
            } else {
                m12384N1(interfaceC2424k, i, j5);
            }
            m12366Z1(j6);
            return true;
        }
        if (z4 && j != this.f26224h1) {
            long nanoTime2 = System.nanoTime();
            long m12338b = this.f26209S0.m12338b((j6 * 1000) + nanoTime2);
            long j8 = (m12338b - nanoTime2) / 1000;
            boolean z5 = this.f26225i1 != -9223372036854775807L;
            if (m12375T1(j8, j2, z2) && m12404D1(j, z5)) {
                return false;
            }
            if (m12374U1(j8, j2, z2)) {
                if (z5) {
                    m12370X1(interfaceC2424k, i, j5);
                } else {
                    m12352t1(interfaceC2424k, i, j5);
                }
                m12366Z1(j8);
                return true;
            } else if (C9191p0.f24171a >= 21) {
                if (j8 < 50000) {
                    m12390K1(j5, m12338b, format);
                    m12381O1(interfaceC2424k, i, j5, m12338b);
                    m12366Z1(j8);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                m12390K1(j5, m12338b, format);
                m12384N1(interfaceC2424k, i, j5);
                m12366Z1(j8);
                return true;
            }
        }
        return false;
    }

    /* renamed from: R1 */
    protected void m12377R1(InterfaceC2424k interfaceC2424k, Surface surface) {
        interfaceC2424k.mo33437c(surface);
    }

    /* renamed from: T1 */
    protected boolean m12375T1(long j, long j2, boolean z) {
        return m12405C1(j) && !z;
    }

    /* renamed from: U1 */
    protected boolean m12374U1(long j, long j2, boolean z) {
        return m12406B1(j) && !z;
    }

    /* renamed from: V1 */
    protected boolean m12373V1(long j, long j2) {
        return m12406B1(j) && j2 > 100000;
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: W0 */
    public void mo12372W0() {
        super.mo12372W0();
        this.f26229m1 = 0;
    }

    /* renamed from: X1 */
    protected void m12370X1(InterfaceC2424k interfaceC2424k, int i, long j) {
        C9185m0.m16326a("skipVideoBuffer");
        interfaceC2424k.releaseOutputBuffer(i, false);
        C9185m0.m16324c();
        this.f6671M0.f11462f++;
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: Y */
    protected void mo12369Y(C2428m c2428m, InterfaceC2424k interfaceC2424k, Format format, MediaCrypto mediaCrypto, float f) {
        int i;
        String str = c2428m.f6636c;
        C10075a m12347x1 = m12347x1(c2428m, format, m29429B());
        this.f26214X0 = m12347x1;
        boolean z = this.f26213W0;
        if (this.f26242z1) {
            i = this.f26205A1;
        } else {
            i = 0;
        }
        MediaFormat m12407A1 = m12407A1(format, str, m12347x1, f, z, i);
        if (this.f26217a1 == null) {
            if (m12371W1(c2428m)) {
                if (this.f26218b1 == null) {
                    this.f26218b1 = C10067d.m12427d(this.f26208R0, c2428m.f6640g);
                }
                this.f26217a1 = this.f26218b1;
            } else {
                throw new IllegalStateException();
            }
        }
        interfaceC2424k.configure(m12407A1, this.f26217a1, mediaCrypto, 0);
        if (C9191p0.f24171a >= 23 && this.f26242z1) {
            this.f26206B1 = new C10076b(interfaceC2424k);
        }
    }

    /* renamed from: Y1 */
    protected void m12368Y1(int i) {
        DecoderCounters decoderCounters = this.f6671M0;
        decoderCounters.f11463g += i;
        this.f26227k1 += i;
        int i2 = this.f26228l1 + i;
        this.f26228l1 = i2;
        decoderCounters.f11464h = Math.max(i2, decoderCounters.f11464h);
        int i3 = this.f26212V0;
        if (i3 > 0 && this.f26227k1 >= i3) {
            m12402E1();
        }
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: Z */
    protected C2427l mo12367Z(Throwable th2, C2428m c2428m) {
        return new C10073g(th2, c2428m, this.f26217a1);
    }

    /* renamed from: Z1 */
    protected void m12366Z1(long j) {
        this.f6671M0.m29542a(j);
        this.f26232p1 += j;
        this.f26233q1++;
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: e */
    public boolean mo3108e() {
        Surface surface;
        if (super.mo3108e() && (this.f26221e1 || (((surface = this.f26218b1) != null && this.f26217a1 == surface) || m33353o0() == null || this.f26242z1))) {
            this.f26225i1 = -9223372036854775807L;
            return true;
        } else if (this.f26225i1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f26225i1) {
                return true;
            }
            this.f26225i1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: f1 */
    protected boolean mo12365f1(C2428m c2428m) {
        return this.f26217a1 != null || m12371W1(c2428m);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0, p151i6.InterfaceC7407r
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: h1 */
    protected int mo12364h1(InterfaceC2432p interfaceC2432p, Format format) {
        boolean z;
        int i;
        int i2;
        int i3 = 0;
        if (!C9200u.m16151s(format.f11197u)) {
            return C7406q.m20725a(0);
        }
        if (format.f11200x != null) {
            z = true;
        } else {
            z = false;
        }
        List<C2428m> m12346y1 = m12346y1(interfaceC2432p, format, z, false);
        if (z && m12346y1.isEmpty()) {
            m12346y1 = m12346y1(interfaceC2432p, format, false, false);
        }
        if (m12346y1.isEmpty()) {
            return C7406q.m20725a(1);
        }
        if (!AbstractC2429n.m33362i1(format)) {
            return C7406q.m20725a(2);
        }
        C2428m c2428m = m12346y1.get(0);
        boolean m33417m = c2428m.m33417m(format);
        if (c2428m.m33415o(format)) {
            i = 16;
        } else {
            i = 8;
        }
        if (m33417m) {
            List<C2428m> m12346y12 = m12346y1(interfaceC2432p, format, z, true);
            if (!m12346y12.isEmpty()) {
                C2428m c2428m2 = m12346y12.get(0);
                if (c2428m2.m33417m(format) && c2428m2.m33415o(format)) {
                    i3 = 32;
                }
            }
        }
        if (m33417m) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        return C7406q.m20724b(i2, i, i3);
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f, com.google.android.exoplayer2.C4446s0.InterfaceC4448b
    /* renamed from: j */
    public void mo11675j(int i, Object obj) {
        if (i != 1) {
            if (i != 4) {
                if (i != 6) {
                    if (i != 102) {
                        super.mo11675j(i, obj);
                        return;
                    }
                    int intValue = ((Integer) obj).intValue();
                    if (this.f26205A1 != intValue) {
                        this.f26205A1 = intValue;
                        if (this.f26242z1) {
                            m33383U0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f26207C1 = (InterfaceC10081m) obj;
                return;
            }
            this.f26220d1 = ((Integer) obj).intValue();
            InterfaceC2424k m33353o0 = m33353o0();
            if (m33353o0 != null) {
                m33353o0.mo33438b(this.f26220d1);
                return;
            }
            return;
        }
        m12376S1((Surface) obj);
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f, com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: p */
    public void mo12360p(float f, float f2) {
        super.mo12360p(f, f2);
        this.f26209S0.m12329k(f);
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: q0 */
    protected boolean mo12358q0() {
        return this.f26242z1 && C9191p0.f24171a < 23;
    }

    /* renamed from: q1 */
    protected boolean m12357q1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C10074h.class) {
            if (!f26203E1) {
                f26204F1 = m12351u1();
                f26203E1 = true;
            }
        }
        return f26204F1;
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: r0 */
    protected float mo12356r0(float f, Format format, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.f11172B;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: t0 */
    protected List<C2428m> mo12353t0(InterfaceC2432p interfaceC2432p, Format format, boolean z) {
        return m12346y1(interfaceC2432p, format, z, this.f26242z1);
    }

    /* renamed from: t1 */
    protected void m12352t1(InterfaceC2424k interfaceC2424k, int i, long j) {
        C9185m0.m16326a("dropVideoBuffer");
        interfaceC2424k.releaseOutputBuffer(i, false);
        C9185m0.m16324c();
        m12368Y1(1);
    }

    @Override // p040c7.AbstractC2429n
    @TargetApi(29)
    /* renamed from: x0 */
    protected void mo12348x0(C10271g c10271g) {
        if (!this.f26216Z0) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C9149a.m16448e(c10271g.f26746o);
        if (byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(0);
                m12380P1(m33353o0(), bArr);
            }
        }
    }

    /* renamed from: x1 */
    protected C10075a m12347x1(C2428m c2428m, Format format, Format[] formatArr) {
        boolean z;
        int m12350v1;
        int i = format.f11202z;
        int i2 = format.f11171A;
        int m12345z1 = m12345z1(c2428m, format);
        if (formatArr.length == 1) {
            if (m12345z1 != -1 && (m12350v1 = m12350v1(c2428m, format.f11197u, format.f11202z, format.f11171A)) != -1) {
                m12345z1 = Math.min((int) (m12345z1 * 1.5f), m12350v1);
            }
            return new C10075a(i, i2, m12345z1);
        }
        int length = formatArr.length;
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            Format format2 = formatArr[i3];
            if (format.f11177G != null && format2.f11177G == null) {
                format2 = format2.m29926a().m29909J(format.f11177G).m29914E();
            }
            if (c2428m.m33425e(format, format2).f11471d != 0) {
                int i4 = format2.f11202z;
                if (i4 != -1 && format2.f11171A != -1) {
                    z = false;
                } else {
                    z = true;
                }
                z2 |= z;
                i = Math.max(i, i4);
                i2 = Math.max(i2, format2.f11171A);
                m12345z1 = Math.max(m12345z1, m12345z1(c2428m, format2));
            }
        }
        if (z2) {
            C9197r.m16178h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point m12349w1 = m12349w1(c2428m, format);
            if (m12349w1 != null) {
                i = Math.max(i, m12349w1.x);
                i2 = Math.max(i2, m12349w1.y);
                m12345z1 = Math.max(m12345z1, m12350v1(c2428m, format.f11197u, i, i2));
                C9197r.m16178h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new C10075a(i, i2, m12345z1);
    }

    public C10074h(Context context, InterfaceC2424k.InterfaceC2425a interfaceC2425a, InterfaceC2432p interfaceC2432p, long j, boolean z, Handler handler, InterfaceC10062a0 interfaceC10062a0, int i) {
        super(2, interfaceC2425a, interfaceC2432p, z, 30.0f);
        this.f26211U0 = j;
        this.f26212V0 = i;
        Context applicationContext = context.getApplicationContext();
        this.f26208R0 = applicationContext;
        this.f26209S0 = new C10083o(applicationContext);
        this.f26210T0 = new InterfaceC10062a0.C10063a(handler, interfaceC10062a0);
        this.f26213W0 = m12354s1();
        this.f26225i1 = -9223372036854775807L;
        this.f26234r1 = -1;
        this.f26235s1 = -1;
        this.f26237u1 = -1.0f;
        this.f26220d1 = 1;
        this.f26205A1 = 0;
        m12359p1();
    }
}