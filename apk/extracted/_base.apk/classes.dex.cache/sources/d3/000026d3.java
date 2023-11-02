package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.events.TouchEventType;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class UIManagerModuleConstants {
    public static final String ACTION_DISMISSED = "dismissed";
    public static final String ACTION_ITEM_SELECTED = "itemSelected";

    UIManagerModuleConstants() {
    }

    public static Map getBubblingEventTypeConstants() {
        return MapBuilder.builder().put("topChange", MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onChange", "captured", "onChangeCapture"))).put("topSelect", MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onSelect", "captured", "onSelectCapture"))).put(TouchEventType.getJSEventName(TouchEventType.START), MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).put(TouchEventType.getJSEventName(TouchEventType.MOVE), MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).put(TouchEventType.getJSEventName(TouchEventType.END), MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).put(TouchEventType.getJSEventName(TouchEventType.CANCEL), MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).build();
    }

    public static Map<String, Object> getConstants() {
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put("UIView", MapBuilder.m30470of("ContentMode", MapBuilder.m30468of("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        newHashMap.put("StyleConstants", MapBuilder.m30470of("PointerEventsValues", MapBuilder.m30467of(ViewProps.NONE, Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        newHashMap.put("PopupMenu", MapBuilder.m30469of(ACTION_DISMISSED, ACTION_DISMISSED, ACTION_ITEM_SELECTED, ACTION_ITEM_SELECTED));
        newHashMap.put("AccessibilityEventTypes", MapBuilder.m30468of("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return newHashMap;
    }

    public static Map getDirectEventTypeConstants() {
        return MapBuilder.builder().put("topContentSizeChange", MapBuilder.m30470of("registrationName", "onContentSizeChange")).put("topLayout", MapBuilder.m30470of("registrationName", ViewProps.ON_LAYOUT)).put("topLoadingError", MapBuilder.m30470of("registrationName", "onLoadingError")).put("topLoadingFinish", MapBuilder.m30470of("registrationName", "onLoadingFinish")).put("topLoadingStart", MapBuilder.m30470of("registrationName", "onLoadingStart")).put("topSelectionChange", MapBuilder.m30470of("registrationName", "onSelectionChange")).put("topMessage", MapBuilder.m30470of("registrationName", "onMessage")).put("topClick", MapBuilder.m30470of("registrationName", "onClick")).put("topScrollBeginDrag", MapBuilder.m30470of("registrationName", "onScrollBeginDrag")).put("topScrollEndDrag", MapBuilder.m30470of("registrationName", "onScrollEndDrag")).put("topScroll", MapBuilder.m30470of("registrationName", "onScroll")).put("topMomentumScrollBegin", MapBuilder.m30470of("registrationName", "onMomentumScrollBegin")).put("topMomentumScrollEnd", MapBuilder.m30470of("registrationName", "onMomentumScrollEnd")).build();
    }
}