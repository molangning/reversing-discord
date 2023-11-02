package com.dooboolab.RNIap;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9550o;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\n\u001a\u00020\u0006J,\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rR&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"Lcom/dooboolab/RNIap/c;", "", "", "key", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "a", "value", "d", "b", "code", "message", "Ljava/lang/Exception;", "err", "c", "Ljava/util/HashMap;", "", "Ljava/util/HashMap;", "promises", "<init>", "()V", "react-native-iap_playRelease"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.dooboolab.RNIap.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C3546c {

    /* renamed from: a */
    public static final C3546c f9643a = new C3546c();

    /* renamed from: b */
    private static final HashMap<String, List<Promise>> f9644b = new HashMap<>();

    private C3546c() {
    }

    /* renamed from: a */
    public final void m31781a(String key, Promise promise) {
        C9612q.m13917h(key, "key");
        C9612q.m13917h(promise, "promise");
        HashMap<String, List<Promise>> hashMap = f9644b;
        List<Promise> list = hashMap.get(key);
        if (list == null) {
            list = new ArrayList<>();
            hashMap.put(key, list);
        }
        list.add(promise);
    }

    /* renamed from: b */
    public final void m31780b() {
        HashMap<String, List<Promise>> hashMap = f9644b;
        ArrayList<Promise> arrayList = new ArrayList();
        for (Map.Entry<String, List<Promise>> entry : hashMap.entrySet()) {
            C9550o.m14085y(arrayList, entry.getValue());
        }
        for (Promise promise : arrayList) {
            C3547d.m31776b(promise, "E_CONNECTION_CLOSED", "Connection has been closed", null);
        }
        f9644b.clear();
    }

    /* renamed from: c */
    public final void m31779c(String key, String str, String str2, Exception exc) {
        C9612q.m13917h(key, "key");
        List<Promise> list = f9644b.get(key);
        if (list != null) {
            for (Promise promise : list) {
                C3547d.m31776b(promise, str, str2, exc);
            }
        }
        f9644b.remove(key);
    }

    /* renamed from: d */
    public final void m31778d(String key, Object obj) {
        C9612q.m13917h(key, "key");
        List<Promise> list = f9644b.get(key);
        if (list != null) {
            for (Promise promise : list) {
                C3547d.m31775c(promise, obj);
            }
        }
        f9644b.remove(key);
    }
}
