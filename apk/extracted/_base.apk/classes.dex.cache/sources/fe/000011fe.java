package com.discord.chat.presentation.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.ChatScrollStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListView$scrollToPosition$2 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ boolean $animated;
    final /* synthetic */ boolean $isHighlight;
    final /* synthetic */ int $position;
    final /* synthetic */ ChatListView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$scrollToPosition$2(ChatListView chatListView, boolean z, boolean z2, int i) {
        super(0);
        this.this$0 = chatListView;
        this.$animated = z;
        this.$isHighlight = z2;
        this.$position = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        ChatScrollStateObserver chatScrollStateObserver;
        RecyclerView.LayoutManager layoutManager;
        View mo35749N;
        chatScrollStateObserver = this.this$0.scrollStateObserver;
        chatScrollStateObserver.startWatching(this.this$0, ChatScrollStateObserver.EmitMode.YES);
        boolean z = this.$animated;
        if (z && this.$isHighlight) {
            ChatListHighlightItemAtPositionKt.chatListEmphasizeHighlightItemAtPosition$default(this.this$0, this.$position, 0L, 2, null);
        } else if (z) {
            ChatListHighlightItemAtPositionKt.chatListHighlightItemAtPosition$default(this.this$0, this.$position, 0L, 2, null);
        }
        if (!this.$animated || (layoutManager = this.this$0.getLayoutManager()) == null || (mo35749N = layoutManager.mo35749N(this.$position)) == null) {
            return;
        }
        mo35749N.sendAccessibilityEvent(8);
    }
}