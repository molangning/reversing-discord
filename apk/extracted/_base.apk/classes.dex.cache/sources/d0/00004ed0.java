package p371uf;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.InterfaceC9564b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m14357d2 = {"Luf/b;", "Lkotlin/coroutines/CoroutineContext$b;", "B", "E", "Lkotlin/coroutines/CoroutineContext$c;", "element", "b", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$b;", "key", "", "a", "(Lkotlin/coroutines/CoroutineContext$c;)Z", "Lkotlin/Function1;", "j", "Lkotlin/jvm/functions/Function1;", "safeCast", "k", "Lkotlin/coroutines/CoroutineContext$c;", "topmostKey", "baseKey", "<init>", "(Lkotlin/coroutines/CoroutineContext$c;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: uf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12960b<B extends CoroutineContext.InterfaceC9564b, E extends B> implements CoroutineContext.InterfaceC9566c<E> {

    /* renamed from: j */
    private final Function1<CoroutineContext.InterfaceC9564b, E> f33714j;

    /* renamed from: k */
    private final CoroutineContext.InterfaceC9566c<?> f33715k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$b, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$b, E extends B>, java.lang.Object] */
    public AbstractC12960b(CoroutineContext.InterfaceC9566c<B> baseKey, Function1<? super CoroutineContext.InterfaceC9564b, ? extends E> safeCast) {
        C9612q.m13917h(baseKey, "baseKey");
        C9612q.m13917h(safeCast, "safeCast");
        this.f33714j = safeCast;
        this.f33715k = baseKey instanceof AbstractC12960b ? (CoroutineContext.InterfaceC9566c<B>) ((AbstractC12960b) baseKey).f33715k : baseKey;
    }

    /* renamed from: a */
    public final boolean m3581a(CoroutineContext.InterfaceC9566c<?> key) {
        C9612q.m13917h(key, "key");
        if (key != this && this.f33715k != key) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final CoroutineContext.InterfaceC9564b m3580b(CoroutineContext.InterfaceC9564b element) {
        C9612q.m13917h(element, "element");
        return (CoroutineContext.InterfaceC9564b) this.f33714j.invoke(element);
    }
}