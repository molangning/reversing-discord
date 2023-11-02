package p371uf;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m14357d2 = {"Luf/a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext$c;", "j", "Lkotlin/coroutines/CoroutineContext$c;", "getKey", "()Lkotlin/coroutines/CoroutineContext$c;", "key", "<init>", "(Lkotlin/coroutines/CoroutineContext$c;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: uf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12959a implements CoroutineContext.InterfaceC9564b {

    /* renamed from: j */
    private final CoroutineContext.InterfaceC9566c<?> f33713j;

    public AbstractC12959a(CoroutineContext.InterfaceC9566c<?> key) {
        C9612q.m13917h(key, "key");
        this.f33713j = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: e0 */
    public CoroutineContext mo1459e0(CoroutineContext coroutineContext) {
        return CoroutineContext.InterfaceC9564b.C9565a.m13992d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC9564b
    public CoroutineContext.InterfaceC9566c<?> getKey() {
        return this.f33713j;
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