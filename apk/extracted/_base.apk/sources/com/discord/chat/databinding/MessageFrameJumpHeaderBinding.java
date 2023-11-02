package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageFrameJumpHeaderBinding implements ViewBinding {
    public final TextView messageHeaderSubtitle;
    public final TextView messageHeaderTitle;
    private final View rootView;

    private MessageFrameJumpHeaderBinding(View view, TextView textView, TextView textView2) {
        this.rootView = view;
        this.messageHeaderSubtitle = textView;
        this.messageHeaderTitle = textView2;
    }

    public static MessageFrameJumpHeaderBinding bind(View view) {
        int i = C2912R.C2914id.message_header_subtitle;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.message_header_title;
            TextView textView2 = (TextView) C12815a.m3875a(view, i);
            if (textView2 != null) {
                return new MessageFrameJumpHeaderBinding(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageFrameJumpHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.message_frame_jump_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
