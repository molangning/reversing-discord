package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J \u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapInviteToSpeakData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "copy", "copy-1xi1bu0", "(Ljava/lang/String;)Lcom/discord/chat/reactevents/TapInviteToSpeakData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapInviteToSpeakData implements ReactEvent {
    private final String messageId;

    private TapInviteToSpeakData(String str) {
        this.messageId = str;
    }

    public /* synthetic */ TapInviteToSpeakData(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: copy-1xi1bu0$default */
    public static /* synthetic */ TapInviteToSpeakData m41857copy1xi1bu0$default(TapInviteToSpeakData tapInviteToSpeakData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapInviteToSpeakData.messageId;
        }
        return tapInviteToSpeakData.m41859copy1xi1bu0(str);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41858component13Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: copy-1xi1bu0 */
    public final TapInviteToSpeakData m41859copy1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        return new TapInviteToSpeakData(messageId, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapInviteToSpeakData) && MessageId.m42077equalsimpl0(this.messageId, ((TapInviteToSpeakData) obj).messageId);
    }

    /* renamed from: getMessageId-3Eiw7ao */
    public final String m41860getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return MessageId.m42078hashCodeimpl(this.messageId);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("messageId", MessageId.m42079toStringimpl(this.messageId)));
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        return "TapInviteToSpeakData(messageId=" + m42079toStringimpl + ")";
    }
}