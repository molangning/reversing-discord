package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatLoadingViewBinding implements ViewBinding {
    public final Button button;
    public final ProgressBar progressSpinner;
    private final View rootView;

    private ChatLoadingViewBinding(View view, Button button, ProgressBar progressBar) {
        this.rootView = view;
        this.button = button;
        this.progressSpinner = progressBar;
    }

    public static ChatLoadingViewBinding bind(View view) {
        int i = C2912R.C2914id.button;
        Button button = (Button) C12815a.m3875a(view, i);
        if (button != null) {
            i = C2912R.C2914id.progress_spinner;
            ProgressBar progressBar = (ProgressBar) C12815a.m3875a(view, i);
            if (progressBar != null) {
                return new ChatLoadingViewBinding(view, button, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChatLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.chat_loading_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}