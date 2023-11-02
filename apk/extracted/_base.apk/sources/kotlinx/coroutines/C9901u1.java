package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R&\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/u1;", "Lkotlinx/coroutines/n;", "", "cause", "", "a", "", "toString", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "j", "Lkotlin/jvm/functions/Function1;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.u1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C9901u1 extends AbstractC9827n {

    /* renamed from: j */
    private final Function1<Throwable, Unit> f25762j;

    /* JADX WARN: Multi-variable type inference failed */
    public C9901u1(Function1<? super Throwable, Unit> function1) {
        this.f25762j = function1;
    }

    @Override // kotlinx.coroutines.AbstractC9834o
    /* renamed from: a */
    public void mo2138a(Throwable th2) {
        this.f25762j.invoke(th2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo2138a(th2);
        return Unit.f25302a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C9839p0.m13120a(this.f25762j) + '@' + C9839p0.m13119b(this) + ']';
    }
}
