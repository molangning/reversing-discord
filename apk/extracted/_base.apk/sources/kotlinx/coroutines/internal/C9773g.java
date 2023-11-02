package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.AbstractC9750h1;
import kotlinx.coroutines.AbstractC9916y0;
import kotlinx.coroutines.C9681c0;
import kotlinx.coroutines.C9703f0;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.C9839p0;
import kotlinx.coroutines.C9906v2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(m14358d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010,\u001a\u00020*\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b>\u0010?J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0010¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010+R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u000bR\u0014\u00104\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001a\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000fR\u0014\u0010#\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u0010:\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, m14357d2 = {"Lkotlinx/coroutines/internal/g;", "T", "Lkotlinx/coroutines/y0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "", "q", "()Z", "", "h", "()V", "t", "Lkotlinx/coroutines/p;", "j", "()Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "", "w", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "cause", "s", "(Ljava/lang/Throwable;)Z", "", "g", "()Ljava/lang/Object;", "Lpf/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "m", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "n", "Lkotlin/coroutines/Continuation;", "o", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "p", "countOrElement", "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "c", "()Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9773g<T> extends AbstractC9916y0<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: q */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25577q = AtomicReferenceFieldUpdater.newUpdater(C9773g.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: m */
    public final CoroutineDispatcher f25578m;

    /* renamed from: n */
    public final Continuation<T> f25579n;

    /* renamed from: o */
    public Object f25580o;

    /* renamed from: p */
    public final Object f25581p;

    /* JADX WARN: Multi-variable type inference failed */
    public C9773g(CoroutineDispatcher coroutineDispatcher, Continuation<? super T> continuation) {
        super(-1);
        this.f25578m = coroutineDispatcher;
        this.f25579n = continuation;
        this.f25580o = C9775h.m13305a();
        this.f25581p = C9776h0.m13300b(getContext());
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: o */
    private final C9838p<?> m13315o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C9838p) {
            return (C9838p) obj;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC9916y0
    /* renamed from: b */
    public void mo12964b(Object obj, Throwable th2) {
        if (obj instanceof C9681c0) {
            ((C9681c0) obj).f25422b.invoke(th2);
        }
    }

    @Override // kotlinx.coroutines.AbstractC9916y0
    /* renamed from: c */
    public Continuation<T> mo12963c() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractC9916y0
    /* renamed from: g */
    public Object mo12959g() {
        Object obj = this.f25580o;
        this.f25580o = C9775h.m13305a();
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f25579n;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f25579n.getContext();
    }

    /* renamed from: h */
    public final void m13318h() {
        do {
        } while (this._reusableCancellableContinuation == C9775h.f25583b);
    }

    /* renamed from: j */
    public final C9838p<T> m13317j() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C9775h.f25583b;
                return null;
            } else if (obj instanceof C9838p) {
                if (C0647b.m39437a(f25577q, this, obj, C9775h.f25583b)) {
                    return (C9838p) obj;
                }
            } else if (obj != C9775h.f25583b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: m */
    public final void m13316m(CoroutineContext coroutineContext, T t) {
        this.f25580o = t;
        this.f25774l = 1;
        this.f25578m.mo13051C0(coroutineContext, this);
    }

    /* renamed from: q */
    public final boolean m13314q() {
        return this._reusableCancellableContinuation != null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        CoroutineContext context = this.f25579n.getContext();
        Object m13474d = C9703f0.m13474d(obj, null, 1, null);
        if (this.f25578m.mo2768D0(context)) {
            this.f25580o = m13474d;
            this.f25774l = 0;
            this.f25578m.mo2769B0(context, this);
            return;
        }
        AbstractC9750h1 m12980b = C9906v2.f25766a.m12980b();
        if (m12980b.m13367M0()) {
            this.f25580o = m13474d;
            this.f25774l = 0;
            m12980b.m13370I0(this);
            return;
        }
        m12980b.m13369K0(true);
        try {
            CoroutineContext context2 = getContext();
            Object m13299c = C9776h0.m13299c(context2, this.f25581p);
            this.f25579n.resumeWith(obj);
            Unit unit = Unit.f25302a;
            C9776h0.m13301a(context2, m13299c);
            do {
            } while (m12980b.m13365P0());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final boolean m13313s(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C9768d0 c9768d0 = C9775h.f25583b;
            if (C9612q.m13922c(obj, c9768d0)) {
                if (C0647b.m39437a(f25577q, this, c9768d0, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C0647b.m39437a(f25577q, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: t */
    public final void m13312t() {
        m13318h();
        C9838p<?> m13315o = m13315o();
        if (m13315o != null) {
            m13315o.m13128s();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f25578m + ", " + C9839p0.m13118c(this.f25579n) + ']';
    }

    /* renamed from: w */
    public final Throwable m13311w(CancellableContinuation<?> cancellableContinuation) {
        C9768d0 c9768d0;
        do {
            Object obj = this._reusableCancellableContinuation;
            c9768d0 = C9775h.f25583b;
            if (obj != c9768d0) {
                if (obj instanceof Throwable) {
                    if (C0647b.m39437a(f25577q, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C0647b.m39437a(f25577q, this, c9768d0, cancellableContinuation));
        return null;
    }
}
