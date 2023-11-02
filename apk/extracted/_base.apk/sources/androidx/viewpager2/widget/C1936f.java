package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.C1809k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.InterfaceC1928a;
import p376v0.C13050a;

/* renamed from: androidx.viewpager2.widget.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1936f extends ViewGroup {

    /* renamed from: D */
    static boolean f5358D = true;

    /* renamed from: A */
    private boolean f5359A;

    /* renamed from: B */
    private int f5360B;

    /* renamed from: C */
    AbstractC1941e f5361C;

    /* renamed from: j */
    private final Rect f5362j;

    /* renamed from: k */
    private final Rect f5363k;

    /* renamed from: l */
    private C1931b f5364l;

    /* renamed from: m */
    int f5365m;

    /* renamed from: n */
    boolean f5366n;

    /* renamed from: o */
    private RecyclerView.AdapterDataObserver f5367o;

    /* renamed from: p */
    private LinearLayoutManager f5368p;

    /* renamed from: q */
    private int f5369q;

    /* renamed from: r */
    private Parcelable f5370r;

    /* renamed from: s */
    RecyclerView f5371s;

    /* renamed from: t */
    private C1809k f5372t;

    /* renamed from: u */
    C1934e f5373u;

    /* renamed from: v */
    private C1931b f5374v;

    /* renamed from: w */
    private C1932c f5375w;

    /* renamed from: x */
    private C1933d f5376x;

    /* renamed from: y */
    private RecyclerView.ItemAnimator f5377y;

    /* renamed from: z */
    private boolean f5378z;

    /* renamed from: androidx.viewpager2.widget.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1937a extends AbstractC1943g {
        C1937a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1943g, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo34897a() {
            C1936f c1936f = C1936f.this;
            c1936f.f5366n = true;
            c1936f.f5373u.m34949j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1938b extends AbstractC1945i {
        C1938b() {
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
        /* renamed from: a */
        public void mo25156a(int i) {
            if (i == 0) {
                C1936f.this.m34929n();
            }
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
        /* renamed from: c */
        public void mo25154c(int i) {
            C1936f c1936f = C1936f.this;
            if (c1936f.f5365m != i) {
                c1936f.f5365m = i;
                c1936f.f5361C.mo34904q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1939c extends AbstractC1945i {
        C1939c() {
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
        /* renamed from: c */
        public void mo25154c(int i) {
            C1936f.this.clearFocus();
            if (C1936f.this.hasFocus()) {
                C1936f.this.f5371s.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1940d implements RecyclerView.OnChildAttachStateChangeListener {
        C1940d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c1772i).width == -1 && ((ViewGroup.MarginLayoutParams) c1772i).height == -1) {
                return;
            }
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public abstract class AbstractC1941e {
        private AbstractC1941e() {
        }

        /* renamed from: a */
        boolean mo34915a() {
            return false;
        }

        /* renamed from: b */
        boolean mo34928b(int i) {
            return false;
        }

        /* renamed from: c */
        boolean mo34914c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        boolean mo34927d() {
            return false;
        }

        /* renamed from: e */
        void mo34913e(RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: f */
        void mo34912f(RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: g */
        String mo34911g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        void mo34910h(C1931b c1931b, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        void mo34909i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        void mo34926j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* renamed from: k */
        boolean mo34925k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        boolean mo34908l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        void mo34907m() {
        }

        /* renamed from: n */
        CharSequence mo34924n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        void mo34906o(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        void mo34905p() {
        }

        /* renamed from: q */
        void mo34904q() {
        }

        /* renamed from: r */
        void mo34903r() {
        }

        /* renamed from: s */
        void mo34902s() {
        }

        /* synthetic */ AbstractC1941e(C1936f c1936f, C1937a c1937a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1942f extends AbstractC1941e {
        C1942f() {
            super(C1936f.this, null);
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: b */
        public boolean mo34928b(int i) {
            if ((i == 8192 || i == 4096) && !C1936f.this.m34938e()) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: d */
        public boolean mo34927d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: j */
        public void mo34926j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!C1936f.this.m34938e()) {
                accessibilityNodeInfoCompat.m37605Y(AccessibilityNodeInfoCompat.C1178a.f3619r);
                accessibilityNodeInfoCompat.m37605Y(AccessibilityNodeInfoCompat.C1178a.f3618q);
                accessibilityNodeInfoCompat.m37638D0(false);
            }
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: k */
        public boolean mo34925k(int i) {
            if (mo34928b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: n */
        public CharSequence mo34924n() {
            if (mo34927d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.f$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static abstract class AbstractC1943g extends RecyclerView.AdapterDataObserver {
        private AbstractC1943g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public abstract void mo34897a();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public final void mo34923b(int i, int i2) {
            mo34897a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public final void mo34922c(int i, int i2, Object obj) {
            mo34897a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public final void mo34921d(int i, int i2) {
            mo34897a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public final void mo34920e(int i, int i2, int i3) {
            mo34897a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public final void mo34919f(int i, int i2) {
            mo34897a();
        }

        /* synthetic */ AbstractC1943g(C1937a c1937a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1944h extends LinearLayoutManager {
        C1944h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: B1 */
        public boolean mo34918B1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: V0 */
        public void mo34917V0(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.mo34917V0(recycler, state, accessibilityNodeInfoCompat);
            C1936f.this.f5361C.mo34926j(accessibilityNodeInfoCompat);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: V1 */
        public void mo27294V1(RecyclerView.State state, int[] iArr) {
            int offscreenPageLimit = C1936f.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo27294V1(state, iArr);
                return;
            }
            int pageSize = C1936f.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: p1 */
        public boolean mo34916p1(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
            if (C1936f.this.f5361C.mo34928b(i)) {
                return C1936f.this.f5361C.mo34925k(i);
            }
            return super.mo34916p1(recycler, state, i, bundle);
        }
    }

    /* renamed from: androidx.viewpager2.widget.f$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1945i {
        /* renamed from: a */
        public void mo25156a(int i) {
        }

        /* renamed from: b */
        public void mo25155b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo25154c(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1946j extends AbstractC1941e {

        /* renamed from: b */
        private final AccessibilityViewCommand f5386b;

        /* renamed from: c */
        private final AccessibilityViewCommand f5387c;

        /* renamed from: d */
        private RecyclerView.AdapterDataObserver f5388d;

        /* renamed from: androidx.viewpager2.widget.f$j$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1947a implements AccessibilityViewCommand {
            C1947a() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            /* renamed from: a */
            public boolean mo27682a(View view, AccessibilityViewCommand.AbstractC1186a abstractC1186a) {
                C1946j.this.m34899v(((C1936f) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.f$j$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1948b implements AccessibilityViewCommand {
            C1948b() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            /* renamed from: a */
            public boolean mo27682a(View view, AccessibilityViewCommand.AbstractC1186a abstractC1186a) {
                C1946j.this.m34899v(((C1936f) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.f$j$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1949c extends AbstractC1943g {
            C1949c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.C1936f.AbstractC1943g, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            /* renamed from: a */
            public void mo34897a() {
                C1946j.this.m34898w();
            }
        }

        C1946j() {
            super(C1936f.this, null);
            this.f5386b = new C1947a();
            this.f5387c = new C1948b();
        }

        /* renamed from: t */
        private void m34901t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (C1936f.this.getAdapter() != null) {
                if (C1936f.this.getOrientation() == 1) {
                    i = C1936f.this.getAdapter().getItemCount();
                    i2 = 0;
                } else {
                    i2 = C1936f.this.getAdapter().getItemCount();
                    i = 0;
                }
            } else {
                i = 0;
                i2 = 0;
            }
            AccessibilityNodeInfoCompat.m37614P0(accessibilityNodeInfo).m37586i0(AccessibilityNodeInfoCompat.C1180c.m37545b(i, i2, false, 0));
        }

        /* renamed from: u */
        private void m34900u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = C1936f.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && C1936f.this.m34938e()) {
                if (C1936f.this.f5365m > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (C1936f.this.f5365m < itemCount - 1) {
                    accessibilityNodeInfo.addAction(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: a */
        public boolean mo34915a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: c */
        public boolean mo34914c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: e */
        public void mo34913e(RecyclerView.Adapter<?> adapter) {
            m34898w();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f5388d);
            }
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: f */
        public void mo34912f(RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f5388d);
            }
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: g */
        public String mo34911g() {
            if (mo34915a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: h */
        public void mo34910h(C1931b c1931b, RecyclerView recyclerView) {
            C1365w0.m37259A0(recyclerView, 2);
            this.f5388d = new C1949c();
            if (C1365w0.m37168z(C1936f.this) == 0) {
                C1365w0.m37259A0(C1936f.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: i */
        public void mo34909i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m34901t(accessibilityNodeInfo);
            m34900u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: l */
        public boolean mo34908l(int i, Bundle bundle) {
            int currentItem;
            if (mo34914c(i, bundle)) {
                if (i == 8192) {
                    currentItem = C1936f.this.getCurrentItem() - 1;
                } else {
                    currentItem = C1936f.this.getCurrentItem() + 1;
                }
                m34899v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: m */
        public void mo34907m() {
            m34898w();
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: o */
        public void mo34906o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(C1936f.this);
            accessibilityEvent.setClassName(mo34911g());
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: p */
        public void mo34905p() {
            m34898w();
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: q */
        public void mo34904q() {
            m34898w();
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: r */
        public void mo34903r() {
            m34898w();
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1941e
        /* renamed from: s */
        public void mo34902s() {
            m34898w();
        }

        /* renamed from: v */
        void m34899v(int i) {
            if (C1936f.this.m34938e()) {
                C1936f.this.m34932k(i, true);
            }
        }

        /* renamed from: w */
        void m34898w() {
            int itemCount;
            int i;
            C1936f c1936f = C1936f.this;
            int i2 = 16908360;
            C1365w0.m37197k0(c1936f, 16908360);
            C1365w0.m37197k0(c1936f, 16908361);
            C1365w0.m37197k0(c1936f, 16908358);
            C1365w0.m37197k0(c1936f, 16908359);
            if (C1936f.this.getAdapter() == null || (itemCount = C1936f.this.getAdapter().getItemCount()) == 0 || !C1936f.this.m34938e()) {
                return;
            }
            if (C1936f.this.getOrientation() == 0) {
                boolean m34939d = C1936f.this.m34939d();
                if (m34939d) {
                    i = 16908360;
                } else {
                    i = 16908361;
                }
                if (m34939d) {
                    i2 = 16908361;
                }
                if (C1936f.this.f5365m < itemCount - 1) {
                    C1365w0.m37193m0(c1936f, new AccessibilityNodeInfoCompat.C1178a(i, null), null, this.f5386b);
                }
                if (C1936f.this.f5365m > 0) {
                    C1365w0.m37193m0(c1936f, new AccessibilityNodeInfoCompat.C1178a(i2, null), null, this.f5387c);
                    return;
                }
                return;
            }
            if (C1936f.this.f5365m < itemCount - 1) {
                C1365w0.m37193m0(c1936f, new AccessibilityNodeInfoCompat.C1178a(16908359, null), null, this.f5386b);
            }
            if (C1936f.this.f5365m > 0) {
                C1365w0.m37193m0(c1936f, new AccessibilityNodeInfoCompat.C1178a(16908358, null), null, this.f5387c);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.f$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1950k {
        /* renamed from: a */
        void mo25151a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1951l extends C1809k {
        C1951l() {
        }

        @Override // androidx.recyclerview.widget.C1809k, androidx.recyclerview.widget.AbstractC1813n
        /* renamed from: f */
        public View mo34896f(RecyclerView.LayoutManager layoutManager) {
            if (C1936f.this.m34940c()) {
                return null;
            }
            return super.mo34896f(layoutManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1952m extends RecyclerView {
        C1952m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (C1936f.this.f5361C.mo34927d()) {
                return C1936f.this.f5361C.mo34924n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(C1936f.this.f5365m);
            accessibilityEvent.setToIndex(C1936f.this.f5365m);
            C1936f.this.f5361C.mo34906o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return C1936f.this.m34938e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C1936f.this.m34938e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class RunnableC1955o implements Runnable {

        /* renamed from: j */
        private final int f5398j;

        /* renamed from: k */
        private final RecyclerView f5399k;

        RunnableC1955o(int i, RecyclerView recyclerView) {
            this.f5398j = i;
            this.f5399k = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5399k.smoothScrollToPosition(this.f5398j);
        }
    }

    public C1936f(Context context) {
        super(context);
        this.f5362j = new Rect();
        this.f5363k = new Rect();
        this.f5364l = new C1931b(3);
        this.f5366n = false;
        this.f5367o = new C1937a();
        this.f5369q = -1;
        this.f5377y = null;
        this.f5378z = false;
        this.f5359A = true;
        this.f5360B = -1;
        m34941b(context, null);
    }

    /* renamed from: a */
    private RecyclerView.OnChildAttachStateChangeListener m34942a() {
        return new C1940d();
    }

    /* renamed from: b */
    private void m34941b(Context context, AttributeSet attributeSet) {
        AbstractC1941e c1942f;
        if (f5358D) {
            c1942f = new C1946j();
        } else {
            c1942f = new C1942f();
        }
        this.f5361C = c1942f;
        C1952m c1952m = new C1952m(context);
        this.f5371s = c1952m;
        c1952m.setId(C1365w0.m37198k());
        this.f5371s.setDescendantFocusability(131072);
        C1944h c1944h = new C1944h(context);
        this.f5368p = c1944h;
        this.f5371s.setLayoutManager(c1944h);
        this.f5371s.setScrollingTouchSlop(1);
        m34931l(context, attributeSet);
        this.f5371s.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f5371s.addOnChildAttachStateChangeListener(m34942a());
        C1934e c1934e = new C1934e(this);
        this.f5373u = c1934e;
        this.f5375w = new C1932c(this, c1934e, this.f5371s);
        C1951l c1951l = new C1951l();
        this.f5372t = c1951l;
        c1951l.m35339b(this.f5371s);
        this.f5371s.addOnScrollListener(this.f5373u);
        C1931b c1931b = new C1931b(3);
        this.f5374v = c1931b;
        this.f5373u.m34946m(c1931b);
        C1938b c1938b = new C1938b();
        C1939c c1939c = new C1939c();
        this.f5374v.m34963d(c1938b);
        this.f5374v.m34963d(c1939c);
        this.f5361C.mo34910h(this.f5374v, this.f5371s);
        this.f5374v.m34963d(this.f5364l);
        C1933d c1933d = new C1933d(this.f5368p);
        this.f5376x = c1933d;
        this.f5374v.m34963d(c1933d);
        RecyclerView recyclerView = this.f5371s;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: f */
    private void m34937f(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f5367o);
        }
    }

    /* renamed from: i */
    private void m34934i() {
        RecyclerView.Adapter adapter;
        if (this.f5369q == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f5370r;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC1928a) {
                ((InterfaceC1928a) adapter).m34969b(parcelable);
            }
            this.f5370r = null;
        }
        int max = Math.max(0, Math.min(this.f5369q, adapter.getItemCount() - 1));
        this.f5365m = max;
        this.f5369q = -1;
        this.f5371s.scrollToPosition(max);
        this.f5361C.mo34907m();
    }

    /* renamed from: l */
    private void m34931l(Context context, AttributeSet attributeSet) {
        int[] iArr = C13050a.f33839g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C13050a.f33840h, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    private void m34930m(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f5367o);
        }
    }

    /* renamed from: c */
    public boolean m34940c() {
        return this.f5375w.m34961a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f5371s.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f5371s.canScrollVertically(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m34939d() {
        return this.f5368p.m35713k0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof C1953n) {
            int i = ((C1953n) parcelable).f5395j;
            sparseArray.put(this.f5371s.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m34934i();
    }

    /* renamed from: e */
    public boolean m34938e() {
        return this.f5359A;
    }

    /* renamed from: g */
    public void m34936g(AbstractC1945i abstractC1945i) {
        this.f5364l.m34963d(abstractC1945i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.f5361C.mo34915a()) {
            return this.f5361C.mo34911g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f5371s.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5365m;
    }

    public int getItemDecorationCount() {
        return this.f5371s.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5360B;
    }

    public int getOrientation() {
        return this.f5368p.m35806w2();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f5371s;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f5373u.m34953f();
    }

    /* renamed from: h */
    public void m34935h() {
        if (this.f5376x.m34960d() == null) {
            return;
        }
        double m34954e = this.f5373u.m34954e();
        int i = (int) m34954e;
        float f = (float) (m34954e - i);
        this.f5376x.mo25155b(i, f, Math.round(getPageSize() * f));
    }

    /* renamed from: j */
    public void m34933j(int i, boolean z) {
        if (!m34940c()) {
            m34932k(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* renamed from: k */
    void m34932k(int i, boolean z) {
        int i2;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f5369q != -1) {
                this.f5369q = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.f5365m && this.f5373u.m34951h()) {
                return;
            }
            int i3 = this.f5365m;
            if (min == i3 && z) {
                return;
            }
            double d = i3;
            this.f5365m = min;
            this.f5361C.mo34904q();
            if (!this.f5373u.m34951h()) {
                d = this.f5373u.m34954e();
            }
            this.f5373u.m34948k(min, z);
            if (!z) {
                this.f5371s.scrollToPosition(min);
                return;
            }
            double d2 = min;
            if (Math.abs(d2 - d) > 3.0d) {
                RecyclerView recyclerView = this.f5371s;
                if (d2 > d) {
                    i2 = min - 3;
                } else {
                    i2 = min + 3;
                }
                recyclerView.scrollToPosition(i2);
                RecyclerView recyclerView2 = this.f5371s;
                recyclerView2.post(new RunnableC1955o(min, recyclerView2));
                return;
            }
            this.f5371s.smoothScrollToPosition(min);
        }
    }

    /* renamed from: n */
    void m34929n() {
        C1809k c1809k = this.f5372t;
        if (c1809k != null) {
            View mo34896f = c1809k.mo34896f(this.f5368p);
            if (mo34896f == null) {
                return;
            }
            int m35705o0 = this.f5368p.m35705o0(mo34896f);
            if (m35705o0 != this.f5365m && getScrollState() == 0) {
                this.f5374v.mo25154c(m35705o0);
            }
            this.f5366n = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f5361C.mo34909i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f5371s.getMeasuredWidth();
        int measuredHeight = this.f5371s.getMeasuredHeight();
        this.f5362j.left = getPaddingLeft();
        this.f5362j.right = (i3 - i) - getPaddingRight();
        this.f5362j.top = getPaddingTop();
        this.f5362j.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f5362j, this.f5363k);
        RecyclerView recyclerView = this.f5371s;
        Rect rect = this.f5363k;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5366n) {
            m34929n();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        measureChild(this.f5371s, i, i2);
        int measuredWidth = this.f5371s.getMeasuredWidth();
        int measuredHeight = this.f5371s.getMeasuredHeight();
        int measuredState = this.f5371s.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1953n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1953n c1953n = (C1953n) parcelable;
        super.onRestoreInstanceState(c1953n.getSuperState());
        this.f5369q = c1953n.f5396k;
        this.f5370r = c1953n.f5397l;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1953n c1953n = new C1953n(super.onSaveInstanceState());
        c1953n.f5395j = this.f5371s.getId();
        int i = this.f5369q;
        if (i == -1) {
            i = this.f5365m;
        }
        c1953n.f5396k = i;
        Parcelable parcelable = this.f5370r;
        if (parcelable != null) {
            c1953n.f5397l = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.f5371s.getAdapter();
            if (adapter instanceof InterfaceC1928a) {
                c1953n.f5397l = ((InterfaceC1928a) adapter).m34970a();
            }
        }
        return c1953n;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(C1936f.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f5361C.mo34914c(i, bundle)) {
            return this.f5361C.mo34908l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f5371s.getAdapter();
        this.f5361C.mo34912f(adapter2);
        m34930m(adapter2);
        this.f5371s.setAdapter(adapter);
        this.f5365m = 0;
        m34934i();
        this.f5361C.mo34913e(adapter);
        m34937f(adapter);
    }

    public void setCurrentItem(int i) {
        m34933j(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f5361C.mo34905p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f5360B = i;
        this.f5371s.requestLayout();
    }

    public void setOrientation(int i) {
        this.f5368p.m35844L2(i);
        this.f5361C.mo34903r();
    }

    public void setPageTransformer(InterfaceC1950k interfaceC1950k) {
        if (interfaceC1950k != null) {
            if (!this.f5378z) {
                this.f5377y = this.f5371s.getItemAnimator();
                this.f5378z = true;
            }
            this.f5371s.setItemAnimator(null);
        } else if (this.f5378z) {
            this.f5371s.setItemAnimator(this.f5377y);
            this.f5377y = null;
            this.f5378z = false;
        }
        if (interfaceC1950k == this.f5376x.m34960d()) {
            return;
        }
        this.f5376x.m34959e(interfaceC1950k);
        m34935h();
    }

    public void setUserInputEnabled(boolean z) {
        this.f5359A = z;
        this.f5361C.mo34902s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1953n extends View.BaseSavedState {
        public static final Parcelable.Creator<C1953n> CREATOR = new C1954a();

        /* renamed from: j */
        int f5395j;

        /* renamed from: k */
        int f5396k;

        /* renamed from: l */
        Parcelable f5397l;

        /* renamed from: androidx.viewpager2.widget.f$n$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C1954a implements Parcelable.ClassLoaderCreator<C1953n> {
            C1954a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1953n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1953n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new C1953n(parcel, classLoader) : new C1953n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1953n[] newArray(int i) {
                return new C1953n[i];
            }
        }

        C1953n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m34895a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m34895a(Parcel parcel, ClassLoader classLoader) {
            this.f5395j = parcel.readInt();
            this.f5396k = parcel.readInt();
            this.f5397l = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5395j);
            parcel.writeInt(this.f5396k);
            parcel.writeParcelable(this.f5397l, i);
        }

        C1953n(Parcel parcel) {
            super(parcel);
            m34895a(parcel, null);
        }

        C1953n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
