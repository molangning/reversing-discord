package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C1365w0;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import p124h0.C6860c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: j */
    private ArrayList<View> f4040j;

    /* renamed from: k */
    private ArrayList<View> f4041k;

    /* renamed from: l */
    private View.OnApplyWindowInsetsListener f4042l;

    /* renamed from: m */
    private boolean f4043m;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m36532a(View view) {
        ArrayList<View> arrayList = this.f4041k;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f4040j == null) {
                this.f4040j = new ArrayList<>();
            }
            this.f4040j.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.m36491B0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.m36491B0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat m37213c0;
        WindowInsetsCompat m37722y = WindowInsetsCompat.m37722y(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4042l;
        if (onApplyWindowInsetsListener != null) {
            m37213c0 = WindowInsetsCompat.m37722y(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            m37213c0 = C1365w0.m37213c0(this, m37722y);
        }
        if (!m37213c0.m37729r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1365w0.m37206g(getChildAt(i), m37213c0);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f4043m && this.f4040j != null) {
            for (int i = 0; i < this.f4040j.size(); i++) {
                super.drawChild(canvas, this.f4040j.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (this.f4043m && (arrayList = this.f4040j) != null && arrayList.size() > 0 && this.f4040j.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f4041k;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f4040j;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f4043m = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m36532a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        if (z) {
            m36532a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m36532a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m36532a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m36532a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m36532a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m36532a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f4043m = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f4042l = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f4041k == null) {
                this.f4041k = new ArrayList<>();
            }
            this.f4041k.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.f4043m = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6860c.f19108h);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(C6860c.f19109i);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f4043m = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6860c.f19108h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C6860c.f19109i) : classAttribute;
        String string = obtainStyledAttributes.getString(C6860c.f19110j);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment m36417i0 = fragmentManager.m36417i0(id2);
        if (classAttribute != null && m36417i0 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment mo36294a = fragmentManager.m36387s0().mo36294a(context.getClassLoader(), classAttribute);
            mo36294a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.m36406m().m36347s(true).m36356d(this, mo36294a, string).mo36328j();
        }
        fragmentManager.m36449W0(this);
    }
}