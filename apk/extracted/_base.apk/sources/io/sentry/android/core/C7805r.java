package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C7926g;
import io.sentry.C8002k2;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7992j0;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8215e;
import io.sentry.util.C8229o;
import java.io.File;
import java.io.IOException;

/* renamed from: io.sentry.android.core.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7805r implements InterfaceC7992j0 {

    /* renamed from: h */
    private final InterfaceC8040o0 f21351h;

    /* renamed from: i */
    private final C7798o0 f21352i;

    /* renamed from: a */
    private long f21344a = 0;

    /* renamed from: b */
    private long f21345b = 0;

    /* renamed from: c */
    private long f21346c = 1;

    /* renamed from: d */
    private long f21347d = 1;

    /* renamed from: e */
    private final long f21348e = 1000000000;

    /* renamed from: f */
    private double f21349f = 1.0E9d / 1;

    /* renamed from: g */
    private final File f21350g = new File("/proc/self/stat");

    /* renamed from: j */
    private boolean f21353j = false;

    public C7805r(InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        this.f21351h = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "Logger is required.");
        this.f21352i = (C7798o0) C8229o.m18169c(c7798o0, "BuildInfoProvider is required.");
    }

    /* renamed from: c */
    private long m19683c() {
        String str;
        try {
            str = C8215e.m18230b(this.f21350g);
        } catch (IOException e) {
            this.f21353j = false;
            this.f21351h.mo18136b(EnumC8021m4.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            str = null;
        }
        if (str != null) {
            String[] split = str.trim().split("[\n\t\r ]");
            try {
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[14]);
                return (long) ((parseLong + parseLong2 + Long.parseLong(split[15]) + Long.parseLong(split[16])) * this.f21349f);
            } catch (NumberFormatException e2) {
                this.f21351h.mo18136b(EnumC8021m4.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }

    @Override // io.sentry.InterfaceC7992j0
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo19075a() {
        if (this.f21352i.m19703d() < 21) {
            this.f21353j = false;
            return;
        }
        this.f21353j = true;
        this.f21346c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f21347d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f21349f = 1.0E9d / this.f21346c;
        this.f21345b = m19683c();
    }

    @Override // io.sentry.InterfaceC7992j0
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo19074b(C8002k2 c8002k2) {
        if (this.f21352i.m19703d() >= 21 && this.f21353j) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = elapsedRealtimeNanos - this.f21344a;
            this.f21344a = elapsedRealtimeNanos;
            long m19683c = m19683c();
            this.f21345b = m19683c;
            c8002k2.m19033a(new C7926g(System.currentTimeMillis(), (((m19683c - this.f21345b) / j) / this.f21347d) * 100.0d));
        }
    }
}
