package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.util.C1134c;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1309o0;
import androidx.core.view.InterfaceC1324r0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import bb.C2232g;
import bb.C2236h;
import java.lang.ref.WeakReference;
import java.util.List;
import p020b0.AbstractC1964a;
import p071e.C6029a;
import p155ia.C7480b;
import p155ia.C7482d;
import p155ia.C7485g;
import p155ia.C7488j;
import p155ia.C7489k;
import p176ja.C8878a;
import p411x.C13657a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0681b {

    /* renamed from: C */
    private static final int f12978C = C7488j.f20267d;

    /* renamed from: A */
    private Drawable f12979A;

    /* renamed from: B */
    private Behavior f12980B;

    /* renamed from: j */
    private int f12981j;

    /* renamed from: k */
    private int f12982k;

    /* renamed from: l */
    private int f12983l;

    /* renamed from: m */
    private int f12984m;

    /* renamed from: n */
    private boolean f12985n;

    /* renamed from: o */
    private int f12986o;

    /* renamed from: p */
    private WindowInsetsCompat f12987p;

    /* renamed from: q */
    private List<InterfaceC4744c> f12988q;

    /* renamed from: r */
    private boolean f12989r;

    /* renamed from: s */
    private boolean f12990s;

    /* renamed from: t */
    private boolean f12991t;

    /* renamed from: u */
    private boolean f12992u;

    /* renamed from: v */
    private int f12993v;

    /* renamed from: w */
    private WeakReference<View> f12994w;

    /* renamed from: x */
    private ValueAnimator f12995x;

    /* renamed from: y */
    private final List<InterfaceC4748g> f12996y;

    /* renamed from: z */
    private int[] f12997z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC4749a<T> {

        /* renamed from: k */
        private int f12998k;

        /* renamed from: l */
        private int f12999l;

        /* renamed from: m */
        private ValueAnimator f13000m;

        /* renamed from: n */
        private C4740e f13001n;

        /* renamed from: o */
        private WeakReference<View> f13002o;

        /* renamed from: p */
        private boolean f13003p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C4736a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f13004a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f13005b;

            C4736a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f13004a = coordinatorLayout;
                this.f13005b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m27865P(this.f13004a, this.f13005b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C4737b extends C1170a {
            C4737b() {
            }

            @Override // androidx.core.view.C1170a
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.m37638D0(BaseBehavior.this.f13003p);
                accessibilityNodeInfoCompat.m37590g0(ScrollView.class.getName());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C4738c implements AccessibilityViewCommand {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f13008a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f13009b;

            /* renamed from: c */
            final /* synthetic */ View f13010c;

            /* renamed from: d */
            final /* synthetic */ int f13011d;

            C4738c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f13008a = coordinatorLayout;
                this.f13009b = appBarLayout;
                this.f13010c = view;
                this.f13011d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            /* renamed from: a */
            public boolean mo27682a(View view, AccessibilityViewCommand.AbstractC1186a abstractC1186a) {
                BaseBehavior.this.mo27704q(this.f13008a, this.f13009b, this.f13010c, 0, this.f13011d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C4739d implements AccessibilityViewCommand {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f13013a;

            /* renamed from: b */
            final /* synthetic */ boolean f13014b;

            C4739d(AppBarLayout appBarLayout, boolean z) {
                this.f13013a = appBarLayout;
                this.f13014b = z;
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            /* renamed from: a */
            public boolean mo27682a(View view, AccessibilityViewCommand.AbstractC1186a abstractC1186a) {
                this.f13013a.setExpanded(this.f13014b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: T */
        private boolean m27931T(CoordinatorLayout coordinatorLayout, T t, View view) {
            boolean z = false;
            if (mo27868M() != (-t.getTotalScrollRange())) {
                m27930U(coordinatorLayout, t, AccessibilityNodeInfoCompat.C1178a.f3618q, false);
                z = true;
            }
            if (mo27868M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C1365w0.m37193m0(coordinatorLayout, AccessibilityNodeInfoCompat.C1178a.f3619r, null, new C4738c(coordinatorLayout, t, view, i));
                        return true;
                    }
                } else {
                    m27930U(coordinatorLayout, t, AccessibilityNodeInfoCompat.C1178a.f3619r, true);
                    return true;
                }
            }
            return z;
        }

        /* renamed from: U */
        private void m27930U(CoordinatorLayout coordinatorLayout, T t, AccessibilityNodeInfoCompat.C1178a c1178a, boolean z) {
            C1365w0.m37193m0(coordinatorLayout, c1178a, null, new C4739d(t, z));
        }

        /* renamed from: V */
        private void m27929V(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int height;
            int abs = Math.abs(mo27868M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            m27928W(coordinatorLayout, t, i, height);
        }

        /* renamed from: W */
        private void m27928W(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int mo27868M = mo27868M();
            if (mo27868M == i) {
                ValueAnimator valueAnimator = this.f13000m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f13000m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f13000m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f13000m = valueAnimator3;
                valueAnimator3.setInterpolator(C8878a.f23264e);
                this.f13000m.addUpdateListener(new C4736a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f13000m.setDuration(Math.min(i2, 600));
            this.f13000m.setIntValues(mo27868M, i);
            this.f13000m.start();
        }

        /* renamed from: X */
        private int m27927X(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        /* renamed from: Z */
        private boolean m27925Z(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (t.m27949j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: a0 */
        private static boolean m27924a0(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: b0 */
        private boolean m27923b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((C4747f) appBarLayout.getChildAt(i).getLayoutParams()).f13026a != 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c0 */
        private View m27922c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC1309o0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: d0 */
        private static View m27921d0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: e0 */
        private int m27920e0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C4747f c4747f = (C4747f) childAt.getLayoutParams();
                if (m27924a0(c4747f.m27885c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c4747f).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c4747f).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: f0 */
        private View m27919f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C0685f) childAt.getLayoutParams()).m39166f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: i0 */
        private int m27916i0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C4747f c4747f = (C4747f) childAt.getLayoutParams();
                Interpolator m27884d = c4747f.m27884d();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (m27884d != null) {
                        int m27885c = c4747f.m27885c();
                        if ((m27885c & 1) != 0) {
                            i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c4747f).topMargin + ((LinearLayout.LayoutParams) c4747f).bottomMargin;
                            if ((m27885c & 2) != 0) {
                                i2 -= C1365w0.m37256C(childAt);
                            }
                        }
                        if (C1365w0.m37170y(childAt)) {
                            i2 -= t.getTopInset();
                        }
                        if (i2 > 0) {
                            float f = i2;
                            return Integer.signum(i) * (childAt.getTop() + Math.round(f * m27884d.getInterpolation((abs - childAt.getTop()) / f)));
                        }
                    }
                } else {
                    i3++;
                }
            }
            return i;
        }

        /* renamed from: v0 */
        private boolean m27911v0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m39197m = coordinatorLayout.m39197m(t);
            int size = m39197m.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0682c m39166f = ((CoordinatorLayout.C0685f) m39197m.get(i).getLayoutParams()).m39166f();
                if (m39166f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) m39166f).m27860K() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: w0 */
        private void m27910w0(CoordinatorLayout coordinatorLayout, T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int mo27868M = mo27868M() - topInset;
            int m27920e0 = m27920e0(t, mo27868M);
            if (m27920e0 >= 0) {
                View childAt = t.getChildAt(m27920e0);
                C4747f c4747f = (C4747f) childAt.getLayoutParams();
                int m27885c = c4747f.m27885c();
                if ((m27885c & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m27920e0 == 0 && C1365w0.m37170y(t) && C1365w0.m37170y(childAt)) {
                        i -= t.getTopInset();
                    }
                    if (m27924a0(m27885c, 2)) {
                        i2 += C1365w0.m37256C(childAt);
                    } else if (m27924a0(m27885c, 5)) {
                        int m37256C = C1365w0.m37256C(childAt) + i2;
                        if (mo27868M < m37256C) {
                            i = m37256C;
                        } else {
                            i2 = m37256C;
                        }
                    }
                    if (m27924a0(m27885c, 32)) {
                        i += ((LinearLayout.LayoutParams) c4747f).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) c4747f).bottomMargin;
                    }
                    m27929V(coordinatorLayout, t, C13657a.m1915b(m27927X(mo27868M, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: x0 */
        private void m27909x0(CoordinatorLayout coordinatorLayout, T t) {
            View m27919f0;
            C1365w0.m37197k0(coordinatorLayout, AccessibilityNodeInfoCompat.C1178a.f3618q.m37550b());
            C1365w0.m37197k0(coordinatorLayout, AccessibilityNodeInfoCompat.C1178a.f3619r.m37550b());
            if (t.getTotalScrollRange() == 0 || (m27919f0 = m27919f0(coordinatorLayout)) == null || !m27923b0(t)) {
                return;
            }
            if (!C1365w0.m37232O(coordinatorLayout)) {
                C1365w0.m37185q0(coordinatorLayout, new C4737b());
            }
            this.f13003p = m27931T(coordinatorLayout, t, m27919f0);
        }

        /* renamed from: y0 */
        private void m27908y0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View m27921d0 = m27921d0(t, i);
            boolean z2 = false;
            if (m27921d0 != null) {
                int m27885c = ((C4747f) m27921d0.getLayoutParams()).m27885c();
                if ((m27885c & 1) != 0) {
                    int m37256C = C1365w0.m37256C(m27921d0);
                    if (i2 <= 0 || (m27885c & 12) == 0 ? !((m27885c & 2) == 0 || (-i) < (m27921d0.getBottom() - m37256C) - t.getTopInset()) : (-i) >= (m27921d0.getBottom() - m37256C) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.m27947l()) {
                z2 = t.m27937v(m27922c0(coordinatorLayout));
            }
            boolean m27940s = t.m27940s(z2);
            if (z || (m27940s && m27911v0(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.AbstractC4749a
        /* renamed from: M */
        int mo27868M() {
            return mo27854E() + this.f12998k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4749a
        /* renamed from: Y */
        public boolean mo27873H(T t) {
            WeakReference<View> weakReference = this.f13002o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4749a
        /* renamed from: g0 */
        public int mo27870K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4749a
        /* renamed from: h0 */
        public int mo27869L(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4749a
        /* renamed from: j0 */
        public void mo27867N(CoordinatorLayout coordinatorLayout, T t) {
            m27910w0(coordinatorLayout, t);
            if (t.m27947l()) {
                t.m27940s(t.m27937v(m27922c0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.C4752c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: k0 */
        public boolean mo26481l(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean z;
            int round;
            boolean mo26481l = super.mo26481l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            C4740e c4740e = this.f13001n;
            if (c4740e != null && (pendingAction & 8) == 0) {
                if (c4740e.f13016l) {
                    m27865P(coordinatorLayout, t, -t.getTotalScrollRange());
                } else if (c4740e.f13017m) {
                    m27865P(coordinatorLayout, t, 0);
                } else {
                    View childAt = t.getChildAt(c4740e.f13018n);
                    int i2 = -childAt.getBottom();
                    if (this.f13001n.f13020p) {
                        round = C1365w0.m37256C(childAt) + t.getTopInset();
                    } else {
                        round = Math.round(childAt.getHeight() * this.f13001n.f13019o);
                    }
                    m27865P(coordinatorLayout, t, i2 + round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m27929V(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        m27865P(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m27929V(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        m27865P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m27944o();
            this.f13001n = null;
            mo27852G(C13657a.m1915b(mo27854E(), -t.getTotalScrollRange(), 0));
            m27908y0(coordinatorLayout, t, mo27854E(), 0, true);
            t.m27946m(mo27854E());
            m27909x0(coordinatorLayout, t);
            return mo26481l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: l0 */
        public boolean mo27710m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0685f) t.getLayoutParams())).height == -2) {
                coordinatorLayout.m39224D(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.mo27710m(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: m0 */
        public void mo27704q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = m27866O(coordinatorLayout, t, i2, i6, i7);
                }
            }
            if (t.m27947l()) {
                t.m27940s(t.m27937v(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: n0 */
        public void mo27700t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m27866O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m27909x0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: o0 */
        public void mo27695x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C4740e) {
                m27914s0((C4740e) parcelable, true);
                super.mo27695x(coordinatorLayout, t, this.f13001n.m34884a());
                return;
            }
            super.mo27695x(coordinatorLayout, t, parcelable);
            this.f13001n = null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: p0 */
        public Parcelable mo27693y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable mo27693y = super.mo27693y(coordinatorLayout, t);
            C4740e m27913t0 = m27913t0(mo27693y, t);
            if (m27913t0 != null) {
                return m27913t0;
            }
            return mo27693y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: q0 */
        public boolean mo27761A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) != 0 && (t.m27947l() || m27925Z(coordinatorLayout, t, view))) {
                z = true;
            } else {
                z = false;
            }
            if (z && (valueAnimator = this.f13000m) != null) {
                valueAnimator.cancel();
            }
            this.f13002o = null;
            this.f12999l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: r0 */
        public void mo27758C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f12999l == 0 || i == 1) {
                m27910w0(coordinatorLayout, t);
                if (t.m27947l()) {
                    t.m27940s(t.m27937v(view));
                }
            }
            this.f13002o = new WeakReference<>(view);
        }

        /* renamed from: s0 */
        void m27914s0(C4740e c4740e, boolean z) {
            if (this.f13001n == null || z) {
                this.f13001n = c4740e;
            }
        }

        /* renamed from: t0 */
        C4740e m27913t0(Parcelable parcelable, T t) {
            boolean z;
            boolean z2;
            int mo27854E = mo27854E();
            int childCount = t.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + mo27854E;
                if (childAt.getTop() + mo27854E <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC1964a.f5409k;
                    }
                    C4740e c4740e = new C4740e(parcelable);
                    if (mo27854E == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c4740e.f13017m = z;
                    if (!z && (-mo27854E) >= t.getTotalScrollRange()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c4740e.f13016l = z2;
                    c4740e.f13018n = i;
                    if (bottom == C1365w0.m37256C(childAt) + t.getTopInset()) {
                        z3 = true;
                    }
                    c4740e.f13020p = z3;
                    c4740e.f13019o = bottom / childAt.getHeight();
                    return c4740e;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4749a
        /* renamed from: u0 */
        public int mo27864Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int i4;
            int mo27868M = mo27868M();
            int i5 = 0;
            if (i2 != 0 && mo27868M >= i2 && mo27868M <= i3) {
                int m1915b = C13657a.m1915b(i, i2, i3);
                if (mo27868M != m1915b) {
                    if (t.m27951h()) {
                        i4 = m27916i0(t, m1915b);
                    } else {
                        i4 = m1915b;
                    }
                    boolean mo27852G = mo27852G(i4);
                    int i6 = mo27868M - m1915b;
                    this.f12998k = m1915b - i4;
                    int i7 = 1;
                    if (mo27852G) {
                        while (i5 < t.getChildCount()) {
                            C4747f c4747f = (C4747f) t.getChildAt(i5).getLayoutParams();
                            AbstractC4745d m27886b = c4747f.m27886b();
                            if (m27886b != null && (c4747f.m27885c() & 1) != 0) {
                                m27886b.mo27889a(t, t.getChildAt(i5), mo27854E());
                            }
                            i5++;
                        }
                    }
                    if (!mo27852G && t.m27951h()) {
                        coordinatorLayout.m39204f(t);
                    }
                    t.m27946m(mo27854E());
                    if (m1915b < mo27868M) {
                        i7 = -1;
                    }
                    m27908y0(coordinatorLayout, t, m1915b, i7, false);
                    i5 = i6;
                }
            } else {
                this.f12998k = 0;
            }
            m27909x0(coordinatorLayout, t);
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static class C4740e extends AbstractC1964a {
            public static final Parcelable.Creator<C4740e> CREATOR = new C4741a();

            /* renamed from: l */
            boolean f13016l;

            /* renamed from: m */
            boolean f13017m;

            /* renamed from: n */
            int f13018n;

            /* renamed from: o */
            float f13019o;

            /* renamed from: p */
            boolean f13020p;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
            class C4741a implements Parcelable.ClassLoaderCreator<C4740e> {
                C4741a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public C4740e createFromParcel(Parcel parcel) {
                    return new C4740e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public C4740e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C4740e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public C4740e[] newArray(int i) {
                    return new C4740e[i];
                }
            }

            public C4740e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f13016l = parcel.readByte() != 0;
                this.f13017m = parcel.readByte() != 0;
                this.f13018n = parcel.readInt();
                this.f13019o = parcel.readFloat();
                this.f13020p = parcel.readByte() != 0;
            }

            @Override // p020b0.AbstractC1964a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f13016l ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f13017m ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f13018n);
                parcel.writeFloat(this.f13019o);
                parcel.writeByte(this.f13020p ? (byte) 1 : (byte) 0);
            }

            public C4740e(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AbstractC4749a, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: D */
        public /* bridge */ /* synthetic */ boolean mo26457D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo26457D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.C4752c
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo27854E() {
            return super.mo27854E();
        }

        @Override // com.google.android.material.appbar.C4752c
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo27852G(int i) {
            return super.mo27852G(i);
        }

        @Override // com.google.android.material.appbar.AbstractC4749a, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: k */
        public /* bridge */ /* synthetic */ boolean mo26796k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo26796k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean mo27904k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo26481l(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean mo27903l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo27710m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ void mo27902m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo27704q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo27901n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo27700t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ void mo27900o0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo27695x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable mo27899p0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo27693y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean mo27898q0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo27761A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void mo27897r0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo27758C(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class ScrollingViewBehavior extends AbstractC4751b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m27895R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0682c m39166f = ((CoordinatorLayout.C0685f) appBarLayout.getLayoutParams()).m39166f();
            if (m39166f instanceof BaseBehavior) {
                return ((BaseBehavior) m39166f).mo27868M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m27894S(View view, View view2) {
            CoordinatorLayout.AbstractC0682c m39166f = ((CoordinatorLayout.C0685f) view2.getLayoutParams()).m39166f();
            if (m39166f instanceof BaseBehavior) {
                C1365w0.m37215b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m39166f).f12998k) + m27858M()) - m27862I(view2));
            }
        }

        /* renamed from: T */
        private void m27893T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m27947l()) {
                    appBarLayout.m27940s(appBarLayout.m27937v(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC4751b
        /* renamed from: J */
        float mo27861J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m27895R = m27895R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m27895R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m27895R / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC4751b
        /* renamed from: L */
        int mo27859L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo27859L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC4751b
        /* renamed from: Q */
        public AppBarLayout mo27863H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: e */
        public boolean mo26454e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: h */
        public boolean mo26482h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m27894S(view, view2);
            m27893T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: i */
        public void mo27892i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C1365w0.m37197k0(coordinatorLayout, AccessibilityNodeInfoCompat.C1178a.f3618q.m37550b());
                C1365w0.m37197k0(coordinatorLayout, AccessibilityNodeInfoCompat.C1178a.f3619r.m37550b());
                C1365w0.m37185q0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.C4752c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo26481l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo26481l(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AbstractC4751b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo27710m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo27710m(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: w */
        public boolean mo27891w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo27863H = mo27863H(coordinatorLayout.m39198l(view));
            if (mo27863H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f13046d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo27863H.m27943p(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20671w4);
            m27856O(obtainStyledAttributes.getDimensionPixelSize(C7489k.f20679x4, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4742a implements InterfaceC1324r0 {
        C4742a() {
        }

        @Override // androidx.core.view.InterfaceC1324r0
        /* renamed from: a */
        public WindowInsetsCompat mo24794a(View view, WindowInsetsCompat windowInsetsCompat) {
            return AppBarLayout.this.m27945n(windowInsetsCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4743b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C2232g f13022a;

        C4743b(C2232g c2232g) {
            this.f13022a = c2232g;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f13022a.m33920X(floatValue);
            if (AppBarLayout.this.f12979A instanceof C2232g) {
                ((C2232g) AppBarLayout.this.f12979A).m33920X(floatValue);
            }
            for (InterfaceC4748g interfaceC4748g : AppBarLayout.this.f12996y) {
                interfaceC4748g.m27880a(floatValue, this.f13022a.m33943A());
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4744c<T extends AppBarLayout> {
        /* renamed from: a */
        void m27890a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC4745d {
        /* renamed from: a */
        public abstract void mo27889a(AppBarLayout appBarLayout, View view, float f);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4746e extends AbstractC4745d {

        /* renamed from: a */
        private final Rect f13024a = new Rect();

        /* renamed from: b */
        private final Rect f13025b = new Rect();

        /* renamed from: b */
        private static void m27888b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC4745d
        /* renamed from: a */
        public void mo27889a(AppBarLayout appBarLayout, View view, float f) {
            m27888b(this.f13024a, appBarLayout, view);
            float abs = this.f13024a.top - Math.abs(f);
            if (abs <= 0.0f) {
                float m1916a = 1.0f - C13657a.m1916a(Math.abs(abs / this.f13024a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.f13024a.height() * 0.3f) * (1.0f - (m1916a * m1916a)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f13025b);
                this.f13025b.offset(0, (int) (-height));
                C1365w0.m37171x0(view, this.f13025b);
                return;
            }
            C1365w0.m37171x0(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4748g {
        /* renamed from: a */
        void m27880a(float f, int i);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m27956c() {
        WeakReference<View> weakReference = this.f12994w;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12994w = null;
    }

    /* renamed from: d */
    private View m27955d(View view) {
        int i;
        View view2;
        if (this.f12994w == null && (i = this.f12993v) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f12993v);
            }
            if (view2 != null) {
                this.f12994w = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f12994w;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: i */
    private boolean m27950i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C4747f) getChildAt(i).getLayoutParams()).m27883e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m27948k() {
        BaseBehavior.C4740e c4740e;
        Behavior behavior = this.f12980B;
        if (behavior != null && this.f12982k != -1 && this.f12986o == 0) {
            c4740e = behavior.m27913t0(AbstractC1964a.f5409k, this);
        } else {
            c4740e = null;
        }
        this.f12982k = -1;
        this.f12983l = -1;
        this.f12984m = -1;
        if (c4740e != null) {
            this.f12980B.m27914s0(c4740e, false);
        }
    }

    /* renamed from: q */
    private void m27942q(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f12986o = i4 | i3;
        requestLayout();
    }

    /* renamed from: r */
    private boolean m27941r(boolean z) {
        if (this.f12990s != z) {
            this.f12990s = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private boolean m27938u() {
        return this.f12979A != null && getTopInset() > 0;
    }

    /* renamed from: w */
    private boolean m27936w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C1365w0.m37170y(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    private void m27935x(C2232g c2232g, boolean z) {
        float f;
        float dimension = getResources().getDimension(C7482d.f20152a);
        if (z) {
            f = 0.0f;
        } else {
            f = dimension;
        }
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f12995x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.f12995x = ofFloat;
        ofFloat.setDuration(getResources().getInteger(C7485g.f20227a));
        this.f12995x.setInterpolator(C8878a.f23260a);
        this.f12995x.addUpdateListener(new C4743b(c2232g));
        this.f12995x.start();
    }

    /* renamed from: y */
    private void m27934y() {
        setWillNotDraw(!m27938u());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4747f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m27938u()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f12981j);
            this.f12979A.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12979A;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public C4747f generateDefaultLayoutParams() {
        return new C4747f(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f */
    public C4747f generateLayoutParams(AttributeSet attributeSet) {
        return new C4747f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public C4747f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C4747f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4747f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4747f(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0681b
    public CoordinatorLayout.AbstractC0682c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f12980B = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i;
        int m37256C;
        int i2 = this.f12983l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C4747f c4747f = (C4747f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c4747f.f13026a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) c4747f).topMargin + ((LinearLayout.LayoutParams) c4747f).bottomMargin;
                if ((i4 & 8) != 0) {
                    m37256C = C1365w0.m37256C(childAt);
                } else if ((i4 & 2) != 0) {
                    m37256C = measuredHeight - C1365w0.m37256C(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C1365w0.m37170y(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + m37256C;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f12983l = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.f12984m;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C4747f c4747f = (C4747f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c4747f).topMargin + ((LinearLayout.LayoutParams) c4747f).bottomMargin;
            int i4 = c4747f.f13026a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C1365w0.m37256C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f12984m = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f12993v;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m37256C = C1365w0.m37256C(this);
        if (m37256C == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                m37256C = C1365w0.m37256C(getChildAt(childCount - 1));
            } else {
                m37256C = 0;
            }
            if (m37256C == 0) {
                return getHeight() / 3;
            }
        }
        return (m37256C * 2) + topInset;
    }

    int getPendingAction() {
        return this.f12986o;
    }

    public Drawable getStatusBarForeground() {
        return this.f12979A;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f12987p;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.m37732o();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f12982k;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C4747f c4747f = (C4747f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c4747f.f13026a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) c4747f).topMargin + ((LinearLayout.LayoutParams) c4747f).bottomMargin;
            if (i2 == 0 && C1365w0.m37170y(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C1365w0.m37256C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f12982k = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    boolean m27951h() {
        return this.f12985n;
    }

    /* renamed from: j */
    boolean m27949j() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: l */
    public boolean m27947l() {
        return this.f12992u;
    }

    /* renamed from: m */
    void m27946m(int i) {
        this.f12981j = i;
        if (!willNotDraw()) {
            C1365w0.m37203h0(this);
        }
        List<InterfaceC4744c> list = this.f12988q;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC4744c interfaceC4744c = this.f12988q.get(i2);
                if (interfaceC4744c != null) {
                    interfaceC4744c.m27890a(this, i);
                }
            }
        }
    }

    /* renamed from: n */
    WindowInsetsCompat m27945n(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (C1365w0.m37170y(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!C1134c.m37835a(this.f12987p, windowInsetsCompat2)) {
            this.f12987p = windowInsetsCompat2;
            m27934y();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    /* renamed from: o */
    void m27944o() {
        this.f12986o = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2236h.m33878e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f12997z == null) {
            this.f12997z = new int[4];
        }
        int[] iArr = this.f12997z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f12990s;
        int i4 = C7480b.f20092G;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (z && this.f12991t) {
            i2 = C7480b.f20093H;
        } else {
            i2 = -C7480b.f20093H;
        }
        iArr[1] = i2;
        int i5 = C7480b.f20090E;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (z && this.f12991t) {
            i3 = C7480b.f20089D;
        } else {
            i3 = -C7480b.f20089D;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m27956c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C1365w0.m37170y(this) && m27936w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C1365w0.m37215b0(getChildAt(childCount), topInset);
            }
        }
        m27948k();
        this.f12985n = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C4747f) getChildAt(i5).getLayoutParams()).m27884d() != null) {
                this.f12985n = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f12979A;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f12989r) {
            if (!this.f12992u && !m27950i()) {
                z2 = false;
            }
            m27941r(z2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C1365w0.m37170y(this) && m27936w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = C13657a.m1915b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m27948k();
    }

    /* renamed from: p */
    public void m27943p(boolean z, boolean z2) {
        m27942q(z, z2, true);
    }

    /* renamed from: s */
    boolean m27940s(boolean z) {
        return m27939t(z, !this.f12989r);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2236h.m33879d(this, f);
    }

    public void setExpanded(boolean z) {
        m27943p(z, C1365w0.m37224U(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f12992u = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f12993v = i;
        m27956c();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f12989r = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f12979A;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f12979A = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f12979A.setState(getDrawableState());
                }
                C1013a.m38085m(this.f12979A, C1365w0.m37258B(this));
                Drawable drawable4 = this.f12979A;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f12979A.setCallback(this);
            }
            m27934y();
            C1365w0.m37203h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C6029a.m23853b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C4754e.m27845b(this, f);
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
        Drawable drawable = this.f12979A;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    boolean m27939t(boolean z, boolean z2) {
        if (z2 && this.f12991t != z) {
            this.f12991t = z;
            refreshDrawableState();
            if (this.f12992u && (getBackground() instanceof C2232g)) {
                m27935x((C2232g) getBackground(), z);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: v */
    boolean m27937v(View view) {
        View m27955d = m27955d(view);
        if (m27955d != null) {
            view = m27955d;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12979A;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20098a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.f12978C
            android.content.Context r10 = p064db.C5810a.m24498c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f12982k = r10
            r9.f12983l = r10
            r9.f12984m = r10
            r6 = 0
            r9.f12986o = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f12996y = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L2f
            com.google.android.material.appbar.C4754e.m27846a(r9)
        L2f:
            com.google.android.material.appbar.C4754e.m27844c(r9, r11, r12, r4)
            int[] r2 = p155ia.C7489k.f20570k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            int r12 = p155ia.C7489k.f20578l
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.C1365w0.m37177u0(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L6a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            bb.g r0 = new bb.g
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.m33919Y(r12)
            r0.m33929O(r7)
            androidx.core.view.C1365w0.m37177u0(r9, r0)
        L6a:
            int r12 = p155ia.C7489k.f20610p
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L79
            boolean r12 = r11.getBoolean(r12, r6)
            r9.m27942q(r12, r6, r6)
        L79:
            int r12 = p155ia.C7489k.f20602o
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L89
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.C4754e.m27845b(r9, r12)
        L89:
            r12 = 26
            if (r8 < r12) goto Lab
            int r12 = p155ia.C7489k.f20594n
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L9c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L9c:
            int r12 = p155ia.C7489k.f20586m
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Lab
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        Lab:
            int r12 = p155ia.C7489k.f20618q
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f12992u = r12
            int r12 = p155ia.C7489k.f20626r
            int r10 = r11.getResourceId(r12, r10)
            r9.f12993v = r10
            int r10 = p155ia.C7489k.f20634s
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.C1365w0.m37253D0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4747f extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f13026a;

        /* renamed from: b */
        private AbstractC4745d f13027b;

        /* renamed from: c */
        Interpolator f13028c;

        public C4747f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13026a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20650u);
            this.f13026a = obtainStyledAttributes.getInt(C7489k.f20666w, 0);
            m27882f(m27887a(obtainStyledAttributes.getInt(C7489k.f20658v, 0)));
            int i = C7489k.f20674x;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f13028c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private AbstractC4745d m27887a(int i) {
            if (i != 1) {
                return null;
            }
            return new C4746e();
        }

        /* renamed from: b */
        public AbstractC4745d m27886b() {
            return this.f13027b;
        }

        /* renamed from: c */
        public int m27885c() {
            return this.f13026a;
        }

        /* renamed from: d */
        public Interpolator m27884d() {
            return this.f13028c;
        }

        /* renamed from: e */
        boolean m27883e() {
            int i = this.f13026a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void m27882f(AbstractC4745d abstractC4745d) {
            this.f13027b = abstractC4745d;
        }

        /* renamed from: g */
        public void m27881g(int i) {
            this.f13026a = i;
        }

        public C4747f(int i, int i2) {
            super(i, i2);
            this.f13026a = 1;
        }

        public C4747f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13026a = 1;
        }

        public C4747f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13026a = 1;
        }

        public C4747f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13026a = 1;
        }
    }
}
