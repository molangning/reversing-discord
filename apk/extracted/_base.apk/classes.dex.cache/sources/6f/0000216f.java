package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import java.nio.ByteBuffer;
import p129h5.C7018a;
import p191k4.C9054b;
import p191k4.InterfaceC9057c;
import p209l4.InterfaceC10040c;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GifImage implements InterfaceC9057c, InterfaceC10040c {

    /* renamed from: b */
    private static volatile boolean f9667b;

    /* renamed from: a */
    private Bitmap.Config f9668a = null;
    @InterfaceC13370d
    private long mNativeContext;

    @InterfaceC13370d
    public GifImage() {
    }

    /* renamed from: k */
    public static GifImage m31772k(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        m31770m();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, imageDecodeOptions.f10286b, imageDecodeOptions.f10290f);
        nativeCreateFromDirectByteBuffer.f9668a = imageDecodeOptions.f10292h;
        return nativeCreateFromDirectByteBuffer;
    }

    /* renamed from: l */
    public static GifImage m31771l(long j, int i, ImageDecodeOptions imageDecodeOptions) {
        boolean z;
        m31770m();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, imageDecodeOptions.f10286b, imageDecodeOptions.f10290f);
        nativeCreateFromNativeMemory.f9668a = imageDecodeOptions.f10292h;
        return nativeCreateFromNativeMemory;
    }

    /* renamed from: m */
    private static synchronized void m31770m() {
        synchronized (GifImage.class) {
            if (!f9667b) {
                f9667b = true;
                C7018a.m21531d("gifimage");
            }
        }
    }

    /* renamed from: n */
    private static C9054b.EnumC9056b m31769n(int i) {
        if (i == 0) {
            return C9054b.EnumC9056b.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return C9054b.EnumC9056b.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return C9054b.EnumC9056b.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return C9054b.EnumC9056b.DISPOSE_TO_PREVIOUS;
        }
        return C9054b.EnumC9056b.DISPOSE_DO_NOT;
    }

    @InterfaceC13370d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @InterfaceC13370d
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @InterfaceC13370d
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @InterfaceC13370d
    private native void nativeDispose();

    @InterfaceC13370d
    private native void nativeFinalize();

    @InterfaceC13370d
    private native int nativeGetDuration();

    @InterfaceC13370d
    private native GifFrame nativeGetFrame(int i);

    @InterfaceC13370d
    private native int nativeGetFrameCount();

    @InterfaceC13370d
    private native int[] nativeGetFrameDurations();

    @InterfaceC13370d
    private native int nativeGetHeight();

    @InterfaceC13370d
    private native int nativeGetLoopCount();

    @InterfaceC13370d
    private native int nativeGetSizeInBytes();

    @InterfaceC13370d
    private native int nativeGetWidth();

    @InterfaceC13370d
    private native boolean nativeIsAnimated();

    @Override // p191k4.InterfaceC9057c
    /* renamed from: a */
    public int mo16814a() {
        return nativeGetFrameCount();
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: b */
    public int mo16813b() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount != -1) {
            if (nativeGetLoopCount != 0) {
                return nativeGetLoopCount + 1;
            }
            return 0;
        }
        return 1;
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: c */
    public C9054b mo16812c(int i) {
        GifFrame mo16808i = mo16808i(i);
        try {
            return new C9054b(i, mo16808i.mo16805b(), mo16808i.mo16804c(), mo16808i.getWidth(), mo16808i.getHeight(), C9054b.EnumC9055a.BLEND_WITH_PREVIOUS, m31769n(mo16808i.m31773d()));
        } finally {
            mo16808i.dispose();
        }
    }

    @Override // p209l4.InterfaceC10040c
    /* renamed from: d */
    public InterfaceC9057c mo12497d(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        return m31772k(byteBuffer, imageDecodeOptions);
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: e */
    public boolean mo16811e() {
        return false;
    }

    @Override // p209l4.InterfaceC10040c
    /* renamed from: f */
    public InterfaceC9057c mo12496f(long j, int i, ImageDecodeOptions imageDecodeOptions) {
        return m31771l(j, i, imageDecodeOptions);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: g */
    public int mo16810g() {
        return nativeGetSizeInBytes();
    }

    @Override // p191k4.InterfaceC9057c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p191k4.InterfaceC9057c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: h */
    public Bitmap.Config mo16809h() {
        return this.f9668a;
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: j */
    public int[] mo16807j() {
        return nativeGetFrameDurations();
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: o */
    public GifFrame mo16808i(int i) {
        return nativeGetFrame(i);
    }

    @InterfaceC13370d
    GifImage(long j) {
        this.mNativeContext = j;
    }
}