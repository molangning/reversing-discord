package pe;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.C11533s;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+"}, m14357d2 = {"Lpe/t;", "Lpe/d;", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "e0", "", "force", "j", "g0", "l0", "Lpe/s;", "L", "Lpe/s;", "rotationGestureDetector", "", "<set-?>", "M", "D", "O0", "()D", ViewProps.ROTATION, "N", "P0", "velocity", "", "O", "F", "M0", "()F", "anchorX", "P", "N0", "anchorY", "Lpe/s$a;", "Q", "Lpe/s$a;", "gestureListener", "<init>", "()V", "R", "a", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11535t extends C11504d<C11535t> {

    /* renamed from: R */
    public static final C11536a f29998R = new C11536a(null);

    /* renamed from: L */
    private C11533s f29999L;

    /* renamed from: M */
    private double f30000M;

    /* renamed from: N */
    private double f30001N;

    /* renamed from: O */
    private float f30002O = Float.NaN;

    /* renamed from: P */
    private float f30003P = Float.NaN;

    /* renamed from: Q */
    private final C11533s.InterfaceC11534a f30004Q;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lpe/t$a;", "", "", "ROTATION_RECOGNITION_THRESHOLD", "D", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11536a {
        private C11536a() {
        }

        public /* synthetic */ C11536a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m14357d2 = {"pe/t$b", "Lpe/s$a;", "Lpe/s;", "detector", "", "c", "a", "", "b", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.t$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11537b implements C11533s.InterfaceC11534a {
        C11537b() {
        }

        @Override // pe.C11533s.InterfaceC11534a
        /* renamed from: a */
        public boolean mo7745a(C11533s detector) {
            C9612q.m13917h(detector, "detector");
            return true;
        }

        @Override // pe.C11533s.InterfaceC11534a
        /* renamed from: b */
        public void mo7744b(C11533s detector) {
            C9612q.m13917h(detector, "detector");
            C11535t.this.m7891z();
        }

        @Override // pe.C11533s.InterfaceC11534a
        /* renamed from: c */
        public boolean mo7743c(C11533s detector) {
            C9612q.m13917h(detector, "detector");
            double m7748O0 = C11535t.this.m7748O0();
            C11535t c11535t = C11535t.this;
            c11535t.f30000M = c11535t.m7748O0() + detector.m7756d();
            long m7755e = detector.m7755e();
            if (m7755e > 0) {
                C11535t c11535t2 = C11535t.this;
                c11535t2.f30001N = (c11535t2.m7748O0() - m7748O0) / m7755e;
            }
            if (Math.abs(C11535t.this.m7748O0()) >= 0.08726646259971647d && C11535t.this.m7943O() == 2) {
                C11535t.this.m7920i();
                return true;
            }
            return true;
        }
    }

    public C11535t() {
        m7892y0(false);
        this.f30004Q = new C11537b();
    }

    /* renamed from: M0 */
    public final float m7750M0() {
        return this.f30002O;
    }

    /* renamed from: N0 */
    public final float m7749N0() {
        return this.f30003P;
    }

    /* renamed from: O0 */
    public final double m7748O0() {
        return this.f30000M;
    }

    /* renamed from: P0 */
    public final double m7747P0() {
        return this.f30001N;
    }

    @Override // pe.C11504d
    /* renamed from: e0 */
    protected void mo7714e0(MotionEvent event, MotionEvent sourceEvent) {
        C9612q.m13917h(event, "event");
        C9612q.m13917h(sourceEvent, "sourceEvent");
        if (m7943O() == 0) {
            mo7746l0();
            this.f29999L = new C11533s(this.f30004Q);
            this.f30002O = event.getX();
            this.f30003P = event.getY();
            m7913n();
        }
        C11533s c11533s = this.f29999L;
        if (c11533s != null) {
            c11533s.m7754f(sourceEvent);
        }
        C11533s c11533s2 = this.f29999L;
        if (c11533s2 != null) {
            PointF m7952H0 = m7952H0(new PointF(c11533s2.m7758b(), c11533s2.m7757c()));
            this.f30002O = m7952H0.x;
            this.f30003P = m7952H0.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (m7943O() == 4) {
                m7891z();
            } else {
                m7963B();
            }
        }
    }

    @Override // pe.C11504d
    /* renamed from: g0 */
    protected void mo7713g0() {
        this.f29999L = null;
        this.f30002O = Float.NaN;
        this.f30003P = Float.NaN;
        mo7746l0();
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
    /* renamed from: l0 */
    public void mo7746l0() {
        this.f30001N = 0.0d;
        this.f30000M = 0.0d;
    }
}
