package com.discord.billing.types;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m14357d2 = {"Lcom/discord/billing/types/ProductType;", "", "rawProductType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawProductType", "()Ljava/lang/String;", "IAP", "SUBSCRIPTIONS", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public enum ProductType {
    IAP("inapp"),
    SUBSCRIPTIONS("subs");
    
    private final String rawProductType;

    ProductType(String str) {
        this.rawProductType = str;
    }

    public final String getRawProductType() {
        return this.rawProductType;
    }
}
