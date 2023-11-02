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
public final class MessageHighlightHeaderBinding implements ViewBinding {
    public final TextView header;
    public final SimpleDraweeView highlightIcon;
    private final View rootView;

    private MessageHighlightHeaderBinding(View view, TextView textView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.header = textView;
        this.highlightIcon = simpleDraweeView;
    }

    public static MessageHighlightHeaderBinding bind(View view) {
        int i = C2912R.C2914id.header;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.highlight_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                return new MessageHighlightHeaderBinding(view, textView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageHighlightHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.message_highlight_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
