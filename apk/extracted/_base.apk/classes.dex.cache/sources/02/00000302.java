package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0946a;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.util.C1134c;
import androidx.core.util.InterfaceC1137e;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.C1336t;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1314p0;
import androidx.core.view.InterfaceC1319q0;
import androidx.core.view.InterfaceC1324r0;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p020b0.AbstractC1964a;
import p341t.C12565a;
import p341t.C12566b;
import p341t.C12567c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC1314p0, InterfaceC1319q0 {

    /* renamed from: D */
    static final String f2944D;

    /* renamed from: E */
    static final Class<?>[] f2945E;

    /* renamed from: F */
    static final ThreadLocal<Map<String, Constructor<AbstractC0682c>>> f2946F;

    /* renamed from: G */
    static final Comparator<View> f2947G;

    /* renamed from: H */
    private static final InterfaceC1137e<Rect> f2948H;

    /* renamed from: A */
    ViewGroup.OnHierarchyChangeListener f2949A;

    /* renamed from: B */
    private InterfaceC1324r0 f2950B;

    /* renamed from: C */
    private final NestedScrollingParentHelper f2951C;

    /* renamed from: j */
    private final List<View> f2952j;

    /* renamed from: k */
    private final C0690a<View> f2953k;

    /* renamed from: l */
    private final List<View> f2954l;

    /* renamed from: m */
    private final List<View> f2955m;

    /* renamed from: n */
    private Paint f2956n;

    /* renamed from: o */
    private final int[] f2957o;

    /* renamed from: p */
    private final int[] f2958p;

    /* renamed from: q */
    private boolean f2959q;

    /* renamed from: r */
    private boolean f2960r;

    /* renamed from: s */
    private int[] f2961s;

    /* renamed from: t */
    private View f2962t;

    /* renamed from: u */
    private View f2963u;

    /* renamed from: v */
    private ViewTreeObserver$OnPreDrawListenerC0686g f2964v;

    /* renamed from: w */
    private boolean f2965w;

    /* renamed from: x */
    private WindowInsetsCompat f2966x;

    /* renamed from: y */
    private boolean f2967y;

    /* renamed from: z */
    private Drawable f2968z;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0680a implements InterfaceC1324r0 {
        C0680a() {
            CoordinatorLayout.this = r1;
        }

        @Override // androidx.core.view.InterfaceC1324r0
        /* renamed from: a */
        public WindowInsetsCompat mo24794a(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.m39211Q(windowInsetsCompat);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0681b {
        AbstractC0682c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC0682c<V extends View> {
        public AbstractC0682c() {
        }

        /* renamed from: A */
        public boolean mo27761A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return m39172z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m39183B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo27758C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m39183B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo26457D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m39182a(CoordinatorLayout coordinatorLayout, V v) {
            return m39180d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo27158b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m39181c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float m39180d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo26454e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public WindowInsetsCompat m39179f(CoordinatorLayout coordinatorLayout, V v, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        /* renamed from: g */
        public void mo26458g(C0685f c0685f) {
        }

        /* renamed from: h */
        public boolean mo26482h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo27892i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo27714j() {
        }

        /* renamed from: k */
        public boolean mo26796k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo26481l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo27710m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean m39178n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo27707o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m39177p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo27704q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m39177p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void m39176r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void m39175s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m39176r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo27700t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            m39175s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void m39174u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void m39173v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m39174u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo27891w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo27695x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo27693y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean m39172z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public AbstractC0682c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public @interface InterfaceC0683d {
        Class<? extends AbstractC0682c> value();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class ViewGroup$OnHierarchyChangeListenerC0684e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC0684e() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2949A;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m39226B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2949A;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC0686g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC0686g() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m39226B(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0689i implements Comparator<View> {
        C0689i() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(View view, View view2) {
            float m37234N = C1365w0.m37234N(view);
            float m37234N2 = C1365w0.m37234N(view2);
            if (m37234N > m37234N2) {
                return -1;
            }
            if (m37234N < m37234N2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        f2944D = str;
        f2947G = new C0689i();
        f2945E = new Class[]{Context.class, AttributeSet.class};
        f2946F = new ThreadLocal<>();
        f2948H = new Pools$SynchronizedPool(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    static AbstractC0682c m39223E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2944D;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0682c>>> threadLocal = f2946F;
            Map<String, Constructor<AbstractC0682c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC0682c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2945E);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: F */
    private boolean m39222F(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2954l;
        m39190t(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0685f c0685f = (C0685f) view.getLayoutParams();
            AbstractC0682c m39166f = c0685f.m39166f();
            if ((z || z2) && actionMasked != 0) {
                if (m39166f != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            m39166f.mo26457D(this, view, motionEvent2);
                        }
                    } else {
                        m39166f.mo26796k(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z && m39166f != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z = m39166f.mo26457D(this, view, motionEvent);
                        }
                    } else {
                        z = m39166f.mo26796k(this, view, motionEvent);
                    }
                    if (z) {
                        this.f2962t = view;
                    }
                }
                boolean m39169c = c0685f.m39169c();
                boolean m39163i = c0685f.m39163i(this, view);
                if (m39163i && !m39169c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m39163i && !z2) {
                    break;
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: G */
    private void m39221G() {
        this.f2952j.clear();
        this.f2953k.m39145c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0685f m39191s = m39191s(childAt);
            m39191s.m39168d(this, childAt);
            this.f2953k.m39146b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (m39191s.m39170b(this, childAt, childAt2)) {
                        if (!this.f2953k.m39144d(childAt2)) {
                            this.f2953k.m39146b(childAt2);
                        }
                        this.f2953k.m39147a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2952j.addAll(this.f2953k.m39139i());
        Collections.reverse(this.f2952j);
    }

    /* renamed from: I */
    private static void m39219I(Rect rect) {
        rect.setEmpty();
        f2948H.release(rect);
    }

    /* renamed from: K */
    private void m39217K(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0682c m39166f = ((C0685f) childAt.getLayoutParams()).m39166f();
            if (m39166f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    m39166f.mo26796k(this, childAt, obtain);
                } else {
                    m39166f.mo26457D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0685f) getChildAt(i2).getLayoutParams()).m39159m();
        }
        this.f2962t = null;
        this.f2959q = false;
    }

    /* renamed from: L */
    private static int m39216L(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: M */
    private static int m39215M(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: N */
    private static int m39214N(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: O */
    private void m39213O(View view, int i) {
        C0685f c0685f = (C0685f) view.getLayoutParams();
        int i2 = c0685f.f2979i;
        if (i2 != i) {
            C1365w0.m37217a0(view, i - i2);
            c0685f.f2979i = i;
        }
    }

    /* renamed from: P */
    private void m39212P(View view, int i) {
        C0685f c0685f = (C0685f) view.getLayoutParams();
        int i2 = c0685f.f2980j;
        if (i2 != i) {
            C1365w0.m37215b0(view, i - i2);
            c0685f.f2980j = i;
        }
    }

    /* renamed from: R */
    private void m39210R() {
        if (C1365w0.m37170y(this)) {
            if (this.f2950B == null) {
                this.f2950B = new C0680a();
            }
            C1365w0.m37253D0(this, this.f2950B);
            setSystemUiVisibility(1280);
            return;
        }
        C1365w0.m37253D0(this, null);
    }

    /* renamed from: a */
    private static Rect m39209a() {
        Rect acquire = f2948H.acquire();
        if (acquire == null) {
            return new Rect();
        }
        return acquire;
    }

    /* renamed from: c */
    private static int m39207c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: d */
    private void m39206d(C0685f c0685f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0685f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0685f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0685f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0685f).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: e */
    private WindowInsetsCompat m39205e(WindowInsetsCompat windowInsetsCompat) {
        AbstractC0682c m39166f;
        if (windowInsetsCompat.m37729r()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C1365w0.m37170y(childAt) && (m39166f = ((C0685f) childAt.getLayoutParams()).m39166f()) != null) {
                windowInsetsCompat = m39166f.m39179f(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.m37729r()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: p */
    private void m39194p(View view, int i, Rect rect, Rect rect2, C0685f c0685f, int i2, int i3) {
        int width;
        int height;
        int m37321b = C1336t.m37321b(m39216L(c0685f.f2973c), i);
        int m37321b2 = C1336t.m37321b(m39215M(c0685f.f2974d), i);
        int i4 = m37321b & 7;
        int i5 = m37321b & 112;
        int i6 = m37321b2 & 7;
        int i7 = m37321b2 & 112;
        if (i6 != 1) {
            if (i6 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i4 != 1) {
            if (i4 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i5 != 16) {
            if (i5 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: q */
    private int m39193q(int i) {
        int[] iArr = this.f2961s;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: t */
    private void m39190t(List<View> list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator<View> comparator = f2947G;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: u */
    private boolean m39189u(View view) {
        return this.f2953k.m39138j(view);
    }

    /* renamed from: w */
    private void m39187w(View view, int i) {
        C0685f c0685f = (C0685f) view.getLayoutParams();
        Rect m39209a = m39209a();
        m39209a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0685f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0685f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0685f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0685f).bottomMargin);
        if (this.f2966x != null && C1365w0.m37170y(this) && !C1365w0.m37170y(view)) {
            m39209a.left += this.f2966x.m37734m();
            m39209a.top += this.f2966x.m37732o();
            m39209a.right -= this.f2966x.m37733n();
            m39209a.bottom -= this.f2966x.m37735l();
        }
        Rect m39209a2 = m39209a();
        C1336t.m37322a(m39215M(c0685f.f2973c), view.getMeasuredWidth(), view.getMeasuredHeight(), m39209a, m39209a2, i);
        view.layout(m39209a2.left, m39209a2.top, m39209a2.right, m39209a2.bottom);
        m39219I(m39209a);
        m39219I(m39209a2);
    }

    /* renamed from: x */
    private void m39186x(View view, View view2, int i) {
        Rect m39209a = m39209a();
        Rect m39209a2 = m39209a();
        try {
            m39196n(view2, m39209a);
            m39195o(view, i, m39209a, m39209a2);
            view.layout(m39209a2.left, m39209a2.top, m39209a2.right, m39209a2.bottom);
        } finally {
            m39219I(m39209a);
            m39219I(m39209a2);
        }
    }

    /* renamed from: y */
    private void m39185y(View view, int i, int i2) {
        C0685f c0685f = (C0685f) view.getLayoutParams();
        int m37321b = C1336t.m37321b(m39214N(c0685f.f2973c), i2);
        int i3 = m37321b & 7;
        int i4 = m37321b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int m39193q = m39193q(i) - measuredWidth;
        if (i3 != 1) {
            if (i3 == 5) {
                m39193q += measuredWidth;
            }
        } else {
            m39193q += measuredWidth / 2;
        }
        int i5 = 0;
        if (i4 != 16) {
            if (i4 == 80) {
                i5 = measuredHeight + 0;
            }
        } else {
            i5 = 0 + (measuredHeight / 2);
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0685f).leftMargin, Math.min(m39193q, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0685f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0685f).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0685f).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: z */
    private void m39184z(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C1365w0.m37224U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0685f c0685f = (C0685f) view.getLayoutParams();
            AbstractC0682c m39166f = c0685f.m39166f();
            Rect m39209a = m39209a();
            Rect m39209a2 = m39209a();
            m39209a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m39166f != null && m39166f.mo27158b(this, view, m39209a)) {
                if (!m39209a2.contains(m39209a)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m39209a.toShortString() + " | Bounds:" + m39209a2.toShortString());
                }
            } else {
                m39209a.set(m39209a2);
            }
            m39219I(m39209a2);
            if (m39209a.isEmpty()) {
                m39219I(m39209a);
                return;
            }
            int m37321b = C1336t.m37321b(c0685f.f2978h, i);
            boolean z3 = true;
            if ((m37321b & 48) == 48 && (i6 = (m39209a.top - ((ViewGroup.MarginLayoutParams) c0685f).topMargin) - c0685f.f2980j) < (i7 = rect.top)) {
                m39212P(view, i7 - i6);
                z = true;
            } else {
                z = false;
            }
            if ((m37321b & 80) == 80 && (height = ((getHeight() - m39209a.bottom) - ((ViewGroup.MarginLayoutParams) c0685f).bottomMargin) + c0685f.f2980j) < (i5 = rect.bottom)) {
                m39212P(view, height - i5);
                z = true;
            }
            if (!z) {
                m39212P(view, 0);
            }
            if ((m37321b & 3) == 3 && (i3 = (m39209a.left - ((ViewGroup.MarginLayoutParams) c0685f).leftMargin) - c0685f.f2979i) < (i4 = rect.left)) {
                m39213O(view, i4 - i3);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((m37321b & 5) == 5 && (width = ((getWidth() - m39209a.right) - ((ViewGroup.MarginLayoutParams) c0685f).rightMargin) + c0685f.f2979i) < (i2 = rect.right)) {
                m39213O(view, width - i2);
            } else {
                z3 = z2;
            }
            if (!z3) {
                m39213O(view, 0);
            }
            m39219I(m39209a);
        }
    }

    /* renamed from: A */
    void m39227A(View view, int i) {
        AbstractC0682c m39166f;
        C0685f c0685f = (C0685f) view.getLayoutParams();
        if (c0685f.f2981k != null) {
            Rect m39209a = m39209a();
            Rect m39209a2 = m39209a();
            Rect m39209a3 = m39209a();
            m39196n(c0685f.f2981k, m39209a);
            boolean z = false;
            m39199k(view, false, m39209a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m39194p(view, i, m39209a, m39209a3, c0685f, measuredWidth, measuredHeight);
            z = (m39209a3.left == m39209a2.left && m39209a3.top == m39209a2.top) ? true : true;
            m39206d(c0685f, m39209a3, measuredWidth, measuredHeight);
            int i2 = m39209a3.left - m39209a2.left;
            int i3 = m39209a3.top - m39209a2.top;
            if (i2 != 0) {
                C1365w0.m37217a0(view, i2);
            }
            if (i3 != 0) {
                C1365w0.m37215b0(view, i3);
            }
            if (z && (m39166f = c0685f.m39166f()) != null) {
                m39166f.mo26482h(this, view, c0685f.f2981k);
            }
            m39219I(m39209a);
            m39219I(m39209a2);
            m39219I(m39209a3);
        }
    }

    /* renamed from: B */
    final void m39226B(int i) {
        boolean z;
        int m37258B = C1365w0.m37258B(this);
        int size = this.f2952j.size();
        Rect m39209a = m39209a();
        Rect m39209a2 = m39209a();
        Rect m39209a3 = m39209a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2952j.get(i2);
            C0685f c0685f = (C0685f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c0685f.f2982l == this.f2952j.get(i3)) {
                        m39227A(view, m37258B);
                    }
                }
                m39199k(view, true, m39209a2);
                if (c0685f.f2977g != 0 && !m39209a2.isEmpty()) {
                    int m37321b = C1336t.m37321b(c0685f.f2977g, m37258B);
                    int i4 = m37321b & 112;
                    if (i4 != 48) {
                        if (i4 == 80) {
                            m39209a.bottom = Math.max(m39209a.bottom, getHeight() - m39209a2.top);
                        }
                    } else {
                        m39209a.top = Math.max(m39209a.top, m39209a2.bottom);
                    }
                    int i5 = m37321b & 7;
                    if (i5 != 3) {
                        if (i5 == 5) {
                            m39209a.right = Math.max(m39209a.right, getWidth() - m39209a2.left);
                        }
                    } else {
                        m39209a.left = Math.max(m39209a.left, m39209a2.right);
                    }
                }
                if (c0685f.f2978h != 0 && view.getVisibility() == 0) {
                    m39184z(view, m39209a, m37258B);
                }
                if (i != 2) {
                    m39192r(view, m39209a3);
                    if (!m39209a3.equals(m39209a2)) {
                        m39220H(view, m39209a2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f2952j.get(i6);
                    C0685f c0685f2 = (C0685f) view2.getLayoutParams();
                    AbstractC0682c m39166f = c0685f2.m39166f();
                    if (m39166f != null && m39166f.mo26454e(this, view2, view)) {
                        if (i == 0 && c0685f2.m39165g()) {
                            c0685f2.m39161k();
                        } else {
                            if (i != 2) {
                                z = m39166f.mo26482h(this, view2, view);
                            } else {
                                m39166f.mo27892i(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c0685f2.m39156p(z);
                            }
                        }
                    }
                }
            }
        }
        m39219I(m39209a);
        m39219I(m39209a2);
        m39219I(m39209a3);
    }

    /* renamed from: C */
    public void m39225C(View view, int i) {
        C0685f c0685f = (C0685f) view.getLayoutParams();
        if (!c0685f.m39171a()) {
            View view2 = c0685f.f2981k;
            if (view2 != null) {
                m39186x(view, view2, i);
                return;
            }
            int i2 = c0685f.f2975e;
            if (i2 >= 0) {
                m39185y(view, i2, i);
                return;
            } else {
                m39187w(view, i);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* renamed from: D */
    public void m39224D(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: H */
    void m39220H(View view, Rect rect) {
        ((C0685f) view.getLayoutParams()).m39155q(rect);
    }

    /* renamed from: J */
    void m39218J() {
        if (this.f2960r && this.f2964v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2964v);
        }
        this.f2965w = false;
    }

    /* renamed from: Q */
    final WindowInsetsCompat m39211Q(WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        if (!C1134c.m37835a(this.f2966x, windowInsetsCompat)) {
            this.f2966x = windowInsetsCompat;
            boolean z2 = true;
            if (windowInsetsCompat != null && windowInsetsCompat.m37732o() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f2967y = z;
            if (z || getBackground() != null) {
                z2 = false;
            }
            setWillNotDraw(z2);
            WindowInsetsCompat m39205e = m39205e(windowInsetsCompat);
            requestLayout();
            return m39205e;
        }
        return windowInsetsCompat;
    }

    /* renamed from: b */
    void m39208b() {
        if (this.f2960r) {
            if (this.f2964v == null) {
                this.f2964v = new ViewTreeObserver$OnPreDrawListenerC0686g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2964v);
        }
        this.f2965w = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0685f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0685f c0685f = (C0685f) view.getLayoutParams();
        AbstractC0682c abstractC0682c = c0685f.f2971a;
        if (abstractC0682c != null) {
            float m39180d = abstractC0682c.m39180d(this, view);
            if (m39180d > 0.0f) {
                if (this.f2956n == null) {
                    this.f2956n = new Paint();
                }
                this.f2956n.setColor(c0685f.f2971a.m39181c(this, view));
                this.f2956n.setAlpha(m39207c(Math.round(m39180d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2956n);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2968z;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void m39204f(View view) {
        List m39141g = this.f2953k.m39141g(view);
        if (m39141g != null && !m39141g.isEmpty()) {
            for (int i = 0; i < m39141g.size(); i++) {
                View view2 = (View) m39141g.get(i);
                AbstractC0682c m39166f = ((C0685f) view2.getLayoutParams()).m39166f();
                if (m39166f != null) {
                    m39166f.mo26482h(this, view2, view);
                }
            }
        }
    }

    /* renamed from: g */
    void m39203g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m39189u(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.f2965w) {
            if (z) {
                m39208b();
            } else {
                m39218J();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        m39221G();
        return Collections.unmodifiableList(this.f2952j);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f2966x;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2951C.m37751a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2968z;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public C0685f generateDefaultLayoutParams() {
        return new C0685f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public C0685f generateLayoutParams(AttributeSet attributeSet) {
        return new C0685f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public C0685f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0685f) {
            return new C0685f((C0685f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0685f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0685f(layoutParams);
    }

    /* renamed from: k */
    void m39199k(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                m39196n(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    /* renamed from: l */
    public List<View> m39198l(View view) {
        List<View> m39140h = this.f2953k.m39140h(view);
        this.f2955m.clear();
        if (m39140h != null) {
            this.f2955m.addAll(m39140h);
        }
        return this.f2955m;
    }

    /* renamed from: m */
    public List<View> m39197m(View view) {
        List m39141g = this.f2953k.m39141g(view);
        this.f2955m.clear();
        if (m39141g != null) {
            this.f2955m.addAll(m39141g);
        }
        return this.f2955m;
    }

    /* renamed from: n */
    void m39196n(View view, Rect rect) {
        C0691b.m39136a(this, view, rect);
    }

    /* renamed from: o */
    void m39195o(View view, int i, Rect rect, Rect rect2) {
        C0685f c0685f = (C0685f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m39194p(view, i, rect, rect2, c0685f, measuredWidth, measuredHeight);
        m39206d(c0685f, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m39217K(false);
        if (this.f2965w) {
            if (this.f2964v == null) {
                this.f2964v = new ViewTreeObserver$OnPreDrawListenerC0686g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2964v);
        }
        if (this.f2966x == null && C1365w0.m37170y(this)) {
            C1365w0.m37191n0(this);
        }
        this.f2960r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m39217K(false);
        if (this.f2965w && this.f2964v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2964v);
        }
        View view = this.f2963u;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2960r = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f2967y && this.f2968z != null) {
            WindowInsetsCompat windowInsetsCompat = this.f2966x;
            if (windowInsetsCompat != null) {
                i = windowInsetsCompat.m37732o();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f2968z.setBounds(0, 0, getWidth(), i);
                this.f2968z.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m39217K(true);
        }
        boolean m39222F = m39222F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m39217K(true);
        }
        return m39222F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0682c m39166f;
        int m37258B = C1365w0.m37258B(this);
        int size = this.f2952j.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2952j.get(i5);
            if (view.getVisibility() != 8 && ((m39166f = ((C0685f) view.getLayoutParams()).m39166f()) == null || !m39166f.mo26481l(this, view, m37258B))) {
                m39225C(view, m37258B);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x011a, code lost:
        if (r0.mo27710m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0682c m39166f;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0685f c0685f = (C0685f) childAt.getLayoutParams();
                if (c0685f.m39162j(0) && (m39166f = c0685f.m39166f()) != null) {
                    z2 |= m39166f.m39178n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m39226B(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0682c m39166f;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0685f c0685f = (C0685f) childAt.getLayoutParams();
                if (c0685f.m39162j(0) && (m39166f = c0685f.m39166f()) != null) {
                    z |= m39166f.mo27707o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0687h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0687h c0687h = (C0687h) parcelable;
        super.onRestoreInstanceState(c0687h.m34884a());
        SparseArray<Parcelable> sparseArray = c0687h.f2990l;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            AbstractC0682c m39166f = m39191s(childAt).m39166f();
            if (id2 != -1 && m39166f != null && (parcelable2 = sparseArray.get(id2)) != null) {
                m39166f.mo27695x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo27693y;
        C0687h c0687h = new C0687h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            AbstractC0682c m39166f = ((C0685f) childAt.getLayoutParams()).m39166f();
            if (id2 != -1 && m39166f != null && (mo27693y = m39166f.mo27693y(this, childAt)) != null) {
                sparseArray.append(id2, mo27693y);
            }
        }
        c0687h.f2990l = sparseArray;
        return c0687h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2962t
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m39222F(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f2962t
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0685f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m39166f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f2962t
            boolean r6 = r6.mo26457D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.f2962t
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m39217K(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    void m39192r(View view, Rect rect) {
        rect.set(((C0685f) view.getLayoutParams()).m39164h());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0682c m39166f = ((C0685f) view.getLayoutParams()).m39166f();
        if (m39166f != null && m39166f.mo27891w(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2959q) {
            m39217K(false);
            this.f2959q = true;
        }
    }

    /* renamed from: s */
    C0685f m39191s(View view) {
        C0685f c0685f = (C0685f) view.getLayoutParams();
        if (!c0685f.f2972b) {
            if (view instanceof InterfaceC0681b) {
                AbstractC0682c behavior = ((InterfaceC0681b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0685f.m39157o(behavior);
                c0685f.f2972b = true;
            } else {
                InterfaceC0683d interfaceC0683d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0683d = (InterfaceC0683d) cls.getAnnotation(InterfaceC0683d.class);
                    if (interfaceC0683d != null) {
                        break;
                    }
                }
                if (interfaceC0683d != null) {
                    try {
                        c0685f.m39157o(interfaceC0683d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0683d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                c0685f.f2972b = true;
            }
        }
        return c0685f;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m39210R();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2949A = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f2968z;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2968z = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2968z.setState(getDrawableState());
                }
                C1013a.m38085m(this.f2968z, C1365w0.m37258B(this));
                Drawable drawable4 = this.f2968z;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f2968z.setCallback(this);
            }
            C1365w0.m37203h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0946a.m38399e(getContext(), i) : null);
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
        Drawable drawable = this.f2968z;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2968z.setVisible(z, false);
        }
    }

    /* renamed from: v */
    public boolean m39188v(View view, int i, int i2) {
        Rect m39209a = m39209a();
        m39196n(view, m39209a);
        try {
            return m39209a.contains(i, i2);
        } finally {
            m39219I(m39209a);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2968z;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12565a.f32620a);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0682c m39166f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0685f c0685f = (C0685f) childAt.getLayoutParams();
                if (c0685f.m39162j(i3) && (m39166f = c0685f.m39166f()) != null) {
                    int[] iArr2 = this.f2957o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m39166f.mo27704q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2957o;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f2957o;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m39226B(1);
        }
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f2958p);
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC0682c m39166f;
        this.f2951C.m37749c(view, view2, i, i2);
        this.f2963u = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0685f c0685f = (C0685f) childAt.getLayoutParams();
            if (c0685f.m39162j(i2) && (m39166f = c0685f.m39166f()) != null) {
                m39166f.m39173v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0685f c0685f = (C0685f) childAt.getLayoutParams();
                AbstractC0682c m39166f = c0685f.m39166f();
                if (m39166f != null) {
                    boolean mo27761A = m39166f.mo27761A(this, childAt, view, view2, i, i2);
                    z |= mo27761A;
                    c0685f.m39154r(i2, mo27761A);
                } else {
                    c0685f.m39154r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.InterfaceC1314p0
    public void onStopNestedScroll(View view, int i) {
        this.f2951C.m37747e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0685f c0685f = (C0685f) childAt.getLayoutParams();
            if (c0685f.m39162j(i)) {
                AbstractC0682c m39166f = c0685f.m39166f();
                if (m39166f != null) {
                    m39166f.mo27758C(this, childAt, view, i);
                }
                c0685f.m39160l(i);
                c0685f.m39161k();
            }
        }
        this.f2963u = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.f2952j = new ArrayList();
        this.f2953k = new C0690a<>();
        this.f2954l = new ArrayList();
        this.f2955m = new ArrayList();
        this.f2957o = new int[2];
        this.f2958p = new int[2];
        this.f2951C = new NestedScrollingParentHelper(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12567c.f32623b, 0, C12566b.f32621a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12567c.f32623b, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C12567c.f32623b, attributeSet, obtainStyledAttributes, 0, C12566b.f32621a);
            } else {
                saveAttributeDataForStyleable(context, C12567c.f32623b, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C12567c.f32624c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2961s = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2961s.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f2961s;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f2968z = obtainStyledAttributes.getDrawable(C12567c.f32625d);
        obtainStyledAttributes.recycle();
        m39210R();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0684e());
        if (C1365w0.m37168z(this) == 0) {
            C1365w0.m37259A0(this, 1);
        }
    }

    @Override // androidx.core.view.InterfaceC1319q0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0682c m39166f;
        boolean z;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0685f c0685f = (C0685f) childAt.getLayoutParams();
                if (c0685f.m39162j(i5) && (m39166f = c0685f.m39166f()) != null) {
                    int[] iArr2 = this.f2957o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m39166f.mo27700t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f2957o;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        min = Math.max(i7, this.f2957o[1]);
                    } else {
                        z = true;
                        min = Math.min(i7, this.f2957o[1]);
                    }
                    i7 = min;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            m39226B(1);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0687h extends AbstractC1964a {
        public static final Parcelable.Creator<C0687h> CREATOR = new C0688a();

        /* renamed from: l */
        SparseArray<Parcelable> f2990l;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0688a implements Parcelable.ClassLoaderCreator<C0687h> {
            C0688a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0687h createFromParcel(Parcel parcel) {
                return new C0687h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0687h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0687h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0687h[] newArray(int i) {
                return new C0687h[i];
            }
        }

        public C0687h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2990l = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2990l.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2990l;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f2990l.keyAt(i3);
                parcelableArr[i3] = this.f2990l.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public C0687h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0685f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0682c f2971a;

        /* renamed from: b */
        boolean f2972b;

        /* renamed from: c */
        public int f2973c;

        /* renamed from: d */
        public int f2974d;

        /* renamed from: e */
        public int f2975e;

        /* renamed from: f */
        int f2976f;

        /* renamed from: g */
        public int f2977g;

        /* renamed from: h */
        public int f2978h;

        /* renamed from: i */
        int f2979i;

        /* renamed from: j */
        int f2980j;

        /* renamed from: k */
        View f2981k;

        /* renamed from: l */
        View f2982l;

        /* renamed from: m */
        private boolean f2983m;

        /* renamed from: n */
        private boolean f2984n;

        /* renamed from: o */
        private boolean f2985o;

        /* renamed from: p */
        private boolean f2986p;

        /* renamed from: q */
        final Rect f2987q;

        /* renamed from: r */
        Object f2988r;

        public C0685f(int i, int i2) {
            super(i, i2);
            this.f2972b = false;
            this.f2973c = 0;
            this.f2974d = 0;
            this.f2975e = -1;
            this.f2976f = -1;
            this.f2977g = 0;
            this.f2978h = 0;
            this.f2987q = new Rect();
        }

        /* renamed from: n */
        private void m39158n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2976f);
            this.f2981k = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.f2982l = null;
                        this.f2981k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f2982l = null;
                            this.f2981k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f2982l = findViewById;
            } else if (coordinatorLayout.isInEditMode()) {
                this.f2982l = null;
                this.f2981k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2976f) + " to anchor view " + view);
            }
        }

        /* renamed from: s */
        private boolean m39153s(View view, int i) {
            int m37321b = C1336t.m37321b(((C0685f) view.getLayoutParams()).f2977g, i);
            if (m37321b != 0 && (C1336t.m37321b(this.f2978h, i) & m37321b) == m37321b) {
                return true;
            }
            return false;
        }

        /* renamed from: t */
        private boolean m39152t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2981k.getId() != this.f2976f) {
                return false;
            }
            View view2 = this.f2981k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f2982l = null;
                    this.f2981k = null;
                    return false;
                }
            }
            this.f2982l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m39171a() {
            return this.f2981k == null && this.f2976f != -1;
        }

        /* renamed from: b */
        boolean m39170b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0682c abstractC0682c;
            if (view2 != this.f2982l && !m39153s(view2, C1365w0.m37258B(coordinatorLayout)) && ((abstractC0682c = this.f2971a) == null || !abstractC0682c.mo26454e(coordinatorLayout, view, view2))) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        boolean m39169c() {
            if (this.f2971a == null) {
                this.f2983m = false;
            }
            return this.f2983m;
        }

        /* renamed from: d */
        View m39168d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2976f == -1) {
                this.f2982l = null;
                this.f2981k = null;
                return null;
            }
            if (this.f2981k == null || !m39152t(view, coordinatorLayout)) {
                m39158n(view, coordinatorLayout);
            }
            return this.f2981k;
        }

        /* renamed from: e */
        public int m39167e() {
            return this.f2976f;
        }

        /* renamed from: f */
        public AbstractC0682c m39166f() {
            return this.f2971a;
        }

        /* renamed from: g */
        boolean m39165g() {
            return this.f2986p;
        }

        /* renamed from: h */
        Rect m39164h() {
            return this.f2987q;
        }

        /* renamed from: i */
        boolean m39163i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.f2983m;
            if (z2) {
                return true;
            }
            AbstractC0682c abstractC0682c = this.f2971a;
            if (abstractC0682c != null) {
                z = abstractC0682c.m39182a(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f2983m = z3;
            return z3;
        }

        /* renamed from: j */
        boolean m39162j(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f2985o;
            }
            return this.f2984n;
        }

        /* renamed from: k */
        void m39161k() {
            this.f2986p = false;
        }

        /* renamed from: l */
        void m39160l(int i) {
            m39154r(i, false);
        }

        /* renamed from: m */
        void m39159m() {
            this.f2983m = false;
        }

        /* renamed from: o */
        public void m39157o(AbstractC0682c abstractC0682c) {
            AbstractC0682c abstractC0682c2 = this.f2971a;
            if (abstractC0682c2 != abstractC0682c) {
                if (abstractC0682c2 != null) {
                    abstractC0682c2.mo27714j();
                }
                this.f2971a = abstractC0682c;
                this.f2988r = null;
                this.f2972b = true;
                if (abstractC0682c != null) {
                    abstractC0682c.mo26458g(this);
                }
            }
        }

        /* renamed from: p */
        void m39156p(boolean z) {
            this.f2986p = z;
        }

        /* renamed from: q */
        void m39155q(Rect rect) {
            this.f2987q.set(rect);
        }

        /* renamed from: r */
        void m39154r(int i, boolean z) {
            if (i != 0) {
                if (i == 1) {
                    this.f2985o = z;
                    return;
                }
                return;
            }
            this.f2984n = z;
        }

        C0685f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2972b = false;
            this.f2973c = 0;
            this.f2974d = 0;
            this.f2975e = -1;
            this.f2976f = -1;
            this.f2977g = 0;
            this.f2978h = 0;
            this.f2987q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12567c.f32626e);
            this.f2973c = obtainStyledAttributes.getInteger(C12567c.f32627f, 0);
            this.f2976f = obtainStyledAttributes.getResourceId(C12567c.f32628g, -1);
            this.f2974d = obtainStyledAttributes.getInteger(C12567c.f32629h, 0);
            this.f2975e = obtainStyledAttributes.getInteger(C12567c.f32633l, -1);
            this.f2977g = obtainStyledAttributes.getInt(C12567c.f32632k, 0);
            this.f2978h = obtainStyledAttributes.getInt(C12567c.f32631j, 0);
            int i = C12567c.f32630i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f2972b = hasValue;
            if (hasValue) {
                this.f2971a = CoordinatorLayout.m39223E(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            AbstractC0682c abstractC0682c = this.f2971a;
            if (abstractC0682c != null) {
                abstractC0682c.mo26458g(this);
            }
        }

        public C0685f(C0685f c0685f) {
            super((ViewGroup.MarginLayoutParams) c0685f);
            this.f2972b = false;
            this.f2973c = 0;
            this.f2974d = 0;
            this.f2975e = -1;
            this.f2976f = -1;
            this.f2977g = 0;
            this.f2978h = 0;
            this.f2987q = new Rect();
        }

        public C0685f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2972b = false;
            this.f2973c = 0;
            this.f2974d = 0;
            this.f2975e = -1;
            this.f2976f = -1;
            this.f2977g = 0;
            this.f2978h = 0;
            this.f2987q = new Rect();
        }

        public C0685f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2972b = false;
            this.f2973c = 0;
            this.f2974d = 0;
            this.f2975e = -1;
            this.f2976f = -1;
            this.f2977g = 0;
            this.f2978h = 0;
            this.f2987q = new Rect();
        }
    }
}