package io.sentry.clientreport;

import io.sentry.util.C8229o;

/* renamed from: io.sentry.clientreport.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7873c {

    /* renamed from: a */
    private final String f21485a;

    /* renamed from: b */
    private final String f21486b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7873c(String str, String str2) {
        this.f21485a = str;
        this.f21486b = str2;
    }

    /* renamed from: a */
    public String m19488a() {
        return this.f21486b;
    }

    /* renamed from: b */
    public String m19487b() {
        return this.f21485a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7873c)) {
            return false;
        }
        C7873c c7873c = (C7873c) obj;
        if (C8229o.m18171a(m19487b(), c7873c.m19487b()) && C8229o.m18171a(m19488a(), c7873c.m19488a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8229o.m18170b(m19487b(), m19488a());
    }
}
