package p409wi;

import androidx.concurrent.futures.C0647b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.C9839p0;
import kotlinx.coroutines.C9842q;
import kotlinx.coroutines.C9846r;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9784k;
import kotlinx.coroutines.internal.C9787l0;
import kotlinx.coroutines.internal.C9789n;
import kotlinx.coroutines.internal.C9790o;
import kotlinx.coroutines.internal.C9791p;
import kotlinx.coroutines.internal.C9806x;
import p388vf.C13272c;
import p388vf.C13277d;
import pf.C11560f;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001QB)\u0012 \u00108\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`6¢\u0006\u0004\bP\u0010-J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010#\u001a\u00020\u001aH\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020&2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u00020\t2\u0018\u0010+\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0)j\u0002`*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0014¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105R.\u00108\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`68\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b$\u00107R\u001a\u0010>\u001a\u0002098\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u00105R\u0014\u0010E\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0014\u0010G\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bF\u0010@R\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0011\u0010N\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bM\u0010@R\u0014\u0010O\u001a\u0002038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b:\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006R"}, m14357d2 = {"Lwi/c;", "E", "Lwi/x;", "Lwi/l;", "closed", "", "q", "(Lwi/l;)Ljava/lang/Throwable;", "element", "", "B", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "r", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lwi/l;)V", "cause", "s", "(Ljava/lang/Throwable;)V", "p", "(Lwi/l;)V", "", "i", "()I", "", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lwi/w;", "D", "()Lwi/w;", "Lwi/u;", "A", "(Ljava/lang/Object;)Lwi/u;", "w", "Lwi/i;", "d", "send", "j", "(Lwi/w;)Ljava/lang/Object;", "", "g", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "c", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/p;", "z", "(Lkotlinx/coroutines/internal/p;)V", "C", "()Lwi/u;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "Lkotlinx/coroutines/internal/n;", "k", "Lkotlinx/coroutines/internal/n;", "n", "()Lkotlinx/coroutines/internal/n;", "queue", "v", "()Z", "isFullImpl", "o", "queueDebugStateString", "t", "isBufferAlwaysFull", "u", "isBufferFull", "m", "()Lwi/l;", "closedForSend", "l", "closedForReceive", "x", "isClosedForSend", "bufferDebugString", "<init>", "a", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC13598c<E> implements InterfaceC13628x<E> {

    /* renamed from: l */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f34992l = AtomicReferenceFieldUpdater.newUpdater(AbstractC13598c.class, Object.class, "onCloseHandler");

    /* renamed from: j */
    protected final Function1<E, Unit> f34993j;

    /* renamed from: k */
    private final C9789n f34994k = new C9789n();
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lwi/c$a;", "E", "Lwi/w;", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "Z", "", "W", "Lwi/l;", "closed", "Y", "", "toString", "m", "Ljava/lang/Object;", "element", "", "X", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13599a<E> extends AbstractC13627w {

        /* renamed from: m */
        public final E f34995m;

        public C13599a(E e) {
            this.f34995m = e;
        }

        @Override // p409wi.AbstractC13627w
        /* renamed from: W */
        public void mo2046W() {
        }

        @Override // p409wi.AbstractC13627w
        /* renamed from: X */
        public Object mo2045X() {
            return this.f34995m;
        }

        @Override // p409wi.AbstractC13627w
        /* renamed from: Y */
        public void mo2044Y(C13614l<?> c13614l) {
        }

        @Override // p409wi.AbstractC13627w
        /* renamed from: Z */
        public C9768d0 mo2043Z(C9791p.C9794c c9794c) {
            C9768d0 c9768d0 = C9842q.f25662a;
            if (c9794c != null) {
                c9794c.m13238d();
            }
            return c9768d0;
        }

        @Override // kotlinx.coroutines.internal.C9791p
        public String toString() {
            return "SendBuffered@" + C9839p0.m13119b(this) + '(' + this.f34995m + ')';
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m14357d2 = {"wi/c$b", "Lkotlinx/coroutines/internal/p$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13600b extends C9791p.AbstractC9793b {

        /* renamed from: d */
        final /* synthetic */ AbstractC13598c f34996d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13600b(C9791p c9791p, AbstractC13598c abstractC13598c) {
            super(c9791p);
            this.f34996d = abstractC13598c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: k */
        public Object mo2115i(C9791p c9791p) {
            if (this.f34996d.mo2053u()) {
                return null;
            }
            return C9790o.m13263a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC13598c(Function1<? super E, Unit> function1) {
        this.f34993j = function1;
    }

    /* renamed from: B */
    private final Object m2131B(E e, Continuation<? super Unit> continuation) {
        Continuation m2870c;
        Object m2869d;
        Object m2869d2;
        AbstractC13627w c13631z;
        m2870c = C13272c.m2870c(continuation);
        C9838p m13105b = C9846r.m13105b(m2870c);
        while (true) {
            if (m2117v()) {
                if (this.f34993j == null) {
                    c13631z = new C13630y(e, m13105b);
                } else {
                    c13631z = new C13631z(e, m13105b, this.f34993j);
                }
                Object mo2109j = mo2109j(c13631z);
                if (mo2109j == null) {
                    C9846r.m13104c(m13105b, c13631z);
                    break;
                } else if (mo2109j instanceof C13614l) {
                    m2119r(m13105b, e, (C13614l) mo2109j);
                    break;
                } else if (mo2109j != C13597b.f34990e && !(mo2109j instanceof AbstractC13623s)) {
                    throw new IllegalStateException(("enqueueSend returned " + mo2109j).toString());
                }
            }
            Object mo2075y = mo2075y(e);
            if (mo2075y == C13597b.f34987b) {
                C11583s.C11584a c11584a = C11583s.f30090k;
                m13105b.resumeWith(C11583s.m7596b(Unit.f25302a));
                break;
            } else if (mo2075y != C13597b.f34988c) {
                if (mo2075y instanceof C13614l) {
                    m2119r(m13105b, e, (C13614l) mo2075y);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + mo2075y).toString());
                }
            }
        }
        Object m13122y = m13105b.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        m2869d2 = C13277d.m2869d();
        if (m13122y == m2869d2) {
            return m13122y;
        }
        return Unit.f25302a;
    }

    /* renamed from: i */
    private final int m2126i() {
        C9789n c9789n = this.f34994k;
        int i = 0;
        for (C9791p c9791p = (C9791p) c9789n.m13251L(); !C9612q.m13922c(c9791p, c9789n); c9791p = c9791p.m13250M()) {
            if (c9791p instanceof C9791p) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: o */
    private final String m2122o() {
        String str;
        C9791p m13250M = this.f34994k.m13250M();
        if (m13250M == this.f34994k) {
            return "EmptyQueue";
        }
        if (m13250M instanceof C13614l) {
            str = m13250M.toString();
        } else if (m13250M instanceof AbstractC13623s) {
            str = "ReceiveQueued";
        } else if (m13250M instanceof AbstractC13627w) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + m13250M;
        }
        C9791p m13249N = this.f34994k.m13249N();
        if (m13249N != m13250M) {
            String str2 = str + ",queueSize=" + m2126i();
            if (m13249N instanceof C13614l) {
                return str2 + ",closedForSend=" + m13249N;
            }
            return str2;
        }
        return str;
    }

    /* renamed from: p */
    private final void m2121p(C13614l<?> c13614l) {
        AbstractC13623s abstractC13623s;
        Object m13272b = C9784k.m13272b(null, 1, null);
        while (true) {
            C9791p m13249N = c13614l.m13249N();
            if (m13249N instanceof AbstractC13623s) {
                abstractC13623s = (AbstractC13623s) m13249N;
            } else {
                abstractC13623s = null;
            }
            if (abstractC13623s == null) {
                break;
            } else if (!abstractC13623s.mo2042R()) {
                abstractC13623s.m13248O();
            } else {
                m13272b = C9784k.m13271c(m13272b, abstractC13623s);
            }
        }
        if (m13272b != null) {
            if (!(m13272b instanceof ArrayList)) {
                ((AbstractC13623s) m13272b).mo2063Y(c13614l);
            } else {
                ArrayList arrayList = (ArrayList) m13272b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((AbstractC13623s) arrayList.get(size)).mo2063Y(c13614l);
                }
            }
        }
        m2116z(c13614l);
    }

    /* renamed from: q */
    private final Throwable m2120q(C13614l<?> c13614l) {
        m2121p(c13614l);
        return c13614l.m2083e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m2119r(Continuation<?> continuation, E e, C13614l<?> c13614l) {
        C9787l0 m13198d;
        m2121p(c13614l);
        Throwable m2083e0 = c13614l.m2083e0();
        Function1<E, Unit> function1 = this.f34993j;
        if (function1 != null && (m13198d = C9806x.m13198d(function1, e, null, 2, null)) != null) {
            C11560f.m7637a(m13198d, m2083e0);
            C11583s.C11584a c11584a = C11583s.f30090k;
            continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(m13198d)));
            return;
        }
        C11583s.C11584a c11584a2 = C11583s.f30090k;
        continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(m2083e0)));
    }

    /* renamed from: s */
    private final void m2118s(Throwable th2) {
        C9768d0 c9768d0;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (c9768d0 = C13597b.f34991f) && C0647b.m39437a(f34992l, this, obj, c9768d0)) {
            ((Function1) C9604l0.m13938d(obj, 1)).invoke(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final boolean m2117v() {
        return !(this.f34994k.m13250M() instanceof InterfaceC13625u) && mo2053u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final InterfaceC13625u<?> m2132A(E e) {
        C9791p m13249N;
        C9791p c9791p = this.f34994k;
        C13599a c13599a = new C13599a(e);
        do {
            m13249N = c9791p.m13249N();
            if (m13249N instanceof InterfaceC13625u) {
                return (InterfaceC13625u) m13249N;
            }
        } while (!m13249N.m13256G(c13599a, c9791p));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public InterfaceC13625u<E> mo2130C() {
        C9791p c9791p;
        C9791p m13244T;
        C9789n c9789n = this.f34994k;
        while (true) {
            c9791p = (C9791p) c9789n.m13251L();
            if (c9791p != c9789n && (c9791p instanceof InterfaceC13625u)) {
                if (((((InterfaceC13625u) c9791p) instanceof C13614l) && !c9791p.mo13246Q()) || (m13244T = c9791p.m13244T()) == null) {
                    break;
                }
                m13244T.m13247P();
            }
        }
        c9791p = null;
        return (InterfaceC13625u) c9791p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final AbstractC13627w m2129D() {
        C9791p c9791p;
        C9791p m13244T;
        C9789n c9789n = this.f34994k;
        while (true) {
            c9791p = (C9791p) c9789n.m13251L();
            if (c9791p != c9789n && (c9791p instanceof AbstractC13627w)) {
                if (((((AbstractC13627w) c9791p) instanceof C13614l) && !c9791p.mo13246Q()) || (m13244T = c9791p.m13244T()) == null) {
                    break;
                }
                m13244T.m13247P();
            }
        }
        c9791p = null;
        return (AbstractC13627w) c9791p;
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: c */
    public void mo2052c(Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34992l;
        if (!C0647b.m39437a(atomicReferenceFieldUpdater, this, null, function1)) {
            Object obj = this.onCloseHandler;
            if (obj == C13597b.f34991f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        C13614l<?> m2124m = m2124m();
        if (m2124m != null && C0647b.m39437a(atomicReferenceFieldUpdater, this, function1, C13597b.f34991f)) {
            function1.invoke(m2124m.f35015m);
        }
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: d */
    public final Object mo2051d(E e) {
        Object mo2075y = mo2075y(e);
        if (mo2075y == C13597b.f34987b) {
            return C13608i.f35011b.m2089c(Unit.f25302a);
        }
        if (mo2075y == C13597b.f34988c) {
            C13614l<?> m2124m = m2124m();
            if (m2124m == null) {
                return C13608i.f35011b.m2090b();
            }
            return C13608i.f35011b.m2091a(m2120q(m2124m));
        } else if (mo2075y instanceof C13614l) {
            return C13608i.f35011b.m2091a(m2120q((C13614l) mo2075y));
        } else {
            throw new IllegalStateException(("trySend returned " + mo2075y).toString());
        }
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: g */
    public boolean mo2050g(Throwable th2) {
        boolean z;
        C13614l<?> c13614l = new C13614l<>(th2);
        C9791p c9791p = this.f34994k;
        while (true) {
            C9791p m13249N = c9791p.m13249N();
            z = true;
            if (!(!(m13249N instanceof C13614l))) {
                z = false;
                break;
            } else if (m13249N.m13256G(c13614l, c9791p)) {
                break;
            }
        }
        if (!z) {
            c13614l = (C13614l) this.f34994k.m13249N();
        }
        m2121p(c13614l);
        if (z) {
            m2118s(th2);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public Object mo2109j(AbstractC13627w abstractC13627w) {
        boolean z;
        C9791p m13249N;
        if (mo2054t()) {
            C9791p c9791p = this.f34994k;
            do {
                m13249N = c9791p.m13249N();
                if (m13249N instanceof InterfaceC13625u) {
                    return m13249N;
                }
            } while (!m13249N.m13256G(abstractC13627w, c9791p));
            return null;
        }
        C9791p c9791p2 = this.f34994k;
        C13600b c13600b = new C13600b(abstractC13627w, this);
        while (true) {
            C9791p m13249N2 = c9791p2.m13249N();
            if (m13249N2 instanceof InterfaceC13625u) {
                return m13249N2;
            }
            int m13242V = m13249N2.m13242V(abstractC13627w, c9791p2, c13600b);
            z = true;
            if (m13242V != 1) {
                if (m13242V == 2) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            return C13597b.f34990e;
        }
        return null;
    }

    /* renamed from: k */
    protected String mo2077k() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final C13614l<?> m2125l() {
        C9791p m13250M = this.f34994k.m13250M();
        C13614l<?> c13614l = m13250M instanceof C13614l ? (C13614l) m13250M : null;
        if (c13614l != null) {
            m2121p(c13614l);
            return c13614l;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final C13614l<?> m2124m() {
        C9791p m13249N = this.f34994k.m13249N();
        C13614l<?> c13614l = m13249N instanceof C13614l ? (C13614l) m13249N : null;
        if (c13614l != null) {
            m2121p(c13614l);
            return c13614l;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final C9789n m2123n() {
        return this.f34994k;
    }

    /* renamed from: t */
    protected abstract boolean mo2054t();

    public String toString() {
        return C9839p0.m13120a(this) + '@' + C9839p0.m13119b(this) + '{' + m2122o() + '}' + mo2077k();
    }

    /* renamed from: u */
    protected abstract boolean mo2053u();

    @Override // p409wi.InterfaceC13628x
    /* renamed from: w */
    public final Object mo2049w(E e, Continuation<? super Unit> continuation) {
        Object m2869d;
        if (mo2075y(e) == C13597b.f34987b) {
            return Unit.f25302a;
        }
        Object m2131B = m2131B(e, continuation);
        m2869d = C13277d.m2869d();
        if (m2131B == m2869d) {
            return m2131B;
        }
        return Unit.f25302a;
    }

    @Override // p409wi.InterfaceC13628x
    /* renamed from: x */
    public final boolean mo2048x() {
        return m2124m() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public Object mo2075y(E e) {
        InterfaceC13625u<E> mo2130C;
        do {
            mo2130C = mo2130C();
            if (mo2130C == null) {
                return C13597b.f34988c;
            }
        } while (mo2130C.mo2057z(e, null) == null);
        mo2130C.mo2058j(e);
        return mo2130C.mo2059b();
    }

    /* renamed from: z */
    protected void m2116z(C9791p c9791p) {
    }
}
