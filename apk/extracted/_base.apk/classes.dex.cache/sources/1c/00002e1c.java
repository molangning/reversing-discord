package com.mkuczera;

import android.os.Vibrator;

/* renamed from: com.mkuczera.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5280f implements InterfaceC5276b {

    /* renamed from: a */
    long[] f15015a;

    public C5280f(long[] jArr) {
        this.f15015a = jArr;
    }

    @Override // com.mkuczera.InterfaceC5276b
    /* renamed from: a */
    public void mo25540a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f15015a, -1);
            }
        } catch (Exception unused) {
        }
    }
}