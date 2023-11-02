package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.C3317R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class OverlayVoiceChannelSearchResultBinding implements ViewBinding {
    public final TextView categoryName;
    public final TextView channelName;
    public final ConstraintLayout container;
    public final TextView guildName;
    private final ConstraintLayout rootView;

    private OverlayVoiceChannelSearchResultBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3) {
        this.rootView = constraintLayout;
        this.categoryName = textView;
        this.channelName = textView2;
        this.container = constraintLayout2;
        this.guildName = textView3;
    }

    public static OverlayVoiceChannelSearchResultBinding bind(View view) {
        int i = C3317R.C3319id.category_name;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C3317R.C3319id.channel_name;
            TextView textView2 = (TextView) C12815a.m3875a(view, i);
            if (textView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C3317R.C3319id.guild_name;
                TextView textView3 = (TextView) C12815a.m3875a(view, i);
                if (textView3 != null) {
                    return new OverlayVoiceChannelSearchResultBinding(constraintLayout, textView, textView2, constraintLayout, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static OverlayVoiceChannelSearchResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayVoiceChannelSearchResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3317R.layout.overlay_voice_channel_search_result, viewGroup, false);
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