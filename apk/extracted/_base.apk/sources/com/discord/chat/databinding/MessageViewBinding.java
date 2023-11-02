package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.list.MaskedShadowView;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageAltRemixTagView;
import com.discord.chat.presentation.message.MessageFrameHeaderView;
import com.discord.chat.presentation.message.MessageHighlightHeader;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.MessageViewReplyPreview;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageViewBinding implements ViewBinding {
    public final MessageAccessoriesView accessoriesView;
    public final SimpleDraweeView authorAvatar;
    public final SimpleDraweeView authorAvatarDecoration;
    public final TextView authorName;
    public final ConnectionsRoleTagView connectionsRoleTag;
    public final SimpleDraweeView guildCommunicationDisabledIcon;
    public final MessageHighlightHeader highlightHeader;
    public final MessageAltRemixTagView messageAltRemixTagView;
    public final Guideline messageEndGuideline;
    public final MessageFrameHeaderView messageFrameHeader;
    public final Barrier messageHeaderBarrier;
    public final View messageHeaderDivider;
    public final MessageTagView messageTagView;
    public final MessageViewReplyPreview replyPreview;
    public final RoleDotView roleDot;
    public final RoleIconView roleIcon;
    private final View rootView;
    public final MaskedShadowView shadowView;
    public final SimpleDraweeView suppressNotificationsIcon;
    public final ThreadStarterMessageHeaderView threadStarterHeader;
    public final TextView timestamp;

    private MessageViewBinding(View view, MessageAccessoriesView messageAccessoriesView, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, TextView textView, ConnectionsRoleTagView connectionsRoleTagView, SimpleDraweeView simpleDraweeView3, MessageHighlightHeader messageHighlightHeader, MessageAltRemixTagView messageAltRemixTagView, Guideline guideline, MessageFrameHeaderView messageFrameHeaderView, Barrier barrier, View view2, MessageTagView messageTagView, MessageViewReplyPreview messageViewReplyPreview, RoleDotView roleDotView, RoleIconView roleIconView, MaskedShadowView maskedShadowView, SimpleDraweeView simpleDraweeView4, ThreadStarterMessageHeaderView threadStarterMessageHeaderView, TextView textView2) {
        this.rootView = view;
        this.accessoriesView = messageAccessoriesView;
        this.authorAvatar = simpleDraweeView;
        this.authorAvatarDecoration = simpleDraweeView2;
        this.authorName = textView;
        this.connectionsRoleTag = connectionsRoleTagView;
        this.guildCommunicationDisabledIcon = simpleDraweeView3;
        this.highlightHeader = messageHighlightHeader;
        this.messageAltRemixTagView = messageAltRemixTagView;
        this.messageEndGuideline = guideline;
        this.messageFrameHeader = messageFrameHeaderView;
        this.messageHeaderBarrier = barrier;
        this.messageHeaderDivider = view2;
        this.messageTagView = messageTagView;
        this.replyPreview = messageViewReplyPreview;
        this.roleDot = roleDotView;
        this.roleIcon = roleIconView;
        this.shadowView = maskedShadowView;
        this.suppressNotificationsIcon = simpleDraweeView4;
        this.threadStarterHeader = threadStarterMessageHeaderView;
        this.timestamp = textView2;
    }

    public static MessageViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) C12815a.m3875a(view, i);
        if (messageAccessoriesView != null) {
            i = C2912R.C2914id.author_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                i = C2912R.C2914id.author_avatar_decoration;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView2 != null) {
                    i = C2912R.C2914id.author_name;
                    TextView textView = (TextView) C12815a.m3875a(view, i);
                    if (textView != null) {
                        i = C2912R.C2914id.connections_role_tag;
                        ConnectionsRoleTagView connectionsRoleTagView = (ConnectionsRoleTagView) C12815a.m3875a(view, i);
                        if (connectionsRoleTagView != null) {
                            i = C2912R.C2914id.guild_communication_disabled_icon;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C12815a.m3875a(view, i);
                            if (simpleDraweeView3 != null) {
                                i = C2912R.C2914id.highlight_header;
                                MessageHighlightHeader messageHighlightHeader = (MessageHighlightHeader) C12815a.m3875a(view, i);
                                if (messageHighlightHeader != null) {
                                    i = C2912R.C2914id.message_alt_remix_tag_view;
                                    MessageAltRemixTagView messageAltRemixTagView = (MessageAltRemixTagView) C12815a.m3875a(view, i);
                                    if (messageAltRemixTagView != null) {
                                        i = C2912R.C2914id.message_end_guideline;
                                        Guideline guideline = (Guideline) C12815a.m3875a(view, i);
                                        if (guideline != null) {
                                            i = C2912R.C2914id.message_frame_header;
                                            MessageFrameHeaderView messageFrameHeaderView = (MessageFrameHeaderView) C12815a.m3875a(view, i);
                                            if (messageFrameHeaderView != null) {
                                                i = C2912R.C2914id.message_header_barrier;
                                                Barrier barrier = (Barrier) C12815a.m3875a(view, i);
                                                if (barrier != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.message_header_divider))) != null) {
                                                    i = C2912R.C2914id.message_tag_view;
                                                    MessageTagView messageTagView = (MessageTagView) C12815a.m3875a(view, i);
                                                    if (messageTagView != null) {
                                                        i = C2912R.C2914id.reply_preview;
                                                        MessageViewReplyPreview messageViewReplyPreview = (MessageViewReplyPreview) C12815a.m3875a(view, i);
                                                        if (messageViewReplyPreview != null) {
                                                            i = C2912R.C2914id.role_dot;
                                                            RoleDotView roleDotView = (RoleDotView) C12815a.m3875a(view, i);
                                                            if (roleDotView != null) {
                                                                i = C2912R.C2914id.role_icon;
                                                                RoleIconView roleIconView = (RoleIconView) C12815a.m3875a(view, i);
                                                                if (roleIconView != null) {
                                                                    i = C2912R.C2914id.shadow_view;
                                                                    MaskedShadowView maskedShadowView = (MaskedShadowView) C12815a.m3875a(view, i);
                                                                    if (maskedShadowView != null) {
                                                                        i = C2912R.C2914id.suppress_notifications_icon;
                                                                        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                                                        if (simpleDraweeView4 != null) {
                                                                            i = C2912R.C2914id.thread_starter_header;
                                                                            ThreadStarterMessageHeaderView threadStarterMessageHeaderView = (ThreadStarterMessageHeaderView) C12815a.m3875a(view, i);
                                                                            if (threadStarterMessageHeaderView != null) {
                                                                                i = C2912R.C2914id.timestamp;
                                                                                TextView textView2 = (TextView) C12815a.m3875a(view, i);
                                                                                if (textView2 != null) {
                                                                                    return new MessageViewBinding(view, messageAccessoriesView, simpleDraweeView, simpleDraweeView2, textView, connectionsRoleTagView, simpleDraweeView3, messageHighlightHeader, messageAltRemixTagView, guideline, messageFrameHeaderView, barrier, m3875a, messageTagView, messageViewReplyPreview, roleDotView, roleIconView, maskedShadowView, simpleDraweeView4, threadStarterMessageHeaderView, textView2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
