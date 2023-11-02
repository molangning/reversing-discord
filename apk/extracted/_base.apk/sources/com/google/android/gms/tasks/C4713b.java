package com.google.android.gms.tasks;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p029b9.C2198p;

/* renamed from: com.google.android.gms.tasks.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4713b {
    /* renamed from: a */
    public static <TResult> TResult m28008a(Task<TResult> task) {
        C2198p.m33987h();
        C2198p.m33984k(task, "Task must not be null");
        if (task.mo27970n()) {
            return (TResult) m28003f(task);
        }
        C4714c c4714c = new C4714c(null);
        m28002g(task, c4714c);
        c4714c.m28001a();
        return (TResult) m28003f(task);
    }

    /* renamed from: b */
    public static <TResult> TResult m28007b(Task<TResult> task, long j, TimeUnit timeUnit) {
        C2198p.m33987h();
        C2198p.m33984k(task, "Task must not be null");
        C2198p.m33984k(timeUnit, "TimeUnit must not be null");
        if (task.mo27970n()) {
            return (TResult) m28003f(task);
        }
        C4714c c4714c = new C4714c(null);
        m28002g(task, c4714c);
        if (c4714c.m28000d(j, timeUnit)) {
            return (TResult) m28003f(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> Task<TResult> m28006c(Executor executor, Callable<TResult> callable) {
        C2198p.m33984k(executor, "Executor must not be null");
        C2198p.m33984k(callable, "Callback must not be null");
        C4734w c4734w = new C4734w();
        executor.execute(new RunnableC4735x(c4734w, callable));
        return c4734w;
    }

    /* renamed from: d */
    public static <TResult> Task<TResult> m28005d(Exception exc) {
        C4734w c4734w = new C4734w();
        c4734w.m27967q(exc);
        return c4734w;
    }

    /* renamed from: e */
    public static <TResult> Task<TResult> m28004e(TResult tresult) {
        C4734w c4734w = new C4734w();
        c4734w.m27966r(tresult);
        return c4734w;
    }

    /* renamed from: f */
    private static <TResult> TResult m28003f(Task<TResult> task) {
        if (task.mo27969o()) {
            return task.mo27973k();
        }
        if (task.mo27971m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo27974j());
    }

    /* renamed from: g */
    private static <T> void m28002g(Task<T> task, InterfaceC4715d<? super T> interfaceC4715d) {
        Executor executor = C4712a.f12930b;
        task.mo27977g(executor, interfaceC4715d);
        task.mo27979e(executor, interfaceC4715d);
        task.mo27983a(executor, interfaceC4715d);
    }
}
