package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AttachmentUploadOverlayViewBinding implements ViewBinding {
    private final View rootView;
    public final SimpleDraweeView uploadCancel;
    public final SimpleDraweeView uploadComplete;
    public final MaterialCardView uploadCompleteBackground;
    public final ConstraintLayout uploadCompleteLayout;
    public final CircularProgressIndicator uploadProgress;
    public final View uploadProgressBackground;
    public final ConstraintLayout uploadProgressLayout;

    private AttachmentUploadOverlayViewBinding(View view, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, MaterialCardView materialCardView, ConstraintLayout constraintLayout, CircularProgressIndicator circularProgressIndicator, View view2, ConstraintLayout constraintLayout2) {
        this.rootView = view;
        this.uploadCancel = simpleDraweeView;
        this.uploadComplete = simpleDraweeView2;
        this.uploadCompleteBackground = materialCardView;
        this.uploadCompleteLayout = constraintLayout;
        this.uploadProgress = circularProgressIndicator;
        this.uploadProgressBackground = view2;
        this.uploadProgressLayout = constraintLayout2;
    }

    public static AttachmentUploadOverlayViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.upload_cancel;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.upload_complete;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView2 != null) {
                i = C2912R.C2914id.upload_complete_background;
                MaterialCardView materialCardView = (MaterialCardView) C12815a.m3875a(view, i);
                if (materialCardView != null) {
                    i = C2912R.C2914id.upload_complete_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                    if (constraintLayout != null) {
                        i = C2912R.C2914id.upload_progress;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C12815a.m3875a(view, i);
                        if (circularProgressIndicator != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.upload_progress_background))) != null) {
                            i = C2912R.C2914id.upload_progress_layout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C12815a.m3875a(view, i);
                            if (constraintLayout2 != null) {
                                return new AttachmentUploadOverlayViewBinding(view, simpleDraweeView, simpleDraweeView2, materialCardView, constraintLayout, circularProgressIndicator, m3875a, constraintLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AttachmentUploadOverlayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.attachment_upload_overlay_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
