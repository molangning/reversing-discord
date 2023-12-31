package com.facebook.react.views.text;

import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.PixelUtil;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TextAttributes {
    public static final float DEFAULT_MAX_FONT_SIZE_MULTIPLIER = 0.0f;
    private boolean mAllowFontScaling = true;
    private float mFontSize = Float.NaN;
    private float mLineHeight = Float.NaN;
    private float mLetterSpacing = Float.NaN;
    private float mMaxFontSizeMultiplier = Float.NaN;
    private float mHeightOfTallestInlineViewOrImage = Float.NaN;
    private TextTransform mTextTransform = TextTransform.UNSET;

    public TextAttributes applyChild(TextAttributes textAttributes) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        TextAttributes textAttributes2 = new TextAttributes();
        textAttributes2.mAllowFontScaling = this.mAllowFontScaling;
        if (!Float.isNaN(textAttributes.mFontSize)) {
            f = textAttributes.mFontSize;
        } else {
            f = this.mFontSize;
        }
        textAttributes2.mFontSize = f;
        if (!Float.isNaN(textAttributes.mLineHeight)) {
            f2 = textAttributes.mLineHeight;
        } else {
            f2 = this.mLineHeight;
        }
        textAttributes2.mLineHeight = f2;
        if (!Float.isNaN(textAttributes.mLetterSpacing)) {
            f3 = textAttributes.mLetterSpacing;
        } else {
            f3 = this.mLetterSpacing;
        }
        textAttributes2.mLetterSpacing = f3;
        if (!Float.isNaN(textAttributes.mMaxFontSizeMultiplier)) {
            f4 = textAttributes.mMaxFontSizeMultiplier;
        } else {
            f4 = this.mMaxFontSizeMultiplier;
        }
        textAttributes2.mMaxFontSizeMultiplier = f4;
        if (!Float.isNaN(textAttributes.mHeightOfTallestInlineViewOrImage)) {
            f5 = textAttributes.mHeightOfTallestInlineViewOrImage;
        } else {
            f5 = this.mHeightOfTallestInlineViewOrImage;
        }
        textAttributes2.mHeightOfTallestInlineViewOrImage = f5;
        TextTransform textTransform = textAttributes.mTextTransform;
        if (textTransform == TextTransform.UNSET) {
            textTransform = this.mTextTransform;
        }
        textAttributes2.mTextTransform = textTransform;
        return textAttributes2;
    }

    public boolean getAllowFontScaling() {
        return this.mAllowFontScaling;
    }

    public int getEffectiveFontSize() {
        float f;
        double ceil;
        if (!Float.isNaN(this.mFontSize)) {
            f = this.mFontSize;
        } else {
            f = 14.0f;
        }
        if (this.mAllowFontScaling) {
            ceil = Math.ceil(PixelUtil.toPixelFromSP(f, getEffectiveMaxFontSizeMultiplier()));
        } else {
            ceil = Math.ceil(PixelUtil.toPixelFromDIP(f));
        }
        return (int) ceil;
    }

    public float getEffectiveLetterSpacing() {
        float pixelFromDIP;
        if (Float.isNaN(this.mLetterSpacing)) {
            return Float.NaN;
        }
        if (this.mAllowFontScaling) {
            pixelFromDIP = PixelUtil.toPixelFromSP(this.mLetterSpacing, getEffectiveMaxFontSizeMultiplier());
        } else {
            pixelFromDIP = PixelUtil.toPixelFromDIP(this.mLetterSpacing);
        }
        return pixelFromDIP / getEffectiveFontSize();
    }

    public float getEffectiveLineHeight() {
        float pixelFromDIP;
        boolean z;
        if (Float.isNaN(this.mLineHeight)) {
            return Float.NaN;
        }
        if (this.mAllowFontScaling) {
            pixelFromDIP = PixelUtil.toPixelFromSP(this.mLineHeight, getEffectiveMaxFontSizeMultiplier());
        } else {
            pixelFromDIP = PixelUtil.toPixelFromDIP(this.mLineHeight);
        }
        if (!Float.isNaN(this.mHeightOfTallestInlineViewOrImage) && this.mHeightOfTallestInlineViewOrImage > pixelFromDIP) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.mHeightOfTallestInlineViewOrImage;
        }
        return pixelFromDIP;
    }

    public float getEffectiveMaxFontSizeMultiplier() {
        if (!Float.isNaN(this.mMaxFontSizeMultiplier)) {
            return this.mMaxFontSizeMultiplier;
        }
        return 0.0f;
    }

    public float getFontSize() {
        return this.mFontSize;
    }

    public float getHeightOfTallestInlineViewOrImage() {
        return this.mHeightOfTallestInlineViewOrImage;
    }

    public float getLetterSpacing() {
        return this.mLetterSpacing;
    }

    public float getLineHeight() {
        return this.mLineHeight;
    }

    public float getMaxFontSizeMultiplier() {
        return this.mMaxFontSizeMultiplier;
    }

    public TextTransform getTextTransform() {
        return this.mTextTransform;
    }

    public void setAllowFontScaling(boolean z) {
        this.mAllowFontScaling = z;
    }

    public void setFontSize(float f) {
        this.mFontSize = f;
    }

    public void setHeightOfTallestInlineViewOrImage(float f) {
        this.mHeightOfTallestInlineViewOrImage = f;
    }

    public void setLetterSpacing(float f) {
        this.mLetterSpacing = f;
    }

    public void setLineHeight(float f) {
        this.mLineHeight = f;
    }

    public void setMaxFontSizeMultiplier(float f) {
        if (f != 0.0f && f < 1.0f) {
            C13677a.m1870H(ReactConstants.TAG, "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.mMaxFontSizeMultiplier = Float.NaN;
            return;
        }
        this.mMaxFontSizeMultiplier = f;
    }

    public void setTextTransform(TextTransform textTransform) {
        this.mTextTransform = textTransform;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + getAllowFontScaling() + "\n  getFontSize(): " + getFontSize() + "\n  getEffectiveFontSize(): " + getEffectiveFontSize() + "\n  getHeightOfTallestInlineViewOrImage(): " + getHeightOfTallestInlineViewOrImage() + "\n  getLetterSpacing(): " + getLetterSpacing() + "\n  getEffectiveLetterSpacing(): " + getEffectiveLetterSpacing() + "\n  getLineHeight(): " + getLineHeight() + "\n  getEffectiveLineHeight(): " + getEffectiveLineHeight() + "\n  getTextTransform(): " + getTextTransform() + "\n  getMaxFontSizeMultiplier(): " + getMaxFontSizeMultiplier() + "\n  getEffectiveMaxFontSizeMultiplier(): " + getEffectiveMaxFontSizeMultiplier() + "\n}";
    }
}