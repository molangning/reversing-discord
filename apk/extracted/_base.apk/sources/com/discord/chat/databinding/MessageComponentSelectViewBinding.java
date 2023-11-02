package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textview.MaterialTextView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageComponentSelectViewBinding implements ViewBinding {
    private final SelectComponentView rootView;
    public final SimpleDraweeView selectComponentChevron;
    public final ProgressBar selectComponentLoading;
    public final SimpleDraweeSpanTextView selectComponentSelectionIcon;
    public final MaterialTextView selectComponentSelectionText;
    public final FlexboxLayout selectComponentSelectionsRoot;

    private MessageComponentSelectViewBinding(SelectComponentView selectComponentView, SimpleDraweeView simpleDraweeView, ProgressBar progressBar, SimpleDraweeSpanTextView simpleDraweeSpanTextView, MaterialTextView materialTextView, FlexboxLayout flexboxLayout) {
        this.rootView = selectComponentView;
        this.selectComponentChevron = simpleDraweeView;
        this.selectComponentLoading = progressBar;
        this.selectComponentSelectionIcon = simpleDraweeSpanTextView;
        this.selectComponentSelectionText = materialTextView;
        this.selectComponentSelectionsRoot = flexboxLayout;
    }

    public static MessageComponentSelectViewBinding bind(View view) {
        int i = C2912R.C2914id.select_component_chevron;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.select_component_loading;
            ProgressBar progressBar = (ProgressBar) C12815a.m3875a(view, i);
            if (progressBar != null) {
                i = C2912R.C2914id.select_component_selection_icon;
                SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                if (simpleDraweeSpanTextView != null) {
                    i = C2912R.C2914id.select_component_selection_text;
                    MaterialTextView materialTextView = (MaterialTextView) C12815a.m3875a(view, i);
                    if (materialTextView != null) {
                        i = C2912R.C2914id.select_component_selections_root;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) C12815a.m3875a(view, i);
                        if (flexboxLayout != null) {
                            return new MessageComponentSelectViewBinding((SelectComponentView) view, simpleDraweeView, progressBar, simpleDraweeSpanTextView, materialTextView, flexboxLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageComponentSelectViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.message_component_select_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public SelectComponentView getRoot() {
        return this.rootView;
    }
}
