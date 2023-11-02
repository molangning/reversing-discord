package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.InterfaceC0410p;

/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractView$OnTouchListenerC0574t0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: j */
    private final float f1963j;

    /* renamed from: k */
    private final int f1964k;

    /* renamed from: l */
    private final int f1965l;

    /* renamed from: m */
    final View f1966m;

    /* renamed from: n */
    private Runnable f1967n;

    /* renamed from: o */
    private Runnable f1968o;

    /* renamed from: p */
    private boolean f1969p;

    /* renamed from: q */
    private int f1970q;

    /* renamed from: r */
    private final int[] f1971r = new int[2];

    /* renamed from: androidx.appcompat.widget.t0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0575a implements Runnable {
        RunnableC0575a() {
            AbstractView$OnTouchListenerC0574t0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC0574t0.this.f1966m.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0576b implements Runnable {
        RunnableC0576b() {
            AbstractView$OnTouchListenerC0574t0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC0574t0.this.m39693e();
        }
    }

    public AbstractView$OnTouchListenerC0574t0(View view) {
        this.f1966m = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1963j = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1964k = tapTimeout;
        this.f1965l = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m39695a() {
        Runnable runnable = this.f1968o;
        if (runnable != null) {
            this.f1966m.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1967n;
        if (runnable2 != null) {
            this.f1966m.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m39692f(MotionEvent motionEvent) {
        C0560r0 c0560r0;
        boolean z;
        View view = this.f1966m;
        InterfaceC0410p mo39611b = mo39611b();
        if (mo39611b == null || !mo39611b.isShowing() || (c0560r0 = (C0560r0) mo39611b.mo39639n()) == null || !c0560r0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m39689i(view, obtainNoHistory);
        m39688j(c0560r0, obtainNoHistory);
        boolean mo39724e = c0560r0.mo39724e(obtainNoHistory, this.f1970q);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            z = true;
        } else {
            z = false;
        }
        if (!mo39724e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m39691g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1966m
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1970q
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1963j
            boolean r6 = m39690h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m39695a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m39695a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1970q = r6
            java.lang.Runnable r6 = r5.f1967n
            if (r6 != 0) goto L52
            androidx.appcompat.widget.t0$a r6 = new androidx.appcompat.widget.t0$a
            r6.<init>()
            r5.f1967n = r6
        L52:
            java.lang.Runnable r6 = r5.f1967n
            int r1 = r5.f1964k
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1968o
            if (r6 != 0) goto L65
            androidx.appcompat.widget.t0$b r6 = new androidx.appcompat.widget.t0$b
            r6.<init>()
            r5.f1968o = r6
        L65:
            java.lang.Runnable r6 = r5.f1968o
            int r1 = r5.f1965l
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0.m39691g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m39690h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f >= f4 && f2 >= f4 && f < (view.getRight() - view.getLeft()) + f3 && f2 < (view.getBottom() - view.getTop()) + f3) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m39689i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1971r;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m39688j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1971r;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC0410p mo39611b();

    /* renamed from: c */
    protected abstract boolean mo39610c();

    /* renamed from: d */
    protected boolean mo39694d() {
        InterfaceC0410p mo39611b = mo39611b();
        if (mo39611b != null && mo39611b.isShowing()) {
            mo39611b.dismiss();
            return true;
        }
        return true;
    }

    /* renamed from: e */
    void m39693e() {
        m39695a();
        View view = this.f1966m;
        if (!view.isEnabled() || view.isLongClickable() || !mo39610c()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.f1969p = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1969p;
        if (z2) {
            if (!m39692f(motionEvent) && mo39694d()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            if (m39691g(motionEvent) && mo39610c()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1966m.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1969p = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1969p = false;
        this.f1970q = -1;
        Runnable runnable = this.f1967n;
        if (runnable != null) {
            this.f1966m.removeCallbacks(runnable);
        }
    }
}