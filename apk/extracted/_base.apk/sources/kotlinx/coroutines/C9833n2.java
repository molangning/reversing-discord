package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.internal.C9791p;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/g;", "", "cause", "", "a", "", "toString", "Lkotlinx/coroutines/internal/p;", "j", "Lkotlinx/coroutines/internal/p;", "node", "<init>", "(Lkotlinx/coroutines/internal/p;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.n2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C9833n2 extends AbstractC9741g {

    /* renamed from: j */
    private final C9791p f25652j;

    public C9833n2(C9791p c9791p) {
        this.f25652j = c9791p;
    }

    @Override // kotlinx.coroutines.AbstractC9834o
    /* renamed from: a */
    public void mo2138a(Throwable th2) {
        this.f25652j.mo2042R();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo2138a(th2);
        return Unit.f25302a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f25652j + ']';
    }
}
