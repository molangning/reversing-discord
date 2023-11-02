package kotlinx.serialization.json;

import bj.AbstractC2322d;
import bj.C2319a;
import bj.C2340g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lkotlinx/serialization/json/h;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9965h implements KSerializer<JsonElement> {

    /* renamed from: a */
    public static final C9965h f25871a = new C9965h();

    /* renamed from: b */
    private static final SerialDescriptor f25872b = C2340g.m33638c("kotlinx.serialization.json.JsonElement", AbstractC2322d.C2324b.f6436a, new SerialDescriptor[0], C9966a.f25873j);

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9966a extends AbstractC9614s implements Function1<C2319a, Unit> {

        /* renamed from: j */
        public static final C9966a f25873j = new C9966a();

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.h$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9967a extends AbstractC9614s implements Function0<SerialDescriptor> {

            /* renamed from: j */
            public static final C9967a f25874j = new C9967a();

            C9967a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C9986u.f25893a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.h$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9968b extends AbstractC9614s implements Function0<SerialDescriptor> {

            /* renamed from: j */
            public static final C9968b f25875j = new C9968b();

            C9968b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C9982r.f25885a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.h$a$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9969c extends AbstractC9614s implements Function0<SerialDescriptor> {

            /* renamed from: j */
            public static final C9969c f25876j = new C9969c();

            C9969c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C9979o.f25883a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.h$a$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9970d extends AbstractC9614s implements Function0<SerialDescriptor> {

            /* renamed from: j */
            public static final C9970d f25877j = new C9970d();

            C9970d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C9984t.f25888a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.h$a$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9971e extends AbstractC9614s implements Function0<SerialDescriptor> {

            /* renamed from: j */
            public static final C9971e f25878j = new C9971e();

            C9971e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C9957a.f25853a.getDescriptor();
            }
        }

        C9966a() {
            super(1);
        }

        /* renamed from: a */
        public final void m12720a(C2319a buildSerialDescriptor) {
            C9612q.m13917h(buildSerialDescriptor, "$this$buildSerialDescriptor");
            C2319a.m33654b(buildSerialDescriptor, "JsonPrimitive", C9972i.m12714a(C9967a.f25874j), null, false, 12, null);
            C2319a.m33654b(buildSerialDescriptor, "JsonNull", C9972i.m12714a(C9968b.f25875j), null, false, 12, null);
            C2319a.m33654b(buildSerialDescriptor, "JsonLiteral", C9972i.m12714a(C9969c.f25876j), null, false, 12, null);
            C2319a.m33654b(buildSerialDescriptor, "JsonObject", C9972i.m12714a(C9970d.f25877j), null, false, 12, null);
            C2319a.m33654b(buildSerialDescriptor, "JsonArray", C9972i.m12714a(C9971e.f25878j), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
            m12720a(c2319a);
            return Unit.f25302a;
        }
    }

    private C9965h() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public JsonElement deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return C9972i.m12711d(decoder).mo12743g();
    }

    @Override // p470zi.InterfaceC14279h
    /* renamed from: b */
    public void serialize(Encoder encoder, JsonElement value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        C9972i.m12712c(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.mo12895h(C9986u.f25893a, value);
        } else if (value instanceof JsonObject) {
            encoder.mo12895h(C9984t.f25888a, value);
        } else if (value instanceof JsonArray) {
            encoder.mo12895h(C9957a.f25853a, value);
        }
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f25872b;
    }
}
