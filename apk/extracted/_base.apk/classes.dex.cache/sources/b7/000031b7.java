package p073e1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p092f1.C6303a;
import p146i1.C7376a;
import p146i1.C7377b;
import p167j1.C8782c;
import p167j1.C8784e;
import p167j1.C8787h;
import p223m1.C10233c;
import p254o1.C10971v;
import p291q1.C11674f;
import p291q1.C11679k;
import p291q1.Choreographer$FrameCallbackC11677i;
import p291q1.ThreadFactoryC11675g;
import p311r1.C12022c;

/* renamed from: e1.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6059j0 extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: Y */
    private static final Executor f17172Y = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC11675g());

    /* renamed from: A */
    private int f17173A;

    /* renamed from: B */
    private boolean f17174B;

    /* renamed from: C */
    private boolean f17175C;

    /* renamed from: D */
    private boolean f17176D;

    /* renamed from: E */
    private EnumC6090w0 f17177E;

    /* renamed from: F */
    private boolean f17178F;

    /* renamed from: G */
    private final Matrix f17179G;

    /* renamed from: H */
    private Bitmap f17180H;

    /* renamed from: I */
    private Canvas f17181I;

    /* renamed from: J */
    private Rect f17182J;

    /* renamed from: K */
    private RectF f17183K;

    /* renamed from: L */
    private Paint f17184L;

    /* renamed from: M */
    private Rect f17185M;

    /* renamed from: N */
    private Rect f17186N;

    /* renamed from: O */
    private RectF f17187O;

    /* renamed from: P */
    private RectF f17188P;

    /* renamed from: Q */
    private Matrix f17189Q;

    /* renamed from: R */
    private Matrix f17190R;

    /* renamed from: S */
    private EnumC6035a f17191S;

    /* renamed from: T */
    private final ValueAnimator.AnimatorUpdateListener f17192T;

    /* renamed from: U */
    private final Semaphore f17193U;

    /* renamed from: V */
    private final Runnable f17194V;

    /* renamed from: W */
    private float f17195W;

    /* renamed from: X */
    private boolean f17196X;

    /* renamed from: j */
    private C6062k f17197j;

    /* renamed from: k */
    private final Choreographer$FrameCallbackC11677i f17198k;

    /* renamed from: l */
    private boolean f17199l;

    /* renamed from: m */
    private boolean f17200m;

    /* renamed from: n */
    private boolean f17201n;

    /* renamed from: o */
    private EnumC6061b f17202o;

    /* renamed from: p */
    private final ArrayList<InterfaceC6060a> f17203p;

    /* renamed from: q */
    private C7377b f17204q;

    /* renamed from: r */
    private String f17205r;

    /* renamed from: s */
    private C7376a f17206s;

    /* renamed from: t */
    private Map<String, Typeface> f17207t;

    /* renamed from: u */
    String f17208u;

    /* renamed from: v */
    C6095y0 f17209v;

    /* renamed from: w */
    private boolean f17210w;

    /* renamed from: x */
    private boolean f17211x;

    /* renamed from: y */
    private boolean f17212y;

    /* renamed from: z */
    private C10233c f17213z;

    /* renamed from: e1.j0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC6060a {
        /* renamed from: a */
        void mo23582a(C6062k c6062k);
    }

    /* renamed from: e1.j0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC6061b {
        NONE,
        PLAY,
        RESUME
    }

    public C6059j0() {
        Choreographer$FrameCallbackC11677i choreographer$FrameCallbackC11677i = new Choreographer$FrameCallbackC11677i();
        this.f17198k = choreographer$FrameCallbackC11677i;
        this.f17199l = true;
        this.f17200m = false;
        this.f17201n = false;
        this.f17202o = EnumC6061b.NONE;
        this.f17203p = new ArrayList<>();
        this.f17211x = false;
        this.f17212y = true;
        this.f17173A = 255;
        this.f17177E = EnumC6090w0.AUTOMATIC;
        this.f17178F = false;
        this.f17179G = new Matrix();
        this.f17191S = EnumC6035a.AUTOMATIC;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: e1.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C6059j0.this.m23720f0(valueAnimator);
            }
        };
        this.f17192T = animatorUpdateListener;
        this.f17193U = new Semaphore(1);
        this.f17194V = new Runnable() { // from class: e1.a0
            @Override // java.lang.Runnable
            public final void run() {
                C6059j0.this.m23717g0();
            }
        };
        this.f17195W = -3.4028235E38f;
        this.f17196X = false;
        choreographer$FrameCallbackC11677i.addUpdateListener(animatorUpdateListener);
    }

    /* renamed from: C */
    private void m23784C(int i, int i2) {
        Bitmap bitmap = this.f17180H;
        if (bitmap != null && bitmap.getWidth() >= i && this.f17180H.getHeight() >= i2) {
            if (this.f17180H.getWidth() > i || this.f17180H.getHeight() > i2) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f17180H, 0, 0, i, i2);
                this.f17180H = createBitmap;
                this.f17181I.setBitmap(createBitmap);
                this.f17196X = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.f17180H = createBitmap2;
        this.f17181I.setBitmap(createBitmap2);
        this.f17196X = true;
    }

    /* renamed from: D */
    private void m23782D() {
        if (this.f17181I != null) {
            return;
        }
        this.f17181I = new Canvas();
        this.f17188P = new RectF();
        this.f17189Q = new Matrix();
        this.f17190R = new Matrix();
        this.f17182J = new Rect();
        this.f17183K = new RectF();
        this.f17184L = new C6303a();
        this.f17185M = new Rect();
        this.f17186N = new Rect();
        this.f17187O = new RectF();
    }

    /* renamed from: J */
    private Context m23770J() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    /* renamed from: K */
    private C7376a m23768K() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f17206s == null) {
            C7376a c7376a = new C7376a(getCallback(), null);
            this.f17206s = c7376a;
            String str = this.f17208u;
            if (str != null) {
                c7376a.m20824c(str);
            }
        }
        return this.f17206s;
    }

    /* renamed from: M */
    private C7377b m23764M() {
        C7377b c7377b = this.f17204q;
        if (c7377b != null && !c7377b.m20820b(m23770J())) {
            this.f17204q = null;
        }
        if (this.f17204q == null) {
            this.f17204q = new C7377b(getCallback(), this.f17205r, null, this.f17197j.m23667j());
        }
        return this.f17204q;
    }

    /* renamed from: a0 */
    private boolean m23735a0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) parent).getClipChildren();
    }

    /* renamed from: e0 */
    public /* synthetic */ void m23723e0(C8784e c8784e, Object obj, C12022c c12022c, C6062k c6062k) {
        m23697q(c8784e, obj, c12022c);
    }

    /* renamed from: f0 */
    public /* synthetic */ void m23720f0(ValueAnimator valueAnimator) {
        if (m23778F()) {
            invalidateSelf();
            return;
        }
        C10233c c10233c = this.f17213z;
        if (c10233c != null) {
            c10233c.mo12087M(this.f17198k.m7217m());
        }
    }

    /* renamed from: f1 */
    private boolean m23719f1() {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            return false;
        }
        float f = this.f17195W;
        float m7217m = this.f17198k.m7217m();
        this.f17195W = m7217m;
        if (Math.abs(m7217m - f) * c6062k.m23673d() < 50.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    public /* synthetic */ void m23717g0() {
        C10233c c10233c = this.f17213z;
        if (c10233c == null) {
            return;
        }
        try {
            this.f17193U.acquire();
            c10233c.mo12087M(this.f17198k.m7217m());
        } catch (InterruptedException unused) {
        } catch (Throwable th2) {
            this.f17193U.release();
            throw th2;
        }
        this.f17193U.release();
    }

    /* renamed from: h0 */
    public /* synthetic */ void m23714h0(C6062k c6062k) {
        m23688u0();
    }

    /* renamed from: i0 */
    public /* synthetic */ void m23712i0(C6062k c6062k) {
        m23682x0();
    }

    /* renamed from: j0 */
    public /* synthetic */ void m23710j0(int i, C6062k c6062k) {
        m23773H0(i);
    }

    /* renamed from: k0 */
    public /* synthetic */ void m23708k0(int i, C6062k c6062k) {
        m23763M0(i);
    }

    /* renamed from: l0 */
    public /* synthetic */ void m23706l0(String str, C6062k c6062k) {
        m23761N0(str);
    }

    /* renamed from: m0 */
    public /* synthetic */ void m23704m0(float f, C6062k c6062k) {
        m23759O0(f);
    }

    /* renamed from: n0 */
    public /* synthetic */ void m23702n0(String str, C6062k c6062k) {
        m23755Q0(str);
    }

    /* renamed from: o0 */
    public /* synthetic */ void m23700o0(int i, int i2, C6062k c6062k) {
        m23757P0(i, i2);
    }

    /* renamed from: p0 */
    public /* synthetic */ void m23698p0(int i, C6062k c6062k) {
        m23753R0(i);
    }

    /* renamed from: q0 */
    public /* synthetic */ void m23696q0(String str, C6062k c6062k) {
        m23751S0(str);
    }

    /* renamed from: r */
    private boolean m23695r() {
        return this.f17199l || this.f17200m;
    }

    /* renamed from: r0 */
    public /* synthetic */ void m23694r0(float f, C6062k c6062k) {
        m23749T0(f);
    }

    /* renamed from: s */
    private void m23693s() {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            return;
        }
        C10233c c10233c = new C10233c(this, C10971v.m9440a(c6062k), c6062k.m23666k(), c6062k);
        this.f17213z = c10233c;
        if (this.f17175C) {
            c10233c.mo12088K(true);
        }
        this.f17213z.m12085Q(this.f17212y);
    }

    /* renamed from: s0 */
    public /* synthetic */ void m23692s0(float f, C6062k c6062k) {
        m23743W0(f);
    }

    /* renamed from: v */
    private void m23687v() {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            return;
        }
        this.f17178F = this.f17177E.m23588b(Build.VERSION.SDK_INT, c6062k.m23660q(), c6062k.m23664m());
    }

    /* renamed from: v0 */
    private void m23686v0(Canvas canvas, C10233c c10233c) {
        if (this.f17197j != null && c10233c != null) {
            m23782D();
            canvas.getMatrix(this.f17189Q);
            canvas.getClipBounds(this.f17182J);
            m23685w(this.f17182J, this.f17183K);
            this.f17189Q.mapRect(this.f17183K);
            m23683x(this.f17183K, this.f17182J);
            if (this.f17212y) {
                this.f17188P.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                c10233c.mo12038e(this.f17188P, null, false);
            }
            this.f17189Q.mapRect(this.f17188P);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            m23678z0(this.f17188P, width, height);
            if (!m23735a0()) {
                RectF rectF = this.f17188P;
                Rect rect = this.f17182J;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            int ceil = (int) Math.ceil(this.f17188P.width());
            int ceil2 = (int) Math.ceil(this.f17188P.height());
            if (ceil != 0 && ceil2 != 0) {
                m23784C(ceil, ceil2);
                if (this.f17196X) {
                    this.f17179G.set(this.f17189Q);
                    this.f17179G.preScale(width, height);
                    Matrix matrix = this.f17179G;
                    RectF rectF2 = this.f17188P;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.f17180H.eraseColor(0);
                    c10233c.mo12103h(this.f17181I, this.f17179G, this.f17173A);
                    this.f17189Q.invert(this.f17190R);
                    this.f17190R.mapRect(this.f17187O, this.f17188P);
                    m23683x(this.f17187O, this.f17186N);
                }
                this.f17185M.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f17180H, this.f17185M, this.f17186N, this.f17184L);
            }
        }
    }

    /* renamed from: w */
    private void m23685w(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: x */
    private void m23683x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* renamed from: y */
    private void m23681y(Canvas canvas) {
        C10233c c10233c = this.f17213z;
        C6062k c6062k = this.f17197j;
        if (c10233c != null && c6062k != null) {
            this.f17179G.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                this.f17179G.preScale(bounds.width() / c6062k.m23675b().width(), bounds.height() / c6062k.m23675b().height());
                this.f17179G.preTranslate(bounds.left, bounds.top);
            }
            c10233c.mo12103h(canvas, this.f17179G, this.f17173A);
        }
    }

    /* renamed from: z0 */
    private void m23678z0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    /* renamed from: A */
    public boolean m23788A() {
        return this.f17210w;
    }

    /* renamed from: A0 */
    public void m23787A0(boolean z) {
        this.f17176D = z;
    }

    /* renamed from: B */
    public void m23786B() {
        this.f17203p.clear();
        this.f17198k.m7218l();
        if (!isVisible()) {
            this.f17202o = EnumC6061b.NONE;
        }
    }

    /* renamed from: B0 */
    public void m23785B0(EnumC6035a enumC6035a) {
        this.f17191S = enumC6035a;
    }

    /* renamed from: C0 */
    public void m23783C0(boolean z) {
        if (z != this.f17212y) {
            this.f17212y = z;
            C10233c c10233c = this.f17213z;
            if (c10233c != null) {
                c10233c.m12085Q(z);
            }
            invalidateSelf();
        }
    }

    /* renamed from: D0 */
    public boolean m23781D0(C6062k c6062k) {
        if (this.f17197j == c6062k) {
            return false;
        }
        this.f17196X = true;
        m23689u();
        this.f17197j = c6062k;
        m23693s();
        this.f17198k.m7228B(c6062k);
        m23743W0(this.f17198k.getAnimatedFraction());
        Iterator it = new ArrayList(this.f17203p).iterator();
        while (it.hasNext()) {
            InterfaceC6060a interfaceC6060a = (InterfaceC6060a) it.next();
            if (interfaceC6060a != null) {
                interfaceC6060a.mo23582a(c6062k);
            }
            it.remove();
        }
        this.f17203p.clear();
        c6062k.m23655v(this.f17174B);
        m23687v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* renamed from: E */
    public EnumC6035a m23780E() {
        return this.f17191S;
    }

    /* renamed from: E0 */
    public void m23779E0(String str) {
        this.f17208u = str;
        C7376a m23768K = m23768K();
        if (m23768K != null) {
            m23768K.m20824c(str);
        }
    }

    /* renamed from: F */
    public boolean m23778F() {
        return this.f17191S == EnumC6035a.ENABLED;
    }

    /* renamed from: F0 */
    public void m23777F0(C6037b c6037b) {
        C7376a c7376a = this.f17206s;
        if (c7376a != null) {
            c7376a.m20823d(c6037b);
        }
    }

    /* renamed from: G */
    public Bitmap m23776G(String str) {
        C7377b m23764M = m23764M();
        if (m23764M != null) {
            return m23764M.m20821a(str);
        }
        return null;
    }

    /* renamed from: G0 */
    public void m23775G0(Map<String, Typeface> map) {
        if (map == this.f17207t) {
            return;
        }
        this.f17207t = map;
        invalidateSelf();
    }

    /* renamed from: H */
    public boolean m23774H() {
        return this.f17212y;
    }

    /* renamed from: H0 */
    public void m23773H0(final int i) {
        if (this.f17197j == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.x
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k) {
                    C6059j0.this.m23710j0(i, c6062k);
                }
            });
        } else {
            this.f17198k.m7227C(i);
        }
    }

    /* renamed from: I */
    public C6062k m23772I() {
        return this.f17197j;
    }

    /* renamed from: I0 */
    public void m23771I0(boolean z) {
        this.f17200m = z;
    }

    /* renamed from: J0 */
    public void m23769J0(InterfaceC6039c interfaceC6039c) {
        C7377b c7377b = this.f17204q;
        if (c7377b != null) {
            c7377b.m20818d(interfaceC6039c);
        }
    }

    /* renamed from: K0 */
    public void m23767K0(String str) {
        this.f17205r = str;
    }

    /* renamed from: L */
    public int m23766L() {
        return (int) this.f17198k.m7216n();
    }

    /* renamed from: L0 */
    public void m23765L0(boolean z) {
        this.f17211x = z;
    }

    /* renamed from: M0 */
    public void m23763M0(final int i) {
        if (this.f17197j == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.e0
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k) {
                    C6059j0.this.m23708k0(i, c6062k);
                }
            });
        } else {
            this.f17198k.m7226D(i + 0.99f);
        }
    }

    /* renamed from: N */
    public String m23762N() {
        return this.f17205r;
    }

    /* renamed from: N0 */
    public void m23761N0(final String str) {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.g0
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k2) {
                    C6059j0.this.m23706l0(str, c6062k2);
                }
            });
            return;
        }
        C8787h m23665l = c6062k.m23665l(str);
        if (m23665l != null) {
            m23763M0((int) (m23665l.f23059b + m23665l.f23060c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: O */
    public C6063k0 m23760O(String str) {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            return null;
        }
        return c6062k.m23667j().get(str);
    }

    /* renamed from: O0 */
    public void m23759O0(final float f) {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.v
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k2) {
                    C6059j0.this.m23704m0(f, c6062k2);
                }
            });
        } else {
            this.f17198k.m7226D(C11679k.m7195i(c6062k.m23661p(), this.f17197j.m23671f(), f));
        }
    }

    /* renamed from: P */
    public boolean m23758P() {
        return this.f17211x;
    }

    /* renamed from: P0 */
    public void m23757P0(final int i, final int i2) {
        if (this.f17197j == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.z
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k) {
                    C6059j0.this.m23700o0(i, i2, c6062k);
                }
            });
        } else {
            this.f17198k.m7225E(i, i2 + 0.99f);
        }
    }

    /* renamed from: Q */
    public float m23756Q() {
        return this.f17198k.m7214q();
    }

    /* renamed from: Q0 */
    public void m23755Q0(final String str) {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.y
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k2) {
                    C6059j0.this.m23702n0(str, c6062k2);
                }
            });
            return;
        }
        C8787h m23665l = c6062k.m23665l(str);
        if (m23665l != null) {
            int i = (int) m23665l.f23059b;
            m23757P0(i, ((int) m23665l.f23060c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: R */
    public float m23754R() {
        return this.f17198k.m7213r();
    }

    /* renamed from: R0 */
    public void m23753R0(final int i) {
        if (this.f17197j == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.c0
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k) {
                    C6059j0.this.m23698p0(i, c6062k);
                }
            });
        } else {
            this.f17198k.m7224F(i);
        }
    }

    /* renamed from: S */
    public C6082t0 m23752S() {
        C6062k c6062k = this.f17197j;
        if (c6062k != null) {
            return c6062k.m23663n();
        }
        return null;
    }

    /* renamed from: S0 */
    public void m23751S0(final String str) {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.h0
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k2) {
                    C6059j0.this.m23696q0(str, c6062k2);
                }
            });
            return;
        }
        C8787h m23665l = c6062k.m23665l(str);
        if (m23665l != null) {
            m23753R0((int) m23665l.f23059b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: T */
    public float m23750T() {
        return this.f17198k.m7217m();
    }

    /* renamed from: T0 */
    public void m23749T0(final float f) {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.d0
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k2) {
                    C6059j0.this.m23694r0(f, c6062k2);
                }
            });
        } else {
            m23753R0((int) C11679k.m7195i(c6062k.m23661p(), this.f17197j.m23671f(), f));
        }
    }

    /* renamed from: U */
    public EnumC6090w0 m23748U() {
        return this.f17178F ? EnumC6090w0.SOFTWARE : EnumC6090w0.HARDWARE;
    }

    /* renamed from: U0 */
    public void m23747U0(boolean z) {
        if (this.f17175C == z) {
            return;
        }
        this.f17175C = z;
        C10233c c10233c = this.f17213z;
        if (c10233c != null) {
            c10233c.mo12088K(z);
        }
    }

    /* renamed from: V */
    public int m23746V() {
        return this.f17198k.getRepeatCount();
    }

    /* renamed from: V0 */
    public void m23745V0(boolean z) {
        this.f17174B = z;
        C6062k c6062k = this.f17197j;
        if (c6062k != null) {
            c6062k.m23655v(z);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: W */
    public int m23744W() {
        return this.f17198k.getRepeatMode();
    }

    /* renamed from: W0 */
    public void m23743W0(final float f) {
        if (this.f17197j == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.b0
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k) {
                    C6059j0.this.m23692s0(f, c6062k);
                }
            });
            return;
        }
        C6043e.m23828b("Drawable#setProgress");
        this.f17198k.m7227C(this.f17197j.m23669h(f));
        C6043e.m23827c("Drawable#setProgress");
    }

    /* renamed from: X */
    public float m23742X() {
        return this.f17198k.m7212s();
    }

    /* renamed from: X0 */
    public void m23741X0(EnumC6090w0 enumC6090w0) {
        this.f17177E = enumC6090w0;
        m23687v();
    }

    /* renamed from: Y */
    public C6095y0 m23740Y() {
        return this.f17209v;
    }

    /* renamed from: Y0 */
    public void m23739Y0(int i) {
        this.f17198k.setRepeatCount(i);
    }

    /* renamed from: Z */
    public Typeface m23738Z(C8782c c8782c) {
        Map<String, Typeface> map = this.f17207t;
        if (map != null) {
            String m17267a = c8782c.m17267a();
            if (map.containsKey(m17267a)) {
                return map.get(m17267a);
            }
            String m17266b = c8782c.m17266b();
            if (map.containsKey(m17266b)) {
                return map.get(m17266b);
            }
            String str = c8782c.m17267a() + "-" + c8782c.m17265c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C7376a m23768K = m23768K();
        if (m23768K != null) {
            return m23768K.m20825b(c8782c);
        }
        return null;
    }

    /* renamed from: Z0 */
    public void m23737Z0(int i) {
        this.f17198k.setRepeatMode(i);
    }

    /* renamed from: a1 */
    public void m23734a1(boolean z) {
        this.f17201n = z;
    }

    /* renamed from: b0 */
    public boolean m23732b0() {
        Choreographer$FrameCallbackC11677i choreographer$FrameCallbackC11677i = this.f17198k;
        if (choreographer$FrameCallbackC11677i == null) {
            return false;
        }
        return choreographer$FrameCallbackC11677i.isRunning();
    }

    /* renamed from: b1 */
    public void m23731b1(float f) {
        this.f17198k.m7223G(f);
    }

    /* renamed from: c0 */
    public boolean m23729c0() {
        if (isVisible()) {
            return this.f17198k.isRunning();
        }
        EnumC6061b enumC6061b = this.f17202o;
        if (enumC6061b != EnumC6061b.PLAY && enumC6061b != EnumC6061b.RESUME) {
            return false;
        }
        return true;
    }

    /* renamed from: c1 */
    public void m23728c1(Boolean bool) {
        this.f17199l = bool.booleanValue();
    }

    /* renamed from: d0 */
    public boolean m23726d0() {
        return this.f17176D;
    }

    /* renamed from: d1 */
    public void m23725d1(C6095y0 c6095y0) {
        this.f17209v = c6095y0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C10233c c10233c = this.f17213z;
        if (c10233c == null) {
            return;
        }
        boolean m23778F = m23778F();
        if (m23778F) {
            try {
                this.f17193U.acquire();
            } catch (InterruptedException unused) {
                C6043e.m23827c("Drawable#draw");
                if (m23778F) {
                    this.f17193U.release();
                    if (c10233c.m12086P() == this.f17198k.m7217m()) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                C6043e.m23827c("Drawable#draw");
                if (m23778F) {
                    this.f17193U.release();
                    if (c10233c.m12086P() != this.f17198k.m7217m()) {
                        f17172Y.execute(this.f17194V);
                    }
                }
                throw th2;
            }
        }
        C6043e.m23828b("Drawable#draw");
        if (m23778F && m23719f1()) {
            m23743W0(this.f17198k.m7217m());
        }
        if (this.f17201n) {
            if (this.f17178F) {
                m23686v0(canvas, c10233c);
            } else {
                m23681y(canvas);
            }
        } else if (this.f17178F) {
            m23686v0(canvas, c10233c);
        } else {
            m23681y(canvas);
        }
        this.f17196X = false;
        C6043e.m23827c("Drawable#draw");
        if (m23778F) {
            this.f17193U.release();
            if (c10233c.m12086P() == this.f17198k.m7217m()) {
                return;
            }
            f17172Y.execute(this.f17194V);
        }
    }

    /* renamed from: e1 */
    public void m23722e1(boolean z) {
        this.f17198k.m7222H(z);
    }

    /* renamed from: g1 */
    public boolean m23716g1() {
        return this.f17207t == null && this.f17209v == null && this.f17197j.m23674c().m39511m() > 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17173A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            return -1;
        }
        return c6062k.m23675b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C6062k c6062k = this.f17197j;
        if (c6062k == null) {
            return -1;
        }
        return c6062k.m23675b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f17196X) {
            return;
        }
        this.f17196X = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m23732b0();
    }

    /* renamed from: p */
    public void m23699p(Animator.AnimatorListener animatorListener) {
        this.f17198k.addListener(animatorListener);
    }

    /* renamed from: q */
    public <T> void m23697q(final C8784e c8784e, final T t, final C12022c<T> c12022c) {
        C10233c c10233c = this.f17213z;
        if (c10233c == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.i0
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k) {
                    C6059j0.this.m23723e0(c8784e, t, c12022c, c6062k);
                }
            });
            return;
        }
        boolean z = true;
        if (c8784e == C8784e.f23053c) {
            c10233c.mo12035i(t, c12022c);
        } else if (c8784e.m17256d() != null) {
            c8784e.m17256d().mo12035i(t, c12022c);
        } else {
            List<C8784e> m23684w0 = m23684w0(c8784e);
            for (int i = 0; i < m23684w0.size(); i++) {
                m23684w0.get(i).m17256d().mo12035i(t, c12022c);
            }
            z = true ^ m23684w0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == InterfaceC6071o0.f17250E) {
                m23743W0(m23750T());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f17173A = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        C11674f.m7233c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            EnumC6061b enumC6061b = this.f17202o;
            if (enumC6061b == EnumC6061b.PLAY) {
                m23688u0();
            } else if (enumC6061b == EnumC6061b.RESUME) {
                m23682x0();
            }
        } else if (this.f17198k.isRunning()) {
            m23690t0();
            this.f17202o = EnumC6061b.RESUME;
        } else if (!z3) {
            this.f17202o = EnumC6061b.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m23688u0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m23786B();
    }

    /* renamed from: t */
    public void m23691t() {
        this.f17203p.clear();
        this.f17198k.cancel();
        if (!isVisible()) {
            this.f17202o = EnumC6061b.NONE;
        }
    }

    /* renamed from: t0 */
    public void m23690t0() {
        this.f17203p.clear();
        this.f17198k.m7210u();
        if (!isVisible()) {
            this.f17202o = EnumC6061b.NONE;
        }
    }

    /* renamed from: u */
    public void m23689u() {
        if (this.f17198k.isRunning()) {
            this.f17198k.cancel();
            if (!isVisible()) {
                this.f17202o = EnumC6061b.NONE;
            }
        }
        this.f17197j = null;
        this.f17213z = null;
        this.f17204q = null;
        this.f17195W = -3.4028235E38f;
        this.f17198k.m7219k();
        invalidateSelf();
    }

    /* renamed from: u0 */
    public void m23688u0() {
        float m23756Q;
        if (this.f17213z == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.w
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k) {
                    C6059j0.this.m23714h0(c6062k);
                }
            });
            return;
        }
        m23687v();
        if (m23695r() || m23746V() == 0) {
            if (isVisible()) {
                this.f17198k.m7209v();
                this.f17202o = EnumC6061b.NONE;
            } else {
                this.f17202o = EnumC6061b.PLAY;
            }
        }
        if (!m23695r()) {
            if (m23742X() < 0.0f) {
                m23756Q = m23754R();
            } else {
                m23756Q = m23756Q();
            }
            m23773H0((int) m23756Q);
            this.f17198k.m7218l();
            if (!isVisible()) {
                this.f17202o = EnumC6061b.NONE;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* renamed from: w0 */
    public List<C8784e> m23684w0(C8784e c8784e) {
        if (this.f17213z == null) {
            C11674f.m7233c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f17213z.mo12105d(c8784e, 0, arrayList, new C8784e(new String[0]));
        return arrayList;
    }

    /* renamed from: x0 */
    public void m23682x0() {
        float m23756Q;
        if (this.f17213z == null) {
            this.f17203p.add(new InterfaceC6060a() { // from class: e1.f0
                @Override // p073e1.C6059j0.InterfaceC6060a
                /* renamed from: a */
                public final void mo23582a(C6062k c6062k) {
                    C6059j0.this.m23712i0(c6062k);
                }
            });
            return;
        }
        m23687v();
        if (m23695r() || m23746V() == 0) {
            if (isVisible()) {
                this.f17198k.m7205z();
                this.f17202o = EnumC6061b.NONE;
            } else {
                this.f17202o = EnumC6061b.RESUME;
            }
        }
        if (!m23695r()) {
            if (m23742X() < 0.0f) {
                m23756Q = m23754R();
            } else {
                m23756Q = m23756Q();
            }
            m23773H0((int) m23756Q);
            this.f17198k.m7218l();
            if (!isVisible()) {
                this.f17202o = EnumC6061b.NONE;
            }
        }
    }

    /* renamed from: y0 */
    public void m23680y0() {
        this.f17198k.m7229A();
    }

    /* renamed from: z */
    public void m23679z(boolean z) {
        if (this.f17210w == z) {
            return;
        }
        this.f17210w = z;
        if (this.f17197j != null) {
            m23693s();
        }
    }
}