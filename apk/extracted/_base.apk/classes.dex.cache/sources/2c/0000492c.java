package pe;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00013B\u000f\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0014J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0016\u0010&\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010-\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00064"}, m14357d2 = {"Lpe/k;", "Lpe/d;", "", "k0", "", "maxDist", "N0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "e0", "", "newState", "previousState", "h0", "prevState", "u", "t", "", "L", "J", "getMinDurationMs", "()J", "O0", "(J)V", "minDurationMs", "M", "F", "defaultMaxDistSq", "N", "maxDistSq", "O", "startX", "P", "startY", "Q", "startTime", "R", "previousTime", "Landroid/os/Handler;", "S", "Landroid/os/Handler;", "handler", "L0", "()I", "duration", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "T", "a", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11516k extends C11504d<C11516k> {

    /* renamed from: T */
    public static final C11517a f29924T = new C11517a(null);

    /* renamed from: L */
    private long f29925L;

    /* renamed from: M */
    private final float f29926M;

    /* renamed from: N */
    private float f29927N;

    /* renamed from: O */
    private float f29928O;

    /* renamed from: P */
    private float f29929P;

    /* renamed from: Q */
    private long f29930Q;

    /* renamed from: R */
    private long f29931R;

    /* renamed from: S */
    private Handler f29932S;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m14357d2 = {"Lpe/k$a;", "", "", "DEFAULT_MAX_DIST_DP", "F", "", "DEFAULT_MIN_DURATION_MS", "J", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11517a {
        private C11517a() {
        }

        public /* synthetic */ C11517a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11516k(Context context) {
        C9612q.m13917h(context, "context");
        this.f29925L = 500L;
        m7892y0(true);
        float f = context.getResources().getDisplayMetrics().density * 10.0f;
        float f2 = f * f;
        this.f29926M = f2;
        this.f29927N = f2;
    }

    /* renamed from: M0 */
    public static final void m7824M0(C11516k this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m7920i();
    }

    /* renamed from: L0 */
    public final int m7825L0() {
        return (int) (this.f29931R - this.f29930Q);
    }

    /* renamed from: N0 */
    public final C11516k m7823N0(float f) {
        this.f29927N = f * f;
        return this;
    }

    /* renamed from: O0 */
    public final void m7822O0(long j) {
        this.f29925L = j;
    }

    @Override // pe.C11504d
    /* renamed from: e0 */
    protected void mo7714e0(MotionEvent event, MotionEvent sourceEvent) {
        C9612q.m13917h(event, "event");
        C9612q.m13917h(sourceEvent, "sourceEvent");
        if (m7943O() == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f29931R = uptimeMillis;
            this.f29930Q = uptimeMillis;
            m7913n();
            this.f29928O = sourceEvent.getRawX();
            this.f29929P = sourceEvent.getRawY();
            Handler handler = new Handler(Looper.getMainLooper());
            this.f29932S = handler;
            long j = this.f29925L;
            if (j > 0) {
                C9612q.m13920e(handler);
                handler.postDelayed(new Runnable() { // from class: pe.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11516k.m7824M0(C11516k.this);
                    }
                }, this.f29925L);
            } else if (j == 0) {
                m7920i();
            }
        }
        if (sourceEvent.getActionMasked() == 1) {
            Handler handler2 = this.f29932S;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.f29932S = null;
            }
            if (m7943O() == 4) {
                m7891z();
                return;
            } else {
                m7963B();
                return;
            }
        }
        float rawX = sourceEvent.getRawX() - this.f29928O;
        float rawY = sourceEvent.getRawY() - this.f29929P;
        if ((rawX * rawX) + (rawY * rawY) > this.f29927N) {
            if (m7943O() == 4) {
                m7911o();
            } else {
                m7963B();
            }
        }
    }

    @Override // pe.C11504d
    /* renamed from: h0 */
    protected void mo7821h0(int i, int i2) {
        Handler handler = this.f29932S;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f29932S = null;
        }
    }

    @Override // pe.C11504d
    /* renamed from: k0 */
    public void mo7711k0() {
        super.mo7711k0();
        this.f29925L = 500L;
        this.f29927N = this.f29926M;
    }

    @Override // pe.C11504d
    /* renamed from: t */
    public void mo7820t(MotionEvent event) {
        C9612q.m13917h(event, "event");
        this.f29931R = SystemClock.uptimeMillis();
        super.mo7820t(event);
    }

    @Override // pe.C11504d
    /* renamed from: u */
    public void mo7819u(int i, int i2) {
        this.f29931R = SystemClock.uptimeMillis();
        super.mo7819u(i, i2);
    }
}