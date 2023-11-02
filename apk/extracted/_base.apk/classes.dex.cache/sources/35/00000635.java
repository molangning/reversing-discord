package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C1365w0;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ViewDragHelper {

    /* renamed from: x */
    private static final Interpolator f3797x = new animationInterpolatorC1450a();

    /* renamed from: a */
    private int f3798a;

    /* renamed from: b */
    private int f3799b;

    /* renamed from: d */
    private float[] f3801d;

    /* renamed from: e */
    private float[] f3802e;

    /* renamed from: f */
    private float[] f3803f;

    /* renamed from: g */
    private float[] f3804g;

    /* renamed from: h */
    private int[] f3805h;

    /* renamed from: i */
    private int[] f3806i;

    /* renamed from: j */
    private int[] f3807j;

    /* renamed from: k */
    private int f3808k;

    /* renamed from: l */
    private VelocityTracker f3809l;

    /* renamed from: m */
    private float f3810m;

    /* renamed from: n */
    private float f3811n;

    /* renamed from: o */
    private int f3812o;

    /* renamed from: p */
    private final int f3813p;

    /* renamed from: q */
    private int f3814q;

    /* renamed from: r */
    private OverScroller f3815r;

    /* renamed from: s */
    private final AbstractC1452c f3816s;

    /* renamed from: t */
    private View f3817t;

    /* renamed from: u */
    private boolean f3818u;

    /* renamed from: v */
    private final ViewGroup f3819v;

    /* renamed from: c */
    private int f3800c = -1;

    /* renamed from: w */
    private final Runnable f3820w = new RunnableC1451b();

    /* renamed from: androidx.customview.widget.ViewDragHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class animationInterpolatorC1450a implements Interpolator {
        animationInterpolatorC1450a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.customview.widget.ViewDragHelper$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1451b implements Runnable {
        RunnableC1451b() {
            ViewDragHelper.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.m36795K(0);
        }
    }

    /* renamed from: androidx.customview.widget.ViewDragHelper$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1452c {
        /* renamed from: a */
        public abstract int mo27690a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo27689b(View view, int i, int i2);

        /* renamed from: c */
        public int m36761c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo27825d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo27688e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo36760f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo36759g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo36758h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo27824i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo27687j(int i);

        /* renamed from: k */
        public abstract void mo27686k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo27685l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo27684m(View view, int i);
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, AbstractC1452c abstractC1452c) {
        if (viewGroup != null) {
            if (abstractC1452c != null) {
                this.f3819v = viewGroup;
                this.f3816s = abstractC1452c;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f3813p = i;
                this.f3812o = i;
                this.f3799b = viewConfiguration.getScaledTouchSlop();
                this.f3810m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f3811n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f3815r = new OverScroller(context, f3797x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    /* renamed from: D */
    private boolean m36802D(int i) {
        if (!m36803C(i)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private void m36799G() {
        this.f3809l.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f3810m);
        m36772p(m36781g(this.f3809l.getXVelocity(this.f3800c), this.f3811n, this.f3810m), m36781g(this.f3809l.getYVelocity(this.f3800c), this.f3811n, this.f3810m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$c] */
    /* renamed from: H */
    private void m36798H(float f, float f2, int i) {
        boolean m36785c = m36785c(f, f2, i, 1);
        boolean z = m36785c;
        if (m36785c(f2, f, i, 4)) {
            z = m36785c | true;
        }
        boolean z2 = z;
        if (m36785c(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (m36785c(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.f3806i;
            iArr[i] = iArr[i] | r0;
            this.f3816s.mo36760f(r0, i);
        }
    }

    /* renamed from: I */
    private void m36797I(float f, float f2, int i) {
        m36769s(i);
        float[] fArr = this.f3801d;
        this.f3803f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f3802e;
        this.f3804g[i] = f2;
        fArr2[i] = f2;
        this.f3805h[i] = m36763y((int) f, (int) f2);
        this.f3808k |= 1 << i;
    }

    /* renamed from: J */
    private void m36796J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m36802D(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3803f[pointerId] = x;
                this.f3804g[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m36785c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3805h[i] & i2) != i2 || (this.f3814q & i2) == 0 || (this.f3807j[i] & i2) == i2 || (this.f3806i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f3799b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f3816s.mo36759g(i2)) {
            int[] iArr = this.f3807j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f3806i[i] & i2) != 0 || abs <= this.f3799b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    private boolean m36782f(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f3816s.mo27825d(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f3816s.mo27688e(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f3799b;
            if ((f * f) + (f2 * f2) <= i * i) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.f3799b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.f3799b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    private float m36781g(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: h */
    private int m36780h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: i */
    private void m36779i() {
        float[] fArr = this.f3801d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f3802e, 0.0f);
        Arrays.fill(this.f3803f, 0.0f);
        Arrays.fill(this.f3804g, 0.0f);
        Arrays.fill(this.f3805h, 0);
        Arrays.fill(this.f3806i, 0);
        Arrays.fill(this.f3807j, 0);
        this.f3808k = 0;
    }

    /* renamed from: j */
    private void m36778j(int i) {
        if (this.f3801d != null && m36803C(i)) {
            this.f3801d[i] = 0.0f;
            this.f3802e[i] = 0.0f;
            this.f3803f[i] = 0.0f;
            this.f3804g[i] = 0.0f;
            this.f3805h[i] = 0;
            this.f3806i[i] = 0;
            this.f3807j[i] = 0;
            this.f3808k = (~(1 << i)) & this.f3808k;
        }
    }

    /* renamed from: k */
    private int m36777k(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f3819v.getWidth();
        float f = width / 2;
        float m36771q = f + (m36771q(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m36771q / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: l */
    private int m36776l(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m36780h = m36780h(i3, (int) this.f3811n, (int) this.f3810m);
        int m36780h2 = m36780h(i4, (int) this.f3811n, (int) this.f3810m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m36780h);
        int abs4 = Math.abs(m36780h2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m36780h != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m36780h2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m36777k(i, m36780h, this.f3816s.mo27825d(view)) * f5) + (m36777k(i2, m36780h2, this.f3816s.mo27688e(view)) * (f3 / f4)));
    }

    /* renamed from: n */
    public static ViewDragHelper m36774n(ViewGroup viewGroup, float f, AbstractC1452c abstractC1452c) {
        ViewDragHelper m36773o = m36773o(viewGroup, abstractC1452c);
        m36773o.f3799b = (int) (m36773o.f3799b * (1.0f / f));
        return m36773o;
    }

    /* renamed from: o */
    public static ViewDragHelper m36773o(ViewGroup viewGroup, AbstractC1452c abstractC1452c) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, abstractC1452c);
    }

    /* renamed from: p */
    private void m36772p(float f, float f2) {
        this.f3818u = true;
        this.f3816s.mo27685l(this.f3817t, f, f2);
        this.f3818u = false;
        if (this.f3798a == 1) {
            m36795K(0);
        }
    }

    /* renamed from: q */
    private float m36771q(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: r */
    private void m36770r(int i, int i2, int i3, int i4) {
        int left = this.f3817t.getLeft();
        int top = this.f3817t.getTop();
        if (i3 != 0) {
            i = this.f3816s.mo27690a(this.f3817t, i, i3);
            C1365w0.m37217a0(this.f3817t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f3816s.mo27689b(this.f3817t, i2, i4);
            C1365w0.m37215b0(this.f3817t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f3816s.mo27686k(this.f3817t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: s */
    private void m36769s(int i) {
        float[] fArr = this.f3801d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3802e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3803f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3804g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3805h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3806i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3807j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3801d = fArr2;
            this.f3802e = fArr3;
            this.f3803f = fArr4;
            this.f3804g = fArr5;
            this.f3805h = iArr;
            this.f3806i = iArr2;
            this.f3807j = iArr3;
        }
    }

    /* renamed from: u */
    private boolean m36767u(int i, int i2, int i3, int i4) {
        int left = this.f3817t.getLeft();
        int top = this.f3817t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3815r.abortAnimation();
            m36795K(0);
            return false;
        }
        this.f3815r.startScroll(left, top, i5, i6, m36776l(this.f3817t, i5, i6, i3, i4));
        m36795K(2);
        return true;
    }

    /* renamed from: y */
    private int m36763y(int i, int i2) {
        int i3;
        if (i < this.f3819v.getLeft() + this.f3812o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f3819v.getTop() + this.f3812o) {
            i3 |= 4;
        }
        if (i > this.f3819v.getRight() - this.f3812o) {
            i3 |= 2;
        }
        if (i2 > this.f3819v.getBottom() - this.f3812o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: A */
    public int m36805A() {
        return this.f3798a;
    }

    /* renamed from: B */
    public boolean m36804B(int i, int i2) {
        return m36801E(this.f3817t, i, i2);
    }

    /* renamed from: C */
    public boolean m36803C(int i) {
        return ((1 << i) & this.f3808k) != 0;
    }

    /* renamed from: E */
    public boolean m36801E(View view, int i, int i2) {
        if (view == null || i < view.getLeft() || i >= view.getRight() || i2 < view.getTop() || i2 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public void m36800F(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m36787a();
        }
        if (this.f3809l == null) {
            this.f3809l = VelocityTracker.obtain();
        }
        this.f3809l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f3798a == 1 && pointerId == this.f3800c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.f3800c) {
                                                View m36768t = m36768t((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.f3817t;
                                                if (m36768t == view && m36788R(view, pointerId2)) {
                                                    i = this.f3800c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        m36799G();
                                    }
                                }
                                m36778j(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        m36797I(x, y, pointerId3);
                        if (this.f3798a == 0) {
                            m36788R(m36768t((int) x, (int) y), pointerId3);
                            int i3 = this.f3805h[pointerId3];
                            int i4 = this.f3814q;
                            if ((i3 & i4) != 0) {
                                this.f3816s.mo36758h(i3 & i4, pointerId3);
                                return;
                            }
                            return;
                        } else if (m36804B((int) x, (int) y)) {
                            m36788R(this.f3817t, pointerId3);
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.f3798a == 1) {
                        m36772p(0.0f, 0.0f);
                    }
                    m36787a();
                    return;
                } else if (this.f3798a == 1) {
                    if (m36802D(this.f3800c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f3800c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f3803f;
                        int i5 = this.f3800c;
                        int i6 = (int) (x2 - fArr[i5]);
                        int i7 = (int) (y2 - this.f3804g[i5]);
                        m36770r(this.f3817t.getLeft() + i6, this.f3817t.getTop() + i7, i6, i7);
                        m36796J(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i2 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (m36802D(pointerId4)) {
                            float x3 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x3 - this.f3801d[pointerId4];
                            float f2 = y3 - this.f3802e[pointerId4];
                            m36798H(f, f2, pointerId4);
                            if (this.f3798a != 1) {
                                View m36768t2 = m36768t((int) x3, (int) y3);
                                if (m36782f(m36768t2, f, f2) && m36788R(m36768t2, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                    m36796J(motionEvent);
                    return;
                }
            }
            if (this.f3798a == 1) {
                m36799G();
            }
            m36787a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View m36768t3 = m36768t((int) x4, (int) y4);
        m36797I(x4, y4, pointerId5);
        m36788R(m36768t3, pointerId5);
        int i8 = this.f3805h[pointerId5];
        int i9 = this.f3814q;
        if ((i8 & i9) != 0) {
            this.f3816s.mo36758h(i8 & i9, pointerId5);
        }
    }

    /* renamed from: K */
    void m36795K(int i) {
        this.f3819v.removeCallbacks(this.f3820w);
        if (this.f3798a != i) {
            this.f3798a = i;
            this.f3816s.mo27687j(i);
            if (this.f3798a == 0) {
                this.f3817t = null;
            }
        }
    }

    /* renamed from: L */
    public void m36794L(int i) {
        this.f3812o = i;
    }

    /* renamed from: M */
    public void m36793M(int i) {
        this.f3814q = i;
    }

    /* renamed from: N */
    public void m36792N(float f) {
        this.f3811n = f;
    }

    /* renamed from: O */
    public boolean m36791O(int i, int i2) {
        if (this.f3818u) {
            return m36767u(i, i2, (int) this.f3809l.getXVelocity(this.f3800c), (int) this.f3809l.getYVelocity(this.f3800c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m36790P(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.m36790P(android.view.MotionEvent):boolean");
    }

    /* renamed from: Q */
    public boolean m36789Q(View view, int i, int i2) {
        this.f3817t = view;
        this.f3800c = -1;
        boolean m36767u = m36767u(i, i2, 0, 0);
        if (!m36767u && this.f3798a == 0 && this.f3817t != null) {
            this.f3817t = null;
        }
        return m36767u;
    }

    /* renamed from: R */
    boolean m36788R(View view, int i) {
        if (view == this.f3817t && this.f3800c == i) {
            return true;
        }
        if (view != null && this.f3816s.mo27684m(view, i)) {
            this.f3800c = i;
            m36786b(view, i);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m36787a() {
        this.f3800c = -1;
        m36779i();
        VelocityTracker velocityTracker = this.f3809l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3809l = null;
        }
    }

    /* renamed from: b */
    public void m36786b(View view, int i) {
        if (view.getParent() == this.f3819v) {
            this.f3817t = view;
            this.f3800c = i;
            this.f3816s.mo27824i(view, i);
            m36795K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3819v + ")");
    }

    /* renamed from: d */
    public boolean m36784d(int i) {
        int length = this.f3801d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m36783e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean m36783e(int i, int i2) {
        boolean z;
        boolean z2;
        if (!m36803C(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f3803f[i2] - this.f3801d[i2];
        float f2 = this.f3804g[i2] - this.f3802e[i2];
        if (z && z2) {
            int i3 = this.f3799b;
            if ((f * f) + (f2 * f2) <= i3 * i3) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.f3799b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.f3799b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public boolean m36775m(boolean z) {
        if (this.f3798a == 2) {
            boolean computeScrollOffset = this.f3815r.computeScrollOffset();
            int currX = this.f3815r.getCurrX();
            int currY = this.f3815r.getCurrY();
            int left = currX - this.f3817t.getLeft();
            int top = currY - this.f3817t.getTop();
            if (left != 0) {
                C1365w0.m37217a0(this.f3817t, left);
            }
            if (top != 0) {
                C1365w0.m37215b0(this.f3817t, top);
            }
            if (left != 0 || top != 0) {
                this.f3816s.mo27686k(this.f3817t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3815r.getFinalX() && currY == this.f3815r.getFinalY()) {
                this.f3815r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f3819v.post(this.f3820w);
                } else {
                    m36795K(0);
                }
            }
        }
        if (this.f3798a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public View m36768t(int i, int i2) {
        for (int childCount = this.f3819v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3819v.getChildAt(this.f3816s.m36761c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public View m36766v() {
        return this.f3817t;
    }

    /* renamed from: w */
    public int m36765w() {
        return this.f3813p;
    }

    /* renamed from: x */
    public int m36764x() {
        return this.f3812o;
    }

    /* renamed from: z */
    public int m36762z() {
        return this.f3799b;
    }
}