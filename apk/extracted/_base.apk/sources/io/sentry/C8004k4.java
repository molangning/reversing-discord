package io.sentry;

import io.sentry.protocol.C8102r;
import io.sentry.util.C8229o;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.sentry.k4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8004k4 {

    /* renamed from: c */
    private static volatile C8004k4 f21686c;

    /* renamed from: a */
    private final Set<String> f21687a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set<C8102r> f21688b = new CopyOnWriteArraySet();

    private C8004k4() {
    }

    /* renamed from: c */
    public static C8004k4 m19025c() {
        if (f21686c == null) {
            synchronized (C8004k4.class) {
                if (f21686c == null) {
                    f21686c = new C8004k4();
                }
            }
        }
        return f21686c;
    }

    /* renamed from: a */
    public void m19027a(String str) {
        C8229o.m18169c(str, "integration is required.");
        this.f21687a.add(str);
    }

    /* renamed from: b */
    public void m19026b(String str, String str2) {
        C8229o.m18169c(str, "name is required.");
        C8229o.m18169c(str2, "version is required.");
        this.f21688b.add(new C8102r(str, str2));
    }

    /* renamed from: d */
    public Set<String> m19024d() {
        return this.f21687a;
    }

    /* renamed from: e */
    public Set<C8102r> m19023e() {
        return this.f21688b;
    }
}
