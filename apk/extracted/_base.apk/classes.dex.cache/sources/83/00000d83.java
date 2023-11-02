package com.discord.billing;

import com.discord.billing.react.events.BillingManagerPurchaseUpdated;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "purchaseToken", "", "packageName", "sku", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BillingManagerModule$billingManager$2 extends AbstractC9614s implements Function3<String, String, String, Unit> {
    final /* synthetic */ ReactApplicationContext $reactContext;
    final /* synthetic */ BillingManagerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerModule$billingManager$2(BillingManagerModule billingManagerModule, ReactApplicationContext reactApplicationContext) {
        super(3);
        this.this$0 = billingManagerModule;
        this.$reactContext = reactApplicationContext;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(String purchaseToken, String packageName, String sku) {
        ReactEvents reactEvents;
        C9612q.m13917h(purchaseToken, "purchaseToken");
        C9612q.m13917h(packageName, "packageName");
        C9612q.m13917h(sku, "sku");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.$reactContext, new BillingManagerPurchaseUpdated(purchaseToken, packageName, sku));
    }
}