package gi;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gi.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C6793d implements InterfaceC6817k {

    /* renamed from: b */
    private final Lock f19000b;

    public C6793d(Lock lock) {
        C9612q.m13917h(lock, "lock");
        this.f19000b = lock;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Lock m21910a() {
        return this.f19000b;
    }

    @Override // gi.InterfaceC6817k
    public void lock() {
        this.f19000b.lock();
    }

    @Override // gi.InterfaceC6817k
    public void unlock() {
        this.f19000b.unlock();
    }

    public /* synthetic */ C6793d(Lock lock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }
}
