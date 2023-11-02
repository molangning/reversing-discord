package kotlinx.coroutines;

import gg.C6759j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.time.Duration;
import p371uf.InterfaceC12963d;
import p388vf.C13272c;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0019\u0010\b\u001a\u00020\u0000*\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m14357d2 = {"", "timeMillis", "", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "duration", "b", "d", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/u0;", "c", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/u0;", "delay", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9904v0 {
    /* renamed from: a */
    public static final Object m12985a(long j, Continuation<? super Unit> continuation) {
        Continuation m2870c;
        Object m2869d;
        Object m2869d2;
        if (j <= 0) {
            return Unit.f25302a;
        }
        m2870c = C13272c.m2870c(continuation);
        C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        if (j < Long.MAX_VALUE) {
            m12983c(c9838p.getContext()).mo2761v(j, c9838p);
        }
        Object m13122y = c9838p.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        m2869d2 = C13277d.m2869d();
        if (m13122y == m2869d2) {
            return m13122y;
        }
        return Unit.f25302a;
    }

    /* renamed from: b */
    public static final Object m12984b(long j, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m12985a = m12985a(m12982d(j), continuation);
        m2869d = C13277d.m2869d();
        return m12985a == m2869d ? m12985a : Unit.f25302a;
    }

    /* renamed from: c */
    public static final InterfaceC9899u0 m12983c(CoroutineContext coroutineContext) {
        CoroutineContext.InterfaceC9564b mo1458j = coroutineContext.mo1458j(InterfaceC12963d.f33719g);
        InterfaceC9899u0 interfaceC9899u0 = mo1458j instanceof InterfaceC9899u0 ? (InterfaceC9899u0) mo1458j : null;
        return interfaceC9899u0 == null ? C9847r0.m13103a() : interfaceC9899u0;
    }

    /* renamed from: d */
    public static final long m12982d(long j) {
        long m21929d;
        if (Duration.m13641g(j, Duration.f25397k.m13624b()) > 0) {
            m21929d = C6759j.m21929d(Duration.m13633p(j), 1L);
            return m21929d;
        }
        return 0L;
    }
}
