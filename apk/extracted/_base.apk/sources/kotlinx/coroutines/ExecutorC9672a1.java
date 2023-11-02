package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import p371uf.C12967f;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/a1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "execute", "", "toString", "Lkotlinx/coroutines/CoroutineDispatcher;", "j", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ExecutorC9672a1 implements Executor {

    /* renamed from: j */
    public final CoroutineDispatcher f25412j;

    public ExecutorC9672a1(CoroutineDispatcher coroutineDispatcher) {
        this.f25412j = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f25412j.mo2769B0(C12967f.f33721j, runnable);
    }

    public String toString() {
        return this.f25412j.toString();
    }
}
