package com.discord.resource_usage.utils;

import co.discord.media_engine.C2689b;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9654p;
import p467zf.C14196l;
import pf.C11577n;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/resource_usage/utils/ProcfsStats;", "", "totalTime", "", "rssPages", "(JJ)V", "getRssPages", "()J", "getTotalTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "resource_usage_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class ProcfsStats {
    public static final Companion Companion = new Companion(null);
    private static final Lazy<File> statFile$delegate;
    private final long rssPages;
    private final long totalTime;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m14357d2 = {"Lcom/discord/resource_usage/utils/ProcfsStats$Companion;", "", "()V", "statFile", "Ljava/io/File;", "getStatFile", "()Ljava/io/File;", "statFile$delegate", "Lkotlin/Lazy;", "readStatFile", "Lcom/discord/resource_usage/utils/ProcfsStats;", "parsePidStats", "resource_usage_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final File getStatFile() {
            return (File) ProcfsStats.statFile$delegate.getValue();
        }

        private final ProcfsStats parsePidStats(File file) {
            String m487d;
            boolean z;
            List m13683y0;
            try {
                if (!file.exists()) {
                    return null;
                }
                m487d = C14196l.m487d(file, null, 1, null);
                if (m487d.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                m13683y0 = C9654p.m13683y0(m487d, new char[]{' '}, false, 0, 6, null);
                return new ProcfsStats(C12562c.m4816T((String) m13683y0.get(13), 0L) + C12562c.m4816T((String) m13683y0.get(14), 0L), C12562c.m4816T((String) m13683y0.get(23), 0L));
            } catch (Exception unused) {
                return null;
            }
        }

        public final ProcfsStats readStatFile() {
            return parsePidStats(getStatFile());
        }
    }

    static {
        Lazy<File> m7601a;
        m7601a = C11577n.m7601a(ProcfsStats$Companion$statFile$2.INSTANCE);
        statFile$delegate = m7601a;
    }

    public ProcfsStats(long j, long j2) {
        this.totalTime = j;
        this.rssPages = j2;
    }

    public static /* synthetic */ ProcfsStats copy$default(ProcfsStats procfsStats, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = procfsStats.totalTime;
        }
        if ((i & 2) != 0) {
            j2 = procfsStats.rssPages;
        }
        return procfsStats.copy(j, j2);
    }

    public final long component1() {
        return this.totalTime;
    }

    public final long component2() {
        return this.rssPages;
    }

    public final ProcfsStats copy(long j, long j2) {
        return new ProcfsStats(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProcfsStats) {
            ProcfsStats procfsStats = (ProcfsStats) obj;
            return this.totalTime == procfsStats.totalTime && this.rssPages == procfsStats.rssPages;
        }
        return false;
    }

    public final long getRssPages() {
        return this.rssPages;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public int hashCode() {
        return (C2689b.m32716a(this.totalTime) * 31) + C2689b.m32716a(this.rssPages);
    }

    public String toString() {
        long j = this.totalTime;
        long j2 = this.rssPages;
        return "ProcfsStats(totalTime=" + j + ", rssPages=" + j2 + ")";
    }
}