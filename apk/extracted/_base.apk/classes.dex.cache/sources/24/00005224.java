package p430xi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p371uf.InterfaceC12963d;
import p388vf.C13277d;
import p409wi.EnumC13603e;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m14357d2 = {"Lxi/f;", "S", "T", "Lxi/d;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Lkotlin/coroutines/CoroutineContext;", "newContext", "", "k", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "d", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "Lkotlinx/coroutines/flow/Flow;", "m", "Lkotlinx/coroutines/flow/Flow;", "flow", "context", "", "capacity", "Lwi/e;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILwi/e;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: xi.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC13812f<S, T> extends AbstractC13808d<T> {

    /* renamed from: m */
    protected final Flow<S> f35589m;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m14357d2 = {"S", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m13986f = "ChannelFlow.kt", m13985l = {152}, m13984m = "invokeSuspend")
    /* renamed from: xi.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13813a extends AbstractC9578k implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f35590j;

        /* renamed from: k */
        /* synthetic */ Object f35591k;

        /* renamed from: l */
        final /* synthetic */ AbstractC13812f<S, T> f35592l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13813a(AbstractC13812f<S, T> abstractC13812f, Continuation<? super C13813a> continuation) {
            super(2, continuation);
            this.f35592l = abstractC13812f;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13813a c13813a = new C13813a(this.f35592l, continuation);
            c13813a.f35591k = obj;
            return c13813a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((FlowCollector) ((FlowCollector) obj), continuation);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C13813a) create(flowCollector, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f35590j;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                AbstractC13812f<S, T> abstractC13812f = this.f35592l;
                this.f35590j = 1;
                if (abstractC13812f.mo1460l((FlowCollector) this.f35591k, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC13812f(Flow<? extends S> flow, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        super(coroutineContext, i, enumC13603e);
        this.f35589m = flow;
    }

    /* renamed from: i */
    static /* synthetic */ Object m1464i(AbstractC13812f abstractC13812f, FlowCollector flowCollector, Continuation continuation) {
        Object m2869d;
        Object m2869d2;
        Object m2869d3;
        if (abstractC13812f.f35580k == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext mo1459e0 = context.mo1459e0(abstractC13812f.f35579j);
            if (C9612q.m13922c(mo1459e0, context)) {
                Object mo1460l = abstractC13812f.mo1460l(flowCollector, continuation);
                m2869d3 = C13277d.m2869d();
                if (mo1460l == m2869d3) {
                    return mo1460l;
                }
                return Unit.f25302a;
            }
            InterfaceC12963d.C12965b c12965b = InterfaceC12963d.f33719g;
            if (C9612q.m13922c(mo1459e0.mo1458j(c12965b), context.mo1458j(c12965b))) {
                Object m1462k = abstractC13812f.m1462k(flowCollector, mo1459e0, continuation);
                m2869d2 = C13277d.m2869d();
                if (m1462k == m2869d2) {
                    return m1462k;
                }
                return Unit.f25302a;
            }
        }
        Object collect = super.collect(flowCollector, continuation);
        m2869d = C13277d.m2869d();
        if (collect == m2869d) {
            return collect;
        }
        return Unit.f25302a;
    }

    /* renamed from: j */
    static /* synthetic */ Object m1463j(AbstractC13812f abstractC13812f, ProducerScope producerScope, Continuation continuation) {
        Object m2869d;
        Object mo1460l = abstractC13812f.mo1460l(new C13829q(producerScope), continuation);
        m2869d = C13277d.m2869d();
        return mo1460l == m2869d ? mo1460l : Unit.f25302a;
    }

    /* renamed from: k */
    private final Object m1462k(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        FlowCollector m1466d;
        Object m2869d;
        m1466d = C13811e.m1466d(flowCollector, continuation.getContext());
        Object m1467c = C13811e.m1467c(coroutineContext, m1466d, null, new C13813a(this, null), continuation, 4, null);
        m2869d = C13277d.m2869d();
        if (m1467c == m2869d) {
            return m1467c;
        }
        return Unit.f25302a;
    }

    @Override // p430xi.AbstractC13808d, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return m1464i(this, flowCollector, continuation);
    }

    @Override // p430xi.AbstractC13808d
    /* renamed from: d */
    protected Object mo1465d(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return m1463j(this, producerScope, continuation);
    }

    /* renamed from: l */
    protected abstract Object mo1460l(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation);

    @Override // p430xi.AbstractC13808d
    public String toString() {
        return this.f35589m + " -> " + super.toString();
    }
}