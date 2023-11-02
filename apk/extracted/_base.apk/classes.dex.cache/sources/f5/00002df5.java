package com.imagepicker;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import p110g0.C6509a;

/* renamed from: com.imagepicker.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5255b extends AbstractC5257d {
    public C5255b(Uri uri, Context context) {
        try {
            String m22510j = new C6509a(context.getContentResolver().openInputStream(uri)).m22510j("DateTime");
            if (m22510j != null) {
                this.f14894a = m25647a(m22510j, "yyyy:MM:dd HH:mm:ss");
            }
        } catch (Exception e) {
            Log.e("RNIP", "Could not load image metadata: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public String m25648b() {
        return this.f14894a;
    }
}