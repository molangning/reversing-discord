package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5122w0 {

    /* renamed from: d */
    private static WeakReference<C5122w0> f14408d;

    /* renamed from: a */
    private final SharedPreferences f14409a;

    /* renamed from: b */
    private C5112s0 f14410b;

    /* renamed from: c */
    private final Executor f14411c;

    private C5122w0(SharedPreferences sharedPreferences, Executor executor) {
        this.f14411c = executor;
        this.f14409a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C5122w0 m26159a(Context context, Executor executor) {
        C5122w0 c5122w0;
        synchronized (C5122w0.class) {
            WeakReference<C5122w0> weakReference = f14408d;
            if (weakReference != null) {
                c5122w0 = weakReference.get();
            } else {
                c5122w0 = null;
            }
            if (c5122w0 == null) {
                c5122w0 = new C5122w0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c5122w0.m26157c();
                f14408d = new WeakReference<>(c5122w0);
            }
        }
        return c5122w0;
    }

    /* renamed from: c */
    private synchronized void m26157c() {
        this.f14410b = C5112s0.m26186c(this.f14409a, "topic_operation_queue", ",", this.f14411c);
    }

    /* renamed from: b */
    public synchronized C5120v0 m26158b() {
        return C5120v0.m26164a(this.f14410b.m26184e());
    }

    /* renamed from: d */
    public synchronized boolean m26156d(C5120v0 c5120v0) {
        return this.f14410b.m26183f(c5120v0.m26160e());
    }
}