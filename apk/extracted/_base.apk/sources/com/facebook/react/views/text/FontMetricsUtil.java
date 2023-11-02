package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FontMetricsUtil {
    private static final float AMPLIFICATION_FACTOR = 100.0f;
    private static final String CAP_HEIGHT_MEASUREMENT_TEXT = "T";
    private static final String X_HEIGHT_MEASUREMENT_TEXT = "x";

    public static WritableArray getFontMetrics(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        Rect rect;
        Rect rect2;
        int i;
        float lineWidth;
        Rect rect3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * AMPLIFICATION_FACTOR);
        int i2 = 0;
        int i3 = 1;
        textPaint2.getTextBounds(CAP_HEIGHT_MEASUREMENT_TEXT, 0, 1, new Rect());
        double height = (rect.height() / AMPLIFICATION_FACTOR) / displayMetrics.density;
        textPaint2.getTextBounds(X_HEIGHT_MEASUREMENT_TEXT, 0, 1, new Rect());
        double height2 = (rect2.height() / AMPLIFICATION_FACTOR) / displayMetrics.density;
        int i4 = 0;
        while (i4 < layout.getLineCount()) {
            if (charSequence.length() > 0 && charSequence.charAt(layout.getLineEnd(i4) - i3) == '\n') {
                i = i3;
            } else {
                i = i2;
            }
            if (i != 0) {
                lineWidth = layout.getLineMax(i4);
            } else {
                lineWidth = layout.getLineWidth(i4);
            }
            layout.getLineBounds(i4, new Rect());
            WritableMap createMap = Arguments.createMap();
            double d = height;
            createMap.putDouble(X_HEIGHT_MEASUREMENT_TEXT, layout.getLineLeft(i4) / displayMetrics.density);
            createMap.putDouble("y", rect3.top / displayMetrics.density);
            createMap.putDouble("width", lineWidth / displayMetrics.density);
            createMap.putDouble("height", rect3.height() / displayMetrics.density);
            createMap.putDouble("descender", layout.getLineDescent(i4) / displayMetrics.density);
            createMap.putDouble("ascender", (-layout.getLineAscent(i4)) / displayMetrics.density);
            createMap.putDouble("baseline", layout.getLineBaseline(i4) / displayMetrics.density);
            createMap.putDouble("capHeight", d);
            createMap.putDouble("xHeight", height2);
            createMap.putString("text", charSequence.subSequence(layout.getLineStart(i4), layout.getLineEnd(i4)).toString());
            createArray.pushMap(createMap);
            i4++;
            height = d;
            i2 = 0;
            i3 = 1;
        }
        return createArray;
    }
}
