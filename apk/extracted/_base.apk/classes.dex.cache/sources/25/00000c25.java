package com.brentvatne.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.brentvatne.exoplayer.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2764a extends FrameLayout {

    /* renamed from: j */
    private float f7434j;

    /* renamed from: k */
    private int f7435k;

    public C2764a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m32431a() {
        this.f7434j = 0.0f;
    }

    public float getAspectRatio() {
        return this.f7434j;
    }

    public int getResizeMode() {
        return this.f7435k;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f7434j == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.f7434j / (f3 / f4)) - 1.0f;
        if (Math.abs(f5) <= 0.01f) {
            return;
        }
        int i3 = this.f7435k;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (f5 > 0.0f) {
                            f = this.f7434j;
                        } else {
                            f2 = this.f7434j;
                        }
                    } else {
                        int i4 = (int) (this.f7434j * f4);
                        if (i4 < measuredWidth) {
                            float f6 = i4;
                            float f7 = f3 / f6;
                            measuredWidth = (int) (f6 * f7);
                            measuredHeight = (int) (f4 * f7);
                        } else {
                            measuredWidth = i4;
                        }
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            f2 = this.f7434j;
            measuredWidth = (int) (f4 * f2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        f = this.f7434j;
        measuredHeight = (int) (f3 / f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f7434j != f) {
            this.f7434j = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f7435k != i) {
            this.f7435k = i;
            requestLayout();
        }
    }

    public C2764a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7435k = 0;
    }
}