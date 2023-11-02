package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EphemeralActionViewBinding implements ViewBinding {
    public final SimpleDraweeView chatListAdapterItemIconHelp;
    public final SimpleDraweeSpanTextView chatListAdapterItemTextDismiss;
    public final SimpleDraweeView chatListAdapterItemVisibilityIcon;
    private final View rootView;

    private EphemeralActionViewBinding(View view, SimpleDraweeView simpleDraweeView, SimpleDraweeSpanTextView simpleDraweeSpanTextView, SimpleDraweeView simpleDraweeView2) {
        this.rootView = view;
        this.chatListAdapterItemIconHelp = simpleDraweeView;
        this.chatListAdapterItemTextDismiss = simpleDraweeSpanTextView;
        this.chatListAdapterItemVisibilityIcon = simpleDraweeView2;
    }

    public static EphemeralActionViewBinding bind(View view) {
        int i = C2912R.C2914id.chat_list_adapter_item_icon_help;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.chat_list_adapter_item_text_dismiss;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
            if (simpleDraweeSpanTextView != null) {
                i = C2912R.C2914id.chat_list_adapter_item_visibility_icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView2 != null) {
                    return new EphemeralActionViewBinding(view, simpleDraweeView, simpleDraweeSpanTextView, simpleDraweeView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EphemeralActionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.ephemeral_action_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}