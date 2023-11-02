package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p130h6.C7021a;
import p381v5.AbstractC13103o;
import p381v5.C13109t;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m29937b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C13109t.m3241f(context);
        AbstractC13103o.AbstractC13104a mo3253d = AbstractC13103o.m3262a().mo3255b(queryParameter).mo3253d(C7021a.m21527b(intValue));
        if (queryParameter2 != null) {
            mo3253d.mo3254c(Base64.decode(queryParameter2, 0));
        }
        C13109t.m3244c().m3242e().m24536v(mo3253d.mo3256a(), i, new Runnable() { // from class: d6.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m29937b();
            }
        });
    }
}
