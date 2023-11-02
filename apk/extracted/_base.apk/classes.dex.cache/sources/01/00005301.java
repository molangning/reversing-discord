package p450yi;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9604l0;
import kotlinx.coroutines.C9676b0;
import kotlinx.coroutines.C9705f2;
import kotlinx.coroutines.C9910w2;
import kotlinx.coroutines.internal.C9764b0;
import kotlinx.coroutines.internal.C9776h0;
import p388vf.C13277d;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aT\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001aV\u0010\u0010\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\n\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aV\u0010\u0012\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\n\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m14357d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "a", "Lkotlinx/coroutines/internal/b0;", "block", "d", "(Lkotlinx/coroutines/internal/b0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "e", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: yi.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14032b {
    /* renamed from: a */
    public static final <R, T> void m860a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Object m2869d;
        Continuation m13978a = C9573g.m13978a(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object m13299c = C9776h0.m13299c(context, null);
            Object invoke = ((Function2) C9604l0.m13938d(function2, 2)).invoke(r, m13978a);
            C9776h0.m13301a(context, m13299c);
            m2869d = C13277d.m2869d();
            if (invoke != m2869d) {
                m13978a.resumeWith(C11583s.m7596b(invoke));
            }
        } catch (Throwable th2) {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m13978a.resumeWith(C11583s.m7596b(C11586t.m7587a(th2)));
        }
    }

    /* renamed from: b */
    public static final <T> void m859b(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        Object m2869d;
        Continuation m13978a = C9573g.m13978a(continuation);
        try {
            Object invoke = ((Function1) C9604l0.m13938d(function1, 1)).invoke(m13978a);
            m2869d = C13277d.m2869d();
            if (invoke != m2869d) {
                m13978a.resumeWith(C11583s.m7596b(invoke));
            }
        } catch (Throwable th2) {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m13978a.resumeWith(C11583s.m7596b(C11586t.m7587a(th2)));
        }
    }

    /* renamed from: c */
    public static final <R, T> void m858c(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Object m2869d;
        Continuation m13978a = C9573g.m13978a(continuation);
        try {
            Object invoke = ((Function2) C9604l0.m13938d(function2, 2)).invoke(r, m13978a);
            m2869d = C13277d.m2869d();
            if (invoke != m2869d) {
                m13978a.resumeWith(C11583s.m7596b(invoke));
            }
        } catch (Throwable th2) {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m13978a.resumeWith(C11583s.m7596b(C11586t.m7587a(th2)));
        }
    }

    /* renamed from: d */
    public static final <T, R> Object m857d(C9764b0<? super T> c9764b0, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object c9676b0;
        Object m2869d;
        Object m2869d2;
        Object m2869d3;
        try {
            c9676b0 = ((Function2) C9604l0.m13938d(function2, 2)).invoke(r, c9764b0);
        } catch (Throwable th2) {
            c9676b0 = new C9676b0(th2, false, 2, null);
        }
        m2869d = C13277d.m2869d();
        if (c9676b0 == m2869d) {
            m2869d3 = C13277d.m2869d();
            return m2869d3;
        }
        Object m13497u0 = c9764b0.m13497u0(c9676b0);
        if (m13497u0 == C9705f2.f25452b) {
            m2869d2 = C13277d.m2869d();
            return m2869d2;
        } else if (!(m13497u0 instanceof C9676b0)) {
            return C9705f2.m13466h(m13497u0);
        } else {
            throw ((C9676b0) m13497u0).f25415a;
        }
    }

    /* renamed from: e */
    public static final <T, R> Object m856e(C9764b0<? super T> c9764b0, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object c9676b0;
        Object m2869d;
        Object m2869d2;
        Object m2869d3;
        boolean z = false;
        try {
            c9676b0 = ((Function2) C9604l0.m13938d(function2, 2)).invoke(r, c9764b0);
        } catch (Throwable th2) {
            c9676b0 = new C9676b0(th2, false, 2, null);
        }
        m2869d = C13277d.m2869d();
        if (c9676b0 == m2869d) {
            m2869d3 = C13277d.m2869d();
            return m2869d3;
        }
        Object m13497u0 = c9764b0.m13497u0(c9676b0);
        if (m13497u0 == C9705f2.f25452b) {
            m2869d2 = C13277d.m2869d();
            return m2869d2;
        }
        if (m13497u0 instanceof C9676b0) {
            Throwable th3 = ((C9676b0) m13497u0).f25415a;
            if (!(((th3 instanceof C9910w2) && ((C9910w2) th3).f25770j == c9764b0) ? true : true)) {
                if (c9676b0 instanceof C9676b0) {
                    throw ((C9676b0) c9676b0).f25415a;
                }
            } else {
                throw th3;
            }
        } else {
            c9676b0 = C9705f2.m13466h(m13497u0);
        }
        return c9676b0;
    }
}