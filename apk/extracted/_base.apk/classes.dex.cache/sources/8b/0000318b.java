package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.Json;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, m14357d2 = {"Ldj/k0;", "sb", "Lkotlinx/serialization/json/Json;", "json", "Ldj/h;", "a", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6015s {
    /* renamed from: a */
    public static final C5988h m23870a(InterfaceC5997k0 sb2, Json json) {
        C9612q.m13917h(sb2, "sb");
        C9612q.m13917h(json, "json");
        if (json.m12780e().m12749i()) {
            return new C6013r(sb2, json);
        }
        return new C5988h(sb2);
    }
}