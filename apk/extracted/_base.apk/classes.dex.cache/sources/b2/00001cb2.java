package com.discord.phone_verification;

import android.content.Context;
import android.content.IntentFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p338s8.AbstractC12435b;
import p338s8.C12434a;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/phone_verification/SmsAutofillManager;", "", "", "startSmsRetriever", "unregisterReceiver", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/discord/phone_verification/SmsAuthCodeBroadcastReceiver;", "broadcastReceiver", "Lcom/discord/phone_verification/SmsAuthCodeBroadcastReceiver;", "Lkotlin/Function1;", "", "onSMSRetrieved", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "phone_verification_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class SmsAutofillManager {
    private final SmsAuthCodeBroadcastReceiver broadcastReceiver;
    private final Context context;

    public SmsAutofillManager(Context context, Function1<? super String, Unit> onSMSRetrieved) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(onSMSRetrieved, "onSMSRetrieved");
        this.context = context;
        SmsAuthCodeBroadcastReceiver smsAuthCodeBroadcastReceiver = new SmsAuthCodeBroadcastReceiver(onSMSRetrieved);
        this.broadcastReceiver = smsAuthCodeBroadcastReceiver;
        context.registerReceiver(smsAuthCodeBroadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
    }

    public final void startSmsRetriever() {
        AbstractC12435b m5282a = C12434a.m5282a(this.context);
        C9612q.m13918g(m5282a, "getClient(context)");
        m5282a.mo5281C();
    }

    public final void unregisterReceiver() {
        try {
            this.context.unregisterReceiver(this.broadcastReceiver);
        } catch (Exception unused) {
        }
    }
}