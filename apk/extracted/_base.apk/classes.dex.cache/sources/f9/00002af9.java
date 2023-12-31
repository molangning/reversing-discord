package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzey extends zzas {
    public zzey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void zzf(Map map, long j, String str, List<zzcp> list) {
        Parcel zza = zza();
        zza.writeMap(map);
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeTypedList(list);
        zzl(1, zza);
    }
}