package com.horcrux.svg;

import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class SvgViewManager extends ReactViewManager implements RNSVGSvgViewAndroidManagerInterface<SvgView> {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final ViewManagerDelegate<SvgView> mDelegate = new RNSVGSvgViewAndroidManagerDelegate(this);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SvgView getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSvgView(int i, SvgView svgView) {
        mTagToSvgView.put(i, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new SvgView(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactViewGroup reactViewGroup) {
        super.onDropViewInstance((SvgViewManager) reactViewGroup);
        mTagToSvgView.remove(reactViewGroup.getId());
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setAccessible(SvgView svgView, boolean z) {
        super.setAccessible((ReactViewGroup) svgView, z);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((ReactViewGroup) svgView, str);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomEndRadius(SvgView svgView, float f) {
        super.setBorderRadius(svgView, 8, f);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomLeftRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 4, (float) d);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomRightRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 3, (float) d);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomStartRadius(SvgView svgView, float f) {
        super.setBorderRadius(svgView, 7, f);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 0, (float) d);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((ReactViewGroup) svgView, str);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopEndRadius(SvgView svgView, float f) {
        super.setBorderRadius(svgView, 6, f);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopLeftRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 1, (float) d);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopRightRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 2, (float) d);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopStartRadius(SvgView svgView, float f) {
        super.setBorderRadius(svgView, 5, f);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setFocusable(SvgView svgView, boolean z) {
        super.setFocusable((ReactViewGroup) svgView, z);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setHasTVPreferredFocus(SvgView svgView, boolean z) {
        super.setTVPreferredFocus(svgView, z);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setHitSlop(SvgView svgView, ReadableMap readableMap) {
        if (readableMap != null) {
            svgView.setHitSlopRect(new Rect(readableMap.hasKey(ViewProps.LEFT) ? (int) PixelUtil.toPixelFromDIP(readableMap.getDouble(ViewProps.LEFT)) : 0, readableMap.hasKey(ViewProps.TOP) ? (int) PixelUtil.toPixelFromDIP(readableMap.getDouble(ViewProps.TOP)) : 0, readableMap.hasKey(ViewProps.RIGHT) ? (int) PixelUtil.toPixelFromDIP(readableMap.getDouble(ViewProps.RIGHT)) : 0, readableMap.hasKey(ViewProps.BOTTOM) ? (int) PixelUtil.toPixelFromDIP(readableMap.getDouble(ViewProps.BOTTOM)) : 0));
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i) {
        svgView.setMeetOrSlice(i);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "minX")
    public void setMinX(SvgView svgView, float f) {
        svgView.setMinX(f);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "minY")
    public void setMinY(SvgView svgView, float f) {
        svgView.setMinY(f);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z) {
        super.setNeedsOffscreenAlphaCompositing((ReactViewGroup) svgView, z);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusDown(SvgView svgView, int i) {
        super.nextFocusDown(svgView, i);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusForward(SvgView svgView, int i) {
        super.nextFocusForward(svgView, i);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusLeft(SvgView svgView, int i) {
        super.nextFocusLeft(svgView, i);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusRight(SvgView svgView, int i) {
        super.nextFocusRight(svgView, i);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusUp(SvgView svgView, int i) {
        super.nextFocusUp(svgView, i);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(SvgView svgView, String str) {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", PointerEvents.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, PointerEvents.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setRemoveClippedSubviews(SvgView svgView, boolean z) {
        super.setRemoveClippedSubviews((SvgViewManager) svgView, z);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f) {
        svgView.setVbHeight(f);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f) {
        svgView.setVbWidth(f);
    }

    @ReactProp(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @ReactProp(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(ReactViewGroup reactViewGroup, Object obj) {
        super.updateExtraData((SvgViewManager) reactViewGroup, obj);
        reactViewGroup.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBbHeight(SvgView svgView, String str) {
        svgView.setBbHeight(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBbWidth(SvgView svgView, String str) {
        svgView.setBbWidth(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBbHeight(SvgView svgView, Double d) {
        svgView.setBbHeight(d);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBbWidth(SvgView svgView, Double d) {
        svgView.setBbWidth(d);
    }
}
