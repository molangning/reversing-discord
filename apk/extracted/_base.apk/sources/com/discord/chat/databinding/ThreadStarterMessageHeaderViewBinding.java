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
public final class ThreadStarterMessageHeaderViewBinding implements ViewBinding {
    private final View rootView;
    public final SimpleDraweeView threadStarterHeaderIcon;
    public final TextView threadStarterHeaderText;

    private ThreadStarterMessageHeaderViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.rootView = view;
        this.threadStarterHeaderIcon = simpleDraweeView;
        this.threadStarterHeaderText = textView;
    }

    public static ThreadStarterMessageHeaderViewBinding bind(View view) {
        int i = C2912R.C2914id.thread_starter_header_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.thread_starter_header_text;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                return new ThreadStarterMessageHeaderViewBinding(view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ThreadStarterMessageHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.thread_starter_message_header_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
