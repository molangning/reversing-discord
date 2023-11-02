package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.C1195b;
import androidx.core.view.accessibility.C1223z;
import androidx.customview.widget.FocusStrategy;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class ExploreByTouchHelper extends C1170a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> NODE_ADAPTER = new C1447a();
    private static final FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> SPARSE_VALUES_ADAPTER = new C1448b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private MyNodeProvider mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class MyNodeProvider extends AccessibilityNodeProviderCompat {
        MyNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /* renamed from: b */
        public AccessibilityNodeInfoCompat mo36829b(int i) {
            return AccessibilityNodeInfoCompat.m37608V(ExploreByTouchHelper.this.obtainAccessibilityNodeInfo(i));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /* renamed from: d */
        public AccessibilityNodeInfoCompat mo36828d(int i) {
            int i2;
            if (i == 2) {
                i2 = ExploreByTouchHelper.this.mAccessibilityFocusedVirtualViewId;
            } else {
                i2 = ExploreByTouchHelper.this.mKeyboardFocusedVirtualViewId;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo36829b(i2);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /* renamed from: f */
        public boolean mo36827f(int i, int i2, Bundle bundle) {
            return ExploreByTouchHelper.this.performAction(i, i2, bundle);
        }
    }

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1447a implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> {
        C1447a() {
        }

        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        /* renamed from: b */
        public void mo36808a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.m37579m(rect);
        }
    }

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1448b implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
        C1448b() {
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        /* renamed from: c */
        public AccessibilityNodeInfoCompat mo36807a(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat, int i) {
            return sparseArrayCompat.m39510n(i);
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        /* renamed from: d */
        public int mo36806b(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat) {
            return sparseArrayCompat.m39511m();
        }
    }

    public ExploreByTouchHelper(View view) {
        if (view != null) {
            this.mHost = view;
            this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C1365w0.m37168z(view) == 0) {
                C1365w0.m37259A0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i, 65536);
            return true;
        }
        return false;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        if (i != -1) {
            return createEventForChild(i, i2);
        }
        return createEventForHost(i2);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        obtain.getText().add(obtainAccessibilityNodeInfo.m37645A());
        obtain.setContentDescription(obtainAccessibilityNodeInfo.m37567s());
        obtain.setScrollable(obtainAccessibilityNodeInfo.m37615P());
        obtain.setPassword(obtainAccessibilityNodeInfo.m37619N());
        obtain.setEnabled(obtainAccessibilityNodeInfo.m37627J());
        obtain.setChecked(obtainAccessibilityNodeInfo.m37631H());
        onPopulateEventForVirtualView(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(obtainAccessibilityNodeInfo.m37573p());
        C1223z.m37502c(obtain, this.mHost, i);
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private AccessibilityNodeInfoCompat createNodeForChild(int i) {
        boolean z;
        AccessibilityNodeInfoCompat m37610T = AccessibilityNodeInfoCompat.m37610T();
        m37610T.m37580l0(true);
        m37610T.m37576n0(true);
        m37610T.m37590g0(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        m37610T.m37598c0(rect);
        m37610T.m37596d0(rect);
        m37610T.m37554y0(this.mHost);
        onPopulateNodeForVirtualView(i, m37610T);
        if (m37610T.m37645A() == null && m37610T.m37567s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m37610T.m37579m(this.mTempParentRect);
        if (!this.mTempParentRect.equals(rect)) {
            int m37583k = m37610T.m37583k();
            if ((m37583k & 64) == 0) {
                if ((m37583k & 128) == 0) {
                    m37610T.m37558w0(this.mHost.getContext().getPackageName());
                    m37610T.m37630H0(this.mHost, i);
                    if (this.mAccessibilityFocusedVirtualViewId == i) {
                        m37610T.m37602a0(true);
                        m37610T.m37603a(128);
                    } else {
                        m37610T.m37602a0(false);
                        m37610T.m37603a(64);
                    }
                    if (this.mKeyboardFocusedVirtualViewId == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m37610T.m37603a(2);
                    } else if (m37610T.m37625K()) {
                        m37610T.m37603a(1);
                    }
                    m37610T.m37574o0(z);
                    this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                    m37610T.m37577n(this.mTempScreenRect);
                    if (this.mTempScreenRect.equals(rect)) {
                        m37610T.m37579m(this.mTempScreenRect);
                        if (m37610T.f3583b != -1) {
                            AccessibilityNodeInfoCompat m37610T2 = AccessibilityNodeInfoCompat.m37610T();
                            for (int i2 = m37610T.f3583b; i2 != -1; i2 = m37610T2.f3583b) {
                                m37610T2.m37552z0(this.mHost, -1);
                                m37610T2.m37598c0(INVALID_PARENT_BOUNDS);
                                onPopulateNodeForVirtualView(i2, m37610T2);
                                m37610T2.m37579m(this.mTempParentRect);
                                Rect rect2 = this.mTempScreenRect;
                                Rect rect3 = this.mTempParentRect;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            m37610T2.m37606X();
                        }
                        this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                    }
                    if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                        this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                        if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                            m37610T.m37596d0(this.mTempScreenRect);
                            if (isVisibleToUser(this.mTempScreenRect)) {
                                m37610T.m37618N0(true);
                            }
                        }
                    }
                    return m37610T;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    private AccessibilityNodeInfoCompat createNodeForHost() {
        AccessibilityNodeInfoCompat m37609U = AccessibilityNodeInfoCompat.m37609U(this.mHost);
        C1365w0.m37211d0(this.mHost, m37609U);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (m37609U.m37575o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m37609U.m37597d(this.mHost, ((Integer) arrayList.get(i)).intValue());
        }
        return m37609U;
    }

    private SparseArrayCompat<AccessibilityNodeInfoCompat> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat = new SparseArrayCompat<>();
        for (int i = 0; i < arrayList.size(); i++) {
            sparseArrayCompat.m39512l(arrayList.get(i).intValue(), createNodeForChild(arrayList.get(i).intValue()));
        }
        return sparseArrayCompat;
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).m37579m(rect);
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    private static int keyToDirection(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean moveFocus(int i, Rect rect) {
        AccessibilityNodeInfoCompat m39516f;
        boolean z;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        SparseArrayCompat<AccessibilityNodeInfoCompat> allNodes = getAllNodes();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            m39516f = null;
        } else {
            m39516f = allNodes.m39516f(i2);
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = m39516f;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.mKeyboardFocusedVirtualViewId;
            if (i4 != Integer.MIN_VALUE) {
                getBoundsInParent(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i, rect2);
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) FocusStrategy.m36821c(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, accessibilityNodeInfoCompat2, rect2, i);
        } else {
            if (C1365w0.m37258B(this.mHost) == 1) {
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) FocusStrategy.m36820d(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, accessibilityNodeInfoCompat2, i, z, false);
        }
        if (accessibilityNodeInfoCompat != null) {
            i3 = allNodes.m39513k(allNodes.m39514j(accessibilityNodeInfoCompat));
        }
        return requestKeyboardFocusForVirtualView(i3);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return onPerformActionForVirtualView(i, i2, bundle);
                    }
                    return clearAccessibilityFocus(i);
                }
                return requestAccessibilityFocus(i);
            }
            return clearKeyboardFocusForVirtualView(i);
        }
        return requestKeyboardFocusForVirtualView(i);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return C1365w0.m37207f0(this.mHost, i, bundle);
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                return false;
            }
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
        int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
        updateHoveredVirtualView(virtualViewAt);
        if (virtualViewAt == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int keyToDirection = keyToDirection(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && moveFocus(keyToDirection, null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            clickKeyboardFocusedVirtualView();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return moveFocus(2, null);
        } else {
            if (!keyEvent.hasModifiers(1)) {
                return false;
            }
            return moveFocus(1, null);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.C1170a
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new MyNodeProvider();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    protected abstract int getVirtualViewAt(float f, float f2);

    protected abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int i) {
        if (i == -1) {
            return createNodeForHost();
        }
        return createNodeForChild(i);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    @Override // androidx.core.view.C1170a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.C1170a
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        onPopulateNodeForHost(accessibilityNodeInfoCompat);
    }

    protected abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected abstract void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    protected void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    boolean performAction(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return performActionForChild(i, i2, bundle);
        }
        return performActionForHost(i2, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i, i2));
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent createEvent = createEvent(i, RecyclerView.ItemAnimator.FLAG_MOVED);
        C1195b.m37533b(createEvent, i2);
        parent.requestSendAccessibilityEvent(this.mHost, createEvent);
    }
}
