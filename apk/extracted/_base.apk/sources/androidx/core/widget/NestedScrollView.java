package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C1170a;
import androidx.core.view.C1302n0;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1309o0;
import androidx.core.view.InterfaceC1319q0;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C1223z;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.uimanager.ViewDefaults;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import p356u.C12806a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1319q0, InterfaceC1309o0, ScrollingView {

    /* renamed from: K */
    private static final float f3724K = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: L */
    private static final C1407a f3725L = new C1407a();

    /* renamed from: M */
    private static final int[] f3726M = {16843130};

    /* renamed from: A */
    private int f3727A;

    /* renamed from: B */
    private final int[] f3728B;

    /* renamed from: C */
    private final int[] f3729C;

    /* renamed from: D */
    private int f3730D;

    /* renamed from: E */
    private int f3731E;

    /* renamed from: F */
    private C1410d f3732F;

    /* renamed from: G */
    private final NestedScrollingParentHelper f3733G;

    /* renamed from: H */
    private final NestedScrollingChildHelper f3734H;

    /* renamed from: I */
    private float f3735I;

    /* renamed from: J */
    private InterfaceC1409c f3736J;

    /* renamed from: j */
    private final float f3737j;

    /* renamed from: k */
    private long f3738k;

    /* renamed from: l */
    private final Rect f3739l;

    /* renamed from: m */
    private OverScroller f3740m;

    /* renamed from: n */
    public EdgeEffect f3741n;

    /* renamed from: o */
    public EdgeEffect f3742o;

    /* renamed from: p */
    private int f3743p;

    /* renamed from: q */
    private boolean f3744q;

    /* renamed from: r */
    private boolean f3745r;

    /* renamed from: s */
    private View f3746s;

    /* renamed from: t */
    private boolean f3747t;

    /* renamed from: u */
    private VelocityTracker f3748u;

    /* renamed from: v */
    private boolean f3749v;

    /* renamed from: w */
    private boolean f3750w;

    /* renamed from: x */
    private int f3751x;

    /* renamed from: y */
    private int f3752y;

    /* renamed from: z */
    private int f3753z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1407a extends C1170a {
        C1407a() {
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C1223z.m37504a(accessibilityEvent, nestedScrollView.getScrollX());
            C1223z.m37503b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.m37590g0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                accessibilityNodeInfoCompat.m37638D0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    accessibilityNodeInfoCompat.m37601b(AccessibilityNodeInfoCompat.C1178a.f3619r);
                    accessibilityNodeInfoCompat.m37601b(AccessibilityNodeInfoCompat.C1178a.f3587C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    accessibilityNodeInfoCompat.m37601b(AccessibilityNodeInfoCompat.C1178a.f3618q);
                    accessibilityNodeInfoCompat.m37601b(AccessibilityNodeInfoCompat.C1178a.f3589E);
                }
            }
        }

        @Override // androidx.core.view.C1170a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i != 8192 && i != 16908344) {
                    if (i != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m36997P(0, max, true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m36997P(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1408b {
        /* renamed from: a */
        static boolean m36967a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1409c {
        /* renamed from: a */
        void m36966a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.NestedScrollView$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1410d extends View.BaseSavedState {
        public static final Parcelable.Creator<C1410d> CREATOR = new C1411a();

        /* renamed from: j */
        public int f3754j;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1411a implements Parcelable.Creator<C1410d> {
            C1411a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1410d createFromParcel(Parcel parcel) {
                return new C1410d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1410d[] newArray(int i) {
                return new C1410d[i];
            }
        }

        C1410d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3754j + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3754j);
        }

        C1410d(Parcel parcel) {
            super(parcel);
            this.f3754j = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12806a.f33179c);
    }

    /* renamed from: A */
    private void m37012A(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3734H.m37766e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: B */
    private void m37011B(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3727A) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f3743p = (int) motionEvent.getY(i);
            this.f3727A = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3748u;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: E */
    private void m37008E() {
        VelocityTracker velocityTracker = this.f3748u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3748u = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m37007F(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3741n
            float r0 = androidx.core.widget.C1422d.m36912b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f3741n
            float r4 = -r4
            float r4 = androidx.core.widget.C1422d.m36910d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3741n
            float r5 = androidx.core.widget.C1422d.m36912b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3741n
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f3742o
            float r0 = androidx.core.widget.C1422d.m36912b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f3742o
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C1422d.m36910d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3742o
            float r5 = androidx.core.widget.C1422d.m36912b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3742o
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m37007F(int, float):int");
    }

    /* renamed from: G */
    private void m37006G(boolean z) {
        if (z) {
            m36996Q(2, 1);
        } else {
            m36994S(1);
        }
        this.f3731E = getScrollY();
        C1365w0.m37203h0(this);
    }

    /* renamed from: H */
    private boolean m37005H(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View m36980n = m36980n(z, i2, i3);
        if (m36980n == null) {
            m36980n = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m37004I(i4, 0, 1, true);
            z2 = true;
        }
        if (m36980n != findFocus()) {
            m36980n.requestFocus(i);
        }
        return z2;
    }

    /* renamed from: I */
    private int m37004I(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        if (i3 == 1) {
            m36996Q(2, i3);
        }
        boolean z4 = false;
        if (m36986h(0, i, this.f3729C, this.f3728B, i3)) {
            i4 = i - this.f3729C[1];
            i5 = this.f3728B[1] + 0;
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        if (m36991c() && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m37010C(0, i4, 0, scrollY, 0, scrollRange, 0, 0, true) && !m36976r(i3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f3729C;
        iArr[1] = 0;
        m36985i(0, scrollY2, 0, i4 - scrollY2, this.f3728B, i3, iArr);
        int i6 = i5 + this.f3728B[1];
        int i7 = i4 - this.f3729C[1];
        int i8 = scrollY + i7;
        if (i8 < 0) {
            if (z2) {
                C1422d.m36910d(this.f3741n, (-i7) / getHeight(), i2 / getWidth());
                if (!this.f3742o.isFinished()) {
                    this.f3742o.onRelease();
                }
            }
        } else if (i8 > scrollRange && z2) {
            C1422d.m36910d(this.f3742o, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.f3741n.isFinished()) {
                this.f3741n.onRelease();
            }
        }
        if (this.f3741n.isFinished() && this.f3742o.isFinished()) {
            z4 = z3;
        } else {
            C1365w0.m37203h0(this);
        }
        if (z4 && i3 == 0) {
            this.f3748u.clear();
        }
        if (i3 == 1) {
            m36994S(i3);
            this.f3741n.onRelease();
            this.f3742o.onRelease();
        }
        return i6;
    }

    /* renamed from: J */
    private void m37003J(View view) {
        view.getDrawingRect(this.f3739l);
        offsetDescendantRectToMyCoords(view, this.f3739l);
        int m36988f = m36988f(this.f3739l);
        if (m36988f != 0) {
            scrollBy(0, m36988f);
        }
    }

    /* renamed from: K */
    private boolean m37002K(Rect rect, boolean z) {
        boolean z2;
        int m36988f = m36988f(rect);
        if (m36988f != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, m36988f);
            } else {
                m37000M(0, m36988f);
            }
        }
        return z2;
    }

    /* renamed from: L */
    private boolean m37001L(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        if (m36977q(-i) < C1422d.m36912b(edgeEffect) * getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private void m36999N(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3738k > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f3740m;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            m37006G(z);
        } else {
            if (!this.f3740m.isFinished()) {
                m36993a();
            }
            scrollBy(i, i2);
        }
        this.f3738k = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: R */
    private boolean m36995R(MotionEvent motionEvent) {
        boolean z;
        if (C1422d.m36912b(this.f3741n) != 0.0f) {
            C1422d.m36910d(this.f3741n, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C1422d.m36912b(this.f3742o) != 0.0f) {
            C1422d.m36910d(this.f3742o, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    /* renamed from: a */
    private void m36993a() {
        this.f3740m.abortAnimation();
        m36994S(1);
    }

    /* renamed from: c */
    private boolean m36991c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode == 1 && getScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m36990d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin <= (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static int m36989e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3735I == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3735I = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3735I;
    }

    /* renamed from: j */
    private void m36984j(int i) {
        if (i != 0) {
            if (this.f3750w) {
                m37000M(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: k */
    private boolean m36983k(int i) {
        if (C1422d.m36912b(this.f3741n) != 0.0f) {
            if (m37001L(this.f3741n, i)) {
                this.f3741n.onAbsorb(i);
            } else {
                m36979o(-i);
            }
        } else if (C1422d.m36912b(this.f3742o) != 0.0f) {
            int i2 = -i;
            if (m37001L(this.f3742o, i2)) {
                this.f3742o.onAbsorb(i2);
            } else {
                m36979o(i2);
            }
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m36982l() {
        this.f3727A = -1;
        this.f3747t = false;
        m37008E();
        m36994S(0);
        this.f3741n.onRelease();
        this.f3742o.onRelease();
    }

    /* renamed from: n */
    private View m36980n(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i < top && bottom < i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((z && top < view.getTop()) || (!z && bottom > view.getBottom())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                            view = view2;
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z3) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: q */
    private float m36977q(int i) {
        double log = Math.log((Math.abs(i) * 0.35f) / (this.f3737j * 0.015f));
        float f = f3724K;
        return (float) (this.f3737j * 0.015f * Math.exp((f / (f - 1.0d)) * log));
    }

    /* renamed from: s */
    private boolean m36975s(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private void m36974t() {
        VelocityTracker velocityTracker = this.f3748u;
        if (velocityTracker == null) {
            this.f3748u = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: u */
    private void m36973u() {
        this.f3740m = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3751x = viewConfiguration.getScaledTouchSlop();
        this.f3752y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3753z = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: v */
    private void m36972v() {
        if (this.f3748u == null) {
            this.f3748u = VelocityTracker.obtain();
        }
    }

    /* renamed from: w */
    private void m36971w(int i, int i2) {
        this.f3743p = i;
        this.f3727A = i2;
        m36996Q(2, 0);
    }

    /* renamed from: x */
    private boolean m36970x(View view) {
        return !m36968z(view, 0, getHeight());
    }

    /* renamed from: y */
    private static boolean m36969y(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && m36969y((View) parent, view2)) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private boolean m36968z(View view, int i, int i2) {
        view.getDrawingRect(this.f3739l);
        offsetDescendantRectToMyCoords(view, this.f3739l);
        if (this.f3739l.bottom + i >= getScrollY() && this.f3739l.top - i <= getScrollY() + i2) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    boolean m37010C(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z2)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z3)) {
            z5 = false;
        } else {
            z5 = true;
        }
        int i11 = i3 + i;
        if (!z4) {
            i9 = 0;
        } else {
            i9 = i7;
        }
        int i12 = i4 + i2;
        if (!z5) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        int i13 = -i9;
        int i14 = i9 + i5;
        int i15 = -i10;
        int i16 = i10 + i6;
        if (i11 > i14) {
            i11 = i14;
            z6 = true;
        } else if (i11 < i13) {
            z6 = true;
            i11 = i13;
        } else {
            z6 = false;
        }
        if (i12 > i16) {
            i12 = i16;
            z7 = true;
        } else if (i12 < i15) {
            z7 = true;
            i12 = i15;
        } else {
            z7 = false;
        }
        if (z7 && !m36976r(1)) {
            this.f3740m.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i11, i12, z6, z7);
        if (!z6 && !z7) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public boolean m37009D(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.f3739l.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3739l;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3739l.top = getScrollY() - height;
            Rect rect2 = this.f3739l;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3739l;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m37005H(i, i2, i3);
    }

    /* renamed from: M */
    public final void m37000M(int i, int i2) {
        m36999N(i, i2, ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    /* renamed from: O */
    void m36998O(int i, int i2, int i3, boolean z) {
        m36999N(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: P */
    void m36997P(int i, int i2, boolean z) {
        m36998O(i, i2, ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION, z);
    }

    /* renamed from: Q */
    public boolean m36996Q(int i, int i2) {
        return this.f3734H.m37754q(i, i2);
    }

    /* renamed from: S */
    public void m36994S(int i) {
        this.f3734H.m37752s(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean m36992b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m36968z(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f3739l);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3739l);
            m37004I(m36988f(this.f3739l), 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m37004I(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && m36970x(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3740m.isFinished()) {
            return;
        }
        this.f3740m.computeScrollOffset();
        int currY = this.f3740m.getCurrY();
        int m36987g = m36987g(currY - this.f3731E);
        this.f3731E = currY;
        int[] iArr = this.f3729C;
        boolean z = false;
        iArr[1] = 0;
        m36986h(0, m36987g, iArr, null, 1);
        int i = m36987g - this.f3729C[1];
        int scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY = getScrollY();
            m37010C(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.f3729C;
            iArr2[1] = 0;
            m36985i(0, scrollY2, 0, i2, this.f3728B, 1, iArr2);
            i = i2 - this.f3729C[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i < 0) {
                    if (this.f3741n.isFinished()) {
                        this.f3741n.onAbsorb((int) this.f3740m.getCurrVelocity());
                    }
                } else if (this.f3742o.isFinished()) {
                    this.f3742o.onAbsorb((int) this.f3740m.getCurrVelocity());
                }
            }
            m36993a();
        }
        if (!this.f3740m.isFinished()) {
            C1365w0.m37203h0(this);
        } else {
            m36994S(1);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m36981m(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3734H.m37770a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3734H.m37769b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m36986h(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3734H.m37765f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f3741n.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C1408b.m36967a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C1408b.m36967a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.f3741n.setSize(width, height);
            if (this.f3741n.draw(canvas)) {
                C1365w0.m37203h0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f3742o.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C1408b.m36967a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (C1408b.m36967a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f3742o.setSize(width2, height2);
            if (this.f3742o.draw(canvas)) {
                C1365w0.m37203h0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: f */
    protected int m36988f(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i5 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    /* renamed from: g */
    int m36987g(int i) {
        int height = getHeight();
        if (i > 0 && C1422d.m36912b(this.f3741n) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * C1422d.m36910d(this.f3741n, ((-i) * 4.0f) / height, 0.5f));
            if (round != i) {
                this.f3741n.finish();
            }
            return i - round;
        } else if (i < 0 && C1422d.m36912b(this.f3742o) != 0.0f) {
            float f = height;
            int round2 = Math.round((f / 4.0f) * C1422d.m36910d(this.f3742o, (i * 4.0f) / f, 0.5f));
            if (round2 != i) {
                this.f3742o.finish();
            }
            return i - round2;
        } else {
            return i;
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3733G.m37751a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean m36986h(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3734H.m37767d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m36976r(0);
    }

    /* renamed from: i */
    public void m36985i(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f3734H.m37766e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3734H.m37758m();
    }

    /* renamed from: m */
    public boolean m36981m(KeyEvent keyEvent) {
        this.f3739l.setEmpty();
        int i = 130;
        if (!m36990d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    m37009D(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return m36992b(130);
                } else {
                    return m36978p(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return m36992b(33);
            } else {
                return m36978p(33);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: o */
    public void m36979o(int i) {
        if (getChildCount() > 0) {
            this.f3740m.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES, 0, 0);
            m37006G(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3745r = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float f;
        if (motionEvent.getAction() != 8 || this.f3747t) {
            return false;
        }
        if (C1302n0.m37373a(motionEvent, 2)) {
            f = motionEvent.getAxisValue(9);
            i = (int) motionEvent.getX();
        } else if (C1302n0.m37373a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i = getWidth() / 2;
            f = axisValue;
        } else {
            i = 0;
            f = 0.0f;
        }
        if (f == 0.0f) {
            return false;
        }
        m37004I(-((int) (f * getVerticalScrollFactorCompat())), i, 1, C1302n0.m37373a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f3747t) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            m37011B(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.f3727A;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3743p) > this.f3751x && (2 & getNestedScrollAxes()) == 0) {
                                this.f3747t = true;
                                this.f3743p = y;
                                m36972v();
                                this.f3748u.addMovement(motionEvent);
                                this.f3730D = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f3747t = false;
            this.f3727A = -1;
            m37008E();
            if (this.f3740m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C1365w0.m37203h0(this);
            }
            m36994S(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m36975s((int) motionEvent.getX(), y2)) {
                if (!m36995R(motionEvent) && this.f3740m.isFinished()) {
                    z = false;
                }
                this.f3747t = z;
                m37008E();
            } else {
                this.f3743p = y2;
                this.f3727A = motionEvent.getPointerId(0);
                m36974t();
                this.f3748u.addMovement(motionEvent);
                this.f3740m.computeScrollOffset();
                if (!m36995R(motionEvent) && this.f3740m.isFinished()) {
                    z = false;
                }
                this.f3747t = z;
                m36996Q(2, 0);
            }
        }
        return this.f3747t;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3744q = false;
        View view = this.f3746s;
        if (view != null && m36969y(view, this)) {
            m37003J(this.f3746s);
        }
        this.f3746s = null;
        if (!this.f3745r) {
            if (this.f3732F != null) {
                scrollTo(getScrollX(), this.f3732F.f3754j);
                this.f3732F = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m36989e = m36989e(scrollY, paddingTop, i5);
            if (m36989e != scrollY) {
                scrollTo(getScrollX(), m36989e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3745r = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3749v && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            dispatchNestedFling(0.0f, f2, true);
            m36979o((int) f2);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        m36986h(i, i2, iArr, null, i3);
    }

    @Override // androidx.core.view.InterfaceC1319q0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m37012A(i4, i5, iArr);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f3733G.m37749c(view, view2, i, i2);
        m36996Q(2, i2);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || m36970x(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1410d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1410d c1410d = (C1410d) parcelable;
        super.onRestoreInstanceState(c1410d.getSuperState());
        this.f3732F = c1410d;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1410d c1410d = new C1410d(super.onSaveInstanceState());
        c1410d.f3754j = getScrollY();
        return c1410d;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1409c interfaceC1409c = this.f3736J;
        if (interfaceC1409c != null) {
            interfaceC1409c.m36966a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m36968z(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3739l);
            offsetDescendantRectToMyCoords(findFocus, this.f3739l);
            m36984j(m36988f(this.f3739l));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onStopNestedScroll(View view, int i) {
        this.f3733G.m37747e(view, i);
        m36994S(i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        m36972v();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3730D = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f3730D);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m37011B(motionEvent);
                                this.f3743p = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3727A));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f3743p = (int) motionEvent.getY(actionIndex);
                            this.f3727A = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f3747t && getChildCount() > 0 && this.f3740m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            C1365w0.m37203h0(this);
                        }
                        m36982l();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3727A);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f3727A + " in onTouchEvent");
                    } else {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        int i = this.f3743p - y;
                        int m37007F = i - m37007F(i, motionEvent.getX(findPointerIndex));
                        if (!this.f3747t && Math.abs(m37007F) > this.f3751x) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f3747t = true;
                            m37007F = m37007F > 0 ? m37007F - this.f3751x : m37007F + this.f3751x;
                        }
                        if (this.f3747t) {
                            int m37004I = m37004I(m37007F, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f3743p = y - m37004I;
                            this.f3730D += m37004I;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.f3748u;
                velocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f3753z);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3727A);
                if (Math.abs(yVelocity) >= this.f3752y) {
                    if (!m36983k(yVelocity)) {
                        int i2 = -yVelocity;
                        float f = i2;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            m36979o(i2);
                        }
                    }
                } else if (this.f3740m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C1365w0.m37203h0(this);
                }
                m36982l();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f3747t && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3740m.isFinished()) {
                m36993a();
            }
            m36971w((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f3748u;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public boolean m36978p(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.f3739l;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3739l.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3739l;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3739l;
        return m37005H(i, rect3.top, rect3.bottom);
    }

    /* renamed from: r */
    public boolean m36976r(int i) {
        return this.f3734H.m37759l(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3744q) {
            m37003J(view2);
        } else {
            this.f3746s = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m37002K(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m37008E();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3744q = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int m36989e = m36989e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int m36989e2 = m36989e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (m36989e != getScrollX() || m36989e2 != getScrollY()) {
                super.scrollTo(m36989e, m36989e2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3749v) {
            this.f3749v = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f3734H.m37757n(z);
    }

    public void setOnScrollChangeListener(InterfaceC1409c interfaceC1409c) {
        this.f3736J = interfaceC1409c;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3750w = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m36996Q(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m36994S(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3739l = new Rect();
        this.f3744q = true;
        this.f3745r = false;
        this.f3746s = null;
        this.f3747t = false;
        this.f3750w = true;
        this.f3727A = -1;
        this.f3728B = new int[2];
        this.f3729C = new int[2];
        this.f3741n = C1422d.m36913a(context, attributeSet);
        this.f3742o = C1422d.m36913a(context, attributeSet);
        this.f3737j = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m36973u();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3726M, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3733G = new NestedScrollingParentHelper(this);
        this.f3734H = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        C1365w0.m37185q0(this, f3725L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m37012A(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m37012A(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
