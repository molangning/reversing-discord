package kotlinx.coroutines.sync;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.coroutines.C9842q;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.InterfaceC9688d1;
import kotlinx.coroutines.internal.AbstractC9767d;
import kotlinx.coroutines.internal.AbstractC9808y;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9789n;
import kotlinx.coroutines.internal.C9791p;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00010\u0002:\u0004\n\u000b\u0005\bB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m14357d2 = {"Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/sync/b;", "", "owner", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "(Ljava/lang/Object;)Z", "a", "b", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.sync.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9886c implements InterfaceC9885b {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f25743a = AtomicReferenceFieldUpdater.newUpdater(C9886c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m14357d2 = {"Lkotlinx/coroutines/sync/c$a;", "Lkotlinx/coroutines/sync/c$b;", "Lkotlinx/coroutines/sync/c;", "", "Y", "", "W", "", "toString", "Lkotlinx/coroutines/CancellableContinuation;", "p", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C9887a extends AbstractC9889b {

        /* renamed from: p */
        private final CancellableContinuation<Unit> f25744p;

        @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke"}, m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
        /* renamed from: kotlinx.coroutines.sync.c$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C9888a extends AbstractC9614s implements Function1<Throwable, Unit> {

            /* renamed from: j */
            final /* synthetic */ C9886c f25746j;

            /* renamed from: k */
            final /* synthetic */ C9887a f25747k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9888a(C9886c c9886c, C9887a c9887a) {
                super(1);
                this.f25746j = c9886c;
                this.f25747k = c9887a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f25302a;
            }

            /* renamed from: invoke */
            public final void invoke2(Throwable th2) {
                this.f25746j.mo13007b(this.f25747k.f25749m);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9887a(Object obj, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(obj);
            C9886c.this = r1;
            this.f25744p = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.sync.C9886c.AbstractC9889b
        /* renamed from: W */
        public void mo13004W() {
            this.f25744p.mo13156B(C9842q.f25662a);
        }

        @Override // kotlinx.coroutines.sync.C9886c.AbstractC9889b
        /* renamed from: Y */
        public boolean mo13002Y() {
            if (!m13003X() || this.f25744p.mo13126u(Unit.f25302a, null, new C9888a(C9886c.this, this)) == null) {
                return false;
            }
            return true;
        }

        @Override // kotlinx.coroutines.internal.C9791p
        public String toString() {
            return "LockCont[" + this.f25749m + ", " + this.f25744p + "] for " + C9886c.this;
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m14357d2 = {"Lkotlinx/coroutines/sync/c$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/d1;", "", "X", "()Z", "", "dispose", "()V", "Y", "W", "", "m", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public abstract class AbstractC9889b extends C9791p implements InterfaceC9688d1 {

        /* renamed from: o */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f25748o = AtomicIntegerFieldUpdater.newUpdater(AbstractC9889b.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: m */
        public final Object f25749m;

        public AbstractC9889b(Object obj) {
            C9886c.this = r1;
            this.f25749m = obj;
        }

        /* renamed from: W */
        public abstract void mo13004W();

        /* renamed from: X */
        public final boolean m13003X() {
            return f25748o.compareAndSet(this, 0, 1);
        }

        /* renamed from: Y */
        public abstract boolean mo13002Y();

        @Override // kotlinx.coroutines.InterfaceC9688d1
        public final void dispose() {
            mo2042R();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m14357d2 = {"Lkotlinx/coroutines/sync/c$c;", "Lkotlinx/coroutines/internal/n;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9890c extends C9789n {
        public volatile Object owner;

        public C9890c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.C9791p
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/sync/c$d;", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/sync/c;", "affected", "", "k", "failure", "", "j", "Lkotlinx/coroutines/sync/c$c;", "b", "Lkotlinx/coroutines/sync/c$c;", "queue", "<init>", "(Lkotlinx/coroutines/sync/c$c;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9891d extends AbstractC9767d<C9886c> {

        /* renamed from: b */
        public final C9890c f25751b;

        public C9891d(C9890c c9890c) {
            this.f25751b = c9890c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: j */
        public void mo13001d(C9886c c9886c, Object obj) {
            Object obj2;
            if (obj == null) {
                obj2 = C9893d.f25759f;
            } else {
                obj2 = this.f25751b;
            }
            C0647b.m39437a(C9886c.f25743a, c9886c, this, obj2);
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: k */
        public Object mo2115i(C9886c c9886c) {
            C9768d0 c9768d0;
            if (this.f25751b.m13265W()) {
                return null;
            }
            c9768d0 = C9893d.f25755b;
            return c9768d0;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke"}, m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: kotlinx.coroutines.sync.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9892e extends AbstractC9614s implements Function1<Throwable, Unit> {

        /* renamed from: k */
        final /* synthetic */ Object f25753k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9892e(Object obj) {
            super(1);
            C9886c.this = r1;
            this.f25753k = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f25302a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            C9886c.this.mo13007b(this.f25753k);
        }
    }

    public C9886c(boolean z) {
        C9884a c9884a;
        if (z) {
            c9884a = C9893d.f25758e;
        } else {
            c9884a = C9893d.f25759f;
        }
        this._state = c9884a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x006e, code lost:
        kotlinx.coroutines.C9846r.m13104c(r0, r1);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m13006c(java.lang.Object r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            kotlin.coroutines.Continuation r0 = p388vf.C13271b.m2874c(r8)
            kotlinx.coroutines.p r0 = kotlinx.coroutines.C9846r.m13105b(r0)
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.C9884a
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.a r3 = (kotlinx.coroutines.sync.C9884a) r3
            java.lang.Object r4 = r3.f25742a
            kotlinx.coroutines.internal.d0 r5 = kotlinx.coroutines.sync.C9893d.m12993f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.C9886c.f25743a
            kotlinx.coroutines.sync.c$c r5 = new kotlinx.coroutines.sync.c$c
            java.lang.Object r3 = r3.f25742a
            r5.<init>(r3)
            androidx.concurrent.futures.C0647b.m39437a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.a r3 = kotlinx.coroutines.sync.C9893d.m12996c()
            goto L37
        L32:
            kotlinx.coroutines.sync.a r3 = new kotlinx.coroutines.sync.a
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.C9886c.f25743a
            boolean r2 = androidx.concurrent.futures.C0647b.m39437a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.Unit r1 = kotlin.Unit.f25302a
            kotlinx.coroutines.sync.c$e r2 = new kotlinx.coroutines.sync.c$e
            r2.<init>(r7)
            r0.mo13131p(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.C9886c.C9890c
            if (r3 == 0) goto La3
            r3 = r2
            kotlinx.coroutines.sync.c$c r3 = (kotlinx.coroutines.sync.C9886c.C9890c) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.m13257F(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.m13003X()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            kotlinx.coroutines.C9846r.m13104c(r0, r1)
        L71:
            java.lang.Object r7 = r0.m13122y()
            java.lang.Object r0 = p388vf.C13271b.m2873d()
            if (r7 != r0) goto L7e
            kotlin.coroutines.jvm.internal.C9573g.m13976c(r8)
        L7e:
            java.lang.Object r8 = p388vf.C13271b.m2873d()
            if (r7 != r8) goto L85
            return r7
        L85:
            kotlin.Unit r7 = kotlin.Unit.f25302a
            return r7
        L88:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La3:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.AbstractC9808y
            if (r3 == 0) goto Lae
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.AbstractC9808y) r2
            r2.mo13022c(r6)
            goto Ld
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C9886c.m13006c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.InterfaceC9885b
    /* renamed from: a */
    public Object mo13008a(Object obj, Continuation<? super Unit> continuation) {
        Object m2869d;
        if (m13005d(obj)) {
            return Unit.f25302a;
        }
        Object m13006c = m13006c(obj, continuation);
        m2869d = C13277d.m2869d();
        if (m13006c == m2869d) {
            return m13006c;
        }
        return Unit.f25302a;
    }

    @Override // kotlinx.coroutines.sync.InterfaceC9885b
    /* renamed from: b */
    public void mo13007b(Object obj) {
        C9884a c9884a;
        C9884a c9884a2;
        C9768d0 c9768d0;
        C9890c c9890c;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C9884a) {
                if (obj == null) {
                    Object obj3 = ((C9884a) obj2).f25742a;
                    c9768d0 = C9893d.f25757d;
                    if (obj3 == c9768d0) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (((C9884a) obj2).f25742a != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + c9884a.f25742a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25743a;
                c9884a2 = C9893d.f25759f;
                if (C0647b.m39437a(atomicReferenceFieldUpdater, this, obj2, c9884a2)) {
                    return;
                }
            } else if (obj2 instanceof AbstractC9808y) {
                ((AbstractC9808y) obj2).mo13022c(this);
            } else if (obj2 instanceof C9890c) {
                if (obj != null) {
                    if (((C9890c) obj2).owner != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + c9890c.owner + " but expected " + obj).toString());
                    }
                }
                C9890c c9890c2 = (C9890c) obj2;
                C9791p m13245S = c9890c2.m13245S();
                if (m13245S == null) {
                    C9891d c9891d = new C9891d(c9890c2);
                    if (C0647b.m39437a(f25743a, this, obj2, c9891d) && c9891d.mo13022c(this) == null) {
                        return;
                    }
                } else {
                    AbstractC9889b abstractC9889b = (AbstractC9889b) m13245S;
                    if (abstractC9889b.mo13002Y()) {
                        Object obj4 = abstractC9889b.f25749m;
                        if (obj4 == null) {
                            obj4 = C9893d.f25756c;
                        }
                        c9890c2.owner = obj4;
                        abstractC9889b.mo13004W();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* renamed from: d */
    public boolean m13005d(Object obj) {
        C9768d0 c9768d0;
        C9884a c9884a;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C9884a) {
                Object obj3 = ((C9884a) obj2).f25742a;
                c9768d0 = C9893d.f25757d;
                if (obj3 != c9768d0) {
                    return false;
                }
                if (obj == null) {
                    c9884a = C9893d.f25758e;
                } else {
                    c9884a = new C9884a(obj);
                }
                if (C0647b.m39437a(f25743a, this, obj2, c9884a)) {
                    return true;
                }
            } else if (obj2 instanceof C9890c) {
                if (((C9890c) obj2).owner == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof AbstractC9808y) {
                ((AbstractC9808y) obj2).mo13022c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C9884a) {
                return "Mutex[" + ((C9884a) obj).f25742a + ']';
            } else if (obj instanceof AbstractC9808y) {
                ((AbstractC9808y) obj).mo13022c(this);
            } else if (obj instanceof C9890c) {
                return "Mutex[" + ((C9890c) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}