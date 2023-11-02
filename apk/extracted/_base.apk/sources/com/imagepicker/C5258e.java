package com.imagepicker;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;

/* renamed from: com.imagepicker.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5258e {

    /* renamed from: a */
    int f14897a;

    /* renamed from: b */
    Boolean f14898b;

    /* renamed from: c */
    Boolean f14899c;

    /* renamed from: d */
    int f14900d;

    /* renamed from: e */
    int f14901e;

    /* renamed from: f */
    int f14902f;

    /* renamed from: g */
    int f14903g;

    /* renamed from: h */
    Boolean f14904h;

    /* renamed from: i */
    int f14905i;

    /* renamed from: j */
    Boolean f14906j;

    /* renamed from: k */
    String f14907k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5258e(ReadableMap readableMap) {
        this.f14900d = 1;
        this.f14906j = Boolean.FALSE;
        this.f14907k = readableMap.getString("mediaType");
        this.f14897a = readableMap.getInt("selectionLimit");
        this.f14898b = Boolean.valueOf(readableMap.getBoolean("includeBase64"));
        this.f14899c = Boolean.valueOf(readableMap.getBoolean("includeExtra"));
        String string = readableMap.getString("videoQuality");
        if (!TextUtils.isEmpty(string) && !string.toLowerCase().equals("high")) {
            this.f14900d = 0;
        }
        if (readableMap.getString("cameraType").equals("front")) {
            this.f14906j = Boolean.TRUE;
        }
        this.f14901e = (int) (readableMap.getDouble("quality") * 100.0d);
        this.f14903g = readableMap.getInt(ViewProps.MAX_HEIGHT);
        this.f14902f = readableMap.getInt(ViewProps.MAX_WIDTH);
        this.f14904h = Boolean.valueOf(readableMap.getBoolean("saveToPhotos"));
        this.f14905i = readableMap.getInt("durationLimit");
    }
}
