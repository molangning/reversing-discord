package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C3878d {
    /* renamed from: a */
    public static int m30544a(InputStream inputStream, int i, boolean z) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i2 = (read & 255) << (i4 * 8);
                } else {
                    i3 <<= 8;
                    i2 = read & 255;
                }
                i3 |= i2;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i3;
    }
}
