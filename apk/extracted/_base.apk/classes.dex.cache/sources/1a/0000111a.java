package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ErrorMessageViewBinding implements ViewBinding {
    public final TextView errorLabel;
    public final TextView header;
    private final View rootView;

    private ErrorMessageViewBinding(View view, TextView textView, TextView textView2) {
        this.rootView = view;
        this.errorLabel = textView;
        this.header = textView2;
    }

    public static ErrorMessageViewBinding bind(View view) {
        int i = C2912R.C2914id.error_label;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.header;
            TextView textView2 = (TextView) C12815a.m3875a(view, i);
            if (textView2 != null) {
                return new ErrorMessageViewBinding(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ErrorMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.error_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}