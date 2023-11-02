package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C4713b;
import com.google.firebase.messaging.C5077d0;
import com.google.firebase.messaging.C5096l;
import java.util.concurrent.ExecutionException;
import p420x8.AbstractC13737b;
import p420x8.C13735a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC13737b {
    /* renamed from: g */
    private static Intent m26439g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // p420x8.AbstractC13737b
    /* renamed from: b */
    protected int mo1612b(Context context, C13735a c13735a) {
        try {
            return ((Integer) C4713b.m28008a(new C5096l(context).m26215k(c13735a.m1615r()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // p420x8.AbstractC13737b
    /* renamed from: c */
    protected void mo1611c(Context context, Bundle bundle) {
        Intent m26439g = m26439g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C5077d0.m26308A(m26439g)) {
            C5077d0.m26288s(m26439g);
        }
    }
}
