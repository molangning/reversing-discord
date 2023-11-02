package p193k6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.InterfaceC4483u0;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c7.AbstractC2429n;
import p040c7.C2428m;
import p040c7.C2440x;
import p040c7.C2448y;
import p040c7.InterfaceC2424k;
import p040c7.InterfaceC2432p;
import p151i6.C7399j;
import p151i6.C7406q;
import p193k6.InterfaceC9115q;
import p193k6.InterfaceC9118r;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9200u;
import p195k8.InterfaceC9199t;
import p228m6.C10271g;

/* renamed from: k6.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9099j0 extends AbstractC2429n implements InterfaceC9199t {

    /* renamed from: R0 */
    private final Context f23901R0;

    /* renamed from: S0 */
    private final InterfaceC9115q.C9116a f23902S0;

    /* renamed from: T0 */
    private final InterfaceC9118r f23903T0;

    /* renamed from: U0 */
    private int f23904U0;

    /* renamed from: V0 */
    private boolean f23905V0;

    /* renamed from: W0 */
    private Format f23906W0;

    /* renamed from: X0 */
    private long f23907X0;

    /* renamed from: Y0 */
    private boolean f23908Y0;

    /* renamed from: Z0 */
    private boolean f23909Z0;

    /* renamed from: a1 */
    private boolean f23910a1;

    /* renamed from: b1 */
    private boolean f23911b1;

    /* renamed from: c1 */
    private InterfaceC4483u0.InterfaceC4484a f23912c1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k6.j0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C9101b implements InterfaceC9118r.InterfaceC9121c {
        private C9101b() {
            C9099j0.this = r1;
        }

        @Override // p193k6.InterfaceC9118r.InterfaceC9121c
        /* renamed from: a */
        public void mo16542a(boolean z) {
            C9099j0.this.f23902S0.m16568z(z);
        }

        @Override // p193k6.InterfaceC9118r.InterfaceC9121c
        /* renamed from: b */
        public void mo16541b(long j) {
            C9099j0.this.f23902S0.m16569y(j);
        }

        @Override // p193k6.InterfaceC9118r.InterfaceC9121c
        /* renamed from: c */
        public void mo16540c(Exception exc) {
            C9099j0.this.f23902S0.m16584j(exc);
        }

        @Override // p193k6.InterfaceC9118r.InterfaceC9121c
        /* renamed from: d */
        public void mo16539d(long j) {
            if (C9099j0.this.f23912c1 != null) {
                C9099j0.this.f23912c1.mo28957b(j);
            }
        }

        @Override // p193k6.InterfaceC9118r.InterfaceC9121c
        /* renamed from: e */
        public void mo16538e(int i, long j, long j2) {
            C9099j0.this.f23902S0.m16594A(i, j, j2);
        }

        @Override // p193k6.InterfaceC9118r.InterfaceC9121c
        /* renamed from: f */
        public void mo16537f() {
            C9099j0.this.m16662t1();
        }

        @Override // p193k6.InterfaceC9118r.InterfaceC9121c
        /* renamed from: g */
        public void mo16536g() {
            if (C9099j0.this.f23912c1 != null) {
                C9099j0.this.f23912c1.mo28958a();
            }
        }
    }

    public C9099j0(Context context, InterfaceC2432p interfaceC2432p, boolean z, Handler handler, InterfaceC9115q interfaceC9115q, InterfaceC9118r interfaceC9118r) {
        this(context, InterfaceC2424k.InterfaceC2425a.f6631a, interfaceC2432p, z, handler, interfaceC9115q, interfaceC9118r);
    }

    /* renamed from: o1 */
    private static boolean m16667o1(String str) {
        if (C9191p0.f24171a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C9191p0.f24173c)) {
            String str2 = C9191p0.f24172b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p1 */
    private static boolean m16666p1() {
        if (C9191p0.f24171a == 23) {
            String str = C9191p0.f24174d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q1 */
    private int m16665q1(C2428m c2428m, Format format) {
        int i;
        if ("OMX.google.raw.decoder".equals(c2428m.f6634a) && (i = C9191p0.f24171a) < 24 && (i != 23 || !C9191p0.m16224s0(this.f23901R0))) {
            return -1;
        }
        return format.f11198v;
    }

    /* renamed from: u1 */
    private void m16661u1() {
        long mo16550q = this.f23903T0.mo16550q(mo3109c());
        if (mo16550q != Long.MIN_VALUE) {
            if (!this.f23909Z0) {
                mo16550q = Math.max(this.f23907X0, mo16550q);
            }
            this.f23907X0 = mo16550q;
            this.f23909Z0 = false;
        }
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: D */
    public void mo3123D() {
        this.f23910a1 = true;
        try {
            this.f23903T0.flush();
            try {
                super.mo3123D();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.mo3123D();
                throw th2;
            } finally {
            }
        }
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: E */
    public void mo12403E(boolean z, boolean z2) {
        super.mo12403E(z, z2);
        this.f23902S0.m16580n(this.f6671M0);
        if (m29423y().f19925a) {
            this.f23903T0.mo16546u();
        } else {
            this.f23903T0.mo16556k();
        }
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: F */
    public void mo3122F(long j, boolean z) {
        super.mo3122F(j, z);
        if (this.f23911b1) {
            this.f23903T0.mo16552o();
        } else {
            this.f23903T0.flush();
        }
        this.f23907X0 = j;
        this.f23908Y0 = true;
        this.f23909Z0 = true;
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: G */
    public void mo12400G() {
        try {
            super.mo12400G();
        } finally {
            if (this.f23910a1) {
                this.f23910a1 = false;
                this.f23903T0.reset();
            }
        }
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: H */
    public void mo12398H() {
        super.mo12398H();
        this.f23903T0.mo16545v();
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: I */
    public void mo12396I() {
        m16661u1();
        this.f23903T0.mo16557j();
        super.mo12396I();
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: I0 */
    protected void mo12395I0(String str, long j, long j2) {
        this.f23902S0.m16583k(str, j, j2);
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: J0 */
    protected void mo12393J0(String str) {
        this.f23902S0.m16582l(str);
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: K0 */
    public DecoderReuseEvaluation mo12391K0(C7399j c7399j) {
        DecoderReuseEvaluation mo12391K0 = super.mo12391K0(c7399j);
        this.f23902S0.m16579o(c7399j.f19920b, mo12391K0);
        return mo12391K0;
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: L0 */
    protected void mo12389L0(Format format, MediaFormat mediaFormat) {
        int i;
        int i2;
        Format format2 = this.f23906W0;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (m33353o0() != null) {
            if ("audio/raw".equals(format.f11197u)) {
                i = format.f11180J;
            } else if (C9191p0.f24171a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = C9191p0.m16260a0(mediaFormat.getInteger("v-bits-per-sample"));
            } else if ("audio/raw".equals(format.f11197u)) {
                i = format.f11180J;
            } else {
                i = 2;
            }
            Format m29914E = new Format.C4362b().m29883e0("audio/raw").m29894Y(i).m29906M(format.f11181K).m29905N(format.f11182L).m29911H(mediaFormat.getInteger("channel-count")).m29881f0(mediaFormat.getInteger("sample-rate")).m29914E();
            if (this.f23905V0 && m29914E.f11178H == 6 && (i2 = format.f11178H) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < format.f11178H; i3++) {
                    iArr[i3] = i3;
                }
            }
            format = m29914E;
        }
        try {
            this.f23903T0.mo16544w(format, 0, iArr);
        } catch (InterfaceC9118r.C9119a e) {
            throw m29425w(e, e.f24002j);
        }
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: N0 */
    public void mo12385N0() {
        super.mo12385N0();
        this.f23903T0.mo16548s();
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: O */
    protected DecoderReuseEvaluation mo12383O(C2428m c2428m, Format format, Format format2) {
        int i;
        DecoderReuseEvaluation m33425e = c2428m.m33425e(format, format2);
        int i2 = m33425e.f11472e;
        if (m16665q1(c2428m, format2) > this.f23904U0) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = c2428m.f6634a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = m33425e.f11471d;
        }
        return new DecoderReuseEvaluation(str, format, format2, i, i3);
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: O0 */
    protected void mo12382O0(C10271g c10271g) {
        if (this.f23908Y0 && !c10271g.m11989k()) {
            if (Math.abs(c10271g.f26745n - this.f23907X0) > 500000) {
                this.f23907X0 = c10271g.f26745n;
            }
            this.f23908Y0 = false;
        }
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: Q0 */
    protected boolean mo12379Q0(long j, long j2, InterfaceC2424k interfaceC2424k, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) {
        C9149a.m16448e(byteBuffer);
        if (this.f23906W0 != null && (i2 & 2) != 0) {
            ((InterfaceC2424k) C9149a.m16448e(interfaceC2424k)).releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            if (interfaceC2424k != null) {
                interfaceC2424k.releaseOutputBuffer(i, false);
            }
            this.f6671M0.f11462f += i3;
            this.f23903T0.mo16548s();
            return true;
        } else {
            try {
                if (!this.f23903T0.mo16554m(byteBuffer, j3, i3)) {
                    return false;
                }
                if (interfaceC2424k != null) {
                    interfaceC2424k.releaseOutputBuffer(i, false);
                }
                this.f6671M0.f11461e += i3;
                return true;
            } catch (InterfaceC9118r.C9120b e) {
                throw m29424x(e, e.f24005l, e.f24004k);
            } catch (InterfaceC9118r.C9122d e2) {
                throw m29424x(e2, format, e2.f24007k);
            }
        }
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: V0 */
    protected void mo16671V0() {
        try {
            this.f23903T0.mo16551p();
        } catch (InterfaceC9118r.C9122d e) {
            throw m29424x(e, e.f24008l, e.f24007k);
        }
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: Y */
    protected void mo12369Y(C2428m c2428m, InterfaceC2424k interfaceC2424k, Format format, MediaCrypto mediaCrypto, float f) {
        this.f23904U0 = m16664r1(c2428m, format, m29429B());
        this.f23905V0 = m16667o1(c2428m.f6634a);
        boolean z = false;
        interfaceC2424k.configure(m16663s1(format, c2428m.f6636c, this.f23904U0, f), null, mediaCrypto, 0);
        if ("audio/raw".equals(c2428m.f6635b) && !"audio/raw".equals(format.f11197u)) {
            z = true;
        }
        if (!z) {
            format = null;
        }
        this.f23906W0 = format;
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: b */
    public PlaybackParameters mo16172b() {
        return this.f23903T0.mo16563b();
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: c */
    public boolean mo3109c() {
        return super.mo3109c() && this.f23903T0.mo16562c();
    }

    @Override // p040c7.AbstractC2429n, com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: e */
    public boolean mo3108e() {
        return this.f23903T0.mo16560g() || super.mo3108e();
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: f */
    public void mo16171f(PlaybackParameters playbackParameters) {
        this.f23903T0.mo16561f(playbackParameters);
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: g1 */
    protected boolean mo16670g1(Format format) {
        return this.f23903T0.mo16564a(format);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0, p151i6.InterfaceC7407r
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: h1 */
    protected int mo12364h1(InterfaceC2432p interfaceC2432p, Format format) {
        int i;
        boolean z;
        if (!C9200u.m16154p(format.f11197u)) {
            return C7406q.m20725a(0);
        }
        if (C9191p0.f24171a >= 21) {
            i = 32;
        } else {
            i = 0;
        }
        if (format.f11184N != null) {
            z = true;
        } else {
            z = false;
        }
        boolean m33362i1 = AbstractC2429n.m33362i1(format);
        int i2 = 8;
        int i3 = 4;
        if (m33362i1 && this.f23903T0.mo16564a(format) && (!z || C2440x.m33300u() != null)) {
            return C7406q.m20724b(4, 8, i);
        }
        if ("audio/raw".equals(format.f11197u) && !this.f23903T0.mo16564a(format)) {
            return C7406q.m20725a(1);
        }
        if (!this.f23903T0.mo16564a(C9191p0.m16258b0(2, format.f11178H, format.f11179I))) {
            return C7406q.m20725a(1);
        }
        List<C2428m> mo12353t0 = mo12353t0(interfaceC2432p, format, false);
        if (mo12353t0.isEmpty()) {
            return C7406q.m20725a(1);
        }
        if (!m33362i1) {
            return C7406q.m20725a(2);
        }
        C2428m c2428m = mo12353t0.get(0);
        boolean m33417m = c2428m.m33417m(format);
        if (m33417m && c2428m.m33415o(format)) {
            i2 = 16;
        }
        if (!m33417m) {
            i3 = 3;
        }
        return C7406q.m20724b(i3, i2, i);
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f, com.google.android.exoplayer2.C4446s0.InterfaceC4448b
    /* renamed from: j */
    public void mo11675j(int i, Object obj) {
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    switch (i) {
                        case 101:
                            this.f23903T0.mo16543x(((Boolean) obj).booleanValue());
                            return;
                        case 102:
                            this.f23903T0.mo16558i(((Integer) obj).intValue());
                            return;
                        case 103:
                            this.f23912c1 = (InterfaceC4483u0.InterfaceC4484a) obj;
                            return;
                        default:
                            super.mo11675j(i, obj);
                            return;
                    }
                }
                this.f23903T0.mo16559h((C9128u) obj);
                return;
            }
            this.f23903T0.mo16555l((AudioAttributes) obj);
            return;
        }
        this.f23903T0.mo16547t(((Float) obj).floatValue());
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: o */
    public long mo16170o() {
        if (getState() == 2) {
            m16661u1();
        }
        return this.f23907X0;
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: r0 */
    protected float mo12356r0(float f, Format format, Format[] formatArr) {
        int i = -1;
        for (Format format2 : formatArr) {
            int i2 = format2.f11179I;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    /* renamed from: r1 */
    protected int m16664r1(C2428m c2428m, Format format, Format[] formatArr) {
        int m16665q1 = m16665q1(c2428m, format);
        if (formatArr.length == 1) {
            return m16665q1;
        }
        for (Format format2 : formatArr) {
            if (c2428m.m33425e(format, format2).f11471d != 0) {
                m16665q1 = Math.max(m16665q1, m16665q1(c2428m, format2));
            }
        }
        return m16665q1;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: s1 */
    protected MediaFormat m16663s1(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.f11178H);
        mediaFormat.setInteger("sample-rate", format.f11179I);
        C2448y.m33283e(mediaFormat, format.f11199w);
        C2448y.m33284d(mediaFormat, "max-input-size", i);
        int i2 = C9191p0.f24171a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m16666p1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(format.f11197u)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f23903T0.mo16553n(C9191p0.m16258b0(4, format.f11178H, format.f11179I)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    @Override // p040c7.AbstractC2429n
    /* renamed from: t0 */
    protected List<C2428m> mo12353t0(InterfaceC2432p interfaceC2432p, Format format, boolean z) {
        C2428m m33300u;
        String str = format.f11197u;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f23903T0.mo16564a(format) && (m33300u = C2440x.m33300u()) != null) {
            return Collections.singletonList(m33300u);
        }
        List<C2428m> m33301t = C2440x.m33301t(interfaceC2432p.mo33341a(str, z, false), format);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(m33301t);
            arrayList.addAll(interfaceC2432p.mo33341a("audio/eac3", z, false));
            m33301t = arrayList;
        }
        return Collections.unmodifiableList(m33301t);
    }

    /* renamed from: t1 */
    protected void m16662t1() {
        this.f23909Z0 = true;
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f, com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: v */
    public InterfaceC9199t mo16660v() {
        return this;
    }

    public C9099j0(Context context, InterfaceC2424k.InterfaceC2425a interfaceC2425a, InterfaceC2432p interfaceC2432p, boolean z, Handler handler, InterfaceC9115q interfaceC9115q, InterfaceC9118r interfaceC9118r) {
        super(1, interfaceC2425a, interfaceC2432p, z, 44100.0f);
        this.f23901R0 = context.getApplicationContext();
        this.f23903T0 = interfaceC9118r;
        this.f23902S0 = new InterfaceC9115q.C9116a(handler, interfaceC9115q);
        interfaceC9118r.mo16549r(new C9101b());
    }
}