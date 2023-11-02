package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9580a0;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9839p0;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001:\u00041234B\u0007¢\u0006\u0004\b0\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u0016\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b$\u0010 J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0015\u0010-\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0015\u0010/\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00065"}, m14357d2 = {"Lkotlinx/coroutines/internal/p;", "", "Lkotlinx/coroutines/internal/z;", "U", "()Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "current", "J", "(Lkotlinx/coroutines/internal/p;)Lkotlinx/coroutines/internal/p;", "next", "", "K", "(Lkotlinx/coroutines/internal/p;)V", "Lkotlinx/coroutines/internal/y;", "op", "I", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/p;", "node", "", "H", "(Lkotlinx/coroutines/internal/p;)Z", "F", "G", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)Z", "Lkotlinx/coroutines/internal/p$b;", "condAdd", "", "V", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p$b;)I", "R", "()Z", "T", "()Lkotlinx/coroutines/internal/p;", "O", "()V", "P", "S", "", "toString", "()Ljava/lang/String;", "Q", "isRemoved", "L", "()Ljava/lang/Object;", "M", "nextNode", "N", "prevNode", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9791p {

    /* renamed from: j */
    static final /* synthetic */ AtomicReferenceFieldUpdater f25605j = AtomicReferenceFieldUpdater.newUpdater(C9791p.class, Object.class, "_next");

    /* renamed from: k */
    static final /* synthetic */ AtomicReferenceFieldUpdater f25606k = AtomicReferenceFieldUpdater.newUpdater(C9791p.class, Object.class, "_prev");

    /* renamed from: l */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25607l = AtomicReferenceFieldUpdater.newUpdater(C9791p.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, m14357d2 = {"Lkotlinx/coroutines/internal/p$a;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/y;", "op", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "m", "affected", "", "e", "next", "", "l", "", "f", "n", "Lkotlinx/coroutines/internal/p$c;", "prepareOp", "g", "j", "k", "Lkotlinx/coroutines/internal/d;", "c", "failure", "a", "h", "()Lkotlinx/coroutines/internal/p;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC9792a extends AbstractC9763b {
        @Override // kotlinx.coroutines.internal.AbstractC9763b
        /* renamed from: a */
        public final void mo13241a(AbstractC9767d<?> abstractC9767d, Object obj) {
            boolean z;
            C9791p mo13234i;
            Object obj2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            C9791p mo13235h = mo13235h();
            if (mo13235h == null || (mo13234i = mo13234i()) == null) {
                return;
            }
            if (z) {
                obj2 = mo13231n(mo13235h, mo13234i);
            } else {
                obj2 = mo13234i;
            }
            if (C0647b.m39437a(C9791p.f25605j, mo13235h, abstractC9767d, obj2) && z) {
                mo13237f(mo13235h, mo13234i);
            }
        }

        @Override // kotlinx.coroutines.internal.AbstractC9763b
        /* renamed from: c */
        public final Object mo13240c(AbstractC9767d<?> abstractC9767d) {
            while (true) {
                C9791p mo13232m = mo13232m(abstractC9767d);
                if (mo13232m == null) {
                    return C9765c.f25569b;
                }
                Object obj = mo13232m._next;
                if (obj == abstractC9767d || abstractC9767d.m13329h()) {
                    return null;
                }
                if (obj instanceof AbstractC9808y) {
                    AbstractC9808y abstractC9808y = (AbstractC9808y) obj;
                    if (abstractC9767d.m13197b(abstractC9808y)) {
                        return C9765c.f25569b;
                    }
                    abstractC9808y.mo13022c(mo13232m);
                } else {
                    Object mo2137e = mo2137e(mo13232m);
                    if (mo2137e != null) {
                        return mo2137e;
                    }
                    if (mo13233l(mo13232m, obj)) {
                        continue;
                    } else {
                        C9794c c9794c = new C9794c(mo13232m, (C9791p) obj, this);
                        if (C0647b.m39437a(C9791p.f25605j, mo13232m, obj, c9794c)) {
                            try {
                                if (c9794c.mo13022c(mo13232m) != C9797q.f25616a) {
                                    return null;
                                }
                            } catch (Throwable th2) {
                                C0647b.m39437a(C9791p.f25605j, mo13232m, c9794c, obj);
                                throw th2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        /* renamed from: e */
        protected abstract Object mo2137e(C9791p c9791p);

        /* renamed from: f */
        protected abstract void mo13237f(C9791p c9791p, C9791p c9791p2);

        /* renamed from: g */
        public abstract void mo13236g(C9794c c9794c);

        /* renamed from: h */
        protected abstract C9791p mo13235h();

        /* renamed from: i */
        protected abstract C9791p mo13234i();

        /* renamed from: j */
        public Object mo2136j(C9794c c9794c) {
            mo13236g(c9794c);
            return null;
        }

        /* renamed from: k */
        public void mo2135k(C9791p c9791p) {
        }

        /* renamed from: l */
        protected abstract boolean mo13233l(C9791p c9791p, Object obj);

        /* renamed from: m */
        protected abstract C9791p mo13232m(AbstractC9808y abstractC9808y);

        /* renamed from: n */
        public abstract Object mo13231n(C9791p c9791p, C9791p c9791p2);
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, m14357d2 = {"Lkotlinx/coroutines/internal/p$b;", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "", "j", "b", "Lkotlinx/coroutines/internal/p;", "newNode", "c", "oldNext", "<init>", "(Lkotlinx/coroutines/internal/p;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC9793b extends AbstractC9767d<C9791p> {

        /* renamed from: b */
        public final C9791p f25608b;

        /* renamed from: c */
        public C9791p f25609c;

        public AbstractC9793b(C9791p c9791p) {
            this.f25608b = c9791p;
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: j */
        public void mo13001d(C9791p c9791p, Object obj) {
            boolean z;
            C9791p c9791p2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c9791p2 = this.f25608b;
            } else {
                c9791p2 = this.f25609c;
            }
            if (c9791p2 != null && C0647b.m39437a(C9791p.f25605j, c9791p, this, c9791p2) && z) {
                C9791p c9791p3 = this.f25608b;
                C9791p c9791p4 = this.f25609c;
                C9612q.m13920e(c9791p4);
                c9791p3.m13252K(c9791p4);
            }
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lkotlinx/coroutines/internal/p$c;", "Lkotlinx/coroutines/internal/y;", "", "affected", "c", "", "d", "", "toString", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "a", "Lkotlinx/coroutines/internal/p;", "b", "next", "Lkotlinx/coroutines/internal/p$a;", "Lkotlinx/coroutines/internal/p$a;", "desc", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p$a;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9794c extends AbstractC9808y {

        /* renamed from: a */
        public final C9791p f25610a;

        /* renamed from: b */
        public final C9791p f25611b;

        /* renamed from: c */
        public final AbstractC9792a f25612c;

        public C9794c(C9791p c9791p, C9791p c9791p2, AbstractC9792a abstractC9792a) {
            this.f25610a = c9791p;
            this.f25611b = c9791p2;
            this.f25612c = abstractC9792a;
        }

        @Override // kotlinx.coroutines.internal.AbstractC9808y
        /* renamed from: a */
        public AbstractC9767d<?> mo13023a() {
            return this.f25612c.m13336b();
        }

        @Override // kotlinx.coroutines.internal.AbstractC9808y
        /* renamed from: c */
        public Object mo13022c(Object obj) {
            Object m13330f;
            Object obj2;
            if (obj != null) {
                C9791p c9791p = (C9791p) obj;
                Object mo2136j = this.f25612c.mo2136j(this);
                Object obj3 = C9797q.f25616a;
                if (mo2136j == obj3) {
                    C9791p c9791p2 = this.f25611b;
                    if (C0647b.m39437a(C9791p.f25605j, c9791p, this, c9791p2.m13243U())) {
                        this.f25612c.mo2135k(c9791p);
                        c9791p2.m13254I(null);
                    }
                    return obj3;
                }
                if (mo2136j != null) {
                    m13330f = mo13023a().m13331e(mo2136j);
                } else {
                    m13330f = mo13023a().m13330f();
                }
                if (m13330f == C9765c.f25568a) {
                    obj2 = mo13023a();
                } else if (m13330f == null) {
                    obj2 = this.f25612c.mo13231n(c9791p, this.f25611b);
                } else {
                    obj2 = this.f25611b;
                }
                C0647b.m39437a(C9791p.f25605j, c9791p, this, obj2);
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        /* renamed from: d */
        public final void m13238d() {
            this.f25612c.mo13236g(this);
        }

        @Override // kotlinx.coroutines.internal.AbstractC9808y
        public String toString() {
            return "PrepareOp(op=" + mo13023a() + ')';
        }
    }

    @Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, m14357d2 = {"Lkotlinx/coroutines/internal/p$d;", "T", "Lkotlinx/coroutines/internal/p$a;", "Lkotlinx/coroutines/internal/y;", "op", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "m", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/p;", "affected", "", "e", "(Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;", "next", "", "l", "(Lkotlinx/coroutines/internal/p;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/p$c;", "prepareOp", "", "g", "(Lkotlinx/coroutines/internal/p$c;)V", "n", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)V", "b", "Lkotlinx/coroutines/internal/p;", "queue", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "h", "()Lkotlinx/coroutines/internal/p;", "affectedNode", "i", "originalNext", "<init>", "(Lkotlinx/coroutines/internal/p;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.p$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C9795d<T> extends AbstractC9792a {

        /* renamed from: c */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f25613c = AtomicReferenceFieldUpdater.newUpdater(C9795d.class, Object.class, "_affectedNode");

        /* renamed from: d */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f25614d = AtomicReferenceFieldUpdater.newUpdater(C9795d.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b */
        public final C9791p f25615b;

        public C9795d(C9791p c9791p) {
            this.f25615b = c9791p;
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: e */
        protected Object mo2137e(C9791p c9791p) {
            if (c9791p == this.f25615b) {
                return C9790o.m13262b();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: f */
        protected final void mo13237f(C9791p c9791p, C9791p c9791p2) {
            c9791p2.m13254I(null);
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: g */
        public void mo13236g(C9794c c9794c) {
            C0647b.m39437a(f25613c, this, null, c9794c.f25610a);
            C0647b.m39437a(f25614d, this, null, c9794c.f25611b);
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: h */
        protected final C9791p mo13235h() {
            return (C9791p) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: i */
        protected final C9791p mo13234i() {
            return (C9791p) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: l */
        protected final boolean mo13233l(C9791p c9791p, Object obj) {
            if (!(obj instanceof C9809z)) {
                return false;
            }
            ((C9809z) obj).f25636a.m13247P();
            return true;
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: m */
        protected final C9791p mo13232m(AbstractC9808y abstractC9808y) {
            C9791p c9791p = this.f25615b;
            while (true) {
                Object obj = c9791p._next;
                if (obj instanceof AbstractC9808y) {
                    AbstractC9808y abstractC9808y2 = (AbstractC9808y) obj;
                    if (abstractC9808y.m13197b(abstractC9808y2)) {
                        return null;
                    }
                    abstractC9808y2.mo13022c(this.f25615b);
                } else {
                    return (C9791p) obj;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: n */
        public final Object mo13231n(C9791p c9791p, C9791p c9791p2) {
            return c9791p2.m13243U();
        }

        /* renamed from: o */
        public final T m13230o() {
            T t = (T) mo13235h();
            C9612q.m13920e(t);
            return t;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0048, code lost:
        if (androidx.concurrent.futures.C0647b.m39437a(kotlinx.coroutines.internal.C9791p.f25605j, r3, r2, ((kotlinx.coroutines.internal.C9809z) r4).f25636a) != false) goto L23;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.C9791p m13254I(kotlinx.coroutines.internal.AbstractC9808y r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.p r0 = (kotlinx.coroutines.internal.C9791p) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C9791p.f25606k
            boolean r0 = androidx.concurrent.futures.C0647b.m39437a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.mo13246Q()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.AbstractC9808y
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.AbstractC9808y) r0
            boolean r0 = r8.m13197b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.y r4 = (kotlinx.coroutines.internal.AbstractC9808y) r4
            r4.mo13022c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C9809z
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C9791p.f25605j
            kotlinx.coroutines.internal.z r4 = (kotlinx.coroutines.internal.C9809z) r4
            kotlinx.coroutines.internal.p r4 = r4.f25636a
            boolean r2 = androidx.concurrent.futures.C0647b.m39437a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.p r2 = (kotlinx.coroutines.internal.C9791p) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.p r3 = (kotlinx.coroutines.internal.C9791p) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C9791p.m13254I(kotlinx.coroutines.internal.y):kotlinx.coroutines.internal.p");
    }

    /* renamed from: J */
    private final C9791p m13253J(C9791p c9791p) {
        while (c9791p.mo13246Q()) {
            c9791p = (C9791p) c9791p._prev;
        }
        return c9791p;
    }

    /* renamed from: K */
    public final void m13252K(C9791p c9791p) {
        C9791p c9791p2;
        do {
            c9791p2 = (C9791p) c9791p._prev;
            if (m13251L() != c9791p) {
                return;
            }
        } while (!C0647b.m39437a(f25606k, c9791p, c9791p2, this));
        if (mo13246Q()) {
            c9791p.m13254I(null);
        }
    }

    /* renamed from: U */
    public final C9809z m13243U() {
        C9809z c9809z = (C9809z) this._removedRef;
        if (c9809z == null) {
            C9809z c9809z2 = new C9809z(this);
            f25607l.lazySet(this, c9809z2);
            return c9809z2;
        }
        return c9809z;
    }

    /* renamed from: F */
    public final void m13257F(C9791p c9791p) {
        do {
        } while (!m13249N().m13256G(c9791p, this));
    }

    /* renamed from: G */
    public final boolean m13256G(C9791p c9791p, C9791p c9791p2) {
        f25606k.lazySet(c9791p, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25605j;
        atomicReferenceFieldUpdater.lazySet(c9791p, c9791p2);
        if (!C0647b.m39437a(atomicReferenceFieldUpdater, this, c9791p2, c9791p)) {
            return false;
        }
        c9791p.m13252K(c9791p2);
        return true;
    }

    /* renamed from: H */
    public final boolean m13255H(C9791p c9791p) {
        f25606k.lazySet(c9791p, this);
        f25605j.lazySet(c9791p, this);
        while (m13251L() == this) {
            if (C0647b.m39437a(f25605j, this, this, c9791p)) {
                c9791p.m13252K(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final Object m13251L() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC9808y)) {
                return obj;
            }
            ((AbstractC9808y) obj).mo13022c(this);
        }
    }

    /* renamed from: M */
    public final C9791p m13250M() {
        return C9790o.m13261c(m13251L());
    }

    /* renamed from: N */
    public final C9791p m13249N() {
        C9791p m13254I = m13254I(null);
        return m13254I == null ? m13253J((C9791p) this._prev) : m13254I;
    }

    /* renamed from: O */
    public final void m13248O() {
        ((C9809z) m13251L()).f25636a.m13247P();
    }

    /* renamed from: P */
    public final void m13247P() {
        C9791p c9791p = this;
        while (true) {
            Object m13251L = c9791p.m13251L();
            if (m13251L instanceof C9809z) {
                c9791p = ((C9809z) m13251L).f25636a;
            } else {
                c9791p.m13254I(null);
                return;
            }
        }
    }

    /* renamed from: Q */
    public boolean mo13246Q() {
        return m13251L() instanceof C9809z;
    }

    /* renamed from: R */
    public boolean mo2042R() {
        return m13244T() == null;
    }

    /* renamed from: S */
    public final C9791p m13245S() {
        while (true) {
            C9791p c9791p = (C9791p) m13251L();
            if (c9791p == this) {
                return null;
            }
            if (c9791p.mo2042R()) {
                return c9791p;
            }
            c9791p.m13248O();
        }
    }

    /* renamed from: T */
    public final C9791p m13244T() {
        Object m13251L;
        C9791p c9791p;
        do {
            m13251L = m13251L();
            if (m13251L instanceof C9809z) {
                return ((C9809z) m13251L).f25636a;
            }
            if (m13251L == this) {
                return (C9791p) m13251L;
            }
            c9791p = (C9791p) m13251L;
        } while (!C0647b.m39437a(f25605j, this, m13251L, c9791p.m13243U()));
        c9791p.m13254I(null);
        return null;
    }

    /* renamed from: V */
    public final int m13242V(C9791p c9791p, C9791p c9791p2, AbstractC9793b abstractC9793b) {
        f25606k.lazySet(c9791p, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25605j;
        atomicReferenceFieldUpdater.lazySet(c9791p, c9791p2);
        abstractC9793b.f25609c = c9791p2;
        if (!C0647b.m39437a(atomicReferenceFieldUpdater, this, c9791p2, abstractC9793b)) {
            return 0;
        }
        if (abstractC9793b.mo13022c(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new C9580a0(this) { // from class: kotlinx.coroutines.internal.p.e
            @Override // p140hg.InterfaceC7137g
            public Object get() {
                return C9839p0.m13120a(this.receiver);
            }
        } + '@' + C9839p0.m13119b(this);
    }
}