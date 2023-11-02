package com.facebook.animated.webp;

import android.graphics.Bitmap;
import p191k4.InterfaceC9058d;
import p394w2.InterfaceC13370d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class WebPFrame implements InterfaceC9058d {
    @InterfaceC13370d
    private long mNativeContext;

    @InterfaceC13370d
    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

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
    public boolean m31767d() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // p191k4.InterfaceC9058d
    public void dispose() {
        nativeDispose();
    }

    /* renamed from: e */
    public boolean m31766e() {
        return nativeShouldDisposeToBackgroundColor();
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