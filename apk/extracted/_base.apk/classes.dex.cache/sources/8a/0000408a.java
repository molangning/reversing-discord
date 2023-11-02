package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B4\u0012(\u0010\r\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R9\u0010\r\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m14357d2 = {"Lkotlinx/coroutines/flow/j;", "T", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "b", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "j", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C9725j<T> extends AbstractC9706a<T> {

    /* renamed from: j */
    private final Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> f25496j;

    /* JADX WARN: Multi-variable type inference failed */
    public C9725j(Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f25496j = function2;
    }

    @Override // kotlinx.coroutines.flow.AbstractC9706a
    /* renamed from: b */
    public Object mo13445b(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object invoke = this.f25496j.invoke(flowCollector, continuation);
        m2869d = C13277d.m2869d();
        return invoke == m2869d ? invoke : Unit.f25302a;
    }
}