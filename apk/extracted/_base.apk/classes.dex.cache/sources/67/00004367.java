package md;

import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: md.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10437b {
    /* renamed from: a */
    C10438c mo11555a(int i);

    /* renamed from: b */
    int mo11554b(long j);

    /* renamed from: c */
    void mo11553c(MediaFormat mediaFormat);

    Surface createInputSurface();

    /* renamed from: d */
    int mo11552d(long j);

    /* renamed from: e */
    C10438c mo11551e(int i);

    /* renamed from: f */
    void mo11550f(C10438c c10438c);

    /* renamed from: g */
    void mo11549g();

    String getName();

    MediaFormat getOutputFormat();

    /* renamed from: h */
    void mo11548h(int i);

    boolean isRunning();

    void release();

    void start();

    void stop();
}