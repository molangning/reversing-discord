package com.google.android.gms.nearby.exposurenotification;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class WakeUpService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new Messenger(new HandlerC4669a(null)).getBinder();
    }
}
