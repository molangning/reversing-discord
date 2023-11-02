package com.facebook.react.views.traceupdateoverlay;

import android.graphics.RectF;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.traceupdateoverlay.TraceUpdateOverlay;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p414x2.C13677a;

@ReactModule(name = TraceUpdateOverlayManager.REACT_CLASS)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TraceUpdateOverlayManager extends SimpleViewManager<TraceUpdateOverlay> {
    public static final String REACT_CLASS = "TraceUpdateOverlay";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public TraceUpdateOverlay createViewInstance(ThemedReactContext themedReactContext) {
        return new TraceUpdateOverlay(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(TraceUpdateOverlay traceUpdateOverlay, String str, ReadableArray readableArray) {
        str.hashCode();
        if (!str.equals("draw")) {
            ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Received unexpected command in TraceUpdateOverlayManager"));
        } else if (readableArray != null) {
            String string = readableArray.getString(0);
            if (string == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("rect");
                    float f = (float) jSONObject2.getDouble(ViewProps.LEFT);
                    float f2 = (float) jSONObject2.getDouble(ViewProps.TOP);
                    arrayList.add(new TraceUpdateOverlay.Overlay(jSONObject.getInt(ViewProps.COLOR), new RectF(f, f2, (float) (f + jSONObject2.getDouble("width")), (float) (f2 + jSONObject2.getDouble("height")))));
                }
                traceUpdateOverlay.setOverlays(arrayList);
            } catch (JSONException e) {
                C13677a.m1853k(REACT_CLASS, "Failed to parse overlays: ", e);
            }
        }
    }
}
