package kotlinx.serialization.json;

import bj.AbstractC2325e;
import bj.C2340g;
import dj.C5973a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9660s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.C0213a;
import pf.C11555d0;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lkotlinx/serialization/json/o;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/n;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9979o implements KSerializer<C9978n> {

    /* renamed from: a */
    public static final C9979o f25883a = new C9979o();

    /* renamed from: b */
    private static final SerialDescriptor f25884b = C2340g.m33640a("kotlinx.serialization.json.JsonLiteral", AbstractC2325e.C2334i.f6445a);

    private C9979o() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public C9978n deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        JsonElement mo12743g = C9972i.m12711d(decoder).mo12743g();
        if (mo12743g instanceof C9978n) {
            return (C9978n) mo12743g;
        }
        throw C5973a0.m24013e(-1, "Unexpected JSON element, expected JsonLiteral, had " + C9591f0.m13969b(mo12743g.getClass()), mo12743g.toString());
    }

    @Override // p470zi.InterfaceC14279h
    /* renamed from: b */
    public void serialize(Encoder encoder, C9978n value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        C9972i.m12707h(encoder);
        if (value.mo12699e()) {
            encoder.mo12903F(value.mo12700a());
        } else if (value.m12698h() != null) {
            encoder.mo12892l(value.m12698h()).mo12903F(value.mo12700a());
        } else {
            Long m12723q = C9964g.m12723q(value);
            if (m12723q != null) {
                encoder.mo12891m(m12723q.longValue());
                return;
            }
            C11555d0 m13665h = C9660s.m13665h(value.mo12700a());
            if (m13665h != null) {
                encoder.mo12892l(C0213a.m40942I(C11555d0.f30064k).getDescriptor()).mo12891m(m13665h.m7657f());
                return;
            }
            Double m12730j = C9964g.m12730j(value);
            if (m12730j != null) {
                encoder.mo12897f(m12730j.doubleValue());
                return;
            }
            Boolean m12733g = C9964g.m12733g(value);
            if (m12733g != null) {
                encoder.mo12887r(m12733g.booleanValue());
            } else {
                encoder.mo12903F(value.mo12700a());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f25884b;
    }
}