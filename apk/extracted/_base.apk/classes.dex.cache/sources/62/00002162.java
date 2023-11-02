package com.dooboolab.RNIap;

import android.util.Log;
import com.facebook.react.bridge.ObjectAlreadyConsumedException;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001e\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u001a(\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\f"}, m14357d2 = {"Lcom/facebook/react/bridge/Promise;", "", "value", "", "c", "", "code", "message", "a", "", "throwable", "b", "react-native-iap_playRelease"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.dooboolab.RNIap.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C3547d {
    /* renamed from: a */
    public static final void m31777a(Promise promise, String str, String str2) {
        C9612q.m13917h(promise, "<this>");
        m31776b(promise, str, str2, null);
    }

    /* renamed from: b */
    public static final void m31776b(Promise promise, String str, String str2, Throwable th2) {
        C9612q.m13917h(promise, "<this>");
        try {
            promise.reject(str, str2, th2);
        } catch (ObjectAlreadyConsumedException e) {
            Log.d("IapPromises", "Already consumed " + e.getMessage());
        }
    }

    /* renamed from: c */
    public static final void m31775c(Promise promise, Object obj) {
        C9612q.m13917h(promise, "<this>");
        try {
            promise.resolve(obj);
        } catch (ObjectAlreadyConsumedException e) {
            Log.d("IapPromises", "Already consumed " + e.getMessage());
        }
    }
}