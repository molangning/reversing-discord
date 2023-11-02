package p430xi;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C9764b0;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010¨\u0006\b"}, m14357d2 = {"Lxi/n;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "a", "Lkotlinx/coroutines/Job;", "collectJob", "b", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: xi.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13827p {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(ILkotlin/coroutines/CoroutineContext$b;)Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: xi.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13828a extends AbstractC9614s implements Function2<Integer, CoroutineContext.InterfaceC9564b, Integer> {

        /* renamed from: j */
        final /* synthetic */ C13824n<?> f35613j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13828a(C13824n<?> c13824n) {
            super(2);
            this.f35613j = c13824n;
        }

        /* renamed from: a */
        public final Integer m1442a(int i, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            int i2;
            CoroutineContext.InterfaceC9566c<?> key = interfaceC9564b.getKey();
            CoroutineContext.InterfaceC9564b mo1458j = this.f35613j.f35606k.mo1458j(key);
            if (key != Job.f25404c) {
                if (interfaceC9564b != mo1458j) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = i + 1;
                }
                return Integer.valueOf(i2);
            }
            Job job = (Job) mo1458j;
            Job m1443b = C13827p.m1443b((Job) interfaceC9564b, job);
            if (m1443b == job) {
                if (job != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + m1443b + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            return m1442a(num.intValue(), interfaceC9564b);
        }
    }

    /* renamed from: a */
    public static final void m1444a(C13824n<?> c13824n, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.mo1456t0(0, new C13828a(c13824n))).intValue() == c13824n.f35607l) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c13824n.f35606k + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final Job m1443b(Job job, Job job2) {
        while (job != null) {
            if (job == job2) {
                return job;
            }
            if (!(job instanceof C9764b0)) {
                return job;
            }
            job = ((C9764b0) job).m13334Z0();
        }
        return null;
    }
}
