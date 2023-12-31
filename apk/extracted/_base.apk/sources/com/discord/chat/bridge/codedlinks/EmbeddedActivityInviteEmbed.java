package com.discord.chat.bridge.codedlinks;

import com.discord.chat.bridge.structurabletext.StructurableText;
import java.util.List;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbed;", "", "ctaEnabled", "", "getCtaEnabled", "()Z", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "noParticipantsText", "", "getNoParticipantsText", "()Ljava/lang/String;", "participantAvatarUris", "", "getParticipantAvatarUris", "()Ljava/util/List;", "structurableSubtitleText", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getStructurableSubtitleText", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface EmbeddedActivityInviteEmbed {
    boolean getCtaEnabled();

    CodedLinkExtendedType getExtendedType();

    String getNoParticipantsText();

    List<String> getParticipantAvatarUris();

    StructurableText getStructurableSubtitleText();
}
