package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Lkotlinx/coroutines/t;", "Lkotlinx/coroutines/y1;", "", "cause", "", "W", "Lkotlinx/coroutines/p;", "n", "Lkotlinx/coroutines/p;", "child", "<init>", "(Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9894t extends AbstractC9917y1 {

    /* renamed from: n */
    public final C9838p<?> f25760n;

    public C9894t(C9838p<?> c9838p) {
        this.f25760n = c9838p;
    }

    @Override // kotlinx.coroutines.AbstractC9687d0
    /* renamed from: W */
    public void mo12976W(Throwable th2) {
        C9838p<?> c9838p = this.f25760n;
        c9838p.m13149I(c9838p.mo13123x(m13557X()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo12976W(th2);
        return Unit.f25302a;
    }
}
