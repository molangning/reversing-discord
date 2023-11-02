package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\b\u001a\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¨\u0006\u000b"}, m14357d2 = {"Lkotlinx/serialization/json/s;", "", "key", "", "value", "Lkotlinx/serialization/json/JsonElement;", "a", "(Lkotlinx/serialization/json/s;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonElement;", "", "b", "c", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9963f {
    /* renamed from: a */
    public static final JsonElement m12742a(C9983s c9983s, String key, Boolean bool) {
        C9612q.m13917h(c9983s, "<this>");
        C9612q.m13917h(key, "key");
        return c9983s.m12692b(key, C9964g.m12738b(bool));
    }

    /* renamed from: b */
    public static final JsonElement m12741b(C9983s c9983s, String key, Number number) {
        C9612q.m13917h(c9983s, "<this>");
        C9612q.m13917h(key, "key");
        return c9983s.m12692b(key, C9964g.m12737c(number));
    }

    /* renamed from: c */
    public static final JsonElement m12740c(C9983s c9983s, String key, String str) {
        C9612q.m13917h(c9983s, "<this>");
        C9612q.m13917h(key, "key");
        return c9983s.m12692b(key, C9964g.m12736d(str));
    }
}