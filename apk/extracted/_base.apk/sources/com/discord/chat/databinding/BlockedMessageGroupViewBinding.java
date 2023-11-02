package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BlockedMessageGroupViewBinding implements ViewBinding {
    public final TextView blockedMessageGroupButton;
    public final RecyclerView blockedMessages;
    public final SimpleDraweeView closeIcon;
    private final View rootView;

    private BlockedMessageGroupViewBinding(View view, TextView textView, RecyclerView recyclerView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.blockedMessageGroupButton = textView;
        this.blockedMessages = recyclerView;
        this.closeIcon = simpleDraweeView;
    }

    public static BlockedMessageGroupViewBinding bind(View view) {
        int i = C2912R.C2914id.blocked_message_group_button;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.blocked_messages;
            RecyclerView recyclerView = (RecyclerView) C12815a.m3875a(view, i);
            if (recyclerView != null) {
                i = C2912R.C2914id.close_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView != null) {
                    return new BlockedMessageGroupViewBinding(view, textView, recyclerView, simpleDraweeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BlockedMessageGroupViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.blocked_message_group_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
