package com.discord.crash_reporting;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.C7896d3;
import io.sentry.ISpan;
import io.sentry.InterfaceC8259w0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u0003789B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u000bH\u0002J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000bJ\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ$\u0010\u0018\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020'0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:"}, m14357d2 = {"Lcom/discord/crash_reporting/PerformanceTracing;", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "", "startNativeModuleInit", "Lcom/discord/crash_reporting/TraceTransaction;", "transaction", "startTransaction", "stopTransaction", "", "marker", "checkAndSetInitSection", "Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;", "transactionMarker", "getMarkerName", ZeroconfModule.KEY_SERVICE_NAME, "tag", "getMarker", "getParentSpanName", ViewProps.START, "stop", "logSpanForTransaction", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "", "instanceKey", "logMarker", "", "Lio/sentry/w0;", "ongoingTransactions", "Ljava/util/Map;", "Lio/sentry/ISpan;", "ongoingSpans", "", "spanStarts", "lastNativeModuleSetupStart", "Lio/sentry/ISpan;", "lastProcessPackage", "", "stopped", "Z", "Lcom/discord/crash_reporting/PackageProcessTimings;", "currentProcessPackage", "Lcom/discord/crash_reporting/PackageProcessTimings;", "", "processPackageTimings", "Ljava/util/List;", "Lcom/discord/crash_reporting/StartupInitSection;", "startupInitSection", "Lcom/discord/crash_reporting/StartupInitSection;", "", "startupRootEventsTree", "", "wildcardEventNames", "Ljava/util/Set;", "<init>", "()V", "Companion", "MarkerEnd", "TransactionMarker", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PerformanceTracing implements ReactMarker.MarkerListener {
    public static final Companion Companion = new Companion(null);
    private static PerformanceTracing performanceTracingInstance;
    private PackageProcessTimings currentProcessPackage;
    private ISpan lastNativeModuleSetupStart;
    private ISpan lastProcessPackage;
    private final Map<String, String> startupRootEventsTree;
    private final Set<String> wildcardEventNames;
    private final Map<TraceTransaction, InterfaceC8259w0> ongoingTransactions = new LinkedHashMap();
    private final Map<String, ISpan> ongoingSpans = new LinkedHashMap();
    private final Map<String, Long> spanStarts = new LinkedHashMap();
    private boolean stopped = true;
    private final List<PackageProcessTimings> processPackageTimings = new ArrayList();
    private StartupInitSection startupInitSection = StartupInitSection.ReactInstanceManager;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/crash_reporting/PerformanceTracing$Companion;", "", "()V", "performanceTracingInstance", "Lcom/discord/crash_reporting/PerformanceTracing;", "get", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PerformanceTracing get() {
            if (PerformanceTracing.performanceTracingInstance == null) {
                PerformanceTracing.performanceTracingInstance = new PerformanceTracing();
            }
            PerformanceTracing performanceTracing = PerformanceTracing.performanceTracingInstance;
            C9612q.m13920e(performanceTracing);
            return performanceTracing;
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;", "", "(Ljava/lang/String;I)V", "START", "END", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum MarkerEnd {
        START,
        END
    }

    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "tag", "markerEnd", "Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;)V", "getMarkerEnd", "()Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;", "getName", "()Ljava/lang/String;", "getTag", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class TransactionMarker {
        private final MarkerEnd markerEnd;
        private final String name;
        private final String tag;

        public TransactionMarker(String name, String str, MarkerEnd markerEnd) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(markerEnd, "markerEnd");
            this.name = name;
            this.tag = str;
            this.markerEnd = markerEnd;
        }

        public static /* synthetic */ TransactionMarker copy$default(TransactionMarker transactionMarker, String str, String str2, MarkerEnd markerEnd, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionMarker.name;
            }
            if ((i & 2) != 0) {
                str2 = transactionMarker.tag;
            }
            if ((i & 4) != 0) {
                markerEnd = transactionMarker.markerEnd;
            }
            return transactionMarker.copy(str, str2, markerEnd);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.tag;
        }

        public final MarkerEnd component3() {
            return this.markerEnd;
        }

        public final TransactionMarker copy(String name, String str, MarkerEnd markerEnd) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(markerEnd, "markerEnd");
            return new TransactionMarker(name, str, markerEnd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TransactionMarker) {
                TransactionMarker transactionMarker = (TransactionMarker) obj;
                return C9612q.m13922c(this.name, transactionMarker.name) && C9612q.m13922c(this.tag, transactionMarker.tag) && this.markerEnd == transactionMarker.markerEnd;
            }
            return false;
        }

        public final MarkerEnd getMarkerEnd() {
            return this.markerEnd;
        }

        public final String getName() {
            return this.name;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.tag;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.markerEnd.hashCode();
        }

        public String toString() {
            String str = this.name;
            String str2 = this.tag;
            MarkerEnd markerEnd = this.markerEnd;
            return "TransactionMarker(name=" + str + ", tag=" + str2 + ", markerEnd=" + markerEnd + ")";
        }
    }

    public PerformanceTracing() {
        Map<String, String> m6751k;
        Set<String> m14002i;
        m6751k = C11889v.m6751k(C11591x.m7577a("GET_REACT_INSTANCE_MANAGER", "root"), C11591x.m7577a("BUILD_REACT_INSTANCE_MANAGER", "GET_REACT_INSTANCE_MANAGER"), C11591x.m7577a("ROOT_VIEW_ON_MEASURE", "root"), C11591x.m7577a("ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER", "ROOT_VIEW_ON_MEASURE"), C11591x.m7577a("REACT_BRIDGE_LOADING", "root"), C11591x.m7577a("CREATE_REACT_CONTEXT", "REACT_BRIDGE_LOADING"), C11591x.m7577a("PROCESS_PACKAGES", "CREATE_REACT_CONTEXT"), C11591x.m7577a("PROCESS_CORE_REACT_PACKAGE", "PROCESS_PACKAGES"), C11591x.m7577a("PROCESS_PACKAGE", "PROCESS_PACKAGES"), C11591x.m7577a("PROCESS_PACKAGE_MODULE", "PROCESS_PACKAGE"), C11591x.m7577a("BUILD_NATIVE_MODULE_REGISTRY", "CREATE_REACT_CONTEXT"), C11591x.m7577a("CREATE_CATALYST_INSTANCE", "CREATE_REACT_CONTEXT"), C11591x.m7577a("LOAD_REACT_NATIVE_SO_FILE", "CREATE_CATALYST_INSTANCE"), C11591x.m7577a("PRE_RUN_JS_BUNDLE", "REACT_BRIDGE_LOADING"), C11591x.m7577a("SETUP_REACT_CONTEXT", "REACT_BRIDGE_LOADING"), C11591x.m7577a("ON_HOST_RESUME", "SETUP_REACT_CONTEXT"), C11591x.m7577a("ATTACH_MEASURED_ROOT_VIEWS", "SETUP_REACT_CONTEXT"), C11591x.m7577a("CREATE_MODULE UiManager", "ATTACH_MEASURED_ROOT_VIEWS"), C11591x.m7577a("CREATE_UI_MANAGER_MODULE", "CREATE_MODULE UiManager"), C11591x.m7577a("CREATE_VIEW_MANAGERS", "CREATE_UI_MANAGER_MODULE"), C11591x.m7577a("ROOT_VIEW_UPDATE_LAYOUT_SPECS", "SETUP_REACT_CONTEXT"), C11591x.m7577a("RUN_JS_BUNDLE", "root"));
        this.startupRootEventsTree = m6751k;
        m14002i = C9560w.m14002i("NATIVE_MODULE_SETUP", "INITIALIZE_MODULE", "CREATE_REACT_CONTEXT", "CREATE_MODULE", "RUN_JS_BUNDLE", "PROCESS_PACKAGE", "PROCESS_PACKAGE_MODULE");
        this.wildcardEventNames = m14002i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void checkAndSetInitSection(String str) {
        StartupInitSection startupInitSection;
        switch (str.hashCode()) {
            case -1149178597:
                if (str.equals("NATIVE_MODULE_INITIALIZE")) {
                    startupInitSection = StartupInitSection.NativeModuleInitialization;
                    break;
                }
                startupInitSection = null;
                break;
            case -464136890:
                if (str.equals("REACT_BRIDGE_LOADING")) {
                    startupInitSection = StartupInitSection.ReactBridgeLoading;
                    break;
                }
                startupInitSection = null;
                break;
            case 291013106:
                if (str.equals("NATIVE_MODULE_SETUP")) {
                    startupInitSection = StartupInitSection.NativeModuleSetup;
                    break;
                }
                startupInitSection = null;
                break;
            case 1036876780:
                if (str.equals("GET_REACT_INSTANCE_MANAGER")) {
                    startupInitSection = StartupInitSection.ReactInstanceManager;
                    break;
                }
                startupInitSection = null;
                break;
            default:
                startupInitSection = null;
                break;
        }
        if (startupInitSection != null) {
            this.startupInitSection = startupInitSection;
        }
    }

    private final TransactionMarker getMarker(String str, String str2) {
        boolean m13755s;
        boolean m13755s2;
        String m13691q0;
        String m13691q02;
        m13755s = C9653o.m13755s(str, "_START", false, 2, null);
        if (m13755s) {
            m13691q02 = C9654p.m13691q0(str, "_START");
            return new TransactionMarker(m13691q02, str2, MarkerEnd.START);
        }
        m13755s2 = C9653o.m13755s(str, "_END", false, 2, null);
        if (!m13755s2) {
            return null;
        }
        m13691q0 = C9654p.m13691q0(str, "_END");
        return new TransactionMarker(m13691q0, str2, MarkerEnd.END);
    }

    private final String getMarkerName(TransactionMarker transactionMarker) {
        if (transactionMarker.getTag() != null && !C9612q.m13922c(transactionMarker.getName(), "CREATE_REACT_CONTEXT")) {
            String name = transactionMarker.getName();
            String tag = transactionMarker.getTag();
            return name + " " + tag;
        }
        return transactionMarker.getName();
    }

    private final String getParentSpanName(TransactionMarker transactionMarker) {
        boolean m14064L;
        String str = this.startupRootEventsTree.get(getMarkerName(transactionMarker));
        if (str != null) {
            return str;
        }
        if (this.wildcardEventNames.contains(transactionMarker.getName())) {
            String str2 = this.startupRootEventsTree.get(transactionMarker.getName());
            m14064L = C9553r.m14064L(this.wildcardEventNames, str2);
            if (m14064L) {
                MarkerEnd markerEnd = transactionMarker.getMarkerEnd();
                return str2 + " " + markerEnd;
            }
            return str2;
        }
        return null;
    }

    private final void startNativeModuleInit() {
        startTransaction(TraceTransaction.NativeModuleInit);
    }

    private final void startTransaction(TraceTransaction traceTransaction) {
        if (this.ongoingTransactions.containsKey(traceTransaction)) {
            return;
        }
        InterfaceC8259w0 m19426A = C7896d3.m19426A(traceTransaction.getTransactionName(), traceTransaction.getOperation());
        C9612q.m13918g(m19426A, "startTransaction(transac…e, transaction.operation)");
        this.ongoingTransactions.put(traceTransaction, m19426A);
        this.ongoingSpans.put("root", m19426A);
        this.spanStarts.put("root", Long.valueOf(System.currentTimeMillis()));
    }

    private final void stopTransaction(TraceTransaction traceTransaction) {
        InterfaceC8259w0 interfaceC8259w0 = this.ongoingTransactions.get(traceTransaction);
        if (interfaceC8259w0 != null) {
            interfaceC8259w0.mo17949c();
        }
        this.ongoingTransactions.remove(traceTransaction);
    }

    @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
    public void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        String str2;
        boolean m13753u;
        if (reactMarkerConstants != null) {
            str2 = reactMarkerConstants.name();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            logSpanForTransaction(str2, str);
        }
        m13753u = C9653o.m13753u(str2, "CONTENT_APPEARED", false, 2, null);
        if (m13753u) {
            stop();
        }
    }

    public final synchronized void logSpanForTransaction(TransactionMarker marker) {
        ISpan iSpan;
        PackageProcessTimings packageProcessTimings;
        List<String> modules;
        boolean m13755s;
        ISpan iSpan2;
        ISpan iSpan3;
        C9612q.m13917h(marker, "marker");
        checkAndSetInitSection(marker.getName());
        String markerName = getMarkerName(marker);
        String parentSpanName = getParentSpanName(marker);
        if (marker.getMarkerEnd() == MarkerEnd.START) {
            if (this.startupInitSection == StartupInitSection.NativeModuleSetup && C9612q.m13922c(marker.getName(), "NATIVE_MODULE_SETUP") && (iSpan3 = this.lastNativeModuleSetupStart) != null) {
                if (iSpan3 != null) {
                    iSpan3.mo17949c();
                }
                this.lastNativeModuleSetupStart = null;
            }
            if (C9612q.m13922c(marker.getName(), "RUN_JS_BUNDLE") && (iSpan2 = this.ongoingSpans.get("PRE_RUN_JS_BUNDLE")) != null) {
                iSpan2.mo17949c();
            }
            if (C9612q.m13922c(marker.getName(), "PROCESS_PACKAGE_MODULE")) {
                iSpan = this.lastProcessPackage;
            } else {
                iSpan = this.ongoingSpans.get(parentSpanName);
            }
            if (iSpan == null) {
                boolean z = false;
                if (parentSpanName != null) {
                    m13755s = C9653o.m13755s(parentSpanName, "~", false, 2, null);
                    if (m13755s) {
                        z = true;
                    }
                }
                if (z) {
                    ISpan iSpan4 = this.ongoingSpans.get(this.startupRootEventsTree.get(parentSpanName));
                    if (iSpan4 != null && (iSpan = iSpan4.mo17946f(markerName)) != null) {
                        this.ongoingSpans.put(parentSpanName, iSpan);
                        this.spanStarts.put(parentSpanName, Long.valueOf(System.currentTimeMillis()));
                    }
                    return;
                }
            }
            if (iSpan == null) {
                return;
            }
            ISpan mo17946f = iSpan.mo17946f(markerName);
            C9612q.m13918g(mo17946f, "parentSpan.startChild(markerName)");
            this.ongoingSpans.put(markerName, mo17946f);
            this.spanStarts.put(markerName, Long.valueOf(System.currentTimeMillis()));
            if (C9612q.m13922c(marker.getName(), "PROCESS_PACKAGE")) {
                this.lastProcessPackage = mo17946f;
                PackageProcessTimings packageProcessTimings2 = new PackageProcessTimings();
                this.currentProcessPackage = packageProcessTimings2;
                this.processPackageTimings.add(packageProcessTimings2);
            }
            if (C9612q.m13922c(marker.getName(), "PROCESS_PACKAGE_MODULE") && (packageProcessTimings = this.currentProcessPackage) != null && (modules = packageProcessTimings.getModules()) != null) {
                String tag = marker.getTag();
                if (tag == null) {
                    tag = "";
                }
                modules.add(tag);
            }
        } else {
            ISpan iSpan5 = this.ongoingSpans.get(markerName);
            if (iSpan5 != null) {
                iSpan5.mo17949c();
                this.ongoingSpans.remove(markerName);
                if (C9612q.m13922c(marker.getName(), "PROCESS_PACKAGE")) {
                    PackageProcessTimings packageProcessTimings3 = this.currentProcessPackage;
                    if (packageProcessTimings3 != null) {
                        packageProcessTimings3.setEndTime(System.currentTimeMillis());
                    }
                    this.currentProcessPackage = null;
                }
            }
        }
    }

    public final void start() {
        if (this.stopped) {
            ReactMarker.addListener(this);
            startNativeModuleInit();
            this.stopped = false;
        }
    }

    public final void stop() {
        if (!this.stopped) {
            stopTransaction(TraceTransaction.NativeModuleInit);
            ReactMarker.removeListener(this);
            this.stopped = true;
        }
    }

    public final synchronized void logSpanForTransaction(String marker, String str) {
        C9612q.m13917h(marker, "marker");
        TransactionMarker marker2 = getMarker(marker, str);
        if (marker2 == null) {
            return;
        }
        logSpanForTransaction(marker2);
    }
}