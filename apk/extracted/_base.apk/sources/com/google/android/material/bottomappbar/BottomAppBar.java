package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import bb.C2232g;
import bb.C2236h;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C4911o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p020b0.AbstractC1964a;
import p155ia.C7479a;
import p155ia.C7482d;
import p155ia.C7488j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0681b {

    /* renamed from: y0 */
    private static final int f13083y0 = C7488j.f20272i;

    /* renamed from: g0 */
    private Integer f13084g0;

    /* renamed from: h0 */
    private final int f13085h0;

    /* renamed from: i0 */
    private final C2232g f13086i0;

    /* renamed from: j0 */
    private Animator f13087j0;

    /* renamed from: k0 */
    private Animator f13088k0;

    /* renamed from: l0 */
    private int f13089l0;

    /* renamed from: m0 */
    private int f13090m0;

    /* renamed from: n0 */
    private boolean f13091n0;

    /* renamed from: o0 */
    private int f13092o0;

    /* renamed from: p0 */
    private ArrayList<InterfaceC4768g> f13093p0;

    /* renamed from: q0 */
    private int f13094q0;

    /* renamed from: r0 */
    private boolean f13095r0;

    /* renamed from: s0 */
    private boolean f13096s0;

    /* renamed from: t0 */
    private Behavior f13097t0;

    /* renamed from: u0 */
    private int f13098u0;

    /* renamed from: v0 */
    private int f13099v0;

    /* renamed from: w0 */
    private int f13100w0;

    /* renamed from: x0 */
    AnimatorListenerAdapter f13101x0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4761a extends AnimatorListenerAdapter {
        C4761a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m27795o0();
            BottomAppBar.this.f13087j0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m27794p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4762b extends FloatingActionButton.AbstractC4864b {

        /* renamed from: a */
        final /* synthetic */ int f13108a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4763a extends FloatingActionButton.AbstractC4864b {
            C4763a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC4864b
            /* renamed from: b */
            public void mo27153b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m27795o0();
            }
        }

        C4762b(int i) {
            this.f13108a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC4864b
        /* renamed from: a */
        public void mo27154a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m27790t0(this.f13108a));
            floatingActionButton.m27166s(new C4763a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4764c extends AnimatorListenerAdapter {
        C4764c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m27795o0();
            BottomAppBar.this.f13095r0 = false;
            BottomAppBar.this.f13088k0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m27794p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4765d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f13112a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f13113b;

        /* renamed from: c */
        final /* synthetic */ int f13114c;

        /* renamed from: d */
        final /* synthetic */ boolean f13115d;

        C4765d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f13113b = actionMenuView;
            this.f13114c = i;
            this.f13115d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13112a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z;
            if (!this.f13112a) {
                if (BottomAppBar.this.f13094q0 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m27785y0(bottomAppBar.f13094q0);
                BottomAppBar.this.m27818E0(this.f13113b, this.f13114c, this.f13115d, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC4766e implements Runnable {

        /* renamed from: j */
        final /* synthetic */ ActionMenuView f13117j;

        /* renamed from: k */
        final /* synthetic */ int f13118k;

        /* renamed from: l */
        final /* synthetic */ boolean f13119l;

        RunnableC4766e(ActionMenuView actionMenuView, int i, boolean z) {
            this.f13117j = actionMenuView;
            this.f13118k = i;
            this.f13119l = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f13117j;
            actionMenuView.setTranslationX(BottomAppBar.this.m27791s0(actionMenuView, this.f13118k, this.f13119l));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4767f extends AnimatorListenerAdapter {
        C4767f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f13101x0.onAnimationStart(animator);
            FloatingActionButton m27793q0 = BottomAppBar.this.m27793q0();
            if (m27793q0 != null) {
                m27793q0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4768g {
        /* renamed from: a */
        void m27778a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m27777b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4769h extends AbstractC1964a {
        public static final Parcelable.Creator<C4769h> CREATOR = new C4770a();

        /* renamed from: l */
        int f13122l;

        /* renamed from: m */
        boolean f13123m;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4770a implements Parcelable.ClassLoaderCreator<C4769h> {
            C4770a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4769h createFromParcel(Parcel parcel) {
                return new C4769h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4769h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4769h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4769h[] newArray(int i) {
                return new C4769h[i];
            }
        }

        public C4769h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13122l);
            parcel.writeInt(this.f13123m ? 1 : 0);
        }

        public C4769h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13122l = parcel.readInt();
            this.f13123m = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public void m27822A0() {
        float f;
        getTopEdgeTreatment().m27762q(getFabTranslationX());
        View m27792r0 = m27792r0();
        C2232g c2232g = this.f13086i0;
        if (this.f13096s0 && m27789u0()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        c2232g.m33918Z(f);
        if (m27792r0 != null) {
            m27792r0.setTranslationY(getFabTranslationY());
            m27792r0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: D0 */
    private void m27819D0(ActionMenuView actionMenuView, int i, boolean z) {
        m27818E0(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public void m27818E0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC4766e runnableC4766e = new RunnableC4766e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC4766e);
        } else {
            runnableC4766e.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f13098u0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m27790t0(this.f13089l0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m27772d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f13100w0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f13099v0;
    }

    private C4771a getTopEdgeTreatment() {
        return (C4771a) this.f13086i0.m33939E().m33859p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m27800j0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m27180e(this.f13101x0);
        floatingActionButton.m27179f(new C4767f());
        floatingActionButton.m27178g(null);
    }

    /* renamed from: k0 */
    private void m27799k0() {
        Animator animator = this.f13088k0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f13087j0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: m0 */
    private void m27797m0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m27793q0(), "translationX", m27790t0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: n0 */
    private void m27796n0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m27791s0(actionMenuView, i, z)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new C4765d(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m27795o0() {
        ArrayList<InterfaceC4768g> arrayList;
        int i = this.f13092o0 - 1;
        this.f13092o0 = i;
        if (i == 0 && (arrayList = this.f13093p0) != null) {
            Iterator<InterfaceC4768g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m27778a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public void m27794p0() {
        ArrayList<InterfaceC4768g> arrayList;
        int i = this.f13092o0;
        this.f13092o0 = i + 1;
        if (i == 0 && (arrayList = this.f13093p0) != null) {
            Iterator<InterfaceC4768g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m27777b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public FloatingActionButton m27793q0() {
        View m27792r0 = m27792r0();
        if (m27792r0 instanceof FloatingActionButton) {
            return (FloatingActionButton) m27792r0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m27792r0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m39197m(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m27792r0():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public float m27790t0(int i) {
        int i2;
        boolean m26933e = C4911o.m26933e(this);
        int i3 = 1;
        if (i == 1) {
            if (m26933e) {
                i2 = this.f13100w0;
            } else {
                i2 = this.f13099v0;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - (this.f13085h0 + i2);
            if (m26933e) {
                i3 = -1;
            }
            return measuredWidth * i3;
        }
        return 0.0f;
    }

    /* renamed from: u0 */
    private boolean m27789u0() {
        FloatingActionButton m27793q0 = m27793q0();
        if (m27793q0 != null && m27793q0.m27170o()) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    private void m27788v0(int i, boolean z) {
        if (!C1365w0.m37224U(this)) {
            this.f13095r0 = false;
            m27785y0(this.f13094q0);
            return;
        }
        Animator animator = this.f13088k0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m27789u0()) {
            i = 0;
            z = false;
        }
        m27796n0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f13088k0 = animatorSet;
        animatorSet.addListener(new C4764c());
        this.f13088k0.start();
    }

    /* renamed from: w0 */
    private void m27787w0(int i) {
        if (this.f13089l0 != i && C1365w0.m37224U(this)) {
            Animator animator = this.f13087j0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f13090m0 == 1) {
                m27797m0(i, arrayList);
            } else {
                m27798l0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f13087j0 = animatorSet;
            animatorSet.addListener(new C4761a());
            this.f13087j0.start();
        }
    }

    /* renamed from: x0 */
    private Drawable m27786x0(Drawable drawable) {
        if (drawable != null && this.f13084g0 != null) {
            Drawable m38080r = C1013a.m38080r(drawable.mutate());
            C1013a.m38084n(m38080r, this.f13084g0.intValue());
            return m38080r;
        }
        return drawable;
    }

    /* renamed from: z0 */
    private void m27784z0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f13088k0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m27789u0()) {
                m27819D0(actionMenuView, 0, false);
            } else {
                m27819D0(actionMenuView, this.f13089l0, this.f13096s0);
            }
        }
    }

    /* renamed from: B0 */
    public void m27821B0(int i, int i2) {
        this.f13094q0 = i2;
        this.f13095r0 = true;
        m27788v0(i, this.f13096s0);
        m27787w0(i);
        this.f13089l0 = i;
    }

    /* renamed from: C0 */
    boolean m27820C0(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().m27768j()) {
            getTopEdgeTreatment().m27763p(f);
            this.f13086i0.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.f13086i0.m33937G();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m27772d();
    }

    public int getFabAlignmentMode() {
        return this.f13089l0;
    }

    public int getFabAnimationMode() {
        return this.f13090m0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m27770f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m27769g();
    }

    public boolean getHideOnScroll() {
        return this.f13091n0;
    }

    /* renamed from: l0 */
    protected void m27798l0(int i, List<Animator> list) {
        FloatingActionButton m27793q0 = m27793q0();
        if (m27793q0 != null && !m27793q0.m27171n()) {
            m27794p0();
            m27793q0.m27173l(new C4762b(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2236h.m33877f(this, this.f13086i0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m27799k0();
            m27822A0();
        }
        m27784z0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4769h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4769h c4769h = (C4769h) parcelable;
        super.onRestoreInstanceState(c4769h.m34884a());
        this.f13089l0 = c4769h.f13122l;
        this.f13096s0 = c4769h.f13123m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        C4769h c4769h = new C4769h(super.onSaveInstanceState());
        c4769h.f13122l = this.f13089l0;
        c4769h.f13123m = this.f13096s0;
        return c4769h;
    }

    /* renamed from: s0 */
    protected int m27791s0(ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int left;
        int i3;
        boolean z2;
        if (i != 1 || !z) {
            return 0;
        }
        boolean m26933e = C4911o.m26933e(this);
        if (m26933e) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0466g) && (((Toolbar.C0466g) childAt.getLayoutParams()).f822a & 8388615) == 8388611) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m26933e) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (m26933e) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (m26933e) {
            i3 = this.f13099v0;
        } else {
            i3 = -this.f13100w0;
        }
        return i2 - (left + i3);
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C1013a.m38083o(this.f13086i0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m27767k(f);
            this.f13086i0.invalidateSelf();
            m27822A0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f13086i0.m33920X(f);
        getBehavior().m27839I(this, this.f13086i0.m33940D() - this.f13086i0.m33941C());
    }

    public void setFabAlignmentMode(int i) {
        m27821B0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f13090m0 = i;
    }

    void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().m27771e()) {
            getTopEdgeTreatment().m27766l(f);
            this.f13086i0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m27765m(f);
            this.f13086i0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m27764n(f);
            this.f13086i0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f13091n0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m27786x0(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f13084g0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: y0 */
    public void m27785y0(int i) {
        if (i != 0) {
            this.f13094q0 = 0;
            getMenu().clear();
            m40038x(i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0681b
    public Behavior getBehavior() {
        if (this.f13097t0 == null) {
            this.f13097t0 = new Behavior();
        }
        return this.f13097t0;
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f13102e;

        /* renamed from: f */
        private WeakReference<BottomAppBar> f13103f;

        /* renamed from: g */
        private int f13104g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f13105h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class View$OnLayoutChangeListenerC4760a implements View.OnLayoutChangeListener {
            View$OnLayoutChangeListenerC4760a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f13103f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.m27175j(Behavior.this.f13102e);
                    int height = Behavior.this.f13102e.height();
                    bottomAppBar.m27820C0(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().m33857r().mo33876a(new RectF(Behavior.this.f13102e)));
                    CoordinatorLayout.C0685f c0685f = (CoordinatorLayout.C0685f) view.getLayoutParams();
                    if (Behavior.this.f13104g == 0) {
                        ((ViewGroup.MarginLayoutParams) c0685f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C7482d.f20176y) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) c0685f).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) c0685f).rightMargin = bottomAppBar.getRightInset();
                        if (C4911o.m26933e(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) c0685f).leftMargin += bottomAppBar.f13085h0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0685f).rightMargin += bottomAppBar.f13085h0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f13105h = new View$OnLayoutChangeListenerC4760a();
            this.f13102e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: Q */
        public boolean mo26481l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f13103f = new WeakReference<>(bottomAppBar);
            View m27792r0 = bottomAppBar.m27792r0();
            if (m27792r0 != null && !C1365w0.m37224U(m27792r0)) {
                CoordinatorLayout.C0685f c0685f = (CoordinatorLayout.C0685f) m27792r0.getLayoutParams();
                c0685f.f2974d = 49;
                this.f13104g = ((ViewGroup.MarginLayoutParams) c0685f).bottomMargin;
                if (m27792r0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m27792r0;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C7479a.f20083b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C7479a.f20082a);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f13105h);
                    bottomAppBar.m27800j0(floatingActionButton);
                }
                bottomAppBar.m27822A0();
            }
            coordinatorLayout.m39225C(bottomAppBar, i);
            return super.mo26481l(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: R */
        public boolean mo27761A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            if (bottomAppBar.getHideOnScroll() && super.mo27761A(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13105h = new View$OnLayoutChangeListenerC4760a();
            this.f13102e = new Rect();
        }
    }
}
