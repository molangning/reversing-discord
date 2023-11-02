package kotlinx.serialization.json;

import dj.C5983e0;
import dj.C5985f0;
import dj.C6003n0;
import dj.C6012q0;
import dj.C6016s0;
import dj.C6019u;
import dj.EnumC6018t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.DeserializationStrategy;
import p088ej.AbstractC6257c;
import p088ej.C6258d;
import p470zi.InterfaceC14279h;
import p470zi.InterfaceC14288m;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:\u0001\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J)\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR \u0010#\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u0082\u0001\u0002&'¨\u0006("}, m14357d2 = {"Lkotlinx/serialization/json/Json;", "Lzi/m;", "T", "Lzi/h;", "serializer", "value", "", "c", "(Lzi/h;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "string", "b", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "d", "(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "g", "Lkotlinx/serialization/json/c;", "a", "Lkotlinx/serialization/json/c;", "e", "()Lkotlinx/serialization/json/c;", "configuration", "Lej/c;", "Lej/c;", "()Lej/c;", "serializersModule", "Ldj/u;", "Ldj/u;", "f", "()Ldj/u;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "_schemaCache", "<init>", "(Lkotlinx/serialization/json/c;Lej/c;)V", "Lkotlinx/serialization/json/Json$a;", "Lkotlinx/serialization/json/k;", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class Json implements InterfaceC14288m {

    /* renamed from: d */
    public static final C9954a f25830d = new C9954a(null);

    /* renamed from: a */
    private final C9960c f25831a;

    /* renamed from: b */
    private final AbstractC6257c f25832b;

    /* renamed from: c */
    private final C6019u f25833c;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lkotlinx/serialization/json/Json$a;", "Lkotlinx/serialization/json/Json;", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.Json$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9954a extends Json {
        private C9954a() {
            super(new C9960c(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null), C6258d.m23140a(), null);
        }

        public /* synthetic */ C9954a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Json(C9960c c9960c, AbstractC6257c abstractC6257c) {
        this.f25831a = c9960c;
        this.f25832b = abstractC6257c;
        this.f25833c = new C6019u();
    }

    public /* synthetic */ Json(C9960c c9960c, AbstractC6257c abstractC6257c, DefaultConstructorMarker defaultConstructorMarker) {
        this(c9960c, abstractC6257c);
    }

    @Override // p470zi.InterfaceC14276e
    /* renamed from: a */
    public AbstractC6257c mo265a() {
        return this.f25832b;
    }

    @Override // p470zi.InterfaceC14288m
    /* renamed from: b */
    public final <T> T mo232b(DeserializationStrategy<? extends T> deserializer, String string) {
        C9612q.m13917h(deserializer, "deserializer");
        C9612q.m13917h(string, "string");
        C6012q0 c6012q0 = new C6012q0(string);
        T t = (T) new C6003n0(this, EnumC6018t0.OBJ, c6012q0, deserializer.getDescriptor(), null).mo12924G(deserializer);
        c6012q0.m24021w();
        return t;
    }

    @Override // p470zi.InterfaceC14288m
    /* renamed from: c */
    public final <T> String mo231c(InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(serializer, "serializer");
        C5985f0 c5985f0 = new C5985f0();
        try {
            C5983e0.m23962a(this, c5985f0, serializer, t);
            return c5985f0.toString();
        } finally {
            c5985f0.m23956g();
        }
    }

    /* renamed from: d */
    public final <T> T m12781d(DeserializationStrategy<? extends T> deserializer, JsonElement element) {
        C9612q.m13917h(deserializer, "deserializer");
        C9612q.m13917h(element, "element");
        return (T) C6016s0.m23869a(this, element, deserializer);
    }

    /* renamed from: e */
    public final C9960c m12780e() {
        return this.f25831a;
    }

    /* renamed from: f */
    public final C6019u m12779f() {
        return this.f25833c;
    }

    /* renamed from: g */
    public final JsonElement m12778g(String string) {
        C9612q.m13917h(string, "string");
        return (JsonElement) mo232b(C9965h.f25871a, string);
    }
}