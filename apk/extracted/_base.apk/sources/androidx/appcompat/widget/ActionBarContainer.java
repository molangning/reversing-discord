package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C1365w0;
import com.facebook.react.uimanager.ViewDefaults;
import p052d.C5711f;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: j */
    private boolean f1444j;

    /* renamed from: k */
    private View f1445k;

    /* renamed from: l */
    private View f1446l;

    /* renamed from: m */
    private View f1447m;

    /* renamed from: n */
    Drawable f1448n;

    /* renamed from: o */
    Drawable f1449o;

    /* renamed from: p */
    Drawable f1450p;

    /* renamed from: q */
    boolean f1451q;

    /* renamed from: r */
    boolean f1452r;

    /* renamed from: s */
    private int f1453s;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0416a {
        /* renamed from: a */
        public static void m40274a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1365w0.m37177u0(this, new C0479b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5715j.f16345a);
        this.f1448n = obtainStyledAttributes.getDrawable(C5715j.f16350b);
        this.f1449o = obtainStyledAttributes.getDrawable(C5715j.f16360d);
        this.f1453s = obtainStyledAttributes.getDimensionPixelSize(C5715j.f16390j, -1);
        boolean z = true;
        if (getId() == C5711f.f16150I) {
            this.f1451q = true;
            this.f1450p = obtainStyledAttributes.getDrawable(C5715j.f16355c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1451q ? this.f1448n != null || this.f1449o != null : this.f1450p != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m40276a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m40275b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1448n;
        if (drawable != null && drawable.isStateful()) {
            this.f1448n.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1449o;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1449o.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1450p;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1450p.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1445k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1448n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1449o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1450p;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1446l = findViewById(C5711f.f16159a);
        this.f1447m = findViewById(C5711f.f16165g);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1444j || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1445k;
        boolean z3 = true;
        boolean z4 = false;
        if (view != null && view.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1451q) {
            Drawable drawable2 = this.f1450p;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z3 = z4;
        } else {
            if (this.f1448n != null) {
                if (this.f1446l.getVisibility() == 0) {
                    this.f1448n.setBounds(this.f1446l.getLeft(), this.f1446l.getTop(), this.f1446l.getRight(), this.f1446l.getBottom());
                } else {
                    View view2 = this.f1447m;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f1448n.setBounds(this.f1447m.getLeft(), this.f1447m.getTop(), this.f1447m.getRight(), this.f1447m.getBottom());
                    } else {
                        this.f1448n.setBounds(0, 0, 0, 0);
                    }
                }
                z4 = true;
            }
            this.f1452r = z2;
            if (z2 && (drawable = this.f1449o) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z3 = z4;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1446l == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f1453s) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1446l == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f1445k;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            if (!m40275b(this.f1446l)) {
                i3 = m40276a(this.f1446l);
            } else if (!m40275b(this.f1447m)) {
                i3 = m40276a(this.f1447m);
            } else {
                i3 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                i4 = View.MeasureSpec.getSize(i2);
            } else {
                i4 = ViewDefaults.NUMBER_OF_LINES;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m40276a(this.f1445k), i4));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1448n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1448n);
        }
        this.f1448n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1446l;
            if (view != null) {
                this.f1448n.setBounds(view.getLeft(), this.f1446l.getTop(), this.f1446l.getRight(), this.f1446l.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1451q ? this.f1448n != null || this.f1449o != null : this.f1450p != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0416a.m40274a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1450p;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1450p);
        }
        this.f1450p = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1451q && (drawable2 = this.f1450p) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1451q ? !(this.f1448n != null || this.f1449o != null) : this.f1450p == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C0416a.m40274a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1449o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1449o);
        }
        this.f1449o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1452r && (drawable2 = this.f1449o) != null) {
                drawable2.setBounds(this.f1445k.getLeft(), this.f1445k.getTop(), this.f1445k.getRight(), this.f1445k.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1451q ? this.f1448n != null || this.f1449o != null : this.f1450p != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0416a.m40274a(this);
    }

    public void setTabContainer(C0514f1 c0514f1) {
        View view = this.f1445k;
        if (view != null) {
            removeView(view);
        }
        this.f1445k = c0514f1;
        if (c0514f1 != null) {
            addView(c0514f1);
            ViewGroup.LayoutParams layoutParams = c0514f1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0514f1.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f1444j = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1448n;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1449o;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1450p;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if ((drawable == this.f1448n && !this.f1451q) || ((drawable == this.f1449o && this.f1452r) || ((drawable == this.f1450p && this.f1451q) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }
}
