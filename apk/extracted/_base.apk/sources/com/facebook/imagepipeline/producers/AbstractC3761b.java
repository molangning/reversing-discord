package com.facebook.imagepipeline.producers;

import p414x2.C13677a;

/* renamed from: com.facebook.imagepipeline.producers.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3761b<T> implements Consumer<T> {

    /* renamed from: a */
    private boolean f10563a = false;

    /* renamed from: d */
    public static boolean m30889d(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: e */
    public static boolean m30888e(int i) {
        return !m30889d(i);
    }

    /* renamed from: k */
    public static int m30886k(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: l */
    public static boolean m30885l(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: m */
    public static boolean m30884m(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: n */
    public static int m30883n(int i, int i2) {
        return i & (~i2);
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    /* renamed from: a */
    public synchronized void mo30892a() {
        if (this.f10563a) {
            return;
        }
        this.f10563a = true;
        try {
            mo30625f();
        } catch (Exception e) {
            m30887j(e);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    /* renamed from: b */
    public synchronized void mo30891b(T t, int i) {
        if (this.f10563a) {
            return;
        }
        this.f10563a = m30889d(i);
        try {
            mo30605h(t, i);
        } catch (Exception e) {
            m30887j(e);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    /* renamed from: c */
    public synchronized void mo30890c(float f) {
        if (this.f10563a) {
            return;
        }
        try {
            mo30693i(f);
        } catch (Exception e) {
            m30887j(e);
        }
    }

    /* renamed from: f */
    protected abstract void mo30625f();

    /* renamed from: g */
    protected abstract void mo30606g(Throwable th2);

    /* renamed from: h */
    protected abstract void mo30605h(T t, int i);

    /* renamed from: i */
    protected abstract void mo30693i(float f);

    /* renamed from: j */
    protected void m30887j(Exception exc) {
        C13677a.m1866L(getClass(), "unhandled exception", exc);
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void onFailure(Throwable th2) {
        if (this.f10563a) {
            return;
        }
        this.f10563a = true;
        try {
            mo30606g(th2);
        } catch (Exception e) {
            m30887j(e);
        }
    }
}
