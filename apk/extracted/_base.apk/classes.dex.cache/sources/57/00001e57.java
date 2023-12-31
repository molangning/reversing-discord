package com.discord.reactions;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/reactions/BurstReactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "reactionView", "Lcom/discord/reactions/BurstReactionView;", "(Lcom/discord/reactions/BurstReactionView;)V", "bind", "", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "onReactionClick", "Lkotlin/Function1;", "onReactionLongPress", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class BurstReactionViewHolder extends RecyclerView.ViewHolder {
    private final BurstReactionView reactionView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BurstReactionViewHolder(BurstReactionView reactionView) {
        super(reactionView);
        C9612q.m13917h(reactionView, "reactionView");
        this.reactionView = reactionView;
    }

    public static final void bind$lambda$2$lambda$0(Function1 onReactionClick, ReactionView.Reaction reaction, View view) {
        C9612q.m13917h(onReactionClick, "$onReactionClick");
        C9612q.m13917h(reaction, "$reaction");
        onReactionClick.invoke(reaction);
    }

    public static final boolean bind$lambda$2$lambda$1(Function1 onReactionLongPress, ReactionView.Reaction reaction, View view) {
        C9612q.m13917h(onReactionLongPress, "$onReactionLongPress");
        C9612q.m13917h(reaction, "$reaction");
        onReactionLongPress.invoke(reaction);
        return true;
    }

    public final void bind(final ReactionView.Reaction reaction, final Function1<? super ReactionView.Reaction, Unit> onReactionClick, final Function1<? super ReactionView.Reaction, Unit> onReactionLongPress) {
        C9612q.m13917h(reaction, "reaction");
        C9612q.m13917h(onReactionClick, "onReactionClick");
        C9612q.m13917h(onReactionLongPress, "onReactionLongPress");
        BurstReactionView burstReactionView = this.reactionView;
        burstReactionView.setReaction(reaction);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(burstReactionView, false, new View.OnClickListener() { // from class: com.discord.reactions.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BurstReactionViewHolder.bind$lambda$2$lambda$0(Function1.this, reaction, view);
            }
        }, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(burstReactionView, false, new View.OnLongClickListener() { // from class: com.discord.reactions.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean bind$lambda$2$lambda$1;
                bind$lambda$2$lambda$1 = BurstReactionViewHolder.bind$lambda$2$lambda$1(Function1.this, reaction, view);
                return bind$lambda$2$lambda$1;
            }
        }, 1, null);
    }
}