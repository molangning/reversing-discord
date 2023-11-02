package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.MessageViewReplyPreview;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AutomodSystemMessageViewBinding implements ViewBinding {
    public final MessageAccessoriesView accessoriesView;
    public final SimpleDraweeView authorAvatar;
    public final TextView authorName;
    public final TextView automodMessageChannel;
    public final TextView automodMessageContextHeader;
    public final SimpleDraweeView guildCommunicationDisabledIcon;
    public final Guideline messageEndGuideline;
    public final Barrier messageHeaderBarrier;
    public final View messageHeaderDivider;
    public final TextView messageHeaderSubtitle;
    public final TextView messageHeaderTitle;
    public final MessageTagView messageTagView;
    public final MessageViewReplyPreview replyPreview;
    private final View rootView;
    public final ThreadStarterMessageHeaderView threadStarterHeader;
    public final TextView timestamp;

    private AutomodSystemMessageViewBinding(View view, MessageAccessoriesView messageAccessoriesView, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2, TextView textView3, SimpleDraweeView simpleDraweeView2, Guideline guideline, Barrier barrier, View view2, TextView textView4, TextView textView5, MessageTagView messageTagView, MessageViewReplyPreview messageViewReplyPreview, ThreadStarterMessageHeaderView threadStarterMessageHeaderView, TextView textView6) {
        this.rootView = view;
        this.accessoriesView = messageAccessoriesView;
        this.authorAvatar = simpleDraweeView;
        this.authorName = textView;
        this.automodMessageChannel = textView2;
        this.automodMessageContextHeader = textView3;
        this.guildCommunicationDisabledIcon = simpleDraweeView2;
        this.messageEndGuideline = guideline;
        this.messageHeaderBarrier = barrier;
        this.messageHeaderDivider = view2;
        this.messageHeaderSubtitle = textView4;
        this.messageHeaderTitle = textView5;
        this.messageTagView = messageTagView;
        this.replyPreview = messageViewReplyPreview;
        this.threadStarterHeader = threadStarterMessageHeaderView;
        this.timestamp = textView6;
    }

    public static AutomodSystemMessageViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) C12815a.m3875a(view, i);
        if (messageAccessoriesView != null) {
            i = C2912R.C2914id.author_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                i = C2912R.C2914id.author_name;
                TextView textView = (TextView) C12815a.m3875a(view, i);
                if (textView != null) {
                    i = C2912R.C2914id.automod_message_channel;
                    TextView textView2 = (TextView) C12815a.m3875a(view, i);
                    if (textView2 != null) {
                        i = C2912R.C2914id.automod_message_context_header;
                        TextView textView3 = (TextView) C12815a.m3875a(view, i);
                        if (textView3 != null) {
                            i = C2912R.C2914id.guild_communication_disabled_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C2912R.C2914id.message_end_guideline;
                                Guideline guideline = (Guideline) C12815a.m3875a(view, i);
                                if (guideline != null) {
                                    i = C2912R.C2914id.message_header_barrier;
                                    Barrier barrier = (Barrier) C12815a.m3875a(view, i);
                                    if (barrier != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.message_header_divider))) != null) {
                                        i = C2912R.C2914id.message_header_subtitle;
                                        TextView textView4 = (TextView) C12815a.m3875a(view, i);
                                        if (textView4 != null) {
                                            i = C2912R.C2914id.message_header_title;
                                            TextView textView5 = (TextView) C12815a.m3875a(view, i);
                                            if (textView5 != null) {
                                                i = C2912R.C2914id.message_tag_view;
                                                MessageTagView messageTagView = (MessageTagView) C12815a.m3875a(view, i);
                                                if (messageTagView != null) {
                                                    i = C2912R.C2914id.reply_preview;
                                                    MessageViewReplyPreview messageViewReplyPreview = (MessageViewReplyPreview) C12815a.m3875a(view, i);
                                                    if (messageViewReplyPreview != null) {
                                                        i = C2912R.C2914id.thread_starter_header;
                                                        ThreadStarterMessageHeaderView threadStarterMessageHeaderView = (ThreadStarterMessageHeaderView) C12815a.m3875a(view, i);
                                                        if (threadStarterMessageHeaderView != null) {
                                                            i = C2912R.C2914id.timestamp;
                                                            TextView textView6 = (TextView) C12815a.m3875a(view, i);
                                                            if (textView6 != null) {
                                                                return new AutomodSystemMessageViewBinding(view, messageAccessoriesView, simpleDraweeView, textView, textView2, textView3, simpleDraweeView2, guideline, barrier, m3875a, textView4, textView5, messageTagView, messageViewReplyPreview, threadStarterMessageHeaderView, textView6);
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

    public static AutomodSystemMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.automod_system_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
