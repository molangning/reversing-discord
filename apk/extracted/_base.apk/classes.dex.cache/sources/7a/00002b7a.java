package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import bb.C2232g;
import bb.C2236h;
import com.google.android.material.internal.C4909n;
import p155ia.C7480b;
import p155ia.C7488j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: l0 */
    private static final int f13029l0 = C7488j.f20285v;

    /* renamed from: m0 */
    private static final ImageView.ScaleType[] f13030m0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: g0 */
    private Integer f13031g0;

    /* renamed from: h0 */
    private boolean f13032h0;

    /* renamed from: i0 */
    private boolean f13033i0;

    /* renamed from: j0 */
    private ImageView.ScaleType f13034j0;

    /* renamed from: k0 */
    private Boolean f13035k0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20097L);
    }

    /* renamed from: S */
    private Pair<Integer, Integer> m27879S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: T */
    private void m27878T(Context context) {
        int i;
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        C2232g c2232g = new C2232g();
        if (background != null) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        c2232g.m33919Y(ColorStateList.valueOf(i));
        c2232g.m33929O(context);
        c2232g.m33920X(C1365w0.m37174w(this));
        C1365w0.m37177u0(this, c2232g);
    }

    /* renamed from: U */
    private void m27877U(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: V */
    private void m27876V() {
        if (!this.f13032h0 && !this.f13033i0) {
            return;
        }
        TextView m26939e = C4909n.m26939e(this);
        TextView m26941c = C4909n.m26941c(this);
        if (m26939e == null && m26941c == null) {
            return;
        }
        Pair<Integer, Integer> m27879S = m27879S(m26939e, m26941c);
        if (this.f13032h0 && m26939e != null) {
            m27877U(m26939e, m27879S);
        }
        if (this.f13033i0 && m26941c != null) {
            m27877U(m26941c, m27879S);
        }
    }

    /* renamed from: W */
    private Drawable m27875W(Drawable drawable) {
        if (drawable != null && this.f13031g0 != null) {
            Drawable m38080r = C1013a.m38080r(drawable.mutate());
            C1013a.m38084n(m38080r, this.f13031g0.intValue());
            return m38080r;
        }
        return drawable;
    }

    /* renamed from: X */
    private void m27874X() {
        ImageView m26942b = C4909n.m26942b(this);
        if (m26942b != null) {
            Boolean bool = this.f13035k0;
            if (bool != null) {
                m26942b.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f13034j0;
            if (scaleType != null) {
                m26942b.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f13034j0;
    }

    public Integer getNavigationIconTint() {
        return this.f13031g0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2236h.m33878e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m27876V();
        m27874X();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2236h.m33879d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f13035k0;
        if (bool == null || bool.booleanValue() != z) {
            this.f13035k0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f13034j0 != scaleType) {
            this.f13034j0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m27875W(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f13031g0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f13033i0 != z) {
            this.f13033i0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f13032h0 != z) {
            this.f13032h0 = z;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f13029l0
            android.content.Context r8 = p064db.C5810a.m24498c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p155ia.C7489k.f20434S3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            int r10 = p155ia.C7489k.f20458V3
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L29
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = p155ia.C7489k.f20473X3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f13032h0 = r10
            int r10 = p155ia.C7489k.f20466W3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f13033i0 = r10
            int r10 = p155ia.C7489k.f20450U3
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L4a
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.f13030m0
            int r1 = r0.length
            if (r10 >= r1) goto L4a
            r10 = r0[r10]
            r7.f13034j0 = r10
        L4a:
            int r10 = p155ia.C7489k.f20442T3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L5c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f13035k0 = r10
        L5c:
            r9.recycle()
            r7.m27878T(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}