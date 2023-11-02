package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(m14358d1 = {"kotlinx/coroutines/b2", "kotlinx/coroutines/c2"}, m14357d2 = {}, m14356k = 4, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9673a2 {
    /* renamed from: a */
    public static final InterfaceC9919z m13583a(Job job) {
        return C9683c2.m13565a(job);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9919z m13582b(Job job, int i, Object obj) {
        return C9683c2.m13564b(job, i, obj);
    }

    /* renamed from: c */
    public static final void m13581c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        C9683c2.m13563c(coroutineContext, cancellationException);
    }

    /* renamed from: d */
    public static /* synthetic */ void m13580d(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        C9683c2.m13562d(coroutineContext, cancellationException, i, obj);
    }

    /* renamed from: e */
    public static final void m13579e(CoroutineContext coroutineContext, CancellationException cancellationException) {
        C9683c2.m13561e(coroutineContext, cancellationException);
    }

    /* renamed from: f */
    public static final void m13578f(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        C9678b2.m13567a(cancellableContinuation, future);
    }

    /* renamed from: g */
    public static final InterfaceC9688d1 m13577g(Job job, InterfaceC9688d1 interfaceC9688d1) {
        return C9683c2.m13560f(job, interfaceC9688d1);
    }

    /* renamed from: h */
    public static final void m13576h(CoroutineContext coroutineContext) {
        C9683c2.m13559g(coroutineContext);
    }

    /* renamed from: i */
    public static final void m13575i(Job job) {
        C9683c2.m13558h(job);
    }
}
