package com.discord.chat.presentation.list.item;

import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "id", "", "view", "Landroid/view/View;", "measuredDimensions", "Lkotlin/Pair;", "", "(Ljava/lang/String;Landroid/view/View;Lkotlin/Pair;)V", "getId", "()Ljava/lang/String;", "getMeasuredDimensions", "()Lkotlin/Pair;", "getView", "()Landroid/view/View;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PortalViewChatListItem extends ChatListItem {

    /* renamed from: id */
    private final String f8395id;
    private final Pair<Integer, Integer> measuredDimensions;
    private final View view;

    public /* synthetic */ PortalViewChatListItem(String str, View view, Pair pair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, view, (i & 4) != 0 ? null : pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortalViewChatListItem copy$default(PortalViewChatListItem portalViewChatListItem, String str, View view, Pair pair, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portalViewChatListItem.getId();
        }
        if ((i & 2) != 0) {
            view = portalViewChatListItem.view;
        }
        if ((i & 4) != 0) {
            pair = portalViewChatListItem.measuredDimensions;
        }
        return portalViewChatListItem.copy(str, view, pair);
    }

    public final String component1() {
        return getId();
    }

    public final View component2() {
        return this.view;
    }

    public final Pair<Integer, Integer> component3() {
        return this.measuredDimensions;
    }

    public final PortalViewChatListItem copy(String id2, View view, Pair<Integer, Integer> pair) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(view, "view");
        return new PortalViewChatListItem(id2, view, pair);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PortalViewChatListItem) {
            PortalViewChatListItem portalViewChatListItem = (PortalViewChatListItem) obj;
            return C9612q.m13922c(getId(), portalViewChatListItem.getId()) && C9612q.m13922c(this.view, portalViewChatListItem.view) && C9612q.m13922c(this.measuredDimensions, portalViewChatListItem.measuredDimensions);
        }
        return false;
    }

    @Override // com.discord.chat.presentation.list.item.ChatListItem
    public String getId() {
        return this.f8395id;
    }

    public final Pair<Integer, Integer> getMeasuredDimensions() {
        return this.measuredDimensions;
    }

    public final View getView() {
        return this.view;
    }

    public int hashCode() {
        int hashCode = ((getId().hashCode() * 31) + this.view.hashCode()) * 31;
        Pair<Integer, Integer> pair = this.measuredDimensions;
        return hashCode + (pair == null ? 0 : pair.hashCode());
    }

    public String toString() {
        String id2 = getId();
        View view = this.view;
        Pair<Integer, Integer> pair = this.measuredDimensions;
        return "PortalViewChatListItem(id=" + id2 + ", view=" + view + ", measuredDimensions=" + pair + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortalViewChatListItem(String id2, View view, Pair<Integer, Integer> pair) {
        super(id2, null);
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(view, "view");
        this.f8395id = id2;
        this.view = view;
        this.measuredDimensions = pair;
    }
}