package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.MessageView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DecoratedMessageViewBinding implements ViewBinding {
    public final MessageView messageView;
    private final View rootView;

    private DecoratedMessageViewBinding(View view, MessageView messageView) {
        this.rootView = view;
        this.messageView = messageView;
    }

    public static DecoratedMessageViewBinding bind(View view) {
        int i = C2912R.C2914id.message_view;
        MessageView messageView = (MessageView) C12815a.m3875a(view, i);
        if (messageView != null) {
            return new DecoratedMessageViewBinding(view, messageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DecoratedMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.decorated_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}