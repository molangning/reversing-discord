package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageViewReplyPreviewBinding implements ViewBinding {
    public final SimpleDraweeView replyAuthorAvatar;
    public final TextView replyAuthorName;
    public final SimpleDraweeView replyIcon;
    public final LinearLayout replyLeadingViews;
    public final RoleDotView replyRoleDot;
    public final ChannelSpineView replySpline;
    public final MessageContentView replyText;
    private final View rootView;

    private MessageViewReplyPreviewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, SimpleDraweeView simpleDraweeView2, LinearLayout linearLayout, RoleDotView roleDotView, ChannelSpineView channelSpineView, MessageContentView messageContentView) {
        this.rootView = view;
        this.replyAuthorAvatar = simpleDraweeView;
        this.replyAuthorName = textView;
        this.replyIcon = simpleDraweeView2;
        this.replyLeadingViews = linearLayout;
        this.replyRoleDot = roleDotView;
        this.replySpline = channelSpineView;
        this.replyText = messageContentView;
    }

    public static MessageViewReplyPreviewBinding bind(View view) {
        int i = C2912R.C2914id.reply_author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.reply_author_name;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.reply_icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView2 != null) {
                    i = C2912R.C2914id.reply_leading_views;
                    LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
                    if (linearLayout != null) {
                        i = C2912R.C2914id.reply_role_dot;
                        RoleDotView roleDotView = (RoleDotView) C12815a.m3875a(view, i);
                        if (roleDotView != null) {
                            i = C2912R.C2914id.reply_spline;
                            ChannelSpineView channelSpineView = (ChannelSpineView) C12815a.m3875a(view, i);
                            if (channelSpineView != null) {
                                i = C2912R.C2914id.reply_text;
                                MessageContentView messageContentView = (MessageContentView) C12815a.m3875a(view, i);
                                if (messageContentView != null) {
                                    return new MessageViewReplyPreviewBinding(view, simpleDraweeView, textView, simpleDraweeView2, linearLayout, roleDotView, channelSpineView, messageContentView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageViewReplyPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.message_view_reply_preview, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
