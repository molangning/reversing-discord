package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import java.util.ArrayList;
import p401w9.C13450k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2751s {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static BillingResult m32453a(Bundle bundle, String str, String str2) {
        BillingResult billingResult = C2748p.f7395j;
        if (bundle == null) {
            C13450k.m2463n("BillingClient", String.format("%s got null owned items list", str2));
            return billingResult;
        }
        int m2475b = C13450k.m2475b(bundle, "BillingClient");
        String m2467j = C13450k.m2467j(bundle, "BillingClient");
        BillingResult.C2720a m32599c = BillingResult.m32599c();
        m32599c.m32594c(m2475b);
        m32599c.m32595b(m2467j);
        BillingResult m32596a = m32599c.m32596a();
        if (m2475b != 0) {
            C13450k.m2463n("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(m2475b)));
            return m32596a;
        } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                C13450k.m2463n("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return billingResult;
            } else if (stringArrayList2 == null) {
                C13450k.m2463n("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return billingResult;
            } else if (stringArrayList3 == null) {
                C13450k.m2463n("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
                return billingResult;
            } else {
                return C2748p.f7397l;
            }
        } else {
            C13450k.m2463n("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return billingResult;
        }
    }
}
