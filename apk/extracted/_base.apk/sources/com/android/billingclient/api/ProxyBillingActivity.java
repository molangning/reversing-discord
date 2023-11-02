package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import p401w9.C13450k;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: j */
    private ResultReceiver f7301j;

    /* renamed from: k */
    private ResultReceiver f7302k;

    /* renamed from: l */
    private boolean f7303l;

    /* renamed from: m */
    private boolean f7304m;

    /* renamed from: a */
    private Intent m32568a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* renamed from: b */
    private Intent m32567b() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = 100
            r1 = 0
            r2 = 0
            r3 = 110(0x6e, float:1.54E-43)
            java.lang.String r4 = "ProxyBillingActivity"
            if (r8 == r0) goto L43
            if (r8 != r3) goto L10
            goto L43
        L10:
            r9 = 101(0x65, float:1.42E-43)
            if (r8 != r9) goto L28
            int r8 = p401w9.C13450k.m2476a(r10, r4)
            android.os.ResultReceiver r9 = r7.f7302k
            if (r9 == 0) goto Lca
            if (r10 != 0) goto L1f
            goto L23
        L1f:
            android.os.Bundle r1 = r10.getExtras()
        L23:
            r9.send(r8, r1)
            goto Lca
        L28:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Got onActivityResult with wrong requestCode: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = "; skipping..."
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            p401w9.C13450k.m2463n(r4, r8)
            goto Lca
        L43:
            com.android.billingclient.api.BillingResult r0 = p401w9.C13450k.m2468i(r10, r4)
            int r0 = r0.m32600b()
            r5 = -1
            if (r9 != r5) goto L54
            if (r0 == 0) goto L52
            r9 = r5
            goto L54
        L52:
            r0 = r2
            goto L70
        L54:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Activity finished with resultCode "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = " and billing's responseCode: "
            r5.append(r9)
            r5.append(r0)
            java.lang.String r9 = r5.toString()
            p401w9.C13450k.m2463n(r4, r9)
        L70:
            android.os.ResultReceiver r9 = r7.f7301j
            if (r9 == 0) goto L7f
            if (r10 != 0) goto L77
            goto L7b
        L77:
            android.os.Bundle r1 = r10.getExtras()
        L7b:
            r9.send(r0, r1)
            goto Lca
        L7f:
            if (r10 == 0) goto Lbb
            android.os.Bundle r9 = r10.getExtras()
            if (r9 == 0) goto La4
            android.os.Bundle r9 = r10.getExtras()
            java.lang.String r0 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r9 = r9.getString(r0)
            if (r9 == 0) goto L98
            android.content.Intent r9 = r7.m32568a(r9)
            goto Lbf
        L98:
            android.content.Intent r9 = r7.m32567b()
            android.os.Bundle r10 = r10.getExtras()
            r9.putExtras(r10)
            goto Lbf
        La4:
            android.content.Intent r9 = r7.m32567b()
            java.lang.String r10 = "Got null bundle!"
            p401w9.C13450k.m2463n(r4, r10)
            java.lang.String r10 = "RESPONSE_CODE"
            r0 = 6
            r9.putExtra(r10, r0)
            java.lang.String r10 = "DEBUG_MESSAGE"
            java.lang.String r0 = "An internal error occurred."
            r9.putExtra(r10, r0)
            goto Lbf
        Lbb:
            android.content.Intent r9 = r7.m32567b()
        Lbf:
            if (r8 != r3) goto Lc7
            java.lang.String r8 = "IS_FIRST_PARTY_PURCHASE"
            r10 = 1
            r9.putExtra(r8, r10)
        Lc7:
            r7.sendBroadcast(r9)
        Lca:
            r7.f7303l = r2
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            C13450k.m2464m("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f7304m = true;
                    i2 = 110;
                    i = i2;
                }
                i = 100;
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f7301j = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                i = 100;
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f7302k = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i2 = 101;
                i = i2;
            } else {
                i = 100;
                pendingIntent = null;
            }
            try {
                this.f7303l = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                C13450k.m2462o("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.f7301j;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f7302k;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent m32567b = m32567b();
                        if (this.f7304m) {
                            m32567b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        m32567b.putExtra("RESPONSE_CODE", 6);
                        m32567b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(m32567b);
                    }
                }
                this.f7303l = false;
                finish();
                return;
            }
        }
        C13450k.m2464m("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.f7303l = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.f7301j = (ResultReceiver) bundle.getParcelable("result_receiver");
        } else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.f7302k = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.f7304m = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!isFinishing() || !this.f7303l) {
            return;
        }
        Intent m32567b = m32567b();
        m32567b.putExtra("RESPONSE_CODE", 1);
        m32567b.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        sendBroadcast(m32567b);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f7301j;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f7302k;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f7303l);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f7304m);
    }
}
