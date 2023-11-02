package p401w9;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.C2753u;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import p331s1.C12350a;
import p331s1.C12357d;

/* renamed from: w9.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13450k {

    /* renamed from: a */
    public static final int f34695a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m2476a(Intent intent, String str) {
        if (intent == null) {
            m2463n("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return m2461p(intent.getExtras(), "ProxyBillingActivity");
    }

    /* renamed from: b */
    public static int m2475b(Bundle bundle, String str) {
        if (bundle == null) {
            m2463n(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m2464m(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            m2463n(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    /* renamed from: c */
    public static Bundle m2474c(C12350a c12350a, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    /* renamed from: d */
    public static Bundle m2473d(C12357d c12357d, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    /* renamed from: e */
    public static Bundle m2472e(int i, boolean z, String str, String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < size; i2++) {
                C2753u c2753u = (C2753u) arrayList.get(i2);
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z3 |= !TextUtils.isEmpty(null);
                arrayList4.add(0);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    /* renamed from: f */
    public static Bundle m2471f(BillingFlowParams billingFlowParams, boolean z, boolean z2, boolean z3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (billingFlowParams.m32643b() != 0) {
            bundle.putInt("prorationMode", billingFlowParams.m32643b());
        }
        if (!TextUtils.isEmpty(billingFlowParams.m32642c())) {
            bundle.putString("accountId", billingFlowParams.m32642c());
        }
        if (!TextUtils.isEmpty(billingFlowParams.m32641d())) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.m32641d());
        }
        if (billingFlowParams.m32630o()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(billingFlowParams.m32640e())) {
            bundle.putString("oldSkuPurchaseToken", billingFlowParams.m32640e());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("originalExternalTransactionId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        return bundle;
    }

    /* renamed from: g */
    public static Bundle m2470g(String str, ArrayList arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            if (((QueryProductDetailsParams.C2726b) arrayList.get(i)).m32537c().equals("first_party")) {
                C13459t.m2439c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        return bundle;
    }

    /* renamed from: h */
    public static Bundle m2469h(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: i */
    public static BillingResult m2468i(Intent intent, String str) {
        if (intent == null) {
            m2463n("BillingHelper", "Got null intent!");
            BillingResult.C2720a m32599c = BillingResult.m32599c();
            m32599c.m32594c(6);
            m32599c.m32595b("An internal error occurred.");
            return m32599c.m32596a();
        }
        BillingResult.C2720a m32599c2 = BillingResult.m32599c();
        m32599c2.m32594c(m2475b(intent.getExtras(), str));
        m32599c2.m32595b(m2467j(intent.getExtras(), str));
        return m32599c2.m32596a();
    }

    /* renamed from: j */
    public static String m2467j(Bundle bundle, String str) {
        if (bundle == null) {
            m2463n(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m2464m(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            m2463n(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    /* renamed from: k */
    public static String m2466k(int i) {
        return EnumC13433a.m2497a(i).toString();
    }

    /* renamed from: l */
    public static List m2465l(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            int size = stringArrayList.size();
            m2464m("BillingHelper", "Found purchase list of " + size + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase m2460q = m2460q(stringArrayList.get(i), stringArrayList2.get(i));
                if (m2460q != null) {
                    arrayList.add(m2460q);
                }
            }
        } else {
            Purchase m2460q2 = m2460q(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (m2460q2 == null) {
                m2464m("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(m2460q2);
        }
        return arrayList;
    }

    /* renamed from: m */
    public static void m2464m(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i = 40000;
                while (!str2.isEmpty() && i > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    /* renamed from: n */
    public static void m2463n(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: o */
    public static void m2462o(String str, String str2, Throwable th2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th2);
        }
    }

    /* renamed from: p */
    private static int m2461p(Bundle bundle, String str) {
        if (bundle == null) {
            m2463n(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    /* renamed from: q */
    private static Purchase m2460q(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e) {
                m2463n("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return null;
            }
        }
        m2464m("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
