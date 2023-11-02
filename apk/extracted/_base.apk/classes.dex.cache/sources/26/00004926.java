package pe;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0011\u0018\u0000 Q2\u00020\u0001:\u0001/B\u001f\u0012\u0006\u00101\u001a\u00020\u001f\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u0010\t\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u001c\u0010\u0011\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010\u0015\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u001c\u0010\u0016\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J \u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010\"\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010'\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010&2\u0006\u0010\u0013\u001a\u00020\u0012J\"\u0010*\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aJ\u0018\u0010+\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010.\u001a\u00020,2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010-\u001a\u00020,R\u0014\u00101\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010BR \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR \u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010BR\u0016\u0010H\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0016\u0010I\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010JR\u0016\u0010L\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010GR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010JR\u0016\u0010N\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010G¨\u0006R"}, m14357d2 = {"Lpe/g;", "", "", "y", "h", "Lpe/d;", "handler", "", "p", "D", "g", "t", "Landroid/view/MotionEvent;", "event", "j", "f", "sourceEvent", "i", "Landroid/view/View;", "view", "r", "d", "w", "s", "", "coords", "", "pointerId", "k", "x", "l", "Landroid/view/ViewGroup;", "viewGroup", "m", "C", "e", "q", "v", "Ljava/util/ArrayList;", "n", "newState", "prevState", "u", "A", "Landroid/graphics/PointF;", "point", "B", "a", "Landroid/view/ViewGroup;", "wrapperView", "Lpe/h;", "b", "Lpe/h;", "handlerRegistry", "Lpe/x;", "c", "Lpe/x;", "viewConfigHelper", "", "F", "getMinimumAlphaForTraversal", "()F", "z", "(F)V", "minimumAlphaForTraversal", "", "[Lpe/d;", "gestureHandlers", "awaitingHandlers", "preparedHandlers", "handlersToCancel", "I", "gestureHandlersCount", "awaitingHandlersCount", "Z", "isHandlingTouch", "handlingChangeSemaphore", "finishedHandlersCleanupScheduled", "activationIndex", "<init>", "(Landroid/view/ViewGroup;Lpe/h;Lpe/x;)V", "o", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11510g {

    /* renamed from: o */
    public static final C11511a f29901o = new C11511a(null);

    /* renamed from: p */
    private static final PointF f29902p = new PointF();

    /* renamed from: q */
    private static final float[] f29903q = new float[2];

    /* renamed from: r */
    private static final Matrix f29904r = new Matrix();

    /* renamed from: s */
    private static final float[] f29905s = new float[2];

    /* renamed from: t */
    private static final Comparator<C11504d<?>> f29906t = new Comparator() { // from class: pe.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m7854o;
            m7854o = C11510g.m7854o((C11504d) obj, (C11504d) obj2);
            return m7854o;
        }
    };

    /* renamed from: a */
    private final ViewGroup f29907a;

    /* renamed from: b */
    private final InterfaceC11513h f29908b;

    /* renamed from: c */
    private final InterfaceC11544x f29909c;

    /* renamed from: d */
    private float f29910d;

    /* renamed from: e */
    private final C11504d<?>[] f29911e;

    /* renamed from: f */
    private final C11504d<?>[] f29912f;

    /* renamed from: g */
    private final C11504d<?>[] f29913g;

    /* renamed from: h */
    private final C11504d<?>[] f29914h;

    /* renamed from: i */
    private int f29915i;

    /* renamed from: j */
    private int f29916j;

    /* renamed from: k */
    private boolean f29917k;

    /* renamed from: l */
    private int f29918l;

    /* renamed from: m */
    private boolean f29919m;

    /* renamed from: n */
    private int f29920n;

    @Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002J \u0010\u0016\u001a\u00020\u00062\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J \u0010\u0019\u001a\u00020\u00062\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J \u0010\u001a\u001a\u00020\u00062\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, m14357d2 = {"Lpe/g$a;", "", "Landroid/view/View;", "view", "", "coords", "", "l", "", "x", "y", "Landroid/view/ViewGroup;", "parent", "child", "Landroid/graphics/PointF;", "outLocalPoint", "", "m", "i", "Lpe/d;", "handler", "other", "k", "a", "b", "g", "j", "", "state", "h", "DEFAULT_MIN_ALPHA_FOR_TRAVERSAL", "F", "SIMULTANEOUS_GESTURE_HANDLER_LIMIT", "I", "Ljava/util/Comparator;", "handlersComparator", "Ljava/util/Comparator;", "Landroid/graphics/Matrix;", "inverseMatrix", "Landroid/graphics/Matrix;", "matrixTransformCoords", "[F", "tempCoords", "tempPoint", "Landroid/graphics/PointF;", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11511a {
        private C11511a() {
        }

        public /* synthetic */ C11511a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: g */
        private final boolean m7836g(C11504d<?> c11504d, C11504d<?> c11504d2) {
            return c11504d == c11504d2 || c11504d.mo7817C0(c11504d2) || c11504d2.mo7817C0(c11504d);
        }

        /* renamed from: h */
        public final boolean m7835h(int i) {
            return i == 3 || i == 1 || i == 5;
        }

        /* renamed from: i */
        public final boolean m7834i(float f, float f2, View view) {
            if (0.0f <= f && f <= ((float) view.getWidth())) {
                if (0.0f <= f2 && f2 <= ((float) view.getHeight())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        public final boolean m7833j(C11504d<?> c11504d, C11504d<?> c11504d2) {
            if (!c11504d.m7936V(c11504d2) || m7836g(c11504d, c11504d2)) {
                return false;
            }
            if (c11504d != c11504d2 && (c11504d.m7934X() || c11504d.m7943O() == 4)) {
                return c11504d.mo7818B0(c11504d2);
            }
            return true;
        }

        /* renamed from: k */
        public final boolean m7832k(C11504d<?> c11504d, C11504d<?> c11504d2) {
            if (c11504d != c11504d2 && (c11504d.m7958E0(c11504d2) || c11504d2.m7960D0(c11504d))) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public final boolean m7831l(View view, float[] fArr) {
            boolean z;
            if ((view instanceof ViewGroup) && view.getBackground() == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !m7834i(fArr[0], fArr[1], view)) {
                return false;
            }
            return true;
        }

        /* renamed from: m */
        public final void m7830m(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = C11510g.f29903q;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(C11510g.f29904r);
                C11510g.f29904r.mapPoints(fArr);
                float f3 = fArr[0];
                scrollY = fArr[1];
                scrollX = f3;
            }
            pointF.set(scrollX, scrollY);
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: pe.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C11512b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29921a;

        static {
            int[] iArr = new int[EnumC11532r.values().length];
            try {
                iArr[EnumC11532r.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11532r.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11532r.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC11532r.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f29921a = iArr;
        }
    }

    public C11510g(ViewGroup wrapperView, InterfaceC11513h handlerRegistry, InterfaceC11544x viewConfigHelper) {
        C9612q.m13917h(wrapperView, "wrapperView");
        C9612q.m13917h(handlerRegistry, "handlerRegistry");
        C9612q.m13917h(viewConfigHelper, "viewConfigHelper");
        this.f29907a = wrapperView;
        this.f29908b = handlerRegistry;
        this.f29909c = viewConfigHelper;
        this.f29911e = new C11504d[20];
        this.f29912f = new C11504d[20];
        this.f29913g = new C11504d[20];
        this.f29914h = new C11504d[20];
    }

    /* renamed from: C */
    private final boolean m7870C(View view, float[] fArr, int i) {
        boolean z;
        int i2 = C11512b.f29921a[this.f29909c.mo7710a(view).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (view instanceof ViewGroup) {
                            z = m7856m((ViewGroup) view, fArr, i);
                        } else {
                            z = false;
                        }
                        if (m7845x(view, fArr, i) || z || f29901o.m7831l(view, fArr)) {
                            return true;
                        }
                    } else {
                        throw new C11581q();
                    }
                } else if (view instanceof ViewGroup) {
                    boolean m7856m = m7856m((ViewGroup) view, fArr, i);
                    if (m7856m) {
                        m7845x(view, fArr, i);
                        return m7856m;
                    }
                    return m7856m;
                } else if (view instanceof EditText) {
                    return m7845x(view, fArr, i);
                }
            } else if (m7845x(view, fArr, i) || f29901o.m7831l(view, fArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    private final void m7869D(C11504d<?> c11504d) {
        if (m7853p(c11504d)) {
            m7865d(c11504d);
            return;
        }
        m7849t(c11504d);
        c11504d.m7906q0(false);
    }

    /* renamed from: d */
    private final void m7865d(C11504d<?> c11504d) {
        int i = this.f29916j;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f29912f[i2] == c11504d) {
                return;
            }
        }
        int i3 = this.f29916j;
        C11504d<?>[] c11504dArr = this.f29912f;
        if (i3 < c11504dArr.length) {
            z = true;
        }
        if (z) {
            this.f29916j = i3 + 1;
            c11504dArr[i3] = c11504d;
            c11504d.m7906q0(true);
            int i4 = this.f29920n;
            this.f29920n = i4 + 1;
            c11504d.m7910o0(i4);
            return;
        }
        throw new IllegalStateException("Too many recognizers".toString());
    }

    /* renamed from: e */
    private final boolean m7864e(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f29910d;
    }

    /* renamed from: f */
    private final void m7863f() {
        int i = this.f29916j;
        while (true) {
            i--;
            if (-1 >= i) {
                break;
            }
            C11504d<?> c11504d = this.f29912f[i];
            C9612q.m13920e(c11504d);
            c11504d.m7911o();
        }
        int i2 = this.f29915i;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f29913g[i3] = this.f29911e[i3];
        }
        for (int i4 = i2 - 1; -1 < i4; i4--) {
            C11504d<?> c11504d2 = this.f29913g[i4];
            C9612q.m13920e(c11504d2);
            c11504d2.m7911o();
        }
    }

    /* renamed from: g */
    private final void m7862g() {
        C11504d<?>[] c11504dArr = this.f29912f;
        int i = this.f29916j;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C11504d<?> c11504d = c11504dArr[i3];
            C9612q.m13920e(c11504d);
            if (c11504d.m7934X()) {
                c11504dArr[i2] = c11504dArr[i3];
                i2++;
            }
        }
        this.f29916j = i2;
    }

    /* renamed from: h */
    private final void m7861h() {
        boolean z;
        boolean z2 = false;
        for (int i = this.f29915i - 1; -1 < i; i--) {
            C11504d<?> c11504d = this.f29911e[i];
            C9612q.m13920e(c11504d);
            if (f29901o.m7835h(c11504d.m7943O()) && !c11504d.m7934X()) {
                this.f29911e[i] = null;
                c11504d.m7918j0();
                c11504d.m7908p0(false);
                c11504d.m7906q0(false);
                c11504d.m7910o0(ViewDefaults.NUMBER_OF_LINES);
                z2 = true;
            }
        }
        if (z2) {
            C11504d<?>[] c11504dArr = this.f29911e;
            int i2 = this.f29915i;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                C11504d<?> c11504d2 = c11504dArr[i4];
                if (c11504d2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c11504dArr[i3] = c11504d2;
                    i3++;
                }
            }
            this.f29915i = i3;
        }
        this.f29919m = false;
    }

    /* renamed from: i */
    private final void m7860i(C11504d<?> c11504d, MotionEvent motionEvent) {
        boolean z;
        if (!m7851r(c11504d.m7939S())) {
            c11504d.m7911o();
        } else if (!c11504d.m7948J0()) {
        } else {
            int actionMasked = motionEvent.getActionMasked();
            View m7939S = c11504d.m7939S();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            C9612q.m13918g(obtain, "obtain(sourceEvent)");
            MotionEvent m7872A = m7872A(m7939S, obtain);
            if (c11504d.m7947K() && c11504d.m7943O() != 0) {
                c11504d.m7950I0(m7872A);
            }
            if (!c11504d.m7934X() || actionMasked != 2) {
                if (c11504d.m7943O() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c11504d.m7937U(m7872A, motionEvent);
                if (c11504d.m7935W()) {
                    if (c11504d.m7944N()) {
                        c11504d.m7890z0(false);
                        c11504d.mo7746l0();
                    }
                    c11504d.mo7820t(m7872A);
                }
                if (c11504d.m7947K() && z) {
                    c11504d.m7950I0(m7872A);
                }
                if (actionMasked == 1 || actionMasked == 6) {
                    c11504d.m7954G0(m7872A.getPointerId(m7872A.getActionIndex()));
                }
            }
            m7872A.recycle();
        }
    }

    /* renamed from: j */
    private final void m7859j(MotionEvent motionEvent) {
        int i = this.f29915i;
        C9536e.m14272f(this.f29911e, this.f29913g, 0, 0, i);
        C9536e.m14259s(this.f29913g, f29906t, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C11504d<?> c11504d = this.f29913g[i2];
            C9612q.m13920e(c11504d);
            m7860i(c11504d, motionEvent);
        }
    }

    /* renamed from: k */
    private final boolean m7858k(View view, float[] fArr, int i) {
        boolean z = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList<C11504d<?>> mo7829a = this.f29908b.mo7829a((View) parent);
                if (mo7829a != null) {
                    synchronized (mo7829a) {
                        Iterator<C11504d<?>> it = mo7829a.iterator();
                        while (it.hasNext()) {
                            C11504d<?> handler = it.next();
                            if (handler.m7933Y() && handler.m7930a0(view, fArr[0], fArr[1])) {
                                C9612q.m13918g(handler, "handler");
                                m7846w(handler, viewGroup);
                                handler.m7956F0(i);
                                z = true;
                            }
                        }
                        Unit unit = Unit.f25302a;
                    }
                } else {
                    continue;
                }
            }
        }
        return z;
    }

    /* renamed from: l */
    private final void m7857l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f29905s;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        m7870C(this.f29907a, fArr, pointerId);
        m7856m(this.f29907a, fArr, pointerId);
    }

    /* renamed from: m */
    private final boolean m7856m(ViewGroup viewGroup, float[] fArr, int i) {
        boolean m7870C;
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View mo7708c = this.f29909c.mo7708c(viewGroup, childCount);
            if (m7864e(mo7708c)) {
                PointF pointF = f29902p;
                C11511a c11511a = f29901o;
                c11511a.m7830m(fArr[0], fArr[1], viewGroup, mo7708c, pointF);
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                if (m7852q(mo7708c) && !c11511a.m7834i(fArr[0], fArr[1], mo7708c)) {
                    m7870C = false;
                } else {
                    m7870C = m7870C(mo7708c, fArr, i);
                }
                fArr[0] = f;
                fArr[1] = f2;
                if (m7870C) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public static final int m7854o(C11504d c11504d, C11504d c11504d2) {
        if ((c11504d.m7935W() && c11504d2.m7935W()) || (c11504d.m7934X() && c11504d2.m7934X())) {
            return Integer.signum(c11504d2.m7959E() - c11504d.m7959E());
        }
        if (!c11504d.m7935W()) {
            if (!c11504d2.m7935W()) {
                if (!c11504d.m7934X()) {
                    if (!c11504d2.m7934X()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* renamed from: p */
    private final boolean m7853p(C11504d<?> c11504d) {
        int i = this.f29915i;
        for (int i2 = 0; i2 < i; i2++) {
            C11504d<?> c11504d2 = this.f29911e[i2];
            C9612q.m13920e(c11504d2);
            C11511a c11511a = f29901o;
            if (!c11511a.m7835h(c11504d2.m7943O()) && c11511a.m7832k(c11504d, c11504d2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private final boolean m7852q(View view) {
        return !(view instanceof ViewGroup) || this.f29909c.mo7709b((ViewGroup) view);
    }

    /* renamed from: r */
    private final boolean m7851r(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f29907a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f29907a) {
            parent = parent.getParent();
        }
        if (parent != this.f29907a) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private final boolean m7850s(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f29903q;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        if (left >= 0.0f && left + view.getWidth() <= viewGroup.getWidth() && top >= 0.0f && top + view.getHeight() <= viewGroup.getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private final void m7849t(C11504d<?> c11504d) {
        int m7943O = c11504d.m7943O();
        c11504d.m7906q0(false);
        c11504d.m7908p0(true);
        c11504d.m7890z0(true);
        int i = this.f29920n;
        this.f29920n = i + 1;
        c11504d.m7910o0(i);
        int i2 = this.f29915i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            C11504d<?> c11504d2 = this.f29911e[i4];
            C9612q.m13920e(c11504d2);
            if (f29901o.m7833j(c11504d2, c11504d)) {
                this.f29914h[i3] = c11504d2;
                i3++;
            }
        }
        for (int i5 = i3 - 1; -1 < i5; i5--) {
            C11504d<?> c11504d3 = this.f29914h[i5];
            C9612q.m13920e(c11504d3);
            c11504d3.m7911o();
        }
        for (int i6 = this.f29916j - 1; -1 < i6; i6--) {
            C11504d<?> c11504d4 = this.f29912f[i6];
            C9612q.m13920e(c11504d4);
            if (f29901o.m7833j(c11504d4, c11504d)) {
                c11504d4.m7911o();
                c11504d4.m7906q0(false);
            }
        }
        m7862g();
        c11504d.mo7819u(4, 2);
        if (m7943O != 4) {
            c11504d.mo7819u(5, 4);
            if (m7943O != 5) {
                c11504d.mo7819u(0, 5);
            }
        }
    }

    /* renamed from: w */
    private final void m7846w(C11504d<?> c11504d, View view) {
        boolean z;
        int i = this.f29915i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f29911e[i2] == c11504d) {
                return;
            }
        }
        int i3 = this.f29915i;
        C11504d<?>[] c11504dArr = this.f29911e;
        if (i3 < c11504dArr.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f29915i = i3 + 1;
            c11504dArr[i3] = c11504d;
            c11504d.m7908p0(false);
            c11504d.m7906q0(false);
            c11504d.m7910o0(ViewDefaults.NUMBER_OF_LINES);
            c11504d.m7919i0(view, this);
            return;
        }
        throw new IllegalStateException("Too many recognizers".toString());
    }

    /* renamed from: x */
    private final boolean m7845x(View view, float[] fArr, int i) {
        boolean z;
        boolean z2;
        ArrayList<C11504d<?>> mo7829a = this.f29908b.mo7829a(view);
        boolean z3 = false;
        if (mo7829a != null) {
            synchronized (mo7829a) {
                Iterator<C11504d<?>> it = mo7829a.iterator();
                z = false;
                while (it.hasNext()) {
                    C11504d<?> handler = it.next();
                    if (handler.m7933Y() && handler.m7930a0(view, fArr[0], fArr[1])) {
                        C9612q.m13918g(handler, "handler");
                        m7846w(handler, view);
                        handler.m7956F0(i);
                        z = true;
                    }
                }
                Unit unit = Unit.f25302a;
            }
        } else {
            z = false;
        }
        float width = view.getWidth();
        float f = fArr[0];
        if (0.0f <= f && f <= width) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            float height = view.getHeight();
            float f2 = fArr[1];
            if (0.0f <= f2 && f2 <= height) {
                z3 = true;
            }
            if (z3 && m7850s(view) && m7858k(view, fArr, i)) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: y */
    private final void m7844y() {
        if (!this.f29917k && this.f29918l == 0) {
            m7861h();
        } else {
            this.f29919m = true;
        }
    }

    /* renamed from: A */
    public final MotionEvent m7872A(View view, MotionEvent event) {
        ViewGroup viewGroup;
        C9612q.m13917h(event, "event");
        if (view == null) {
            return event;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (!C9612q.m13922c(viewGroup, this.f29907a)) {
            m7872A(viewGroup, event);
        }
        if (viewGroup != null) {
            event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f29904r;
            matrix.invert(matrix2);
            event.transform(matrix2);
        }
        return event;
    }

    /* renamed from: B */
    public final PointF m7871B(View view, PointF point) {
        ViewGroup viewGroup;
        C9612q.m13917h(point, "point");
        if (view == null) {
            return point;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (!C9612q.m13922c(viewGroup, this.f29907a)) {
            m7871B(viewGroup, point);
        }
        if (viewGroup != null) {
            point.x += viewGroup.getScrollX() - view.getLeft();
            point.y += viewGroup.getScrollY() - view.getTop();
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f29904r;
            matrix.invert(matrix2);
            float[] fArr = f29905s;
            fArr[0] = point.x;
            fArr[1] = point.y;
            matrix2.mapPoints(fArr);
            point.x = fArr[0];
            point.y = fArr[1];
        }
        return point;
    }

    /* renamed from: n */
    public final ArrayList<C11504d<?>> m7855n(View view) {
        C9612q.m13917h(view, "view");
        return this.f29908b.mo7829a(view);
    }

    /* renamed from: u */
    public final void m7848u(C11504d<?> handler, int i, int i2) {
        C9612q.m13917h(handler, "handler");
        this.f29918l++;
        if (f29901o.m7835h(i)) {
            int i3 = this.f29916j;
            for (int i4 = 0; i4 < i3; i4++) {
                C11504d<?> c11504d = this.f29912f[i4];
                C11511a c11511a = f29901o;
                C9612q.m13920e(c11504d);
                if (c11511a.m7832k(c11504d, handler)) {
                    if (i == 5) {
                        c11504d.m7911o();
                        if (c11504d.m7943O() == 5) {
                            c11504d.mo7819u(3, 2);
                        }
                        c11504d.m7906q0(false);
                    } else {
                        m7869D(c11504d);
                    }
                }
            }
            m7862g();
        }
        if (i == 4) {
            m7869D(handler);
        } else if (i2 != 4 && i2 != 5) {
            if (i2 != 0 || i != 3) {
                handler.mo7819u(i, i2);
            }
        } else if (handler.m7935W()) {
            handler.mo7819u(i, i2);
        } else if (i2 == 4 && (i == 3 || i == 1)) {
            handler.mo7819u(i, 2);
        }
        this.f29918l--;
        m7844y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0012, code lost:
        if (r1 != 5) goto L7;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7847v(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            r0 = 1
            r3.f29917k = r0
            int r1 = r4.getActionMasked()
            if (r1 == 0) goto L19
            r2 = 3
            if (r1 == r2) goto L15
            r2 = 5
            if (r1 == r2) goto L19
            goto L1c
        L15:
            r3.m7863f()
            goto L1c
        L19:
            r3.m7857l(r4)
        L1c:
            r3.m7859j(r4)
            r4 = 0
            r3.f29917k = r4
            boolean r4 = r3.f29919m
            if (r4 == 0) goto L2d
            int r4 = r3.f29918l
            if (r4 != 0) goto L2d
            r3.m7861h()
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.C11510g.m7847v(android.view.MotionEvent):boolean");
    }

    /* renamed from: z */
    public final void m7843z(float f) {
        this.f29910d = f;
    }
}