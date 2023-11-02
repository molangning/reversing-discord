package p122gk;

import androidx.lifecycle.C1696m;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lgk/v;", "", "Lgk/u;", "c", "segment", "", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "Lgk/u;", "LOCK", "HASH_BUCKET_COUNT", "", "d", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6853v {

    /* renamed from: c */
    private static final int f19085c;

    /* renamed from: d */
    private static final AtomicReference<C6851u>[] f19086d;

    /* renamed from: e */
    public static final C6853v f19087e = new C6853v();

    /* renamed from: a */
    private static final int f19083a = 65536;

    /* renamed from: b */
    private static final C6851u f19084b = new C6851u(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f19085c = highestOneBit;
        AtomicReference<C6851u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f19086d = atomicReferenceArr;
    }

    private C6853v() {
    }

    /* renamed from: a */
    private final AtomicReference<C6851u> m21782a() {
        Thread currentThread = Thread.currentThread();
        C9612q.m13918g(currentThread, "Thread.currentThread()");
        return f19086d[(int) (currentThread.getId() & (f19085c - 1))];
    }

    /* renamed from: b */
    public static final void m21781b(C6851u segment) {
        boolean z;
        AtomicReference<C6851u> m21782a;
        C6851u c6851u;
        int i;
        C9612q.m13917h(segment, "segment");
        if (segment.f19081f == null && segment.f19082g == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (segment.f19079d || (c6851u = (m21782a = f19087e.m21782a()).get()) == f19084b) {
                return;
            }
            if (c6851u != null) {
                i = c6851u.f19078c;
            } else {
                i = 0;
            }
            if (i >= f19083a) {
                return;
            }
            segment.f19081f = c6851u;
            segment.f19077b = 0;
            segment.f19078c = i + 8192;
            if (!C1696m.m36034a(m21782a, c6851u, segment)) {
                segment.f19081f = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public static final C6851u m21780c() {
        AtomicReference<C6851u> m21782a = f19087e.m21782a();
        C6851u c6851u = f19084b;
        C6851u andSet = m21782a.getAndSet(c6851u);
        if (andSet == c6851u) {
            return new C6851u();
        }
        if (andSet == null) {
            m21782a.set(null);
            return new C6851u();
        }
        m21782a.set(andSet.f19081f);
        andSet.f19081f = null;
        andSet.f19078c = 0;
        return andSet;
    }
}