package dj;

import bj.AbstractC2322d;
import bj.AbstractC2325e;
import bj.AbstractC2342h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.InterfaceC9959b;
import kotlinx.serialization.json.InterfaceC9962e;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p045cj.AbstractC2561b;
import p045cj.C2619n0;
import p470zi.InterfaceC14279h;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a'\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¨\u0006\u001a"}, m14357d2 = {"Lzi/h;", "serializer", "", "actualSerializer", "", "classDiscriminator", "", "f", "Lbj/h;", "kind", "b", "T", "Lkotlinx/serialization/json/e;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "d", "(Lkotlinx/serialization/json/e;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "type", "Lkotlinx/serialization/json/JsonObject;", "jsonTree", "", "e", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "c", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5999l0 {
    /* renamed from: b */
    public static final void m23916b(AbstractC2342h kind) {
        C9612q.m13917h(kind, "kind");
        if (!(kind instanceof AbstractC2342h.C2344b)) {
            if (!(kind instanceof AbstractC2325e)) {
                if (!(kind instanceof AbstractC2322d)) {
                    return;
                }
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
            }
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    /* renamed from: c */
    public static final String m23915c(SerialDescriptor serialDescriptor, Json json) {
        C9612q.m13917h(serialDescriptor, "<this>");
        C9612q.m13917h(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof InterfaceC9959b) {
                return ((InterfaceC9959b) annotation).discriminator();
            }
        }
        return json.m12780e().m12755c();
    }

    /* renamed from: d */
    public static final <T> T m23914d(InterfaceC9962e interfaceC9962e, DeserializationStrategy<? extends T> deserializer) {
        String str;
        JsonPrimitive m12726n;
        C9612q.m13917h(interfaceC9962e, "<this>");
        C9612q.m13917h(deserializer, "deserializer");
        if ((deserializer instanceof AbstractC2561b) && !interfaceC9962e.mo12744d().m12780e().m12746l()) {
            String m23915c = m23915c(deserializer.getDescriptor(), interfaceC9962e.mo12744d());
            JsonElement mo12743g = interfaceC9962e.mo12743g();
            SerialDescriptor descriptor = deserializer.getDescriptor();
            if (mo12743g instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) mo12743g;
                JsonElement jsonElement = (JsonElement) jsonObject.get(m23915c);
                if (jsonElement != null && (m12726n = C9964g.m12726n(jsonElement)) != null) {
                    str = m12726n.mo12700a();
                } else {
                    str = null;
                }
                DeserializationStrategy<T> mo12947c = ((AbstractC2561b) deserializer).mo12947c(interfaceC9962e, str);
                if (mo12947c != null) {
                    return (T) C6016s0.m23868b(interfaceC9962e.mo12744d(), m23915c, jsonObject, mo12947c);
                }
                m23913e(str, jsonObject);
                throw new C11568i();
            }
            throw C5973a0.m24014d(-1, "Expected " + C9591f0.m13969b(JsonObject.class) + " as the serialized body of " + descriptor.mo12682i() + ", but had " + C9591f0.m13969b(mo12743g.getClass()));
        }
        return deserializer.deserialize(interfaceC9962e);
    }

    /* renamed from: e */
    public static final Void m23913e(String str, JsonObject jsonTree) {
        String str2;
        C9612q.m13917h(jsonTree, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw C5973a0.m24013e(-1, "Polymorphic serializer was not found for " + str2, jsonTree.toString());
    }

    /* renamed from: f */
    public static final void m23912f(InterfaceC14279h<?> interfaceC14279h, InterfaceC14279h<Object> interfaceC14279h2, String str) {
        if (!(interfaceC14279h instanceof SealedClassSerializer) || !C2619n0.m32838a(interfaceC14279h2.getDescriptor()).contains(str)) {
            return;
        }
        String mo12682i = interfaceC14279h.getDescriptor().mo12682i();
        String mo12682i2 = interfaceC14279h2.getDescriptor().mo12682i();
        throw new IllegalStateException(("Sealed class '" + mo12682i2 + "' cannot be serialized as base class '" + mo12682i + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
    }
}