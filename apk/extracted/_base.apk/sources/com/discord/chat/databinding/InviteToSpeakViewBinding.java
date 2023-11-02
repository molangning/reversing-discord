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
public final class InviteToSpeakViewBinding implements ViewBinding {
    public final TextView inviteToSpeakText;
    public final SimpleDraweeView moveToSpeakerIcon;
    private final View rootView;

    private InviteToSpeakViewBinding(View view, TextView textView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.inviteToSpeakText = textView;
        this.moveToSpeakerIcon = simpleDraweeView;
    }

    public static InviteToSpeakViewBinding bind(View view) {
        int i = C2912R.C2914id.invite_to_speak_text;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.move_to_speaker_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                return new InviteToSpeakViewBinding(view, textView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static InviteToSpeakViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.invite_to_speak_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
