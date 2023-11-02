package vi;

import android.os.Handler;
import android.os.Looper;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gg.C6759j;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9673a2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9817k2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.InterfaceC9688d1;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b+\u0010-J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, m14357d2 = {"Lvi/d;", "Lvi/e;", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "J0", "", "D0", "B0", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "v", "Lkotlinx/coroutines/d1;", "R", "", "toString", "", "other", "equals", "", "hashCode", "Landroid/os/Handler;", "l", "Landroid/os/Handler;", "handler", "m", "Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "n", "Z", "invokeImmediately", "_immediate", "Lvi/d;", "o", "K0", "()Lvi/d;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: vi.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13337d extends AbstractC13340e {
    private volatile C13337d _immediate;

    /* renamed from: l */
    private final Handler f34406l;

    /* renamed from: m */
    private final String f34407m;

    /* renamed from: n */
    private final boolean f34408n;

    /* renamed from: o */
    private final C13337d f34409o;

    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"", "run", "()V", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: vi.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class RunnableC13338a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ CancellableContinuation f34410j;

        /* renamed from: k */
        final /* synthetic */ C13337d f34411k;

        public RunnableC13338a(CancellableContinuation cancellableContinuation, C13337d c13337d) {
            this.f34410j = cancellableContinuation;
            this.f34411k = c13337d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f34410j.mo13125v(this.f34411k, Unit.f25302a);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke"}, m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: vi.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C13339b extends AbstractC9614s implements Function1<Throwable, Unit> {

        /* renamed from: k */
        final /* synthetic */ Runnable f34413k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13339b(Runnable runnable) {
            super(1);
            this.f34413k = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            C13337d.this.f34406l.removeCallbacks(this.f34413k);
        }
    }

    private C13337d(Handler handler, String str, boolean z) {
        super(null);
        this.f34406l = handler;
        this.f34407m = str;
        this.f34408n = z;
        this._immediate = z ? this : null;
        C13337d c13337d = this._immediate;
        if (c13337d == null) {
            c13337d = new C13337d(handler, str, true);
            this._immediate = c13337d;
        }
        this.f34409o = c13337d;
    }

    /* renamed from: J0 */
    private final void m2764J0(CoroutineContext coroutineContext, Runnable runnable) {
        C9673a2.m13581c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C9677b1.m13569b().mo2769B0(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m2762L0(C13337d c13337d, Runnable runnable) {
        c13337d.f34406l.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: B0 */
    public void mo2769B0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f34406l.post(runnable)) {
            m2764J0(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public boolean mo2768D0(CoroutineContext coroutineContext) {
        return (this.f34408n && C9612q.m13922c(Looper.myLooper(), this.f34406l.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.AbstractC9760i2
    /* renamed from: K0 */
    public C13337d mo2767F0() {
        return this.f34409o;
    }

    @Override // vi.AbstractC13340e, kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: R */
    public InterfaceC9688d1 mo2760R(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        long m21925h;
        Handler handler = this.f34406l;
        m21925h = C6759j.m21925h(j, 4611686018427387903L);
        if (handler.postDelayed(runnable, m21925h)) {
            return new InterfaceC9688d1() { // from class: vi.c
                @Override // kotlinx.coroutines.InterfaceC9688d1
                public final void dispose() {
                    C13337d.m2762L0(C13337d.this, runnable);
                }
            };
        }
        m2764J0(coroutineContext, runnable);
        return C9817k2.f25638j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13337d) && ((C13337d) obj).f34406l == this.f34406l;
    }

    public int hashCode() {
        return System.identityHashCode(this.f34406l);
    }

    @Override // kotlinx.coroutines.AbstractC9760i2, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String m13344G0 = m13344G0();
        if (m13344G0 == null) {
            String str = this.f34407m;
            if (str == null) {
                str = this.f34406l.toString();
            }
            if (this.f34408n) {
                return str + ".immediate";
            }
            return str;
        }
        return m13344G0;
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: v */
    public void mo2761v(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        long m21925h;
        RunnableC13338a runnableC13338a = new RunnableC13338a(cancellableContinuation, this);
        Handler handler = this.f34406l;
        m21925h = C6759j.m21925h(j, 4611686018427387903L);
        if (handler.postDelayed(runnableC13338a, m21925h)) {
            cancellableContinuation.mo13135l(new C13339b(runnableC13338a));
        } else {
            m2764J0(cancellableContinuation.getContext(), runnableC13338a);
        }
    }

    public /* synthetic */ C13337d(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C13337d(Handler handler, String str) {
        this(handler, str, false);
    }
}
