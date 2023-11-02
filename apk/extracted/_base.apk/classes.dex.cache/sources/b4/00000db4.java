package com.discord.billing.types;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m14357d2 = {"Lcom/discord/billing/types/SkuDetailsParams;", "", "()V", "create", "Lcom/android/billingclient/api/SkuDetailsParams;", "skuType", "Lcom/discord/billing/types/SkuType;", "skuIds", "", "", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SkuDetailsParams {
    public static final SkuDetailsParams INSTANCE = new SkuDetailsParams();

    private SkuDetailsParams() {
    }

    public final com.android.billingclient.api.SkuDetailsParams create(SkuType skuType, List<String> skuIds) {
        C9612q.m13917h(skuType, "skuType");
        C9612q.m13917h(skuIds, "skuIds");
        com.android.billingclient.api.SkuDetailsParams m32513a = com.android.billingclient.api.SkuDetailsParams.m32516c().m32511c(skuType.getRawType()).m32512b(skuIds).m32513a();
        C9612q.m13918g(m32513a, "newBuilder()\n           …Ids)\n            .build()");
        return m32513a;
    }
}