package kotlinx.coroutines.scheduling;

import gg.C6759j;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C9770e0;
import kotlinx.coroutines.internal.C9774g0;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"", "a", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "b", "I", "CORE_POOL_SIZE", "c", "MAX_POOL_SIZE", "d", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/g;", "e", "Lkotlinx/coroutines/scheduling/g;", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/i;", "f", "Lkotlinx/coroutines/scheduling/i;", "NonBlockingContext", "g", "BlockingContext", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9869l {

    /* renamed from: a */
    public static final long f25712a;

    /* renamed from: b */
    public static final int f25713b;

    /* renamed from: c */
    public static final int f25714c;

    /* renamed from: d */
    public static final long f25715d;

    /* renamed from: e */
    public static AbstractC9864g f25716e;

    /* renamed from: f */
    public static final InterfaceC9866i f25717f;

    /* renamed from: g */
    public static final InterfaceC9866i f25718g;

    static {
        long m13306e;
        int m21930c;
        int m13307d;
        int m13307d2;
        long m13306e2;
        m13306e = C9774g0.m13306e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f25712a = m13306e;
        m21930c = C6759j.m21930c(C9770e0.m13327a(), 2);
        m13307d = C9774g0.m13307d("kotlinx.coroutines.scheduler.core.pool.size", m21930c, 1, 0, 8, null);
        f25713b = m13307d;
        m13307d2 = C9774g0.m13307d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f25714c = m13307d2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m13306e2 = C9774g0.m13306e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f25715d = timeUnit.toNanos(m13306e2);
        f25716e = C9862e.f25702a;
        f25717f = new C9867j(0);
        f25718g = new C9867j(1);
    }
}