package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.C7991j;
import io.sentry.EnumC8021m4;
import io.sentry.android.core.C7803q0;
import io.sentry.android.core.internal.util.C7761d;
import io.sentry.android.core.internal.util.C7764f;
import io.sentry.android.core.internal.util.C7766h;
import io.sentry.android.core.internal.util.C7771l;
import io.sentry.protocol.C8074e;
import io.sentry.protocol.C8088k;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: io.sentry.android.core.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7813u0 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g */
    private static volatile C7813u0 f21365g;

    /* renamed from: a */
    private final Context f21366a;

    /* renamed from: b */
    private final SentryAndroidOptions f21367b;

    /* renamed from: c */
    private final C7798o0 f21368c;

    /* renamed from: d */
    private final Boolean f21369d;

    /* renamed from: e */
    private final C7803q0.C7804a f21370e;

    /* renamed from: f */
    private final C8088k f21371f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.u0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C7814a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21372a;

        static {
            int[] iArr = new int[C7761d.EnumC7762a.values().length];
            f21372a = iArr;
            try {
                iArr[C7761d.EnumC7762a.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21372a[C7761d.EnumC7762a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C7813u0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f21366a = context;
        this.f21367b = sentryAndroidOptions;
        C7798o0 c7798o0 = new C7798o0(sentryAndroidOptions.getLogger());
        this.f21368c = c7798o0;
        C7764f.m19767a().m19765c();
        this.f21371f = m19661B();
        this.f21369d = c7798o0.m19701f();
        this.f21370e = C7803q0.m19686n(context, sentryAndroidOptions.getLogger(), c7798o0);
    }

    /* renamed from: A */
    private boolean m19662A() {
        String externalStorageState = Environment.getExternalStorageState();
        if (("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private void m19660C(C8074e c8074e, boolean z) {
        Boolean bool;
        Intent m19656d = m19656d();
        if (m19656d != null) {
            c8074e.m18746N(m19655e(m19656d));
            c8074e.m18742R(m19634z(m19656d));
            c8074e.m18745O(m19654f(m19656d));
        }
        int i = C7814a.f21372a[C7761d.m19774b(this.f21366a, this.f21367b.getLogger()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                bool = null;
            } else {
                bool = Boolean.TRUE;
            }
        } else {
            bool = Boolean.FALSE;
        }
        c8074e.m18718h0(bool);
        ActivityManager.MemoryInfo m19692h = C7803q0.m19692h(this.f21366a, this.f21367b.getLogger());
        if (m19692h != null) {
            c8074e.m18726d0(m19643q(m19692h));
            if (z) {
                c8074e.m18737W(Long.valueOf(m19692h.availMem));
                c8074e.m18730b0(Boolean.valueOf(m19692h.lowMemory));
            }
        }
        File externalFilesDir = this.f21366a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            c8074e.m18700q0(m19637w(statFs));
            c8074e.m18736X(m19635y(statFs));
        }
        StatFs m19645o = m19645o(externalFilesDir);
        if (m19645o != null) {
            c8074e.m18739U(m19638v(m19645o));
            c8074e.m18740T(m19636x(m19645o));
        }
        if (c8074e.m18751I() == null) {
            c8074e.m18741S(C7761d.m19773c(this.f21366a, this.f21367b.getLogger(), this.f21368c));
        }
    }

    /* renamed from: b */
    private int m19658b(StatFs statFs) {
        return statFs.getAvailableBlocks();
    }

    /* renamed from: c */
    private long m19657c(StatFs statFs) {
        if (this.f21368c.m19703d() >= 18) {
            return statFs.getAvailableBlocksLong();
        }
        return m19658b(statFs);
    }

    /* renamed from: d */
    private Intent m19656d() {
        return this.f21366a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* renamed from: e */
    private Float m19655e(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    /* renamed from: f */
    private Float m19654f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting battery temperature.", th2);
            return null;
        }
    }

    /* renamed from: g */
    private int m19653g(StatFs statFs) {
        return statFs.getBlockCount();
    }

    /* renamed from: h */
    private long m19652h(StatFs statFs) {
        if (this.f21368c.m19703d() >= 18) {
            return statFs.getBlockCountLong();
        }
        return m19653g(statFs);
    }

    /* renamed from: i */
    private int m19651i(StatFs statFs) {
        return statFs.getBlockSize();
    }

    /* renamed from: j */
    private long m19650j(StatFs statFs) {
        if (this.f21368c.m19703d() >= 18) {
            return statFs.getBlockSizeLong();
        }
        return m19651i(statFs);
    }

    /* renamed from: k */
    private Date m19649k() {
        try {
            return C7991j.m19087d(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e) {
            this.f21367b.getLogger().mo18137a(EnumC8021m4.ERROR, e, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    /* renamed from: l */
    private String m19648l() {
        try {
            return C7823y0.m19620a(this.f21366a);
        } catch (Throwable th2) {
            this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    /* renamed from: m */
    private File[] m19647m() {
        if (this.f21368c.m19703d() >= 19) {
            return this.f21366a.getExternalFilesDirs(null);
        }
        File externalFilesDir = this.f21366a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return new File[]{externalFilesDir};
        }
        return null;
    }

    /* renamed from: n */
    private File m19646n(File file) {
        String str;
        File[] m19647m = m19647m();
        if (m19647m != null) {
            if (file != null) {
                str = file.getAbsolutePath();
            } else {
                str = null;
            }
            for (File file2 : m19647m) {
                if (file2 != null && (str == null || str.isEmpty() || !file2.getAbsolutePath().contains(str))) {
                    return file2;
                }
            }
        } else {
            this.f21367b.getLogger().mo18135c(EnumC8021m4.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    /* renamed from: o */
    private StatFs m19645o(File file) {
        if (!m19662A()) {
            File m19646n = m19646n(file);
            if (m19646n != null) {
                return new StatFs(m19646n.getPath());
            }
            this.f21367b.getLogger().mo18135c(EnumC8021m4.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
        this.f21367b.getLogger().mo18135c(EnumC8021m4.INFO, "External storage is not mounted or emulated.", new Object[0]);
        return null;
    }

    /* renamed from: p */
    public static C7813u0 m19644p(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f21365g == null) {
            synchronized (C7813u0.class) {
                if (f21365g == null) {
                    f21365g = new C7813u0(context.getApplicationContext(), sentryAndroidOptions);
                }
            }
        }
        return f21365g;
    }

    /* renamed from: q */
    private Long m19643q(ActivityManager.MemoryInfo memoryInfo) {
        if (this.f21368c.m19703d() >= 16) {
            return Long.valueOf(memoryInfo.totalMem);
        }
        return Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    /* renamed from: s */
    private C8074e.EnumC8076b m19641s() {
        C8074e.EnumC8076b enumC8076b;
        Throwable th2;
        try {
            enumC8076b = C7766h.m19763a(this.f21366a.getResources().getConfiguration().orientation);
            if (enumC8076b == null) {
                try {
                    this.f21367b.getLogger().mo18135c(EnumC8021m4.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting device orientation.", th2);
                    return enumC8076b;
                }
            }
        } catch (Throwable th4) {
            enumC8076b = null;
            th2 = th4;
        }
        return enumC8076b;
    }

    /* renamed from: u */
    private TimeZone m19639u() {
        LocaleList locales;
        boolean isEmpty;
        Locale locale;
        if (this.f21368c.m19703d() >= 24) {
            locales = this.f21366a.getResources().getConfiguration().getLocales();
            isEmpty = locales.isEmpty();
            if (!isEmpty) {
                locale = locales.get(0);
                return Calendar.getInstance(locale).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    /* renamed from: v */
    private Long m19638v(StatFs statFs) {
        try {
            return Long.valueOf(m19652h(statFs) * m19650j(statFs));
        } catch (Throwable th2) {
            this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting total external storage amount.", th2);
            return null;
        }
    }

    /* renamed from: w */
    private Long m19637w(StatFs statFs) {
        try {
            return Long.valueOf(m19652h(statFs) * m19650j(statFs));
        } catch (Throwable th2) {
            this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting total internal storage amount.", th2);
            return null;
        }
    }

    /* renamed from: x */
    private Long m19636x(StatFs statFs) {
        try {
            return Long.valueOf(m19657c(statFs) * m19650j(statFs));
        } catch (Throwable th2) {
            this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting unused external storage amount.", th2);
            return null;
        }
    }

    /* renamed from: y */
    private Long m19635y(StatFs statFs) {
        try {
            return Long.valueOf(m19657c(statFs) * m19650j(statFs));
        } catch (Throwable th2) {
            this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting unused internal storage amount.", th2);
            return null;
        }
    }

    /* renamed from: z */
    private Boolean m19634z(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            this.f21367b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    /* renamed from: B */
    protected C8088k m19661B() {
        C8088k c8088k = new C8088k();
        c8088k.m18641j("Android");
        c8088k.m18638m(Build.VERSION.RELEASE);
        c8088k.m18643h(Build.DISPLAY);
        String m19693g = C7803q0.m19693g(this.f21367b.getLogger());
        if (m19693g != null) {
            c8088k.m18642i(m19693g);
        }
        if (this.f21367b.isEnableRootCheck()) {
            c8088k.m18640k(Boolean.valueOf(new C7771l(this.f21366a, this.f21368c, this.f21367b.getLogger()).m19752e()));
        }
        return c8088k;
    }

    /* renamed from: a */
    public C8074e m19659a(boolean z, boolean z2) {
        C8074e c8074e = new C8074e();
        if (this.f21367b.isSendDefaultPii()) {
            c8074e.m18720g0(C7803q0.m19696d(this.f21366a, this.f21368c));
        }
        c8074e.m18728c0(Build.MANUFACTURER);
        c8074e.m18743Q(Build.BRAND);
        c8074e.m18738V(C7803q0.m19694f(this.f21367b.getLogger()));
        c8074e.m18724e0(Build.MODEL);
        c8074e.m18722f0(Build.ID);
        c8074e.m18747M(C7803q0.m19697c(this.f21368c));
        c8074e.m18716i0(m19641s());
        Boolean bool = this.f21369d;
        if (bool != null) {
            c8074e.m18702p0(bool);
        }
        DisplayMetrics m19695e = C7803q0.m19695e(this.f21366a, this.f21367b.getLogger());
        if (m19695e != null) {
            c8074e.m18704o0(Integer.valueOf(m19695e.widthPixels));
            c8074e.m18706n0(Integer.valueOf(m19695e.heightPixels));
            c8074e.m18710l0(Float.valueOf(m19695e.density));
            c8074e.m18708m0(Integer.valueOf(m19695e.densityDpi));
        }
        c8074e.m18744P(m19649k());
        c8074e.m18698r0(m19639u());
        if (c8074e.m18750J() == null) {
            c8074e.m18735Y(m19648l());
        }
        Locale locale = Locale.getDefault();
        if (c8074e.m18749K() == null) {
            c8074e.m18734Z(locale.getLanguage());
        }
        if (c8074e.m18748L() == null) {
            c8074e.m18732a0(locale.toString());
        }
        List<Integer> m19765c = C7764f.m19767a().m19765c();
        if (!m19765c.isEmpty()) {
            c8074e.m18712k0(Double.valueOf(((Integer) Collections.max(m19765c)).doubleValue()));
            c8074e.m18714j0(Integer.valueOf(m19765c.size()));
        }
        if (z && this.f21367b.isCollectAdditionalContext()) {
            m19660C(c8074e, z2);
        }
        return c8074e;
    }

    /* renamed from: r */
    public C8088k m19642r() {
        return this.f21371f;
    }

    /* renamed from: t */
    public C7803q0.C7804a m19640t() {
        return this.f21370e;
    }
}
