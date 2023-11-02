package p271oi;

import cg.InterfaceC2533a;
import java.util.Iterator;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;

/* renamed from: oi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11124a<K, V> implements Iterable<V>, InterfaceC2533a {

    /* renamed from: oi.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC11125a<K, V, T extends V> {

        /* renamed from: a */
        private final KClass<? extends K> f29101a;

        /* renamed from: b */
        private final int f29102b;

        public AbstractC11125a(KClass<? extends K> key, int i) {
            C9612q.m13917h(key, "key");
            this.f29101a = key;
            this.f29102b = i;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T extends V, java.lang.Object] */
        /* renamed from: a */
        public final T m9118a(AbstractC11124a<K, V> thisRef) {
            C9612q.m13917h(thisRef, "thisRef");
            return thisRef.mo9114a().get(this.f29102b);
        }
    }

    /* renamed from: a */
    protected abstract AbstractC11127c<V> mo9114a();

    /* renamed from: e */
    public abstract AbstractC11166s<K, V> mo9119e();

    public final boolean isEmpty() {
        return mo9114a().mo9100a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return mo9114a().iterator();
    }
}