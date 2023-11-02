package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.InterfaceC7043a;
import p134ha.InterfaceC7045c;
import p134ha.InterfaceC7046d;
import p134ha.InterfaceC7047e;
import p134ha.InterfaceC7048f;
import p134ha.InterfaceC7050h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class Task<TResult> {
    /* renamed from: a */
    public Task<TResult> mo27983a(Executor executor, InterfaceC7045c interfaceC7045c) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public Task<TResult> mo27982b(InterfaceC7046d<TResult> interfaceC7046d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public Task<TResult> mo27981c(Executor executor, InterfaceC7046d<TResult> interfaceC7046d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract Task<TResult> mo27980d(InterfaceC7047e interfaceC7047e);

    /* renamed from: e */
    public abstract Task<TResult> mo27979e(Executor executor, InterfaceC7047e interfaceC7047e);

    /* renamed from: f */
    public abstract Task<TResult> mo27978f(InterfaceC7048f<? super TResult> interfaceC7048f);

    /* renamed from: g */
    public abstract Task<TResult> mo27977g(Executor executor, InterfaceC7048f<? super TResult> interfaceC7048f);

    /* renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo27976h(Executor executor, InterfaceC7043a<TResult, TContinuationResult> interfaceC7043a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: i */
    public <TContinuationResult> Task<TContinuationResult> mo27975i(Executor executor, InterfaceC7043a<TResult, Task<TContinuationResult>> interfaceC7043a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: j */
    public abstract Exception mo27974j();

    /* renamed from: k */
    public abstract TResult mo27973k();

    /* renamed from: l */
    public abstract <X extends Throwable> TResult mo27972l(Class<X> cls);

    /* renamed from: m */
    public abstract boolean mo27971m();

    /* renamed from: n */
    public abstract boolean mo27970n();

    /* renamed from: o */
    public abstract boolean mo27969o();

    /* renamed from: p */
    public <TContinuationResult> Task<TContinuationResult> mo27968p(Executor executor, InterfaceC7050h<TResult, TContinuationResult> interfaceC7050h) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}