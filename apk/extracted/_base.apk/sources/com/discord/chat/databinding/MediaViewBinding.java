package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MediaViewBinding implements ViewBinding {
    public final ConstraintLayout attachmentTag;
    public final SimpleDraweeView attachmentTagIcon;
    public final TextView attachmentTagText;
    public final SimpleDraweeView inlineMediaGifIndicator;
    public final SimpleDraweeView inlineMediaImagePreview;
    public final ProgressBar inlineMediaLoadingIndicator;
    public final ImageView inlineMediaPlayButton;
    public final SimpleDraweeView inlineMediaVolumeToggle;
    private final View rootView;

    private MediaViewBinding(View view, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, TextView textView, SimpleDraweeView simpleDraweeView2, SimpleDraweeView simpleDraweeView3, ProgressBar progressBar, ImageView imageView, SimpleDraweeView simpleDraweeView4) {
        this.rootView = view;
        this.attachmentTag = constraintLayout;
        this.attachmentTagIcon = simpleDraweeView;
        this.attachmentTagText = textView;
        this.inlineMediaGifIndicator = simpleDraweeView2;
        this.inlineMediaImagePreview = simpleDraweeView3;
        this.inlineMediaLoadingIndicator = progressBar;
        this.inlineMediaPlayButton = imageView;
        this.inlineMediaVolumeToggle = simpleDraweeView4;
    }

    public static MediaViewBinding bind(View view) {
        int i = C2912R.C2914id.attachment_tag;
        ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
        if (constraintLayout != null) {
            i = C2912R.C2914id.attachment_tag_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                i = C2912R.C2914id.attachment_tag_text;
                TextView textView = (TextView) C12815a.m3875a(view, i);
                if (textView != null) {
                    i = C2912R.C2914id.inline_media_gif_indicator;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                    if (simpleDraweeView2 != null) {
                        i = C2912R.C2914id.inline_media_image_preview;
                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C12815a.m3875a(view, i);
                        if (simpleDraweeView3 != null) {
                            i = C2912R.C2914id.inline_media_loading_indicator;
                            ProgressBar progressBar = (ProgressBar) C12815a.m3875a(view, i);
                            if (progressBar != null) {
                                i = C2912R.C2914id.inline_media_play_button;
                                ImageView imageView = (ImageView) C12815a.m3875a(view, i);
                                if (imageView != null) {
                                    i = C2912R.C2914id.inline_media_volume_toggle;
                                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                    if (simpleDraweeView4 != null) {
                                        return new MediaViewBinding(view, constraintLayout, simpleDraweeView, textView, simpleDraweeView2, simpleDraweeView3, progressBar, imageView, simpleDraweeView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MediaViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.media_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
