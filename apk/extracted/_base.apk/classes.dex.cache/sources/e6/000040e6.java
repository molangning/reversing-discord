package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m14357d2 = {"Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/u;", "", "dispose", "", "cause", "", "c", "", "toString", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "parent", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.k2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9817k2 implements InterfaceC9688d1, InterfaceC9898u {

    /* renamed from: j */
    public static final C9817k2 f25638j = new C9817k2();

    private C9817k2() {
    }

    @Override // kotlinx.coroutines.InterfaceC9898u
    /* renamed from: c */
    public boolean mo12986c(Throwable th2) {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC9688d1
    public void dispose() {
    }

    @Override // kotlinx.coroutines.InterfaceC9898u
    public Job getParent() {
        return null;
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}