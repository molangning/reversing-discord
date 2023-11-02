package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Bitmaps {

    /* renamed from: a */
    public static final /* synthetic */ int f10522a = 0;

    static {
        C3738d.m30944a();
    }

    @InterfaceC13370d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        C13379j.m2682b(Boolean.valueOf(bitmap.isMutable()));
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z3 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z3));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @InterfaceC13370d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}