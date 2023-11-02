package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m14357d2 = {"Lkotlinx/coroutines/i;", "Lkotlinx/coroutines/i1;", "Ljava/lang/Thread;", "q", "Ljava/lang/Thread;", "R0", "()Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9752i extends AbstractC9755i1 {

    /* renamed from: q */
    private final Thread f25552q;

    public C9752i(Thread thread) {
        this.f25552q = thread;
    }

    @Override // kotlinx.coroutines.AbstractC9812j1
    /* renamed from: R0 */
    protected Thread mo13115R0() {
        return this.f25552q;
    }
}