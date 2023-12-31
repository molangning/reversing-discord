package com.discord.chat.presentation.list.item;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "id", "", "json", "causeMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCauseMessage", "()Ljava/lang/String;", "getId", "getJson", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DeserializationErrorChatListItem extends ChatListItem {
    private final String causeMessage;

    /* renamed from: id */
    private final String f8393id;
    private final String json;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializationErrorChatListItem(String id2, String json, String causeMessage) {
        super(id2, null);
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(json, "json");
        C9612q.m13917h(causeMessage, "causeMessage");
        this.f8393id = id2;
        this.json = json;
        this.causeMessage = causeMessage;
    }

    public static /* synthetic */ DeserializationErrorChatListItem copy$default(DeserializationErrorChatListItem deserializationErrorChatListItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deserializationErrorChatListItem.getId();
        }
        if ((i & 2) != 0) {
            str2 = deserializationErrorChatListItem.json;
        }
        if ((i & 4) != 0) {
            str3 = deserializationErrorChatListItem.causeMessage;
        }
        return deserializationErrorChatListItem.copy(str, str2, str3);
    }

    public final String component1() {
        return getId();
    }

    public final String component2() {
        return this.json;
    }

    public final String component3() {
        return this.causeMessage;
    }

    public final DeserializationErrorChatListItem copy(String id2, String json, String causeMessage) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(json, "json");
        C9612q.m13917h(causeMessage, "causeMessage");
        return new DeserializationErrorChatListItem(id2, json, causeMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeserializationErrorChatListItem) {
            DeserializationErrorChatListItem deserializationErrorChatListItem = (DeserializationErrorChatListItem) obj;
            return C9612q.m13922c(getId(), deserializationErrorChatListItem.getId()) && C9612q.m13922c(this.json, deserializationErrorChatListItem.json) && C9612q.m13922c(this.causeMessage, deserializationErrorChatListItem.causeMessage);
        }
        return false;
    }

    public final String getCauseMessage() {
        return this.causeMessage;
    }

    @Override // com.discord.chat.presentation.list.item.ChatListItem
    public String getId() {
        return this.f8393id;
    }

    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        return (((getId().hashCode() * 31) + this.json.hashCode()) * 31) + this.causeMessage.hashCode();
    }

    public String toString() {
        String id2 = getId();
        String str = this.json;
        String str2 = this.causeMessage;
        return "DeserializationErrorChatListItem(id=" + id2 + ", json=" + str + ", causeMessage=" + str2 + ")";
    }
}
