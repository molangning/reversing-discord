package com.imagepicker;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.imagepicker.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC5257d {

    /* renamed from: a */
    protected String f14894a;

    /* renamed from: b */
    protected int f14895b;

    /* renamed from: c */
    protected int f14896c;

    /* renamed from: a */
    public String m25647a(String str, String str2) {
        try {
            Locale locale = Locale.US;
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
            if (parse == null) {
                return null;
            }
            return simpleDateFormat.format(parse);
        } catch (Exception e) {
            Log.e("RNIP", "Could not parse image datetime to UTC: " + e.getMessage());
            return null;
        }
    }
}