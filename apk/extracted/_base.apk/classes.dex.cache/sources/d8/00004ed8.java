package p371uf;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388vf.C13277d;
import p388vf.EnumC13270a;
import pf.C11583s;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u001dB!\b\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aB\u0017\b\u0011\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ \u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m14357d2 = {"Luf/g;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lpf/s;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "b", "", "toString", "j", "Lkotlin/coroutines/Continuation;", "delegate", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "initialResult", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "(Lkotlin/coroutines/Continuation;)V", "k", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: uf.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12968g<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: k */
    private static final C12969a f33722k = new C12969a(null);
    @Deprecated

    /* renamed from: l */
    private static final AtomicReferenceFieldUpdater<C12968g<?>, Object> f33723l = AtomicReferenceFieldUpdater.newUpdater(C12968g.class, Object.class, "result");

    /* renamed from: j */
    private final Continuation<T> f33724j;
    private volatile Object result;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bRj\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, m14357d2 = {"Luf/g$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Luf/g;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "()V", "<init>", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: uf.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C12969a {
        private C12969a() {
        }

        public /* synthetic */ C12969a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12968g(Continuation<? super T> delegate, Object obj) {
        C9612q.m13917h(delegate, "delegate");
        this.f33724j = delegate;
        this.result = obj;
    }

    /* renamed from: b */
    public final Object m3570b() {
        Object m2869d;
        Object m2869d2;
        Object m2869d3;
        Object obj = this.result;
        EnumC13270a enumC13270a = EnumC13270a.UNDECIDED;
        if (obj == enumC13270a) {
            AtomicReferenceFieldUpdater<C12968g<?>, Object> atomicReferenceFieldUpdater = f33723l;
            m2869d2 = C13277d.m2869d();
            if (C0647b.m39437a(atomicReferenceFieldUpdater, this, enumC13270a, m2869d2)) {
                m2869d3 = C13277d.m2869d();
                return m2869d3;
            }
            obj = this.result;
        }
        if (obj == EnumC13270a.RESUMED) {
            m2869d = C13277d.m2869d();
            return m2869d;
        } else if (!(obj instanceof C11583s.C11585b)) {
            return obj;
        } else {
            throw ((C11583s.C11585b) obj).f30092j;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f33724j;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f33724j.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object m2869d;
        Object m2869d2;
        while (true) {
            Object obj2 = this.result;
            EnumC13270a enumC13270a = EnumC13270a.UNDECIDED;
            if (obj2 == enumC13270a) {
                if (C0647b.m39437a(f33723l, this, enumC13270a, obj)) {
                    return;
                }
            } else {
                m2869d = C13277d.m2869d();
                if (obj2 == m2869d) {
                    AtomicReferenceFieldUpdater<C12968g<?>, Object> atomicReferenceFieldUpdater = f33723l;
                    m2869d2 = C13277d.m2869d();
                    if (C0647b.m39437a(atomicReferenceFieldUpdater, this, m2869d2, EnumC13270a.RESUMED)) {
                        this.f33724j.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f33724j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12968g(Continuation<? super T> delegate) {
        this(delegate, EnumC13270a.UNDECIDED);
        C9612q.m13917h(delegate, "delegate");
    }
}