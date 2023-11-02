package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C1365w0;
import p052d.C5715j;

/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0579u0 extends ViewGroup {

    /* renamed from: j */
    private boolean f1976j;

    /* renamed from: k */
    private int f1977k;

    /* renamed from: l */
    private int f1978l;

    /* renamed from: m */
    private int f1979m;

    /* renamed from: n */
    private int f1980n;

    /* renamed from: o */
    private int f1981o;

    /* renamed from: p */
    private float f1982p;

    /* renamed from: q */
    private boolean f1983q;

    /* renamed from: r */
    private int[] f1984r;

    /* renamed from: s */
    private int[] f1985s;

    /* renamed from: t */
    private Drawable f1986t;

    /* renamed from: u */
    private int f1987u;

    /* renamed from: v */
    private int f1988v;

    /* renamed from: w */
    private int f1989w;

    /* renamed from: x */
    private int f1990x;

    /* renamed from: androidx.appcompat.widget.u0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0580a extends LinearLayout.LayoutParams {
        public C0580a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0580a(int i, int i2) {
            super(i, i2);
        }

        public C0580a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0579u0(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m39683i(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m39675q = m39675q(i3);
            if (m39675q.getVisibility() != 8) {
                C0580a c0580a = (C0580a) m39675q.getLayoutParams();
                if (((LinearLayout.LayoutParams) c0580a).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c0580a).width;
                    ((LinearLayout.LayoutParams) c0580a).width = m39675q.getMeasuredWidth();
                    measureChildWithMargins(m39675q, i2, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) c0580a).width = i4;
                }
            }
        }
    }

    /* renamed from: j */
    private void m39682j(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m39675q = m39675q(i3);
            if (m39675q.getVisibility() != 8) {
                C0580a c0580a = (C0580a) m39675q.getLayoutParams();
                if (((LinearLayout.LayoutParams) c0580a).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c0580a).height;
                    ((LinearLayout.LayoutParams) c0580a).height = m39675q.getMeasuredHeight();
                    measureChildWithMargins(m39675q, makeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c0580a).height = i4;
                }
            }
        }
    }

    /* renamed from: y */
    private void m39667y(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0580a;
    }

    /* renamed from: e */
    void m39687e(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean m39572b = C0616y1.m39572b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m39675q = m39675q(i2);
            if (m39675q != null && m39675q.getVisibility() != 8 && m39674r(i2)) {
                C0580a c0580a = (C0580a) m39675q.getLayoutParams();
                if (m39572b) {
                    left2 = m39675q.getRight() + ((LinearLayout.LayoutParams) c0580a).rightMargin;
                } else {
                    left2 = (m39675q.getLeft() - ((LinearLayout.LayoutParams) c0580a).leftMargin) - this.f1987u;
                }
                m39684h(canvas, left2);
            }
        }
        if (m39674r(virtualChildCount)) {
            View m39675q2 = m39675q(virtualChildCount - 1);
            if (m39675q2 == null) {
                if (m39572b) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.f1987u;
                    right = left - i;
                }
            } else {
                C0580a c0580a2 = (C0580a) m39675q2.getLayoutParams();
                if (m39572b) {
                    left = m39675q2.getLeft() - ((LinearLayout.LayoutParams) c0580a2).leftMargin;
                    i = this.f1987u;
                    right = left - i;
                } else {
                    right = m39675q2.getRight() + ((LinearLayout.LayoutParams) c0580a2).rightMargin;
                }
            }
            m39684h(canvas, right);
        }
    }

    /* renamed from: f */
    void m39686f(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m39675q = m39675q(i);
            if (m39675q != null && m39675q.getVisibility() != 8 && m39674r(i)) {
                m39685g(canvas, (m39675q.getTop() - ((LinearLayout.LayoutParams) ((C0580a) m39675q.getLayoutParams())).topMargin) - this.f1988v);
            }
        }
        if (m39674r(virtualChildCount)) {
            View m39675q2 = m39675q(virtualChildCount - 1);
            if (m39675q2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f1988v;
            } else {
                bottom = m39675q2.getBottom() + ((LinearLayout.LayoutParams) ((C0580a) m39675q2.getLayoutParams())).bottomMargin;
            }
            m39685g(canvas, bottom);
        }
    }

    /* renamed from: g */
    void m39685g(Canvas canvas, int i) {
        this.f1986t.setBounds(getPaddingLeft() + this.f1990x, i, (getWidth() - getPaddingRight()) - this.f1990x, this.f1988v + i);
        this.f1986t.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1977k < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1977k;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1977k == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f1978l;
            if (this.f1979m == 1 && (i = this.f1980n & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1981o;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1981o) / 2;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((C0580a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1977k;
    }

    public Drawable getDividerDrawable() {
        return this.f1986t;
    }

    public int getDividerPadding() {
        return this.f1990x;
    }

    public int getDividerWidth() {
        return this.f1987u;
    }

    public int getGravity() {
        return this.f1980n;
    }

    public int getOrientation() {
        return this.f1979m;
    }

    public int getShowDividers() {
        return this.f1989w;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1982p;
    }

    /* renamed from: h */
    void m39684h(Canvas canvas, int i) {
        this.f1986t.setBounds(i, getPaddingTop() + this.f1990x, this.f1987u + i, (getHeight() - getPaddingBottom()) - this.f1990x);
        this.f1986t.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k */
    public C0580a generateDefaultLayoutParams() {
        int i = this.f1979m;
        if (i == 0) {
            return new C0580a(-2, -2);
        }
        if (i == 1) {
            return new C0580a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public C0580a generateLayoutParams(AttributeSet attributeSet) {
        return new C0580a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0580a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0580a(layoutParams);
    }

    /* renamed from: n */
    int m39678n(View view, int i) {
        return 0;
    }

    /* renamed from: o */
    int m39677o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1986t == null) {
            return;
        }
        if (this.f1979m == 1) {
            m39686f(canvas);
        } else {
            m39687e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1979m == 1) {
            m39672t(i, i2, i3, i4);
        } else {
            m39673s(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1979m == 1) {
            m39668x(i, i2);
        } else {
            m39670v(i, i2);
        }
    }

    /* renamed from: p */
    int m39676p(View view) {
        return 0;
    }

    /* renamed from: q */
    View m39675q(int i) {
        return getChildAt(i);
    }

    /* renamed from: r */
    public boolean m39674r(int i) {
        if (i == 0) {
            if ((this.f1989w & 1) == 0) {
                return false;
            }
            return true;
        } else if (i == getChildCount()) {
            if ((this.f1989w & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f1989w & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b8  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m39673s(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0579u0.m39673s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f1976j = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1977k = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1986t) {
            return;
        }
        this.f1986t = drawable;
        boolean z = false;
        if (drawable != null) {
            this.f1987u = drawable.getIntrinsicWidth();
            this.f1988v = drawable.getIntrinsicHeight();
        } else {
            this.f1987u = 0;
            this.f1988v = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1990x = i;
    }

    public void setGravity(int i) {
        if (this.f1980n != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1980n = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1980n;
        if ((8388615 & i3) != i2) {
            this.f1980n = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1983q = z;
    }

    public void setOrientation(int i) {
        if (this.f1979m != i) {
            this.f1979m = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1989w) {
            requestLayout();
        }
        this.f1989w = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1980n;
        if ((i3 & 112) != i2) {
            this.f1980n = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1982p = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x009f  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m39672t(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1980n
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1981o
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1981o
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lcb
            android.view.View r13 = r6.m39675q(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m39669w(r12)
            int r0 = r0 + r1
            goto Lc7
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc7
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.u0$a r5 = (androidx.appcompat.widget.C0579u0.C0580a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.C1365w0.m37258B(r17)
            int r1 = androidx.core.view.C1336t.m37321b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.m39674r(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f1988v
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m39677o(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m39667y(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m39676p(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m39678n(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc8
        Lc7:
            r1 = r14
        Lc8:
            int r12 = r12 + r1
            goto L49
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0579u0.m39672t(int, int, int, int):void");
    }

    /* renamed from: u */
    void m39671u(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:305:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0452  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m39670v(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0579u0.m39670v(int, int):void");
    }

    /* renamed from: w */
    int m39669w(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:337:0x0325  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m39668x(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0579u0.m39668x(int, int):void");
    }

    public C0579u0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0579u0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1976j = true;
        this.f1977k = -1;
        this.f1978l = 0;
        this.f1980n = 8388659;
        int[] iArr = C5715j.f16347a1;
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, iArr, i, 0);
        C1365w0.m37189o0(this, context, iArr, attributeSet, m39780v.m39784r(), i, 0);
        int m39791k = m39780v.m39791k(C5715j.f16357c1, -1);
        if (m39791k >= 0) {
            setOrientation(m39791k);
        }
        int m39791k2 = m39780v.m39791k(C5715j.f16352b1, -1);
        if (m39791k2 >= 0) {
            setGravity(m39791k2);
        }
        boolean m39801a = m39780v.m39801a(C5715j.f16362d1, true);
        if (!m39801a) {
            setBaselineAligned(m39801a);
        }
        this.f1982p = m39780v.m39793i(C5715j.f16372f1, -1.0f);
        this.f1977k = m39780v.m39791k(C5715j.f16367e1, -1);
        this.f1983q = m39780v.m39801a(C5715j.f16387i1, false);
        setDividerDrawable(m39780v.m39795g(C5715j.f16377g1));
        this.f1989w = m39780v.m39791k(C5715j.f16392j1, 0);
        this.f1990x = m39780v.m39796f(C5715j.f16382h1, 0);
        m39780v.m39779w();
    }
}