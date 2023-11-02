package com.facebook.react.views.text;

import android.text.Spannable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactTextUpdate {
    private final boolean mContainsImages;
    private final int mJsEventCounter;
    private final int mJustificationMode;
    private final float mPaddingBottom;
    private final float mPaddingLeft;
    private final float mPaddingRight;
    private final float mPaddingTop;
    private final Spannable mText;
    private final int mTextAlign;
    private final int mTextBreakStrategy;

    @Deprecated
    public ReactTextUpdate(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2) {
        this(spannable, i, z, f, f2, f3, f4, i2, 1, 0);
    }

    public static ReactTextUpdate buildReactTextUpdateFromState(Spannable spannable, int i, int i2, int i3, int i4) {
        return new ReactTextUpdate(spannable, i, false, i2, i3, i4);
    }

    public boolean containsImages() {
        return this.mContainsImages;
    }

    public int getJsEventCounter() {
        return this.mJsEventCounter;
    }

    public int getJustificationMode() {
        return this.mJustificationMode;
    }

    public float getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public float getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public float getPaddingRight() {
        return this.mPaddingRight;
    }

    public float getPaddingTop() {
        return this.mPaddingTop;
    }

    public Spannable getText() {
        return this.mText;
    }

    public int getTextAlign() {
        return this.mTextAlign;
    }

    public int getTextBreakStrategy() {
        return this.mTextBreakStrategy;
    }

    public ReactTextUpdate(Spannable spannable, int i, boolean z, int i2, int i3, int i4) {
        this(spannable, i, z, -1.0f, -1.0f, -1.0f, -1.0f, i2, i3, i4);
    }

    public ReactTextUpdate(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4) {
        this.mText = spannable;
        this.mJsEventCounter = i;
        this.mContainsImages = z;
        this.mPaddingLeft = f;
        this.mPaddingTop = f2;
        this.mPaddingRight = f3;
        this.mPaddingBottom = f4;
        this.mTextAlign = i2;
        this.mTextBreakStrategy = i3;
        this.mJustificationMode = i4;
    }
}
