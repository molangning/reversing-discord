package p409wi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.C9806x;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0011"}, m14357d2 = {"Lwi/z;", "E", "Lwi/y;", "", "R", "", "a0", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "o", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "pollResult", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13631z<E> extends C13630y<E> {

    /* renamed from: o */
    public final Function1<E, Unit> f35025o;

    /* JADX WARN: Multi-variable type inference failed */
    public C13631z(E e, CancellableContinuation<? super Unit> cancellableContinuation, Function1<? super E, Unit> function1) {
        super(e, cancellableContinuation);
        this.f35025o = function1;
    }

    @Override // kotlinx.coroutines.internal.C9791p
    /* renamed from: R */
    public boolean mo2042R() {
        if (!super.mo2042R()) {
            return false;
        }
        mo2041a0();
        return true;
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: a0 */
    public void mo2041a0() {
        C9806x.m13200b(this.f35025o, mo2045X(), this.f35024n.getContext());
    }
}