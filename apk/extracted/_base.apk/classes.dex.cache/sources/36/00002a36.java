package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfi;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private zzfi f12545a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f12545a == null) {
            this.f12545a = new zzfi();
        }
        zzfi.zzb(context, intent);
    }
}