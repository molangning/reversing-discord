package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.C7798o0;
import io.sentry.util.C8229o;
import java.io.File;
import java.nio.charset.Charset;

/* renamed from: io.sentry.android.core.internal.util.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7771l {

    /* renamed from: g */
    private static final Charset f21270g = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f21271a;

    /* renamed from: b */
    private final C7798o0 f21272b;

    /* renamed from: c */
    private final InterfaceC8040o0 f21273c;

    /* renamed from: d */
    private final String[] f21274d;

    /* renamed from: e */
    private final String[] f21275e;

    /* renamed from: f */
    private final Runtime f21276f;

    public C7771l(Context context, C7798o0 c7798o0, InterfaceC8040o0 interfaceC8040o0) {
        this(context, c7798o0, interfaceC8040o0, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    /* renamed from: a */
    private boolean m19756a() {
        String[] strArr;
        for (String str : this.f21274d) {
            try {
            } catch (RuntimeException e) {
                this.f21273c.mo18137a(EnumC8021m4.ERROR, e, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private boolean m19755b(InterfaceC8040o0 interfaceC8040o0) {
        String[] strArr;
        C7798o0 c7798o0 = new C7798o0(interfaceC8040o0);
        PackageManager packageManager = this.f21271a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f21275e) {
                try {
                    if (c7798o0.m19703d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0055, code lost:
        if (0 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0058, code lost:
        return false;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m19754c() {
        /*
            r6 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = r6.f21276f     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.lang.Process r2 = r3.exec(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.io.InputStream r4 = r2.getInputStream()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.nio.charset.Charset r5 = io.sentry.android.core.internal.util.C7771l.f21270g     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = r1
        L29:
            r0.close()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            r2.destroy()
            return r3
        L30:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
        L39:
            throw r3     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
        L3a:
            r0 = move-exception
            io.sentry.o0 r3 = r6.f21273c     // Catch: java.lang.Throwable -> L59
            io.sentry.m4 r4 = io.sentry.EnumC8021m4.DEBUG     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.mo18136b(r4, r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L58
        L46:
            r2.destroy()
            goto L58
        L4a:
            io.sentry.o0 r0 = r6.f21273c     // Catch: java.lang.Throwable -> L59
            io.sentry.m4 r3 = io.sentry.EnumC8021m4.DEBUG     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "SU isn't found on this Device."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L59
            r0.mo18135c(r3, r4, r5)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L58
            goto L46
        L58:
            return r1
        L59:
            r0 = move-exception
            if (r2 == 0) goto L5f
            r2.destroy()
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.C7771l.m19754c():boolean");
    }

    /* renamed from: d */
    private boolean m19753d() {
        String m19706a = this.f21272b.m19706a();
        if (m19706a != null && m19706a.contains("test-keys")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m19752e() {
        return m19753d() || m19756a() || m19754c() || m19755b(this.f21273c);
    }

    C7771l(Context context, C7798o0 c7798o0, InterfaceC8040o0 interfaceC8040o0, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f21271a = (Context) C8229o.m18169c(context, "The application context is required.");
        this.f21272b = (C7798o0) C8229o.m18169c(c7798o0, "The BuildInfoProvider is required.");
        this.f21273c = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "The Logger is required.");
        this.f21274d = (String[]) C8229o.m18169c(strArr, "The root Files are required.");
        this.f21275e = (String[]) C8229o.m18169c(strArr2, "The root packages are required.");
        this.f21276f = (Runtime) C8229o.m18169c(runtime, "The Runtime is required.");
    }
}