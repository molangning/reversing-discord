package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m14357d2 = {"Lkotlinx/coroutines/o2;", "T", "Lkotlinx/coroutines/d2;", "", "cause", "", "W", "Lkotlinx/coroutines/p;", "n", "Lkotlinx/coroutines/p;", "continuation", "<init>", "(Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.o2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9837o2<T> extends AbstractC9689d2 {

    /* renamed from: n */
    private final C9838p<T> f25654n;

    /* JADX WARN: Multi-variable type inference failed */
    public C9837o2(C9838p<? super T> c9838p) {
        this.f25654n = c9838p;
    }

    @Override // kotlinx.coroutines.AbstractC9687d0
    /* renamed from: W */
    public void mo12976W(Throwable th2) {
        Object m13504l0 = m13557X().m13504l0();
        if (m13504l0 instanceof C9676b0) {
            C9838p<T> c9838p = this.f25654n;
            C11583s.C11584a c11584a = C11583s.f30090k;
            c9838p.resumeWith(C11583s.m7596b(C11586t.m7587a(((C9676b0) m13504l0).f25415a)));
            return;
        }
        C9838p<T> c9838p2 = this.f25654n;
        C11583s.C11584a c11584a2 = C11583s.f30090k;
        c9838p2.resumeWith(C11583s.m7596b(C9705f2.m13466h(m13504l0)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo12976W(th2);
        return Unit.f25302a;
    }
}