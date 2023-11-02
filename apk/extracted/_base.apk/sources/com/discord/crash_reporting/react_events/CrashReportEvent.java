package com.discord.crash_reporting.react_events;

import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactnativecommunity.webview.RNCWebViewManager;
import eg.AbstractC6221c;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import kotlin.text.C9653o;
import kotlin.text.C9659r;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007HÂ\u0003J2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/crash_reporting/react_events/CrashReportEvent;", "Lcom/discord/reactevents/ReactEvent;", "crashedLastRun", "", "reason", "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "tombstone", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "(Ljava/lang/Boolean;Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;)V", "Ljava/lang/Boolean;", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;)Lcom/discord/crash_reporting/react_events/CrashReportEvent;", "equals", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CrashReportEvent implements ReactEvent {
    private final Boolean crashedLastRun;
    private final HistoricalProcessExitReason.Reason reason;
    private final SystemLogUtils.Tombstone tombstone;

    public CrashReportEvent(Boolean bool, HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone) {
        this.crashedLastRun = bool;
        this.reason = reason;
        this.tombstone = tombstone;
    }

    private final Boolean component1() {
        return this.crashedLastRun;
    }

    private final HistoricalProcessExitReason.Reason component2() {
        return this.reason;
    }

    private final SystemLogUtils.Tombstone component3() {
        return this.tombstone;
    }

    public static /* synthetic */ CrashReportEvent copy$default(CrashReportEvent crashReportEvent, Boolean bool, HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = crashReportEvent.crashedLastRun;
        }
        if ((i & 2) != 0) {
            reason = crashReportEvent.reason;
        }
        if ((i & 4) != 0) {
            tombstone = crashReportEvent.tombstone;
        }
        return crashReportEvent.copy(bool, reason, tombstone);
    }

    public final CrashReportEvent copy(Boolean bool, HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone) {
        return new CrashReportEvent(bool, reason, tombstone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CrashReportEvent) {
            CrashReportEvent crashReportEvent = (CrashReportEvent) obj;
            return C9612q.m13922c(this.crashedLastRun, crashReportEvent.crashedLastRun) && C9612q.m13922c(this.reason, crashReportEvent.reason) && C9612q.m13922c(this.tombstone, crashReportEvent.tombstone);
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.crashedLastRun;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        HistoricalProcessExitReason.Reason reason = this.reason;
        int hashCode2 = (hashCode + (reason == null ? 0 : reason.hashCode())) * 31;
        SystemLogUtils.Tombstone tombstone = this.tombstone;
        return hashCode2 + (tombstone != null ? tombstone.hashCode() : 0);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        int m21920m;
        boolean m13751w;
        String m13674a1;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Boolean bool = this.crashedLastRun;
        if (bool != null) {
            writableNativeMap.putBoolean("didCrash", bool.booleanValue());
        }
        HistoricalProcessExitReason.Reason reason = this.reason;
        if (reason != null) {
            writableNativeMap.putString("exitReason", reason.getReason());
            writableNativeMap.putString("exitDescription", reason.getReason());
        }
        SystemLogUtils.Tombstone tombstone = this.tombstone;
        if (tombstone != null) {
            writableNativeMap.putString("tombstoneGroupHash", tombstone.getGroupHash());
            String cause = tombstone.getCause();
            if (cause != null) {
                writableNativeMap.putString("tombstoneCause", cause);
            }
            m21920m = C6759j.m21920m(new IntRange(0, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA), AbstractC6221c.f17630j);
            if (m21920m == 0) {
                m13751w = C9653o.m13751w(tombstone.getText());
                if (!m13751w) {
                    m13674a1 = C9659r.m13674a1(tombstone.getText(), 6291456);
                    writableNativeMap.putString("tombstone", m13674a1);
                }
            }
        }
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("reports", NativeArrayExtensionsKt.nativeArrayOf(writableNativeMap)));
    }

    public String toString() {
        Boolean bool = this.crashedLastRun;
        HistoricalProcessExitReason.Reason reason = this.reason;
        SystemLogUtils.Tombstone tombstone = this.tombstone;
        return "CrashReportEvent(crashedLastRun=" + bool + ", reason=" + reason + ", tombstone=" + tombstone + ")";
    }
}
