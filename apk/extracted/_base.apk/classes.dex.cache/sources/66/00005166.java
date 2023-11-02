package p409wi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C9815k0;
import kotlinx.coroutines.channels.ProducerScope;
import p409wi.InterfaceC13628x;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m14357d2 = {"Lwi/r;", "E", "Lwi/g;", "Lkotlinx/coroutines/channels/ProducerScope;", "", "value", "a1", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "W0", "a", "()Z", "isActive", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lwi/f;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lwi/f;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13622r<E> extends C13606g<E> implements ProducerScope<E> {
    public C13622r(CoroutineContext coroutineContext, InterfaceC13604f<E> interfaceC13604f) {
        super(coroutineContext, interfaceC13604f, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC9670a
    /* renamed from: W0 */
    protected void mo2069W0(Throwable th2, boolean z) {
        if (!m2105Z0().mo2050g(th2) && !z) {
            C9815k0.m13185a(getContext(), th2);
        }
    }

    @Override // kotlinx.coroutines.AbstractC9670a, kotlinx.coroutines.C9696e2, kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo2067a() {
        return super.mo2067a();
    }

    @Override // kotlinx.coroutines.AbstractC9670a
    /* renamed from: a1 */
    public void mo2068X0(Unit unit) {
        InterfaceC13628x.C13629a.m2047a(m2105Z0(), null, 1, null);
    }
}