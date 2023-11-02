package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.reactions.ReactionsView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageBundleConversationViewBinding implements ViewBinding {
    public final Barrier barrier;
    public final ReactionsView reactionsView;
    public final SimpleDraweeView replyAuthorAvatar;
    public final TextView replyAuthorName;
    public final MessageContentView replyText;
    private final View rootView;

    private MessageBundleConversationViewBinding(View view, Barrier barrier, ReactionsView reactionsView, SimpleDraweeView simpleDraweeView, TextView textView, MessageContentView messageContentView) {
        this.rootView = view;
        this.barrier = barrier;
        this.reactionsView = reactionsView;
        this.replyAuthorAvatar = simpleDraweeView;
        this.replyAuthorName = textView;
        this.replyText = messageContentView;
    }

    public static MessageBundleConversationViewBinding bind(View view) {
        int i = C2912R.C2914id.barrier;
        Barrier barrier = (Barrier) C12815a.m3875a(view, i);
        if (barrier != null) {
            i = C2912R.C2914id.reactions_view;
            ReactionsView reactionsView = (ReactionsView) C12815a.m3875a(view, i);
            if (reactionsView != null) {
                i = C2912R.C2914id.reply_author_avatar;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView != null) {
                    i = C2912R.C2914id.reply_author_name;
                    TextView textView = (TextView) C12815a.m3875a(view, i);
                    if (textView != null) {
                        i = C2912R.C2914id.reply_text;
                        MessageContentView messageContentView = (MessageContentView) C12815a.m3875a(view, i);
                        if (messageContentView != null) {
                            return new MessageBundleConversationViewBinding(view, barrier, reactionsView, simpleDraweeView, textView, messageContentView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageBundleConversationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.message_bundle_conversation_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}