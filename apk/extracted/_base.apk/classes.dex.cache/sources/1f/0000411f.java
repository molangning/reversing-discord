package kotlinx.coroutines.selects;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.AbstractC9917y1;
import kotlinx.coroutines.C9676b0;
import kotlinx.coroutines.C9703f0;
import kotlinx.coroutines.C9815k0;
import kotlinx.coroutines.C9842q;
import kotlinx.coroutines.C9904v0;
import kotlinx.coroutines.InterfaceC9688d1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.AbstractC9763b;
import kotlinx.coroutines.internal.AbstractC9767d;
import kotlinx.coroutines.internal.AbstractC9808y;
import kotlinx.coroutines.internal.C9789n;
import kotlinx.coroutines.internal.C9791p;
import p388vf.C13272c;
import p388vf.C13277d;
import p450yi.C14031a;
import p450yi.C14032b;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004JKLMB\u0015\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bH\u0010IJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*JG\u0010/\u001a\u00020\b\"\u0004\b\u0001\u0010+*\b\u0012\u0004\u0012\u00028\u00010,2\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J8\u00104\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001403H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00106R(\u0010<\u001a\u0004\u0018\u00010\u00192\b\u00108\u001a\u0004\u0018\u00010\u00198B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u001cR\u001c\u0010?\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, m14357d2 = {"Lkotlinx/coroutines/selects/b;", "R", "Lkotlinx/coroutines/internal/n;", "Lkotlinx/coroutines/selects/a;", "Lkotlinx/coroutines/selects/d;", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "d0", "()V", "Z", "Lpf/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "x", "(Ljava/lang/Throwable;)V", "", "b0", "()Ljava/lang/Object;", "e", "c0", "Lkotlinx/coroutines/d1;", "handle", "m", "(Lkotlinx/coroutines/d1;)V", "", "s", "()Z", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "q", "(Lkotlinx/coroutines/internal/p$c;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/b;", "desc", "y", "(Lkotlinx/coroutines/internal/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Q", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function2;", "block", "A", "(Lkotlinx/coroutines/selects/c;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "Lkotlin/Function1;", "g", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/Continuation;", "uCont", "value", "a0", "()Lkotlinx/coroutines/d1;", "e0", "parentHandle", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "w", "()Lkotlin/coroutines/Continuation;", "completion", "isSelected", "<init>", "(Lkotlin/coroutines/Continuation;)V", "a", "b", "c", "d", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.selects.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9874b<R> extends C9789n implements InterfaceC9873a<R>, InterfaceC9881d<R>, Continuation<R>, CoroutineStackFrame {

    /* renamed from: n */
    static final /* synthetic */ AtomicReferenceFieldUpdater f25725n = AtomicReferenceFieldUpdater.newUpdater(C9874b.class, Object.class, "_state");

    /* renamed from: o */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25726o = AtomicReferenceFieldUpdater.newUpdater(C9874b.class, Object.class, "_result");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _result;
    volatile /* synthetic */ Object _state = C9882e.m13010e();

    /* renamed from: m */
    private final Continuation<R> f25727m;

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m14357d2 = {"Lkotlinx/coroutines/selects/b$a;", "Lkotlinx/coroutines/internal/d;", "", "k", "", "l", "failure", "j", "affected", "i", "d", "", "toString", "Lkotlinx/coroutines/selects/b;", "b", "Lkotlinx/coroutines/selects/b;", "impl", "Lkotlinx/coroutines/internal/b;", "c", "Lkotlinx/coroutines/internal/b;", "desc", "", "J", "g", "()J", "opSequence", "<init>", "(Lkotlinx/coroutines/selects/b;Lkotlinx/coroutines/internal/b;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9875a extends AbstractC9767d<Object> {

        /* renamed from: b */
        public final C9874b<?> f25728b;

        /* renamed from: c */
        public final AbstractC9763b f25729c;

        /* renamed from: d */
        private final long f25730d;

        public C9875a(C9874b<?> c9874b, AbstractC9763b abstractC9763b) {
            C9883f c9883f;
            this.f25728b = c9874b;
            this.f25729c = abstractC9763b;
            c9883f = C9882e.f25740e;
            this.f25730d = c9883f.m13009a();
            abstractC9763b.m13335d(this);
        }

        /* renamed from: j */
        private final void m13026j(Object obj) {
            boolean z;
            Object m13010e;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m13010e = null;
            } else {
                m13010e = C9882e.m13010e();
            }
            if (C0647b.m39437a(C9874b.f25725n, this.f25728b, this, m13010e) && z) {
                this.f25728b.m13034Z();
            }
        }

        /* renamed from: k */
        private final Object m13025k() {
            C9874b<?> c9874b = this.f25728b;
            while (true) {
                Object obj = c9874b._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof AbstractC9808y) {
                    ((AbstractC9808y) obj).mo13022c(this.f25728b);
                } else if (obj == C9882e.m13010e()) {
                    if (C0647b.m39437a(C9874b.f25725n, this.f25728b, C9882e.m13010e(), this)) {
                        return null;
                    }
                } else {
                    return C9882e.m13011d();
                }
            }
        }

        /* renamed from: l */
        private final void m13024l() {
            C0647b.m39437a(C9874b.f25725n, this.f25728b, this, C9882e.m13010e());
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: d */
        public void mo13001d(Object obj, Object obj2) {
            m13026j(obj2);
            this.f25729c.mo13241a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: g */
        public long mo13027g() {
            return this.f25730d;
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: i */
        public Object mo2115i(Object obj) {
            Object m13025k;
            if (obj == null && (m13025k = m13025k()) != null) {
                return m13025k;
            }
            try {
                return this.f25729c.mo13240c(this);
            } catch (Throwable th2) {
                if (obj == null) {
                    m13024l();
                }
                throw th2;
            }
        }

        @Override // kotlinx.coroutines.internal.AbstractC9808y
        public String toString() {
            return "AtomicSelectOp(sequence=" + mo13027g() + ')';
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lkotlinx/coroutines/selects/b$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/d1;", "m", "Lkotlinx/coroutines/d1;", "handle", "<init>", "(Lkotlinx/coroutines/d1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9876b extends C9791p {

        /* renamed from: m */
        public final InterfaceC9688d1 f25731m;

        public C9876b(InterfaceC9688d1 interfaceC9688d1) {
            this.f25731m = interfaceC9688d1;
        }
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lkotlinx/coroutines/selects/b$c;", "Lkotlinx/coroutines/internal/y;", "", "affected", "c", "Lkotlinx/coroutines/internal/p$c;", "a", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/p$c;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9877c extends AbstractC9808y {

        /* renamed from: a */
        public final C9791p.C9794c f25732a;

        public C9877c(C9791p.C9794c c9794c) {
            this.f25732a = c9794c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC9808y
        /* renamed from: a */
        public AbstractC9767d<?> mo13023a() {
            return this.f25732a.mo13023a();
        }

        @Override // kotlinx.coroutines.internal.AbstractC9808y
        /* renamed from: c */
        public Object mo13022c(Object obj) {
            Object m13010e;
            if (obj != null) {
                C9874b c9874b = (C9874b) obj;
                this.f25732a.m13238d();
                Object m13331e = this.f25732a.mo13023a().m13331e(null);
                if (m13331e == null) {
                    m13010e = this.f25732a.f25612c;
                } else {
                    m13010e = C9882e.m13010e();
                }
                C0647b.m39437a(C9874b.f25725n, c9874b, this, m13010e);
                return m13331e;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, m14357d2 = {"Lkotlinx/coroutines/selects/b$d;", "Lkotlinx/coroutines/y1;", "", "cause", "", "W", "<init>", "(Lkotlinx/coroutines/selects/b;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C9878d extends AbstractC9917y1 {
        public C9878d() {
            C9874b.this = r1;
        }

        @Override // kotlinx.coroutines.AbstractC9687d0
        /* renamed from: W */
        public void mo12976W(Throwable th2) {
            if (C9874b.this.mo13018s()) {
                C9874b.this.mo13016x(m13557X().mo13542D());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo12976W(th2);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"", "run", "()V", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class RunnableC9879e implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Function1 f25735k;

        public RunnableC9879e(Function1 function1) {
            C9874b.this = r1;
            this.f25735k = function1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C9874b.this.mo13018s()) {
                C14031a.m863c(this.f25735k, C9874b.this.mo13017w());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9874b(Continuation<? super R> continuation) {
        Object obj;
        this.f25727m = continuation;
        obj = C9882e.f25738c;
        this._result = obj;
        this._parentHandle = null;
    }

    /* renamed from: Z */
    public final void m13034Z() {
        InterfaceC9688d1 m13033a0 = m13033a0();
        if (m13033a0 != null) {
            m13033a0.dispose();
        }
        for (C9791p c9791p = (C9791p) m13251L(); !C9612q.m13922c(c9791p, this); c9791p = c9791p.m13250M()) {
            if (c9791p instanceof C9876b) {
                ((C9876b) c9791p).f25731m.dispose();
            }
        }
    }

    /* renamed from: a0 */
    private final InterfaceC9688d1 m13033a0() {
        return (InterfaceC9688d1) this._parentHandle;
    }

    /* renamed from: d0 */
    private final void m13030d0() {
        Job job = (Job) getContext().mo1458j(Job.f25404c);
        if (job == null) {
            return;
        }
        InterfaceC9688d1 m13591d = Job.C9668a.m13591d(job, true, false, new C9878d(), 2, null);
        m13029e0(m13591d);
        if (mo13021e()) {
            m13591d.dispose();
        }
    }

    /* renamed from: e0 */
    private final void m13029e0(InterfaceC9688d1 interfaceC9688d1) {
        this._parentHandle = interfaceC9688d1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.InterfaceC9873a
    /* renamed from: A */
    public <Q> void mo13036A(InterfaceC9880c<? extends Q> interfaceC9880c, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        interfaceC9880c.mo2133b(this, function2);
    }

    /* renamed from: b0 */
    public final Object m13032b0() {
        Object obj;
        Object obj2;
        Object obj3;
        Object m2869d;
        Object m2869d2;
        if (!mo13021e()) {
            m13030d0();
        }
        Object obj4 = this._result;
        obj = C9882e.f25738c;
        if (obj4 == obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25726o;
            obj3 = C9882e.f25738c;
            m2869d = C13277d.m2869d();
            if (C0647b.m39437a(atomicReferenceFieldUpdater, this, obj3, m2869d)) {
                m2869d2 = C13277d.m2869d();
                return m2869d2;
            }
            obj4 = this._result;
        }
        obj2 = C9882e.f25739d;
        if (obj4 != obj2) {
            if (!(obj4 instanceof C9676b0)) {
                return obj4;
            }
            throw ((C9676b0) obj4).f25415a;
        }
        throw new IllegalStateException("Already resumed");
    }

    /* renamed from: c0 */
    public final void m13031c0(Throwable th2) {
        if (mo13018s()) {
            C11583s.C11584a c11584a = C11583s.f30090k;
            resumeWith(C11583s.m7596b(C11586t.m7587a(th2)));
        } else if (!(th2 instanceof CancellationException)) {
            Object m13032b0 = m13032b0();
            if (!(m13032b0 instanceof C9676b0) || ((C9676b0) m13032b0).f25415a != th2) {
                C9815k0.m13185a(getContext(), th2);
            }
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9881d
    /* renamed from: e */
    public boolean mo13021e() {
        while (true) {
            Object obj = this._state;
            if (obj == C9882e.m13010e()) {
                return false;
            }
            if (obj instanceof AbstractC9808y) {
                ((AbstractC9808y) obj).mo13022c(this);
            } else {
                return true;
            }
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9873a
    /* renamed from: g */
    public void mo13028g(long j, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        if (j <= 0) {
            if (mo13018s()) {
                C14032b.m859b(function1, mo13017w());
                return;
            }
            return;
        }
        mo13020m(C9904v0.m12983c(getContext()).mo2760R(j, new RunnableC9879e(function1), getContext()));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> continuation = this.f25727m;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f25727m.getContext();
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9881d
    /* renamed from: m */
    public void mo13020m(InterfaceC9688d1 interfaceC9688d1) {
        C9876b c9876b = new C9876b(interfaceC9688d1);
        if (!mo13021e()) {
            m13257F(c9876b);
            if (!mo13021e()) {
                return;
            }
        }
        interfaceC9688d1.dispose();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0030, code lost:
        m13034Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0035, code lost:
        return kotlinx.coroutines.C9842q.f25662a;
     */
    @Override // kotlinx.coroutines.selects.InterfaceC9881d
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo13019q(kotlinx.coroutines.internal.C9791p.C9794c r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.C9882e.m13010e()
            r2 = 0
            if (r0 != r1) goto L36
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.C9874b.f25725n
            java.lang.Object r1 = kotlinx.coroutines.selects.C9882e.m13010e()
            boolean r0 = androidx.concurrent.futures.C0647b.m39437a(r0, r3, r1, r2)
            if (r0 != 0) goto L30
            goto L0
        L18:
            kotlinx.coroutines.selects.b$c r0 = new kotlinx.coroutines.selects.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.C9874b.f25725n
            java.lang.Object r2 = kotlinx.coroutines.selects.C9882e.m13010e()
            boolean r1 = androidx.concurrent.futures.C0647b.m39437a(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.mo13022c(r3)
            if (r4 == 0) goto L30
            return r4
        L30:
            r3.m13034Z()
            kotlinx.coroutines.internal.d0 r4 = kotlinx.coroutines.C9842q.f25662a
            return r4
        L36:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.AbstractC9808y
            if (r1 == 0) goto L6a
            if (r4 == 0) goto L64
            kotlinx.coroutines.internal.d r1 = r4.mo13023a()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.C9874b.C9875a
            if (r2 == 0) goto L58
            r2 = r1
            kotlinx.coroutines.selects.b$a r2 = (kotlinx.coroutines.selects.C9874b.C9875a) r2
            kotlinx.coroutines.selects.b<?> r2 = r2.f25728b
            if (r2 == r3) goto L4c
            goto L58
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L58:
            r2 = r0
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.AbstractC9808y) r2
            boolean r1 = r1.m13197b(r2)
            if (r1 == 0) goto L64
            java.lang.Object r4 = kotlinx.coroutines.internal.C9765c.f25569b
            return r4
        L64:
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.AbstractC9808y) r0
            r0.mo13022c(r3)
            goto L0
        L6a:
            if (r4 != 0) goto L6d
            return r2
        L6d:
            kotlinx.coroutines.internal.p$a r4 = r4.f25612c
            if (r0 != r4) goto L74
            kotlinx.coroutines.internal.d0 r4 = kotlinx.coroutines.C9842q.f25662a
            return r4
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.C9874b.mo13019q(kotlinx.coroutines.internal.p$c):java.lang.Object");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        Object m2869d;
        Object m2869d2;
        Object obj4;
        while (true) {
            Object obj5 = this._result;
            obj2 = C9882e.f25738c;
            if (obj5 == obj2) {
                Object m13474d = C9703f0.m13474d(obj, null, 1, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25726o;
                obj3 = C9882e.f25738c;
                if (C0647b.m39437a(atomicReferenceFieldUpdater, this, obj3, m13474d)) {
                    return;
                }
            } else {
                m2869d = C13277d.m2869d();
                if (obj5 == m2869d) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25726o;
                    m2869d2 = C13277d.m2869d();
                    obj4 = C9882e.f25739d;
                    if (C0647b.m39437a(atomicReferenceFieldUpdater2, this, m2869d2, obj4)) {
                        if (C11583s.m7591g(obj)) {
                            Continuation<R> continuation = this.f25727m;
                            Throwable m7593e = C11583s.m7593e(obj);
                            C9612q.m13920e(m7593e);
                            continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(m7593e)));
                            return;
                        }
                        this.f25727m.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9881d
    /* renamed from: s */
    public boolean mo13018s() {
        Object mo13019q = mo13019q(null);
        if (mo13019q == C9842q.f25662a) {
            return true;
        }
        if (mo13019q == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + mo13019q).toString());
    }

    @Override // kotlinx.coroutines.internal.C9791p
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9881d
    /* renamed from: w */
    public Continuation<R> mo13017w() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9881d
    /* renamed from: x */
    public void mo13016x(Throwable th2) {
        Object obj;
        Object obj2;
        Object m2869d;
        Object m2869d2;
        Object obj3;
        Continuation m2870c;
        while (true) {
            Object obj4 = this._result;
            obj = C9882e.f25738c;
            if (obj4 == obj) {
                C9676b0 c9676b0 = new C9676b0(th2, false, 2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25726o;
                obj2 = C9882e.f25738c;
                if (C0647b.m39437a(atomicReferenceFieldUpdater, this, obj2, c9676b0)) {
                    return;
                }
            } else {
                m2869d = C13277d.m2869d();
                if (obj4 == m2869d) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25726o;
                    m2869d2 = C13277d.m2869d();
                    obj3 = C9882e.f25739d;
                    if (C0647b.m39437a(atomicReferenceFieldUpdater2, this, m2869d2, obj3)) {
                        m2870c = C13272c.m2870c(this.f25727m);
                        C11583s.C11584a c11584a = C11583s.f30090k;
                        m2870c.resumeWith(C11583s.m7596b(C11586t.m7587a(th2)));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC9881d
    /* renamed from: y */
    public Object mo13015y(AbstractC9763b abstractC9763b) {
        return new C9875a(this, abstractC9763b).mo13022c(null);
    }
}