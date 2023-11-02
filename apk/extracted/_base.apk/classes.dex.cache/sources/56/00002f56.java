package com.swmansion.gesturehandler.react;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1285k2;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import pe.C11504d;
import pe.C11519m;

@ReactModule(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002'(B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0017J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0017J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0017J!\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0017J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\nH\u0017J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\nH\u0017J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 H\u0014R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "view", "", "useDrawableOnForeground", "", "setForeground", "useBorderlessDrawable", "setBorderless", ViewProps.ENABLED, "setEnabled", "", "borderRadius", "setBorderRadius", "", "rippleColor", "setRippleColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "<init>", "()V", "Companion", "a", "b", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<C5534a> implements RNGestureHandlerButtonManagerInterface<C5534a> {
    public static final C5536b Companion = new C5536b(null);
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final ViewManagerDelegate<C5534a> mDelegate = new RNGestureHandlerButtonManagerDelegate(this);

    @Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b-\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001UB\u0011\u0012\b\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bR\u0010SJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H\u0017J\u0006\u0010\u0015\u001a\u00020\u0005J0\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0014J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007H\u0016J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016R.\u0010*\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u0010/\u001a\u0004\u0018\u00010\r2\b\u0010+\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R*\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R*\u0010?\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00101\u001a\u0004\bA\u00103\"\u0004\bB\u00105R\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00101R\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010JR\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010ER\"\u0010N\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\bN\u00103\"\u0004\bO\u00105¨\u0006V"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Landroid/view/ViewGroup;", "Lpe/m$d;", "Landroid/graphics/drawable/Drawable;", "h", "", "l", "", "m", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "children", "j", "", ViewProps.COLOR, "setBackgroundColor", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "event", "onTouchEvent", "n", "changed", "t", "r", "b", ViewProps.ON_LAYOUT, "", "x", "y", "drawableHotspotChanged", "c", "f", "performClick", "pressed", "setPressed", "dispatchDrawableHotspotChanged", "Ljava/lang/Integer;", "getRippleColor", "()Ljava/lang/Integer;", "setRippleColor", "(Ljava/lang/Integer;)V", "rippleColor", "radius", "k", "getRippleRadius", "setRippleRadius", "rippleRadius", "useForeground", "Z", "getUseDrawableOnForeground", "()Z", "setUseDrawableOnForeground", "(Z)V", "useDrawableOnForeground", "getUseBorderlessDrawable", "setUseBorderlessDrawable", "useBorderlessDrawable", "F", "getBorderRadius", "()F", "setBorderRadius", "(F)V", "borderRadius", "o", "getExclusive", "setExclusive", "exclusive", "p", "I", "_backgroundColor", "q", "needBackgroundUpdate", "", "J", "lastEventTime", "s", "lastAction", "isTouched", "setTouched", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "u", "a", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5534a extends ViewGroup implements C11519m.InterfaceC11523d {

        /* renamed from: w */
        private static C5534a f15525w;

        /* renamed from: x */
        private static C5534a f15526x;

        /* renamed from: j */
        private Integer f15528j;

        /* renamed from: k */
        private Integer f15529k;

        /* renamed from: l */
        private boolean f15530l;

        /* renamed from: m */
        private boolean f15531m;

        /* renamed from: n */
        private float f15532n;

        /* renamed from: o */
        private boolean f15533o;

        /* renamed from: p */
        private int f15534p;

        /* renamed from: q */
        private boolean f15535q;

        /* renamed from: r */
        private long f15536r;

        /* renamed from: s */
        private int f15537s;

        /* renamed from: t */
        private boolean f15538t;

        /* renamed from: u */
        public static final C5535a f15523u = new C5535a(null);

        /* renamed from: v */
        private static TypedValue f15524v = new TypedValue();

        /* renamed from: y */
        private static View.OnClickListener f15527y = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.C5534a.m25079i(view);
            }
        };

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a$a;", "", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C5535a {
            private C5535a() {
            }

            public /* synthetic */ C5535a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C5534a(Context context) {
            super(context);
            this.f15533o = true;
            this.f15536r = -1L;
            this.f15537s = -1;
            setOnClickListener(f15527y);
            setClickable(true);
            setFocusable(true);
            this.f15535q = true;
        }

        /* renamed from: h */
        private final Drawable m25080h() {
            ColorStateList colorStateList;
            ShapeDrawable shapeDrawable;
            int i = Build.VERSION.SDK_INT;
            Integer num = this.f15528j;
            if (num != null && num.intValue() == 0 && i >= 33) {
                return null;
            }
            int[][] iArr = {new int[]{16842910}};
            Integer num2 = this.f15529k;
            Integer num3 = this.f15528j;
            if (num3 != null) {
                C9612q.m13920e(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(16843820, f15524v, true);
                colorStateList = new ColorStateList(iArr, new int[]{f15524v.data});
            }
            if (this.f15531m) {
                shapeDrawable = null;
            } else {
                shapeDrawable = new ShapeDrawable(new RectShape());
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, shapeDrawable);
            if (num2 != null) {
                rippleDrawable.setRadius((int) PixelUtil.toPixelFromDIP(num2.intValue()));
            }
            return rippleDrawable;
        }

        /* renamed from: i */
        public static final void m25079i(View view) {
        }

        /* renamed from: j */
        private final boolean m25078j(Sequence<? extends View> sequence) {
            for (View view : sequence) {
                if (view instanceof C5534a) {
                    C5534a c5534a = (C5534a) view;
                    if (c5534a.f15538t || c5534a.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && m25078j(C1285k2.m37419a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        static /* synthetic */ boolean m25077k(C5534a c5534a, Sequence sequence, int i, Object obj) {
            if ((i & 1) != 0) {
                sequence = C1285k2.m37419a(c5534a);
            }
            return c5534a.m25078j(sequence);
        }

        /* renamed from: l */
        private final void m25076l() {
            if (f15525w == this) {
                f15525w = null;
                f15526x = this;
            }
        }

        /* renamed from: m */
        private final boolean m25075m() {
            boolean z;
            if (m25077k(this, null, 1, null)) {
                return false;
            }
            C5534a c5534a = f15525w;
            if (c5534a == null) {
                f15525w = this;
                return true;
            }
            if (this.f15533o) {
                if (c5534a == this) {
                    return true;
                }
            } else {
                if (c5534a != null) {
                    z = c5534a.f15533o;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
            }
            return false;
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: a */
        public boolean mo7804a() {
            return C11519m.InterfaceC11523d.C11524a.m7807d(this);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: b */
        public boolean mo7803b() {
            return C11519m.InterfaceC11523d.C11524a.m7805f(this);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: c */
        public boolean mo7802c() {
            boolean m25075m = m25075m();
            if (m25075m) {
                this.f15538t = true;
            }
            return m25075m;
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: d */
        public boolean mo7801d(C11504d<?> c11504d) {
            return C11519m.InterfaceC11523d.C11524a.m7806e(this, c11504d);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f, float f2) {
            C5534a c5534a = f15525w;
            if (c5534a == null || c5534a == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: e */
        public void mo7800e(MotionEvent motionEvent) {
            C11519m.InterfaceC11523d.C11524a.m7808c(this, motionEvent);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: f */
        public void mo7799f(MotionEvent event) {
            C9612q.m13917h(event, "event");
            m25076l();
            this.f15538t = false;
        }

        public final float getBorderRadius() {
            return this.f15532n;
        }

        public final boolean getExclusive() {
            return this.f15533o;
        }

        public final Integer getRippleColor() {
            return this.f15528j;
        }

        public final Integer getRippleRadius() {
            return this.f15529k;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f15531m;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f15530l;
        }

        /* renamed from: n */
        public final void m25074n() {
            boolean z;
            boolean z2;
            if (!this.f15535q) {
                return;
            }
            this.f15535q = false;
            if (this.f15534p == 0) {
                setBackground(null);
            }
            setForeground(null);
            Drawable m25080h = m25080h();
            if (this.f15532n == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (m25080h instanceof RippleDrawable)) {
                PaintDrawable paintDrawable = new PaintDrawable(-1);
                paintDrawable.setCornerRadius(this.f15532n);
                ((RippleDrawable) m25080h).setDrawableByLayerId(16908334, paintDrawable);
            }
            if (this.f15530l) {
                setForeground(m25080h);
                int i = this.f15534p;
                if (i != 0) {
                    setBackgroundColor(i);
                }
            } else if (this.f15534p == 0 && this.f15528j == null) {
                setBackground(m25080h);
            } else {
                PaintDrawable paintDrawable2 = new PaintDrawable(this.f15534p);
                float f = this.f15532n;
                if (f == 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    paintDrawable2.setCornerRadius(f);
                }
                setBackground(new LayerDrawable(m25080h != null ? new Drawable[]{paintDrawable2, m25080h} : new PaintDrawable[]{paintDrawable2}));
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            C9612q.m13917h(ev, "ev");
            if (super.onInterceptTouchEvent(ev)) {
                return true;
            }
            onTouchEvent(ev);
            return isPressed();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent event) {
            C9612q.m13917h(event, "event");
            if (event.getAction() == 3) {
                m25076l();
            }
            long eventTime = event.getEventTime();
            int action = event.getAction();
            if (this.f15536r == eventTime && this.f15537s == action) {
                return false;
            }
            this.f15536r = eventTime;
            this.f15537s = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!m25077k(this, null, 1, null) && C9612q.m13922c(f15526x, this)) {
                m25076l();
                f15526x = null;
                return super.performClick();
            }
            return false;
        }

        @Override // android.view.View
        public void setBackgroundColor(int i) {
            this.f15534p = i;
            this.f15535q = true;
        }

        public final void setBorderRadius(float f) {
            this.f15532n = f * getResources().getDisplayMetrics().density;
            this.f15535q = true;
        }

        public final void setExclusive(boolean z) {
            this.f15533o = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0022, code lost:
            if (m25077k(r3, null, 1, null) == false) goto L15;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void setPressed(boolean r4) {
            /*
                r3 = this;
                if (r4 == 0) goto La
                boolean r0 = r3.m25075m()
                if (r0 == 0) goto La
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C5534a.f15526x = r3
            La:
                boolean r0 = r3.f15533o
                r1 = 0
                if (r0 != 0) goto L25
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C5534a.f15525w
                r2 = 1
                if (r0 == 0) goto L1a
                boolean r0 = r0.f15533o
                if (r0 != r2) goto L1a
                r0 = r2
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 != 0) goto L25
                r0 = 0
                boolean r0 = m25077k(r3, r0, r2, r0)
                if (r0 != 0) goto L25
                goto L26
            L25:
                r2 = r1
            L26:
                if (r4 == 0) goto L2e
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C5534a.f15525w
                if (r0 == r3) goto L2e
                if (r2 == 0) goto L33
            L2e:
                r3.f15538t = r4
                super.setPressed(r4)
            L33:
                if (r4 != 0) goto L3b
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r4 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C5534a.f15525w
                if (r4 != r3) goto L3b
                r3.f15538t = r1
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C5534a.setPressed(boolean):void");
        }

        public final void setRippleColor(Integer num) {
            this.f15528j = num;
            this.f15535q = true;
        }

        public final void setRippleRadius(Integer num) {
            this.f15529k = num;
            this.f15535q = true;
        }

        public final void setTouched(boolean z) {
            this.f15538t = z;
        }

        public final void setUseBorderlessDrawable(boolean z) {
            this.f15531m = z;
        }

        public final void setUseDrawableOnForeground(boolean z) {
            this.f15530l = z;
            this.f15535q = true;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$b;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5536b {
        private C5536b() {
        }

        public /* synthetic */ C5536b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<C5534a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C5534a createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        return new C5534a(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C5534a view) {
        C9612q.m13917h(view, "view");
        view.m25074n();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = "borderRadius")
    public void setBorderRadius(C5534a view, float f) {
        C9612q.m13917h(view, "view");
        view.setBorderRadius(f);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderless")
    public void setBorderless(C5534a view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setUseBorderlessDrawable(z);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.ENABLED)
    public void setEnabled(C5534a view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setEnabled(z);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "exclusive")
    public void setExclusive(C5534a view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setExclusive(z);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "foreground")
    @TargetApi(23)
    public void setForeground(C5534a view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setUseDrawableOnForeground(z);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleColor")
    public void setRippleColor(C5534a view, Integer num) {
        C9612q.m13917h(view, "view");
        view.setRippleColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleRadius")
    public void setRippleRadius(C5534a view, int i) {
        C9612q.m13917h(view, "view");
        view.setRippleRadius(Integer.valueOf(i));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(C5534a view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setSoundEffectsEnabled(!z);
    }
}