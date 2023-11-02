package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeRoundingFilter {
    static {
        C3739e.m30943a();
    }

    @InterfaceC13370d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @InterfaceC13370d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @InterfaceC13370d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @InterfaceC13370d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @InterfaceC13370d
    public static void toCircle(Bitmap bitmap, boolean z) {
        C13379j.m2677g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z);
        }
    }

    @InterfaceC13370d
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        C13379j.m2677g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z);
        }
    }
}