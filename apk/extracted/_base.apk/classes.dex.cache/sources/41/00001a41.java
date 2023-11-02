package com.discord.media_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.media_player.C3293R;
import com.google.android.exoplayer2.p049ui.PlayerView;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class PlayerViewWithTextureViewBinding implements ViewBinding {
    private final PlayerView rootView;

    private PlayerViewWithTextureViewBinding(PlayerView playerView) {
        this.rootView = playerView;
    }

    public static PlayerViewWithTextureViewBinding bind(View view) {
        if (view != null) {
            return new PlayerViewWithTextureViewBinding((PlayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static PlayerViewWithTextureViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlayerViewWithTextureViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3293R.layout.player_view_with_texture_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public PlayerView getRoot() {
        return this.rootView;
    }
}