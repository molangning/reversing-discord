package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.yoga.C4340d;
import java.util.Map;
import p414x2.C13677a;

@ReactModule(name = "RCTView")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactViewManager extends ReactClippingViewManager<ReactViewGroup> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    @VisibleForTesting
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    /* renamed from: com.facebook.react.views.view.ReactViewManager$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C42922 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReactViewManager() {
        setupViewRecycling();
    }

    private void handleHotspotUpdate(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 2) {
            reactViewGroup.drawableHotspotChanged(PixelUtil.toPixelFromDIP(readableArray.getDouble(0)), PixelUtil.toPixelFromDIP(readableArray.getDouble(1)));
            return;
        }
        throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
    }

    private void handleSetPressed(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 1) {
            reactViewGroup.setPressed(readableArray.getBoolean(0));
            return;
        }
        throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m30469of(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTView";
    }

    @ReactProp(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusDownId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusForwardId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusLeftId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusRightId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusUpId(i);
    }

    @ReactProp(name = "accessible")
    public void setAccessible(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setFocusable(z);
    }

    @ReactProp(name = "backfaceVisibility")
    public void setBackfaceVisibility(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setBackfaceVisibility(str);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR, ViewProps.BORDER_START_COLOR, ViewProps.BORDER_END_COLOR, ViewProps.BORDER_BLOCK_COLOR, ViewProps.BORDER_BLOCK_END_COLOR, ViewProps.BORDER_BLOCK_START_COLOR})
    public void setBorderColor(ReactViewGroup reactViewGroup, int i, Integer num) {
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
        reactViewGroup.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS, ViewProps.BORDER_TOP_START_RADIUS, ViewProps.BORDER_TOP_END_RADIUS, ViewProps.BORDER_BOTTOM_START_RADIUS, ViewProps.BORDER_BOTTOM_END_RADIUS, ViewProps.BORDER_END_END_RADIUS, ViewProps.BORDER_END_START_RADIUS, ViewProps.BORDER_START_END_RADIUS, ViewProps.BORDER_START_START_RADIUS})
    public void setBorderRadius(ReactViewGroup reactViewGroup, int i, float f) {
        if (!C4340d.m29971a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!C4340d.m29971a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactViewGroup.setBorderRadius(f);
        } else {
            reactViewGroup.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH})
    public void setBorderWidth(ReactViewGroup reactViewGroup, int i, float f) {
        if (!C4340d.m29971a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!C4340d.m29971a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        reactViewGroup.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactProp(name = ViewProps.COLLAPSABLE)
    public void setCollapsable(ReactViewGroup reactViewGroup, boolean z) {
    }

    @ReactProp(name = "focusable")
    public void setFocusable(final ReactViewGroup reactViewGroup, boolean z) {
        if (z) {
            reactViewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.views.view.ReactViewManager.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) reactViewGroup.getContext(), reactViewGroup.getId());
                    if (eventDispatcherForReactTag == null) {
                        return;
                    }
                    eventDispatcherForReactTag.dispatchEvent(new ViewGroupClickEvent(UIManagerHelper.getSurfaceId(reactViewGroup.getContext()), reactViewGroup.getId()));
                }
            });
            reactViewGroup.setFocusable(true);
            return;
        }
        reactViewGroup.setOnClickListener(null);
        reactViewGroup.setClickable(false);
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(ReactViewGroup reactViewGroup, Dynamic dynamic) {
        int i;
        int i2;
        int i3;
        int i4 = C42922.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    C13677a.m1870H(ReactConstants.TAG, "Invalid type for 'hitSlop' value " + dynamic.getType());
                }
                reactViewGroup.setHitSlopRect(null);
                return;
            }
            int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(dynamic.asDouble());
            reactViewGroup.setHitSlopRect(new Rect(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP));
            return;
        }
        ReadableMap asMap = dynamic.asMap();
        int i5 = 0;
        if (asMap.hasKey(ViewProps.LEFT)) {
            i = (int) PixelUtil.toPixelFromDIP(asMap.getDouble(ViewProps.LEFT));
        } else {
            i = 0;
        }
        if (asMap.hasKey(ViewProps.TOP)) {
            i2 = (int) PixelUtil.toPixelFromDIP(asMap.getDouble(ViewProps.TOP));
        } else {
            i2 = 0;
        }
        if (asMap.hasKey(ViewProps.RIGHT)) {
            i3 = (int) PixelUtil.toPixelFromDIP(asMap.getDouble(ViewProps.RIGHT));
        } else {
            i3 = 0;
        }
        if (asMap.hasKey(ViewProps.BOTTOM)) {
            i5 = (int) PixelUtil.toPixelFromDIP(asMap.getDouble(ViewProps.BOTTOM));
        }
        reactViewGroup.setHitSlopRect(new Rect(i, i2, i3, i5));
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public void setNativeBackground(ReactViewGroup reactViewGroup, ReadableMap readableMap) {
        Drawable createDrawableFromJSDescription;
        if (readableMap == null) {
            createDrawableFromJSDescription = null;
        } else {
            createDrawableFromJSDescription = ReactDrawableHelper.createDrawableFromJSDescription(reactViewGroup.getContext(), readableMap);
        }
        reactViewGroup.setTranslucentBackgroundDrawable(createDrawableFromJSDescription);
    }

    @ReactProp(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(ReactViewGroup reactViewGroup, ReadableMap readableMap) {
        Drawable createDrawableFromJSDescription;
        if (readableMap == null) {
            createDrawableFromJSDescription = null;
        } else {
            createDrawableFromJSDescription = ReactDrawableHelper.createDrawableFromJSDescription(reactViewGroup.getContext(), readableMap);
        }
        reactViewGroup.setForeground(createDrawableFromJSDescription);
    }

    @ReactProp(name = ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING)
    public void setNeedsOffscreenAlphaCompositing(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setNeedsOffscreenAlphaCompositing(z);
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setOverflow(str);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setPointerEvents(PointerEvents.parsePointerEvents(str));
    }

    @ReactProp(name = "preventClipping")
    public void setPreventClipping(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setPreventClipping(z);
    }

    @ReactProp(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(ReactViewGroup reactViewGroup, boolean z) {
        if (z) {
            reactViewGroup.setFocusable(true);
            reactViewGroup.setFocusableInTouchMode(true);
            reactViewGroup.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactViewGroup(themedReactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup prepareToRecycleView(ThemedReactContext themedReactContext, ReactViewGroup reactViewGroup) {
        super.prepareToRecycleView(themedReactContext, (ThemedReactContext) reactViewGroup);
        reactViewGroup.recycleView();
        return reactViewGroup;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setOpacity(ReactViewGroup reactViewGroup, float f) {
        reactViewGroup.setOpacityIfPossible(f);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setTransform(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        super.setTransform((ReactViewManager) reactViewGroup, readableArray);
        reactViewGroup.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewGroup reactViewGroup, int i, ReadableArray readableArray) {
        if (i == 1) {
            handleHotspotUpdate(reactViewGroup, readableArray);
        } else if (i != 2) {
        } else {
            handleSetPressed(reactViewGroup, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewGroup reactViewGroup, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setPressed")) {
            handleSetPressed(reactViewGroup, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(reactViewGroup, readableArray);
        }
    }
}
