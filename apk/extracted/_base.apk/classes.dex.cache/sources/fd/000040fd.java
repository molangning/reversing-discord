package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004*\f\b\u0007\u0010\u0007\"\u00020\u00012\u00020\u0001¨\u0006\b"}, m14357d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/n1;", "b", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "a", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9840p1 {
    /* renamed from: a */
    public static final Executor m13117a(CoroutineDispatcher coroutineDispatcher) {
        Executor mo13057F0;
        AbstractC9830n1 abstractC9830n1 = coroutineDispatcher instanceof AbstractC9830n1 ? (AbstractC9830n1) coroutineDispatcher : null;
        return (abstractC9830n1 == null || (mo13057F0 = abstractC9830n1.mo13057F0()) == null) ? new ExecutorC9672a1(coroutineDispatcher) : mo13057F0;
    }

    /* renamed from: b */
    public static final AbstractC9830n1 m13116b(ExecutorService executorService) {
        return new C9836o1(executorService);
    }
}