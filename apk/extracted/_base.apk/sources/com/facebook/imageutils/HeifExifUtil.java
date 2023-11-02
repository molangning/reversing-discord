package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import com.facebook.soloader.InterfaceC4303e;
import java.io.IOException;
import java.io.InputStream;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class HeifExifUtil {

    @InterfaceC4303e
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        /* renamed from: a */
        static int m30557a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                C13677a.m1859e("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static int m30558a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.m30557a(inputStream);
        }
        C13677a.m1862b("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
