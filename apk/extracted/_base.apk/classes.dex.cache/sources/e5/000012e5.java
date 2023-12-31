package com.discord.chat.presentation.message.decorations;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.view.ForumPostActionBarView;
import com.discord.chat.presentation.message.view.ImageAttachmentView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "leftMarginPx", "", "rightMarginPx", "(II)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageAccessoriesHorizontalSpacingDecoration extends RecyclerView.ItemDecoration {
    private final int leftMarginPx;
    private final int rightMarginPx;

    public MessageAccessoriesHorizontalSpacingDecoration(int i, int i2) {
        this.leftMarginPx = i;
        this.rightMarginPx = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        C9612q.m13917h(outRect, "outRect");
        C9612q.m13917h(view, "view");
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(state, "state");
        if (!(view instanceof ForumPostActionBarView) && !(view instanceof ImageAttachmentView)) {
            outRect.left = this.leftMarginPx;
            outRect.right = this.rightMarginPx;
        }
    }
}