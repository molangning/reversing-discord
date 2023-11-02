package com.discord.chat.input.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.input.C2919R;
import com.discord.chat.input.views.DCDChatInput;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputRootViewBinding implements ViewBinding {
    public final DCDChatInput chatInputEditText;
    private final View rootView;

    private ChatInputRootViewBinding(View view, DCDChatInput dCDChatInput) {
        this.rootView = view;
        this.chatInputEditText = dCDChatInput;
    }

    public static ChatInputRootViewBinding bind(View view) {
        int i = C2919R.C2921id.chat_input_edit_text;
        DCDChatInput dCDChatInput = (DCDChatInput) C12815a.m3875a(view, i);
        if (dCDChatInput != null) {
            return new ChatInputRootViewBinding(view, dCDChatInput);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChatInputRootViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2919R.layout.chat_input_root_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}