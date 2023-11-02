package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.p018os.C1049a;
import androidx.core.view.C1304n2;
import androidx.core.widget.C1429h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p052d.C5706a;
import p090f.C6283c;

/* renamed from: androidx.appcompat.widget.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0560r0 extends ListView {

    /* renamed from: j */
    private final Rect f1943j;

    /* renamed from: k */
    private int f1944k;

    /* renamed from: l */
    private int f1945l;

    /* renamed from: m */
    private int f1946m;

    /* renamed from: n */
    private int f1947n;

    /* renamed from: o */
    private int f1948o;

    /* renamed from: p */
    private C0564d f1949p;

    /* renamed from: q */
    private boolean f1950q;

    /* renamed from: r */
    private boolean f1951r;

    /* renamed from: s */
    private boolean f1952s;

    /* renamed from: t */
    private C1304n2 f1953t;

    /* renamed from: u */
    private C1429h f1954u;

    /* renamed from: v */
    RunnableC0566f f1955v;

    /* renamed from: androidx.appcompat.widget.r0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0561a {
        /* renamed from: a */
        static void m39715a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.r0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0562b {

        /* renamed from: a */
        private static Method f1956a;

        /* renamed from: b */
        private static Method f1957b;

        /* renamed from: c */
        private static Method f1958c;

        /* renamed from: d */
        private static boolean f1959d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1956a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1957b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1958c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1959d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        static boolean m39714a() {
            return f1959d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        static void m39713b(C0560r0 c0560r0, int i, View view) {
            try {
                f1956a.invoke(c0560r0, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f1957b.invoke(c0560r0, Integer.valueOf(i));
                f1958c.invoke(c0560r0, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0563c {
        /* renamed from: a */
        static boolean m39712a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* renamed from: b */
        static void m39711b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0564d extends C6283c {

        /* renamed from: k */
        private boolean f1960k;

        C0564d(Drawable drawable) {
            super(drawable);
            this.f1960k = true;
        }

        /* renamed from: b */
        void m39710b(boolean z) {
            this.f1960k = z;
        }

        @Override // p090f.C6283c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1960k) {
                super.draw(canvas);
            }
        }

        @Override // p090f.C6283c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1960k) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p090f.C6283c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1960k) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p090f.C6283c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1960k) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p090f.C6283c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1960k) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0565e {

        /* renamed from: a */
        private static final Field f1961a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f1961a = field;
        }

        /* renamed from: a */
        static boolean m39709a(AbsListView absListView) {
            Field field = f1961a;
            if (field != null) {
                try {
                    return field.getBoolean(absListView);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        /* renamed from: b */
        static void m39708b(AbsListView absListView, boolean z) {
            Field field = f1961a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0566f implements Runnable {
        RunnableC0566f() {
            C0560r0.this = r1;
        }

        /* renamed from: a */
        public void m39707a() {
            C0560r0 c0560r0 = C0560r0.this;
            c0560r0.f1955v = null;
            c0560r0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m39706b() {
            C0560r0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0560r0 c0560r0 = C0560r0.this;
            c0560r0.f1955v = null;
            c0560r0.drawableStateChanged();
        }
    }

    public C0560r0(Context context, boolean z) {
        super(context, null, C5706a.f16032A);
        this.f1943j = new Rect();
        this.f1944k = 0;
        this.f1945l = 0;
        this.f1946m = 0;
        this.f1947n = 0;
        this.f1951r = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    private void m39728a() {
        this.f1952s = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1948o - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1304n2 c1304n2 = this.f1953t;
        if (c1304n2 != null) {
            c1304n2.m37369c();
            this.f1953t = null;
        }
    }

    /* renamed from: b */
    private void m39727b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m39726c(Canvas canvas) {
        Drawable selector;
        if (!this.f1943j.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1943j);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m39723f(int i, View view) {
        Rect rect = this.f1943j;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1944k;
        rect.top -= this.f1945l;
        rect.right += this.f1946m;
        rect.bottom += this.f1947n;
        boolean m39719j = m39719j();
        if (view.isEnabled() != m39719j) {
            m39718k(!m39719j);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: g */
    private void m39722g(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector != null && i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        m39723f(i, view);
        if (z) {
            Rect rect = this.f1943j;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            C1013a.m38087k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m39721h(int i, View view, float f, float f2) {
        m39722g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C1013a.m38087k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m39720i(View view, int i, float f, float f2) {
        View childAt;
        this.f1952s = true;
        C0561a.m39715a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1948o;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1948o = i;
        C0561a.m39715a(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m39721h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m39719j() {
        if (C1049a.m37988c()) {
            return C0563c.m39712a(this);
        }
        return C0565e.m39709a(this);
    }

    /* renamed from: k */
    private void m39718k(boolean z) {
        if (C1049a.m37988c()) {
            C0563c.m39711b(this, z);
        } else {
            C0565e.m39708b(this, z);
        }
    }

    /* renamed from: l */
    private boolean m39717l() {
        return this.f1952s;
    }

    /* renamed from: m */
    private void m39716m() {
        Drawable selector = getSelector();
        if (selector != null && m39717l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0564d c0564d = this.f1949p;
        if (c0564d != null) {
            c0564d.m39710b(z);
        }
    }

    /* renamed from: d */
    public int mo39725d(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            if (i10 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i9 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                if (i5 >= 0 && i9 > i5 && i8 > 0 && i6 != i4) {
                    return i8;
                }
                return i4;
            }
            if (i5 >= 0 && i9 >= i5) {
                i8 = i6;
            }
        }
        return i6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m39726c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1955v != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m39716m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0065  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo39724e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m39720i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.m39727b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m39728a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.h r9 = r7.f1954u
            if (r9 != 0) goto L5a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f1954u = r9
        L5a:
            androidx.core.widget.h r9 = r7.f1954u
            r9.m36951m(r1)
            androidx.core.widget.h r9 = r7.f1954u
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.h r8 = r7.f1954u
            if (r8 == 0) goto L6c
            r8.m36951m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0560r0.mo39724e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1951r || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1951r || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1951r || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1951r && this.f1950q) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1955v = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1955v == null) {
            RunnableC0566f runnableC0566f = new RunnableC0566f();
            this.f1955v = runnableC0566f;
            runnableC0566f.m39706b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C0562b.m39714a()) {
                        C0562b.m39713b(this, pointToPosition, childAt);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                m39716m();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1948o = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0566f runnableC0566f = this.f1955v;
        if (runnableC0566f != null) {
            runnableC0566f.m39707a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1950q = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0564d c0564d;
        if (drawable != null) {
            c0564d = new C0564d(drawable);
        } else {
            c0564d = null;
        }
        this.f1949p = c0564d;
        super.setSelector(c0564d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1944k = rect.left;
        this.f1945l = rect.top;
        this.f1946m = rect.right;
        this.f1947n = rect.bottom;
    }
}