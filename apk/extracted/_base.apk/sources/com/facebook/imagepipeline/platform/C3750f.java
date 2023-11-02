package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.imageutils.C3874a;
import p437y4.InterfaceC13883h;

@TargetApi(26)
/* renamed from: com.facebook.imagepipeline.platform.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3750f extends AbstractC3746b {
    public C3750f(InterfaceC13883h interfaceC13883h, int i, Pools$SynchronizedPool pools$SynchronizedPool) {
        super(interfaceC13883h, i, pools$SynchronizedPool);
    }

    /* renamed from: f */
    private static boolean m30922f(BitmapFactory.Options options) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        boolean isWideGamut;
        Bitmap.Config config;
        colorSpace = options.outColorSpace;
        if (colorSpace != null) {
            colorSpace2 = options.outColorSpace;
            isWideGamut = colorSpace2.isWideGamut();
            if (isWideGamut) {
                Bitmap.Config config2 = options.inPreferredConfig;
                config = Bitmap.Config.RGBA_F16;
                if (config2 != config) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.platform.AbstractC3746b
    /* renamed from: d */
    public int mo30923d(int i, int i2, BitmapFactory.Options options) {
        if (m30922f(options)) {
            return i * i2 * 8;
        }
        Bitmap.Config config = options.inPreferredConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return C3874a.m30553d(i, i2, config);
    }
}
