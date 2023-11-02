package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import p388vf.C13277d;
import p409wi.InterfaceC13624t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m14357d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lwi/t;", "channel", "", "b", "(Lkotlinx/coroutines/flow/FlowCollector;Lwi/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consume", "c", "(Lkotlinx/coroutines/flow/FlowCollector;Lwi/t;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9713f {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m13986f = "Channels.kt", m13985l = {51, 62}, m13984m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: kotlinx.coroutines.flow.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9714a<T> extends AbstractC9570d {

        /* renamed from: j */
        Object f25468j;

        /* renamed from: k */
        Object f25469k;

        /* renamed from: l */
        boolean f25470l;

        /* renamed from: m */
        /* synthetic */ Object f25471m;

        /* renamed from: n */
        int f25472n;

        C9714a(Continuation<? super C9714a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f25471m = obj;
            this.f25472n |= Integer.MIN_VALUE;
            return C9713f.m13454c(null, null, false, this);
        }
    }

    /* renamed from: b */
    public static final <T> Object m13455b(FlowCollector<? super T> flowCollector, InterfaceC13624t<? extends T> interfaceC13624t, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m13454c = m13454c(flowCollector, interfaceC13624t, true, continuation);
        m2869d = C13277d.m2869d();
        return m13454c == m2869d ? m13454c : Unit.f25302a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:18:0x004b), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:18:0x004b), top: B:46:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m13454c(kotlinx.coroutines.flow.FlowCollector<? super T> r6, p409wi.InterfaceC13624t<? extends T> r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.C9713f.C9714a
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.f$a r0 = (kotlinx.coroutines.flow.C9713f.C9714a) r0
            int r1 = r0.f25472n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25472n = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.f$a r0 = new kotlinx.coroutines.flow.f$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25471m
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f25472n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r6 = r0.f25470l
            java.lang.Object r7 = r0.f25469k
            wi.t r7 = (p409wi.InterfaceC13624t) r7
            java.lang.Object r8 = r0.f25468j
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            pf.C11586t.m7586b(r9)     // Catch: java.lang.Throwable -> L55
        L35:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L5d
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            boolean r6 = r0.f25470l
            java.lang.Object r7 = r0.f25469k
            wi.t r7 = (p409wi.InterfaceC13624t) r7
            java.lang.Object r8 = r0.f25468j
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            pf.C11586t.m7586b(r9)     // Catch: java.lang.Throwable -> L55
            wi.i r9 = (p409wi.C13608i) r9     // Catch: java.lang.Throwable -> L55
            java.lang.Object r9 = r9.m2092j()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r8 = move-exception
            goto L9c
        L57:
            pf.C11586t.m7586b(r9)
            kotlinx.coroutines.flow.C9711d.m13461d(r6)
        L5d:
            r0.f25468j = r6     // Catch: java.lang.Throwable -> L98
            r0.f25469k = r7     // Catch: java.lang.Throwable -> L98
            r0.f25470l = r8     // Catch: java.lang.Throwable -> L98
            r0.f25472n = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r9 = r7.mo2061f(r0)     // Catch: java.lang.Throwable -> L98
            if (r9 != r1) goto L6c
            return r1
        L6c:
            r5 = r8
            r8 = r6
            r6 = r5
        L6f:
            boolean r2 = p409wi.C13608i.m2094h(r9)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L85
            java.lang.Throwable r8 = p409wi.C13608i.m2097e(r9)     // Catch: java.lang.Throwable -> L55
            if (r8 != 0) goto L84
            if (r6 == 0) goto L81
            r6 = 0
            p409wi.C13612j.m2088a(r7, r6)
        L81:
            kotlin.Unit r6 = kotlin.Unit.f25302a
            return r6
        L84:
            throw r8     // Catch: java.lang.Throwable -> L55
        L85:
            java.lang.Object r9 = p409wi.C13608i.m2096f(r9)     // Catch: java.lang.Throwable -> L55
            r0.f25468j = r8     // Catch: java.lang.Throwable -> L55
            r0.f25469k = r7     // Catch: java.lang.Throwable -> L55
            r0.f25470l = r6     // Catch: java.lang.Throwable -> L55
            r0.f25472n = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r9 = r8.emit(r9, r0)     // Catch: java.lang.Throwable -> L55
            if (r9 != r1) goto L35
            return r1
        L98:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L9c:
            throw r8     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r6 == 0) goto La3
            p409wi.C13612j.m2088a(r7, r8)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9713f.m13454c(kotlinx.coroutines.flow.FlowCollector, wi.t, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
