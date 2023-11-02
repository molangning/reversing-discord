package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.views.view.ReactViewGroup;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SvgView extends ReactViewGroup implements ReactCompoundView, ReactCompoundViewGroup {
    private String mAlign;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private final Map<String, C5201a> mDefinedBrushes;
    private final Map<String, VirtualView> mDefinedClipPaths;
    private final Map<String, VirtualView> mDefinedMarkers;
    private final Map<String, VirtualView> mDefinedMasks;
    private final Map<String, VirtualView> mDefinedTemplates;
    final Matrix mInvViewBoxMatrix;
    private boolean mInvertible;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private boolean mRemovalTransitionStarted;
    private boolean mRendered;
    private boolean mResponsible;
    private final float mScale;
    int mTintColor;
    private float mVbHeight;
    private float mVbWidth;
    private SVGLength mbbHeight;
    private SVGLength mbbWidth;
    private Runnable toDataUrlTask;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum Events {
        EVENT_DATA_URL("onDataURL");
        
        private final String mName;

        Events(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public SvgView(ReactContext reactContext) {
        super(reactContext);
        this.toDataUrlTask = null;
        this.mResponsible = false;
        this.mDefinedClipPaths = new HashMap();
        this.mDefinedTemplates = new HashMap();
        this.mDefinedMarkers = new HashMap();
        this.mDefinedMasks = new HashMap();
        this.mDefinedBrushes = new HashMap();
        this.mInvViewBoxMatrix = new Matrix();
        this.mInvertible = true;
        this.mRendered = false;
        this.mTintColor = 0;
        this.mScale = DisplayMetricsHolder.getScreenDisplayMetrics().density;
        setWillNotDraw(false);
    }

    private void clearChildCache() {
        if (!this.mRendered) {
            return;
        }
        this.mRendered = false;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    private Bitmap drawOutput() {
        boolean z = true;
        this.mRendered = true;
        float width = getWidth();
        float height = getHeight();
        if (!Float.isNaN(width) && !Float.isNaN(height) && width >= 1.0f && height >= 1.0f && Math.log10(width) + Math.log10(height) <= 42.0d) {
            z = false;
        }
        if (z) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        drawChildren(new Canvas(createBitmap));
        return createBitmap;
    }

    private RectF getViewBox() {
        float f = this.mMinX;
        float f2 = this.mScale;
        float f3 = this.mMinY;
        return new RectF(f * f2, f3 * f2, (f + this.mVbWidth) * f2, (f3 + this.mVbHeight) * f2);
    }

    private int hitTest(float f, float f2) {
        if (this.mResponsible && this.mInvertible) {
            float[] fArr = {f, f2};
            this.mInvViewBoxMatrix.mapPoints(fArr);
            int i = -1;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    i = ((VirtualView) childAt).hitTest(fArr);
                } else if (childAt instanceof SvgView) {
                    i = ((SvgView) childAt).hitTest(f, f2);
                }
                if (i != -1) {
                    break;
                }
            }
            if (i == -1) {
                return getId();
            }
            return i;
        }
        return getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineBrush(C5201a c5201a, String str) {
        this.mDefinedBrushes.put(str, c5201a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineClipPath(VirtualView virtualView, String str) {
        this.mDefinedClipPaths.put(str, virtualView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineMarker(VirtualView virtualView, String str) {
        this.mDefinedMarkers.put(str, virtualView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineMask(VirtualView virtualView, String str) {
        this.mDefinedMasks.put(str, virtualView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineTemplate(VirtualView virtualView, String str) {
        this.mDefinedTemplates.put(str, virtualView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void drawChildren(Canvas canvas) {
        this.mRendered = true;
        this.mCanvas = canvas;
        Matrix matrix = new Matrix();
        if (this.mAlign != null) {
            RectF viewBox = getViewBox();
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            boolean z = getParent() instanceof VirtualView;
            if (z) {
                width = (float) C5250x.m25663a(this.mbbWidth, width, 0.0d, this.mScale, 12.0d);
                height = (float) C5250x.m25663a(this.mbbHeight, height, 0.0d, this.mScale, 12.0d);
            }
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            if (z) {
                canvas.clipRect(rectF);
            }
            matrix = C5248v0.m25664a(viewBox, rectF, this.mAlign, this.mMeetOrSlice);
            this.mInvertible = matrix.invert(this.mInvViewBoxMatrix);
            canvas.concat(matrix);
        }
        Paint paint = new Paint();
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            if (childAt2 instanceof VirtualView) {
                VirtualView virtualView = (VirtualView) childAt2;
                int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, matrix);
                virtualView.render(canvas, paint, 1.0f);
                virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                if (virtualView.isResponsible() && !this.mResponsible) {
                    this.mResponsible = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void enableTouchEvents() {
        if (!this.mResponsible) {
            this.mResponsible = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect getCanvasBounds() {
        return this.mCanvas.getClipBounds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5201a getDefinedBrush(String str) {
        return this.mDefinedBrushes.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView getDefinedClipPath(String str) {
        return this.mDefinedClipPaths.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView getDefinedMarker(String str) {
        return this.mDefinedMarkers.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView getDefinedMask(String str) {
        return this.mDefinedMasks.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView getDefinedTemplate(String str) {
        return this.mDefinedTemplates.get(str);
    }

    @Override // com.facebook.react.uimanager.ReactCompoundViewGroup
    public boolean interceptsTouchEvent(float f, float f2) {
        return true;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            if (!this.mRendered) {
                return;
            }
            this.mRendered = false;
            ((VirtualView) parent).getSvgView().invalidate();
        } else if (!this.mRemovalTransitionStarted) {
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mBitmap = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isResponsible() {
        return this.mResponsible;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean notRendered() {
        return !this.mRendered;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mBitmap = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (getParent() instanceof VirtualView) {
            return;
        }
        super.onDraw(canvas);
        if (this.mBitmap == null) {
            this.mBitmap = drawOutput();
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            Runnable runnable = this.toDataUrlTask;
            if (runnable != null) {
                runnable.run();
                this.toDataUrlTask = null;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(getGlobalVisibleRect(new Rect()));
        accessibilityNodeInfo.setClassName(getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float f, float f2) {
        return hitTest(f, f2);
    }

    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
        clearChildCache();
    }

    public void setBbHeight(Dynamic dynamic) {
        this.mbbHeight = SVGLength.m25998c(dynamic);
        invalidate();
        clearChildCache();
    }

    public void setBbWidth(Dynamic dynamic) {
        this.mbbWidth = SVGLength.m25998c(dynamic);
        invalidate();
        clearChildCache();
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        SvgViewManager.setSvgView(i, this);
    }

    public void setMeetOrSlice(int i) {
        this.mMeetOrSlice = i;
        invalidate();
        clearChildCache();
    }

    public void setMinX(float f) {
        this.mMinX = f;
        invalidate();
        clearChildCache();
    }

    public void setMinY(float f) {
        this.mMinY = f;
        invalidate();
        clearChildCache();
    }

    public void setTintColor(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.mTintColor = i;
        invalidate();
        clearChildCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setToDataUrlTask(Runnable runnable) {
        this.toDataUrlTask = runnable;
    }

    public void setVbHeight(float f) {
        this.mVbHeight = f;
        invalidate();
        clearChildCache();
    }

    public void setVbWidth(float f) {
        this.mVbWidth = f;
        invalidate();
        clearChildCache();
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        this.mRemovalTransitionStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toDataURL() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(createBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public void setBbHeight(String str) {
        this.mbbHeight = SVGLength.m25996e(str);
        invalidate();
        clearChildCache();
    }

    public void setBbWidth(String str) {
        this.mbbWidth = SVGLength.m25996e(str);
        invalidate();
        clearChildCache();
    }

    public void setBbHeight(Double d) {
        this.mbbHeight = SVGLength.m25997d(d);
        invalidate();
        clearChildCache();
    }

    public void setBbWidth(Double d) {
        this.mbbWidth = SVGLength.m25997d(d);
        invalidate();
        clearChildCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toDataURL(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(createBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }
}
