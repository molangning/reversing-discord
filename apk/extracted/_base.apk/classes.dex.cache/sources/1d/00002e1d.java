package com.mkuczera;

import android.os.Vibrator;

/* renamed from: com.mkuczera.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5281g implements InterfaceC5276b {

    /* renamed from: a */
    int f15016a;

    public C5281g(int i) {
        this.f15016a = i;
    }

    @Override // com.mkuczera.InterfaceC5276b
    /* renamed from: a */
    public void mo25540a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f15016a);
            }
        } catch (Exception unused) {
        }
    }
}