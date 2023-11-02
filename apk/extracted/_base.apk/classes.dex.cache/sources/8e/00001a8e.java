package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$1", m13986f = "IntervalFlow.kt", m13985l = {14, 16, 17}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class IntervalFlowKt$intervalFlow$1 extends AbstractC9578k implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $initialDelay;
    final /* synthetic */ long $period;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntervalFlowKt$intervalFlow$1(long j, long j2, Continuation<? super IntervalFlowKt$intervalFlow$1> continuation) {
        super(2, continuation);
        this.$initialDelay = j;
        this.$period = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntervalFlowKt$intervalFlow$1 intervalFlowKt$intervalFlow$1 = new IntervalFlowKt$intervalFlow$1(this.$initialDelay, this.$period, continuation);
        intervalFlowKt$intervalFlow$1.L$0 = obj;
        return intervalFlowKt$intervalFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return ((IntervalFlowKt$intervalFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.f25302a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0059 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0057 -> B:36:0x0040). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p388vf.C13271b.m2873d()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L11
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
        L11:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            pf.C11586t.m7586b(r8)
            goto L3f
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            pf.C11586t.m7586b(r8)
            r8 = r7
            goto L4d
        L2a:
            pf.C11586t.m7586b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            long r5 = r7.$initialDelay
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.C9904v0.m12984b(r5, r7)
            if (r8 != r0) goto L3f
            return r0
        L3f:
            r8 = r7
        L40:
            kotlin.Unit r4 = kotlin.Unit.f25302a
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r4 = r1.emit(r4, r8)
            if (r4 != r0) goto L4d
            return r0
        L4d:
            long r4 = r8.$period
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r4 = kotlinx.coroutines.C9904v0.m12984b(r4, r8)
            if (r4 != r0) goto L40
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}