package gi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

/* renamed from: gi.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6792c extends C6793d {

    /* renamed from: c */
    private final Runnable f18998c;

    /* renamed from: d */
    private final Function1<InterruptedException, Unit> f18999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6792c(Lock lock, Runnable checkCancelled, Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        super(lock);
        C9612q.m13917h(lock, "lock");
        C9612q.m13917h(checkCancelled, "checkCancelled");
        C9612q.m13917h(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f18998c = checkCancelled;
        this.f18999d = interruptedExceptionHandler;
    }

    @Override // gi.C6793d, gi.InterfaceC6817k
    public void lock() {
        while (!m21910a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f18998c.run();
            } catch (InterruptedException e) {
                this.f18999d.invoke(e);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6792c(Runnable checkCancelled, Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        C9612q.m13917h(checkCancelled, "checkCancelled");
        C9612q.m13917h(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
