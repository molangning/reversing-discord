package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.internal.C9768d0;
import p388vf.C13277d;
import p409wi.C13608i;
import p430xi.C13817j;
import p430xi.C13823m;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m14357d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "timeoutMillis", "a", "Lkotlin/Function1;", "timeoutMillisSelector", "b", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9716h {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9717a<T> extends AbstractC9614s implements Function1<T, Long> {

        /* renamed from: j */
        final /* synthetic */ long f25473j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9717a(long j) {
            super(1);
            this.f25473j = j;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Long invoke(T t) {
            return Long.valueOf(this.f25473j);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m14357d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m13986f = "Delay.kt", m13985l = {222, 355}, m13984m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9718b<T> extends AbstractC9578k implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        Object f25474j;

        /* renamed from: k */
        Object f25475k;

        /* renamed from: l */
        int f25476l;

        /* renamed from: m */
        private /* synthetic */ Object f25477m;

        /* renamed from: n */
        /* synthetic */ Object f25478n;

        /* renamed from: o */
        final /* synthetic */ Function1<T, Long> f25479o;

        /* renamed from: p */
        final /* synthetic */ Flow<T> f25480p;

        @Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, m14357d2 = {"T", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
        @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m13986f = "Delay.kt", m13985l = {233}, m13984m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.h$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9719a extends AbstractC9578k implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: j */
            int f25481j;

            /* renamed from: k */
            final /* synthetic */ FlowCollector<T> f25482k;

            /* renamed from: l */
            final /* synthetic */ Ref$ObjectRef<Object> f25483l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C9719a(FlowCollector<? super T> flowCollector, Ref$ObjectRef<Object> ref$ObjectRef, Continuation<? super C9719a> continuation) {
                super(1, continuation);
                this.f25482k = flowCollector;
                this.f25483l = ref$ObjectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C9719a(this.f25482k, this.f25483l, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((C9719a) create(continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                Object m2869d;
                m2869d = C13277d.m2869d();
                int i = this.f25481j;
                if (i != 0) {
                    if (i == 1) {
                        C11586t.m7586b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C11586t.m7586b(obj);
                    FlowCollector<T> flowCollector = this.f25482k;
                    C9768d0 c9768d0 = C13823m.f35602a;
                    T t = this.f25483l.f25329j;
                    if (t == c9768d0) {
                        t = null;
                    }
                    this.f25481j = 1;
                    if (flowCollector.emit(t, this) == m2869d) {
                        return m2869d;
                    }
                }
                this.f25483l.f25329j = null;
                return Unit.f25302a;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m14357d2 = {"T", "Lwi/i;", "", "value", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
        @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m13986f = "Delay.kt", m13985l = {243}, m13984m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.h$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9720b extends AbstractC9578k implements Function2<C13608i<? extends Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            Object f25484j;

            /* renamed from: k */
            int f25485k;

            /* renamed from: l */
            /* synthetic */ Object f25486l;

            /* renamed from: m */
            final /* synthetic */ Ref$ObjectRef<Object> f25487m;

            /* renamed from: n */
            final /* synthetic */ FlowCollector<T> f25488n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C9720b(Ref$ObjectRef<Object> ref$ObjectRef, FlowCollector<? super T> flowCollector, Continuation<? super C9720b> continuation) {
                super(2, continuation);
                this.f25487m = ref$ObjectRef;
                this.f25488n = flowCollector;
            }

            /* renamed from: b */
            public final Object m13447b(Object obj, Continuation<? super Unit> continuation) {
                return ((C9720b) create(C13608i.m2100b(obj), continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C9720b c9720b = new C9720b(this.f25487m, this.f25488n, continuation);
                c9720b.f25486l = obj;
                return c9720b;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(C13608i<? extends Object> c13608i, Continuation<? super Unit> continuation) {
                return m13447b(c13608i.m2092j(), continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                Object m2869d;
                Ref$ObjectRef<Object> ref$ObjectRef;
                Ref$ObjectRef<Object> ref$ObjectRef2;
                m2869d = C13277d.m2869d();
                int i = this.f25485k;
                if (i != 0) {
                    if (i == 1) {
                        ref$ObjectRef2 = (Ref$ObjectRef) this.f25484j;
                        C11586t.m7586b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C11586t.m7586b(obj);
                    T t = (T) ((C13608i) this.f25486l).m2092j();
                    ref$ObjectRef = this.f25487m;
                    boolean z = t instanceof C13608i.C13611c;
                    if (!z) {
                        ref$ObjectRef.f25329j = t;
                    }
                    FlowCollector<T> flowCollector = this.f25488n;
                    if (z) {
                        Throwable m2097e = C13608i.m2097e(t);
                        if (m2097e == null) {
                            Object obj2 = ref$ObjectRef.f25329j;
                            if (obj2 != null) {
                                if (obj2 == C13823m.f35602a) {
                                    obj2 = null;
                                }
                                this.f25486l = t;
                                this.f25484j = ref$ObjectRef;
                                this.f25485k = 1;
                                if (flowCollector.emit(obj2, this) == m2869d) {
                                    return m2869d;
                                }
                                ref$ObjectRef2 = ref$ObjectRef;
                            }
                            ref$ObjectRef.f25329j = (T) C13823m.f35604c;
                        } else {
                            throw m2097e;
                        }
                    }
                    return Unit.f25302a;
                }
                ref$ObjectRef = ref$ObjectRef2;
                ref$ObjectRef.f25329j = (T) C13823m.f35604c;
                return Unit.f25302a;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m14357d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
        @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m13986f = "Delay.kt", m13985l = {211}, m13984m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.h$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9721c extends AbstractC9578k implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            int f25489j;

            /* renamed from: k */
            private /* synthetic */ Object f25490k;

            /* renamed from: l */
            final /* synthetic */ Flow<T> f25491l;

            @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
            /* renamed from: kotlinx.coroutines.flow.h$b$c$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            public static final class C9722a<T> implements FlowCollector {

                /* renamed from: j */
                final /* synthetic */ ProducerScope<Object> f25492j;

                @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
                @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m13986f = "Delay.kt", m13985l = {211}, m13984m = "emit")
                /* renamed from: kotlinx.coroutines.flow.h$b$c$a$a */
                /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
                public static final class C9723a extends AbstractC9570d {

                    /* renamed from: j */
                    /* synthetic */ Object f25493j;

                    /* renamed from: k */
                    final /* synthetic */ C9722a<T> f25494k;

                    /* renamed from: l */
                    int f25495l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C9723a(C9722a<? super T> c9722a, Continuation<? super C9723a> continuation) {
                        super(continuation);
                        this.f25494k = c9722a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
                    public final Object invokeSuspend(Object obj) {
                        this.f25493j = obj;
                        this.f25495l |= Integer.MIN_VALUE;
                        return this.f25494k.emit(null, this);
                    }
                }

                C9722a(ProducerScope<Object> producerScope) {
                    this.f25492j = producerScope;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.C9716h.C9718b.C9721c.C9722a.C9723a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.h$b$c$a$a r0 = (kotlinx.coroutines.flow.C9716h.C9718b.C9721c.C9722a.C9723a) r0
                        int r1 = r0.f25495l
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f25495l = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.h$b$c$a$a r0 = new kotlinx.coroutines.flow.h$b$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f25493j
                        java.lang.Object r1 = p388vf.C13271b.m2873d()
                        int r2 = r0.f25495l
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        pf.C11586t.m7586b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        pf.C11586t.m7586b(r6)
                        kotlinx.coroutines.channels.ProducerScope<java.lang.Object> r6 = r4.f25492j
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.d0 r5 = p430xi.C13823m.f35602a
                    L3a:
                        r0.f25495l = r3
                        java.lang.Object r5 = r6.mo2049w(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.f25302a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9716h.C9718b.C9721c.C9722a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C9721c(Flow<? extends T> flow, Continuation<? super C9721c> continuation) {
                super(2, continuation);
                this.f25491l = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C9721c c9721c = new C9721c(this.f25491l, continuation);
                c9721c.f25490k = obj;
                return c9721c;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Object> producerScope, Continuation<? super Unit> continuation) {
                return invoke2((ProducerScope<Object>) producerScope, continuation);
            }

            /* renamed from: invoke */
            public final Object invoke2(ProducerScope<Object> producerScope, Continuation<? super Unit> continuation) {
                return ((C9721c) create(producerScope, continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                Object m2869d;
                m2869d = C13277d.m2869d();
                int i = this.f25489j;
                if (i != 0) {
                    if (i == 1) {
                        C11586t.m7586b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C11586t.m7586b(obj);
                    Flow<T> flow = this.f25491l;
                    C9722a c9722a = new C9722a((ProducerScope) this.f25490k);
                    this.f25489j = 1;
                    if (flow.collect(c9722a, this) == m2869d) {
                        return m2869d;
                    }
                }
                return Unit.f25302a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9718b(Function1<? super T, Long> function1, Flow<? extends T> flow, Continuation<? super C9718b> continuation) {
            super(3, continuation);
            this.f25479o = function1;
            this.f25480p = flow;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: b */
        public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            C9718b c9718b = new C9718b(this.f25479o, this.f25480p, continuation);
            c9718b.f25477m = coroutineScope;
            c9718b.f25478n = flowCollector;
            return c9718b.invokeSuspend(Unit.f25302a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:50|26|30|31|32|33|(1:35)|36|37|(1:39)|(1:41)(1:42)) */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x00f7, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00f8, code lost:
            r10.m13031c0(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x010a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:101:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00e0 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:89:0x00dc, B:91:0x00e0, B:92:0x00ea), top: B:104:0x00dc }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x010b -> B:64:0x006f). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9716h.C9718b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Flow<T> m13451a(Flow<? extends T> flow, long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return flow;
            }
            return m13450b(flow, new C9717a(j));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* renamed from: b */
    private static final <T> Flow<T> m13450b(Flow<? extends T> flow, Function1<? super T, Long> function1) {
        return C13817j.m1453b(new C9718b(function1, flow, null));
    }
}