package kotlinx.serialization.json;

import bj.AbstractC2325e;
import bj.C2340g;
import dj.C5973a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lkotlinx/serialization/json/u;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9986u implements KSerializer<JsonPrimitive> {

    /* renamed from: a */
    public static final C9986u f25893a = new C9986u();

    /* renamed from: b */
    private static final SerialDescriptor f25894b = C2340g.m33637d("kotlinx.serialization.json.JsonPrimitive", AbstractC2325e.C2334i.f6445a, new SerialDescriptor[0], null, 8, null);

    private C9986u() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public JsonPrimitive deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        JsonElement mo12743g = C9972i.m12711d(decoder).mo12743g();
        if (mo12743g instanceof JsonPrimitive) {
            return (JsonPrimitive) mo12743g;
        }
        throw C5973a0.m24013e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + C9591f0.m13969b(mo12743g.getClass()), mo12743g.toString());
    }

    @Override // p470zi.InterfaceC14279h
    /* renamed from: b */
    public void serialize(Encoder encoder, JsonPrimitive value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        C9972i.m12712c(encoder);
        if (value instanceof JsonNull) {
            encoder.mo12895h(C9982r.f25885a, JsonNull.INSTANCE);
        } else {
            encoder.mo12895h(C9979o.f25883a, (C9978n) value);
        }
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f25894b;
    }
}
