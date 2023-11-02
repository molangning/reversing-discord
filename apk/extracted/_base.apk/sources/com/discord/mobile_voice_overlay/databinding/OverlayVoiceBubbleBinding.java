package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.C3317R;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class OverlayVoiceBubbleBinding implements ViewBinding {
    public final SimpleDraweeView overlayBubbleIv;
    private final SimpleDraweeView rootView;

    private OverlayVoiceBubbleBinding(SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2) {
        this.rootView = simpleDraweeView;
        this.overlayBubbleIv = simpleDraweeView2;
    }

    public static OverlayVoiceBubbleBinding bind(View view) {
        if (view != null) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
            return new OverlayVoiceBubbleBinding(simpleDraweeView, simpleDraweeView);
        }
        throw new NullPointerException("rootView");
    }

    public static OverlayVoiceBubbleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayVoiceBubbleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3317R.layout.overlay_voice_bubble, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public SimpleDraweeView getRoot() {
        return this.rootView;
    }
}
