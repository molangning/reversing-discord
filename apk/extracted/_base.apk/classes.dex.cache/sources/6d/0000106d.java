package com.discord.chat.bridge.gift;

import com.discord.chat.bridge.gift.GiftEmbed;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.AbstractC9961d;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GiftEmbedSerializer extends AbstractC9961d<GiftEmbed> {
    public static final GiftEmbedSerializer INSTANCE = new GiftEmbedSerializer();

    private GiftEmbedSerializer() {
        super(C9591f0.m13969b(GiftEmbed.class));
    }

    @Override // kotlinx.serialization.json.AbstractC9961d
    protected DeserializationStrategy<GiftEmbed> selectDeserializer(JsonElement element) {
        boolean hasPrimitives;
        boolean hasPrimitive;
        C9612q.m13917h(element, "element");
        JsonObject m12727m = C9964g.m12727m(element);
        hasPrimitives = GiftEmbedKt.hasPrimitives(m12727m, "resolvingGradientStart", "resolvingGradientEnd");
        if (hasPrimitives) {
            return GiftEmbed.Resolving.Companion.serializer();
        }
        hasPrimitive = GiftEmbedKt.hasPrimitive(m12727m, "giftCode");
        if (hasPrimitive) {
            return GiftEmbed.Resolved.Valid.Companion.serializer();
        }
        return GiftEmbed.Resolved.Invalid.Companion.serializer();
    }
}