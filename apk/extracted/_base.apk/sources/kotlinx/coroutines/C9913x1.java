package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m14357d2 = {"Lkotlinx/coroutines/x1;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", "fillInStackTrace", "", "toString", "other", "", "equals", "", "hashCode", "Lkotlinx/coroutines/Job;", "j", "Lkotlinx/coroutines/Job;", "job", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.x1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9913x1 extends CancellationException {

    /* renamed from: j */
    public final transient Job f25772j;

    public C9913x1(String str, Throwable th2, Job job) {
        super(str);
        this.f25772j = job;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C9913x1) {
                C9913x1 c9913x1 = (C9913x1) obj;
                if (!C9612q.m13922c(c9913x1.getMessage(), getMessage()) || !C9612q.m13922c(c9913x1.f25772j, this.f25772j) || !C9612q.m13922c(c9913x1.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C9612q.m13920e(message);
        int hashCode = ((message.hashCode() * 31) + this.f25772j.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f25772j;
    }
}
