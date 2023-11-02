package com.discord.resource_usage;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import co.discord.media_engine.C2689b;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import p431xj.C13838e;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder;", "", "()V", "Companion", "RequestStats", "resource_usage_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class DeviceResourceUsageRecorder {
    private static final long initialAppReceiveBytes;
    private static final long initialAppSendBytes;
    private static long initialCellularReceiveBytes;
    private static long initialCellularSendBytes;
    private static long initialTotalReceiveBytes;
    private static long initialTotalSendBytes;
    private static long mediaPlayerBytesReceived;
    private static long socketBytesReceived;
    private static final int uid;
    public static final Companion Companion = new Companion(null);
    private static final RequestStats ota = new RequestStats(0, 0, 3, null);
    private static final RequestStats xhr = new RequestStats(0, 0, 3, null);
    private static final RequestStats fresco = new RequestStats(0, 0, 3, null);
    private static final RequestStats downloads = new RequestStats(0, 0, 3, null);

    @Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0018\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m14357d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder$Companion;", "", "()V", "downloads", "Lcom/discord/resource_usage/DeviceResourceUsageRecorder$RequestStats;", "fresco", "initialAppReceiveBytes", "", "initialAppSendBytes", "initialCellularReceiveBytes", "initialCellularSendBytes", "initialTotalReceiveBytes", "initialTotalSendBytes", "mediaPlayerBytesReceived", "getMediaPlayerBytesReceived", "()J", "setMediaPlayerBytesReceived", "(J)V", "ota", "socketBytesReceived", "getSocketBytesReceived", "setSocketBytesReceived", "uid", "", "xhr", "bundleUpdaterInterceptor", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "clientXHRInterceptor", "downloadInterceptor", "frescoInterceptor", "getNetworkUsage", "Lcom/facebook/react/bridge/WritableNativeMap;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "requestStatsInterceptor", "stats", "resource_usage_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Response requestStatsInterceptor(Interceptor.Chain chain, RequestStats requestStats) {
            Response mo1422b = chain.mo1422b(chain.mo1423a());
            ResponseBody m8699a = mo1422b.m8699a();
            requestStats.setNumRequests(requestStats.getNumRequests() + 1);
            if (C13838e.m1435b(mo1422b) && m8699a != null) {
                BufferedSource source = m8699a.source();
                source.mo8590g(Long.MAX_VALUE);
                requestStats.setBytesReceived(requestStats.getBytesReceived() + source.mo8593d().size());
            }
            return mo1422b;
        }

        public final Response bundleUpdaterInterceptor(Interceptor.Chain chain) {
            C9612q.m13917h(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.ota);
        }

        public final Response clientXHRInterceptor(Interceptor.Chain chain) {
            C9612q.m13917h(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.xhr);
        }

        public final Response downloadInterceptor(Interceptor.Chain chain) {
            C9612q.m13917h(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.downloads);
        }

        public final Response frescoInterceptor(Interceptor.Chain chain) {
            C9612q.m13917h(chain, "chain");
            return requestStatsInterceptor(chain, DeviceResourceUsageRecorder.fresco);
        }

        public final long getMediaPlayerBytesReceived() {
            return DeviceResourceUsageRecorder.mediaPlayerBytesReceived;
        }

        public final WritableNativeMap getNetworkUsage(ReactApplicationContext reactApplicationContext) {
            Pair pair;
            Integer num;
            SignalStrength signalStrength;
            int i;
            C9612q.m13917h(reactApplicationContext, "reactApplicationContext");
            try {
                Object systemService = reactApplicationContext.getSystemService("phone");
                C9612q.m13919f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (Build.VERSION.SDK_INT >= 28) {
                    signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        i = signalStrength.getLevel();
                    } else {
                        i = 0;
                    }
                    num = Integer.valueOf(i);
                } else {
                    num = null;
                }
                pair = new Pair(num, Boolean.valueOf(telephonyManager.isNetworkRoaming()));
            } catch (Exception unused) {
                pair = new Pair(null, null);
            }
            return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("signalStrengthLevel", (Integer) pair.m14351a()), C11591x.m7577a("isNetworkRoaming", (Boolean) pair.m14350b()), C11591x.m7577a("cellularReceiveBytes", Long.valueOf(TrafficStats.getMobileRxBytes() - DeviceResourceUsageRecorder.initialCellularReceiveBytes)), C11591x.m7577a("cellularSendBytes", Long.valueOf(TrafficStats.getMobileTxBytes() - DeviceResourceUsageRecorder.initialCellularSendBytes)), C11591x.m7577a("totalReceiveBytes", Long.valueOf(TrafficStats.getTotalRxBytes() - DeviceResourceUsageRecorder.initialTotalReceiveBytes)), C11591x.m7577a("totalSendBytes", Long.valueOf(TrafficStats.getTotalTxBytes() - DeviceResourceUsageRecorder.initialTotalSendBytes)), C11591x.m7577a("uidReceiveBytes", Long.valueOf(TrafficStats.getUidRxBytes(DeviceResourceUsageRecorder.uid) - DeviceResourceUsageRecorder.initialAppReceiveBytes)), C11591x.m7577a("uidSendBytes", Long.valueOf(TrafficStats.getUidTxBytes(DeviceResourceUsageRecorder.uid) - DeviceResourceUsageRecorder.initialAppSendBytes)), C11591x.m7577a("socketBytesReceived", Long.valueOf(getSocketBytesReceived())), C11591x.m7577a("otaBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.ota.getBytesReceived())), C11591x.m7577a("otaNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.ota.getNumRequests())), C11591x.m7577a("xhrBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.xhr.getBytesReceived())), C11591x.m7577a("xhrNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.xhr.getNumRequests())), C11591x.m7577a("frescoBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.fresco.getBytesReceived())), C11591x.m7577a("frescoNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.fresco.getNumRequests())), C11591x.m7577a("downloadBytesReceived", Long.valueOf(DeviceResourceUsageRecorder.downloads.getBytesReceived())), C11591x.m7577a("downloadNumRequests", Integer.valueOf(DeviceResourceUsageRecorder.downloads.getNumRequests())), C11591x.m7577a("mediaPlayerBytesReceived", Long.valueOf(getMediaPlayerBytesReceived())));
        }

        public final long getSocketBytesReceived() {
            return DeviceResourceUsageRecorder.socketBytesReceived;
        }

        public final void setMediaPlayerBytesReceived(long j) {
            DeviceResourceUsageRecorder.mediaPlayerBytesReceived = j;
        }

        public final void setSocketBytesReceived(long j) {
            DeviceResourceUsageRecorder.socketBytesReceived = j;
        }
    }

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageRecorder$RequestStats;", "", "numRequests", "", "bytesReceived", "", "(IJ)V", "getBytesReceived", "()J", "setBytesReceived", "(J)V", "getNumRequests", "()I", "setNumRequests", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "resource_usage_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class RequestStats {
        private long bytesReceived;
        private int numRequests;

        public RequestStats() {
            this(0, 0L, 3, null);
        }

        public RequestStats(int i, long j) {
            this.numRequests = i;
            this.bytesReceived = j;
        }

        public static /* synthetic */ RequestStats copy$default(RequestStats requestStats, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = requestStats.numRequests;
            }
            if ((i2 & 2) != 0) {
                j = requestStats.bytesReceived;
            }
            return requestStats.copy(i, j);
        }

        public final int component1() {
            return this.numRequests;
        }

        public final long component2() {
            return this.bytesReceived;
        }

        public final RequestStats copy(int i, long j) {
            return new RequestStats(i, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RequestStats) {
                RequestStats requestStats = (RequestStats) obj;
                return this.numRequests == requestStats.numRequests && this.bytesReceived == requestStats.bytesReceived;
            }
            return false;
        }

        public final long getBytesReceived() {
            return this.bytesReceived;
        }

        public final int getNumRequests() {
            return this.numRequests;
        }

        public int hashCode() {
            return (this.numRequests * 31) + C2689b.m32716a(this.bytesReceived);
        }

        public final void setBytesReceived(long j) {
            this.bytesReceived = j;
        }

        public final void setNumRequests(int i) {
            this.numRequests = i;
        }

        public String toString() {
            int i = this.numRequests;
            long j = this.bytesReceived;
            return "RequestStats(numRequests=" + i + ", bytesReceived=" + j + ")";
        }

        public /* synthetic */ RequestStats(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
        }
    }

    static {
        int myUid = Process.myUid();
        uid = myUid;
        initialCellularReceiveBytes = TrafficStats.getMobileRxBytes();
        initialCellularSendBytes = TrafficStats.getMobileTxBytes();
        initialTotalReceiveBytes = TrafficStats.getTotalRxBytes();
        initialTotalSendBytes = TrafficStats.getTotalTxBytes();
        initialAppReceiveBytes = TrafficStats.getUidRxBytes(myUid);
        initialAppSendBytes = TrafficStats.getUidTxBytes(myUid);
    }
}