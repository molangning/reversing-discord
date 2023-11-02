package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedFooterView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class FlaggedMessageEmbedViewBinding implements ViewBinding {
    public final SimpleDraweeView authorAvatar;
    public final TextView authorName;
    public final ConnectionsRoleTagView connectionsRoleTag;
    public final FlaggedMessageEmbedFooterView contentFooterView;
    public final MessageContentView contentView;
    public final SimpleDraweeView guildCommunicationDisabledIcon;
    public final Guideline messageEndGuideline;
    public final Guideline messageStartGuideline;
    public final RoleIconView roleIcon;
    private final View rootView;

    private FlaggedMessageEmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, ConnectionsRoleTagView connectionsRoleTagView, FlaggedMessageEmbedFooterView flaggedMessageEmbedFooterView, MessageContentView messageContentView, SimpleDraweeView simpleDraweeView2, Guideline guideline, Guideline guideline2, RoleIconView roleIconView) {
        this.rootView = view;
        this.authorAvatar = simpleDraweeView;
        this.authorName = textView;
        this.connectionsRoleTag = connectionsRoleTagView;
        this.contentFooterView = flaggedMessageEmbedFooterView;
        this.contentView = messageContentView;
        this.guildCommunicationDisabledIcon = simpleDraweeView2;
        this.messageEndGuideline = guideline;
        this.messageStartGuideline = guideline2;
        this.roleIcon = roleIconView;
    }

    public static FlaggedMessageEmbedViewBinding bind(View view) {
        int i = C2912R.C2914id.author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.author_name;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.connections_role_tag;
                ConnectionsRoleTagView connectionsRoleTagView = (ConnectionsRoleTagView) C12815a.m3875a(view, i);
                if (connectionsRoleTagView != null) {
                    i = C2912R.C2914id.content_footer_view;
                    FlaggedMessageEmbedFooterView flaggedMessageEmbedFooterView = (FlaggedMessageEmbedFooterView) C12815a.m3875a(view, i);
                    if (flaggedMessageEmbedFooterView != null) {
                        i = C2912R.C2914id.content_view;
                        MessageContentView messageContentView = (MessageContentView) C12815a.m3875a(view, i);
                        if (messageContentView != null) {
                            i = C2912R.C2914id.guild_communication_disabled_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C2912R.C2914id.message_end_guideline;
                                Guideline guideline = (Guideline) C12815a.m3875a(view, i);
                                if (guideline != null) {
                                    i = C2912R.C2914id.message_start_guideline;
                                    Guideline guideline2 = (Guideline) C12815a.m3875a(view, i);
                                    if (guideline2 != null) {
                                        i = C2912R.C2914id.role_icon;
                                        RoleIconView roleIconView = (RoleIconView) C12815a.m3875a(view, i);
                                        if (roleIconView != null) {
                                            return new FlaggedMessageEmbedViewBinding(view, simpleDraweeView, textView, connectionsRoleTagView, flaggedMessageEmbedFooterView, messageContentView, simpleDraweeView2, guideline, guideline2, roleIconView);
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

    public static FlaggedMessageEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.flagged_message_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}