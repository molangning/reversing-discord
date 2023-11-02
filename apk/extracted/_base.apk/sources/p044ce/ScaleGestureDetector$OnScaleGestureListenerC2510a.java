package p044ce;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import be.C2271a;
import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import de.C5822b;
import de.C5827c;
import ee.C6208b;
import ee.C6211c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006-"}, m14357d2 = {"Lce/a;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "", "e", "Lcom/otaliastudios/zoom/AbsolutePoint;", "fixPan", "Landroid/graphics/PointF;", "b", "containerPoint", "c", "contentPoint", "d", "Landroid/view/MotionEvent;", "event", "", "f", "(Landroid/view/MotionEvent;)Z", "Landroid/view/ScaleGestureDetector;", "detector", "onScaleBegin", "onScale", "onScaleEnd", "Lee/c;", "a", "Lee/c;", "zoomManager", "Lee/b;", "Lee/b;", "panManager", "Lbe/a;", "Lbe/a;", "stateController", "Lde/b;", "Lde/b;", "matrixController", "Landroid/view/ScaleGestureDetector;", "Lcom/otaliastudios/zoom/AbsolutePoint;", "initialFocusPoint", "g", "currentFocusOffset", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lee/c;Lee/b;Lbe/a;Lde/b;)V", "h", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: ce.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ScaleGestureDetector$OnScaleGestureListenerC2510a implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: h */
    public static final C2511a f6897h = new C2511a(null);

    /* renamed from: i */
    private static final String f6898i;

    /* renamed from: j */
    private static final ZoomLogger f6899j;

    /* renamed from: a */
    private final C6211c f6900a;

    /* renamed from: b */
    private final C6208b f6901b;

    /* renamed from: c */
    private final C2271a f6902c;

    /* renamed from: d */
    private final C5822b f6903d;

    /* renamed from: e */
    private final ScaleGestureDetector f6904e;

    /* renamed from: f */
    private final AbsolutePoint f6905f;

    /* renamed from: g */
    private final AbsolutePoint f6906g;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lce/a$a;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: ce.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2511a {
        private C2511a() {
        }

        public /* synthetic */ C2511a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: ce.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2512b extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ float f6907j;

        /* renamed from: k */
        final /* synthetic */ PointF f6908k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2512b(float f, PointF pointF) {
            super(1);
            this.f6907j = f;
            this.f6908k = pointF;
        }

        /* renamed from: a */
        public final void m33090a(C5827c.C5828a applyUpdate) {
            C9612q.m13917h(applyUpdate, "$this$applyUpdate");
            applyUpdate.m24394i(this.f6907j, true);
            applyUpdate.m24397f(Float.valueOf(this.f6908k.x), Float.valueOf(this.f6908k.y));
            applyUpdate.m24395h(true);
            applyUpdate.m24396g(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m33090a(c5828a);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: ce.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2513c extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ float f6909j;

        /* renamed from: k */
        final /* synthetic */ AbsolutePoint f6910k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2513c(float f, AbsolutePoint absolutePoint) {
            super(1);
            this.f6909j = f;
            this.f6910k = absolutePoint;
        }

        /* renamed from: a */
        public final void m33089a(C5827c.C5828a applyUpdate) {
            C9612q.m13917h(applyUpdate, "$this$applyUpdate");
            applyUpdate.m24394i(this.f6909j, true);
            applyUpdate.m24399d(this.f6910k, true);
            applyUpdate.m24396g(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m33089a(c5828a);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: ce.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2514d extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ float f6911j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2514d(float f) {
            super(1);
            this.f6911j = f;
        }

        /* renamed from: a */
        public final void m33088a(C5827c.C5828a animateUpdate) {
            C9612q.m13917h(animateUpdate, "$this$animateUpdate");
            animateUpdate.m24394i(this.f6911j, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m33088a(c5828a);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: ce.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2515e extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ float f6912j;

        /* renamed from: k */
        final /* synthetic */ AbsolutePoint f6913k;

        /* renamed from: l */
        final /* synthetic */ PointF f6914l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2515e(float f, AbsolutePoint absolutePoint, PointF pointF) {
            super(1);
            this.f6912j = f;
            this.f6913k = absolutePoint;
            this.f6914l = pointF;
        }

        /* renamed from: a */
        public final void m33087a(C5827c.C5828a animateUpdate) {
            C9612q.m13917h(animateUpdate, "$this$animateUpdate");
            animateUpdate.m24394i(this.f6912j, true);
            animateUpdate.m24399d(this.f6913k, true);
            animateUpdate.m24397f(Float.valueOf(this.f6914l.x), Float.valueOf(this.f6914l.y));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m33087a(c5828a);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: ce.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C2516f extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ float f6915j;

        /* renamed from: k */
        final /* synthetic */ ScaleGestureDetector$OnScaleGestureListenerC2510a f6916k;

        /* renamed from: l */
        final /* synthetic */ ScaleGestureDetector f6917l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2516f(float f, ScaleGestureDetector$OnScaleGestureListenerC2510a scaleGestureDetector$OnScaleGestureListenerC2510a, ScaleGestureDetector scaleGestureDetector) {
            super(1);
            this.f6915j = f;
            this.f6916k = scaleGestureDetector$OnScaleGestureListenerC2510a;
            this.f6917l = scaleGestureDetector;
        }

        /* renamed from: a */
        public final void m33086a(C5827c.C5828a applyUpdate) {
            C9612q.m13917h(applyUpdate, "$this$applyUpdate");
            applyUpdate.m24394i(this.f6915j, true);
            applyUpdate.m24401b(this.f6916k.f6906g, true);
            applyUpdate.m24397f(Float.valueOf(this.f6917l.getFocusX()), Float.valueOf(this.f6917l.getFocusY()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m33086a(c5828a);
            return Unit.f25302a;
        }
    }

    static {
        String TAG = ScaleGestureDetector$OnScaleGestureListenerC2510a.class.getSimpleName();
        f6898i = TAG;
        ZoomLogger.C5364a c5364a = ZoomLogger.f15197b;
        C9612q.m13918g(TAG, "TAG");
        f6899j = c5364a.m25354a(TAG);
    }

    public ScaleGestureDetector$OnScaleGestureListenerC2510a(Context context, C6211c zoomManager, C6208b panManager, C2271a stateController, C5822b matrixController) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(zoomManager, "zoomManager");
        C9612q.m13917h(panManager, "panManager");
        C9612q.m13917h(stateController, "stateController");
        C9612q.m13917h(matrixController, "matrixController");
        this.f6900a = zoomManager;
        this.f6901b = panManager;
        this.f6902c = stateController;
        this.f6903d = matrixController;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.f6904e = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f6905f = new AbsolutePoint(Float.NaN, Float.NaN);
        this.f6906g = new AbsolutePoint(0.0f, 0.0f);
    }

    /* renamed from: b */
    private final PointF m33095b(AbsolutePoint absolutePoint) {
        float m24434m;
        if (this.f6903d.m24422y() <= 1.0f) {
            PointF m33093d = m33093d(new AbsolutePoint((-this.f6903d.m24430q()) / 2.0f, (-this.f6903d.m24433n()) / 2.0f));
            m33093d.set(-m33093d.x, -m33093d.y);
            return m33093d;
        }
        float f = 0.0f;
        if (absolutePoint.m25470c() > 0.0f) {
            m24434m = this.f6903d.m24434m();
        } else if (absolutePoint.m25470c() < 0.0f) {
            m24434m = 0.0f;
        } else {
            m24434m = this.f6903d.m24434m() / 2.0f;
        }
        if (absolutePoint.m25469d() > 0.0f) {
            f = this.f6903d.m24435l();
        } else if (absolutePoint.m25469d() >= 0.0f) {
            f = this.f6903d.m24435l() / 2.0f;
        }
        return new PointF(m24434m, f);
    }

    /* renamed from: c */
    private final AbsolutePoint m33094c(PointF pointF) {
        return ScaledPoint.m25450k(new ScaledPoint(this.f6903d.m24424w() + pointF.x, this.f6903d.m24423x() + pointF.y), this.f6903d.m24422y(), null, 2, null);
    }

    /* renamed from: d */
    private final PointF m33093d(AbsolutePoint absolutePoint) {
        ScaledPoint m25456e = AbsolutePoint.m25463j(absolutePoint, this.f6903d.m24422y(), null, 2, null).m25456e(this.f6903d.m24425v());
        return new PointF(m25456e.m25458c(), m25456e.m25457d());
    }

    /* renamed from: e */
    private final void m33092e() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f6900a.m23244m() && !this.f6901b.m23270n()) {
            this.f6902c.m33699f();
            return;
        }
        float m23251f = this.f6900a.m23251f();
        float m23248i = this.f6900a.m23248i();
        boolean z4 = false;
        float m23255b = this.f6900a.m23255b(this.f6903d.m24422y(), false);
        f6899j.m25361b("onScaleEnd:", "zoom:", Float.valueOf(this.f6903d.m24422y()), "newZoom:", Float.valueOf(m23255b), "max:", Float.valueOf(m23251f), "min:", Float.valueOf(m23248i));
        AbsolutePoint m25450k = ScaledPoint.m25450k(this.f6901b.m23278f(), this.f6903d.m24422y(), null, 2, null);
        if (m25450k.m25470c() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m25450k.m25469d() == 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && Float.compare(m23255b, this.f6903d.m24422y()) == 0) {
                this.f6902c.m33699f();
                return;
            }
        }
        PointF m33095b = m33095b(m25450k);
        AbsolutePoint m25467f = this.f6903d.m24428s().m25467f(m25450k);
        if (Float.compare(m23255b, this.f6903d.m24422y()) != 0) {
            AbsolutePoint absolutePoint = new AbsolutePoint(this.f6903d.m24428s());
            float m24422y = this.f6903d.m24422y();
            this.f6903d.m24439h(new C2512b(m23255b, m33095b));
            AbsolutePoint m25450k2 = ScaledPoint.m25450k(this.f6901b.m23278f(), this.f6903d.m24422y(), null, 2, null);
            m25467f.m25466g(this.f6903d.m24428s().m25467f(m25450k2));
            this.f6903d.m24439h(new C2513c(m24422y, absolutePoint));
            m25450k = m25450k2;
        }
        if (m25450k.m25470c() == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (m25450k.m25469d() == 0.0f) {
                z4 = true;
            }
            if (z4) {
                this.f6903d.m24441f(new C2514d(m23255b));
                return;
            }
        }
        this.f6903d.m24441f(new C2515e(m23255b, m25467f, m33095b));
    }

    /* renamed from: f */
    public final boolean m33091f(MotionEvent event) {
        C9612q.m13917h(event, "event");
        return this.f6904e.onTouchEvent(event);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector detector) {
        C9612q.m13917h(detector, "detector");
        if (!this.f6900a.m23245l() || !this.f6902c.m33692m()) {
            return false;
        }
        AbsolutePoint m33094c = m33094c(new PointF(-detector.getFocusX(), -detector.getFocusY()));
        if (Float.isNaN(this.f6905f.m25470c())) {
            this.f6905f.m25466g(m33094c);
            f6899j.m25361b("onScale:", "Setting initial focus:", this.f6905f);
        } else {
            this.f6906g.m25466g(this.f6905f.m25468e(m33094c));
            f6899j.m25361b("onScale:", "Got focus offset:", this.f6906g);
        }
        this.f6903d.m24439h(new C2516f(this.f6903d.m24422y() * detector.getScaleFactor(), this, detector));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        C9612q.m13917h(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector detector) {
        C9612q.m13917h(detector, "detector");
        f6899j.m25361b("onScaleEnd:", "mInitialAbsFocusPoint.x:", Float.valueOf(this.f6905f.m25470c()), "mInitialAbsFocusPoint.y:", Float.valueOf(this.f6905f.m25469d()), "mOverZoomEnabled;", Boolean.valueOf(this.f6900a.m23244m()));
        m33092e();
        AbsolutePoint absolutePoint = this.f6905f;
        Float valueOf = Float.valueOf(Float.NaN);
        absolutePoint.m25465h(valueOf, valueOf);
        AbsolutePoint absolutePoint2 = this.f6906g;
        Float valueOf2 = Float.valueOf(0.0f);
        absolutePoint2.m25465h(valueOf2, valueOf2);
    }
}
