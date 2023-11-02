package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0946a;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1170a;
import androidx.core.view.C1336t;
import androidx.core.view.C1365w0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;
import java.util.List;
import p020b0.AbstractC1964a;
import p033c0.C2376a;
import p033c0.C2377b;
import p033c0.C2378c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.drawerlayout.widget.DrawerLayout";
    private static final boolean ALLOW_EDGE_LOCK = false;
    static final boolean CAN_HIDE_DESCENDANTS;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private final AccessibilityViewCommand mActionDismiss;
    private final ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final ViewDragCallback mLeftCallback;
    private final ViewDragHelper mLeftDragger;
    private DrawerListener mListener;
    private List<DrawerListener> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;
    private static final int[] THEME_ATTRS = {16843828};
    static final int[] LAYOUT_ATTRS = {16842931};

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static final class ChildAccessibilityDelegate extends C1170a {
        ChildAccessibilityDelegate() {
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!DrawerLayout.includeChildForAccessibility(view)) {
                accessibilityNodeInfoCompat.m37554y0(null);
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface DrawerListener {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class ViewDragCallback extends ViewDragHelper.AbstractC1452c {

        /* renamed from: a */
        private final int f3822a;

        /* renamed from: b */
        private ViewDragHelper f3823b;

        /* renamed from: c */
        private final Runnable f3824c = new RunnableC1453a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC1453a implements Runnable {
            RunnableC1453a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewDragCallback.this.m36756o();
            }
        }

        ViewDragCallback(int i) {
            this.f3822a = i;
        }

        /* renamed from: n */
        private void m36757n() {
            int i = 3;
            if (this.f3822a == 3) {
                i = 5;
            }
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: a */
        public int mo27690a(View view, int i, int i2) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: b */
        public int mo27689b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: d */
        public int mo27825d(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: f */
        public void mo36760f(int i, int i2) {
            View findDrawerWithGravity;
            if ((i & 1) == 1) {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(3);
            } else {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(5);
            }
            if (findDrawerWithGravity != null && DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) == 0) {
                this.f3823b.m36786b(findDrawerWithGravity, i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: g */
        public boolean mo36759g(int i) {
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: h */
        public void mo36758h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f3824c, 160L);
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: i */
        public void mo27824i(View view, int i) {
            ((C1457d) view.getLayoutParams()).f3833c = false;
            m36757n();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: j */
        public void mo27687j(int i) {
            DrawerLayout.this.updateDrawerState(i, this.f3823b.m36766v());
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: k */
        public void mo27686k(View view, int i, int i2, int i3, int i4) {
            float width;
            int i5;
            int width2 = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                width = i + width2;
            } else {
                width = DrawerLayout.this.getWidth() - i;
            }
            float f = width / width2;
            DrawerLayout.this.setDrawerViewOffset(view, f);
            if (f == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: l */
        public void mo27685l(View view, float f, float f2) {
            int i;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 <= 0 && (i2 != 0 || drawerViewOffset <= 0.5f)) {
                    i = -width;
                } else {
                    i = 0;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f3823b.m36791O(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: m */
        public boolean mo27684m(View view, int i) {
            if (DrawerLayout.this.isDrawerView(view) && DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.f3822a) && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: o */
        void m36756o() {
            boolean z;
            View findDrawerWithGravity;
            int width;
            int m36764x = this.f3823b.m36764x();
            int i = 0;
            if (this.f3822a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(3);
                if (findDrawerWithGravity != null) {
                    i = -findDrawerWithGravity.getWidth();
                }
                width = i + m36764x;
            } else {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(5);
                width = DrawerLayout.this.getWidth() - m36764x;
            }
            if (findDrawerWithGravity != null) {
                if (((z && findDrawerWithGravity.getLeft() < width) || (!z && findDrawerWithGravity.getLeft() > width)) && DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) == 0) {
                    this.f3823b.m36789Q(findDrawerWithGravity, width, findDrawerWithGravity.getTop());
                    ((C1457d) findDrawerWithGravity.getLayoutParams()).f3833c = true;
                    DrawerLayout.this.invalidate();
                    m36757n();
                    DrawerLayout.this.cancelChildViewTouch();
                }
            }
        }

        /* renamed from: p */
        public void m36755p() {
            DrawerLayout.this.removeCallbacks(this.f3824c);
        }

        /* renamed from: q */
        public void m36754q(ViewDragHelper viewDragHelper) {
            this.f3823b = viewDragHelper;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1454a implements AccessibilityViewCommand {
        C1454a() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        /* renamed from: a */
        public boolean mo27682a(View view, AccessibilityViewCommand.AbstractC1186a abstractC1186a) {
            if (DrawerLayout.this.isDrawerOpen(view) && DrawerLayout.this.getDrawerLockMode(view) != 2) {
                DrawerLayout.this.closeDrawer(view);
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class View$OnApplyWindowInsetsListenerC1455b implements View.OnApplyWindowInsetsListener {
        View$OnApplyWindowInsetsListenerC1455b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z = true;
            } else {
                z = false;
            }
            drawerLayout.setChildInsets(windowInsets, z);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1456c extends C1170a {

        /* renamed from: a */
        private final Rect f3829a = new Rect();

        C1456c() {
        }

        /* renamed from: a */
        private void m36753a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.includeChildForAccessibility(childAt)) {
                    accessibilityNodeInfoCompat.m37599c(childAt);
                }
            }
        }

        /* renamed from: b */
        private void m36752b(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.f3829a;
            accessibilityNodeInfoCompat2.m37577n(rect);
            accessibilityNodeInfoCompat.m37596d0(rect);
            accessibilityNodeInfoCompat.m37618N0(accessibilityNodeInfoCompat2.m37611S());
            accessibilityNodeInfoCompat.m37558w0(accessibilityNodeInfoCompat2.m37559w());
            accessibilityNodeInfoCompat.m37590g0(accessibilityNodeInfoCompat2.m37573p());
            accessibilityNodeInfoCompat.m37582k0(accessibilityNodeInfoCompat2.m37567s());
            accessibilityNodeInfoCompat.m37580l0(accessibilityNodeInfoCompat2.m37627J());
            accessibilityNodeInfoCompat.m37574o0(accessibilityNodeInfoCompat2.m37623L());
            accessibilityNodeInfoCompat.m37602a0(accessibilityNodeInfoCompat2.m37635F());
            accessibilityNodeInfoCompat.m37636E0(accessibilityNodeInfoCompat2.m37613Q());
            accessibilityNodeInfoCompat.m37603a(accessibilityNodeInfoCompat2.m37583k());
        }

        @Override // androidx.core.view.C1170a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
                if (findVisibleDrawer != null) {
                    CharSequence drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer));
                    if (drawerTitle != null) {
                        text.add(drawerTitle);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.ACCESSIBILITY_CLASS_NAME);
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat m37608V = AccessibilityNodeInfoCompat.m37608V(accessibilityNodeInfoCompat);
                super.onInitializeAccessibilityNodeInfo(view, m37608V);
                accessibilityNodeInfoCompat.m37632G0(view);
                ViewParent m37246H = C1365w0.m37246H(view);
                if (m37246H instanceof View) {
                    accessibilityNodeInfoCompat.m37554y0((View) m37246H);
                }
                m36752b(accessibilityNodeInfoCompat, m37608V);
                m37608V.m37606X();
                m36753a(accessibilityNodeInfoCompat, (ViewGroup) view);
            }
            accessibilityNodeInfoCompat.m37590g0(DrawerLayout.ACCESSIBILITY_CLASS_NAME);
            accessibilityNodeInfoCompat.m37576n0(false);
            accessibilityNodeInfoCompat.m37574o0(false);
            accessibilityNodeInfoCompat.m37605Y(AccessibilityNodeInfoCompat.C1178a.f3606e);
            accessibilityNodeInfoCompat.m37605Y(AccessibilityNodeInfoCompat.C1178a.f3607f);
        }

        @Override // androidx.core.view.C1170a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.CAN_HIDE_DESCENDANTS && !DrawerLayout.includeChildForAccessibility(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        CAN_HIDE_DESCENDANTS = true;
        SET_DRAWER_SHADOW_FROM_ELEVATION = true;
        if (i < 29) {
            z = false;
        }
        sEdgeSizeUsingSystemGestureInsets = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    static String gravityToString(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    private static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1457d) getChildAt(i).getLayoutParams()).f3833c) {
                return true;
            }
        }
        return false;
    }

    private boolean hasVisibleDrawer() {
        return findVisibleDrawer() != null;
    }

    static boolean includeChildForAccessibility(View view) {
        if (C1365w0.m37168z(view) != 4 && C1365w0.m37168z(view) != 2) {
            return true;
        }
        return false;
    }

    private boolean isInBoundsOfChild(float f, float f2, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f, (int) f2);
    }

    private void mirror(Drawable drawable, int i) {
        if (drawable != null && C1013a.m38090h(drawable)) {
            C1013a.m38085m(drawable, i);
        }
    }

    private Drawable resolveLeftShadow() {
        int m37258B = C1365w0.m37258B(this);
        if (m37258B == 0) {
            Drawable drawable = this.mShadowStart;
            if (drawable != null) {
                mirror(drawable, m37258B);
                return this.mShadowStart;
            }
        } else {
            Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                mirror(drawable2, m37258B);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        int m37258B = C1365w0.m37258B(this);
        if (m37258B == 0) {
            Drawable drawable = this.mShadowEnd;
            if (drawable != null) {
                mirror(drawable, m37258B);
                return this.mShadowEnd;
            }
        } else {
            Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                mirror(drawable2, m37258B);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    private void resolveShadowDrawables() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        this.mShadowLeftResolved = resolveLeftShadow();
        this.mShadowRightResolved = resolveRightShadow();
    }

    private void updateChildAccessibilityAction(View view) {
        AccessibilityNodeInfoCompat.C1178a c1178a = AccessibilityNodeInfoCompat.C1178a.f3626y;
        C1365w0.m37197k0(view, c1178a.m37550b());
        if (isDrawerOpen(view) && getDrawerLockMode(view) != 2) {
            C1365w0.m37193m0(view, c1178a, null, this.mActionDismiss);
        }
    }

    private void updateChildrenImportantForAccessibility(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !isDrawerView(childAt)) || (z && childAt == view)) {
                C1365w0.m37259A0(childAt, 1);
            } else {
                C1365w0.m37259A0(childAt, 4);
            }
        }
    }

    public void addDrawerListener(DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (isDrawerView(childAt)) {
                if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.mNonDrawerViews.add(childAt);
            }
        }
        if (!z) {
            int size = this.mNonDrawerViews.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.mNonDrawerViews.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.mNonDrawerViews.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() == null && !isDrawerView(view)) {
            C1365w0.m37259A0(view, 1);
        } else {
            C1365w0.m37259A0(view, 4);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            C1365w0.m37185q0(view, this.mChildAccessibilityDelegate);
        }
    }

    void cancelChildViewTouch() {
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1457d) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        closeDrawer(8388611);
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C1457d) getChildAt(i).getLayoutParams()).f3832b);
        }
        this.mScrimOpacity = f;
        boolean m36775m = this.mLeftDragger.m36775m(true);
        boolean m36775m2 = this.mRightDragger.m36775m(true);
        if (m36775m || m36775m2) {
            C1365w0.m37203h0(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.mScrimOpacity > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; i >= 0; i--) {
                    View childAt = getChildAt(i);
                    if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    void dispatchOnDrawerClosed(View view) {
        View rootView;
        C1457d c1457d = (C1457d) view.getLayoutParams();
        if ((c1457d.f3834d & 1) == 1) {
            c1457d.f3834d = 0;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            updateChildAccessibilityAction(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    void dispatchOnDrawerOpened(View view) {
        C1457d c1457d = (C1457d) view.getLayoutParams();
        if ((c1457d.f3834d & 1) == 0) {
            c1457d.f3834d = 1;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            updateChildAccessibilityAction(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void dispatchOnDrawerSlide(View view, float f) {
        List<DrawerListener> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onDrawerSlide(view, f);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean isContentView = isContentView(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (isContentView) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.mScrimOpacity;
        if (f > 0.0f && isContentView) {
            this.mScrimPaint.setColor((this.mScrimColor & 16777215) | (((int) ((((-16777216) & i) >>> 24) * f)) << 24));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.mLeftDragger.m36764x(), (float) TOUCH_SLOP_SENSITIVITY));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.mRightDragger.m36764x(), (float) TOUCH_SLOP_SENSITIVITY));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    View findDrawerWithGravity(int i) {
        int m37321b = C1336t.m37321b(i, C1365w0.m37258B(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == m37321b) {
                return childAt;
            }
        }
        return null;
    }

    View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C1457d) childAt.getLayoutParams()).f3834d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1457d(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1457d) {
            return new C1457d((C1457d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1457d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1457d(layoutParams);
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i) {
        int m37258B = C1365w0.m37258B(this);
        if (i == 3) {
            int i2 = this.mLockModeLeft;
            if (i2 != 3) {
                return i2;
            }
            int i3 = m37258B == 0 ? this.mLockModeStart : this.mLockModeEnd;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.mLockModeRight;
            if (i4 != 3) {
                return i4;
            }
            int i5 = m37258B == 0 ? this.mLockModeEnd : this.mLockModeStart;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.mLockModeStart;
            if (i6 != 3) {
                return i6;
            }
            int i7 = m37258B == 0 ? this.mLockModeLeft : this.mLockModeRight;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.mLockModeEnd;
            if (i8 != 3) {
                return i8;
            }
            int i9 = m37258B == 0 ? this.mLockModeRight : this.mLockModeLeft;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    public CharSequence getDrawerTitle(int i) {
        int m37321b = C1336t.m37321b(i, C1365w0.m37258B(this));
        if (m37321b == 3) {
            return this.mTitleLeft;
        }
        if (m37321b == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    int getDrawerViewAbsoluteGravity(View view) {
        return C1336t.m37321b(((C1457d) view.getLayoutParams()).f3831a, C1365w0.m37258B(this));
    }

    float getDrawerViewOffset(View view) {
        return ((C1457d) view.getLayoutParams()).f3832b;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    boolean isContentView(View view) {
        return ((C1457d) view.getLayoutParams()).f3831a == 0;
    }

    public boolean isDrawerOpen(View view) {
        if (isDrawerView(view)) {
            return (((C1457d) view.getLayoutParams()).f3834d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean isDrawerView(View view) {
        int m37321b = C1336t.m37321b(((C1457d) view.getLayoutParams()).f3831a, C1365w0.m37258B(view));
        if ((m37321b & 3) != 0 || (m37321b & 5) != 0) {
            return true;
        }
        return false;
    }

    public boolean isDrawerVisible(View view) {
        if (isDrawerView(view)) {
            return ((C1457d) view.getLayoutParams()).f3832b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isOpen() {
        return isDrawerOpen(8388611);
    }

    void moveDrawerToOffset(View view, float f) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            Object obj = this.mLastInsets;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.ViewDragHelper r1 = r6.mLeftDragger
            boolean r1 = r1.m36790P(r7)
            androidx.customview.widget.ViewDragHelper r2 = r6.mRightDragger
            boolean r2 = r2.m36790P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            androidx.customview.widget.ViewDragHelper r7 = r6.mLeftDragger
            boolean r7 = r7.m36784d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r7 = r6.mLeftCallback
            r7.m36755p()
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r7 = r6.mRightCallback
            r7.m36755p()
            goto L36
        L31:
            r6.closeDrawers(r2)
            r6.mChildrenCanceledTouch = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.mInitialMotionX = r0
            r6.mInitialMotionY = r7
            float r4 = r6.mScrimOpacity
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            androidx.customview.widget.ViewDragHelper r4 = r6.mLeftDragger
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.m36768t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.isContentView(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.mChildrenCanceledTouch = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.hasPeekingDrawer()
            if (r7 != 0) goto L70
            boolean r7 = r6.mChildrenCanceledTouch
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && hasVisibleDrawer()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View findVisibleDrawer = findVisibleDrawer();
            if (findVisibleDrawer != null && getDrawerLockMode(findVisibleDrawer) == 0) {
                closeDrawers();
            }
            if (findVisibleDrawer != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        int i5;
        float f;
        int i6;
        boolean z2;
        int i7;
        boolean z3 = true;
        this.mInLayout = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C1457d c1457d = (C1457d) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) c1457d).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) c1457d).topMargin, childAt.getMeasuredWidth() + i10, ((ViewGroup.MarginLayoutParams) c1457d).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (c1457d.f3832b * f2));
                        f = (measuredWidth + i6) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i8 - i5) / f3;
                        i6 = i8 - ((int) (c1457d.f3832b * f3));
                    }
                    if (f != c1457d.f3832b) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                    int i11 = c1457d.f3831a & 112;
                    if (i11 != 16) {
                        if (i11 != 80) {
                            int i12 = ((ViewGroup.MarginLayoutParams) c1457d).topMargin;
                            childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                        } else {
                            int i13 = i4 - i2;
                            childAt.layout(i6, (i13 - ((ViewGroup.MarginLayoutParams) c1457d).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i13 - ((ViewGroup.MarginLayoutParams) c1457d).bottomMargin);
                        }
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) c1457d).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight;
                            int i18 = ((ViewGroup.MarginLayoutParams) c1457d).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i15, measuredWidth + i6, measuredHeight + i15);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f);
                    }
                    if (c1457d.f3832b > 0.0f) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    if (childAt.getVisibility() != i7) {
                        childAt.setVisibility(i7);
                    }
                }
            }
            i9++;
            z3 = true;
        }
        if (sEdgeSizeUsingSystemGestureInsets && (rootWindowInsets = getRootWindowInsets()) != null) {
            Insets m37736k = WindowInsetsCompat.m37722y(rootWindowInsets).m37736k();
            ViewDragHelper viewDragHelper = this.mLeftDragger;
            viewDragHelper.m36794L(Math.max(viewDragHelper.m36765w(), m37736k.f3340a));
            ViewDragHelper viewDragHelper2 = this.mRightDragger;
            viewDragHelper2.m36794L(Math.max(viewDragHelper2.m36765w(), m37736k.f3342c));
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        boolean z;
        int drawerViewAbsoluteGravity;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.mLastInsets != null && C1365w0.m37170y(this)) {
            z = true;
        } else {
            z = false;
        }
        int m37258B = C1365w0.m37258B(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1457d c1457d = (C1457d) childAt.getLayoutParams();
                if (z) {
                    int m37321b = C1336t.m37321b(c1457d.f3831a, m37258B);
                    if (C1365w0.m37170y(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.mLastInsets;
                        if (m37321b == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (m37321b == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.mLastInsets;
                        if (m37321b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (m37321b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c1457d).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c1457d).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c1457d).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c1457d).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c1457d).leftMargin) - ((ViewGroup.MarginLayoutParams) c1457d).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c1457d).topMargin) - ((ViewGroup.MarginLayoutParams) c1457d).bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float m37174w = C1365w0.m37174w(childAt);
                        float f = this.mDrawerElevation;
                        if (m37174w != f) {
                            C1365w0.m37169y0(childAt, f);
                        }
                    }
                    if ((getDrawerViewAbsoluteGravity(childAt) & 7) == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((z2 && z3) || (!z2 && z4)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this " + TAG + " already has a drawer view along that edge");
                    }
                    if (z2) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.mMinDrawerMargin + ((ViewGroup.MarginLayoutParams) c1457d).leftMargin + ((ViewGroup.MarginLayoutParams) c1457d).rightMargin, ((ViewGroup.MarginLayoutParams) c1457d).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c1457d).topMargin + ((ViewGroup.MarginLayoutParams) c1457d).bottomMargin, ((ViewGroup.MarginLayoutParams) c1457d).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View findDrawerWithGravity;
        if (!(parcelable instanceof C1458e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1458e c1458e = (C1458e) parcelable;
        super.onRestoreInstanceState(c1458e.m34884a());
        int i = c1458e.f3835l;
        if (i != 0 && (findDrawerWithGravity = findDrawerWithGravity(i)) != null) {
            openDrawer(findDrawerWithGravity);
        }
        int i2 = c1458e.f3836m;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = c1458e.f3837n;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = c1458e.f3838o;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = c1458e.f3839p;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        resolveShadowDrawables();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z;
        C1458e c1458e = new C1458e(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1457d c1457d = (C1457d) getChildAt(i).getLayoutParams();
            int i2 = c1457d.f3834d;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                c1458e.f3835l = c1457d.f3831a;
                break;
            }
        }
        c1458e.f3836m = this.mLockModeLeft;
        c1458e.f3837n = this.mLockModeRight;
        c1458e.f3838o = this.mLockModeStart;
        c1458e.f3839p = this.mLockModeEnd;
        return c1458e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (getDrawerLockMode(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.ViewDragHelper r0 = r6.mLeftDragger
            r0.m36800F(r7)
            androidx.customview.widget.ViewDragHelper r0 = r6.mRightDragger
            r0.m36800F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.closeDrawers(r2)
            r6.mChildrenCanceledTouch = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.ViewDragHelper r3 = r6.mLeftDragger
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m36768t(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.isContentView(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.mInitialMotionX
            float r0 = r0 - r3
            float r3 = r6.mInitialMotionY
            float r7 = r7 - r3
            androidx.customview.widget.ViewDragHelper r3 = r6.mLeftDragger
            int r3 = r3.m36762z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.findOpenDrawer()
            if (r7 == 0) goto L5a
            int r7 = r6.getDrawerLockMode(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.closeDrawers(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.mInitialMotionX = r0
            r6.mInitialMotionY = r7
            r6.mChildrenCanceledTouch = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void open() {
        openDrawer(8388611);
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(DrawerListener drawerListener) {
        List<DrawerListener> list;
        if (drawerListener == null || (list = this.mListeners) == null) {
            return;
        }
        list.remove(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            closeDrawers(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.mInLayout) {
            super.requestLayout();
        }
    }

    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        if (!z && getBackground() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                C1365w0.m37169y0(childAt, this.mDrawerElevation);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        DrawerListener drawerListener2 = this.mListener;
        if (drawerListener2 != null) {
            removeDrawerListener(drawerListener2);
        }
        if (drawerListener != null) {
            addDrawerListener(drawerListener);
        }
        this.mListener = drawerListener;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        if ((i & 8388611) == 8388611) {
            this.mShadowStart = drawable;
        } else if ((i & 8388613) == 8388613) {
            this.mShadowEnd = drawable;
        } else if ((i & 3) == 3) {
            this.mShadowLeft = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.mShadowRight = drawable;
        }
        resolveShadowDrawables();
        invalidate();
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int m37321b = C1336t.m37321b(i, C1365w0.m37258B(this));
        if (m37321b == 3) {
            this.mTitleLeft = charSequence;
        } else if (m37321b == 5) {
            this.mTitleRight = charSequence;
        }
    }

    void setDrawerViewOffset(View view, float f) {
        C1457d c1457d = (C1457d) view.getLayoutParams();
        if (f == c1457d.f3832b) {
            return;
        }
        c1457d.f3832b = f;
        dispatchOnDrawerSlide(view, f);
    }

    public void setScrimColor(int i) {
        this.mScrimColor = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    void updateDrawerState(int i, View view) {
        int i2;
        int m36805A = this.mLeftDragger.m36805A();
        int m36805A2 = this.mRightDragger.m36805A();
        if (m36805A != 1 && m36805A2 != 1) {
            i2 = 2;
            if (m36805A != 2 && m36805A2 != 2) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        if (view != null && i == 0) {
            float f = ((C1457d) view.getLayoutParams()).f3832b;
            if (f == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f == TOUCH_SLOP_SENSITIVITY) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i2 != this.mDrawerState) {
            this.mDrawerState = i2;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i2);
                }
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2376a.f6494a);
    }

    public void closeDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            C1457d c1457d = (C1457d) view.getLayoutParams();
            if (this.mFirstLayout) {
                c1457d.f3832b = 0.0f;
                c1457d.f3834d = 0;
            } else if (z) {
                c1457d.f3834d |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.m36789Q(view, -view.getWidth(), view.getTop());
                } else {
                    this.mRightDragger.m36789Q(view, getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    void closeDrawers(boolean z) {
        boolean m36789Q;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1457d c1457d = (C1457d) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || c1457d.f3833c)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    m36789Q = this.mLeftDragger.m36789Q(childAt, -width, childAt.getTop());
                } else {
                    m36789Q = this.mRightDragger.m36789Q(childAt, getWidth(), childAt.getTop());
                }
                z2 |= m36789Q;
                c1457d.f3833c = false;
            }
        }
        this.mLeftCallback.m36755p();
        this.mRightCallback.m36755p();
        if (z2) {
            invalidate();
        }
    }

    public void openDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            C1457d c1457d = (C1457d) view.getLayoutParams();
            if (this.mFirstLayout) {
                c1457d.f3832b = TOUCH_SLOP_SENSITIVITY;
                c1457d.f3834d = 1;
                updateChildrenImportantForAccessibility(view, true);
                updateChildAccessibilityAction(view);
            } else if (z) {
                c1457d.f3834d |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.m36789Q(view, 0, view.getTop());
                } else {
                    this.mRightDragger.m36789Q(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, TOUCH_SLOP_SENSITIVITY);
                updateDrawerState(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new ChildAccessibilityDelegate();
        this.mScrimColor = DEFAULT_SCRIM_COLOR;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        this.mActionDismiss = new C1454a();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        ViewDragCallback viewDragCallback = new ViewDragCallback(3);
        this.mLeftCallback = viewDragCallback;
        ViewDragCallback viewDragCallback2 = new ViewDragCallback(5);
        this.mRightCallback = viewDragCallback2;
        ViewDragHelper m36774n = ViewDragHelper.m36774n(this, TOUCH_SLOP_SENSITIVITY, viewDragCallback);
        this.mLeftDragger = m36774n;
        m36774n.m36793M(1);
        m36774n.m36792N(f2);
        viewDragCallback.m36754q(m36774n);
        ViewDragHelper m36774n2 = ViewDragHelper.m36774n(this, TOUCH_SLOP_SENSITIVITY, viewDragCallback2);
        this.mRightDragger = m36774n2;
        m36774n2.m36793M(2);
        m36774n2.m36792N(f2);
        viewDragCallback2.m36754q(m36774n2);
        setFocusableInTouchMode(true);
        C1365w0.m37259A0(this, 1);
        C1365w0.m37185q0(this, new C1456c());
        setMotionEventSplittingEnabled(false);
        if (C1365w0.m37170y(this)) {
            setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC1455b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
            try {
                this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C2378c.f6497b, i, 0);
        try {
            int i2 = C2378c.f6498c;
            if (obtainStyledAttributes2.hasValue(i2)) {
                this.mDrawerElevation = obtainStyledAttributes2.getDimension(i2, 0.0f);
            } else {
                this.mDrawerElevation = getResources().getDimension(C2377b.f6495a);
            }
            obtainStyledAttributes2.recycle();
            this.mNonDrawerViews = new ArrayList<>();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setDrawerLockMode(int i, int i2) {
        View findDrawerWithGravity;
        int m37321b = C1336t.m37321b(i2, C1365w0.m37258B(this));
        if (i2 == 3) {
            this.mLockModeLeft = i;
        } else if (i2 == 5) {
            this.mLockModeRight = i;
        } else if (i2 == 8388611) {
            this.mLockModeStart = i;
        } else if (i2 == 8388613) {
            this.mLockModeEnd = i;
        }
        if (i != 0) {
            (m37321b == 3 ? this.mLeftDragger : this.mRightDragger).m36787a();
        }
        if (i != 1) {
            if (i == 2 && (findDrawerWithGravity = findDrawerWithGravity(m37321b)) != null) {
                openDrawer(findDrawerWithGravity);
                return;
            }
            return;
        }
        View findDrawerWithGravity2 = findDrawerWithGravity(m37321b);
        if (findDrawerWithGravity2 != null) {
            closeDrawer(findDrawerWithGravity2);
        }
    }

    public void setStatusBarBackground(int i) {
        this.mStatusBarBackground = i != 0 ? C0946a.m38399e(getContext(), i) : null;
        invalidate();
    }

    public boolean isDrawerVisible(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1457d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3831a;

        /* renamed from: b */
        float f3832b;

        /* renamed from: c */
        boolean f3833c;

        /* renamed from: d */
        int f3834d;

        public C1457d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3831a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.f3831a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C1457d(int i, int i2) {
            super(i, i2);
            this.f3831a = 0;
        }

        public C1457d(C1457d c1457d) {
            super((ViewGroup.MarginLayoutParams) c1457d);
            this.f3831a = 0;
            this.f3831a = c1457d.f3831a;
        }

        public C1457d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3831a = 0;
        }

        public C1457d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3831a = 0;
        }
    }

    public boolean isDrawerOpen(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1457d(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1458e extends AbstractC1964a {
        public static final Parcelable.Creator<C1458e> CREATOR = new C1459a();

        /* renamed from: l */
        int f3835l;

        /* renamed from: m */
        int f3836m;

        /* renamed from: n */
        int f3837n;

        /* renamed from: o */
        int f3838o;

        /* renamed from: p */
        int f3839p;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1459a implements Parcelable.ClassLoaderCreator<C1458e> {
            C1459a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1458e createFromParcel(Parcel parcel) {
                return new C1458e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1458e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1458e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1458e[] newArray(int i) {
                return new C1458e[i];
            }
        }

        public C1458e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3835l = 0;
            this.f3835l = parcel.readInt();
            this.f3836m = parcel.readInt();
            this.f3837n = parcel.readInt();
            this.f3838o = parcel.readInt();
            this.f3839p = parcel.readInt();
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3835l);
            parcel.writeInt(this.f3836m);
            parcel.writeInt(this.f3837n);
            parcel.writeInt(this.f3838o);
            parcel.writeInt(this.f3839p);
        }

        public C1458e(Parcelable parcelable) {
            super(parcelable);
            this.f3835l = 0;
        }
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(C0946a.m38399e(getContext(), i), i2);
    }

    public int getDrawerLockMode(View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((C1457d) view.getLayoutParams()).f3831a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerLockMode(int i, View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i, ((C1457d) view.getLayoutParams()).f3831a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void closeDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i));
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void openDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i));
    }
}
