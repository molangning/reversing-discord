package p040c7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p040c7.InterfaceC2424k;
import p195k8.C9191p0;
import p228m6.C10264b;

/* renamed from: c7.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2408a0 implements InterfaceC2424k {

    /* renamed from: a */
    private final MediaCodec f6578a;

    /* renamed from: b */
    private ByteBuffer[] f6579b;

    /* renamed from: c */
    private ByteBuffer[] f6580c;

    /* renamed from: c7.a0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2410b implements InterfaceC2424k.InterfaceC2425a {
        @Override // p040c7.InterfaceC2424k.InterfaceC2425a
        /* renamed from: a */
        public InterfaceC2424k mo33432a(MediaCodec mediaCodec) {
            return new C2408a0(mediaCodec);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m33501i(InterfaceC2424k.InterfaceC2426b interfaceC2426b, MediaCodec mediaCodec, long j, long j2) {
        interfaceC2426b.mo12344a(this, j, j2);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: a */
    public void mo33439a(int i, int i2, C10264b c10264b, long j, int i3) {
        this.f6578a.queueSecureInputBuffer(i, i2, c10264b.m11985a(), j, i3);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: b */
    public void mo33438b(int i) {
        this.f6578a.setVideoScalingMode(i);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: c */
    public void mo33437c(Surface surface) {
        this.f6578a.setOutputSurface(surface);
    }

    @Override // p040c7.InterfaceC2424k
    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f6578a.configure(mediaFormat, surface, mediaCrypto, i);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: d */
    public void mo33436d(int i, long j) {
        this.f6578a.releaseOutputBuffer(i, j);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: e */
    public int mo33435e() {
        return this.f6578a.dequeueInputBuffer(0L);
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: f */
    public int mo33434f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f6578a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && C9191p0.f24171a < 21) {
                this.f6580c = this.f6578a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // p040c7.InterfaceC2424k
    public void flush() {
        this.f6578a.flush();
    }

    @Override // p040c7.InterfaceC2424k
    /* renamed from: g */
    public void mo33433g(final InterfaceC2424k.InterfaceC2426b interfaceC2426b, Handler handler) {
        this.f6578a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: c7.z
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C2408a0.this.m33501i(interfaceC2426b, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p040c7.InterfaceC2424k
    public ByteBuffer getInputBuffer(int i) {
        if (C9191p0.f24171a >= 21) {
            return this.f6578a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) C9191p0.m16243j(this.f6579b))[i];
    }

    @Override // p040c7.InterfaceC2424k
    public ByteBuffer getOutputBuffer(int i) {
        if (C9191p0.f24171a >= 21) {
            return this.f6578a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) C9191p0.m16243j(this.f6580c))[i];
    }

    @Override // p040c7.InterfaceC2424k
    public MediaFormat getOutputFormat() {
        return this.f6578a.getOutputFormat();
    }

    @Override // p040c7.InterfaceC2424k
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f6578a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p040c7.InterfaceC2424k
    public void release() {
        this.f6579b = null;
        this.f6580c = null;
        this.f6578a.release();
    }

    @Override // p040c7.InterfaceC2424k
    public void releaseOutputBuffer(int i, boolean z) {
        this.f6578a.releaseOutputBuffer(i, z);
    }

    @Override // p040c7.InterfaceC2424k
    public void setParameters(Bundle bundle) {
        this.f6578a.setParameters(bundle);
    }

    @Override // p040c7.InterfaceC2424k
    public void start() {
        this.f6578a.start();
        if (C9191p0.f24171a < 21) {
            this.f6579b = this.f6578a.getInputBuffers();
            this.f6580c = this.f6578a.getOutputBuffers();
        }
    }

    private C2408a0(MediaCodec mediaCodec) {
        this.f6578a = mediaCodec;
    }
}
