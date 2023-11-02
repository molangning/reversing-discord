package com.discord.chat.presentation.message.system;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.discord.chat.bridge.Message;
import com.discord.chat.databinding.CallSystemMessageViewBinding;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.time.IntervalFlowKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.time.C9662a;
import kotlin.time.Duration;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C9711d;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p373ui.EnumC12982c;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1", m13986f = "CallSystemMessageView.kt", m13985l = {82}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CallSystemMessageView$setMessage$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Message $message;
    final /* synthetic */ long $start;
    int label;
    final /* synthetic */ CallSystemMessageView this$0;

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1", m13986f = "CallSystemMessageView.kt", m13985l = {90}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C29961 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Message $message;
        final /* synthetic */ long $start;
        int label;
        final /* synthetic */ CallSystemMessageView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29961(long j, CallSystemMessageView callSystemMessageView, Message message, Continuation<? super C29961> continuation) {
            super(2, continuation);
            this.$start = j;
            this.this$0 = callSystemMessageView;
            this.$message = message;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29961(this.$start, this.this$0, this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29961) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                Duration.C9661a c9661a = Duration.f25397k;
                final Flow<Unit> m41946intervalFlowQTBD994 = IntervalFlowKt.m41946intervalFlowQTBD994(C9662a.m13604s(1, EnumC12982c.SECONDS), Duration.f25397k.m13624b());
                final long j = this.$start;
                Flow m13459f = C9711d.m13459f(new Flow<Duration>() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1

                    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
                    /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2 */
                    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
                    public static final class C29942<T> implements FlowCollector {
                        final /* synthetic */ long $start$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
                        @InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2", m13986f = "CallSystemMessageView.kt", m13985l = {223}, m13984m = "emit")
                        /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1 */
                        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
                        public static final class C29951 extends AbstractC9570d {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public C29951(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C29942.this.emit(null, this);
                            }
                        }

                        public C29942(FlowCollector flowCollector, long j) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$start$inlined = j;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                            /*
                                r8 = this;
                                boolean r0 = r10 instanceof com.discord.chat.presentation.message.system.C2993xed4af3cc.C29942.C29951
                                if (r0 == 0) goto L13
                                r0 = r10
                                com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.discord.chat.presentation.message.system.C2993xed4af3cc.C29942.C29951) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r10)
                            L18:
                                java.lang.Object r10 = r0.result
                                java.lang.Object r1 = p388vf.C13271b.m2873d()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                pf.C11586t.m7586b(r10)
                                goto L62
                            L29:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r10)
                                throw r9
                            L31:
                                pf.C11586t.m7586b(r10)
                                kotlinx.coroutines.flow.FlowCollector r10 = r8.$this_unsafeFlow
                                kotlin.Unit r9 = (kotlin.Unit) r9
                                kotlin.time.Duration$a r9 = kotlin.time.Duration.f25397k
                                long r4 = java.lang.System.currentTimeMillis()
                                long r6 = r8.$start$inlined
                                long r4 = r4 - r6
                                ui.c r9 = p373ui.EnumC12982c.MILLISECONDS
                                long r4 = kotlin.time.C9662a.m13603t(r4, r9)
                                kotlin.time.Duration r9 = kotlin.time.Duration.m13643e(r4)
                                kotlin.time.Duration$a r2 = kotlin.time.Duration.f25397k
                                long r4 = r2.m13624b()
                                kotlin.time.Duration r2 = kotlin.time.Duration.m13643e(r4)
                                java.lang.Comparable r9 = gg.C6757h.m21945e(r9, r2)
                                r0.label = r3
                                java.lang.Object r9 = r10.emit(r9, r0)
                                if (r9 != r1) goto L62
                                return r1
                            L62:
                                kotlin.Unit r9 = kotlin.Unit.f25302a
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.system.C2993xed4af3cc.C29942.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Duration> flowCollector, Continuation continuation) {
                        Object m2869d2;
                        Object collect = Flow.this.collect(new C29942(flowCollector, j), continuation);
                        m2869d2 = C13277d.m2869d();
                        if (collect == m2869d2) {
                            return collect;
                        }
                        return Unit.f25302a;
                    }
                }, C9677b1.m13570a());
                final CallSystemMessageView callSystemMessageView = this.this$0;
                final Message message = this.$message;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView.setMessage.1.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return m41759emitVtjQ1oo(((Duration) obj2).m13648M(), continuation);
                    }

                    /* renamed from: emit-VtjQ1oo */
                    public final Object m41759emitVtjQ1oo(long j2, Continuation<? super Unit> continuation) {
                        CallSystemMessageViewBinding callSystemMessageViewBinding;
                        CallSystemMessageView callSystemMessageView2 = callSystemMessageView;
                        Message message2 = message;
                        long m13634o = Duration.m13634o(j2);
                        int m13630s = Duration.m13630s(j2);
                        int m13628v = Duration.m13628v(j2);
                        Duration.m13629t(j2);
                        callSystemMessageViewBinding = callSystemMessageView2.binding;
                        TextView textView = callSystemMessageViewBinding.info;
                        String format = String.format("%02d:%02d:%02d%s", Arrays.copyOf(new Object[]{C9568b.m13988d(m13634o), C9568b.m13989c(m13630s), C9568b.m13989c(m13628v), message2.getDescription()}, 4));
                        C9612q.m13918g(format, "format(this, *args)");
                        textView.setText(format);
                        return Unit.f25302a;
                    }
                };
                this.label = 1;
                if (m13459f.collect(flowCollector, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageView$setMessage$1(CallSystemMessageView callSystemMessageView, long j, Message message, Continuation<? super CallSystemMessageView$setMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = callSystemMessageView;
        this.$start = j;
        this.$message = message;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallSystemMessageView$setMessage$1(this.this$0, this.$start, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallSystemMessageView$setMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            CallSystemMessageView callSystemMessageView = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C29961 c29961 = new C29961(this.$start, callSystemMessageView, this.$message, null);
            this.label = 1;
            if (CoroutineViewUtilsKt.repeatOnLifecycleOwner(callSystemMessageView, state, c29961, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}