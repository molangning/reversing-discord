package kg;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000e"}, m14357d2 = {"Lkg/d;", "V", "Lkg/a;", "Ljava/lang/Class;", "key", "a", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkg/e;", "Lkg/e;", "classValue", "Lkotlin/Function1;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C9242d<V> extends AbstractC9221a<V> {

    /* renamed from: a */
    private volatile C9244e<V> f24301a;

    public C9242d(Function1<? super Class<?>, ? extends V> compute) {
        C9612q.m13917h(compute, "compute");
        this.f24301a = new C9244e<>(compute);
    }

    @Override // kg.AbstractC9221a
    /* renamed from: a */
    public V mo15994a(Class<?> key) {
        C9612q.m13917h(key, "key");
        C9244e<V> c9244e = this.f24301a;
        V v = (V) ((SoftReference) c9244e.get(key)).get();
        if (v != null) {
            return v;
        }
        c9244e.remove(key);
        V v2 = (V) ((SoftReference) c9244e.get(key)).get();
        if (v2 != null) {
            return v2;
        }
        return c9244e.f24302a.invoke(key);
    }
}
