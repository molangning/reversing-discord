package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class RoleDotViewBinding implements ViewBinding {
    public final FrameLayout roleDotViewBackground;
    public final ImageView roleDotViewDot;
    private final View rootView;

    private RoleDotViewBinding(View view, FrameLayout frameLayout, ImageView imageView) {
        this.rootView = view;
        this.roleDotViewBackground = frameLayout;
        this.roleDotViewDot = imageView;
    }

    public static RoleDotViewBinding bind(View view) {
        int i = C2912R.C2914id.role_dot_view_background;
        FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
        if (frameLayout != null) {
            i = C2912R.C2914id.role_dot_view_dot;
            ImageView imageView = (ImageView) C12815a.m3875a(view, i);
            if (imageView != null) {
                return new RoleDotViewBinding(view, frameLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RoleDotViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.role_dot_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}