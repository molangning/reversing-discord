package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH'¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\tH'J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H'J\u0014\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH&J\"\u0010\u0017\u001a\u00020\n2\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0015H&J\u001b\u0010\u0019\u001a\u00020\n*\u00020\u00182\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH'¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006\""}, m14357d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "T", "Lkotlin/coroutines/Continuation;", "value", "", "idempotent", "k", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "", "onCancellation", "u", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "n", "token", "B", "cause", "", "r", "Lkotlinx/coroutines/CompletionHandler;", "handler", "l", "Lkotlinx/coroutines/CoroutineDispatcher;", "v", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "p", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "a", "()Z", "isActive", "i", "isCompleted", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface CancellableContinuation<T> extends Continuation<T> {

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: kotlinx.coroutines.CancellableContinuation$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9665a {
        /* renamed from: a */
        public static /* synthetic */ boolean m13597a(CancellableContinuation cancellableContinuation, Throwable th2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th2 = null;
                }
                return cancellableContinuation.mo13129r(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    /* renamed from: B */
    void mo13156B(Object obj);

    /* renamed from: a */
    boolean mo13140a();

    /* renamed from: i */
    boolean mo13138i();

    /* renamed from: k */
    Object mo13136k(T t, Object obj);

    /* renamed from: l */
    void mo13135l(Function1<? super Throwable, Unit> function1);

    /* renamed from: n */
    Object mo13133n(Throwable th2);

    /* renamed from: p */
    void mo13131p(T t, Function1<? super Throwable, Unit> function1);

    /* renamed from: r */
    boolean mo13129r(Throwable th2);

    /* renamed from: u */
    Object mo13126u(T t, Object obj, Function1<? super Throwable, Unit> function1);

    /* renamed from: v */
    void mo13125v(CoroutineDispatcher coroutineDispatcher, T t);
}