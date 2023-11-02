package p045cj;

import bj.AbstractC2325e;
import gg.C6759j;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C9627a;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p304qf.C11889v;

@Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b¢\u0006\u0004\b(\u0010)J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0001\u0002*+¨\u0006,"}, m14357d2 = {"Lcj/z0;", "Key", "Value", "Collection", "", "Builder", "Lcj/a;", "", "Lkotlinx/serialization/encoding/c;", "decoder", "builder", "", "startIndex", "size", "", "o", "(Lkotlinx/serialization/encoding/c;Ljava/util/Map;II)V", "index", "", "checkIndex", "p", "(Lkotlinx/serialization/encoding/c;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlinx/serialization/KSerializer;", "m", "()Lkotlinx/serialization/KSerializer;", "keySerializer", "b", "n", "valueSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lcj/h0;", "Lcj/r0;", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.z0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2661z0<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC2556a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a */
    private final KSerializer<Key> f7155a;

    /* renamed from: b */
    private final KSerializer<Value> f7156b;

    private AbstractC2661z0(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.f7155a = kSerializer;
        this.f7156b = kSerializer2;
    }

    public /* synthetic */ AbstractC2661z0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public abstract SerialDescriptor getDescriptor();

    /* renamed from: m */
    public final KSerializer<Key> m32756m() {
        return this.f7155a;
    }

    /* renamed from: n */
    public final KSerializer<Value> m32755n() {
        return this.f7156b;
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: o */
    public final void mo32757g(InterfaceC9936c decoder, Builder builder, int i, int i2) {
        boolean z;
        IntRange m21916q;
        C9627a m21918o;
        C9612q.m13917h(decoder, "decoder");
        C9612q.m13917h(builder, "builder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m21916q = C6759j.m21916q(0, i2 * 2);
            m21918o = C6759j.m21918o(m21916q, 2);
            int m13890a = m21918o.m13890a();
            int m13889e = m21918o.m13889e();
            int m13888h = m21918o.m13888h();
            if ((m13888h <= 0 || m13890a > m13889e) && (m13888h >= 0 || m13889e > m13890a)) {
                return;
            }
            while (true) {
                mo12790h(decoder, i + m13890a, builder, false);
                if (m13890a != m13889e) {
                    m13890a += m13888h;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: p */
    public final void mo12790h(InterfaceC9936c decoder, int i, Builder builder, boolean z) {
        int i2;
        Object m12859c;
        Object m6753i;
        C9612q.m13917h(decoder, "decoder");
        C9612q.m13917h(builder, "builder");
        Object m12859c2 = InterfaceC9936c.C9937a.m12859c(decoder, getDescriptor(), i, this.f7155a, null, 8, null);
        boolean z2 = true;
        if (z) {
            i2 = decoder.mo12866o(getDescriptor());
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        if (builder.containsKey(m12859c2) && !(this.f7156b.getDescriptor().mo12684g() instanceof AbstractC2325e)) {
            SerialDescriptor descriptor = getDescriptor();
            KSerializer<Value> kSerializer = this.f7156b;
            m6753i = C11889v.m6753i(builder, m12859c2);
            m12859c = decoder.mo12862y(descriptor, i3, kSerializer, m6753i);
        } else {
            m12859c = InterfaceC9936c.C9937a.m12859c(decoder, getDescriptor(), i3, this.f7156b, null, 8, null);
        }
        builder.put(m12859c2, m12859c);
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, Collection collection) {
        C9612q.m13917h(encoder, "encoder");
        int mo12791e = mo12791e(collection);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder mo12893j = encoder.mo12893j(descriptor, mo12791e);
        Iterator<Map.Entry<? extends Key, ? extends Value>> mo32795d = mo32795d(collection);
        int i = 0;
        while (mo32795d.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = mo32795d.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            mo12893j.mo12894i(getDescriptor(), i, m32756m(), key);
            mo12893j.mo12894i(getDescriptor(), i2, m32755n(), value);
            i = i2 + 1;
        }
        mo12893j.mo12899c(descriptor);
    }
}