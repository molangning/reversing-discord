package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.C0389g;
import androidx.core.view.C1304n2;
import androidx.core.view.C1365w0;
import p052d.C5706a;
import p052d.C5711f;
import p052d.C5712g;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ActionBarContextView extends AbstractC0471a {

    /* renamed from: A */
    private int f1454A;

    /* renamed from: B */
    private boolean f1455B;

    /* renamed from: C */
    private int f1456C;

    /* renamed from: r */
    private CharSequence f1457r;

    /* renamed from: s */
    private CharSequence f1458s;

    /* renamed from: t */
    private View f1459t;

    /* renamed from: u */
    private View f1460u;

    /* renamed from: v */
    private View f1461v;

    /* renamed from: w */
    private LinearLayout f1462w;

    /* renamed from: x */
    private TextView f1463x;

    /* renamed from: y */
    private TextView f1464y;

    /* renamed from: z */
    private int f1465z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnClickListenerC0417a implements View.OnClickListener {

        /* renamed from: j */
        final /* synthetic */ ActionMode f1466j;

        View$OnClickListenerC0417a(ActionMode actionMode) {
            this.f1466j = actionMode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1466j.mo40479c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m40271i() {
        int i;
        if (this.f1462w == null) {
            LayoutInflater.from(getContext()).inflate(C5712g.f16185a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1462w = linearLayout;
            this.f1463x = (TextView) linearLayout.findViewById(C5711f.f16164f);
            this.f1464y = (TextView) this.f1462w.findViewById(C5711f.f16163e);
            if (this.f1465z != 0) {
                this.f1463x.setTextAppearance(getContext(), this.f1465z);
            }
            if (this.f1454A != 0) {
                this.f1464y.setTextAppearance(getContext(), this.f1454A);
            }
        }
        this.f1463x.setText(this.f1457r);
        this.f1464y.setText(this.f1458s);
        boolean z = !TextUtils.isEmpty(this.f1457r);
        boolean z2 = !TextUtils.isEmpty(this.f1458s);
        TextView textView = this.f1464y;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f1462w;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f1462w.getParent() == null) {
            addView(this.f1462w);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0471a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C1304n2 mo40017f(int i, long j) {
        return super.mo40017f(i, j);
    }

    /* renamed from: g */
    public void m40273g() {
        if (this.f1459t == null) {
            m40269k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0471a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0471a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1458s;
    }

    public CharSequence getTitle() {
        return this.f1457r;
    }

    /* renamed from: h */
    public void m40272h(ActionMode actionMode) {
        View view = this.f1459t;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1456C, (ViewGroup) this, false);
            this.f1459t = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1459t);
        }
        View findViewById = this.f1459t.findViewById(C5711f.f16168j);
        this.f1460u = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC0417a(actionMode));
        C0389g c0389g = (C0389g) actionMode.mo40477e();
        C0483c c0483c = this.f1716m;
        if (c0483c != null) {
            c0483c.m39975y();
        }
        C0483c c0483c2 = new C0483c(getContext());
        this.f1716m = c0483c2;
        c0483c2.m39994J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0389g.m40368c(this.f1716m, this.f1714k);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1716m.mo39984o(this);
        this.f1715l = actionMenuView;
        C1365w0.m37177u0(actionMenuView, null);
        addView(this.f1715l, layoutParams);
    }

    /* renamed from: j */
    public boolean m40270j() {
        return this.f1455B;
    }

    /* renamed from: k */
    public void m40269k() {
        removeAllViews();
        this.f1461v = null;
        this.f1715l = null;
        this.f1716m = null;
        View view = this.f1460u;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m40268l() {
        C0483c c0483c = this.f1716m;
        if (c0483c != null) {
            return c0483c.m39993K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0483c c0483c = this.f1716m;
        if (c0483c != null) {
            c0483c.m40002B();
            this.f1716m.m40001C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0471a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean m39572b = C0616y1.m39572b(this);
        if (m39572b) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1459t;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1459t.getLayoutParams();
            if (m39572b) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (m39572b) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.rightMargin;
            }
            int m40019d = AbstractC0471a.m40019d(paddingLeft, i5, m39572b);
            paddingLeft = AbstractC0471a.m40019d(m40019d + m40018e(this.f1459t, m40019d, paddingTop, paddingTop2, m39572b), i6, m39572b);
        }
        int i7 = paddingLeft;
        LinearLayout linearLayout = this.f1462w;
        if (linearLayout != null && this.f1461v == null && linearLayout.getVisibility() != 8) {
            i7 += m40018e(this.f1462w, i7, paddingTop, paddingTop2, m39572b);
        }
        int i8 = i7;
        View view2 = this.f1461v;
        if (view2 != null) {
            m40018e(view2, i8, paddingTop, paddingTop2, m39572b);
        }
        if (m39572b) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f1715l;
        if (actionMenuView != null) {
            m40018e(actionMenuView, paddingRight, paddingTop, paddingTop2, !m39572b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i6 = this.f1717n;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                View view = this.f1459t;
                if (view != null) {
                    int m40020c = m40020c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1459t.getLayoutParams();
                    paddingLeft = m40020c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1715l;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = m40020c(this.f1715l, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f1462w;
                if (linearLayout != null && this.f1461v == null) {
                    if (this.f1455B) {
                        this.f1462w.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f1462w.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f1462w;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = m40020c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f1461v;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (i8 >= 0) {
                        paddingLeft = Math.min(i8, paddingLeft);
                    }
                    int i9 = layoutParams.height;
                    if (i9 == -2) {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        i7 = Math.min(i9, i7);
                    }
                    this.f1461v.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.f1717n <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i6);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.AbstractC0471a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0471a
    public void setContentHeight(int i) {
        this.f1717n = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1461v;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1461v = view;
        if (view != null && (linearLayout = this.f1462w) != null) {
            removeView(linearLayout);
            this.f1462w = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1458s = charSequence;
        m40271i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1457r = charSequence;
        m40271i();
        C1365w0.m37179t0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1455B) {
            requestLayout();
        }
        this.f1455B = z;
    }

    @Override // androidx.appcompat.widget.AbstractC0471a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16056j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, C5715j.f16465y, i, 0);
        C1365w0.m37177u0(this, m39780v.m39795g(C5715j.f16470z));
        this.f1465z = m39780v.m39788n(C5715j.f16238D, 0);
        this.f1454A = m39780v.m39788n(C5715j.f16233C, 0);
        this.f1717n = m39780v.m39789m(C5715j.f16228B, 0);
        this.f1456C = m39780v.m39788n(C5715j.f16223A, C5712g.f16188d);
        m39780v.m39779w();
    }
}
