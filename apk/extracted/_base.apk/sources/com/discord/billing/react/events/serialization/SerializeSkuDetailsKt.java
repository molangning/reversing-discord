package com.discord.billing.react.events.serialization;

import com.android.billingclient.api.SkuDetails;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, m14357d2 = {"serializeSkuDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "Lcom/android/billingclient/api/SkuDetails;", "billing_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SerializeSkuDetailsKt {
    public static final ReadableNativeArray serializeSkuDetails(List<? extends SkuDetails> list) {
        int m14093t;
        C9612q.m13917h(list, "<this>");
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (SkuDetails skuDetails : list) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("identifier", skuDetails.m32527e()), C11591x.m7577a("title", skuDetails.m32526f()), C11591x.m7577a("description", skuDetails.m32531a()), C11591x.m7577a("priceString", skuDetails.m32530b()), C11591x.m7577a("currencyCode", skuDetails.m32528d()), C11591x.m7577a("price", Integer.valueOf((int) (skuDetails.m32529c() / 10000))), C11591x.m7577a("type", skuDetails.m32525g())));
        }
        return NativeArrayExtensionsKt.toNativeArray(arrayList);
    }
}
