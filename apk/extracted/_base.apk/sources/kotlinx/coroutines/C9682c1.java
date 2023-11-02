package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Lkotlinx/coroutines/c1;", "Lkotlinx/coroutines/d1;", "", "dispose", "", "toString", "Ljava/util/concurrent/Future;", "j", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C9682c1 implements InterfaceC9688d1 {

    /* renamed from: j */
    private final Future<?> f25423j;

    public C9682c1(Future<?> future) {
        this.f25423j = future;
    }

    @Override // kotlinx.coroutines.InterfaceC9688d1
    public void dispose() {
        this.f25423j.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f25423j + ']';
    }
}
