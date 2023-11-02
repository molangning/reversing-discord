package io.sentry.config;

import io.sentry.util.C8233s;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.config.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7884d implements InterfaceC7887g {
    /* renamed from: f */
    private String m19469f(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.InterfaceC7887g
    /* renamed from: a */
    public /* synthetic */ Long mo19462a(String str) {
        return C7886f.m19464d(this, str);
    }

    @Override // io.sentry.config.InterfaceC7887g
    /* renamed from: b */
    public /* synthetic */ Double mo19461b(String str) {
        return C7886f.m19466b(this, str);
    }

    @Override // io.sentry.config.InterfaceC7887g
    /* renamed from: c */
    public /* synthetic */ String mo19460c(String str, String str2) {
        return C7886f.m19463e(this, str, str2);
    }

    @Override // io.sentry.config.InterfaceC7887g
    /* renamed from: d */
    public /* synthetic */ List mo19459d(String str) {
        return C7886f.m19465c(this, str);
    }

    @Override // io.sentry.config.InterfaceC7887g
    /* renamed from: e */
    public /* synthetic */ Boolean mo19458e(String str) {
        return C7886f.m19467a(this, str);
    }

    @Override // io.sentry.config.InterfaceC7887g
    public Map<String, String> getMap(String str) {
        String m18155e;
        String str2 = m19469f(str) + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (m18155e = C8233s.m18155e(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), m18155e);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.InterfaceC7887g
    public String getProperty(String str) {
        return C8233s.m18155e(System.getenv(m19469f(str)), "\"");
    }
}