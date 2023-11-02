package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0007"}, m14357d2 = {"Lkotlinx/serialization/json/Json;", "from", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "", "builderAction", "a", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9976l {
    /* renamed from: a */
    public static final Json m12703a(Json from, Function1<? super JsonBuilder, Unit> builderAction) {
        C9612q.m13917h(from, "from");
        C9612q.m13917h(builderAction, "builderAction");
        JsonBuilder jsonBuilder = new JsonBuilder(from);
        builderAction.invoke(jsonBuilder);
        return new C9975k(jsonBuilder.m12772a(), jsonBuilder.m12771b());
    }

    /* renamed from: b */
    public static /* synthetic */ Json m12702b(Json json, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            json = Json.f25830d;
        }
        return m12703a(json, function1);
    }
}