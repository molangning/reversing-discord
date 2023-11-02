package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ImageAttachmentViewBinding implements ViewBinding {
    public final SimpleDraweeView image;
    public final TextView imageAltText;
    public final FrameLayout imageBlurBg;
    public final AltTextButtonView mediaViewAltTextButton;
    public final SimpleDraweeView remixButton;
    public final FrameLayout remixButtonContainer;
    private final View rootView;
    public final SpoilerView spoiler;
    public final AttachmentUploadOverlayView uploadOverlay;

    private ImageAttachmentViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, FrameLayout frameLayout, AltTextButtonView altTextButtonView, SimpleDraweeView simpleDraweeView2, FrameLayout frameLayout2, SpoilerView spoilerView, AttachmentUploadOverlayView attachmentUploadOverlayView) {
        this.rootView = view;
        this.image = simpleDraweeView;
        this.imageAltText = textView;
        this.imageBlurBg = frameLayout;
        this.mediaViewAltTextButton = altTextButtonView;
        this.remixButton = simpleDraweeView2;
        this.remixButtonContainer = frameLayout2;
        this.spoiler = spoilerView;
        this.uploadOverlay = attachmentUploadOverlayView;
    }

    public static ImageAttachmentViewBinding bind(View view) {
        int i = C2912R.C2914id.image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.image_alt_text;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.image_blur_bg;
                FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
                if (frameLayout != null) {
                    i = C2912R.C2914id.media_view_alt_text_button;
                    AltTextButtonView altTextButtonView = (AltTextButtonView) C12815a.m3875a(view, i);
                    if (altTextButtonView != null) {
                        i = C2912R.C2914id.remix_button;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                        if (simpleDraweeView2 != null) {
                            i = C2912R.C2914id.remix_button_container;
                            FrameLayout frameLayout2 = (FrameLayout) C12815a.m3875a(view, i);
                            if (frameLayout2 != null) {
                                i = C2912R.C2914id.spoiler;
                                SpoilerView spoilerView = (SpoilerView) C12815a.m3875a(view, i);
                                if (spoilerView != null) {
                                    i = C2912R.C2914id.upload_overlay;
                                    AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) C12815a.m3875a(view, i);
                                    if (attachmentUploadOverlayView != null) {
                                        return new ImageAttachmentViewBinding(view, simpleDraweeView, textView, frameLayout, altTextButtonView, simpleDraweeView2, frameLayout2, spoilerView, attachmentUploadOverlayView);
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

    public static ImageAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.image_attachment_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
