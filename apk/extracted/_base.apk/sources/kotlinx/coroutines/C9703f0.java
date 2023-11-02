package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m14357d2 = {"T", "Lpf/s;", "Lkotlin/Function1;", "", "", "onCancellation", "", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "caller", "c", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/Continuation;", "uCont", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9703f0 {
    /* renamed from: a */
    public static final <T> Object m13477a(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof C9676b0) {
            C11583s.C11584a c11584a = C11583s.f30090k;
            return C11583s.m7596b(C11586t.m7587a(((C9676b0) obj).f25415a));
        }
        return C11583s.m7596b(obj);
    }

    /* renamed from: b */
    public static final <T> Object m13476b(Object obj, Function1<? super Throwable, Unit> function1) {
        Throwable m7593e = C11583s.m7593e(obj);
        if (m7593e == null) {
            if (function1 != null) {
                return new C9681c0(obj, function1);
            }
            return obj;
        }
        return new C9676b0(m7593e, false, 2, null);
    }

    /* renamed from: c */
    public static final <T> Object m13475c(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable m7593e = C11583s.m7593e(obj);
        if (m7593e != null) {
            return new C9676b0(m7593e, false, 2, null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m13474d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return m13476b(obj, function1);
    }
}
