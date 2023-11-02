package ye;

import bf.InterfaceC2276b;
import java.util.concurrent.TimeUnit;

/* renamed from: ye.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC14015g {

    /* renamed from: a */
    static final long f36012a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: ye.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC14016a implements InterfaceC2276b {
        /* renamed from: a */
        public long m902a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: c */
        public InterfaceC2276b mo901c(Runnable runnable) {
            return mo900d(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* renamed from: d */
        public abstract InterfaceC2276b mo900d(Runnable runnable, long j, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public abstract AbstractC14016a mo903a();
}