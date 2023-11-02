package com.mkuczera;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: com.mkuczera.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5279e implements InterfaceC5276b {

    /* renamed from: a */
    int f15014a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5279e(int i) {
        this.f15014a = i;
    }

    @Override // com.mkuczera.InterfaceC5276b
    /* renamed from: a */
    public void mo25540a(Vibrator vibrator) {
        VibrationEffect createPredefined;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            if (vibrator.hasVibrator()) {
                createPredefined = VibrationEffect.createPredefined(this.f15014a);
                vibrator.vibrate(createPredefined);
            }
        } catch (Exception unused) {
        }
    }
}
