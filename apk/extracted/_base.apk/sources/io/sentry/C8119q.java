package io.sentry;

import io.sentry.util.C8229o;
import java.net.URI;

/* renamed from: io.sentry.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C8119q {

    /* renamed from: a */
    private final String f22021a;

    /* renamed from: b */
    private final String f22022b;

    /* renamed from: c */
    private final String f22023c;

    /* renamed from: d */
    private final String f22024d;

    /* renamed from: e */
    private final URI f22025e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8119q(String str) {
        String str2;
        try {
            C8229o.m18169c(str, "The DSN is required.");
            URI normalize = new URI(str).normalize();
            String userInfo = normalize.getUserInfo();
            if (userInfo != null && !userInfo.isEmpty()) {
                String[] split = userInfo.split(":", -1);
                String str3 = split[0];
                this.f22024d = str3;
                if (str3 != null && !str3.isEmpty()) {
                    if (split.length > 1) {
                        str2 = split[1];
                    } else {
                        str2 = null;
                    }
                    this.f22023c = str2;
                    String path = normalize.getPath();
                    path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
                    int lastIndexOf = path.lastIndexOf("/") + 1;
                    String substring = path.substring(0, lastIndexOf);
                    if (!substring.endsWith("/")) {
                        substring = substring + "/";
                    }
                    this.f22022b = substring;
                    String substring2 = path.substring(lastIndexOf);
                    this.f22021a = substring2;
                    if (!substring2.isEmpty()) {
                        this.f22025e = new URI(normalize.getScheme(), null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, null, null);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                }
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            throw new IllegalArgumentException("Invalid DSN: No public key provided.");
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    /* renamed from: a */
    public String m18479a() {
        return this.f22024d;
    }

    /* renamed from: b */
    public String m18478b() {
        return this.f22023c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public URI m18477c() {
        return this.f22025e;
    }
}
