package p045cj;

import bj.C2319a;
import bj.C2340g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0017"}, m14357d2 = {"Lcj/i1;", "K", "V", "Lcj/p0;", "Lkotlin/Pair;", "key", "value", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "d", "(Lkotlin/Pair;)Ljava/lang/Object;", "e", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2598i1<K, V> extends AbstractC2627p0<K, V, Pair<? extends K, ? extends V>> {

    /* renamed from: c */
    private final SerialDescriptor f7068c;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"K", "V", "Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: cj.i1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C2599a extends AbstractC9614s implements Function1<C2319a, Unit> {

        /* renamed from: j */
        final /* synthetic */ KSerializer<K> f7069j;

        /* renamed from: k */
        final /* synthetic */ KSerializer<V> f7070k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2599a(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
            super(1);
            this.f7069j = kSerializer;
            this.f7070k = kSerializer2;
        }

        /* renamed from: a */
        public final void m32887a(C2319a buildClassSerialDescriptor) {
            C9612q.m13917h(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            C2319a.m33654b(buildClassSerialDescriptor, "first", this.f7069j.getDescriptor(), null, false, 12, null);
            C2319a.m33654b(buildClassSerialDescriptor, "second", this.f7070k.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
            m32887a(c2319a);
            return Unit.f25302a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2598i1(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        C9612q.m13917h(keySerializer, "keySerializer");
        C9612q.m13917h(valueSerializer, "valueSerializer");
        this.f7068c = C2340g.m33639b("kotlin.Pair", new SerialDescriptor[0], new C2599a(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2627p0
    /* renamed from: d */
    public K mo32777a(Pair<? extends K, ? extends V> pair) {
        C9612q.m13917h(pair, "<this>");
        return pair.m14349c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2627p0
    /* renamed from: e */
    public V mo32776b(Pair<? extends K, ? extends V> pair) {
        C9612q.m13917h(pair, "<this>");
        return pair.m14348d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2627p0
    /* renamed from: f */
    public Pair<K, V> mo32775c(K k, V v) {
        return C11591x.m7577a(k, v);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f7068c;
    }
}
