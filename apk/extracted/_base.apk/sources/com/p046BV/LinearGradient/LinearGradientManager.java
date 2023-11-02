package com.p046BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/* renamed from: com.BV.LinearGradient.LinearGradientManager */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class LinearGradientManager extends SimpleViewManager<C2693b> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(C2693b c2693b, float f) {
        c2693b.setAngle(f);
    }

    @ReactProp(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(C2693b c2693b, ReadableArray readableArray) {
        c2693b.setAngleCenter(readableArray);
    }

    @ReactProp(name = PROP_BORDER_RADII)
    public void setBorderRadii(C2693b c2693b, ReadableArray readableArray) {
        c2693b.setBorderRadii(readableArray);
    }

    @ReactProp(name = PROP_COLORS)
    public void setColors(C2693b c2693b, ReadableArray readableArray) {
        c2693b.setColors(readableArray);
    }

    @ReactProp(name = PROP_END_POS)
    public void setEndPosition(C2693b c2693b, ReadableArray readableArray) {
        c2693b.setEndPosition(readableArray);
    }

    @ReactProp(name = PROP_LOCATIONS)
    public void setLocations(C2693b c2693b, ReadableArray readableArray) {
        if (readableArray != null) {
            c2693b.setLocations(readableArray);
        }
    }

    @ReactProp(name = PROP_START_POS)
    public void setStartPosition(C2693b c2693b, ReadableArray readableArray) {
        c2693b.setStartPosition(readableArray);
    }

    @ReactProp(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(C2693b c2693b, boolean z) {
        c2693b.setUseAngle(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C2693b createViewInstance(ThemedReactContext themedReactContext) {
        return new C2693b(themedReactContext);
    }
}
