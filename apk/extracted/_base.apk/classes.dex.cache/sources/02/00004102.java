package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.selects.InterfaceC9881d;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B<\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR3\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m14357d2 = {"Lkotlinx/coroutines/q2;", "T", "R", "Lkotlinx/coroutines/d2;", "", "cause", "", "W", "Lkotlinx/coroutines/selects/d;", "n", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "o", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.q2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9845q2<T, R> extends AbstractC9689d2 {

    /* renamed from: n */
    private final InterfaceC9881d<R> f25666n;

    /* renamed from: o */
    private final Function2<T, Continuation<? super R>, Object> f25667o;

    /* JADX WARN: Multi-variable type inference failed */
    public C9845q2(InterfaceC9881d<? super R> interfaceC9881d, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f25666n = interfaceC9881d;
        this.f25667o = function2;
    }

    @Override // kotlinx.coroutines.AbstractC9687d0
    /* renamed from: W */
    public void mo12976W(Throwable th2) {
        if (this.f25666n.mo13018s()) {
            m13557X().m13533J0(this.f25666n, this.f25667o);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo12976W(th2);
        return Unit.f25302a;
    }
}