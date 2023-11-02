package p040c7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Objects;
import p040c7.C2412c;
import p040c7.InterfaceC2424k;
import p102fb.InterfaceC6386l;
import p228m6.C10264b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2412c implements InterfaceC2424k {

    /* renamed from: a */
    private final MediaCodec f6582a;

    /* renamed from: b */
    private final C2421h f6583b;

    /* renamed from: c */
    private final C2417f f6584c;

    /* renamed from: d */
    private final boolean f6585d;

    /* renamed from: e */
    private boolean f6586e;

    /* renamed from: f */
    private int f6587f;

    /* renamed from: c7.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2414b implements InterfaceC2424k.InterfaceC2425a {

        /* renamed from: b */
        private final InterfaceC6386l<HandlerThread> f6588b;

        /* renamed from: c */
        private final InterfaceC6386l<HandlerThread> f6589c;

        /* renamed from: d */
        private final boolean f6590d;

        /* renamed from: e */
        private final boolean f6591e;

        public C2414b(final int i, boolean z, boolean z2) {
            this(new InterfaceC6386l() { // from class: c7.d
                @Override // p102fb.InterfaceC6386l
                public final Object get() {
                    HandlerThread m33489e;
                    m33489e = C2412c.C2414b.m33489e(i);
                    return m33489e;
                }
            }, new InterfaceC6386l() { // from class: c7.e
                @Override // p102fb.InterfaceC6386l
                public final Object get() {
                    HandlerThread m33488f;
                    m33488f = C2412c.C2414b.m33488f(i);
                    return m33488f;
                }
            }, z, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ HandlerThread m33489e(int i) {
            return new HandlerThread(C2412c.m33497k(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ HandlerThread m33488f(int i) {
            return new HandlerThread(C2412c.m33496l(i));
        }

        @Override // p040c7.InterfaceC2424k.InterfaceC2425a
        /* renamed from: d */
        public C2412c mo33432a(MediaCodec mediaCodec) {
            return new C2412c(mediaCodec, this.f6588b.get(), this.f6589c.get(), this.f6590d, this.f6591e);
        }

        C2414b(InterfaceC6386l<HandlerThread> interfaceC6386l, InterfaceC6386l<HandlerThread> interfaceC6386l2, boolean z, boolean z2) {
            this.f6588b = interfaceC6386l;
            this.f6589c = interfaceC6386l2;
            this.f6590d = z;
            this.f6591e = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static String m33497k(int i) {
        return m33495m(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static String m33496l(int i) {
        return m33495m(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: m */
    private static String m33495m(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m33494n(InterfaceC2424k.InterfaceC2426b interfaceC2426b, MediaCodec mediaCodec, long j, long j2) {
        interfaceC2426b.mo12344a(this, j, j2);
    }

    /* renamed from: o */
    private void m33493o() {
        if (this.f6585d) {
            try {
                this.f6584c.m33468t();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: a */
    public void mo33439a(int i, int i2, C10264b c10264b, long j, int i3) {
        this.f6584c.m33473o(i, i2, c10264b, j, i3);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: b */
    public void mo33438b(int i) {
        m33493o();
        this.f6582a.setVideoScalingMode(i);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: c */
    public void mo33437c(Surface surface) {
        m33493o();
        this.f6582a.setOutputSurface(surface);
    }

    @Override // p040c7.InterfaceC2424k
    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f6583b.m33459h(this.f6582a);
        this.f6582a.configure(mediaFormat, surface, mediaCrypto, i);
        this.f6587f = 1;
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: d */
    public void mo33436d(int i, long j) {
        this.f6582a.releaseOutputBuffer(i, j);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: e */
    public int mo33435e() {
        return this.f6583b.m33464c();
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: f */
    public int mo33434f(MediaCodec.BufferInfo bufferInfo) {
        return this.f6583b.m33463d(bufferInfo);
    }

    @Override // p040c7.InterfaceC2424k
    public void flush() {
        this.f6584c.m33479i();
        this.f6582a.flush();
        C2421h c2421h = this.f6583b;
        final MediaCodec mediaCodec = this.f6582a;
        Objects.requireNonNull(mediaCodec);
        c2421h.m33462e(new Runnable() { // from class: c7.b
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: g */
    public void mo33433g(final InterfaceC2424k.InterfaceC2426b interfaceC2426b, Handler handler) {
        m33493o();
        this.f6582a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: c7.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C2412c.this.m33494n(interfaceC2426b, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p040c7.InterfaceC2424k
    public ByteBuffer getInputBuffer(int i) {
        return this.f6582a.getInputBuffer(i);
    }

    @Override // p040c7.InterfaceC2424k
    public ByteBuffer getOutputBuffer(int i) {
        return this.f6582a.getOutputBuffer(i);
    }

    @Override // p040c7.InterfaceC2424k
    public MediaFormat getOutputFormat() {
        return this.f6583b.m33460g();
    }

    @Override // p040c7.InterfaceC2424k
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f6584c.m33474n(i, i2, i3, j, i4);
    }

    @Override // p040c7.InterfaceC2424k
    public void release() {
        try {
            if (this.f6587f == 2) {
                this.f6584c.m33470r();
            }
            int i = this.f6587f;
            if (i == 1 || i == 2) {
                this.f6583b.m33450q();
            }
            this.f6587f = 3;
        } finally {
            if (!this.f6586e) {
                this.f6582a.release();
                this.f6586e = true;
            }
        }
    }

    @Override // p040c7.InterfaceC2424k
    public void releaseOutputBuffer(int i, boolean z) {
        this.f6582a.releaseOutputBuffer(i, z);
    }

    @Override // p040c7.InterfaceC2424k
    public void setParameters(Bundle bundle) {
        m33493o();
        this.f6582a.setParameters(bundle);
    }

    @Override // p040c7.InterfaceC2424k
    public void start() {
        this.f6584c.m33469s();
        this.f6582a.start();
        this.f6587f = 2;
    }

    private C2412c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f6582a = mediaCodec;
        this.f6583b = new C2421h(handlerThread);
        this.f6584c = new C2417f(mediaCodec, handlerThread2, z);
        this.f6585d = z2;
        this.f6587f = 0;
    }
}
