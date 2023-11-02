package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageComponentsViewBinding implements ViewBinding {
    public final LinearLayout itemComponentsRoot;
    private final View rootView;

    private MessageComponentsViewBinding(View view, LinearLayout linearLayout) {
        this.rootView = view;
        this.itemComponentsRoot = linearLayout;
    }

    public static MessageComponentsViewBinding bind(View view) {
        int i = C2912R.C2914id.item_components_root;
        LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
        if (linearLayout != null) {
            return new MessageComponentsViewBinding(view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageComponentsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.message_components_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
