package com.adjust.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p021b1.C2030e;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AdjustReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if (stringExtra == null) {
            return;
        }
        C2030e.m34638j().m34401A(stringExtra, context);
    }
}
