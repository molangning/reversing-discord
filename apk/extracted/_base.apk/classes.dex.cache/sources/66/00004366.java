package md;

import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: md.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10436a {
    /* renamed from: a */
    C10438c mo11563a(int i);

    /* renamed from: b */
    int mo11562b(long j);

    /* renamed from: d */
    int mo11560d(long j);

    /* renamed from: e */
    C10438c mo11559e(int i);

    /* renamed from: f */
    void mo11558f(C10438c c10438c);

    /* renamed from: g */
    void mo11557g(MediaFormat mediaFormat, Surface surface);

    String getName();

    MediaFormat getOutputFormat();

    /* renamed from: h */
    void mo11556h(int i, boolean z);

    boolean isRunning();

    void release();

    void start();

    void stop();
}