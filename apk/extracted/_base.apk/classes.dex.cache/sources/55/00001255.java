package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.summaries.Summary;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\f8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\f8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m14357d2 = {"Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.COLOR, "", "summary", "Lcom/discord/chat/bridge/summaries/Summary;", "isBeforeContent", "", "(ILcom/discord/chat/bridge/summaries/Summary;Z)V", "getColor", "()I", "currentMsgId", "Lcom/discord/primitives/MessageId;", "getCurrentMsgId-3Eiw7ao", "()Ljava/lang/String;", "()Z", "jumpToMsgId", "getJumpToMsgId-3Eiw7ao", "getSummary", "()Lcom/discord/chat/bridge/summaries/Summary;", "text", "", "getText", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SummarySeparatorChatListItem extends ChatListItem {
    private final int color;
    private final boolean isBeforeContent;
    private final Summary summary;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SummarySeparatorChatListItem(int r5, com.discord.chat.bridge.summaries.Summary r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "summary"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            java.lang.String r0 = r6.getId()
            if (r7 == 0) goto Le
            java.lang.String r1 = "start"
            goto L10
        Le:
            java.lang.String r1 = "end"
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "separator: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 0
            r4.<init>(r0, r1)
            r4.color = r5
            r4.summary = r6
            r4.isBeforeContent = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.item.SummarySeparatorChatListItem.<init>(int, com.discord.chat.bridge.summaries.Summary, boolean):void");
    }

    public static /* synthetic */ SummarySeparatorChatListItem copy$default(SummarySeparatorChatListItem summarySeparatorChatListItem, int i, Summary summary, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = summarySeparatorChatListItem.color;
        }
        if ((i2 & 2) != 0) {
            summary = summarySeparatorChatListItem.summary;
        }
        if ((i2 & 4) != 0) {
            z = summarySeparatorChatListItem.isBeforeContent;
        }
        return summarySeparatorChatListItem.copy(i, summary, z);
    }

    public final int component1() {
        return this.color;
    }

    public final Summary component2() {
        return this.summary;
    }

    public final boolean component3() {
        return this.isBeforeContent;
    }

    public final SummarySeparatorChatListItem copy(int i, Summary summary, boolean z) {
        C9612q.m13917h(summary, "summary");
        return new SummarySeparatorChatListItem(i, summary, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SummarySeparatorChatListItem) {
            SummarySeparatorChatListItem summarySeparatorChatListItem = (SummarySeparatorChatListItem) obj;
            return this.color == summarySeparatorChatListItem.color && C9612q.m13922c(this.summary, summarySeparatorChatListItem.summary) && this.isBeforeContent == summarySeparatorChatListItem.isBeforeContent;
        }
        return false;
    }

    public final int getColor() {
        return this.color;
    }

    /* renamed from: getCurrentMsgId-3Eiw7ao */
    public final String m41625getCurrentMsgId3Eiw7ao() {
        return this.isBeforeContent ? this.summary.m41566getStartId3Eiw7ao() : this.summary.m41565getEndId3Eiw7ao();
    }

    /* renamed from: getJumpToMsgId-3Eiw7ao */
    public final String m41626getJumpToMsgId3Eiw7ao() {
        return this.isBeforeContent ? this.summary.m41565getEndId3Eiw7ao() : this.summary.m41566getStartId3Eiw7ao();
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public final String getText() {
        return this.summary.getTopic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.color * 31) + this.summary.hashCode()) * 31;
        boolean z = this.isBeforeContent;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isBeforeContent() {
        return this.isBeforeContent;
    }

    public String toString() {
        int i = this.color;
        Summary summary = this.summary;
        boolean z = this.isBeforeContent;
        return "SummarySeparatorChatListItem(color=" + i + ", summary=" + summary + ", isBeforeContent=" + z + ")";
    }
}