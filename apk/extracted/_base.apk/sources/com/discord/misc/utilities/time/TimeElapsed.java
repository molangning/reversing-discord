package com.discord.misc.utilities.time;

import co.discord.media_engine.C2689b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11577n;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/misc/utilities/time/TimeElapsed;", "", "startTime", "", "(J)V", "duration", "", "getDuration", "()Ljava/lang/String;", "duration$delegate", "Lkotlin/Lazy;", "durationMillis", "getDurationMillis", "()J", "durationMillis$delegate", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "misc_utilities_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class TimeElapsed {
    private final Lazy duration$delegate;
    private final Lazy durationMillis$delegate;
    private final long startTime;

    public TimeElapsed() {
        this(0L, 1, null);
    }

    public TimeElapsed(long j) {
        Lazy m7601a;
        Lazy m7601a2;
        this.startTime = j;
        m7601a = C11577n.m7601a(new TimeElapsed$durationMillis$2(this));
        this.durationMillis$delegate = m7601a;
        m7601a2 = C11577n.m7601a(new TimeElapsed$duration$2(this));
        this.duration$delegate = m7601a2;
    }

    private final long component1() {
        return this.startTime;
    }

    public static /* synthetic */ TimeElapsed copy$default(TimeElapsed timeElapsed, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timeElapsed.startTime;
        }
        return timeElapsed.copy(j);
    }

    public final TimeElapsed copy(long j) {
        return new TimeElapsed(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeElapsed) && this.startTime == ((TimeElapsed) obj).startTime;
    }

    public final String getDuration() {
        Object value = this.duration$delegate.getValue();
        C9612q.m13918g(value, "<get-duration>(...)");
        return (String) value;
    }

    public final long getDurationMillis() {
        return ((Number) this.durationMillis$delegate.getValue()).longValue();
    }

    public int hashCode() {
        return C2689b.m32716a(this.startTime);
    }

    public String toString() {
        long j = this.startTime;
        return "TimeElapsed(startTime=" + j + ")";
    }

    public /* synthetic */ TimeElapsed(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j);
    }
}
