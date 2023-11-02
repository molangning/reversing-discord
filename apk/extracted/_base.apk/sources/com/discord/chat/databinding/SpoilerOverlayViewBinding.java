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
public final class SpoilerOverlayViewBinding implements ViewBinding {
    public final TextView label;
    public final FrameLayout overlayContainer;
    private final View rootView;

    private SpoilerOverlayViewBinding(View view, TextView textView, FrameLayout frameLayout) {
        this.rootView = view;
        this.label = textView;
        this.overlayContainer = frameLayout;
    }

    public static SpoilerOverlayViewBinding bind(View view) {
        int i = C2912R.C2914id.label;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.overlay_container;
            FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
            if (frameLayout != null) {
                return new SpoilerOverlayViewBinding(view, textView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SpoilerOverlayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.spoiler_overlay_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
