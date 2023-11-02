package p271oi;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: oi.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11166s<K, V> {

    /* renamed from: a */
    private final ConcurrentHashMap<KClass<? extends K>, Integer> f29195a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final AtomicInteger f29196b = new AtomicInteger(0);

    /* renamed from: oi.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11167a extends AbstractC9614s implements Function1<KClass<? extends K>, Integer> {

        /* renamed from: j */
        final /* synthetic */ AbstractC11166s<K, V> f29197j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11167a(AbstractC11166s<K, V> abstractC11166s) {
            super(1);
            this.f29197j = abstractC11166s;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(KClass<? extends K> it) {
            C9612q.m13917h(it, "it");
            return Integer.valueOf(((AbstractC11166s) this.f29197j).f29196b.getAndIncrement());
        }
    }

    /* renamed from: b */
    public abstract <T extends K> int mo9085b(ConcurrentHashMap<KClass<? extends K>, Integer> concurrentHashMap, KClass<T> kClass, Function1<? super KClass<? extends K>, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T extends V, KK extends K> C11151n<K, V, T> m9084c(KClass<KK> kClass) {
        C9612q.m13917h(kClass, "kClass");
        return new C11151n<>(kClass, m9083d(kClass));
    }

    /* renamed from: d */
    public final <T extends K> int m9083d(KClass<T> kClass) {
        C9612q.m13917h(kClass, "kClass");
        return mo9085b(this.f29195a, kClass, new C11167a(this));
    }

    /* renamed from: e */
    public final Collection<Integer> m9082e() {
        Collection<Integer> values = this.f29195a.values();
        C9612q.m13918g(values, "idPerType.values");
        return values;
    }
}