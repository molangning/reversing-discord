package com.discord.chat.reactevents;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.discord.reactions.ReactionView;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0011\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u0019\u0010\u0013\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m14357d2 = {"Lcom/discord/chat/reactevents/LongPressReactionData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getReaction", "()Lcom/discord/reactions/ReactionView$Reaction;", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "copy", "copy-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)Lcom/discord/chat/reactevents/LongPressReactionData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LongPressReactionData implements ReactEvent {
    private final long channelId;
    private final String messageId;
    private final ReactionView.Reaction reaction;

    private LongPressReactionData(String str, long j, ReactionView.Reaction reaction) {
        this.messageId = str;
        this.channelId = j;
        this.reaction = reaction;
    }

    public /* synthetic */ LongPressReactionData(String str, long j, ReactionView.Reaction reaction, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, reaction);
    }

    /* renamed from: copy-Eqy5D80$default  reason: not valid java name */
    public static /* synthetic */ LongPressReactionData m41819copyEqy5D80$default(LongPressReactionData longPressReactionData, String str, long j, ReactionView.Reaction reaction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = longPressReactionData.messageId;
        }
        if ((i & 2) != 0) {
            j = longPressReactionData.channelId;
        }
        if ((i & 4) != 0) {
            reaction = longPressReactionData.reaction;
        }
        return longPressReactionData.m41822copyEqy5D80(str, j, reaction);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41820component13Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41821component2o4g7jtM() {
        return this.channelId;
    }

    public final ReactionView.Reaction component3() {
        return this.reaction;
    }

    /* renamed from: copy-Eqy5D80  reason: not valid java name */
    public final LongPressReactionData m41822copyEqy5D80(String messageId, long j, ReactionView.Reaction reaction) {
        C9612q.m13917h(messageId, "messageId");
        return new LongPressReactionData(messageId, j, reaction, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LongPressReactionData) {
            LongPressReactionData longPressReactionData = (LongPressReactionData) obj;
            return MessageId.m42077equalsimpl0(this.messageId, longPressReactionData.messageId) && ChannelId.m42051equalsimpl0(this.channelId, longPressReactionData.channelId) && C9612q.m13922c(this.reaction, longPressReactionData.reaction);
        }
        return false;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41823getChannelIdo4g7jtM() {
        return this.channelId;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41824getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final ReactionView.Reaction getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        int m42078hashCodeimpl = ((MessageId.m42078hashCodeimpl(this.messageId) * 31) + ChannelId.m42052hashCodeimpl(this.channelId)) * 31;
        ReactionView.Reaction reaction = this.reaction;
        return m42078hashCodeimpl + (reaction == null ? 0 : reaction.hashCode());
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        WritableNativeMap writableNativeMap;
        ReactionView.Reaction reaction = this.reaction;
        Boolean bool = null;
        if (reaction != null) {
            writableNativeMap = NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("emoji", NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a(ZeroconfModule.KEY_SERVICE_NAME, reaction.getEmoji().getName()), C11591x.m7577a("id", this.reaction.getEmoji().getId()))), C11591x.m7577a("me", Boolean.valueOf(this.reaction.isMe())));
        } else {
            writableNativeMap = null;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = C11591x.m7577a("messageId", this.messageId);
        pairArr[1] = C11591x.m7577a("channelId", ChannelId.m42054toStringimpl(this.channelId));
        pairArr[2] = C11591x.m7577a("reaction", writableNativeMap);
        ReactionView.Reaction reaction2 = this.reaction;
        if (reaction2 != null) {
            bool = Boolean.valueOf(reaction2.isBurstReaction());
        }
        pairArr[3] = C11591x.m7577a("isBurst", bool);
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        ReactionView.Reaction reaction = this.reaction;
        return "LongPressReactionData(messageId=" + m42079toStringimpl + ", channelId=" + m42054toStringimpl + ", reaction=" + reaction + ")";
    }
}
