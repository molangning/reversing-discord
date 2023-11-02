package com.github.yamill.orientation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.C9904v0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aP\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\n"}, m14357d2 = {"T", "R", "", "intervalMs", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function2;", "", "destinationFunction", "a", "react-native-orientation_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.github.yamill.orientation.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4351b {

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"T", "R", "param1", "param2", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.github.yamill.orientation.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4352a<R, T> extends AbstractC9614s implements Function2<T, R, Unit> {

        /* renamed from: j */
        final /* synthetic */ Ref$ObjectRef<T> f11129j;

        /* renamed from: k */
        final /* synthetic */ Ref$ObjectRef<R> f11130k;

        /* renamed from: l */
        final /* synthetic */ Ref$ObjectRef<Job> f11131l;

        /* renamed from: m */
        final /* synthetic */ CoroutineScope f11132m;

        /* renamed from: n */
        final /* synthetic */ long f11133n;

        /* renamed from: o */
        final /* synthetic */ Function2<T, R, Unit> f11134o;

        @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m14357d2 = {"T", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        @InterfaceC9571e(m13987c = "com.github.yamill.orientation.ThrottleUtilsKt$throttleLatest$1$1", m13986f = "ThrottleUtils.kt", m13985l = {25}, m13984m = "invokeSuspend")
        /* renamed from: com.github.yamill.orientation.b$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C4353a extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            int f11135j;

            /* renamed from: k */
            final /* synthetic */ long f11136k;

            /* renamed from: l */
            final /* synthetic */ Function2<T, R, Unit> f11137l;

            /* renamed from: m */
            final /* synthetic */ Ref$ObjectRef<T> f11138m;

            /* renamed from: n */
            final /* synthetic */ Ref$ObjectRef<R> f11139n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C4353a(long j, Function2<? super T, ? super R, Unit> function2, Ref$ObjectRef<T> ref$ObjectRef, Ref$ObjectRef<R> ref$ObjectRef2, Continuation<? super C4353a> continuation) {
                super(2, continuation);
                this.f11136k = j;
                this.f11137l = function2;
                this.f11138m = ref$ObjectRef;
                this.f11139n = ref$ObjectRef2;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C4353a(this.f11136k, this.f11137l, this.f11138m, this.f11139n, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C4353a) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                Object m2869d;
                m2869d = C13277d.m2869d();
                int i = this.f11135j;
                if (i != 0) {
                    if (i == 1) {
                        C11586t.m7586b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C11586t.m7586b(obj);
                    long j = this.f11136k;
                    this.f11135j = 1;
                    if (C9904v0.m12985a(j, this) == m2869d) {
                        return m2869d;
                    }
                }
                this.f11137l.invoke(this.f11138m.f25329j, this.f11139n.f25329j);
                return Unit.f25302a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C4352a(Ref$ObjectRef<T> ref$ObjectRef, Ref$ObjectRef<R> ref$ObjectRef2, Ref$ObjectRef<Job> ref$ObjectRef3, CoroutineScope coroutineScope, long j, Function2<? super T, ? super R, Unit> function2) {
            super(2);
            this.f11129j = ref$ObjectRef;
            this.f11130k = ref$ObjectRef2;
            this.f11131l = ref$ObjectRef3;
            this.f11132m = coroutineScope;
            this.f11133n = j;
            this.f11134o = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m29958a(T t, R r) {
            Job m13179d;
            this.f11129j.f25329j = t;
            this.f11130k.f25329j = r;
            Job job = this.f11131l.f25329j;
            boolean z = false;
            if (job != null && !job.mo13507i()) {
                z = true;
            }
            if (!z) {
                Ref$ObjectRef<Job> ref$ObjectRef = this.f11131l;
                m13179d = C9818l.m13179d(this.f11132m, null, null, new C4353a(this.f11133n, this.f11134o, this.f11129j, this.f11130k, null), 3, null);
                ref$ObjectRef.f25329j = (T) m13179d;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            m29958a(obj, obj2);
            return Unit.f25302a;
        }
    }

    /* renamed from: a */
    public static final <T, R> Function2<T, R, Unit> m29959a(long j, CoroutineScope coroutineScope, Function2<? super T, ? super R, Unit> destinationFunction) {
        C9612q.m13917h(coroutineScope, "coroutineScope");
        C9612q.m13917h(destinationFunction, "destinationFunction");
        return new C4352a(new Ref$ObjectRef(), new Ref$ObjectRef(), new Ref$ObjectRef(), coroutineScope, j, destinationFunction);
    }
}