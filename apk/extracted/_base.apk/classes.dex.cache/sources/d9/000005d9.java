package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.C1138f;
import androidx.core.view.C1170a;
import androidx.core.view.C1340t2;
import androidx.core.view.C1365w0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p356u.C12810e;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1365w0 {

    /* renamed from: c */
    private static Field f3700c;

    /* renamed from: a */
    private static final AtomicInteger f3698a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap<View, C1304n2> f3699b = null;

    /* renamed from: d */
    private static boolean f3701d = false;

    /* renamed from: e */
    private static final int[] f3702e = {C12810e.f33225b, C12810e.f33227c, C12810e.f33247n, C12810e.f33258y, C12810e.f33198B, C12810e.f33199C, C12810e.f33200D, C12810e.f33201E, C12810e.f33202F, C12810e.f33203G, C12810e.f33229d, C12810e.f33231e, C12810e.f33233f, C12810e.f33235g, C12810e.f33237h, C12810e.f33239i, C12810e.f33241j, C12810e.f33243k, C12810e.f33245l, C12810e.f33246m, C12810e.f33248o, C12810e.f33249p, C12810e.f33250q, C12810e.f33251r, C12810e.f33252s, C12810e.f33253t, C12810e.f33254u, C12810e.f33255v, C12810e.f33256w, C12810e.f33257x, C12810e.f33259z, C12810e.f33197A};

    /* renamed from: f */
    private static final InterfaceC1338t0 f3703f = new InterfaceC1338t0() { // from class: androidx.core.view.v0
        @Override // androidx.core.view.InterfaceC1338t0
        public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
            ContentInfoCompat m37220Y;
            m37220Y = C1365w0.m37220Y(contentInfoCompat);
            return m37220Y;
        }
    };

    /* renamed from: g */
    private static final ViewTreeObserver$OnGlobalLayoutListenerC1370e f3704g = new ViewTreeObserver$OnGlobalLayoutListenerC1370e();

    /* renamed from: androidx.core.view.w0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1366a extends AbstractC1371f<Boolean> {
        C1366a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: i */
        public Boolean mo37146d(View view) {
            return Boolean.valueOf(C1382p.m37049d(view));
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: j */
        public void mo37145e(View view, Boolean bool) {
            C1382p.m37044i(view, bool.booleanValue());
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: k */
        public boolean mo37142h(Boolean bool, Boolean bool2) {
            return !m37149a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.w0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1367b extends AbstractC1371f<CharSequence> {
        C1367b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: i */
        public CharSequence mo37146d(View view) {
            return C1382p.m37051b(view);
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: j */
        public void mo37145e(View view, CharSequence charSequence) {
            C1382p.m37045h(view, charSequence);
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: k */
        public boolean mo37142h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.w0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1368c extends AbstractC1371f<CharSequence> {
        C1368c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: i */
        public CharSequence mo37146d(View view) {
            return C1384r.m37039a(view);
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: j */
        public void mo37145e(View view, CharSequence charSequence) {
            C1384r.m37038b(view, charSequence);
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: k */
        public boolean mo37142h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.w0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1369d extends AbstractC1371f<Boolean> {
        C1369d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: i */
        public Boolean mo37146d(View view) {
            return Boolean.valueOf(C1382p.m37050c(view));
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: j */
        public void mo37145e(View view, Boolean bool) {
            C1382p.m37046g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.C1365w0.AbstractC1371f
        /* renamed from: k */
        public boolean mo37142h(Boolean bool, Boolean bool2) {
            return !m37149a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC1370e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: j */
        private final WeakHashMap<View, Boolean> f3705j = new WeakHashMap<>();

        ViewTreeObserver$OnGlobalLayoutListenerC1370e() {
        }

        /* renamed from: b */
        private void m37153b(View view, boolean z) {
            boolean z2;
            int i;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (z2) {
                    i = 16;
                } else {
                    i = 32;
                }
                C1365w0.m37219Z(view, i);
                this.f3705j.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        private void m37152c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: e */
        private void m37150e(View view) {
            C1373h.m37126o(view.getViewTreeObserver(), this);
        }

        /* renamed from: a */
        void m37154a(View view) {
            boolean z;
            WeakHashMap<View, Boolean> weakHashMap = this.f3705j;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (C1376k.m37106b(view)) {
                m37152c(view);
            }
        }

        /* renamed from: d */
        void m37151d(View view) {
            this.f3705j.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m37150e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3705j.entrySet()) {
                    m37153b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m37152c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.w0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1371f<T> {

        /* renamed from: a */
        private final int f3706a;

        /* renamed from: b */
        private final Class<T> f3707b;

        /* renamed from: c */
        private final int f3708c;

        /* renamed from: d */
        private final int f3709d;

        AbstractC1371f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m37148b() {
            return true;
        }

        /* renamed from: c */
        private boolean m37147c() {
            return Build.VERSION.SDK_INT >= this.f3708c;
        }

        /* renamed from: a */
        boolean m37149a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        abstract T mo37146d(View view);

        /* renamed from: e */
        abstract void mo37145e(View view, T t);

        /* renamed from: f */
        T m37144f(View view) {
            if (m37147c()) {
                return mo37146d(view);
            }
            if (m37148b()) {
                T t = (T) view.getTag(this.f3706a);
                if (this.f3707b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        /* renamed from: g */
        void m37143g(View view, T t) {
            if (m37147c()) {
                mo37145e(view, t);
            } else if (m37148b() && mo37142h(m37144f(view), t)) {
                C1365w0.m37200j(view);
                view.setTag(this.f3706a, t);
                C1365w0.m37219Z(view, this.f3709d);
            }
        }

        /* renamed from: h */
        abstract boolean mo37142h(T t, T t2);

        AbstractC1371f(int i, Class<T> cls, int i2, int i3) {
            this.f3706a = i;
            this.f3707b = cls;
            this.f3709d = i2;
            this.f3708c = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1372g {
        /* renamed from: a */
        static boolean m37141a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.w0$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1373h {
        /* renamed from: a */
        static AccessibilityNodeProvider m37140a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m37139b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m37138c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m37137d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m37136e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m37135f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m37134g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m37133h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m37132i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m37131j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        static void m37130k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m37129l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        static void m37128m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m37127n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        static void m37126o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m37125p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m37124q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m37123r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        static void m37122s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1374i {
        /* renamed from: a */
        static int m37121a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m37120b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m37119c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m37118d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m37117e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m37116f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m37115g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m37114h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        static void m37113i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m37112j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        static void m37111k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1375j {
        /* renamed from: a */
        static Rect m37110a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m37109b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m37108c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: androidx.core.view.w0$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1376k {
        /* renamed from: a */
        static int m37107a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m37106b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m37105c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m37104d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m37103e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        static void m37102f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        static void m37101g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: androidx.core.view.w0$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1377l {
        /* renamed from: a */
        static WindowInsets m37100a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m37099b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m37098c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.w0$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1378m {

        /* renamed from: androidx.core.view.w0$m$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class View$OnApplyWindowInsetsListenerC1379a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            WindowInsetsCompat f3710a = null;

            /* renamed from: b */
            final /* synthetic */ View f3711b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC1324r0 f3712c;

            View$OnApplyWindowInsetsListenerC1379a(View view, InterfaceC1324r0 interfaceC1324r0) {
                this.f3711b = view;
                this.f3712c = interfaceC1324r0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat m37721z = WindowInsetsCompat.m37721z(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C1378m.m37097a(windowInsets, this.f3711b);
                    if (m37721z.equals(this.f3710a)) {
                        return this.f3712c.mo24794a(view, m37721z).m37723x();
                    }
                }
                this.f3710a = m37721z;
                WindowInsetsCompat mo24794a = this.f3712c.mo24794a(view, m37721z);
                if (i >= 30) {
                    return mo24794a.m37723x();
                }
                C1365w0.m37191n0(view);
                return mo24794a.m37723x();
            }
        }

        /* renamed from: a */
        static void m37097a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C12810e.f33236g0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static WindowInsetsCompat m37096b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets m37723x = windowInsetsCompat.m37723x();
            if (m37723x != null) {
                return WindowInsetsCompat.m37721z(view.computeSystemWindowInsets(m37723x, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        /* renamed from: c */
        static boolean m37095c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        static boolean m37094d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        static boolean m37093e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m37092f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        static ColorStateList m37091g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m37090h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m37089i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static WindowInsetsCompat m37088j(View view) {
            return WindowInsetsCompat.C1151a.m37720a(view);
        }

        /* renamed from: k */
        static String m37087k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m37086l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m37085m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m37084n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m37083o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m37082p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m37081q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m37080r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m37079s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        static void m37078t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        static void m37077u(View view, InterfaceC1324r0 interfaceC1324r0) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C12810e.f33222Z, interfaceC1324r0);
            }
            if (interfaceC1324r0 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C12810e.f33236g0));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC1379a(view, interfaceC1324r0));
            }
        }

        /* renamed from: v */
        static void m37076v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m37075w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        static void m37074x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        static boolean m37073y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        static void m37072z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.w0$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1380n {
        /* renamed from: a */
        public static WindowInsetsCompat m37071a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat m37722y = WindowInsetsCompat.m37722y(rootWindowInsets);
            m37722y.m37725v(m37722y);
            m37722y.m37743d(view.getRootView());
            return m37722y;
        }

        /* renamed from: b */
        static int m37070b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m37069c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        static void m37068d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1381o {
        /* renamed from: a */
        static void m37067a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        static int m37066b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        /* renamed from: c */
        static int m37065c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        /* renamed from: d */
        static boolean m37064d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        /* renamed from: e */
        static boolean m37063e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        /* renamed from: f */
        static boolean m37062f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        /* renamed from: g */
        static boolean m37061g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        /* renamed from: h */
        static View m37060h(View view, View view2, int i) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i);
            return keyboardNavigationClusterSearch;
        }

        /* renamed from: i */
        static boolean m37059i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        /* renamed from: j */
        static void m37058j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m37057k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        static void m37056l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        static void m37055m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        static void m37054n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        static void m37053o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.w0$p */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1382p {
        /* renamed from: a */
        static void m37052a(View view, final InterfaceC1387u interfaceC1387u) {
            int i = C12810e.f33234f0;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(i);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(i, simpleArrayMap);
            }
            Objects.requireNonNull(interfaceC1387u);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.u1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C1365w0.InterfaceC1387u.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(interfaceC1387u, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: b */
        static CharSequence m37051b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        /* renamed from: c */
        static boolean m37050c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        /* renamed from: d */
        static boolean m37049d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        /* renamed from: e */
        static void m37048e(View view, InterfaceC1387u interfaceC1387u) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(C12810e.f33234f0);
            if (simpleArrayMap != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(interfaceC1387u)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        static <T> T m37047f(View view, int i) {
            View requireViewById;
            requireViewById = view.requireViewById(i);
            return (T) requireViewById;
        }

        /* renamed from: g */
        static void m37046g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        static void m37045h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m37044i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: androidx.core.view.w0$q */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1383q {
        /* renamed from: a */
        static View.AccessibilityDelegate m37043a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        /* renamed from: b */
        static List<Rect> m37042b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        /* renamed from: c */
        static void m37041c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        static void m37040d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.w0$r */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1384r {
        /* renamed from: a */
        static CharSequence m37039a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        /* renamed from: b */
        static void m37038b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.w0$s */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1385s {
        /* renamed from: a */
        public static String[] m37037a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        /* renamed from: b */
        public static ContentInfoCompat m37036b(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo performReceiveContent;
            ContentInfo m37804k = contentInfoCompat.m37804k();
            performReceiveContent = view.performReceiveContent(m37804k);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == m37804k) {
                return contentInfoCompat;
            }
            return ContentInfoCompat.m37803l(performReceiveContent);
        }

        /* renamed from: c */
        public static void m37035c(View view, String[] strArr, InterfaceC1332s0 interfaceC1332s0) {
            if (interfaceC1332s0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC1386t(interfaceC1332s0));
            }
        }
    }

    /* renamed from: androidx.core.view.w0$t */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class OnReceiveContentListenerC1386t implements OnReceiveContentListener {

        /* renamed from: a */
        private final InterfaceC1332s0 f3713a;

        OnReceiveContentListenerC1386t(InterfaceC1332s0 interfaceC1332s0) {
            this.f3713a = interfaceC1332s0;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat m37803l = ContentInfoCompat.m37803l(contentInfo);
            ContentInfoCompat mo32087a = this.f3713a.mo32087a(view, m37803l);
            if (mo32087a == null) {
                return null;
            }
            if (mo32087a == m37803l) {
                return contentInfo;
            }
            return mo32087a.m37804k();
        }
    }

    /* renamed from: androidx.core.view.w0$u */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1387u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.w0$v */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1388v {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f3714d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f3715a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f3716b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f3717c = null;

        C1388v() {
        }

        /* renamed from: a */
        static C1388v m37034a(View view) {
            int i = C12810e.f33232e0;
            C1388v c1388v = (C1388v) view.getTag(i);
            if (c1388v == null) {
                C1388v c1388v2 = new C1388v();
                view.setTag(i, c1388v2);
                return c1388v2;
            }
            return c1388v;
        }

        /* renamed from: c */
        private View m37032c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3715a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m37032c = m37032c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m37032c != null) {
                            return m37032c;
                        }
                    }
                }
                if (m37030e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m37031d() {
            if (this.f3716b == null) {
                this.f3716b = new SparseArray<>();
            }
            return this.f3716b;
        }

        /* renamed from: e */
        private boolean m37030e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C12810e.f33234f0);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((InterfaceC1387u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: g */
        private void m37028g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3715a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3714d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f3715a == null) {
                    this.f3715a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f3714d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f3715a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f3715a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m37033b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m37028g();
            }
            View m37032c = m37032c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m37032c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m37031d().put(keyCode, new WeakReference<>(m37032c));
                }
            }
            if (m37032c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        boolean m37029f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f3717c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f3717c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> m37031d = m37031d();
            if (keyEvent.getAction() == 1 && (indexOfKey = m37031d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = m37031d.valueAt(indexOfKey);
                m37031d.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = m37031d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && C1365w0.m37225T(view)) {
                m37030e(view, keyEvent);
            }
            return true;
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: A */
    public static int m37260A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1381o.m37066b(view);
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m37259A0(View view, int i) {
        C1373h.m37122s(view, i);
    }

    /* renamed from: B */
    public static int m37258B(View view) {
        return C1374i.m37118d(view);
    }

    /* renamed from: B0 */
    public static void m37257B0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1381o.m37056l(view, i);
        }
    }

    /* renamed from: C */
    public static int m37256C(View view) {
        return C1373h.m37137d(view);
    }

    /* renamed from: C0 */
    public static void m37255C0(View view, boolean z) {
        C1378m.m37078t(view, z);
    }

    /* renamed from: D */
    public static int m37254D(View view) {
        return C1373h.m37136e(view);
    }

    /* renamed from: D0 */
    public static void m37253D0(View view, InterfaceC1324r0 interfaceC1324r0) {
        C1378m.m37077u(view, interfaceC1324r0);
    }

    /* renamed from: E */
    public static String[] m37252E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1385s.m37037a(view);
        }
        return (String[]) view.getTag(C12810e.f33226b0);
    }

    /* renamed from: E0 */
    public static void m37251E0(View view, String[] strArr, InterfaceC1332s0 interfaceC1332s0) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            C1385s.m37035c(view, strArr, interfaceC1332s0);
            return;
        }
        strArr = (strArr == null || strArr.length == 0) ? null : null;
        boolean z2 = false;
        if (interfaceC1332s0 != null) {
            if (strArr != null) {
                z = true;
            } else {
                z = false;
            }
            C1138f.m37829a(z, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].startsWith("*")) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            C1138f.m37829a(!z2, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(C12810e.f33226b0, strArr);
        view.setTag(C12810e.f33224a0, interfaceC1332s0);
    }

    /* renamed from: F */
    public static int m37250F(View view) {
        return C1374i.m37117e(view);
    }

    /* renamed from: F0 */
    public static void m37249F0(View view, int i, int i2, int i3, int i4) {
        C1374i.m37111k(view, i, i2, i3, i4);
    }

    /* renamed from: G */
    public static int m37248G(View view) {
        return C1374i.m37116f(view);
    }

    /* renamed from: G0 */
    public static void m37247G0(View view, boolean z) {
        m37187p0().m37143g(view, Boolean.valueOf(z));
    }

    /* renamed from: H */
    public static ViewParent m37246H(View view) {
        return C1373h.m37135f(view);
    }

    /* renamed from: H0 */
    public static void m37245H0(View view, int i, int i2) {
        C1380n.m37068d(view, i, i2);
    }

    /* renamed from: I */
    public static WindowInsetsCompat m37244I(View view) {
        return C1380n.m37071a(view);
    }

    /* renamed from: I0 */
    public static void m37243I0(View view, CharSequence charSequence) {
        m37231O0().m37143g(view, charSequence);
    }

    /* renamed from: J */
    public static CharSequence m37242J(View view) {
        return m37231O0().m37144f(view);
    }

    /* renamed from: J0 */
    public static void m37241J0(View view, String str) {
        C1378m.m37076v(view, str);
    }

    /* renamed from: K */
    public static String m37240K(View view) {
        return C1378m.m37087k(view);
    }

    /* renamed from: K0 */
    public static void m37239K0(View view, float f) {
        C1378m.m37075w(view, f);
    }

    /* renamed from: L */
    public static float m37238L(View view) {
        return C1378m.m37086l(view);
    }

    /* renamed from: L0 */
    private static void m37237L0(View view) {
        if (m37168z(view) == 0) {
            m37259A0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m37168z((View) parent) == 4) {
                m37259A0(view, 2);
                return;
            }
        }
    }

    @Deprecated
    /* renamed from: M */
    public static int m37236M(View view) {
        return C1373h.m37134g(view);
    }

    /* renamed from: M0 */
    public static void m37235M0(View view, C1340t2.AbstractC1342b abstractC1342b) {
        C1340t2.m37314c(view, abstractC1342b);
    }

    /* renamed from: N */
    public static float m37234N(View view) {
        return C1378m.m37085m(view);
    }

    /* renamed from: N0 */
    public static void m37233N0(View view, float f) {
        C1378m.m37074x(view, f);
    }

    /* renamed from: O */
    public static boolean m37232O(View view) {
        return m37194m(view) != null;
    }

    /* renamed from: O0 */
    private static AbstractC1371f<CharSequence> m37231O0() {
        return new C1368c(C12810e.f33230d0, CharSequence.class, 64, 30);
    }

    /* renamed from: P */
    public static boolean m37230P(View view) {
        return C1372g.m37141a(view);
    }

    /* renamed from: P0 */
    public static void m37229P0(View view) {
        C1378m.m37072z(view);
    }

    /* renamed from: Q */
    public static boolean m37228Q(View view) {
        return C1373h.m37133h(view);
    }

    /* renamed from: R */
    public static boolean m37227R(View view) {
        return C1373h.m37132i(view);
    }

    /* renamed from: S */
    public static boolean m37226S(View view) {
        Boolean m37144f = m37216b().m37144f(view);
        if (m37144f != null && m37144f.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static boolean m37225T(View view) {
        return C1376k.m37106b(view);
    }

    /* renamed from: U */
    public static boolean m37224U(View view) {
        return C1376k.m37105c(view);
    }

    /* renamed from: V */
    public static boolean m37223V(View view) {
        return C1378m.m37082p(view);
    }

    /* renamed from: W */
    public static boolean m37222W(View view) {
        return C1374i.m37115g(view);
    }

    /* renamed from: X */
    public static boolean m37221X(View view) {
        Boolean m37144f = m37187p0().m37144f(view);
        if (m37144f != null && m37144f.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public static /* synthetic */ ContentInfoCompat m37220Y(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    /* renamed from: Z */
    static void m37219Z(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (m37188p(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (m37190o(view) == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                C1376k.m37101g(obtain, i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(m37188p(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    C1376k.m37103e(view.getParent(), view, view, i);
                    return;
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        obtain2.setEventType(i2);
        C1376k.m37101g(obtain2, i);
        if (z) {
            obtain2.getText().add(m37188p(view));
            m37237L0(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    /* renamed from: a0 */
    public static void m37217a0(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: b */
    private static AbstractC1371f<Boolean> m37216b() {
        return new C1369d(C12810e.f33220X, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static void m37215b0(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: c */
    public static int m37214c(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        int m37184r = m37184r(view, charSequence);
        if (m37184r != -1) {
            m37212d(view, new AccessibilityNodeInfoCompat.C1178a(m37184r, charSequence, accessibilityViewCommand));
        }
        return m37184r;
    }

    /* renamed from: c0 */
    public static WindowInsetsCompat m37213c0(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets m37723x = windowInsetsCompat.m37723x();
        if (m37723x != null) {
            WindowInsets m37099b = C1377l.m37099b(view, m37723x);
            if (!m37099b.equals(m37723x)) {
                return WindowInsetsCompat.m37721z(m37099b, view);
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: d */
    private static void m37212d(View view, AccessibilityNodeInfoCompat.C1178a c1178a) {
        m37200j(view);
        m37195l0(c1178a.m37550b(), view);
        m37186q(view).add(c1178a);
        m37219Z(view, 0);
    }

    /* renamed from: d0 */
    public static void m37211d0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.m37616O0());
    }

    /* renamed from: e */
    public static C1304n2 m37210e(View view) {
        if (f3699b == null) {
            f3699b = new WeakHashMap<>();
        }
        C1304n2 c1304n2 = f3699b.get(view);
        if (c1304n2 == null) {
            C1304n2 c1304n22 = new C1304n2(view);
            f3699b.put(view, c1304n22);
            return c1304n22;
        }
        return c1304n2;
    }

    /* renamed from: e0 */
    private static AbstractC1371f<CharSequence> m37209e0() {
        return new C1367b(C12810e.f33221Y, CharSequence.class, 8, 28);
    }

    /* renamed from: f */
    public static WindowInsetsCompat m37208f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return C1378m.m37096b(view, windowInsetsCompat, rect);
    }

    /* renamed from: f0 */
    public static boolean m37207f0(View view, int i, Bundle bundle) {
        return C1373h.m37131j(view, i, bundle);
    }

    /* renamed from: g */
    public static WindowInsetsCompat m37206g(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets m37723x = windowInsetsCompat.m37723x();
        if (m37723x != null) {
            WindowInsets m37100a = C1377l.m37100a(view, m37723x);
            if (!m37100a.equals(m37723x)) {
                return WindowInsetsCompat.m37721z(m37100a, view);
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: g0 */
    public static ContentInfoCompat m37205g0(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C1385s.m37036b(view, contentInfoCompat);
        }
        InterfaceC1332s0 interfaceC1332s0 = (InterfaceC1332s0) view.getTag(C12810e.f33224a0);
        if (interfaceC1332s0 != null) {
            ContentInfoCompat mo32087a = interfaceC1332s0.mo32087a(view, contentInfoCompat);
            if (mo32087a == null) {
                return null;
            }
            return m37172x(view).onReceiveContent(mo32087a);
        }
        return m37172x(view).onReceiveContent(contentInfoCompat);
    }

    /* renamed from: h */
    public static boolean m37204h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1388v.m37034a(view).m37033b(view, keyEvent);
    }

    /* renamed from: h0 */
    public static void m37203h0(View view) {
        C1373h.m37130k(view);
    }

    /* renamed from: i */
    public static boolean m37202i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1388v.m37034a(view).m37029f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m37201i0(View view, Runnable runnable) {
        C1373h.m37128m(view, runnable);
    }

    /* renamed from: j */
    static void m37200j(View view) {
        C1170a m37196l = m37196l(view);
        if (m37196l == null) {
            m37196l = new C1170a();
        }
        m37185q0(view, m37196l);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: j0 */
    public static void m37199j0(View view, Runnable runnable, long j) {
        C1373h.m37127n(view, runnable, j);
    }

    /* renamed from: k */
    public static int m37198k() {
        return C1374i.m37121a();
    }

    /* renamed from: k0 */
    public static void m37197k0(View view, int i) {
        m37195l0(i, view);
        m37219Z(view, 0);
    }

    /* renamed from: l */
    public static C1170a m37196l(View view) {
        View.AccessibilityDelegate m37194m = m37194m(view);
        if (m37194m == null) {
            return null;
        }
        if (m37194m instanceof C1170a.C1171a) {
            return ((C1170a.C1171a) m37194m).f3580a;
        }
        return new C1170a(m37194m);
    }

    /* renamed from: l0 */
    private static void m37195l0(int i, View view) {
        List<AccessibilityNodeInfoCompat.C1178a> m37186q = m37186q(view);
        for (int i2 = 0; i2 < m37186q.size(); i2++) {
            if (m37186q.get(i2).m37550b() == i) {
                m37186q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m37194m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1383q.m37043a(view);
        }
        return m37192n(view);
    }

    /* renamed from: m0 */
    public static void m37193m0(View view, AccessibilityNodeInfoCompat.C1178a c1178a, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            m37197k0(view, c1178a.m37550b());
        } else {
            m37212d(view, c1178a.m37551a(charSequence, accessibilityViewCommand));
        }
    }

    /* renamed from: n */
    private static View.AccessibilityDelegate m37192n(View view) {
        if (f3701d) {
            return null;
        }
        if (f3700c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3700c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3701d = true;
                return null;
            }
        }
        try {
            Object obj = f3700c.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f3701d = true;
            return null;
        }
    }

    /* renamed from: n0 */
    public static void m37191n0(View view) {
        C1377l.m37098c(view);
    }

    /* renamed from: o */
    public static int m37190o(View view) {
        return C1376k.m37107a(view);
    }

    /* renamed from: o0 */
    public static void m37189o0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1383q.m37041c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: p */
    public static CharSequence m37188p(View view) {
        return m37209e0().m37144f(view);
    }

    /* renamed from: p0 */
    private static AbstractC1371f<Boolean> m37187p0() {
        return new C1366a(C12810e.f33228c0, Boolean.class, 28);
    }

    /* renamed from: q */
    private static List<AccessibilityNodeInfoCompat.C1178a> m37186q(View view) {
        int i = C12810e.f33218V;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: q0 */
    public static void m37185q0(View view, C1170a c1170a) {
        View.AccessibilityDelegate bridge;
        if (c1170a == null && (m37194m(view) instanceof C1170a.C1171a)) {
            c1170a = new C1170a();
        }
        if (c1170a == null) {
            bridge = null;
        } else {
            bridge = c1170a.getBridge();
        }
        view.setAccessibilityDelegate(bridge);
    }

    /* renamed from: r */
    private static int m37184r(View view, CharSequence charSequence) {
        boolean z;
        List<AccessibilityNodeInfoCompat.C1178a> m37186q = m37186q(view);
        for (int i = 0; i < m37186q.size(); i++) {
            if (TextUtils.equals(charSequence, m37186q.get(i).m37549c())) {
                return m37186q.get(i).m37550b();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f3702e;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z2 = true;
            for (int i5 = 0; i5 < m37186q.size(); i5++) {
                if (m37186q.get(i5).m37550b() != i4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: r0 */
    public static void m37183r0(View view, boolean z) {
        m37216b().m37143g(view, Boolean.valueOf(z));
    }

    /* renamed from: s */
    public static ColorStateList m37182s(View view) {
        return C1378m.m37091g(view);
    }

    /* renamed from: s0 */
    public static void m37181s0(View view, int i) {
        C1376k.m37102f(view, i);
    }

    /* renamed from: t */
    public static PorterDuff.Mode m37180t(View view) {
        return C1378m.m37090h(view);
    }

    /* renamed from: t0 */
    public static void m37179t0(View view, CharSequence charSequence) {
        m37209e0().m37143g(view, charSequence);
        if (charSequence != null) {
            f3704g.m37154a(view);
        } else {
            f3704g.m37151d(view);
        }
    }

    /* renamed from: u */
    public static Rect m37178u(View view) {
        return C1375j.m37110a(view);
    }

    /* renamed from: u0 */
    public static void m37177u0(View view, Drawable drawable) {
        C1373h.m37124q(view, drawable);
    }

    /* renamed from: v */
    public static Display m37176v(View view) {
        return C1374i.m37120b(view);
    }

    /* renamed from: v0 */
    public static void m37175v0(View view, ColorStateList colorStateList) {
        C1378m.m37081q(view, colorStateList);
    }

    /* renamed from: w */
    public static float m37174w(View view) {
        return C1378m.m37089i(view);
    }

    /* renamed from: w0 */
    public static void m37173w0(View view, PorterDuff.Mode mode) {
        C1378m.m37080r(view, mode);
    }

    /* renamed from: x */
    private static InterfaceC1338t0 m37172x(View view) {
        if (view instanceof InterfaceC1338t0) {
            return (InterfaceC1338t0) view;
        }
        return f3703f;
    }

    /* renamed from: x0 */
    public static void m37171x0(View view, Rect rect) {
        C1375j.m37108c(view, rect);
    }

    /* renamed from: y */
    public static boolean m37170y(View view) {
        return C1373h.m37139b(view);
    }

    /* renamed from: y0 */
    public static void m37169y0(View view, float f) {
        C1378m.m37079s(view, f);
    }

    /* renamed from: z */
    public static int m37168z(View view) {
        return C1373h.m37138c(view);
    }

    /* renamed from: z0 */
    public static void m37167z0(View view, boolean z) {
        C1373h.m37123r(view, z);
    }
}