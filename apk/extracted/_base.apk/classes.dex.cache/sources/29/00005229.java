package p430xi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p388vf.C13277d;
import p450yi.C14032b;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aP\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m14357d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlinx/coroutines/flow/Flow;", "b", "(Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: xi.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13817j {

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m14357d2 = {"xi/j$a", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: xi.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13818a<R> implements Flow<R> {

        /* renamed from: j */
        final /* synthetic */ Function3 f35595j;

        public C13818a(Function3 function3) {
            this.f35595j = function3;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
            Object m2869d;
            Object m1454a = C13817j.m1454a(new C13819b(this.f35595j, flowCollector, null), continuation);
            m2869d = C13277d.m2869d();
            if (m1454a == m2869d) {
                return m1454a;
            }
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m14357d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m13986f = "FlowCoroutine.kt", m13985l = {51}, m13984m = "invokeSuspend")
    /* renamed from: xi.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C13819b extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f35596j;

        /* renamed from: k */
        private /* synthetic */ Object f35597k;

        /* renamed from: l */
        final /* synthetic */ Function3<CoroutineScope, FlowCollector<? super R>, Continuation<? super Unit>, Object> f35598l;

        /* renamed from: m */
        final /* synthetic */ FlowCollector<R> f35599m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13819b(Function3<? super CoroutineScope, ? super FlowCollector<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3, FlowCollector<? super R> flowCollector, Continuation<? super C13819b> continuation) {
            super(2, continuation);
            this.f35598l = function3;
            this.f35599m = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13819b c13819b = new C13819b(this.f35598l, this.f35599m, continuation);
            c13819b.f35597k = obj;
            return c13819b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13819b) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f35596j;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                Function3<CoroutineScope, FlowCollector<? super R>, Continuation<? super Unit>, Object> function3 = this.f35598l;
                Object obj2 = this.f35599m;
                this.f35596j = 1;
                if (function3.invoke((CoroutineScope) this.f35597k, obj2, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* renamed from: a */
    public static final <R> Object m1454a(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        Object m2869d;
        C13816i c13816i = new C13816i(continuation.getContext(), continuation);
        Object m857d = C14032b.m857d(c13816i, c13816i, function2);
        m2869d = C13277d.m2869d();
        if (m857d == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m857d;
    }

    /* renamed from: b */
    public static final <R> Flow<R> m1453b(Function3<? super CoroutineScope, ? super FlowCollector<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new C13818a(function3);
    }
}