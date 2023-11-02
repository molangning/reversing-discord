package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function2;
import p388vf.C13277d;
import p450yi.C14032b;

@Metadata(m14358d1 = {"\u00000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\n\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0010H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m14357d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "U", "Lkotlinx/coroutines/x2;", "coroutine", "b", "(Lkotlinx/coroutines/x2;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/w2;", "a", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.y2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9918y2 {
    /* renamed from: a */
    public static final C9910w2 m12958a(long j, Job job) {
        return new C9910w2("Timed out waiting for " + j + " ms", job);
    }

    /* renamed from: b */
    private static final <U, T extends U> Object m12957b(RunnableC9914x2<U, ? super T> runnableC9914x2, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        C9673a2.m13577g(runnableC9914x2, C9904v0.m12983c(runnableC9914x2.f25567l.getContext()).mo2760R(runnableC9914x2.f25773m, runnableC9914x2, runnableC9914x2.getContext()));
        return C14032b.m856e(runnableC9914x2, runnableC9914x2, function2);
    }

    /* renamed from: c */
    public static final <T> Object m12956c(long j, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object m2869d;
        if (j > 0) {
            Object m12957b = m12957b(new RunnableC9914x2(j, continuation), function2);
            m2869d = C13277d.m2869d();
            if (m12957b == m2869d) {
                C9573g.m13976c(continuation);
            }
            return m12957b;
        }
        throw new C9910w2("Timed out immediately");
    }
}
