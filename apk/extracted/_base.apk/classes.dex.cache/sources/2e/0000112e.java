package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView;
import com.google.android.flexbox.FlexboxLayout;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageComponentActionRowViewBinding implements ViewBinding {
    public final FlexboxLayout actionRowComponentViewGroup;
    public final ComponentFailedLabelViewBinding actionRowComponentViewGroupErrorRow;
    private final ActionRowComponentView rootView;

    private MessageComponentActionRowViewBinding(ActionRowComponentView actionRowComponentView, FlexboxLayout flexboxLayout, ComponentFailedLabelViewBinding componentFailedLabelViewBinding) {
        this.rootView = actionRowComponentView;
        this.actionRowComponentViewGroup = flexboxLayout;
        this.actionRowComponentViewGroupErrorRow = componentFailedLabelViewBinding;
    }

    public static MessageComponentActionRowViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.action_row_component_view_group;
        FlexboxLayout flexboxLayout = (FlexboxLayout) C12815a.m3875a(view, i);
        if (flexboxLayout != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.action_row_component_view_group_error_row))) != null) {
            return new MessageComponentActionRowViewBinding((ActionRowComponentView) view, flexboxLayout, ComponentFailedLabelViewBinding.bind(m3875a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageComponentActionRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentActionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.message_component_action_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public ActionRowComponentView getRoot() {
        return this.rootView;
    }
}