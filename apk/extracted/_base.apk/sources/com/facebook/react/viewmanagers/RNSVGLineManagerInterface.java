package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface RNSVGLineManagerInterface<T extends View> {
    void setClipPath(T t, String str);

    void setClipRule(T t, int i);

    void setDisplay(T t, String str);

    void setFill(T t, ReadableMap readableMap);

    void setFillOpacity(T t, float f);

    void setFillRule(T t, int i);

    void setMarkerEnd(T t, String str);

    void setMarkerMid(T t, String str);

    void setMarkerStart(T t, String str);

    void setMask(T t, String str);

    void setMatrix(T t, ReadableArray readableArray);

    void setName(T t, String str);

    void setOpacity(T t, float f);

    void setPointerEvents(T t, String str);

    void setPropList(T t, ReadableArray readableArray);

    void setResponsible(T t, boolean z);

    void setStroke(T t, ReadableMap readableMap);

    void setStrokeDasharray(T t, ReadableArray readableArray);

    void setStrokeDashoffset(T t, float f);

    void setStrokeLinecap(T t, int i);

    void setStrokeLinejoin(T t, int i);

    void setStrokeMiterlimit(T t, float f);

    void setStrokeOpacity(T t, float f);

    void setStrokeWidth(T t, Double d);

    void setStrokeWidth(T t, String str);

    void setVectorEffect(T t, int i);

    void setX1(T t, Double d);

    void setX1(T t, String str);

    void setX2(T t, Double d);

    void setX2(T t, String str);

    void setY1(T t, Double d);

    void setY1(T t, String str);

    void setY2(T t, Double d);

    void setY2(T t, String str);
}
