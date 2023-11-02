package p044ce;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.OverScroller;
import be.C2271a;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import de.C5822b;
import de.C5827c;
import ee.C6208b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001NB'\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J,\u0010\u0012\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J,\u0010\u0015\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\"\u00109\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010<\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b\"\u00108R\"\u0010?\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u00106\"\u0004\b\u001e\u00108R\"\u0010B\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u00104\u001a\u0004\bA\u00106\"\u0004\b*\u00108R\"\u0010E\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u00104\u001a\u0004\bD\u00106\"\u0004\b&\u00108R\"\u0010H\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u00104\u001a\u0004\bG\u00106\"\u0004\b\u001a\u00108¨\u0006O"}, m14357d2 = {"Lce/b;", "Landroid/view/GestureDetector$OnGestureListener;", "", "g", "Landroid/view/MotionEvent;", "event", "h", "(Landroid/view/MotionEvent;)Z", "", "e", "()V", "f", "onDown", "e1", "e2", "", "velocityX", "velocityY", "onFling", "distanceX", "distanceY", "onScroll", "onShowPress", "onSingleTapUp", "onLongPress", "Lee/b;", "j", "Lee/b;", "panManager", "Lbe/a;", "k", "Lbe/a;", "stateController", "Lde/b;", "l", "Lde/b;", "matrixController", "Landroid/view/GestureDetector;", "m", "Landroid/view/GestureDetector;", "detector", "Landroid/widget/OverScroller;", "n", "Landroid/widget/OverScroller;", "flingScroller", "Lee/b$b;", "o", "Lee/b$b;", "panStatusX", "p", "panStatusY", "q", "Z", "getFlingEnabled$library_release", "()Z", "i", "(Z)V", "flingEnabled", "r", "getScrollEnabled$library_release", "scrollEnabled", "s", "getOneFingerScrollEnabled$library_release", "oneFingerScrollEnabled", "t", "getTwoFingersScrollEnabled$library_release", "twoFingersScrollEnabled", "u", "getThreeFingersScrollEnabled$library_release", "threeFingersScrollEnabled", "v", "getFlingInOverPanEnabled$library_release", "flingInOverPanEnabled", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lee/b;Lbe/a;Lde/b;)V", "w", "a", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: ce.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class GestureDetector$OnGestureListenerC2517b implements GestureDetector.OnGestureListener {

    /* renamed from: w */
    public static final C2518a f6918w = new C2518a(null);

    /* renamed from: x */
    private static final String f6919x;

    /* renamed from: y */
    private static final ZoomLogger f6920y;

    /* renamed from: j */
    private final C6208b f6921j;

    /* renamed from: k */
    private final C2271a f6922k;

    /* renamed from: l */
    private final C5822b f6923l;

    /* renamed from: m */
    private final GestureDetector f6924m;

    /* renamed from: n */
    private final OverScroller f6925n;

    /* renamed from: o */
    private final C6208b.C6210b f6926o;

    /* renamed from: p */
    private final C6208b.C6210b f6927p;

    /* renamed from: q */
    private boolean f6928q;

    /* renamed from: r */
    private boolean f6929r;

    /* renamed from: s */
    private boolean f6930s;

    /* renamed from: t */
    private boolean f6931t;

    /* renamed from: u */
    private boolean f6932u;

    /* renamed from: v */
    private boolean f6933v;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lce/b$a;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: ce.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2518a {
        private C2518a() {
        }

        public /* synthetic */ C2518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: ce.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2519b extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ ScaledPoint f6934j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2519b(ScaledPoint scaledPoint) {
            super(1);
            this.f6934j = scaledPoint;
        }

        /* renamed from: a */
        public final void m33071a(C5827c.C5828a animateUpdate) {
            C9612q.m13917h(animateUpdate, "$this$animateUpdate");
            animateUpdate.m24400c(this.f6934j, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m33071a(c5828a);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"ce/b$c", "Ljava/lang/Runnable;", "", "run", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: ce.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class RunnableC2520c implements Runnable {

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
        /* renamed from: ce.b$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        static final class C2521a extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

            /* renamed from: j */
            final /* synthetic */ ScaledPoint f6936j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2521a(ScaledPoint scaledPoint) {
                super(1);
                this.f6936j = scaledPoint;
            }

            /* renamed from: a */
            public final void m33070a(C5827c.C5828a applyUpdate) {
                C9612q.m13917h(applyUpdate, "$this$applyUpdate");
                applyUpdate.m24398e(this.f6936j, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
                m33070a(c5828a);
                return Unit.f25302a;
            }
        }

        RunnableC2520c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GestureDetector$OnGestureListenerC2517b.this.f6925n.isFinished()) {
                GestureDetector$OnGestureListenerC2517b.this.f6922k.m33699f();
                GestureDetector$OnGestureListenerC2517b.this.f6924m.setIsLongpressEnabled(true);
            } else if (GestureDetector$OnGestureListenerC2517b.this.f6925n.computeScrollOffset()) {
                GestureDetector$OnGestureListenerC2517b.this.f6923l.m24439h(new C2521a(new ScaledPoint(GestureDetector$OnGestureListenerC2517b.this.f6925n.getCurrX(), GestureDetector$OnGestureListenerC2517b.this.f6925n.getCurrY())));
                GestureDetector$OnGestureListenerC2517b.this.f6923l.m24451C(this);
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: ce.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C2522d extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ ScaledPoint f6937j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2522d(ScaledPoint scaledPoint) {
            super(1);
            this.f6937j = scaledPoint;
        }

        /* renamed from: a */
        public final void m33069a(C5827c.C5828a applyUpdate) {
            C9612q.m13917h(applyUpdate, "$this$applyUpdate");
            applyUpdate.m24400c(this.f6937j, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m33069a(c5828a);
            return Unit.f25302a;
        }
    }

    static {
        String TAG = GestureDetector$OnGestureListenerC2517b.class.getSimpleName();
        f6919x = TAG;
        ZoomLogger.C5364a c5364a = ZoomLogger.f15197b;
        C9612q.m13918g(TAG, "TAG");
        f6920y = c5364a.m25354a(TAG);
    }

    public GestureDetector$OnGestureListenerC2517b(Context context, C6208b panManager, C2271a stateController, C5822b matrixController) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(panManager, "panManager");
        C9612q.m13917h(stateController, "stateController");
        C9612q.m13917h(matrixController, "matrixController");
        this.f6921j = panManager;
        this.f6922k = stateController;
        this.f6923l = matrixController;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(null);
        Unit unit = Unit.f25302a;
        this.f6924m = gestureDetector;
        this.f6925n = new OverScroller(context);
        this.f6926o = new C6208b.C6210b();
        this.f6927p = new C6208b.C6210b();
        this.f6928q = true;
        this.f6929r = true;
        this.f6930s = true;
        this.f6931t = true;
        this.f6932u = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r2 == false) goto L12;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m33079g() {
        /*
            r5 = this;
            ee.b r0 = r5.f6921j
            boolean r0 = r0.m23270n()
            r1 = 0
            if (r0 == 0) goto L36
            ee.b r0 = r5.f6921j
            com.otaliastudios.zoom.ScaledPoint r0 = r0.m23278f()
            float r2 = r0.m25458c()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            if (r2 != 0) goto L1b
            r2 = r4
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L2b
            float r2 = r0.m25457d()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L28
            r2 = r4
            goto L29
        L28:
            r2 = r1
        L29:
            if (r2 != 0) goto L36
        L2b:
            de.b r1 = r5.f6923l
            ce.b$b r2 = new ce.b$b
            r2.<init>(r0)
            r1.m24441f(r2)
            return r4
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p044ce.GestureDetector$OnGestureListenerC2517b.m33079g():boolean");
    }

    /* renamed from: e */
    public final void m33081e() {
        this.f6925n.forceFinished(true);
    }

    /* renamed from: f */
    public final void m33080f() {
        if (!m33079g()) {
            this.f6922k.m33699f();
        }
    }

    /* renamed from: h */
    public final boolean m33078h(MotionEvent event) {
        C9612q.m13917h(event, "event");
        return this.f6924m.onTouchEvent(event);
    }

    /* renamed from: i */
    public final void m33077i(boolean z) {
        this.f6928q = z;
    }

    /* renamed from: j */
    public final void m33076j(boolean z) {
        this.f6933v = z;
    }

    /* renamed from: k */
    public final void m33075k(boolean z) {
        this.f6930s = z;
    }

    /* renamed from: l */
    public final void m33074l(boolean z) {
        this.f6929r = z;
    }

    /* renamed from: m */
    public final void m33073m(boolean z) {
        this.f6932u = z;
    }

    /* renamed from: n */
    public final void m33072n(boolean z) {
        this.f6931t = z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        C9612q.m13917h(e, "e");
        m33081e();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        float f5;
        if (!this.f6928q || !this.f6921j.m23271m()) {
            return false;
        }
        float f6 = 0.0f;
        if (this.f6921j.m23276h()) {
            f3 = f;
        } else {
            f3 = 0.0f;
        }
        int i = (int) f3;
        if (this.f6921j.m23272l()) {
            f4 = f2;
        } else {
            f4 = 0.0f;
        }
        int i2 = (int) f4;
        this.f6921j.m23280d(true, this.f6926o);
        this.f6921j.m23280d(false, this.f6927p);
        int m23261c = this.f6926o.m23261c();
        int m23263a = this.f6926o.m23263a();
        int m23262b = this.f6926o.m23262b();
        int m23261c2 = this.f6927p.m23261c();
        int m23263a2 = this.f6927p.m23263a();
        int m23262b2 = this.f6927p.m23262b();
        if (!this.f6933v && (this.f6926o.m23260d() || this.f6927p.m23260d())) {
            return false;
        }
        if ((m23261c >= m23262b && m23261c2 >= m23262b2 && !this.f6921j.m23270n()) || !this.f6922k.m33693l()) {
            return false;
        }
        this.f6924m.setIsLongpressEnabled(false);
        if (this.f6921j.m23277g()) {
            f5 = this.f6921j.m23275i();
        } else {
            f5 = 0.0f;
        }
        if (this.f6921j.m23273k()) {
            f6 = this.f6921j.m23274j();
        }
        ZoomLogger zoomLogger = f6920y;
        zoomLogger.m25361b("startFling", "velocityX:", Integer.valueOf(i), "velocityY:", Integer.valueOf(i2));
        zoomLogger.m25361b("startFling", "flingX:", "min:", Integer.valueOf(m23261c), "max:", Integer.valueOf(m23262b), "start:", Integer.valueOf(m23263a), "overScroll:", Float.valueOf(f6));
        zoomLogger.m25361b("startFling", "flingY:", "min:", Integer.valueOf(m23261c2), "max:", Integer.valueOf(m23262b2), "start:", Integer.valueOf(m23263a2), "overScroll:", Float.valueOf(f5));
        this.f6925n.fling(m23263a, m23263a2, i, i2, m23261c, m23262b, m23261c2, m23262b2, (int) f5, (int) f6);
        this.f6923l.m24452B(new RunnableC2520c());
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
        if (r2 == false) goto L57;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p044ce.GestureDetector$OnGestureListenerC2517b.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
