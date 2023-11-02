package io.sentry.config;

import java.util.List;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.config.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7883c implements InterfaceC7887g {

    /* renamed from: a */
    private final List<InterfaceC7887g> f21498a;

    public C7883c(List<InterfaceC7887g> list) {
        this.f21498a = list;
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
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (InterfaceC7887g interfaceC7887g : this.f21498a) {
            concurrentHashMap.putAll(interfaceC7887g.getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.InterfaceC7887g
    public String getProperty(String str) {
        for (InterfaceC7887g interfaceC7887g : this.f21498a) {
            String property = interfaceC7887g.getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
