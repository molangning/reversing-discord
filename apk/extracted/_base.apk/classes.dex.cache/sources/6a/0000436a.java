package md;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import org.webrtc.MediaStreamTrack;
import p248nd.C10578e;
import p387vd.C13249c;

/* renamed from: md.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10440e implements InterfaceC10437b {

    /* renamed from: a */
    private MediaCodec f27267a;

    /* renamed from: c */
    private boolean f27269c;

    /* renamed from: b */
    private boolean f27268b = true;

    /* renamed from: d */
    private final MediaCodec.BufferInfo f27270d = new MediaCodec.BufferInfo();

    /* renamed from: i */
    private void m11547i() {
        if (!this.f27269c) {
            this.f27267a.start();
            this.f27269c = true;
        }
    }

    @Override // md.InterfaceC10437b
    /* renamed from: a */
    public C10438c mo11555a(int i) {
        if (i < 0) {
            return null;
        }
        return new C10438c(i, this.f27267a.getInputBuffer(i), null);
    }

    @Override // md.InterfaceC10437b
    /* renamed from: b */
    public int mo11554b(long j) {
        return this.f27267a.dequeueOutputBuffer(this.f27270d, j);
    }

    @Override // md.InterfaceC10437b
    /* renamed from: c */
    public void mo11553c(MediaFormat mediaFormat) {
        boolean z;
        if (mediaFormat.containsKey("mime") && mediaFormat.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            if (!mediaFormat.containsKey("color-format")) {
                mediaFormat.setInteger("color-format", 2130708361);
            }
            if (!mediaFormat.containsKey("frame-rate")) {
                mediaFormat.setInteger("frame-rate", 30);
            }
        }
        MediaCodec m2935e = C13249c.m2935e(mediaFormat, null, true, C10578e.EnumC10579a.ENCODER_NOT_FOUND, C10578e.EnumC10579a.ENCODER_FORMAT_NOT_FOUND, C10578e.EnumC10579a.ENCODER_CONFIGURATION_ERROR);
        this.f27267a = m2935e;
        if (m2935e == null) {
            z = true;
        } else {
            z = false;
        }
        this.f27268b = z;
    }

    @Override // md.InterfaceC10437b
    public Surface createInputSurface() {
        return this.f27267a.createInputSurface();
    }

    @Override // md.InterfaceC10437b
    /* renamed from: d */
    public int mo11552d(long j) {
        return this.f27267a.dequeueInputBuffer(j);
    }

    @Override // md.InterfaceC10437b
    /* renamed from: e */
    public C10438c mo11551e(int i) {
        if (i >= 0) {
            return new C10438c(i, this.f27267a.getOutputBuffer(i), this.f27270d);
        }
        return null;
    }

    @Override // md.InterfaceC10437b
    /* renamed from: f */
    public void mo11550f(C10438c c10438c) {
        MediaCodec mediaCodec = this.f27267a;
        int i = c10438c.f27260a;
        MediaCodec.BufferInfo bufferInfo = c10438c.f27262c;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    @Override // md.InterfaceC10437b
    /* renamed from: g */
    public void mo11549g() {
        this.f27267a.signalEndOfInputStream();
    }

    @Override // md.InterfaceC10437b
    public String getName() {
        try {
            return this.f27267a.getName();
        } catch (IllegalStateException e) {
            throw new C10578e(C10578e.EnumC10579a.CODEC_IN_RELEASED_STATE, e);
        }
    }

    @Override // md.InterfaceC10437b
    public MediaFormat getOutputFormat() {
        return this.f27267a.getOutputFormat();
    }

    @Override // md.InterfaceC10437b
    /* renamed from: h */
    public void mo11548h(int i) {
        this.f27267a.releaseOutputBuffer(i, false);
    }

    @Override // md.InterfaceC10437b
    public boolean isRunning() {
        return this.f27269c;
    }

    @Override // md.InterfaceC10437b
    public void release() {
        if (!this.f27268b) {
            this.f27267a.release();
            this.f27268b = true;
        }
    }

    @Override // md.InterfaceC10437b
    public void start() {
        try {
            m11547i();
        } catch (Exception e) {
            throw new C10578e(C10578e.EnumC10579a.INTERNAL_CODEC_ERROR, e);
        }
    }

    @Override // md.InterfaceC10437b
    public void stop() {
        if (this.f27269c) {
            this.f27267a.stop();
            this.f27269c = false;
        }
    }
}