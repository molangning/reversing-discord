package p430xi;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9604l0;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.C9776h0;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m14357d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "d", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: xi.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13811e {
    /* renamed from: a */
    public static final /* synthetic */ FlowCollector m1469a(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        return m1466d(flowCollector, coroutineContext);
    }

    /* renamed from: b */
    public static final <T, V> Object m1468b(CoroutineContext coroutineContext, V v, Object obj, Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object m2869d;
        Object m13299c = C9776h0.m13299c(coroutineContext, obj);
        try {
            Object invoke = ((Function2) C9604l0.m13938d(function2, 2)).invoke(v, new C13830r(continuation, coroutineContext));
            C9776h0.m13301a(coroutineContext, m13299c);
            m2869d = C13277d.m2869d();
            if (invoke == m2869d) {
                C9573g.m13976c(continuation);
            }
            return invoke;
        } catch (Throwable th2) {
            C9776h0.m13301a(coroutineContext, m13299c);
            throw th2;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m1467c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C9776h0.m13300b(coroutineContext);
        }
        return m1468b(coroutineContext, obj, obj2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <T> FlowCollector<T> m1466d(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        if (!(flowCollector instanceof C13829q)) {
            return new C13831s(flowCollector, coroutineContext);
        }
        return flowCollector;
    }
}
