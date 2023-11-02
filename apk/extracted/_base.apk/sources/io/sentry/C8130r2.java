package io.sentry;

import io.sentry.util.C8229o;
import java.net.URI;
import java.util.HashMap;

/* renamed from: io.sentry.r2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C8130r2 {

    /* renamed from: a */
    private final C8132r4 f22037a;

    public C8130r2(C8132r4 c8132r4) {
        this.f22037a = (C8132r4) C8229o.m18169c(c8132r4, "options is required");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8122q2 m18444a() {
        URI m18477c;
        String str;
        C8119q c8119q = new C8119q(this.f22037a.getDsn());
        String uri = c8119q.m18477c().resolve(m18477c.getPath() + "/envelope/").toString();
        String m18479a = c8119q.m18479a();
        String m18478b = c8119q.m18478b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f22037a.getSentryClientName());
        sb2.append(",sentry_key=");
        sb2.append(m18479a);
        if (m18478b != null && m18478b.length() > 0) {
            str = ",sentry_secret=" + m18478b;
        } else {
            str = "";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        String sentryClientName = this.f22037a.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", sentryClientName);
        hashMap.put("X-Sentry-Auth", sb3);
        return new C8122q2(uri, hashMap);
    }
}
