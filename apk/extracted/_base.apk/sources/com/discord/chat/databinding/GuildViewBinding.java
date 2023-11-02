package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildViewBinding implements ViewBinding {
    public final SimpleDraweeView guildAvatar;
    public final TextView guildText;
    private final View rootView;

    private GuildViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.rootView = view;
        this.guildAvatar = simpleDraweeView;
        this.guildText = textView;
    }

    public static GuildViewBinding bind(View view) {
        int i = C2912R.C2914id.guild_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.guild_text;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                return new GuildViewBinding(view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GuildViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.guild_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
