package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import p195k8.C9197r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.x0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4569x0 {

    /* renamed from: a */
    private final PowerManager f12423a;

    /* renamed from: b */
    private PowerManager.WakeLock f12424b;

    /* renamed from: c */
    private boolean f12425c;

    /* renamed from: d */
    private boolean f12426d;

    public C4569x0(Context context) {
        this.f12423a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: c */
    private void m28585c() {
        PowerManager.WakeLock wakeLock = this.f12424b;
        if (wakeLock == null) {
            return;
        }
        if (this.f12425c && this.f12426d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* renamed from: a */
    public void m28587a(boolean z) {
        if (z && this.f12424b == null) {
            PowerManager powerManager = this.f12423a;
            if (powerManager == null) {
                C9197r.m16178h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f12424b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f12425c = z;
        m28585c();
    }

    /* renamed from: b */
    public void m28586b(boolean z) {
        this.f12426d = z;
        m28585c();
    }
}