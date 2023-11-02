package p450yi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.C9775h;
import p388vf.C13272c;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001al\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0010\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m14357d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "c", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "", "onCancellation", "d", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V", "fatalCompletion", "b", "e", "a", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: yi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14031a {
    /* renamed from: a */
    private static final void m865a(Continuation<?> continuation, Throwable th2) {
        C11583s.C11584a c11584a = C11583s.f30090k;
        continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(th2)));
        throw th2;
    }

    /* renamed from: b */
    public static final void m864b(Continuation<? super Unit> continuation, Continuation<?> continuation2) {
        Continuation m2870c;
        try {
            m2870c = C13272c.m2870c(continuation);
            C11583s.C11584a c11584a = C11583s.f30090k;
            C9775h.m13303c(m2870c, C11583s.m7596b(Unit.f25302a), null, 2, null);
        } catch (Throwable th2) {
            m865a(continuation2, th2);
        }
    }

    /* renamed from: c */
    public static final <T> void m863c(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        Continuation m2872a;
        Continuation m2870c;
        try {
            m2872a = C13272c.m2872a(function1, continuation);
            m2870c = C13272c.m2870c(m2872a);
            C11583s.C11584a c11584a = C11583s.f30090k;
            C9775h.m13303c(m2870c, C11583s.m7596b(Unit.f25302a), null, 2, null);
        } catch (Throwable th2) {
            m865a(continuation, th2);
        }
    }

    /* renamed from: d */
    public static final <R, T> void m862d(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation, Function1<? super Throwable, Unit> function1) {
        Continuation m2871b;
        Continuation m2870c;
        try {
            m2871b = C13272c.m2871b(function2, r, continuation);
            m2870c = C13272c.m2870c(m2871b);
            C11583s.C11584a c11584a = C11583s.f30090k;
            C9775h.m13304b(m2870c, C11583s.m7596b(Unit.f25302a), function1);
        } catch (Throwable th2) {
            m865a(continuation, th2);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m861e(Function2 function2, Object obj, Continuation continuation, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        m862d(function2, obj, continuation, function1);
    }
}