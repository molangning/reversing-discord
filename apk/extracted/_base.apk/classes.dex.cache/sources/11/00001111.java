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
public final class ComponentFailedLabelViewBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final SimpleDraweeView viewInteractionFailedLabelIcon;
    public final TextView viewInteractionFailedLabelMessage;

    private ComponentFailedLabelViewBinding(ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.rootView = constraintLayout;
        this.viewInteractionFailedLabelIcon = simpleDraweeView;
        this.viewInteractionFailedLabelMessage = textView;
    }

    public static ComponentFailedLabelViewBinding bind(View view) {
        int i = C2912R.C2914id.view_interaction_failed_label_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.view_interaction_failed_label_message;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                return new ComponentFailedLabelViewBinding((ConstraintLayout) view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ComponentFailedLabelViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ComponentFailedLabelViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.component_failed_label_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}