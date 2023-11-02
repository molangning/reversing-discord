package io.sentry;

import com.reactnativecommunity.webview.RNCWebViewManager;
import io.sentry.cache.InterfaceC7851f;
import io.sentry.clientreport.C7874d;
import io.sentry.clientreport.C7880i;
import io.sentry.clientreport.InterfaceC7878g;
import io.sentry.internal.debugmeta.C7978b;
import io.sentry.internal.debugmeta.InterfaceC7977a;
import io.sentry.internal.gestures.InterfaceC7980a;
import io.sentry.internal.modules.C7988e;
import io.sentry.internal.modules.InterfaceC7984b;
import io.sentry.internal.viewhierarchy.InterfaceC7990a;
import io.sentry.protocol.C8096o;
import io.sentry.transport.C8192r;
import io.sentry.transport.C8194t;
import io.sentry.transport.InterfaceC8191q;
import io.sentry.util.C8231q;
import io.sentry.util.C8232r;
import io.sentry.util.C8233s;
import io.sentry.util.thread.C8238d;
import io.sentry.util.thread.InterfaceC8236b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.r4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8132r4 {
    static final EnumC8021m4 DEFAULT_DIAGNOSTIC_LEVEL = EnumC8021m4.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private InterfaceC8133a beforeBreadcrumb;
    private InterfaceC8134b beforeSend;
    private InterfaceC8135c beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    InterfaceC7878g clientReportRecorder;
    private final List<InterfaceC7992j0> collectors;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private InterfaceC8010l3 dateProvider;
    private boolean debug;
    private InterfaceC7977a debugMetaLoader;
    private final List<String> defaultTracePropagationTargets;
    private EnumC8021m4 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAutoSessionTracking;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enableScopeSync;
    private boolean enableShutdownHook;
    private boolean enableTimeToFullDisplayTracing;
    private Boolean enableTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private InterfaceC7851f envelopeDiskCache;
    private InterfaceC8000k0 envelopeReader;
    private String environment;
    private final List<InterfaceC8270y> eventProcessors;
    private InterfaceC8204u0 executorService;
    private long flushTimeoutMillis;
    private final C7685a0 fullyDisplayedReporter;
    private final List<InterfaceC7980a> gestureTargetLocators;
    private HostnameVerifier hostnameVerifier;
    private Long idleTimeout;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC8277z0 instrumenter;
    private final List<Integration> integrations;
    private InterfaceC8040o0 logger;
    private InterfaceC8236b mainThreadChecker;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private EnumC8138f maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private InterfaceC7984b modulesLoader;
    private final List<InterfaceC8127r0> observers;
    private final List<InterfaceC8049p0> optionsObservers;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private InterfaceC8136d profilesSampler;
    private String proguardUuid;
    private C8137e proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private C8096o sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private String sentryClientName;
    private InterfaceC8243v0 serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private InterfaceC8139g tracesSampler;
    private InterfaceC8167t5 transactionPerformanceCollector;
    private InterfaceC8265x0 transactionProfiler;
    private InterfaceC8271y0 transportFactory;
    private InterfaceC8191q transportGate;
    private final List<InterfaceC7990a> viewHierarchyExporters;

    /* renamed from: io.sentry.r4$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8133a {
    }

    /* renamed from: io.sentry.r4$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8134b {
        /* renamed from: a */
        C7923f4 mo18434a(C7923f4 c7923f4, C7831b0 c7831b0);
    }

    /* renamed from: io.sentry.r4$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8135c {
    }

    /* renamed from: io.sentry.r4$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8136d {
    }

    /* renamed from: io.sentry.r4$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8137e {

        /* renamed from: a */
        private String f22042a;

        /* renamed from: b */
        private String f22043b;

        /* renamed from: c */
        private String f22044c;

        /* renamed from: d */
        private String f22045d;

        public C8137e(String str, String str2, String str3, String str4) {
            this.f22042a = str;
            this.f22043b = str2;
            this.f22044c = str3;
            this.f22045d = str4;
        }

        /* renamed from: a */
        public String m18443a() {
            return this.f22042a;
        }

        /* renamed from: b */
        public String m18442b() {
            return this.f22045d;
        }

        /* renamed from: c */
        public String m18441c() {
            return this.f22043b;
        }

        /* renamed from: d */
        public String m18440d() {
            return this.f22044c;
        }
    }

    /* renamed from: io.sentry.r4$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC8138f {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* renamed from: io.sentry.r4$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8139g {
    }

    public C8132r4() {
        this(false);
    }

    private void addPackageInfo() {
        C8004k4.m19025c().m19026b("maven:io.sentry:sentry", "6.27.0");
    }

    private C8096o createSdkVersion() {
        C8096o c8096o = new C8096o("sentry.java", "6.27.0");
        c8096o.m18597m("6.27.0");
        return c8096o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8132r4 empty() {
        return new C8132r4(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                this.bundleIds.add(trim);
            }
        }
    }

    public void addCollector(InterfaceC7992j0 interfaceC7992j0) {
        this.collectors.add(interfaceC7992j0);
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC8270y interfaceC8270y) {
        this.eventProcessors.add(interfaceC8270y);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(Integration integration) {
        this.integrations.add(integration);
    }

    public void addOptionsObserver(InterfaceC8049p0 interfaceC8049p0) {
        this.optionsObservers.add(interfaceC8049p0);
    }

    public void addScopeObserver(InterfaceC8127r0 interfaceC8127r0) {
        this.observers.add(interfaceC8127r0);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (!str.isEmpty()) {
            this.tracePropagationTargets.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public InterfaceC8133a getBeforeBreadcrumb() {
        return null;
    }

    public InterfaceC8134b getBeforeSend() {
        return this.beforeSend;
    }

    public InterfaceC8135c getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str != null && !str.isEmpty()) {
            if (this.dsnHash != null) {
                return new File(this.cacheDirPath, this.dsnHash).getAbsolutePath();
            }
            return this.cacheDirPath;
        }
        return null;
    }

    public InterfaceC7878g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public List<InterfaceC7992j0> getCollectors() {
        return this.collectors;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public InterfaceC8010l3 getDateProvider() {
        return this.dateProvider;
    }

    public InterfaceC7977a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC8021m4 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public Boolean getEnableTracing() {
        return this.enableTracing;
    }

    public InterfaceC7851f getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public InterfaceC8000k0 getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC8270y> getEventProcessors() {
        return this.eventProcessors;
    }

    public InterfaceC8204u0 getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C7685a0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<InterfaceC7980a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC8277z0 getInstrumenter() {
        return this.instrumenter;
    }

    public List<Integration> getIntegrations() {
        return this.integrations;
    }

    public InterfaceC8040o0 getLogger() {
        return this.logger;
    }

    public InterfaceC8236b getMainThreadChecker() {
        return this.mainThreadChecker;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public EnumC8138f getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public InterfaceC7984b getModulesLoader() {
        return this.modulesLoader;
    }

    public List<InterfaceC8049p0> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public InterfaceC8136d getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public C8137e getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<InterfaceC8127r0> getScopeObservers() {
        return this.observers;
    }

    public C8096o getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC8243v0 getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        if (list == null) {
            return this.defaultTracePropagationTargets;
        }
        return list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public InterfaceC8139g getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public InterfaceC8167t5 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public InterfaceC8265x0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC8271y0 getTransportFactory() {
        return this.transportFactory;
    }

    public InterfaceC8191q getTransportGate() {
        return this.transportGate;
    }

    public final List<InterfaceC7990a> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        Boolean bool = this.enableTracing;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getTracesSampleRate() == null) {
            getTracesSampler();
            return false;
        }
        return true;
    }

    public void merge(C8276z c8276z) {
        if (c8276z.m17999l() != null) {
            setDsn(c8276z.m17999l());
        }
        if (c8276z.m17995p() != null) {
            setEnvironment(c8276z.m17995p());
        }
        if (c8276z.m17986y() != null) {
            setRelease(c8276z.m17986y());
        }
        if (c8276z.m18000k() != null) {
            setDist(c8276z.m18000k());
        }
        if (c8276z.m18032A() != null) {
            setServerName(c8276z.m18032A());
        }
        if (c8276z.m17987x() != null) {
            setProxy(c8276z.m17987x());
        }
        if (c8276z.m17996o() != null) {
            setEnableUncaughtExceptionHandler(c8276z.m17996o().booleanValue());
        }
        if (c8276z.m17990u() != null) {
            setPrintUncaughtStackTrace(c8276z.m17990u().booleanValue());
        }
        if (c8276z.m17997n() != null) {
            setEnableTracing(c8276z.m17997n());
        }
        if (c8276z.m18029D() != null) {
            setTracesSampleRate(c8276z.m18029D());
        }
        if (c8276z.m17989v() != null) {
            setProfilesSampleRate(c8276z.m17989v());
        }
        if (c8276z.m18001j() != null) {
            setDebug(c8276z.m18001j().booleanValue());
        }
        if (c8276z.m17998m() != null) {
            setEnableDeduplication(c8276z.m17998m().booleanValue());
        }
        if (c8276z.m17985z() != null) {
            setSendClientReports(c8276z.m17985z().booleanValue());
        }
        for (Map.Entry entry : new HashMap(c8276z.m18031B()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (String str : new ArrayList(c8276z.m17991t())) {
            addInAppInclude(str);
        }
        for (String str2 : new ArrayList(c8276z.m17992s())) {
            addInAppExclude(str2);
        }
        Iterator it = new HashSet(c8276z.m17993r()).iterator();
        while (it.hasNext()) {
            addIgnoredExceptionForType((Class) it.next());
        }
        if (c8276z.m18030C() != null) {
            setTracePropagationTargets(new ArrayList(c8276z.m18030C()));
        }
        for (String str3 : new ArrayList(c8276z.m18002i())) {
            addContextTag(str3);
        }
        if (c8276z.m17988w() != null) {
            setProguardUuid(c8276z.m17988w());
        }
        if (c8276z.m17994q() != null) {
            setIdleTimeout(c8276z.m17994q());
        }
        for (String str4 : c8276z.m18003h()) {
            addBundleId(str4);
        }
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBeforeBreadcrumb(InterfaceC8133a interfaceC8133a) {
    }

    public void setBeforeSend(InterfaceC8134b interfaceC8134b) {
        this.beforeSend = interfaceC8134b;
    }

    public void setBeforeSendTransaction(InterfaceC8135c interfaceC8135c) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setDateProvider(InterfaceC8010l3 interfaceC8010l3) {
        this.dateProvider = interfaceC8010l3;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(InterfaceC7977a interfaceC7977a) {
        if (interfaceC7977a == null) {
            interfaceC7977a = C7978b.m19109b();
        }
        this.debugMetaLoader = interfaceC7977a;
    }

    public void setDiagnosticLevel(EnumC8021m4 enumC8021m4) {
        if (enumC8021m4 == null) {
            enumC8021m4 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC8021m4;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.dsnHash = C8233s.m18159a(str, this.logger);
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableTracing(Boolean bool) {
        this.enableTracing = bool;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnvelopeDiskCache(InterfaceC7851f interfaceC7851f) {
        if (interfaceC7851f == null) {
            interfaceC7851f = C8192r.m18302a();
        }
        this.envelopeDiskCache = interfaceC7851f;
    }

    public void setEnvelopeReader(InterfaceC8000k0 interfaceC8000k0) {
        if (interfaceC8000k0 == null) {
            interfaceC8000k0 = C8163t1.m18353b();
        }
        this.envelopeReader = interfaceC8000k0;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(InterfaceC8204u0 interfaceC8204u0) {
        if (interfaceC8204u0 != null) {
            this.executorService = interfaceC8204u0;
        }
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setGestureTargetLocators(List<InterfaceC7980a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setInstrumenter(EnumC8277z0 enumC8277z0) {
        this.instrumenter = enumC8277z0;
    }

    public void setLogger(InterfaceC8040o0 interfaceC8040o0) {
        this.logger = interfaceC8040o0 == null ? C8244v1.m18133e() : new C8024n(this, interfaceC8040o0);
    }

    public void setMainThreadChecker(InterfaceC8236b interfaceC8236b) {
        this.mainThreadChecker = interfaceC8236b;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(EnumC8138f enumC8138f) {
        this.maxRequestBodySize = enumC8138f;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(InterfaceC7984b interfaceC7984b) {
        if (interfaceC7984b == null) {
            interfaceC7984b = C7988e.m19093b();
        }
        this.modulesLoader = interfaceC7984b;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfilesSampleRate(Double d) {
        if (C8232r.m18164a(d)) {
            this.profilesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(InterfaceC8136d interfaceC8136d) {
    }

    @Deprecated
    public void setProfilingEnabled(boolean z) {
        Double d;
        if (getProfilesSampleRate() == null) {
            if (z) {
                d = Double.valueOf(1.0d);
            } else {
                d = null;
            }
            setProfilesSampleRate(d);
        }
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(C8137e c8137e) {
        this.proxy = c8137e;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d) {
        if (C8232r.m18162c(d)) {
            this.sampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(C8096o c8096o) {
        this.sdkVersion = c8096o;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new C7874d(this);
        } else {
            this.clientReportRecorder = new C7880i();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC8243v0 interfaceC8243v0) {
        if (interfaceC8243v0 == null) {
            interfaceC8243v0 = C8278z1.m17978g();
        }
        this.serializer = interfaceC8243v0;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    @Deprecated
    public void setShutdownTimeout(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (C8232r.m18161d(d)) {
            this.tracesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(InterfaceC8139g interfaceC8139g) {
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionPerformanceCollector(InterfaceC8167t5 interfaceC8167t5) {
        this.transactionPerformanceCollector = interfaceC8167t5;
    }

    public void setTransactionProfiler(InterfaceC8265x0 interfaceC8265x0) {
        if (interfaceC8265x0 == null) {
            interfaceC8265x0 = C7895d2.m19427c();
        }
        this.transactionProfiler = interfaceC8265x0;
    }

    public void setTransportFactory(InterfaceC8271y0 interfaceC8271y0) {
        if (interfaceC8271y0 == null) {
            interfaceC8271y0 = C7907e2.m19312b();
        }
        this.transportFactory = interfaceC8271y0;
    }

    public void setTransportGate(InterfaceC8191q interfaceC8191q) {
        if (interfaceC8191q == null) {
            interfaceC8191q = C8194t.m18295b();
        }
        this.transportGate = interfaceC8191q;
    }

    public void setViewHierarchyExporters(List<InterfaceC7990a> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private C8132r4(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.enableNdk = true;
        this.logger = C8244v1.m18133e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new C8154s(new C8041o1(this));
        this.serializer = new C8041o1(this);
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C7907e2.m19312b();
        this.transportGate = C8194t.m18295b();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C8272y1.m18036e();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = C8192r.m18302a();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = EnumC8138f.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C7895d2.m19427c();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C7874d(this);
        this.modulesLoader = C7988e.m19093b();
        this.debugMetaLoader = C7978b.m19109b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC8277z0.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.mainThreadChecker = C8238d.m18147d();
        this.traceOptionsRequests = true;
        this.dateProvider = new C7908e3();
        this.collectors = new ArrayList();
        this.transactionPerformanceCollector = C7842c2.m19567c();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C7685a0.m20048a();
        if (z) {
            return;
        }
        this.executorService = new C7939h4();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList.add(new C8050p1(this));
        copyOnWriteArrayList.add(new C8126r(this));
        if (C8231q.m18165b()) {
            copyOnWriteArrayList.add(new C8159s4());
        }
        setSentryClientName("sentry.java/6.27.0");
        setSdkVersion(createSdkVersion());
        addPackageInfo();
    }
}
