package pe;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.reactnativecommunity.webview.RNCWebViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001oB\u0011\u0012\b\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0007J\u0018\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0014J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020\u0005H\u0014J\b\u00101\u001a\u00020\u0005H\u0014J\b\u00102\u001a\u00020\u0005H\u0016R$\u00108\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010;\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00105R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00105R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00105R\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00105R\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00105R\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00105R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00105R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00105R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00105R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00105R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00105R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010P\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00105R\u0016\u0010Q\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00105R\u0016\u0010R\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00105R\u0016\u0010T\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u00105R\u0016\u0010U\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00105R\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00105R\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010JR\u0016\u0010^\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bf\u00107R\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u00107¨\u0006p"}, m14357d2 = {"Lpe/p;", "Lpe/d;", "", "g1", "h1", "", "k0", "", "activeOffsetXStart", "S0", "activeOffsetXEnd", "R0", "failOffsetXStart", "X0", "failOffsetXEnd", "W0", "activeOffsetYStart", "U0", "activeOffsetYEnd", "T0", "failOffsetYStart", "Z0", "failOffsetYEnd", "Y0", "minDist", "b1", "", "minPointers", "c1", "maxPointers", "a1", "averageTouches", "V0", "", "time", "Q0", "minVelocity", "d1", "minVelocityX", "e1", "minVelocityY", "f1", "Landroid/view/MotionEvent;", "event", "sourceEvent", "e0", "force", "j", "d0", "g0", "l0", "<set-?>", "L", "F", "O0", "()F", "velocityX", "M", "P0", "velocityY", "N", "defaultMinDistSq", "O", "minDistSq", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "minVelocitySq", "a0", "I", "b0", "c0", "startX", "startY", "offsetX", "f0", "offsetY", "lastX", "h0", "lastY", "Landroid/view/VelocityTracker;", "i0", "Landroid/view/VelocityTracker;", "velocityTracker", "j0", "J", "activateAfterLongPress", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "activateDelayed", "Landroid/os/Handler;", "m0", "Landroid/os/Handler;", "handler", "M0", "translationX", "N0", "translationY", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "n0", "a", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11528p extends C11504d<C11528p> {

    /* renamed from: n0 */
    public static final C11529a f29946n0 = new C11529a(null);

    /* renamed from: L */
    private float f29947L;

    /* renamed from: M */
    private float f29948M;

    /* renamed from: N */
    private final float f29949N;

    /* renamed from: O */
    private float f29950O;

    /* renamed from: c0 */
    private float f29964c0;

    /* renamed from: d0 */
    private float f29965d0;

    /* renamed from: e0 */
    private float f29966e0;

    /* renamed from: f0 */
    private float f29967f0;

    /* renamed from: g0 */
    private float f29968g0;

    /* renamed from: h0 */
    private float f29969h0;

    /* renamed from: i0 */
    private VelocityTracker f29970i0;

    /* renamed from: j0 */
    private boolean f29971j0;

    /* renamed from: k0 */
    private long f29972k0;

    /* renamed from: m0 */
    private Handler f29974m0;

    /* renamed from: P */
    private float f29951P = Float.MAX_VALUE;

    /* renamed from: Q */
    private float f29952Q = Float.MIN_VALUE;

    /* renamed from: R */
    private float f29953R = Float.MIN_VALUE;

    /* renamed from: S */
    private float f29954S = Float.MAX_VALUE;

    /* renamed from: T */
    private float f29955T = Float.MAX_VALUE;

    /* renamed from: U */
    private float f29956U = Float.MIN_VALUE;

    /* renamed from: V */
    private float f29957V = Float.MIN_VALUE;

    /* renamed from: W */
    private float f29958W = Float.MAX_VALUE;

    /* renamed from: X */
    private float f29959X = Float.MAX_VALUE;

    /* renamed from: Y */
    private float f29960Y = Float.MAX_VALUE;

    /* renamed from: Z */
    private float f29961Z = Float.MAX_VALUE;

    /* renamed from: a0 */
    private int f29962a0 = 1;

    /* renamed from: b0 */
    private int f29963b0 = 10;

    /* renamed from: l0 */
    private final Runnable f29973l0 = new Runnable() { // from class: pe.o
        @Override // java.lang.Runnable
        public final void run() {
            C11528p.m7794L0(C11528p.this);
        }
    };

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"Lpe/p$a;", "", "Landroid/view/VelocityTracker;", "tracker", "Landroid/view/MotionEvent;", "event", "", "b", "", "DEFAULT_ACTIVATE_AFTER_LONG_PRESS", "J", "", "DEFAULT_MAX_POINTERS", "I", "DEFAULT_MIN_POINTERS", "", "MAX_VALUE_IGNORE", "F", "MIN_VALUE_IGNORE", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11529a {
        private C11529a() {
        }

        public /* synthetic */ C11529a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m7770b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            C9612q.m13920e(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }

    public C11528p(Context context) {
        this.f29950O = Float.MIN_VALUE;
        C9612q.m13920e(context);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f = scaledTouchSlop * scaledTouchSlop;
        this.f29949N = f;
        this.f29950O = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m7794L0(C11528p this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m7920i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x008a, code lost:
        if (r1 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ad, code lost:
        if (r3 != false) goto L62;
     */
    /* renamed from: g1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m7773g1() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.C11528p.m7773g1():boolean");
    }

    /* renamed from: h1 */
    private final boolean m7772h1() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f = (this.f29968g0 - this.f29964c0) + this.f29966e0;
        float f2 = (this.f29969h0 - this.f29965d0) + this.f29967f0;
        if (this.f29972k0 > 0 && (f * f) + (f2 * f2) > this.f29949N) {
            Handler handler = this.f29974m0;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            return true;
        }
        float f3 = this.f29953R;
        if (f3 == Float.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z && f < f3) {
            return true;
        }
        float f4 = this.f29954S;
        if (f4 == Float.MAX_VALUE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && f > f4) {
            return true;
        }
        float f5 = this.f29957V;
        if (f5 == Float.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && f2 < f5) {
            return true;
        }
        float f6 = this.f29958W;
        if (f6 == Float.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && f2 > f6) {
            return true;
        }
        return false;
    }

    /* renamed from: M0 */
    public final float m7793M0() {
        return (this.f29968g0 - this.f29964c0) + this.f29966e0;
    }

    /* renamed from: N0 */
    public final float m7792N0() {
        return (this.f29969h0 - this.f29965d0) + this.f29967f0;
    }

    /* renamed from: O0 */
    public final float m7791O0() {
        return this.f29947L;
    }

    /* renamed from: P0 */
    public final float m7790P0() {
        return this.f29948M;
    }

    /* renamed from: Q0 */
    public final C11528p m7789Q0(long j) {
        this.f29972k0 = j;
        return this;
    }

    /* renamed from: R0 */
    public final C11528p m7788R0(float f) {
        this.f29952Q = f;
        return this;
    }

    /* renamed from: S0 */
    public final C11528p m7787S0(float f) {
        this.f29951P = f;
        return this;
    }

    /* renamed from: T0 */
    public final C11528p m7786T0(float f) {
        this.f29956U = f;
        return this;
    }

    /* renamed from: U0 */
    public final C11528p m7785U0(float f) {
        this.f29955T = f;
        return this;
    }

    /* renamed from: V0 */
    public final C11528p m7784V0(boolean z) {
        this.f29971j0 = z;
        return this;
    }

    /* renamed from: W0 */
    public final C11528p m7783W0(float f) {
        this.f29954S = f;
        return this;
    }

    /* renamed from: X0 */
    public final C11528p m7782X0(float f) {
        this.f29953R = f;
        return this;
    }

    /* renamed from: Y0 */
    public final C11528p m7781Y0(float f) {
        this.f29958W = f;
        return this;
    }

    /* renamed from: Z0 */
    public final C11528p m7780Z0(float f) {
        this.f29957V = f;
        return this;
    }

    /* renamed from: a1 */
    public final C11528p m7779a1(int i) {
        this.f29963b0 = i;
        return this;
    }

    /* renamed from: b1 */
    public final C11528p m7778b1(float f) {
        this.f29950O = f * f;
        return this;
    }

    /* renamed from: c1 */
    public final C11528p m7777c1(int i) {
        this.f29962a0 = i;
        return this;
    }

    @Override // pe.C11504d
    /* renamed from: d0 */
    protected void mo7715d0() {
        Handler handler = this.f29974m0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: d1 */
    public final C11528p m7776d1(float f) {
        this.f29961Z = f * f;
        return this;
    }

    @Override // pe.C11504d
    /* renamed from: e0 */
    protected void mo7714e0(MotionEvent event, MotionEvent sourceEvent) {
        C9612q.m13917h(event, "event");
        C9612q.m13917h(sourceEvent, "sourceEvent");
        int m7943O = m7943O();
        int actionMasked = sourceEvent.getActionMasked();
        if (actionMasked != 5 && actionMasked != 6) {
            C11514i c11514i = C11514i.f29922a;
            this.f29968g0 = c11514i.m7828a(sourceEvent, this.f29971j0);
            this.f29969h0 = c11514i.m7827b(sourceEvent, this.f29971j0);
        } else {
            this.f29966e0 += this.f29968g0 - this.f29964c0;
            this.f29967f0 += this.f29969h0 - this.f29965d0;
            C11514i c11514i2 = C11514i.f29922a;
            this.f29968g0 = c11514i2.m7828a(sourceEvent, this.f29971j0);
            float m7827b = c11514i2.m7827b(sourceEvent, this.f29971j0);
            this.f29969h0 = m7827b;
            this.f29964c0 = this.f29968g0;
            this.f29965d0 = m7827b;
        }
        if (m7943O == 0 && sourceEvent.getPointerCount() >= this.f29962a0) {
            mo7746l0();
            this.f29966e0 = 0.0f;
            this.f29967f0 = 0.0f;
            this.f29947L = 0.0f;
            this.f29948M = 0.0f;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f29970i0 = obtain;
            f29946n0.m7770b(obtain, sourceEvent);
            m7913n();
            if (this.f29972k0 > 0) {
                if (this.f29974m0 == null) {
                    this.f29974m0 = new Handler(Looper.getMainLooper());
                }
                Handler handler = this.f29974m0;
                C9612q.m13920e(handler);
                handler.postDelayed(this.f29973l0, this.f29972k0);
            }
        } else {
            VelocityTracker velocityTracker = this.f29970i0;
            if (velocityTracker != null) {
                f29946n0.m7770b(velocityTracker, sourceEvent);
                VelocityTracker velocityTracker2 = this.f29970i0;
                C9612q.m13920e(velocityTracker2);
                velocityTracker2.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                VelocityTracker velocityTracker3 = this.f29970i0;
                C9612q.m13920e(velocityTracker3);
                this.f29947L = velocityTracker3.getXVelocity();
                VelocityTracker velocityTracker4 = this.f29970i0;
                C9612q.m13920e(velocityTracker4);
                this.f29948M = velocityTracker4.getYVelocity();
            }
        }
        if (actionMasked == 1) {
            if (m7943O == 4) {
                m7891z();
            } else {
                m7963B();
            }
        } else if (actionMasked == 5 && sourceEvent.getPointerCount() > this.f29963b0) {
            if (m7943O == 4) {
                m7911o();
            } else {
                m7963B();
            }
        } else if (actionMasked == 6 && m7943O == 4 && sourceEvent.getPointerCount() < this.f29962a0) {
            m7963B();
        } else if (m7943O == 2) {
            if (m7772h1()) {
                m7963B();
            } else if (m7773g1()) {
                m7920i();
            }
        }
    }

    /* renamed from: e1 */
    public final C11528p m7775e1(float f) {
        this.f29959X = f;
        return this;
    }

    /* renamed from: f1 */
    public final C11528p m7774f1(float f) {
        this.f29960Y = f;
        return this;
    }

    @Override // pe.C11504d
    /* renamed from: g0 */
    protected void mo7713g0() {
        Handler handler = this.f29974m0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f29970i0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29970i0 = null;
        }
    }

    @Override // pe.C11504d
    /* renamed from: j */
    public void mo7712j(boolean z) {
        if (m7943O() != 4) {
            mo7746l0();
        }
        super.mo7712j(z);
    }

    @Override // pe.C11504d
    /* renamed from: k0 */
    public void mo7711k0() {
        super.mo7711k0();
        this.f29951P = Float.MAX_VALUE;
        this.f29952Q = Float.MIN_VALUE;
        this.f29953R = Float.MIN_VALUE;
        this.f29954S = Float.MAX_VALUE;
        this.f29955T = Float.MAX_VALUE;
        this.f29956U = Float.MIN_VALUE;
        this.f29957V = Float.MIN_VALUE;
        this.f29958W = Float.MAX_VALUE;
        this.f29959X = Float.MAX_VALUE;
        this.f29960Y = Float.MAX_VALUE;
        this.f29961Z = Float.MAX_VALUE;
        this.f29950O = this.f29949N;
        this.f29962a0 = 1;
        this.f29963b0 = 10;
        this.f29972k0 = 0L;
        this.f29971j0 = false;
    }

    @Override // pe.C11504d
    /* renamed from: l0 */
    public void mo7746l0() {
        this.f29964c0 = this.f29968g0;
        this.f29965d0 = this.f29969h0;
    }
}
