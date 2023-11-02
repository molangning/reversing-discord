package com.reactnative.ivpusic.imagepicker;

import android.graphics.Bitmap;

/* renamed from: com.reactnative.ivpusic.imagepicker.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5381d {
    /* renamed from: a */
    public static Bitmap.CompressFormat m25320a(String str) {
        if (str.equals("image/png")) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }
}
