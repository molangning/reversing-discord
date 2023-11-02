package com.henninghall.date_picker;

import android.widget.LinearLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DatePickerManager extends SimpleViewManager<C5147g> {
    private static final String REACT_CLASS = "DatePickerManager";
    private static final int SCROLL = 1;

    private ReactPropGroup getMethodAnnotation(String str) {
        Method[] methods;
        Method method = null;
        for (Method method2 : getClass().getMethods()) {
            if (method2.getName().equals(str)) {
                method = method2;
            }
        }
        return (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
    }

    private void updateProp(String str, C5147g c5147g, int i, Dynamic dynamic) {
        c5147g.m26065d(getMethodAnnotation(str).names()[i], dynamic);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m30470of(ViewProps.SCROLL, 1);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().put("dateChange", MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30470of("bubbled", "onChange"))).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(names = {"date", "mode", "locale", "maximumDate", "minimumDate", "fadeToColor", "textColor", "timezoneOffsetInMinutes", "minuteInterval", "androidVariant", "dividerHeight", "is24hourSource"})
    public void setProps(C5147g c5147g, int i, Dynamic dynamic) {
        updateProp("setProps", c5147g, i, dynamic);
    }

    @ReactPropGroup(customType = "Style", names = {"height"})
    public void setStyle(C5147g c5147g, int i, Dynamic dynamic) {
        updateProp("setStyle", c5147g, i, dynamic);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C5147g createViewInstance(ThemedReactContext themedReactContext) {
        return new C5147g(new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C5147g c5147g) {
        super.onAfterUpdateTransaction((DatePickerManager) c5147g);
        try {
            c5147g.m26066c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C5147g c5147g, int i, ReadableArray readableArray) {
        if (i == 1) {
            c5147g.m26067b(readableArray.getInt(0), readableArray.getInt(1));
        }
    }
}