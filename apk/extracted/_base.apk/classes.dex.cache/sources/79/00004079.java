package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.ProducerScope;
import p371uf.C12967f;
import p409wi.EnumC13603e;
import p430xi.AbstractC13808d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BR\u0012(\u0010\u0015\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014R9\u0010\u0015\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00108\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m14357d2 = {"Lkotlinx/coroutines/flow/b;", "T", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "", "d", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lwi/e;", "onBufferOverflow", "Lxi/d;", "e", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "n", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILwi/e;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9708b<T> extends C9710c<T> {

    /* renamed from: n */
    private final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> f25462n;

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m13986f = "Builders.kt", m13985l = {336}, m13984m = "collectTo")
    /* renamed from: kotlinx.coroutines.flow.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9709a extends AbstractC9570d {

        /* renamed from: j */
        Object f25463j;

        /* renamed from: k */
        /* synthetic */ Object f25464k;

        /* renamed from: l */
        final /* synthetic */ C9708b<T> f25465l;

        /* renamed from: m */
        int f25466m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9709a(C9708b<T> c9708b, Continuation<? super C9709a> continuation) {
            super(continuation);
            this.f25465l = c9708b;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f25464k = obj;
            this.f25466m |= Integer.MIN_VALUE;
            return this.f25465l.mo1465d(null, this);
        }
    }

    public /* synthetic */ C9708b(Function2 function2, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? C12967f.f33721j : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC13603e.SUSPEND : enumC13603e);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    @Override // kotlinx.coroutines.flow.C9710c, p430xi.AbstractC13808d
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo1465d(kotlinx.coroutines.channels.ProducerScope<? super T> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C9708b.C9709a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.C9708b.C9709a) r0
            int r1 = r0.f25466m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25466m = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25464k
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f25466m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f25463j
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            pf.C11586t.m7586b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            pf.C11586t.m7586b(r6)
            r0.f25463j = r5
            r0.f25466m = r3
            java.lang.Object r6 = super.mo1465d(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.mo2048x()
            if (r5 == 0) goto L4c
            kotlin.Unit r5 = kotlin.Unit.f25302a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9708b.mo1465d(kotlinx.coroutines.channels.ProducerScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p430xi.AbstractC13808d
    /* renamed from: e */
    protected AbstractC13808d<T> mo1461e(CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        return new C9708b(this.f25462n, coroutineContext, i, enumC13603e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9708b(Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        super(function2, coroutineContext, i, enumC13603e);
        this.f25462n = function2;
    }
}