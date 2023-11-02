package pf;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9612q;
import p371uf.C12967f;
import p388vf.C13277d;
import pf.C11583s;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004BH\u00124\u0010\u001e\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0006\u0010\n\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eRG\u0010\u0013\u001a0\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00058\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006!"}, m14357d2 = {"Lpf/d;", "T", "R", "Lpf/c;", "Lkotlin/coroutines/Continuation;", "Lpf/s;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "value", "b", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Lkotlin/Function3;", "", "j", "Lkotlin/jvm/functions/Function3;", "function", "k", "Ljava/lang/Object;", "l", "Lkotlin/coroutines/Continuation;", "cont", "m", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "block", "<init>", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11554d<T, R> extends AbstractC11551c<T, R> implements Continuation<R> {

    /* renamed from: j */
    private Function3<? super AbstractC11551c<?, ?>, Object, ? super Continuation<Object>, ? extends Object> f30060j;

    /* renamed from: k */
    private Object f30061k;

    /* renamed from: l */
    private Continuation<Object> f30062l;

    /* renamed from: m */
    private Object f30063m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11554d(Function3<? super AbstractC11551c<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T t) {
        super(null);
        Object obj;
        C9612q.m13917h(block, "block");
        this.f30060j = block;
        this.f30061k = t;
        C9612q.m13919f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f30062l = this;
        obj = C11548b.f30054a;
        this.f30063m = obj;
    }

    @Override // pf.AbstractC11551c
    /* renamed from: b */
    public Object mo7664b(T t, Continuation<? super R> continuation) {
        Object m2869d;
        Object m2869d2;
        C9612q.m13919f(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f30062l = continuation;
        this.f30061k = t;
        m2869d = C13277d.m2869d();
        m2869d2 = C13277d.m2869d();
        if (m2869d == m2869d2) {
            C9573g.m13976c(continuation);
        }
        return m2869d;
    }

    /* renamed from: c */
    public final R m7663c() {
        Object obj;
        Object obj2;
        Object m2869d;
        while (true) {
            R r = (R) this.f30063m;
            Continuation<Object> continuation = this.f30062l;
            if (continuation == null) {
                C11586t.m7586b(r);
                return r;
            }
            obj = C11548b.f30054a;
            if (C11583s.m7594d(obj, r)) {
                try {
                    Function3<? super AbstractC11551c<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3 = this.f30060j;
                    Object obj3 = this.f30061k;
                    C9612q.m13919f(function3, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                    Object invoke = ((Function3) C9604l0.m13938d(function3, 3)).invoke(this, obj3, continuation);
                    m2869d = C13277d.m2869d();
                    if (invoke != m2869d) {
                        continuation.resumeWith(C11583s.m7596b(invoke));
                    }
                } catch (Throwable th2) {
                    C11583s.C11584a c11584a = C11583s.f30090k;
                    continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(th2)));
                }
            } else {
                obj2 = C11548b.f30054a;
                this.f30063m = obj2;
                continuation.resumeWith(r);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return C12967f.f33721j;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f30062l = null;
        this.f30063m = obj;
    }
}