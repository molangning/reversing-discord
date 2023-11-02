package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerViewBinding implements ViewBinding {
    public final SimpleDraweeView button;
    public final View buttonContainer;
    public final LinearLayout playerContainer;
    public final ProgressBar progress;
    private final View rootView;
    public final SimpleDraweeSpanTextView text;
    public final AttachmentUploadOverlayView uploadOverlay;
    public final LinearLayout uploadOverlayBackground;
    public final AudioWaveView wave;
    public final View wipe;

    private AudioPlayerViewBinding(View view, SimpleDraweeView simpleDraweeView, View view2, LinearLayout linearLayout, ProgressBar progressBar, SimpleDraweeSpanTextView simpleDraweeSpanTextView, AttachmentUploadOverlayView attachmentUploadOverlayView, LinearLayout linearLayout2, AudioWaveView audioWaveView, View view3) {
        this.rootView = view;
        this.button = simpleDraweeView;
        this.buttonContainer = view2;
        this.playerContainer = linearLayout;
        this.progress = progressBar;
        this.text = simpleDraweeSpanTextView;
        this.uploadOverlay = attachmentUploadOverlayView;
        this.uploadOverlayBackground = linearLayout2;
        this.wave = audioWaveView;
        this.wipe = view3;
    }

    public static AudioPlayerViewBinding bind(View view) {
        View m3875a;
        View m3875a2;
        int i = C2912R.C2914id.button;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.button_container))) != null) {
            i = C2912R.C2914id.player_container;
            LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
            if (linearLayout != null) {
                i = C2912R.C2914id.progress;
                ProgressBar progressBar = (ProgressBar) C12815a.m3875a(view, i);
                if (progressBar != null) {
                    i = C2912R.C2914id.text;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                    if (simpleDraweeSpanTextView != null) {
                        i = C2912R.C2914id.upload_overlay;
                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) C12815a.m3875a(view, i);
                        if (attachmentUploadOverlayView != null) {
                            i = C2912R.C2914id.upload_overlay_background;
                            LinearLayout linearLayout2 = (LinearLayout) C12815a.m3875a(view, i);
                            if (linearLayout2 != null) {
                                i = C2912R.C2914id.wave;
                                AudioWaveView audioWaveView = (AudioWaveView) C12815a.m3875a(view, i);
                                if (audioWaveView != null && (m3875a2 = C12815a.m3875a(view, (i = C2912R.C2914id.wipe))) != null) {
                                    return new AudioPlayerViewBinding(view, simpleDraweeView, m3875a, linearLayout, progressBar, simpleDraweeSpanTextView, attachmentUploadOverlayView, linearLayout2, audioWaveView, m3875a2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AudioPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.audio_player_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
