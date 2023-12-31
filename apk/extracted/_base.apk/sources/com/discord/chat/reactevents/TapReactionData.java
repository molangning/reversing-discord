package com.discord.chat.reactevents;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\tJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m14357d2 = {"Lcom/discord/chat/reactevents/TapReactionData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "isBurst", "", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getReaction", "()Lcom/discord/reactions/ReactionView$Reaction;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)Lcom/discord/chat/reactevents/TapReactionData;", "equals", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapReactionData implements ReactEvent {
    private final Boolean isBurst;
    private final String messageId;
    private final ReactionView.Reaction reaction;

    private TapReactionData(String str, ReactionView.Reaction reaction, Boolean bool) {
        this.messageId = str;
        this.reaction = reaction;
        this.isBurst = bool;
    }

    public /* synthetic */ TapReactionData(String str, ReactionView.Reaction reaction, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, reaction, bool);
    }

    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ TapReactionData m41873copyu7_MRrM$default(TapReactionData tapReactionData, String str, ReactionView.Reaction reaction, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapReactionData.messageId;
        }
        if ((i & 2) != 0) {
            reaction = tapReactionData.reaction;
        }
        if ((i & 4) != 0) {
            bool = tapReactionData.isBurst;
        }
        return tapReactionData.m41875copyu7_MRrM(str, reaction, bool);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41874component13Eiw7ao() {
        return this.messageId;
    }

    public final ReactionView.Reaction component2() {
        return this.reaction;
    }

    public final Boolean component3() {
        return this.isBurst;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final TapReactionData m41875copyu7_MRrM(String messageId, ReactionView.Reaction reaction, Boolean bool) {
        C9612q.m13917h(messageId, "messageId");
        return new TapReactionData(messageId, reaction, bool, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapReactionData) {
            TapReactionData tapReactionData = (TapReactionData) obj;
            return MessageId.m42077equalsimpl0(this.messageId, tapReactionData.messageId) && C9612q.m13922c(this.reaction, tapReactionData.reaction) && C9612q.m13922c(this.isBurst, tapReactionData.isBurst);
        }
        return false;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41876getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final ReactionView.Reaction getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        int m42078hashCodeimpl = MessageId.m42078hashCodeimpl(this.messageId) * 31;
        ReactionView.Reaction reaction = this.reaction;
        int hashCode = (m42078hashCodeimpl + (reaction == null ? 0 : reaction.hashCode())) * 31;
        Boolean bool = this.isBurst;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isBurst() {
        return this.isBurst;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        WritableNativeMap writableNativeMap;
        Boolean bool;
        ReactionView.Reaction reaction = this.reaction;
        if (reaction != null) {
            writableNativeMap = NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("emoji", NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a(ZeroconfModule.KEY_SERVICE_NAME, reaction.getEmoji().getName()), C11591x.m7577a("id", this.reaction.getEmoji().getId()))), C11591x.m7577a("me", Boolean.valueOf(this.reaction.isMe())), C11591x.m7577a("me_burst", Boolean.valueOf(this.reaction.isMeBurst())));
        } else {
            writableNativeMap = null;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C11591x.m7577a("messageId", this.messageId);
        pairArr[1] = C11591x.m7577a("reaction", writableNativeMap);
        ReactionView.Reaction reaction2 = this.reaction;
        if (reaction2 != null) {
            bool = Boolean.valueOf(reaction2.isBurstReaction());
        } else {
            bool = this.isBurst;
        }
        pairArr[2] = C11591x.m7577a("isBurst", bool);
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        ReactionView.Reaction reaction = this.reaction;
        Boolean bool = this.isBurst;
        return "TapReactionData(messageId=" + m42079toStringimpl + ", reaction=" + reaction + ", isBurst=" + bool + ")";
    }

    public /* synthetic */ TapReactionData(String str, ReactionView.Reaction reaction, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, reaction, (i & 4) != 0 ? Boolean.FALSE : bool, null);
    }
}
