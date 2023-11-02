package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Lkotlinx/coroutines/f1;", "Lkotlinx/coroutines/d2;", "", "cause", "", "W", "Lkotlinx/coroutines/d1;", "n", "Lkotlinx/coroutines/d1;", "handle", "<init>", "(Lkotlinx/coroutines/d1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9704f1 extends AbstractC9689d2 {

    /* renamed from: n */
    private final InterfaceC9688d1 f25450n;

    public C9704f1(InterfaceC9688d1 interfaceC9688d1) {
        this.f25450n = interfaceC9688d1;
    }

    @Override // kotlinx.coroutines.AbstractC9687d0
    /* renamed from: W */
    public void mo12976W(Throwable th2) {
        this.f25450n.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo12976W(th2);
        return Unit.f25302a;
    }
}
