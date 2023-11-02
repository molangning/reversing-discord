package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1365w0;
import com.google.android.flexbox.C4585d;
import java.util.ArrayList;
import java.util.List;
import p261o8.C11073a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FlexboxLayout extends ViewGroup implements InterfaceC4582a {

    /* renamed from: j */
    private int f12434j;

    /* renamed from: k */
    private int f12435k;

    /* renamed from: l */
    private int f12436l;

    /* renamed from: m */
    private int f12437m;

    /* renamed from: n */
    private int f12438n;

    /* renamed from: o */
    private int f12439o;

    /* renamed from: p */
    private Drawable f12440p;

    /* renamed from: q */
    private Drawable f12441q;

    /* renamed from: r */
    private int f12442r;

    /* renamed from: s */
    private int f12443s;

    /* renamed from: t */
    private int f12444t;

    /* renamed from: u */
    private int f12445u;

    /* renamed from: v */
    private int[] f12446v;

    /* renamed from: w */
    private SparseIntArray f12447w;

    /* renamed from: x */
    private C4585d f12448x;

    /* renamed from: y */
    private List<C4584c> f12449y;

    /* renamed from: z */
    private C4585d.C4587b f12450z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private void m28581A() {
        if (this.f12440p == null && this.f12441q == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    private boolean m28580a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12449y.get(i2).m28389c() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private boolean m28579d(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View m28573r = m28573r(i - i3);
            if (m28573r != null && m28573r.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private void m28578m(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f12449y.size();
        for (int i3 = 0; i3 < size; i3++) {
            C4584c c4584c = this.f12449y.get(i3);
            for (int i4 = 0; i4 < c4584c.f12524h; i4++) {
                int i5 = c4584c.f12531o + i4;
                View m28573r = m28573r(i5);
                if (m28573r != null && m28573r.getVisibility() != 8) {
                    C4573a c4573a = (C4573a) m28573r.getLayoutParams();
                    if (m28572s(i5, i4)) {
                        if (z) {
                            left = m28573r.getRight() + ((ViewGroup.MarginLayoutParams) c4573a).rightMargin;
                        } else {
                            left = (m28573r.getLeft() - ((ViewGroup.MarginLayoutParams) c4573a).leftMargin) - this.f12445u;
                        }
                        m28575p(canvas, left, c4584c.f12518b, c4584c.f12523g);
                    }
                    if (i4 == c4584c.f12524h - 1 && (this.f12443s & 4) > 0) {
                        if (z) {
                            right = (m28573r.getLeft() - ((ViewGroup.MarginLayoutParams) c4573a).leftMargin) - this.f12445u;
                        } else {
                            right = m28573r.getRight() + ((ViewGroup.MarginLayoutParams) c4573a).rightMargin;
                        }
                        m28575p(canvas, right, c4584c.f12518b, c4584c.f12523g);
                    }
                }
            }
            if (m28571t(i3)) {
                if (z2) {
                    i2 = c4584c.f12520d;
                } else {
                    i2 = c4584c.f12518b - this.f12444t;
                }
                m28576o(canvas, paddingLeft, i2, max);
            }
            if (m28570u(i3) && (this.f12442r & 4) > 0) {
                if (z2) {
                    i = c4584c.f12518b - this.f12444t;
                } else {
                    i = c4584c.f12520d;
                }
                m28576o(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: n */
    private void m28577n(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f12449y.size();
        for (int i3 = 0; i3 < size; i3++) {
            C4584c c4584c = this.f12449y.get(i3);
            for (int i4 = 0; i4 < c4584c.f12524h; i4++) {
                int i5 = c4584c.f12531o + i4;
                View m28573r = m28573r(i5);
                if (m28573r != null && m28573r.getVisibility() != 8) {
                    C4573a c4573a = (C4573a) m28573r.getLayoutParams();
                    if (m28572s(i5, i4)) {
                        if (z2) {
                            top = m28573r.getBottom() + ((ViewGroup.MarginLayoutParams) c4573a).bottomMargin;
                        } else {
                            top = (m28573r.getTop() - ((ViewGroup.MarginLayoutParams) c4573a).topMargin) - this.f12444t;
                        }
                        m28576o(canvas, c4584c.f12517a, top, c4584c.f12523g);
                    }
                    if (i4 == c4584c.f12524h - 1 && (this.f12442r & 4) > 0) {
                        if (z2) {
                            bottom = (m28573r.getTop() - ((ViewGroup.MarginLayoutParams) c4573a).topMargin) - this.f12444t;
                        } else {
                            bottom = m28573r.getBottom() + ((ViewGroup.MarginLayoutParams) c4573a).bottomMargin;
                        }
                        m28576o(canvas, c4584c.f12517a, bottom, c4584c.f12523g);
                    }
                }
            }
            if (m28571t(i3)) {
                if (z) {
                    i2 = c4584c.f12519c;
                } else {
                    i2 = c4584c.f12517a - this.f12445u;
                }
                m28575p(canvas, i2, paddingTop, max);
            }
            if (m28570u(i3) && (this.f12443s & 4) > 0) {
                if (z) {
                    i = c4584c.f12517a - this.f12445u;
                } else {
                    i = c4584c.f12519c;
                }
                m28575p(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: o */
    private void m28576o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f12440p;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f12444t + i2);
        this.f12440p.draw(canvas);
    }

    /* renamed from: p */
    private void m28575p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f12441q;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f12445u + i, i3 + i2);
        this.f12441q.draw(canvas);
    }

    /* renamed from: s */
    private boolean m28572s(int i, int i2) {
        if (m28579d(i, i2)) {
            if (mo28407l()) {
                if ((this.f12443s & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f12442r & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (mo28407l()) {
            if ((this.f12443s & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f12442r & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: t */
    private boolean m28571t(int i) {
        if (i < 0 || i >= this.f12449y.size()) {
            return false;
        }
        if (m28580a(i)) {
            if (mo28407l()) {
                if ((this.f12442r & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f12443s & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (mo28407l()) {
            if ((this.f12442r & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f12443s & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: u */
    private boolean m28570u(int i) {
        if (i < 0 || i >= this.f12449y.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f12449y.size(); i2++) {
            if (this.f12449y.get(i2).m28389c() > 0) {
                return false;
            }
        }
        if (mo28407l()) {
            if ((this.f12442r & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f12443s & 4) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28569v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m28569v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28568w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m28568w(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: x */
    private void m28567x(int i, int i2) {
        this.f12449y.clear();
        this.f12450z.m28335a();
        this.f12448x.m28359c(this.f12450z, i, i2);
        this.f12449y = this.f12450z.f12540a;
        this.f12448x.m28346p(i, i2);
        if (this.f12437m == 3) {
            for (C4584c c4584c : this.f12449y) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < c4584c.f12524h; i4++) {
                    View m28573r = m28573r(c4584c.f12531o + i4);
                    if (m28573r != null && m28573r.getVisibility() != 8) {
                        C4573a c4573a = (C4573a) m28573r.getLayoutParams();
                        if (this.f12435k != 2) {
                            i3 = Math.max(i3, m28573r.getMeasuredHeight() + Math.max(c4584c.f12528l - m28573r.getBaseline(), ((ViewGroup.MarginLayoutParams) c4573a).topMargin) + ((ViewGroup.MarginLayoutParams) c4573a).bottomMargin);
                        } else {
                            i3 = Math.max(i3, m28573r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4573a).topMargin + Math.max((c4584c.f12528l - m28573r.getMeasuredHeight()) + m28573r.getBaseline(), ((ViewGroup.MarginLayoutParams) c4573a).bottomMargin));
                        }
                    }
                }
                c4584c.f12523g = i3;
            }
        }
        this.f12448x.m28347o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f12448x.m28364X();
        m28565z(this.f12434j, i, i2, this.f12450z.f12541b);
    }

    /* renamed from: y */
    private void m28566y(int i, int i2) {
        this.f12449y.clear();
        this.f12450z.m28335a();
        this.f12448x.m28356f(this.f12450z, i, i2);
        this.f12449y = this.f12450z.f12540a;
        this.f12448x.m28346p(i, i2);
        this.f12448x.m28347o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f12448x.m28364X();
        m28565z(this.f12434j, i, i2, this.f12450z.f12541b);
    }

    /* renamed from: z */
    private void m28565z(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i4 = View.combineMeasuredStates(i4, 16777216);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
            }
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i4 = View.combineMeasuredStates(i4, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f12447w == null) {
            this.f12447w = new SparseIntArray(getChildCount());
        }
        this.f12446v = this.f12448x.m28348n(view, i, layoutParams, this.f12447w);
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: b */
    public void mo28416b(View view, int i, int i2, C4584c c4584c) {
        if (m28572s(i, i2)) {
            if (mo28407l()) {
                int i3 = c4584c.f12521e;
                int i4 = this.f12445u;
                c4584c.f12521e = i3 + i4;
                c4584c.f12522f += i4;
                return;
            }
            int i5 = c4584c.f12521e;
            int i6 = this.f12444t;
            c4584c.f12521e = i5 + i6;
            c4584c.f12522f += i6;
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: c */
    public int mo28415c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4573a;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: e */
    public View mo28414e(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: f */
    public int mo28413f(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: g */
    public int mo28412g(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getAlignContent() {
        return this.f12438n;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getAlignItems() {
        return this.f12437m;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f12440p;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f12441q;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getFlexDirection() {
        return this.f12434j;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C4584c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f12449y.size());
        for (C4584c c4584c : this.f12449y) {
            if (c4584c.m28389c() != 0) {
                arrayList.add(c4584c);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public List<C4584c> getFlexLinesInternal() {
        return this.f12449y;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getFlexWrap() {
        return this.f12435k;
    }

    public int getJustifyContent() {
        return this.f12436l;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C4584c c4584c : this.f12449y) {
            i = Math.max(i, c4584c.f12521e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getMaxLine() {
        return this.f12439o;
    }

    public int getShowDividerHorizontal() {
        return this.f12442r;
    }

    public int getShowDividerVertical() {
        return this.f12443s;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f12449y.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C4584c c4584c = this.f12449y.get(i4);
            if (m28571t(i4)) {
                if (mo28407l()) {
                    i2 = this.f12444t;
                } else {
                    i2 = this.f12445u;
                }
                i3 += i2;
            }
            if (m28570u(i4)) {
                if (mo28407l()) {
                    i = this.f12444t;
                } else {
                    i = this.f12445u;
                }
                i3 += i;
            }
            i3 += c4584c.f12523g;
        }
        return i3;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: h */
    public void mo28411h(C4584c c4584c) {
        if (mo28407l()) {
            if ((this.f12443s & 4) > 0) {
                int i = c4584c.f12521e;
                int i2 = this.f12445u;
                c4584c.f12521e = i + i2;
                c4584c.f12522f += i2;
            }
        } else if ((this.f12442r & 4) > 0) {
            int i3 = c4584c.f12521e;
            int i4 = this.f12444t;
            c4584c.f12521e = i3 + i4;
            c4584c.f12522f += i4;
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: i */
    public View mo28410i(int i) {
        return m28573r(i);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: j */
    public void mo28409j(int i, View view) {
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: k */
    public int mo28408k(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo28407l()) {
            if (m28572s(i, i2)) {
                i4 = 0 + this.f12445u;
            }
            if ((this.f12443s & 4) > 0) {
                i3 = this.f12445u;
            } else {
                return i4;
            }
        } else {
            if (m28572s(i, i2)) {
                i4 = 0 + this.f12444t;
            }
            if ((this.f12442r & 4) > 0) {
                i3 = this.f12444t;
            } else {
                return i4;
            }
        }
        return i4 + i3;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: l */
    public boolean mo28407l() {
        int i = this.f12434j;
        return i == 0 || i == 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f12441q == null && this.f12440p == null) {
            return;
        }
        if (this.f12442r == 0 && this.f12443s == 0) {
            return;
        }
        int m37258B = C1365w0.m37258B(this);
        int i = this.f12434j;
        boolean z3 = false;
        boolean z4 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (m37258B == 1) {
                            z3 = true;
                        }
                        if (this.f12435k == 2) {
                            z3 = !z3;
                        }
                        m28577n(canvas, z3, true);
                        return;
                    }
                    return;
                }
                if (m37258B != 1) {
                    z4 = false;
                }
                if (this.f12435k == 2) {
                    z4 = !z4;
                }
                m28577n(canvas, z4, false);
                return;
            }
            if (m37258B != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f12435k == 2) {
                z3 = true;
            }
            m28578m(canvas, z2, z3);
            return;
        }
        if (m37258B == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f12435k == 2) {
            z3 = true;
        }
        m28578m(canvas, z, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int m37258B = C1365w0.m37258B(this);
        int i5 = this.f12434j;
        boolean z6 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (m37258B == 1) {
                            z6 = true;
                        }
                        if (this.f12435k == 2) {
                            z5 = !z6;
                        } else {
                            z5 = z6;
                        }
                        m28568w(z5, true, i, i2, i3, i4);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.f12434j);
                }
                if (m37258B == 1) {
                    z6 = true;
                }
                if (this.f12435k == 2) {
                    z4 = !z6;
                } else {
                    z4 = z6;
                }
                m28568w(z4, false, i, i2, i3, i4);
                return;
            }
            if (m37258B != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            m28569v(z3, i, i2, i3, i4);
            return;
        }
        if (m37258B == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        m28569v(z2, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f12447w == null) {
            this.f12447w = new SparseIntArray(getChildCount());
        }
        if (this.f12448x.m28373O(this.f12447w)) {
            this.f12446v = this.f12448x.m28349m(this.f12447w);
        }
        int i3 = this.f12434j;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f12434j);
            }
            m28566y(i, i2);
            return;
        }
        m28567x(i, i2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public C4573a generateLayoutParams(AttributeSet attributeSet) {
        return new C4573a(getContext(), attributeSet);
    }

    /* renamed from: r */
    public View m28573r(int i) {
        if (i >= 0) {
            int[] iArr = this.f12446v;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
            return null;
        }
        return null;
    }

    public void setAlignContent(int i) {
        if (this.f12438n != i) {
            this.f12438n = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f12437m != i) {
            this.f12437m = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f12440p) {
            return;
        }
        this.f12440p = drawable;
        if (drawable != null) {
            this.f12444t = drawable.getIntrinsicHeight();
        } else {
            this.f12444t = 0;
        }
        m28581A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f12441q) {
            return;
        }
        this.f12441q = drawable;
        if (drawable != null) {
            this.f12445u = drawable.getIntrinsicWidth();
        } else {
            this.f12445u = 0;
        }
        m28581A();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f12434j != i) {
            this.f12434j = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public void setFlexLines(List<C4584c> list) {
        this.f12449y = list;
    }

    public void setFlexWrap(int i) {
        if (this.f12435k != i) {
            this.f12435k = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f12436l != i) {
            this.f12436l = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f12439o != i) {
            this.f12439o = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f12442r) {
            this.f12442r = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f12443s) {
            this.f12443s = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12439o = -1;
        this.f12448x = new C4585d(this);
        this.f12449y = new ArrayList();
        this.f12450z = new C4585d.C4587b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11073a.f29004b, i, 0);
        this.f12434j = obtainStyledAttributes.getInt(C11073a.f29010h, 0);
        this.f12435k = obtainStyledAttributes.getInt(C11073a.f29011i, 0);
        this.f12436l = obtainStyledAttributes.getInt(C11073a.f29012j, 0);
        this.f12437m = obtainStyledAttributes.getInt(C11073a.f29006d, 0);
        this.f12438n = obtainStyledAttributes.getInt(C11073a.f29005c, 0);
        this.f12439o = obtainStyledAttributes.getInt(C11073a.f29013k, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C11073a.f29007e);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C11073a.f29008f);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C11073a.f29009g);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(C11073a.f29014l, 0);
        if (i2 != 0) {
            this.f12443s = i2;
            this.f12442r = i2;
        }
        int i3 = obtainStyledAttributes.getInt(C11073a.f29016n, 0);
        if (i3 != 0) {
            this.f12443s = i3;
        }
        int i4 = obtainStyledAttributes.getInt(C11073a.f29015m, 0);
        if (i4 != 0) {
            this.f12442r = i4;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C4573a) {
            return new C4573a((C4573a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4573a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4573a(layoutParams);
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4573a extends ViewGroup.MarginLayoutParams implements InterfaceC4583b {
        public static final Parcelable.Creator<C4573a> CREATOR = new C4574a();

        /* renamed from: j */
        private int f12451j;

        /* renamed from: k */
        private float f12452k;

        /* renamed from: l */
        private float f12453l;

        /* renamed from: m */
        private int f12454m;

        /* renamed from: n */
        private float f12455n;

        /* renamed from: o */
        private int f12456o;

        /* renamed from: p */
        private int f12457p;

        /* renamed from: q */
        private int f12458q;

        /* renamed from: r */
        private int f12459r;

        /* renamed from: s */
        private boolean f12460s;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4574a implements Parcelable.Creator<C4573a> {
            C4574a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4573a createFromParcel(Parcel parcel) {
                return new C4573a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C4573a[] newArray(int i) {
                return new C4573a[i];
            }
        }

        public C4573a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12451j = 1;
            this.f12452k = 0.0f;
            this.f12453l = 1.0f;
            this.f12454m = -1;
            this.f12455n = -1.0f;
            this.f12456o = -1;
            this.f12457p = -1;
            this.f12458q = 16777215;
            this.f12459r = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11073a.f29017o);
            this.f12451j = obtainStyledAttributes.getInt(C11073a.f29026x, 1);
            this.f12452k = obtainStyledAttributes.getFloat(C11073a.f29020r, 0.0f);
            this.f12453l = obtainStyledAttributes.getFloat(C11073a.f29021s, 1.0f);
            this.f12454m = obtainStyledAttributes.getInt(C11073a.f29018p, -1);
            this.f12455n = obtainStyledAttributes.getFraction(C11073a.f29019q, 1, 1, -1.0f);
            this.f12456o = obtainStyledAttributes.getDimensionPixelSize(C11073a.f29025w, -1);
            this.f12457p = obtainStyledAttributes.getDimensionPixelSize(C11073a.f29024v, -1);
            this.f12458q = obtainStyledAttributes.getDimensionPixelSize(C11073a.f29023u, 16777215);
            this.f12459r = obtainStyledAttributes.getDimensionPixelSize(C11073a.f29022t, 16777215);
            this.f12460s = obtainStyledAttributes.getBoolean(C11073a.f29027y, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: B */
        public void mo28406B(int i) {
            this.f12456o = i;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: C */
        public int mo28405C() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: D */
        public int mo28404D() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: K */
        public int mo28403K() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: L */
        public int mo28402L() {
            return this.f12457p;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: N */
        public int mo28401N() {
            return this.f12459r;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: c */
        public int mo28400c() {
            return this.f12454m;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: f */
        public float mo28399f() {
            return this.f12453l;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        public int getOrder() {
            return this.f12451j;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: i */
        public int mo28398i() {
            return this.f12456o;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: l */
        public int mo28397l() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: m */
        public void mo28396m(int i) {
            this.f12457p = i;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: n */
        public float mo28395n() {
            return this.f12452k;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: q */
        public float mo28394q() {
            return this.f12455n;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: s */
        public boolean mo28393s() {
            return this.f12460s;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: t */
        public int mo28392t() {
            return this.f12458q;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f12451j);
            parcel.writeFloat(this.f12452k);
            parcel.writeFloat(this.f12453l);
            parcel.writeInt(this.f12454m);
            parcel.writeFloat(this.f12455n);
            parcel.writeInt(this.f12456o);
            parcel.writeInt(this.f12457p);
            parcel.writeInt(this.f12458q);
            parcel.writeInt(this.f12459r);
            parcel.writeByte(this.f12460s ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public C4573a(C4573a c4573a) {
            super((ViewGroup.MarginLayoutParams) c4573a);
            this.f12451j = 1;
            this.f12452k = 0.0f;
            this.f12453l = 1.0f;
            this.f12454m = -1;
            this.f12455n = -1.0f;
            this.f12456o = -1;
            this.f12457p = -1;
            this.f12458q = 16777215;
            this.f12459r = 16777215;
            this.f12451j = c4573a.f12451j;
            this.f12452k = c4573a.f12452k;
            this.f12453l = c4573a.f12453l;
            this.f12454m = c4573a.f12454m;
            this.f12455n = c4573a.f12455n;
            this.f12456o = c4573a.f12456o;
            this.f12457p = c4573a.f12457p;
            this.f12458q = c4573a.f12458q;
            this.f12459r = c4573a.f12459r;
            this.f12460s = c4573a.f12460s;
        }

        public C4573a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12451j = 1;
            this.f12452k = 0.0f;
            this.f12453l = 1.0f;
            this.f12454m = -1;
            this.f12455n = -1.0f;
            this.f12456o = -1;
            this.f12457p = -1;
            this.f12458q = 16777215;
            this.f12459r = 16777215;
        }

        public C4573a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12451j = 1;
            this.f12452k = 0.0f;
            this.f12453l = 1.0f;
            this.f12454m = -1;
            this.f12455n = -1.0f;
            this.f12456o = -1;
            this.f12457p = -1;
            this.f12458q = 16777215;
            this.f12459r = 16777215;
        }

        protected C4573a(Parcel parcel) {
            super(0, 0);
            this.f12451j = 1;
            this.f12452k = 0.0f;
            this.f12453l = 1.0f;
            this.f12454m = -1;
            this.f12455n = -1.0f;
            this.f12456o = -1;
            this.f12457p = -1;
            this.f12458q = 16777215;
            this.f12459r = 16777215;
            this.f12451j = parcel.readInt();
            this.f12452k = parcel.readFloat();
            this.f12453l = parcel.readFloat();
            this.f12454m = parcel.readInt();
            this.f12455n = parcel.readFloat();
            this.f12456o = parcel.readInt();
            this.f12457p = parcel.readInt();
            this.f12458q = parcel.readInt();
            this.f12459r = parcel.readInt();
            this.f12460s = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
