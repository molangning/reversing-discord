package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.C1365w0;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.scroll.MaintainVisibleScrollPositionHelper;
import com.facebook.react.views.scroll.ReactScrollViewCommandHelper;
import com.facebook.yoga.C4340d;
import java.util.ArrayList;

@ReactModule(name = ReactHorizontalScrollViewManager.REACT_CLASS)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<ReactHorizontalScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactHorizontalScrollView> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private FpsListener mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public void setBorderColor(ReactHorizontalScrollView reactHorizontalScrollView, int i, Integer num) {
        float intValue;
        float f = Float.NaN;
        if (num == null) {
            intValue = Float.NaN;
        } else {
            intValue = num.intValue() & 16777215;
        }
        if (num != null) {
            f = num.intValue() >>> 24;
        }
        reactHorizontalScrollView.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(ReactHorizontalScrollView reactHorizontalScrollView, int i, float f) {
        if (!C4340d.m29971a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactHorizontalScrollView.setBorderRadius(f);
        } else {
            reactHorizontalScrollView.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public void setBorderWidth(ReactHorizontalScrollView reactHorizontalScrollView, int i, float f) {
        if (!C4340d.m29971a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        reactHorizontalScrollView.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ReactHorizontalScrollView reactHorizontalScrollView, int i) {
        reactHorizontalScrollView.setEndFillColor(i);
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(ReactHorizontalScrollView reactHorizontalScrollView, ReadableMap readableMap) {
        double d;
        if (readableMap != null) {
            double d2 = 0.0d;
            if (readableMap.hasKey("x")) {
                d = readableMap.getDouble("x");
            } else {
                d = 0.0d;
            }
            if (readableMap.hasKey("y")) {
                d2 = readableMap.getDouble("y");
            }
            reactHorizontalScrollView.scrollTo((int) PixelUtil.toPixelFromDIP(d), (int) PixelUtil.toPixelFromDIP(d2));
            return;
        }
        reactHorizontalScrollView.scrollTo(0, 0);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(ReactHorizontalScrollView reactHorizontalScrollView, float f) {
        reactHorizontalScrollView.setDecelerationRate(f);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setDisableIntervalMomentum(z);
    }

    @ReactProp(name = "fadingEdgeLength")
    public void setFadingEdgeLength(ReactHorizontalScrollView reactHorizontalScrollView, int i) {
        if (i > 0) {
            reactHorizontalScrollView.setHorizontalFadingEdgeEnabled(true);
            reactHorizontalScrollView.setFadingEdgeLength(i);
            return;
        }
        reactHorizontalScrollView.setHorizontalFadingEdgeEnabled(false);
        reactHorizontalScrollView.setFadingEdgeLength(0);
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(ReactHorizontalScrollView reactHorizontalScrollView, ReadableMap readableMap) {
        if (readableMap != null) {
            reactHorizontalScrollView.setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config.fromReadableMap(readableMap));
        } else {
            reactHorizontalScrollView.setMaintainVisibleContentPosition(null);
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        C1365w0.m37255C0(reactHorizontalScrollView, z);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(str));
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setPagingEnabled(z);
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setPointerEvents(PointerEvents.parsePointerEvents(str));
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public void setRemoveClippedSubviews(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setRemoveClippedSubviews(z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setScrollEnabled(z);
    }

    @ReactProp(name = "scrollEventThrottle")
    public void setScrollEventThrottle(ReactHorizontalScrollView reactHorizontalScrollView, int i) {
        reactHorizontalScrollView.setScrollEventThrottle(i);
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setScrollPerfTag(str);
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setSendMomentumEvents(z);
    }

    @ReactProp(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setHorizontalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToAlignment")
    public void setSnapToAlignment(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setSnapToAlignment(ReactScrollViewHelper.parseSnapToAlignment(str));
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setSnapToEnd(z);
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(ReactHorizontalScrollView reactHorizontalScrollView, float f) {
        reactHorizontalScrollView.setSnapInterval((int) (f * PixelUtil.getDisplayMetricDensity()));
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(ReactHorizontalScrollView reactHorizontalScrollView, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() != 0) {
            float displayMetricDensity = PixelUtil.getDisplayMetricDensity();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * displayMetricDensity)));
            }
            reactHorizontalScrollView.setSnapOffsets(arrayList);
            return;
        }
        reactHorizontalScrollView.setSnapOffsets(null);
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setSnapToStart(z);
    }

    public ReactHorizontalScrollViewManager(FpsListener fpsListener) {
        this.mFpsListener = fpsListener;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactHorizontalScrollView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactHorizontalScrollView(themedReactContext, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void flashScrollIndicators(ReactHorizontalScrollView reactHorizontalScrollView) {
        reactHorizontalScrollView.flashScrollIndicators();
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollTo(ReactHorizontalScrollView reactHorizontalScrollView, ReactScrollViewCommandHelper.ScrollToCommandData scrollToCommandData) {
        if (scrollToCommandData.mAnimated) {
            reactHorizontalScrollView.reactSmoothScrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        } else {
            reactHorizontalScrollView.scrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollToEnd(ReactHorizontalScrollView reactHorizontalScrollView, ReactScrollViewCommandHelper.ScrollToEndCommandData scrollToEndCommandData) {
        View childAt = reactHorizontalScrollView.getChildAt(0);
        if (childAt != null) {
            int width = childAt.getWidth() + reactHorizontalScrollView.getPaddingRight();
            if (scrollToEndCommandData.mAnimated) {
                reactHorizontalScrollView.reactSmoothScrollTo(width, reactHorizontalScrollView.getScrollY());
                return;
            } else {
                reactHorizontalScrollView.scrollTo(width, reactHorizontalScrollView.getScrollY());
                return;
            }
        }
        throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactHorizontalScrollView reactHorizontalScrollView, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        reactHorizontalScrollView.getFabricViewStateManager().setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactHorizontalScrollView reactHorizontalScrollView, int i, ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactHorizontalScrollView, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactHorizontalScrollView reactHorizontalScrollView, String str, ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactHorizontalScrollView, str, readableArray);
    }
}