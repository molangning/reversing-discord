package com.discord.recycler_view.utils;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.recycler_view.scroller.Scroller;
import com.discord.recycler_view.scroller.SmoothScroller;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a*\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0000\u001a\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0000\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0002¨\u0006\u000e"}, m14357d2 = {"scrollToCenter", "", "Landroidx/recyclerview/widget/RecyclerView;", ViewProps.POSITION, "", "scrollToPositionAnimated", "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "onComplete", "Lkotlin/Function0;", "scrollToPositionWithOffset", "offset", "scrollToTop", "toggleSuppressLayout", "recycler_view_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class RecyclerViewExtensionsKt {
    public static final void scrollToCenter(RecyclerView recyclerView, int i) {
        C9612q.m13917h(recyclerView, "<this>");
        scrollToPositionWithOffset(recyclerView, i, recyclerView.getHeight() / 2);
    }

    public static final void scrollToPositionAnimated(RecyclerView recyclerView, int i, Scroller.TargetAlignment targetAlignment, Function0<Unit> onComplete) {
        C9612q.m13917h(recyclerView, "<this>");
        C9612q.m13917h(targetAlignment, "targetAlignment");
        C9612q.m13917h(onComplete, "onComplete");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C9612q.m13920e(layoutManager);
        Context context = recyclerView.getContext();
        C9612q.m13918g(context, "context");
        layoutManager.m35740S1(new SmoothScroller(context, i, targetAlignment, onComplete));
    }

    public static final void scrollToPositionWithOffset(RecyclerView recyclerView, int i, int i2) {
        C9612q.m13917h(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C9612q.m13919f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).m35845K2(i, i2);
    }

    public static final void scrollToTop(RecyclerView recyclerView, int i, int i2) {
        int i3;
        View view;
        C9612q.m13917h(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C9612q.m13919f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((LinearLayoutManager) layoutManager).m35805x2()) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                i3 = view.getHeight();
            } else {
                i3 = 0;
            }
            if (i3 == 0) {
                recyclerView.scrollToPosition(i);
                return;
            } else {
                scrollToPositionWithOffset(recyclerView, i, (recyclerView.getHeight() - (i3 * 2)) - i2);
                return;
            }
        }
        scrollToPositionWithOffset(recyclerView, i, i2);
    }

    public static final void toggleSuppressLayout(RecyclerView recyclerView) {
        C9612q.m13917h(recyclerView, "<this>");
        recyclerView.suppressLayout(true);
        recyclerView.suppressLayout(false);
    }
}