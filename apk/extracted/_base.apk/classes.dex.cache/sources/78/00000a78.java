package p040c7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p040c7.C2408a0;
import p228m6.C10264b;

/* renamed from: c7.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC2424k {

    /* renamed from: c7.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2425a {

        /* renamed from: a */
        public static final InterfaceC2425a f6631a = new C2408a0.C2410b();

        /* renamed from: a */
        InterfaceC2424k mo33432a(MediaCodec mediaCodec);
    }

    /* renamed from: c7.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2426b {
        /* renamed from: a */
        void mo12344a(InterfaceC2424k interfaceC2424k, long j, long j2);
    }

    /* renamed from: a */
    void mo33439a(int i, int i2, C10264b c10264b, long j, int i3);

    /* renamed from: b */
    void mo33438b(int i);

    /* renamed from: c */
    void mo33437c(Surface surface);

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    /* renamed from: d */
    void mo33436d(int i, long j);

    /* renamed from: e */
    int mo33435e();

    /* renamed from: f */
    int mo33434f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    /* renamed from: g */
    void mo33433g(InterfaceC2426b interfaceC2426b, Handler handler);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void setParameters(Bundle bundle);

    void start();
}