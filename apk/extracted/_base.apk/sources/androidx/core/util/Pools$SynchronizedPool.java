package androidx.core.util;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Pools$SynchronizedPool<T> extends Pools$SimplePool<T> {

    /* renamed from: c */
    private final Object f3504c;

    public Pools$SynchronizedPool(int i) {
        super(i);
        this.f3504c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.InterfaceC1137e
    public T acquire() {
        T t;
        synchronized (this.f3504c) {
            t = (T) super.acquire();
        }
        return t;
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.InterfaceC1137e
    public boolean release(T t) {
        boolean release;
        synchronized (this.f3504c) {
            release = super.release(t);
        }
        return release;
    }
}
