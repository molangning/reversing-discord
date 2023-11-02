package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1262g2;
import androidx.core.view.C1365w0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.v1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class View$OnLongClickListenerC0593v1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: t */
    private static View$OnLongClickListenerC0593v1 f2040t;

    /* renamed from: u */
    private static View$OnLongClickListenerC0593v1 f2041u;

    /* renamed from: j */
    private final View f2042j;

    /* renamed from: k */
    private final CharSequence f2043k;

    /* renamed from: l */
    private final int f2044l;

    /* renamed from: m */
    private final Runnable f2045m = new Runnable() { // from class: androidx.appcompat.widget.t1
        @Override // java.lang.Runnable
        public final void run() {
            View$OnLongClickListenerC0593v1.this.m39619e();
        }
    };

    /* renamed from: n */
    private final Runnable f2046n = new Runnable() { // from class: androidx.appcompat.widget.u1
        @Override // java.lang.Runnable
        public final void run() {
            View$OnLongClickListenerC0593v1.this.m39620d();
        }
    };

    /* renamed from: o */
    private int f2047o;

    /* renamed from: p */
    private int f2048p;

    /* renamed from: q */
    private C0610w1 f2049q;

    /* renamed from: r */
    private boolean f2050r;

    /* renamed from: s */
    private boolean f2051s;

    private View$OnLongClickListenerC0593v1(View view, CharSequence charSequence) {
        this.f2042j = view;
        this.f2043k = charSequence;
        this.f2044l = C1262g2.m37448c(ViewConfiguration.get(view.getContext()));
        m39621c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    private void m39622b() {
        this.f2042j.removeCallbacks(this.f2045m);
    }

    /* renamed from: c */
    private void m39621c() {
        this.f2051s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m39619e() {
        m39615i(false);
    }

    /* renamed from: f */
    private void m39618f() {
        this.f2042j.postDelayed(this.f2045m, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    private static void m39617g(View$OnLongClickListenerC0593v1 view$OnLongClickListenerC0593v1) {
        View$OnLongClickListenerC0593v1 view$OnLongClickListenerC0593v12 = f2040t;
        if (view$OnLongClickListenerC0593v12 != null) {
            view$OnLongClickListenerC0593v12.m39622b();
        }
        f2040t = view$OnLongClickListenerC0593v1;
        if (view$OnLongClickListenerC0593v1 != null) {
            view$OnLongClickListenerC0593v1.m39618f();
        }
    }

    /* renamed from: h */
    public static void m39616h(View view, CharSequence charSequence) {
        View$OnLongClickListenerC0593v1 view$OnLongClickListenerC0593v1 = f2040t;
        if (view$OnLongClickListenerC0593v1 != null && view$OnLongClickListenerC0593v1.f2042j == view) {
            m39617g(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC0593v1 view$OnLongClickListenerC0593v12 = f2041u;
            if (view$OnLongClickListenerC0593v12 != null && view$OnLongClickListenerC0593v12.f2042j == view) {
                view$OnLongClickListenerC0593v12.m39620d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC0593v1(view, charSequence);
    }

    /* renamed from: j */
    private boolean m39614j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f2051s && Math.abs(x - this.f2047o) <= this.f2044l && Math.abs(y - this.f2048p) <= this.f2044l) {
            return false;
        }
        this.f2047o = x;
        this.f2048p = y;
        this.f2051s = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m39620d() {
        if (f2041u == this) {
            f2041u = null;
            C0610w1 c0610w1 = this.f2049q;
            if (c0610w1 != null) {
                c0610w1.m39583c();
                this.f2049q = null;
                m39621c();
                this.f2042j.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2040t == this) {
            m39617g(null);
        }
        this.f2042j.removeCallbacks(this.f2046n);
    }

    /* renamed from: i */
    void m39615i(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (!C1365w0.m37225T(this.f2042j)) {
            return;
        }
        m39617g(null);
        View$OnLongClickListenerC0593v1 view$OnLongClickListenerC0593v1 = f2041u;
        if (view$OnLongClickListenerC0593v1 != null) {
            view$OnLongClickListenerC0593v1.m39620d();
        }
        f2041u = this;
        this.f2050r = z;
        C0610w1 c0610w1 = new C0610w1(this.f2042j.getContext());
        this.f2049q = c0610w1;
        c0610w1.m39581e(this.f2042j, this.f2047o, this.f2048p, this.f2050r, this.f2043k);
        this.f2042j.addOnAttachStateChangeListener(this);
        if (this.f2050r) {
            j2 = 2500;
        } else {
            if ((C1365w0.m37236M(this.f2042j) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.f2042j.removeCallbacks(this.f2046n);
        this.f2042j.postDelayed(this.f2046n, j2);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2049q != null && this.f2050r) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2042j.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m39621c();
                m39620d();
            }
        } else if (this.f2042j.isEnabled() && this.f2049q == null && m39614j(motionEvent)) {
            m39617g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2047o = view.getWidth() / 2;
        this.f2048p = view.getHeight() / 2;
        m39615i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m39620d();
    }
}
