package pe;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00066"}, m14357d2 = {"Lpe/b;", "Lpe/d;", "Landroid/view/MotionEvent;", "event", "", "P0", "", "Q0", "L0", "k0", "force", "j", "sourceEvent", "e0", "d0", "g0", "", "L", "I", "getNumberOfPointersRequired", "()I", "O0", "(I)V", "numberOfPointersRequired", "M", "getDirection", "N0", "direction", "", "N", "J", "maxDurationMs", "O", "minAcceptableDelta", "", "P", "F", "startX", "Q", "startY", "Landroid/os/Handler;", "R", "Landroid/os/Handler;", "handler", "S", "maxNumberOfPointersSimultaneously", "Ljava/lang/Runnable;", "T", "Ljava/lang/Runnable;", "failDelayed", "<init>", "()V", "U", "a", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11501b extends C11504d<C11501b> {

    /* renamed from: U */
    public static final C11502a f29848U = new C11502a(null);

    /* renamed from: P */
    private float f29853P;

    /* renamed from: Q */
    private float f29854Q;

    /* renamed from: R */
    private Handler f29855R;

    /* renamed from: S */
    private int f29856S;

    /* renamed from: L */
    private int f29849L = 1;

    /* renamed from: M */
    private int f29850M = 1;

    /* renamed from: N */
    private final long f29851N = 800;

    /* renamed from: O */
    private final long f29852O = 160;

    /* renamed from: T */
    private final Runnable f29857T = new Runnable() { // from class: pe.a
        @Override // java.lang.Runnable
        public final void run() {
            C11501b.m7970M0(C11501b.this);
        }
    };

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m14357d2 = {"Lpe/b$a;", "", "", "DEFAULT_DIRECTION", "I", "", "DEFAULT_MAX_DURATION_MS", "J", "DEFAULT_MIN_ACCEPTABLE_DELTA", "DEFAULT_NUMBER_OF_TOUCHES_REQUIRED", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11502a {
        private C11502a() {
        }

        public /* synthetic */ C11502a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: L0 */
    private final void m7971L0(MotionEvent motionEvent) {
        if (!m7966Q0(motionEvent)) {
            m7963B();
        }
    }

    /* renamed from: M0 */
    public static final void m7970M0(C11501b this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m7963B();
    }

    /* renamed from: P0 */
    private final void m7967P0(MotionEvent motionEvent) {
        this.f29853P = motionEvent.getRawX();
        this.f29854Q = motionEvent.getRawY();
        m7913n();
        this.f29856S = 1;
        Handler handler = this.f29855R;
        if (handler == null) {
            this.f29855R = new Handler(Looper.getMainLooper());
        } else {
            C9612q.m13920e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f29855R;
        C9612q.m13920e(handler2);
        handler2.postDelayed(this.f29857T, this.f29851N);
    }

    /* renamed from: Q0 */
    private final boolean m7966Q0(MotionEvent motionEvent) {
        if (this.f29856S == this.f29849L && (((this.f29850M & 1) != 0 && motionEvent.getRawX() - this.f29853P > ((float) this.f29852O)) || (((this.f29850M & 2) != 0 && this.f29853P - motionEvent.getRawX() > ((float) this.f29852O)) || (((this.f29850M & 4) != 0 && this.f29854Q - motionEvent.getRawY() > ((float) this.f29852O)) || ((this.f29850M & 8) != 0 && motionEvent.getRawY() - this.f29854Q > ((float) this.f29852O)))))) {
            Handler handler = this.f29855R;
            C9612q.m13920e(handler);
            handler.removeCallbacksAndMessages(null);
            m7920i();
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    public final void m7969N0(int i) {
        this.f29850M = i;
    }

    /* renamed from: O0 */
    public final void m7968O0(int i) {
        this.f29849L = i;
    }

    @Override // pe.C11504d
    /* renamed from: d0 */
    protected void mo7715d0() {
        Handler handler = this.f29855R;
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
        if (m7943O == 0) {
            m7967P0(sourceEvent);
        }
        if (m7943O == 2) {
            m7966Q0(sourceEvent);
            if (sourceEvent.getPointerCount() > this.f29856S) {
                this.f29856S = sourceEvent.getPointerCount();
            }
            if (sourceEvent.getActionMasked() == 1) {
                m7971L0(sourceEvent);
            }
        }
    }

    @Override // pe.C11504d
    /* renamed from: g0 */
    protected void mo7713g0() {
        Handler handler = this.f29855R;
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
        this.f29849L = 1;
        this.f29850M = 1;
    }
}