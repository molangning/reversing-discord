package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.ObscureOverlayView;
import com.discord.chat.presentation.message.view.SpoilerOverlayView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SpoilerViewBinding implements ViewBinding {
    public final ObscureOverlayView obscure;
    private final View rootView;
    public final SpoilerOverlayView spoiler;

    private SpoilerViewBinding(View view, ObscureOverlayView obscureOverlayView, SpoilerOverlayView spoilerOverlayView) {
        this.rootView = view;
        this.obscure = obscureOverlayView;
        this.spoiler = spoilerOverlayView;
    }

    public static SpoilerViewBinding bind(View view) {
        int i = C2912R.C2914id.obscure;
        ObscureOverlayView obscureOverlayView = (ObscureOverlayView) C12815a.m3875a(view, i);
        if (obscureOverlayView != null) {
            i = C2912R.C2914id.spoiler;
            SpoilerOverlayView spoilerOverlayView = (SpoilerOverlayView) C12815a.m3875a(view, i);
            if (spoilerOverlayView != null) {
                return new SpoilerViewBinding(view, obscureOverlayView, spoilerOverlayView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SpoilerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.spoiler_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}