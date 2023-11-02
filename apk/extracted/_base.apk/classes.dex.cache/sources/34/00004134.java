package kotlinx.coroutines;

import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.selects.InterfaceC9880c;
import kotlinx.coroutines.selects.InterfaceC9881d;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JJ\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m14357d2 = {"Lkotlinx/coroutines/t0;", "T", "Lkotlinx/coroutines/a;", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/selects/c;", "o", "()Ljava/lang/Object;", "R", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "b", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", AppStateModule.APP_STATE_ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9895t0<T> extends AbstractC9670a<T> implements InterfaceC9851s0<T>, InterfaceC9880c<T> {
    public C9895t0(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9880c
    /* renamed from: b */
    public <R> void mo2133b(InterfaceC9881d<? super R> interfaceC9881d, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        m13536H0(interfaceC9881d, function2);
    }

    @Override // kotlinx.coroutines.InterfaceC9851s0
    /* renamed from: o */
    public T mo12973o() {
        return (T) m13510c0();
    }
}