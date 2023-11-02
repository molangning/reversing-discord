package com.reactnative.ivpusic.imagepicker;

import android.media.ExifInterface;

/* renamed from: com.reactnative.ivpusic.imagepicker.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5380c {

    /* renamed from: a */
    Float f15250a;

    /* renamed from: b */
    Float f15251b;

    public C5380c(ExifInterface exifInterface) {
        String attribute = exifInterface.getAttribute("GPSLatitude");
        String attribute2 = exifInterface.getAttribute("GPSLatitudeRef");
        String attribute3 = exifInterface.getAttribute("GPSLongitude");
        String attribute4 = exifInterface.getAttribute("GPSLongitudeRef");
        if (attribute != null && attribute2 != null && attribute3 != null && attribute4 != null) {
            if (attribute2.equals("N")) {
                this.f15250a = m25323a(attribute);
            } else {
                this.f15250a = Float.valueOf(0.0f - m25323a(attribute).floatValue());
            }
            if (attribute4.equals("E")) {
                this.f15251b = m25323a(attribute3);
            } else {
                this.f15251b = Float.valueOf(0.0f - m25323a(attribute3).floatValue());
            }
        }
    }

    /* renamed from: a */
    private Float m25323a(String str) {
        String[] split = str.split(",", 3);
        String[] split2 = split[0].split("/", 2);
        Double valueOf = Double.valueOf(split2[0]);
        Double valueOf2 = Double.valueOf(split2[1]);
        String[] split3 = split[1].split("/", 2);
        Double valueOf3 = Double.valueOf(split3[0]);
        Double valueOf4 = Double.valueOf(split3[1]);
        String[] split4 = split[2].split("/", 2);
        return Float.valueOf((float) ((valueOf.doubleValue() / valueOf2.doubleValue()) + ((valueOf3.doubleValue() / valueOf4.doubleValue()) / 60.0d) + ((Double.valueOf(split4[0]).doubleValue() / Double.valueOf(split4[1]).doubleValue()) / 3600.0d)));
    }

    /* renamed from: b */
    public Float m25322b() {
        return this.f15250a;
    }

    /* renamed from: c */
    public Float m25321c() {
        return this.f15251b;
    }
}
