package p045cj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\b\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014J*\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014J$\u0010\f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014J(\u0010\r\u001a\u00020\u0007*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014J4\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014J0\u0010\u0012\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u0010\u001a\u00020\u0007H\u0014R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m14357d2 = {"Lcj/h0;", "K", "V", "Lcj/z0;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "u", "", "", "t", "q", "r", "w", "v", "size", "", "s", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "kSerializer", "vSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2591h0<K, V> extends AbstractC2661z0<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* renamed from: c */
    private final SerialDescriptor f7057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2591h0(KSerializer<K> kSerializer, KSerializer<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        C9612q.m13917h(kSerializer, "kSerializer");
        C9612q.m13917h(vSerializer, "vSerializer");
        this.f7057c = new C2587g0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // p045cj.AbstractC2661z0, kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f7057c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: q */
    public HashMap<K, V> mo32798a() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: r */
    public int mo32797b(HashMap<K, V> hashMap) {
        C9612q.m13917h(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: s */
    public void mo32796c(HashMap<K, V> hashMap, int i) {
        C9612q.m13917h(hashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: t */
    public Iterator<Map.Entry<K, V>> mo32795d(Map<K, ? extends V> map) {
        C9612q.m13917h(map, "<this>");
        return (Iterator<Map.Entry<K, ? extends V>>) map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: u */
    public int mo12791e(Map<K, ? extends V> map) {
        C9612q.m13917h(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: v */
    public HashMap<K, V> mo12789k(Map<K, ? extends V> map) {
        HashMap<K, V> hashMap;
        C9612q.m13917h(map, "<this>");
        if (map instanceof HashMap) {
            hashMap = (HashMap) map;
        } else {
            hashMap = null;
        }
        if (hashMap == null) {
            return new HashMap<>(map);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: w */
    public Map<K, V> mo32794l(HashMap<K, V> hashMap) {
        C9612q.m13917h(hashMap, "<this>");
        return hashMap;
    }
}
