package com.google.android.gms.tasks;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TaskCompletionSource<TResult> {

    /* renamed from: a */
    private final C4734w<TResult> f12928a = new C4734w<>();

    /* renamed from: a */
    public Task<TResult> m28013a() {
        return this.f12928a;
    }

    /* renamed from: b */
    public void m28012b(Exception exc) {
        this.f12928a.m27967q(exc);
    }

    /* renamed from: c */
    public void m28011c(TResult tresult) {
        this.f12928a.m27966r(tresult);
    }

    /* renamed from: d */
    public boolean m28010d(Exception exc) {
        return this.f12928a.m27964t(exc);
    }

    /* renamed from: e */
    public boolean m28009e(TResult tresult) {
        return this.f12928a.m27963u(tresult);
    }
}
