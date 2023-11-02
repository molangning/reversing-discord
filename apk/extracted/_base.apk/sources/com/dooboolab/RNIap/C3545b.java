package com.dooboolab.RNIap;

import android.util.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000f"}, m14357d2 = {"Lcom/dooboolab/RNIap/b;", "", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "responseCode", "", "b", "Lcom/dooboolab/RNIap/a;", "a", "", "key", "c", "<init>", "()V", "react-native-iap_playRelease"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.dooboolab.RNIap.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C3545b {

    /* renamed from: a */
    public static final C3545b f9642a = new C3545b();

    private C3545b() {
    }

    /* renamed from: a */
    public final C3544a m31784a(int i) {
        C3544a c3544a;
        C3544a c3544a2;
        switch (i) {
            case -2:
                c3544a = new C3544a("E_SERVICE_ERROR", "This feature is not available on your device.");
                break;
            case -1:
                c3544a = new C3544a("E_NETWORK_ERROR", "The service is disconnected (check your internet connection.)");
                break;
            case 0:
                c3544a = new C3544a("OK", "");
                break;
            case 1:
                c3544a = new C3544a("E_USER_CANCELLED", "Payment is Cancelled.");
                break;
            case 2:
                c3544a = new C3544a("E_SERVICE_ERROR", "The service is unreachable. This may be your internet connection, or the Play Store may be down.");
                break;
            case 3:
                c3544a = new C3544a("E_SERVICE_ERROR", "Billing is unavailable. This may be a problem with your device, or the Play Store may be down.");
                break;
            case 4:
                c3544a = new C3544a("E_ITEM_UNAVAILABLE", "That item is unavailable.");
                break;
            case 5:
                c3544a = new C3544a("E_DEVELOPER_ERROR", "Google is indicating that we have some issue connecting to payment.");
                break;
            case 6:
                c3544a2 = new C3544a("E_UNKNOWN", "An unknown or unexpected error has occurred. Please try again later.");
                c3544a = c3544a2;
                break;
            case 7:
                c3544a = new C3544a("E_ALREADY_OWNED", "You already own this item.");
                break;
            default:
                c3544a2 = new C3544a("E_UNKNOWN", "Purchase failed with code: " + i);
                c3544a = c3544a2;
                break;
        }
        Log.e("IapPromises", "Error Code : " + i);
        return c3544a;
    }

    /* renamed from: b */
    public final void m31783b(Promise promise, int i) {
        C9612q.m13917h(promise, "promise");
        C3544a m31784a = m31784a(i);
        C3547d.m31777a(promise, m31784a.m31786a(), m31784a.m31785b());
    }

    /* renamed from: c */
    public final void m31782c(String key, int i) {
        C9612q.m13917h(key, "key");
        C3544a m31784a = m31784a(i);
        C3546c.f9643a.m31779c(key, m31784a.m31786a(), m31784a.m31785b(), null);
    }
}
