package com.henninghall.date_picker;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Calendar;

/* renamed from: com.henninghall.date_picker.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5139c {
    /* renamed from: a */
    private static RCTEventEmitter m26085a() {
        return (RCTEventEmitter) C5136a.f14460a.getJSModule(RCTEventEmitter.class);
    }

    /* renamed from: b */
    public static void m26084b(Calendar calendar, String str, View view) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("date", C5153k.m26030b(calendar));
        createMap.putString("dateString", str);
        m26085a().receiveEvent(view.getId(), "dateChange", createMap);
    }
}
