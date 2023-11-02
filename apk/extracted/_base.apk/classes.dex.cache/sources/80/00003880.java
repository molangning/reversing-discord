package io.sentry.android.core.internal.util;

import io.sentry.util.C8215e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.sentry.android.core.internal.util.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7764f {

    /* renamed from: b */
    private static final C7764f f21259b = new C7764f();

    /* renamed from: a */
    private final List<Integer> f21260a = new ArrayList();

    private C7764f() {
    }

    /* renamed from: a */
    public static C7764f m19767a() {
        return f21259b;
    }

    /* renamed from: b */
    String m19766b() {
        return "/sys/devices/system/cpu";
    }

    /* renamed from: c */
    public synchronized List<Integer> m19765c() {
        if (!this.f21260a.isEmpty()) {
            return this.f21260a;
        }
        File[] listFiles = new File(m19766b()).listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        for (File file : listFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String m18230b = C8215e.m18230b(file2);
                        if (m18230b != null) {
                            this.f21260a.add(Integer.valueOf((int) (Long.parseLong(m18230b.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f21260a;
    }
}