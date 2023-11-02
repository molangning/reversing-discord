package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1365w0;
import com.facebook.react.uimanager.ViewDefaults;
import p411x.C13657a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4749a<V extends View> extends C4752c<V> {

    /* renamed from: d */
    private Runnable f13036d;

    /* renamed from: e */
    OverScroller f13037e;

    /* renamed from: f */
    private boolean f13038f;

    /* renamed from: g */
    private int f13039g;

    /* renamed from: h */
    private int f13040h;

    /* renamed from: i */
    private int f13041i;

    /* renamed from: j */
    private VelocityTracker f13042j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC4750a implements Runnable {

        /* renamed from: j */
        private final CoordinatorLayout f13043j;

        /* renamed from: k */
        private final V f13044k;

        RunnableC4750a(CoordinatorLayout coordinatorLayout, V v) {
            this.f13043j = coordinatorLayout;
            this.f13044k = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f13044k != null && (overScroller = AbstractC4749a.this.f13037e) != null) {
                if (overScroller.computeScrollOffset()) {
                    AbstractC4749a abstractC4749a = AbstractC4749a.this;
                    abstractC4749a.m27865P(this.f13043j, this.f13044k, abstractC4749a.f13037e.getCurrY());
                    C1365w0.m37201i0(this.f13044k, this);
                    return;
                }
                AbstractC4749a.this.mo27867N(this.f13043j, this.f13044k);
            }
        }
    }

    public AbstractC4749a() {
        this.f13039g = -1;
        this.f13041i = -1;
    }

    /* renamed from: I */
    private void m27872I() {
        if (this.f13042j == null) {
            this.f13042j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo26457D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f13039g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f13040h = r12
            goto L4c
        L2d:
            int r0 = r11.f13039g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f13040h
            int r7 = r1 - r0
            r11.f13040h = r0
            int r8 = r11.mo27870K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m27866O(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f13042j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f13042j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f13042j
            int r4 = r11.f13039g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo27869L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m27871J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f13038f = r3
            r11.f13039g = r1
            android.view.VelocityTracker r13 = r11.f13042j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f13042j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f13042j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f13038f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC4749a.mo26457D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    boolean mo27873H(V v) {
        return false;
    }

    /* renamed from: J */
    final boolean m27871J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f13036d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f13036d = null;
        }
        if (this.f13037e == null) {
            this.f13037e = new OverScroller(v.getContext());
        }
        this.f13037e.fling(0, mo27854E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f13037e.computeScrollOffset()) {
            RunnableC4750a runnableC4750a = new RunnableC4750a(coordinatorLayout, v);
            this.f13036d = runnableC4750a;
            C1365w0.m37201i0(v, runnableC4750a);
            return true;
        }
        mo27867N(coordinatorLayout, v);
        return false;
    }

    /* renamed from: K */
    int mo27870K(V v) {
        return -v.getHeight();
    }

    /* renamed from: L */
    int mo27869L(V v) {
        return v.getHeight();
    }

    /* renamed from: M */
    int mo27868M() {
        return mo27854E();
    }

    /* renamed from: N */
    void mo27867N(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final int m27866O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo27864Q(coordinatorLayout, v, mo27868M() - i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public int m27865P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo27864Q(coordinatorLayout, v, i, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: Q */
    int mo27864Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int m1915b;
        int mo27854E = mo27854E();
        if (i2 != 0 && mo27854E >= i2 && mo27854E <= i3 && mo27854E != (m1915b = C13657a.m1915b(i, i2, i3))) {
            mo27852G(m1915b);
            return mo27854E - m1915b;
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: k */
    public boolean mo26796k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f13041i < 0) {
            this.f13041i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f13038f) {
            int i = this.f13039g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f13040h) > this.f13041i) {
                this.f13040h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f13039g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (mo27873H(v) && coordinatorLayout.m39188v(v, x, y2)) {
                z = true;
            } else {
                z = false;
            }
            this.f13038f = z;
            if (z) {
                this.f13040h = y2;
                this.f13039g = motionEvent.getPointerId(0);
                m27872I();
                OverScroller overScroller = this.f13037e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f13037e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f13042j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC4749a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13039g = -1;
        this.f13041i = -1;
    }
}
