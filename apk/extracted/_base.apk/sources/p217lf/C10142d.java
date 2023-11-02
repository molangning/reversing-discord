package p217lf;

import gf.InterfaceC6742c;
import java.util.concurrent.atomic.AtomicInteger;
import lk.InterfaceC10220b;

/* renamed from: lf.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10142d<T> extends AtomicInteger implements InterfaceC6742c<T> {

    /* renamed from: j */
    final T f26445j;

    /* renamed from: k */
    final InterfaceC10220b<? super T> f26446k;

    public C10142d(InterfaceC10220b<? super T> interfaceC10220b, T t) {
        this.f26446k = interfaceC10220b;
        this.f26445j = t;
    }

    @Override // gf.InterfaceC6741b
    /* renamed from: c */
    public int mo12184c(int i) {
        return i & 1;
    }

    @Override // lk.InterfaceC10221c
    public void cancel() {
        lazySet(2);
    }

    @Override // gf.InterfaceC6745f
    public void clear() {
        lazySet(1);
    }

    @Override // lk.InterfaceC10221c
    /* renamed from: g */
    public void mo12120g(long j) {
        if (EnumC10143e.m12178f(j) && compareAndSet(0, 1)) {
            InterfaceC10220b<? super T> interfaceC10220b = this.f26446k;
            interfaceC10220b.mo12121f((T) this.f26445j);
            if (get() != 2) {
                interfaceC10220b.mo12122d();
            }
        }
    }

    @Override // gf.InterfaceC6745f
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // gf.InterfaceC6745f
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // gf.InterfaceC6745f
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.f26445j;
        }
        return null;
    }
}
