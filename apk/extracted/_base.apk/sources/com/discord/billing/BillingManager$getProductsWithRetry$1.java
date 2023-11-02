package com.discord.billing;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.discord.billing.BillingManager;
import com.discord.billing.react.events.serialization.SerializeProductDetailsKt;
import com.discord.billing.types.ProductType;
import com.discord.billing.types.QueryProductDetailsParams;
import com.discord.billing.types.SkuType;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.backoff.ExponentialBackoff;
import com.discord.misc.utilities.backoff.MaxAttemptsExceededException;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableNativeArray;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9915y;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.billing.BillingManager$getProductsWithRetry$1", m13986f = "BillingManager.kt", m13985l = {366}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BillingManager$getProductsWithRetry$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExponentialBackoff $getProductsBackoff;
    final /* synthetic */ Function1<Exception, Unit> $onError;
    final /* synthetic */ Promise $reactPromise;
    final /* synthetic */ List<String> $skuIds;
    final /* synthetic */ SkuType $skuType;
    int label;
    final /* synthetic */ BillingManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m14357d2 = {"Lcom/discord/billing/BillingManager$ProductDetailsResponse;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.billing.BillingManager$getProductsWithRetry$1$1", m13986f = "BillingManager.kt", m13985l = {378}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.billing.BillingManager$getProductsWithRetry$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C28611 extends AbstractC9578k implements Function1<Continuation<? super BillingManager.ProductDetailsResponse>, Object> {
        final /* synthetic */ List<String> $skuIds;
        final /* synthetic */ SkuType $skuType;
        int label;
        final /* synthetic */ BillingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28611(BillingManager billingManager, SkuType skuType, List<String> list, Continuation<? super C28611> continuation) {
            super(1, continuation);
            this.this$0 = billingManager;
            this.$skuType = skuType;
            this.$skuIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C28611(this.this$0, this.$skuType, this.$skuIds, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super BillingManager.ProductDetailsResponse> continuation) {
            return ((C28611) create(continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            ProductDetailsResponseListener productsWithRetry$createProductDetailsResponseListener;
            BillingClient billingClient;
            m2869d = C13277d.m2869d();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                BillingClient billingClient2 = null;
                CompletableDeferred m12965b = C9915y.m12965b(null, 1, null);
                productsWithRetry$createProductDetailsResponseListener = BillingManager.getProductsWithRetry$createProductDetailsResponseListener(new BillingManager$getProductsWithRetry$1$1$listener$1(m12965b));
                billingClient = this.this$0.billingClient;
                if (billingClient == null) {
                    C9612q.m13900y("billingClient");
                } else {
                    billingClient2 = billingClient;
                }
                billingClient2.mo32478h(QueryProductDetailsParams.INSTANCE.create(ProductType.valueOf(this.$skuType.name()), this.$skuIds), productsWithRetry$createProductDetailsResponseListener);
                this.label = 1;
                obj = m12965b.mo12975H(this);
                if (obj == m2869d) {
                    return m2869d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m14357d2 = {"Lcom/discord/billing/BillingManager$ProductDetailsResponse;", "productDetailsResponse", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.billing.BillingManager$getProductsWithRetry$1$2", m13986f = "BillingManager.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.billing.BillingManager$getProductsWithRetry$1$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C28622 extends AbstractC9578k implements Function2<BillingManager.ProductDetailsResponse, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BillingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28622(BillingManager billingManager, Continuation<? super C28622> continuation) {
            super(2, continuation);
            this.this$0 = billingManager;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28622 c28622 = new C28622(this.this$0, continuation);
            c28622.L$0 = obj;
            return c28622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BillingManager.ProductDetailsResponse productDetailsResponse, Continuation<? super Boolean> continuation) {
            return ((C28622) create(productDetailsResponse, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            boolean isRetryableError;
            C13277d.m2869d();
            if (this.label == 0) {
                C11586t.m7586b(obj);
                isRetryableError = this.this$0.isRetryableError(((BillingManager.ProductDetailsResponse) this.L$0).getBillingResult());
                return C9568b.m13991a(isRetryableError);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingManager$getProductsWithRetry$1(ExponentialBackoff exponentialBackoff, BillingManager billingManager, Function1<? super Exception, Unit> function1, Promise promise, SkuType skuType, List<String> list, Continuation<? super BillingManager$getProductsWithRetry$1> continuation) {
        super(2, continuation);
        this.$getProductsBackoff = exponentialBackoff;
        this.this$0 = billingManager;
        this.$onError = function1;
        this.$reactPromise = promise;
        this.$skuType = skuType;
        this.$skuIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingManager$getProductsWithRetry$1(this.$getProductsBackoff, this.this$0, this.$onError, this.$reactPromise, this.$skuType, this.$skuIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingManager$getProductsWithRetry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        boolean z;
        boolean isNotOk;
        boolean z2;
        m2869d = C13277d.m2869d();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                ExponentialBackoff exponentialBackoff = this.$getProductsBackoff;
                C28611 c28611 = new C28611(this.this$0, this.$skuType, this.$skuIds, null);
                C28622 c28622 = new C28622(this.this$0, null);
                this.label = 1;
                obj = exponentialBackoff.performBackoff(c28611, c28622, this);
                if (obj == m2869d) {
                    return m2869d;
                }
            }
            BillingManager.ProductDetailsResponse productDetailsResponse = (BillingManager.ProductDetailsResponse) obj;
            BillingResult component1 = productDetailsResponse.component1();
            List<ProductDetails> component2 = productDetailsResponse.component2();
            if (component2 == null) {
                this.this$0.invoke(this.$onError, "Product fetch, details not found");
            } else {
                isNotOk = this.this$0.isNotOk(component1);
                if (isNotOk) {
                    BillingManager billingManager = this.this$0;
                    Function1<Exception, Unit> function1 = this.$onError;
                    int m32600b = component1.m32600b();
                    billingManager.invoke(function1, "Product fetch, bad response code: " + m32600b);
                } else {
                    try {
                        ReadableNativeArray serializeProductDetails = SerializeProductDetailsKt.serializeProductDetails(component2);
                        z2 = this.this$0.isProdBuild;
                        if (!z2) {
                            CrashReporting crashReporting = CrashReporting.INSTANCE;
                            String jsonString = NativeArrayExtensionsKt.toJsonString(serializeProductDetails);
                            CrashReporting.addBreadcrumb$default(crashReporting, "resolving getProductsBackoff with " + jsonString, null, null, 6, null);
                        }
                        this.$reactPromise.resolve(serializeProductDetails);
                    } catch (AssertionError e) {
                        this.$reactPromise.reject(e);
                    }
                }
            }
        } catch (Exception e2) {
            if (e2 instanceof MaxAttemptsExceededException) {
                z = this.this$0.isProdBuild;
                if (!z) {
                    CrashReporting.INSTANCE.captureException(e2);
                }
            } else if (!(e2 instanceof CancellationException)) {
                CrashReporting.INSTANCE.captureException(e2);
            } else {
                throw e2;
            }
        }
        return Unit.f25302a;
    }
}
