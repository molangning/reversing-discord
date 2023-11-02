package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.C9764b0;
import kotlinx.coroutines.internal.C9771f;
import p388vf.C13277d;
import p450yi.C14032b;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aJ\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u001a\u001e\u0010\u0015\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0014\"\u001b\u0010\u001b\u001a\u00020\u0016*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "i", "b", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "g", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "d", "", "message", "", "c", "", "h", "(Lkotlinx/coroutines/CoroutineScope;)Z", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "isActive", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9824m0 {
    /* renamed from: a */
    public static final CoroutineScope m13174a(CoroutineContext coroutineContext) {
        InterfaceC9919z m13564b;
        if (coroutineContext.mo1458j(Job.f25404c) == null) {
            m13564b = C9683c2.m13564b(null, 1, null);
            coroutineContext = coroutineContext.mo1459e0(m13564b);
        }
        return new C9771f(coroutineContext);
    }

    /* renamed from: b */
    public static final CoroutineScope m13173b() {
        return new C9771f(C9897t2.m12990b(null, 1, null).mo1459e0(C9677b1.m13568c()));
    }

    /* renamed from: c */
    public static final void m13172c(CoroutineScope coroutineScope, String str, Throwable th2) {
        m13171d(coroutineScope, C9825m1.m13165a(str, th2));
    }

    /* renamed from: d */
    public static final void m13171d(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().mo1458j(Job.f25404c);
        if (job != null) {
            job.mo2104h(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m13170e(CoroutineScope coroutineScope, String str, Throwable th2, int i, Object obj) {
        if ((i & 2) != 0) {
            th2 = null;
        }
        m13172c(coroutineScope, str, th2);
    }

    /* renamed from: f */
    public static /* synthetic */ void m13169f(CoroutineScope coroutineScope, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m13171d(coroutineScope, cancellationException);
    }

    /* renamed from: g */
    public static final <R> Object m13168g(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        Object m2869d;
        C9764b0 c9764b0 = new C9764b0(continuation.getContext(), continuation);
        Object m857d = C14032b.m857d(c9764b0, c9764b0, function2);
        m2869d = C13277d.m2869d();
        if (m857d == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m857d;
    }

    /* renamed from: h */
    public static final boolean m13167h(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().mo1458j(Job.f25404c);
        if (job != null) {
            return job.mo2067a();
        }
        return true;
    }

    /* renamed from: i */
    public static final CoroutineScope m13166i(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        return new C9771f(coroutineScope.getCoroutineContext().mo1459e0(coroutineContext));
    }
}