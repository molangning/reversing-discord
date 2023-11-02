package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.core.DCDButton;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelPromptActionsViewBinding implements ViewBinding {
    public final DCDButton cameraButton;
    public final DCDButton emojiButton;
    public final DCDButton gamingStatsButton;
    public final DCDButton gifButton;
    private final View rootView;

    private ChannelPromptActionsViewBinding(View view, DCDButton dCDButton, DCDButton dCDButton2, DCDButton dCDButton3, DCDButton dCDButton4) {
        this.rootView = view;
        this.cameraButton = dCDButton;
        this.emojiButton = dCDButton2;
        this.gamingStatsButton = dCDButton3;
        this.gifButton = dCDButton4;
    }

    public static ChannelPromptActionsViewBinding bind(View view) {
        int i = C2912R.C2914id.camera_button;
        DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
        if (dCDButton != null) {
            i = C2912R.C2914id.emoji_button;
            DCDButton dCDButton2 = (DCDButton) C12815a.m3875a(view, i);
            if (dCDButton2 != null) {
                i = C2912R.C2914id.gaming_stats_button;
                DCDButton dCDButton3 = (DCDButton) C12815a.m3875a(view, i);
                if (dCDButton3 != null) {
                    i = C2912R.C2914id.gif_button;
                    DCDButton dCDButton4 = (DCDButton) C12815a.m3875a(view, i);
                    if (dCDButton4 != null) {
                        return new ChannelPromptActionsViewBinding(view, dCDButton, dCDButton2, dCDButton3, dCDButton4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChannelPromptActionsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.channel_prompt_actions_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}