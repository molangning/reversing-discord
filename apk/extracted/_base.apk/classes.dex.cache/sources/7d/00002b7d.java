package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1336t;
import androidx.core.view.C1365w0;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import p411x.C13657a;

/* renamed from: com.google.android.material.appbar.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4751b extends C4752c<View> {

    /* renamed from: d */
    final Rect f13046d;

    /* renamed from: e */
    final Rect f13047e;

    /* renamed from: f */
    private int f13048f;

    /* renamed from: g */
    private int f13049g;

    public AbstractC4751b() {
        this.f13046d = new Rect();
        this.f13047e = new Rect();
        this.f13048f = 0;
    }

    /* renamed from: N */
    private static int m27857N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.google.android.material.appbar.C4752c
    /* renamed from: F */
    public void mo27853F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View mo27863H = mo27863H(coordinatorLayout.m39198l(view));
        if (mo27863H != null) {
            CoordinatorLayout.C0685f c0685f = (CoordinatorLayout.C0685f) view.getLayoutParams();
            Rect rect = this.f13046d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0685f).leftMargin, mo27863H.getBottom() + ((ViewGroup.MarginLayoutParams) c0685f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0685f).rightMargin, ((coordinatorLayout.getHeight() + mo27863H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0685f).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1365w0.m37170y(coordinatorLayout) && !C1365w0.m37170y(view)) {
                rect.left += lastWindowInsets.m37734m();
                rect.right -= lastWindowInsets.m37733n();
            }
            Rect rect2 = this.f13047e;
            C1336t.m37322a(m27857N(c0685f.f2973c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m27862I = m27862I(mo27863H);
            view.layout(rect2.left, rect2.top - m27862I, rect2.right, rect2.bottom - m27862I);
            this.f13048f = rect2.top - mo27863H.getBottom();
            return;
        }
        super.mo27853F(coordinatorLayout, view, i);
        this.f13048f = 0;
    }

    /* renamed from: H */
    abstract View mo27863H(List<View> list);

    /* renamed from: I */
    public final int m27862I(View view) {
        if (this.f13049g == 0) {
            return 0;
        }
        float mo27861J = mo27861J(view);
        int i = this.f13049g;
        return C13657a.m1915b((int) (mo27861J * i), 0, i);
    }

    /* renamed from: J */
    float mo27861J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int m27860K() {
        return this.f13049g;
    }

    /* renamed from: L */
    public int mo27859L(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: M */
    public final int m27858M() {
        return this.f13048f;
    }

    /* renamed from: O */
    public final void m27856O(int i) {
        this.f13049g = i;
    }

    /* renamed from: P */
    protected boolean m27855P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: m */
    public boolean mo27710m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo27863H;
        int i5;
        WindowInsetsCompat lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 == -1 || i6 == -2) && (mo27863H = mo27863H(coordinatorLayout.m39198l(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (C1365w0.m37170y(mo27863H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m37732o() + lastWindowInsets.m37735l();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int mo27859L = size + mo27859L(mo27863H);
            int measuredHeight = mo27863H.getMeasuredHeight();
            if (m27855P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                mo27859L -= measuredHeight;
            }
            if (i6 == -1) {
                i5 = 1073741824;
            } else {
                i5 = Integer.MIN_VALUE;
            }
            coordinatorLayout.m39224D(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo27859L, i5), i4);
            return true;
        }
        return false;
    }

    public AbstractC4751b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13046d = new Rect();
        this.f13047e = new Rect();
        this.f13048f = 0;
    }
}