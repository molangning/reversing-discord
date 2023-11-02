package p430xi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9644h;
import kotlinx.coroutines.C9673a2;
import kotlinx.coroutines.flow.FlowCollector;
import p371uf.C12967f;
import p388vf.C13277d;
import pf.C11583s;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b2\u00103J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m14357d2 = {"Lxi/n;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "", "uCont", "value", "", "c", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "previousContext", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lxi/h;", "exception", "d", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lpf/s;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "k", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "", "l", "I", "collectContextSize", "m", "lastEmissionContext", "n", "Lkotlin/coroutines/Continuation;", "completion", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: xi.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13824n<T> extends AbstractC9570d implements FlowCollector<T> {

    /* renamed from: j */
    public final FlowCollector<T> f35605j;

    /* renamed from: k */
    public final CoroutineContext f35606k;

    /* renamed from: l */
    public final int f35607l;

    /* renamed from: m */
    private CoroutineContext f35608m;

    /* renamed from: n */
    private Continuation<? super Unit> f35609n;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"T", "", "count", "Lkotlin/coroutines/CoroutineContext$b;", "<anonymous parameter 1>", "a", "(ILkotlin/coroutines/CoroutineContext$b;)Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: xi.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13825a extends AbstractC9614s implements Function2<Integer, CoroutineContext.InterfaceC9564b, Integer> {

        /* renamed from: j */
        public static final C13825a f35610j = new C13825a();

        C13825a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m1447a(int i, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            return Integer.valueOf(i + 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            return m1447a(num.intValue(), interfaceC9564b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13824n(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        super(C13822l.f35600j, C12967f.f33721j);
        this.f35605j = flowCollector;
        this.f35606k = coroutineContext;
        this.f35607l = ((Number) coroutineContext.mo1456t0(0, C13825a.f35610j)).intValue();
    }

    /* renamed from: b */
    private final void m1450b(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof C13815h) {
            m1448d((C13815h) coroutineContext2, t);
        }
        C13827p.m1444a(this, coroutineContext);
    }

    /* renamed from: c */
    private final Object m1449c(Continuation<? super Unit> continuation, T t) {
        Function3 function3;
        Object m2869d;
        CoroutineContext context = continuation.getContext();
        C9673a2.m13576h(context);
        CoroutineContext coroutineContext = this.f35608m;
        if (coroutineContext != context) {
            m1450b(context, coroutineContext, t);
            this.f35608m = context;
        }
        this.f35609n = continuation;
        function3 = Function3.f35611a;
        Object invoke = function3.invoke(this.f35605j, t, this);
        m2869d = C13277d.m2869d();
        if (!C9612q.m13922c(invoke, m2869d)) {
            this.f35609n = null;
        }
        return invoke;
    }

    /* renamed from: d */
    private final void m1448d(C13815h c13815h, Object obj) {
        String m13778f;
        m13778f = C9644h.m13778f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c13815h.f35593j + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(m13778f.toString());
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m2869d2;
        try {
            Object m1449c = m1449c(continuation, t);
            m2869d = C13277d.m2869d();
            if (m1449c == m2869d) {
                C9573g.m13976c(continuation);
            }
            m2869d2 = C13277d.m2869d();
            if (m1449c == m2869d2) {
                return m1449c;
            }
            return Unit.f25302a;
        } catch (Throwable th2) {
            this.f35608m = new C13815h(th2, continuation.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.f35609n;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9570d, kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f35608m;
        return coroutineContext == null ? C12967f.f33721j : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public Object invokeSuspend(Object obj) {
        Object m2869d;
        Throwable m7593e = C11583s.m7593e(obj);
        if (m7593e != null) {
            this.f35608m = new C13815h(m7593e, getContext());
        }
        Continuation<? super Unit> continuation = this.f35609n;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        m2869d = C13277d.m2869d();
        return m2869d;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9570d, kotlin.coroutines.jvm.internal.AbstractC9567a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}