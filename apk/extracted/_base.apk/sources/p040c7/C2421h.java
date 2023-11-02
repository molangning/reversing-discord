package p040c7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p195k8.C9149a;
import p195k8.C9186n;
import p195k8.C9191p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c7.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2421h extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f6613b;

    /* renamed from: c */
    private Handler f6614c;

    /* renamed from: h */
    private MediaFormat f6619h;

    /* renamed from: i */
    private MediaFormat f6620i;

    /* renamed from: j */
    private MediaCodec.CodecException f6621j;

    /* renamed from: k */
    private long f6622k;

    /* renamed from: l */
    private boolean f6623l;

    /* renamed from: m */
    private IllegalStateException f6624m;

    /* renamed from: a */
    private final Object f6612a = new Object();

    /* renamed from: d */
    private final C9186n f6615d = new C9186n();

    /* renamed from: e */
    private final C9186n f6616e = new C9186n();

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f6617f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f6618g = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2421h(HandlerThread handlerThread) {
        this.f6613b = handlerThread;
    }

    /* renamed from: b */
    private void m33465b(MediaFormat mediaFormat) {
        this.f6616e.m16322a(-2);
        this.f6618g.add(mediaFormat);
    }

    /* renamed from: f */
    private void m33461f() {
        if (!this.f6618g.isEmpty()) {
            this.f6620i = this.f6618g.getLast();
        }
        this.f6615d.m16321b();
        this.f6616e.m16321b();
        this.f6617f.clear();
        this.f6618g.clear();
        this.f6621j = null;
    }

    /* renamed from: i */
    private boolean m33458i() {
        return this.f6622k > 0 || this.f6623l;
    }

    /* renamed from: k */
    private void m33456k() {
        m33455l();
        m33454m();
    }

    /* renamed from: l */
    private void m33455l() {
        IllegalStateException illegalStateException = this.f6624m;
        if (illegalStateException == null) {
            return;
        }
        this.f6624m = null;
        throw illegalStateException;
    }

    /* renamed from: m */
    private void m33454m() {
        MediaCodec.CodecException codecException = this.f6621j;
        if (codecException == null) {
            return;
        }
        this.f6621j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m33457j(Runnable runnable) {
        synchronized (this.f6612a) {
            m33452o(runnable);
        }
    }

    /* renamed from: o */
    private void m33452o(Runnable runnable) {
        if (this.f6623l) {
            return;
        }
        long j = this.f6622k - 1;
        this.f6622k = j;
        if (j > 0) {
            return;
        }
        if (j < 0) {
            m33451p(new IllegalStateException());
            return;
        }
        m33461f();
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            m33451p(e);
        } catch (Exception e2) {
            m33451p(new IllegalStateException(e2));
        }
    }

    /* renamed from: p */
    private void m33451p(IllegalStateException illegalStateException) {
        synchronized (this.f6612a) {
            this.f6624m = illegalStateException;
        }
    }

    /* renamed from: c */
    public int m33464c() {
        synchronized (this.f6612a) {
            int i = -1;
            if (m33458i()) {
                return -1;
            }
            m33456k();
            if (!this.f6615d.m16319d()) {
                i = this.f6615d.m16318e();
            }
            return i;
        }
    }

    /* renamed from: d */
    public int m33463d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6612a) {
            if (m33458i()) {
                return -1;
            }
            m33456k();
            if (this.f6616e.m16319d()) {
                return -1;
            }
            int m16318e = this.f6616e.m16318e();
            if (m16318e >= 0) {
                C9149a.m16445h(this.f6619h);
                MediaCodec.BufferInfo remove = this.f6617f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (m16318e == -2) {
                this.f6619h = this.f6618g.remove();
            }
            return m16318e;
        }
    }

    /* renamed from: e */
    public void m33462e(final Runnable runnable) {
        synchronized (this.f6612a) {
            this.f6622k++;
            ((Handler) C9191p0.m16243j(this.f6614c)).post(new Runnable() { // from class: c7.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2421h.this.m33457j(runnable);
                }
            });
        }
    }

    /* renamed from: g */
    public MediaFormat m33460g() {
        MediaFormat mediaFormat;
        synchronized (this.f6612a) {
            mediaFormat = this.f6619h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void m33459h(MediaCodec mediaCodec) {
        boolean z;
        if (this.f6614c == null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f6613b.start();
        Handler handler = new Handler(this.f6613b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f6614c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6612a) {
            this.f6621j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f6612a) {
            this.f6615d.m16322a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6612a) {
            MediaFormat mediaFormat = this.f6620i;
            if (mediaFormat != null) {
                m33465b(mediaFormat);
                this.f6620i = null;
            }
            this.f6616e.m16322a(i);
            this.f6617f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6612a) {
            m33465b(mediaFormat);
            this.f6620i = null;
        }
    }

    /* renamed from: q */
    public void m33450q() {
        synchronized (this.f6612a) {
            this.f6623l = true;
            this.f6613b.quit();
            m33461f();
        }
    }
}
