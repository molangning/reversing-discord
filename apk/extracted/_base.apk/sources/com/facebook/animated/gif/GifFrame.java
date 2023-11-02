package com.facebook.animated.gif;

import android.graphics.Bitmap;
import p191k4.InterfaceC9058d;
import p394w2.InterfaceC13370d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GifFrame implements InterfaceC9058d {
    @InterfaceC13370d
    private long mNativeContext;

    @InterfaceC13370d
    GifFrame(long j) {
        this.mNativeContext = j;
    }

    @InterfaceC13370d
    private native void nativeDispose();

    @InterfaceC13370d
    private native void nativeFinalize();

    @InterfaceC13370d
    private native int nativeGetDisposalMode();

    @InterfaceC13370d
    private native int nativeGetDurationMs();

    @InterfaceC13370d
    private native int nativeGetHeight();

    @InterfaceC13370d
    private native int nativeGetTransparentPixelColor();

    @InterfaceC13370d
    private native int nativeGetWidth();

    @InterfaceC13370d
    private native int nativeGetXOffset();

    @InterfaceC13370d
    private native int nativeGetYOffset();

    @InterfaceC13370d
    private native boolean nativeHasTransparency();

    @InterfaceC13370d
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    @Override // p191k4.InterfaceC9058d
    /* renamed from: a */
    public void mo16806a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    @Override // p191k4.InterfaceC9058d
    /* renamed from: b */
    public int mo16805b() {
        return nativeGetXOffset();
    }

    @Override // p191k4.InterfaceC9058d
    /* renamed from: c */
    public int mo16804c() {
        return nativeGetYOffset();
    }

    /* renamed from: d */
    public int m31773d() {
        return nativeGetDisposalMode();
    }

    @Override // p191k4.InterfaceC9058d
    public void dispose() {
        nativeDispose();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // p191k4.InterfaceC9058d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p191k4.InterfaceC9058d
    public int getWidth() {
        return nativeGetWidth();
    }
}
