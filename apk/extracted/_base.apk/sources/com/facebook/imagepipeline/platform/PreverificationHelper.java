package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.soloader.InterfaceC4303e;

@InterfaceC4303e
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class PreverificationHelper {
    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC4303e
    @TargetApi(26)
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        Bitmap.Config config2;
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }
}
