package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC9760i2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
@InterfaceC9571e(m13987c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m13986f = "RepeatOnLifecycle.kt", m13985l = {84}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: j */
    int f4439j;

    /* renamed from: k */
    private /* synthetic */ Object f4440k;

    /* renamed from: l */
    final /* synthetic */ Lifecycle f4441l;

    /* renamed from: m */
    final /* synthetic */ Lifecycle.State f4442m;

    /* renamed from: n */
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f4443n;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m13986f = "RepeatOnLifecycle.kt", m13985l = {166}, m13984m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C16611 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        Object f4444j;

        /* renamed from: k */
        Object f4445k;

        /* renamed from: l */
        Object f4446l;

        /* renamed from: m */
        Object f4447m;

        /* renamed from: n */
        Object f4448n;

        /* renamed from: o */
        Object f4449o;

        /* renamed from: p */
        int f4450p;

        /* renamed from: q */
        final /* synthetic */ Lifecycle f4451q;

        /* renamed from: r */
        final /* synthetic */ Lifecycle.State f4452r;

        /* renamed from: s */
        final /* synthetic */ CoroutineScope f4453s;

        /* renamed from: t */
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f4454t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C16611(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C16611> continuation) {
            super(2, continuation);
            this.f4451q = lifecycle;
            this.f4452r = state;
            this.f4453s = coroutineScope;
            this.f4454t = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C16611(this.f4451q, this.f4452r, this.f4453s, this.f4454t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16611) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.C16611.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.f4441l = lifecycle;
        this.f4442m = state;
        this.f4443n = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f4441l, this.f4442m, this.f4443n, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f4440k = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        m2869d = C13277d.m2869d();
        int i = this.f4439j;
        if (i != 0) {
            if (i == 1) {
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f4440k;
            AbstractC9760i2 mo2767F0 = C9677b1.m13568c().mo2767F0();
            C16611 c16611 = new C16611(this.f4441l, this.f4442m, coroutineScope, this.f4443n, null);
            this.f4439j = 1;
            if (C9810j.m13190g(mo2767F0, c16611, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}
