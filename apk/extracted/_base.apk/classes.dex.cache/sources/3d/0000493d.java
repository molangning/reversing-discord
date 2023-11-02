package pe;

import android.view.MotionEvent;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0018R$\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\r\u0010\u001cR$\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010&¨\u0006*"}, m14357d2 = {"Lpe/s;", "", "Landroid/view/MotionEvent;", "event", "", "g", "a", "", "f", "Lpe/s$a;", "Lpe/s$a;", "gestureListener", "", "b", "J", "currentTime", "c", "previousTime", "", "d", "D", "previousAngle", "<set-?>", "e", "()D", ViewProps.ROTATION, "", "F", "()F", "anchorX", "anchorY", "h", "Z", "isInProgress", "", "i", "[I", "pointerIds", "()J", "timeDelta", "<init>", "(Lpe/s$a;)V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11533s {

    /* renamed from: a */
    private final InterfaceC11534a f29989a;

    /* renamed from: b */
    private long f29990b;

    /* renamed from: c */
    private long f29991c;

    /* renamed from: d */
    private double f29992d;

    /* renamed from: e */
    private double f29993e;

    /* renamed from: f */
    private float f29994f;

    /* renamed from: g */
    private float f29995g;

    /* renamed from: h */
    private boolean f29996h;

    /* renamed from: i */
    private final int[] f29997i = new int[2];

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, m14357d2 = {"Lpe/s$a;", "", "Lpe/s;", "detector", "", "c", "a", "", "b", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11534a {
        /* renamed from: a */
        boolean mo7745a(C11533s c11533s);

        /* renamed from: b */
        void mo7744b(C11533s c11533s);

        /* renamed from: c */
        boolean mo7743c(C11533s c11533s);
    }

    public C11533s(InterfaceC11534a interfaceC11534a) {
        this.f29989a = interfaceC11534a;
    }

    /* renamed from: a */
    private final void m7759a() {
        if (this.f29996h) {
            this.f29996h = false;
            InterfaceC11534a interfaceC11534a = this.f29989a;
            if (interfaceC11534a != null) {
                interfaceC11534a.mo7744b(this);
            }
        }
    }

    /* renamed from: g */
    private final void m7753g(MotionEvent motionEvent) {
        double d;
        this.f29991c = this.f29990b;
        this.f29990b = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.f29997i[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.f29997i[1]);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        float f = y2 - y;
        this.f29994f = (x + x2) * 0.5f;
        this.f29995g = (y + y2) * 0.5f;
        double d2 = -Math.atan2(f, x2 - x);
        if (Double.isNaN(this.f29992d)) {
            d = 0.0d;
        } else {
            d = this.f29992d - d2;
        }
        this.f29993e = d;
        this.f29992d = d2;
        if (d > 3.141592653589793d) {
            this.f29993e = d - 3.141592653589793d;
        } else if (d < -3.141592653589793d) {
            this.f29993e = d + 3.141592653589793d;
        }
        double d3 = this.f29993e;
        if (d3 > 1.5707963267948966d) {
            this.f29993e = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.f29993e = d3 + 3.141592653589793d;
        }
    }

    /* renamed from: b */
    public final float m7758b() {
        return this.f29994f;
    }

    /* renamed from: c */
    public final float m7757c() {
        return this.f29995g;
    }

    /* renamed from: d */
    public final double m7756d() {
        return this.f29993e;
    }

    /* renamed from: e */
    public final long m7755e() {
        return this.f29990b - this.f29991c;
    }

    /* renamed from: f */
    public final boolean m7754f(MotionEvent event) {
        C9612q.m13917h(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6 && this.f29996h) {
                            int pointerId = event.getPointerId(event.getActionIndex());
                            int[] iArr = this.f29997i;
                            if (pointerId == iArr[0] || pointerId == iArr[1]) {
                                m7759a();
                            }
                        }
                    } else if (!this.f29996h) {
                        this.f29997i[1] = event.getPointerId(event.getActionIndex());
                        this.f29996h = true;
                        this.f29991c = event.getEventTime();
                        this.f29992d = Double.NaN;
                        m7753g(event);
                        InterfaceC11534a interfaceC11534a = this.f29989a;
                        if (interfaceC11534a != null) {
                            interfaceC11534a.mo7745a(this);
                        }
                    }
                } else if (this.f29996h) {
                    m7753g(event);
                    InterfaceC11534a interfaceC11534a2 = this.f29989a;
                    if (interfaceC11534a2 != null) {
                        interfaceC11534a2.mo7743c(this);
                    }
                }
            } else {
                m7759a();
            }
        } else {
            this.f29996h = false;
            this.f29997i[0] = event.getPointerId(event.getActionIndex());
            this.f29997i[1] = -1;
        }
        return true;
    }
}