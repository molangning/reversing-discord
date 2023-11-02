package p409wi;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.coroutines.C9746h0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.EnumC9828n0;
import kotlinx.coroutines.channels.ProducerScope;
import p371uf.C12967f;
import pf.C11583s;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ab\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0096\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m14357d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/Function0;", "", "block", "a", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lwi/t;", "b", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lwi/t;", "Lwi/e;", "onBufferOverflow", "Lkotlinx/coroutines/n0;", ViewProps.START, "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILwi/e;Lkotlinx/coroutines/n0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lwi/t;", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: wi.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13619q {

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.channels.ProduceKt", m13986f = "Produce.kt", m13985l = {153}, m13984m = "awaitClose")
    /* renamed from: wi.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13620a extends AbstractC9570d {

        /* renamed from: j */
        Object f35018j;

        /* renamed from: k */
        Object f35019k;

        /* renamed from: l */
        /* synthetic */ Object f35020l;

        /* renamed from: m */
        int f35021m;

        C13620a(Continuation<? super C13620a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f35020l = obj;
            this.f35021m |= Integer.MIN_VALUE;
            return C13619q.m2074a(null, null, this);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke"}, m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: wi.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13621b extends AbstractC9614s implements Function1<Throwable, Unit> {

        /* renamed from: j */
        final /* synthetic */ CancellableContinuation<Unit> f35022j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13621b(CancellableContinuation<? super Unit> cancellableContinuation) {
            super(1);
            this.f35022j = cancellableContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f25302a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            CancellableContinuation<Unit> cancellableContinuation = this.f35022j;
            C11583s.C11584a c11584a = C11583s.f30090k;
            cancellableContinuation.resumeWith(C11583s.m7596b(Unit.f25302a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m2074a(kotlinx.coroutines.channels.ProducerScope<?> r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof p409wi.C13619q.C13620a
            if (r0 == 0) goto L13
            r0 = r6
            wi.q$a r0 = (p409wi.C13619q.C13620a) r0
            int r1 = r0.f35021m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35021m = r1
            goto L18
        L13:
            wi.q$a r0 = new wi.q$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35020l
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f35021m
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f35019k
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.f35018j
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            pf.C11586t.m7586b(r6)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r4 = move-exception
            goto L80
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            pf.C11586t.m7586b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlinx.coroutines.Job$b r2 = kotlinx.coroutines.Job.f25404c
            kotlin.coroutines.CoroutineContext$b r6 = r6.mo1458j(r2)
            if (r6 != r4) goto L4d
            r6 = r3
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L84
            r0.f35018j = r4     // Catch: java.lang.Throwable -> L32
            r0.f35019k = r5     // Catch: java.lang.Throwable -> L32
            r0.f35021m = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.p r6 = new kotlinx.coroutines.p     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.Continuation r2 = p388vf.C13271b.m2874c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.m13155C()     // Catch: java.lang.Throwable -> L32
            wi.q$b r2 = new wi.q$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.mo2052c(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.m13122y()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = p388vf.C13271b.m2873d()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L77
            kotlin.coroutines.jvm.internal.C9573g.m13976c(r0)     // Catch: java.lang.Throwable -> L32
        L77:
            if (r4 != r1) goto L7a
            return r1
        L7a:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f25302a
            return r4
        L80:
            r5.invoke()
            throw r4
        L84:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p409wi.C13619q.m2074a(kotlinx.coroutines.channels.ProducerScope, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public static final <E> InterfaceC13624t<E> m2073b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return m2072c(coroutineScope, coroutineContext, i, EnumC13603e.SUSPEND, EnumC9828n0.DEFAULT, null, function2);
    }

    /* renamed from: c */
    public static final <E> InterfaceC13624t<E> m2072c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e, EnumC9828n0 enumC9828n0, Function1<? super Throwable, Unit> function1, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        C13622r c13622r = new C13622r(C9746h0.m13379e(coroutineScope, coroutineContext), C13607h.m2102b(i, enumC13603e, null, 4, null));
        if (function1 != null) {
            c13622r.mo13521Q(function1);
        }
        c13622r.m13588Y0(enumC9828n0, c13622r, function2);
        return c13622r;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC13624t m2071d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = C12967f.f33721j;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m2073b(coroutineScope, coroutineContext, i, function2);
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC13624t m2070e(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e, EnumC9828n0 enumC9828n0, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = C12967f.f33721j;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            enumC13603e = EnumC13603e.SUSPEND;
        }
        EnumC13603e enumC13603e2 = enumC13603e;
        if ((i2 & 8) != 0) {
            enumC9828n0 = EnumC9828n0.DEFAULT;
        }
        EnumC9828n0 enumC9828n02 = enumC9828n0;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return m2072c(coroutineScope, coroutineContext2, i3, enumC13603e2, enumC9828n02, function1, function2);
    }
}
