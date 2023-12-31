package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.TransformHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.horcrux.svg.VirtualView;
import java.lang.reflect.Array;
import java.util.Locale;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected ViewManagerDelegate<V> mDelegate;
    protected final SVGClass svgClass;
    private static final C5199c sMatrixDecompositionContext = new C5199c();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGMarker,
        RNSVGForeignObject
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.VirtualViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ViewGroup$OnHierarchyChangeListenerC5197a implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC5197a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.VirtualViewManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5198b {

        /* renamed from: a */
        static final /* synthetic */ int[] f14574a;

        static {
            int[] iArr = new int[SVGClass.values().length];
            f14574a = iArr;
            try {
                iArr[SVGClass.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14574a[SVGClass.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14574a[SVGClass.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14574a[SVGClass.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14574a[SVGClass.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14574a[SVGClass.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14574a[SVGClass.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14574a[SVGClass.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14574a[SVGClass.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14574a[SVGClass.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14574a[SVGClass.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14574a[SVGClass.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14574a[SVGClass.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14574a[SVGClass.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14574a[SVGClass.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14574a[SVGClass.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14574a[SVGClass.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14574a[SVGClass.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f14574a[SVGClass.RNSVGMarker.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14574a[SVGClass.RNSVGForeignObject.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.VirtualViewManager$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5199c extends MatrixMathHelper.MatrixDecompositionContext {

        /* renamed from: a */
        final double[] f14575a = new double[4];

        /* renamed from: b */
        final double[] f14576b = new double[3];

        /* renamed from: c */
        final double[] f14577c = new double[3];

        /* renamed from: d */
        final double[] f14578d = new double[3];

        /* renamed from: e */
        final double[] f14579e = new double[3];

        C5199c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.VirtualViewManager$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5200d extends LayoutShadowNode {
        C5200d() {
        }

        @ReactPropGroup(names = {ViewProps.ALIGN_SELF, ViewProps.ALIGN_ITEMS, ViewProps.COLLAPSABLE, ViewProps.FLEX, ViewProps.FLEX_BASIS, ViewProps.FLEX_DIRECTION, ViewProps.FLEX_GROW, ViewProps.FLEX_SHRINK, ViewProps.FLEX_WRAP, ViewProps.JUSTIFY_CONTENT, ViewProps.OVERFLOW, ViewProps.ALIGN_CONTENT, ViewProps.DISPLAY, ViewProps.POSITION, ViewProps.RIGHT, ViewProps.TOP, ViewProps.BOTTOM, ViewProps.LEFT, ViewProps.START, ViewProps.END, "width", "height", ViewProps.MIN_WIDTH, ViewProps.MAX_WIDTH, ViewProps.MIN_HEIGHT, ViewProps.MAX_HEIGHT, ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.BORDER_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH})
        public void ignoreLayoutProps(int i, Dynamic dynamic) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    private static void decomposeMatrix() {
        C5199c c5199c = sMatrixDecompositionContext;
        double[] dArr = c5199c.f14575a;
        double[] dArr2 = c5199c.f14576b;
        double[] dArr3 = c5199c.f14577c;
        double[] dArr4 = c5199c.f14578d;
        double[] dArr5 = c5199c.f14579e;
        if (isZero(sTransformDecompositionArray[15])) {
            return;
        }
        double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, 4, 4);
        double[] dArr7 = new double[16];
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                double[] dArr8 = sTransformDecompositionArray;
                int i3 = (i * 4) + i2;
                double d = dArr8[i3] / dArr8[15];
                dArr6[i][i2] = d;
                if (i2 == 3) {
                    d = 0.0d;
                }
                dArr7[i3] = d;
            }
        }
        dArr7[15] = 1.0d;
        if (isZero(MatrixMathHelper.determinant(dArr7))) {
            return;
        }
        if (isZero(dArr6[0][3]) && isZero(dArr6[1][3]) && isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            MatrixMathHelper.multiplyVectorByMatrix(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, MatrixMathHelper.transpose(MatrixMathHelper.inverse(dArr7)), dArr);
        }
        System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
        double[][] dArr9 = (double[][]) Array.newInstance(Double.TYPE, 3, 3);
        for (int i4 = 0; i4 < 3; i4++) {
            double[] dArr10 = dArr9[i4];
            double[] dArr11 = dArr6[i4];
            dArr10[0] = dArr11[0];
            dArr10[1] = dArr11[1];
            dArr10[2] = dArr11[2];
        }
        double v3Length = MatrixMathHelper.v3Length(dArr9[0]);
        dArr2[0] = v3Length;
        double[] v3Normalize = MatrixMathHelper.v3Normalize(dArr9[0], v3Length);
        dArr9[0] = v3Normalize;
        double v3Dot = MatrixMathHelper.v3Dot(v3Normalize, dArr9[1]);
        dArr3[0] = v3Dot;
        double[] v3Combine = MatrixMathHelper.v3Combine(dArr9[1], dArr9[0], 1.0d, -v3Dot);
        dArr9[1] = v3Combine;
        double v3Dot2 = MatrixMathHelper.v3Dot(dArr9[0], v3Combine);
        dArr3[0] = v3Dot2;
        double[] v3Combine2 = MatrixMathHelper.v3Combine(dArr9[1], dArr9[0], 1.0d, -v3Dot2);
        dArr9[1] = v3Combine2;
        double v3Length2 = MatrixMathHelper.v3Length(v3Combine2);
        dArr2[1] = v3Length2;
        dArr9[1] = MatrixMathHelper.v3Normalize(dArr9[1], v3Length2);
        dArr3[0] = dArr3[0] / dArr2[1];
        double v3Dot3 = MatrixMathHelper.v3Dot(dArr9[0], dArr9[2]);
        dArr3[1] = v3Dot3;
        double[] v3Combine3 = MatrixMathHelper.v3Combine(dArr9[2], dArr9[0], 1.0d, -v3Dot3);
        dArr9[2] = v3Combine3;
        double v3Dot4 = MatrixMathHelper.v3Dot(dArr9[1], v3Combine3);
        dArr3[2] = v3Dot4;
        double[] v3Combine4 = MatrixMathHelper.v3Combine(dArr9[2], dArr9[1], 1.0d, -v3Dot4);
        dArr9[2] = v3Combine4;
        double v3Length3 = MatrixMathHelper.v3Length(v3Combine4);
        dArr2[2] = v3Length3;
        double[] v3Normalize2 = MatrixMathHelper.v3Normalize(dArr9[2], v3Length3);
        dArr9[2] = v3Normalize2;
        double d2 = dArr3[1];
        double d3 = dArr2[2];
        dArr3[1] = d2 / d3;
        dArr3[2] = dArr3[2] / d3;
        if (MatrixMathHelper.v3Dot(dArr9[0], MatrixMathHelper.v3Cross(dArr9[1], v3Normalize2)) < 0.0d) {
            for (int i5 = 0; i5 < 3; i5++) {
                dArr2[i5] = dArr2[i5] * (-1.0d);
                double[] dArr12 = dArr9[i5];
                dArr12[0] = dArr12[0] * (-1.0d);
                dArr12[1] = dArr12[1] * (-1.0d);
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        double[] dArr13 = dArr9[2];
        dArr5[0] = MatrixMathHelper.roundTo3Places((-Math.atan2(dArr13[1], dArr13[2])) * 57.29577951308232d);
        double[] dArr14 = dArr9[2];
        double d4 = dArr14[1];
        double d5 = dArr14[2];
        dArr5[1] = MatrixMathHelper.roundTo3Places((-Math.atan2(-dArr14[0], Math.sqrt((d4 * d4) + (d5 * d5)))) * 57.29577951308232d);
        dArr5[2] = MatrixMathHelper.roundTo3Places((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RenderableView getRenderableViewByTag(int i) {
        return mTagToRenderableView.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(V v) {
        SvgView svgView = v.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v instanceof C5244t0) {
            ((C5244t0) v).m25703q().clearChildCache();
        }
    }

    private static boolean isZero(double d) {
        return !Double.isNaN(d) && Math.abs(d) < EPSILON;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setRenderableView(int i, RenderableView renderableView) {
        mTagToRenderableView.put(i, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        TransformHelper.processTransform(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        C5199c c5199c = sMatrixDecompositionContext;
        view.setTranslationX(PixelUtil.toPixelFromDIP((float) c5199c.f14578d[0]));
        view.setTranslationY(PixelUtil.toPixelFromDIP((float) c5199c.f14578d[1]));
        view.setRotation((float) c5199c.f14579e[2]);
        view.setRotationX((float) c5199c.f14579e[0]);
        view.setRotationY((float) c5199c.f14579e[1]);
        view.setScaleX((float) c5199c.f14576b[0]);
        view.setScaleY((float) c5199c.f14576b[1]);
        double[] dArr = c5199c.f14575a;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            view.setCameraDistance(f3 * f3 * f2 * 5.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return C5200d.class;
    }

    @ReactProp(name = "clipPath")
    public void setClipPath(V v, String str) {
        v.setClipPath(str);
    }

    @ReactProp(name = "clipRule")
    public void setClipRule(V v, int i) {
        v.setClipRule(i);
    }

    @ReactProp(name = ViewProps.DISPLAY)
    public void setDisplay(V v, String str) {
        v.setDisplay(str);
    }

    @ReactProp(name = "markerEnd")
    public void setMarkerEnd(V v, String str) {
        v.setMarkerEnd(str);
    }

    @ReactProp(name = "markerMid")
    public void setMarkerMid(V v, String str) {
        v.setMarkerMid(str);
    }

    @ReactProp(name = "markerStart")
    public void setMarkerStart(V v, String str) {
        v.setMarkerStart(str);
    }

    @ReactProp(name = "mask")
    public void setMask(V v, String str) {
        v.setMask(str);
    }

    @ReactProp(name = "matrix")
    public void setMatrix(V v, Dynamic dynamic) {
        v.setMatrix(dynamic);
    }

    @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
    public void setName(V v, String str) {
        v.setName(str);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(V v, float f) {
        v.setOpacity(f);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(V v, String str) {
        if (str == null) {
            v.setPointerEvents(PointerEvents.AUTO);
        } else {
            v.setPointerEvents(PointerEvents.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @ReactProp(name = "responsible")
    public void setResponsible(V v, boolean z) {
        v.setResponsible(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, VirtualView virtualView) {
        super.addEventEmitters(themedReactContext, (ThemedReactContext) virtualView);
        virtualView.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC5197a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new C5200d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(ThemedReactContext themedReactContext) {
        switch (C5198b.f14574a[this.svgClass.ordinal()]) {
            case 1:
                return new C5227l(themedReactContext);
            case 2:
                return new C5245u(themedReactContext);
            case 3:
                return new C5205b(themedReactContext);
            case 4:
                return new C5215g(themedReactContext);
            case 5:
                return new C5232n(themedReactContext);
            case 6:
                return new C5206b0(themedReactContext);
            case 7:
                return new C5244t0(themedReactContext);
            case 8:
                return new C5216g0(themedReactContext);
            case 9:
                return new C5220h0(themedReactContext);
            case 10:
                return new C5229m(themedReactContext);
            case 11:
                return new C5207c(themedReactContext);
            case 12:
                return new C5211e(themedReactContext);
            case 13:
                return new C5246u0(themedReactContext);
            case 14:
                return new C5210d0(themedReactContext);
            case 15:
                return new C5234o(themedReactContext);
            case 16:
                return new C5204a0(themedReactContext);
            case 17:
                return new C5247v(themedReactContext);
            case 18:
                return new C5238q(themedReactContext);
            case 19:
                return new C5236p(themedReactContext);
            case 20:
                return new C5221i(themedReactContext);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction((VirtualViewManager<V>) virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance((VirtualViewManager<V>) virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v, ReadableArray readableArray) {
        v.setMatrix(readableArray);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, readableArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }

    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(V v, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v, dynamic.asArray());
    }
}
