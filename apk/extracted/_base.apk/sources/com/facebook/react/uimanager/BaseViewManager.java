package com.facebook.react.uimanager;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C1365w0;
import com.facebook.react.C3893R;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> implements BaseViewManagerInterface<T> {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    public static final Map<String, Integer> sStateDescription;
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static double[] sTransformDecompositionArray = new double[16];

    static {
        HashMap hashMap = new HashMap();
        sStateDescription = hashMap;
        hashMap.put(STATE_BUSY, Integer.valueOf(C3893R.string.state_busy_description));
        hashMap.put(STATE_EXPANDED, Integer.valueOf(C3893R.string.state_expanded_description));
        hashMap.put("collapsed", Integer.valueOf(C3893R.string.state_collapsed_description));
    }

    private void logUnsupportedPropertyWarning(String str) {
        C13677a.m1868J(ReactConstants.TAG, "%s doesn't support property '%s'", getName(), str);
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(PixelUtil.toPixelFromDIP((float) CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setTranslationY(PixelUtil.toPixelFromDIP((float) CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    private static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        throw new IllegalStateException("Invalid float property value: " + f);
    }

    private static void setPointerEventsFlag(View view, PointerEventHelper.EVENT event, boolean z) {
        int i;
        int i2;
        int i3 = C3893R.C3895id.pointer_events;
        Integer num = (Integer) view.getTag(i3);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int ordinal = 1 << event.ordinal();
        if (z) {
            i2 = ordinal | i;
        } else {
            i2 = (~ordinal) & i;
        }
        view.setTag(i3, Integer.valueOf(i2));
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        sMatrixDecompositionContext.reset();
        TransformHelper.processTransform(readableArray, sTransformDecompositionArray);
        MatrixMathHelper.decomposeMatrix(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.translation[0])));
        view.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.translation[1])));
        view.setRotation(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.rotationDegrees[2]));
        view.setRotationX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.rotationDegrees[0]));
        view.setRotationY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.rotationDegrees[1]));
        view.setScaleX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.scale[0]));
        view.setScaleY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.scale[1]));
        double[] dArr = sMatrixDecompositionContext.perspective;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            view.setCameraDistance(sanitizeFloatPropertyValue(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    private void updateViewAccessibility(T t) {
        ReactAccessibilityDelegate.setDelegate(t, t.isFocusable(), t.getImportantForAccessibility());
    }

    private void updateViewContentDescription(T t) {
        Dynamic dynamic;
        String str = (String) t.getTag(C3893R.C3895id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t.getTag(C3893R.C3895id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t.getTag(C3893R.C3895id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t.getContext().getString(C3893R.string.state_mixed_description));
                } else if (nextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t.getContext().getString(C3893R.string.state_busy_description));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.size() > 0) {
            t.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        MapBuilder.Builder put = MapBuilder.builder().put(PointerEventHelper.POINTER_CANCEL, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).put(PointerEventHelper.POINTER_DOWN, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(put.put(PointerEventHelper.POINTER_ENTER, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30468of("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).put(PointerEventHelper.POINTER_LEAVE, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30468of("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).put(PointerEventHelper.POINTER_MOVE, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).put(PointerEventHelper.POINTER_UP, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).put(PointerEventHelper.POINTER_OUT, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).put(PointerEventHelper.POINTER_OVER, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT, MapBuilder.m30470of("registrationName", "onAccessibilityAction")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public T prepareToRecycleView(ThemedReactContext themedReactContext, T t) {
        t.setTag(null);
        t.setTag(C3893R.C3895id.pointer_events, null);
        t.setTag(C3893R.C3895id.react_test_id, null);
        t.setTag(C3893R.C3895id.view_tag_native_id, null);
        t.setTag(C3893R.C3895id.labelled_by, null);
        t.setTag(C3893R.C3895id.accessibility_label, null);
        t.setTag(C3893R.C3895id.accessibility_hint, null);
        t.setTag(C3893R.C3895id.accessibility_role, null);
        t.setTag(C3893R.C3895id.accessibility_state, null);
        t.setTag(C3893R.C3895id.accessibility_actions, null);
        t.setTag(C3893R.C3895id.accessibility_value, null);
        t.setTag(C3893R.C3895id.accessibility_state_expanded, null);
        setTransform(t, null);
        t.resetPivot();
        t.setTop(0);
        t.setBottom(0);
        t.setLeft(0);
        t.setRight(0);
        t.setElevation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        t.setAnimationMatrix(null);
        if (Build.VERSION.SDK_INT >= 28) {
            t.setOutlineAmbientShadowColor(-16777216);
            t.setOutlineSpotShadowColor(-16777216);
        }
        t.setNextFocusDownId(-1);
        t.setNextFocusForwardId(-1);
        t.setNextFocusRightId(-1);
        t.setNextFocusUpId(-1);
        t.setFocusable(false);
        t.setFocusableInTouchMode(false);
        t.setElevation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        t.setAlpha(1.0f);
        setPadding(t, 0, 0, 0, 0);
        t.setForeground(null);
        return t;
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_ACTIONS)
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t.setTag(C3893R.C3895id.accessibility_actions, readableArray);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION)
    public void setAccessibilityCollection(T t, ReadableMap readableMap) {
        t.setTag(C3893R.C3895id.accessibility_collection, readableMap);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION_ITEM)
    public void setAccessibilityCollectionItem(T t, ReadableMap readableMap) {
        t.setTag(C3893R.C3895id.accessibility_collection_item, readableMap);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_HINT)
    public void setAccessibilityHint(T t, String str) {
        t.setTag(C3893R.C3895id.accessibility_hint, str);
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(T t, String str) {
        t.setTag(C3893R.C3895id.accessibility_label, str);
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_LABELLED_BY)
    public void setAccessibilityLabelledBy(T t, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t.setTag(C3893R.C3895id.labelled_by, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t.setTag(C3893R.C3895id.labelled_by, dynamic.asArray().getString(0));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_LIVE_REGION)
    public void setAccessibilityLiveRegion(T t, String str) {
        if (str != null && !str.equals(ViewProps.NONE)) {
            if (str.equals("polite")) {
                C1365w0.m37181s0(t, 1);
                return;
            } else if (str.equals("assertive")) {
                C1365w0.m37181s0(t, 2);
                return;
            } else {
                return;
            }
        }
        C1365w0.m37181s0(t, 0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(T t, String str) {
        if (str == null) {
            return;
        }
        t.setTag(C3893R.C3895id.accessibility_role, ReactAccessibilityDelegate.AccessibilityRole.fromValue(str));
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_VALUE)
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            t.setTag(C3893R.C3895id.accessibility_value, null);
            t.setContentDescription(null);
            return;
        }
        t.setTag(C3893R.C3895id.accessibility_value, readableMap);
        if (readableMap.hasKey("text")) {
            updateViewContentDescription(t);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(customType = "Color", defaultInt = 0, name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderBottomLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_BOTTOM_LEFT_RADIUS);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderBottomRightRadius(T t, float f) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_BOTTOM_RIGHT_RADIUS);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderTopLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_TOP_LEFT_RADIUS);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderTopRightRadius(T t, float f) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_TOP_RIGHT_RADIUS);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ELEVATION)
    public void setElevation(T t, float f) {
        C1365w0.m37169y0(t, PixelUtil.toPixelFromDIP(f));
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.IMPORTANT_FOR_ACCESSIBILITY)
    public void setImportantForAccessibility(T t, String str) {
        if (str != null && !str.equals("auto")) {
            if (str.equals("yes")) {
                C1365w0.m37259A0(t, 1);
                return;
            } else if (str.equals("no")) {
                C1365w0.m37259A0(t, 2);
                return;
            } else if (str.equals("no-hide-descendants")) {
                C1365w0.m37259A0(t, 4);
                return;
            } else {
                return;
            }
        }
        C1365w0.m37259A0(t, 0);
    }

    @ReactProp(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t, boolean z) {
    }

    @ReactProp(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t, boolean z) {
    }

    @ReactProp(name = ViewProps.NATIVE_ID)
    public void setNativeId(T t, String str) {
        t.setTag(C3893R.C3895id.view_tag_native_id, str);
        ReactFindViewUtil.notifyViewRendered(t);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @ReactProp(name = "onPointerEnter")
    public void setPointerEnter(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.ENTER, z);
    }

    @ReactProp(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.ENTER_CAPTURE, z);
    }

    @ReactProp(name = "onPointerLeave")
    public void setPointerLeave(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.LEAVE, z);
    }

    @ReactProp(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.LEAVE_CAPTURE, z);
    }

    @ReactProp(name = "onPointerMove")
    public void setPointerMove(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.MOVE, z);
    }

    @ReactProp(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.MOVE_CAPTURE, z);
    }

    @ReactProp(name = "onPointerOut")
    public void setPointerOut(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.OUT, z);
    }

    @ReactProp(name = "onPointerOutCapture")
    public void setPointerOutCapture(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.OUT_CAPTURE, z);
    }

    @ReactProp(name = "onPointerOver")
    public void setPointerOver(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.OVER, z);
    }

    @ReactProp(name = "onPointerOverCapture")
    public void setPointerOverCapture(T t, boolean z) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.OVER_CAPTURE, z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.RENDER_TO_HARDWARE_TEXTURE)
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @ReactProp(name = "onResponderEnd")
    public void setResponderEnd(T t, boolean z) {
    }

    @ReactProp(name = "onResponderGrant")
    public void setResponderGrant(T t, boolean z) {
    }

    @ReactProp(name = "onResponderMove")
    public void setResponderMove(T t, boolean z) {
    }

    @ReactProp(name = "onResponderReject")
    public void setResponderReject(T t, boolean z) {
    }

    @ReactProp(name = "onResponderRelease")
    public void setResponderRelease(T t, boolean z) {
    }

    @ReactProp(name = "onResponderStart")
    public void setResponderStart(T t, boolean z) {
    }

    @ReactProp(name = "onResponderTerminate")
    public void setResponderTerminate(T t, boolean z) {
    }

    @ReactProp(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t, boolean z) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ROTATION)
    @Deprecated
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.SCALE_X)
    @Deprecated
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.SCALE_Y)
    @Deprecated
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(customType = "Color", defaultInt = -16777216, name = ViewProps.SHADOW_COLOR)
    public void setShadowColor(T t, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            t.setOutlineAmbientShadowColor(i);
            t.setOutlineSpotShadowColor(i);
        }
    }

    @ReactProp(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t, boolean z) {
    }

    @ReactProp(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t, boolean z) {
    }

    @ReactProp(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t, boolean z) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.TEST_ID)
    public void setTestId(T t, String str) {
        t.setTag(C3893R.C3895id.react_test_id, str);
        t.setTag(str);
    }

    @ReactProp(name = "onTouchCancel")
    public void setTouchCancel(T t, boolean z) {
    }

    @ReactProp(name = "onTouchEnd")
    public void setTouchEnd(T t, boolean z) {
    }

    @ReactProp(name = "onTouchMove")
    public void setTouchMove(T t, boolean z) {
    }

    @ReactProp(name = "onTouchStart")
    public void setTouchStart(T t, boolean z) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = ViewProps.TRANSLATE_X)
    @Deprecated
    public void setTranslateX(T t, float f) {
        t.setTranslationX(PixelUtil.toPixelFromDIP(f));
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = ViewProps.TRANSLATE_Y)
    @Deprecated
    public void setTranslateY(T t, float f) {
        t.setTranslationY(PixelUtil.toPixelFromDIP(f));
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.ACCESSIBILITY_STATE)
    public void setViewState(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t.setTag(C3893R.C3895id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean isSelected = t.isSelected();
            boolean z = readableMap.getBoolean("selected");
            t.setSelected(z);
            if (t.isAccessibilityFocused() && isSelected && !z) {
                t.announceForAccessibility(t.getContext().getString(C3893R.string.state_unselected_description));
            }
        } else {
            t.setSelected(false);
        }
        t.setTag(C3893R.C3895id.accessibility_state, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t.setEnabled(true);
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (!nextKey.equals(STATE_BUSY) && !nextKey.equals(STATE_EXPANDED) && (!nextKey.equals(STATE_CHECKED) || readableMap.getType(STATE_CHECKED) != ReadableType.String)) {
                if (t.isAccessibilityFocused()) {
                    t.sendAccessibilityEvent(1);
                }
            } else {
                updateViewContentDescription(t);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @ReactProp(name = ViewProps.Z_INDEX)
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent instanceof ReactZIndexedViewGroup) {
            ((ReactZIndexedViewGroup) parent).updateDrawingOrder();
        }
    }
}
