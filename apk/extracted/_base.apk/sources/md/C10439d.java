package md;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import p248nd.C10578e;
import p387vd.C13249c;

/* renamed from: md.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10439d implements InterfaceC10436a {

    /* renamed from: a */
    private MediaCodec f27263a;

    /* renamed from: b */
    private boolean f27264b;

    /* renamed from: c */
    private boolean f27265c;

    /* renamed from: d */
    private final MediaCodec.BufferInfo f27266d = new MediaCodec.BufferInfo();

    /* renamed from: c */
    private void m11561c() {
        this.f27263a.start();
        this.f27264b = true;
    }

    @Override // md.InterfaceC10436a
    /* renamed from: a */
    public C10438c mo11563a(int i) {
        if (i < 0) {
            return null;
        }
        return new C10438c(i, this.f27263a.getInputBuffer(i), null);
    }

    @Override // md.InterfaceC10436a
    /* renamed from: b */
    public int mo11562b(long j) {
        return this.f27263a.dequeueOutputBuffer(this.f27266d, j);
    }

    @Override // md.InterfaceC10436a
    /* renamed from: d */
    public int mo11560d(long j) {
        return this.f27263a.dequeueInputBuffer(j);
    }

    @Override // md.InterfaceC10436a
    /* renamed from: e */
    public C10438c mo11559e(int i) {
        if (i >= 0) {
            return new C10438c(i, this.f27263a.getOutputBuffer(i), this.f27266d);
        }
        return null;
    }

    @Override // md.InterfaceC10436a
    /* renamed from: f */
    public void mo11558f(C10438c c10438c) {
        MediaCodec mediaCodec = this.f27263a;
        int i = c10438c.f27260a;
        MediaCodec.BufferInfo bufferInfo = c10438c.f27262c;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    @Override // md.InterfaceC10436a
    /* renamed from: g */
    public void mo11557g(MediaFormat mediaFormat, Surface surface) {
        boolean z;
        MediaCodec m2935e = C13249c.m2935e(mediaFormat, surface, false, C10578e.EnumC10579a.DECODER_NOT_FOUND, C10578e.EnumC10579a.DECODER_FORMAT_NOT_FOUND, C10578e.EnumC10579a.DECODER_CONFIGURATION_ERROR);
        this.f27263a = m2935e;
        if (m2935e == null) {
            z = true;
        } else {
            z = false;
        }
        this.f27265c = z;
    }

    @Override // md.InterfaceC10436a
    public String getName() {
        try {
            return this.f27263a.getName();
        } catch (IllegalStateException e) {
            throw new C10578e(C10578e.EnumC10579a.CODEC_IN_RELEASED_STATE, e);
        }
    }

    @Override // md.InterfaceC10436a
    public MediaFormat getOutputFormat() {
        return this.f27263a.getOutputFormat();
    }

    @Override // md.InterfaceC10436a
    /* renamed from: h */
    public void mo11556h(int i, boolean z) {
        this.f27263a.releaseOutputBuffer(i, z);
    }

    @Override // md.InterfaceC10436a
    public boolean isRunning() {
        return this.f27264b;
    }

    @Override // md.InterfaceC10436a
    public void release() {
        if (!this.f27265c) {
            this.f27263a.release();
            this.f27265c = true;
        }
    }

    @Override // md.InterfaceC10436a
    public void start() {
        if (this.f27263a != null) {
            if (!this.f27264b) {
                try {
                    m11561c();
                    return;
                } catch (Exception e) {
                    throw new C10578e(C10578e.EnumC10579a.INTERNAL_CODEC_ERROR, e);
                }
            }
            return;
        }
        throw new IllegalStateException("Codec is not initialized");
    }

    @Override // md.InterfaceC10436a
    public void stop() {
        if (this.f27264b) {
            this.f27263a.stop();
            this.f27264b = false;
        }
    }
}
