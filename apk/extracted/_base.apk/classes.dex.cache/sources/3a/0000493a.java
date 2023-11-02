package pe;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pe.C11538u;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0016R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, m14357d2 = {"Lpe/q;", "Lpe/d;", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "e0", "", "force", "j", "g0", "l0", "", "<set-?>", "L", "D", "R0", "()D", "scale", "M", "S0", "velocity", "", "N", "F", "P0", "()F", "focalPointX", "O", "Q0", "focalPointY", "Lpe/u;", "P", "Lpe/u;", "scaleGestureDetector", "Q", "startingSpan", "R", "spanSlop", "Lpe/u$b;", "S", "Lpe/u$b;", "gestureListener", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11530q extends C11504d<C11530q> {

    /* renamed from: L */
    private double f29975L;

    /* renamed from: M */
    private double f29976M;

    /* renamed from: P */
    private C11538u f29979P;

    /* renamed from: Q */
    private float f29980Q;

    /* renamed from: R */
    private float f29981R;

    /* renamed from: N */
    private float f29977N = Float.NaN;

    /* renamed from: O */
    private float f29978O = Float.NaN;

    /* renamed from: S */
    private final C11538u.InterfaceC11540b f29982S = new C11531a();

    @Metadata(m14358d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m14357d2 = {"pe/q$a", "Lpe/u$b;", "Lpe/u;", "detector", "", "c", "b", "", "a", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11531a implements C11538u.InterfaceC11540b {
        C11531a() {
            C11530q.this = r2;
            r2.m7892y0(false);
        }

        @Override // pe.C11538u.InterfaceC11540b
        /* renamed from: a */
        public void mo7730a(C11538u detector) {
            C9612q.m13917h(detector, "detector");
        }

        @Override // pe.C11538u.InterfaceC11540b
        /* renamed from: b */
        public boolean mo7729b(C11538u detector) {
            C9612q.m13917h(detector, "detector");
            C11530q.this.f29980Q = detector.m7739d();
            return true;
        }

        @Override // pe.C11538u.InterfaceC11540b
        /* renamed from: c */
        public boolean mo7728c(C11538u detector) {
            C9612q.m13917h(detector, "detector");
            double m7762R0 = C11530q.this.m7762R0();
            C11530q c11530q = C11530q.this;
            c11530q.f29975L = c11530q.m7762R0() * detector.m7736g();
            long m7735h = detector.m7735h();
            if (m7735h > 0) {
                C11530q c11530q2 = C11530q.this;
                c11530q2.f29976M = (c11530q2.m7762R0() - m7762R0) / m7735h;
            }
            if (Math.abs(C11530q.this.f29980Q - detector.m7739d()) >= C11530q.this.f29981R && C11530q.this.m7943O() == 2) {
                C11530q.this.m7920i();
                return true;
            }
            return true;
        }
    }

    /* renamed from: P0 */
    public final float m7764P0() {
        return this.f29977N;
    }

    /* renamed from: Q0 */
    public final float m7763Q0() {
        return this.f29978O;
    }

    /* renamed from: R0 */
    public final double m7762R0() {
        return this.f29975L;
    }

    /* renamed from: S0 */
    public final double m7761S0() {
        return this.f29976M;
    }

    @Override // pe.C11504d
    /* renamed from: e0 */
    protected void mo7714e0(MotionEvent event, MotionEvent sourceEvent) {
        C9612q.m13917h(event, "event");
        C9612q.m13917h(sourceEvent, "sourceEvent");
        if (m7943O() == 0) {
            View m7939S = m7939S();
            C9612q.m13920e(m7939S);
            Context context = m7939S.getContext();
            mo7746l0();
            this.f29979P = new C11538u(context, this.f29982S);
            this.f29981R = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f29977N = event.getX();
            this.f29978O = event.getY();
            m7913n();
        }
        C11538u c11538u = this.f29979P;
        if (c11538u != null) {
            c11538u.m7733j(sourceEvent);
        }
        C11538u c11538u2 = this.f29979P;
        if (c11538u2 != null) {
            PointF m7952H0 = m7952H0(new PointF(c11538u2.m7738e(), c11538u2.m7737f()));
            this.f29977N = m7952H0.x;
            this.f29978O = m7952H0.y;
        }
        if (m7943O() == 4 && sourceEvent.getActionMasked() == 1) {
            m7891z();
        } else if (sourceEvent.getActionMasked() == 1) {
            m7963B();
        }
    }

    @Override // pe.C11504d
    /* renamed from: g0 */
    protected void mo7713g0() {
        this.f29979P = null;
        this.f29977N = Float.NaN;
        this.f29978O = Float.NaN;
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
        this.f29976M = 0.0d;
        this.f29975L = 1.0d;
    }
}