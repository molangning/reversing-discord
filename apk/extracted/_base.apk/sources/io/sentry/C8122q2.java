package io.sentry;

import io.sentry.util.C8229o;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* renamed from: io.sentry.q2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8122q2 {

    /* renamed from: a */
    private final URL f22026a;

    /* renamed from: b */
    private final Map<String, String> f22027b;

    public C8122q2(String str, Map<String, String> map) {
        C8229o.m18169c(str, "url is required");
        C8229o.m18169c(map, "headers is required");
        try {
            this.f22026a = URI.create(str).toURL();
            this.f22027b = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    /* renamed from: a */
    public Map<String, String> m18465a() {
        return this.f22027b;
    }

    /* renamed from: b */
    public URL m18464b() {
        return this.f22026a;
    }
}
