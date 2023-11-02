package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.IconButtonView;
import com.facebook.drawee.view.SimpleDraweeView;
import eightbitlab.com.blurview.BlurView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ObscureOverlayViewBinding implements ViewBinding {
    public final BlurView blurView;
    public final TextView descriptionLabel;
    public final IconButtonView hideButton;
    public final SimpleDraweeView mediaWarningIcon;
    public final LinearLayout overlayCenteredContainer;
    public final ConstraintLayout overlayLayout;
    public final IconButtonView revealButton;
    private final View rootView;

    private ObscureOverlayViewBinding(View view, BlurView blurView, TextView textView, IconButtonView iconButtonView, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout, ConstraintLayout constraintLayout, IconButtonView iconButtonView2) {
        this.rootView = view;
        this.blurView = blurView;
        this.descriptionLabel = textView;
        this.hideButton = iconButtonView;
        this.mediaWarningIcon = simpleDraweeView;
        this.overlayCenteredContainer = linearLayout;
        this.overlayLayout = constraintLayout;
        this.revealButton = iconButtonView2;
    }

    public static ObscureOverlayViewBinding bind(View view) {
        int i = C2912R.C2914id.blur_view;
        BlurView blurView = (BlurView) C12815a.m3875a(view, i);
        if (blurView != null) {
            i = C2912R.C2914id.description_label;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.hide_button;
                IconButtonView iconButtonView = (IconButtonView) C12815a.m3875a(view, i);
                if (iconButtonView != null) {
                    i = C2912R.C2914id.media_warning_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                    if (simpleDraweeView != null) {
                        i = C2912R.C2914id.overlay_centered_container;
                        LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
                        if (linearLayout != null) {
                            i = C2912R.C2914id.overlay_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                            if (constraintLayout != null) {
                                i = C2912R.C2914id.reveal_button;
                                IconButtonView iconButtonView2 = (IconButtonView) C12815a.m3875a(view, i);
                                if (iconButtonView2 != null) {
                                    return new ObscureOverlayViewBinding(view, blurView, textView, iconButtonView, simpleDraweeView, linearLayout, constraintLayout, iconButtonView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ObscureOverlayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.obscure_overlay_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}