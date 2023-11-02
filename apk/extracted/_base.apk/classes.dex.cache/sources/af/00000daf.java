package com.discord.billing.react.events.serialization;

import com.android.billingclient.api.ProductDetails;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, m14357d2 = {"serializeProductDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "Lcom/android/billingclient/api/ProductDetails;", "billing_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SerializeProductDetailsKt {
    public static final ReadableNativeArray serializeProductDetails(List<ProductDetails> list) {
        int m14093t;
        Object obj;
        long j;
        String str;
        boolean z;
        C9612q.m13917h(list, "<this>");
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (ProductDetails productDetails : list) {
            ArrayList arrayList2 = new ArrayList();
            if (C9612q.m13922c(productDetails.m32589e(), "inapp")) {
                ProductDetails.C2721a m32591c = productDetails.m32591c();
                if (m32591c != null) {
                    C9612q.m13918g(m32591c, "productDetails.oneTimePu…oductDetails.productId}\")");
                    j = m32591c.m32582b();
                    obj = m32591c.m32583a();
                    str = m32591c.m32581c();
                } else {
                    throw new AssertionError("Could not find oneTimePurchaseOfferDetails for product: " + productDetails.m32590d());
                }
            } else {
                obj = null;
                if (C9612q.m13922c(productDetails.m32589e(), "subs")) {
                    List<ProductDetails.C2724d> m32588f = productDetails.m32588f();
                    if (m32588f != null) {
                        Iterator<T> it = m32588f.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((ProductDetails.C2724d) next).m32572a() == null) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                obj = next;
                                break;
                            }
                        }
                        ProductDetails.C2724d c2724d = (ProductDetails.C2724d) obj;
                        if (c2724d != null) {
                            ProductDetails.C2722b c2722b = c2724d.m32569d().m32573a().get(0);
                            if (c2722b != null) {
                                long m32576d = c2722b.m32576d();
                                Object m32577c = c2722b.m32577c();
                                String m32575e = c2722b.m32575e();
                                for (ProductDetails.C2724d c2724d2 : m32588f) {
                                    String m32572a = c2724d2.m32572a();
                                    if (m32572a != null) {
                                        arrayList2.add(m32572a);
                                    }
                                }
                                str = m32575e;
                                j = m32576d;
                                obj = m32577c;
                            } else {
                                throw new AssertionError("Could not find pricingPhase for product: " + productDetails.m32590d());
                            }
                        }
                    }
                    throw new AssertionError("Could not find subscriptionOfferDetails for product: " + productDetails.m32590d());
                }
                j = 0;
                str = null;
            }
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("identifier", productDetails.m32590d()), C11591x.m7577a("title", productDetails.m32587g()), C11591x.m7577a("description", productDetails.m32593a()), C11591x.m7577a("priceString", obj), C11591x.m7577a("currencyCode", str), C11591x.m7577a("price", Integer.valueOf((int) (j / 10000))), C11591x.m7577a("type", productDetails.m32589e()), C11591x.m7577a("offerIds", NativeArrayExtensionsKt.toNativeArray(arrayList2))));
        }
        return NativeArrayExtensionsKt.toNativeArray(arrayList);
    }
}