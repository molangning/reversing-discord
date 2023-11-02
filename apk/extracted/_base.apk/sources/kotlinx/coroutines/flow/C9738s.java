package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR9\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m14357d2 = {"Lkotlinx/coroutines/flow/s;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "k", "Lkotlin/jvm/functions/Function2;", "action", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9738s<T> implements FlowCollector<T> {

    /* renamed from: j */
    private final FlowCollector<T> f25532j;

    /* renamed from: k */
    private final Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> f25533k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m13986f = "Share.kt", m13985l = {419, 423}, m13984m = "onSubscription")
    /* renamed from: kotlinx.coroutines.flow.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9739a extends AbstractC9570d {

        /* renamed from: j */
        Object f25534j;

        /* renamed from: k */
        Object f25535k;

        /* renamed from: l */
        /* synthetic */ Object f25536l;

        /* renamed from: m */
        final /* synthetic */ C9738s<T> f25537m;

        /* renamed from: n */
        int f25538n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9739a(C9738s<T> c9738s, Continuation<? super C9739a> continuation) {
            super(continuation);
            this.f25537m = c9738s;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f25536l = obj;
            this.f25538n |= Integer.MIN_VALUE;
            return this.f25537m.m13387a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xi.n] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m13387a(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C9738s.C9739a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.s$a r0 = (kotlinx.coroutines.flow.C9738s.C9739a) r0
            int r1 = r0.f25538n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25538n = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.s$a r0 = new kotlinx.coroutines.flow.s$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f25536l
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f25538n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            pf.C11586t.m7586b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f25535k
            xi.n r2 = (p430xi.C13824n) r2
            java.lang.Object r4 = r0.f25534j
            kotlinx.coroutines.flow.s r4 = (kotlinx.coroutines.flow.C9738s) r4
            pf.C11586t.m7586b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            pf.C11586t.m7586b(r7)
            xi.n r2 = new xi.n
            kotlinx.coroutines.flow.FlowCollector<T> r7 = r6.f25532j
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r6.f25533k     // Catch: java.lang.Throwable -> L7d
            r0.f25534j = r6     // Catch: java.lang.Throwable -> L7d
            r0.f25535k = r2     // Catch: java.lang.Throwable -> L7d
            r0.f25538n = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.FlowCollector<T> r7 = r4.f25532j
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.C9738s
            if (r2 == 0) goto L7a
            kotlinx.coroutines.flow.s r7 = (kotlinx.coroutines.flow.C9738s) r7
            r2 = 0
            r0.f25534j = r2
            r0.f25535k = r2
            r0.f25538n = r3
            java.lang.Object r7 = r7.m13387a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            kotlin.Unit r7 = kotlin.Unit.f25302a
            return r7
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f25302a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9738s.m13387a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        return this.f25532j.emit(t, continuation);
    }
}
