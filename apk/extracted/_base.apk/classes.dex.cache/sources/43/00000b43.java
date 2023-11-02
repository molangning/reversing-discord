package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p470zi.C14278g;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00028\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0005\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001aR\u0018\u0010\u0006\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a\u0082\u0001\u0002\u001d\u001e¨\u0006\u001f"}, m14357d2 = {"Lcj/p0;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "key", "value", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "keySerializer", "b", "getValueSerializer", "valueSerializer", "(Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lcj/x0;", "Lcj/i1;", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2627p0<K, V, R> implements KSerializer<R> {

    /* renamed from: a */
    private final KSerializer<K> f7104a;

    /* renamed from: b */
    private final KSerializer<V> f7105b;

    private AbstractC2627p0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.f7104a = kSerializer;
        this.f7105b = kSerializer2;
    }

    public /* synthetic */ AbstractC2627p0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    /* renamed from: a */
    protected abstract K mo32777a(R r);

    /* renamed from: b */
    protected abstract V mo32776b(R r);

    /* renamed from: c */
    protected abstract R mo32775c(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.DeserializationStrategy
    public R deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C9612q.m13917h(decoder, "decoder");
        InterfaceC9936c mo12920b = decoder.mo12920b(getDescriptor());
        if (mo12920b.mo12865p()) {
            return (R) mo32775c(InterfaceC9936c.C9937a.m12859c(mo12920b, getDescriptor(), 0, this.f7104a, null, 8, null), InterfaceC9936c.C9937a.m12859c(mo12920b, getDescriptor(), 1, this.f7105b, null, 8, null));
        }
        obj = C2580e2.f7043a;
        obj2 = C2580e2.f7043a;
        Object obj5 = obj2;
        while (true) {
            int mo12866o = mo12920b.mo12866o(getDescriptor());
            if (mo12866o != -1) {
                if (mo12866o != 0) {
                    if (mo12866o == 1) {
                        obj5 = InterfaceC9936c.C9937a.m12859c(mo12920b, getDescriptor(), 1, this.f7105b, null, 8, null);
                    } else {
                        throw new C14278g("Invalid index: " + mo12866o);
                    }
                } else {
                    obj = InterfaceC9936c.C9937a.m12859c(mo12920b, getDescriptor(), 0, this.f7104a, null, 8, null);
                }
            } else {
                mo12920b.mo12872c(getDescriptor());
                obj3 = C2580e2.f7043a;
                if (obj != obj3) {
                    obj4 = C2580e2.f7043a;
                    if (obj5 != obj4) {
                        return (R) mo32775c(obj, obj5);
                    }
                    throw new C14278g("Element 'value' is missing");
                }
                throw new C14278g("Element 'key' is missing");
            }
        }
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, R r) {
        C9612q.m13917h(encoder, "encoder");
        CompositeEncoder mo12900b = encoder.mo12900b(getDescriptor());
        mo12900b.mo12894i(getDescriptor(), 0, this.f7104a, mo32777a(r));
        mo12900b.mo12894i(getDescriptor(), 1, this.f7105b, mo32776b(r));
        mo12900b.mo12899c(getDescriptor());
    }
}