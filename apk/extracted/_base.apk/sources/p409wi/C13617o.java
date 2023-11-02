package p409wi;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9787l0;
import kotlinx.coroutines.internal.C9806x;
import kotlinx.coroutines.selects.C9882e;
import kotlinx.coroutines.selects.InterfaceC9881d;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010+\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`*¢\u0006\u0004\b,\u0010-J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0014\u0010(\u001a\u00020%8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006."}, m14357d2 = {"Lwi/o;", "E", "Lwi/a;", "", "element", "Lkotlinx/coroutines/internal/l0;", "a0", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "U", "Lkotlinx/coroutines/selects/d;", "select", "V", "", "wasClosed", "", "Q", "Lwi/s;", "receive", "K", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "m", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "n", "Ljava/lang/Object;", "value", "M", "()Z", "isBufferAlwaysEmpty", "N", "isBufferEmpty", "t", "isBufferAlwaysFull", "u", "isBufferFull", "", "k", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C13617o<E> extends AbstractC13588a<E> {

    /* renamed from: m */
    private final ReentrantLock f35016m;

    /* renamed from: n */
    private Object f35017n;

    public C13617o(Function1<? super E, Unit> function1) {
        super(function1);
        this.f35016m = new ReentrantLock();
        this.f35017n = C13597b.f34986a;
    }

    /* renamed from: a0 */
    private final C9787l0 m2078a0(Object obj) {
        Function1<E, Unit> function1;
        Object obj2 = this.f35017n;
        C9787l0 c9787l0 = null;
        if (obj2 != C13597b.f34986a && (function1 = this.f34993j) != null) {
            c9787l0 = C9806x.m13198d(function1, obj2, null, 2, null);
        }
        this.f35017n = obj;
        return c9787l0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13588a
    /* renamed from: K */
    public boolean mo2082K(AbstractC13623s<? super E> abstractC13623s) {
        ReentrantLock reentrantLock = this.f35016m;
        reentrantLock.lock();
        try {
            return super.mo2082K(abstractC13623s);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: M */
    protected final boolean mo2056M() {
        return false;
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: N */
    protected final boolean mo2055N() {
        boolean z;
        ReentrantLock reentrantLock = this.f35016m;
        reentrantLock.lock();
        try {
            if (this.f35017n == C13597b.f34986a) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13588a
    /* renamed from: Q */
    public void mo2081Q(boolean z) {
        ReentrantLock reentrantLock = this.f35016m;
        reentrantLock.lock();
        try {
            C9787l0 m2078a0 = m2078a0(C13597b.f34986a);
            Unit unit = Unit.f25302a;
            reentrantLock.unlock();
            super.mo2081Q(z);
            if (m2078a0 == null) {
                return;
            }
            throw m2078a0;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: U */
    protected Object mo2080U() {
        ReentrantLock reentrantLock = this.f35016m;
        reentrantLock.lock();
        try {
            Object obj = this.f35017n;
            C9768d0 c9768d0 = C13597b.f34986a;
            if (obj == c9768d0) {
                Object m2124m = m2124m();
                if (m2124m == null) {
                    m2124m = C13597b.f34989d;
                }
                return m2124m;
            }
            this.f35017n = c9768d0;
            Unit unit = Unit.f25302a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: V */
    protected Object mo2079V(InterfaceC9881d<?> interfaceC9881d) {
        ReentrantLock reentrantLock = this.f35016m;
        reentrantLock.lock();
        try {
            Object obj = this.f35017n;
            C9768d0 c9768d0 = C13597b.f34986a;
            if (obj == c9768d0) {
                Object m2124m = m2124m();
                if (m2124m == null) {
                    m2124m = C13597b.f34989d;
                }
                return m2124m;
            } else if (!interfaceC9881d.mo13018s()) {
                return C9882e.m13011d();
            } else {
                Object obj2 = this.f35017n;
                this.f35017n = c9768d0;
                Unit unit = Unit.f25302a;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p409wi.AbstractC13598c
    /* renamed from: k */
    protected String mo2077k() {
        ReentrantLock reentrantLock = this.f35016m;
        reentrantLock.lock();
        try {
            return "(value=" + this.f35017n + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p409wi.AbstractC13598c
    /* renamed from: t */
    protected final boolean mo2054t() {
        return false;
    }

    @Override // p409wi.AbstractC13598c
    /* renamed from: u */
    protected final boolean mo2053u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13598c
    /* renamed from: y */
    public Object mo2075y(E e) {
        InterfaceC13625u<E> mo2130C;
        ReentrantLock reentrantLock = this.f35016m;
        reentrantLock.lock();
        try {
            C13614l<?> m2124m = m2124m();
            if (m2124m != null) {
                return m2124m;
            }
            if (this.f35017n == C13597b.f34986a) {
                do {
                    mo2130C = mo2130C();
                    if (mo2130C != null) {
                        if (mo2130C instanceof C13614l) {
                            return mo2130C;
                        }
                        C9612q.m13920e(mo2130C);
                    }
                } while (mo2130C.mo2057z(e, null) == null);
                Unit unit = Unit.f25302a;
                reentrantLock.unlock();
                mo2130C.mo2058j(e);
                return mo2130C.mo2059b();
            }
            C9787l0 m2078a0 = m2078a0(e);
            if (m2078a0 == null) {
                return C13597b.f34987b;
            }
            throw m2078a0;
        } finally {
            reentrantLock.unlock();
        }
    }
}
