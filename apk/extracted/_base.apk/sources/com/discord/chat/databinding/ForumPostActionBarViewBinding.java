package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.core.DCDButton;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionsView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ForumPostActionBarViewBinding implements ViewBinding {
    public final AddReactionView addReaction;
    public final DCDButton followButton;
    public final Barrier footerBarrier;
    public final View footerDivider;
    public final Barrier headerBarrier;
    public final View headerDivider;
    public final DCDButton otherReactionsCount;
    public final ReactionsView reactionsView;
    private final View rootView;
    public final DCDButton shareButton;
    public final DCDButton sharePromptCloseButton;
    public final ConstraintLayout sharePromptContainer;
    public final DCDButton sharePromptCopyLinkButton;
    public final SimpleDraweeView sharePromptIcon;
    public final SimpleDraweeSpanTextView sharePromptSubtitle;
    public final TextView sharePromptTitle;
    public final Space spacer;
    public final Space startSpacer;

    private ForumPostActionBarViewBinding(View view, AddReactionView addReactionView, DCDButton dCDButton, Barrier barrier, View view2, Barrier barrier2, View view3, DCDButton dCDButton2, ReactionsView reactionsView, DCDButton dCDButton3, DCDButton dCDButton4, ConstraintLayout constraintLayout, DCDButton dCDButton5, SimpleDraweeView simpleDraweeView, SimpleDraweeSpanTextView simpleDraweeSpanTextView, TextView textView, Space space, Space space2) {
        this.rootView = view;
        this.addReaction = addReactionView;
        this.followButton = dCDButton;
        this.footerBarrier = barrier;
        this.footerDivider = view2;
        this.headerBarrier = barrier2;
        this.headerDivider = view3;
        this.otherReactionsCount = dCDButton2;
        this.reactionsView = reactionsView;
        this.shareButton = dCDButton3;
        this.sharePromptCloseButton = dCDButton4;
        this.sharePromptContainer = constraintLayout;
        this.sharePromptCopyLinkButton = dCDButton5;
        this.sharePromptIcon = simpleDraweeView;
        this.sharePromptSubtitle = simpleDraweeSpanTextView;
        this.sharePromptTitle = textView;
        this.spacer = space;
        this.startSpacer = space2;
    }

    public static ForumPostActionBarViewBinding bind(View view) {
        View m3875a;
        View m3875a2;
        int i = C2912R.C2914id.add_reaction;
        AddReactionView addReactionView = (AddReactionView) C12815a.m3875a(view, i);
        if (addReactionView != null) {
            i = C2912R.C2914id.follow_button;
            DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
            if (dCDButton != null) {
                i = C2912R.C2914id.footer_barrier;
                Barrier barrier = (Barrier) C12815a.m3875a(view, i);
                if (barrier != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.footer_divider))) != null) {
                    i = C2912R.C2914id.header_barrier;
                    Barrier barrier2 = (Barrier) C12815a.m3875a(view, i);
                    if (barrier2 != null && (m3875a2 = C12815a.m3875a(view, (i = C2912R.C2914id.header_divider))) != null) {
                        i = C2912R.C2914id.other_reactions_count;
                        DCDButton dCDButton2 = (DCDButton) C12815a.m3875a(view, i);
                        if (dCDButton2 != null) {
                            i = C2912R.C2914id.reactions_view;
                            ReactionsView reactionsView = (ReactionsView) C12815a.m3875a(view, i);
                            if (reactionsView != null) {
                                i = C2912R.C2914id.share_button;
                                DCDButton dCDButton3 = (DCDButton) C12815a.m3875a(view, i);
                                if (dCDButton3 != null) {
                                    i = C2912R.C2914id.share_prompt_close_button;
                                    DCDButton dCDButton4 = (DCDButton) C12815a.m3875a(view, i);
                                    if (dCDButton4 != null) {
                                        i = C2912R.C2914id.share_prompt_container;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                                        if (constraintLayout != null) {
                                            i = C2912R.C2914id.share_prompt_copy_link_button;
                                            DCDButton dCDButton5 = (DCDButton) C12815a.m3875a(view, i);
                                            if (dCDButton5 != null) {
                                                i = C2912R.C2914id.share_prompt_icon;
                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                                                if (simpleDraweeView != null) {
                                                    i = C2912R.C2914id.share_prompt_subtitle;
                                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                                                    if (simpleDraweeSpanTextView != null) {
                                                        i = C2912R.C2914id.share_prompt_title;
                                                        TextView textView = (TextView) C12815a.m3875a(view, i);
                                                        if (textView != null) {
                                                            i = C2912R.C2914id.spacer;
                                                            Space space = (Space) C12815a.m3875a(view, i);
                                                            if (space != null) {
                                                                i = C2912R.C2914id.start_spacer;
                                                                Space space2 = (Space) C12815a.m3875a(view, i);
                                                                if (space2 != null) {
                                                                    return new ForumPostActionBarViewBinding(view, addReactionView, dCDButton, barrier, m3875a, barrier2, m3875a2, dCDButton2, reactionsView, dCDButton3, dCDButton4, constraintLayout, dCDButton5, simpleDraweeView, simpleDraweeSpanTextView, textView, space, space2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ForumPostActionBarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.forum_post_action_bar_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
