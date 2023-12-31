package com.discord.progress_dots.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.progress_dots.C3382R;
import com.discord.progress_dots.ProgressDot;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class ProgressDotsViewBinding implements ViewBinding {
    private final View rootView;
    public final ProgressDot viewProgressDots1;
    public final ProgressDot viewProgressDots2;
    public final ProgressDot viewProgressDots3;

    private ProgressDotsViewBinding(View view, ProgressDot progressDot, ProgressDot progressDot2, ProgressDot progressDot3) {
        this.rootView = view;
        this.viewProgressDots1 = progressDot;
        this.viewProgressDots2 = progressDot2;
        this.viewProgressDots3 = progressDot3;
    }

    public static ProgressDotsViewBinding bind(View view) {
        int i = C3382R.C3384id.view_progress_dots_1;
        ProgressDot progressDot = (ProgressDot) C12815a.m3875a(view, i);
        if (progressDot != null) {
            i = C3382R.C3384id.view_progress_dots_2;
            ProgressDot progressDot2 = (ProgressDot) C12815a.m3875a(view, i);
            if (progressDot2 != null) {
                i = C3382R.C3384id.view_progress_dots_3;
                ProgressDot progressDot3 = (ProgressDot) C12815a.m3875a(view, i);
                if (progressDot3 != null) {
                    return new ProgressDotsViewBinding(view, progressDot, progressDot2, progressDot3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ProgressDotsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3382R.layout.progress_dots_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
