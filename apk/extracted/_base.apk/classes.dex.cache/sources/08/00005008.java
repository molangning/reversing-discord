package p388vf;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9567a;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.AbstractC9576i;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9612q;
import p371uf.C12967f;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aZ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m14357d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "receiver", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "c", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: vf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13272c {

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m14357d2 = {"vf/c$a", "Lkotlin/coroutines/jvm/internal/i;", "Lpf/s;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "j", "I", "label", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: vf.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13273a extends AbstractC9576i {

        /* renamed from: j */
        private int f34346j;

        /* renamed from: k */
        final /* synthetic */ Function1 f34347k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13273a(Continuation continuation, Function1 function1) {
            super(continuation);
            this.f34347k = function1;
            C9612q.m13919f(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        protected Object invokeSuspend(Object obj) {
            int i = this.f34346j;
            if (i != 0) {
                if (i == 1) {
                    this.f34346j = 2;
                    C11586t.m7586b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f34346j = 1;
            C11586t.m7586b(obj);
            C9612q.m13919f(this.f34347k, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((Function1) C9604l0.m13938d(this.f34347k, 1)).invoke(this);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m14357d2 = {"vf/c$b", "Lkotlin/coroutines/jvm/internal/d;", "Lpf/s;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "j", "I", "label", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: vf.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13274b extends AbstractC9570d {

        /* renamed from: j */
        private int f34348j;

        /* renamed from: k */
        final /* synthetic */ Function1 f34349k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13274b(Continuation continuation, CoroutineContext coroutineContext, Function1 function1) {
            super(continuation, coroutineContext);
            this.f34349k = function1;
            C9612q.m13919f(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        protected Object invokeSuspend(Object obj) {
            int i = this.f34348j;
            if (i != 0) {
                if (i == 1) {
                    this.f34348j = 2;
                    C11586t.m7586b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f34348j = 1;
            C11586t.m7586b(obj);
            C9612q.m13919f(this.f34349k, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((Function1) C9604l0.m13938d(this.f34349k, 1)).invoke(this);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m14357d2 = {"vf/c$c", "Lkotlin/coroutines/jvm/internal/i;", "Lpf/s;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "j", "I", "label", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: vf.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13275c extends AbstractC9576i {

        /* renamed from: j */
        private int f34350j;

        /* renamed from: k */
        final /* synthetic */ Function2 f34351k;

        /* renamed from: l */
        final /* synthetic */ Object f34352l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13275c(Continuation continuation, Function2 function2, Object obj) {
            super(continuation);
            this.f34351k = function2;
            this.f34352l = obj;
            C9612q.m13919f(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        protected Object invokeSuspend(Object obj) {
            int i = this.f34350j;
            if (i != 0) {
                if (i == 1) {
                    this.f34350j = 2;
                    C11586t.m7586b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f34350j = 1;
            C11586t.m7586b(obj);
            C9612q.m13919f(this.f34351k, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((Function2) C9604l0.m13938d(this.f34351k, 2)).invoke(this.f34352l, this);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m14357d2 = {"vf/c$d", "Lkotlin/coroutines/jvm/internal/d;", "Lpf/s;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "j", "I", "label", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: vf.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13276d extends AbstractC9570d {

        /* renamed from: j */
        private int f34353j;

        /* renamed from: k */
        final /* synthetic */ Function2 f34354k;

        /* renamed from: l */
        final /* synthetic */ Object f34355l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13276d(Continuation continuation, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(continuation, coroutineContext);
            this.f34354k = function2;
            this.f34355l = obj;
            C9612q.m13919f(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        protected Object invokeSuspend(Object obj) {
            int i = this.f34353j;
            if (i != 0) {
                if (i == 1) {
                    this.f34353j = 2;
                    C11586t.m7586b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f34353j = 1;
            C11586t.m7586b(obj);
            C9612q.m13919f(this.f34354k, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((Function2) C9604l0.m13938d(this.f34354k, 2)).invoke(this.f34355l, this);
        }
    }

    /* renamed from: a */
    public static <T> Continuation<Unit> m2872a(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> completion) {
        C9612q.m13917h(function1, "<this>");
        C9612q.m13917h(completion, "completion");
        Continuation<?> m13978a = C9573g.m13978a(completion);
        if (function1 instanceof AbstractC9567a) {
            return ((AbstractC9567a) function1).create(m13978a);
        }
        CoroutineContext context = m13978a.getContext();
        if (context == C12967f.f33721j) {
            return new C13273a(m13978a, function1);
        }
        return new C13274b(m13978a, context, function1);
    }

    /* renamed from: b */
    public static <R, T> Continuation<Unit> m2871b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> completion) {
        C9612q.m13917h(function2, "<this>");
        C9612q.m13917h(completion, "completion");
        Continuation<?> m13978a = C9573g.m13978a(completion);
        if (function2 instanceof AbstractC9567a) {
            return ((AbstractC9567a) function2).create(r, m13978a);
        }
        CoroutineContext context = m13978a.getContext();
        if (context == C12967f.f33721j) {
            return new C13275c(m13978a, function2, r);
        }
        return new C13276d(m13978a, context, function2, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> Continuation<T> m2870c(Continuation<? super T> continuation) {
        AbstractC9570d abstractC9570d;
        Continuation<T> continuation2;
        C9612q.m13917h(continuation, "<this>");
        if (continuation instanceof AbstractC9570d) {
            abstractC9570d = (AbstractC9570d) continuation;
        } else {
            abstractC9570d = null;
        }
        if (abstractC9570d != null && (continuation2 = (Continuation<T>) abstractC9570d.intercepted()) != null) {
            return continuation2;
        }
        return continuation;
    }
}