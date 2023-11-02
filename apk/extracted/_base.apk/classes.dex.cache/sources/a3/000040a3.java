package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C9761a;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, m14357d2 = {"Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "unconfined", "", "H0", "O0", "P0", "Q0", "Lkotlinx/coroutines/y0;", "task", "", "I0", "K0", "F0", "shutdown", "l", "J", "useCount", "m", "Z", "shared", "Lkotlinx/coroutines/internal/a;", "n", "Lkotlinx/coroutines/internal/a;", "unconfinedQueue", "J0", "()J", "nextTime", "M0", "()Z", "isUnconfinedLoopActive", "N0", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9750h1 extends CoroutineDispatcher {

    /* renamed from: l */
    private long f25548l;

    /* renamed from: m */
    private boolean f25549m;

    /* renamed from: n */
    private C9761a<AbstractC9916y0<?>> f25550n;

    /* renamed from: G0 */
    public static /* synthetic */ void m13372G0(AbstractC9750h1 abstractC9750h1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC9750h1.m13373F0(z);
    }

    /* renamed from: H0 */
    private final long m13371H0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m13368L0(AbstractC9750h1 abstractC9750h1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC9750h1.m13369K0(z);
    }

    /* renamed from: F0 */
    public final void m13373F0(boolean z) {
        long m13371H0 = this.f25548l - m13371H0(z);
        this.f25548l = m13371H0;
        if (m13371H0 <= 0 && this.f25549m) {
            shutdown();
        }
    }

    /* renamed from: I0 */
    public final void m13370I0(AbstractC9916y0<?> abstractC9916y0) {
        C9761a<AbstractC9916y0<?>> c9761a = this.f25550n;
        if (c9761a == null) {
            c9761a = new C9761a<>();
            this.f25550n = c9761a;
        }
        c9761a.m13343a(abstractC9916y0);
    }

    /* renamed from: J0 */
    public long mo13362J0() {
        C9761a<AbstractC9916y0<?>> c9761a = this.f25550n;
        if (c9761a == null || c9761a.m13341c()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* renamed from: K0 */
    public final void m13369K0(boolean z) {
        this.f25548l += m13371H0(z);
        if (!z) {
            this.f25549m = true;
        }
    }

    /* renamed from: M0 */
    public final boolean m13367M0() {
        return this.f25548l >= m13371H0(true);
    }

    /* renamed from: N0 */
    public final boolean m13366N0() {
        C9761a<AbstractC9916y0<?>> c9761a = this.f25550n;
        if (c9761a != null) {
            return c9761a.m13341c();
        }
        return true;
    }

    /* renamed from: O0 */
    public long mo13361O0() {
        return !m13365P0() ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: P0 */
    public final boolean m13365P0() {
        AbstractC9916y0<?> m13340d;
        C9761a<AbstractC9916y0<?>> c9761a = this.f25550n;
        if (c9761a == null || (m13340d = c9761a.m13340d()) == null) {
            return false;
        }
        m13340d.run();
        return true;
    }

    /* renamed from: Q0 */
    public boolean m13364Q0() {
        return false;
    }

    public void shutdown() {
    }
}