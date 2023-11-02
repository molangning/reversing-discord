package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.C9978n;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m14357d2 = {"T", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "a", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "", "discriminator", "Lkotlinx/serialization/json/JsonObject;", "b", "(Lkotlinx/serialization/json/Json;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6016s0 {
    /* renamed from: a */
    public static final <T> T m23869a(Json json, JsonElement element, DeserializationStrategy<? extends T> deserializer) {
        boolean m13922c;
        Decoder c5981d0;
        C9612q.m13917h(json, "<this>");
        C9612q.m13917h(element, "element");
        C9612q.m13917h(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            c5981d0 = new C5987g0(json, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof JsonArray) {
            c5981d0 = new C5989h0(json, (JsonArray) element);
        } else {
            if (element instanceof C9978n) {
                m13922c = true;
            } else {
                m13922c = C9612q.m13922c(element, JsonNull.INSTANCE);
            }
            if (m13922c) {
                c5981d0 = new C5981d0(json, (JsonPrimitive) element);
            } else {
                throw new C11581q();
            }
        }
        return (T) c5981d0.mo12924G(deserializer);
    }

    /* renamed from: b */
    public static final <T> T m23868b(Json json, String discriminator, JsonObject element, DeserializationStrategy<? extends T> deserializer) {
        C9612q.m13917h(json, "<this>");
        C9612q.m13917h(discriminator, "discriminator");
        C9612q.m13917h(element, "element");
        C9612q.m13917h(deserializer, "deserializer");
        return (T) new C5987g0(json, element, discriminator, deserializer.getDescriptor()).mo12924G(deserializer);
    }
}
