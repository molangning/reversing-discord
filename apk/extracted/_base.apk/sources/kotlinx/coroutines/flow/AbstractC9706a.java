package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m14357d2 = {"Lkotlinx/coroutines/flow/a;", "T", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9706a<T> implements Flow<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.AbstractFlow", m13986f = "Flow.kt", m13985l = {230}, m13984m = "collect")
    /* renamed from: kotlinx.coroutines.flow.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9707a extends AbstractC9570d {

        /* renamed from: j */
        Object f25458j;

        /* renamed from: k */
        /* synthetic */ Object f25459k;

        /* renamed from: l */
        final /* synthetic */ AbstractC9706a<T> f25460l;

        /* renamed from: m */
        int f25461m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9707a(AbstractC9706a<T> abstractC9706a, Continuation<? super C9707a> continuation) {
            super(continuation);
            this.f25460l = abstractC9706a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f25459k = obj;
            this.f25461m |= Integer.MIN_VALUE;
            return this.f25460l.collect(null, this);
        }
    }

    /* renamed from: b */
    public abstract Object mo13445b(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractC9706a.C9707a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.AbstractC9706a.C9707a) r0
            int r1 = r0.f25461m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25461m = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25459k
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f25461m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f25458j
            xi.n r6 = (p430xi.C13824n) r6
            pf.C11586t.m7586b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            pf.C11586t.m7586b(r7)
            xi.n r7 = new xi.n
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f25458j = r7     // Catch: java.lang.Throwable -> L55
            r0.f25461m = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo13445b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.f25302a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC9706a.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
