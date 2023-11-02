package si;

import cg.InterfaceC2533a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.internal.C9612q;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p371uf.C12967f;
import p388vf.C13277d;
import pf.C11583s;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m14357d2 = {"Lsi/h;", "T", "Lsi/i;", "", "Lkotlin/coroutines/Continuation;", "", "g", "()Ljava/lang/Object;", "", "f", "", "hasNext", "next", "value", "e", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpf/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "j", "I", "state", "k", "Ljava/lang/Object;", "nextValue", "l", "Ljava/util/Iterator;", "nextIterator", "m", "Lkotlin/coroutines/Continuation;", "getNextStep", "()Lkotlin/coroutines/Continuation;", "h", "(Lkotlin/coroutines/Continuation;)V", "nextStep", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: si.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12539h<T> extends AbstractC12540i<T> implements Iterator<T>, Continuation<Unit>, InterfaceC2533a, p164j$.util.Iterator {

    /* renamed from: j */
    private int f32585j;

    /* renamed from: k */
    private T f32586k;

    /* renamed from: l */
    private Iterator<? extends T> f32587l;

    /* renamed from: m */
    private Continuation<? super Unit> f32588m;

    /* renamed from: f */
    private final Throwable m4913f() {
        int i = this.f32585j;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f32585j);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    /* renamed from: g */
    private final T m4912g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // si.AbstractC12540i
    /* renamed from: e */
    public Object mo4910e(T t, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m2869d2;
        Object m2869d3;
        this.f32586k = t;
        this.f32585j = 3;
        this.f32588m = continuation;
        m2869d = C13277d.m2869d();
        m2869d2 = C13277d.m2869d();
        if (m2869d == m2869d2) {
            C9573g.m13976c(continuation);
        }
        m2869d3 = C13277d.m2869d();
        if (m2869d == m2869d3) {
            return m2869d;
        }
        return Unit.f25302a;
    }

    @Override // p164j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return C12967f.f33721j;
    }

    /* renamed from: h */
    public final void m4911h(Continuation<? super Unit> continuation) {
        this.f32588m = continuation;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.f32585j;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m4913f();
                }
                java.util.Iterator<? extends T> it = this.f32587l;
                C9612q.m13920e(it);
                if (it.hasNext()) {
                    this.f32585j = 2;
                    return true;
                }
                this.f32587l = null;
            }
            this.f32585j = 5;
            Continuation<? super Unit> continuation = this.f32588m;
            C9612q.m13920e(continuation);
            this.f32588m = null;
            C11583s.C11584a c11584a = C11583s.f30090k;
            continuation.resumeWith(C11583s.m7596b(Unit.f25302a));
        }
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public T next() {
        int i = this.f32585j;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f32585j = 0;
                    T t = this.f32586k;
                    this.f32586k = null;
                    return t;
                }
                throw m4913f();
            }
            this.f32585j = 1;
            java.util.Iterator<? extends T> it = this.f32587l;
            C9612q.m13920e(it);
            return it.next();
        }
        return m4912g();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        C11586t.m7586b(obj);
        this.f32585j = 4;
    }
}
