package p430xi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.C9776h0;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m14357d2 = {"Lxi/s;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "j", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "", "k", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "l", "Lkotlin/jvm/functions/Function2;", "emitRef", "downstream", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: xi.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C13831s<T> implements FlowCollector<T> {

    /* renamed from: j */
    private final CoroutineContext f35617j;

    /* renamed from: k */
    private final Object f35618k;

    /* renamed from: l */
    private final Function2<T, Continuation<? super Unit>, Object> f35619l;

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m14357d2 = {"T", "it", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m13986f = "ChannelFlow.kt", m13985l = {212}, m13984m = "invokeSuspend")
    /* renamed from: xi.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C13832a extends AbstractC9578k implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f35620j;

        /* renamed from: k */
        /* synthetic */ Object f35621k;

        /* renamed from: l */
        final /* synthetic */ FlowCollector<T> f35622l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13832a(FlowCollector<? super T> flowCollector, Continuation<? super C13832a> continuation) {
            super(2, continuation);
            this.f35622l = flowCollector;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b */
        public final Object invoke(T t, Continuation<? super Unit> continuation) {
            return ((C13832a) create(t, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13832a c13832a = new C13832a(this.f35622l, continuation);
            c13832a.f35621k = obj;
            return c13832a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f35620j;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                Object obj2 = this.f35621k;
                this.f35620j = 1;
                if (this.f35622l.emit(obj2, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    public C13831s(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        this.f35617j = coroutineContext;
        this.f35618k = C9776h0.m13300b(coroutineContext);
        this.f35619l = new C13832a(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m1468b = C13811e.m1468b(this.f35617j, t, this.f35618k, this.f35619l, continuation);
        m2869d = C13277d.m2869d();
        return m1468b == m2869d ? m1468b : Unit.f25302a;
    }
}
