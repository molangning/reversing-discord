package com.discord.chat.presentation.list;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a+\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m14357d2 = {"getMessageAccessoriesViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "configureMessageRecyclerView", "", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "decorations", "", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;[Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListUtilsKt {
    public static final void configureMessageRecyclerView(RecyclerView recyclerView, Context context, RecyclerView.ItemDecoration... decorations) {
        C9612q.m13917h(recyclerView, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(decorations, "decorations");
        recyclerView.addItemDecoration(new BackgroundHighlightDecoration(context));
        recyclerView.setItemViewCacheSize(20);
        for (RecyclerView.ItemDecoration itemDecoration : decorations) {
            recyclerView.addItemDecoration(itemDecoration);
        }
        recyclerView.setItemAnimator(null);
    }

    public static final RecyclerView.RecycledViewPool getMessageAccessoriesViewPool() {
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.m35666k(0, 50);
        recycledViewPool.m35666k(2, 20);
        recycledViewPool.m35666k(1, 20);
        recycledViewPool.m35666k(4, 10);
        return recycledViewPool;
    }
}
