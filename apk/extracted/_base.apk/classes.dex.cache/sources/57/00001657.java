package com.discord.crash_reporting;

import android.content.Context;
import android.os.Build;
import com.discord.client_info.ClientInfo;
import com.discord.logging.Log;
import io.sentry.C7896d3;
import io.sentry.C7901e;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8164t2;
import io.sentry.Scope;
import io.sentry.android.core.C7793m1;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9544i;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C9654p;
import p304qf.C11889v;
import pf.C11560f;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\""}, m14357d2 = {"Lcom/discord/crash_reporting/CrashReporting;", "", "()V", "TAG_APP_VERSION", "", "TAG_BUILD_NUMBER", "<set-?>", "", "isCrashedLastRun", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "addBreadcrumb", "", "breadcrumbMessage", "breadcrumbData", "", "breadcrumbCategory", "captureException", "throwable", "", "captureMessage", "tag", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "errorLevel", "Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "getSampleRate", "", "context", "Landroid/content/Context;", "init", "ErrorLevel", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CrashReporting {
    public static final CrashReporting INSTANCE = new CrashReporting();
    private static final String TAG_APP_VERSION = "appVersion";
    private static final String TAG_BUILD_NUMBER = "buildNumber";
    private static Boolean isCrashedLastRun;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "", "(Ljava/lang/String;I)V", "INFO", "WARNING", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum ErrorLevel {
        INFO,
        WARNING
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorLevel.values().length];
            try {
                iArr[ErrorLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CrashReporting() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addBreadcrumb$default(CrashReporting crashReporting, String str, Map map, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C11889v.m6754h();
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        crashReporting.addBreadcrumb(str, map, str2);
    }

    public static /* synthetic */ void captureMessage$default(CrashReporting crashReporting, String str, String str2, ErrorLevel errorLevel, int i, Object obj) {
        if ((i & 4) != 0) {
            errorLevel = ErrorLevel.INFO;
        }
        crashReporting.captureMessage(str, str2, errorLevel);
    }

    public static final void captureMessage$lambda$1(String tag, String message, ErrorLevel errorLevel, Scope SentryScope) {
        List<String> m14109d;
        EnumC8021m4 enumC8021m4;
        C9612q.m13917h(tag, "$tag");
        C9612q.m13917h(message, "$message");
        C9612q.m13917h(errorLevel, "$errorLevel");
        C9612q.m13917h(SentryScope, "SentryScope");
        m14109d = C9544i.m14109d(tag);
        SentryScope.m20056z(m14109d);
        int i = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC8021m4 = EnumC8021m4.WARNING;
            } else {
                throw new C11581q();
            }
        } else {
            enumC8021m4 = EnumC8021m4.INFO;
        }
        C7896d3.m19416i(message, enumC8021m4);
    }

    public static final void init$lambda$0(Ref$ObjectRef dsn, Context context, double d, SentryAndroidOptions options) {
        C9612q.m13917h(dsn, "$dsn");
        C9612q.m13917h(context, "$context");
        C9612q.m13917h(options, "options");
        options.setDsn((String) dsn.f25329j);
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        options.setEnvironment(clientInfo.getReleaseChannel());
        options.setDist(clientInfo.getVersionCode());
        options.setRelease("discord_android@201.13.0-0+201013");
        File cacheDir = context.getCacheDir();
        options.setCacheDirPath(cacheDir + "/sentry");
        options.setEnableActivityLifecycleTracingAutoFinish(false);
        options.setEnableAutoActivityLifecycleTracing(false);
        options.setTracesSampleRate(Double.valueOf(0.0d));
        options.setSampleRate(Double.valueOf(d));
        options.setProguardUuid("c6863af5-b24b-4dea-a080-578859cf4dd3");
        options.setTag(TAG_BUILD_NUMBER, clientInfo.getVersionCode());
        options.setTag(TAG_APP_VERSION, clientInfo.getVersionName());
    }

    public final void addBreadcrumb(String breadcrumbMessage, Map<String, String> breadcrumbData, String str) {
        C9612q.m13917h(breadcrumbMessage, "breadcrumbMessage");
        C9612q.m13917h(breadcrumbData, "breadcrumbData");
        C7901e c7901e = new C7901e(breadcrumbMessage);
        for (Map.Entry<String, String> entry : breadcrumbData.entrySet()) {
            c7901e.m19328m(entry.getKey(), entry.getValue());
        }
        c7901e.m19329l(str);
        Log.i$default(Log.INSTANCE, "SentryBreadcrumb", breadcrumbMessage, (Throwable) null, 4, (Object) null);
        C7896d3.m19422c(c7901e);
    }

    public final void captureException(Throwable throwable) {
        String m7636b;
        C9612q.m13917h(throwable, "throwable");
        Log log = Log.INSTANCE;
        m7636b = C11560f.m7636b(throwable);
        Log.e$default(log, "SentryBreadcrumb", m7636b, (Throwable) null, 4, (Object) null);
        C7896d3.m19418g(throwable);
    }

    public final void captureMessage(final String tag, final String message, final ErrorLevel errorLevel) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(errorLevel, "errorLevel");
        int i = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i == 1) {
            Log.i$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        } else if (i == 2) {
            Log.w$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        }
        C7896d3.m19425B(new InterfaceC8164t2() { // from class: com.discord.crash_reporting.b
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                CrashReporting.captureMessage$lambda$1(tag, message, errorLevel, scope);
            }
        });
    }

    public final double getSampleRate(Context context) {
        C9612q.m13917h(context, "context");
        if (!CrashReportingCache.Companion.getInstance(context).isStaff() && ClientInfo.INSTANCE.isProdBuild()) {
            return 0.05d;
        }
        return 1.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void init(final Context context) {
        boolean z;
        T t;
        boolean m13731M;
        C9612q.m13917h(context, "context");
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        if (!clientInfo.isDebugBuild() && !clientInfo.isDeveloperBuild()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return;
        }
        if (clientInfo.isProdBuild()) {
            String DEVICE = Build.DEVICE;
            C9612q.m13918g(DEVICE, "DEVICE");
            m13731M = C9654p.m13731M(DEVICE, "vivo", false, 2, null);
            if (m13731M) {
                return;
            }
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (CrashReportingCache.Companion.getInstance(context).isStaff()) {
            t = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375";
        } else if (!clientInfo.isProdBuild()) {
            t = "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375";
        } else {
            t = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375";
        }
        ref$ObjectRef.f25329j = t;
        final double sampleRate = getSampleRate(context);
        C7793m1.m19712f(context, new C7896d3.InterfaceC7897a() { // from class: com.discord.crash_reporting.a
            @Override // io.sentry.C7896d3.InterfaceC7897a
            /* renamed from: a */
            public final void mo18435a(C8132r4 c8132r4) {
                CrashReporting.init$lambda$0(Ref$ObjectRef.this, context, sampleRate, (SentryAndroidOptions) c8132r4);
            }
        });
        isCrashedLastRun = C7896d3.m19406s();
    }

    public final Boolean isCrashedLastRun() {
        return isCrashedLastRun;
    }

    public final void captureMessage(String tag, Exception exception) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        captureMessage$default(this, tag, message, null, 4, null);
    }
}