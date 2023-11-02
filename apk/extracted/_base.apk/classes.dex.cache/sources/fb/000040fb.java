package kotlinx.coroutines;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9773g;
import p388vf.C13277d;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e\u0012\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b{\u0010|J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u001e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JK\u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b*\u0010+J9\u0010,\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b,\u0010-J;\u0010/\u001a\u0004\u0018\u00010.2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0002012\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0006H\u0001¢\u0006\u0004\b6\u0010\bJ\u0011\u00107\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u0010\fJ\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b?\u0010@J)\u0010A\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bA\u0010\u0012J\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\bF\u00108J \u0010I\u001a\u00020\u000e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00028\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0000¢\u0006\u0004\bP\u0010\u0019J#\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bQ\u0010RJ9\u0010S\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010\u001a2\u0006\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010JJ\u001b\u0010[\u001a\u00020\u000e*\u00020Z2\u0006\u0010K\u001a\u00028\u0000H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020aH\u0014¢\u0006\u0004\bd\u0010cR \u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010k\u001a\u0004\bl\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010oR\u0014\u0010r\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010cR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u00108R\u0014\u0010u\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\bR\u0014\u0010w\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\bR\u001c\u0010z\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006}"}, m14357d2 = {"Lkotlinx/coroutines/p;", "T", "Lkotlinx/coroutines/y0;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "E", "()Z", "", "cause", "q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "j", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Q", "O", "Lkotlinx/coroutines/d1;", "D", "()Lkotlinx/coroutines/d1;", "J", "()V", "", "state", "G", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/n;", "F", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/n;", "", "mode", "w", "(I)V", "Lkotlinx/coroutines/l2;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "N", "(Lkotlinx/coroutines/l2;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "L", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/d0;", "P", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/d0;", "", "h", "(Ljava/lang/Object;)Ljava/lang/Void;", "t", "C", "K", "g", "()Ljava/lang/Object;", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "r", "I", "(Ljava/lang/Throwable;)V", "m", "(Lkotlinx/coroutines/n;Ljava/lang/Throwable;)V", "o", "Lkotlinx/coroutines/Job;", "parent", "x", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "y", "Lpf/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "p", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "l", "(Lkotlin/jvm/functions/Function1;)V", "s", "k", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "u", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "n", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "B", "Lkotlinx/coroutines/CoroutineDispatcher;", "v", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "H", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/Continuation;", "c", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/d1;", "parentHandle", "A", "stateDebugRepresentation", "z", "a", "isActive", "i", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9838p<T> extends AbstractC9916y0<T> implements CancellableContinuation<T>, CoroutineStackFrame {

    /* renamed from: p */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25655p = AtomicIntegerFieldUpdater.newUpdater(C9838p.class, "_decision");

    /* renamed from: q */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25656q = AtomicReferenceFieldUpdater.newUpdater(C9838p.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: m */
    private final Continuation<T> f25657m;

    /* renamed from: n */
    private final CoroutineContext f25658n;

    /* renamed from: o */
    private InterfaceC9688d1 f25659o;

    /* JADX WARN: Multi-variable type inference failed */
    public C9838p(Continuation<? super T> continuation, int i) {
        super(i);
        this.f25657m = continuation;
        this.f25658n = continuation.getContext();
        this._decision = 0;
        this._state = C9686d.f25426j;
    }

    /* renamed from: A */
    private final String m13157A() {
        Object m13121z = m13121z();
        if (m13121z instanceof InterfaceC9822l2) {
            return "Active";
        }
        if (m13121z instanceof C9850s) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: D */
    private final InterfaceC9688d1 m13154D() {
        Job job = (Job) getContext().mo1458j(Job.f25404c);
        if (job == null) {
            return null;
        }
        InterfaceC9688d1 m13591d = Job.C9668a.m13591d(job, true, false, new C9894t(this), 2, null);
        this.f25659o = m13591d;
        return m13591d;
    }

    /* renamed from: E */
    private final boolean m13153E() {
        return C9920z0.m12953c(this.f25774l) && ((C9773g) this.f25657m).m13314q();
    }

    /* renamed from: F */
    private final AbstractC9827n m13152F(Function1<? super Throwable, Unit> function1) {
        return function1 instanceof AbstractC9827n ? (AbstractC9827n) function1 : new C9901u1(function1);
    }

    /* renamed from: G */
    private final void m13151G(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    /* renamed from: J */
    private final void m13148J() {
        C9773g c9773g;
        Throwable m13311w;
        Continuation<T> continuation = this.f25657m;
        if (continuation instanceof C9773g) {
            c9773g = (C9773g) continuation;
        } else {
            c9773g = null;
        }
        if (c9773g != null && (m13311w = c9773g.m13311w(this)) != null) {
            m13128s();
            mo13129r(m13311w);
        }
    }

    /* renamed from: L */
    private final void m13146L(Object obj, int i, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof InterfaceC9822l2) {
            } else {
                if (obj2 instanceof C9850s) {
                    C9850s c9850s = (C9850s) obj2;
                    if (c9850s.m13100c()) {
                        if (function1 != null) {
                            m13132o(function1, c9850s.f25415a);
                            return;
                        }
                        return;
                    }
                }
                m13139h(obj);
                throw new C11568i();
            }
        } while (!C0647b.m39437a(f25656q, this, obj2, m13144N((InterfaceC9822l2) obj2, obj, i, function1, null)));
        m13127t();
        m13124w(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    static /* synthetic */ void m13145M(C9838p c9838p, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        c9838p.m13146L(obj, i, function1);
    }

    /* renamed from: N */
    private final Object m13144N(InterfaceC9822l2 interfaceC9822l2, Object obj, int i, Function1<? super Throwable, Unit> function1, Object obj2) {
        AbstractC9827n abstractC9827n;
        if (!(obj instanceof C9676b0)) {
            if (C9920z0.m12954b(i) || obj2 != null) {
                if (function1 != null || (((interfaceC9822l2 instanceof AbstractC9827n) && !(interfaceC9822l2 instanceof AbstractC9741g)) || obj2 != null)) {
                    if (interfaceC9822l2 instanceof AbstractC9827n) {
                        abstractC9827n = (AbstractC9827n) interfaceC9822l2;
                    } else {
                        abstractC9827n = null;
                    }
                    return new C9671a0(obj, abstractC9827n, function1, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    /* renamed from: O */
    private final boolean m13143O() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f25655p.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: P */
    private final C9768d0 m13142P(Object obj, Object obj2, Function1<? super Throwable, Unit> function1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof InterfaceC9822l2) {
            } else if (!(obj3 instanceof C9671a0) || obj2 == null || ((C9671a0) obj3).f25410d != obj2) {
                return null;
            } else {
                return C9842q.f25662a;
            }
        } while (!C0647b.m39437a(f25656q, this, obj3, m13144N((InterfaceC9822l2) obj3, obj, this.f25774l, function1, obj2)));
        m13127t();
        return C9842q.f25662a;
    }

    /* renamed from: Q */
    private final boolean m13141Q() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f25655p.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: h */
    private final Void m13139h(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: j */
    private final void m13137j(Function1<? super Throwable, Unit> function1, Throwable th2) {
        try {
            function1.invoke(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C9815k0.m13185a(context, new C9694e0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* renamed from: q */
    private final boolean m13130q(Throwable th2) {
        if (!m13153E()) {
            return false;
        }
        return ((C9773g) this.f25657m).m13313s(th2);
    }

    /* renamed from: t */
    private final void m13127t() {
        if (m13153E()) {
            return;
        }
        m13128s();
    }

    /* renamed from: w */
    private final void m13124w(int i) {
        if (m13143O()) {
            return;
        }
        C9920z0.m12955a(this, i);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: B */
    public void mo13156B(Object obj) {
        m13124w(this.f25774l);
    }

    /* renamed from: C */
    public void m13155C() {
        InterfaceC9688d1 m13154D = m13154D();
        if (m13154D != null && mo13138i()) {
            m13154D.dispose();
            this.f25659o = C9817k2.f25638j;
        }
    }

    /* renamed from: H */
    protected String mo13150H() {
        return "CancellableContinuation";
    }

    /* renamed from: I */
    public final void m13149I(Throwable th2) {
        if (m13130q(th2)) {
            return;
        }
        mo13129r(th2);
        m13127t();
    }

    /* renamed from: K */
    public final boolean m13147K() {
        Object obj = this._state;
        if ((obj instanceof C9671a0) && ((C9671a0) obj).f25410d != null) {
            m13128s();
            return false;
        }
        this._decision = 0;
        this._state = C9686d.f25426j;
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: a */
    public boolean mo13140a() {
        return m13121z() instanceof InterfaceC9822l2;
    }

    @Override // kotlinx.coroutines.AbstractC9916y0
    /* renamed from: b */
    public void mo12964b(Object obj, Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC9822l2)) {
                if (obj2 instanceof C9676b0) {
                    return;
                }
                if (obj2 instanceof C9671a0) {
                    C9671a0 c9671a0 = (C9671a0) obj2;
                    if (!c9671a0.m13585c()) {
                        if (C0647b.m39437a(f25656q, this, obj2, C9671a0.m13586b(c9671a0, null, null, null, null, th2, 15, null))) {
                            c9671a0.m13584d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C0647b.m39437a(f25656q, this, obj2, new C9671a0(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC9916y0
    /* renamed from: c */
    public final Continuation<T> mo12963c() {
        return this.f25657m;
    }

    @Override // kotlinx.coroutines.AbstractC9916y0
    /* renamed from: d */
    public Throwable mo12962d(Object obj) {
        Throwable mo12962d = super.mo12962d(obj);
        if (mo12962d != null) {
            return mo12962d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC9916y0
    /* renamed from: e */
    public <T> T mo12961e(Object obj) {
        return obj instanceof C9671a0 ? (T) ((C9671a0) obj).f25407a : obj;
    }

    @Override // kotlinx.coroutines.AbstractC9916y0
    /* renamed from: g */
    public Object mo12959g() {
        return m13121z();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f25657m;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f25658n;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: i */
    public boolean mo13138i() {
        return !(m13121z() instanceof InterfaceC9822l2);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: k */
    public Object mo13136k(T t, Object obj) {
        return m13142P(t, obj, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: l */
    public void mo13135l(Function1<? super Throwable, Unit> function1) {
        AbstractC9827n m13152F = m13152F(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C9686d) {
                if (C0647b.m39437a(f25656q, this, obj, m13152F)) {
                    return;
                }
            } else if (obj instanceof AbstractC9827n) {
                m13151G(function1, obj);
            } else {
                boolean z = obj instanceof C9676b0;
                if (z) {
                    C9676b0 c9676b0 = (C9676b0) obj;
                    if (!c9676b0.m13571b()) {
                        m13151G(function1, obj);
                    }
                    if (obj instanceof C9850s) {
                        Throwable th2 = null;
                        if (!z) {
                            c9676b0 = null;
                        }
                        if (c9676b0 != null) {
                            th2 = c9676b0.f25415a;
                        }
                        m13137j(function1, th2);
                        return;
                    }
                    return;
                } else if (obj instanceof C9671a0) {
                    C9671a0 c9671a0 = (C9671a0) obj;
                    if (c9671a0.f25408b != null) {
                        m13151G(function1, obj);
                    }
                    if (m13152F instanceof AbstractC9741g) {
                        return;
                    }
                    if (c9671a0.m13585c()) {
                        m13137j(function1, c9671a0.f25411e);
                        return;
                    }
                    if (C0647b.m39437a(f25656q, this, obj, C9671a0.m13586b(c9671a0, null, m13152F, null, null, null, 29, null))) {
                        return;
                    }
                } else if (m13152F instanceof AbstractC9741g) {
                    return;
                } else {
                    if (C0647b.m39437a(f25656q, this, obj, new C9671a0(obj, m13152F, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void m13134m(AbstractC9827n abstractC9827n, Throwable th2) {
        try {
            abstractC9827n.mo2138a(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C9815k0.m13185a(context, new C9694e0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: n */
    public Object mo13133n(Throwable th2) {
        return m13142P(new C9676b0(th2, false, 2, null), null, null);
    }

    /* renamed from: o */
    public final void m13132o(Function1<? super Throwable, Unit> function1, Throwable th2) {
        try {
            function1.invoke(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C9815k0.m13185a(context, new C9694e0("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: p */
    public void mo13131p(T t, Function1<? super Throwable, Unit> function1) {
        m13146L(t, this.f25774l, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: r */
    public boolean mo13129r(Throwable th2) {
        Object obj;
        boolean z;
        AbstractC9827n abstractC9827n;
        do {
            obj = this._state;
            if (!(obj instanceof InterfaceC9822l2)) {
                return false;
            }
            z = obj instanceof AbstractC9827n;
        } while (!C0647b.m39437a(f25656q, this, obj, new C9850s(this, th2, z)));
        if (z) {
            abstractC9827n = (AbstractC9827n) obj;
        } else {
            abstractC9827n = null;
        }
        if (abstractC9827n != null) {
            m13134m(abstractC9827n, th2);
        }
        m13127t();
        m13124w(this.f25774l);
        return true;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        m13145M(this, C9703f0.m13475c(obj, this), this.f25774l, null, 4, null);
    }

    /* renamed from: s */
    public final void m13128s() {
        InterfaceC9688d1 interfaceC9688d1 = this.f25659o;
        if (interfaceC9688d1 == null) {
            return;
        }
        interfaceC9688d1.dispose();
        this.f25659o = C9817k2.f25638j;
    }

    public String toString() {
        return mo13150H() + '(' + C9839p0.m13118c(this.f25657m) + "){" + m13157A() + "}@" + C9839p0.m13119b(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: u */
    public Object mo13126u(T t, Object obj, Function1<? super Throwable, Unit> function1) {
        return m13142P(t, obj, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: v */
    public void mo13125v(CoroutineDispatcher coroutineDispatcher, T t) {
        C9773g c9773g;
        int i;
        Continuation<T> continuation = this.f25657m;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (continuation instanceof C9773g) {
            c9773g = (C9773g) continuation;
        } else {
            c9773g = null;
        }
        if (c9773g != null) {
            coroutineDispatcher2 = c9773g.f25578m;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i = 4;
        } else {
            i = this.f25774l;
        }
        m13145M(this, t, i, null, 4, null);
    }

    /* renamed from: x */
    public Throwable mo13123x(Job job) {
        return job.mo13542D();
    }

    /* renamed from: y */
    public final Object m13122y() {
        Job job;
        Object m2869d;
        boolean m13153E = m13153E();
        if (m13141Q()) {
            if (this.f25659o == null) {
                m13154D();
            }
            if (m13153E) {
                m13148J();
            }
            m2869d = C13277d.m2869d();
            return m2869d;
        }
        if (m13153E) {
            m13148J();
        }
        Object m13121z = m13121z();
        if (!(m13121z instanceof C9676b0)) {
            if (C9920z0.m12954b(this.f25774l) && (job = (Job) getContext().mo1458j(Job.f25404c)) != null && !job.mo2067a()) {
                CancellationException mo13542D = job.mo13542D();
                mo12964b(m13121z, mo13542D);
                throw mo13542D;
            }
            return mo12961e(m13121z);
        }
        throw ((C9676b0) m13121z).f25415a;
    }

    /* renamed from: z */
    public final Object m13121z() {
        return this._state;
    }
}