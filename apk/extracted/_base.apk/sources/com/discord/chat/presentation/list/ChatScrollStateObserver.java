package com.discord.chat.presentation.list;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "scrollStateUpdated", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/list/ScrollState;", "", "(Lkotlin/jvm/functions/Function1;)V", "isWatching", "", "scrollState", "scrollStateInt", "", "computeScrollState", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "scrollAmountY", "emitMode", "Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;", "getScrollState", "onScrollStateChanged", "newState", "onScrolled", "dx", "dy", "startWatching", "stopWatching", "EmitMode", "Thresholds", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatScrollStateObserver extends RecyclerView.OnScrollListener {
    private boolean isWatching;
    private ScrollState scrollState;
    private int scrollStateInt;
    private final Function1<ScrollState, Unit> scrollStateUpdated;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;", "", "(Ljava/lang/String;I)V", "YES", "NO", "IF_CHANGED", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EmitMode {
        YES,
        NO,
        IF_CHANGED
    }

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver$Thresholds;", "", "()V", "NearBottom", "", "NearTop", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    private static final class Thresholds {
        public static final Thresholds INSTANCE = new Thresholds();
        public static final int NearBottom = 5;
        public static final int NearTop = 15;

        private Thresholds() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatScrollStateObserver(Function1<? super ScrollState, Unit> scrollStateUpdated) {
        C9612q.m13917h(scrollStateUpdated, "scrollStateUpdated");
        this.scrollStateUpdated = scrollStateUpdated;
    }

    private final void computeScrollState(RecyclerView recyclerView, int i, int i2, EmitMode emitMode) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int m21930c;
        boolean z4;
        boolean z5;
        boolean z6;
        ScrollDirection scrollDirection;
        boolean z7;
        ScrollState scrollState;
        if (!this.isWatching) {
            return;
        }
        this.scrollStateInt = i;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C9612q.m13919f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        boolean m35805x2 = linearLayoutManager.m35805x2();
        int m35820i2 = linearLayoutManager.m35820i2();
        if (m35820i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 5;
        if (m35805x2) {
            i3 = 5;
        } else {
            i3 = 15;
        }
        if (m35820i2 <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        int m35715j0 = linearLayoutManager.m35715j0() - 1;
        int m35819j2 = linearLayoutManager.m35819j2();
        int m35817l2 = linearLayoutManager.m35817l2();
        if (m35819j2 == m35715j0 && m35819j2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (m35805x2) {
            i4 = 15;
        }
        m21930c = C6759j.m21930c(m35715j0 - i4, 0);
        if (m21930c <= m35819j2 && m35819j2 <= m35715j0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = this.scrollStateInt;
        if (i5 == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i5 == 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (i2 < 0) {
            scrollDirection = ScrollDirection.UP;
        } else if (i2 > 0) {
            scrollDirection = ScrollDirection.DOWN;
        } else {
            scrollDirection = null;
        }
        ScrollDirection scrollDirection2 = scrollDirection;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        C9612q.m13919f(adapter, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChannelChatListAdapter");
        int firstMessageItemPosition = ((ChannelChatListAdapter) adapter).getFirstMessageItemPosition();
        if (m35820i2 <= firstMessageItemPosition && firstMessageItemPosition <= m35819j2) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (m35805x2) {
            scrollState = new ScrollState(z5, z6, z2, z, z4, z3, scrollDirection2, z7, m35817l2, m35820i2);
        } else {
            scrollState = new ScrollState(z5, z6, z4, z3, z2, z, scrollDirection2, z7, m35820i2, m35817l2);
        }
        boolean z8 = !C9612q.m13922c(this.scrollState, scrollState);
        this.scrollState = scrollState;
        if (emitMode == EmitMode.YES || (emitMode == EmitMode.IF_CHANGED && z8)) {
            this.scrollStateUpdated.invoke(scrollState);
        }
    }

    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C9612q.m13917h(recyclerView, "recyclerView");
        computeScrollState(recyclerView, i, 0, EmitMode.IF_CHANGED);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C9612q.m13917h(recyclerView, "recyclerView");
        computeScrollState(recyclerView, this.scrollStateInt, i2, EmitMode.IF_CHANGED);
    }

    public final void startWatching(RecyclerView recyclerView, EmitMode emitMode) {
        C9612q.m13917h(recyclerView, "recyclerView");
        C9612q.m13917h(emitMode, "emitMode");
        this.isWatching = true;
        computeScrollState(recyclerView, this.scrollStateInt, 0, emitMode);
    }

    public final void stopWatching() {
        this.isWatching = false;
    }
}
