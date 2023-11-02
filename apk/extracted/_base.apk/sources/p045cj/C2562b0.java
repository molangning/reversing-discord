package p045cj;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p470zi.C14278g;
import pf.C11577n;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u001e\u0010\u001fB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m14357d2 = {"Lcj/b0;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "e", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "d", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "toString", "", "a", "[Ljava/lang/Enum;", "values", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "overriddenDescriptor", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2562b0<T extends Enum<T>> implements KSerializer<T> {

    /* renamed from: a */
    private final T[] f7015a;

    /* renamed from: b */
    private SerialDescriptor f7016b;

    /* renamed from: c */
    private final Lazy f7017c;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: cj.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C2563a extends AbstractC9614s implements Function0<SerialDescriptor> {

        /* renamed from: j */
        final /* synthetic */ C2562b0<T> f7018j;

        /* renamed from: k */
        final /* synthetic */ String f7019k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2563a(C2562b0<T> c2562b0, String str) {
            super(0);
            this.f7018j = c2562b0;
            this.f7019k = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SerialDescriptor invoke() {
            SerialDescriptor serialDescriptor = ((C2562b0) this.f7018j).f7016b;
            return serialDescriptor == null ? this.f7018j.m32974c(this.f7019k) : serialDescriptor;
        }
    }

    public C2562b0(String serialName, T[] values) {
        Lazy m7601a;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(values, "values");
        this.f7015a = values;
        m7601a = C11577n.m7601a(new C2563a(this, serialName));
        this.f7017c = m7601a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final SerialDescriptor m32974c(String str) {
        C2557a0 c2557a0 = new C2557a0(str, this.f7015a.length);
        for (T t : this.f7015a) {
            PluginGeneratedSerialDescriptor.m12855m(c2557a0, t.name(), false, 2, null);
        }
        return c2557a0;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: d */
    public T deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        int mo12919e = decoder.mo12919e(getDescriptor());
        boolean z = false;
        if (mo12919e >= 0 && mo12919e < this.f7015a.length) {
            z = true;
        }
        if (z) {
            return this.f7015a[mo12919e];
        }
        throw new C14278g(mo12919e + " is not among valid " + getDescriptor().mo12682i() + " enum values, values size is " + this.f7015a.length);
    }

    @Override // p470zi.InterfaceC14279h
    /* renamed from: e */
    public void serialize(Encoder encoder, T value) {
        int m14231O;
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        m14231O = C9538f.m14231O(this.f7015a, value);
        if (m14231O != -1) {
            encoder.mo12931k(getDescriptor(), m14231O);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().mo12682i());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.f7015a);
        C9612q.m13918g(arrays, "toString(this)");
        sb2.append(arrays);
        throw new C14278g(sb2.toString());
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f7017c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo12682i() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2562b0(String serialName, T[] values, SerialDescriptor descriptor) {
        this(serialName, values);
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(values, "values");
        C9612q.m13917h(descriptor, "descriptor");
        this.f7016b = descriptor;
    }
}
