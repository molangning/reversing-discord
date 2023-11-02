package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/y1;", "Lkotlinx/coroutines/u;", "", "cause", "", "W", "", "c", "Lkotlinx/coroutines/w;", "n", "Lkotlinx/coroutines/w;", "childJob", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/w;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9903v extends AbstractC9917y1 implements InterfaceC9898u {

    /* renamed from: n */
    public final InterfaceC9907w f25763n;

    public C9903v(InterfaceC9907w interfaceC9907w) {
        this.f25763n = interfaceC9907w;
    }

    @Override // kotlinx.coroutines.AbstractC9687d0
    /* renamed from: W */
    public void mo12976W(Throwable th2) {
        this.f25763n.mo12977I(m13557X());
    }

    @Override // kotlinx.coroutines.InterfaceC9898u
    /* renamed from: c */
    public boolean mo12986c(Throwable th2) {
        return m13557X().mo1455R(th2);
    }

    @Override // kotlinx.coroutines.InterfaceC9898u
    public Job getParent() {
        return m13557X();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo12976W(th2);
        return Unit.f25302a;
    }
}
