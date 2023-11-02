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
public final class InfoLinkViewBinding implements ViewBinding {
    public final TextView description;
    public final SimpleDraweeView icon;
    public final ConstraintLayout infoLinkContainer;
    private final View rootView;

    private InfoLinkViewBinding(View view, TextView textView, SimpleDraweeView simpleDraweeView, ConstraintLayout constraintLayout) {
        this.rootView = view;
        this.description = textView;
        this.icon = simpleDraweeView;
        this.infoLinkContainer = constraintLayout;
    }

    public static InfoLinkViewBinding bind(View view) {
        int i = C2912R.C2914id.description;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                i = C2912R.C2914id.info_link_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                if (constraintLayout != null) {
                    return new InfoLinkViewBinding(view, textView, simpleDraweeView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static InfoLinkViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.info_link_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
