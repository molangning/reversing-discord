package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class VideoAttachmentViewBinding implements ViewBinding {
    public final MediaView mediaView;
    public final TextView mediaViewAltText;
    public final AltTextButtonView mediaViewAltTextButton;
    private final View rootView;
    public final SpoilerView spoiler;
    public final AttachmentUploadOverlayView uploadOverlay;

    private VideoAttachmentViewBinding(View view, MediaView mediaView, TextView textView, AltTextButtonView altTextButtonView, SpoilerView spoilerView, AttachmentUploadOverlayView attachmentUploadOverlayView) {
        this.rootView = view;
        this.mediaView = mediaView;
        this.mediaViewAltText = textView;
        this.mediaViewAltTextButton = altTextButtonView;
        this.spoiler = spoilerView;
        this.uploadOverlay = attachmentUploadOverlayView;
    }

    public static VideoAttachmentViewBinding bind(View view) {
        int i = C2912R.C2914id.media_view;
        MediaView mediaView = (MediaView) C12815a.m3875a(view, i);
        if (mediaView != null) {
            i = C2912R.C2914id.media_view_alt_text;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.media_view_alt_text_button;
                AltTextButtonView altTextButtonView = (AltTextButtonView) C12815a.m3875a(view, i);
                if (altTextButtonView != null) {
                    i = C2912R.C2914id.spoiler;
                    SpoilerView spoilerView = (SpoilerView) C12815a.m3875a(view, i);
                    if (spoilerView != null) {
                        i = C2912R.C2914id.upload_overlay;
                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) C12815a.m3875a(view, i);
                        if (attachmentUploadOverlayView != null) {
                            return new VideoAttachmentViewBinding(view, mediaView, textView, altTextButtonView, spoilerView, attachmentUploadOverlayView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static VideoAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.video_attachment_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
