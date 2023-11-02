package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p029b9.C2198p;
import p134ha.C7044b;
import p134ha.C7049g;
import p134ha.InterfaceC7043a;
import p134ha.InterfaceC7045c;
import p134ha.InterfaceC7046d;
import p134ha.InterfaceC7047e;
import p134ha.InterfaceC7048f;
import p134ha.InterfaceC7050h;

/* renamed from: com.google.android.gms.tasks.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4734w<TResult> extends Task<TResult> {

    /* renamed from: a */
    private final Object f12970a = new Object();

    /* renamed from: b */
    private final C4731t<TResult> f12971b = new C4731t<>();

    /* renamed from: c */
    private boolean f12972c;

    /* renamed from: d */
    private volatile boolean f12973d;

    /* renamed from: e */
    private TResult f12974e;

    /* renamed from: f */
    private Exception f12975f;

    /* renamed from: v */
    private final void m27962v() {
        C2198p.m33982m(this.f12972c, "Task is not yet complete");
    }

    /* renamed from: w */
    private final void m27961w() {
        if (this.f12973d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: x */
    private final void m27960x() {
        if (this.f12972c) {
            throw C7044b.m21488a(this);
        }
    }

    /* renamed from: y */
    private final void m27959y() {
        synchronized (this.f12970a) {
            if (!this.f12972c) {
                return;
            }
            this.f12971b.m27984b(this);
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: a */
    public final Task<TResult> mo27983a(Executor executor, InterfaceC7045c interfaceC7045c) {
        this.f12971b.m27985a(new C4721j(executor, interfaceC7045c));
        m27959y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: b */
    public final Task<TResult> mo27982b(InterfaceC7046d<TResult> interfaceC7046d) {
        this.f12971b.m27985a(new C4723l(C4712a.f12929a, interfaceC7046d));
        m27959y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: c */
    public final Task<TResult> mo27981c(Executor executor, InterfaceC7046d<TResult> interfaceC7046d) {
        this.f12971b.m27985a(new C4723l(executor, interfaceC7046d));
        m27959y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: d */
    public final Task<TResult> mo27980d(InterfaceC7047e interfaceC7047e) {
        mo27979e(C4712a.f12929a, interfaceC7047e);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: e */
    public final Task<TResult> mo27979e(Executor executor, InterfaceC7047e interfaceC7047e) {
        this.f12971b.m27985a(new C4725n(executor, interfaceC7047e));
        m27959y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: f */
    public final Task<TResult> mo27978f(InterfaceC7048f<? super TResult> interfaceC7048f) {
        mo27977g(C4712a.f12929a, interfaceC7048f);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: g */
    public final Task<TResult> mo27977g(Executor executor, InterfaceC7048f<? super TResult> interfaceC7048f) {
        this.f12971b.m27985a(new C4727p(executor, interfaceC7048f));
        m27959y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: h */
    public final <TContinuationResult> Task<TContinuationResult> mo27976h(Executor executor, InterfaceC7043a<TResult, TContinuationResult> interfaceC7043a) {
        C4734w c4734w = new C4734w();
        this.f12971b.m27985a(new C4717f(executor, interfaceC7043a, c4734w));
        m27959y();
        return c4734w;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i */
    public final <TContinuationResult> Task<TContinuationResult> mo27975i(Executor executor, InterfaceC7043a<TResult, Task<TContinuationResult>> interfaceC7043a) {
        C4734w c4734w = new C4734w();
        this.f12971b.m27985a(new C4719h(executor, interfaceC7043a, c4734w));
        m27959y();
        return c4734w;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j */
    public final Exception mo27974j() {
        Exception exc;
        synchronized (this.f12970a) {
            exc = this.f12975f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k */
    public final TResult mo27973k() {
        TResult tresult;
        synchronized (this.f12970a) {
            m27962v();
            m27961w();
            Exception exc = this.f12975f;
            if (exc == null) {
                tresult = this.f12974e;
            } else {
                throw new C7049g(exc);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l */
    public final <X extends Throwable> TResult mo27972l(Class<X> cls) {
        TResult tresult;
        synchronized (this.f12970a) {
            m27962v();
            m27961w();
            if (!cls.isInstance(this.f12975f)) {
                Exception exc = this.f12975f;
                if (exc == null) {
                    tresult = this.f12974e;
                } else {
                    throw new C7049g(exc);
                }
            } else {
                throw cls.cast(this.f12975f);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m */
    public final boolean mo27971m() {
        return this.f12973d;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n */
    public final boolean mo27970n() {
        boolean z;
        synchronized (this.f12970a) {
            z = this.f12972c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o */
    public final boolean mo27969o() {
        boolean z;
        synchronized (this.f12970a) {
            z = false;
            if (this.f12972c && !this.f12973d && this.f12975f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p */
    public final <TContinuationResult> Task<TContinuationResult> mo27968p(Executor executor, InterfaceC7050h<TResult, TContinuationResult> interfaceC7050h) {
        C4734w c4734w = new C4734w();
        this.f12971b.m27985a(new C4729r(executor, interfaceC7050h, c4734w));
        m27959y();
        return c4734w;
    }

    /* renamed from: q */
    public final void m27967q(Exception exc) {
        C2198p.m33984k(exc, "Exception must not be null");
        synchronized (this.f12970a) {
            m27960x();
            this.f12972c = true;
            this.f12975f = exc;
        }
        this.f12971b.m27984b(this);
    }

    /* renamed from: r */
    public final void m27966r(TResult tresult) {
        synchronized (this.f12970a) {
            m27960x();
            this.f12972c = true;
            this.f12974e = tresult;
        }
        this.f12971b.m27984b(this);
    }

    /* renamed from: s */
    public final boolean m27965s() {
        synchronized (this.f12970a) {
            if (this.f12972c) {
                return false;
            }
            this.f12972c = true;
            this.f12973d = true;
            this.f12971b.m27984b(this);
            return true;
        }
    }

    /* renamed from: t */
    public final boolean m27964t(Exception exc) {
        C2198p.m33984k(exc, "Exception must not be null");
        synchronized (this.f12970a) {
            if (this.f12972c) {
                return false;
            }
            this.f12972c = true;
            this.f12975f = exc;
            this.f12971b.m27984b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean m27963u(TResult tresult) {
        synchronized (this.f12970a) {
            if (this.f12972c) {
                return false;
            }
            this.f12972c = true;
            this.f12974e = tresult;
            this.f12971b.m27984b(this);
            return true;
        }
    }
}