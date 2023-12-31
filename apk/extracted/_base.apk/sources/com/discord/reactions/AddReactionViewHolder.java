package com.discord.reactions;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/reactions/AddReactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "addReactionView", "Lcom/discord/reactions/AddReactionView;", "(Lcom/discord/reactions/AddReactionView;)V", "bind", "", "addReactionLabel", "", "addNewReactionAccessibilityLabel", "onAddReactionClick", "Landroid/view/View$OnClickListener;", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class AddReactionViewHolder extends RecyclerView.ViewHolder {
    private final AddReactionView addReactionView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReactionViewHolder(AddReactionView addReactionView) {
        super(addReactionView);
        C9612q.m13917h(addReactionView, "addReactionView");
        this.addReactionView = addReactionView;
    }

    public final void bind(String addReactionLabel, String addNewReactionAccessibilityLabel, View.OnClickListener onAddReactionClick, ReactionView.ReactionsTheme reactionsTheme) {
        C9612q.m13917h(addReactionLabel, "addReactionLabel");
        C9612q.m13917h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9612q.m13917h(onAddReactionClick, "onAddReactionClick");
        AddReactionView addReactionView = this.addReactionView;
        addReactionView.configure(addReactionLabel, reactionsTheme, false);
        addReactionView.setContentDescription(addNewReactionAccessibilityLabel);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(addReactionView, false, onAddReactionClick, 1, null);
    }
}
