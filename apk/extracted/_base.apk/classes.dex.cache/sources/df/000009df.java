package be;

import android.view.MotionEvent;
import com.otaliastudios.zoom.ZoomLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0011B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m14357d2 = {"Lbe/a;", "", "", "state", "", "g", "newState", "o", "Landroid/view/MotionEvent;", "event", "j", "", "p", "ev", "h", "(Landroid/view/MotionEvent;)Z", "i", "b", "()Z", "e", "d", "a", "c", "l", "n", "m", "k", "f", "Lbe/a$a;", "Lbe/a$a;", "callback", "<set-?>", "I", "getState$library_release", "()I", "getState$library_release$annotations", "()V", "<init>", "(Lbe/a$a;)V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: be.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2271a {

    /* renamed from: c */
    public static final C2273b f6387c = new C2273b(null);

    /* renamed from: d */
    private static final String f6388d;

    /* renamed from: e */
    private static final ZoomLogger f6389e;

    /* renamed from: a */
    private final InterfaceC2272a f6390a;

    /* renamed from: b */
    private int f6391b;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0006H&¨\u0006\u000f"}, m14357d2 = {"Lbe/a$a;", "", "", "newState", "", "i", "", "c", "oldState", "b", "Landroid/view/MotionEvent;", "event", "h", "g", "f", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: be.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2272a {
        /* renamed from: b */
        void mo25376b(int i);

        /* renamed from: c */
        void mo25375c();

        /* renamed from: f */
        void mo25374f();

        /* renamed from: g */
        boolean mo25373g(MotionEvent motionEvent);

        /* renamed from: h */
        boolean mo25372h(MotionEvent motionEvent);

        /* renamed from: i */
        boolean mo25371i(int i);
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, m14357d2 = {"Lbe/a$b;", "", "", "ANIMATING", "I", "FLINGING", "IDLE", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "PINCHING", "SCROLLING", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "TOUCH_LISTEN", "TOUCH_NO", "TOUCH_STEAL", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: be.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2273b {
        private C2273b() {
        }

        public /* synthetic */ C2273b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String TAG = C2271a.class.getSimpleName();
        f6388d = TAG;
        ZoomLogger.C5364a c5364a = ZoomLogger.f15197b;
        C9612q.m13918g(TAG, "TAG");
        f6389e = c5364a.m25354a(TAG);
    }

    public C2271a(InterfaceC2272a callback) {
        C9612q.m13917h(callback, "callback");
        this.f6390a = callback;
    }

    /* renamed from: g */
    private final boolean m33698g(int i) {
        return i == 3;
    }

    /* renamed from: j */
    private final int m33695j(MotionEvent motionEvent) {
        int actionMasked;
        ZoomLogger zoomLogger = f6389e;
        zoomLogger.m25357f("processTouchEvent:", "start.");
        if (m33704a()) {
            return 2;
        }
        boolean mo25372h = this.f6390a.mo25372h(motionEvent);
        zoomLogger.m25357f("processTouchEvent:", "scaleResult:", Boolean.valueOf(mo25372h));
        if (!m33701d()) {
            mo25372h |= this.f6390a.mo25373g(motionEvent);
            zoomLogger.m25357f("processTouchEvent:", "flingResult:", Boolean.valueOf(mo25372h));
        }
        if (m33700e() && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3)) {
            zoomLogger.m25361b("processTouchEvent:", "up event while scrolling, dispatching endScrollGesture.");
            this.f6390a.mo25374f();
        }
        if (mo25372h && !m33702c()) {
            zoomLogger.m25357f("processTouchEvent:", "returning: TOUCH_STEAL");
            return 2;
        } else if (mo25372h) {
            zoomLogger.m25357f("processTouchEvent:", "returning: TOUCH_LISTEN");
            return 1;
        } else {
            zoomLogger.m25357f("processTouchEvent:", "returning: TOUCH_NO");
            m33699f();
            return 0;
        }
    }

    /* renamed from: o */
    private final boolean m33690o(int i) {
        ZoomLogger zoomLogger = f6389e;
        zoomLogger.m25357f("trySetState:", m33689p(i));
        if (!this.f6390a.mo25371i(i)) {
            return false;
        }
        if (i == this.f6391b && !m33698g(i)) {
            return true;
        }
        int i2 = this.f6391b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 4 && i2 == 3) {
                        return false;
                    }
                } else if (i2 == 3) {
                    return false;
                }
            } else if (i2 == 2 || i2 == 3) {
                return false;
            }
        } else {
            this.f6390a.mo25375c();
        }
        this.f6390a.mo25376b(i2);
        zoomLogger.m25361b("setState:", m33689p(i));
        this.f6391b = i;
        return true;
    }

    /* renamed from: p */
    private final String m33689p(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "FLINGING" : "ANIMATING" : "PINCHING" : "SCROLLING" : "IDLE";
    }

    /* renamed from: a */
    public final boolean m33704a() {
        return this.f6391b == 3;
    }

    /* renamed from: b */
    public final boolean m33703b() {
        return this.f6391b == 4;
    }

    /* renamed from: c */
    public final boolean m33702c() {
        return this.f6391b == 0;
    }

    /* renamed from: d */
    public final boolean m33701d() {
        return this.f6391b == 2;
    }

    /* renamed from: e */
    public final boolean m33700e() {
        return this.f6391b == 1;
    }

    /* renamed from: f */
    public final boolean m33699f() {
        return m33690o(0);
    }

    /* renamed from: h */
    public final boolean m33697h(MotionEvent ev) {
        C9612q.m13917h(ev, "ev");
        if (m33695j(ev) > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m33696i(MotionEvent ev) {
        C9612q.m13917h(ev, "ev");
        if (m33695j(ev) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m33694k() {
        return m33690o(3);
    }

    /* renamed from: l */
    public final boolean m33693l() {
        return m33690o(4);
    }

    /* renamed from: m */
    public final boolean m33692m() {
        return m33690o(2);
    }

    /* renamed from: n */
    public final boolean m33691n() {
        return m33690o(1);
    }
}