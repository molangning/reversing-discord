package com.dooboolab.RNIap;

import android.app.Activity;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.C2729a;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.dooboolab.RNIap.RNIapModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p331s1.C12350a;
import p331s1.C12357d;
import p331s1.C12368i;
import p331s1.C12371j;
import p331s1.InterfaceC12353b;
import p331s1.InterfaceC12355c;
import p331s1.InterfaceC12360e;
import p331s1.InterfaceC12362f;
import p331s1.InterfaceC12364g;
import p331s1.InterfaceC12366h;
import p441y8.C13934e;

@ReactModule(name = RNIapModule.TAG)
@Metadata(m14358d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001IB#\u0012\u0006\u0010\u0012\u001a\u000208\u0012\b\b\u0002\u0010;\u001a\u00020:\u0012\b\b\u0002\u0010>\u001a\u00020=¢\u0006\u0004\bF\u0010GJ(\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\"\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0019J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010$\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0007JV\u0010,\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00132\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u00101\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016J\u0010\u00102\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u00103\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0007J\u0010\u00107\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u0012\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006J"}, m14357d2 = {"Lcom/dooboolab/RNIap/RNIapModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Ls1/h;", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "expectedResponseCode", "", "consumeItems", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "isValidResult", "sendUnconsumedPurchases", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "sendEvent", "getName", "Lkotlin/Function1;", "Lcom/android/billingclient/api/BillingClient;", "callback", "ensureConnection", "initConnection", "endConnection", "flushFailedPurchasesCachedAsPending", "type", "Lcom/facebook/react/bridge/ReadableArray;", "skuArr", "getItemsByType", "getAvailableItemsByType", "getPurchaseHistoryByType", "purchaseToken", "prorationMode", "obfuscatedAccountId", "obfuscatedProfileId", "offerTokenArr", "isOfferPersonalized", "buyItemByType", "token", "developerPayLoad", "acknowledgePurchase", "consumeProduct", "onPurchasesUpdated", "startListening", "addListener", "", "count", "removeListeners", "getPackageName", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/android/billingclient/api/BillingClient$a;", "builder", "Lcom/android/billingclient/api/BillingClient$a;", "Ly8/e;", "googleApiAvailability", "Ly8/e;", "billingClientCache", "Lcom/android/billingclient/api/BillingClient;", "", "Lcom/android/billingclient/api/ProductDetails;", "skus", "Ljava/util/Map;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/android/billingclient/api/BillingClient$a;Ly8/e;)V", "Companion", "a", "react-native-iap_playRelease"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RNIapModule extends ReactContextBaseJavaModule implements InterfaceC12366h {
    public static final C3532a Companion = new C3532a(null);
    private static final String PROMISE_BUY_ITEM = "PROMISE_BUY_ITEM";
    public static final String TAG = "RNIapModule";
    private BillingClient billingClientCache;
    private final BillingClient.C2714a builder;
    private final C13934e googleApiAvailability;
    private final ReactApplicationContext reactContext;
    private final Map<String, ProductDetails> skus;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lcom/dooboolab/RNIap/RNIapModule$a;", "", "", RNIapModule.PROMISE_BUY_ITEM, "Ljava/lang/String;", "TAG", "<init>", "()V", "react-native-iap_playRelease"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C3532a {
        private C3532a() {
        }

        public /* synthetic */ C3532a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "b", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C3533b extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: j */
        final /* synthetic */ String f9603j;

        /* renamed from: k */
        final /* synthetic */ RNIapModule f9604k;

        /* renamed from: l */
        final /* synthetic */ Promise f9605l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3533b(String str, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f9603j = str;
            this.f9604k = rNIapModule;
            this.f9605l = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m31809c(RNIapModule this$0, Promise promise, BillingResult billingResult) {
            C9612q.m13917h(this$0, "this$0");
            C9612q.m13917h(promise, "$promise");
            C9612q.m13917h(billingResult, "billingResult");
            if (!this$0.isValidResult(billingResult, promise)) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("responseCode", billingResult.m32600b());
            createMap.putString("debugMessage", billingResult.m32601a());
            C3544a m31784a = C3545b.f9642a.m31784a(billingResult.m32600b());
            createMap.putString("code", m31784a.m31786a());
            createMap.putString("message", m31784a.m31785b());
            C3547d.m31775c(promise, createMap);
        }

        /* renamed from: b */
        public final void m31810b(BillingClient billingClient) {
            C9612q.m13917h(billingClient, "billingClient");
            C12350a m5436a = C12350a.m5438b().m5435b(this.f9603j).m5436a();
            C9612q.m13918g(m5436a, "newBuilder().setPurchase…                ).build()");
            final RNIapModule rNIapModule = this.f9604k;
            final Promise promise = this.f9605l;
            billingClient.mo32484a(m5436a, new InterfaceC12353b() { // from class: com.dooboolab.RNIap.g
                @Override // p331s1.InterfaceC12353b
                /* renamed from: a */
                public final void mo5434a(BillingResult billingResult) {
                    RNIapModule.C3533b.m31809c(RNIapModule.this, promise, billingResult);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31810b(billingClient);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "a", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C3534c extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: j */
        final /* synthetic */ Promise f9606j;

        /* renamed from: k */
        final /* synthetic */ String f9607k;

        /* renamed from: l */
        final /* synthetic */ ReadableArray f9608l;

        /* renamed from: m */
        final /* synthetic */ ReadableArray f9609m;

        /* renamed from: n */
        final /* synthetic */ RNIapModule f9610n;

        /* renamed from: o */
        final /* synthetic */ boolean f9611o;

        /* renamed from: p */
        final /* synthetic */ String f9612p;

        /* renamed from: q */
        final /* synthetic */ String f9613q;

        /* renamed from: r */
        final /* synthetic */ String f9614r;

        /* renamed from: s */
        final /* synthetic */ int f9615s;

        /* renamed from: t */
        final /* synthetic */ Activity f9616t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3534c(Promise promise, String str, ReadableArray readableArray, ReadableArray readableArray2, RNIapModule rNIapModule, boolean z, String str2, String str3, String str4, int i, Activity activity) {
            super(1);
            this.f9606j = promise;
            this.f9607k = str;
            this.f9608l = readableArray;
            this.f9609m = readableArray2;
            this.f9610n = rNIapModule;
            this.f9611o = z;
            this.f9612p = str2;
            this.f9613q = str3;
            this.f9614r = str4;
            this.f9615s = i;
            this.f9616t = activity;
        }

        /* renamed from: a */
        public final void m31808a(BillingClient billingClient) {
            int m14093t;
            int m14093t2;
            String string;
            C9612q.m13917h(billingClient, "billingClient");
            C3546c.f9643a.m31781a(RNIapModule.PROMISE_BUY_ITEM, this.f9606j);
            if (C9612q.m13922c(this.f9607k, "subs") && this.f9608l.size() != this.f9609m.size()) {
                String str = "The number of skus (" + this.f9608l.size() + ") must match: the number of offerTokens (" + this.f9609m.size() + ") for Subscriptions";
                WritableMap createMap = Arguments.createMap();
                createMap.putString("debugMessage", str);
                createMap.putString("code", RNIapModule.PROMISE_BUY_ITEM);
                createMap.putString("message", str);
                RNIapModule rNIapModule = this.f9610n;
                rNIapModule.sendEvent(rNIapModule.reactContext, "purchase-error", createMap);
                C3547d.m31777a(this.f9606j, RNIapModule.PROMISE_BUY_ITEM, str);
                return;
            }
            ArrayList<Object> arrayList = this.f9608l.toArrayList();
            C9612q.m13918g(arrayList, "skuArr.toArrayList()");
            m14093t = C9546k.m14093t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (Object obj : arrayList) {
                arrayList2.add(obj.toString());
            }
            RNIapModule rNIapModule2 = this.f9610n;
            Promise promise = this.f9606j;
            String str2 = this.f9607k;
            ReadableArray readableArray = this.f9609m;
            m14093t2 = C9546k.m14093t(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(m14093t2);
            Iterator it = arrayList2.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    C9545j.m14094s();
                }
                String str3 = (String) next;
                Iterator it2 = it;
                ProductDetails productDetails = (ProductDetails) rNIapModule2.skus.get(str3);
                if (productDetails == null) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putString("debugMessage", "The sku was not found. Please fetch products first by calling getItems");
                    createMap2.putString("code", RNIapModule.PROMISE_BUY_ITEM);
                    createMap2.putString("message", "The sku was not found. Please fetch products first by calling getItems");
                    createMap2.putString("productId", str3);
                    rNIapModule2.sendEvent(rNIapModule2.reactContext, "purchase-error", createMap2);
                    C3547d.m31777a(promise, RNIapModule.PROMISE_BUY_ITEM, "The sku was not found. Please fetch products first by calling getItems");
                    return;
                }
                BillingFlowParams.C2716b.C2717a m32616c = BillingFlowParams.C2716b.m32621a().m32616c(productDetails);
                C9612q.m13918g(m32616c, "newBuilder().setProductDetails(selectedSku)");
                if (C9612q.m13922c(str2, "subs") && (string = readableArray.getString(i)) != null) {
                    m32616c = m32616c.m32617b(string);
                    C9612q.m13918g(m32616c, "productDetailParams.setOfferToken(offerToken)");
                }
                arrayList3.add(m32616c.m32618a());
                it = it2;
                i = i2;
            }
            BillingFlowParams.C2715a m32644a = BillingFlowParams.m32644a();
            C9612q.m13918g(m32644a, "newBuilder()");
            m32644a.m32624e(arrayList3).m32627b(this.f9611o);
            BillingFlowParams.C2718c.C2719a m32613a = BillingFlowParams.C2718c.m32613a();
            C9612q.m13918g(m32613a, "newBuilder()");
            String str4 = this.f9612p;
            if (str4 != null) {
                m32613a.m32606b(str4);
            }
            String str5 = this.f9613q;
            if (str5 != null) {
                m32644a.m32626c(str5);
            }
            String str6 = this.f9614r;
            if (str6 != null) {
                m32644a.m32625d(str6);
            }
            int i3 = this.f9615s;
            if (i3 != -1) {
                if (i3 == 2) {
                    m32613a.m32604d(2);
                    if (!C9612q.m13922c(this.f9607k, "subs")) {
                        WritableMap createMap3 = Arguments.createMap();
                        createMap3.putString("debugMessage", "IMMEDIATE_AND_CHARGE_PRORATED_PRICE for proration mode only works in subscription purchase.");
                        createMap3.putString("code", RNIapModule.PROMISE_BUY_ITEM);
                        createMap3.putString("message", "IMMEDIATE_AND_CHARGE_PRORATED_PRICE for proration mode only works in subscription purchase.");
                        createMap3.putArray("productIds", this.f9608l);
                        RNIapModule rNIapModule3 = this.f9610n;
                        rNIapModule3.sendEvent(rNIapModule3.reactContext, "purchase-error", createMap3);
                        C3547d.m31777a(this.f9606j, RNIapModule.PROMISE_BUY_ITEM, "IMMEDIATE_AND_CHARGE_PRORATED_PRICE for proration mode only works in subscription purchase.");
                        return;
                    }
                } else if (i3 == 3) {
                    m32613a.m32604d(3);
                } else if (i3 == 4) {
                    m32613a.m32604d(4);
                } else if (i3 == 1) {
                    m32613a.m32604d(3);
                } else if (i3 == 5) {
                    m32613a.m32604d(5);
                } else {
                    m32613a.m32604d(0);
                }
            }
            if (this.f9612p != null) {
                BillingFlowParams.C2718c m32607a = m32613a.m32607a();
                C9612q.m13918g(m32607a, "subscriptionUpdateParamsBuilder.build()");
                m32644a.m32622g(m32607a);
            }
            BillingFlowParams m32628a = m32644a.m32628a();
            C9612q.m13918g(m32628a, "builder.build()");
            int m32600b = billingClient.mo32479f(this.f9616t, m32628a).m32600b();
            if (m32600b != 0) {
                C3544a m31784a = C3545b.f9642a.m31784a(m32600b);
                C3547d.m31777a(this.f9606j, m31784a.m31786a(), m31784a.m31785b());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31808a(billingClient);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "b", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C3535d extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: j */
        final /* synthetic */ Purchase f9617j;

        /* renamed from: k */
        final /* synthetic */ int f9618k;

        /* renamed from: l */
        final /* synthetic */ Promise f9619l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3535d(Purchase purchase, int i, Promise promise) {
            super(1);
            this.f9617j = purchase;
            this.f9618k = i;
            this.f9619l = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m31805c(int i, Promise promise, BillingResult billingResult, String str) {
            C9612q.m13917h(promise, "$promise");
            C9612q.m13917h(billingResult, "billingResult");
            if (billingResult.m32600b() != i) {
                C3545b.f9642a.m31783b(promise, billingResult.m32600b());
            } else {
                C3547d.m31775c(promise, Boolean.TRUE);
            }
        }

        /* renamed from: b */
        public final void m31806b(BillingClient billingClient) {
            C9612q.m13917h(billingClient, "billingClient");
            C12357d m5430a = C12357d.m5432b().m5429b(this.f9617j.m32558i()).m5430a();
            C9612q.m13918g(m5430a, "newBuilder().setPurchase…                 .build()");
            final int i = this.f9618k;
            final Promise promise = this.f9619l;
            billingClient.mo32483b(m5430a, new InterfaceC12360e() { // from class: com.dooboolab.RNIap.h
                @Override // p331s1.InterfaceC12360e
                /* renamed from: a */
                public final void mo5428a(BillingResult billingResult, String str) {
                    RNIapModule.C3535d.m31805c(i, promise, billingResult, str);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31806b(billingClient);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "b", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C3536e extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: j */
        final /* synthetic */ C12357d f9620j;

        /* renamed from: k */
        final /* synthetic */ RNIapModule f9621k;

        /* renamed from: l */
        final /* synthetic */ Promise f9622l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3536e(C12357d c12357d, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f9620j = c12357d;
            this.f9621k = rNIapModule;
            this.f9622l = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m31802c(RNIapModule this$0, Promise promise, BillingResult billingResult, String str) {
            C9612q.m13917h(this$0, "this$0");
            C9612q.m13917h(promise, "$promise");
            C9612q.m13917h(billingResult, "billingResult");
            if (!this$0.isValidResult(billingResult, promise)) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("responseCode", billingResult.m32600b());
            createMap.putString("debugMessage", billingResult.m32601a());
            C3544a m31784a = C3545b.f9642a.m31784a(billingResult.m32600b());
            createMap.putString("code", m31784a.m31786a());
            createMap.putString("message", m31784a.m31785b());
            createMap.putString("purchaseToken", str);
            C3547d.m31775c(promise, createMap);
        }

        /* renamed from: b */
        public final void m31803b(BillingClient billingClient) {
            C9612q.m13917h(billingClient, "billingClient");
            C12357d c12357d = this.f9620j;
            final RNIapModule rNIapModule = this.f9621k;
            final Promise promise = this.f9622l;
            billingClient.mo32483b(c12357d, new InterfaceC12360e() { // from class: com.dooboolab.RNIap.i
                @Override // p331s1.InterfaceC12360e
                /* renamed from: a */
                public final void mo5428a(BillingResult billingResult, String str) {
                    RNIapModule.C3536e.m31802c(RNIapModule.this, promise, billingResult, str);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31803b(billingClient);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "b", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C3537f extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: k */
        final /* synthetic */ Promise f9624k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3537f(Promise promise) {
            super(1);
            this.f9624k = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m31799c(RNIapModule this$0, Promise promise, BillingResult billingResult, List list) {
            boolean z;
            C9612q.m13917h(this$0, "this$0");
            C9612q.m13917h(promise, "$promise");
            C9612q.m13917h(billingResult, "billingResult");
            if (!this$0.isValidResult(billingResult, promise)) {
                return;
            }
            if (list == null) {
                C3547d.m31775c(promise, Boolean.FALSE);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Purchase) obj).m32560g() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                C3547d.m31775c(promise, Boolean.FALSE);
            } else {
                this$0.consumeItems(arrayList, promise, 8);
            }
        }

        /* renamed from: b */
        public final void m31800b(BillingClient billingClient) {
            C9612q.m13917h(billingClient, "billingClient");
            C12371j m5418a = C12371j.m5420a().m5417b("inapp").m5418a();
            final RNIapModule rNIapModule = RNIapModule.this;
            final Promise promise = this.f9624k;
            billingClient.mo32475k(m5418a, new InterfaceC12364g() { // from class: com.dooboolab.RNIap.j
                @Override // p331s1.InterfaceC12364g
                /* renamed from: a */
                public final void mo5426a(BillingResult billingResult, List list) {
                    RNIapModule.C3537f.m31799c(RNIapModule.this, promise, billingResult, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31800b(billingClient);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "b", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C3538g extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: j */
        final /* synthetic */ String f9625j;

        /* renamed from: k */
        final /* synthetic */ RNIapModule f9626k;

        /* renamed from: l */
        final /* synthetic */ Promise f9627l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3538g(String str, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f9625j = str;
            this.f9626k = rNIapModule;
            this.f9627l = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m31796c(RNIapModule this$0, Promise promise, WritableNativeArray items, String type, BillingResult billingResult, List list) {
            String str;
            C9612q.m13917h(this$0, "this$0");
            C9612q.m13917h(promise, "$promise");
            C9612q.m13917h(items, "$items");
            C9612q.m13917h(type, "$type");
            C9612q.m13917h(billingResult, "billingResult");
            if (!this$0.isValidResult(billingResult, promise)) {
                return;
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("productId", purchase.m32561f().get(0));
                    WritableArray createArray = Arguments.createArray();
                    List<String> m32561f = purchase.m32561f();
                    C9612q.m13918g(m32561f, "purchase.products");
                    for (String str2 : m32561f) {
                        createArray.pushString(str2);
                    }
                    writableNativeMap.putArray("productIds", createArray);
                    writableNativeMap.putString("transactionId", purchase.m32564c());
                    writableNativeMap.putDouble("transactionDate", purchase.m32559h());
                    writableNativeMap.putString("transactionReceipt", purchase.m32563d());
                    writableNativeMap.putString("orderId", purchase.m32564c());
                    writableNativeMap.putString("purchaseToken", purchase.m32558i());
                    writableNativeMap.putString("developerPayloadAndroid", purchase.m32565b());
                    writableNativeMap.putString("signatureAndroid", purchase.m32557j());
                    writableNativeMap.putInt("purchaseStateAndroid", purchase.m32560g());
                    writableNativeMap.putBoolean("isAcknowledgedAndroid", purchase.m32555l());
                    writableNativeMap.putString("packageNameAndroid", purchase.m32562e());
                    C2729a m32566a = purchase.m32566a();
                    String str3 = null;
                    if (m32566a != null) {
                        str = m32566a.m32510a();
                    } else {
                        str = null;
                    }
                    writableNativeMap.putString("obfuscatedAccountIdAndroid", str);
                    C2729a m32566a2 = purchase.m32566a();
                    if (m32566a2 != null) {
                        str3 = m32566a2.m32509b();
                    }
                    writableNativeMap.putString("obfuscatedProfileIdAndroid", str3);
                    if (C9612q.m13922c(type, "subs")) {
                        writableNativeMap.putBoolean("autoRenewingAndroid", purchase.m32554m());
                    }
                    items.pushMap(writableNativeMap);
                }
            }
            C3547d.m31775c(promise, items);
        }

        /* renamed from: b */
        public final void m31797b(BillingClient billingClient) {
            C9612q.m13917h(billingClient, "billingClient");
            final WritableNativeArray writableNativeArray = new WritableNativeArray();
            C12371j.C12372a m5420a = C12371j.m5420a();
            String str = "subs";
            if (!C9612q.m13922c(this.f9625j, "subs")) {
                str = "inapp";
            }
            C12371j m5418a = m5420a.m5417b(str).m5418a();
            final RNIapModule rNIapModule = this.f9626k;
            final Promise promise = this.f9627l;
            final String str2 = this.f9625j;
            billingClient.mo32475k(m5418a, new InterfaceC12364g() { // from class: com.dooboolab.RNIap.k
                @Override // p331s1.InterfaceC12364g
                /* renamed from: a */
                public final void mo5426a(BillingResult billingResult, List list) {
                    RNIapModule.C3538g.m31796c(RNIapModule.this, promise, writableNativeArray, str2, billingResult, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31797b(billingClient);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "b", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C3539h extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: j */
        final /* synthetic */ ReadableArray f9628j;

        /* renamed from: k */
        final /* synthetic */ String f9629k;

        /* renamed from: l */
        final /* synthetic */ RNIapModule f9630l;

        /* renamed from: m */
        final /* synthetic */ Promise f9631m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3539h(ReadableArray readableArray, String str, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f9628j = readableArray;
            this.f9629k = str;
            this.f9630l = rNIapModule;
            this.f9631m = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m31793c(RNIapModule this$0, Promise promise, BillingResult billingResult, List skuDetailsList) {
            C9612q.m13917h(this$0, "this$0");
            C9612q.m13917h(promise, "$promise");
            C9612q.m13917h(billingResult, "billingResult");
            C9612q.m13917h(skuDetailsList, "skuDetailsList");
            if (!this$0.isValidResult(billingResult, promise)) {
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Iterator it = skuDetailsList.iterator();
            while (it.hasNext()) {
                ProductDetails productDetails = (ProductDetails) it.next();
                Map map = this$0.skus;
                String m32590d = productDetails.m32590d();
                C9612q.m13918g(m32590d, "skuDetails.productId");
                map.put(m32590d, productDetails);
                WritableMap createMap = Arguments.createMap();
                createMap.putString("productId", productDetails.m32590d());
                createMap.putString("title", productDetails.m32587g());
                createMap.putString("description", productDetails.m32593a());
                createMap.putString("productType", productDetails.m32589e());
                createMap.putString(ZeroconfModule.KEY_SERVICE_NAME, productDetails.m32592b());
                WritableMap createMap2 = Arguments.createMap();
                ProductDetails.C2721a m32591c = productDetails.m32591c();
                if (m32591c != null) {
                    createMap2.putString("priceCurrencyCode", m32591c.m32581c());
                    createMap2.putString("formattedPrice", m32591c.m32583a());
                    createMap2.putString("priceAmountMicros", String.valueOf(m32591c.m32582b()));
                    createMap.putMap("oneTimePurchaseOfferDetails", createMap2);
                }
                List<ProductDetails.C2724d> m32588f = productDetails.m32588f();
                if (m32588f != null) {
                    WritableArray createArray2 = Arguments.createArray();
                    for (ProductDetails.C2724d c2724d : m32588f) {
                        WritableMap createMap3 = Arguments.createMap();
                        createMap3.putString("offerToken", c2724d.m32570c());
                        WritableArray createArray3 = Arguments.createArray();
                        List<String> m32571b = c2724d.m32571b();
                        C9612q.m13918g(m32571b, "subscriptionOfferDetailsItem.offerTags");
                        for (String str : m32571b) {
                            createArray3.pushString(str);
                        }
                        createMap3.putArray("offerTags", createArray3);
                        WritableArray createArray4 = Arguments.createArray();
                        List<ProductDetails.C2722b> m32573a = c2724d.m32569d().m32573a();
                        C9612q.m13918g(m32573a, "subscriptionOfferDetails…ngPhases.pricingPhaseList");
                        for (ProductDetails.C2722b c2722b : m32573a) {
                            WritableMap createMap4 = Arguments.createMap();
                            createMap4.putString("formattedPrice", c2722b.m32577c());
                            createMap4.putString("priceCurrencyCode", c2722b.m32575e());
                            createMap4.putString("billingPeriod", c2722b.m32578b());
                            createMap4.putInt("billingCycleCount", c2722b.m32579a());
                            createMap4.putString("priceAmountMicros", String.valueOf(c2722b.m32576d()));
                            createMap4.putInt("recurrenceMode", c2722b.m32574f());
                            createArray4.pushMap(createMap4);
                        }
                        WritableMap createMap5 = Arguments.createMap();
                        createMap5.putArray("pricingPhaseList", createArray4);
                        createMap3.putMap("pricingPhases", createMap5);
                        createArray2.pushMap(createMap3);
                    }
                    createMap.putArray("subscriptionOfferDetails", createArray2);
                }
                createArray.pushMap(createMap);
            }
            C3547d.m31775c(promise, createArray);
        }

        /* renamed from: b */
        public final void m31794b(BillingClient billingClient) {
            String string;
            C9612q.m13917h(billingClient, "billingClient");
            ArrayList arrayList = new ArrayList();
            int size = this.f9628j.size();
            for (int i = 0; i < size; i++) {
                if (this.f9628j.getType(i) == ReadableType.String && (string = this.f9628j.getString(i)) != null) {
                    arrayList.add(QueryProductDetailsParams.C2726b.m32539a().m32535b(string).m32534c(this.f9629k).m32536a());
                }
            }
            QueryProductDetailsParams.C2725a m32541b = QueryProductDetailsParams.m32545a().m32541b(arrayList);
            C9612q.m13918g(m32541b, "newBuilder().setProductList(skuList)");
            QueryProductDetailsParams m32542a = m32541b.m32542a();
            final RNIapModule rNIapModule = this.f9630l;
            final Promise promise = this.f9631m;
            billingClient.mo32478h(m32542a, new ProductDetailsResponseListener() { // from class: com.dooboolab.RNIap.l
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                /* renamed from: a */
                public final void mo31774a(BillingResult billingResult, List list) {
                    RNIapModule.C3539h.m31793c(RNIapModule.this, promise, billingResult, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31794b(billingClient);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "b", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C3540i extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: j */
        final /* synthetic */ String f9632j;

        /* renamed from: k */
        final /* synthetic */ RNIapModule f9633k;

        /* renamed from: l */
        final /* synthetic */ Promise f9634l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3540i(String str, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f9632j = str;
            this.f9633k = rNIapModule;
            this.f9634l = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m31790c(RNIapModule this$0, Promise promise, BillingResult billingResult, List list) {
            C9612q.m13917h(this$0, "this$0");
            C9612q.m13917h(promise, "$promise");
            C9612q.m13917h(billingResult, "billingResult");
            if (!this$0.isValidResult(billingResult, promise)) {
                return;
            }
            Log.d(RNIapModule.TAG, String.valueOf(list));
            WritableArray createArray = Arguments.createArray();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("productId", purchaseHistoryRecord.m32550c().get(0));
                    WritableArray createArray2 = Arguments.createArray();
                    List<String> m32550c = purchaseHistoryRecord.m32550c();
                    C9612q.m13918g(m32550c, "purchase.products");
                    for (String str : m32550c) {
                        createArray2.pushString(str);
                    }
                    createMap.putArray("productIds", createArray2);
                    createMap.putDouble("transactionDate", purchaseHistoryRecord.m32549d());
                    createMap.putString("transactionReceipt", purchaseHistoryRecord.m32551b());
                    createMap.putString("purchaseToken", purchaseHistoryRecord.m32548e());
                    createMap.putString("dataAndroid", purchaseHistoryRecord.m32551b());
                    createMap.putString("signatureAndroid", purchaseHistoryRecord.m32547f());
                    createMap.putString("developerPayload", purchaseHistoryRecord.m32552a());
                    createArray.pushMap(createMap);
                }
            }
            C3547d.m31775c(promise, createArray);
        }

        /* renamed from: b */
        public final void m31791b(BillingClient billingClient) {
            C9612q.m13917h(billingClient, "billingClient");
            C12368i.C12369a m5425a = C12368i.m5425a();
            String str = "subs";
            if (!C9612q.m13922c(this.f9632j, "subs")) {
                str = "inapp";
            }
            C12368i m5423a = m5425a.m5422b(str).m5423a();
            final RNIapModule rNIapModule = this.f9633k;
            final Promise promise = this.f9634l;
            billingClient.mo32477i(m5423a, new InterfaceC12362f() { // from class: com.dooboolab.RNIap.m
                @Override // p331s1.InterfaceC12362f
                /* renamed from: a */
                public final void mo5427a(BillingResult billingResult, List list) {
                    RNIapModule.C3540i.m31790c(RNIapModule.this, promise, billingResult, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31791b(billingClient);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, m14357d2 = {"com/dooboolab/RNIap/RNIapModule$j", "Ls1/c;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "onBillingSetupFinished", "onBillingServiceDisconnected", "react-native-iap_playRelease"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C3541j implements InterfaceC12355c {

        /* renamed from: b */
        final /* synthetic */ Promise f9636b;

        C3541j(Promise promise) {
            this.f9636b = promise;
        }

        @Override // p331s1.InterfaceC12355c
        public void onBillingServiceDisconnected() {
            Log.i(RNIapModule.TAG, "Billing service disconnected");
        }

        @Override // p331s1.InterfaceC12355c
        public void onBillingSetupFinished(BillingResult billingResult) {
            C9612q.m13917h(billingResult, "billingResult");
            if (!RNIapModule.this.isValidResult(billingResult, this.f9636b)) {
                return;
            }
            C3547d.m31775c(this.f9636b, Boolean.TRUE);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"com/dooboolab/RNIap/RNIapModule$k", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "onHostResume", "onHostPause", "onHostDestroy", "react-native-iap_playRelease"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C3542k implements LifecycleEventListener {
        C3542k() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            BillingClient billingClient = RNIapModule.this.billingClientCache;
            if (billingClient != null) {
                billingClient.mo32482c();
            }
            RNIapModule.this.billingClientCache = null;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/android/billingclient/api/BillingClient;", "billingClient", "", "b", "(Lcom/android/billingclient/api/BillingClient;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.dooboolab.RNIap.RNIapModule$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C3543l extends AbstractC9614s implements Function1<BillingClient, Unit> {

        /* renamed from: j */
        final /* synthetic */ Promise f9638j;

        /* renamed from: k */
        final /* synthetic */ RNIapModule f9639k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3543l(Promise promise, RNIapModule rNIapModule) {
            super(1);
            this.f9638j = promise;
            this.f9639k = rNIapModule;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m31787c(RNIapModule this$0, Promise promise, BillingResult billingResult, List list) {
            C9612q.m13917h(this$0, "this$0");
            C9612q.m13917h(promise, "$promise");
            C9612q.m13917h(billingResult, "billingResult");
            C9612q.m13917h(list, "list");
            if (!this$0.isValidResult(billingResult, promise)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((Purchase) obj).m32555l()) {
                    arrayList.add(obj);
                }
            }
            this$0.onPurchasesUpdated(billingResult, arrayList);
        }

        /* renamed from: b */
        public final void m31788b(BillingClient billingClient) {
            C9612q.m13917h(billingClient, "billingClient");
            String[] strArr = {"inapp", "subs"};
            for (int i = 0; i < 2; i++) {
                C12371j m5418a = C12371j.m5420a().m5417b(strArr[i]).m5418a();
                final RNIapModule rNIapModule = this.f9639k;
                final Promise promise = this.f9638j;
                billingClient.mo32475k(m5418a, new InterfaceC12364g() { // from class: com.dooboolab.RNIap.n
                    @Override // p331s1.InterfaceC12364g
                    /* renamed from: a */
                    public final void mo5426a(BillingResult billingResult, List list) {
                        RNIapModule.C3543l.m31787c(RNIapModule.this, promise, billingResult, list);
                    }
                });
            }
            C3547d.m31775c(this.f9638j, Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            m31788b(billingClient);
            return Unit.f25302a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ RNIapModule(com.facebook.react.bridge.ReactApplicationContext r1, com.android.billingclient.api.BillingClient.C2714a r2, p441y8.C13934e r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L11
            com.android.billingclient.api.BillingClient$a r2 = com.android.billingclient.api.BillingClient.m32648g(r1)
            com.android.billingclient.api.BillingClient$a r2 = r2.m32646b()
            java.lang.String r5 = "newBuilder(reactContext).enablePendingPurchases()"
            kotlin.jvm.internal.C9612q.m13918g(r2, r5)
        L11:
            r4 = r4 & 4
            if (r4 == 0) goto L1e
            y8.e r3 = p441y8.C13934e.m1136k()
            java.lang.String r4 = "getInstance()"
            kotlin.jvm.internal.C9612q.m13918g(r3, r4)
        L1e:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dooboolab.RNIap.RNIapModule.<init>(com.facebook.react.bridge.ReactApplicationContext, com.android.billingclient.api.BillingClient$a, y8.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeItems(List<? extends Purchase> list, Promise promise, int i) {
        for (Purchase purchase : list) {
            ensureConnection(promise, new C3535d(purchase, i, promise));
        }
    }

    static /* synthetic */ void consumeItems$default(RNIapModule rNIapModule, List list, Promise promise, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        rNIapModule.consumeItems(list, promise, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureConnection$lambda$0(RNIapModule this$0, Function1 callback, Promise promise, Object[] it) {
        boolean z;
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(promise, "$promise");
        C9612q.m13918g(it, "it");
        boolean z2 = true;
        if (it.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Object obj = it[0];
            if (obj instanceof Boolean) {
                C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj).booleanValue()) {
                    BillingClient billingClient = this$0.billingClientCache;
                    if (billingClient == null || !billingClient.mo32480e()) {
                        z2 = false;
                    }
                    if (z2) {
                        callback.invoke(billingClient);
                        return;
                    } else {
                        C3547d.m31777a(promise, "E_NOT_PREPARED", "Unable to auto-initialize connection");
                        return;
                    }
                }
            }
        }
        Log.i(TAG, "Incorrect parameter in resolve");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureConnection$lambda$1(Promise promise, Object[] objArr) {
        C9612q.m13917h(promise, "$promise");
        if (objArr.length > 1) {
            Object obj = objArr[0];
            if ((obj instanceof String) && (objArr[1] instanceof String)) {
                C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                C9612q.m13919f(obj2, "null cannot be cast to non-null type kotlin.String");
                C3547d.m31777a(promise, (String) obj, (String) obj2);
                return;
            }
        }
        Log.i(TAG, "Incorrect parameters in reject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidResult(BillingResult billingResult, Promise promise) {
        Log.d(TAG, "responseCode: " + billingResult.m32600b());
        if (billingResult.m32600b() != 0) {
            C3545b.f9642a.m31783b(promise, billingResult.m32600b());
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    private final void sendUnconsumedPurchases(Promise promise) {
        ensureConnection(promise, new C3543l(promise, this));
    }

    @ReactMethod
    public final void acknowledgePurchase(String token, String str, Promise promise) {
        C9612q.m13917h(token, "token");
        C9612q.m13917h(promise, "promise");
        ensureConnection(promise, new C3533b(token, this, promise));
    }

    @ReactMethod
    public final void addListener(String eventName) {
        C9612q.m13917h(eventName, "eventName");
    }

    @ReactMethod
    public final void buyItemByType(String type, ReadableArray skuArr, String str, int i, String str2, String str3, ReadableArray offerTokenArr, boolean z, Promise promise) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(skuArr, "skuArr");
        C9612q.m13917h(offerTokenArr, "offerTokenArr");
        C9612q.m13917h(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C3547d.m31777a(promise, "E_UNKNOWN", "getCurrentActivity returned null");
        } else {
            ensureConnection(promise, new C3534c(promise, type, skuArr, offerTokenArr, this, z, str, str2, str3, i, currentActivity));
        }
    }

    @ReactMethod
    public final void consumeProduct(String token, String str, Promise promise) {
        C9612q.m13917h(token, "token");
        C9612q.m13917h(promise, "promise");
        C12357d m5430a = C12357d.m5432b().m5429b(token).m5430a();
        C9612q.m13918g(m5430a, "newBuilder().setPurchaseToken(token).build()");
        ensureConnection(promise, new C3536e(m5430a, this, promise));
    }

    @ReactMethod
    public final void endConnection(Promise promise) {
        C9612q.m13917h(promise, "promise");
        BillingClient billingClient = this.billingClientCache;
        if (billingClient != null) {
            billingClient.mo32482c();
        }
        this.billingClientCache = null;
        this.skus.clear();
        C3546c.f9643a.m31780b();
        C3547d.m31775c(promise, Boolean.TRUE);
    }

    public final void ensureConnection(final Promise promise, final Function1<? super BillingClient, Unit> callback) {
        C9612q.m13917h(promise, "promise");
        C9612q.m13917h(callback, "callback");
        BillingClient billingClient = this.billingClientCache;
        boolean z = false;
        if (billingClient != null && billingClient.mo32480e()) {
            z = true;
        }
        if (z) {
            callback.invoke(billingClient);
        } else {
            initConnection(new PromiseImpl(new Callback() { // from class: com.dooboolab.RNIap.e
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    RNIapModule.ensureConnection$lambda$0(RNIapModule.this, callback, promise, objArr);
                }
            }, new Callback() { // from class: com.dooboolab.RNIap.f
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    RNIapModule.ensureConnection$lambda$1(Promise.this, objArr);
                }
            }));
        }
    }

    @ReactMethod
    public final void flushFailedPurchasesCachedAsPending(Promise promise) {
        C9612q.m13917h(promise, "promise");
        ensureConnection(promise, new C3537f(promise));
    }

    @ReactMethod
    public final void getAvailableItemsByType(String type, Promise promise) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(promise, "promise");
        ensureConnection(promise, new C3538g(type, this, promise));
    }

    @ReactMethod
    public final void getItemsByType(String type, ReadableArray skuArr, Promise promise) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(skuArr, "skuArr");
        C9612q.m13917h(promise, "promise");
        ensureConnection(promise, new C3539h(skuArr, type, this, promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void getPackageName(Promise promise) {
        C9612q.m13917h(promise, "promise");
        promise.resolve(getReactApplicationContext().getPackageName());
    }

    @ReactMethod
    public final void getPurchaseHistoryByType(String type, Promise promise) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(promise, "promise");
        ensureConnection(promise, new C3540i(type, this, promise));
    }

    @ReactMethod
    public final void initConnection(Promise promise) {
        C9612q.m13917h(promise, "promise");
        if (this.googleApiAvailability.mo1121e(this.reactContext) != 0) {
            Log.i(TAG, "Google Play Services are not available on this device");
            C3547d.m31777a(promise, "E_NOT_PREPARED", "Google Play Services are not available on this device");
            return;
        }
        BillingClient billingClient = this.billingClientCache;
        boolean z = false;
        if (billingClient != null && billingClient.mo32480e()) {
            z = true;
        }
        if (z) {
            Log.i(TAG, "Already initialized, you should only call initConnection() once when your app starts");
            C3547d.m31775c(promise, Boolean.TRUE);
            return;
        }
        BillingClient m32647a = this.builder.m32645c(this).m32647a();
        this.billingClientCache = m32647a;
        m32647a.mo32473m(new C3541j(promise));
    }

    @Override // p331s1.InterfaceC12366h
    public void onPurchasesUpdated(BillingResult billingResult, List<? extends Purchase> list) {
        C9612q.m13917h(billingResult, "billingResult");
        int m32600b = billingResult.m32600b();
        if (m32600b != 0) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("responseCode", m32600b);
            createMap.putString("debugMessage", billingResult.m32601a());
            C3545b c3545b = C3545b.f9642a;
            C3544a m31784a = c3545b.m31784a(m32600b);
            createMap.putString("code", m31784a.m31786a());
            createMap.putString("message", m31784a.m31785b());
            sendEvent(this.reactContext, "purchase-error", createMap);
            c3545b.m31782c(PROMISE_BUY_ITEM, m32600b);
        } else if (list != null) {
            WritableArray createArray = Arguments.createArray();
            C9612q.m13918g(createArray, "createArray()");
            for (Purchase purchase : list) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("productId", purchase.m32561f().get(0));
                WritableArray createArray2 = Arguments.createArray();
                List<String> m32561f = purchase.m32561f();
                C9612q.m13918g(m32561f, "purchase.products");
                for (String str : m32561f) {
                    createArray2.pushString(str);
                }
                createMap2.putArray("productIds", createArray2);
                createMap2.putString("transactionId", purchase.m32564c());
                createMap2.putDouble("transactionDate", purchase.m32559h());
                createMap2.putString("transactionReceipt", purchase.m32563d());
                createMap2.putString("purchaseToken", purchase.m32558i());
                createMap2.putString("dataAndroid", purchase.m32563d());
                createMap2.putString("signatureAndroid", purchase.m32557j());
                createMap2.putBoolean("autoRenewingAndroid", purchase.m32554m());
                createMap2.putBoolean("isAcknowledgedAndroid", purchase.m32555l());
                createMap2.putInt("purchaseStateAndroid", purchase.m32560g());
                createMap2.putString("packageNameAndroid", purchase.m32562e());
                createMap2.putString("developerPayloadAndroid", purchase.m32565b());
                C2729a m32566a = purchase.m32566a();
                if (m32566a != null) {
                    createMap2.putString("obfuscatedAccountIdAndroid", m32566a.m32510a());
                    createMap2.putString("obfuscatedProfileIdAndroid", m32566a.m32509b());
                }
                createArray.pushMap(createMap2.copy());
                sendEvent(this.reactContext, "purchase-updated", createMap2);
            }
            C3546c.f9643a.m31778d(PROMISE_BUY_ITEM, createArray);
        } else {
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putInt("responseCode", billingResult.m32600b());
            createMap3.putString("debugMessage", billingResult.m32601a());
            createMap3.putString("extraMessage", "The purchases are null. This is a normal behavior if you have requested DEFERRED proration. If not please report an issue.");
            sendEvent(this.reactContext, "purchase-updated", createMap3);
            C3546c.f9643a.m31778d(PROMISE_BUY_ITEM, null);
        }
    }

    @ReactMethod
    public final void removeListeners(double d) {
    }

    @ReactMethod
    public final void startListening(Promise promise) {
        C9612q.m13917h(promise, "promise");
        sendUnconsumedPurchases(promise);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNIapModule(ReactApplicationContext reactContext, BillingClient.C2714a builder, C13934e googleApiAvailability) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        C9612q.m13917h(builder, "builder");
        C9612q.m13917h(googleApiAvailability, "googleApiAvailability");
        this.reactContext = reactContext;
        this.builder = builder;
        this.googleApiAvailability = googleApiAvailability;
        this.skus = new LinkedHashMap();
        reactContext.addLifecycleEventListener(new C3542k());
    }
}
