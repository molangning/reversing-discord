package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import p195k8.C9197r;

/* renamed from: com.google.android.exoplayer2.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4571y0 {

    /* renamed from: a */
    private final WifiManager f12429a;

    /* renamed from: b */
    private WifiManager.WifiLock f12430b;

    /* renamed from: c */
    private boolean f12431c;

    /* renamed from: d */
    private boolean f12432d;

    public C4571y0(Context context) {
        this.f12429a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: c */
    private void m28582c() {
        WifiManager.WifiLock wifiLock = this.f12430b;
        if (wifiLock == null) {
            return;
        }
        if (this.f12431c && this.f12432d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    /* renamed from: a */
    public void m28584a(boolean z) {
        if (z && this.f12430b == null) {
            WifiManager wifiManager = this.f12429a;
            if (wifiManager == null) {
                C9197r.m16178h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f12430b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f12431c = z;
        m28582c();
    }

    /* renamed from: b */
    public void m28583b(boolean z) {
        this.f12432d = z;
        m28582c();
    }
}
