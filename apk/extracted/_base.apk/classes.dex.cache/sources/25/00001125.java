package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class IconButtonViewBinding implements ViewBinding {
    public final SimpleDraweeView iconButton;
    public final FrameLayout iconContainer;
    private final View rootView;

    private IconButtonViewBinding(View view, SimpleDraweeView simpleDraweeView, FrameLayout frameLayout) {
        this.rootView = view;
        this.iconButton = simpleDraweeView;
        this.iconContainer = frameLayout;
    }

    public static IconButtonViewBinding bind(View view) {
        int i = C2912R.C2914id.icon_button;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.icon_container;
            FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
            if (frameLayout != null) {
                return new IconButtonViewBinding(view, simpleDraweeView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static IconButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.icon_button_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}