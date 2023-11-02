package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lkotlinx/coroutines/b3;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext$c;", "getKey", "()Lkotlin/coroutines/CoroutineContext$c;", "key", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.b3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9679b3 implements CoroutineContext.InterfaceC9564b, CoroutineContext.InterfaceC9566c<C9679b3> {

    /* renamed from: j */
    public static final C9679b3 f25420j = new C9679b3();

    private C9679b3() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: e0 */
    public CoroutineContext mo1459e0(CoroutineContext coroutineContext) {
        return CoroutineContext.InterfaceC9564b.C9565a.m13992d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC9564b
    public CoroutineContext.InterfaceC9566c<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC9564b, kotlin.coroutines.CoroutineContext
    /* renamed from: j */
    public <E extends CoroutineContext.InterfaceC9564b> E mo1458j(CoroutineContext.InterfaceC9566c<E> interfaceC9566c) {
        return (E) CoroutineContext.InterfaceC9564b.C9565a.m13994b(this, interfaceC9566c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo1457j0(CoroutineContext.InterfaceC9566c<?> interfaceC9566c) {
        return CoroutineContext.InterfaceC9564b.C9565a.m13993c(this, interfaceC9566c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: t0 */
    public <R> R mo1456t0(R r, Function2<? super R, ? super CoroutineContext.InterfaceC9564b, ? extends R> function2) {
        return (R) CoroutineContext.InterfaceC9564b.C9565a.m13995a(this, r, function2);
    }
}