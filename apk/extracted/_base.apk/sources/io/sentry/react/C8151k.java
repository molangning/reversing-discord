package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import io.sentry.AbstractC8003k3;
import io.sentry.C7831b0;
import io.sentry.C7896d3;
import io.sentry.C7901e;
import io.sentry.C7923f4;
import io.sentry.C7961i0;
import io.sentry.C7991j;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8040o0;
import io.sentry.InterfaceC8164t2;
import io.sentry.Scope;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.C7710b1;
import io.sentry.android.core.C7792m0;
import io.sentry.android.core.C7793m1;
import io.sentry.android.core.C7798o0;
import io.sentry.android.core.C7806r0;
import io.sentry.android.core.C7809t;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.android.core.internal.util.C7773n;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8066b0;
import io.sentry.protocol.C8096o;
import io.sentry.protocol.C8098p;
import io.sentry.protocol.C8102r;
import io.sentry.util.C8224k;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.react.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8151k {

    /* renamed from: e */
    private static final InterfaceC8040o0 f22063e;

    /* renamed from: f */
    private static final C7798o0 f22064f;

    /* renamed from: g */
    private static final Charset f22065g;

    /* renamed from: h */
    private static boolean f22066h;

    /* renamed from: a */
    private final ReactApplicationContext f22067a;

    /* renamed from: b */
    private final PackageInfo f22068b;

    /* renamed from: c */
    private FrameMetricsAggregator f22069c = null;

    /* renamed from: d */
    private boolean f22070d;

    static {
        C7809t c7809t = new C7809t("RNSentry");
        f22063e = c7809t;
        f22064f = new C7798o0(c7809t);
        f22065g = Charset.forName("UTF-8");
    }

    public C8151k(ReactApplicationContext reactApplicationContext) {
        this.f22068b = m18432B(reactApplicationContext);
        this.f22067a = reactApplicationContext;
    }

    /* renamed from: A */
    private Activity m18433A() {
        return this.f22067a.getCurrentActivity();
    }

    /* renamed from: B */
    private static PackageInfo m18432B(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            f22063e.mo18135c(EnumC8021m4.WARNING, "Error getting package info.", new Object[0]);
            return null;
        }
    }

    /* renamed from: C */
    private ReactApplicationContext m18431C() {
        return this.f22067a;
    }

    /* renamed from: E */
    private boolean m18429E() {
        return this.f22070d && this.f22069c != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: F */
    public static /* synthetic */ void m18428F(ReadableMap readableMap, Scope scope) {
        char c;
        C7901e c7901e = new C7901e();
        if (readableMap.hasKey("message")) {
            c7901e.m19326o(readableMap.getString("message"));
        }
        if (readableMap.hasKey("type")) {
            c7901e.m19325p(readableMap.getString("type"));
        }
        if (readableMap.hasKey("category")) {
            c7901e.m19329l(readableMap.getString("category"));
        }
        if (readableMap.hasKey("level")) {
            String string = readableMap.getString("level");
            switch (string.hashCode()) {
                case 3237038:
                    if (string.equals("info")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 95458899:
                    if (string.equals("debug")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (string.equals("error")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 97203460:
                    if (string.equals("fatal")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1124446108:
                    if (string.equals("warning")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            c7901e.m19327n(EnumC8021m4.INFO);
                        } else {
                            c7901e.m19327n(EnumC8021m4.ERROR);
                        }
                    } else {
                        c7901e.m19327n(EnumC8021m4.DEBUG);
                    }
                } else {
                    c7901e.m19327n(EnumC8021m4.WARNING);
                }
            } else {
                c7901e.m19327n(EnumC8021m4.FATAL);
            }
        }
        if (readableMap.hasKey("data")) {
            for (Map.Entry<String, Object> entry : readableMap.getMap("data").toHashMap().entrySet()) {
                if (entry.getValue() != null) {
                    c7901e.m19328m(entry.getKey(), entry.getValue());
                }
            }
        }
        scope.m20081a(c7901e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ C7923f4 m18426H(SentryAndroidOptions sentryAndroidOptions, C7923f4 c7923f4, C7831b0 c7831b0) {
        try {
            C8098p c8098p = c7923f4.m19198o0().get(0);
            if (c8098p != null) {
                if (c8098p.m18586i().contains("JavascriptException")) {
                    return null;
                }
            }
        } catch (Throwable unused) {
        }
        m18417Q(c7923f4);
        m18400k(c7923f4, sentryAndroidOptions.getSdkVersion());
        return c7923f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m18425I(ReadableMap readableMap, final SentryAndroidOptions sentryAndroidOptions) {
        C8096o sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new C8096o("sentry.java.android.react-native", "6.27.0");
        } else {
            sdkVersion.m18599k("sentry.java.android.react-native");
        }
        sentryAndroidOptions.setSentryClientName(sdkVersion.m18603g() + "/" + sdkVersion.m18600j());
        sentryAndroidOptions.setNativeSdkName("sentry.native.android.react-native");
        sentryAndroidOptions.setSdkVersion(sdkVersion);
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
        }
        if (readableMap.hasKey("dsn") && readableMap.getString("dsn") != null) {
            String string = readableMap.getString("dsn");
            f22063e.mo18135c(EnumC8021m4.INFO, String.format("Starting with DSN: '%s'", string), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        } else {
            sentryAndroidOptions.setDsn("");
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("attachViewHierarchy")) {
            sentryAndroidOptions.setAttachViewHierarchy(readableMap.getBoolean("attachViewHierarchy"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        sentryAndroidOptions.setBeforeSend(new C8132r4.InterfaceC8134b() { // from class: io.sentry.react.j
            @Override // io.sentry.C8132r4.InterfaceC8134b
            /* renamed from: a */
            public final C7923f4 mo18434a(C7923f4 c7923f4, C7831b0 c7831b0) {
                C7923f4 m18426H;
                m18426H = C8151k.this.m18426H(sentryAndroidOptions, c7923f4, c7831b0);
                return m18426H;
            }
        });
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            List<Integration> integrations = sentryAndroidOptions.getIntegrations();
            for (Integration integration : integrations) {
                if ((integration instanceof UncaughtExceptionHandlerIntegration) || (integration instanceof AnrIntegration) || (integration instanceof NdkIntegration)) {
                    integrations.remove(integration);
                }
            }
        }
        f22063e.mo18135c(EnumC8021m4.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
        C7806r0 m19680c = C7806r0.m19680c();
        Activity m18433A = m18433A();
        if (m18433A != null) {
            m19680c.m19679d(m18433A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ void m18424J(ReadableMap readableMap, String str, Scope scope) {
        scope.m20058x(str, readableMap.toHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ void m18421M(ReadableMap readableMap, ReadableMap readableMap2, Scope scope) {
        if (readableMap == null && readableMap2 == null) {
            scope.m20086D(null);
            return;
        }
        C8062a0 c8062a0 = new C8062a0();
        if (readableMap != null) {
            if (readableMap.hasKey("email")) {
                c8062a0.m18815q(readableMap.getString("email"));
            }
            if (readableMap.hasKey("id")) {
                c8062a0.m18814r(readableMap.getString("id"));
            }
            if (readableMap.hasKey("username")) {
                c8062a0.m18810v(readableMap.getString("username"));
            }
            if (readableMap.hasKey("ip_address")) {
                c8062a0.m18813s(readableMap.getString("ip_address"));
            }
            if (readableMap.hasKey("segment")) {
                c8062a0.m18812t(readableMap.getString("segment"));
            }
        }
        if (readableMap2 != null) {
            HashMap hashMap = new HashMap();
            ReadableMapKeySetIterator keySetIterator = readableMap2.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                String string = readableMap2.getString(nextKey);
                if (string != null) {
                    hashMap.put(nextKey, string);
                }
            }
            c8062a0.m18816p(hashMap);
        }
        scope.m20086D(c8062a0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ void m18420N(byte[][] bArr, Activity activity, CountDownLatch countDownLatch) {
        bArr[0] = C7773n.m19748d(activity, f22063e, f22064f);
        countDownLatch.countDown();
    }

    /* renamed from: P */
    private void m18418P(C7923f4 c7923f4, String str) {
        c7923f4.m19241c0("event.origin", "android");
        c7923f4.m19241c0("event.environment", str);
    }

    /* renamed from: Q */
    private void m18417Q(C7923f4 c7923f4) {
        C8096o m19261L = c7923f4.m19261L();
        if (m19261L != null) {
            String m18603g = m19261L.m18603g();
            m18603g.hashCode();
            if (!m18603g.equals("sentry.java.android.react-native")) {
                if (m18603g.equals("sentry.native.android.react-native")) {
                    m18418P(c7923f4, "native");
                    return;
                }
                return;
            }
            m18418P(c7923f4, "java");
        }
    }

    /* renamed from: W */
    private static byte[] m18411W(final Activity activity) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final byte[][] bArr = {new byte[0]};
        Runnable runnable = new Runnable() { // from class: io.sentry.react.i
            @Override // java.lang.Runnable
            public final void run() {
                C8151k.m18420N(bArr, activity, countDownLatch);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
            return bArr[0];
        } catch (InterruptedException unused) {
            f22063e.mo18135c(EnumC8021m4.ERROR, "Screenshot process was interrupted.", new Object[0]);
            return null;
        }
    }

    /* renamed from: k */
    private void m18400k(C7923f4 c7923f4, C8096o c8096o) {
        C8096o m19261L = c7923f4.m19261L();
        if (m19261L != null && m19261L.m18603g().equals("sentry.javascript.react-native") && c8096o != null) {
            List<C8102r> m18601i = c8096o.m18601i();
            if (m18601i != null) {
                for (C8102r c8102r : m18601i) {
                    m19261L.m18606d(c8102r.m18575a(), c8102r.m18574b());
                }
            }
            List<String> m18604f = c8096o.m18604f();
            if (m18604f != null) {
                for (String str : m18604f) {
                    m19261L.m18607c(str);
                }
            }
            c7923f4.m19245a0(m19261L);
        }
    }

    /* renamed from: n */
    private boolean m18397n() {
        return true;
    }

    /* renamed from: D */
    public void m18430D(final ReadableMap readableMap, Promise promise) {
        C7793m1.m19712f(m18431C(), new C7896d3.InterfaceC7897a() { // from class: io.sentry.react.b
            @Override // io.sentry.C7896d3.InterfaceC7897a
            /* renamed from: a */
            public final void mo18435a(C8132r4 c8132r4) {
                C8151k.this.m18425I(readableMap, (SentryAndroidOptions) c8132r4);
            }
        });
        promise.resolve(Boolean.TRUE);
    }

    /* renamed from: O */
    public void m18419O(final String str, final ReadableMap readableMap) {
        if (str == null || readableMap == null) {
            return;
        }
        C7896d3.m19414k(new InterfaceC8164t2() { // from class: io.sentry.react.d
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                C8151k.m18424J(ReadableMap.this, str, scope);
            }
        });
    }

    /* renamed from: R */
    public void m18416R(final String str, final String str2) {
        C7896d3.m19414k(new InterfaceC8164t2() { // from class: io.sentry.react.g
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                scope.m20057y(str, str2);
            }
        });
    }

    /* renamed from: S */
    public void m18415S(final String str, final String str2) {
        C7896d3.m19414k(new InterfaceC8164t2() { // from class: io.sentry.react.c
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                scope.m20088B(str, str2);
            }
        });
    }

    /* renamed from: T */
    public void m18414T(final ReadableMap readableMap, final ReadableMap readableMap2) {
        C7896d3.m19414k(new InterfaceC8164t2() { // from class: io.sentry.react.h
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                C8151k.m18421M(ReadableMap.this, readableMap2, scope);
            }
        });
    }

    /* renamed from: U */
    public WritableMap m18413U() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            HermesSamplingProfiler.enable();
            writableNativeMap.putBoolean("started", true);
        } catch (Throwable th2) {
            writableNativeMap.putBoolean("started", false);
            writableNativeMap.putString("error", th2.toString());
        }
        return writableNativeMap;
    }

    /* renamed from: V */
    public WritableMap m18412V() {
        boolean isDebug = C7961i0.m19149a().mo18262j().isDebug();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        File file = null;
        try {
            HermesSamplingProfiler.disable();
            file = File.createTempFile("sampling-profiler-trace", ".cpuprofile", this.f22067a.getCacheDir());
            if (isDebug) {
                InterfaceC8040o0 interfaceC8040o0 = f22063e;
                EnumC8021m4 enumC8021m4 = EnumC8021m4.INFO;
                interfaceC8040o0.mo18135c(enumC8021m4, "Profile saved to: " + file.getAbsolutePath(), new Object[0]);
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            HermesSamplingProfiler.dumpSampledTraceToFile(file.getPath());
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append('\n');
            }
            writableNativeMap.putString("profile", sb2.toString());
            bufferedReader.close();
            try {
                if (!file.delete()) {
                    InterfaceC8040o0 interfaceC8040o02 = f22063e;
                    EnumC8021m4 enumC8021m42 = EnumC8021m4.WARNING;
                    interfaceC8040o02.mo18135c(enumC8021m42, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                }
            } catch (Throwable unused) {
                InterfaceC8040o0 interfaceC8040o03 = f22063e;
                EnumC8021m4 enumC8021m43 = EnumC8021m4.WARNING;
                interfaceC8040o03.mo18135c(enumC8021m43, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                writableNativeMap.putString("error", th2.toString());
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            InterfaceC8040o0 interfaceC8040o04 = f22063e;
                            EnumC8021m4 enumC8021m44 = EnumC8021m4.WARNING;
                            interfaceC8040o04.mo18135c(enumC8021m44, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused2) {
                        InterfaceC8040o0 interfaceC8040o05 = f22063e;
                        EnumC8021m4 enumC8021m45 = EnumC8021m4.WARNING;
                        interfaceC8040o05.mo18135c(enumC8021m45, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            InterfaceC8040o0 interfaceC8040o06 = f22063e;
                            EnumC8021m4 enumC8021m46 = EnumC8021m4.WARNING;
                            interfaceC8040o06.mo18135c(enumC8021m46, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused3) {
                        InterfaceC8040o0 interfaceC8040o07 = f22063e;
                        EnumC8021m4 enumC8021m47 = EnumC8021m4.WARNING;
                        interfaceC8040o07.mo18135c(enumC8021m47, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                    }
                }
                throw th3;
            }
        }
        return writableNativeMap;
    }

    /* renamed from: j */
    public void m18401j(final ReadableMap readableMap) {
        C7896d3.m19414k(new InterfaceC8164t2() { // from class: io.sentry.react.e
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                C8151k.m18428F(ReadableMap.this, scope);
            }
        });
    }

    /* renamed from: l */
    public void m18399l(ReadableArray readableArray, ReadableMap readableMap, Promise promise) {
        byte[] bArr = new byte[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            bArr[i] = (byte) readableArray.getInt(i);
        }
        try {
            C7710b1.m19925c(bArr);
        } catch (Throwable unused) {
            f22063e.mo18135c(EnumC8021m4.ERROR, "Error while capturing envelope", new Object[0]);
            promise.resolve(Boolean.FALSE);
        }
        promise.resolve(Boolean.TRUE);
    }

    /* renamed from: m */
    public void m18398m(Promise promise) {
        Activity m18433A = m18433A();
        if (m18433A == null) {
            f22063e.mo18135c(EnumC8021m4.WARNING, "CurrentActivity is null, can't capture screenshot.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] m18411W = m18411W(m18433A);
        if (m18411W == null) {
            f22063e.mo18135c(EnumC8021m4.WARNING, "Screenshot is null, screen was not captured.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (byte b : m18411W) {
            writableNativeArray.pushInt(b);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("contentType", "image/png");
        writableNativeMap.putArray("data", writableNativeArray);
        writableNativeMap.putString("filename", "screenshot.png");
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        writableNativeArray2.pushMap(writableNativeMap);
        promise.resolve(writableNativeArray2);
    }

    /* renamed from: o */
    public void m18396o() {
        C7896d3.m19414k(new InterfaceC8164t2() { // from class: io.sentry.react.f
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                scope.m20077e();
            }
        });
    }

    /* renamed from: p */
    public void m18395p(Promise promise) {
        C7896d3.m19415j();
        m18393r();
        promise.resolve(Boolean.TRUE);
    }

    /* renamed from: q */
    public void m18394q() {
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    /* renamed from: r */
    public void m18393r() {
        if (m18429E()) {
            this.f22069c.m39127e();
            this.f22069c = null;
        }
    }

    /* renamed from: s */
    public void m18392s() {
        boolean m18397n = m18397n();
        this.f22070d = m18397n;
        if (m18397n) {
            this.f22069c = new FrameMetricsAggregator();
            Activity m18433A = m18433A();
            FrameMetricsAggregator frameMetricsAggregator = this.f22069c;
            if (frameMetricsAggregator != null && m18433A != null) {
                try {
                    frameMetricsAggregator.m39131a(m18433A);
                    f22063e.mo18135c(EnumC8021m4.INFO, "FrameMetricsAggregator installed.", new Object[0]);
                    return;
                } catch (Throwable unused) {
                    f22063e.mo18135c(EnumC8021m4.ERROR, "Error adding Activity to frameMetricsAggregator.", new Object[0]);
                    return;
                }
            }
            f22063e.mo18135c(EnumC8021m4.INFO, "currentActivity isn't available.", new Object[0]);
            return;
        }
        f22063e.mo18135c(EnumC8021m4.WARNING, "androidx.core' isn't available as a dependency.", new Object[0]);
    }

    /* renamed from: t */
    public void m18391t(Promise promise) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m18431C().getResources().getAssets().open("modules.json"));
            try {
                byte[] bArr = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bArr);
                bufferedInputStream.close();
                promise.resolve(new String(bArr, f22065g));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            promise.resolve(null);
        } catch (Throwable unused2) {
            f22063e.mo18135c(EnumC8021m4.WARNING, "Fetching JS Modules failed.", new Object[0]);
            promise.resolve(null);
        }
    }

    /* renamed from: u */
    public void m18390u(Promise promise) {
        C7792m0 m19723e = C7792m0.m19723e();
        AbstractC8003k3 m19724d = m19723e.m19724d();
        Boolean m19722f = m19723e.m19722f();
        if (m19724d == null) {
            f22063e.mo18135c(EnumC8021m4.WARNING, "App start won't be sent due to missing appStartTime.", new Object[0]);
            promise.resolve(null);
        } else if (m19722f == null) {
            f22063e.mo18135c(EnumC8021m4.WARNING, "App start won't be sent due to missing isColdStart.", new Object[0]);
            promise.resolve(null);
        } else {
            double m19080k = C7991j.m19080k(m19724d.mo18864f());
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("appStartTime", m19080k);
            createMap.putBoolean("isColdStart", m19722f.booleanValue());
            createMap.putBoolean("didFetchAppStart", f22066h);
            promise.resolve(createMap);
        }
        f22066h = true;
    }

    /* renamed from: v */
    public void m18389v(Promise promise) {
        C8132r4 mo18262j = C7961i0.m19149a().mo18262j();
        if (!(mo18262j instanceof SentryAndroidOptions)) {
            promise.resolve(null);
            return;
        }
        Context applicationContext = m18431C().getApplicationContext();
        if (applicationContext == null) {
            promise.resolve(null);
            return;
        }
        promise.resolve(C8141a.m18436c(C7710b1.m19921g(applicationContext, (SentryAndroidOptions) mo18262j, C7710b1.m19924d())));
    }

    /* renamed from: w */
    public void m18388w(Promise promise) {
        int i;
        int i2;
        int i3;
        SparseIntArray sparseIntArray;
        if (!m18429E()) {
            promise.resolve(null);
            return;
        }
        try {
            SparseIntArray[] m39130b = this.f22069c.m39130b();
            if (m39130b != null && (sparseIntArray = m39130b[0]) != null) {
                i = 0;
                i2 = 0;
                i3 = 0;
                for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                    int keyAt = sparseIntArray.keyAt(i4);
                    int valueAt = sparseIntArray.valueAt(i4);
                    i += valueAt;
                    if (keyAt > 700) {
                        i3 += valueAt;
                    } else if (keyAt > 16) {
                        i2 += valueAt;
                    }
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            if (i == 0 && i2 == 0 && i3 == 0) {
                promise.resolve(null);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("totalFrames", i);
            createMap.putInt("slowFrames", i2);
            createMap.putInt("frozenFrames", i3);
            promise.resolve(createMap);
        } catch (Throwable unused) {
            f22063e.mo18135c(EnumC8021m4.WARNING, "Error fetching native frames.", new Object[0]);
            promise.resolve(null);
        }
    }

    /* renamed from: x */
    public void m18387x(Promise promise) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", this.f22068b.packageName);
        createMap.putString("version", this.f22068b.versionName);
        createMap.putString("build", String.valueOf(this.f22068b.versionCode));
        promise.resolve(createMap);
    }

    /* renamed from: y */
    public void m18386y(Promise promise) {
        C8096o sdkVersion = C7961i0.m19149a().mo18262j().getSdkVersion();
        if (sdkVersion == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_NAME, sdkVersion.m18603g());
        writableNativeMap.putString("version", sdkVersion.m18600j());
        promise.resolve(writableNativeMap);
    }

    /* renamed from: z */
    public void m18385z(Promise promise) {
        Activity m18433A = m18433A();
        InterfaceC8040o0 interfaceC8040o0 = f22063e;
        C8066b0 m19944f = ViewHierarchyEventProcessor.m19944f(m18433A, interfaceC8040o0);
        if (m19944f == null) {
            interfaceC8040o0.mo18135c(EnumC8021m4.ERROR, "Could not get ViewHierarchy.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] m18206b = C8224k.m18206b(C7961i0.m19149a().mo18262j().getSerializer(), interfaceC8040o0, m19944f);
        if (m18206b == null) {
            interfaceC8040o0.mo18135c(EnumC8021m4.ERROR, "Could not serialize ViewHierarchy.", new Object[0]);
            promise.resolve(null);
        } else if (m18206b.length < 1) {
            interfaceC8040o0.mo18135c(EnumC8021m4.ERROR, "Got empty bytes array after serializing ViewHierarchy.", new Object[0]);
            promise.resolve(null);
        } else {
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (byte b : m18206b) {
                writableNativeArray.pushInt(b);
            }
            promise.resolve(writableNativeArray);
        }
    }
}
