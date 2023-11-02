package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0007H\u0001R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lkotlinx/serialization/json/s;", "", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "b", "Lkotlinx/serialization/json/JsonObject;", "a", "", "Ljava/util/Map;", "content", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9983s {

    /* renamed from: a */
    private final Map<String, JsonElement> f25887a = new LinkedHashMap();

    /* renamed from: a */
    public final JsonObject m12693a() {
        return new JsonObject(this.f25887a);
    }

    /* renamed from: b */
    public final JsonElement m12692b(String key, JsonElement element) {
        C9612q.m13917h(key, "key");
        C9612q.m13917h(element, "element");
        return this.f25887a.put(key, element);
    }
}