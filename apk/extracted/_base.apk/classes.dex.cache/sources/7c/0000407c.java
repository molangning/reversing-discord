package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import p409wi.InterfaceC13624t;

@Metadata(m14358d1 = {"kotlinx/coroutines/flow/e", "kotlinx/coroutines/flow/f", "kotlinx/coroutines/flow/g", "kotlinx/coroutines/flow/h", "kotlinx/coroutines/flow/i"}, m14357d2 = {}, m14356k = 4, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9711d {
    /* renamed from: a */
    public static final <T> Flow<T> m13464a(Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C9712e.m13458a(function2);
    }

    /* renamed from: b */
    public static final <T> Flow<T> m13463b(Flow<? extends T> flow, long j) {
        return C9716h.m13451a(flow, j);
    }

    /* renamed from: c */
    public static final <T> Object m13462c(FlowCollector<? super T> flowCollector, InterfaceC13624t<? extends T> interfaceC13624t, Continuation<? super Unit> continuation) {
        return C9713f.m13455b(flowCollector, interfaceC13624t, continuation);
    }

    /* renamed from: d */
    public static final void m13461d(FlowCollector<?> flowCollector) {
        C9724i.m13446a(flowCollector);
    }

    /* renamed from: e */
    public static final <T> Flow<T> m13460e(Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C9712e.m13457b(function2);
    }

    /* renamed from: f */
    public static final <T> Flow<T> m13459f(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return C9715g.m13452b(flow, coroutineContext);
    }
}