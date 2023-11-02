package com.discord.billing.types;

import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p355ti.C12785a;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\tJD\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/billing/types/BillingFlowParams;", "", "()V", "create", "Lcom/android/billingclient/api/BillingFlowParams;", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "skuId", "", "skuIdOld", "purchaseToken", "userId", "createWithProductDetails", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "productId", "productIdOld", "offerId", "getObfuscatedUserId", "getPriceAmountMicros", "", "getProrationMode", "", "oldProductDetails", "newProductDetails", "oldSkuDetails", "newSkuDetails", "billing_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BillingFlowParams {
    public static final BillingFlowParams INSTANCE = new BillingFlowParams();

    private BillingFlowParams() {
    }

    private final String getObfuscatedUserId(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(C12785a.f33142b);
        C9612q.m13918g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        C9612q.m13918g(digest, "getInstance(\"SHA-256\")\n …est(userId.toByteArray())");
        int length = digest.length;
        String str2 = "";
        for (int i = 0; i < length; i++) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[i])}, 1));
            C9612q.m13918g(format, "format(this, *args)");
            str2 = str2 + format;
        }
        return str2;
    }

    private final long getPriceAmountMicros(ProductDetails productDetails) {
        ProductDetails.C2724d c2724d;
        ProductDetails.C2723c m32569d;
        List<ProductDetails.C2722b> m32573a;
        Object obj;
        boolean z;
        if (C9612q.m13922c(productDetails.m32589e(), "inapp")) {
            ProductDetails.C2721a m32591c = productDetails.m32591c();
            if (m32591c != null) {
                return m32591c.m32582b();
            }
            return 0L;
        } else if (C9612q.m13922c(productDetails.m32589e(), "subs")) {
            List<ProductDetails.C2724d> m32588f = productDetails.m32588f();
            ProductDetails.C2722b c2722b = null;
            if (m32588f != null) {
                Iterator<T> it = m32588f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ProductDetails.C2724d) obj).m32572a() == null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c2724d = (ProductDetails.C2724d) obj;
            } else {
                c2724d = null;
            }
            if (c2724d != null && (m32569d = c2724d.m32569d()) != null && (m32573a = m32569d.m32573a()) != null) {
                c2722b = m32573a.get(0);
            }
            if (c2722b != null) {
                return c2722b.m32576d();
            }
            return 0L;
        } else {
            return 0L;
        }
    }

    private final int getProrationMode(ProductDetails productDetails, ProductDetails productDetails2) {
        return getPriceAmountMicros(productDetails2) < getPriceAmountMicros(productDetails) ? 4 : 2;
    }

    public final com.android.billingclient.api.BillingFlowParams create(List<? extends SkuDetails> list, String skuId, String str, String str2, String userId) {
        SkuDetails skuDetails;
        SkuDetails skuDetails2;
        Object obj;
        Object obj2;
        C9612q.m13917h(skuId, "skuId");
        C9612q.m13917h(userId, "userId");
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C9612q.m13922c(((SkuDetails) obj2).m32527e(), skuId)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            skuDetails = (SkuDetails) obj2;
        } else {
            skuDetails = null;
        }
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (C9612q.m13922c(((SkuDetails) obj).m32527e(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            skuDetails2 = (SkuDetails) obj;
        } else {
            skuDetails2 = null;
        }
        if (skuDetails == null || (str != null && skuDetails2 == null)) {
            return null;
        }
        BillingFlowParams.C2715a m32626c = com.android.billingclient.api.BillingFlowParams.m32644a().m32623f(skuDetails).m32626c(getObfuscatedUserId(userId));
        if (skuDetails2 != null && str2 != null) {
            m32626c.m32622g(BillingFlowParams.C2718c.m32613a().m32605c(str2).m32603e(INSTANCE.getProrationMode(skuDetails2, skuDetails)).m32607a());
        }
        return m32626c.m32628a();
    }

    public final com.android.billingclient.api.BillingFlowParams createWithProductDetails(List<ProductDetails> productDetails, String productId, String str, String str2, String userId, String str3) {
        String str4;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        C9612q.m13917h(productDetails, "productDetails");
        C9612q.m13917h(productId, "productId");
        C9612q.m13917h(userId, "userId");
        Iterator<T> it = productDetails.iterator();
        while (true) {
            str4 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (C9612q.m13922c(((ProductDetails) obj).m32590d(), productId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ProductDetails productDetails2 = (ProductDetails) obj;
        if (productDetails2 != null) {
            Iterator<T> it2 = productDetails.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (C9612q.m13922c(((ProductDetails) obj2).m32590d(), str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            ProductDetails productDetails3 = (ProductDetails) obj2;
            if (str != null && productDetails3 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            BillingFlowParams.C2716b.C2717a m32616c = BillingFlowParams.C2716b.m32621a().m32616c(productDetails2);
            C9612q.m13918g(m32616c, "newBuilder()\n           …etails(newProductDetails)");
            if (C9612q.m13922c(productDetails2.m32589e(), "subs")) {
                if (str3 != null) {
                    List<ProductDetails.C2724d> m32588f = productDetails2.m32588f();
                    if (m32588f != null) {
                        Iterator<T> it3 = m32588f.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj4 = it3.next();
                                if (C9612q.m13922c(((ProductDetails.C2724d) obj4).m32572a(), str3)) {
                                    break;
                                }
                            } else {
                                obj4 = null;
                                break;
                            }
                        }
                        ProductDetails.C2724d c2724d = (ProductDetails.C2724d) obj4;
                        if (c2724d != null) {
                            str4 = c2724d.m32570c();
                        }
                    }
                } else {
                    List<ProductDetails.C2724d> m32588f2 = productDetails2.m32588f();
                    if (m32588f2 != null) {
                        Iterator<T> it4 = m32588f2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj3 = it4.next();
                                if (((ProductDetails.C2724d) obj3).m32572a() == null) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        ProductDetails.C2724d c2724d2 = (ProductDetails.C2724d) obj3;
                        if (c2724d2 != null) {
                            str4 = c2724d2.m32570c();
                        }
                    }
                }
                if (str4 != null) {
                    m32616c.m32617b(str4);
                } else {
                    throw new AssertionError("Could not find offer token for productId: " + productDetails2.m32590d() + " offerId: " + str3);
                }
            }
            BillingFlowParams.C2716b m32618a = m32616c.m32618a();
            C9612q.m13918g(m32618a, "params.build()");
            arrayList.add(m32618a);
            BillingFlowParams.C2715a m32627b = com.android.billingclient.api.BillingFlowParams.m32644a().m32624e(arrayList).m32626c(getObfuscatedUserId(userId)).m32627b(false);
            if (productDetails3 != null && str2 != null) {
                m32627b.m32622g(BillingFlowParams.C2718c.m32613a().m32606b(str2).m32604d(INSTANCE.getProrationMode(productDetails3, productDetails2)).m32607a());
            }
            return m32627b.m32628a();
        }
        throw new AssertionError("Could not find product detail for new product");
    }

    private final int getProrationMode(SkuDetails skuDetails, SkuDetails skuDetails2) {
        return skuDetails2.m32529c() < skuDetails.m32529c() ? 4 : 2;
    }
}
