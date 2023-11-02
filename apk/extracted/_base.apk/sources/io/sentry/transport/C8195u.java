package io.sentry.transport;

import io.sentry.util.C8229o;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* renamed from: io.sentry.transport.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C8195u extends Authenticator {

    /* renamed from: a */
    private final String f22124a;

    /* renamed from: b */
    private final String f22125b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8195u(String str, String str2) {
        this.f22124a = (String) C8229o.m18169c(str, "user is required");
        this.f22125b = (String) C8229o.m18169c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f22124a, this.f22125b.toCharArray());
        }
        return null;
    }
}
