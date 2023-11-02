package com.facebook.react.uimanager;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.yoga.C4340d;
import java.util.Arrays;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Spacing {
    public static final int ALL = 8;
    public static final int BLOCK = 9;
    public static final int BLOCK_END = 10;
    public static final int BLOCK_START = 11;
    public static final int BOTTOM = 3;
    public static final int END = 5;
    public static final int HORIZONTAL = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int START = 4;
    public static final int TOP = 1;
    public static final int VERTICAL = 7;
    private static final int[] sFlagsMap = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, RecyclerView.ItemAnimator.FLAG_MOVED};
    private final float mDefaultValue;
    private boolean mHasAliasesSet;
    private final float[] mSpacing;
    private int mValueFlags;

    public Spacing() {
        this(0.0f);
    }

    private static float[] newFullSpacingArray() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public float get(int i) {
        float f;
        char c;
        if (i != 4 && i != 5 && i != 9 && i != 10 && i != 11) {
            f = this.mDefaultValue;
        } else {
            f = Float.NaN;
        }
        int i2 = this.mValueFlags;
        if (i2 == 0) {
            return f;
        }
        int[] iArr = sFlagsMap;
        if ((iArr[i] & i2) != 0) {
            return this.mSpacing[i];
        }
        if (this.mHasAliasesSet) {
            if (i != 1 && i != 3) {
                c = 6;
            } else {
                c = 7;
            }
            if ((iArr[c] & i2) != 0) {
                return this.mSpacing[c];
            }
            if ((i2 & iArr[8]) != 0) {
                return this.mSpacing[8];
            }
        }
        return f;
    }

    public float getRaw(int i) {
        return this.mSpacing[i];
    }

    float getWithFallback(int i, int i2) {
        return (this.mValueFlags & sFlagsMap[i]) != 0 ? this.mSpacing[i] : get(i2);
    }

    public void reset() {
        Arrays.fill(this.mSpacing, Float.NaN);
        this.mHasAliasesSet = false;
        this.mValueFlags = 0;
    }

    public boolean set(int i, float f) {
        boolean z = false;
        if (FloatUtil.floatsEqual(this.mSpacing[i], f)) {
            return false;
        }
        this.mSpacing[i] = f;
        if (C4340d.m29971a(f)) {
            this.mValueFlags = (~sFlagsMap[i]) & this.mValueFlags;
        } else {
            this.mValueFlags = sFlagsMap[i] | this.mValueFlags;
        }
        int i2 = this.mValueFlags;
        int[] iArr = sFlagsMap;
        if ((iArr[8] & i2) != 0 || (iArr[7] & i2) != 0 || (iArr[6] & i2) != 0 || (i2 & iArr[9]) != 0) {
            z = true;
        }
        this.mHasAliasesSet = z;
        return true;
    }

    public Spacing(float f) {
        this.mValueFlags = 0;
        this.mDefaultValue = f;
        this.mSpacing = newFullSpacingArray();
    }

    public Spacing(Spacing spacing) {
        this.mValueFlags = 0;
        this.mDefaultValue = spacing.mDefaultValue;
        float[] fArr = spacing.mSpacing;
        this.mSpacing = Arrays.copyOf(fArr, fArr.length);
        this.mValueFlags = spacing.mValueFlags;
        this.mHasAliasesSet = spacing.mHasAliasesSet;
    }
}