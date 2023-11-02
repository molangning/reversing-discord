package com.discord.billing;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetails;
import com.discord.billing.BillingManager;
import com.discord.logging.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CompletableDeferred;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m14357d2 = {"<anonymous>", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class BillingManager$getSkusWithRetry$1$1$listener$1 extends AbstractC9614s implements Function2<BillingResult, List<? extends SkuDetails>, Unit> {
    final /* synthetic */ CompletableDeferred<BillingManager.SkuDetailsResponse> $deferred;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManager$getSkusWithRetry$1$1$listener$1(CompletableDeferred<BillingManager.SkuDetailsResponse> completableDeferred) {
        super(2);
        this.$deferred = completableDeferred;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(BillingResult billingResult, List<? extends SkuDetails> list) {
        invoke2(billingResult, list);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BillingResult billingResult, List<? extends SkuDetails> skuDetails) {
        C9612q.m13917h(billingResult, "billingResult");
        C9612q.m13917h(skuDetails, "skuDetails");
        if (this.$deferred.mo12974V(new BillingManager.SkuDetailsResponse(billingResult, skuDetails))) {
            return;
        }
        Log.i$default(Log.INSTANCE, "getSkusWithRetry", "CompletableDeferred completed multiple times, indicating multiple callbacks from querySkuDetailsAsync", (Throwable) null, 4, (Object) null);
    }
}
