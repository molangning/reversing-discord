package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class RoleIconViewBinding implements ViewBinding {
    public final SimpleDraweeSpanTextView roleIconViewUnicodeEmoji;
    private final View rootView;

    private RoleIconViewBinding(View view, SimpleDraweeSpanTextView simpleDraweeSpanTextView) {
        this.rootView = view;
        this.roleIconViewUnicodeEmoji = simpleDraweeSpanTextView;
    }

    public static RoleIconViewBinding bind(View view) {
        int i = C2912R.C2914id.role_icon_view_unicode_emoji;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
        if (simpleDraweeSpanTextView != null) {
            return new RoleIconViewBinding(view, simpleDraweeSpanTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RoleIconViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.role_icon_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
