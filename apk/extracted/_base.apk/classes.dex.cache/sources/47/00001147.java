package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SystemMessageViewBinding implements ViewBinding {
    public final MessageAccessoriesView accessoriesView;
    public final SimpleDraweeView icon;
    private final View rootView;

    private SystemMessageViewBinding(View view, MessageAccessoriesView messageAccessoriesView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.accessoriesView = messageAccessoriesView;
        this.icon = simpleDraweeView;
    }

    public static SystemMessageViewBinding bind(View view) {
        int i = C2912R.C2914id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) C12815a.m3875a(view, i);
        if (messageAccessoriesView != null) {
            i = C2912R.C2914id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                return new SystemMessageViewBinding(view, messageAccessoriesView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SystemMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.system_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}