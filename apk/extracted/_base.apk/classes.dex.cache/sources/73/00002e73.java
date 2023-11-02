package com.otaliastudios.zoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import be.C2271a;
import be.C2274b;
import com.facebook.react.uimanager.ViewProps;
import com.otaliastudios.zoom.InterfaceC5367c;
import com.otaliastudios.zoom.ZoomLogger;
import de.C5822b;
import de.C5827c;
import ee.C6208b;
import ee.C6211c;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p044ce.GestureDetector$OnGestureListenerC2517b;
import p044ce.ScaleGestureDetector$OnScaleGestureListenerC2510a;

@Metadata(m14358d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0099\u00012\u00020\u0001:\u0006¡\u0001¢\u0001£\u0001B\u0013\u0012\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\rH\u0016J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(J\"\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\rH\u0007J\"\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\rH\u0007J\u000e\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200J\u000e\u00103\u001a\u00020\r2\u0006\u00101\u001a\u000200J(\u00108\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J!\u00109\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u00022\u0006\u00107\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J \u0010;\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J \u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\u0018\u0010?\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\u0018\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\b\u0010B\u001a\u00020\u000bH\u0016J\b\u0010C\u001a\u00020\u000bH\u0016J\u0018\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\b\u0010F\u001a\u00020\u0002H\u0016J\b\u0010G\u001a\u00020\u0006H\u0016J\u0018\u0010J\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0006H\u0016J\b\u0010K\u001a\u00020\u0002H\u0016J\b\u0010L\u001a\u00020\u0006H\u0016J\u0018\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0006H\u0016J\u0010\u0010Q\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020OH\u0016J\b\u0010R\u001a\u00020\rH\u0016J\u0006\u0010S\u001a\u00020\u0006J\u0006\u0010T\u001a\u00020\u0006J\u0006\u0010U\u001a\u00020\u0006J\u0006\u0010V\u001a\u00020\u0006R\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\\R\u0018\u0010_\u001a\u00060]R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010^R\u001a\u0010d\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bS\u0010a\u0012\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010fR\u001a\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\b\u0010i\u0012\u0004\bj\u0010cR \u0010q\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010m\u0012\u0004\bp\u0010c\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010sR\u0014\u0010w\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010vR\u0014\u0010z\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010yR\u001a\u0010D\u001a\u00020\u00028VX\u0096\u0004¢\u0006\f\u0012\u0004\b}\u0010c\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001d\u0010\u0084\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u000e\u0012\u0005\b\u0083\u0001\u0010c\u001a\u0005\b\u0082\u0001\u0010|R\u001d\u0010\u0087\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u000e\u0012\u0005\b\u0086\u0001\u0010c\u001a\u0005\b\u0085\u0001\u0010|R\u0017\u0010\u008a\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\u008b\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010|R\u0016\u0010\u008d\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010|R\u001b\u0010\u0091\u0001\u001a\u00030\u008e\u00018F¢\u0006\u000e\u0012\u0005\b\u0090\u0001\u0010c\u001a\u0005\b6\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00028F¢\u0006\r\u0012\u0005\b\u0092\u0001\u0010c\u001a\u0004\b5\u0010|R\u001a\u0010\u0096\u0001\u001a\u00020\u00028F¢\u0006\u000e\u0012\u0005\b\u0095\u0001\u0010c\u001a\u0005\b\u0094\u0001\u0010|R\u0013\u0010\u0098\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010|R\u0013\u0010\u009a\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010|R\u001c\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u000e\u0012\u0005\b\u009c\u0001\u0010c\u001a\u0005\b\u009b\u0001\u0010|¨\u0006¤\u0001"}, m14357d2 = {"Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/c;", "", "r", "Lcom/otaliastudios/zoom/ScaledPoint;", "q", "", "input", "p", "Lcom/otaliastudios/zoom/ZoomEngine$c;", "listener", "", "l", "", "overScroll", "i0", "j0", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "provider", "g0", ViewProps.ENABLED, "c0", "p0", "overPinchable", "h0", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "k0", "q0", "b0", "l0", "f0", "o0", "m0", "allow", "U", "transformation", "gravity", "setTransformation", "alignment", "T", "Landroid/view/View;", "container", "W", "width", "height", "applyTransformation", "Z", "X", "Landroid/view/MotionEvent;", "ev", "O", "P", "zoom", "x", "y", "animate", "M", "N", "(Ljava/lang/Float;Z)V", "R", "dx", "dy", "Q", "u0", "zoomFactor", "r0", "s0", "t0", "realZoom", "S", "z", "A", "maxZoom", "type", "setMaxZoom", "B", "C", "minZoom", "setMinZoom", "", "duration", "V", "m", "n", "o", "s", "t", "j", "I", "transformationType", "k", "transformationGravity", "Landroid/view/View;", "Lcom/otaliastudios/zoom/ZoomEngine$a;", "Lcom/otaliastudios/zoom/ZoomEngine$a;", "callbacks", "Lbe/b;", "Lbe/b;", "getDispatcher$annotations", "()V", "dispatcher", "Lbe/a;", "Lbe/a;", "stateController", "Lee/b;", "Lee/b;", "getPanManager$annotations", "panManager", "Lee/c;", "Lee/c;", "L", "()Lee/c;", "getZoomManager$library_release$annotations", "zoomManager", "Lde/b;", "Lde/b;", "matrixController", "Lce/b;", "Lce/b;", "scrollFlingDetector", "Lce/a;", "Lce/a;", "pinchDetector", "G", "()F", "getRealZoom$annotations", "Lcom/otaliastudios/zoom/AbsolutePoint;", "D", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "E", "getPanX$annotations", "panX", "F", "getPanY$annotations", "panY", "H", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "scaledPanX", "J", "scaledPanY", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "getMatrix$annotations", "matrix", "getContentWidth$annotations", "contentWidth", "w", "getContentHeight$annotations", "contentHeight", "v", "containerWidth", "u", "containerHeight", "K", "getZoom$annotations", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "b", "c", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ZoomEngine implements InterfaceC5367c {

    /* renamed from: u */
    public static final C5355b f15169u = new C5355b(null);

    /* renamed from: v */
    private static final String f15170v;

    /* renamed from: w */
    private static final ZoomLogger f15171w;

    /* renamed from: j */
    private int f15172j;

    /* renamed from: k */
    private int f15173k;

    /* renamed from: l */
    private View f15174l;

    /* renamed from: m */
    private final ViewTreeObserver$OnGlobalLayoutListenerC5351a f15175m;

    /* renamed from: n */
    private final C2274b f15176n;

    /* renamed from: o */
    private final C2271a f15177o;

    /* renamed from: p */
    private final C6208b f15178p;

    /* renamed from: q */
    private final C6211c f15179q;

    /* renamed from: r */
    private final C5822b f15180r;

    /* renamed from: s */
    private final GestureDetector$OnGestureListenerC2517b f15181s;

    /* renamed from: t */
    private final ScaleGestureDetector$OnScaleGestureListenerC2510a f15182t;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001d"}, m14357d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$a;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lbe/a$a;", "Lde/b$a;", "", "onGlobalLayout", "Ljava/lang/Runnable;", "action", "", "a", "e", "j", "", "oldZoom", "firstTime", "d", "", "newState", "i", "c", "oldState", "b", "f", "Landroid/view/MotionEvent;", "event", "h", "g", "<init>", "(Lcom/otaliastudios/zoom/ZoomEngine;)V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class ViewTreeObserver$OnGlobalLayoutListenerC5351a implements ViewTreeObserver.OnGlobalLayoutListener, C2271a.InterfaceC2272a, C5822b.InterfaceC5823a {

        /* renamed from: j */
        final /* synthetic */ ZoomEngine f15183j;

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
        /* renamed from: com.otaliastudios.zoom.ZoomEngine$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        static final class C5352a extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

            /* renamed from: j */
            final /* synthetic */ ZoomEngine f15184j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5352a(ZoomEngine zoomEngine) {
                super(1);
                this.f15184j = zoomEngine;
            }

            /* renamed from: a */
            public final void m25370a(C5827c.C5828a applyUpdate) {
                C9612q.m13917h(applyUpdate, "$this$applyUpdate");
                applyUpdate.m24394i(this.f15184j.m25438L().m23246k(), false);
                applyUpdate.m24396g(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
                m25370a(c5828a);
                return Unit.f25302a;
            }
        }

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
        /* renamed from: com.otaliastudios.zoom.ZoomEngine$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        static final class C5353b extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

            /* renamed from: j */
            final /* synthetic */ ScaledPoint f15185j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5353b(ScaledPoint scaledPoint) {
                super(1);
                this.f15185j = scaledPoint;
            }

            /* renamed from: a */
            public final void m25369a(C5827c.C5828a applyUpdate) {
                C9612q.m13917h(applyUpdate, "$this$applyUpdate");
                applyUpdate.m24398e(this.f15185j, false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
                m25369a(c5828a);
                return Unit.f25302a;
            }
        }

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
        /* renamed from: com.otaliastudios.zoom.ZoomEngine$a$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        static final class C5354c extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

            /* renamed from: j */
            final /* synthetic */ ZoomEngine f15186j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5354c(ZoomEngine zoomEngine) {
                super(1);
                this.f15186j = zoomEngine;
            }

            /* renamed from: a */
            public final void m25368a(C5827c.C5828a applyUpdate) {
                C9612q.m13917h(applyUpdate, "$this$applyUpdate");
                applyUpdate.m24394i(this.f15186j.m25443G(), false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
                m25368a(c5828a);
                return Unit.f25302a;
            }
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC5351a(ZoomEngine this$0) {
            C9612q.m13917h(this$0, "this$0");
            this.f15183j = this$0;
        }

        @Override // de.C5822b.InterfaceC5823a
        /* renamed from: a */
        public boolean mo24420a(Runnable action) {
            C9612q.m13917h(action, "action");
            View view = this.f15183j.f15174l;
            if (view != null) {
                return view.post(action);
            }
            C9612q.m13900y("container");
            throw null;
        }

        @Override // be.C2271a.InterfaceC2272a
        /* renamed from: b */
        public void mo25376b(int i) {
            if (i != 3) {
                if (i == 4) {
                    this.f15183j.f15181s.m33081e();
                    return;
                }
                return;
            }
            this.f15183j.f15180r.m24438i();
        }

        @Override // be.C2271a.InterfaceC2272a
        /* renamed from: c */
        public void mo25375c() {
            this.f15183j.f15176n.m33687b();
        }

        @Override // de.C5822b.InterfaceC5823a
        /* renamed from: d */
        public void mo24419d(float f, boolean z) {
            ZoomEngine.f15171w.m25355h("onMatrixSizeChanged: firstTime:", Boolean.valueOf(z), "oldZoom:", Float.valueOf(f), "transformation:", Integer.valueOf(this.f15183j.f15172j), "transformationZoom:", Float.valueOf(this.f15183j.m25438L().m23246k()));
            this.f15183j.f15177o.m33699f();
            if (z) {
                this.f15183j.m25438L().m23237t(this.f15183j.m25389r());
                this.f15183j.f15180r.m24439h(new C5352a(this.f15183j));
                this.f15183j.f15180r.m24439h(new C5353b(this.f15183j.m25391q()));
            } else {
                this.f15183j.m25438L().m23237t(this.f15183j.m25389r());
                this.f15183j.f15180r.m24439h(new C5354c(this.f15183j));
            }
            ZoomEngine.f15171w.m25361b("onMatrixSizeChanged: newTransformationZoom:", Float.valueOf(this.f15183j.m25438L().m23246k()), "newRealZoom:", Float.valueOf(this.f15183j.m25443G()), "newZoom:", Float.valueOf(this.f15183j.m25439K()));
        }

        @Override // de.C5822b.InterfaceC5823a
        /* renamed from: e */
        public void mo24418e(Runnable action) {
            C9612q.m13917h(action, "action");
            View view = this.f15183j.f15174l;
            if (view != null) {
                view.postOnAnimation(action);
            } else {
                C9612q.m13900y("container");
                throw null;
            }
        }

        @Override // be.C2271a.InterfaceC2272a
        /* renamed from: f */
        public void mo25374f() {
            this.f15183j.f15181s.m33080f();
        }

        @Override // be.C2271a.InterfaceC2272a
        /* renamed from: g */
        public boolean mo25373g(MotionEvent event) {
            C9612q.m13917h(event, "event");
            return this.f15183j.f15181s.m33078h(event);
        }

        @Override // be.C2271a.InterfaceC2272a
        /* renamed from: h */
        public boolean mo25372h(MotionEvent event) {
            C9612q.m13917h(event, "event");
            return this.f15183j.f15182t.m33091f(event);
        }

        @Override // be.C2271a.InterfaceC2272a
        /* renamed from: i */
        public boolean mo25371i(int i) {
            return this.f15183j.f15180r.m24421z();
        }

        @Override // de.C5822b.InterfaceC5823a
        /* renamed from: j */
        public void mo24417j() {
            this.f15183j.f15176n.m33686c();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view;
            ZoomEngine zoomEngine = this.f15183j;
            View view2 = zoomEngine.f15174l;
            if (view2 == null) {
                C9612q.m13900y("container");
                throw null;
            }
            float width = view2.getWidth();
            if (this.f15183j.f15174l != null) {
                ZoomEngine.m25425Y(zoomEngine, width, view.getHeight(), false, 4, null);
            } else {
                C9612q.m13900y("container");
                throw null;
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m14357d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$b;", "", "", "DEFAULT_ANIMATION_DURATION", "J", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5355b {
        private C5355b() {
        }

        public /* synthetic */ C5355b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, m14357d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$c;", "", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "Landroid/graphics/Matrix;", "matrix", "", "onUpdate", "onIdle", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5356c {
        void onIdle(ZoomEngine zoomEngine);

        void onUpdate(ZoomEngine zoomEngine, Matrix matrix);
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5357d extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ float f15187j;

        /* renamed from: k */
        final /* synthetic */ float f15188k;

        /* renamed from: l */
        final /* synthetic */ float f15189l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5357d(float f, float f2, float f3) {
            super(1);
            this.f15187j = f;
            this.f15188k = f2;
            this.f15189l = f3;
        }

        /* renamed from: a */
        public final void m25367a(C5827c.C5828a obtain) {
            C9612q.m13917h(obtain, "$this$obtain");
            obtain.m24394i(this.f15187j, false);
            obtain.m24399d(new AbsolutePoint(this.f15188k, this.f15189l), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m25367a(c5828a);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5358e extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ float f15190j;

        /* renamed from: k */
        final /* synthetic */ float f15191k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5358e(float f, float f2) {
            super(1);
            this.f15190j = f;
            this.f15191k = f2;
        }

        /* renamed from: a */
        public final void m25366a(C5827c.C5828a obtain) {
            C9612q.m13917h(obtain, "$this$obtain");
            obtain.m24401b(new AbsolutePoint(this.f15190j, this.f15191k), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m25366a(c5828a);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m14357d2 = {"Lde/b;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5359f extends AbstractC9614s implements Function0<C5822b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5359f() {
            super(0);
            ZoomEngine.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C5822b invoke() {
            return ZoomEngine.this.f15180r;
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m14357d2 = {"Lde/c$a;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5360g extends AbstractC9614s implements Function1<C5827c.C5828a, Unit> {

        /* renamed from: j */
        final /* synthetic */ float f15193j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5360g(float f) {
            super(1);
            this.f15193j = f;
        }

        /* renamed from: a */
        public final void m25364a(C5827c.C5828a obtain) {
            C9612q.m13917h(obtain, "$this$obtain");
            obtain.m24394i(this.f15193j, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5827c.C5828a c5828a) {
            m25364a(c5828a);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m14357d2 = {"com/otaliastudios/zoom/ZoomEngine$h", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class View$OnAttachStateChangeListenerC5361h implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC5361h() {
            ZoomEngine.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C9612q.m13917h(view, "view");
            view.getViewTreeObserver().addOnGlobalLayoutListener(ZoomEngine.this.f15175m);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C9612q.m13917h(view, "view");
            view.getViewTreeObserver().removeOnGlobalLayoutListener(ZoomEngine.this.f15175m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m14357d2 = {"Lde/b;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5362i extends AbstractC9614s implements Function0<C5822b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5362i() {
            super(0);
            ZoomEngine.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C5822b invoke() {
            return ZoomEngine.this.f15180r;
        }
    }

    static {
        String TAG = ZoomEngine.class.getSimpleName();
        f15170v = TAG;
        ZoomLogger.C5364a c5364a = ZoomLogger.f15197b;
        C9612q.m13918g(TAG, "TAG");
        f15171w = c5364a.m25354a(TAG);
    }

    public ZoomEngine(Context context) {
        C9612q.m13917h(context, "context");
        ViewTreeObserver$OnGlobalLayoutListenerC5351a viewTreeObserver$OnGlobalLayoutListenerC5351a = new ViewTreeObserver$OnGlobalLayoutListenerC5351a(this);
        this.f15175m = viewTreeObserver$OnGlobalLayoutListenerC5351a;
        this.f15176n = new C2274b(this);
        C2271a c2271a = new C2271a(viewTreeObserver$OnGlobalLayoutListenerC5351a);
        this.f15177o = c2271a;
        C6208b c6208b = new C6208b(this, new C5359f());
        this.f15178p = c6208b;
        C6211c c6211c = new C6211c(this, new C5362i());
        this.f15179q = c6211c;
        C5822b c5822b = new C5822b(c6211c, c6208b, c2271a, viewTreeObserver$OnGlobalLayoutListenerC5351a);
        this.f15180r = c5822b;
        this.f15181s = new GestureDetector$OnGestureListenerC2517b(context, c6208b, c2271a, c5822b);
        this.f15182t = new ScaleGestureDetector$OnScaleGestureListenerC2510a(context, c6211c, c6208b, c2271a, c5822b);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m25425Y(ZoomEngine zoomEngine, float f, float f2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContainerSize");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        zoomEngine.m25426X(f, f2, z);
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m25422a0(ZoomEngine zoomEngine, float f, float f2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContentSize");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        zoomEngine.m25424Z(f, f2, z);
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: p */
    private final int m25393p(int i) {
        if (i == 0) {
            C5365a c5365a = C5365a.f15202a;
            return c5365a.m25349e(this.f15178p.m23279e(), 16) | c5365a.m25350d(this.f15178p.m23279e(), 1);
        }
        return i;
    }

    /* renamed from: q */
    public final ScaledPoint m25391q() {
        float m25379x = (m25379x() * m25443G()) - m25381v();
        float m25380w = (m25380w() * m25443G()) - m25383u();
        int m25393p = m25393p(this.f15173k);
        return new ScaledPoint(-this.f15178p.m23282b(m25393p, m25379x, true), -this.f15178p.m23282b(m25393p, m25380w, false));
    }

    /* renamed from: r */
    public final float m25389r() {
        int i = this.f15172j;
        if (i != 0) {
            if (i != 1) {
                return 1.0f;
            }
            float m25381v = m25381v() / m25379x();
            float m25383u = m25383u() / m25380w();
            f15171w.m25357f("computeTransformationZoom", "centerCrop", "scaleX:", Float.valueOf(m25381v), "scaleY:", Float.valueOf(m25383u));
            return Math.max(m25381v, m25383u);
        }
        float m25381v2 = m25381v() / m25379x();
        float m25383u2 = m25383u() / m25380w();
        f15171w.m25357f("computeTransformationZoom", "centerInside", "scaleX:", Float.valueOf(m25381v2), "scaleY:", Float.valueOf(m25383u2));
        return Math.min(m25381v2, m25383u2);
    }

    /* renamed from: A */
    public int m25449A() {
        return this.f15179q.m23250g();
    }

    /* renamed from: B */
    public float m25448B() {
        return this.f15179q.m23249h();
    }

    /* renamed from: C */
    public int m25447C() {
        return this.f15179q.m23247j();
    }

    /* renamed from: D */
    public AbsolutePoint m25446D() {
        return AbsolutePoint.m25471b(this.f15180r.m24428s(), 0.0f, 0.0f, 3, null);
    }

    /* renamed from: E */
    public float m25445E() {
        return this.f15180r.m24427t();
    }

    /* renamed from: F */
    public float m25444F() {
        return this.f15180r.m24426u();
    }

    /* renamed from: G */
    public float m25443G() {
        return this.f15180r.m24422y();
    }

    /* renamed from: H */
    public ScaledPoint m25442H() {
        return ScaledPoint.m25459b(this.f15180r.m24425v(), 0.0f, 0.0f, 3, null);
    }

    /* renamed from: I */
    public float m25441I() {
        return this.f15180r.m24424w();
    }

    /* renamed from: J */
    public float m25440J() {
        return this.f15180r.m24423x();
    }

    /* renamed from: K */
    public float m25439K() {
        return this.f15179q.m23243n(m25443G());
    }

    /* renamed from: L */
    public final C6211c m25438L() {
        return this.f15179q;
    }

    /* renamed from: M */
    public void m25437M(float f, float f2, float f3, boolean z) {
        C5827c m24393a = C5827c.f16683l.m24393a(new C5357d(this.f15179q.m23236u(f), f2, f3));
        if (z) {
            this.f15180r.m24442e(m24393a);
            return;
        }
        m25399m();
        this.f15180r.m24440g(m24393a);
    }

    /* renamed from: N */
    public void m25436N(Float f, boolean z) {
        float m21924i;
        Float valueOf;
        float floatValue;
        if (f == null) {
            valueOf = null;
        } else {
            float floatValue2 = f.floatValue();
            C6211c c6211c = this.f15179q;
            float m23243n = c6211c.m23243n(c6211c.m23248i());
            C6211c c6211c2 = this.f15179q;
            m21924i = C6759j.m21924i(floatValue2, m23243n, c6211c2.m23243n(c6211c2.m23251f()));
            valueOf = Float.valueOf(m21924i);
        }
        if (valueOf == null) {
            floatValue = m25439K();
        } else {
            floatValue = valueOf.floatValue();
        }
        float m23236u = this.f15179q.m23236u(floatValue);
        m25437M(floatValue, -((m25379x() / 2.0f) - ((m25381v() / m23236u) / 2.0f)), -((m25380w() / 2.0f) - ((m25383u() / m23236u) / 2.0f)), z);
    }

    /* renamed from: O */
    public final boolean m25435O(MotionEvent ev) {
        C9612q.m13917h(ev, "ev");
        return this.f15177o.m33697h(ev);
    }

    /* renamed from: P */
    public final boolean m25434P(MotionEvent ev) {
        C9612q.m13917h(ev, "ev");
        return this.f15177o.m33696i(ev);
    }

    /* renamed from: Q */
    public void m25433Q(float f, float f2, boolean z) {
        C5827c m24393a = C5827c.f16683l.m24393a(new C5358e(f, f2));
        if (z) {
            this.f15180r.m24442e(m24393a);
            return;
        }
        m25399m();
        this.f15180r.m24440g(m24393a);
    }

    /* renamed from: R */
    public void m25432R(float f, float f2, boolean z) {
        m25433Q(f - m25445E(), f2 - m25444F(), z);
    }

    /* renamed from: S */
    public void m25431S(float f, boolean z) {
        C5827c m24393a = C5827c.f16683l.m24393a(new C5360g(f));
        if (z) {
            this.f15180r.m24442e(m24393a);
            return;
        }
        m25399m();
        this.f15180r.m24440g(m24393a);
    }

    /* renamed from: T */
    public void m25430T(int i) {
        this.f15178p.m23269o(i);
    }

    /* renamed from: U */
    public void m25429U(boolean z) {
        this.f15181s.m33076j(z);
    }

    /* renamed from: V */
    public void m25428V(long j) {
        this.f15180r.m24450D(j);
    }

    /* renamed from: W */
    public final void m25427W(View container) {
        C9612q.m13917h(container, "container");
        if (this.f15174l == null) {
            this.f15174l = container;
            if (container != null) {
                container.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC5361h());
                return;
            } else {
                C9612q.m13900y("container");
                throw null;
            }
        }
        throw new IllegalStateException("container already set".toString());
    }

    /* renamed from: X */
    public final void m25426X(float f, float f2, boolean z) {
        this.f15180r.m24449E(f, f2, z);
    }

    /* renamed from: Z */
    public final void m25424Z(float f, float f2, boolean z) {
        this.f15180r.m24448F(f, f2, z);
    }

    /* renamed from: b0 */
    public void m25420b0(boolean z) {
        this.f15181s.m33077i(z);
    }

    /* renamed from: c0 */
    public void m25418c0(boolean z) {
        this.f15178p.m23267q(z);
    }

    /* renamed from: d0 */
    public void m25416d0(float f) {
        InterfaceC5367c.C5368a.m25348a(this, f);
    }

    /* renamed from: e0 */
    public void m25414e0(float f) {
        InterfaceC5367c.C5368a.m25347b(this, f);
    }

    /* renamed from: f0 */
    public void m25412f0(boolean z) {
        this.f15181s.m33075k(z);
    }

    /* renamed from: g0 */
    public void m25410g0(OverPanRangeProvider provider) {
        C9612q.m13917h(provider, "provider");
        this.f15178p.m23266r(provider);
    }

    /* renamed from: h0 */
    public void m25408h0(boolean z) {
        this.f15179q.m23239r(z);
    }

    /* renamed from: i0 */
    public void m25406i0(boolean z) {
        this.f15178p.m23268p(z);
    }

    /* renamed from: j0 */
    public void m25404j0(boolean z) {
        this.f15178p.m23265s(z);
    }

    /* renamed from: k0 */
    public void m25402k0(OverZoomRangeProvider provider) {
        C9612q.m13917h(provider, "provider");
        this.f15179q.m23238s(provider);
    }

    /* renamed from: l */
    public final void m25401l(InterfaceC5356c listener) {
        C9612q.m13917h(listener, "listener");
        if (this.f15174l != null) {
            this.f15176n.m33688a(listener);
            return;
        }
        throw new IllegalStateException("container is not initialized.".toString());
    }

    /* renamed from: l0 */
    public void m25400l0(boolean z) {
        this.f15181s.m33074l(z);
    }

    /* renamed from: m */
    public boolean m25399m() {
        if (this.f15177o.m33703b()) {
            this.f15181s.m33081e();
            return true;
        } else if (this.f15177o.m33704a()) {
            this.f15177o.m33699f();
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: m0 */
    public void m25398m0(boolean z) {
        this.f15181s.m33073m(z);
    }

    /* renamed from: n */
    public final int m25397n() {
        return (int) (-this.f15180r.m24424w());
    }

    /* renamed from: n0 */
    public void m25396n0(int i) {
        InterfaceC5367c.C5368a.m25346c(this, i);
    }

    /* renamed from: o */
    public final int m25395o() {
        return (int) this.f15180r.m24431p();
    }

    /* renamed from: o0 */
    public void m25394o0(boolean z) {
        this.f15181s.m33072n(z);
    }

    /* renamed from: p0 */
    public void m25392p0(boolean z) {
        this.f15178p.m23264t(z);
    }

    /* renamed from: q0 */
    public void m25390q0(boolean z) {
        this.f15179q.m23242o(z);
    }

    /* renamed from: r0 */
    public void m25388r0(float f, boolean z) {
        m25382u0(m25439K() * f, z);
    }

    /* renamed from: s */
    public final int m25387s() {
        return (int) (-this.f15180r.m24423x());
    }

    /* renamed from: s0 */
    public void m25386s0() {
        m25388r0(1.3f, true);
    }

    @Override // com.otaliastudios.zoom.InterfaceC5367c
    public void setMaxZoom(float f, int i) {
        this.f15179q.m23241p(f, i);
        if (m25439K() > this.f15179q.m23251f()) {
            m25431S(this.f15179q.m23251f(), true);
        }
    }

    @Override // com.otaliastudios.zoom.InterfaceC5367c
    public void setMinZoom(float f, int i) {
        this.f15179q.m23240q(f, i);
        if (m25443G() <= this.f15179q.m23248i()) {
            m25431S(this.f15179q.m23248i(), true);
        }
    }

    @Override // com.otaliastudios.zoom.InterfaceC5367c
    public void setTransformation(int i, int i2) {
        this.f15172j = i;
        this.f15173k = i2;
    }

    /* renamed from: t */
    public final int m25385t() {
        return (int) this.f15180r.m24432o();
    }

    /* renamed from: t0 */
    public void m25384t0() {
        m25388r0(0.7f, true);
    }

    /* renamed from: u */
    public final float m25383u() {
        return this.f15180r.m24435l();
    }

    /* renamed from: u0 */
    public void m25382u0(float f, boolean z) {
        m25431S(this.f15179q.m23236u(f), z);
    }

    /* renamed from: v */
    public final float m25381v() {
        return this.f15180r.m24434m();
    }

    /* renamed from: w */
    public final float m25380w() {
        return this.f15180r.m24433n();
    }

    /* renamed from: x */
    public final float m25379x() {
        return this.f15180r.m24430q();
    }

    /* renamed from: y */
    public final Matrix m25378y() {
        return this.f15180r.m24429r();
    }

    /* renamed from: z */
    public float m25377z() {
        return this.f15179q.m23252e();
    }
}