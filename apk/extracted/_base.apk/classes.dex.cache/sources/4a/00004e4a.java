package p359u2;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: u2.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractRunnableC12826g<T> implements Runnable {

    /* renamed from: j */
    protected final AtomicInteger f33328j = new AtomicInteger(0);

    /* renamed from: a */
    public void m3859a() {
        if (this.f33328j.compareAndSet(0, 2)) {
            mo3856d();
        }
    }

    /* renamed from: b */
    protected abstract void mo3858b(T t);

    /* renamed from: c */
    protected abstract T mo3857c();

    /* renamed from: d */
    protected abstract void mo3856d();

    /* renamed from: e */
    protected abstract void mo3855e(Exception exc);

    /* renamed from: f */
    protected abstract void mo3854f(T t);

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f33328j.compareAndSet(0, 1)) {
            return;
        }
        try {
            T mo3857c = mo3857c();
            this.f33328j.set(3);
            try {
                mo3854f(mo3857c);
            } finally {
                mo3858b(mo3857c);
            }
        } catch (Exception e) {
            this.f33328j.set(4);
            mo3855e(e);
        }
    }
}