package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PostPreviewEmbedViewBinding implements ViewBinding {
    public final SimpleDraweeView backgroundImage;
    public final SimpleDraweeView coverImage;
    public final DCDButton coverImageOverlayButton;
    public final DCDButton cta;
    public final SimpleDraweeSpanTextView footer;
    public final View headerDivider;
    public final FrameLayout imageBlurBg;
    private final View rootView;
    public final SpoilerView spoiler;
    public final TextView subtitle;
    public final TextView title;

    private PostPreviewEmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, DCDButton dCDButton, DCDButton dCDButton2, SimpleDraweeSpanTextView simpleDraweeSpanTextView, View view2, FrameLayout frameLayout, SpoilerView spoilerView, TextView textView, TextView textView2) {
        this.rootView = view;
        this.backgroundImage = simpleDraweeView;
        this.coverImage = simpleDraweeView2;
        this.coverImageOverlayButton = dCDButton;
        this.cta = dCDButton2;
        this.footer = simpleDraweeSpanTextView;
        this.headerDivider = view2;
        this.imageBlurBg = frameLayout;
        this.spoiler = spoilerView;
        this.subtitle = textView;
        this.title = textView2;
    }

    public static PostPreviewEmbedViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.background_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.cover_image;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView2 != null) {
                i = C2912R.C2914id.cover_image_overlay_button;
                DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
                if (dCDButton != null) {
                    i = C2912R.C2914id.cta;
                    DCDButton dCDButton2 = (DCDButton) C12815a.m3875a(view, i);
                    if (dCDButton2 != null) {
                        i = C2912R.C2914id.footer;
                        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                        if (simpleDraweeSpanTextView != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.header_divider))) != null) {
                            i = C2912R.C2914id.image_blur_bg;
                            FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
                            if (frameLayout != null) {
                                i = C2912R.C2914id.spoiler;
                                SpoilerView spoilerView = (SpoilerView) C12815a.m3875a(view, i);
                                if (spoilerView != null) {
                                    i = C2912R.C2914id.subtitle;
                                    TextView textView = (TextView) C12815a.m3875a(view, i);
                                    if (textView != null) {
                                        i = C2912R.C2914id.title;
                                        TextView textView2 = (TextView) C12815a.m3875a(view, i);
                                        if (textView2 != null) {
                                            return new PostPreviewEmbedViewBinding(view, simpleDraweeView, simpleDraweeView2, dCDButton, dCDButton2, simpleDraweeSpanTextView, m3875a, frameLayout, spoilerView, textView, textView2);
                                        }
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

    public static PostPreviewEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.post_preview_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
