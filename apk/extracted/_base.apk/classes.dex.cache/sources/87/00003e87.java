package kg;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p164j$.util.concurrent.ConcurrentHashMap;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR$\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lkg/f;", "V", "Lkg/a;", "Ljava/lang/Class;", "key", "a", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "compute", "j$/util/concurrent/ConcurrentHashMap", "b", "Lj$/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C9251f<V> extends AbstractC9221a<V> {

    /* renamed from: a */
    private final Function1<Class<?>, V> f24316a;

    /* renamed from: b */
    private final ConcurrentHashMap<Class<?>, V> f24317b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9251f(Function1<? super Class<?>, ? extends V> compute) {
        C9612q.m13917h(compute, "compute");
        this.f24316a = compute;
        this.f24317b = new ConcurrentHashMap<>();
    }

    @Override // kg.AbstractC9221a
    /* renamed from: a */
    public V mo15994a(Class<?> key) {
        C9612q.m13917h(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f24317b;
        V v = concurrentHashMap.get(key);
        if (v == null) {
            V invoke = this.f24316a.invoke(key);
            V putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return invoke;
        }
        return v;
    }
}