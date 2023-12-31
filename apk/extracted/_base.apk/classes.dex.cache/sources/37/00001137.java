package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageTagViewBinding implements ViewBinding {
    public final ConstraintLayout layout;
    private final View rootView;
    public final TextView tag;
    public final SimpleDraweeView verifiedBotIcon;

    private MessageTagViewBinding(View view, ConstraintLayout constraintLayout, TextView textView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.layout = constraintLayout;
        this.tag = textView;
        this.verifiedBotIcon = simpleDraweeView;
    }

    public static MessageTagViewBinding bind(View view) {
        int i = C2912R.C2914id.layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
        if (constraintLayout != null) {
            i = C2912R.C2914id.tag;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.verified_bot_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView != null) {
                    return new MessageTagViewBinding(view, constraintLayout, textView, simpleDraweeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageTagViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.message_tag_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}