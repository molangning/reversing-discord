package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AltTextButtonViewBinding implements ViewBinding {
    public final FrameLayout altTextContainer;
    public final TextView altTextLabel;
    private final FrameLayout rootView;

    private AltTextButtonViewBinding(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView) {
        this.rootView = frameLayout;
        this.altTextContainer = frameLayout2;
        this.altTextLabel = textView;
    }

    public static AltTextButtonViewBinding bind(View view) {
        int i = C2912R.C2914id.alt_text_container;
        FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
        if (frameLayout != null) {
            i = C2912R.C2914id.alt_text_label;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                return new AltTextButtonViewBinding((FrameLayout) view, frameLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AltTextButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AltTextButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.alt_text_button_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
