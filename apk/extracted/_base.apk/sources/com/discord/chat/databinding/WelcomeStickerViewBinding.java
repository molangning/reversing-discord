package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.sticker.StickerView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class WelcomeStickerViewBinding implements ViewBinding {
    private final View rootView;
    public final StickerView stickerView;
    public final TextView welcomeReplyText;

    private WelcomeStickerViewBinding(View view, StickerView stickerView, TextView textView) {
        this.rootView = view;
        this.stickerView = stickerView;
        this.welcomeReplyText = textView;
    }

    public static WelcomeStickerViewBinding bind(View view) {
        int i = C2912R.C2914id.sticker_view;
        StickerView stickerView = (StickerView) C12815a.m3875a(view, i);
        if (stickerView != null) {
            i = C2912R.C2914id.welcome_reply_text;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                return new WelcomeStickerViewBinding(view, stickerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static WelcomeStickerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.welcome_sticker_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
