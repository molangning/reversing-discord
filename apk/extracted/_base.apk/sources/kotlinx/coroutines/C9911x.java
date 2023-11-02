package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.selects.InterfaceC9880c;
import kotlinx.coroutines.selects.InterfaceC9881d;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m14357d2 = {"Lkotlinx/coroutines/x;", "T", "Lkotlinx/coroutines/e2;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/selects/c;", "o", "()Ljava/lang/Object;", "H", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "b", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;)V", "value", "", "V", "(Ljava/lang/Object;)Z", "h0", "()Z", "onCancelComplete", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C9911x<T> extends C9696e2 implements CompletableDeferred<T>, InterfaceC9880c<T> {
    public C9911x(Job job) {
        super(true);
        m13502o0(job);
    }

    @Override // kotlinx.coroutines.InterfaceC9851s0
    /* renamed from: H */
    public Object mo12975H(Continuation<? super T> continuation) {
        Object m13538G = m13538G(continuation);
        C13277d.m2869d();
        return m13538G;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    /* renamed from: V */
    public boolean mo12974V(T t) {
        return m13499s0(t);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9880c
    /* renamed from: b */
    public <R> void mo2133b(InterfaceC9881d<? super R> interfaceC9881d, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        m13536H0(interfaceC9881d, function2);
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: h0 */
    public boolean mo12948h0() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC9851s0
    /* renamed from: o */
    public T mo12973o() {
        return (T) m13510c0();
    }
}
