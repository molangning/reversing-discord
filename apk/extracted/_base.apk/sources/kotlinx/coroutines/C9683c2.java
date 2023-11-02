package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u000b*\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¨\u0006\u0010"}, m14357d2 = {"Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/z;", "a", "Lkotlinx/coroutines/d1;", "handle", "f", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "c", "h", "g", "e", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/JobKt")
/* renamed from: kotlinx.coroutines.c2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9683c2 {
    /* renamed from: a */
    public static final InterfaceC9919z m13565a(Job job) {
        return new C9921z1(job);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9919z m13564b(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return C9673a2.m13583a(job);
    }

    /* renamed from: c */
    public static final void m13563c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.mo1458j(Job.f25404c);
        if (job != null) {
            job.mo2104h(cancellationException);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m13562d(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C9673a2.m13581c(coroutineContext, cancellationException);
    }

    /* renamed from: e */
    public static final void m13561e(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence<Job> mo13498t;
        Job job = (Job) coroutineContext.mo1458j(Job.f25404c);
        if (job != null && (mo13498t = job.mo13498t()) != null) {
            for (Job job2 : mo13498t) {
                job2.mo2104h(cancellationException);
            }
        }
    }

    /* renamed from: f */
    public static final InterfaceC9688d1 m13560f(Job job, InterfaceC9688d1 interfaceC9688d1) {
        return job.mo13521Q(new C9704f1(interfaceC9688d1));
    }

    /* renamed from: g */
    public static final void m13559g(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.mo1458j(Job.f25404c);
        if (job != null) {
            C9673a2.m13575i(job);
        }
    }

    /* renamed from: h */
    public static final void m13558h(Job job) {
        if (!job.mo2067a()) {
            throw job.mo13542D();
        }
    }
}
