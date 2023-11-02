package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/z2;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "D0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "B0", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.z2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9922z2 extends CoroutineDispatcher {

    /* renamed from: l */
    public static final C9922z2 f25776l = new C9922z2();

    private C9922z2() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: B0 */
    public void mo2769B0(CoroutineContext coroutineContext, Runnable runnable) {
        C9684c3 c9684c3 = (C9684c3) coroutineContext.mo1458j(C9684c3.f25424l);
        if (c9684c3 != null) {
            c9684c3.f25425k = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public boolean mo2768D0(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
