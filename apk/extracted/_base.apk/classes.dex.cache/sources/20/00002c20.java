package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1363w;
import androidx.core.view.C1365w0;
import com.facebook.react.uimanager.ViewDefaults;
import p155ia.C7484f;
import p155ia.C7489k;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4894e extends ViewGroup {

    /* renamed from: j */
    private int f13739j;

    /* renamed from: k */
    private int f13740k;

    /* renamed from: l */
    private boolean f13741l;

    /* renamed from: m */
    private int f13742m;

    public C4894e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m26979a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: d */
    private void m26976d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7489k.f20416Q1, 0, 0);
        this.f13739j = obtainStyledAttributes.getDimensionPixelSize(C7489k.f20432S1, 0);
        this.f13740k = obtainStyledAttributes.getDimensionPixelSize(C7489k.f20424R1, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int m26978b(View view) {
        Object tag = view.getTag(C7484f.f20190F);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo26977c() {
        return this.f13741l;
    }

    protected int getItemSpacing() {
        return this.f13740k;
    }

    protected int getLineSpacing() {
        return this.f13739j;
    }

    public int getRowCount() {
        return this.f13742m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f13742m = 0;
            return;
        }
        this.f13742m = 1;
        if (C1365w0.m37258B(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingRight;
        int i8 = paddingLeft;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C7484f.f20190F, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = C1363w.m37271b(marginLayoutParams);
                    i5 = C1363w.m37272a(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                if (!this.f13741l && measuredWidth > i7) {
                    i9 = this.f13739j + paddingTop;
                    this.f13742m++;
                    i8 = paddingLeft;
                }
                childAt.setTag(C7484f.f20190F, Integer.valueOf(this.f13742m - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.f13740k;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i3 = ViewDefaults.NUMBER_OF_LINES;
        } else {
            i3 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i10 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() > paddingRight && !mo26977c()) {
                    i6 = getPaddingLeft();
                    i7 = this.f13739j + paddingTop;
                } else {
                    i6 = i10;
                }
                int measuredWidth = i6 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i4 + i5 + childAt.getMeasuredWidth() + this.f13740k;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m26979a(size, mode, i8 + getPaddingRight()), m26979a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.f13740k = i;
    }

    public void setLineSpacing(int i) {
        this.f13739j = i;
    }

    public void setSingleLine(boolean z) {
        this.f13741l = z;
    }

    public C4894e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13741l = false;
        m26976d(context, attributeSet);
    }
}