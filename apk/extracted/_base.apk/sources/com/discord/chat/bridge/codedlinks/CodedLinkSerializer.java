package com.discord.chat.bridge.codedlinks;

import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.AbstractC9961d;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, m14357d2 = {"Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CodedLinkSerializer extends AbstractC9961d<CodedLinkEmbed> {
    public static final CodedLinkSerializer INSTANCE = new CodedLinkSerializer();

    private CodedLinkSerializer() {
        super(C9591f0.m13969b(CodedLinkEmbed.class));
    }

    @Override // kotlinx.serialization.json.AbstractC9961d
    protected DeserializationStrategy<CodedLinkEmbed> selectDeserializer(JsonElement element) {
        String str;
        JsonPrimitive m12726n;
        C9612q.m13917h(element, "element");
        JsonElement jsonElement = (JsonElement) C9964g.m12727m(element).get("extendedType");
        if (jsonElement != null && (m12726n = C9964g.m12726n(jsonElement)) != null) {
            str = m12726n.mo12700a();
        } else {
            str = null;
        }
        if (C9612q.m13922c(str, String.valueOf(CodedLinkExtendedType.GUILD_SCHEDULED_EVENT.getSerialNumber()))) {
            return GuildEventInviteEmbedImpl.Companion.serializer();
        }
        if (C9612q.m13922c(str, String.valueOf(CodedLinkExtendedType.GUILD_INVITE_DISABLED.getSerialNumber()))) {
            return GuildInviteDisabledEmbedImpl.Companion.serializer();
        }
        if (C9612q.m13922c(str, String.valueOf(CodedLinkExtendedType.ACTIVITY_BOOKMARK.getSerialNumber()))) {
            return ActivityBookmarkEmbedImpl.Companion.serializer();
        }
        if (C9612q.m13922c(str, String.valueOf(CodedLinkExtendedType.EMBEDDED_ACTIVITY_INVITE.getSerialNumber()))) {
            return EmbeddedActivityInviteEmbedImpl.Companion.serializer();
        }
        return GuildInviteEmbedImpl.Companion.serializer();
    }
}
