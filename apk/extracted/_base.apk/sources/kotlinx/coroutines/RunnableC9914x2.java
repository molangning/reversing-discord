package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C9764b0;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m14357d2 = {"Lkotlinx/coroutines/x2;", "U", "T", "Lkotlinx/coroutines/internal/b0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "", "x0", "()Ljava/lang/String;", "", "m", "J", "time", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(JLkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.x2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class RunnableC9914x2<U, T extends U> extends C9764b0<T> implements Runnable {

    /* renamed from: m */
    public final long f25773m;

    public RunnableC9914x2(long j, Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.f25773m = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        m13532K(C9918y2.m12958a(this.f25773m, this));
    }

    @Override // kotlinx.coroutines.AbstractC9670a, kotlinx.coroutines.C9696e2
    /* renamed from: x0 */
    public String mo12967x0() {
        return super.mo12967x0() + "(timeMillis=" + this.f25773m + ')';
    }
}
