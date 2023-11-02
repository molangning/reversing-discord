package com.discord.chat.bridge.gift;

import kotlin.Metadata;
import kotlin.text.C9653o;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a%\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, m14357d2 = {"hasPrimitive", "", "Lkotlinx/serialization/json/JsonObject;", "key", "", "hasPrimitives", "keys", "", "(Lkotlinx/serialization/json/JsonObject;[Ljava/lang/String;)Z", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GiftEmbedKt {
    public static final /* synthetic */ boolean access$hasPrimitive(JsonObject jsonObject, String str) {
        return hasPrimitive(jsonObject, str);
    }

    public static final /* synthetic */ boolean access$hasPrimitives(JsonObject jsonObject, String... strArr) {
        return hasPrimitives(jsonObject, strArr);
    }

    public static final boolean hasPrimitive(JsonObject jsonObject, String str) {
        JsonPrimitive m12726n;
        String mo12700a;
        boolean m13751w;
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        if (jsonElement == null || (m12726n = C9964g.m12726n(jsonElement)) == null || (mo12700a = m12726n.mo12700a()) == null) {
            return false;
        }
        m13751w = C9653o.m13751w(mo12700a);
        return m13751w ^ true;
    }

    public static final boolean hasPrimitives(JsonObject jsonObject, String... strArr) {
        for (String str : strArr) {
            if (!hasPrimitive(jsonObject, str)) {
                return false;
            }
        }
        return true;
    }
}
