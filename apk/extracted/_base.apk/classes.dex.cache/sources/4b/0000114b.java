package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class UploadProgressViewBinding implements ViewBinding {
    public final Barrier barrier;
    public final View progressBar;
    public final FrameLayout progressBg;
    public final SimpleDraweeView progressCancel;
    public final SimpleDraweeView progressFileImage;
    public final TextView progressSubtext;
    public final TextView progressText;
    private final View rootView;

    private UploadProgressViewBinding(View view, Barrier barrier, View view2, FrameLayout frameLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, TextView textView, TextView textView2) {
        this.rootView = view;
        this.barrier = barrier;
        this.progressBar = view2;
        this.progressBg = frameLayout;
        this.progressCancel = simpleDraweeView;
        this.progressFileImage = simpleDraweeView2;
        this.progressSubtext = textView;
        this.progressText = textView2;
    }

    public static UploadProgressViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.barrier;
        Barrier barrier = (Barrier) C12815a.m3875a(view, i);
        if (barrier != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.progress_bar))) != null) {
            i = C2912R.C2914id.progress_bg;
            FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
            if (frameLayout != null) {
                i = C2912R.C2914id.progress_cancel;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView != null) {
                    i = C2912R.C2914id.progress_file_image;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                    if (simpleDraweeView2 != null) {
                        i = C2912R.C2914id.progress_subtext;
                        TextView textView = (TextView) C12815a.m3875a(view, i);
                        if (textView != null) {
                            i = C2912R.C2914id.progress_text;
                            TextView textView2 = (TextView) C12815a.m3875a(view, i);
                            if (textView2 != null) {
                                return new UploadProgressViewBinding(view, barrier, m3875a, frameLayout, simpleDraweeView, simpleDraweeView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static UploadProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.upload_progress_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}