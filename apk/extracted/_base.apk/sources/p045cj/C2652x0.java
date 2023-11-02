package p045cj;

import bj.AbstractC2345i;
import bj.C2319a;
import bj.C2340g;
import cg.InterfaceC2533a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0017B#\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0018"}, m14357d2 = {"Lcj/x0;", "K", "V", "Lcj/p0;", "", "key", "value", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "d", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "e", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "a", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.x0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2652x0<K, V> extends AbstractC2627p0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c */
    private final SerialDescriptor f7136c;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0010\u001a\u00028\u0002\u0012\u0006\u0010\u0013\u001a\u00028\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001a\u0010\u0010\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, m14357d2 = {"Lcj/x0$a;", "K", "V", "", "", "toString", "", "hashCode", "", "other", "", "equals", "j", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "k", "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: cj.x0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2653a<K, V> implements Map.Entry<K, V>, InterfaceC2533a {

        /* renamed from: j */
        private final K f7137j;

        /* renamed from: k */
        private final V f7138k;

        public C2653a(K k, V v) {
            this.f7137j = k;
            this.f7138k = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2653a) {
                C2653a c2653a = (C2653a) obj;
                return C9612q.m13922c(getKey(), c2653a.getKey()) && C9612q.m13922c(getValue(), c2653a.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f7137j;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7138k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return ((getKey() == null ? 0 : getKey().hashCode()) * 31) + (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"K", "V", "Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: cj.x0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C2654b extends AbstractC9614s implements Function1<C2319a, Unit> {

        /* renamed from: j */
        final /* synthetic */ KSerializer<K> f7139j;

        /* renamed from: k */
        final /* synthetic */ KSerializer<V> f7140k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2654b(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
            super(1);
            this.f7139j = kSerializer;
            this.f7140k = kSerializer2;
        }

        /* renamed from: a */
        public final void m32771a(C2319a buildSerialDescriptor) {
            C9612q.m13917h(buildSerialDescriptor, "$this$buildSerialDescriptor");
            C2319a.m33654b(buildSerialDescriptor, "key", this.f7139j.getDescriptor(), null, false, 12, null);
            C2319a.m33654b(buildSerialDescriptor, "value", this.f7140k.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
            m32771a(c2319a);
            return Unit.f25302a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2652x0(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        C9612q.m13917h(keySerializer, "keySerializer");
        C9612q.m13917h(valueSerializer, "valueSerializer");
        this.f7136c = C2340g.m33638c("kotlin.collections.Map.Entry", AbstractC2345i.C2348c.f6457a, new SerialDescriptor[0], new C2654b(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2627p0
    /* renamed from: d */
    public K mo32777a(Map.Entry<? extends K, ? extends V> entry) {
        C9612q.m13917h(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2627p0
    /* renamed from: e */
    public V mo32776b(Map.Entry<? extends K, ? extends V> entry) {
        C9612q.m13917h(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2627p0
    /* renamed from: f */
    public Map.Entry<K, V> mo32775c(K k, V v) {
        return new C2653a(k, v);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f7136c;
    }
}
