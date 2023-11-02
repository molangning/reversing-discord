package com.discord.billing;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.discord.billing.BillingManager;
import com.discord.billing.react.events.serialization.SerializeSkuDetailsKt;
import com.discord.billing.types.SkuDetailsParams;
import com.discord.billing.types.SkuType;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.backoff.ExponentialBackoff;
import com.discord.misc.utilities.backoff.MaxAttemptsExceededException;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.views.image.ReactImageView;
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

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.billing.BillingManager$getSkusWithRetry$1", m13986f = "BillingManager.kt", m13985l = {ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BillingManager$getSkusWithRetry$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExponentialBackoff $getSkusBackoff;
    final /* synthetic */ Function1<Exception, Unit> $onError;
    final /* synthetic */ Promise $reactPromise;
    final /* synthetic */ List<String> $skuIds;
    final /* synthetic */ SkuType $skuType;
    int label;
    final /* synthetic */ BillingManager this$0;

    @Metadata(m14358d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m14357d2 = {"Lcom/discord/billing/BillingManager$SkuDetailsResponse;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.billing.BillingManager$getSkusWithRetry$1$1", m13986f = "BillingManager.kt", m13985l = {312}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.billing.BillingManager$getSkusWithRetry$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C28631 extends AbstractC9578k implements Function1<Continuation<? super BillingManager.SkuDetailsResponse>, Object> {
        final /* synthetic */ List<String> $skuIds;
        final /* synthetic */ SkuType $skuType;
        int label;
        final /* synthetic */ BillingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28631(BillingManager billingManager, SkuType skuType, List<String> list, Continuation<? super C28631> continuation) {
            super(1, continuation);
            this.this$0 = billingManager;
            this.$skuType = skuType;
            this.$skuIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C28631(this.this$0, this.$skuType, this.$skuIds, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super BillingManager.SkuDetailsResponse> continuation) {
            return ((C28631) create(continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            SkuDetailsResponseListener skusWithRetry$createSkuDetailsResponseListener;
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
                skusWithRetry$createSkuDetailsResponseListener = BillingManager.getSkusWithRetry$createSkuDetailsResponseListener(new BillingManager$getSkusWithRetry$1$1$listener$1(m12965b));
                billingClient = this.this$0.billingClient;
                if (billingClient == null) {
                    C9612q.m13900y("billingClient");
                } else {
                    billingClient2 = billingClient;
                }
                billingClient2.mo32474l(SkuDetailsParams.INSTANCE.create(this.$skuType, this.$skuIds), skusWithRetry$createSkuDetailsResponseListener);
                this.label = 1;
                obj = m12965b.mo12975H(this);
                if (obj == m2869d) {
                    return m2869d;
                }
            }
            return obj;
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m14357d2 = {"Lcom/discord/billing/BillingManager$SkuDetailsResponse;", "skuDetailsResponse", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.billing.BillingManager$getSkusWithRetry$1$2", m13986f = "BillingManager.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.billing.BillingManager$getSkusWithRetry$1$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C28642 extends AbstractC9578k implements Function2<BillingManager.SkuDetailsResponse, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BillingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28642(BillingManager billingManager, Continuation<? super C28642> continuation) {
            super(2, continuation);
            this.this$0 = billingManager;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28642 c28642 = new C28642(this.this$0, continuation);
            c28642.L$0 = obj;
            return c28642;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BillingManager.SkuDetailsResponse skuDetailsResponse, Continuation<? super Boolean> continuation) {
            return ((C28642) create(skuDetailsResponse, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            boolean isRetryableError;
            C13277d.m2869d();
            if (this.label == 0) {
                C11586t.m7586b(obj);
                isRetryableError = this.this$0.isRetryableError(((BillingManager.SkuDetailsResponse) this.L$0).getBillingResult());
                return C9568b.m13991a(isRetryableError);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingManager$getSkusWithRetry$1(ExponentialBackoff exponentialBackoff, BillingManager billingManager, Function1<? super Exception, Unit> function1, Promise promise, SkuType skuType, List<String> list, Continuation<? super BillingManager$getSkusWithRetry$1> continuation) {
        super(2, continuation);
        this.$getSkusBackoff = exponentialBackoff;
        this.this$0 = billingManager;
        this.$onError = function1;
        this.$reactPromise = promise;
        this.$skuType = skuType;
        this.$skuIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingManager$getSkusWithRetry$1(this.$getSkusBackoff, this.this$0, this.$onError, this.$reactPromise, this.$skuType, this.$skuIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingManager$getSkusWithRetry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
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
                ExponentialBackoff exponentialBackoff = this.$getSkusBackoff;
                C28631 c28631 = new C28631(this.this$0, this.$skuType, this.$skuIds, null);
                C28642 c28642 = new C28642(this.this$0, null);
                this.label = 1;
                obj = exponentialBackoff.performBackoff(c28631, c28642, this);
                if (obj == m2869d) {
                    return m2869d;
                }
            }
            BillingManager.SkuDetailsResponse skuDetailsResponse = (BillingManager.SkuDetailsResponse) obj;
            BillingResult component1 = skuDetailsResponse.component1();
            List<SkuDetails> component2 = skuDetailsResponse.component2();
            if (component2 == null) {
                this.this$0.invoke(this.$onError, "Sku fetch, details not found");
            } else {
                isNotOk = this.this$0.isNotOk(component1);
                if (isNotOk) {
                    BillingManager billingManager = this.this$0;
                    Function1<Exception, Unit> function1 = this.$onError;
                    int m32600b = component1.m32600b();
                    billingManager.invoke(function1, "Sku fetch, bad response code: " + m32600b);
                } else {
                    ReadableNativeArray serializeSkuDetails = SerializeSkuDetailsKt.serializeSkuDetails(component2);
                    z2 = this.this$0.isProdBuild;
                    if (!z2) {
                        CrashReporting crashReporting = CrashReporting.INSTANCE;
                        String jsonString = NativeArrayExtensionsKt.toJsonString(serializeSkuDetails);
                        CrashReporting.addBreadcrumb$default(crashReporting, "resolving getSkusBackoff with " + jsonString, null, null, 6, null);
                    }
                    this.$reactPromise.resolve(serializeSkuDetails);
                }
            }
        } catch (Exception e) {
            if (e instanceof MaxAttemptsExceededException) {
                z = this.this$0.isProdBuild;
                if (!z) {
                    CrashReporting.INSTANCE.captureException(e);
                }
            } else if (!(e instanceof CancellationException)) {
                CrashReporting.INSTANCE.captureException(e);
            } else {
                throw e;
            }
        }
        return Unit.f25302a;
    }
}