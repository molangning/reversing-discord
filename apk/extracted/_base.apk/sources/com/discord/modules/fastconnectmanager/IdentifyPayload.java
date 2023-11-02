package com.discord.modules.fastconnectmanager;

import com.discord.app_database.GuildVersion;
import com.discord.logging.Log;
import gg.C6759j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p304qf.C11888u;
import p304qf.C11889v;
import pf.C11583s;
import pf.C11586t;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\u00020\u000b*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/modules/fastconnectmanager/IdentifyPayload;", "", "()V", "withGuildVersions", "", "json", "versions", "", "Lcom/discord/app_database/GuildVersion;", "(Ljava/lang/String;[Lcom/discord/app_database/GuildVersion;)Ljava/lang/String;", "put", "Lkotlinx/serialization/json/JsonObject;", "path", "", "value", "app_googleRelease"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class IdentifyPayload {
    public static final IdentifyPayload INSTANCE = new IdentifyPayload();

    private IdentifyPayload() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.serialization.json.JsonNull] */
    private final JsonObject put(JsonObject jsonObject, List<String> list, JsonObject jsonObject2) {
        Map m6740v;
        JsonObject jsonObject3;
        Map m6740v2;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                String str = list.get(0);
                JsonElement jsonElement = (JsonElement) jsonObject.get(str);
                if (jsonElement instanceof JsonObject) {
                    m6740v2 = C11889v.m6740v(jsonObject);
                    m6740v2.put(str, INSTANCE.put((JsonObject) jsonElement, list.subList(1, list.size()), jsonObject2));
                    jsonObject3 = new JsonObject(m6740v2);
                } else {
                    return jsonObject;
                }
            } else {
                String str2 = list.get(0);
                m6740v = C11889v.m6740v(jsonObject);
                JsonObject jsonObject4 = jsonObject2;
                if (jsonObject2 == null) {
                    jsonObject4 = C9964g.m12739a(null);
                }
                m6740v.put(str2, jsonObject4);
                jsonObject3 = new JsonObject(m6740v);
            }
            return jsonObject3;
        }
        throw new IllegalArgumentException("path cannot have zero elements");
    }

    public final String withGuildVersions(String json, GuildVersion[] versions) {
        Object m7596b;
        List<String> m14101l;
        int m6758d;
        int m21930c;
        C9612q.m13917h(json, "json");
        C9612q.m13917h(versions, "versions");
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(Json.f25830d.m12778g(json));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7591g(m7596b)) {
            m7596b = null;
        }
        JsonElement jsonElement = (JsonElement) m7596b;
        if (jsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElement;
            m14101l = C9545j.m14101l("d", "client_state", "guild_versions");
            m6758d = C11888u.m6758d(versions.length);
            m21930c = C6759j.m21930c(m6758d, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
            for (GuildVersion guildVersion : versions) {
                Pair m7577a = C11591x.m7577a(guildVersion.getId(), C9964g.m12737c(Long.valueOf(guildVersion.getVersion())));
                linkedHashMap.put(m7577a.m14349c(), m7577a.m14348d());
            }
            return put(jsonObject, m14101l, new JsonObject(linkedHashMap)).toString();
        }
        Log.w$default(Log.INSTANCE, "IdentifyPayload", "skipping identify mutation: root is not a json object", (Throwable) null, 4, (Object) null);
        return json;
    }
}
