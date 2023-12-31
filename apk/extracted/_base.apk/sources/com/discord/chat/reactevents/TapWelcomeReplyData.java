package com.discord.chat.reactevents;

import co.discord.media_engine.C2689b;
import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapWelcomeReplyData;", "Lcom/discord/reactevents/ReactEvent;", "stickerId", "", "messageId", "Lcom/discord/primitives/MessageId;", "(JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getStickerId", "()J", "component1", "component2", "component2-3Eiw7ao", "copy", "copy-Ayv7vGE", "(JLjava/lang/String;)Lcom/discord/chat/reactevents/TapWelcomeReplyData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapWelcomeReplyData implements ReactEvent {
    private final String messageId;
    private final long stickerId;

    private TapWelcomeReplyData(long j, String str) {
        this.stickerId = j;
        this.messageId = str;
    }

    public /* synthetic */ TapWelcomeReplyData(long j, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str);
    }

    /* renamed from: copy-Ayv7vGE$default  reason: not valid java name */
    public static /* synthetic */ TapWelcomeReplyData m41899copyAyv7vGE$default(TapWelcomeReplyData tapWelcomeReplyData, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tapWelcomeReplyData.stickerId;
        }
        if ((i & 2) != 0) {
            str = tapWelcomeReplyData.messageId;
        }
        return tapWelcomeReplyData.m41901copyAyv7vGE(j, str);
    }

    public final long component1() {
        return this.stickerId;
    }

    /* renamed from: component2-3Eiw7ao  reason: not valid java name */
    public final String m41900component23Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: copy-Ayv7vGE  reason: not valid java name */
    public final TapWelcomeReplyData m41901copyAyv7vGE(long j, String messageId) {
        C9612q.m13917h(messageId, "messageId");
        return new TapWelcomeReplyData(j, messageId, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapWelcomeReplyData) {
            TapWelcomeReplyData tapWelcomeReplyData = (TapWelcomeReplyData) obj;
            return this.stickerId == tapWelcomeReplyData.stickerId && MessageId.m42077equalsimpl0(this.messageId, tapWelcomeReplyData.messageId);
        }
        return false;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41902getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final long getStickerId() {
        return this.stickerId;
    }

    public int hashCode() {
        return (C2689b.m32716a(this.stickerId) * 31) + MessageId.m42078hashCodeimpl(this.messageId);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("messageId", MessageId.m42079toStringimpl(this.messageId)), C11591x.m7577a("stickerId", String.valueOf(this.stickerId)));
    }

    public String toString() {
        long j = this.stickerId;
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        return "TapWelcomeReplyData(stickerId=" + j + ", messageId=" + m42079toStringimpl + ")";
    }
}
