package kotlinx.serialization.json;

import bj.AbstractC2342h;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.C0213a;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lkotlinx/serialization/json/a;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9957a implements KSerializer<JsonArray> {

    /* renamed from: a */
    public static final C9957a f25853a = new C9957a();

    /* renamed from: b */
    private static final SerialDescriptor f25854b = C9958a.f25855b;

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010\u0012J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001R \u0010\u0013\u001a\u00020\b8\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m14357d2 = {"Lkotlinx/serialization/json/a$a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "", "f", "h", "", ZeroconfModule.KEY_SERVICE_NAME, "c", "e", "", "j", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "getSerialName$annotations", "()V", "serialName", "getAnnotations", "()Ljava/util/List;", "annotations", "d", "()I", "elementsCount", "isInline", "()Z", "b", "isNullable", "Lbj/h;", "g", "()Lbj/h;", "kind", "<init>", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C9958a implements SerialDescriptor {

        /* renamed from: b */
        public static final C9958a f25855b = new C9958a();

        /* renamed from: c */
        private static final String f25856c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a */
        private final /* synthetic */ SerialDescriptor f25857a = C0213a.m40933h(C9965h.f25871a).getDescriptor();

        private C9958a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: b */
        public boolean mo12689b() {
            return this.f25857a.mo12689b();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: c */
        public int mo12688c(String name) {
            C9612q.m13917h(name, "name");
            return this.f25857a.mo12688c(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: d */
        public int mo12687d() {
            return this.f25857a.mo12687d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: e */
        public String mo12686e(int i) {
            return this.f25857a.mo12686e(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: f */
        public List<Annotation> mo12685f(int i) {
            return this.f25857a.mo12685f(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: g */
        public AbstractC2342h mo12684g() {
            return this.f25857a.mo12684g();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> getAnnotations() {
            return this.f25857a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: h */
        public SerialDescriptor mo12683h(int i) {
            return this.f25857a.mo12683h(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: i */
        public String mo12682i() {
            return f25856c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.f25857a.isInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: j */
        public boolean mo12681j(int i) {
            return this.f25857a.mo12681j(i);
        }
    }

    private C9957a() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public JsonArray deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        C9972i.m12708g(decoder);
        return new JsonArray((List) C0213a.m40933h(C9965h.f25871a).deserialize(decoder));
    }

    @Override // p470zi.InterfaceC14279h
    /* renamed from: b */
    public void serialize(Encoder encoder, JsonArray value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        C9972i.m12707h(encoder);
        C0213a.m40933h(C9965h.f25871a).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f25854b;
    }
}