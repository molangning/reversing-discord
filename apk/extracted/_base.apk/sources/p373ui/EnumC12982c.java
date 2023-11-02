package p373ui;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m14357d2 = {"Lui/c;", "", "Ljava/util/concurrent/TimeUnit;", "j", "Ljava/util/concurrent/TimeUnit;", "b", "()Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "k", "l", "m", "n", "o", "p", "q", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ui.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC12982c {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: j */
    private final TimeUnit f33746j;

    EnumC12982c(TimeUnit timeUnit) {
        this.f33746j = timeUnit;
    }

    /* renamed from: b */
    public final TimeUnit m3535b() {
        return this.f33746j;
    }
}
