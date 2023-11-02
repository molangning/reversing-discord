package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ConnectionsRoleTagViewBinding implements ViewBinding {
    public final CardView connectionsRoleTagContainer;
    public final TextView roleName;
    private final View rootView;
    public final ImageView verifiedCheckIcon;
    public final ImageView verifiedCheckIconBackground;
    public final FrameLayout verifiedCheckIconContainer;

    private ConnectionsRoleTagViewBinding(View view, CardView cardView, TextView textView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
        this.rootView = view;
        this.connectionsRoleTagContainer = cardView;
        this.roleName = textView;
        this.verifiedCheckIcon = imageView;
        this.verifiedCheckIconBackground = imageView2;
        this.verifiedCheckIconContainer = frameLayout;
    }

    public static ConnectionsRoleTagViewBinding bind(View view) {
        int i = C2912R.C2914id.connections_role_tag_container;
        CardView cardView = (CardView) C12815a.m3875a(view, i);
        if (cardView != null) {
            i = C2912R.C2914id.role_name;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.verified_check_icon;
                ImageView imageView = (ImageView) C12815a.m3875a(view, i);
                if (imageView != null) {
                    i = C2912R.C2914id.verified_check_icon_background;
                    ImageView imageView2 = (ImageView) C12815a.m3875a(view, i);
                    if (imageView2 != null) {
                        i = C2912R.C2914id.verified_check_icon_container;
                        FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
                        if (frameLayout != null) {
                            return new ConnectionsRoleTagViewBinding(view, cardView, textView, imageView, imageView2, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ConnectionsRoleTagViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.connections_role_tag_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}