package p409wi;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractC9670a;
import kotlinx.coroutines.C9696e2;
import kotlinx.coroutines.C9913x1;
import kotlinx.coroutines.selects.InterfaceC9880c;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010%\u001a\u00020$\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J\u001f\u0010\u000b\u001a\u00020\u00032\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0 8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m14357d2 = {"Lwi/g;", "E", "Lkotlinx/coroutines/a;", "", "Lwi/f;", "", "cause", "", "g", "Lkotlin/Function1;", "handler", "c", "Lwi/i;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "element", "w", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "M", "l", "Lwi/f;", "Z0", "()Lwi/f;", "_channel", "x", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/c;", "e", "()Lkotlinx/coroutines/selects/c;", "onReceiveCatching", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "initParentJob", AppStateModule.APP_STATE_ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Lwi/f;ZZ)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C13606g<E> extends AbstractC9670a<Unit> implements InterfaceC13604f<E> {

    /* renamed from: l */
    private final InterfaceC13604f<E> f35010l;

    public C13606g(CoroutineContext coroutineContext, InterfaceC13604f<E> interfaceC13604f, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.f35010l = interfaceC13604f;
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: M */
    public void mo2106M(Throwable th2) {
        CancellationException m13524O0 = C9696e2.m13524O0(this, th2, null, 1, null);
        this.f35010l.mo2060h(m13524O0);
        m13532K(m13524O0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z0 */
    public final InterfaceC13604f<E> m2105Z0() {
        return this.f35010l;
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: c */
    public void mo2052c(Function1<? super Throwable, Unit> function1) {
        this.f35010l.mo2052c(function1);
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: d */
    public Object mo2051d(E e) {
        return this.f35010l.mo2051d(e);
    }

    @Override // p409wi.InterfaceC13624t
    /* renamed from: e */
    public InterfaceC9880c<C13608i<E>> mo2062e() {
        return this.f35010l.mo2062e();
    }

    @Override // p409wi.InterfaceC13624t
    /* renamed from: f */
    public Object mo2061f(Continuation<? super C13608i<? extends E>> continuation) {
        Object mo2061f = this.f35010l.mo2061f(continuation);
        C13277d.m2869d();
        return mo2061f;
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: g */
    public boolean mo2050g(Throwable th2) {
        return this.f35010l.mo2050g(th2);
    }

    @Override // kotlinx.coroutines.C9696e2, kotlinx.coroutines.Job
    /* renamed from: h */
    public final void mo2104h(CancellationException cancellationException) {
        if (m13501p0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C9913x1(mo13523P(), null, this);
        }
        mo2106M(cancellationException);
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: w */
    public Object mo2049w(E e, Continuation<? super Unit> continuation) {
        return this.f35010l.mo2049w(e, continuation);
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: x */
    public boolean mo2048x() {
        return this.f35010l.mo2048x();
    }
}
