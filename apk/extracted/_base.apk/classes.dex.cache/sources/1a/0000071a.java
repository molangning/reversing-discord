package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9683c2;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/i;", "Landroidx/lifecycle/l;", "", "c", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$b;", "event", "a", "Landroidx/lifecycle/Lifecycle;", "j", "Landroidx/lifecycle/Lifecycle;", "b", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "k", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-runtime-ktx_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC1690i implements InterfaceC1695l {

    /* renamed from: j */
    private final Lifecycle f4390j;

    /* renamed from: k */
    private final CoroutineContext f4391k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m13986f = "Lifecycle.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1652a extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f4392j;

        /* renamed from: k */
        private /* synthetic */ Object f4393k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1652a(Continuation<? super C1652a> continuation) {
            super(2, continuation);
            LifecycleCoroutineScopeImpl.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1652a c1652a = new C1652a(continuation);
            c1652a.f4393k = obj;
            return c1652a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1652a) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            C13277d.m2869d();
            if (this.f4392j == 0) {
                C11586t.m7586b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f4393k;
                if (LifecycleCoroutineScopeImpl.this.m36127b().mo36124b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl.this.m36127b().mo36125a(LifecycleCoroutineScopeImpl.this);
                } else {
                    C9683c2.m13562d(coroutineScope.getCoroutineContext(), null, 1, null);
                }
                return Unit.f25302a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        C9612q.m13917h(lifecycle, "lifecycle");
        C9612q.m13917h(coroutineContext, "coroutineContext");
        this.f4390j = lifecycle;
        this.f4391k = coroutineContext;
        if (m36127b().mo36124b() == Lifecycle.State.DESTROYED) {
            C9683c2.m13562d(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner source, Lifecycle.EnumC1651b event) {
        C9612q.m13917h(source, "source");
        C9612q.m13917h(event, "event");
        if (m36127b().mo36124b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            m36127b().mo36123c(this);
            C9683c2.m13562d(getCoroutineContext(), null, 1, null);
        }
    }

    /* renamed from: b */
    public Lifecycle m36127b() {
        return this.f4390j;
    }

    /* renamed from: c */
    public final void m36126c() {
        C9818l.m13179d(this, C9677b1.m13568c().mo2767F0(), null, new C1652a(null), 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f4391k;
    }
}