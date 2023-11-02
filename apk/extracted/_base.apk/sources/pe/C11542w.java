package pe;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001IB\u0007¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0014J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0014J\b\u0010 \u001a\u00020\u0002H\u0014R\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00101\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\"R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\"R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\"R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\"R\u0016\u00109\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\"R\u0016\u0010;\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\"R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010,R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006J"}, m14357d2 = {"Lpe/w;", "Lpe/d;", "", "V0", "L0", "", "U0", "k0", "", "numberOfTaps", "T0", "", "maxDelayMs", "N0", "maxDurationMs", "P0", "", "deltaX", "Q0", "deltaY", "R0", "maxDist", "O0", "minNumberOfPointers", "S0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "e0", "force", "j", "d0", "g0", "L", "F", "maxDeltaX", "M", "maxDeltaY", "N", "maxDistSq", "O", "J", "P", "Q", "I", "R", "S", "currentMaxNumberOfPointers", "T", "startX", "U", "startY", "V", "offsetX", "W", "offsetY", "X", "lastX", "Y", "lastY", "Landroid/os/Handler;", "Z", "Landroid/os/Handler;", "handler", "a0", "tapsSoFar", "Ljava/lang/Runnable;", "b0", "Ljava/lang/Runnable;", "failDelayed", "<init>", "()V", "c0", "a", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11542w extends C11504d<C11542w> {

    /* renamed from: c0 */
    public static final C11543a f30032c0 = new C11543a(null);

    /* renamed from: T */
    private float f30041T;

    /* renamed from: U */
    private float f30042U;

    /* renamed from: V */
    private float f30043V;

    /* renamed from: W */
    private float f30044W;

    /* renamed from: X */
    private float f30045X;

    /* renamed from: Y */
    private float f30046Y;

    /* renamed from: Z */
    private Handler f30047Z;

    /* renamed from: a0 */
    private int f30048a0;

    /* renamed from: L */
    private float f30033L = Float.MIN_VALUE;

    /* renamed from: M */
    private float f30034M = Float.MIN_VALUE;

    /* renamed from: N */
    private float f30035N = Float.MIN_VALUE;

    /* renamed from: O */
    private long f30036O = 500;

    /* renamed from: P */
    private long f30037P = 200;

    /* renamed from: Q */
    private int f30038Q = 1;

    /* renamed from: R */
    private int f30039R = 1;

    /* renamed from: S */
    private int f30040S = 1;

    /* renamed from: b0 */
    private final Runnable f30049b0 = new Runnable() { // from class: pe.v
        @Override // java.lang.Runnable
        public final void run() {
            C11542w.m7725M0(C11542w.this);
        }
    };

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m14357d2 = {"Lpe/w$a;", "", "", "DEFAULT_MAX_DELAY_MS", "J", "DEFAULT_MAX_DURATION_MS", "", "DEFAULT_MIN_NUMBER_OF_POINTERS", "I", "DEFAULT_NUMBER_OF_TAPS", "", "MAX_VALUE_IGNORE", "F", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11543a {
        private C11543a() {
        }

        public /* synthetic */ C11543a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11542w() {
        m7892y0(true);
    }

    /* renamed from: L0 */
    private final void m7726L0() {
        Handler handler = this.f30047Z;
        if (handler == null) {
            this.f30047Z = new Handler(Looper.getMainLooper());
        } else {
            C9612q.m13920e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.f30048a0 + 1;
        this.f30048a0 = i;
        if (i == this.f30038Q && this.f30040S >= this.f30039R) {
            m7920i();
            return;
        }
        Handler handler2 = this.f30047Z;
        C9612q.m13920e(handler2);
        handler2.postDelayed(this.f30049b0, this.f30037P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m7725M0(C11542w this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m7963B();
    }

    /* renamed from: U0 */
    private final boolean m7717U0() {
        boolean z;
        boolean z2;
        boolean z3;
        float f = (this.f30045X - this.f30041T) + this.f30043V;
        if (this.f30033L == Float.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Math.abs(f) > this.f30033L) {
            return true;
        }
        float f2 = (this.f30046Y - this.f30042U) + this.f30044W;
        if (this.f30034M == Float.MIN_VALUE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && Math.abs(f2) > this.f30034M) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.f30035N;
        if (f4 == Float.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || f3 <= f4) {
            return false;
        }
        return true;
    }

    /* renamed from: V0 */
    private final void m7716V0() {
        Handler handler = this.f30047Z;
        if (handler == null) {
            this.f30047Z = new Handler(Looper.getMainLooper());
        } else {
            C9612q.m13920e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f30047Z;
        C9612q.m13920e(handler2);
        handler2.postDelayed(this.f30049b0, this.f30036O);
    }

    /* renamed from: N0 */
    public final C11542w m7724N0(long j) {
        this.f30037P = j;
        return this;
    }

    /* renamed from: O0 */
    public final C11542w m7723O0(float f) {
        this.f30035N = f * f;
        return this;
    }

    /* renamed from: P0 */
    public final C11542w m7722P0(long j) {
        this.f30036O = j;
        return this;
    }

    /* renamed from: Q0 */
    public final C11542w m7721Q0(float f) {
        this.f30033L = f;
        return this;
    }

    /* renamed from: R0 */
    public final C11542w m7720R0(float f) {
        this.f30034M = f;
        return this;
    }

    /* renamed from: S0 */
    public final C11542w m7719S0(int i) {
        this.f30039R = i;
        return this;
    }

    /* renamed from: T0 */
    public final C11542w m7718T0(int i) {
        this.f30038Q = i;
        return this;
    }

    @Override // pe.C11504d
    /* renamed from: d0 */
    protected void mo7715d0() {
        Handler handler = this.f30047Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // pe.C11504d
    /* renamed from: e0 */
    protected void mo7714e0(MotionEvent event, MotionEvent sourceEvent) {
        C9612q.m13917h(event, "event");
        C9612q.m13917h(sourceEvent, "sourceEvent");
        int m7943O = m7943O();
        int actionMasked = sourceEvent.getActionMasked();
        if (m7943O == 0) {
            this.f30043V = 0.0f;
            this.f30044W = 0.0f;
            C11514i c11514i = C11514i.f29922a;
            this.f30041T = c11514i.m7828a(sourceEvent, true);
            this.f30042U = c11514i.m7827b(sourceEvent, true);
        }
        if (actionMasked != 5 && actionMasked != 6) {
            C11514i c11514i2 = C11514i.f29922a;
            this.f30045X = c11514i2.m7828a(sourceEvent, true);
            this.f30046Y = c11514i2.m7827b(sourceEvent, true);
        } else {
            this.f30043V += this.f30045X - this.f30041T;
            this.f30044W += this.f30046Y - this.f30042U;
            C11514i c11514i3 = C11514i.f29922a;
            this.f30045X = c11514i3.m7828a(sourceEvent, true);
            float m7827b = c11514i3.m7827b(sourceEvent, true);
            this.f30046Y = m7827b;
            this.f30041T = this.f30045X;
            this.f30042U = m7827b;
        }
        if (this.f30040S < sourceEvent.getPointerCount()) {
            this.f30040S = sourceEvent.getPointerCount();
        }
        if (m7717U0()) {
            m7963B();
        } else if (m7943O == 0) {
            if (actionMasked == 0) {
                m7913n();
            }
            m7716V0();
        } else if (m7943O == 2) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    m7726L0();
                    return;
                }
                return;
            }
            m7716V0();
        }
    }

    @Override // pe.C11504d
    /* renamed from: g0 */
    protected void mo7713g0() {
        this.f30048a0 = 0;
        this.f30040S = 0;
        Handler handler = this.f30047Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // pe.C11504d
    /* renamed from: j */
    public void mo7712j(boolean z) {
        super.mo7712j(z);
        m7891z();
    }

    @Override // pe.C11504d
    /* renamed from: k0 */
    public void mo7711k0() {
        super.mo7711k0();
        this.f30033L = Float.MIN_VALUE;
        this.f30034M = Float.MIN_VALUE;
        this.f30035N = Float.MIN_VALUE;
        this.f30036O = 500L;
        this.f30037P = 200L;
        this.f30038Q = 1;
        this.f30039R = 1;
    }
}
