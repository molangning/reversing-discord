package com.brentvatne.exoplayer;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.google.android.exoplayer2.upstream.C4519c;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import java.util.Map;
import okhttp3.OkHttpClient;
import p153i8.C7458o;
import p195k8.C9191p0;
import p280p6.C11444b;
import p328rj.C12311o;

/* renamed from: com.brentvatne.exoplayer.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2765b {

    /* renamed from: a */
    private static DataSource.Factory f7436a;

    /* renamed from: b */
    private static InterfaceC4540f.InterfaceC4543c f7437b;

    /* renamed from: c */
    private static String f7438c;

    /* renamed from: a */
    private static DataSource.Factory m32430a(ReactContext reactContext, C7458o c7458o, Map<String, String> map) {
        return new C4519c(reactContext, c7458o, m32429b(reactContext, c7458o, map));
    }

    /* renamed from: b */
    private static InterfaceC4540f.InterfaceC4543c m32429b(ReactContext reactContext, C7458o c7458o, Map<String, String> map) {
        OkHttpClient okHttpClient = OkHttpClientProvider.getOkHttpClient();
        ((CookieJarContainer) okHttpClient.m8799q()).setCookieJar(new C12311o(new ForwardingCookieHandler(reactContext)));
        C11444b c11444b = new C11444b(okHttpClient, m32426e(reactContext), c7458o);
        if (map != null) {
            c11444b.m28634b().m28632b(map);
        }
        return c11444b;
    }

    /* renamed from: c */
    public static DataSource.Factory m32428c(ReactContext reactContext, C7458o c7458o, Map<String, String> map) {
        if (f7436a == null || (map != null && !map.isEmpty())) {
            f7436a = m32430a(reactContext, c7458o, map);
        }
        return f7436a;
    }

    /* renamed from: d */
    public static InterfaceC4540f.InterfaceC4543c m32427d(ReactContext reactContext, C7458o c7458o, Map<String, String> map) {
        if (f7437b == null || (map != null && !map.isEmpty())) {
            f7437b = m32429b(reactContext, c7458o, map);
        }
        return f7437b;
    }

    /* renamed from: e */
    public static String m32426e(ReactContext reactContext) {
        if (f7438c == null) {
            f7438c = C9191p0.m16240k0(reactContext, "ReactNativeVideo");
        }
        return f7438c;
    }

    /* renamed from: f */
    public static void m32425f(DataSource.Factory factory) {
        f7436a = factory;
    }
}
