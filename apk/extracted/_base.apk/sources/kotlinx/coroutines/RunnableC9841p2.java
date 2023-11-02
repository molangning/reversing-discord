package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/p2;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "Lkotlinx/coroutines/CoroutineDispatcher;", "j", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/CancellableContinuation;", "k", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class RunnableC9841p2 implements Runnable {

    /* renamed from: j */
    private final CoroutineDispatcher f25660j;

    /* renamed from: k */
    private final CancellableContinuation<Unit> f25661k;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC9841p2(CoroutineDispatcher coroutineDispatcher, CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f25660j = coroutineDispatcher;
        this.f25661k = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25661k.mo13125v(this.f25660j, Unit.f25302a);
    }
}
