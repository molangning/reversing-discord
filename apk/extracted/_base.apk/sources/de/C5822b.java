package de;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import be.C2271a;
import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import de.C5827c;
import ee.C6208b;
import ee.C6211c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u001f*\u0001^\b\u0000\u0018\u0000 f2\u00020\u0001:\u0002$(B'\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\bz\u0010{J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0017H\u0000¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00104R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00108R$\u0010>\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001a\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\u0002078@X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b?\u0010@R$\u0010D\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\bB\u0010CR$\u0010F\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\bE\u0010CR\u001a\u0010K\u001a\u00020G8@X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010P\u001a\u00020L8@X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010M\u001a\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010c\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bb\u0010 \u001a\u0004\b_\u0010CR\u001a\u0010e\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bd\u0010 \u001a\u0004\b[\u0010CR\u001a\u0010h\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bg\u0010 \u001a\u0004\bf\u0010CR\u001a\u0010j\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bi\u0010 \u001a\u0004\bR\u0010CR\u001a\u0010m\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bl\u0010 \u001a\u0004\bk\u0010CR\u001a\u0010p\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bo\u0010 \u001a\u0004\bn\u0010CR\u001a\u0010s\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\br\u0010 \u001a\u0004\bq\u0010CR\u001a\u0010v\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bu\u0010 \u001a\u0004\bt\u0010CR\u001a\u0010y\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bx\u0010 \u001a\u0004\bw\u0010C¨\u0006|"}, m14357d2 = {"Lde/b;", "", "", "oldZoom", "", "forceReset", "", "A", "G", "j", "allowOverPan", "k", "Ljava/lang/Runnable;", "action", "B", "(Ljava/lang/Runnable;)Z", "C", "(Ljava/lang/Runnable;)V", "width", "height", "F", "(FFZ)V", "E", "Lkotlin/Function1;", "Lde/c$a;", "update", "h", "(Lkotlin/jvm/functions/Function1;)V", "Lde/c;", "g", "(Lde/c;)V", "i", "()V", "f", "e", "Lee/c;", "a", "Lee/c;", "zoomManager", "Lee/b;", "b", "Lee/b;", "panManager", "Lbe/a;", "c", "Lbe/a;", "stateController", "Lde/b$a;", "d", "Lde/b$a;", "callback", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "contentScaledRect", "contentRect", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "stub", "<set-?>", "Z", "z", "()Z", "isInitialized", "r", "()Landroid/graphics/Matrix;", "matrix", "m", "()F", "containerWidth", "l", "containerHeight", "Lcom/otaliastudios/zoom/ScaledPoint;", "Lcom/otaliastudios/zoom/ScaledPoint;", "v", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "Lcom/otaliastudios/zoom/AbsolutePoint;", "Lcom/otaliastudios/zoom/AbsolutePoint;", "s", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "", "n", "J", "getAnimationDuration$library_release", "()J", "D", "(J)V", "animationDuration", "", "Landroid/animation/ValueAnimator;", "o", "Ljava/util/Set;", "activeAnimators", "de/b$d", "p", "Lde/b$d;", "cancelAnimationListener", "getContentScaledWidth$library_release$annotations", "contentScaledWidth", "getContentScaledHeight$library_release$annotations", "contentScaledHeight", "q", "getContentWidth$library_release$annotations", "contentWidth", "getContentHeight$library_release$annotations", "contentHeight", "w", "getScaledPanX$library_release$annotations", "scaledPanX", "x", "getScaledPanY$library_release$annotations", "scaledPanY", "y", "getZoom$library_release$annotations", "zoom", "t", "getPanX$library_release$annotations", "panX", "u", "getPanY$library_release$annotations", "panY", "<init>", "(Lee/c;Lee/b;Lbe/a;Lde/b$a;)V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: de.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5822b {

    /* renamed from: q */
    public static final C5824b f16660q = new C5824b(null);

    /* renamed from: r */
    private static final String f16661r;

    /* renamed from: s */
    private static final ZoomLogger f16662s;

    /* renamed from: t */
    private static final AccelerateDecelerateInterpolator f16663t;

    /* renamed from: a */
    private final C6211c f16664a;

    /* renamed from: b */
    private final C6208b f16665b;

    /* renamed from: c */
    private final C2271a f16666c;

    /* renamed from: d */
    private final InterfaceC5823a f16667d;

    /* renamed from: e */
    private RectF f16668e;

    /* renamed from: f */
    private RectF f16669f;

    /* renamed from: g */
    private Matrix f16670g;

    /* renamed from: h */
    private boolean f16671h;

    /* renamed from: i */
    private final Matrix f16672i;

    /* renamed from: j */
    private float f16673j;

    /* renamed from: k */
    private float f16674k;

    /* renamed from: l */
    private final ScaledPoint f16675l;

    /* renamed from: m */
    private final AbsolutePoint f16676m;

    /* renamed from: n */
    private long f16677n;

    /* renamed from: o */
    private final Set<ValueAnimator> f16678o;

    /* renamed from: p */
    private final C5826d f16679p;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¨\u0006\r"}, m14357d2 = {"Lde/b$a;", "", "", "j", "", "oldZoom", "", "firstTime", "d", "Ljava/lang/Runnable;", "action", "a", "e", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: de.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5823a {
        /* renamed from: a */
        boolean mo24420a(Runnable runnable);

        /* renamed from: d */
        void mo24419d(float f, boolean z);

        /* renamed from: e */
        void mo24418e(Runnable runnable);

        /* renamed from: j */
        void mo24417j();
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m14357d2 = {"Lde/b$b;", "", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "ANIMATION_INTERPOLATOR", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: de.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5824b {
        private C5824b() {
        }

        public /* synthetic */ C5824b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: de.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5825c extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ C5827c f16680j;

        /* renamed from: k */
        final /* synthetic */ ValueAnimator f16681k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5825c(C5827c c5827c, ValueAnimator valueAnimator) {
            super(1);
            this.f16680j = c5827c;
            this.f16681k = valueAnimator;
        }

        /* renamed from: a */
        public final void m24416a(C5827c.C5828a applyUpdate) {
            C9612q.m13917h(applyUpdate, "$this$applyUpdate");
            if (this.f16680j.m24411d()) {
                Object animatedValue = this.f16681k.getAnimatedValue("zoom");
                if (animatedValue != null) {
                    applyUpdate.m24394i(((Float) animatedValue).floatValue(), this.f16680j.m24413b());
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
            }
            if (this.f16680j.m24409f() != null) {
                Object animatedValue2 = this.f16681k.getAnimatedValue("panX");
                if (animatedValue2 != null) {
                    float floatValue = ((Float) animatedValue2).floatValue();
                    Object animatedValue3 = this.f16681k.getAnimatedValue("panY");
                    if (animatedValue3 != null) {
                        applyUpdate.m24399d(new AbsolutePoint(floatValue, ((Float) animatedValue3).floatValue()), this.f16680j.m24414a());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
            } else if (this.f16680j.m24406i() != null) {
                Object animatedValue4 = this.f16681k.getAnimatedValue("panX");
                if (animatedValue4 != null) {
                    float floatValue2 = ((Float) animatedValue4).floatValue();
                    Object animatedValue5 = this.f16681k.getAnimatedValue("panY");
                    if (animatedValue5 != null) {
                        applyUpdate.m24398e(new ScaledPoint(floatValue2, ((Float) animatedValue5).floatValue()), this.f16680j.m24414a());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
            }
            applyUpdate.m24397f(this.f16680j.m24408g(), this.f16680j.m24407h());
            applyUpdate.m24396g(this.f16680j.m24410e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m24416a(c5828a);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m14357d2 = {"de/b$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "", "a", "onAnimationEnd", "onAnimationCancel", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: de.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5826d extends AnimatorListenerAdapter {
        C5826d() {
        }

        /* renamed from: a */
        private final void m24415a(Animator animator) {
            animator.removeListener(this);
            Set set = C5822b.this.f16678o;
            if (set != null) {
                C9604l0.m13941a(set).remove(animator);
                if (C5822b.this.f16678o.isEmpty()) {
                    C5822b.this.f16666c.m33699f();
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C9612q.m13917h(animator, "animator");
            m24415a(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C9612q.m13917h(animator, "animator");
            m24415a(animator);
        }
    }

    static {
        String TAG = C5822b.class.getSimpleName();
        f16661r = TAG;
        ZoomLogger.C5364a c5364a = ZoomLogger.f15197b;
        C9612q.m13918g(TAG, "TAG");
        f16662s = c5364a.m25354a(TAG);
        f16663t = new AccelerateDecelerateInterpolator();
    }

    public C5822b(C6211c zoomManager, C6208b panManager, C2271a stateController, InterfaceC5823a callback) {
        C9612q.m13917h(zoomManager, "zoomManager");
        C9612q.m13917h(panManager, "panManager");
        C9612q.m13917h(stateController, "stateController");
        C9612q.m13917h(callback, "callback");
        this.f16664a = zoomManager;
        this.f16665b = panManager;
        this.f16666c = stateController;
        this.f16667d = callback;
        this.f16668e = new RectF();
        this.f16669f = new RectF();
        this.f16670g = new Matrix();
        this.f16672i = new Matrix();
        this.f16675l = new ScaledPoint(0.0f, 0.0f, 3, null);
        this.f16676m = new AbsolutePoint(0.0f, 0.0f, 3, null);
        this.f16677n = 280L;
        this.f16678o = new LinkedHashSet();
        this.f16679p = new C5826d();
    }

    /* renamed from: A */
    private final void m24453A(float f, boolean z) {
        m24447G();
        if (m24430q() > 0.0f && m24433n() > 0.0f) {
            float f2 = this.f16673j;
            if (f2 > 0.0f && this.f16674k > 0.0f) {
                boolean z2 = false;
                f16662s.m25355h("onSizeChanged:", "containerWidth:", Float.valueOf(f2), "containerHeight:", Float.valueOf(this.f16674k), "contentWidth:", Float.valueOf(m24430q()), "contentHeight:", Float.valueOf(m24433n()));
                if (!this.f16671h || z) {
                    z2 = true;
                }
                this.f16671h = true;
                this.f16667d.mo24419d(f, z2);
            }
        }
    }

    /* renamed from: G */
    private final void m24447G() {
        this.f16670g.mapRect(this.f16668e, this.f16669f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m24443d(C5822b this$0, C5827c update, ValueAnimator valueAnimator) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(update, "$update");
        this$0.m24439h(new C5825c(update, valueAnimator));
    }

    /* renamed from: j */
    private final void m24437j() {
        this.f16667d.mo24417j();
    }

    /* renamed from: k */
    private final void m24436k(boolean z) {
        boolean z2;
        boolean z3 = true;
        float m23281c = this.f16665b.m23281c(true, z);
        float m23281c2 = this.f16665b.m23281c(false, z);
        if (m23281c == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (m23281c2 != 0.0f) {
                z3 = false;
            }
            if (z3) {
                return;
            }
        }
        this.f16670g.postTranslate(m23281c, m23281c2);
        m24447G();
    }

    /* renamed from: B */
    public final boolean m24452B(Runnable action) {
        C9612q.m13917h(action, "action");
        return this.f16667d.mo24420a(action);
    }

    /* renamed from: C */
    public final void m24451C(Runnable action) {
        C9612q.m13917h(action, "action");
        this.f16667d.mo24418e(action);
    }

    /* renamed from: D */
    public final void m24450D(long j) {
        this.f16677n = j;
    }

    /* renamed from: E */
    public final void m24449E(float f, float f2, boolean z) {
        boolean z2;
        if (f > 0.0f && f2 > 0.0f) {
            boolean z3 = true;
            if (f == this.f16673j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (f2 != this.f16674k) {
                    z3 = false;
                }
                if (z3 && !z) {
                    return;
                }
            }
            this.f16673j = f;
            this.f16674k = f2;
            m24453A(m24422y(), z);
        }
    }

    /* renamed from: F */
    public final void m24448F(float f, float f2, boolean z) {
        boolean z2;
        if (f > 0.0f && f2 > 0.0f) {
            boolean z3 = true;
            if (m24430q() == f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m24433n() != f2) {
                    z3 = false;
                }
                if (z3 && !z) {
                    return;
                }
            }
            float m24422y = m24422y();
            this.f16669f.set(0.0f, 0.0f, f, f2);
            m24453A(m24422y, z);
        }
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    /* renamed from: e */
    public final void m24442e(final C5827c update) {
        ScaledPoint m24406i;
        float m24405j;
        AbsolutePoint m24409f;
        C9612q.m13917h(update, "update");
        if (!this.f16671h || !this.f16666c.m33694k()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (update.m24409f() != null) {
            if (update.m24404k()) {
                m24409f = m24428s().m25467f(update.m24409f());
            } else {
                m24409f = update.m24409f();
            }
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("panX", m24427t(), m24409f.m25470c());
            C9612q.m13918g(ofFloat, "ofFloat(\"panX\", panX, target.x)");
            arrayList.add(ofFloat);
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("panY", m24426u(), m24409f.m25469d());
            C9612q.m13918g(ofFloat2, "ofFloat(\"panY\", panY, target.y)");
            arrayList.add(ofFloat2);
        } else if (update.m24406i() != null) {
            if (update.m24404k()) {
                m24406i = m24425v().m25455f(update.m24406i());
            } else {
                m24406i = update.m24406i();
            }
            PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("panX", m24424w(), m24406i.m25458c());
            C9612q.m13918g(ofFloat3, "ofFloat(\"panX\", scaledPanX, target.x)");
            arrayList.add(ofFloat3);
            PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("panY", m24423x(), m24406i.m25457d());
            C9612q.m13918g(ofFloat4, "ofFloat(\"panY\", scaledPanY, target.y)");
            arrayList.add(ofFloat4);
        }
        if (update.m24411d()) {
            if (update.m24403l()) {
                m24405j = m24422y() * update.m24405j();
            } else {
                m24405j = update.m24405j();
            }
            PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat("zoom", m24422y(), this.f16664a.m23255b(m24405j, update.m24413b()));
            C9612q.m13918g(ofFloat5, "ofFloat(\"zoom\", zoom, newZoom)");
            arrayList.add(ofFloat5);
        }
        Object[] array = arrayList.toArray(new PropertyValuesHolder[0]);
        if (array != null) {
            PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) array;
            ValueAnimator animator = ValueAnimator.ofPropertyValuesHolder((PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, propertyValuesHolderArr.length));
            animator.setDuration(this.f16677n);
            animator.setInterpolator(f16663t);
            animator.addListener(this.f16679p);
            animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: de.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C5822b.m24443d(C5822b.this, update, valueAnimator);
                }
            });
            animator.start();
            Set<ValueAnimator> set = this.f16678o;
            C9612q.m13918g(animator, "animator");
            set.add(animator);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: f */
    public final void m24441f(Function1<? super C5827c.C5828a, Unit> update) {
        C9612q.m13917h(update, "update");
        m24442e(C5827c.f16683l.m24393a(update));
    }

    /* renamed from: g */
    public final void m24440g(C5827c update) {
        ScaledPoint m25456e;
        float m24405j;
        float f;
        AbsolutePoint m25468e;
        C9612q.m13917h(update, "update");
        if (!this.f16671h) {
            return;
        }
        if (update.m24409f() != null) {
            if (update.m24404k()) {
                m25468e = update.m24409f();
            } else {
                m25468e = update.m24409f().m25468e(m24428s());
            }
            this.f16670g.preTranslate(m25468e.m25470c(), m25468e.m25469d());
            m24447G();
        } else if (update.m24406i() != null) {
            if (update.m24404k()) {
                m25456e = update.m24406i();
            } else {
                m25456e = update.m24406i().m25456e(m24425v());
            }
            this.f16670g.postTranslate(m25456e.m25458c(), m25456e.m25457d());
            m24447G();
        }
        if (update.m24411d()) {
            if (update.m24403l()) {
                m24405j = m24422y() * update.m24405j();
            } else {
                m24405j = update.m24405j();
            }
            float m23255b = this.f16664a.m23255b(m24405j, update.m24413b()) / m24422y();
            float f2 = 0.0f;
            if (update.m24408g() != null) {
                f = update.m24408g().floatValue();
            } else if (update.m24412c()) {
                f = 0.0f;
            } else {
                f = this.f16673j / 2.0f;
            }
            if (update.m24407h() != null) {
                f2 = update.m24407h().floatValue();
            } else if (!update.m24412c()) {
                f2 = this.f16674k / 2.0f;
            }
            this.f16670g.postScale(m23255b, m23255b, f, f2);
            m24447G();
        }
        m24436k(update.m24414a());
        if (update.m24410e()) {
            m24437j();
        }
    }

    /* renamed from: h */
    public final void m24439h(Function1<? super C5827c.C5828a, Unit> update) {
        C9612q.m13917h(update, "update");
        m24440g(C5827c.f16683l.m24393a(update));
    }

    /* renamed from: i */
    public final void m24438i() {
        for (ValueAnimator valueAnimator : this.f16678o) {
            valueAnimator.cancel();
        }
        this.f16678o.clear();
    }

    /* renamed from: l */
    public final float m24435l() {
        return this.f16674k;
    }

    /* renamed from: m */
    public final float m24434m() {
        return this.f16673j;
    }

    /* renamed from: n */
    public final float m24433n() {
        return this.f16669f.height();
    }

    /* renamed from: o */
    public final float m24432o() {
        return this.f16668e.height();
    }

    /* renamed from: p */
    public final float m24431p() {
        return this.f16668e.width();
    }

    /* renamed from: q */
    public final float m24430q() {
        return this.f16669f.width();
    }

    /* renamed from: r */
    public final Matrix m24429r() {
        this.f16672i.set(this.f16670g);
        return this.f16672i;
    }

    /* renamed from: s */
    public final AbsolutePoint m24428s() {
        this.f16676m.m25465h(Float.valueOf(m24427t()), Float.valueOf(m24426u()));
        return this.f16676m;
    }

    /* renamed from: t */
    public final float m24427t() {
        return m24424w() / m24422y();
    }

    /* renamed from: u */
    public final float m24426u() {
        return m24423x() / m24422y();
    }

    /* renamed from: v */
    public final ScaledPoint m24425v() {
        this.f16675l.m25454g(Float.valueOf(m24424w()), Float.valueOf(m24423x()));
        return this.f16675l;
    }

    /* renamed from: w */
    public final float m24424w() {
        return this.f16668e.left;
    }

    /* renamed from: x */
    public final float m24423x() {
        return this.f16668e.top;
    }

    /* renamed from: y */
    public final float m24422y() {
        return this.f16668e.width() / this.f16669f.width();
    }

    /* renamed from: z */
    public final boolean m24421z() {
        return this.f16671h;
    }
}
