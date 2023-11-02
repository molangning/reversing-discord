package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.C1365w0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactViewBackgroundManager {
    private int mColor = 0;
    private ReactViewBackgroundDrawable mReactBackgroundDrawable;
    private View mView;

    public ReactViewBackgroundManager(View view) {
        this.mView = view;
    }

    private ReactViewBackgroundDrawable getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new ReactViewBackgroundDrawable(this.mView.getContext());
            Drawable background = this.mView.getBackground();
            C1365w0.m37177u0(this.mView, null);
            if (background == null) {
                C1365w0.m37177u0(this.mView, this.mReactBackgroundDrawable);
            } else {
                C1365w0.m37177u0(this.mView, new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
        }
        return this.mReactBackgroundDrawable;
    }

    public void cleanup() {
        C1365w0.m37177u0(this.mView, null);
        this.mView = null;
        this.mReactBackgroundDrawable = null;
    }

    public int getBackgroundColor() {
        return this.mColor;
    }

    public int getBorderColor(int i) {
        return getOrCreateReactViewBackground().getBorderColor(i);
    }

    public void setBackgroundColor(int i) {
        if (i != 0 || this.mReactBackgroundDrawable != null) {
            getOrCreateReactViewBackground().setColor(i);
        }
    }

    public void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().setBorderColor(i, f, f2);
    }

    public void setBorderRadius(float f) {
        getOrCreateReactViewBackground().setRadius(f);
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().setBorderStyle(str);
    }

    public void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().setBorderWidth(i, f);
    }

    public void setBorderRadius(float f, int i) {
        getOrCreateReactViewBackground().setRadius(f, i);
    }
}