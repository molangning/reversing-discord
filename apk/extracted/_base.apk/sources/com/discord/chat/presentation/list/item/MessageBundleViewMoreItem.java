package com.discord.chat.presentation.list.item;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/presentation/list/item/MessageBundleViewMoreItem;", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "viewMoreText", "", "(Ljava/lang/String;)V", "getViewMoreText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageBundleViewMoreItem extends MessageBundleItem {
    private final String viewMoreText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleViewMoreItem(String viewMoreText) {
        super("view more", null);
        C9612q.m13917h(viewMoreText, "viewMoreText");
        this.viewMoreText = viewMoreText;
    }

    public static /* synthetic */ MessageBundleViewMoreItem copy$default(MessageBundleViewMoreItem messageBundleViewMoreItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageBundleViewMoreItem.viewMoreText;
        }
        return messageBundleViewMoreItem.copy(str);
    }

    public final String component1() {
        return this.viewMoreText;
    }

    public final MessageBundleViewMoreItem copy(String viewMoreText) {
        C9612q.m13917h(viewMoreText, "viewMoreText");
        return new MessageBundleViewMoreItem(viewMoreText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageBundleViewMoreItem) && C9612q.m13922c(this.viewMoreText, ((MessageBundleViewMoreItem) obj).viewMoreText);
    }

    public final String getViewMoreText() {
        return this.viewMoreText;
    }

    public int hashCode() {
        return this.viewMoreText.hashCode();
    }

    public String toString() {
        String str = this.viewMoreText;
        return "MessageBundleViewMoreItem(viewMoreText=" + str + ")";
    }
}
