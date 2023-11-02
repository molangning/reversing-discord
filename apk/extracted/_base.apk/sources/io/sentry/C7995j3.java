package io.sentry;

import java.io.File;

/* renamed from: io.sentry.j3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7995j3 {

    /* renamed from: d */
    private static final C7995j3 f21672d = new C7995j3();

    /* renamed from: a */
    private boolean f21673a;

    /* renamed from: b */
    private Boolean f21674b;

    /* renamed from: c */
    private final Object f21675c = new Object();

    private C7995j3() {
    }

    /* renamed from: a */
    public static C7995j3 m19047a() {
        return f21672d;
    }

    /* renamed from: b */
    public Boolean m19046b(String str, boolean z) {
        synchronized (this.f21675c) {
            if (this.f21673a) {
                return this.f21674b;
            } else if (str == null) {
                return null;
            } else {
                boolean z2 = true;
                this.f21673a = true;
                File file = new File(str, "last_crash");
                File file2 = new File(str, ".sentry-native/last_crash");
                if (file.exists()) {
                    file.delete();
                } else {
                    if (file2.exists()) {
                        if (z) {
                            file2.delete();
                        }
                        Boolean valueOf = Boolean.valueOf(z2);
                        this.f21674b = valueOf;
                        return valueOf;
                    }
                    z2 = false;
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    this.f21674b = valueOf2;
                    return valueOf2;
                }
                Boolean valueOf22 = Boolean.valueOf(z2);
                this.f21674b = valueOf22;
                return valueOf22;
            }
        }
    }

    /* renamed from: c */
    public void m19045c(boolean z) {
        synchronized (this.f21675c) {
            if (!this.f21673a) {
                this.f21674b = Boolean.valueOf(z);
                this.f21673a = true;
            }
        }
    }
}
