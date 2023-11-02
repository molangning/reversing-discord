package com.discord.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.discord.core.C3132R;
import com.google.android.material.button.MaterialButton;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DcdButtonBinding implements ViewBinding {
    public final MaterialButton button;
    public final ProgressBar progress;
    private final View rootView;

    private DcdButtonBinding(View view, MaterialButton materialButton, ProgressBar progressBar) {
        this.rootView = view;
        this.button = materialButton;
        this.progress = progressBar;
    }

    public static DcdButtonBinding bind(View view) {
        int i = C3132R.C3134id.button;
        MaterialButton materialButton = (MaterialButton) C12815a.m3875a(view, i);
        if (materialButton != null) {
            i = C3132R.C3134id.progress;
            ProgressBar progressBar = (ProgressBar) C12815a.m3875a(view, i);
            if (progressBar != null) {
                return new DcdButtonBinding(view, materialButton, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DcdButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3132R.layout.dcd_button, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
