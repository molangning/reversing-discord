package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.C9846r;
import kotlinx.coroutines.InterfaceC9688d1;
import p388vf.C13272c;
import p388vf.C13277d;
import p409wi.EnumC13603e;
import p430xi.AbstractC13805a;
import p430xi.C13806b;
import p430xi.InterfaceC13820k;
import pf.C11583s;

@Metadata(m14358d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001EB\u001f\u0012\u0006\u0010H\u001a\u00020\u0015\u0012\u0006\u0010J\u001a\u00020\u0015\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\ba\u0010bJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\fH\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u000eH\u0002J\u001b\u0010*\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J3\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010,0\u00132\u0014\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010,0\u0013H\u0002¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u0002022\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u0010\nJ\u001b\u00106\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u0010\u001bJ\u000f\u0010\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0001\u00107J%\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010,0\u00132\u0006\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0006\u0010<\u001a\u00020\u0015H\u0014¢\u0006\u0004\b=\u0010>J&\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00152\u0006\u0010C\u001a\u00020BH\u0016R\u0014\u0010H\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010V\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010GR\u0016\u0010W\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010GR\u0014\u0010Y\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u00107R\u0014\u0010[\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010ZR\u0014\u0010]\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0014\u0010_\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u00107R\u0014\u0010`\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006c"}, m14357d2 = {"Lkotlinx/coroutines/flow/l;", "T", "Lxi/a;", "Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lxi/k;", "value", "", "N", "(Ljava/lang/Object;)Z", "O", "", "A", "", "newHead", "x", "item", "D", "", "curBuffer", "", "curSize", "newSize", "L", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "C", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/l$a;", "emitter", "u", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "R", "v", "slot", "Q", "P", "index", "H", "t", "(Lkotlinx/coroutines/flow/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "E", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "M", "emit", "()J", "oldIndex", "S", "(J)[Lkotlin/coroutines/Continuation;", "y", "size", "z", "(I)[Lkotlinx/coroutines/flow/n;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lwi/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "a", "m", "I", "replay", "n", "bufferCapacity", "o", "Lwi/e;", "p", "[Ljava/lang/Object;", "buffer", "q", "J", "replayIndex", "r", "minCollectorIndex", "s", "bufferSize", "queueSize", "G", "head", "()I", "replaySize", "K", "totalSize", "F", "bufferEndIndex", "queueEndIndex", "<init>", "(IILwi/e;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9727l<T> extends AbstractC13805a<C9732n> implements MutableSharedFlow<T>, Flow, InterfaceC13820k<T> {

    /* renamed from: m */
    private final int f25497m;

    /* renamed from: n */
    private final int f25498n;

    /* renamed from: o */
    private final EnumC13603e f25499o;

    /* renamed from: p */
    private Object[] f25500p;

    /* renamed from: q */
    private long f25501q;

    /* renamed from: r */
    private long f25502r;

    /* renamed from: s */
    private int f25503s;

    /* renamed from: t */
    private int f25504t;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"Lkotlinx/coroutines/flow/l$a;", "Lkotlinx/coroutines/d1;", "", "dispose", "Lkotlinx/coroutines/flow/l;", "j", "Lkotlinx/coroutines/flow/l;", "flow", "", "k", "J", "index", "", "l", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/Continuation;", "m", "Lkotlin/coroutines/Continuation;", "cont", "<init>", "(Lkotlinx/coroutines/flow/l;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9728a implements InterfaceC9688d1 {

        /* renamed from: j */
        public final C9727l<?> f25505j;

        /* renamed from: k */
        public long f25506k;

        /* renamed from: l */
        public final Object f25507l;

        /* renamed from: m */
        public final Continuation<Unit> f25508m;

        /* JADX WARN: Multi-variable type inference failed */
        public C9728a(C9727l<?> c9727l, long j, Object obj, Continuation<? super Unit> continuation) {
            this.f25505j = c9727l;
            this.f25506k = j;
            this.f25507l = obj;
            this.f25508m = continuation;
        }

        @Override // kotlinx.coroutines.InterfaceC9688d1
        public void dispose() {
            this.f25505j.m13413u(this);
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: kotlinx.coroutines.flow.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C9729b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25509a;

        static {
            int[] iArr = new int[EnumC13603e.values().length];
            iArr[EnumC13603e.SUSPEND.ordinal()] = 1;
            iArr[EnumC13603e.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC13603e.DROP_OLDEST.ordinal()] = 3;
            f25509a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.SharedFlowImpl", m13986f = "SharedFlow.kt", m13985l = {373, 380, 383}, m13984m = "collect$suspendImpl")
    /* renamed from: kotlinx.coroutines.flow.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9730c extends AbstractC9570d {

        /* renamed from: j */
        Object f25510j;

        /* renamed from: k */
        Object f25511k;

        /* renamed from: l */
        Object f25512l;

        /* renamed from: m */
        Object f25513m;

        /* renamed from: n */
        /* synthetic */ Object f25514n;

        /* renamed from: o */
        final /* synthetic */ C9727l<T> f25515o;

        /* renamed from: p */
        int f25516p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9730c(C9727l<T> c9727l, Continuation<? super C9730c> continuation) {
            super(continuation);
            this.f25515o = c9727l;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f25514n = obj;
            this.f25516p |= Integer.MIN_VALUE;
            return C9727l.m13411w(this.f25515o, null, this);
        }
    }

    public C9727l(int i, int i2, EnumC13603e enumC13603e) {
        this.f25497m = i;
        this.f25498n = i2;
        this.f25499o = enumC13603e;
    }

    /* renamed from: A */
    private final void m13444A() {
        Object[] objArr = this.f25500p;
        C9612q.m13920e(objArr);
        C9731m.m13402f(objArr, m13438G(), null);
        this.f25503s--;
        long m13438G = m13438G() + 1;
        if (this.f25501q < m13438G) {
            this.f25501q = m13438G;
        }
        if (this.f25502r < m13438G) {
            m13410x(m13438G);
        }
    }

    /* renamed from: B */
    static /* synthetic */ Object m13443B(C9727l c9727l, Object obj, Continuation continuation) {
        Object m2869d;
        if (c9727l.m13432M(obj)) {
            return Unit.f25302a;
        }
        Object m13442C = c9727l.m13442C(obj, continuation);
        m2869d = C13277d.m2869d();
        if (m13442C == m2869d) {
            return m13442C;
        }
        return Unit.f25302a;
    }

    /* renamed from: C */
    private final Object m13442C(T t, Continuation<? super Unit> continuation) {
        Continuation m2870c;
        Continuation<Unit>[] continuationArr;
        C9728a c9728a;
        Object m2869d;
        Object m2869d2;
        m2870c = C13272c.m2870c(continuation);
        C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        Continuation<Unit>[] continuationArr2 = C13806b.f35578a;
        synchronized (this) {
            if (m13431N(t)) {
                C11583s.C11584a c11584a = C11583s.f30090k;
                c9838p.resumeWith(C11583s.m7596b(Unit.f25302a));
                continuationArr = m13440E(continuationArr2);
                c9728a = null;
            } else {
                C9728a c9728a2 = new C9728a(this, m13434K() + m13438G(), t, c9838p);
                m13441D(c9728a2);
                this.f25504t++;
                if (this.f25498n == 0) {
                    continuationArr2 = m13440E(continuationArr2);
                }
                continuationArr = continuationArr2;
                c9728a = c9728a2;
            }
        }
        if (c9728a != null) {
            C9846r.m13106a(c9838p, c9728a);
        }
        for (Continuation<Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                continuation2.resumeWith(C11583s.m7596b(Unit.f25302a));
            }
        }
        Object m13122y = c9838p.m13122y();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m13441D(Object obj) {
        int m13434K = m13434K();
        Object[] objArr = this.f25500p;
        if (objArr == null) {
            objArr = m13433L(null, 0, 2);
        } else if (m13434K >= objArr.length) {
            objArr = m13433L(objArr, m13434K, objArr.length * 2);
        }
        C9731m.m13402f(objArr, m13438G() + m13434K, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = ((p430xi.AbstractC13805a) r10).f35575j;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] m13440E(kotlin.coroutines.Continuation<kotlin.Unit>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = p430xi.AbstractC13805a.m1484b(r10)
            if (r1 == 0) goto L47
            xi.c[] r1 = p430xi.AbstractC13805a.m1483c(r10)
            if (r1 == 0) goto L47
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L47
            r4 = r1[r3]
            if (r4 == 0) goto L44
            kotlinx.coroutines.flow.n r4 = (kotlinx.coroutines.flow.C9732n) r4
            kotlin.coroutines.Continuation<? super kotlin.Unit> r5 = r4.f25519b
            if (r5 != 0) goto L1c
            goto L44
        L1c:
            long r6 = r10.m13429P(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L44
            int r6 = r11.length
            if (r0 < r6) goto L39
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C9612q.m13918g(r11, r6)
        L39:
            r6 = r11
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f25519b = r0
            r0 = r7
        L44:
            int r3 = r3 + 1
            goto Lf
        L47:
            kotlin.coroutines.Continuation[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9727l.m13440E(kotlin.coroutines.Continuation[]):kotlin.coroutines.Continuation[]");
    }

    /* renamed from: F */
    private final long m13439F() {
        return m13438G() + this.f25503s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final long m13438G() {
        return Math.min(this.f25502r, this.f25501q);
    }

    /* renamed from: H */
    private final Object m13437H(long j) {
        Object m13403e;
        Object[] objArr = this.f25500p;
        C9612q.m13920e(objArr);
        m13403e = C9731m.m13403e(objArr, j);
        if (m13403e instanceof C9728a) {
            return ((C9728a) m13403e).f25507l;
        }
        return m13403e;
    }

    /* renamed from: I */
    private final long m13436I() {
        return m13438G() + this.f25503s + this.f25504t;
    }

    /* renamed from: J */
    private final int m13435J() {
        return (int) ((m13438G() + this.f25503s) - this.f25501q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final int m13434K() {
        return this.f25503s + this.f25504t;
    }

    /* renamed from: L */
    private final Object[] m13433L(Object[] objArr, int i, int i2) {
        boolean z;
        Object m13403e;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f25500p = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m13438G = m13438G();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + m13438G;
                m13403e = C9731m.m13403e(objArr, j);
                C9731m.m13402f(objArr2, j, m13403e);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final boolean m13431N(T t) {
        if (m1478h() == 0) {
            return m13430O(t);
        }
        if (this.f25503s >= this.f25498n && this.f25502r <= this.f25501q) {
            int i = C9729b.f25509a[this.f25499o.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        m13441D(t);
        int i2 = this.f25503s + 1;
        this.f25503s = i2;
        if (i2 > this.f25498n) {
            m13444A();
        }
        if (m13435J() > this.f25497m) {
            m13427R(this.f25501q + 1, this.f25502r, m13439F(), m13436I());
        }
        return true;
    }

    /* renamed from: O */
    private final boolean m13430O(T t) {
        if (this.f25497m == 0) {
            return true;
        }
        m13441D(t);
        int i = this.f25503s + 1;
        this.f25503s = i;
        if (i > this.f25497m) {
            m13444A();
        }
        this.f25502r = m13438G() + this.f25503s;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final long m13429P(C9732n c9732n) {
        long j = c9732n.f25518a;
        if (j < m13439F()) {
            return j;
        }
        if (this.f25498n > 0 || j > m13438G() || this.f25504t == 0) {
            return -1L;
        }
        return j;
    }

    /* renamed from: Q */
    private final Object m13428Q(C9732n c9732n) {
        Object obj;
        Continuation<Unit>[] continuationArr = C13806b.f35578a;
        synchronized (this) {
            long m13429P = m13429P(c9732n);
            if (m13429P < 0) {
                obj = C9731m.f25517a;
            } else {
                long j = c9732n.f25518a;
                Object m13437H = m13437H(m13429P);
                c9732n.f25518a = m13429P + 1;
                continuationArr = m13426S(j);
                obj = m13437H;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                C11583s.C11584a c11584a = C11583s.f30090k;
                continuation.resumeWith(C11583s.m7596b(Unit.f25302a));
            }
        }
        return obj;
    }

    /* renamed from: R */
    private final void m13427R(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long m13438G = m13438G(); m13438G < min; m13438G++) {
            Object[] objArr = this.f25500p;
            C9612q.m13920e(objArr);
            C9731m.m13402f(objArr, m13438G, null);
        }
        this.f25501q = j;
        this.f25502r = j2;
        this.f25503s = (int) (j3 - min);
        this.f25504t = (int) (j4 - j3);
    }

    /* renamed from: t */
    private final Object m13414t(C9732n c9732n, Continuation<? super Unit> continuation) {
        Continuation m2870c;
        Object m2869d;
        Object m2869d2;
        m2870c = C13272c.m2870c(continuation);
        C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        synchronized (this) {
            if (m13429P(c9732n) < 0) {
                c9732n.f25519b = c9838p;
            } else {
                C11583s.C11584a c11584a = C11583s.f30090k;
                c9838p.resumeWith(C11583s.m7596b(Unit.f25302a));
            }
            Unit unit = Unit.f25302a;
        }
        Object m13122y = c9838p.m13122y();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m13413u(C9728a c9728a) {
        Object m13403e;
        synchronized (this) {
            if (c9728a.f25506k < m13438G()) {
                return;
            }
            Object[] objArr = this.f25500p;
            C9612q.m13920e(objArr);
            m13403e = C9731m.m13403e(objArr, c9728a.f25506k);
            if (m13403e != c9728a) {
                return;
            }
            C9731m.m13402f(objArr, c9728a.f25506k, C9731m.f25517a);
            m13412v();
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: v */
    private final void m13412v() {
        Object m13403e;
        if (this.f25498n == 0 && this.f25504t <= 1) {
            return;
        }
        Object[] objArr = this.f25500p;
        C9612q.m13920e(objArr);
        while (this.f25504t > 0) {
            m13403e = C9731m.m13403e(objArr, (m13438G() + m13434K()) - 1);
            if (m13403e == C9731m.f25517a) {
                this.f25504t--;
                C9731m.m13402f(objArr, m13438G() + m13434K(), null);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab A[SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m13411w(kotlinx.coroutines.flow.C9727l r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9727l.m13411w(kotlinx.coroutines.flow.l, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = ((p430xi.AbstractC13805a) r8).f35575j;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m13410x(long r9) {
        /*
            r8 = this;
            int r0 = p430xi.AbstractC13805a.m1484b(r8)
            if (r0 == 0) goto L27
            xi.c[] r0 = p430xi.AbstractC13805a.m1483c(r8)
            if (r0 == 0) goto L27
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            if (r3 == 0) goto L24
            kotlinx.coroutines.flow.n r3 = (kotlinx.coroutines.flow.C9732n) r3
            long r4 = r3.f25518a
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L24
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L24
            r3.f25518a = r9
        L24:
            int r2 = r2 + 1
            goto Le
        L27:
            r8.f25502r = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9727l.m13410x(long):void");
    }

    /* renamed from: M */
    public boolean m13432M(T t) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArr = C13806b.f35578a;
        synchronized (this) {
            if (m13431N(t)) {
                continuationArr = m13440E(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                C11583s.C11584a c11584a = C11583s.f30090k;
                continuation.resumeWith(C11583s.m7596b(Unit.f25302a));
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        r4 = ((p430xi.AbstractC13805a) r21).f35575j;
     */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] m13426S(long r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9727l.m13426S(long):kotlin.coroutines.Continuation[]");
    }

    /* renamed from: T */
    public final long m13425T() {
        long j = this.f25501q;
        if (j < this.f25502r) {
            this.f25502r = j;
        }
        return j;
    }

    @Override // p430xi.InterfaceC13820k
    /* renamed from: a */
    public Flow<T> mo1452a(CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        return C9731m.m13404d(this, coroutineContext, i, enumC13603e);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return m13411w(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        return m13443B(this, t, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p430xi.AbstractC13805a
    /* renamed from: y */
    public C9732n mo1481e() {
        return new C9732n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p430xi.AbstractC13805a
    /* renamed from: z */
    public C9732n[] mo1480f(int i) {
        return new C9732n[i];
    }
}
