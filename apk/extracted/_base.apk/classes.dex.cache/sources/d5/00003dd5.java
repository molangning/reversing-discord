package p193k6;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioAttributes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import p193k6.C9126t;
import p193k6.InterfaceC9090g;
import p193k6.InterfaceC9118r;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;

/* renamed from: k6.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9073c0 implements InterfaceC9118r {

    /* renamed from: a0 */
    public static boolean f23799a0 = false;

    /* renamed from: A */
    private long f23800A;

    /* renamed from: B */
    private long f23801B;

    /* renamed from: C */
    private long f23802C;

    /* renamed from: D */
    private int f23803D;

    /* renamed from: E */
    private boolean f23804E;

    /* renamed from: F */
    private boolean f23805F;

    /* renamed from: G */
    private long f23806G;

    /* renamed from: H */
    private float f23807H;

    /* renamed from: I */
    private InterfaceC9090g[] f23808I;

    /* renamed from: J */
    private ByteBuffer[] f23809J;

    /* renamed from: K */
    private ByteBuffer f23810K;

    /* renamed from: L */
    private int f23811L;

    /* renamed from: M */
    private ByteBuffer f23812M;

    /* renamed from: N */
    private byte[] f23813N;

    /* renamed from: O */
    private int f23814O;

    /* renamed from: P */
    private int f23815P;

    /* renamed from: Q */
    private boolean f23816Q;

    /* renamed from: R */
    private boolean f23817R;

    /* renamed from: S */
    private boolean f23818S;

    /* renamed from: T */
    private boolean f23819T;

    /* renamed from: U */
    private int f23820U;

    /* renamed from: V */
    private C9128u f23821V;

    /* renamed from: W */
    private boolean f23822W;

    /* renamed from: X */
    private long f23823X;

    /* renamed from: Y */
    private boolean f23824Y;

    /* renamed from: Z */
    private boolean f23825Z;

    /* renamed from: a */
    private final C9086e f23826a;

    /* renamed from: b */
    private final InterfaceC9075b f23827b;

    /* renamed from: c */
    private final boolean f23828c;

    /* renamed from: d */
    private final C9130w f23829d;

    /* renamed from: e */
    private final C9117q0 f23830e;

    /* renamed from: f */
    private final InterfaceC9090g[] f23831f;

    /* renamed from: g */
    private final InterfaceC9090g[] f23832g;

    /* renamed from: h */
    private final ConditionVariable f23833h;

    /* renamed from: i */
    private final C9126t f23834i;

    /* renamed from: j */
    private final ArrayDeque<C9079f> f23835j;

    /* renamed from: k */
    private final boolean f23836k;

    /* renamed from: l */
    private final boolean f23837l;

    /* renamed from: m */
    private C9082i f23838m;

    /* renamed from: n */
    private final C9080g<InterfaceC9118r.C9120b> f23839n;

    /* renamed from: o */
    private final C9080g<InterfaceC9118r.C9122d> f23840o;

    /* renamed from: p */
    private InterfaceC9118r.InterfaceC9121c f23841p;

    /* renamed from: q */
    private C9076c f23842q;

    /* renamed from: r */
    private C9076c f23843r;

    /* renamed from: s */
    private AudioTrack f23844s;

    /* renamed from: t */
    private AudioAttributes f23845t;

    /* renamed from: u */
    private C9079f f23846u;

    /* renamed from: v */
    private C9079f f23847v;

    /* renamed from: w */
    private PlaybackParameters f23848w;

    /* renamed from: x */
    private ByteBuffer f23849x;

    /* renamed from: y */
    private int f23850y;

    /* renamed from: z */
    private long f23851z;

    /* renamed from: k6.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C9074a extends Thread {

        /* renamed from: j */
        final /* synthetic */ AudioTrack f23852j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9074a(String str, AudioTrack audioTrack) {
            super(str);
            C9073c0.this = r1;
            this.f23852j = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f23852j.flush();
                this.f23852j.release();
            } finally {
                C9073c0.this.f23833h.open();
            }
        }
    }

    /* renamed from: k6.c0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9075b {
        /* renamed from: a */
        long mo16699a(long j);

        /* renamed from: b */
        InterfaceC9090g[] mo16698b();

        /* renamed from: c */
        PlaybackParameters mo16697c(PlaybackParameters playbackParameters);

        /* renamed from: d */
        long mo16696d();

        /* renamed from: e */
        boolean mo16695e(boolean z);
    }

    /* renamed from: k6.c0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9076c {

        /* renamed from: a */
        public final Format f23854a;

        /* renamed from: b */
        public final int f23855b;

        /* renamed from: c */
        public final int f23856c;

        /* renamed from: d */
        public final int f23857d;

        /* renamed from: e */
        public final int f23858e;

        /* renamed from: f */
        public final int f23859f;

        /* renamed from: g */
        public final int f23860g;

        /* renamed from: h */
        public final int f23861h;

        /* renamed from: i */
        public final InterfaceC9090g[] f23862i;

        public C9076c(Format format, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, InterfaceC9090g[] interfaceC9090gArr) {
            this.f23854a = format;
            this.f23855b = i;
            this.f23856c = i2;
            this.f23857d = i3;
            this.f23858e = i4;
            this.f23859f = i5;
            this.f23860g = i6;
            this.f23862i = interfaceC9090gArr;
            this.f23861h = m16712c(i7, z);
        }

        /* renamed from: c */
        private int m16712c(int i, boolean z) {
            float f;
            if (i != 0) {
                return i;
            }
            int i2 = this.f23856c;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return m16703l(250000L);
                    }
                    throw new IllegalStateException();
                }
                return m16703l(50000000L);
            }
            if (z) {
                f = 8.0f;
            } else {
                f = 1.0f;
            }
            return m16702m(f);
        }

        /* renamed from: d */
        private AudioTrack m16711d(boolean z, AudioAttributes audioAttributes, int i) {
            int i2 = C9191p0.f24171a;
            if (i2 >= 29) {
                return m16709f(z, audioAttributes, i);
            }
            if (i2 >= 21) {
                return m16710e(z, audioAttributes, i);
            }
            return m16708g(audioAttributes, i);
        }

        /* renamed from: e */
        private AudioTrack m16710e(boolean z, AudioAttributes audioAttributes, int i) {
            return new AudioTrack(m16705j(audioAttributes, z), C9073c0.m16752L(this.f23858e, this.f23859f, this.f23860g), this.f23861h, 1, i);
        }

        /* renamed from: f */
        private AudioTrack m16709f(boolean z, AudioAttributes audioAttributes, int i) {
            AudioTrack.Builder offloadedPlayback;
            AudioFormat m16752L = C9073c0.m16752L(this.f23858e, this.f23859f, this.f23860g);
            android.media.AudioAttributes m16705j = m16705j(audioAttributes, z);
            boolean z2 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(m16705j).setAudioFormat(m16752L).setTransferMode(1).setBufferSizeInBytes(this.f23861h).setSessionId(i);
            if (this.f23856c != 1) {
                z2 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z2);
            return offloadedPlayback.build();
        }

        /* renamed from: g */
        private AudioTrack m16708g(AudioAttributes audioAttributes, int i) {
            int m16252e0 = C9191p0.m16252e0(audioAttributes.f11428c);
            if (i == 0) {
                return new AudioTrack(m16252e0, this.f23858e, this.f23859f, this.f23860g, this.f23861h, 1);
            }
            return new AudioTrack(m16252e0, this.f23858e, this.f23859f, this.f23860g, this.f23861h, 1, i);
        }

        /* renamed from: j */
        private static android.media.AudioAttributes m16705j(AudioAttributes audioAttributes, boolean z) {
            if (z) {
                return m16704k();
            }
            return audioAttributes.m29568a();
        }

        /* renamed from: k */
        private static android.media.AudioAttributes m16704k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: l */
        private int m16703l(long j) {
            int m16746R = C9073c0.m16746R(this.f23860g);
            if (this.f23860g == 5) {
                m16746R *= 2;
            }
            return (int) ((j * m16746R) / 1000000);
        }

        /* renamed from: m */
        private int m16702m(float f) {
            boolean z;
            int minBufferSize = AudioTrack.getMinBufferSize(this.f23858e, this.f23859f, this.f23860g);
            if (minBufferSize != -2) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z);
            int m16227r = C9191p0.m16227r(minBufferSize * 4, ((int) m16707h(250000L)) * this.f23857d, Math.max(minBufferSize, ((int) m16707h(750000L)) * this.f23857d));
            if (f != 1.0f) {
                return Math.round(m16227r * f);
            }
            return m16227r;
        }

        /* renamed from: a */
        public AudioTrack m16714a(boolean z, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, int i) {
            try {
                AudioTrack m16711d = m16711d(z, audioAttributes, i);
                int state = m16711d.getState();
                if (state == 1) {
                    return m16711d;
                }
                try {
                    m16711d.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC9118r.C9120b(state, this.f23858e, this.f23859f, this.f23861h, this.f23854a, m16700o(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new InterfaceC9118r.C9120b(0, this.f23858e, this.f23859f, this.f23861h, this.f23854a, m16700o(), e);
            }
        }

        /* renamed from: b */
        public boolean m16713b(C9076c c9076c) {
            return c9076c.f23856c == this.f23856c && c9076c.f23860g == this.f23860g && c9076c.f23858e == this.f23858e && c9076c.f23859f == this.f23859f && c9076c.f23857d == this.f23857d;
        }

        /* renamed from: h */
        public long m16707h(long j) {
            return (j * this.f23858e) / 1000000;
        }

        /* renamed from: i */
        public long m16706i(long j) {
            return (j * 1000000) / this.f23858e;
        }

        /* renamed from: n */
        public long m16701n(long j) {
            return (j * 1000000) / this.f23854a.f11179I;
        }

        /* renamed from: o */
        public boolean m16700o() {
            return this.f23856c == 1;
        }
    }

    /* renamed from: k6.c0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C9077d implements InterfaceC9075b {

        /* renamed from: a */
        private final InterfaceC9090g[] f23863a;

        /* renamed from: b */
        private final C9110n0 f23864b;

        /* renamed from: c */
        private final C9114p0 f23865c;

        public C9077d(InterfaceC9090g... interfaceC9090gArr) {
            this(interfaceC9090gArr, new C9110n0(), new C9114p0());
        }

        @Override // p193k6.C9073c0.InterfaceC9075b
        /* renamed from: a */
        public long mo16699a(long j) {
            return this.f23865c.m16606g(j);
        }

        @Override // p193k6.C9073c0.InterfaceC9075b
        /* renamed from: b */
        public InterfaceC9090g[] mo16698b() {
            return this.f23863a;
        }

        @Override // p193k6.C9073c0.InterfaceC9075b
        /* renamed from: c */
        public PlaybackParameters mo16697c(PlaybackParameters playbackParameters) {
            this.f23865c.m16604i(playbackParameters.f11302a);
            this.f23865c.m16605h(playbackParameters.f11303b);
            return playbackParameters;
        }

        @Override // p193k6.C9073c0.InterfaceC9075b
        /* renamed from: d */
        public long mo16696d() {
            return this.f23864b.m16637p();
        }

        @Override // p193k6.C9073c0.InterfaceC9075b
        /* renamed from: e */
        public boolean mo16695e(boolean z) {
            this.f23864b.m16631v(z);
            return z;
        }

        public C9077d(InterfaceC9090g[] interfaceC9090gArr, C9110n0 c9110n0, C9114p0 c9114p0) {
            InterfaceC9090g[] interfaceC9090gArr2 = new InterfaceC9090g[interfaceC9090gArr.length + 2];
            this.f23863a = interfaceC9090gArr2;
            System.arraycopy(interfaceC9090gArr, 0, interfaceC9090gArr2, 0, interfaceC9090gArr.length);
            this.f23864b = c9110n0;
            this.f23865c = c9114p0;
            interfaceC9090gArr2[interfaceC9090gArr.length] = c9110n0;
            interfaceC9090gArr2[interfaceC9090gArr.length + 1] = c9114p0;
        }
    }

    /* renamed from: k6.c0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9078e extends RuntimeException {
        /* synthetic */ C9078e(String str, C9074a c9074a) {
            this(str);
        }

        private C9078e(String str) {
            super(str);
        }
    }

    /* renamed from: k6.c0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9079f {

        /* renamed from: a */
        public final PlaybackParameters f23866a;

        /* renamed from: b */
        public final boolean f23867b;

        /* renamed from: c */
        public final long f23868c;

        /* renamed from: d */
        public final long f23869d;

        /* synthetic */ C9079f(PlaybackParameters playbackParameters, boolean z, long j, long j2, C9074a c9074a) {
            this(playbackParameters, z, j, j2);
        }

        private C9079f(PlaybackParameters playbackParameters, boolean z, long j, long j2) {
            this.f23866a = playbackParameters;
            this.f23867b = z;
            this.f23868c = j;
            this.f23869d = j2;
        }
    }

    /* renamed from: k6.c0$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9080g<T extends Exception> {

        /* renamed from: a */
        private final long f23870a;

        /* renamed from: b */
        private T f23871b;

        /* renamed from: c */
        private long f23872c;

        public C9080g(long j) {
            this.f23870a = j;
        }

        /* renamed from: a */
        public void m16694a() {
            this.f23871b = null;
        }

        /* renamed from: b */
        public void m16693b(T t) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f23871b == null) {
                this.f23871b = t;
                this.f23872c = this.f23870a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f23872c) {
                T t2 = this.f23871b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f23871b;
                m16694a();
                throw t3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k6.c0$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C9081h implements C9126t.InterfaceC9127a {
        private C9081h() {
            C9073c0.this = r1;
        }

        @Override // p193k6.C9126t.InterfaceC9127a
        /* renamed from: a */
        public void mo16501a(int i, long j) {
            if (C9073c0.this.f23841p != null) {
                C9073c0.this.f23841p.mo16538e(i, j, SystemClock.elapsedRealtime() - C9073c0.this.f23823X);
            }
        }

        @Override // p193k6.C9126t.InterfaceC9127a
        /* renamed from: b */
        public void mo16500b(long j) {
            if (C9073c0.this.f23841p != null) {
                C9073c0.this.f23841p.mo16541b(j);
            }
        }

        @Override // p193k6.C9126t.InterfaceC9127a
        /* renamed from: c */
        public void mo16499c(long j) {
            C9197r.m16178h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // p193k6.C9126t.InterfaceC9127a
        /* renamed from: d */
        public void mo16498d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C9073c0.this.m16743U() + ", " + C9073c0.this.m16742V();
            if (!C9073c0.f23799a0) {
                C9197r.m16178h("DefaultAudioSink", str);
                return;
            }
            throw new C9078e(str, null);
        }

        @Override // p193k6.C9126t.InterfaceC9127a
        /* renamed from: e */
        public void mo16497e(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C9073c0.this.m16743U() + ", " + C9073c0.this.m16742V();
            if (!C9073c0.f23799a0) {
                C9197r.m16178h("DefaultAudioSink", str);
                return;
            }
            throw new C9078e(str, null);
        }

        /* synthetic */ C9081h(C9073c0 c9073c0, C9074a c9074a) {
            this();
        }
    }

    /* renamed from: k6.c0$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C9082i {

        /* renamed from: a */
        private final Handler f23874a = new Handler();

        /* renamed from: b */
        private final AudioTrack.StreamEventCallback f23875b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k6.c0$i$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C9083a extends AudioTrack.StreamEventCallback {

            /* renamed from: a */
            final /* synthetic */ C9073c0 f23877a;

            C9083a(C9073c0 c9073c0) {
                C9082i.this = r1;
                this.f23877a = c9073c0;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                boolean z;
                if (audioTrack == C9073c0.this.f23844s) {
                    z = true;
                } else {
                    z = false;
                }
                C9149a.m16447f(z);
                if (C9073c0.this.f23841p != null && C9073c0.this.f23818S) {
                    C9073c0.this.f23841p.mo16536g();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                boolean z;
                if (audioTrack == C9073c0.this.f23844s) {
                    z = true;
                } else {
                    z = false;
                }
                C9149a.m16447f(z);
                if (C9073c0.this.f23841p != null && C9073c0.this.f23818S) {
                    C9073c0.this.f23841p.mo16536g();
                }
            }
        }

        public C9082i() {
            C9073c0.this = r2;
            this.f23875b = new C9083a(r2);
        }

        /* renamed from: a */
        public void m16692a(AudioTrack audioTrack) {
            final Handler handler = this.f23874a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: k6.g0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f23875b);
        }

        /* renamed from: b */
        public void m16691b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f23875b);
            this.f23874a.removeCallbacksAndMessages(null);
        }
    }

    public C9073c0(C9086e c9086e, InterfaceC9075b interfaceC9075b, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        this.f23826a = c9086e;
        this.f23827b = (InterfaceC9075b) C9149a.m16448e(interfaceC9075b);
        int i = C9191p0.f24171a;
        if (i >= 21 && z) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f23828c = z4;
        if (i >= 23 && z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f23836k = z5;
        if (i >= 29 && z3) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f23837l = z6;
        this.f23833h = new ConditionVariable(true);
        this.f23834i = new C9126t(new C9081h(this, null));
        C9130w c9130w = new C9130w();
        this.f23829d = c9130w;
        C9117q0 c9117q0 = new C9117q0();
        this.f23830e = c9117q0;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C9108m0(), c9130w, c9117q0);
        Collections.addAll(arrayList, interfaceC9075b.mo16698b());
        this.f23831f = (InterfaceC9090g[]) arrayList.toArray(new InterfaceC9090g[0]);
        this.f23832g = new InterfaceC9090g[]{new C9097i0()};
        this.f23807H = 1.0f;
        this.f23845t = com.google.android.exoplayer2.audio.AudioAttributes.f11425f;
        this.f23820U = 0;
        this.f23821V = new C9128u(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.f11301d;
        this.f23847v = new C9079f(playbackParameters, false, 0L, 0L, null);
        this.f23848w = playbackParameters;
        this.f23815P = -1;
        this.f23808I = new InterfaceC9090g[0];
        this.f23809J = new ByteBuffer[0];
        this.f23835j = new ArrayDeque<>();
        this.f23839n = new C9080g<>(100L);
        this.f23840o = new C9080g<>(100L);
    }

    /* renamed from: F */
    private void m16758F(long j) {
        PlaybackParameters playbackParameters;
        boolean z;
        if (m16721o0()) {
            playbackParameters = this.f23827b.mo16697c(m16751M());
        } else {
            playbackParameters = PlaybackParameters.f11301d;
        }
        PlaybackParameters playbackParameters2 = playbackParameters;
        if (m16721o0()) {
            z = this.f23827b.mo16695e(m16744T());
        } else {
            z = false;
        }
        this.f23835j.add(new C9079f(playbackParameters2, z, Math.max(0L, j), this.f23843r.m16706i(m16742V()), null));
        m16722n0();
        InterfaceC9118r.InterfaceC9121c interfaceC9121c = this.f23841p;
        if (interfaceC9121c != null) {
            interfaceC9121c.mo16542a(z);
        }
    }

    /* renamed from: G */
    private long m16757G(long j) {
        while (!this.f23835j.isEmpty() && j >= this.f23835j.getFirst().f23869d) {
            this.f23847v = this.f23835j.remove();
        }
        C9079f c9079f = this.f23847v;
        long j2 = j - c9079f.f23869d;
        if (c9079f.f23866a.equals(PlaybackParameters.f11301d)) {
            return this.f23847v.f23868c + j2;
        }
        if (this.f23835j.isEmpty()) {
            return this.f23847v.f23868c + this.f23827b.mo16699a(j2);
        }
        C9079f first = this.f23835j.getFirst();
        return first.f23868c - C9191p0.m16269W(first.f23869d - j, this.f23847v.f23866a.f11302a);
    }

    /* renamed from: H */
    private long m16756H(long j) {
        return j + this.f23843r.m16706i(this.f23827b.mo16696d());
    }

    /* renamed from: I */
    private AudioTrack m16755I() {
        try {
            return ((C9076c) C9149a.m16448e(this.f23843r)).m16714a(this.f23822W, this.f23845t, this.f23820U);
        } catch (InterfaceC9118r.C9120b e) {
            m16733d0();
            InterfaceC9118r.InterfaceC9121c interfaceC9121c = this.f23841p;
            if (interfaceC9121c != null) {
                interfaceC9121c.mo16540c(e);
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0029 -> B:28:0x0009). Please submit an issue!!! */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m16754J() {
        /*
            r9 = this;
            int r0 = r9.f23815P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f23815P = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f23815P
            k6.g[] r5 = r9.f23808I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo16492f()
        L1f:
            r9.m16730f0(r7)
            boolean r0 = r4.mo16494c()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.f23815P
            int r0 = r0 + r1
            r9.f23815P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f23812M
            if (r0 == 0) goto L3b
            r9.m16719q0(r0, r7)
            java.nio.ByteBuffer r0 = r9.f23812M
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f23815P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k6.C9073c0.m16754J():boolean");
    }

    /* renamed from: K */
    private void m16753K() {
        int i = 0;
        while (true) {
            InterfaceC9090g[] interfaceC9090gArr = this.f23808I;
            if (i < interfaceC9090gArr.length) {
                InterfaceC9090g interfaceC9090g = interfaceC9090gArr[i];
                interfaceC9090g.flush();
                this.f23809J[i] = interfaceC9090g.mo16495b();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: L */
    public static AudioFormat m16752L(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* renamed from: M */
    private PlaybackParameters m16751M() {
        return m16745S().f23866a;
    }

    /* renamed from: N */
    private static int m16750N(int i) {
        int i2 = C9191p0.f24171a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(C9191p0.f24172b) && i == 1) {
            i = 2;
        }
        return C9191p0.m16301G(i);
    }

    /* renamed from: O */
    private static Pair<Integer, Integer> m16749O(Format format, C9086e c9086e) {
        boolean z;
        if (c9086e == null) {
            return null;
        }
        int m16164f = C9200u.m16164f((String) C9149a.m16448e(format.f11197u), format.f11194r);
        int i = 6;
        if (m16164f != 5 && m16164f != 6 && m16164f != 18 && m16164f != 17 && m16164f != 7 && m16164f != 8 && m16164f != 14) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (m16164f == 18 && !c9086e.m16684e(18)) {
            m16164f = 6;
        } else if (m16164f == 8 && !c9086e.m16684e(8)) {
            m16164f = 7;
        }
        if (!c9086e.m16684e(m16164f)) {
            return null;
        }
        if (m16164f == 18) {
            if (C9191p0.f24171a >= 29 && (i = m16747Q(18, format.f11179I)) == 0) {
                C9197r.m16178h("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            i = format.f11178H;
            if (i > c9086e.m16685d()) {
                return null;
            }
        }
        int m16750N = m16750N(i);
        if (m16750N == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(m16164f), Integer.valueOf(m16750N));
    }

    /* renamed from: P */
    private static int m16748P(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C9066b.m16776d(byteBuffer);
            case 7:
            case 8:
                return C9095h0.m16675e(byteBuffer);
            case 9:
                int m16647m = C9103k0.m16647m(C9191p0.m16299H(byteBuffer, byteBuffer.position()));
                if (m16647m != -1) {
                    return m16647m;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
            case 14:
                int m16779a = C9066b.m16779a(byteBuffer);
                if (m16779a == -1) {
                    return 0;
                }
                return C9066b.m16772h(byteBuffer, m16779a) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C9070c.m16767c(byteBuffer);
        }
    }

    /* renamed from: Q */
    private static int m16747Q(int i, int i2) {
        boolean isDirectPlaybackSupported;
        android.media.AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i3 = 8; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(C9191p0.m16301G(i3)).build(), build);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: R */
    public static int m16746R(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    /* renamed from: S */
    private C9079f m16745S() {
        C9079f c9079f = this.f23846u;
        if (c9079f == null) {
            if (!this.f23835j.isEmpty()) {
                return this.f23835j.getLast();
            }
            return this.f23847v;
        }
        return c9079f;
    }

    /* renamed from: U */
    public long m16743U() {
        C9076c c9076c = this.f23843r;
        if (c9076c.f23856c == 0) {
            return this.f23851z / c9076c.f23855b;
        }
        return this.f23800A;
    }

    /* renamed from: V */
    public long m16742V() {
        C9076c c9076c = this.f23843r;
        if (c9076c.f23856c == 0) {
            return this.f23801B / c9076c.f23857d;
        }
        return this.f23802C;
    }

    /* renamed from: W */
    private void m16741W() {
        boolean z;
        this.f23833h.block();
        AudioTrack m16755I = m16755I();
        this.f23844s = m16755I;
        if (m16737a0(m16755I)) {
            m16729g0(this.f23844s);
            AudioTrack audioTrack = this.f23844s;
            Format format = this.f23843r.f23854a;
            audioTrack.setOffloadDelayPadding(format.f11181K, format.f11182L);
        }
        this.f23820U = this.f23844s.getAudioSessionId();
        C9126t c9126t = this.f23834i;
        AudioTrack audioTrack2 = this.f23844s;
        C9076c c9076c = this.f23843r;
        if (c9076c.f23856c == 2) {
            z = true;
        } else {
            z = false;
        }
        c9126t.m16504t(audioTrack2, z, c9076c.f23860g, c9076c.f23857d, c9076c.f23861h);
        m16725k0();
        int i = this.f23821V.f24052a;
        if (i != 0) {
            this.f23844s.attachAuxEffect(i);
            this.f23844s.setAuxEffectSendLevel(this.f23821V.f24053b);
        }
        this.f23805F = true;
    }

    /* renamed from: X */
    private static boolean m16740X(int i) {
        return (C9191p0.f24171a >= 24 && i == -6) || i == -32;
    }

    /* renamed from: Y */
    private boolean m16739Y() {
        return this.f23844s != null;
    }

    /* renamed from: Z */
    private static boolean m16738Z() {
        return C9191p0.f24171a >= 30 && C9191p0.f24174d.startsWith("Pixel");
    }

    /* renamed from: a0 */
    private static boolean m16737a0(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (C9191p0.f24171a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    private static boolean m16736b0(Format format, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        int m16164f;
        int m16301G;
        boolean isOffloadedPlaybackSupported;
        boolean z;
        if (C9191p0.f24171a < 29 || (m16164f = C9200u.m16164f((String) C9149a.m16448e(format.f11197u), format.f11194r)) == 0 || (m16301G = C9191p0.m16301G(format.f11178H)) == 0) {
            return false;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(m16752L(format.f11179I, m16301G, m16164f), audioAttributes.m29568a());
        if (!isOffloadedPlaybackSupported) {
            return false;
        }
        if (format.f11181K == 0 && format.f11182L == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !m16738Z()) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    private static boolean m16735c0(Format format, C9086e c9086e) {
        return m16749O(format, c9086e) != null;
    }

    /* renamed from: d0 */
    private void m16733d0() {
        if (!this.f23843r.m16700o()) {
            return;
        }
        this.f23824Y = true;
    }

    /* renamed from: e0 */
    private void m16731e0() {
        if (!this.f23817R) {
            this.f23817R = true;
            this.f23834i.m16516h(m16742V());
            this.f23844s.stop();
            this.f23850y = 0;
        }
    }

    /* renamed from: f0 */
    private void m16730f0(long j) {
        ByteBuffer byteBuffer;
        int length = this.f23808I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f23809J[i - 1];
            } else {
                byteBuffer = this.f23810K;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC9090g.f23883a;
                }
            }
            if (i == length) {
                m16719q0(byteBuffer, j);
            } else {
                InterfaceC9090g interfaceC9090g = this.f23808I[i];
                if (i > this.f23815P) {
                    interfaceC9090g.mo16488e(byteBuffer);
                }
                ByteBuffer mo16495b = interfaceC9090g.mo16495b();
                this.f23809J[i] = mo16495b;
                if (mo16495b.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* renamed from: g0 */
    private void m16729g0(AudioTrack audioTrack) {
        if (this.f23838m == null) {
            this.f23838m = new C9082i();
        }
        this.f23838m.m16692a(audioTrack);
    }

    /* renamed from: h0 */
    private void m16728h0() {
        this.f23851z = 0L;
        this.f23800A = 0L;
        this.f23801B = 0L;
        this.f23802C = 0L;
        this.f23825Z = false;
        this.f23803D = 0;
        this.f23847v = new C9079f(m16751M(), m16744T(), 0L, 0L, null);
        this.f23806G = 0L;
        this.f23846u = null;
        this.f23835j.clear();
        this.f23810K = null;
        this.f23811L = 0;
        this.f23812M = null;
        this.f23817R = false;
        this.f23816Q = false;
        this.f23815P = -1;
        this.f23849x = null;
        this.f23850y = 0;
        this.f23830e.m16566n();
        m16753K();
    }

    /* renamed from: i0 */
    private void m16727i0(PlaybackParameters playbackParameters, boolean z) {
        C9079f m16745S = m16745S();
        if (!playbackParameters.equals(m16745S.f23866a) || z != m16745S.f23867b) {
            C9079f c9079f = new C9079f(playbackParameters, z, -9223372036854775807L, -9223372036854775807L, null);
            if (m16739Y()) {
                this.f23846u = c9079f;
            } else {
                this.f23847v = c9079f;
            }
        }
    }

    /* renamed from: j0 */
    private void m16726j0(PlaybackParameters playbackParameters) {
        if (m16739Y()) {
            try {
                this.f23844s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.f11302a).setPitch(playbackParameters.f11303b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C9197r.m16177i("DefaultAudioSink", "Failed to set playback params", e);
            }
            playbackParameters = new PlaybackParameters(this.f23844s.getPlaybackParams().getSpeed(), this.f23844s.getPlaybackParams().getPitch());
            this.f23834i.m16503u(playbackParameters.f11302a);
        }
        this.f23848w = playbackParameters;
    }

    /* renamed from: k0 */
    private void m16725k0() {
        if (m16739Y()) {
            if (C9191p0.f24171a >= 21) {
                m16724l0(this.f23844s, this.f23807H);
            } else {
                m16723m0(this.f23844s, this.f23807H);
            }
        }
    }

    /* renamed from: l0 */
    private static void m16724l0(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: m0 */
    private static void m16723m0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: n0 */
    private void m16722n0() {
        InterfaceC9090g[] interfaceC9090gArr = this.f23843r.f23862i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC9090g interfaceC9090g : interfaceC9090gArr) {
            if (interfaceC9090g.mo16496a()) {
                arrayList.add(interfaceC9090g);
            } else {
                interfaceC9090g.flush();
            }
        }
        int size = arrayList.size();
        this.f23808I = (InterfaceC9090g[]) arrayList.toArray(new InterfaceC9090g[size]);
        this.f23809J = new ByteBuffer[size];
        m16753K();
    }

    /* renamed from: o0 */
    private boolean m16721o0() {
        if (!this.f23822W && "audio/raw".equals(this.f23843r.f23854a.f11197u) && !m16720p0(this.f23843r.f23854a.f11180J)) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    private boolean m16720p0(int i) {
        return this.f23828c && C9191p0.m16232o0(i);
    }

    /* renamed from: q0 */
    private void m16719q0(ByteBuffer byteBuffer, long j) {
        int m16718r0;
        boolean z;
        boolean z2;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.f23812M;
        boolean z3 = true;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9149a.m16452a(z2);
        } else {
            this.f23812M = byteBuffer;
            if (C9191p0.f24171a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.f23813N;
                if (bArr == null || bArr.length < remaining) {
                    this.f23813N = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f23813N, 0, remaining);
                byteBuffer.position(position);
                this.f23814O = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (C9191p0.f24171a < 21) {
            int m16521c = this.f23834i.m16521c(this.f23801B);
            if (m16521c > 0) {
                m16718r0 = this.f23844s.write(this.f23813N, this.f23814O, Math.min(remaining2, m16521c));
                if (m16718r0 > 0) {
                    this.f23814O += m16718r0;
                    byteBuffer.position(byteBuffer.position() + m16718r0);
                }
            } else {
                m16718r0 = 0;
            }
        } else if (this.f23822W) {
            if (j != -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z);
            m16718r0 = m16717s0(this.f23844s, byteBuffer, remaining2, j);
        } else {
            m16718r0 = m16718r0(this.f23844s, byteBuffer, remaining2);
        }
        this.f23823X = SystemClock.elapsedRealtime();
        if (m16718r0 < 0) {
            boolean m16740X = m16740X(m16718r0);
            if (m16740X) {
                m16733d0();
            }
            InterfaceC9118r.C9122d c9122d = new InterfaceC9118r.C9122d(m16718r0, this.f23843r.f23854a, m16740X);
            InterfaceC9118r.InterfaceC9121c interfaceC9121c = this.f23841p;
            if (interfaceC9121c != null) {
                interfaceC9121c.mo16540c(c9122d);
            }
            if (!c9122d.f24007k) {
                this.f23840o.m16693b(c9122d);
                return;
            }
            throw c9122d;
        }
        this.f23840o.m16694a();
        if (m16737a0(this.f23844s)) {
            long j2 = this.f23802C;
            if (j2 > 0) {
                this.f23825Z = false;
            }
            if (this.f23818S && this.f23841p != null && m16718r0 < remaining2 && !this.f23825Z) {
                this.f23841p.mo16539d(this.f23834i.m16519e(j2));
            }
        }
        int i = this.f23843r.f23856c;
        if (i == 0) {
            this.f23801B += m16718r0;
        }
        if (m16718r0 == remaining2) {
            if (i != 0) {
                if (byteBuffer != this.f23810K) {
                    z3 = false;
                }
                C9149a.m16447f(z3);
                this.f23802C += this.f23803D * this.f23811L;
            }
            this.f23812M = null;
        }
    }

    /* renamed from: r0 */
    private static int m16718r0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: s0 */
    private int m16717s0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (C9191p0.f24171a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f23849x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f23849x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f23849x.putInt(1431633921);
        }
        if (this.f23850y == 0) {
            this.f23849x.putInt(4, i);
            this.f23849x.putLong(8, j * 1000);
            this.f23849x.position(0);
            this.f23850y = i;
        }
        int remaining = this.f23849x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f23849x, remaining, 1);
            if (write < 0) {
                this.f23850y = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int m16718r0 = m16718r0(audioTrack, byteBuffer, i);
        if (m16718r0 < 0) {
            this.f23850y = 0;
            return m16718r0;
        }
        this.f23850y -= m16718r0;
        return m16718r0;
    }

    /* renamed from: T */
    public boolean m16744T() {
        return m16745S().f23867b;
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: a */
    public boolean mo16564a(Format format) {
        return mo16553n(format) != 0;
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: b */
    public PlaybackParameters mo16563b() {
        if (this.f23836k) {
            return this.f23848w;
        }
        return m16751M();
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: c */
    public boolean mo16562c() {
        return !m16739Y() || (this.f23816Q && !mo16560g());
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: f */
    public void mo16561f(PlaybackParameters playbackParameters) {
        PlaybackParameters playbackParameters2 = new PlaybackParameters(C9191p0.m16229q(playbackParameters.f11302a, 0.1f, 8.0f), C9191p0.m16229q(playbackParameters.f11303b, 0.1f, 8.0f));
        if (this.f23836k && C9191p0.f24171a >= 23) {
            m16726j0(playbackParameters2);
        } else {
            m16727i0(playbackParameters2, m16744T());
        }
    }

    @Override // p193k6.InterfaceC9118r
    public void flush() {
        if (m16739Y()) {
            m16728h0();
            if (this.f23834i.m16514j()) {
                this.f23844s.pause();
            }
            if (m16737a0(this.f23844s)) {
                ((C9082i) C9149a.m16448e(this.f23838m)).m16691b(this.f23844s);
            }
            AudioTrack audioTrack = this.f23844s;
            this.f23844s = null;
            if (C9191p0.f24171a < 21 && !this.f23819T) {
                this.f23820U = 0;
            }
            C9076c c9076c = this.f23842q;
            if (c9076c != null) {
                this.f23843r = c9076c;
                this.f23842q = null;
            }
            this.f23834i.m16506r();
            this.f23833h.close();
            new C9074a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f23840o.m16694a();
        this.f23839n.m16694a();
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: g */
    public boolean mo16560g() {
        if (m16739Y() && this.f23834i.m16515i(m16742V())) {
            return true;
        }
        return false;
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: h */
    public void mo16559h(C9128u c9128u) {
        if (this.f23821V.equals(c9128u)) {
            return;
        }
        int i = c9128u.f24052a;
        float f = c9128u.f24053b;
        AudioTrack audioTrack = this.f23844s;
        if (audioTrack != null) {
            if (this.f23821V.f24052a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f23844s.setAuxEffectSendLevel(f);
            }
        }
        this.f23821V = c9128u;
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: i */
    public void mo16558i(int i) {
        boolean z;
        if (this.f23820U != i) {
            this.f23820U = i;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f23819T = z;
            flush();
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: j */
    public void mo16557j() {
        this.f23818S = false;
        if (m16739Y() && this.f23834i.m16507q()) {
            this.f23844s.pause();
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: k */
    public void mo16556k() {
        if (this.f23822W) {
            this.f23822W = false;
            flush();
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: l */
    public void mo16555l(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        if (this.f23845t.equals(audioAttributes)) {
            return;
        }
        this.f23845t = audioAttributes;
        if (this.f23822W) {
            return;
        }
        flush();
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: m */
    public boolean mo16554m(ByteBuffer byteBuffer, long j, int i) {
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer2 = this.f23810K;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            z = false;
        } else {
            z = true;
        }
        C9149a.m16452a(z);
        if (this.f23842q != null) {
            if (!m16754J()) {
                return false;
            }
            if (!this.f23842q.m16713b(this.f23843r)) {
                m16731e0();
                if (mo16560g()) {
                    return false;
                }
                flush();
            } else {
                this.f23843r = this.f23842q;
                this.f23842q = null;
                if (m16737a0(this.f23844s)) {
                    this.f23844s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f23844s;
                    Format format = this.f23843r.f23854a;
                    audioTrack.setOffloadDelayPadding(format.f11181K, format.f11182L);
                    this.f23825Z = true;
                }
            }
            m16758F(j);
        }
        if (!m16739Y()) {
            try {
                m16741W();
            } catch (InterfaceC9118r.C9120b e) {
                if (!e.f24004k) {
                    this.f23839n.m16693b(e);
                    return false;
                }
                throw e;
            }
        }
        this.f23839n.m16694a();
        if (this.f23805F) {
            this.f23806G = Math.max(0L, j);
            this.f23804E = false;
            this.f23805F = false;
            if (this.f23836k && C9191p0.f24171a >= 23) {
                m16726j0(this.f23848w);
            }
            m16758F(j);
            if (this.f23818S) {
                mo16545v();
            }
        }
        if (!this.f23834i.m16512l(m16742V())) {
            return false;
        }
        if (this.f23810K == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9149a.m16452a(z2);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C9076c c9076c = this.f23843r;
            if (c9076c.f23856c != 0 && this.f23803D == 0) {
                int m16748P = m16748P(c9076c.f23860g, byteBuffer);
                this.f23803D = m16748P;
                if (m16748P == 0) {
                    return true;
                }
            }
            if (this.f23846u != null) {
                if (!m16754J()) {
                    return false;
                }
                m16758F(j);
                this.f23846u = null;
            }
            long m16701n = this.f23806G + this.f23843r.m16701n(m16743U() - this.f23830e.m16567m());
            if (!this.f23804E && Math.abs(m16701n - j) > 200000) {
                C9197r.m16183c("DefaultAudioSink", "Discontinuity detected [expected " + m16701n + ", got " + j + "]");
                this.f23804E = true;
            }
            if (this.f23804E) {
                if (!m16754J()) {
                    return false;
                }
                long j2 = j - m16701n;
                this.f23806G += j2;
                this.f23804E = false;
                m16758F(j);
                InterfaceC9118r.InterfaceC9121c interfaceC9121c = this.f23841p;
                if (interfaceC9121c != null && j2 != 0) {
                    interfaceC9121c.mo16537f();
                }
            }
            if (this.f23843r.f23856c == 0) {
                this.f23851z += byteBuffer.remaining();
            } else {
                this.f23800A += this.f23803D * i;
            }
            this.f23810K = byteBuffer;
            this.f23811L = i;
        }
        m16730f0(j);
        if (!this.f23810K.hasRemaining()) {
            this.f23810K = null;
            this.f23811L = 0;
            return true;
        } else if (!this.f23834i.m16513k(m16742V())) {
            return false;
        } else {
            C9197r.m16178h("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: n */
    public int mo16553n(Format format) {
        if ("audio/raw".equals(format.f11197u)) {
            if (!C9191p0.m16230p0(format.f11180J)) {
                C9197r.m16178h("DefaultAudioSink", "Invalid PCM encoding: " + format.f11180J);
                return 0;
            }
            int i = format.f11180J;
            if (i == 2 || (this.f23828c && i == 4)) {
                return 2;
            }
            return 1;
        } else if ((!this.f23837l || this.f23824Y || !m16736b0(format, this.f23845t)) && !m16735c0(format, this.f23826a)) {
            return 0;
        } else {
            return 2;
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: o */
    public void mo16552o() {
        boolean z;
        if (C9191p0.f24171a < 25) {
            flush();
            return;
        }
        this.f23840o.m16694a();
        this.f23839n.m16694a();
        if (!m16739Y()) {
            return;
        }
        m16728h0();
        if (this.f23834i.m16514j()) {
            this.f23844s.pause();
        }
        this.f23844s.flush();
        this.f23834i.m16506r();
        C9126t c9126t = this.f23834i;
        AudioTrack audioTrack = this.f23844s;
        C9076c c9076c = this.f23843r;
        if (c9076c.f23856c == 2) {
            z = true;
        } else {
            z = false;
        }
        c9126t.m16504t(audioTrack, z, c9076c.f23860g, c9076c.f23857d, c9076c.f23861h);
        this.f23805F = true;
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: p */
    public void mo16551p() {
        if (!this.f23816Q && m16739Y() && m16754J()) {
            m16731e0();
            this.f23816Q = true;
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: q */
    public long mo16550q(boolean z) {
        if (m16739Y() && !this.f23805F) {
            return m16756H(m16757G(Math.min(this.f23834i.m16520d(z), this.f23843r.m16706i(m16742V()))));
        }
        return Long.MIN_VALUE;
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: r */
    public void mo16549r(InterfaceC9118r.InterfaceC9121c interfaceC9121c) {
        this.f23841p = interfaceC9121c;
    }

    @Override // p193k6.InterfaceC9118r
    public void reset() {
        flush();
        for (InterfaceC9090g interfaceC9090g : this.f23831f) {
            interfaceC9090g.reset();
        }
        for (InterfaceC9090g interfaceC9090g2 : this.f23832g) {
            interfaceC9090g2.reset();
        }
        this.f23818S = false;
        this.f23824Y = false;
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: s */
    public void mo16548s() {
        this.f23804E = true;
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: t */
    public void mo16547t(float f) {
        if (this.f23807H != f) {
            this.f23807H = f;
            m16725k0();
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: u */
    public void mo16546u() {
        boolean z;
        if (C9191p0.f24171a >= 21) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        C9149a.m16447f(this.f23819T);
        if (!this.f23822W) {
            this.f23822W = true;
            flush();
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: v */
    public void mo16545v() {
        this.f23818S = true;
        if (m16739Y()) {
            this.f23834i.m16502v();
            this.f23844s.play();
        }
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: w */
    public void mo16544w(Format format, int i, int[] iArr) {
        int i2;
        InterfaceC9090g[] interfaceC9090gArr;
        int intValue;
        int i3;
        int i4;
        int intValue2;
        int i5;
        InterfaceC9090g[] interfaceC9090gArr2;
        int[] iArr2;
        if ("audio/raw".equals(format.f11197u)) {
            C9149a.m16452a(C9191p0.m16230p0(format.f11180J));
            int m16256c0 = C9191p0.m16256c0(format.f11180J, format.f11178H);
            if (m16720p0(format.f11180J)) {
                interfaceC9090gArr2 = this.f23832g;
            } else {
                interfaceC9090gArr2 = this.f23831f;
            }
            this.f23830e.m16565o(format.f11181K, format.f11182L);
            if (C9191p0.f24171a < 21 && format.f11178H == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i6 = 0; i6 < 6; i6++) {
                    iArr2[i6] = i6;
                }
            } else {
                iArr2 = iArr;
            }
            this.f23829d.m16484m(iArr2);
            InterfaceC9090g.C9091a c9091a = new InterfaceC9090g.C9091a(format.f11179I, format.f11178H, format.f11180J);
            for (InterfaceC9090g interfaceC9090g : interfaceC9090gArr2) {
                try {
                    InterfaceC9090g.C9091a mo16493d = interfaceC9090g.mo16493d(c9091a);
                    if (interfaceC9090g.mo16496a()) {
                        c9091a = mo16493d;
                    }
                } catch (InterfaceC9090g.C9092b e) {
                    throw new InterfaceC9118r.C9119a(e, format);
                }
            }
            int i7 = c9091a.f23887c;
            i3 = c9091a.f23885a;
            intValue2 = C9191p0.m16301G(c9091a.f23886b);
            interfaceC9090gArr = interfaceC9090gArr2;
            intValue = i7;
            i4 = m16256c0;
            i2 = C9191p0.m16256c0(i7, c9091a.f23886b);
            i5 = 0;
        } else {
            InterfaceC9090g[] interfaceC9090gArr3 = new InterfaceC9090g[0];
            int i8 = format.f11179I;
            i2 = -1;
            if (this.f23837l && m16736b0(format, this.f23845t)) {
                interfaceC9090gArr = interfaceC9090gArr3;
                intValue = C9200u.m16164f((String) C9149a.m16448e(format.f11197u), format.f11194r);
                i5 = 1;
                intValue2 = C9191p0.m16301G(format.f11178H);
                i3 = i8;
                i4 = -1;
            } else {
                Pair<Integer, Integer> m16749O = m16749O(format, this.f23826a);
                if (m16749O != null) {
                    interfaceC9090gArr = interfaceC9090gArr3;
                    intValue = ((Integer) m16749O.first).intValue();
                    i3 = i8;
                    i4 = -1;
                    intValue2 = ((Integer) m16749O.second).intValue();
                    i5 = 2;
                } else {
                    throw new InterfaceC9118r.C9119a("Unable to configure passthrough for: " + format, format);
                }
            }
        }
        if (intValue != 0) {
            if (intValue2 != 0) {
                this.f23824Y = false;
                C9076c c9076c = new C9076c(format, i4, i5, i2, i3, intValue2, intValue, i, this.f23836k, interfaceC9090gArr);
                if (m16739Y()) {
                    this.f23842q = c9076c;
                    return;
                } else {
                    this.f23843r = c9076c;
                    return;
                }
            }
            throw new InterfaceC9118r.C9119a("Invalid output channel config (mode=" + i5 + ") for: " + format, format);
        }
        throw new InterfaceC9118r.C9119a("Invalid output encoding (mode=" + i5 + ") for: " + format, format);
    }

    @Override // p193k6.InterfaceC9118r
    /* renamed from: x */
    public void mo16543x(boolean z) {
        m16727i0(m16751M(), z);
    }
}