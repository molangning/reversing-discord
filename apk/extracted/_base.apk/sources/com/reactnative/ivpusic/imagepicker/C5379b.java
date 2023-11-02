package com.reactnative.ivpusic.imagepicker;

import android.media.ExifInterface;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.reactnative.ivpusic.imagepicker.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5379b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static WritableMap m25326a(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        List<String> m25325b = m25325b();
        m25325b.addAll(m25324c());
        ExifInterface exifInterface = new ExifInterface(str);
        try {
            C5380c c5380c = new C5380c(exifInterface);
            if (c5380c.m25322b() != null && c5380c.m25321c() != null) {
                writableNativeMap.putDouble("Latitude", c5380c.m25322b().floatValue());
                writableNativeMap.putDouble("Longitude", c5380c.m25321c().floatValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str2 : m25325b) {
            writableNativeMap.putString(str2, exifInterface.getAttribute(str2));
        }
        return writableNativeMap;
    }

    /* renamed from: b */
    private static List<String> m25325b() {
        return new ArrayList(Arrays.asList("FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "WhiteBalance"));
    }

    /* renamed from: c */
    private static List<String> m25324c() {
        return new ArrayList(Arrays.asList("DateTimeDigitized", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal"));
    }
}
