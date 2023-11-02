package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractC9750h1;
import kotlinx.coroutines.C9674a3;
import kotlinx.coroutines.C9703f0;
import kotlinx.coroutines.C9746h0;
import kotlinx.coroutines.C9906v2;
import kotlinx.coroutines.Job;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aH\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0012\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u0012\u0004\b\u0013\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m14357d2 = {"T", "Lkotlin/coroutines/Continuation;", "Lpf/s;", "result", "Lkotlin/Function1;", "", "", "onCancellation", "b", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/g;", "", "d", "Lkotlinx/coroutines/internal/d0;", "a", "Lkotlinx/coroutines/internal/d0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9775h {

    /* renamed from: a */
    private static final C9768d0 f25582a = new C9768d0("UNDEFINED");

    /* renamed from: b */
    public static final C9768d0 f25583b = new C9768d0("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final /* synthetic */ C9768d0 m13305a() {
        return f25582a;
    }

    /* renamed from: b */
    public static final <T> void m13304b(Continuation<? super T> continuation, Object obj, Function1<? super Throwable, Unit> function1) {
        boolean z;
        C9674a3<?> c9674a3;
        if (continuation instanceof C9773g) {
            C9773g c9773g = (C9773g) continuation;
            Object m13476b = C9703f0.m13476b(obj, function1);
            if (c9773g.f25578m.mo2768D0(c9773g.getContext())) {
                c9773g.f25580o = m13476b;
                c9773g.f25774l = 1;
                c9773g.f25578m.mo2769B0(c9773g.getContext(), c9773g);
                return;
            }
            AbstractC9750h1 m12980b = C9906v2.f25766a.m12980b();
            if (m12980b.m13367M0()) {
                c9773g.f25580o = m13476b;
                c9773g.f25774l = 1;
                m12980b.m13370I0(c9773g);
                return;
            }
            m12980b.m13369K0(true);
            try {
                Job job = (Job) c9773g.getContext().mo1458j(Job.f25404c);
                if (job != null && !job.mo2067a()) {
                    CancellationException mo13542D = job.mo13542D();
                    c9773g.mo12964b(m13476b, mo13542D);
                    C11583s.C11584a c11584a = C11583s.f30090k;
                    c9773g.resumeWith(C11583s.m7596b(C11586t.m7587a(mo13542D)));
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Continuation<T> continuation2 = c9773g.f25579n;
                    Object obj2 = c9773g.f25581p;
                    CoroutineContext context = continuation2.getContext();
                    Object m13299c = C9776h0.m13299c(context, obj2);
                    if (m13299c != C9776h0.f25584a) {
                        c9674a3 = C9746h0.m13377g(continuation2, context, m13299c);
                    } else {
                        c9674a3 = null;
                    }
                    c9773g.f25579n.resumeWith(obj);
                    Unit unit = Unit.f25302a;
                    if (c9674a3 == null || c9674a3.m13574a1()) {
                        C9776h0.m13301a(context, m13299c);
                    }
                }
                do {
                } while (m12980b.m13365P0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.resumeWith(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m13303c(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        m13304b(continuation, obj, function1);
    }

    /* renamed from: d */
    public static final boolean m13302d(C9773g<? super Unit> c9773g) {
        Unit unit = Unit.f25302a;
        AbstractC9750h1 m12980b = C9906v2.f25766a.m12980b();
        if (m12980b.m13366N0()) {
            return false;
        }
        if (m12980b.m13367M0()) {
            c9773g.f25580o = unit;
            c9773g.f25774l = 1;
            m12980b.m13370I0(c9773g);
            return true;
        }
        m12980b.m13369K0(true);
        try {
            c9773g.run();
            do {
            } while (m12980b.m13365P0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
