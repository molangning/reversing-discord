package com.discord.chat.bridge.reaction;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.emoji.RenderableEmoji;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2590h;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB9\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010JF\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÇ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006,"}, m14357d2 = {"Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "Lcom/discord/reactions/ReactionView$Emoji;", "seen1", "", ZeroconfModule.KEY_SERVICE_NAME, "", "src", "displayName", "id", "animated", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAnimated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplayName", "()Ljava/lang/String;", "getId", "getName", "getSrc", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageReactionEmoji implements ReactionView.Emoji {
    public static final Companion Companion = new Companion(null);
    private final Boolean animated;
    private final String displayName;

    /* renamed from: id */
    private final String f8310id;
    private final String name;
    private final String src;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/reaction/MessageReactionEmoji$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageReactionEmoji> serializer() {
            return MessageReactionEmoji$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageReactionEmoji(int i, String str, String str2, String str3, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            C2620n1.m32836b(i, 6, MessageReactionEmoji$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        this.src = str2;
        this.displayName = str3;
        if ((i & 8) == 0) {
            this.f8310id = null;
        } else {
            this.f8310id = str4;
        }
        if ((i & 16) == 0) {
            this.animated = null;
        } else {
            this.animated = bool;
        }
    }

    public static /* synthetic */ MessageReactionEmoji copy$default(MessageReactionEmoji messageReactionEmoji, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageReactionEmoji.getName();
        }
        if ((i & 2) != 0) {
            str2 = messageReactionEmoji.getSrc();
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = messageReactionEmoji.getDisplayName();
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = messageReactionEmoji.getId();
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bool = messageReactionEmoji.getAnimated();
        }
        return messageReactionEmoji.copy(str, str5, str6, str7, bool);
    }

    public static final void write$Self(MessageReactionEmoji self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z3 = false;
        if (output.mo12879z(serialDesc, 0) || self.getName() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.getName());
        }
        output.mo12880y(serialDesc, 1, self.getSrc());
        output.mo12880y(serialDesc, 2, self.getDisplayName());
        if (output.mo12879z(serialDesc, 3) || self.getId() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.getId());
        }
        if (output.mo12879z(serialDesc, 4) || self.getAnimated() != null) {
            z3 = true;
        }
        if (z3) {
            output.mo12904E(serialDesc, 4, C2590h.f7055a, self.getAnimated());
        }
    }

    public final String component1() {
        return getName();
    }

    public final String component2() {
        return getSrc();
    }

    public final String component3() {
        return getDisplayName();
    }

    public final String component4() {
        return getId();
    }

    public final Boolean component5() {
        return getAnimated();
    }

    public final MessageReactionEmoji copy(String str, String src, String displayName, String str2, Boolean bool) {
        C9612q.m13917h(src, "src");
        C9612q.m13917h(displayName, "displayName");
        return new MessageReactionEmoji(str, src, displayName, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageReactionEmoji) {
            MessageReactionEmoji messageReactionEmoji = (MessageReactionEmoji) obj;
            return C9612q.m13922c(getName(), messageReactionEmoji.getName()) && C9612q.m13922c(getSrc(), messageReactionEmoji.getSrc()) && C9612q.m13922c(getDisplayName(), messageReactionEmoji.getDisplayName()) && C9612q.m13922c(getId(), messageReactionEmoji.getId()) && C9612q.m13922c(getAnimated(), messageReactionEmoji.getAnimated());
        }
        return false;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public Boolean getAnimated() {
        return this.animated;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getEmojiId() {
        return ReactionView.Emoji.DefaultImpls.getEmojiId(this);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getId() {
        return this.f8310id;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getName() {
        return this.name;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public boolean getShouldAnimate() {
        return ReactionView.Emoji.DefaultImpls.getShouldAnimate(this);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getSrc() {
        return this.src;
    }

    public int hashCode() {
        return ((((((((getName() == null ? 0 : getName().hashCode()) * 31) + getSrc().hashCode()) * 31) + getDisplayName().hashCode()) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31) + (getAnimated() != null ? getAnimated().hashCode() : 0);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public RenderableEmoji renderable() {
        return ReactionView.Emoji.DefaultImpls.renderable(this);
    }

    public String toString() {
        String name = getName();
        String src = getSrc();
        String displayName = getDisplayName();
        String id2 = getId();
        Boolean animated = getAnimated();
        return "MessageReactionEmoji(name=" + name + ", src=" + src + ", displayName=" + displayName + ", id=" + id2 + ", animated=" + animated + ")";
    }

    public MessageReactionEmoji(String str, String src, String displayName, String str2, Boolean bool) {
        C9612q.m13917h(src, "src");
        C9612q.m13917h(displayName, "displayName");
        this.name = str;
        this.src = src;
        this.displayName = displayName;
        this.f8310id = str2;
        this.animated = bool;
    }

    public /* synthetic */ MessageReactionEmoji(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
    }
}
