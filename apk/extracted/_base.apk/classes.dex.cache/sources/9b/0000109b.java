package com.discord.chat.bridge.reaction;

import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223BY\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÇ\u0001R\u001c\u0010\n\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0007\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, m14357d2 = {"Lcom/discord/chat/bridge/reaction/MessageReaction;", "Lcom/discord/reactions/ReactionView$Reaction;", "seen1", "", "count", "me", "", "isMeBurst", "emoji", "Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "burstCount", "themedBurstColors", "Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "isMe", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)V", "getBurstCount$annotations", "()V", "getBurstCount", "()I", "getCount", "getEmoji", "()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "()Z", "isMeBurst$annotations", "getMe", "getThemedBurstColors", "()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageReaction implements ReactionView.Reaction {
    public static final Companion Companion = new Companion(null);
    private final int burstCount;
    private final int count;
    private final MessageReactionEmoji emoji;
    private final boolean isMe;
    private final boolean isMeBurst;

    /* renamed from: me */
    private final boolean f8309me;
    private final ThemedBurstReactionColorPalette themedBurstColors;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/reaction/MessageReaction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageReaction> serializer() {
            return MessageReaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageReaction(int i, int i2, boolean z, boolean z2, MessageReactionEmoji messageReactionEmoji, int i3, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            C2620n1.m32836b(i, 11, MessageReaction$$serializer.INSTANCE.getDescriptor());
        }
        this.count = i2;
        this.f8309me = z;
        if ((i & 4) == 0) {
            this.isMeBurst = false;
        } else {
            this.isMeBurst = z2;
        }
        this.emoji = messageReactionEmoji;
        if ((i & 16) == 0) {
            this.burstCount = 0;
        } else {
            this.burstCount = i3;
        }
        if ((i & 32) == 0) {
            this.themedBurstColors = null;
        } else {
            this.themedBurstColors = themedBurstReactionColorPalette;
        }
        if ((i & 64) == 0) {
            this.isMe = z;
        } else {
            this.isMe = z3;
        }
    }

    public static /* synthetic */ MessageReaction copy$default(MessageReaction messageReaction, int i, boolean z, boolean z2, MessageReactionEmoji messageReactionEmoji, int i2, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = messageReaction.getCount();
        }
        if ((i3 & 2) != 0) {
            z = messageReaction.f8309me;
        }
        boolean z3 = z;
        if ((i3 & 4) != 0) {
            z2 = messageReaction.isMeBurst();
        }
        boolean z4 = z2;
        if ((i3 & 8) != 0) {
            messageReactionEmoji = messageReaction.getEmoji();
        }
        MessageReactionEmoji messageReactionEmoji2 = messageReactionEmoji;
        if ((i3 & 16) != 0) {
            i2 = messageReaction.getBurstCount();
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            themedBurstReactionColorPalette = messageReaction.getThemedBurstColors();
        }
        return messageReaction.copy(i, z3, z4, messageReactionEmoji2, i4, themedBurstReactionColorPalette);
    }

    public static /* synthetic */ void getBurstCount$annotations() {
    }

    public static /* synthetic */ void isMeBurst$annotations() {
    }

    public static final void write$Self(MessageReaction self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z4 = false;
        output.mo12882w(serialDesc, 0, self.getCount());
        output.mo12881x(serialDesc, 1, self.f8309me);
        if (output.mo12879z(serialDesc, 2) || self.isMeBurst()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12881x(serialDesc, 2, self.isMeBurst());
        }
        output.mo12894i(serialDesc, 3, MessageReactionEmoji$$serializer.INSTANCE, self.getEmoji());
        if (output.mo12879z(serialDesc, 4) || self.getBurstCount() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12882w(serialDesc, 4, self.getBurstCount());
        }
        if (output.mo12879z(serialDesc, 5) || self.getThemedBurstColors() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, self.getThemedBurstColors());
        }
        if (output.mo12879z(serialDesc, 6) || self.isMe() != self.f8309me) {
            z4 = true;
        }
        if (z4) {
            output.mo12881x(serialDesc, 6, self.isMe());
        }
    }

    public final int component1() {
        return getCount();
    }

    public final boolean component2() {
        return this.f8309me;
    }

    public final boolean component3() {
        return isMeBurst();
    }

    public final MessageReactionEmoji component4() {
        return getEmoji();
    }

    public final int component5() {
        return getBurstCount();
    }

    public final ThemedBurstReactionColorPalette component6() {
        return getThemedBurstColors();
    }

    public final MessageReaction copy(int i, boolean z, boolean z2, MessageReactionEmoji emoji, int i2, ThemedBurstReactionColorPalette themedBurstReactionColorPalette) {
        C9612q.m13917h(emoji, "emoji");
        return new MessageReaction(i, z, z2, emoji, i2, themedBurstReactionColorPalette);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageReaction) {
            MessageReaction messageReaction = (MessageReaction) obj;
            return getCount() == messageReaction.getCount() && this.f8309me == messageReaction.f8309me && isMeBurst() == messageReaction.isMeBurst() && C9612q.m13922c(getEmoji(), messageReaction.getEmoji()) && getBurstCount() == messageReaction.getBurstCount() && C9612q.m13922c(getThemedBurstColors(), messageReaction.getThemedBurstColors());
        }
        return false;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public int getBurstCount() {
        return this.burstCount;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public int getCount() {
        return this.count;
    }

    @Override // com.discord.recycler_view.utils.ItemDiffableType
    public Long getItemId() {
        return ReactionView.Reaction.DefaultImpls.getItemId(this);
    }

    public final boolean getMe() {
        return this.f8309me;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int count = getCount() * 31;
        boolean z = this.f8309me;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (count + i) * 31;
        boolean isMeBurst = isMeBurst();
        return ((((((i2 + (isMeBurst ? 1 : isMeBurst)) * 31) + getEmoji().hashCode()) * 31) + getBurstCount()) * 31) + (getThemedBurstColors() == null ? 0 : getThemedBurstColors().hashCode());
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public boolean isBurstReaction() {
        return ReactionView.Reaction.DefaultImpls.isBurstReaction(this);
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public boolean isMe() {
        return this.isMe;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public boolean isMeBurst() {
        return this.isMeBurst;
    }

    public String toString() {
        int count = getCount();
        boolean z = this.f8309me;
        boolean isMeBurst = isMeBurst();
        MessageReactionEmoji emoji = getEmoji();
        int burstCount = getBurstCount();
        ThemedBurstReactionColorPalette themedBurstColors = getThemedBurstColors();
        return "MessageReaction(count=" + count + ", me=" + z + ", isMeBurst=" + isMeBurst + ", emoji=" + emoji + ", burstCount=" + burstCount + ", themedBurstColors=" + themedBurstColors + ")";
    }

    public MessageReaction(int i, boolean z, boolean z2, MessageReactionEmoji emoji, int i2, ThemedBurstReactionColorPalette themedBurstReactionColorPalette) {
        C9612q.m13917h(emoji, "emoji");
        this.count = i;
        this.f8309me = z;
        this.isMeBurst = z2;
        this.emoji = emoji;
        this.burstCount = i2;
        this.themedBurstColors = themedBurstReactionColorPalette;
        this.isMe = z;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public MessageReactionEmoji getEmoji() {
        return this.emoji;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public ThemedBurstReactionColorPalette getThemedBurstColors() {
        return this.themedBurstColors;
    }

    public /* synthetic */ MessageReaction(int i, boolean z, boolean z2, MessageReactionEmoji messageReactionEmoji, int i2, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i3 & 4) != 0 ? false : z2, messageReactionEmoji, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : themedBurstReactionColorPalette);
    }
}