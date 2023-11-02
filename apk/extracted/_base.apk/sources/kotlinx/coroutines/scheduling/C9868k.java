package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.C9839p0;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, m14357d2 = {"Lkotlinx/coroutines/scheduling/k;", "Lkotlinx/coroutines/scheduling/h;", "", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "l", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lkotlinx/coroutines/scheduling/i;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/i;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9868k extends AbstractRunnableC9865h {

    /* renamed from: l */
    public final Runnable f25711l;

    public C9868k(Runnable runnable, long j, InterfaceC9866i interfaceC9866i) {
        super(j, interfaceC9866i);
        this.f25711l = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f25711l.run();
        } finally {
            this.f25709k.mo13053a();
        }
    }

    public String toString() {
        return "Task[" + C9839p0.m13120a(this.f25711l) + '@' + C9839p0.m13119b(this.f25711l) + ", " + this.f25708j + ", " + this.f25709k + ']';
    }
}
