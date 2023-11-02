package p040c7;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p195k8.C9149a;
import p195k8.C9161f;
import p195k8.C9191p0;
import p228m6.C10264b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2417f {

    /* renamed from: h */
    private static final ArrayDeque<C2419b> f6594h = new ArrayDeque<>();

    /* renamed from: i */
    private static final Object f6595i = new Object();

    /* renamed from: a */
    private final MediaCodec f6596a;

    /* renamed from: b */
    private final HandlerThread f6597b;

    /* renamed from: c */
    private Handler f6598c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f6599d;

    /* renamed from: e */
    private final C9161f f6600e;

    /* renamed from: f */
    private final boolean f6601f;

    /* renamed from: g */
    private boolean f6602g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c7.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class HandlerC2418a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        HandlerC2418a(Looper looper) {
            super(looper);
            C2417f.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C2417f.this.m33482f(message);
        }
    }

    /* renamed from: c7.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2419b {

        /* renamed from: a */
        public int f6604a;

        /* renamed from: b */
        public int f6605b;

        /* renamed from: c */
        public int f6606c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f6607d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f6608e;

        /* renamed from: f */
        public int f6609f;

        C2419b() {
        }

        /* renamed from: a */
        public void m33467a(int i, int i2, int i3, long j, int i4) {
            this.f6604a = i;
            this.f6605b = i2;
            this.f6606c = i3;
            this.f6608e = j;
            this.f6609f = i4;
        }
    }

    public C2417f(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new C9161f());
    }

    /* renamed from: b */
    private void m33486b() {
        this.f6600e.m16418b();
        ((Handler) C9191p0.m16243j(this.f6598c)).obtainMessage(2).sendToTarget();
        this.f6600e.m16419a();
    }

    /* renamed from: c */
    private static void m33485c(C10264b c10264b, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c10264b.f26735f;
        cryptoInfo.numBytesOfClearData = m33483e(c10264b.f26733d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m33483e(c10264b.f26734e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C9149a.m16448e(m33484d(c10264b.f26731b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C9149a.m16448e(m33484d(c10264b.f26730a, cryptoInfo.iv));
        cryptoInfo.mode = c10264b.f26732c;
        if (C9191p0.f24171a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c10264b.f26736g, c10264b.f26737h));
        }
    }

    /* renamed from: d */
    private static byte[] m33484d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: e */
    private static int[] m33483e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: f */
    public void m33482f(Message message) {
        C2419b c2419b;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    m33471q(new IllegalStateException(String.valueOf(message.what)));
                } else {
                    this.f6600e.m16416d();
                }
                c2419b = null;
            } else {
                c2419b = (C2419b) message.obj;
                m33480h(c2419b.f6604a, c2419b.f6605b, c2419b.f6607d, c2419b.f6608e, c2419b.f6609f);
            }
        } else {
            c2419b = (C2419b) message.obj;
            m33481g(c2419b.f6604a, c2419b.f6605b, c2419b.f6606c, c2419b.f6608e, c2419b.f6609f);
        }
        if (c2419b != null) {
            m33472p(c2419b);
        }
    }

    /* renamed from: g */
    private void m33481g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f6596a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            m33471q(e);
        }
    }

    /* renamed from: h */
    private void m33480h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            if (this.f6601f) {
                synchronized (f6595i) {
                    this.f6596a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
                }
            } else {
                this.f6596a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            m33471q(e);
        }
    }

    /* renamed from: j */
    private void m33478j() {
        ((Handler) C9191p0.m16243j(this.f6598c)).removeCallbacksAndMessages(null);
        m33486b();
        m33476l();
    }

    /* renamed from: k */
    private static C2419b m33477k() {
        ArrayDeque<C2419b> arrayDeque = f6594h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C2419b();
            }
            return arrayDeque.removeFirst();
        }
    }

    /* renamed from: l */
    private void m33476l() {
        RuntimeException andSet = this.f6599d.getAndSet(null);
        if (andSet == null) {
            return;
        }
        throw andSet;
    }

    /* renamed from: m */
    private static boolean m33475m() {
        String m16272U0 = C9191p0.m16272U0(C9191p0.f24173c);
        if (!m16272U0.contains("samsung") && !m16272U0.contains("motorola")) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private static void m33472p(C2419b c2419b) {
        ArrayDeque<C2419b> arrayDeque = f6594h;
        synchronized (arrayDeque) {
            arrayDeque.add(c2419b);
        }
    }

    /* renamed from: i */
    public void m33479i() {
        if (this.f6602g) {
            try {
                m33478j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: n */
    public void m33474n(int i, int i2, int i3, long j, int i4) {
        m33476l();
        C2419b m33477k = m33477k();
        m33477k.m33467a(i, i2, i3, j, i4);
        ((Handler) C9191p0.m16243j(this.f6598c)).obtainMessage(0, m33477k).sendToTarget();
    }

    /* renamed from: o */
    public void m33473o(int i, int i2, C10264b c10264b, long j, int i3) {
        m33476l();
        C2419b m33477k = m33477k();
        m33477k.m33467a(i, i2, 0, j, i3);
        m33485c(c10264b, m33477k.f6607d);
        ((Handler) C9191p0.m16243j(this.f6598c)).obtainMessage(1, m33477k).sendToTarget();
    }

    /* renamed from: q */
    void m33471q(RuntimeException runtimeException) {
        this.f6599d.set(runtimeException);
    }

    /* renamed from: r */
    public void m33470r() {
        if (this.f6602g) {
            m33479i();
            this.f6597b.quit();
        }
        this.f6602g = false;
    }

    /* renamed from: s */
    public void m33469s() {
        if (!this.f6602g) {
            this.f6597b.start();
            this.f6598c = new HandlerC2418a(this.f6597b.getLooper());
            this.f6602g = true;
        }
    }

    /* renamed from: t */
    public void m33468t() {
        m33486b();
    }

    C2417f(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, C9161f c9161f) {
        this.f6596a = mediaCodec;
        this.f6597b = handlerThread;
        this.f6600e = c9161f;
        this.f6599d = new AtomicReference<>();
        this.f6601f = z || m33475m();
    }
}