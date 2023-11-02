package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.list.messagebundling.MessageBundleRecyclerView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageBundleViewBinding implements ViewBinding {
    public final MessageBundleRecyclerView chatListView;
    public final MessageFrameFeedHeaderView messageFrameHeader;
    private final View rootView;

    private MessageBundleViewBinding(View view, MessageBundleRecyclerView messageBundleRecyclerView, MessageFrameFeedHeaderView messageFrameFeedHeaderView) {
        this.rootView = view;
        this.chatListView = messageBundleRecyclerView;
        this.messageFrameHeader = messageFrameFeedHeaderView;
    }

    public static MessageBundleViewBinding bind(View view) {
        int i = C2912R.C2914id.chat_list_view;
        MessageBundleRecyclerView messageBundleRecyclerView = (MessageBundleRecyclerView) C12815a.m3875a(view, i);
        if (messageBundleRecyclerView != null) {
            i = C2912R.C2914id.message_frame_header;
            MessageFrameFeedHeaderView messageFrameFeedHeaderView = (MessageFrameFeedHeaderView) C12815a.m3875a(view, i);
            if (messageFrameFeedHeaderView != null) {
                return new MessageBundleViewBinding(view, messageBundleRecyclerView, messageFrameFeedHeaderView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageBundleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.message_bundle_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
