package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.internal.C9612q;
import p388vf.C13272c;
import p388vf.C13277d;
import pf.C11583s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m14357d2 = {"Lkotlinx/coroutines/e;", "T", "", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/s0;", "a", "[Lkotlinx/coroutines/s0;", "deferreds", "<init>", "([Lkotlinx/coroutines/s0;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9691e<T> {

    /* renamed from: b */
    static final /* synthetic */ AtomicIntegerFieldUpdater f25428b = AtomicIntegerFieldUpdater.newUpdater(C9691e.class, "notCompletedCount");

    /* renamed from: a */
    private final InterfaceC9851s0<T>[] f25429a;
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/d2;", "", "cause", "", "W", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CancellableContinuation;", "", "n", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "Lkotlinx/coroutines/d1;", "o", "Lkotlinx/coroutines/d1;", "a0", "()Lkotlinx/coroutines/d1;", "c0", "(Lkotlinx/coroutines/d1;)V", "handle", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", "value", "Z", "()Lkotlinx/coroutines/e$b;", "b0", "(Lkotlinx/coroutines/e$b;)V", "disposer", "<init>", "(Lkotlinx/coroutines/e;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C9692a extends AbstractC9689d2 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: n */
        private final CancellableContinuation<List<? extends T>> f25430n;

        /* renamed from: o */
        public InterfaceC9688d1 f25431o;

        /* JADX WARN: Multi-variable type inference failed */
        public C9692a(CancellableContinuation<? super List<? extends T>> cancellableContinuation) {
            this.f25430n = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.AbstractC9687d0
        /* renamed from: W */
        public void mo12976W(Throwable th2) {
            if (th2 != null) {
                Object mo13133n = this.f25430n.mo13133n(th2);
                if (mo13133n != null) {
                    this.f25430n.mo13156B(mo13133n);
                    C9691e<T>.C9693b m13552Z = m13552Z();
                    if (m13552Z != null) {
                        m13552Z.m13548b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C9691e.f25428b.decrementAndGet(C9691e.this) == 0) {
                CancellableContinuation<List<? extends T>> cancellableContinuation = this.f25430n;
                InterfaceC9851s0[] interfaceC9851s0Arr = ((C9691e) C9691e.this).f25429a;
                ArrayList arrayList = new ArrayList(interfaceC9851s0Arr.length);
                for (InterfaceC9851s0 interfaceC9851s0 : interfaceC9851s0Arr) {
                    arrayList.add(interfaceC9851s0.mo12973o());
                }
                cancellableContinuation.resumeWith(C11583s.m7596b(arrayList));
            }
        }

        /* renamed from: Z */
        public final C9691e<T>.C9693b m13552Z() {
            return (C9693b) this._disposer;
        }

        /* renamed from: a0 */
        public final InterfaceC9688d1 m13551a0() {
            InterfaceC9688d1 interfaceC9688d1 = this.f25431o;
            if (interfaceC9688d1 != null) {
                return interfaceC9688d1;
            }
            C9612q.m13900y("handle");
            return null;
        }

        /* renamed from: b0 */
        public final void m13550b0(C9691e<T>.C9693b c9693b) {
            this._disposer = c9693b;
        }

        /* renamed from: c0 */
        public final void m13549c0(InterfaceC9688d1 interfaceC9688d1) {
            this.f25431o = interfaceC9688d1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo12976W(th2);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m14357d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/n;", "", "b", "", "cause", "a", "", "toString", "", "Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/e;", "j", "[Lkotlinx/coroutines/e$a;", "nodes", "<init>", "(Lkotlinx/coroutines/e;[Lkotlinx/coroutines/e$a;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C9693b extends AbstractC9827n {

        /* renamed from: j */
        private final C9691e<T>.C9692a[] f25433j;

        public C9693b(C9691e<T>.C9692a[] c9692aArr) {
            this.f25433j = c9692aArr;
        }

        @Override // kotlinx.coroutines.AbstractC9834o
        /* renamed from: a */
        public void mo2138a(Throwable th2) {
            m13548b();
        }

        /* renamed from: b */
        public final void m13548b() {
            for (C9691e<T>.C9692a c9692a : this.f25433j) {
                c9692a.m13551a0().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo2138a(th2);
            return Unit.f25302a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f25433j + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9691e(InterfaceC9851s0<? extends T>[] interfaceC9851s0Arr) {
        this.f25429a = interfaceC9851s0Arr;
        this.notCompletedCount = interfaceC9851s0Arr.length;
    }

    /* renamed from: b */
    public final Object m13553b(Continuation<? super List<? extends T>> continuation) {
        Continuation m2870c;
        Object m2869d;
        m2870c = C13272c.m2870c(continuation);
        C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        int length = this.f25429a.length;
        C9692a[] c9692aArr = new C9692a[length];
        for (int i = 0; i < length; i++) {
            InterfaceC9851s0 interfaceC9851s0 = this.f25429a[i];
            interfaceC9851s0.start();
            C9692a c9692a = new C9692a(c9838p);
            c9692a.m13549c0(interfaceC9851s0.mo13521Q(c9692a));
            Unit unit = Unit.f25302a;
            c9692aArr[i] = c9692a;
        }
        C9691e<T>.C9693b c9693b = new C9693b(c9692aArr);
        for (int i2 = 0; i2 < length; i2++) {
            c9692aArr[i2].m13550b0(c9693b);
        }
        if (c9838p.mo13138i()) {
            c9693b.m13548b();
        } else {
            c9838p.mo13135l(c9693b);
        }
        Object m13122y = c9838p.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m13122y;
    }
}
