package com.discord.billing.types;

import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m14357d2 = {"Lcom/discord/billing/types/QueryProductDetailsParams;", "", "()V", "create", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "productType", "Lcom/discord/billing/types/ProductType;", "productIds", "", "", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class QueryProductDetailsParams {
    public static final QueryProductDetailsParams INSTANCE = new QueryProductDetailsParams();

    private QueryProductDetailsParams() {
    }

    public final com.android.billingclient.api.QueryProductDetailsParams create(ProductType productType, List<String> productIds) {
        C9612q.m13917h(productType, "productType");
        C9612q.m13917h(productIds, "productIds");
        ArrayList arrayList = new ArrayList();
        for (String str : productIds) {
            QueryProductDetailsParams.C2726b m32536a = QueryProductDetailsParams.C2726b.m32539a().m32535b(str).m32534c(productType.getRawProductType()).m32536a();
            C9612q.m13918g(m32536a, "newBuilder()\n           …                 .build()");
            arrayList.add(m32536a);
        }
        QueryProductDetailsParams.C2725a m32541b = com.android.billingclient.api.QueryProductDetailsParams.m32545a().m32541b(arrayList);
        C9612q.m13918g(m32541b, "newBuilder().setProductList(productList)");
        com.android.billingclient.api.QueryProductDetailsParams m32542a = m32541b.m32542a();
        C9612q.m13918g(m32542a, "params.build()");
        return m32542a;
    }
}