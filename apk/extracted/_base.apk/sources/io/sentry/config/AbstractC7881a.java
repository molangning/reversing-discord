package io.sentry.config;

import io.sentry.util.C8229o;
import io.sentry.util.C8233s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: io.sentry.config.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC7881a implements InterfaceC7887g {

    /* renamed from: a */
    private final String f21493a;

    /* renamed from: b */
    private final Properties f21494b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7881a(String str, Properties properties) {
        this.f21493a = (String) C8229o.m18169c(str, "prefix is required");
        this.f21494b = (Properties) C8229o.m18169c(properties, "properties are required");
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
        String str2 = this.f21493a + str + ".";
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f21494b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    hashMap.put(str3.substring(str2.length()), C8233s.m18155e((String) entry.getValue(), "\""));
                }
            }
        }
        return hashMap;
    }

    @Override // io.sentry.config.InterfaceC7887g
    public String getProperty(String str) {
        Properties properties = this.f21494b;
        return C8233s.m18155e(properties.getProperty(this.f21493a + str), "\"");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7881a(Properties properties) {
        this("", properties);
    }
}
