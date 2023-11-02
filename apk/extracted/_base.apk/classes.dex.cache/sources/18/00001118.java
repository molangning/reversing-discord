package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbeddedActivityMessageViewBinding implements ViewBinding {
    public final ConstraintLayout card;
    public final SimpleDraweeView dismiss;
    public final SimpleDraweeView icon;
    public final DCDButton joinButton;
    public final TextView message;
    public final OverlappingCirclesView participants;
    private final View rootView;

    private EmbeddedActivityMessageViewBinding(View view, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, DCDButton dCDButton, TextView textView, OverlappingCirclesView overlappingCirclesView) {
        this.rootView = view;
        this.card = constraintLayout;
        this.dismiss = simpleDraweeView;
        this.icon = simpleDraweeView2;
        this.joinButton = dCDButton;
        this.message = textView;
        this.participants = overlappingCirclesView;
    }

    public static EmbeddedActivityMessageViewBinding bind(View view) {
        int i = C2912R.C2914id.card;
        ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
        if (constraintLayout != null) {
            i = C2912R.C2914id.dismiss;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                i = C2912R.C2914id.icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView2 != null) {
                    i = C2912R.C2914id.join_button;
                    DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
                    if (dCDButton != null) {
                        i = C2912R.C2914id.message;
                        TextView textView = (TextView) C12815a.m3875a(view, i);
                        if (textView != null) {
                            i = C2912R.C2914id.participants;
                            OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) C12815a.m3875a(view, i);
                            if (overlappingCirclesView != null) {
                                return new EmbeddedActivityMessageViewBinding(view, constraintLayout, simpleDraweeView, simpleDraweeView2, dCDButton, textView, overlappingCirclesView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EmbeddedActivityMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.embedded_activity_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}