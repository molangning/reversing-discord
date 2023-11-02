package com.discord.media.utils;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/media/utils/BitmapUtils;", "", "()V", "DEFAULT_QUALITY", "", "toByteArray", "", "Landroid/graphics/Bitmap;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "mimeType", "", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class BitmapUtils {
    private static final int DEFAULT_QUALITY = 80;
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    private BitmapUtils() {
    }

    public static /* synthetic */ byte[] toByteArray$default(BitmapUtils bitmapUtils, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 80;
        }
        return bitmapUtils.toByteArray(bitmap, compressFormat, i);
    }

    public final byte[] toByteArray(Bitmap bitmap, Bitmap.CompressFormat format, int i) {
        C9612q.m13917h(bitmap, "<this>");
        C9612q.m13917h(format, "format");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(format, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C9612q.m13918g(byteArray, "ByteArrayOutputStream().…)\n        }.toByteArray()");
        return byteArray;
    }

    public static /* synthetic */ byte[] toByteArray$default(BitmapUtils bitmapUtils, Bitmap bitmap, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 80;
        }
        return bitmapUtils.toByteArray(bitmap, str, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r4.equals("image/jpg") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r4.equals("image/jpeg") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        return toByteArray(r3, android.graphics.Bitmap.CompressFormat.JPEG, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] toByteArray(android.graphics.Bitmap r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            java.lang.String r0 = "mimeType"
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            int r0 = r4.hashCode()
            r1 = -1487394660(0xffffffffa758289c, float:-2.9998036E-15)
            if (r0 == r1) goto L37
            r1 = -879264467(0xffffffffcb977d2d, float:-1.9855962E7)
            if (r0 == r1) goto L2e
            r1 = -879258763(0xffffffffcb979375, float:-1.986737E7)
            if (r0 == r1) goto L1e
            goto L3f
        L1e:
            java.lang.String r0 = "image/png"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L27
            goto L3f
        L27:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
            goto L4c
        L2e:
            java.lang.String r0 = "image/jpg"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L3f
            goto L46
        L37:
            java.lang.String r0 = "image/jpeg"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L46
        L3f:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
            goto L4c
        L46:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.BitmapUtils.toByteArray(android.graphics.Bitmap, java.lang.String, int):byte[]");
    }
}
