package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ProgressBarContainerView extends FrameLayout {
    private static final int MAX_PROGRESS = 1000;
    private boolean mAnimating;
    private Integer mColor;
    private boolean mIndeterminate;
    private double mProgress;
    private ProgressBar mProgressBar;

    public ProgressBarContainerView(Context context) {
        super(context);
        this.mIndeterminate = true;
        this.mAnimating = true;
    }

    public void apply() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.mIndeterminate);
            setColor(this.mProgressBar);
            this.mProgressBar.setProgress((int) (this.mProgress * 1000.0d));
            if (this.mAnimating) {
                this.mProgressBar.setVisibility(0);
                return;
            } else {
                this.mProgressBar.setVisibility(4);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("setStyle() not called");
    }

    public void setAnimating(boolean z) {
        this.mAnimating = z;
    }

    public void setColor(Integer num) {
        this.mColor = num;
    }

    public void setIndeterminate(boolean z) {
        this.mIndeterminate = z;
    }

    public void setProgress(double d) {
        this.mProgress = d;
    }

    public void setStyle(String str) {
        ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.mProgressBar = createProgressBar;
        createProgressBar.setMax(1000);
        removeAllViews();
        addView(this.mProgressBar, new ViewGroup.LayoutParams(-1, -1));
    }

    private void setColor(ProgressBar progressBar) {
        Drawable progressDrawable;
        if (progressBar.isIndeterminate()) {
            progressDrawable = progressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = progressBar.getProgressDrawable();
        }
        if (progressDrawable == null) {
            return;
        }
        Integer num = this.mColor;
        if (num != null) {
            progressDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            progressDrawable.clearColorFilter();
        }
    }
}