package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.nativecode.C3742h;
import java.nio.ByteBuffer;
import p191k4.C9054b;
import p191k4.InterfaceC9057c;
import p209l4.InterfaceC10040c;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class WebPImage implements InterfaceC9057c, InterfaceC10040c {

    /* renamed from: a */
    private Bitmap.Config f9669a = null;
    @InterfaceC13370d
    private long mNativeContext;

    @InterfaceC13370d
    public WebPImage() {
    }

    /* renamed from: k */
    public static WebPImage m31765k(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        C3742h.m30940a();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (imageDecodeOptions != null) {
            nativeCreateFromDirectByteBuffer.f9669a = imageDecodeOptions.f10292h;
        }
        return nativeCreateFromDirectByteBuffer;
    }

    /* renamed from: l */
    public static WebPImage m31764l(long j, int i, ImageDecodeOptions imageDecodeOptions) {
        boolean z;
        C3742h.m30940a();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        WebPImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        if (imageDecodeOptions != null) {
            nativeCreateFromNativeMemory.f9669a = imageDecodeOptions.f10292h;
        }
        return nativeCreateFromNativeMemory;
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // p191k4.InterfaceC9057c
    /* renamed from: a */
    public int mo16814a() {
        return nativeGetFrameCount();
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: b */
    public int mo16813b() {
        return nativeGetLoopCount();
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: c */
    public C9054b mo16812c(int i) {
        C9054b.EnumC9055a enumC9055a;
        C9054b.EnumC9056b enumC9056b;
        WebPFrame mo16808i = mo16808i(i);
        try {
            int mo16805b = mo16808i.mo16805b();
            int mo16804c = mo16808i.mo16804c();
            int width = mo16808i.getWidth();
            int height = mo16808i.getHeight();
            if (mo16808i.m31767d()) {
                enumC9055a = C9054b.EnumC9055a.BLEND_WITH_PREVIOUS;
            } else {
                enumC9055a = C9054b.EnumC9055a.NO_BLEND;
            }
            C9054b.EnumC9055a enumC9055a2 = enumC9055a;
            if (mo16808i.m31766e()) {
                enumC9056b = C9054b.EnumC9056b.DISPOSE_TO_BACKGROUND;
            } else {
                enumC9056b = C9054b.EnumC9056b.DISPOSE_DO_NOT;
            }
            return new C9054b(i, mo16805b, mo16804c, width, height, enumC9055a2, enumC9056b);
        } finally {
            mo16808i.dispose();
        }
    }

    @Override // p209l4.InterfaceC10040c
    /* renamed from: d */
    public InterfaceC9057c mo12497d(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        return m31765k(byteBuffer, imageDecodeOptions);
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: e */
    public boolean mo16811e() {
        return true;
    }

    @Override // p209l4.InterfaceC10040c
    /* renamed from: f */
    public InterfaceC9057c mo12496f(long j, int i, ImageDecodeOptions imageDecodeOptions) {
        return m31764l(j, i, imageDecodeOptions);
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
        return this.f9669a;
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: j */
    public int[] mo16807j() {
        return nativeGetFrameDurations();
    }

    @Override // p191k4.InterfaceC9057c
    /* renamed from: m */
    public WebPFrame mo16808i(int i) {
        return nativeGetFrame(i);
    }

    @InterfaceC13370d
    WebPImage(long j) {
        this.mNativeContext = j;
    }
}
