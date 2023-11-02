package p324rf;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.AbstractC11873f;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\r"}, m14357d2 = {"Lrf/a;", "", "E", "K", "V", "Lqf/f;", "element", "", "e", "(Ljava/util/Map$Entry;)Z", "h", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: rf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12132a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC11873f<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m6130e((Map.Entry) obj);
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m6130e(E element) {
        C9612q.m13917h(element, "element");
        return mo6052h(element);
    }

    /* renamed from: h */
    public abstract boolean mo6052h(Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: i */
    public abstract /* bridge */ boolean mo6051i(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo6051i((Map.Entry) obj);
        }
        return false;
    }
}