package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.OnLayoutEvent;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import com.horcrux.svg.SVGLength;
import java.util.ArrayList;
import p414x2.C13677a;

@SuppressLint({"ViewConstructor"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class VirtualView extends ReactViewGroup {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<C5241s> elements;
    private double fontSize;
    private C5223j glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    Matrix mMatrix;
    String mName;
    float mOpacity;
    Path mPath;
    PointerEvents mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private C5227l mTextRoot;
    Matrix mTransform;
    boolean mTransformInvertible;
    private SvgView svgView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.VirtualView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5196a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14572a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f14572a = iArr;
            try {
                iArr[SVGLength.UnitType.EMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14572a[SVGLength.UnitType.EXS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14572a[SVGLength.UnitType.CM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14572a[SVGLength.UnitType.MM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14572a[SVGLength.UnitType.IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14572a[SVGLength.UnitType.PT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14572a[SVGLength.UnitType.PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mTransform = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.mTransformInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = DisplayMetricsHolder.getScreenDisplayMetrics().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            }
            virtualView.clearCache();
        }
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double fontSizeFromContext;
        switch (C5196a.f14572a[sVGLength.f14535b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return sVGLength.f14534a * fontSizeFromContext * this.mScale;
    }

    private double getCanvasDiagonal() {
        double d = this.canvasDiagonal;
        if (d != -1.0d) {
            return d;
        }
        double sqrt = Math.sqrt(Math.pow(getCanvasWidth(), 2.0d) + Math.pow(getCanvasHeight(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = sqrt;
        return sqrt;
    }

    private float getCanvasHeight() {
        float f = this.canvasHeight;
        if (f != -1.0f) {
            return f;
        }
        C5227l textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.m25835d().m25855d();
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f = this.canvasWidth;
        if (f != -1.0f) {
            return f;
        }
        C5227l textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.m25835d().m25852g();
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d = this.fontSize;
        if (d != -1.0d) {
            return d;
        }
        C5227l textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.m25835d();
        }
        double m25856c = this.glyphContext.m25856c();
        this.fontSize = m25856c;
        return m25856c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearChildCache() {
        clearCache();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void draw(Canvas canvas, Paint paint, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getClientRect() {
        return this.mClientRect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5227l getParentTextRoot() {
        ViewParent parent = getParent();
        if (!(parent instanceof VirtualView)) {
            return null;
        }
        return ((VirtualView) parent).getTextRoot();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Path getPath(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            C13677a.m1854j(ReactConstants.TAG, "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5227l getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof C5227l) {
                    C5227l c5227l = (C5227l) virtualView;
                    if (c5227l.m25835d() != null) {
                        this.mTextRoot = c5227l;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                if (!(parent instanceof VirtualView)) {
                    virtualView = null;
                } else {
                    virtualView = (VirtualView) parent;
                }
            }
        }
        return this.mTextRoot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.mClientRect != null) {
            SvgView svgView = getSvgView();
            int[] iArr = new int[2];
            getSvgView().getLocationOnScreen(iArr);
            Rect rect = new Rect();
            boolean z = false;
            rect.left = iArr[0] + ((int) Math.floor(this.mClientRect.left));
            rect.top = iArr[1] + ((int) Math.floor(this.mClientRect.top));
            rect.right = rect.left + ((int) Math.ceil(this.mClientRect.width()));
            rect.bottom = rect.top + ((int) Math.ceil(this.mClientRect.height()));
            Rect rect2 = new Rect();
            if (svgView.getGlobalVisibleRect(rect2) && rect.intersect(rect2)) {
                z = true;
            }
            String canonicalName = getClass().getCanonicalName();
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setClassName(canonicalName);
            accessibilityNodeInfo.setVisibleToUser(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.mClientRect;
        if (rectF == null) {
            return;
        }
        if (!(this instanceof C5227l)) {
            setLeft((int) Math.floor(rectF.left));
            setTop((int) Math.floor(this.mClientRect.top));
            setRight((int) Math.ceil(this.mClientRect.right));
            setBottom((int) Math.ceil(this.mClientRect.bottom));
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize;
        int defaultSize2;
        RectF rectF = this.mClientRect;
        if (rectF != null) {
            defaultSize = (int) Math.ceil(rectF.width());
        } else {
            defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        }
        RectF rectF2 = this.mClientRect;
        if (rectF2 != null) {
            defaultSize2 = (int) Math.ceil(rectF2.height());
        } else {
            defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnHeight(SVGLength sVGLength) {
        double d;
        float canvasHeight;
        SVGLength.UnitType unitType = sVGLength.f14535b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d = sVGLength.f14534a;
            canvasHeight = this.mScale;
        } else if (unitType == SVGLength.UnitType.PERCENTAGE) {
            d = sVGLength.f14534a / 100.0d;
            canvasHeight = getCanvasHeight();
        } else {
            return fromRelativeFast(sVGLength);
        }
        return d * canvasHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnOther(SVGLength sVGLength) {
        double d;
        double canvasDiagonal;
        SVGLength.UnitType unitType = sVGLength.f14535b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d = sVGLength.f14534a;
            canvasDiagonal = this.mScale;
        } else if (unitType == SVGLength.UnitType.PERCENTAGE) {
            d = sVGLength.f14534a / 100.0d;
            canvasDiagonal = getCanvasDiagonal();
        } else {
            return fromRelativeFast(sVGLength);
        }
        return d * canvasDiagonal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnWidth(SVGLength sVGLength) {
        double d;
        float canvasWidth;
        SVGLength.UnitType unitType = sVGLength.f14535b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d = sVGLength.f14534a;
            canvasWidth = this.mScale;
        } else if (unitType == SVGLength.UnitType.PERCENTAGE) {
            d = sVGLength.f14534a / 100.0d;
            canvasWidth = getCanvasWidth();
        } else {
            return fromRelativeFast(sVGLength);
        }
        return d * canvasWidth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void render(Canvas canvas, Paint paint, float f) {
        draw(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restoreCanvas(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int save = canvas.save();
        this.mCTM.setConcat(this.mMatrix, this.mTransform);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return save;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 != null && rectF2.equals(rectF)) {
            return;
        }
        this.mClientRect = rectF;
        if (rectF == null) {
            return;
        }
        int ceil = (int) Math.ceil(rectF.width());
        int ceil2 = (int) Math.ceil(this.mClientRect.height());
        int floor = (int) Math.floor(this.mClientRect.left);
        int floor2 = (int) Math.floor(this.mClientRect.top);
        int ceil3 = (int) Math.ceil(this.mClientRect.right);
        int ceil4 = (int) Math.ceil(this.mClientRect.bottom);
        setMeasuredDimension(ceil, ceil2);
        if (!(this instanceof C5227l)) {
            setLeft(floor);
            setTop(floor2);
            setRight(ceil3);
            setBottom(ceil4);
        }
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.mContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(OnLayoutEvent.obtain(getId(), floor, floor2, ceil, ceil2));
        }
    }

    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    public void setClipRule(int i) {
        this.mClipRule = i;
        invalidate();
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    public void setMatrix(Dynamic dynamic) {
        setMatrix(!dynamic.isNull() && dynamic.getType().equals(ReadableType.Array) ? dynamic.asArray() : null);
    }

    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    public void setOpacity(float f) {
        this.mOpacity = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void setResponsible(boolean z) {
        this.mResponsible = z;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getClipPath(Canvas canvas, Paint paint) {
        Path mo25710e;
        if (this.mClipPath != null) {
            C5207c c5207c = (C5207c) getSvgView().getDefinedClipPath(this.mClipPath);
            if (c5207c != null) {
                if (this.mClipRule == 0) {
                    mo25710e = c5207c.getPath(canvas, paint);
                } else {
                    mo25710e = c5207c.mo25710e(canvas, paint, Region.Op.UNION);
                }
                mo25710e.transform(c5207c.mMatrix);
                mo25710e.transform(c5207c.mTransform);
                int i = this.mClipRule;
                if (i == 0) {
                    mo25710e.setFillType(Path.FillType.EVEN_ODD);
                } else if (i != 1) {
                    C13677a.m1870H(ReactConstants.TAG, "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = mo25710e;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    public void setMatrix(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int m25661c = C5250x.m25661c(readableArray, fArr, this.mScale);
            if (m25661c == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (m25661c != -1) {
                C13677a.m1870H(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }
}
