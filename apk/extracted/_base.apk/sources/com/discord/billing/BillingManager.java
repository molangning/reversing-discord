package com.discord.billing;

import android.app.Activity;
import androidx.lifecycle.AbstractC1690i;
import androidx.lifecycle.C1699p;
import androidx.lifecycle.LifecycleOwner;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.discord.billing.BillingManager;
import com.discord.billing.types.ProductType;
import com.discord.billing.types.QueryProductDetailsParams;
import com.discord.billing.types.SkuDetailsParams;
import com.discord.billing.types.SkuType;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.backoff.ExponentialBackoff;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.C9844q1;
import kotlinx.coroutines.CoroutineScope;
import p331s1.C12357d;
import p331s1.InterfaceC12355c;
import p331s1.InterfaceC12360e;
import p331s1.InterfaceC12364g;
import p331s1.InterfaceC12366h;

@Metadata(m14358d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001G\b\u0000\u0018\u00002\u00020\u0001:\u0004QRSTBW\u0012\u0006\u00106\u001a\u00020\b\u0012\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\r0\u0015\u0012\u001e\u0010>\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0=\u0012\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002JF\u0010\u0019\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JF\u0010\u001a\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0002Jf\u0010#\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!2\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u0015H\u0002Jr\u0010)\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!2\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u0015H\u0002J\b\u0010*\u001a\u00020\rH\u0002J\b\u0010+\u001a\u00020\bH\u0002J\u0010\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u000bH\u0002J\f\u0010.\u001a\u00020\b*\u00020\u0006H\u0002J%\u00100\u001a\u00020\r*\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010/\u001a\u00020\u000fH\u0082\u0002J\u000e\u00101\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u00102\u001a\u00020\rJD\u00103\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0003\u001a\u00020\u0002Jr\u0010,\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!2\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u0015J4\u00104\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!2\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u0015J0\u00105\u001a\u00020\r2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!2\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r0\u0015R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R#\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\r0\u00158\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R/\u0010>\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR#\u0010B\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\r0\u00158\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bC\u0010<R\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u0010N¨\u0006U"}, m14357d2 = {"Lcom/discord/billing/BillingManager;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "isRetryableError", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "handlePurchases", "", "skuIds", "Lcom/discord/billing/types/SkuType;", "skuType", "Lcom/facebook/react/bridge/Promise;", "reactPromise", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "getSkusWithRetry", "getProductsWithRetry", "Landroid/app/Activity;", "activity", "skuId", "userId", "oldSkuId", "purchaseToken", "Lkotlin/Function0;", "onSuccess", "purchaseWithSkuDetails", "productId", "Lcom/discord/billing/types/ProductType;", "productType", "oldProductId", "offerId", "purchaseWithProductDetails", "reconnect", "isBillingClientReady", "purchase", "verifyPurchase", "isNotOk", "errorMessage", "invoke", "open", "close", "getSkus", "consumePurchase", "loadPurchases", "isProdBuild", "Z", "", "onConnectionUpdated", "Lkotlin/jvm/functions/Function1;", "getOnConnectionUpdated", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function3;", "onPurchaseUpdated", "Lkotlin/jvm/functions/Function3;", "getOnPurchaseUpdated", "()Lkotlin/jvm/functions/Function3;", "onDowngradeCommand", "getOnDowngradeCommand", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "com/discord/billing/BillingManager$billingClientStateListener$1", "billingClientStateListener", "Lcom/discord/billing/BillingManager$billingClientStateListener$1;", "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "backoff", "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "getBackoff$annotations", "()V", "<init>", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "ConnectionState", "DowngradeCommand", "ProductDetailsResponse", "SkuDetailsResponse", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BillingManager {
    private final ExponentialBackoff backoff;
    private BillingClient billingClient;
    private final BillingManager$billingClientStateListener$1 billingClientStateListener;
    private final boolean isProdBuild;
    private final Function1<Integer, Unit> onConnectionUpdated;
    private final Function1<Integer, Unit> onDowngradeCommand;
    private final Function3<String, String, String, Unit> onPurchaseUpdated;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/billing/BillingManager$ConnectionState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DISCONNECTED", "CONNECTING", "CONNECTED", "ERROR", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum ConnectionState {
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2),
        ERROR(3);
        
        private final int value;

        ConnectionState(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m14357d2 = {"Lcom/discord/billing/BillingManager$DowngradeCommand;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "EXECUTE", "CLEAR", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum DowngradeCommand {
        EXECUTE(0),
        CLEAR(1);
        
        private final int value;

        DowngradeCommand(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/billing/BillingManager$ProductDetailsResponse;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "productDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getProductDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class ProductDetailsResponse {
        private final BillingResult billingResult;
        private final List<ProductDetails> productDetails;

        public ProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
            C9612q.m13917h(billingResult, "billingResult");
            this.billingResult = billingResult;
            this.productDetails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductDetailsResponse copy$default(ProductDetailsResponse productDetailsResponse, BillingResult billingResult, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                billingResult = productDetailsResponse.billingResult;
            }
            if ((i & 2) != 0) {
                list = productDetailsResponse.productDetails;
            }
            return productDetailsResponse.copy(billingResult, list);
        }

        public final BillingResult component1() {
            return this.billingResult;
        }

        public final List<ProductDetails> component2() {
            return this.productDetails;
        }

        public final ProductDetailsResponse copy(BillingResult billingResult, List<ProductDetails> list) {
            C9612q.m13917h(billingResult, "billingResult");
            return new ProductDetailsResponse(billingResult, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ProductDetailsResponse) {
                ProductDetailsResponse productDetailsResponse = (ProductDetailsResponse) obj;
                return C9612q.m13922c(this.billingResult, productDetailsResponse.billingResult) && C9612q.m13922c(this.productDetails, productDetailsResponse.productDetails);
            }
            return false;
        }

        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        public final List<ProductDetails> getProductDetails() {
            return this.productDetails;
        }

        public int hashCode() {
            int hashCode = this.billingResult.hashCode() * 31;
            List<ProductDetails> list = this.productDetails;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            BillingResult billingResult = this.billingResult;
            List<ProductDetails> list = this.productDetails;
            return "ProductDetailsResponse(billingResult=" + billingResult + ", productDetails=" + list + ")";
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/billing/BillingManager$SkuDetailsResponse;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getSkuDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class SkuDetailsResponse {
        private final BillingResult billingResult;
        private final List<SkuDetails> skuDetails;

        /* JADX WARN: Multi-variable type inference failed */
        public SkuDetailsResponse(BillingResult billingResult, List<? extends SkuDetails> list) {
            C9612q.m13917h(billingResult, "billingResult");
            this.billingResult = billingResult;
            this.skuDetails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SkuDetailsResponse copy$default(SkuDetailsResponse skuDetailsResponse, BillingResult billingResult, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                billingResult = skuDetailsResponse.billingResult;
            }
            if ((i & 2) != 0) {
                list = skuDetailsResponse.skuDetails;
            }
            return skuDetailsResponse.copy(billingResult, list);
        }

        public final BillingResult component1() {
            return this.billingResult;
        }

        public final List<SkuDetails> component2() {
            return this.skuDetails;
        }

        public final SkuDetailsResponse copy(BillingResult billingResult, List<? extends SkuDetails> list) {
            C9612q.m13917h(billingResult, "billingResult");
            return new SkuDetailsResponse(billingResult, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SkuDetailsResponse) {
                SkuDetailsResponse skuDetailsResponse = (SkuDetailsResponse) obj;
                return C9612q.m13922c(this.billingResult, skuDetailsResponse.billingResult) && C9612q.m13922c(this.skuDetails, skuDetailsResponse.skuDetails);
            }
            return false;
        }

        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        public final List<SkuDetails> getSkuDetails() {
            return this.skuDetails;
        }

        public int hashCode() {
            int hashCode = this.billingResult.hashCode() * 31;
            List<SkuDetails> list = this.skuDetails;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            BillingResult billingResult = this.billingResult;
            List<SkuDetails> list = this.skuDetails;
            return "SkuDetailsResponse(billingResult=" + billingResult + ", skuDetails=" + list + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.discord.billing.BillingManager$billingClientStateListener$1] */
    public BillingManager(boolean z, Function1<? super Integer, Unit> onConnectionUpdated, Function3<? super String, ? super String, ? super String, Unit> onPurchaseUpdated, Function1<? super Integer, Unit> onDowngradeCommand) {
        C9612q.m13917h(onConnectionUpdated, "onConnectionUpdated");
        C9612q.m13917h(onPurchaseUpdated, "onPurchaseUpdated");
        C9612q.m13917h(onDowngradeCommand, "onDowngradeCommand");
        this.isProdBuild = z;
        this.onConnectionUpdated = onConnectionUpdated;
        this.onPurchaseUpdated = onPurchaseUpdated;
        this.onDowngradeCommand = onDowngradeCommand;
        this.billingClientStateListener = new InterfaceC12355c() { // from class: com.discord.billing.BillingManager$billingClientStateListener$1
            @Override // p331s1.InterfaceC12355c
            public void onBillingServiceDisconnected() {
                BillingClient billingClient;
                BillingManager.this.getOnConnectionUpdated().invoke(Integer.valueOf(BillingManager.ConnectionState.DISCONNECTED.getValue()));
                billingClient = BillingManager.this.billingClient;
                if (billingClient == null) {
                    C9612q.m13900y("billingClient");
                    billingClient = null;
                }
                if (!billingClient.mo32480e()) {
                    BillingManager.this.reconnect();
                }
            }

            @Override // p331s1.InterfaceC12355c
            public void onBillingSetupFinished(BillingResult billingResult) {
                boolean isNotOk;
                ExponentialBackoff exponentialBackoff;
                C9612q.m13917h(billingResult, "billingResult");
                isNotOk = BillingManager.this.isNotOk(billingResult);
                if (isNotOk) {
                    BillingManager.this.reconnect();
                    return;
                }
                exponentialBackoff = BillingManager.this.backoff;
                exponentialBackoff.succeed();
                BillingManager.this.getOnConnectionUpdated().invoke(Integer.valueOf(BillingManager.ConnectionState.CONNECTED.getValue()));
                BillingManager.loadPurchases$default(BillingManager.this, null, null, 3, null);
            }
        };
        this.backoff = new ExponentialBackoff(C9844q1.f25665j, 1000L, 300000L, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumePurchase$lambda$0(BillingManager this$0, Function1 onError, Function0 onSuccess, BillingResult billingResult, String str) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(onError, "$onError");
        C9612q.m13917h(onSuccess, "$onSuccess");
        C9612q.m13917h(billingResult, "billingResult");
        C9612q.m13917h(str, "<anonymous parameter 1>");
        if (this$0.isNotOk(billingResult)) {
            int m32600b = billingResult.m32600b();
            this$0.invoke(onError, "Consume purchase, bad response: " + m32600b);
            return;
        }
        onSuccess.invoke();
    }

    private static /* synthetic */ void getBackoff$annotations() {
    }

    private final CoroutineScope getCoroutineScope(ReactApplicationContext reactApplicationContext) {
        LifecycleOwner lifecycleOwner;
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        AbstractC1690i abstractC1690i = null;
        if (currentActivity instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) currentActivity;
        } else {
            lifecycleOwner = null;
        }
        if (lifecycleOwner != null) {
            abstractC1690i = C1699p.m36032a(lifecycleOwner);
        }
        if (abstractC1690i != null) {
            return abstractC1690i;
        }
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Can't get lifecycleScope for billing client, defaulting to GlobalScope but API might be backing off while the app is background", null, null, 6, null);
        return C9844q1.f25665j;
    }

    private final void getProductsWithRetry(List<String> list, SkuType skuType, Promise promise, Function1<? super Exception, Unit> function1, ReactApplicationContext reactApplicationContext) {
        if (!isBillingClientReady()) {
            invoke(function1, "Billing connection is not ready.");
            return;
        }
        CoroutineScope coroutineScope = getCoroutineScope(reactApplicationContext);
        C9818l.m13179d(coroutineScope, C9677b1.m13570a(), null, new BillingManager$getProductsWithRetry$1(new ExponentialBackoff(coroutineScope, 0L, 0L, 0, 14, null), this, function1, promise, skuType, list, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductDetailsResponseListener getProductsWithRetry$createProductDetailsResponseListener(final Function2<? super BillingResult, ? super List<ProductDetails>, Unit> function2) {
        return new ProductDetailsResponseListener() { // from class: com.discord.billing.d
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            /* renamed from: a */
            public final void mo31774a(BillingResult billingResult, List list) {
                BillingManager.m32110x7f183eb9(Function2.this, billingResult, list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getProductsWithRetry$createProductDetailsResponseListener$lambda$2 */
    public static final void m32110x7f183eb9(Function2 listener, BillingResult billingResult, List productDetails) {
        C9612q.m13917h(listener, "$listener");
        C9612q.m13917h(billingResult, "billingResult");
        C9612q.m13917h(productDetails, "productDetails");
        listener.invoke(billingResult, productDetails);
    }

    private final void getSkusWithRetry(List<String> list, SkuType skuType, Promise promise, Function1<? super Exception, Unit> function1, ReactApplicationContext reactApplicationContext) {
        if (!isBillingClientReady()) {
            invoke(function1, "Billing connection is not ready.");
            return;
        }
        CoroutineScope coroutineScope = getCoroutineScope(reactApplicationContext);
        C9818l.m13179d(coroutineScope, C9677b1.m13570a(), null, new BillingManager$getSkusWithRetry$1(new ExponentialBackoff(coroutineScope, 0L, 0L, 0, 14, null), this, function1, promise, skuType, list, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SkuDetailsResponseListener getSkusWithRetry$createSkuDetailsResponseListener(final Function2<? super BillingResult, ? super List<? extends SkuDetails>, Unit> function2) {
        return new SkuDetailsResponseListener() { // from class: com.discord.billing.a
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            /* renamed from: a */
            public final void mo32109a(BillingResult billingResult, List list) {
                BillingManager.getSkusWithRetry$createSkuDetailsResponseListener$lambda$1(Function2.this, billingResult, list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSkusWithRetry$createSkuDetailsResponseListener$lambda$1(Function2 listener, BillingResult billingResult, List list) {
        C9612q.m13917h(listener, "$listener");
        C9612q.m13917h(billingResult, "billingResult");
        if (list == null) {
            list = C9545j.m14104i();
        }
        listener.invoke(billingResult, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePurchases(BillingResult billingResult, List<? extends Purchase> list) {
        boolean z;
        if (isNotOk(billingResult)) {
            this.onDowngradeCommand.invoke(Integer.valueOf(DowngradeCommand.CLEAR.getValue()));
            return;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.onDowngradeCommand.invoke(Integer.valueOf(DowngradeCommand.EXECUTE.getValue()));
            return;
        }
        for (Purchase purchase : list) {
            verifyPurchase(purchase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invoke(Function1<? super Exception, Unit> function1, String str) {
        C9612q.m13917h(function1, "<this>");
        function1.invoke(new IllegalStateException(str));
    }

    private final boolean isBillingClientReady() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            if (billingClient == null) {
                C9612q.m13900y("billingClient");
                billingClient = null;
            }
            if (billingClient.mo32480e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotOk(BillingResult billingResult) {
        return billingResult.m32600b() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRetryableError(BillingResult billingResult) {
        Set m14002i;
        if (!isNotOk(billingResult)) {
            return false;
        }
        m14002i = C9560w.m14002i(6, -1, 2);
        if (!m14002i.contains(Integer.valueOf(billingResult.m32600b()))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadPurchases$default(BillingManager billingManager, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = BillingManager$loadPurchases$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function1 = BillingManager$loadPurchases$2.INSTANCE;
        }
        billingManager.loadPurchases(function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purchaseWithProductDetails(final Activity activity, final String str, ProductType productType, final String str2, final String str3, final String str4, final String str5, final Function0<Unit> function0, final Function1<? super Exception, Unit> function1) {
        List<String> m14099n;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            C9612q.m13900y("billingClient");
            billingClient = null;
        }
        BillingClient billingClient2 = billingClient;
        QueryProductDetailsParams queryProductDetailsParams = QueryProductDetailsParams.INSTANCE;
        m14099n = C9545j.m14099n(str, str3);
        billingClient2.mo32478h(queryProductDetailsParams.create(productType, m14099n), new ProductDetailsResponseListener() { // from class: com.discord.billing.b
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            /* renamed from: a */
            public final void mo31774a(BillingResult billingResult, List list) {
                BillingManager.purchaseWithProductDetails$lambda$6(BillingManager.this, function1, str, str3, str4, str2, str5, activity, function0, ref$BooleanRef, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseWithProductDetails$lambda$6(BillingManager this$0, Function1 onError, String productId, String str, String str2, String userId, String str3, Activity activity, Function0 onSuccess, Ref$BooleanRef completed, BillingResult billingResult, List productDetails) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(onError, "$onError");
        C9612q.m13917h(productId, "$productId");
        C9612q.m13917h(userId, "$userId");
        C9612q.m13917h(activity, "$activity");
        C9612q.m13917h(onSuccess, "$onSuccess");
        C9612q.m13917h(completed, "$completed");
        C9612q.m13917h(billingResult, "billingResult");
        C9612q.m13917h(productDetails, "productDetails");
        synchronized (this$0) {
            if (completed.f25327j) {
                return;
            }
            completed.f25327j = true;
            Unit unit = Unit.f25302a;
            if (this$0.isNotOk(billingResult)) {
                int m32600b = billingResult.m32600b();
                this$0.invoke(onError, "Purchase failed, bad code: " + m32600b);
                return;
            }
            try {
                BillingFlowParams createWithProductDetails = com.discord.billing.types.BillingFlowParams.INSTANCE.createWithProductDetails(productDetails, productId, str, str2, userId, str3);
                if (createWithProductDetails == null) {
                    this$0.invoke(onError, "Purchase failed, product details not found.");
                    return;
                }
                BillingClient billingClient = this$0.billingClient;
                if (billingClient == null) {
                    C9612q.m13900y("billingClient");
                    billingClient = null;
                }
                billingClient.mo32479f(activity, createWithProductDetails);
                onSuccess.invoke();
            } catch (AssertionError e) {
                String message = e.getMessage();
                C9612q.m13920e(message);
                this$0.invoke(onError, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purchaseWithSkuDetails(final Activity activity, final String str, SkuType skuType, final String str2, final String str3, final String str4, final Function0<Unit> function0, final Function1<? super Exception, Unit> function1) {
        List<String> m14099n;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            C9612q.m13900y("billingClient");
            billingClient = null;
        }
        BillingClient billingClient2 = billingClient;
        SkuDetailsParams skuDetailsParams = SkuDetailsParams.INSTANCE;
        m14099n = C9545j.m14099n(str, str3);
        billingClient2.mo32474l(skuDetailsParams.create(skuType, m14099n), new SkuDetailsResponseListener() { // from class: com.discord.billing.e
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            /* renamed from: a */
            public final void mo32109a(BillingResult billingResult, List list) {
                BillingManager.purchaseWithSkuDetails$lambda$4(BillingManager.this, function1, str, str3, str4, str2, activity, function0, ref$BooleanRef, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseWithSkuDetails$lambda$4(BillingManager this$0, Function1 onError, String skuId, String str, String str2, String userId, Activity activity, Function0 onSuccess, Ref$BooleanRef completed, BillingResult billingResult, List list) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(onError, "$onError");
        C9612q.m13917h(skuId, "$skuId");
        C9612q.m13917h(userId, "$userId");
        C9612q.m13917h(activity, "$activity");
        C9612q.m13917h(onSuccess, "$onSuccess");
        C9612q.m13917h(completed, "$completed");
        C9612q.m13917h(billingResult, "billingResult");
        synchronized (this$0) {
            if (completed.f25327j) {
                return;
            }
            completed.f25327j = true;
            Unit unit = Unit.f25302a;
            if (this$0.isNotOk(billingResult)) {
                int m32600b = billingResult.m32600b();
                this$0.invoke(onError, "Purchase failed, bad code: " + m32600b);
                return;
            }
            BillingFlowParams create = com.discord.billing.types.BillingFlowParams.INSTANCE.create(list, skuId, str, str2, userId);
            if (create == null) {
                this$0.invoke(onError, "Purchase failed, Sku details not found.");
                return;
            }
            BillingClient billingClient = this$0.billingClient;
            if (billingClient == null) {
                C9612q.m13900y("billingClient");
                billingClient = null;
            }
            billingClient.mo32479f(activity, create);
            onSuccess.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reconnect() {
        try {
            this.backoff.fail(new BillingManager$reconnect$1(this, null));
        } catch (Exception unused) {
            this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.ERROR.getValue()));
        }
    }

    private final void verifyPurchase(Purchase purchase) {
        if (purchase.m32560g() == 1 && !purchase.m32555l()) {
            ArrayList<String> m32556k = purchase.m32556k();
            C9612q.m13918g(m32556k, "purchase.skus");
            for (String sku : m32556k) {
                Function3<String, String, String, Unit> function3 = this.onPurchaseUpdated;
                String m32558i = purchase.m32558i();
                C9612q.m13918g(m32558i, "purchase.purchaseToken");
                String m32562e = purchase.m32562e();
                C9612q.m13918g(m32562e, "purchase.packageName");
                C9612q.m13918g(sku, "sku");
                function3.invoke(m32558i, m32562e, sku);
            }
        }
    }

    public final void close() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            if (billingClient == null) {
                C9612q.m13900y("billingClient");
                billingClient = null;
            }
            billingClient.mo32482c();
            this.backoff.cancel();
            return;
        }
        this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.ERROR.getValue()));
    }

    public final void consumePurchase(String purchaseToken, final Function0<Unit> onSuccess, final Function1<? super Exception, Unit> onError) {
        C9612q.m13917h(purchaseToken, "purchaseToken");
        C9612q.m13917h(onSuccess, "onSuccess");
        C9612q.m13917h(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Consume purchase, billing connection is not ready.");
            return;
        }
        C12357d m5430a = C12357d.m5432b().m5429b(purchaseToken).m5430a();
        C9612q.m13918g(m5430a, "newBuilder()\n           …\n                .build()");
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            C9612q.m13900y("billingClient");
            billingClient = null;
        }
        billingClient.mo32483b(m5430a, new InterfaceC12360e() { // from class: com.discord.billing.c
            @Override // p331s1.InterfaceC12360e
            /* renamed from: a */
            public final void mo5428a(BillingResult billingResult, String str) {
                BillingManager.consumePurchase$lambda$0(BillingManager.this, onError, onSuccess, billingResult, str);
            }
        });
    }

    public final Function1<Integer, Unit> getOnConnectionUpdated() {
        return this.onConnectionUpdated;
    }

    public final Function1<Integer, Unit> getOnDowngradeCommand() {
        return this.onDowngradeCommand;
    }

    public final Function3<String, String, String, Unit> getOnPurchaseUpdated() {
        return this.onPurchaseUpdated;
    }

    public final void getSkus(List<String> skuIds, SkuType skuType, Promise reactPromise, Function1<? super Exception, Unit> onError, ReactApplicationContext context) {
        C9612q.m13917h(skuIds, "skuIds");
        C9612q.m13917h(skuType, "skuType");
        C9612q.m13917h(reactPromise, "reactPromise");
        C9612q.m13917h(onError, "onError");
        C9612q.m13917h(context, "context");
        if (!isBillingClientReady()) {
            invoke(onError, "Billing connection is not ready.");
            return;
        }
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            C9612q.m13900y("billingClient");
            billingClient = null;
        }
        BillingResult mo32481d = billingClient.mo32481d("fff");
        C9612q.m13918g(mo32481d, "billingClient.isFeatureS…tureType.PRODUCT_DETAILS)");
        if (isNotOk(mo32481d)) {
            getSkusWithRetry(skuIds, skuType, reactPromise, onError, context);
        } else {
            getProductsWithRetry(skuIds, skuType, reactPromise, onError, context);
        }
    }

    public final void loadPurchases(Function0<Unit> onSuccess, Function1<? super Exception, Unit> onError) {
        C9612q.m13917h(onSuccess, "onSuccess");
        C9612q.m13917h(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Failed to load purchases, billing connection is not ready.");
            return;
        }
        BillingClient billingClient = this.billingClient;
        BillingClient billingClient2 = null;
        if (billingClient == null) {
            C9612q.m13900y("billingClient");
            billingClient = null;
        }
        billingClient.mo32476j("inapp", new InterfaceC12364g() { // from class: com.discord.billing.f
            @Override // p331s1.InterfaceC12364g
            /* renamed from: a */
            public final void mo5426a(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        });
        BillingClient billingClient3 = this.billingClient;
        if (billingClient3 == null) {
            C9612q.m13900y("billingClient");
        } else {
            billingClient2 = billingClient3;
        }
        billingClient2.mo32476j("subs", new InterfaceC12364g() { // from class: com.discord.billing.f
            @Override // p331s1.InterfaceC12364g
            /* renamed from: a */
            public final void mo5426a(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        });
        onSuccess.invoke();
    }

    public final void open(ReactApplicationContext context) {
        C9612q.m13917h(context, "context");
        BillingClient m32647a = BillingClient.m32648g(context).m32646b().m32645c(new InterfaceC12366h() { // from class: com.discord.billing.g
            @Override // p331s1.InterfaceC12366h
            public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        }).m32647a();
        C9612q.m13918g(m32647a, "newBuilder(context)\n    …\n                .build()");
        this.billingClient = m32647a;
        BillingClient billingClient = null;
        if (m32647a == null) {
            C9612q.m13900y("billingClient");
            m32647a = null;
        }
        if (!m32647a.mo32480e()) {
            try {
                BillingClient billingClient2 = this.billingClient;
                if (billingClient2 == null) {
                    C9612q.m13900y("billingClient");
                } else {
                    billingClient = billingClient2;
                }
                billingClient.mo32473m(this.billingClientStateListener);
                this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.CONNECTING.getValue()));
            } catch (Exception unused) {
                this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.ERROR.getValue()));
            }
        }
    }

    public final void purchase(Activity activity, String skuId, SkuType skuType, String userId, String str, String str2, String str3, Function0<Unit> onSuccess, Function1<? super Exception, Unit> onError) {
        C9612q.m13917h(skuId, "skuId");
        C9612q.m13917h(skuType, "skuType");
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(onSuccess, "onSuccess");
        C9612q.m13917h(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Purchase failed, billing connection is not ready.");
        } else if (activity == null) {
            invoke(onError, "Purchase failed, missing current activity.");
        } else {
            BillingClient billingClient = this.billingClient;
            if (billingClient == null) {
                C9612q.m13900y("billingClient");
                billingClient = null;
            }
            BillingResult mo32481d = billingClient.mo32481d("fff");
            C9612q.m13918g(mo32481d, "billingClient.isFeatureS…tureType.PRODUCT_DETAILS)");
            if (isNotOk(mo32481d)) {
                if (str3 != null) {
                    invoke(onError, "Purchase failed, offerId passed for device not supported");
                    return;
                } else {
                    purchaseWithSkuDetails(activity, skuId, skuType, userId, str, str2, onSuccess, onError);
                    return;
                }
            }
            purchaseWithProductDetails(activity, skuId, ProductType.valueOf(skuType.name()), userId, str, str2, str3, onSuccess, onError);
        }
    }
}
