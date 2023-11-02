package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/u0;", "", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "v", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/d1;", "R", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC9899u0 {

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: kotlinx.coroutines.u0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9900a {
        /* renamed from: a */
        public static InterfaceC9688d1 m12989a(InterfaceC9899u0 interfaceC9899u0, long j, Runnable runnable, CoroutineContext coroutineContext) {
            return C9847r0.m13103a().mo2760R(j, runnable, coroutineContext);
        }
    }

    /* renamed from: R */
    InterfaceC9688d1 mo2760R(long j, Runnable runnable, CoroutineContext coroutineContext);

    /* renamed from: v */
    void mo2761v(long j, CancellableContinuation<? super Unit> cancellableContinuation);
}
