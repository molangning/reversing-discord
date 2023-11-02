package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.util.C1138f;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.imageutils.C3874a;
import p437y4.InterfaceC13883h;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.platform.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3745a extends AbstractC3746b {
    public C3745a(InterfaceC13883h interfaceC13883h, int i, Pools$SynchronizedPool pools$SynchronizedPool) {
        super(interfaceC13883h, i, pools$SynchronizedPool);
    }

    @Override // com.facebook.imagepipeline.platform.AbstractC3746b
    /* renamed from: d */
    public int mo30923d(int i, int i2, BitmapFactory.Options options) {
        return C3874a.m30553d(i, i2, (Bitmap.Config) C1138f.m37824f(options.inPreferredConfig));
    }
}