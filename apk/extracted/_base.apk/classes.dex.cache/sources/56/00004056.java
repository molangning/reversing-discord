package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¨\u0006\u0005"}, m14357d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "Ljava/util/concurrent/Future;", "future", "", "a", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/JobKt")
/* renamed from: kotlinx.coroutines.b2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final /* synthetic */ class C9678b2 {
    /* renamed from: a */
    public static final void m13567a(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        cancellableContinuation.mo13135l(new C9823m(future));
    }
}