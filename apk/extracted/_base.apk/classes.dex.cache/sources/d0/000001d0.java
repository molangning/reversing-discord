package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.core.graphics.Insets;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1314p0;
import androidx.core.view.InterfaceC1319q0;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.uimanager.ViewDefaults;
import p052d.C5706a;
import p052d.C5711f;

@SuppressLint({"UnknownNullness"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0531j0, InterfaceC1314p0, InterfaceC1319q0 {

    /* renamed from: O */
    static final int[] f1468O = {C5706a.f16048b, 16842841};

    /* renamed from: A */
    private final Rect f1469A;

    /* renamed from: B */
    private final Rect f1470B;

    /* renamed from: C */
    private final Rect f1471C;

    /* renamed from: D */
    private WindowInsetsCompat f1472D;

    /* renamed from: E */
    private WindowInsetsCompat f1473E;

    /* renamed from: F */
    private WindowInsetsCompat f1474F;

    /* renamed from: G */
    private WindowInsetsCompat f1475G;

    /* renamed from: H */
    private InterfaceC0421d f1476H;

    /* renamed from: I */
    private OverScroller f1477I;

    /* renamed from: J */
    ViewPropertyAnimator f1478J;

    /* renamed from: K */
    final AnimatorListenerAdapter f1479K;

    /* renamed from: L */
    private final Runnable f1480L;

    /* renamed from: M */
    private final Runnable f1481M;

    /* renamed from: N */
    private final NestedScrollingParentHelper f1482N;

    /* renamed from: j */
    private int f1483j;

    /* renamed from: k */
    private int f1484k;

    /* renamed from: l */
    private ContentFrameLayout f1485l;

    /* renamed from: m */
    ActionBarContainer f1486m;

    /* renamed from: n */
    private InterfaceC0534k0 f1487n;

    /* renamed from: o */
    private Drawable f1488o;

    /* renamed from: p */
    private boolean f1489p;

    /* renamed from: q */
    private boolean f1490q;

    /* renamed from: r */
    private boolean f1491r;

    /* renamed from: s */
    private boolean f1492s;

    /* renamed from: t */
    boolean f1493t;

    /* renamed from: u */
    private int f1494u;

    /* renamed from: v */
    private int f1495v;

    /* renamed from: w */
    private final Rect f1496w;

    /* renamed from: x */
    private final Rect f1497x;

    /* renamed from: y */
    private final Rect f1498y;

    /* renamed from: z */
    private final Rect f1499z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0418a extends AnimatorListenerAdapter {
        C0418a() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1478J = null;
            actionBarOverlayLayout.f1493t = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1478J = null;
            actionBarOverlayLayout.f1493t = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC0419b implements Runnable {
        RunnableC0419b() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m40262o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1478J = actionBarOverlayLayout.f1486m.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1479K);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC0420c implements Runnable {
        RunnableC0420c() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m40262o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1478J = actionBarOverlayLayout.f1486m.animate().translationY(-ActionBarOverlayLayout.this.f1486m.getHeight()).setListener(ActionBarOverlayLayout.this.f1479K);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0421d {
        /* renamed from: a */
        void mo40254a();

        /* renamed from: b */
        void mo40253b(int i);

        /* renamed from: c */
        void mo40252c();

        /* renamed from: d */
        void mo40251d(boolean z);

        /* renamed from: e */
        void mo40250e();

        /* renamed from: f */
        void mo40249f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0422e extends ViewGroup.MarginLayoutParams {
        public C0422e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0422e(int i, int i2) {
            super(i, i2);
        }

        public C0422e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1484k = 0;
        this.f1496w = new Rect();
        this.f1497x = new Rect();
        this.f1498y = new Rect();
        this.f1499z = new Rect();
        this.f1469A = new Rect();
        this.f1470B = new Rect();
        this.f1471C = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f3540b;
        this.f1472D = windowInsetsCompat;
        this.f1473E = windowInsetsCompat;
        this.f1474F = windowInsetsCompat;
        this.f1475G = windowInsetsCompat;
        this.f1479K = new C0418a();
        this.f1480L = new RunnableC0419b();
        this.f1481M = new RunnableC0420c();
        m40261p(context);
        this.f1482N = new NestedScrollingParentHelper(this);
    }

    /* renamed from: j */
    private void m40267j() {
        m40262o();
        this.f1481M.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002c  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m40266k(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0422e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m40266k(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: n */
    private InterfaceC0534k0 m40263n(View view) {
        if (view instanceof InterfaceC0534k0) {
            return (InterfaceC0534k0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: p */
    private void m40261p(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1468O);
        boolean z2 = false;
        this.f1483j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1488o = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f1489p = z2;
        this.f1477I = new OverScroller(context);
    }

    /* renamed from: r */
    private void m40259r() {
        m40262o();
        postDelayed(this.f1481M, 600L);
    }

    /* renamed from: s */
    private void m40258s() {
        m40262o();
        postDelayed(this.f1480L, 600L);
    }

    /* renamed from: u */
    private void m40256u() {
        m40262o();
        this.f1480L.run();
    }

    /* renamed from: v */
    private boolean m40255v(float f) {
        this.f1477I.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES);
        if (this.f1477I.getFinalY() > this.f1486m.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: a */
    public boolean mo39818a() {
        m40257t();
        return this.f1487n.mo39754a();
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: b */
    public boolean mo39817b() {
        m40257t();
        return this.f1487n.mo39753b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: c */
    public boolean mo39816c() {
        m40257t();
        return this.f1487n.mo39752c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0422e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: d */
    public void mo39815d(Menu menu, InterfaceC0405m.InterfaceC0406a interfaceC0406a) {
        m40257t();
        this.f1487n.mo39751d(menu, interfaceC0406a);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1488o != null && !this.f1489p) {
            if (this.f1486m.getVisibility() == 0) {
                i = (int) (this.f1486m.getBottom() + this.f1486m.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f1488o.setBounds(0, i, getWidth(), this.f1488o.getIntrinsicHeight() + i);
            this.f1488o.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: e */
    public boolean mo39814e() {
        m40257t();
        return this.f1487n.mo39750e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: f */
    public void mo39813f() {
        m40257t();
        this.f1487n.mo39749f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: g */
    public boolean mo39812g() {
        m40257t();
        return this.f1487n.mo39748g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1486m;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1482N.m37751a();
    }

    public CharSequence getTitle() {
        m40257t();
        return this.f1487n.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: h */
    public void mo39811h(int i) {
        m40257t();
        if (i != 2) {
            if (i != 5) {
                if (i == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f1487n.mo39733v();
            return;
        }
        this.f1487n.mo39740o();
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    /* renamed from: i */
    public void mo39810i() {
        m40257t();
        this.f1487n.mo39738q();
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public C0422e generateDefaultLayoutParams() {
        return new C0422e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0422e generateLayoutParams(AttributeSet attributeSet) {
        return new C0422e(getContext(), attributeSet);
    }

    /* renamed from: o */
    void m40262o() {
        removeCallbacks(this.f1480L);
        removeCallbacks(this.f1481M);
        ViewPropertyAnimator viewPropertyAnimator = this.f1478J;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m40257t();
        WindowInsetsCompat m37721z = WindowInsetsCompat.m37721z(windowInsets, this);
        boolean m40266k = m40266k(this.f1486m, new Rect(m37721z.m37734m(), m37721z.m37732o(), m37721z.m37733n(), m37721z.m37735l()), true, true, false, true);
        C1365w0.m37208f(this, m37721z, this.f1496w);
        Rect rect = this.f1496w;
        WindowInsetsCompat m37731p = m37721z.m37731p(rect.left, rect.top, rect.right, rect.bottom);
        this.f1472D = m37731p;
        boolean z = true;
        if (!this.f1473E.equals(m37731p)) {
            this.f1473E = this.f1472D;
            m40266k = true;
        }
        if (!this.f1497x.equals(this.f1496w)) {
            this.f1497x.set(this.f1496w);
        } else {
            z = m40266k;
        }
        if (z) {
            requestLayout();
        }
        return m37721z.m37746a().m37744c().m37745b().m37723x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m40261p(getContext());
        C1365w0.m37191n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m40262o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0422e c0422e = (C0422e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0422e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0422e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        m40257t();
        measureChildWithMargins(this.f1486m, i, 0, i2, 0);
        C0422e c0422e = (C0422e) this.f1486m.getLayoutParams();
        int max = Math.max(0, this.f1486m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0422e).leftMargin + ((ViewGroup.MarginLayoutParams) c0422e).rightMargin);
        int max2 = Math.max(0, this.f1486m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0422e).topMargin + ((ViewGroup.MarginLayoutParams) c0422e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1486m.getMeasuredState());
        if ((C1365w0.m37236M(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.f1483j;
            if (this.f1491r && this.f1486m.getTabContainer() != null) {
                measuredHeight += this.f1483j;
            }
        } else {
            measuredHeight = this.f1486m.getVisibility() != 8 ? this.f1486m.getMeasuredHeight() : 0;
        }
        this.f1498y.set(this.f1496w);
        WindowInsetsCompat windowInsetsCompat = this.f1472D;
        this.f1474F = windowInsetsCompat;
        if (!this.f1490q && !z) {
            Rect rect = this.f1498y;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f1474F = windowInsetsCompat.m37731p(0, measuredHeight, 0, 0);
        } else {
            this.f1474F = new WindowInsetsCompat.C1152b(this.f1474F).m37716d(Insets.m38192b(windowInsetsCompat.m37734m(), this.f1474F.m37732o() + measuredHeight, this.f1474F.m37733n(), this.f1474F.m37735l() + 0)).m37719a();
        }
        m40266k(this.f1485l, this.f1498y, true, true, true, true);
        if (!this.f1475G.equals(this.f1474F)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f1474F;
            this.f1475G = windowInsetsCompat2;
            C1365w0.m37206g(this.f1485l, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f1485l, i, 0, i2, 0);
        C0422e c0422e2 = (C0422e) this.f1485l.getLayoutParams();
        int max3 = Math.max(max, this.f1485l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0422e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0422e2).rightMargin);
        int max4 = Math.max(max2, this.f1485l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0422e2).topMargin + ((ViewGroup.MarginLayoutParams) c0422e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1485l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f1492s && z) {
            if (m40255v(f2)) {
                m40267j();
            } else {
                m40256u();
            }
            this.f1493t = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.core.view.InterfaceC1319q0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        m40257t();
        int i2 = this.f1495v ^ i;
        this.f1495v = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        InterfaceC0421d interfaceC0421d = this.f1476H;
        if (interfaceC0421d != null) {
            interfaceC0421d.mo40251d(!z2);
            if (!z && z2) {
                this.f1476H.mo40250e();
            } else {
                this.f1476H.mo40254a();
            }
        }
        if ((i2 & 256) != 0 && this.f1476H != null) {
            C1365w0.m37191n0(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1484k = i;
        InterfaceC0421d interfaceC0421d = this.f1476H;
        if (interfaceC0421d != null) {
            interfaceC0421d.mo40253b(i);
        }
    }

    /* renamed from: q */
    public boolean m40260q() {
        return this.f1490q;
    }

    public void setActionBarHideOffset(int i) {
        m40262o();
        this.f1486m.setTranslationY(-Math.max(0, Math.min(i, this.f1486m.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0421d interfaceC0421d) {
        this.f1476H = interfaceC0421d;
        if (getWindowToken() != null) {
            this.f1476H.mo40253b(this.f1484k);
            int i = this.f1495v;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C1365w0.m37191n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1491r = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1492s) {
            this.f1492s = z;
            if (!z) {
                m40262o();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m40257t();
        this.f1487n.setIcon(i);
    }

    public void setLogo(int i) {
        m40257t();
        this.f1487n.mo39736s(i);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f1490q = z;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1489p = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    public void setWindowCallback(Window.Callback callback) {
        m40257t();
        this.f1487n.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0531j0
    public void setWindowTitle(CharSequence charSequence) {
        m40257t();
        this.f1487n.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    void m40257t() {
        if (this.f1485l == null) {
            this.f1485l = (ContentFrameLayout) findViewById(C5711f.f16160b);
            this.f1486m = (ActionBarContainer) findViewById(C5711f.f16161c);
            this.f1487n = m40263n(findViewById(C5711f.f16159a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0422e(layoutParams);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1482N.m37750b(view, view2, i);
        this.f1494u = getActionBarHideOffset();
        m40262o();
        InterfaceC0421d interfaceC0421d = this.f1476H;
        if (interfaceC0421d != null) {
            interfaceC0421d.mo40249f();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1486m.getVisibility() != 0) {
            return false;
        }
        return this.f1492s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1492s && !this.f1493t) {
            if (this.f1494u <= this.f1486m.getHeight()) {
                m40258s();
            } else {
                m40259r();
            }
        }
        InterfaceC0421d interfaceC0421d = this.f1476H;
        if (interfaceC0421d != null) {
            interfaceC0421d.mo40252c();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1494u + i2;
        this.f1494u = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        m40257t();
        this.f1487n.setIcon(drawable);
    }
}