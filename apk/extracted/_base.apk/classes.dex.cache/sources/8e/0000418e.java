package kotlinx.serialization.json;

import dj.C6014r0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9651m;
import kotlin.text.C9652n;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.C0213a;
import p045cj.C2606k0;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005\u001a\u0010\u0010\b\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0007\u001a\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0014\u0010\u000e\u001a\u00020\t*\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002\" \u0010\u0015\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0018\u001a\u00020\u0002*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010 \u001a\u00020\u001d*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0015\u0010$\u001a\u00020!*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0017\u0010'\u001a\u0004\u0018\u00010!*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010+\u001a\u00020(*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0017\u0010.\u001a\u0004\u0018\u00010(*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0015\u00102\u001a\u00020/*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0015\u00105\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0017\u00108\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0017\u0010;\u001a\u0004\u0018\u00010\u0007*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, m14357d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "b", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "c", "", "d", "", "Lkotlinx/serialization/json/JsonNull;", "a", "Lkotlinx/serialization/json/JsonElement;", "element", "e", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "o", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor$annotations", "()V", "jsonUnquotedLiteralDescriptor", "n", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "m", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "", "l", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "", "p", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "long", "q", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", "i", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "j", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "k", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "float", "f", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", "boolean", "g", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "h", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9964g {

    /* renamed from: a */
    private static final SerialDescriptor f25870a = C2606k0.m32873a("kotlinx.serialization.json.JsonUnquotedLiteral", C0213a.m40946E(C9602k0.f25351a));

    /* renamed from: a */
    public static final JsonNull m12739a(Void r0) {
        return JsonNull.INSTANCE;
    }

    /* renamed from: b */
    public static final JsonPrimitive m12738b(Boolean bool) {
        if (bool == null) {
            return JsonNull.INSTANCE;
        }
        return new C9978n(bool, false, null, 4, null);
    }

    /* renamed from: c */
    public static final JsonPrimitive m12737c(Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new C9978n(number, false, null, 4, null);
    }

    /* renamed from: d */
    public static final JsonPrimitive m12736d(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new C9978n(str, true, null, 4, null);
    }

    /* renamed from: e */
    private static final Void m12735e(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + C9591f0.m13969b(jsonElement.getClass()) + " is not a " + str);
    }

    /* renamed from: f */
    public static final boolean m12734f(JsonPrimitive jsonPrimitive) {
        C9612q.m13917h(jsonPrimitive, "<this>");
        Boolean m23872d = C6014r0.m23872d(jsonPrimitive.mo12700a());
        if (m23872d != null) {
            return m23872d.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    /* renamed from: g */
    public static final Boolean m12733g(JsonPrimitive jsonPrimitive) {
        C9612q.m13917h(jsonPrimitive, "<this>");
        return C6014r0.m23872d(jsonPrimitive.mo12700a());
    }

    /* renamed from: h */
    public static final String m12732h(JsonPrimitive jsonPrimitive) {
        C9612q.m13917h(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.mo12700a();
    }

    /* renamed from: i */
    public static final double m12731i(JsonPrimitive jsonPrimitive) {
        C9612q.m13917h(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.mo12700a());
    }

    /* renamed from: j */
    public static final Double m12730j(JsonPrimitive jsonPrimitive) {
        Double m13771k;
        C9612q.m13917h(jsonPrimitive, "<this>");
        m13771k = C9651m.m13771k(jsonPrimitive.mo12700a());
        return m13771k;
    }

    /* renamed from: k */
    public static final float m12729k(JsonPrimitive jsonPrimitive) {
        C9612q.m13917h(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.mo12700a());
    }

    /* renamed from: l */
    public static final int m12728l(JsonPrimitive jsonPrimitive) {
        C9612q.m13917h(jsonPrimitive, "<this>");
        return Integer.parseInt(jsonPrimitive.mo12700a());
    }

    /* renamed from: m */
    public static final JsonObject m12727m(JsonElement jsonElement) {
        JsonObject jsonObject;
        C9612q.m13917h(jsonElement, "<this>");
        if (jsonElement instanceof JsonObject) {
            jsonObject = (JsonObject) jsonElement;
        } else {
            jsonObject = null;
        }
        if (jsonObject != null) {
            return jsonObject;
        }
        m12735e(jsonElement, "JsonObject");
        throw new C11568i();
    }

    /* renamed from: n */
    public static final JsonPrimitive m12726n(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        C9612q.m13917h(jsonElement, "<this>");
        if (jsonElement instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) jsonElement;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        m12735e(jsonElement, "JsonPrimitive");
        throw new C11568i();
    }

    /* renamed from: o */
    public static final SerialDescriptor m12725o() {
        return f25870a;
    }

    /* renamed from: p */
    public static final long m12724p(JsonPrimitive jsonPrimitive) {
        C9612q.m13917h(jsonPrimitive, "<this>");
        return Long.parseLong(jsonPrimitive.mo12700a());
    }

    /* renamed from: q */
    public static final Long m12723q(JsonPrimitive jsonPrimitive) {
        Long m13767o;
        C9612q.m13917h(jsonPrimitive, "<this>");
        m13767o = C9652n.m13767o(jsonPrimitive.mo12700a());
        return m13767o;
    }
}