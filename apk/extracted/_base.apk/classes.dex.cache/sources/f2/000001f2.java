package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C1365w0;
import p052d.C5711f;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: j */
    private boolean f1564j;

    /* renamed from: k */
    private boolean f1565k;

    /* renamed from: l */
    private int f1566l;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1566l = -1;
        int[] iArr = C5715j.f16289N0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C1365w0.m37189o0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1564j = obtainStyledAttributes.getBoolean(C5715j.f16294O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1564j);
        }
    }

    /* renamed from: a */
    private int m40136a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    private boolean m40135b() {
        return this.f1565k;
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        if (this.f1565k != z) {
            if (!z || this.f1564j) {
                this.f1565k = z;
                setOrientation(z ? 1 : 0);
                if (z) {
                    i = 8388613;
                } else {
                    i = 80;
                }
                setGravity(i);
                View findViewById = findViewById(C5711f.f16149H);
                if (findViewById != null) {
                    if (z) {
                        i2 = 8;
                    } else {
                        i2 = 4;
                    }
                    findViewById.setVisibility(i2);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1564j) {
            if (size > this.f1566l && m40135b()) {
                setStacked(false);
            }
            this.f1566l = size;
        }
        if (!m40135b() && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (this.f1564j && !m40135b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int m40136a = m40136a(0);
        if (m40136a >= 0) {
            View childAt = getChildAt(m40136a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m40135b()) {
                int m40136a2 = m40136a(m40136a + 1);
                if (m40136a2 >= 0) {
                    paddingTop += getChildAt(m40136a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C1365w0.m37256C(this) != i4) {
            setMinimumHeight(i4);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1564j != z) {
            this.f1564j = z;
            if (!z && m40135b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}