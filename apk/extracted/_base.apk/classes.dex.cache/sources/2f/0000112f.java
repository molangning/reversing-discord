package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageComponentButtonViewBinding implements ViewBinding {
    public final MaterialButton button;
    public final SimpleDraweeSpanTextView emoji;
    public final MaterialTextView label;
    public final SimpleDraweeView linkIcon;
    public final ProgressDots loadingDots;
    private final ButtonComponentView rootView;

    private MessageComponentButtonViewBinding(ButtonComponentView buttonComponentView, MaterialButton materialButton, SimpleDraweeSpanTextView simpleDraweeSpanTextView, MaterialTextView materialTextView, SimpleDraweeView simpleDraweeView, ProgressDots progressDots) {
        this.rootView = buttonComponentView;
        this.button = materialButton;
        this.emoji = simpleDraweeSpanTextView;
        this.label = materialTextView;
        this.linkIcon = simpleDraweeView;
        this.loadingDots = progressDots;
    }

    public static MessageComponentButtonViewBinding bind(View view) {
        int i = C2912R.C2914id.button;
        MaterialButton materialButton = (MaterialButton) C12815a.m3875a(view, i);
        if (materialButton != null) {
            i = C2912R.C2914id.emoji;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
            if (simpleDraweeSpanTextView != null) {
                i = C2912R.C2914id.label;
                MaterialTextView materialTextView = (MaterialTextView) C12815a.m3875a(view, i);
                if (materialTextView != null) {
                    i = C2912R.C2914id.link_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                    if (simpleDraweeView != null) {
                        i = C2912R.C2914id.loading_dots;
                        ProgressDots progressDots = (ProgressDots) C12815a.m3875a(view, i);
                        if (progressDots != null) {
                            return new MessageComponentButtonViewBinding((ButtonComponentView) view, materialButton, simpleDraweeSpanTextView, materialTextView, simpleDraweeView, progressDots);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageComponentButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.message_component_button_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public ButtonComponentView getRoot() {
        return this.rootView;
    }
}